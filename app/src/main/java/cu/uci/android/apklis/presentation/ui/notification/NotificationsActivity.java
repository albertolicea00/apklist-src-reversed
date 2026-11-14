package cu.uci.android.apklis.presentation.ui.notification;

import android.app.Application;
import android.os.Bundle;
import cu.uci.android.apklis.di.AppApplication;
import defpackage.aq0;
import defpackage.dg2;
import defpackage.f60;
import defpackage.gn;
import defpackage.hc2;
import defpackage.jw;
import defpackage.kn;
import defpackage.un0;
import defpackage.un1;
import defpackage.vi;
import defpackage.w72;
import defpackage.z50;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/**
 * User notifications screen.
 *
 * @obfuscated_class cu.uci.android.apklis.presentation.ui.notification.NotificationsActivity
 */
public final class NotificationsActivity extends vi {
    public static final /* synthetic */ int I = 0;
    public final dg2 E = hc2.q(aq0.e);
    public final dg2 F;
    public final dg2 G;
    public final dg2 H;

    public NotificationsActivity() {
        Boolean bool = Boolean.FALSE;
        this.F = hc2.q(bool);
        this.G = hc2.q(bool);
        this.H = hc2.q(null);
    }

    @Override // defpackage.vi, defpackage.y50, defpackage.x50, android.app.Activity
    public final void onCreate(Bundle bundle) {
        un0.a(this);
        super.onCreate(bundle);
        z50.a(this, new f60(-257788241, true, new w72(this, 0)));
        u();
    }

    @Override // defpackage.vi, android.app.Activity
    public final void onStop() {
        super.onStop();
        Application application = getApplication();
        application.getClass();
        kn knVarA = ((AppApplication) application).a();
        knVarA.b.G().b(new gn(new jw(21), knVarA));
    }

    public final void u() {
        w(true);
        v(null);
        this.G.setValue(Boolean.FALSE);
        Application application = getApplication();
        application.getClass();
        ((AppApplication) application).a().i(false, new un1(6, this));
    }

    public final void v(String str) {
        this.H.setValue(str);
    }

    public final void w(boolean z) {
        this.F.setValue(Boolean.valueOf(z));
    }
}
