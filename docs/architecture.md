# Architecture Overview

Target: `cu.uci.android.apklis` v2.0.1 (versionCode `202609030`), SHA-256 `4d23c1a911ed4a9b53762ab44fe8f6371a58a32072c055c26444b9de25ace305`.

> [!NOTE]
> **Status:** Pre-decompilation baseline. Only APK badging metadata (`aapt2 dump badging`) has been extracted so far. Run `make decompile` to populate `src/`, `smali/`, `app/res/`, `app/assets/`, and `app/AndroidManifest.xml`.

## Build & Package Properties

| Property | Value |
| :--- | :--- |
| **Package Name** | `cu.uci.android.apklis` |
| **Application Label** | `Apklis` |
| **Version Name** | `2.0.1` |
| **Version Code** | `202609030` |
| **Compile SDK** | `36` (Android 16) |
| **Min SDK** | `23` (Android 6.0) |
| **Target SDK** | `36` (Android 16) |
| **APK Size** | 5,808,195 bytes (~5.5 MB) |

## Declared Permissions (from `aapt2 dump badging`)

- Network & Background Sync: `INTERNET`, `ACCESS_NETWORK_STATE`, `FOREGROUND_SERVICE`, `FOREGROUND_SERVICE_DATA_SYNC`, `POST_NOTIFICATIONS`
- Package Management: `REQUEST_INSTALL_PACKAGES`, `REQUEST_DELETE_PACKAGES`, `QUERY_ALL_PACKAGES`
- Storage: `MANAGE_EXTERNAL_STORAGE`
- Account Management: `GET_ACCOUNTS`, `AUTHENTICATE_ACCOUNTS`, `MANAGE_ACCOUNTS`

## Pending Analysis Sections (Post-Decompilation)

- **Manifest Components:** Activities, Foreground Services, BroadcastReceivers, `AccountAuthenticator` service, ContentProviders, and deep links.
- **Application Class & Dependency Injection:** Startup initialization, Kotlin/Java architecture, and DI framework.
- **Package Structure & Obfuscation:** ProGuard/R8 obfuscation patterns and module boundaries.
- **Bundled Assets:** Inspect `app/assets/` and `app/res/`.
