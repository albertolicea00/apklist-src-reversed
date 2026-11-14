# Java Compilation Audit

Static compilation notes for `cu.uci.android.apklis` (`2.0.1`, `versionCode` `202609030`).

## Scope & Dependencies

- The 20 reconstructed entrypoint classes in `app/src/main/java/cu/uci/android/apklis/` depend directly on R8-repackaged classes in `defpackage.*` (4,625 classes) as well as AndroidX, Material 3, OkHttp 3, Retrofit 2, and Kotlin stdlib.
- Full `javac` compilation requires generating a local `target-bytecode.jar` from the APK's `classes.dex` via `dex2jar` alongside `android-36` `android.jar` (`make compile-audit ANDROID_JAR=... BYTECODE_JAR=...`).
