#!/usr/bin/env python3
"""Synchronize the README progress bar with TODO checkboxes and mapping stats.

Overall progress averages TODO task completion and main-package exact source
links from scripts/mapping-stats.sh. This is not verified code coverage or a
working-app percentage. Use --check in checks.
"""

import argparse
import re
import subprocess
from pathlib import Path

MARKER = "<!-- do not delete this progress-bar-->"


def parse_mapping_stats(root: Path) -> dict[str, int]:
    result = subprocess.run(
        ["bash", str(root / "scripts" / "mapping-stats.sh")],
        cwd=root,
        capture_output=True,
        text=True,
        check=True,
    )
    stats = {}
    for line in result.stdout.splitlines():
        match = re.match(r"^\s*([a-z_]+):\s*(\d+)\s*$", line)
        if match:
            stats[match.group(1)] = int(match.group(2))
    required = ("source_files", "clean_files", "single_candidate", "unlinked", "mapping_issues")
    missing = [key for key in required if key not in stats]
    if missing:
        raise ValueError(f"mapping-stats.sh output missing keys: {', '.join(missing)}")
    return stats


def update(readme: str, todo: str, stats: dict[str, int]) -> str:
    tasks = re.findall(r"^- \[([ xX])\] ", todo, re.MULTILINE)
    if not tasks:
        raise ValueError("TODO.md has no task checkboxes")
    completed = sum(value.lower() == "x" for value in tasks)
    todo_pct = completed * 100 // len(tasks)

    source_files = stats["source_files"]
    single_candidate = stats["single_candidate"]
    source_pct = single_candidate * 100 // source_files if source_files > 0 else 0

    overall_pct = (todo_pct + source_pct) // 2
    blocks = overall_pct * 50 // 100
    bar = "█" * blocks + "░" * (50 - blocks)

    replacement = (
        '<!-- 50 blocks; each full block = 2% (average of TODO tasks and source reconstruction) --> '
        + MARKER
        + "\n"
        f'<span style="white-space: nowrap;"><code>[{bar}] {overall_pct}%</code></span>\n\n'
        f'**Task-list progress: {completed}/{len(tasks)} completed ({todo_pct}%); '
        f'{len(tasks) - completed} pending. '
        f'Source reconstruction: {single_candidate}/{source_files} exact source links ({source_pct}%).** '
        'Tasks have equal weight; overall bar averages task-list progress and exact main-package source links. '
        'This is not verified code coverage or a working-app percentage. '
        'Run `make progress` or `make inventory` to refresh it from [TODO.md](TODO.md) and `scripts/mapping-stats.sh`.'
    )
    pattern = (
        r"<!--[^\n]*" + re.escape(MARKER) + r"\n<span[^\n]*</span>"
        r"(?:\n\n\*\*Task-list progress:[^\n]*)?"
    )
    result, count = re.subn(pattern, lambda _: replacement, readme)
    if count != 1:
        raise ValueError("Expected exactly one README progress bar marker")
    return result


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--root", type=Path, default=Path(__file__).resolve().parents[1])
    parser.add_argument("--check", action="store_true", help="Fail if README progress is stale")
    args = parser.parse_args()
    path = args.root / "README.md"
    previous = path.read_text()
    stats = parse_mapping_stats(args.root)
    current = update(previous, (args.root / "TODO.md").read_text(), stats)
    if args.check:
        if previous != current:
            parser.exit(1, "README progress is stale; run make progress\n")
        print("README progress matches TODO.md and mapping-stats.sh")
    else:
        if previous != current:
            path.write_text(current)
        print(re.search(r"\*\*Task-list progress:.*?\*\*", current)[0].strip("*"))


if __name__ == "__main__":
    main()
