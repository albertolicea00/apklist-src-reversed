# Package Download & Installer Architecture

Analysis of APK downloading and installation in `cu.uci.android.apklis`.

## Download Flow (`ApkDownloadService`)

- Declared with `android:foregroundServiceType="dataSync"` (`FOREGROUND_SERVICE_DATA_SYNC`).
- Performs HTTP downloads using OkHttp while injecting `Referer: https://www.apklis.cu/`.
- Download URLs are obtained via `POST v3/release/get_url/` (`defpackage.wh`).

## Installation Dispatch & Tracking

- Once downloaded, `ApkDownloadService` resolves a `content://` URI through `androidx.core.content.FileProvider` (`cu.uci.android.apklis.fileprovider`, configured by `res/xml/file_provider_paths.xml`).
- Launches `Intent(Intent.ACTION_VIEW)` with MIME type `application/vnd.android.package-archive` and `FLAG_GRANT_READ_URI_PERMISSION | FLAG_ACTIVITY_NEW_TASK` (`268435457`), backed by `REQUEST_INSTALL_PACKAGES`.
- `PackageInstallReceiver` (`exported="true"`) listens for `android.intent.action.PACKAGE_ADDED` and `android.intent.action.PACKAGE_REPLACED` (`scheme="package"`) to update local installation state.
- `REQUEST_DELETE_PACKAGES` and `QUERY_ALL_PACKAGES` support app uninstallation and local installed-app update scanning.
