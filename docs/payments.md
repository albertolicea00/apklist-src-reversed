# Paid Apps & Payment Gateway Integration

Target: `cu.uci.android.apklis` v2.0.1 (versionCode `202609030`).

> [!NOTE]
> **Status:** Structural template (pending decompilation). Document paid app purchase workflows, Transfermóvil / payment gateway handoffs, and license verification once `src/` and `smali/` are extracted.

## Areas to Document

1. **Purchase Initiation & Checkout:** API endpoints for creating paid app orders and retrieving payment QR codes or deep links.
2. **Transfermóvil / Gateway Handoff:** Intent invocation, deep-link schemes, and callback handling.
3. **License & Entitlement Verification:** How purchased apps are validated before download/installation and how user entitlements are cached locally.
