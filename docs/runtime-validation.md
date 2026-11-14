# Runtime Validation

Scope and status of dynamic/runtime validation for **Apklis** (`cu.uci.android.apklis` v2.0.1, `versionCode` `202609030`).

## Static Verification Completed

- `make verify` confirmed package `cu.uci.android.apklis`, `versionName` `2.0.1`, `versionCode` `202609030`, `minSdkVersion` `23`, `targetSdkVersion` `36`, `compileSdkVersion` `36`, and APK SHA-256 `4d23c1a911ed4a9b53762ab44fe8f6371a58a32072c055c26444b9de25ace305`.
- JADX 1.5.6 extracted all 22 files under `cu.uci.android.apklis.*` and 4,625 R8-repackaged classes under `defpackage.*`.
- Apktool 3.0.3 decoded `AndroidManifest.xml`, 77 XML resources, and `assets/PublicSuffixDatabase.list`.

## Outstanding Runtime Checks

- Emulator check of `ApklisLicenseProvider` (`content://cu.uci.android.apklis.ApklisLicenseProvider/account_data`) access control from an unprivileged third-party test app.
- Dynamic capture of `v3/release/get_url/` and Transfermóvil payment deep link dispatch (`apklis://payment`).
