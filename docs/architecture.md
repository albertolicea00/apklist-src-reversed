# Architecture Overview

Static architectural analysis of **Apklis** (`cu.uci.android.apklis`, version `2.0.1`, `versionCode` `202609030`), Cuba's official Android app store operated by UCI (Universidad de las Ciencias Informáticas).

## Target Summary

| Attribute | Value |
|---|---|
| Package | `cu.uci.android.apklis` |
| Version | `2.0.1` (`versionCode` `202609030`) |
| Min / Target / Compile SDK | `23` / `36` / `36` |
| Total DEX Classes | 5,152 (22 under `cu.uci.android.apklis.*`, 4,625 R8-repackaged under `defpackage.*`) |
| Application Class | `cu.uci.android.apklis.di.AppApplication` |
| Launcher Activity | `cu.uci.android.apklis.presentation.ui.login.SplashActivity` |

## Manifest Components

- **Activities (14)**:
  - `SplashActivity` (`MAIN`/`LAUNCHER`)
  - `AppDetailActivity` (`launchMode="singleTop"`, exported deep links: `apklis://app`, `apklis://license`, `apklis://payment`, `https://www.apklis.cu/application/`)
  - `MainActivity`, `WelcomeActivity`, `ActivateAccountActivity`, `OtpForgotPasswordActivity`, `ResetPasswordActivity`, `OnboardingActivity`, `SettingsActivity`, `ChangePasswordActivity`, `NotificationsActivity`, `AppNavigation`, `ActionFormActivity`
- **Services (2)**:
  - `ApkDownloadService` (`foregroundServiceType="dataSync"`, `exported="false"`)
  - `MyAuthenticatorService` (`android.accounts.AccountAuthenticator`, `exported="true"`)
- **Receivers**:
  - `PackageInstallReceiver` (`PACKAGE_ADDED`, `PACKAGE_REPLACED` for `package:` scheme, `exported="true"`)
- **Content Providers**:
  - `androidx.core.content.FileProvider` (`cu.uci.android.apklis.fileprovider`, `exported="false"`)
  - `ApklisLicenseProvider` (`cu.uci.android.apklis.ApklisLicenseProvider`, `exported="true"`)
  - `PaymentProvider` (`cu.uci.android.apklis.PaymentProvider`, `exported="true"`)

## Obfuscation & Tech Stack

- Written in **Kotlin** (`mv = {2, 2, 0}`) and aggressively shrunk/repackaged with **R8**, which keeps AndroidManifest-referenced entrypoints under `cu.uci.android.apklis.*` while collapsing internal repositories, Retrofit interfaces, and models into `defpackage.*`.
- Uses OkHttp 3, Retrofit 2, Gson, Android `AccountManager`, AndroidX Startup, Material 3, and ProfileInstaller.
