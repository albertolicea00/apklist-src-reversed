package cu.uci.android.apklis.presentation.navigation;

import android.os.Bundle;
import defpackage.f60;
import defpackage.um;
import defpackage.un0;
import defpackage.y50;
import defpackage.z50;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/* JADX INFO: loaded from: classes.dex */
public final class AppNavigation extends y50 {
    public static final /* synthetic */ int y = 0;

    @Override // defpackage.y50, defpackage.x50, android.app.Activity
    public final void onCreate(Bundle bundle) {
        un0.a(this);
        super.onCreate(bundle);
        Serializable serializableExtra = getIntent().getSerializableExtra("nav3_route");
        if (serializableExtra == null) {
            serializableExtra = null;
        }
        if (serializableExtra == null) {
            finish();
        } else {
            z50.a(this, new f60(611206446, true, new um(this, serializableExtra, 0)));
        }
    }
}
