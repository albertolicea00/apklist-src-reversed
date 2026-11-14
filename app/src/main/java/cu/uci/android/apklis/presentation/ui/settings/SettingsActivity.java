package cu.uci.android.apklis.presentation.ui.settings;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import cu.uci.android.apklis.R;
import cu.uci.android.apklis.di.AppApplication;
import defpackage.dg2;
import defpackage.f60;
import defpackage.hc2;
import defpackage.k92;
import defpackage.l73;
import defpackage.qb3;
import defpackage.u4;
import defpackage.un;
import defpackage.un0;
import defpackage.vi;
import defpackage.xv;
import defpackage.z50;
import defpackage.zc2;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/**
 * App settings screen (theme_mode and legal links).
 *
 * @obfuscated_class cu.uci.android.apklis.presentation.ui.settings.SettingsActivity
 */
public final class SettingsActivity extends vi {
    public static final /* synthetic */ int G = 0;
    public final dg2 E;
    public final Handler F;

    public SettingsActivity() {
        un.i.getClass();
        this.E = hc2.q(un.SYSTEM);
        this.F = new Handler(Looper.getMainLooper());
    }

    public static String v(String str) {
        if (str == null) {
            return "";
        }
        String string = qb3.h0(str).toString();
        return (string.length() == 0 || string.equalsIgnoreCase("null") || string.equalsIgnoreCase("undefined")) ? "" : string;
    }

    @Override // defpackage.vi, defpackage.y50, defpackage.x50, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str = "1.0.0";
        un0.a(this);
        super.onCreate(bundle);
        String string = getSharedPreferences("app_settings", 0).getString("theme_mode", "system");
        un.i.getClass();
        this.E.setValue(xv.t(string));
        Application application = getApplication();
        application.getClass();
        AppApplication appApplication = (AppApplication) application;
        try {
            String str2 = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            if (str2 != null) {
                str = str2;
            }
        } catch (Exception unused) {
        }
        z50.a(this, new f60(139723827, true, new u4(appApplication, this, str, 8)));
        w();
    }

    @Override // defpackage.vi, android.app.Activity
    public final void onDestroy() {
        this.F.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    public final void u(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e) {
            k92.u(this, "No se pudo abrir el enlace: " + e.getMessage(), null, 6);
        }
    }

    public final void w() {
        un unVar = zc2.b;
        zc2.b = null;
        if (unVar == null) {
            return;
        }
        String string = getString(R.string.theme_changed_format, getString(unVar.f));
        string.getClass();
        k92.u(this, string, l73.g, 2);
    }
}
