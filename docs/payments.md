# Paid Apps, Licensing & Payments

Analysis of license verification and payment integration in `cu.uci.android.apklis`.

## 1. `PaymentProvider` (`cu.uci.android.apklis.PaymentProvider`)

- Exported `ContentProvider` matching `content://cu.uci.android.apklis.PaymentProvider/app/*`.
- Returns a `MatrixCursor` indicating whether a given package is paid (`cached_paid_<packageName>`).
- Reads `SharedPreferences("payment_cache", 0)` as a fast local cache and reads the active username via `AccountManagerHelper` (`defpackage.j42`).

## 2. `ApklisLicenseProvider` (`cu.uci.android.apklis.ApklisLicenseProvider`)

- Exported `ContentProvider` matching `content://cu.uci.android.apklis.ApklisLicenseProvider/account_data`.
- Returns a `MatrixCursor` with columns:
  `["username", "device_id", "access_token", "code"]`.
- Queries `AccountManager` first, and if empty or unavailable, logs `"AccountManager empty or failed — falling back to SharedPreferences account data"` (`account_prefs`).

## 3. Payment Gateways & Deep Links

- `AppDetailActivity` handles `apklis://payment` and `apklis://license` deep links and displays QR payment dialogs (`dialog_payment_qr.xml`).
- String resources (`payment_transfermovil`, `payment_open_transfermovil`, `transfermovil_not_installed`) confirm integration with **Transfermóvil** for paid application purchases.
- `LicenseResponse` (`defpackage.uo1`) models server license records (`uuid`, `license_group`, `license`, `price`, `device`, `status`, `statusDisplay`, `expireIn`, `expireAt`, `createdAt`, `activatedAt`, `cancelledAt`).
