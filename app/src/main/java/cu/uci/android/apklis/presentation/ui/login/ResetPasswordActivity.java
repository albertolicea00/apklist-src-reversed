package cu.uci.android.apklis.presentation.ui.login;

import android.os.Bundle;
import defpackage.bt2;
import defpackage.f60;
import defpackage.un0;
import defpackage.vi;
import defpackage.z50;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/**
 * Password reset confirmation screen.
 *
 * @obfuscated_class cu.uci.android.apklis.presentation.ui.login.ResetPasswordActivity
 */
public final class ResetPasswordActivity extends vi {
    public static final /* synthetic */ int E = 0;

    @Override // defpackage.vi, defpackage.y50, defpackage.x50, android.app.Activity
    public final void onCreate(Bundle bundle) {
        un0.a(this);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("otp_code");
        if (stringExtra == null) {
            stringExtra = "";
        }
        z50.a(this, new f60(-157801879, true, new bt2(this, stringExtra, 0)));
    }
}
