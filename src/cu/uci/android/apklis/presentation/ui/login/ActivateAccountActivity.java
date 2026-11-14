package cu.uci.android.apklis.presentation.ui.login;

import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import defpackage.a4;
import defpackage.b4;
import defpackage.c;
import defpackage.c4;
import defpackage.d4;
import defpackage.e20;
import defpackage.e4;
import defpackage.f34;
import defpackage.f60;
import defpackage.i73;
import defpackage.j41;
import defpackage.j5;
import defpackage.jh;
import defpackage.l24;
import defpackage.mf3;
import defpackage.o5;
import defpackage.ob;
import defpackage.q63;
import defpackage.un0;
import defpackage.v11;
import defpackage.vi;
import defpackage.z50;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/* JADX INFO: loaded from: classes.dex */
public final class ActivateAccountActivity extends vi {
    public static final /* synthetic */ int H = 0;
    public i73 E;
    public v11 F;
    public final o5 G = l(new c4(0, this), new j5(3));

    @Override // defpackage.vi, defpackage.y50, defpackage.x50, android.app.Activity
    public final void onCreate(Bundle bundle) {
        un0.a(this);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("phone");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra("username");
        int i = 0;
        z50.a(this, new f60(307994857, true, new b4(this, stringExtra, stringExtra2 != null ? stringExtra2 : "", i)));
        e20 e20VarB = new l24(this, this, l24.j, jh.a, j41.b).b();
        c4 c4Var = new c4(1, new e4(i));
        e20VarB.getClass();
        q63 q63Var = (q63) e20VarB.c;
        ob obVar = mf3.a;
        q63Var.i(new f34(obVar, c4Var));
        e20VarB.h();
        q63Var.i(new f34(obVar, new c(1)));
        e20VarB.h();
        i73 i73Var = new i73(new a4(this, 2), new d4(0));
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
}
