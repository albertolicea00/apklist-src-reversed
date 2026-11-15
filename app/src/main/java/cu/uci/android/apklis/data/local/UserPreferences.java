package cu.uci.android.apklis.data.local;

import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import cu.uci.android.apklis.R;
import cu.uci.android.apklis.di.AppApplication;
import defpackage.ce0;
import defpackage.g22;
import defpackage.hc2;
import defpackage.is2;
import defpackage.j42;
import defpackage.je3;
import defpackage.lb3;
import defpackage.ms2;
import defpackage.ot3;
import defpackage.pt3;
import defpackage.qb3;
import defpackage.qt3;
import defpackage.rf1;
import defpackage.so;
import defpackage.uq2;
import defpackage.wh;
import defpackage.wy1;
import defpackage.xb3;
import defpackage.yh0;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/**
 * SharedPreferences wrapper for user_prefs and account_prefs.
 *
 * @obfuscated_class defpackage.rt3
 */
public final class UserPreferences {
    public final AppApplication a;
    public final wh b;
    public final SharedPreferences c;
    public final Gson d;

    public UserPreferences(AppApplication appApplication, wh whVar) {
        this.a = appApplication;
        this.b = whVar;
        SharedPreferences sharedPreferences = appApplication.getSharedPreferences("user_prefs", 0);
        sharedPreferences.getClass();
        this.c = sharedPreferences;
        this.d = new Gson();
    }

