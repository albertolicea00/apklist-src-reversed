# Changelog

## 2026-11-15 — cu.uci.android.apklis-v202609030.apk — SHA-256: `4d23c1a911ed4a9b53762ab44fe8f6371a58a32072c055c26444b9de25ace305`

- Ran `make compile-audit` against `android-37.0/android.jar` and `.workspace/tools/target-bytecode.jar` (`javac 17.0.15`) on 24 clean sources + generated `R.java`, observing 48 parse errors in 3 files (`ApkDownloadService.java`, `PaymentProvider.java`, `AppDetailActivity.java`) from JADX `??` unknown-type placeholders, and recorded exact findings in `docs/java-compilation.md`.
- Copied JADX `defpackage` collaborator sources (`src/defpackage/{j42,rt3,uo1,wh}.java`) and reconstructed their 4 clean Java classes under `app/src/main/java/cu/uci/android/apklis/data/` (`AccountManagerHelper`, `UserPreferences`, `LicenseResponse`, `ApklisApiService`).
- Updated `mappings/classes.json` status for `defpackage.{j42,rt3,uo1,wh}` to `reconstructed`, resolving all 8 `mapping_issues` (`mapping_issues: 0`).
- Verified the 2 unlinked files in `src/` (`R.java` and `MainActivity$setupAdapters$expandGridLM$1$1.java`, no `BuildConfig.java`) in `docs/unmapped-source-review.md`.
- Regenerated `README.md` progress via `make inventory && make progress` (`source_files: 26`, `clean_files: 24`, `single_candidate: 24`, `unlinked: 2`, `mapping_issues: 0`; Task-list progress 91%, Source reconstruction 92%).

## 2026-11-14 — cu.uci.android.apklis-v202609030.apk — SHA-256: `4d23c1a911ed4a9b53762ab44fe8f6371a58a32072c055c26444b9de25ace305`

- Initialized the Apklis (`cu.uci.android.apklis`) reverse-engineering repository structure (`app/assets/`, `app/res/`, `app/src/main/java/`, `src/`, `smali/`, `mappings/evidence/`, `scripts/tests/`, `docs/`, `.workspace/bin/`, `.workspace/archives/`) mirroring `transfermovil-src-reversed` prior to decompilation.
- Verified target APK metadata (`cu.uci.android.apklis` v`2.0.1`, code `202609030`, Min SDK `23`, Target SDK `36`, Compile SDK `36`) and documented extraction in `docs/target-metadata.md`.
- Added `Makefile` and 7 analysis toolchain scripts (`verify-apk.sh`, `decompile.sh`, `search-strings.sh`, `mapping-stats.sh`, `reconstruction-inventory.py`, `update-progress.py`, `compile-reconstruction.py`).
- Created full 13-document template set in `docs/` (`target-metadata.md`, `versioning.md`, `architecture.md`, `installer.md`, `payments.md`, `networking.md`, `security.md`, `storage.md`, `domain-model.md`, `reconstruction-inventory.md`, `unmapped-source-review.md`, `java-compilation.md`, `runtime-validation.md`).
- Updated `README.md`, `AGENTS.md`, and `TODO.md` with documentation links and reference links (`apklis.cu`, `Apklis` on EcuRed).
- Added a `Related Repositories` cross-reference table in `README.md` linking all six Cuban Android reverse-engineering repositories.
- Decompiled `cu.uci.android.apklis-v202609030.apk` with JADX 1.5.6 and Apktool 3.0.3 (`src/`, `app/AndroidManifest.xml`, `app/res/`, `app/assets/PublicSuffixDatabase.list`) and archived local `smali/` to `.workspace/archives/smali-2.0.1.202609030.zip` (SHA-256: `a9867f53fb6c74c420f5ef2f3458f385d32d9b11865d93aa29e440697472033e`).
- Reconstructed all 20 top-level entrypoint classes under `app/src/main/java/cu/uci/android/apklis/` and mapped them alongside key R8-repackaged `defpackage` collaborators (`wh`, `j42`, `rt3`, `uo1`) in `mappings/classes.json`.
- Completed static analysis across `docs/architecture.md`, `docs/installer.md`, `docs/payments.md`, `docs/networking.md`, `docs/security.md`, `docs/storage.md`, `docs/domain-model.md`, `docs/unmapped-source-review.md`, `docs/java-compilation.md`, `docs/runtime-validation.md`, and `docs/versioning.md`.
- Tagged baseline release `2.0.1.202609030-v1.0`.
- Updated `scripts/update-progress.py` to combine `TODO.md` task completion (31/34, 91%) with `scripts/mapping-stats.sh` main-package exact source links (20/22, 90%) into the `README.md` overall progress bar (90%), and updated `README.md` with observed `make stats` counts (`source_files: 22`, `clean_files: 20`, `single_candidate: 20`, `unlinked: 2`, `mapping_issues: 8`).
