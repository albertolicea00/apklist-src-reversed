# Changelog

## 2026-11-14 — cu.uci.android.apklis-v202609030.apk — SHA-256: `4d23c1a911ed4a9b53762ab44fe8f6371a58a32072c055c26444b9de25ace305`

- Initialized the Apklis (`cu.uci.android.apklis`) reverse-engineering repository structure (`app/assets/`, `app/res/`, `app/src/main/java/`, `src/`, `smali/`, `mappings/evidence/`, `scripts/tests/`, `docs/`, `.workspace/bin/`, `.workspace/archives/`) mirroring `transfermovil-src-reversed` prior to decompilation.
- Verified target APK metadata (`cu.uci.android.apklis` v`2.0.1`, code `202609030`, Min SDK `23`, Target SDK `36`, Compile SDK `36`) and documented extraction in `docs/target-metadata.md`.
- Added `Makefile` and 7 analysis toolchain scripts (`verify-apk.sh`, `decompile.sh`, `search-strings.sh`, `mapping-stats.sh`, `reconstruction-inventory.py`, `update-progress.py`, `compile-reconstruction.py`).
- Created full 13-document template set in `docs/` (`target-metadata.md`, `versioning.md`, `architecture.md`, `installer.md`, `payments.md`, `networking.md`, `security.md`, `storage.md`, `domain-model.md`, `reconstruction-inventory.md`, `unmapped-source-review.md`, `java-compilation.md`, `runtime-validation.md`).
- Updated `README.md`, `AGENTS.md`, and `TODO.md` with documentation links and reference links (`apklis.cu`, `Apklis` on EcuRed).
