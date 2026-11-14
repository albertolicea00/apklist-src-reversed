# Security & Permissions Audit

Security assessment of **Apklis** (`cu.uci.android.apklis` v2.0.1, `versionCode` `202609030`).

## 1. Manifest Flags & High-Privilege Permissions

- **Cleartext & Backup**: `android:allowBackup="true"` and `android:usesCleartextTraffic="true"` are both enabled in `AndroidManifest.xml`.
- **High-privilege permissions**: `REQUEST_INSTALL_PACKAGES`, `REQUEST_DELETE_PACKAGES`, `MANAGE_EXTERNAL_STORAGE`, `QUERY_ALL_PACKAGES`, `GET_ACCOUNTS`, `AUTHENTICATE_ACCOUNTS`, `MANAGE_ACCOUNTS`, `POST_NOTIFICATIONS`.

## 2. Exported ContentProviders Without Read Permission Enforcement

- `AndroidManifest.xml` defines custom permission `cu.uci.android.apklis.READ_ACCOUNT_DATA` (`protectionLevel="normal"`).
- However, `<provider android:authorities="cu.uci.android.apklis.ApklisLicenseProvider" android:exported="true" .../>` and `<provider android:authorities="cu.uci.android.apklis.PaymentProvider" android:exported="true" .../>` do **not** declare `android:readPermission` or `android:permission` on the `<provider>` elements in `AndroidManifest.xml`.
- Because `ApklisLicenseProvider` returns `["username", "device_id", "access_token", "code"]` for `content://cu.uci.android.apklis.ApklisLicenseProvider/account_data`, any local app on the device can query the user's Apklis `access_token` unless enforced programmatically inside `query()` (which falls back to `account_prefs` `SharedPreferences`).

## 3. Account & Token Storage

- `MyAuthenticatorService` exposes `AccountManager` (`res/xml/authenticator.xml`), while `AccountManagerHelper` (`defpackage.j42`) mirrors account state and tokens into `SharedPreferences("account_prefs", 0)`.
