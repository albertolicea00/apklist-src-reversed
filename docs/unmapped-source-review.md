# Unlinked main-package source review

Target: `cu.uci.android.apklis-v202609030.apk`, SHA-256
`4d23c1a911ed4a9b53762ab44fe8f6371a58a32072c055c26444b9de25ace305`.

## Purpose and limits

This ledger tracks Java source files in the main application package (`cu.uci.android.apklis`) that lack exact clean-source links in `app/src/main/java/`. The ledger is an audit queue, not a decompilation-success metric. JADX decompilation success and source-to-clean class identity links are separate measures, and a link does not prove behavioral equivalence.

Classification categories:
- `application behavior`: UI, routing, catalog API, download/installer management, authentication, persistence, or security logic.
- `application support`: shared helpers, base classes, adapters, or internal utilities supporting app behavior.
- `generated`: resource/build output, synthetic bridges, binding code, or compiler-generated machinery (`BuildConfig`, `R`, R8 synthetic classes).
- `third-party/library`: vendored or dependency implementation rather than Apklis-specific behavior.

## Current status

Pending initial decompilation (`make decompile`). Populate package-by-package review tables after generating the baseline inventory with `make inventory`.
