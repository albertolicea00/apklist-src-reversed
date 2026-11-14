package cu.uci.android.apklis.presentation.ui.login;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import defpackage.d5;
import defpackage.nr3;
import defpackage.vi;
import defpackage.z50;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/* JADX INFO: loaded from: classes.dex */
public final class SplashActivity extends vi {
    public static final /* synthetic */ int F = 0;
    public final Handler E = new Handler(Looper.getMainLooper());

    @Override // defpackage.vi, defpackage.y50, defpackage.x50, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z50.a(this, nr3.l);
        this.E.postDelayed(new d5(22, this), 1200L);
    }

    @Override // defpackage.vi, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.E.removeCallbacksAndMessages(null);
    }
}
