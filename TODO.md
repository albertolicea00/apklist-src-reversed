# Apklis Reverse Engineering — Task List

## Extraction & Baseline Setup

- [x] Verify APK identity (SHA-256, package `cu.uci.android.apklis`, version `2.0.1`, code `202609030`, SDK levels)
- [x] Initialize repository directory structure, documentation templates, and toolchain scripts
- [x] Run `make decompile` on `.workspace/bin/cu.uci.android.apklis-v202609030.apk` to extract JADX Java (`src/`), Apktool disassembly (`smali/`), resources (`app/res/`), assets (`app/assets/`), and `app/AndroidManifest.xml`
- [x] Create local smali archive `.workspace/archives/smali-2.0.1.202609030.zip` and record its SHA-256 in `docs/versioning.md`
- [x] Run `make inventory` to generate initial `.workspace/reconstruction-inventory.json` and record class counts in `README.md` and `docs/reconstruction-inventory.md`

## Architecture & Manifest Analysis

- [x] Decode and analyze `app/AndroidManifest.xml` (launch activity, activities, foreground sync services, broadcast receivers, content providers, permissions, deep links, and exported components)
- [x] Identify obfuscation scheme (ProGuard / R8), Kotlin vs. Java usage, Dependency Injection / architecture pattern, and third-party libraries
- [x] Inventory bundled assets under `app/assets/` and key configuration resources under `app/res/`
- [x] Document findings in `docs/architecture.md`

## Account Management & Authentication

- [x] Trace Android `AccountManager` authenticator (`AUTHENTICATE_ACCOUNTS`, `MANAGE_ACCOUNTS`, `GET_ACCOUNTS`) and session persistence
- [x] Trace OAuth2 / token login, refresh token lifecycle, and user profile endpoints

## Catalog, Networking & API Protocol

- [x] Identify HTTP client stack (OkHttp / Retrofit / Ktor) and interceptor chains
- [x] Catalog Apklis REST API endpoints (`api.apklis.cu` / `*.apklis.cu`: search, categories, app details, reviews/ratings, release channels, update checks)
- [x] Inspect TLS configuration, custom trust managers, or certificate pinning implementations
- [x] Document findings in `docs/networking.md`

## Package Download, Verification & Installation

- [x] Trace background download manager and `FOREGROUND_SERVICE_DATA_SYNC` execution
- [x] Trace installed package scanning (`QUERY_ALL_PACKAGES`) and version comparison logic for app updates
- [x] Trace APK integrity verification (SHA-256 / signature checks) and installation/uninstallation dispatch (`REQUEST_INSTALL_PACKAGES`, `REQUEST_DELETE_PACKAGES`, `PackageInstaller`)
- [x] Document findings in `docs/installer.md`

## Paid Apps & Payment Gateway Integration

- [x] Trace paid application purchase flow, license verification, and payment gateway integration (Transfermóvil deep links / QR codes)
- [x] Document purchase verification and entitlement checks in `docs/payments.md`

## Local Storage & Persistence

- [x] Identify local database engine (Room / SQLite / DataStore / SharedPreferences) and extract schemas
- [x] Audit local storage and external storage usage (`MANAGE_EXTERNAL_STORAGE`) for downloaded APKs and cached tokens
- [x] Document findings in `docs/storage.md`

## Security & Permissions Audit

- [x] Audit high-privilege permissions (`REQUEST_INSTALL_PACKAGES`, `MANAGE_EXTERNAL_STORAGE`, `QUERY_ALL_PACKAGES`) and exported components
- [x] Check for hardcoded client secrets, API keys, or custom cryptographic helpers
- [x] Document findings in `docs/security.md`

## Domain Model & Clean Source Reconstruction

- [x] Catalog domain entities, API DTOs, and enums in `docs/domain-model.md`
- [x] Classify unlinked main-package sources in `docs/unmapped-source-review.md`
- [x] Populate `mappings/classes.json` with verified obfuscated-to-clean class mappings
- [x] Reconstruct clean classes under `app/src/main/java/` with `@obfuscated_class` annotations
- [ ] Set up local `target-bytecode.jar` with dex2jar and run `make compile-audit` (`docs/java-compilation.md`)

## Dynamic Validation (When Emulator Available)

- [ ] Install APK on isolated Android emulator and capture initial launch logcat and UI hierarchy
- [ ] Compare runtime screens and API requests against static code map in `docs/runtime-validation.md`
