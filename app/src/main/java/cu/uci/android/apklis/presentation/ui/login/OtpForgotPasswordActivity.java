package cu.uci.android.apklis.presentation.ui.login;

import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import defpackage.c4;
import defpackage.d4;
import defpackage.e20;
import defpackage.f34;
import defpackage.f60;
import defpackage.g01;
import defpackage.i73;
import defpackage.j41;
import defpackage.j5;
import defpackage.jh;
import defpackage.l24;
import defpackage.mf3;
import defpackage.o5;
import defpackage.ob;
import defpackage.q63;
import defpackage.qo1;
import defpackage.rc2;
import defpackage.sc2;
import defpackage.un0;
import defpackage.v11;
import defpackage.vi;
import defpackage.z50;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/**
 * OTP password-recovery request screen.
 *
 * @obfuscated_class cu.uci.android.apklis.presentation.ui.login.OtpForgotPasswordActivity
 */
public final class OtpForgotPasswordActivity extends vi {
    public static final /* synthetic */ int H = 0;
    public i73 E;
    public v11 F;
    public final o5 G = l(new c4(10, this), new j5(3));

    @Override // defpackage.vi, defpackage.y50, defpackage.x50, android.app.Activity
    public final void onCreate(Bundle bundle) {
        un0.a(this);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("phone");
        if (stringExtra == null) {
            stringExtra = "";
        }
        z50.a(this, new f60(-2076907191, true, new sc2(stringExtra, this, 0)));
        u();
        i73 i73Var = new i73(new rc2(this, 2), new d4(27));
        this.E = i73Var;
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(i73Var, intentFilter, 2);
        } else {
            registerReceiver(i73Var, intentFilter);
        }
    }

    @Override // defpackage.vi, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        i73 i73Var = this.E;
        if (i73Var != null) {
            try {
                unregisterReceiver(i73Var);
            } catch (Throwable unused) {
            }
        }
        this.E = null;
    }

    public final void u() {
        e20 e20VarB = new l24(this, this, l24.j, jh.a, j41.b).b();
        c4 c4Var = new c4(11, new qo1(18));
        e20VarB.getClass();
        ob obVar = mf3.a;
        f34 f34Var = new f34(obVar, c4Var);
        q63 q63Var = (q63) e20VarB.c;
        q63Var.i(f34Var);
        e20VarB.h();
        q63Var.i(new f34(obVar, new g01()));
        e20VarB.h();
    }
}
