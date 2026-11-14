# Domain Model

Catalog of reconstructed entrypoints and key R8-repackaged domain models in `cu.uci.android.apklis`.

| Clean / Mapped Name | Source / Obfuscated | Role |
|---|---|---|
| `CategoryListDeserializer` | `cu.uci.android.apklis.data.remote.deserializer.CategoryListDeserializer` | Custom Gson deserializer for store category lists |
| `AppApplication` | `cu.uci.android.apklis.di.AppApplication` | Global application initialization & theme setup |
| `ApklisLicenseProvider` | `cu.uci.android.apklis.presentation.provider.ApklisLicenseProvider` | ContentProvider exposing `account_data` cursor |
| `PaymentProvider` | `cu.uci.android.apklis.presentation.provider.PaymentProvider` | ContentProvider exposing paid-app status under `app/*` |
| `ApkDownloadService` | `cu.uci.android.apklis.presentation.service.ApkDownloadService` | Foreground download & installer dispatch service |
| `MyAuthenticatorService` | `cu.uci.android.apklis.presentation.service.MyAuthenticatorService` | `AccountAuthenticator` service |
| `PackageInstallReceiver` | `cu.uci.android.apklis.presentation.receiver.PackageInstallReceiver` | `PACKAGE_ADDED` / `PACKAGE_REPLACED` receiver |
| `ApklisApiService` | `defpackage.wh` | Retrofit interface for `https://api.apklis.cu/` (`v3/*`, `o/*`) |
| `AccountManagerHelper` | `defpackage.j42` | `AccountManager` + `account_prefs` + `o/token/` client |
| `UserPreferences` | `defpackage.rt3` | `user_prefs` / `account_prefs` wrapper |
| `LicenseResponse` | `defpackage.uo1` | Paid-app license DTO (`uuid`, `license`, `license_group`, `price`, `status`, `expireAt`) |
