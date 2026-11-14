# Apklis Source (Reversed)

![Target Version](https://img.shields.io/badge/Target%20Version-2.0.1-blue?style=flat-square)
![Version Code](https://img.shields.io/badge/Version%20Code-202609030-informational?style=flat-square)
![Min SDK](https://img.shields.io/badge/Min%20SDK-23-orange?style=flat-square)
![Target SDK](https://img.shields.io/badge/Target%20SDK-36-green?style=flat-square)
![Last Update](https://img.shields.io/badge/Last%20Update-November%202026-lightgrey?style=flat-square)

<!-- 50 blocks; each full block = 2% (average of TODO tasks and source reconstruction) --> <!-- do not delete this progress-bar-->
<span style="white-space: nowrap;"><code>[█████████████████████████████████████████████░░░░░] 90%</code></span>

**Task-list progress: 31/34 completed (91%); 3 pending. Source reconstruction: 20/22 exact source links (90%).** Tasks have equal weight; overall bar averages task-list progress and exact main-package source links. This is not verified code coverage or a working-app percentage. Run `make progress` or `make inventory` to refresh it from [TODO.md](TODO.md) and `scripts/mapping-stats.sh`.

**Main-package exact source links: 20/22 (90% — 20 clean files, 2 unlinked, 8 mapping issues).** This counts original Java classes with one exact clean-source candidate; it does not verify implementation completeness. The [reconstruction inventory](docs/reconstruction-inventory.md) reports current counts, and the [unlinked-source review ledger](docs/unmapped-source-review.md) tracks per-source classifications.

## Overview

This repository contains reverse-engineered source code, extracted resources, and structural analysis of the **Apklis** Android client binary (`cu.uci.android.apklis`), the official Cuban Android application repository and distribution platform developed by the **Universidad de las Ciencias Informáticas (UCI)**. The primary objective is to inspect implementation details, verify REST API & OAuth2/AccountManager protocols, analyze package download/update and `PackageInstaller` verification flows, and document payment integration for paid applications.

> [!WARNING]
> **Disclaimer:** This repository is strictly intended for interoperability research, protocol analysis, and security auditing. All original application logic, trademarks, and associated intellectual property belong to the **Universidad de las Ciencias Informáticas (UCI)** and its platform operators. No proprietary binaries are hosted for redistribution.

## Reference Links & Ecosystem Context

| Resource | URL | Description |
| :--- | :--- | :--- |
| **Apklis Official Portal** | [https://www.apklis.cu/](https://www.apklis.cu/) | Official Cuban Android application store web portal, catalog, and developer console. |
| **Apklis Client on Apklis** | [https://www.apklis.cu/application/cu.uci.android.apklis](https://www.apklis.cu/application/cu.uci.android.apklis) | Official store listing and release distribution page for the Android client (`cu.uci.android.apklis`). |
| **Apklis (EcuRed)** | [https://www.ecured.cu/Apklis](https://www.ecured.cu/Apklis) | Collaborative encyclopedia reference detailing the history, architecture, and features of the Apklis platform. |

## Current Target Metadata

| Property | Value |
| :--- | :--- |
| **Package Name** | `cu.uci.android.apklis` |
| **Target Version** | `2.0.1` |
| **Version Code** | `202609030` |
| **Project tag** | `2.0.1.202609030-v1.0` *(planned)* |
| **Min SDK** | `23` |
| **Target SDK** | `36` |
| **Compile SDK** | `36` |
| **SHA-256 Hash** | `4d23c1a911ed4a9b53762ab44fe8f6371a58a32072c055c26444b9de25ace305` |

See [metadata extraction](docs/target-metadata.md) to reproduce these values from `.workspace/bin/cu.uci.android.apklis-v202609030.apk`.

## Project status

| Area | Status | Current state |
| :--- | :--- | :--- |
| APK identification and baseline setup | Complete for current APK | Target APK placed in `.workspace/bin/cu.uci.android.apklis-v202609030.apk`; metadata, SHA-256, and repository structure verified. |
| Static extraction (`src/`, `smali/`, `app/`) | Pending | Run `make decompile` to extract JADX Java, Apktool smali, decoded resources, assets, and manifest. |
| Clean Java reconstruction | Not started | Directory layout and `mappings/classes.json` initialized; awaits static extraction. |
| Protocol and feature analysis | Not started | Topic templates created in `docs/` for architecture, networking/API, package installer, payments, storage, and security. |
| Build and behavioral validation | Not started | Compiler audit (`scripts/compile-reconstruction.py`) and runtime validation docs prepared. |

See the [task list](TODO.md) for specific remaining work. Paused sessions record a temporary checkpoint in `.workspace/handoff.md`. The bar above tracks completed checklist items; full reconstruction and Android behavior remain unverified.

## Documentation

| Document | Contents |
| :--- | :--- |
| [Target metadata](docs/target-metadata.md) | APK identity, version, SDK levels, and SHA-256 extraction. |
| [Versioning](docs/versioning.md) | Repository versions, tags (`2.0.1.202609030-v1.0`), local smali archives, and cross-version comparisons. |
| [Architecture](docs/architecture.md) | Build properties, permissions, manifest components, foreground services, `AccountManager`, and dependencies. |
| [Package installer & updates](docs/installer.md) | Background download manager, `QUERY_ALL_PACKAGES` update checks, SHA-256 verification, and `PackageInstaller` flows. |
| [Paid apps & payments](docs/payments.md) | Paid app checkout, Transfermóvil / payment gateway handoffs, and license verification. |
| [Networking & API](docs/networking.md) | HTTP stack, OAuth2 interceptors, `*.apklis.cu` REST API endpoints, and TLS configuration. |
| [Security](docs/security.md) | High-privilege permissions audit (`REQUEST_INSTALL_PACKAGES`, `MANAGE_EXTERNAL_STORAGE`), component exposure, and credentials. |
| [Storage](docs/storage.md) | Local Room/SQLite schema, DataStore/SharedPreferences, and downloaded APK cache layout. |
| [Domain model](docs/domain-model.md) | Entities (applications, releases, reviews, user accounts, purchases, download tasks) and enum mappings. |
| [Reconstruction inventory](docs/reconstruction-inventory.md) | Reproducible source links, duplicate candidates, mapping conflicts, and review limits. |
| [Unlinked-source review ledger](docs/unmapped-source-review.md) | Per-source classification and evidence for unlinked main-package Java/Kotlin files. |
| [Java compilation audit](docs/java-compilation.md) | Dependency-backed compiler audit (`scripts/compile-reconstruction.py`) and classpath limits. |
| [Android runtime validation](docs/runtime-validation.md) | Isolated emulator validation guidelines, safety rules, and runtime observations. |

For work in progress, use the [task list](TODO.md). Paused sessions also provide `.workspace/handoff.md`. [CHANGELOG.md](CHANGELOG.md) records completed changes; [AGENTS.md](AGENTS.md) is the repository guide for contributors and coding agents.

---

## Versioning Strategy

Release names and Git tags use `<APK versionName>.<APK versionCode>-v<internal version>`. The current target's first project release will be `2.0.1.202609030-v1.0`. Later work on the same APK uses `-v1.1`, `-v1.2`, and so on; a new APK starts its own internal sequence at `-v1.0`.

The project follows a **single-branch workflow** (`main`). Raw JADX Java in `src/` stays in Git for mapping references and cross-version diffs. Smali stays in the local `smali/` directory, ignored by Git, with APK-specific ZIPs in `.workspace/archives/` for local comparison or possible future Release assets.

For complete details, branching guidelines, and the APK upgrade procedure, see [docs/versioning.md](docs/versioning.md).

## Tag History

| Tag | APK version | Version code | Internal release | GitHub Release |
| :--- | :--- | ---: | :--- | :--- |
| `2.0.1.202609030-v1.0` *(planned)* | `2.0.1` | `202609030` | `v1.0` | Not published |

---

## Project structure

```text
.
├── app/
│   ├── assets/                     Extracted JSON and other assets (pending decompilation)
│   ├── res/                        Extracted Android resources (pending decompilation)
│   └── src/main/java/              Clean, reconstructed Java/Kotlin source
├── src/                            Raw, obfuscated JADX Java output (pending decompilation)
├── smali/                          Local Dalvik disassembly (Git-ignored)
├── mappings/
│   ├── evidence/                   Bytecode/smali verification evidence
│   └── classes.json                Obfuscated-to-clean name mappings
├── docs/                           Topic-specific analysis and procedures
├── scripts/                        Extraction, verification, inventory, and search tools
│   └── tests/                      Reconstruction unit tests
├── .workspace/
│   ├── handoff.md                  Temporary pause/resume note, tracked by Git when present
│   ├── prompts/                    Initial and session analysis prompts
│   ├── bin/                        Local APK inputs (cu.uci.android.apklis-v202609030.apk)
│   └── archives/                   Local versioned smali ZIPs
├── Makefile                        Analysis commands
├── TODO.md                         Remaining project tasks
├── CHANGELOG.md                    Completed changes by analysis session
├── AGENTS.md                       Repository working guide
└── README.md
```

*Generated files under `.workspace/` and the local `smali/` directory are excluded from Git, except for `.gitkeep` files, which keep the empty directory structure in clones. `handoff.md` is tracked so a paused session can be resumed. A fresh clone needs the matching APK to regenerate smali, or a separately obtained versioned smali ZIP.*

Repository inventory for the current target (2026-11-14, pre-decompilation):

| Item | Count | Location |
| :--- | ---: | :--- |
| Decompiled Java files | 0 | `src/` (pending `make decompile`) |
| Clean Java reconstruction files | 0 | `app/src/main/java/` |
| Local smali files | 0 | `smali/` (ignored by Git; pending `make decompile`) |
| Extracted resource files | 0 | `app/res/` (pending `make decompile`) |
| Extracted asset files | 0 | `app/assets/` (pending `make decompile`) |
| Topic documents | 13 | `docs/` |
| Class mappings | 0 | `mappings/classes.json` |
| Analysis scripts | 7 | `scripts/` |

*These are file and mapping counts, not a measure of reconstruction completeness.*

## Legal Notice

**This is not the official source code for Apklis.** It is a close approximation reconstructed from the publicly distributed build of the application for research purposes.

The Copyright Laws of the United States recognize "fair use" of copyrighted content. Section 107 of the U.S. Copyright Act states:

> "Notwithstanding the provisions of sections 106 and 106A, the fair use of a copyrighted work, including such use by reproduction in copies or phonorecords or by any other means specified by that section, for purposes such as criticism, comment, news reporting, teaching (including multiple copies for classroom use), scholarship, or research, is not an infringement of copyright."

This repository and its contents are covered under fair use for the purposes of interoperability research, security auditing, and protocol analysis. Any DMCA takedown notice targeting this repository on these grounds would be invalid.

## Related Repositories

*Additional explorations, decompilations, and architectural analyses of Cuba's digital app and service ecosystem.*

| Repository | Package | Description |
| :--- | :--- | :--- |
| [transfermovil-src-reversed](https://github.com/albertolicea00/transfermovil-src-reversed) | `cu.etecsa.cubacel.tr.tm` | Reverse-engineered source code, resources, and protocol analysis for ETECSA Transfermóvil (mobile banking, MiTransfer wallet, USSD/SMS, and Boulevard e-commerce). |
| [enzona-src-reversed](https://github.com/albertolicea00/enzona-src-reversed) | `cu.xetid.apk.enzona` | Reverse-engineered source code, resources, and documentation for the XETID ENZONA payment platform and Boulevard / ENZONA-TPV interoperability. |
| [todus-src-reversed](https://github.com/albertolicea00/todus-src-reversed) | `cu.todus.android` | Reverse-engineered source code, resources, and documentation for the toDus instant messaging and collaborative platform. |
| [nauta-src-reversed](https://github.com/albertolicea00/nauta-src-reversed) | `cu.etecsa.enp_oficial` | Reverse-engineered source code, resources, and documentation for the official ETECSA Nauta captive portal and Wi-Fi client. |
| [bancuba-src-reversed](https://github.com/albertolicea00/bancuba-src-reversed) | `cu.bpa.bancuba` | Reverse-engineered source code, resources, and financial calculator analysis for the Banco Popular de Ahorro (BPA) BanCuba client. |
