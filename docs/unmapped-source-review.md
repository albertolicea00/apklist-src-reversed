# Unmapped Source Review

Classification ledger for files in `src/` not mapped to `app/src/main/java/`.

| Source File | Classification | Role | Evidence |
|---|---|---|---|
| `src/cu/uci/android/apklis/R.java` | Generated Android Resource Index | Compiler-generated `R` class holding resource IDs | Standard `aapt2` generated `R` class |
| `src/cu/uci/android/apklis/presentation/ui/main/MainActivity$setupAdapters$expandGridLM$1$1.java` | Compiler-generated Kotlin anonymous `GridLayoutManager` subclass | Inner `SpanSizeLookup` / layout helper compiled inside `MainActivity` | Synthetic `$setupAdapters$expandGridLM$1$1` Kotlin lambda/object class |

**Inventory verification (2026-11-15):** `source_files: 26`, `clean_files: 24`, `single_candidate: 24`, `unlinked: 2` (the two generated/synthetic entries above; no `BuildConfig.java` present in `src/`), `mapping_issues: 0`.
