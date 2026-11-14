package cu.uci.android.apklis.presentation.ui.main;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import defpackage.fq2;
import defpackage.zp2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"cu/uci/android/apklis/presentation/ui/main/MainActivity$setupAdapters$expandGridLM$1$1", "Landroidx/recyclerview/widget/GridLayoutManager;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainActivity$setupAdapters$expandGridLM$1$1 extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.sp2
    public final boolean e() {
        return false;
    }

    @Override // defpackage.sp2
    public final void f0(zp2 zp2Var, fq2 fq2Var, int i, int i2) {
        zp2Var.getClass();
        fq2Var.getClass();
        if (B() == 0) {
            super.f0(zp2Var, fq2Var, i, i2);
        } else {
            super.f0(zp2Var, fq2Var, i, View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }
}
