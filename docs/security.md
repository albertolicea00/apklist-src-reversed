# Security & Permissions Audit

Target: `cu.uci.android.apklis` v2.0.1 (versionCode `202609030`).

> [!NOTE]
> **Status:** Structural template (pending decompilation). Populate with concrete evidence from `app/AndroidManifest.xml`, `src/`, and `smali/` after decompiling.

## Audit Checklist

1. **High-Privilege Permissions & Exported Components**
   - `REQUEST_INSTALL_PACKAGES`, `REQUEST_DELETE_PACKAGES`, `QUERY_ALL_PACKAGES`, and `MANAGE_EXTERNAL_STORAGE`.
   - Exported Activities, Services (`AccountAuthenticator`), BroadcastReceivers, and `FileProvider` configurations.
2. **AccountManager & Token Security**
   - `AUTHENTICATE_ACCOUNTS` / `MANAGE_ACCOUNTS` implementation, OAuth2 token refresh, and credential storage.
3. **APK Download & Installation Integrity**
   - Verification of downloaded APK hashes/signatures prior to invoking `PackageInstaller` to prevent MITM or TOCTOU package replacement on external storage.
