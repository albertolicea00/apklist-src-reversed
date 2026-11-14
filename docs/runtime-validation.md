# Local Android runtime validation

Target: `cu.uci.android.apklis-v202609030.apk`, SHA-256
`4d23c1a911ed4a9b53762ab44fe8f6371a58a32072c055c26444b9de25ace305`.

## Scope and safety rules

When performing dynamic or hybrid-APK validation in an Android emulator:

1. Use an isolated Android Virtual Device (AVD) dedicated to research.
2. Disable radio/network connectivity or isolate traffic unless explicitly inspecting local protocol framing.
3. Do not submit live user credentials, payment confirmations, or unauthorized requests to production `*.apklis.cu` servers.
4. Keep all modified/hybrid APKs, UI hierarchy dumps, screenshots, and logcat captures inside `.workspace/` (excluded from Git).

## Observed results

Pending decompilation and initial static analysis. Record emulator environment, API level, startup behavior, and screen hierarchy comparisons here once dynamic checks are performed.
