package cu.uci.android.apklis.data.local;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import defpackage.bu2;
import defpackage.d4;
import defpackage.do2;
import defpackage.eu2;
import defpackage.i42;
import defpackage.je3;
import defpackage.p31;
import defpackage.qb3;
import defpackage.rf1;
import defpackage.u00;
import defpackage.u92;
import defpackage.we;
import defpackage.wj;
import defpackage.zz0;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/**
 * AccountManager & account_prefs SharedPreferences helper handling https://api.apklis.cu/o/token/.
 *
 * @obfuscated_class defpackage.j42
 */
public abstract class AccountManagerHelper {
    public static final je3 a = new je3(new d4(24));
    public static final je3 b = new je3(new d4(25));
    public static final Gson c = new Gson();
    public static final Object d = new Object();

    public static void a(AccountManager accountManager) {
        try {
            for (Account account : accountManager.getAccountsByType("cu.uci.android.apklis")) {
                accountManager.removeAccountExplicitly(account);
            }
        } catch (Exception e) {
            Log.e("AccountManagerHelper", "Error deleting existing accounts: " + e.getMessage(), e);
        }
    }

    public static String b(Context context, String str, String str2) {
        eu2 eu2Var;
        Log.d("AccountManagerHelper", "Refresh via password login...");
        u00 u00Var = new u00(12);
        u00Var.j("client_id", "RxHGQTdAoybsyjmD1m4hRQwbc4Zlfbl9TiKfNsHC");
        u00Var.j("username", str);
        u00Var.j("password", str2);
        u00Var.j("grant_type", "password");
        zz0 zz0Var = new zz0((ArrayList) u00Var.f, (ArrayList) u00Var.g);
        we weVar = new we(9);
        weVar.v("https://api.apklis.cu/o/token/");
        weVar.q("POST", zz0Var);
        wj wjVar = new wj(weVar);
        try {
            u92 u92Var = (u92) a.getValue();
            u92Var.getClass();
            bu2 bu2VarH = new do2(u92Var, wjVar, false).h();
            try {
                if (!bu2VarH.t || (eu2Var = bu2VarH.k) == null) {
                    bu2VarH.close();
                    return null;
                }
                String strI = i(context, eu2Var.i(), null);
                bu2VarH.close();
                return strI;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p31.l(bu2VarH, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            Log.w("AccountManagerHelper", "Password login refresh failed: " + e.getMessage());
            return null;
        }
    }

    public static String c(Context context, String str) {
        eu2 eu2Var;
        String strI;
        Log.d("AccountManagerHelper", "Refreshing token via refresh_token...");
        u00 u00Var = new u00(12);
        u00Var.j("client_id", "RxHGQTdAoybsyjmD1m4hRQwbc4Zlfbl9TiKfNsHC");
        u00Var.j("refresh_token", str);
        u00Var.j("grant_type", "refresh_token");
        zz0 zz0Var = new zz0((ArrayList) u00Var.f, (ArrayList) u00Var.g);
        we weVar = new we(9);
        weVar.v("https://api.apklis.cu/o/token/");
        weVar.q("POST", zz0Var);
        wj wjVar = new wj(weVar);
        try {
            u92 u92Var = (u92) a.getValue();
            u92Var.getClass();
            bu2 bu2VarH = new do2(u92Var, wjVar, false).h();
            try {
                if (!bu2VarH.t || (eu2Var = bu2VarH.k) == null || (strI = i(context, eu2Var.i(), str)) == null) {
                    bu2VarH.close();
                    return null;
                }
                bu2VarH.close();
                return strI;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p31.l(bu2VarH, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            Log.w("AccountManagerHelper", "Refresh request failed: " + e.getMessage());
            return null;
        }
    }

    public static String d(Context context) {
        String strF = f(context, "access_token");
        if (strF != null) {
            return strF;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("account_prefs", 0);
        sharedPreferences.getClass();
        String string = sharedPreferences.getString("access_token", null);
        if (string == null || qb3.U(string)) {
            return null;
        }
        return string;
    }

    public static i42 e(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("account_prefs", 0);
        sharedPreferences.getClass();
        String string = sharedPreferences.getString("username_key", null);
        Log.d("AccountManagerHelper", "getAccountData: username=" + string);
        if (string == null) {
            Log.w("AccountManagerHelper", "getAccountData: no username found");
            return null;
        }
        String string2 = sharedPreferences.getString("device_id", "");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = sharedPreferences.getString("access_token", "");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = sharedPreferences.getString("code", "");
        return new i42(string, string2, string3, string4 != null ? string4 : "");
    }

    public static String f(Context context, String str) {
        String userData;
        try {
            AccountManager accountManager = AccountManager.get(context);
            accountManager.getClass();
            Account accountG = g(context, accountManager);
            if (accountG == null || (userData = accountManager.getUserData(accountG, str)) == null || qb3.U(userData)) {
                return null;
            }
            return userData;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Account g(Context context, AccountManager accountManager) {
        Account[] accountsByType = accountManager.getAccountsByType("cu.uci.android.apklis");
        accountsByType.getClass();
        Account account = null;
        if (accountsByType.length == 0) {
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("account_prefs", 0);
        sharedPreferences.getClass();
        String string = sharedPreferences.getString("username_key", null);
        if (string != null) {
            for (Account account2 : accountsByType) {
                if (rf1.o(account2.name, string)) {
                    account = account2;
                    break;
                }
            }
            if (account != null) {
                return account;
            }
        }
        return accountsByType[0];
    }

    public static String h(Context context) {
        String strF = f(context, "refresh_token");
        if (strF != null) {
            return strF;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("account_prefs", 0);
        sharedPreferences.getClass();
        String string = sharedPreferences.getString("refresh_token", null);
        if (string == null || qb3.U(string)) {
            return null;
        }
        return string;
    }

    public static String i(Context context, String str, String str2) {
        try {
            JsonObject jsonObject = (JsonObject) c.fromJson(str, JsonObject.class);
            if (jsonObject == null || !jsonObject.has("access_token")) {
                return null;
            }
            String asString = jsonObject.get("access_token").getAsString();
            if (jsonObject.has("refresh_token")) {
                str2 = jsonObject.get("refresh_token").getAsString();
            }
            long asLong = jsonObject.has("expires_in") ? jsonObject.get("expires_in").getAsLong() : 86400L;
            asString.getClass();
            k(context, asString, str2, asLong);
            return asString;
        } catch (Exception e) {
            Log.e("AccountManagerHelper", "Error parsing token response", e);
            return null;
        }
    }

    public static void j(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("account_prefs", 0);
        sharedPreferences.getClass();
        sharedPreferences.edit().clear().apply();
        Log.i("AccountManagerHelper", "Account removed from SharedPreferences");
        try {
            AccountManager accountManager = AccountManager.get(context);
            accountManager.getClass();
            a(accountManager);
        } catch (Exception e) {
            Log.w("AccountManagerHelper", "Failed to remove from AccountManager: " + e.getMessage());
        }
    }

    public static void k(Context context, String str, String str2, long j) {
        long jMax = ((Math.max(j, 86400L) - 60) * 1000) + System.currentTimeMillis();
        SharedPreferences sharedPreferences = context.getSharedPreferences("account_prefs", 0);
        sharedPreferences.getClass();
        sharedPreferences.edit().putString("access_token", str).putString("refresh_token", str2 == null ? "" : str2).putLong("token_expiry", jMax).apply();
        l(context, "access_token", str);
        if (str2 != null) {
            l(context, "refresh_token", str2);
        }
        l(context, "token_expiry", String.valueOf(jMax));
    }

    public static void l(Context context, String str, String str2) {
        try {
            AccountManager accountManager = AccountManager.get(context);
            accountManager.getClass();
            Account accountG = g(context, accountManager);
            if (accountG != null) {
                accountManager.setUserData(accountG, str, str2);
            }
        } catch (Exception unused) {
        }
    }
}
