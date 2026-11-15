# Java Compilation Audit

Static compilation notes for `cu.uci.android.apklis` (`2.0.1`, `versionCode` `202609030`).

## Scope & Dependencies

- The 24 reconstructed classes in `app/src/main/java/cu/uci/android/apklis/` depend directly on R8-repackaged classes in `defpackage.*` as well as AndroidX, Material 3, OkHttp 3, Retrofit 2, and Kotlin stdlib.
- Full `javac` compilation requires generating a local `target-bytecode.jar` from the APK's `classes.dex` via `dex2jar` alongside an Android SDK `android.jar` (`make compile-audit ANDROID_JAR=... BYTECODE_JAR=...`).

## Observed `make compile-audit` Results (2026-11-15)

- **Command**: `ANDROID_JAR=$HOME/Library/Android/sdk/platforms/android-37.0/android.jar make compile-audit`
- **Compiler**: `javac 17.0.15` (`24` clean sources + generated `cu.uci.android.apklis.R`)
- **Classpath**: `android-37.0/android.jar` + `.workspace/tools/target-bytecode.jar`
- **Result**: failed at the parse phase with **48 errors in 3 files** (`illegal start of expression` / `: expected` from JADX `??` unknown-type placeholder declarations across 16 sites):
  - `app/src/main/java/cu/uci/android/apklis/presentation/service/ApkDownloadService.java`: 42 errors (14 `??` sites in `d(...)`, lines 421–567, alongside JADX variable-reuse artifacts).
  - `app/src/main/java/cu/uci/android/apklis/presentation/provider/PaymentProvider.java`: 3 errors (1 `??` site at line 99: `?? BooleanValue = sharedPreferences.getBoolean(...)`).
  - `app/src/main/java/cu/uci/android/apklis/presentation/ui/detail/AppDetailActivity.java`: 3 errors (1 `??` site at line 228: `?? r16 = str;`).
- Because `javac` halted on parse errors in those 3 files, type/symbol attribution across the remaining 21 clean files has not yet completed.
