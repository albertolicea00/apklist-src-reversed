# Package Download, Verification & Installer Protocol

Target: `cu.uci.android.apklis` v2.0.1 (versionCode `202609030`).

> [!NOTE]
> **Status:** Structural template (pending decompilation). Document APK download flows, hash/signature verification, `PackageInstaller` session management, and paid app purchase verification once decompiled.

## Pending Analysis Sections

- **Installed Package Discovery (`QUERY_ALL_PACKAGES`):** Package enumeration, versionCode comparison, and update queue computation.
- **Background Download Pipeline (`FOREGROUND_SERVICE_DATA_SYNC`):** Chunked/resumable downloads, notification updates, and external storage layout (`MANAGE_EXTERNAL_STORAGE`).
- **APK Integrity & `PackageInstaller` (`REQUEST_INSTALL_PACKAGES`, `REQUEST_DELETE_PACKAGES`):** SHA-256 checksum validation, certificate checks, and session commit receivers.
- **Paid Apps & Payment Gateway Integration:** Transfermóvil / ENZONA payment handoff, license checks, and purchase entitlement verification.
