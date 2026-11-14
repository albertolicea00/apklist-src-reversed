# Networking & Apklis REST API

Target: `cu.uci.android.apklis` v2.0.1 (versionCode `202609030`).

> [!NOTE]
> **Status:** Structural template (pending decompilation). Known ecosystem domains are listed below as initial references; verify exact hardcoded URLs, HTTP clients, and interceptors from decompiled source.

## Ecosystem & Known Infrastructure Domains

| Domain / URL | Role |
| :--- | :--- |
| `https://www.apklis.cu/` | Official Apklis web store and developer console |
| `https://api.apklis.cu/` / `*.apklis.cu` | Catalog, search, authentication, reviews, and APK download API endpoints |
| `https://www.apklis.cu/application/cu.uci.android.apklis` | Official store listing for the Apklis Android client |
| `https://www.ecured.cu/Apklis` | EcuRed encyclopedia reference for Apklis |

## Pending Analysis Sections (Post-Decompilation)

- **HTTP Stack:** OkHttp / Retrofit / Ktor versions, interceptors, User-Agent strings, and retry policies.
- **API Endpoints:** Application catalog, search, categories, user ratings, update batch check, and payment verification routes.
- **TLS & Certificate Pinning:** `network_security_config.xml`, custom `X509TrustManager` / `CertificatePinner`, and cleartext traffic flags.
