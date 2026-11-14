package cu.uci.android.apklis.presentation.ui.settings;

import android.app.Application;
import android.os.Bundle;
import cu.uci.android.apklis.di.AppApplication;
import defpackage.f60;
import defpackage.jz;
import defpackage.un0;
import defpackage.vi;
import defpackage.z50;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/* JADX INFO: loaded from: classes.dex */
public final class ChangePasswordActivity extends vi {
    public static final /* synthetic */ int E = 0;

    @Override // defpackage.vi, defpackage.y50, defpackage.x50, android.app.Activity
    public final void onCreate(Bundle bundle) {
        un0.a(this);
        super.onCreate(bundle);
        Application application = getApplication();
        application.getClass();
        z50.a(this, new f60(-548955917, true, new jz((AppApplication) application, this, 0)));
    }
}
