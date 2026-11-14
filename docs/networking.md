# Networking & API Protocol

Analysis of Apklis REST endpoints, OAuth2 token handling, and HTTP stack.

## Base URL & OAuth2 Token Endpoint

- **Primary API Base**: `https://api.apklis.cu/` (`defpackage.ce0`)
- **OAuth2 Token Endpoint**: `https://api.apklis.cu/o/token/` (`defpackage.j42`, `defpackage.wh`)
- **Web Portal & Legal Links**: `https://www.apklis.cu/application/{pkg}`, `https://apklis.cu/information/{contact,guide,terms,devterms,faq}`

## `ApklisApiService` (`defpackage.wh`) Routes

| Method / Route | Purpose |
|---|---|
| `POST o/token/` | OAuth2 login and refresh-token exchange |
| `GET o/user/me/` | Authenticated user profile |
| `GET v3/dashboard/resume/` | Home dashboard feed |
| `GET v3/slider/` | Featured banner slider |
| `GET v3/application/` | App catalog listing and search |
| `GET v3/application/{packageName}/` | App detail metadata |
| `POST v3/application/wishlist/` | Toggle app wishlist |
| `POST v3/release/get_url/` | Obtain signed APK download URL |
| `GET v3/review/` | Fetch application reviews |
| `DELETE/POST v3/application/delete_review/` | Delete user review |
| `POST v3/suggest/` | Submit app suggestion |
| `POST v3/complaint/` | Submit app complaint |
| `POST v3/device/` | Register device for licensing |
| `POST v3/notification/read-all/` | Mark notifications as read |
| `POST v3/action/{action}/` | Dynamic action form submission |

## HTTP Client Stack

- OkHttp 3 + Retrofit 2 + Gson (`CategoryListDeserializer`, `application/json; charset=UTF-8`), plus `PublicSuffixDatabase.list` in `assets/`.
- `ApkDownloadService` attaches `Referer: https://www.apklis.cu/` on APK downloads.