    public static final JsonObject a(UserPreferences userPreferences, String str) {
        Gson gson = userPreferences.d;
        String string = qb3.h0(str).toString();
        JsonObject jsonObject = null;
        if (string.length() == 0) {
            return null;
        }
        if (xb3.H(string, "\"", false) && string.endsWith("\"")) {
            try {
                String str2 = (String) gson.fromJson(string, String.class);
                if (str2 != null) {
                    string = qb3.h0(str2).toString();
                }
            } catch (Exception unused) {
            }
        }
        try {
            JsonElement jsonElement = (JsonElement) gson.fromJson(string, JsonElement.class);
            if (jsonElement != null && jsonElement.isJsonObject()) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject.has("username")) {
                    return asJsonObject;
                }
                Iterator<String> it = asJsonObject.keySet().iterator();
                while (it.hasNext()) {
                    JsonElement jsonElement2 = asJsonObject.get(it.next());
                    if (jsonElement2 != null && jsonElement2.isJsonObject() && jsonElement2.getAsJsonObject().has("username")) {
                        return jsonElement2.getAsJsonObject();
                    }
                }
                Log.w("UserRepositoryImpl", "extractUserJson: no username field found, returning root: " + asJsonObject.keySet());
                jsonObject = asJsonObject;
            }
        } catch (Exception e) {
            Log.e("UserRepositoryImpl", "extractUserJson: error parsing JSON", e);
        }
        return jsonObject;
    }

    public static final ot3 b(UserPreferences userPreferences, pt3 pt3Var, String str, String str2) {
        userPreferences.getClass();
        ot3 ot3Var = new ot3();
        ot3Var.a = String.valueOf(pt3Var.getId());
        ot3Var.b = pt3Var.getUsername();
        ot3Var.c = pt3Var.getEmail();
        ot3Var.d = pt3Var.getFirstName();
        ot3Var.e = pt3Var.getLastName();
        String avatar = pt3Var.getAvatar();
        if (avatar == null || avatar.length() == 0) {
            avatar = null;
        }
        ot3Var.f = avatar;
        ot3Var.i = pt3Var.getCode();
        Integer notificationsUnreadCount = pt3Var.getNotificationsUnreadCount();
        ot3Var.j = notificationsUnreadCount != null ? notificationsUnreadCount.intValue() : 0;
        ot3Var.k = pt3Var.getAction();
        ot3Var.g = str;
        ot3Var.h = str2;
        return ot3Var;
    }

    public static final void c(UserPreferences userPreferences) {
        try {
            Build.MANUFACTURER.getClass();
            String strV = ce0.v();
            String[] strArr = Build.SUPPORTED_ABIS;
            strArr.getClass();
            List listU0 = so.u0(strArr);
            Build.MODEL.getClass();
            int i = Build.VERSION.SDK_INT;
            Build.VERSION.RELEASE.getClass();
            Build.DEVICE.getClass();
            Build.PRODUCT.getClass();
            Build.TYPE.getClass();
            Build.VERSION.INCREMENTAL.getClass();
            Build.TAGS.getClass();
            Build.ID.getClass();
            Build.BRAND.getClass();
            ce0.u().R(yh0.a(strV, listU0, i)).b(new lb3(5));
        } catch (Exception e) {
            Log.e("UserRepositoryImpl", "Device registration error", e);
        }
    }

    public static final void d(UserPreferences userPreferences, ot3 ot3Var) {
        SharedPreferences.Editor editorEdit = userPreferences.c.edit();
        String str = ot3Var.a;
        if (str != null && str.length() != 0) {
            editorEdit.putString("user_id", ot3Var.a);
        }
        String str2 = ot3Var.b;
        if (str2 != null && str2.length() != 0) {
            editorEdit.putString("username", ot3Var.b);
        }
        String str3 = ot3Var.c;
        if (str3 != null && str3.length() != 0) {
            editorEdit.putString("email", ot3Var.c);
        }
        String str4 = ot3Var.d;
        if (str4 != null && str4.length() != 0) {
            editorEdit.putString("first_name", ot3Var.d);
        }
        String str5 = ot3Var.e;
        if (str5 != null && str5.length() != 0) {
            editorEdit.putString("last_name", ot3Var.e);
        }
        String str6 = ot3Var.f;
        if (str6 != null && str6.length() != 0) {
            editorEdit.putString("avatar", ot3Var.f);
        }
        String str7 = ot3Var.i;
        if (str7 != null && str7.length() != 0) {
            editorEdit.putString("code", ot3Var.i);
        }
        editorEdit.putInt("unread_notifications", ot3Var.j);
        editorEdit.commit();
    }

    public static String i(String str) {
        if (str == null) {
            return "";
        }
        Pattern patternCompile = Pattern.compile("\\D");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        if (strReplaceAll.length() >= 10 && xb3.H(strReplaceAll, "53", false)) {
            strReplaceAll = strReplaceAll.substring(strReplaceAll.length() - 8);
        }
        return strReplaceAll.length() == 8 ? "+53".concat(strReplaceAll) : qb3.h0(str).toString();
    }

    public final void e(is2 is2Var) {
        je3 je3Var = j42.a;
        AppApplication appApplication = this.a;
        String strD = j42.d(appApplication);
        String strH = j42.h(appApplication);
        if (strD == null || strD.length() == 0) {
            String string = appApplication.getString(R.string.user_no_session);
            string.getClass();
            is2Var.b(string);
        } else {
            ce0.s = null;
            ce0.t = null;
            f(strD, strH, is2Var);
        }
    }

    public final void f(String str, String str2, is2 is2Var) {
        ce0.u().A().b(new g22(this, str, str2, is2Var, 18));
    }

    public final ot3 g() {
        if (!h()) {
            return null;
        }
        ot3 ot3Var = new ot3();
        SharedPreferences sharedPreferences = this.c;
        String string = sharedPreferences.getString("avatar", null);
        ot3Var.a = sharedPreferences.getString("user_id", null);
        ot3Var.b = sharedPreferences.getString("username", null);
        ot3Var.c = sharedPreferences.getString("email", null);
        ot3Var.d = sharedPreferences.getString("first_name", null);
        ot3Var.e = sharedPreferences.getString("last_name", null);
        if (string == null || string.length() == 0) {
            string = null;
        }
        ot3Var.f = string;
        ot3Var.i = sharedPreferences.getString("code", null);
        ot3Var.j = sharedPreferences.getInt("unread_notifications", 0);
        AppApplication appApplication = this.a;
        ot3Var.g = j42.d(appApplication);
        ot3Var.h = j42.h(appApplication);
        return ot3Var;
    }

    public final boolean h() {
        Long lValueOf;
        je3 je3Var = j42.a;
        AppApplication appApplication = this.a;
        String strD = j42.d(appApplication);
        if (strD != null && strD.length() != 0) {
            String strF = j42.f(appApplication, "token_expiry");
            if (strF != null) {
                lValueOf = xb3.J(strF);
            } else {
                SharedPreferences sharedPreferences = appApplication.getSharedPreferences("account_prefs", 0);
                sharedPreferences.getClass();
                long j = sharedPreferences.getLong("token_expiry", 0L);
                lValueOf = j != 0 ? Long.valueOf(j) : null;
            }
            if (lValueOf == null || lValueOf.longValue() == 0 || System.currentTimeMillis() < lValueOf.longValue()) {
                String strD2 = j42.d(appApplication);
                if (strD2 != null && qb3.h0(strD2).toString().length() != 0) {
                    return true;
                }
                j42.j(appApplication);
                this.c.edit().clear().apply();
                ce0.s = null;
                ce0.t = null;
                return false;
            }
        }
        return false;
    }

    public final void j(String str, is2 is2Var) {
        String string;
        wy1 wy1VarB;
        str.getClass();
        Pattern patternCompile = Pattern.compile("\\D");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        if (strReplaceAll.length() >= 10 && xb3.H(strReplaceAll, "53", false)) {
            strReplaceAll = strReplaceAll.substring(strReplaceAll.length() - 8);
        }
        int i = 1;
        if (strReplaceAll.length() == 8) {
            string = "+53 " + strReplaceAll.charAt(0) + " " + strReplaceAll.substring(1);
        } else {
            string = qb3.h0(str).toString();
        }
        Log.d("UserRepositoryImpl", "sendForgotPasswordSms phone_number=" + string);
        int i2 = ms2.a;
        uq2 uq2Var = wy1.e;
        try {
            wy1VarB = rf1.B("text/plain");
        } catch (IllegalArgumentException unused) {
            wy1VarB = null;
        }
        this.b.g(hc2.f(string, wy1VarB)).b(new qt3(is2Var, this, i));
    }

    public final void k(String str, is2 is2Var) {
        wy1 wy1VarB;
        str.getClass();
        String strI = i(str);
        Log.d("UserRepositoryImpl", "sendSmsCode phone_number=" + strI);
        int i = ms2.a;
        uq2 uq2Var = wy1.e;
        try {
            wy1VarB = rf1.B("text/plain");
        } catch (IllegalArgumentException unused) {
            wy1VarB = null;
        }
        this.b.V(hc2.f(strI, wy1VarB)).b(new qt3(is2Var, this, 2));
    }
}
