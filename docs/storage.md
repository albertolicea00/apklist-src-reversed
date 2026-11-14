# Local Storage & Persistence

Analysis of local persistence in `cu.uci.android.apklis`.

## SharedPreferences Files

| Preference Name | Component | Contents |
|---|---|---|
| `account_prefs` | `AccountManagerHelper` (`defpackage.j42`), `UserPreferences` (`defpackage.rt3`) | Fallback account metadata (`username`, tokens) when `AccountManager` is empty |
| `user_prefs` | `UserPreferences` (`defpackage.rt3`) | User session and profile preferences |
| `payment_cache` | `PaymentProvider` | Cached paid-app flags (`cached_paid_<packageName>`) |
| `app_settings` | `AppApplication`, `SettingsActivity` | UI theme (`theme_mode`: `"system"`, etc.) |

## AccountManager & FileProvider

- **Android `AccountManager`**: Primary credential/token store managed via `MyAuthenticatorService` (`res/xml/authenticator.xml`).
- **APK Cache**: Downloaded APK files are stored under paths configured in `res/xml/file_provider_paths.xml` and shared with the system package installer via `cu.uci.android.apklis.fileprovider`.
