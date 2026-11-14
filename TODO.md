# Apklis Reverse Engineering — Task List

## Extraction & Baseline Setup

- [x] Verify APK identity (SHA-256, package `cu.uci.android.apklis`, version `2.0.1`, code `202609030`, SDK levels)
- [x] Initialize repository directory structure, documentation templates, and toolchain scripts
- [ ] Run `make decompile` on `.workspace/bin/cu.uci.android.apklis-v202609030.apk` to extract JADX Java (`src/`), Apktool disassembly (`smali/`), resources (`app/res/`), assets (`app/assets/`), and `app/AndroidManifest.xml`
- [ ] Create local smali archive `.workspace/archives/smali-2.0.1.202609030.zip` and record its SHA-256 in `docs/versioning.md`
- [ ] Run `make inventory` to generate initial `.workspace/reconstruction-inventory.json` and record class counts in `README.md` and `docs/reconstruction-inventory.md`

## Architecture & Manifest Analysis

- [ ] Decode and analyze `app/AndroidManifest.xml` (launch activity, activities, foreground sync services, broadcast receivers, content providers, permissions, deep links, and exported components)
- [ ] Identify obfuscation scheme (ProGuard / R8), Kotlin vs. Java usage, Dependency Injection / architecture pattern, and third-party libraries
- [ ] Inventory bundled assets under `app/assets/` and key configuration resources under `app/res/`
- [ ] Document findings in `docs/architecture.md`

## Account Management & Authentication

- [ ] Trace Android `AccountManager` authenticator (`AUTHENTICATE_ACCOUNTS`, `MANAGE_ACCOUNTS`, `GET_ACCOUNTS`) and session persistence
- [ ] Trace OAuth2 / token login, refresh token lifecycle, and user profile endpoints

## Catalog, Networking & API Protocol

- [ ] Identify HTTP client stack (OkHttp / Retrofit / Ktor) and interceptor chains
- [ ] Catalog Apklis REST API endpoints (`api.apklis.cu` / `*.apklis.cu`: search, categories, app details, reviews/ratings, release channels, update checks)
- [ ] Inspect TLS configuration, custom trust managers, or certificate pinning implementations
- [ ] Document findings in `docs/networking.md`

## Package Download, Verification & Installation

- [ ] Trace background download manager and `FOREGROUND_SERVICE_DATA_SYNC` execution
- [ ] Trace installed package scanning (`QUERY_ALL_PACKAGES`) and version comparison logic for app updates
- [ ] Trace APK integrity verification (SHA-256 / signature checks) and installation/uninstallation dispatch (`REQUEST_INSTALL_PACKAGES`, `REQUEST_DELETE_PACKAGES`, `PackageInstaller`)
- [ ] Document findings in `docs/installer.md`

## Paid Apps & Payment Gateway Integration

- [ ] Trace paid application purchase flow, license verification, and payment gateway integration (Transfermóvil deep links / QR codes)
- [ ] Document purchase verification and entitlement checks in `docs/payments.md`

## Local Storage & Persistence

- [ ] Identify local database engine (Room / SQLite / DataStore / SharedPreferences) and extract schemas
- [ ] Audit local storage and external storage usage (`MANAGE_EXTERNAL_STORAGE`) for downloaded APKs and cached tokens
- [ ] Document findings in `docs/storage.md`

## Security & Permissions Audit

- [ ] Audit high-privilege permissions (`REQUEST_INSTALL_PACKAGES`, `MANAGE_EXTERNAL_STORAGE`, `QUERY_ALL_PACKAGES`) and exported components
- [ ] Check for hardcoded client secrets, API keys, or custom cryptographic helpers
- [ ] Document findings in `docs/security.md`

## Domain Model & Clean Source Reconstruction

- [ ] Catalog domain entities, API DTOs, and enums in `docs/domain-model.md`
- [ ] Classify unlinked main-package sources in `docs/unmapped-source-review.md`
- [ ] Populate `mappings/classes.json` with verified obfuscated-to-clean class mappings
- [ ] Reconstruct clean classes under `app/src/main/java/` with `@obfuscated_class` annotations
- [ ] Set up local `target-bytecode.jar` with dex2jar and run `make compile-audit` (`docs/java-compilation.md`)

## Dynamic Validation (When Emulator Available)

- [ ] Install APK on isolated Android emulator and capture initial launch logcat and UI hierarchy
- [ ] Compare runtime screens and API requests against static code map in `docs/runtime-validation.md`
