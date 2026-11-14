package cu.uci.android.apklis.presentation.ui.detail;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import cu.uci.android.apklis.R;
import cu.uci.android.apklis.di.AppApplication;
import cu.uci.android.apklis.presentation.navigation.AppNavigation;
import cu.uci.android.apklis.presentation.service.ApkDownloadService;
import cu.uci.android.apklis.presentation.ui.detail.AppDetailActivity;
import defpackage.a5;
import defpackage.aq0;
import defpackage.b6;
import defpackage.bm;
import defpackage.c;
import defpackage.ce0;
import defpackage.cm;
import defpackage.di;
import defpackage.ek0;
import defpackage.f6;
import defpackage.fm;
import defpackage.fw3;
import defpackage.g01;
import defpackage.gm;
import defpackage.ih1;
import defpackage.j;
import defpackage.j5;
import defpackage.j6;
import defpackage.k92;
import defpackage.kn;
import defpackage.kx1;
import defpackage.l3;
import defpackage.l73;
import defpackage.le2;
import defpackage.lm;
import defpackage.me1;
import defpackage.mi;
import defpackage.nm;
import defpackage.nw3;
import defpackage.o5;
import defpackage.om;
import defpackage.oq2;
import defpackage.ot3;
import defpackage.p30;
import defpackage.pl;
import defpackage.q41;
import defpackage.q62;
import defpackage.qb3;
import defpackage.qh2;
import defpackage.qm;
import defpackage.r62;
import defpackage.rf1;
import defpackage.rj;
import defpackage.rl;
import defpackage.sd1;
import defpackage.sl;
import defpackage.su2;
import defpackage.tl2;
import defpackage.ul;
import defpackage.un0;
import defpackage.uy;
import defpackage.v11;
import defpackage.vi;
import defpackage.wh;
import defpackage.wy;
import defpackage.y21;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/* JADX INFO: loaded from: classes.dex */
public final class AppDetailActivity extends vi {
    public static v11 b1;
    public ImageView A0;
    public LinearLayout B0;
    public LinearLayout C0;
    public TextView D0;
    public om E;
    public List E0;
    public String F;
    public ImageView F0;
    public mi G;
    public TextView G0;
    public su2 H;
    public RatingBar H0;
    public int I;
    public TextView I0;
    public TextView J0;
    public Intent K;
    public ImageView K0;
    public RecyclerView L0;
    public boolean M;
    public ProgressBar M0;
    public int N;
    public ImageButton N0;
    public ImageButton O0;
    public ImageButton P0;
    public final o5 Q;
    public boolean Q0;
    public ImageView R;
    public Dialog R0;
    public TextView S;
    public SwipeRefreshLayout S0;
    public TextView T;
    public ComposeView T0;
    public TextView U;
    public TextView V;
    public LinearLayout W;
    public TextView X;
    public boolean X0;
    public MaterialButton Y;
    public boolean Y0;
    public LinearLayout Z;
    public final rj Z0;
    public MaterialButton a0;
    public MaterialButton b0;
    public View c0;
    public RecyclerView d0;
    public TextView e0;
    public View f0;
    public View g0;
    public ImageView h0;
    public TextView i0;
    public TextView j0;
    public ImageView k0;
    public View l0;
    public TextView m0;
    public TextView n0;
    public TextView o0;
    public TextView p0;
    public TextView q0;
    public RatingBar r0;
    public TextView s0;
    public ProgressBar t0;
    public ProgressBar u0;
    public ProgressBar v0;
    public ProgressBar w0;
    public ProgressBar x0;
    public ProgressBar y0;
    public RecyclerView z0;
    public List J = aq0.e;
    public tl2 L = tl2.g;
    public final Handler O = new Handler(Looper.getMainLooper());
    public final a5 P = new a5(3, this);
    public final uy U0 = new uy(2);
    public final wy V0 = new wy(0);
    public final wy W0 = new wy(1);
    public final gm a1 = new gm();

    public AppDetailActivity() {
        int i = 1;
        this.Q = l(new rl(this, i), new j5(2));
        this.Z0 = new rj(i, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.widget.ImageView[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    public static void E(final AppDetailActivity appDetailActivity, su2 su2Var, float f, int i) {
        String str = null;
        final su2 su2Var2 = (i & 1) != 0 ? null : su2Var;
        float f2 = (i & 2) != 0 ? 0.0f : f;
        Application application = appDetailActivity.getApplication();
        application.getClass();
        ot3 ot3VarG = ((AppApplication) application).b().g();
        String str2 = ot3VarG != null ? ot3VarG.b : null;
        if (str2 == null || qb3.U(str2)) {
            String string = appDetailActivity.getString(R.string.login_required_review);
            string.getClass();
            appDetailActivity.D(string);
            return;
        }
        int i2 = 1;
        final int i3 = 0;
        boolean z = su2Var2 != null;
        View viewInflate = LayoutInflater.from(appDetailActivity).inflate(R.layout.dialog_rate_app, (ViewGroup) null);
        final TextInputEditText textInputEditText = (TextInputEditText) viewInflate.findViewById(R.id.etComment);
        MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.btnDialogCancel);
        MaterialButton materialButton2 = (MaterialButton) viewInflate.findViewById(R.id.btnDialogSubmit);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tvDialogTitle);
        final List listX = me1.X(new ImageView[]{viewInflate.findViewById(R.id.ivDialogStar1), viewInflate.findViewById(R.id.ivDialogStar2), viewInflate.findViewById(R.id.ivDialogStar3), viewInflate.findViewById(R.id.ivDialogStar4), viewInflate.findViewById(R.id.ivDialogStar5)});
        final oq2 oq2Var = new oq2();
        if (su2Var2 != null) {
            f2 = su2Var2.d;
        }
        oq2Var.e = le2.d((int) f2, 0, 5);
        for (Object obj : listX) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                ?? r16 = str;
                me1.i0();
                throw r16;
            }
            ((ImageView) obj).setOnClickListener(new View.OnClickListener() { // from class: wl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v11 v11Var = AppDetailActivity.b1;
                    int i5 = i3 + 1;
                    oq2 oq2Var2 = oq2Var;
                    oq2Var2.e = i5;
                    AppDetailActivity.F(listX, oq2Var2);
                }
            });
            i3 = i4;
            str = str;
        }
        String str3 = str;
        F(listX, oq2Var);
        textView.setText(appDetailActivity.getString(z ? R.string.edit_review : R.string.rate_this_app));
        materialButton2.setText(appDetailActivity.getString(z ? R.string.save_changes : R.string.opinion));
        String str4 = su2Var2 != null ? su2Var2.e : str3;
        if (str4 == null) {
            str4 = "";
        }
        textInputEditText.setText(str4);
        kx1 kx1Var = new kx1(appDetailActivity, R.style.AppDialogFloating);
        f6 f6Var = (f6) kx1Var.g;
        f6Var.o = viewInflate;
        f6Var.k = true;
        final j6 j6VarM = kx1Var.m();
        materialButton.setOnClickListener(new ul(j6VarM, i2));
        materialButton2.setOnClickListener(new View.OnClickListener() { // from class: xl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z2;
                int i5;
                String string2;
                AppDetailActivity appDetailActivity2 = this.e;
                String str5 = appDetailActivity2.F;
                if (str5 == null) {
                    return;
                }
                Editable text = textInputEditText.getText();
                String string3 = (text == null || (string2 = text.toString()) == null) ? null : qb3.h0(string2).toString();
                if (string3 == null) {
                    string3 = "";
                }
                oq2 oq2Var2 = oq2Var;
                if (oq2Var2.e == 0) {
                    k92.t(appDetailActivity2, R.string.select_score, null, 6);
                    return;
                }
                if (qb3.U(string3)) {
                    k92.t(appDetailActivity2, R.string.write_comment, null, 6);
                    return;
                }
                om omVar = appDetailActivity2.E;
                if (omVar == null) {
                    rf1.W("viewModel");
                    throw null;
                }
                int i6 = oq2Var2.e;
                if (su2Var2 != null) {
                    z2 = true;
                    i5 = 1;
                } else {
                    z2 = false;
                    i5 = 1;
                }
                kn knVar = omVar.c;
                fm fmVar = new fm(i5, omVar, z2);
                wh whVar = knVar.b;
                if (z2) {
                    int i7 = ms2.a;
                    uq2 uq2Var = wy1.e;
                    whVar.Y(str5, hc2.f(string3, rf1.B("text/plain")), hc2.f(String.valueOf(i6), rf1.B("text/plain"))).b(new jn(fmVar, knVar, i5));
                } else {
                    i33 i33Var = new i33(i6, string3, str5);
                    whVar.W(i33Var).b(new g22(fmVar, knVar, str5, i33Var, 3));
                }
                j6VarM.dismiss();
            }
        });
        j6VarM.show();
        j6VarM.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yl
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AppDetailActivity appDetailActivity2 = this.e;
                appDetailActivity2.I = 0;
                appDetailActivity2.H();
            }
        });
    }

    public static final void F(List list, oq2 oq2Var) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                me1.i0();
                throw null;
            }
            ((ImageView) obj).setImageResource(i < oq2Var.e ? R.drawable.ic_star_filled : R.drawable.ic_star_outline);
            i = i2;
        }
    }

    public final void A() {
        mi miVar = this.G;
        String str = this.F;
        if (miVar == null || str == null || qb3.U(str)) {
            return;
        }
        Long lU = u(str);
        long j = miVar.k;
        boolean z = lU != null;
        boolean z2 = z && j > lU.longValue();
        boolean z3 = miVar.h;
        boolean z4 = miVar.F;
        LinearLayout linearLayout = this.Z;
        tl2 tl2Var = tl2.i;
        if (z) {
            if (linearLayout == null) {
                rf1.W("layoutInstalledActions");
                throw null;
            }
            linearLayout.setVisibility(0);
            MaterialButton materialButton = this.Y;
            if (materialButton == null) {
                rf1.W("btnDownload");
                throw null;
            }
            materialButton.setVisibility(8);
            if (this.M && z2) {
                this.L = tl2Var;
                MaterialButton materialButton2 = this.b0;
                if (materialButton2 == null) {
                    rf1.W("btnOpenApp");
                    throw null;
                }
                materialButton2.setText(getString(R.string.downloading_detail_format, Integer.valueOf(this.N), miVar.a()));
                MaterialButton materialButton3 = this.b0;
                if (materialButton3 == null) {
                    rf1.W("btnOpenApp");
                    throw null;
                }
                materialButton3.setEnabled(true);
                MaterialButton materialButton4 = this.b0;
                if (materialButton4 == null) {
                    rf1.W("btnOpenApp");
                    throw null;
                }
                materialButton4.setAlpha(1.0f);
                MaterialButton materialButton5 = this.b0;
                if (materialButton5 == null) {
                    rf1.W("btnOpenApp");
                    throw null;
                }
                materialButton5.setBackgroundTintList(ColorStateList.valueOf(getColor(android.R.color.holo_red_light)));
                MaterialButton materialButton6 = this.a0;
                if (materialButton6 == null) {
                    rf1.W("btnUninstall");
                    throw null;
                }
                materialButton6.setEnabled(false);
                MaterialButton materialButton7 = this.a0;
                if (materialButton7 == null) {
                    rf1.W("btnUninstall");
                    throw null;
                }
                materialButton7.setAlpha(0.5f);
            } else {
                this.L = z2 ? tl2.f : tl2.e;
                MaterialButton materialButton8 = this.b0;
                if (materialButton8 == null) {
                    rf1.W("btnOpenApp");
                    throw null;
                }
                materialButton8.setText(getString(z2 ? R.string.update : R.string.open_app));
                MaterialButton materialButton9 = this.b0;
                if (materialButton9 == null) {
                    rf1.W("btnOpenApp");
                    throw null;
                }
                materialButton9.setEnabled(!this.M);
                MaterialButton materialButton10 = this.b0;
                if (materialButton10 == null) {
                    rf1.W("btnOpenApp");
                    throw null;
                }
                if (materialButton10 == null) {
                    rf1.W("btnOpenApp");
                    throw null;
                }
                materialButton10.setAlpha(materialButton10.isEnabled() ? 1.0f : 0.5f);
                MaterialButton materialButton11 = this.b0;
                if (materialButton11 == null) {
                    rf1.W("btnOpenApp");
                    throw null;
                }
                materialButton11.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.colorPrimary)));
                MaterialButton materialButton12 = this.a0;
                if (materialButton12 == null) {
                    rf1.W("btnUninstall");
                    throw null;
                }
                materialButton12.setEnabled(!this.M);
                MaterialButton materialButton13 = this.a0;
                if (materialButton13 == null) {
                    rf1.W("btnUninstall");
                    throw null;
                }
                if (materialButton13 == null) {
                    rf1.W("btnUninstall");
                    throw null;
                }
                materialButton13.setAlpha(materialButton13.isEnabled() ? 1.0f : 0.5f);
            }
        } else {
            if (linearLayout == null) {
                rf1.W("layoutInstalledActions");
                throw null;
            }
            linearLayout.setVisibility(8);
            MaterialButton materialButton14 = this.Y;
            if (materialButton14 == null) {
                rf1.W("btnDownload");
                throw null;
            }
            materialButton14.setVisibility(0);
            if (this.M) {
                this.L = tl2Var;
                MaterialButton materialButton15 = this.Y;
                if (materialButton15 == null) {
                    rf1.W("btnDownload");
                    throw null;
                }
                materialButton15.setText(getString(R.string.downloading_detail_format, Integer.valueOf(this.N), miVar.a()));
                MaterialButton materialButton16 = this.Y;
                if (materialButton16 == null) {
                    rf1.W("btnDownload");
                    throw null;
                }
                materialButton16.setEnabled(true);
                MaterialButton materialButton17 = this.Y;
                if (materialButton17 == null) {
                    rf1.W("btnDownload");
                    throw null;
                }
                materialButton17.setAlpha(1.0f);
                MaterialButton materialButton18 = this.Y;
                if (materialButton18 == null) {
                    rf1.W("btnDownload");
                    throw null;
                }
                materialButton18.setBackgroundTintList(ColorStateList.valueOf(getColor(android.R.color.holo_red_light)));
            } else {
                MaterialButton materialButton19 = this.Y;
                if (materialButton19 == null) {
                    rf1.W("btnDownload");
                    throw null;
                }
                materialButton19.setEnabled(true);
                MaterialButton materialButton20 = this.Y;
                if (materialButton20 == null) {
                    rf1.W("btnDownload");
                    throw null;
                }
                materialButton20.setAlpha(1.0f);
                MaterialButton materialButton21 = this.Y;
                if (materialButton21 == null) {
                    rf1.W("btnDownload");
                    throw null;
                }
                materialButton21.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.colorPrimary)));
                tl2 tl2Var2 = tl2.g;
                if (z3) {
                    this.L = tl2Var2;
                    MaterialButton materialButton22 = this.Y;
                    if (materialButton22 == null) {
                        rf1.W("btnDownload");
                        throw null;
                    }
                    materialButton22.setText(getString(R.string.download_install));
                } else if (z4) {
                    this.L = tl2Var2;
                    MaterialButton materialButton23 = this.Y;
                    if (materialButton23 == null) {
                        rf1.W("btnDownload");
                        throw null;
                    }
                    materialButton23.setText(getString(R.string.download_install));
                } else {
                    this.L = tl2.h;
                    MaterialButton materialButton24 = this.Y;
                    if (materialButton24 == null) {
                        rf1.W("btnDownload");
                        throw null;
                    }
                    materialButton24.setText("Comprar - " + miVar.i + " CUP");
                }
            }
        }
        findViewById(R.id.btnFlag).setEnabled(true);
        findViewById(R.id.btnFlag).setAlpha(1.0f);
    }

    public final void B(boolean z) {
        findViewById(R.id.btnBack).setEnabled(z);
        findViewById(R.id.btnFlag).setEnabled(z);
        ImageButton imageButton = this.N0;
        if (imageButton == null) {
            rf1.W("btnWishlist");
            throw null;
        }
        imageButton.setEnabled(z);
        ImageButton imageButton2 = this.O0;
        if (imageButton2 == null) {
            rf1.W("btnShare");
            throw null;
        }
        imageButton2.setEnabled(z);
        TextView textView = this.D0;
        if (textView == null) {
            rf1.W("btnWriteReview");
            throw null;
        }
        textView.setEnabled(z);
        List list = this.E0;
        if (list == null) {
            rf1.W("starViews");
            throw null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ImageView) it.next()).setEnabled(z);
        }
        ImageView imageView = this.A0;
        if (imageView == null) {
            rf1.W("btnMoreReviews");
            throw null;
        }
        imageView.setEnabled(z);
        ImageView imageView2 = this.K0;
        if (imageView2 == null) {
            rf1.W("ivMyReviewMenu");
            throw null;
        }
        imageView2.setEnabled(z);
        ImageView imageView3 = this.h0;
        if (imageView3 == null) {
            rf1.W("btnExpandDesc");
            throw null;
        }
        imageView3.setEnabled(z);
        ImageView imageView4 = this.k0;
        if (imageView4 == null) {
            rf1.W("btnExpandInfo");
            throw null;
        }
        imageView4.setEnabled(z);
        MaterialButton materialButton = this.Y;
        if (materialButton == null) {
            rf1.W("btnDownload");
            throw null;
        }
        materialButton.setEnabled(z && !this.M);
        MaterialButton materialButton2 = this.b0;
        if (materialButton2 == null) {
            rf1.W("btnOpenApp");
            throw null;
        }
        materialButton2.setEnabled(z && !this.M);
        MaterialButton materialButton3 = this.a0;
        if (materialButton3 == null) {
            rf1.W("btnUninstall");
            throw null;
        }
        materialButton3.setEnabled(z && !this.M);
        float f = z ? 1.0f : 0.45f;
        findViewById(R.id.btnBack).setAlpha(f);
        findViewById(R.id.btnFlag).setAlpha(f);
        ImageButton imageButton3 = this.N0;
        if (imageButton3 == null) {
            rf1.W("btnWishlist");
            throw null;
        }
        imageButton3.setAlpha(f);
        ImageButton imageButton4 = this.O0;
        if (imageButton4 == null) {
            rf1.W("btnShare");
            throw null;
        }
        imageButton4.setAlpha(f);
        TextView textView2 = this.D0;
        if (textView2 == null) {
            rf1.W("btnWriteReview");
            throw null;
        }
        textView2.setAlpha(f);
        List list2 = this.E0;
        if (list2 == null) {
            rf1.W("starViews");
            throw null;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((ImageView) it2.next()).setAlpha(f);
        }
        ImageView imageView5 = this.A0;
        if (imageView5 == null) {
            rf1.W("btnMoreReviews");
            throw null;
        }
        imageView5.setAlpha(f);
        ImageView imageView6 = this.K0;
        if (imageView6 == null) {
            rf1.W("ivMyReviewMenu");
            throw null;
        }
        imageView6.setAlpha(f);
        ImageView imageView7 = this.h0;
        if (imageView7 == null) {
            rf1.W("btnExpandDesc");
            throw null;
        }
        imageView7.setAlpha(f);
        ImageView imageView8 = this.k0;
        if (imageView8 == null) {
            rf1.W("btnExpandInfo");
            throw null;
        }
        imageView8.setAlpha(f);
        MaterialButton materialButton4 = this.Y;
        if (materialButton4 == null) {
            rf1.W("btnDownload");
            throw null;
        }
        materialButton4.setAlpha(materialButton4.isEnabled() ? 1.0f : 0.5f);
        MaterialButton materialButton5 = this.b0;
        if (materialButton5 == null) {
            rf1.W("btnOpenApp");
            throw null;
        }
        materialButton5.setAlpha(materialButton5.isEnabled() ? 1.0f : 0.5f);
        MaterialButton materialButton6 = this.a0;
        if (materialButton6 != null) {
            materialButton6.setAlpha(materialButton6.isEnabled() ? 1.0f : 0.5f);
        } else {
            rf1.W("btnUninstall");
            throw null;
        }
    }

    public final void C() {
        mi miVar = this.G;
        if (miVar == null) {
            return;
        }
        String str = "Visitar " + miVar.b + " en https://www.apklis.cu/application/" + this.F;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        startActivity(Intent.createChooser(intent, getString(R.string.share_app)));
    }

    public final void D(String str) {
        kx1 kx1Var = new kx1(this, 0);
        String string = getString(R.string.login_required_title);
        f6 f6Var = (f6) kx1Var.g;
        f6Var.d = string;
        f6Var.f = str;
        String string2 = getString(R.string.login);
        cm cmVar = new cm(this, 0);
        f6Var.g = string2;
        f6Var.h = cmVar;
        f6Var.i = getString(R.string.cancel);
        f6Var.j = null;
        kx1Var.m().show();
    }

    public final void G() {
        Object obj;
        String str = this.F;
        if (str == null) {
            return;
        }
        ConcurrentHashMap.KeySetView keySetView = ApkDownloadService.u;
        int i = 0;
        boolean z = str.length() > 0 && ApkDownloadService.u.contains(str);
        ArrayList arrayListP = q41.p();
        int size = arrayListP.size();
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            } else {
                obj = arrayListP.get(i2);
                i2++;
            }
        } while (!((di) obj).a.equals(str));
        di diVar = (di) obj;
        int i3 = diVar != null ? diVar.d : 0;
        boolean z2 = diVar != null && diVar.e;
        boolean z3 = (z == this.M && i3 == this.N) ? false : true;
        this.M = z && !z2;
        if (z && !z2) {
            i = i3;
        }
        this.N = i;
        if (z3) {
            A();
        }
    }

    public final void H() {
        List list = this.E0;
        if (list == null) {
            rf1.W("starViews");
            throw null;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                me1.i0();
                throw null;
            }
            ((ImageView) obj).setImageResource(i < this.I ? R.drawable.ic_star_filled : R.drawable.ic_star_outline);
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vi, defpackage.y50, defpackage.x50, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List<String> pathSegments;
        un0.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_app_detail);
        View viewFindViewById = findViewById(R.id.swipeRefresh);
        final int i = 3;
        c cVar = new c(i);
        WeakHashMap weakHashMap = nw3.a;
        fw3.k(viewFindViewById, cVar);
        Application application = getApplication();
        application.getClass();
        AppApplication appApplication = (AppApplication) application;
        y21 y21Var = appApplication.l;
        if (y21Var == null) {
            rf1.W("getAppDetailUseCase");
            throw null;
        }
        this.E = new om(y21Var, appApplication.a());
        View viewFindViewById2 = findViewById(R.id.ivAppIcon);
        viewFindViewById2.getClass();
        this.R = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tvAppName);
        viewFindViewById3.getClass();
        this.S = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tvDeveloper);
        viewFindViewById4.getClass();
        this.T = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tvDownloads);
        viewFindViewById5.getClass();
        this.U = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.tvSales);
        viewFindViewById6.getClass();
        this.V = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.layoutSales);
        viewFindViewById7.getClass();
        this.W = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.tvLastUpdate);
        viewFindViewById8.getClass();
        this.X = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.btnDownload);
        viewFindViewById9.getClass();
        this.Y = (MaterialButton) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.layoutInstalledActions);
        viewFindViewById10.getClass();
        this.Z = (LinearLayout) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.btnUninstall);
        viewFindViewById11.getClass();
        this.a0 = (MaterialButton) viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.btnOpenApp);
        viewFindViewById12.getClass();
        this.b0 = (MaterialButton) viewFindViewById12;
        View viewFindViewById13 = findViewById(R.id.sectionScreenshots);
        viewFindViewById13.getClass();
        this.c0 = viewFindViewById13;
        View viewFindViewById14 = findViewById(R.id.rvScreenshots);
        viewFindViewById14.getClass();
        this.d0 = (RecyclerView) viewFindViewById14;
        View viewFindViewById15 = findViewById(R.id.tvDescription);
        viewFindViewById15.getClass();
        this.e0 = (TextView) viewFindViewById15;
        View viewFindViewById16 = findViewById(R.id.viewDescFade);
        viewFindViewById16.getClass();
        this.f0 = viewFindViewById16;
        View viewFindViewById17 = findViewById(R.id.rowExpandDesc);
        viewFindViewById17.getClass();
        this.g0 = viewFindViewById17;
        View viewFindViewById18 = findViewById(R.id.btnExpandDesc);
        viewFindViewById18.getClass();
        this.h0 = (ImageView) viewFindViewById18;
        View viewFindViewById19 = findViewById(R.id.tvVersion);
        viewFindViewById19.getClass();
        this.i0 = (TextView) viewFindViewById19;
        View viewFindViewById20 = findViewById(R.id.tvSize);
        viewFindViewById20.getClass();
        this.j0 = (TextView) viewFindViewById20;
        View viewFindViewById21 = findViewById(R.id.btnExpandInfo);
        viewFindViewById21.getClass();
        this.k0 = (ImageView) viewFindViewById21;
        View viewFindViewById22 = findViewById(R.id.sectionInfoExtra);
        viewFindViewById22.getClass();
        this.l0 = viewFindViewById22;
        View viewFindViewById23 = findViewById(R.id.tvMinSdk);
        viewFindViewById23.getClass();
        this.m0 = (TextView) viewFindViewById23;
        View viewFindViewById24 = findViewById(R.id.tvArchitecture);
        viewFindViewById24.getClass();
        this.n0 = (TextView) viewFindViewById24;
        View viewFindViewById25 = findViewById(R.id.tvChangelog);
        viewFindViewById25.getClass();
        this.o0 = (TextView) viewFindViewById25;
        View viewFindViewById26 = findViewById(R.id.tvPermissions);
        viewFindViewById26.getClass();
        this.p0 = (TextView) viewFindViewById26;
        View viewFindViewById27 = findViewById(R.id.tvRating);
        viewFindViewById27.getClass();
        this.q0 = (TextView) viewFindViewById27;
        View viewFindViewById28 = findViewById(R.id.ratingBar);
        viewFindViewById28.getClass();
        this.r0 = (RatingBar) viewFindViewById28;
        View viewFindViewById29 = findViewById(R.id.tvReviewCount);
        viewFindViewById29.getClass();
        this.s0 = (TextView) viewFindViewById29;
        View viewFindViewById30 = findViewById(R.id.pbStar5);
        viewFindViewById30.getClass();
        this.t0 = (ProgressBar) viewFindViewById30;
        View viewFindViewById31 = findViewById(R.id.pbStar4);
        viewFindViewById31.getClass();
        this.u0 = (ProgressBar) viewFindViewById31;
        View viewFindViewById32 = findViewById(R.id.pbStar3);
        viewFindViewById32.getClass();
        this.v0 = (ProgressBar) viewFindViewById32;
        View viewFindViewById33 = findViewById(R.id.pbStar2);
        viewFindViewById33.getClass();
        this.w0 = (ProgressBar) viewFindViewById33;
        View viewFindViewById34 = findViewById(R.id.pbStar1);
        viewFindViewById34.getClass();
        this.x0 = (ProgressBar) viewFindViewById34;
        View viewFindViewById35 = findViewById(R.id.progressBarReviews);
        viewFindViewById35.getClass();
        this.y0 = (ProgressBar) viewFindViewById35;
        View viewFindViewById36 = findViewById(R.id.rvReviews);
        viewFindViewById36.getClass();
        this.z0 = (RecyclerView) viewFindViewById36;
        View viewFindViewById37 = findViewById(R.id.btnMoreReviews);
        viewFindViewById37.getClass();
        this.A0 = (ImageView) viewFindViewById37;
        View viewFindViewById38 = findViewById(R.id.layoutMyReview);
        viewFindViewById38.getClass();
        this.B0 = (LinearLayout) viewFindViewById38;
        View viewFindViewById39 = findViewById(R.id.layoutShareOpinionRow);
        viewFindViewById39.getClass();
        this.C0 = (LinearLayout) viewFindViewById39;
        View viewFindViewById40 = findViewById(R.id.btnWriteReview);
        viewFindViewById40.getClass();
        this.D0 = (TextView) viewFindViewById40;
        final int i2 = 5;
        final int i3 = 0;
        final int i4 = 1;
        final int i5 = 2;
        final int i6 = 4;
        this.E0 = me1.X(findViewById(R.id.ivStar1), findViewById(R.id.ivStar2), findViewById(R.id.ivStar3), findViewById(R.id.ivStar4), findViewById(R.id.ivStar5));
        View viewFindViewById41 = findViewById(R.id.ivMyReviewAvatar);
        viewFindViewById41.getClass();
        this.F0 = (ImageView) viewFindViewById41;
        View viewFindViewById42 = findViewById(R.id.tvMyReviewUserName);
        viewFindViewById42.getClass();
        this.G0 = (TextView) viewFindViewById42;
        View viewFindViewById43 = findViewById(R.id.rbMyReview);
        viewFindViewById43.getClass();
        this.H0 = (RatingBar) viewFindViewById43;
        View viewFindViewById44 = findViewById(R.id.tvMyReviewDate);
        viewFindViewById44.getClass();
        this.I0 = (TextView) viewFindViewById44;
        View viewFindViewById45 = findViewById(R.id.tvMyReviewComment);
        viewFindViewById45.getClass();
        this.J0 = (TextView) viewFindViewById45;
        View viewFindViewById46 = findViewById(R.id.ivMyReviewMenu);
        viewFindViewById46.getClass();
        this.K0 = (ImageView) viewFindViewById46;
        View viewFindViewById47 = findViewById(R.id.rvCategories);
        viewFindViewById47.getClass();
        this.L0 = (RecyclerView) viewFindViewById47;
        View viewFindViewById48 = findViewById(R.id.progressBar);
        viewFindViewById48.getClass();
        this.M0 = (ProgressBar) viewFindViewById48;
        View viewFindViewById49 = findViewById(R.id.swipeRefresh);
        viewFindViewById49.getClass();
        this.S0 = (SwipeRefreshLayout) viewFindViewById49;
        View viewFindViewById50 = findViewById(R.id.btnWishlist);
        viewFindViewById50.getClass();
        this.N0 = (ImageButton) viewFindViewById50;
        View viewFindViewById51 = findViewById(R.id.btnShare);
        viewFindViewById51.getClass();
        this.O0 = (ImageButton) viewFindViewById51;
        View viewFindViewById52 = findViewById(R.id.btnOverflow);
        viewFindViewById52.getClass();
        this.P0 = (ImageButton) viewFindViewById52;
        RecyclerView recyclerView = this.d0;
        if (recyclerView == null) {
            rf1.W("rvScreenshots");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
        RecyclerView recyclerView2 = this.d0;
        if (recyclerView2 == null) {
            rf1.W("rvScreenshots");
            throw null;
        }
        uy uyVar = this.U0;
        recyclerView2.setAdapter(uyVar);
        uyVar.e = new rl(this, i6);
        RecyclerView recyclerView3 = this.L0;
        if (recyclerView3 == null) {
            rf1.W("rvCategories");
            throw null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(this, 0, false));
        RecyclerView recyclerView4 = this.L0;
        if (recyclerView4 == null) {
            rf1.W("rvCategories");
            throw null;
        }
        recyclerView4.setAdapter(this.V0);
        RecyclerView recyclerView5 = this.z0;
        if (recyclerView5 == null) {
            rf1.W("rvReviews");
            throw null;
        }
        recyclerView5.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView6 = this.z0;
        if (recyclerView6 == null) {
            rf1.W("rvReviews");
            throw null;
        }
        recyclerView6.setNestedScrollingEnabled(false);
        RecyclerView recyclerView7 = this.z0;
        if (recyclerView7 == null) {
            rf1.W("rvReviews");
            throw null;
        }
        recyclerView7.setAdapter(this.W0);
        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener(this) { // from class: ql
            public final /* synthetic */ AppDetailActivity f;

            {
                this.f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Drawable drawableMutate;
                Drawable drawableMutate2;
                Drawable drawableMutate3;
                int i7 = i3;
                int i8 = R.drawable.ic_expand_more;
                AppDetailActivity appDetailActivity = this.f;
                switch (i7) {
                    case 0:
                        v11 v11Var = AppDetailActivity.b1;
                        appDetailActivity.finish();
                        return;
                    case 1:
                        v11 v11Var2 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                    case 2:
                        String str = appDetailActivity.F;
                        if (str == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))));
                        return;
                    case 3:
                        v11 v11Var3 = AppDetailActivity.b1;
                        appDetailActivity.x();
                        return;
                    case 4:
                        v11 v11Var4 = AppDetailActivity.b1;
                        appDetailActivity.C();
                        return;
                    case 5:
                        String str2 = appDetailActivity.F;
                        if (str2 == null || qb3.U(str2)) {
                            return;
                        }
                        om omVar = appDetailActivity.E;
                        if (omVar != null) {
                            omVar.e(str2);
                            return;
                        } else {
                            rf1.W("viewModel");
                            throw null;
                        }
                    case 6:
                        ImageButton imageButton = appDetailActivity.P0;
                        if (imageButton == null) {
                            rf1.W("btnOverflow");
                            throw null;
                        }
                        wk2 wk2Var = new wk2(appDetailActivity, imageButton);
                        dd3 dd3Var = new dd3(appDetailActivity);
                        dz1 dz1Var = wk2Var.a;
                        dd3Var.inflate(R.menu.menu_app_detail_overflow, dz1Var);
                        try {
                            Field declaredField = wk2.class.getDeclaredField("mPopup");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(wk2Var);
                            if (obj != null) {
                                obj.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, Boolean.TRUE);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Drawable icon = dz1Var.findItem(R.id.action_report).getIcon();
                        if (icon != null && (drawableMutate3 = icon.mutate()) != null) {
                            drawableMutate3.setTint(appDetailActivity.getColor(R.color.toolbar_icon_flag));
                        }
                        MenuItem menuItemFindItem = dz1Var.findItem(R.id.action_wishlist);
                        ImageButton imageButton2 = appDetailActivity.N0;
                        if (imageButton2 == null) {
                            rf1.W("btnWishlist");
                            throw null;
                        }
                        if (imageButton2.isSelected()) {
                            menuItemFindItem.setTitle(appDetailActivity.getString(R.string.remove_from_wishlist));
                        }
                        Drawable icon2 = menuItemFindItem.getIcon();
                        if (icon2 != null && (drawableMutate2 = icon2.mutate()) != null) {
                            ImageButton imageButton3 = appDetailActivity.N0;
                            if (imageButton3 == null) {
                                rf1.W("btnWishlist");
                                throw null;
                            }
                            drawableMutate2.setTint(appDetailActivity.getColor(imageButton3.isSelected() ? R.color.toolbar_icon_active : R.color.toolbar_icon_default));
                        }
                        Drawable icon3 = dz1Var.findItem(R.id.action_share).getIcon();
                        if (icon3 != null && (drawableMutate = icon3.mutate()) != null) {
                            drawableMutate.setTint(appDetailActivity.getColor(R.color.toolbar_icon_default));
                        }
                        wk2Var.c = new rl(appDetailActivity, 2);
                        tz1 tz1Var = wk2Var.b;
                        if (tz1Var.b()) {
                            return;
                        }
                        if (tz1Var.e != null) {
                            tz1Var.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 7:
                        appDetailActivity.I = 0;
                        appDetailActivity.H();
                        AppDetailActivity.E(appDetailActivity, null, 0.0f, 3);
                        return;
                    case 8:
                        String str3 = appDetailActivity.F;
                        if (str3 == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent(appDetailActivity, (Class<?>) AppNavigation.class).putExtra("nav3_route", new xu2(str3)));
                        return;
                    case 9:
                        v11 v11Var5 = AppDetailActivity.b1;
                        view.getClass();
                        wk2 wk2Var2 = new wk2(appDetailActivity, view);
                        String string = appDetailActivity.getString(R.string.edit);
                        dz1 dz1Var2 = wk2Var2.a;
                        dz1Var2.a(0, 1, 0, string);
                        dz1Var2.a(0, 2, 1, appDetailActivity.getString(R.string.delete_action));
                        wk2Var2.c = new rl(appDetailActivity, 3);
                        tz1 tz1Var2 = wk2Var2.b;
                        if (tz1Var2.b()) {
                            return;
                        }
                        if (tz1Var2.e != null) {
                            tz1Var2.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 10:
                        boolean z = appDetailActivity.X0;
                        appDetailActivity.X0 = !z;
                        TextView textView = appDetailActivity.e0;
                        if (textView == null) {
                            rf1.W("tvDescription");
                            throw null;
                        }
                        textView.setMaxLines(z ? 3 : Integer.MAX_VALUE);
                        ImageView imageView = appDetailActivity.h0;
                        if (imageView == null) {
                            rf1.W("btnExpandDesc");
                            throw null;
                        }
                        if (appDetailActivity.X0) {
                            i8 = R.drawable.ic_expand_less;
                        }
                        imageView.setImageResource(i8);
                        View view2 = appDetailActivity.f0;
                        if (view2 != null) {
                            view2.setVisibility(appDetailActivity.X0 ? 8 : 0);
                            return;
                        } else {
                            rf1.W("viewDescFade");
                            throw null;
                        }
                    case 11:
                        boolean z2 = appDetailActivity.Y0;
                        appDetailActivity.Y0 = !z2;
                        View view3 = appDetailActivity.l0;
                        if (view3 == null) {
                            rf1.W("sectionInfoExtra");
                            throw null;
                        }
                        view3.setVisibility(z2 ? 8 : 0);
                        ImageView imageView2 = appDetailActivity.k0;
                        if (imageView2 == null) {
                            rf1.W("btnExpandInfo");
                            throw null;
                        }
                        if (appDetailActivity.Y0) {
                            i8 = R.drawable.ic_expand_less;
                        }
                        imageView2.setImageResource(i8);
                        return;
                    default:
                        v11 v11Var6 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                }
            }
        });
        findViewById(R.id.btnFlag).setOnClickListener(new View.OnClickListener(this) { // from class: ql
            public final /* synthetic */ AppDetailActivity f;

            {
                this.f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Drawable drawableMutate;
                Drawable drawableMutate2;
                Drawable drawableMutate3;
                int i7 = i2;
                int i8 = R.drawable.ic_expand_more;
                AppDetailActivity appDetailActivity = this.f;
                switch (i7) {
                    case 0:
                        v11 v11Var = AppDetailActivity.b1;
                        appDetailActivity.finish();
                        return;
                    case 1:
                        v11 v11Var2 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                    case 2:
                        String str = appDetailActivity.F;
                        if (str == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))));
                        return;
                    case 3:
                        v11 v11Var3 = AppDetailActivity.b1;
                        appDetailActivity.x();
                        return;
                    case 4:
                        v11 v11Var4 = AppDetailActivity.b1;
                        appDetailActivity.C();
                        return;
                    case 5:
                        String str2 = appDetailActivity.F;
                        if (str2 == null || qb3.U(str2)) {
                            return;
                        }
                        om omVar = appDetailActivity.E;
                        if (omVar != null) {
                            omVar.e(str2);
                            return;
                        } else {
                            rf1.W("viewModel");
                            throw null;
                        }
                    case 6:
                        ImageButton imageButton = appDetailActivity.P0;
                        if (imageButton == null) {
                            rf1.W("btnOverflow");
                            throw null;
                        }
                        wk2 wk2Var = new wk2(appDetailActivity, imageButton);
                        dd3 dd3Var = new dd3(appDetailActivity);
                        dz1 dz1Var = wk2Var.a;
                        dd3Var.inflate(R.menu.menu_app_detail_overflow, dz1Var);
                        try {
                            Field declaredField = wk2.class.getDeclaredField("mPopup");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(wk2Var);
                            if (obj != null) {
                                obj.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, Boolean.TRUE);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Drawable icon = dz1Var.findItem(R.id.action_report).getIcon();
                        if (icon != null && (drawableMutate3 = icon.mutate()) != null) {
                            drawableMutate3.setTint(appDetailActivity.getColor(R.color.toolbar_icon_flag));
                        }
                        MenuItem menuItemFindItem = dz1Var.findItem(R.id.action_wishlist);
                        ImageButton imageButton2 = appDetailActivity.N0;
                        if (imageButton2 == null) {
                            rf1.W("btnWishlist");
                            throw null;
                        }
                        if (imageButton2.isSelected()) {
                            menuItemFindItem.setTitle(appDetailActivity.getString(R.string.remove_from_wishlist));
                        }
                        Drawable icon2 = menuItemFindItem.getIcon();
                        if (icon2 != null && (drawableMutate2 = icon2.mutate()) != null) {
                            ImageButton imageButton3 = appDetailActivity.N0;
                            if (imageButton3 == null) {
                                rf1.W("btnWishlist");
                                throw null;
                            }
                            drawableMutate2.setTint(appDetailActivity.getColor(imageButton3.isSelected() ? R.color.toolbar_icon_active : R.color.toolbar_icon_default));
                        }
                        Drawable icon3 = dz1Var.findItem(R.id.action_share).getIcon();
                        if (icon3 != null && (drawableMutate = icon3.mutate()) != null) {
                            drawableMutate.setTint(appDetailActivity.getColor(R.color.toolbar_icon_default));
                        }
                        wk2Var.c = new rl(appDetailActivity, 2);
                        tz1 tz1Var = wk2Var.b;
                        if (tz1Var.b()) {
                            return;
                        }
                        if (tz1Var.e != null) {
                            tz1Var.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 7:
                        appDetailActivity.I = 0;
                        appDetailActivity.H();
                        AppDetailActivity.E(appDetailActivity, null, 0.0f, 3);
                        return;
                    case 8:
                        String str3 = appDetailActivity.F;
                        if (str3 == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent(appDetailActivity, (Class<?>) AppNavigation.class).putExtra("nav3_route", new xu2(str3)));
                        return;
                    case 9:
                        v11 v11Var5 = AppDetailActivity.b1;
                        view.getClass();
                        wk2 wk2Var2 = new wk2(appDetailActivity, view);
                        String string = appDetailActivity.getString(R.string.edit);
                        dz1 dz1Var2 = wk2Var2.a;
                        dz1Var2.a(0, 1, 0, string);
                        dz1Var2.a(0, 2, 1, appDetailActivity.getString(R.string.delete_action));
                        wk2Var2.c = new rl(appDetailActivity, 3);
                        tz1 tz1Var2 = wk2Var2.b;
                        if (tz1Var2.b()) {
                            return;
                        }
                        if (tz1Var2.e != null) {
                            tz1Var2.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 10:
                        boolean z = appDetailActivity.X0;
                        appDetailActivity.X0 = !z;
                        TextView textView = appDetailActivity.e0;
                        if (textView == null) {
                            rf1.W("tvDescription");
                            throw null;
                        }
                        textView.setMaxLines(z ? 3 : Integer.MAX_VALUE);
                        ImageView imageView = appDetailActivity.h0;
                        if (imageView == null) {
                            rf1.W("btnExpandDesc");
                            throw null;
                        }
                        if (appDetailActivity.X0) {
                            i8 = R.drawable.ic_expand_less;
                        }
                        imageView.setImageResource(i8);
                        View view2 = appDetailActivity.f0;
                        if (view2 != null) {
                            view2.setVisibility(appDetailActivity.X0 ? 8 : 0);
                            return;
                        } else {
                            rf1.W("viewDescFade");
                            throw null;
                        }
                    case 11:
                        boolean z2 = appDetailActivity.Y0;
                        appDetailActivity.Y0 = !z2;
                        View view3 = appDetailActivity.l0;
                        if (view3 == null) {
                            rf1.W("sectionInfoExtra");
                            throw null;
                        }
                        view3.setVisibility(z2 ? 8 : 0);
                        ImageView imageView2 = appDetailActivity.k0;
                        if (imageView2 == null) {
                            rf1.W("btnExpandInfo");
                            throw null;
                        }
                        if (appDetailActivity.Y0) {
                            i8 = R.drawable.ic_expand_less;
                        }
                        imageView2.setImageResource(i8);
                        return;
                    default:
                        v11 v11Var6 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                }
            }
        });
        ImageButton imageButton = this.P0;
        if (imageButton == null) {
            rf1.W("btnOverflow");
            throw null;
        }
        final int i7 = 6;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: ql
            public final /* synthetic */ AppDetailActivity f;

            {
                this.f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Drawable drawableMutate;
                Drawable drawableMutate2;
                Drawable drawableMutate3;
                int i8 = i7;
                int i9 = R.drawable.ic_expand_more;
                AppDetailActivity appDetailActivity = this.f;
                switch (i8) {
                    case 0:
                        v11 v11Var = AppDetailActivity.b1;
                        appDetailActivity.finish();
                        return;
                    case 1:
                        v11 v11Var2 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                    case 2:
                        String str = appDetailActivity.F;
                        if (str == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))));
                        return;
                    case 3:
                        v11 v11Var3 = AppDetailActivity.b1;
                        appDetailActivity.x();
                        return;
                    case 4:
                        v11 v11Var4 = AppDetailActivity.b1;
                        appDetailActivity.C();
                        return;
                    case 5:
                        String str2 = appDetailActivity.F;
                        if (str2 == null || qb3.U(str2)) {
                            return;
                        }
                        om omVar = appDetailActivity.E;
                        if (omVar != null) {
                            omVar.e(str2);
                            return;
                        } else {
                            rf1.W("viewModel");
                            throw null;
                        }
                    case 6:
                        ImageButton imageButton2 = appDetailActivity.P0;
                        if (imageButton2 == null) {
                            rf1.W("btnOverflow");
                            throw null;
                        }
                        wk2 wk2Var = new wk2(appDetailActivity, imageButton2);
                        dd3 dd3Var = new dd3(appDetailActivity);
                        dz1 dz1Var = wk2Var.a;
                        dd3Var.inflate(R.menu.menu_app_detail_overflow, dz1Var);
                        try {
                            Field declaredField = wk2.class.getDeclaredField("mPopup");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(wk2Var);
                            if (obj != null) {
                                obj.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, Boolean.TRUE);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Drawable icon = dz1Var.findItem(R.id.action_report).getIcon();
                        if (icon != null && (drawableMutate3 = icon.mutate()) != null) {
                            drawableMutate3.setTint(appDetailActivity.getColor(R.color.toolbar_icon_flag));
                        }
                        MenuItem menuItemFindItem = dz1Var.findItem(R.id.action_wishlist);
                        ImageButton imageButton3 = appDetailActivity.N0;
                        if (imageButton3 == null) {
                            rf1.W("btnWishlist");
                            throw null;
                        }
                        if (imageButton3.isSelected()) {
                            menuItemFindItem.setTitle(appDetailActivity.getString(R.string.remove_from_wishlist));
                        }
                        Drawable icon2 = menuItemFindItem.getIcon();
                        if (icon2 != null && (drawableMutate2 = icon2.mutate()) != null) {
                            ImageButton imageButton4 = appDetailActivity.N0;
                            if (imageButton4 == null) {
                                rf1.W("btnWishlist");
                                throw null;
                            }
                            drawableMutate2.setTint(appDetailActivity.getColor(imageButton4.isSelected() ? R.color.toolbar_icon_active : R.color.toolbar_icon_default));
                        }
                        Drawable icon3 = dz1Var.findItem(R.id.action_share).getIcon();
                        if (icon3 != null && (drawableMutate = icon3.mutate()) != null) {
                            drawableMutate.setTint(appDetailActivity.getColor(R.color.toolbar_icon_default));
                        }
                        wk2Var.c = new rl(appDetailActivity, 2);
                        tz1 tz1Var = wk2Var.b;
                        if (tz1Var.b()) {
                            return;
                        }
                        if (tz1Var.e != null) {
                            tz1Var.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 7:
                        appDetailActivity.I = 0;
                        appDetailActivity.H();
                        AppDetailActivity.E(appDetailActivity, null, 0.0f, 3);
                        return;
                    case 8:
                        String str3 = appDetailActivity.F;
                        if (str3 == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent(appDetailActivity, (Class<?>) AppNavigation.class).putExtra("nav3_route", new xu2(str3)));
                        return;
                    case 9:
                        v11 v11Var5 = AppDetailActivity.b1;
                        view.getClass();
                        wk2 wk2Var2 = new wk2(appDetailActivity, view);
                        String string = appDetailActivity.getString(R.string.edit);
                        dz1 dz1Var2 = wk2Var2.a;
                        dz1Var2.a(0, 1, 0, string);
                        dz1Var2.a(0, 2, 1, appDetailActivity.getString(R.string.delete_action));
                        wk2Var2.c = new rl(appDetailActivity, 3);
                        tz1 tz1Var2 = wk2Var2.b;
                        if (tz1Var2.b()) {
                            return;
                        }
                        if (tz1Var2.e != null) {
                            tz1Var2.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 10:
                        boolean z = appDetailActivity.X0;
                        appDetailActivity.X0 = !z;
                        TextView textView = appDetailActivity.e0;
                        if (textView == null) {
                            rf1.W("tvDescription");
                            throw null;
                        }
                        textView.setMaxLines(z ? 3 : Integer.MAX_VALUE);
                        ImageView imageView = appDetailActivity.h0;
                        if (imageView == null) {
                            rf1.W("btnExpandDesc");
                            throw null;
                        }
                        if (appDetailActivity.X0) {
                            i9 = R.drawable.ic_expand_less;
                        }
                        imageView.setImageResource(i9);
                        View view2 = appDetailActivity.f0;
                        if (view2 != null) {
                            view2.setVisibility(appDetailActivity.X0 ? 8 : 0);
                            return;
                        } else {
                            rf1.W("viewDescFade");
                            throw null;
                        }
                    case 11:
                        boolean z2 = appDetailActivity.Y0;
                        appDetailActivity.Y0 = !z2;
                        View view3 = appDetailActivity.l0;
                        if (view3 == null) {
                            rf1.W("sectionInfoExtra");
                            throw null;
                        }
                        view3.setVisibility(z2 ? 8 : 0);
                        ImageView imageView2 = appDetailActivity.k0;
                        if (imageView2 == null) {
                            rf1.W("btnExpandInfo");
                            throw null;
                        }
                        if (appDetailActivity.Y0) {
                            i9 = R.drawable.ic_expand_less;
                        }
                        imageView2.setImageResource(i9);
                        return;
                    default:
                        v11 v11Var6 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                }
            }
        });
        TextView textView = this.D0;
        if (textView == null) {
            rf1.W("btnWriteReview");
            throw null;
        }
        final int i8 = 7;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: ql
            public final /* synthetic */ AppDetailActivity f;

            {
                this.f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Drawable drawableMutate;
                Drawable drawableMutate2;
                Drawable drawableMutate3;
                int i9 = i8;
                int i10 = R.drawable.ic_expand_more;
                AppDetailActivity appDetailActivity = this.f;
                switch (i9) {
                    case 0:
                        v11 v11Var = AppDetailActivity.b1;
                        appDetailActivity.finish();
                        return;
                    case 1:
                        v11 v11Var2 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                    case 2:
                        String str = appDetailActivity.F;
                        if (str == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))));
                        return;
                    case 3:
                        v11 v11Var3 = AppDetailActivity.b1;
                        appDetailActivity.x();
                        return;
                    case 4:
                        v11 v11Var4 = AppDetailActivity.b1;
                        appDetailActivity.C();
                        return;
                    case 5:
                        String str2 = appDetailActivity.F;
                        if (str2 == null || qb3.U(str2)) {
                            return;
                        }
                        om omVar = appDetailActivity.E;
                        if (omVar != null) {
                            omVar.e(str2);
                            return;
                        } else {
                            rf1.W("viewModel");
                            throw null;
                        }
                    case 6:
                        ImageButton imageButton2 = appDetailActivity.P0;
                        if (imageButton2 == null) {
                            rf1.W("btnOverflow");
                            throw null;
                        }
                        wk2 wk2Var = new wk2(appDetailActivity, imageButton2);
                        dd3 dd3Var = new dd3(appDetailActivity);
                        dz1 dz1Var = wk2Var.a;
                        dd3Var.inflate(R.menu.menu_app_detail_overflow, dz1Var);
                        try {
                            Field declaredField = wk2.class.getDeclaredField("mPopup");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(wk2Var);
                            if (obj != null) {
                                obj.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, Boolean.TRUE);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Drawable icon = dz1Var.findItem(R.id.action_report).getIcon();
                        if (icon != null && (drawableMutate3 = icon.mutate()) != null) {
                            drawableMutate3.setTint(appDetailActivity.getColor(R.color.toolbar_icon_flag));
                        }
                        MenuItem menuItemFindItem = dz1Var.findItem(R.id.action_wishlist);
                        ImageButton imageButton3 = appDetailActivity.N0;
                        if (imageButton3 == null) {
                            rf1.W("btnWishlist");
                            throw null;
                        }
                        if (imageButton3.isSelected()) {
                            menuItemFindItem.setTitle(appDetailActivity.getString(R.string.remove_from_wishlist));
                        }
                        Drawable icon2 = menuItemFindItem.getIcon();
                        if (icon2 != null && (drawableMutate2 = icon2.mutate()) != null) {
                            ImageButton imageButton4 = appDetailActivity.N0;
                            if (imageButton4 == null) {
                                rf1.W("btnWishlist");
                                throw null;
                            }
                            drawableMutate2.setTint(appDetailActivity.getColor(imageButton4.isSelected() ? R.color.toolbar_icon_active : R.color.toolbar_icon_default));
                        }
                        Drawable icon3 = dz1Var.findItem(R.id.action_share).getIcon();
                        if (icon3 != null && (drawableMutate = icon3.mutate()) != null) {
                            drawableMutate.setTint(appDetailActivity.getColor(R.color.toolbar_icon_default));
                        }
                        wk2Var.c = new rl(appDetailActivity, 2);
                        tz1 tz1Var = wk2Var.b;
                        if (tz1Var.b()) {
                            return;
                        }
                        if (tz1Var.e != null) {
                            tz1Var.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 7:
                        appDetailActivity.I = 0;
                        appDetailActivity.H();
                        AppDetailActivity.E(appDetailActivity, null, 0.0f, 3);
                        return;
                    case 8:
                        String str3 = appDetailActivity.F;
                        if (str3 == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent(appDetailActivity, (Class<?>) AppNavigation.class).putExtra("nav3_route", new xu2(str3)));
                        return;
                    case 9:
                        v11 v11Var5 = AppDetailActivity.b1;
                        view.getClass();
                        wk2 wk2Var2 = new wk2(appDetailActivity, view);
                        String string = appDetailActivity.getString(R.string.edit);
                        dz1 dz1Var2 = wk2Var2.a;
                        dz1Var2.a(0, 1, 0, string);
                        dz1Var2.a(0, 2, 1, appDetailActivity.getString(R.string.delete_action));
                        wk2Var2.c = new rl(appDetailActivity, 3);
                        tz1 tz1Var2 = wk2Var2.b;
                        if (tz1Var2.b()) {
                            return;
                        }
                        if (tz1Var2.e != null) {
                            tz1Var2.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 10:
                        boolean z = appDetailActivity.X0;
                        appDetailActivity.X0 = !z;
                        TextView textView2 = appDetailActivity.e0;
                        if (textView2 == null) {
                            rf1.W("tvDescription");
                            throw null;
                        }
                        textView2.setMaxLines(z ? 3 : Integer.MAX_VALUE);
                        ImageView imageView = appDetailActivity.h0;
                        if (imageView == null) {
                            rf1.W("btnExpandDesc");
                            throw null;
                        }
                        if (appDetailActivity.X0) {
                            i10 = R.drawable.ic_expand_less;
                        }
                        imageView.setImageResource(i10);
                        View view2 = appDetailActivity.f0;
                        if (view2 != null) {
                            view2.setVisibility(appDetailActivity.X0 ? 8 : 0);
                            return;
                        } else {
                            rf1.W("viewDescFade");
                            throw null;
                        }
                    case 11:
                        boolean z2 = appDetailActivity.Y0;
                        appDetailActivity.Y0 = !z2;
                        View view3 = appDetailActivity.l0;
                        if (view3 == null) {
                            rf1.W("sectionInfoExtra");
                            throw null;
                        }
                        view3.setVisibility(z2 ? 8 : 0);
                        ImageView imageView2 = appDetailActivity.k0;
                        if (imageView2 == null) {
                            rf1.W("btnExpandInfo");
                            throw null;
                        }
                        if (appDetailActivity.Y0) {
                            i10 = R.drawable.ic_expand_less;
                        }
                        imageView2.setImageResource(i10);
                        return;
                    default:
                        v11 v11Var6 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                }
            }
        });
        List list = this.E0;
        if (list == null) {
            rf1.W("starViews");
            throw null;
        }
        int i9 = 0;
        for (Object obj : list) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                me1.i0();
                throw null;
            }
            ((ImageView) obj).setOnClickListener(new sl(i9, i3, this));
            i9 = i10;
        }
        ImageView imageView = this.A0;
        if (imageView == null) {
            rf1.W("btnMoreReviews");
            throw null;
        }
        final int i11 = 8;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ql
            public final /* synthetic */ AppDetailActivity f;

            {
                this.f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Drawable drawableMutate;
                Drawable drawableMutate2;
                Drawable drawableMutate3;
                int i12 = i11;
                int i13 = R.drawable.ic_expand_more;
                AppDetailActivity appDetailActivity = this.f;
                switch (i12) {
                    case 0:
                        v11 v11Var = AppDetailActivity.b1;
                        appDetailActivity.finish();
                        return;
                    case 1:
                        v11 v11Var2 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                    case 2:
                        String str = appDetailActivity.F;
                        if (str == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))));
                        return;
                    case 3:
                        v11 v11Var3 = AppDetailActivity.b1;
                        appDetailActivity.x();
                        return;
                    case 4:
                        v11 v11Var4 = AppDetailActivity.b1;
                        appDetailActivity.C();
                        return;
                    case 5:
                        String str2 = appDetailActivity.F;
                        if (str2 == null || qb3.U(str2)) {
                            return;
                        }
                        om omVar = appDetailActivity.E;
                        if (omVar != null) {
                            omVar.e(str2);
                            return;
                        } else {
                            rf1.W("viewModel");
                            throw null;
                        }
                    case 6:
                        ImageButton imageButton2 = appDetailActivity.P0;
                        if (imageButton2 == null) {
                            rf1.W("btnOverflow");
                            throw null;
                        }
                        wk2 wk2Var = new wk2(appDetailActivity, imageButton2);
                        dd3 dd3Var = new dd3(appDetailActivity);
                        dz1 dz1Var = wk2Var.a;
                        dd3Var.inflate(R.menu.menu_app_detail_overflow, dz1Var);
                        try {
                            Field declaredField = wk2.class.getDeclaredField("mPopup");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(wk2Var);
                            if (obj2 != null) {
                                obj2.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj2, Boolean.TRUE);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Drawable icon = dz1Var.findItem(R.id.action_report).getIcon();
                        if (icon != null && (drawableMutate3 = icon.mutate()) != null) {
                            drawableMutate3.setTint(appDetailActivity.getColor(R.color.toolbar_icon_flag));
                        }
                        MenuItem menuItemFindItem = dz1Var.findItem(R.id.action_wishlist);
                        ImageButton imageButton3 = appDetailActivity.N0;
                        if (imageButton3 == null) {
                            rf1.W("btnWishlist");
                            throw null;
                        }
                        if (imageButton3.isSelected()) {
                            menuItemFindItem.setTitle(appDetailActivity.getString(R.string.remove_from_wishlist));
                        }
                        Drawable icon2 = menuItemFindItem.getIcon();
                        if (icon2 != null && (drawableMutate2 = icon2.mutate()) != null) {
                            ImageButton imageButton4 = appDetailActivity.N0;
                            if (imageButton4 == null) {
                                rf1.W("btnWishlist");
                                throw null;
                            }
                            drawableMutate2.setTint(appDetailActivity.getColor(imageButton4.isSelected() ? R.color.toolbar_icon_active : R.color.toolbar_icon_default));
                        }
                        Drawable icon3 = dz1Var.findItem(R.id.action_share).getIcon();
                        if (icon3 != null && (drawableMutate = icon3.mutate()) != null) {
                            drawableMutate.setTint(appDetailActivity.getColor(R.color.toolbar_icon_default));
                        }
                        wk2Var.c = new rl(appDetailActivity, 2);
                        tz1 tz1Var = wk2Var.b;
                        if (tz1Var.b()) {
                            return;
                        }
                        if (tz1Var.e != null) {
                            tz1Var.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 7:
                        appDetailActivity.I = 0;
                        appDetailActivity.H();
                        AppDetailActivity.E(appDetailActivity, null, 0.0f, 3);
                        return;
                    case 8:
                        String str3 = appDetailActivity.F;
                        if (str3 == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent(appDetailActivity, (Class<?>) AppNavigation.class).putExtra("nav3_route", new xu2(str3)));
                        return;
                    case 9:
                        v11 v11Var5 = AppDetailActivity.b1;
                        view.getClass();
                        wk2 wk2Var2 = new wk2(appDetailActivity, view);
                        String string = appDetailActivity.getString(R.string.edit);
                        dz1 dz1Var2 = wk2Var2.a;
                        dz1Var2.a(0, 1, 0, string);
                        dz1Var2.a(0, 2, 1, appDetailActivity.getString(R.string.delete_action));
                        wk2Var2.c = new rl(appDetailActivity, 3);
                        tz1 tz1Var2 = wk2Var2.b;
                        if (tz1Var2.b()) {
                            return;
                        }
                        if (tz1Var2.e != null) {
                            tz1Var2.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 10:
                        boolean z = appDetailActivity.X0;
                        appDetailActivity.X0 = !z;
                        TextView textView2 = appDetailActivity.e0;
                        if (textView2 == null) {
                            rf1.W("tvDescription");
                            throw null;
                        }
                        textView2.setMaxLines(z ? 3 : Integer.MAX_VALUE);
                        ImageView imageView2 = appDetailActivity.h0;
                        if (imageView2 == null) {
                            rf1.W("btnExpandDesc");
                            throw null;
                        }
                        if (appDetailActivity.X0) {
                            i13 = R.drawable.ic_expand_less;
                        }
                        imageView2.setImageResource(i13);
                        View view2 = appDetailActivity.f0;
                        if (view2 != null) {
                            view2.setVisibility(appDetailActivity.X0 ? 8 : 0);
                            return;
                        } else {
                            rf1.W("viewDescFade");
                            throw null;
                        }
                    case 11:
                        boolean z2 = appDetailActivity.Y0;
                        appDetailActivity.Y0 = !z2;
                        View view3 = appDetailActivity.l0;
                        if (view3 == null) {
                            rf1.W("sectionInfoExtra");
                            throw null;
                        }
                        view3.setVisibility(z2 ? 8 : 0);
                        ImageView imageView3 = appDetailActivity.k0;
                        if (imageView3 == null) {
                            rf1.W("btnExpandInfo");
                            throw null;
                        }
                        if (appDetailActivity.Y0) {
                            i13 = R.drawable.ic_expand_less;
                        }
                        imageView3.setImageResource(i13);
                        return;
                    default:
                        v11 v11Var6 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                }
            }
        });
        ImageView imageView2 = this.K0;
        if (imageView2 == null) {
            rf1.W("ivMyReviewMenu");
            throw null;
        }
        final int i12 = 9;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ql
            public final /* synthetic */ AppDetailActivity f;

            {
                this.f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Drawable drawableMutate;
                Drawable drawableMutate2;
                Drawable drawableMutate3;
                int i13 = i12;
                int i14 = R.drawable.ic_expand_more;
                AppDetailActivity appDetailActivity = this.f;
                switch (i13) {
                    case 0:
                        v11 v11Var = AppDetailActivity.b1;
                        appDetailActivity.finish();
                        return;
                    case 1:
                        v11 v11Var2 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                    case 2:
                        String str = appDetailActivity.F;
                        if (str == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))));
                        return;
                    case 3:
                        v11 v11Var3 = AppDetailActivity.b1;
                        appDetailActivity.x();
                        return;
                    case 4:
                        v11 v11Var4 = AppDetailActivity.b1;
                        appDetailActivity.C();
                        return;
                    case 5:
                        String str2 = appDetailActivity.F;
                        if (str2 == null || qb3.U(str2)) {
                            return;
                        }
                        om omVar = appDetailActivity.E;
                        if (omVar != null) {
                            omVar.e(str2);
                            return;
                        } else {
                            rf1.W("viewModel");
                            throw null;
                        }
                    case 6:
                        ImageButton imageButton2 = appDetailActivity.P0;
                        if (imageButton2 == null) {
                            rf1.W("btnOverflow");
                            throw null;
                        }
                        wk2 wk2Var = new wk2(appDetailActivity, imageButton2);
                        dd3 dd3Var = new dd3(appDetailActivity);
                        dz1 dz1Var = wk2Var.a;
                        dd3Var.inflate(R.menu.menu_app_detail_overflow, dz1Var);
                        try {
                            Field declaredField = wk2.class.getDeclaredField("mPopup");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(wk2Var);
                            if (obj2 != null) {
                                obj2.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj2, Boolean.TRUE);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Drawable icon = dz1Var.findItem(R.id.action_report).getIcon();
                        if (icon != null && (drawableMutate3 = icon.mutate()) != null) {
                            drawableMutate3.setTint(appDetailActivity.getColor(R.color.toolbar_icon_flag));
                        }
                        MenuItem menuItemFindItem = dz1Var.findItem(R.id.action_wishlist);
                        ImageButton imageButton3 = appDetailActivity.N0;
                        if (imageButton3 == null) {
                            rf1.W("btnWishlist");
                            throw null;
                        }
                        if (imageButton3.isSelected()) {
                            menuItemFindItem.setTitle(appDetailActivity.getString(R.string.remove_from_wishlist));
                        }
                        Drawable icon2 = menuItemFindItem.getIcon();
                        if (icon2 != null && (drawableMutate2 = icon2.mutate()) != null) {
                            ImageButton imageButton4 = appDetailActivity.N0;
                            if (imageButton4 == null) {
                                rf1.W("btnWishlist");
                                throw null;
                            }
                            drawableMutate2.setTint(appDetailActivity.getColor(imageButton4.isSelected() ? R.color.toolbar_icon_active : R.color.toolbar_icon_default));
                        }
                        Drawable icon3 = dz1Var.findItem(R.id.action_share).getIcon();
                        if (icon3 != null && (drawableMutate = icon3.mutate()) != null) {
                            drawableMutate.setTint(appDetailActivity.getColor(R.color.toolbar_icon_default));
                        }
                        wk2Var.c = new rl(appDetailActivity, 2);
                        tz1 tz1Var = wk2Var.b;
                        if (tz1Var.b()) {
                            return;
                        }
                        if (tz1Var.e != null) {
                            tz1Var.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 7:
                        appDetailActivity.I = 0;
                        appDetailActivity.H();
                        AppDetailActivity.E(appDetailActivity, null, 0.0f, 3);
                        return;
                    case 8:
                        String str3 = appDetailActivity.F;
                        if (str3 == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent(appDetailActivity, (Class<?>) AppNavigation.class).putExtra("nav3_route", new xu2(str3)));
                        return;
                    case 9:
                        v11 v11Var5 = AppDetailActivity.b1;
                        view.getClass();
                        wk2 wk2Var2 = new wk2(appDetailActivity, view);
                        String string = appDetailActivity.getString(R.string.edit);
                        dz1 dz1Var2 = wk2Var2.a;
                        dz1Var2.a(0, 1, 0, string);
                        dz1Var2.a(0, 2, 1, appDetailActivity.getString(R.string.delete_action));
                        wk2Var2.c = new rl(appDetailActivity, 3);
                        tz1 tz1Var2 = wk2Var2.b;
                        if (tz1Var2.b()) {
                            return;
                        }
                        if (tz1Var2.e != null) {
                            tz1Var2.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 10:
                        boolean z = appDetailActivity.X0;
                        appDetailActivity.X0 = !z;
                        TextView textView2 = appDetailActivity.e0;
                        if (textView2 == null) {
                            rf1.W("tvDescription");
                            throw null;
                        }
                        textView2.setMaxLines(z ? 3 : Integer.MAX_VALUE);
                        ImageView imageView3 = appDetailActivity.h0;
                        if (imageView3 == null) {
                            rf1.W("btnExpandDesc");
                            throw null;
                        }
                        if (appDetailActivity.X0) {
                            i14 = R.drawable.ic_expand_less;
                        }
                        imageView3.setImageResource(i14);
                        View view2 = appDetailActivity.f0;
                        if (view2 != null) {
                            view2.setVisibility(appDetailActivity.X0 ? 8 : 0);
                            return;
                        } else {
                            rf1.W("viewDescFade");
                            throw null;
                        }
                    case 11:
                        boolean z2 = appDetailActivity.Y0;
                        appDetailActivity.Y0 = !z2;
                        View view3 = appDetailActivity.l0;
                        if (view3 == null) {
                            rf1.W("sectionInfoExtra");
                            throw null;
                        }
                        view3.setVisibility(z2 ? 8 : 0);
                        ImageView imageView4 = appDetailActivity.k0;
                        if (imageView4 == null) {
                            rf1.W("btnExpandInfo");
                            throw null;
                        }
                        if (appDetailActivity.Y0) {
                            i14 = R.drawable.ic_expand_less;
                        }
                        imageView4.setImageResource(i14);
                        return;
                    default:
                        v11 v11Var6 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                }
            }
        });
        ImageView imageView3 = this.h0;
        if (imageView3 == null) {
            rf1.W("btnExpandDesc");
            throw null;
        }
        final int i13 = 10;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: ql
            public final /* synthetic */ AppDetailActivity f;

            {
                this.f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Drawable drawableMutate;
                Drawable drawableMutate2;
                Drawable drawableMutate3;
                int i14 = i13;
                int i15 = R.drawable.ic_expand_more;
                AppDetailActivity appDetailActivity = this.f;
                switch (i14) {
                    case 0:
                        v11 v11Var = AppDetailActivity.b1;
                        appDetailActivity.finish();
                        return;
                    case 1:
                        v11 v11Var2 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                    case 2:
                        String str = appDetailActivity.F;
                        if (str == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))));
                        return;
                    case 3:
                        v11 v11Var3 = AppDetailActivity.b1;
                        appDetailActivity.x();
                        return;
                    case 4:
                        v11 v11Var4 = AppDetailActivity.b1;
                        appDetailActivity.C();
                        return;
                    case 5:
                        String str2 = appDetailActivity.F;
                        if (str2 == null || qb3.U(str2)) {
                            return;
                        }
                        om omVar = appDetailActivity.E;
                        if (omVar != null) {
                            omVar.e(str2);
                            return;
                        } else {
                            rf1.W("viewModel");
                            throw null;
                        }
                    case 6:
                        ImageButton imageButton2 = appDetailActivity.P0;
                        if (imageButton2 == null) {
                            rf1.W("btnOverflow");
                            throw null;
                        }
                        wk2 wk2Var = new wk2(appDetailActivity, imageButton2);
                        dd3 dd3Var = new dd3(appDetailActivity);
                        dz1 dz1Var = wk2Var.a;
                        dd3Var.inflate(R.menu.menu_app_detail_overflow, dz1Var);
                        try {
                            Field declaredField = wk2.class.getDeclaredField("mPopup");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(wk2Var);
                            if (obj2 != null) {
                                obj2.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj2, Boolean.TRUE);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Drawable icon = dz1Var.findItem(R.id.action_report).getIcon();
                        if (icon != null && (drawableMutate3 = icon.mutate()) != null) {
                            drawableMutate3.setTint(appDetailActivity.getColor(R.color.toolbar_icon_flag));
                        }
                        MenuItem menuItemFindItem = dz1Var.findItem(R.id.action_wishlist);
                        ImageButton imageButton3 = appDetailActivity.N0;
                        if (imageButton3 == null) {
                            rf1.W("btnWishlist");
                            throw null;
                        }
                        if (imageButton3.isSelected()) {
                            menuItemFindItem.setTitle(appDetailActivity.getString(R.string.remove_from_wishlist));
                        }
                        Drawable icon2 = menuItemFindItem.getIcon();
                        if (icon2 != null && (drawableMutate2 = icon2.mutate()) != null) {
                            ImageButton imageButton4 = appDetailActivity.N0;
                            if (imageButton4 == null) {
                                rf1.W("btnWishlist");
                                throw null;
                            }
                            drawableMutate2.setTint(appDetailActivity.getColor(imageButton4.isSelected() ? R.color.toolbar_icon_active : R.color.toolbar_icon_default));
                        }
                        Drawable icon3 = dz1Var.findItem(R.id.action_share).getIcon();
                        if (icon3 != null && (drawableMutate = icon3.mutate()) != null) {
                            drawableMutate.setTint(appDetailActivity.getColor(R.color.toolbar_icon_default));
                        }
                        wk2Var.c = new rl(appDetailActivity, 2);
                        tz1 tz1Var = wk2Var.b;
                        if (tz1Var.b()) {
                            return;
                        }
                        if (tz1Var.e != null) {
                            tz1Var.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 7:
                        appDetailActivity.I = 0;
                        appDetailActivity.H();
                        AppDetailActivity.E(appDetailActivity, null, 0.0f, 3);
                        return;
                    case 8:
                        String str3 = appDetailActivity.F;
                        if (str3 == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent(appDetailActivity, (Class<?>) AppNavigation.class).putExtra("nav3_route", new xu2(str3)));
                        return;
                    case 9:
                        v11 v11Var5 = AppDetailActivity.b1;
                        view.getClass();
                        wk2 wk2Var2 = new wk2(appDetailActivity, view);
                        String string = appDetailActivity.getString(R.string.edit);
                        dz1 dz1Var2 = wk2Var2.a;
                        dz1Var2.a(0, 1, 0, string);
                        dz1Var2.a(0, 2, 1, appDetailActivity.getString(R.string.delete_action));
                        wk2Var2.c = new rl(appDetailActivity, 3);
                        tz1 tz1Var2 = wk2Var2.b;
                        if (tz1Var2.b()) {
                            return;
                        }
                        if (tz1Var2.e != null) {
                            tz1Var2.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 10:
                        boolean z = appDetailActivity.X0;
                        appDetailActivity.X0 = !z;
                        TextView textView2 = appDetailActivity.e0;
                        if (textView2 == null) {
                            rf1.W("tvDescription");
                            throw null;
                        }
                        textView2.setMaxLines(z ? 3 : Integer.MAX_VALUE);
                        ImageView imageView4 = appDetailActivity.h0;
                        if (imageView4 == null) {
                            rf1.W("btnExpandDesc");
                            throw null;
                        }
                        if (appDetailActivity.X0) {
                            i15 = R.drawable.ic_expand_less;
                        }
                        imageView4.setImageResource(i15);
                        View view2 = appDetailActivity.f0;
                        if (view2 != null) {
                            view2.setVisibility(appDetailActivity.X0 ? 8 : 0);
                            return;
                        } else {
                            rf1.W("viewDescFade");
                            throw null;
                        }
                    case 11:
                        boolean z2 = appDetailActivity.Y0;
                        appDetailActivity.Y0 = !z2;
                        View view3 = appDetailActivity.l0;
                        if (view3 == null) {
                            rf1.W("sectionInfoExtra");
                            throw null;
                        }
                        view3.setVisibility(z2 ? 8 : 0);
                        ImageView imageView5 = appDetailActivity.k0;
                        if (imageView5 == null) {
                            rf1.W("btnExpandInfo");
                            throw null;
                        }
                        if (appDetailActivity.Y0) {
                            i15 = R.drawable.ic_expand_less;
                        }
                        imageView5.setImageResource(i15);
                        return;
                    default:
                        v11 v11Var6 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                }
            }
        });
        ImageView imageView4 = this.k0;
        if (imageView4 == null) {
            rf1.W("btnExpandInfo");
            throw null;
        }
        final int i14 = 11;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: ql
            public final /* synthetic */ AppDetailActivity f;

            {
                this.f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Drawable drawableMutate;
                Drawable drawableMutate2;
                Drawable drawableMutate3;
                int i15 = i14;
                int i16 = R.drawable.ic_expand_more;
                AppDetailActivity appDetailActivity = this.f;
                switch (i15) {
                    case 0:
                        v11 v11Var = AppDetailActivity.b1;
                        appDetailActivity.finish();
                        return;
                    case 1:
                        v11 v11Var2 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                    case 2:
                        String str = appDetailActivity.F;
                        if (str == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))));
                        return;
                    case 3:
                        v11 v11Var3 = AppDetailActivity.b1;
                        appDetailActivity.x();
                        return;
                    case 4:
                        v11 v11Var4 = AppDetailActivity.b1;
                        appDetailActivity.C();
                        return;
                    case 5:
                        String str2 = appDetailActivity.F;
                        if (str2 == null || qb3.U(str2)) {
                            return;
                        }
                        om omVar = appDetailActivity.E;
                        if (omVar != null) {
                            omVar.e(str2);
                            return;
                        } else {
                            rf1.W("viewModel");
                            throw null;
                        }
                    case 6:
                        ImageButton imageButton2 = appDetailActivity.P0;
                        if (imageButton2 == null) {
                            rf1.W("btnOverflow");
                            throw null;
                        }
                        wk2 wk2Var = new wk2(appDetailActivity, imageButton2);
                        dd3 dd3Var = new dd3(appDetailActivity);
                        dz1 dz1Var = wk2Var.a;
                        dd3Var.inflate(R.menu.menu_app_detail_overflow, dz1Var);
                        try {
                            Field declaredField = wk2.class.getDeclaredField("mPopup");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(wk2Var);
                            if (obj2 != null) {
                                obj2.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj2, Boolean.TRUE);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Drawable icon = dz1Var.findItem(R.id.action_report).getIcon();
                        if (icon != null && (drawableMutate3 = icon.mutate()) != null) {
                            drawableMutate3.setTint(appDetailActivity.getColor(R.color.toolbar_icon_flag));
                        }
                        MenuItem menuItemFindItem = dz1Var.findItem(R.id.action_wishlist);
                        ImageButton imageButton3 = appDetailActivity.N0;
                        if (imageButton3 == null) {
                            rf1.W("btnWishlist");
                            throw null;
                        }
                        if (imageButton3.isSelected()) {
                            menuItemFindItem.setTitle(appDetailActivity.getString(R.string.remove_from_wishlist));
                        }
                        Drawable icon2 = menuItemFindItem.getIcon();
                        if (icon2 != null && (drawableMutate2 = icon2.mutate()) != null) {
                            ImageButton imageButton4 = appDetailActivity.N0;
                            if (imageButton4 == null) {
                                rf1.W("btnWishlist");
                                throw null;
                            }
                            drawableMutate2.setTint(appDetailActivity.getColor(imageButton4.isSelected() ? R.color.toolbar_icon_active : R.color.toolbar_icon_default));
                        }
                        Drawable icon3 = dz1Var.findItem(R.id.action_share).getIcon();
                        if (icon3 != null && (drawableMutate = icon3.mutate()) != null) {
                            drawableMutate.setTint(appDetailActivity.getColor(R.color.toolbar_icon_default));
                        }
                        wk2Var.c = new rl(appDetailActivity, 2);
                        tz1 tz1Var = wk2Var.b;
                        if (tz1Var.b()) {
                            return;
                        }
                        if (tz1Var.e != null) {
                            tz1Var.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 7:
                        appDetailActivity.I = 0;
                        appDetailActivity.H();
                        AppDetailActivity.E(appDetailActivity, null, 0.0f, 3);
                        return;
                    case 8:
                        String str3 = appDetailActivity.F;
                        if (str3 == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent(appDetailActivity, (Class<?>) AppNavigation.class).putExtra("nav3_route", new xu2(str3)));
                        return;
                    case 9:
                        v11 v11Var5 = AppDetailActivity.b1;
                        view.getClass();
                        wk2 wk2Var2 = new wk2(appDetailActivity, view);
                        String string = appDetailActivity.getString(R.string.edit);
                        dz1 dz1Var2 = wk2Var2.a;
                        dz1Var2.a(0, 1, 0, string);
                        dz1Var2.a(0, 2, 1, appDetailActivity.getString(R.string.delete_action));
                        wk2Var2.c = new rl(appDetailActivity, 3);
                        tz1 tz1Var2 = wk2Var2.b;
                        if (tz1Var2.b()) {
                            return;
                        }
                        if (tz1Var2.e != null) {
                            tz1Var2.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 10:
                        boolean z = appDetailActivity.X0;
                        appDetailActivity.X0 = !z;
                        TextView textView2 = appDetailActivity.e0;
                        if (textView2 == null) {
                            rf1.W("tvDescription");
                            throw null;
                        }
                        textView2.setMaxLines(z ? 3 : Integer.MAX_VALUE);
                        ImageView imageView5 = appDetailActivity.h0;
                        if (imageView5 == null) {
                            rf1.W("btnExpandDesc");
                            throw null;
                        }
                        if (appDetailActivity.X0) {
                            i16 = R.drawable.ic_expand_less;
                        }
                        imageView5.setImageResource(i16);
                        View view2 = appDetailActivity.f0;
                        if (view2 != null) {
                            view2.setVisibility(appDetailActivity.X0 ? 8 : 0);
                            return;
                        } else {
                            rf1.W("viewDescFade");
                            throw null;
                        }
                    case 11:
                        boolean z2 = appDetailActivity.Y0;
                        appDetailActivity.Y0 = !z2;
                        View view3 = appDetailActivity.l0;
                        if (view3 == null) {
                            rf1.W("sectionInfoExtra");
                            throw null;
                        }
                        view3.setVisibility(z2 ? 8 : 0);
                        ImageView imageView6 = appDetailActivity.k0;
                        if (imageView6 == null) {
                            rf1.W("btnExpandInfo");
                            throw null;
                        }
                        if (appDetailActivity.Y0) {
                            i16 = R.drawable.ic_expand_less;
                        }
                        imageView6.setImageResource(i16);
                        return;
                    default:
                        v11 v11Var6 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                }
            }
        });
        MaterialButton materialButton = this.Y;
        if (materialButton == null) {
            rf1.W("btnDownload");
            throw null;
        }
        final int i15 = 12;
        materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: ql
            public final /* synthetic */ AppDetailActivity f;

            {
                this.f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Drawable drawableMutate;
                Drawable drawableMutate2;
                Drawable drawableMutate3;
                int i16 = i15;
                int i17 = R.drawable.ic_expand_more;
                AppDetailActivity appDetailActivity = this.f;
                switch (i16) {
                    case 0:
                        v11 v11Var = AppDetailActivity.b1;
                        appDetailActivity.finish();
                        return;
                    case 1:
                        v11 v11Var2 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                    case 2:
                        String str = appDetailActivity.F;
                        if (str == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))));
                        return;
                    case 3:
                        v11 v11Var3 = AppDetailActivity.b1;
                        appDetailActivity.x();
                        return;
                    case 4:
                        v11 v11Var4 = AppDetailActivity.b1;
                        appDetailActivity.C();
                        return;
                    case 5:
                        String str2 = appDetailActivity.F;
                        if (str2 == null || qb3.U(str2)) {
                            return;
                        }
                        om omVar = appDetailActivity.E;
                        if (omVar != null) {
                            omVar.e(str2);
                            return;
                        } else {
                            rf1.W("viewModel");
                            throw null;
                        }
                    case 6:
                        ImageButton imageButton2 = appDetailActivity.P0;
                        if (imageButton2 == null) {
                            rf1.W("btnOverflow");
                            throw null;
                        }
                        wk2 wk2Var = new wk2(appDetailActivity, imageButton2);
                        dd3 dd3Var = new dd3(appDetailActivity);
                        dz1 dz1Var = wk2Var.a;
                        dd3Var.inflate(R.menu.menu_app_detail_overflow, dz1Var);
                        try {
                            Field declaredField = wk2.class.getDeclaredField("mPopup");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(wk2Var);
                            if (obj2 != null) {
                                obj2.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj2, Boolean.TRUE);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Drawable icon = dz1Var.findItem(R.id.action_report).getIcon();
                        if (icon != null && (drawableMutate3 = icon.mutate()) != null) {
                            drawableMutate3.setTint(appDetailActivity.getColor(R.color.toolbar_icon_flag));
                        }
                        MenuItem menuItemFindItem = dz1Var.findItem(R.id.action_wishlist);
                        ImageButton imageButton3 = appDetailActivity.N0;
                        if (imageButton3 == null) {
                            rf1.W("btnWishlist");
                            throw null;
                        }
                        if (imageButton3.isSelected()) {
                            menuItemFindItem.setTitle(appDetailActivity.getString(R.string.remove_from_wishlist));
                        }
                        Drawable icon2 = menuItemFindItem.getIcon();
                        if (icon2 != null && (drawableMutate2 = icon2.mutate()) != null) {
                            ImageButton imageButton4 = appDetailActivity.N0;
                            if (imageButton4 == null) {
                                rf1.W("btnWishlist");
                                throw null;
                            }
                            drawableMutate2.setTint(appDetailActivity.getColor(imageButton4.isSelected() ? R.color.toolbar_icon_active : R.color.toolbar_icon_default));
                        }
                        Drawable icon3 = dz1Var.findItem(R.id.action_share).getIcon();
                        if (icon3 != null && (drawableMutate = icon3.mutate()) != null) {
                            drawableMutate.setTint(appDetailActivity.getColor(R.color.toolbar_icon_default));
                        }
                        wk2Var.c = new rl(appDetailActivity, 2);
                        tz1 tz1Var = wk2Var.b;
                        if (tz1Var.b()) {
                            return;
                        }
                        if (tz1Var.e != null) {
                            tz1Var.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 7:
                        appDetailActivity.I = 0;
                        appDetailActivity.H();
                        AppDetailActivity.E(appDetailActivity, null, 0.0f, 3);
                        return;
                    case 8:
                        String str3 = appDetailActivity.F;
                        if (str3 == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent(appDetailActivity, (Class<?>) AppNavigation.class).putExtra("nav3_route", new xu2(str3)));
                        return;
                    case 9:
                        v11 v11Var5 = AppDetailActivity.b1;
                        view.getClass();
                        wk2 wk2Var2 = new wk2(appDetailActivity, view);
                        String string = appDetailActivity.getString(R.string.edit);
                        dz1 dz1Var2 = wk2Var2.a;
                        dz1Var2.a(0, 1, 0, string);
                        dz1Var2.a(0, 2, 1, appDetailActivity.getString(R.string.delete_action));
                        wk2Var2.c = new rl(appDetailActivity, 3);
                        tz1 tz1Var2 = wk2Var2.b;
                        if (tz1Var2.b()) {
                            return;
                        }
                        if (tz1Var2.e != null) {
                            tz1Var2.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 10:
                        boolean z = appDetailActivity.X0;
                        appDetailActivity.X0 = !z;
                        TextView textView2 = appDetailActivity.e0;
                        if (textView2 == null) {
                            rf1.W("tvDescription");
                            throw null;
                        }
                        textView2.setMaxLines(z ? 3 : Integer.MAX_VALUE);
                        ImageView imageView5 = appDetailActivity.h0;
                        if (imageView5 == null) {
                            rf1.W("btnExpandDesc");
                            throw null;
                        }
                        if (appDetailActivity.X0) {
                            i17 = R.drawable.ic_expand_less;
                        }
                        imageView5.setImageResource(i17);
                        View view2 = appDetailActivity.f0;
                        if (view2 != null) {
                            view2.setVisibility(appDetailActivity.X0 ? 8 : 0);
                            return;
                        } else {
                            rf1.W("viewDescFade");
                            throw null;
                        }
                    case 11:
                        boolean z2 = appDetailActivity.Y0;
                        appDetailActivity.Y0 = !z2;
                        View view3 = appDetailActivity.l0;
                        if (view3 == null) {
                            rf1.W("sectionInfoExtra");
                            throw null;
                        }
                        view3.setVisibility(z2 ? 8 : 0);
                        ImageView imageView6 = appDetailActivity.k0;
                        if (imageView6 == null) {
                            rf1.W("btnExpandInfo");
                            throw null;
                        }
                        if (appDetailActivity.Y0) {
                            i17 = R.drawable.ic_expand_less;
                        }
                        imageView6.setImageResource(i17);
                        return;
                    default:
                        v11 v11Var6 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                }
            }
        });
        MaterialButton materialButton2 = this.b0;
        if (materialButton2 == null) {
            rf1.W("btnOpenApp");
            throw null;
        }
        materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ql
            public final /* synthetic */ AppDetailActivity f;

            {
                this.f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Drawable drawableMutate;
                Drawable drawableMutate2;
                Drawable drawableMutate3;
                int i16 = i4;
                int i17 = R.drawable.ic_expand_more;
                AppDetailActivity appDetailActivity = this.f;
                switch (i16) {
                    case 0:
                        v11 v11Var = AppDetailActivity.b1;
                        appDetailActivity.finish();
                        return;
                    case 1:
                        v11 v11Var2 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                    case 2:
                        String str = appDetailActivity.F;
                        if (str == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))));
                        return;
                    case 3:
                        v11 v11Var3 = AppDetailActivity.b1;
                        appDetailActivity.x();
                        return;
                    case 4:
                        v11 v11Var4 = AppDetailActivity.b1;
                        appDetailActivity.C();
                        return;
                    case 5:
                        String str2 = appDetailActivity.F;
                        if (str2 == null || qb3.U(str2)) {
                            return;
                        }
                        om omVar = appDetailActivity.E;
                        if (omVar != null) {
                            omVar.e(str2);
                            return;
                        } else {
                            rf1.W("viewModel");
                            throw null;
                        }
                    case 6:
                        ImageButton imageButton2 = appDetailActivity.P0;
                        if (imageButton2 == null) {
                            rf1.W("btnOverflow");
                            throw null;
                        }
                        wk2 wk2Var = new wk2(appDetailActivity, imageButton2);
                        dd3 dd3Var = new dd3(appDetailActivity);
                        dz1 dz1Var = wk2Var.a;
                        dd3Var.inflate(R.menu.menu_app_detail_overflow, dz1Var);
                        try {
                            Field declaredField = wk2.class.getDeclaredField("mPopup");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(wk2Var);
                            if (obj2 != null) {
                                obj2.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj2, Boolean.TRUE);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Drawable icon = dz1Var.findItem(R.id.action_report).getIcon();
                        if (icon != null && (drawableMutate3 = icon.mutate()) != null) {
                            drawableMutate3.setTint(appDetailActivity.getColor(R.color.toolbar_icon_flag));
                        }
                        MenuItem menuItemFindItem = dz1Var.findItem(R.id.action_wishlist);
                        ImageButton imageButton3 = appDetailActivity.N0;
                        if (imageButton3 == null) {
                            rf1.W("btnWishlist");
                            throw null;
                        }
                        if (imageButton3.isSelected()) {
                            menuItemFindItem.setTitle(appDetailActivity.getString(R.string.remove_from_wishlist));
                        }
                        Drawable icon2 = menuItemFindItem.getIcon();
                        if (icon2 != null && (drawableMutate2 = icon2.mutate()) != null) {
                            ImageButton imageButton4 = appDetailActivity.N0;
                            if (imageButton4 == null) {
                                rf1.W("btnWishlist");
                                throw null;
                            }
                            drawableMutate2.setTint(appDetailActivity.getColor(imageButton4.isSelected() ? R.color.toolbar_icon_active : R.color.toolbar_icon_default));
                        }
                        Drawable icon3 = dz1Var.findItem(R.id.action_share).getIcon();
                        if (icon3 != null && (drawableMutate = icon3.mutate()) != null) {
                            drawableMutate.setTint(appDetailActivity.getColor(R.color.toolbar_icon_default));
                        }
                        wk2Var.c = new rl(appDetailActivity, 2);
                        tz1 tz1Var = wk2Var.b;
                        if (tz1Var.b()) {
                            return;
                        }
                        if (tz1Var.e != null) {
                            tz1Var.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 7:
                        appDetailActivity.I = 0;
                        appDetailActivity.H();
                        AppDetailActivity.E(appDetailActivity, null, 0.0f, 3);
                        return;
                    case 8:
                        String str3 = appDetailActivity.F;
                        if (str3 == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent(appDetailActivity, (Class<?>) AppNavigation.class).putExtra("nav3_route", new xu2(str3)));
                        return;
                    case 9:
                        v11 v11Var5 = AppDetailActivity.b1;
                        view.getClass();
                        wk2 wk2Var2 = new wk2(appDetailActivity, view);
                        String string = appDetailActivity.getString(R.string.edit);
                        dz1 dz1Var2 = wk2Var2.a;
                        dz1Var2.a(0, 1, 0, string);
                        dz1Var2.a(0, 2, 1, appDetailActivity.getString(R.string.delete_action));
                        wk2Var2.c = new rl(appDetailActivity, 3);
                        tz1 tz1Var2 = wk2Var2.b;
                        if (tz1Var2.b()) {
                            return;
                        }
                        if (tz1Var2.e != null) {
                            tz1Var2.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 10:
                        boolean z = appDetailActivity.X0;
                        appDetailActivity.X0 = !z;
                        TextView textView2 = appDetailActivity.e0;
                        if (textView2 == null) {
                            rf1.W("tvDescription");
                            throw null;
                        }
                        textView2.setMaxLines(z ? 3 : Integer.MAX_VALUE);
                        ImageView imageView5 = appDetailActivity.h0;
                        if (imageView5 == null) {
                            rf1.W("btnExpandDesc");
                            throw null;
                        }
                        if (appDetailActivity.X0) {
                            i17 = R.drawable.ic_expand_less;
                        }
                        imageView5.setImageResource(i17);
                        View view2 = appDetailActivity.f0;
                        if (view2 != null) {
                            view2.setVisibility(appDetailActivity.X0 ? 8 : 0);
                            return;
                        } else {
                            rf1.W("viewDescFade");
                            throw null;
                        }
                    case 11:
                        boolean z2 = appDetailActivity.Y0;
                        appDetailActivity.Y0 = !z2;
                        View view3 = appDetailActivity.l0;
                        if (view3 == null) {
                            rf1.W("sectionInfoExtra");
                            throw null;
                        }
                        view3.setVisibility(z2 ? 8 : 0);
                        ImageView imageView6 = appDetailActivity.k0;
                        if (imageView6 == null) {
                            rf1.W("btnExpandInfo");
                            throw null;
                        }
                        if (appDetailActivity.Y0) {
                            i17 = R.drawable.ic_expand_less;
                        }
                        imageView6.setImageResource(i17);
                        return;
                    default:
                        v11 v11Var6 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                }
            }
        });
        MaterialButton materialButton3 = this.a0;
        if (materialButton3 == null) {
            rf1.W("btnUninstall");
            throw null;
        }
        materialButton3.setOnClickListener(new View.OnClickListener(this) { // from class: ql
            public final /* synthetic */ AppDetailActivity f;

            {
                this.f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Drawable drawableMutate;
                Drawable drawableMutate2;
                Drawable drawableMutate3;
                int i16 = i5;
                int i17 = R.drawable.ic_expand_more;
                AppDetailActivity appDetailActivity = this.f;
                switch (i16) {
                    case 0:
                        v11 v11Var = AppDetailActivity.b1;
                        appDetailActivity.finish();
                        return;
                    case 1:
                        v11 v11Var2 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                    case 2:
                        String str = appDetailActivity.F;
                        if (str == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))));
                        return;
                    case 3:
                        v11 v11Var3 = AppDetailActivity.b1;
                        appDetailActivity.x();
                        return;
                    case 4:
                        v11 v11Var4 = AppDetailActivity.b1;
                        appDetailActivity.C();
                        return;
                    case 5:
                        String str2 = appDetailActivity.F;
                        if (str2 == null || qb3.U(str2)) {
                            return;
                        }
                        om omVar = appDetailActivity.E;
                        if (omVar != null) {
                            omVar.e(str2);
                            return;
                        } else {
                            rf1.W("viewModel");
                            throw null;
                        }
                    case 6:
                        ImageButton imageButton2 = appDetailActivity.P0;
                        if (imageButton2 == null) {
                            rf1.W("btnOverflow");
                            throw null;
                        }
                        wk2 wk2Var = new wk2(appDetailActivity, imageButton2);
                        dd3 dd3Var = new dd3(appDetailActivity);
                        dz1 dz1Var = wk2Var.a;
                        dd3Var.inflate(R.menu.menu_app_detail_overflow, dz1Var);
                        try {
                            Field declaredField = wk2.class.getDeclaredField("mPopup");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(wk2Var);
                            if (obj2 != null) {
                                obj2.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj2, Boolean.TRUE);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Drawable icon = dz1Var.findItem(R.id.action_report).getIcon();
                        if (icon != null && (drawableMutate3 = icon.mutate()) != null) {
                            drawableMutate3.setTint(appDetailActivity.getColor(R.color.toolbar_icon_flag));
                        }
                        MenuItem menuItemFindItem = dz1Var.findItem(R.id.action_wishlist);
                        ImageButton imageButton3 = appDetailActivity.N0;
                        if (imageButton3 == null) {
                            rf1.W("btnWishlist");
                            throw null;
                        }
                        if (imageButton3.isSelected()) {
                            menuItemFindItem.setTitle(appDetailActivity.getString(R.string.remove_from_wishlist));
                        }
                        Drawable icon2 = menuItemFindItem.getIcon();
                        if (icon2 != null && (drawableMutate2 = icon2.mutate()) != null) {
                            ImageButton imageButton4 = appDetailActivity.N0;
                            if (imageButton4 == null) {
                                rf1.W("btnWishlist");
                                throw null;
                            }
                            drawableMutate2.setTint(appDetailActivity.getColor(imageButton4.isSelected() ? R.color.toolbar_icon_active : R.color.toolbar_icon_default));
                        }
                        Drawable icon3 = dz1Var.findItem(R.id.action_share).getIcon();
                        if (icon3 != null && (drawableMutate = icon3.mutate()) != null) {
                            drawableMutate.setTint(appDetailActivity.getColor(R.color.toolbar_icon_default));
                        }
                        wk2Var.c = new rl(appDetailActivity, 2);
                        tz1 tz1Var = wk2Var.b;
                        if (tz1Var.b()) {
                            return;
                        }
                        if (tz1Var.e != null) {
                            tz1Var.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 7:
                        appDetailActivity.I = 0;
                        appDetailActivity.H();
                        AppDetailActivity.E(appDetailActivity, null, 0.0f, 3);
                        return;
                    case 8:
                        String str3 = appDetailActivity.F;
                        if (str3 == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent(appDetailActivity, (Class<?>) AppNavigation.class).putExtra("nav3_route", new xu2(str3)));
                        return;
                    case 9:
                        v11 v11Var5 = AppDetailActivity.b1;
                        view.getClass();
                        wk2 wk2Var2 = new wk2(appDetailActivity, view);
                        String string = appDetailActivity.getString(R.string.edit);
                        dz1 dz1Var2 = wk2Var2.a;
                        dz1Var2.a(0, 1, 0, string);
                        dz1Var2.a(0, 2, 1, appDetailActivity.getString(R.string.delete_action));
                        wk2Var2.c = new rl(appDetailActivity, 3);
                        tz1 tz1Var2 = wk2Var2.b;
                        if (tz1Var2.b()) {
                            return;
                        }
                        if (tz1Var2.e != null) {
                            tz1Var2.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 10:
                        boolean z = appDetailActivity.X0;
                        appDetailActivity.X0 = !z;
                        TextView textView2 = appDetailActivity.e0;
                        if (textView2 == null) {
                            rf1.W("tvDescription");
                            throw null;
                        }
                        textView2.setMaxLines(z ? 3 : Integer.MAX_VALUE);
                        ImageView imageView5 = appDetailActivity.h0;
                        if (imageView5 == null) {
                            rf1.W("btnExpandDesc");
                            throw null;
                        }
                        if (appDetailActivity.X0) {
                            i17 = R.drawable.ic_expand_less;
                        }
                        imageView5.setImageResource(i17);
                        View view2 = appDetailActivity.f0;
                        if (view2 != null) {
                            view2.setVisibility(appDetailActivity.X0 ? 8 : 0);
                            return;
                        } else {
                            rf1.W("viewDescFade");
                            throw null;
                        }
                    case 11:
                        boolean z2 = appDetailActivity.Y0;
                        appDetailActivity.Y0 = !z2;
                        View view3 = appDetailActivity.l0;
                        if (view3 == null) {
                            rf1.W("sectionInfoExtra");
                            throw null;
                        }
                        view3.setVisibility(z2 ? 8 : 0);
                        ImageView imageView6 = appDetailActivity.k0;
                        if (imageView6 == null) {
                            rf1.W("btnExpandInfo");
                            throw null;
                        }
                        if (appDetailActivity.Y0) {
                            i17 = R.drawable.ic_expand_less;
                        }
                        imageView6.setImageResource(i17);
                        return;
                    default:
                        v11 v11Var6 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                }
            }
        });
        ImageButton imageButton2 = this.N0;
        if (imageButton2 == null) {
            rf1.W("btnWishlist");
            throw null;
        }
        imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ql
            public final /* synthetic */ AppDetailActivity f;

            {
                this.f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Drawable drawableMutate;
                Drawable drawableMutate2;
                Drawable drawableMutate3;
                int i16 = i;
                int i17 = R.drawable.ic_expand_more;
                AppDetailActivity appDetailActivity = this.f;
                switch (i16) {
                    case 0:
                        v11 v11Var = AppDetailActivity.b1;
                        appDetailActivity.finish();
                        return;
                    case 1:
                        v11 v11Var2 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                    case 2:
                        String str = appDetailActivity.F;
                        if (str == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))));
                        return;
                    case 3:
                        v11 v11Var3 = AppDetailActivity.b1;
                        appDetailActivity.x();
                        return;
                    case 4:
                        v11 v11Var4 = AppDetailActivity.b1;
                        appDetailActivity.C();
                        return;
                    case 5:
                        String str2 = appDetailActivity.F;
                        if (str2 == null || qb3.U(str2)) {
                            return;
                        }
                        om omVar = appDetailActivity.E;
                        if (omVar != null) {
                            omVar.e(str2);
                            return;
                        } else {
                            rf1.W("viewModel");
                            throw null;
                        }
                    case 6:
                        ImageButton imageButton3 = appDetailActivity.P0;
                        if (imageButton3 == null) {
                            rf1.W("btnOverflow");
                            throw null;
                        }
                        wk2 wk2Var = new wk2(appDetailActivity, imageButton3);
                        dd3 dd3Var = new dd3(appDetailActivity);
                        dz1 dz1Var = wk2Var.a;
                        dd3Var.inflate(R.menu.menu_app_detail_overflow, dz1Var);
                        try {
                            Field declaredField = wk2.class.getDeclaredField("mPopup");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(wk2Var);
                            if (obj2 != null) {
                                obj2.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj2, Boolean.TRUE);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Drawable icon = dz1Var.findItem(R.id.action_report).getIcon();
                        if (icon != null && (drawableMutate3 = icon.mutate()) != null) {
                            drawableMutate3.setTint(appDetailActivity.getColor(R.color.toolbar_icon_flag));
                        }
                        MenuItem menuItemFindItem = dz1Var.findItem(R.id.action_wishlist);
                        ImageButton imageButton4 = appDetailActivity.N0;
                        if (imageButton4 == null) {
                            rf1.W("btnWishlist");
                            throw null;
                        }
                        if (imageButton4.isSelected()) {
                            menuItemFindItem.setTitle(appDetailActivity.getString(R.string.remove_from_wishlist));
                        }
                        Drawable icon2 = menuItemFindItem.getIcon();
                        if (icon2 != null && (drawableMutate2 = icon2.mutate()) != null) {
                            ImageButton imageButton5 = appDetailActivity.N0;
                            if (imageButton5 == null) {
                                rf1.W("btnWishlist");
                                throw null;
                            }
                            drawableMutate2.setTint(appDetailActivity.getColor(imageButton5.isSelected() ? R.color.toolbar_icon_active : R.color.toolbar_icon_default));
                        }
                        Drawable icon3 = dz1Var.findItem(R.id.action_share).getIcon();
                        if (icon3 != null && (drawableMutate = icon3.mutate()) != null) {
                            drawableMutate.setTint(appDetailActivity.getColor(R.color.toolbar_icon_default));
                        }
                        wk2Var.c = new rl(appDetailActivity, 2);
                        tz1 tz1Var = wk2Var.b;
                        if (tz1Var.b()) {
                            return;
                        }
                        if (tz1Var.e != null) {
                            tz1Var.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 7:
                        appDetailActivity.I = 0;
                        appDetailActivity.H();
                        AppDetailActivity.E(appDetailActivity, null, 0.0f, 3);
                        return;
                    case 8:
                        String str3 = appDetailActivity.F;
                        if (str3 == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent(appDetailActivity, (Class<?>) AppNavigation.class).putExtra("nav3_route", new xu2(str3)));
                        return;
                    case 9:
                        v11 v11Var5 = AppDetailActivity.b1;
                        view.getClass();
                        wk2 wk2Var2 = new wk2(appDetailActivity, view);
                        String string = appDetailActivity.getString(R.string.edit);
                        dz1 dz1Var2 = wk2Var2.a;
                        dz1Var2.a(0, 1, 0, string);
                        dz1Var2.a(0, 2, 1, appDetailActivity.getString(R.string.delete_action));
                        wk2Var2.c = new rl(appDetailActivity, 3);
                        tz1 tz1Var2 = wk2Var2.b;
                        if (tz1Var2.b()) {
                            return;
                        }
                        if (tz1Var2.e != null) {
                            tz1Var2.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 10:
                        boolean z = appDetailActivity.X0;
                        appDetailActivity.X0 = !z;
                        TextView textView2 = appDetailActivity.e0;
                        if (textView2 == null) {
                            rf1.W("tvDescription");
                            throw null;
                        }
                        textView2.setMaxLines(z ? 3 : Integer.MAX_VALUE);
                        ImageView imageView5 = appDetailActivity.h0;
                        if (imageView5 == null) {
                            rf1.W("btnExpandDesc");
                            throw null;
                        }
                        if (appDetailActivity.X0) {
                            i17 = R.drawable.ic_expand_less;
                        }
                        imageView5.setImageResource(i17);
                        View view2 = appDetailActivity.f0;
                        if (view2 != null) {
                            view2.setVisibility(appDetailActivity.X0 ? 8 : 0);
                            return;
                        } else {
                            rf1.W("viewDescFade");
                            throw null;
                        }
                    case 11:
                        boolean z2 = appDetailActivity.Y0;
                        appDetailActivity.Y0 = !z2;
                        View view3 = appDetailActivity.l0;
                        if (view3 == null) {
                            rf1.W("sectionInfoExtra");
                            throw null;
                        }
                        view3.setVisibility(z2 ? 8 : 0);
                        ImageView imageView6 = appDetailActivity.k0;
                        if (imageView6 == null) {
                            rf1.W("btnExpandInfo");
                            throw null;
                        }
                        if (appDetailActivity.Y0) {
                            i17 = R.drawable.ic_expand_less;
                        }
                        imageView6.setImageResource(i17);
                        return;
                    default:
                        v11 v11Var6 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                }
            }
        });
        ImageButton imageButton3 = this.O0;
        if (imageButton3 == null) {
            rf1.W("btnShare");
            throw null;
        }
        imageButton3.setOnClickListener(new View.OnClickListener(this) { // from class: ql
            public final /* synthetic */ AppDetailActivity f;

            {
                this.f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Drawable drawableMutate;
                Drawable drawableMutate2;
                Drawable drawableMutate3;
                int i16 = i6;
                int i17 = R.drawable.ic_expand_more;
                AppDetailActivity appDetailActivity = this.f;
                switch (i16) {
                    case 0:
                        v11 v11Var = AppDetailActivity.b1;
                        appDetailActivity.finish();
                        return;
                    case 1:
                        v11 v11Var2 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                    case 2:
                        String str = appDetailActivity.F;
                        if (str == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))));
                        return;
                    case 3:
                        v11 v11Var3 = AppDetailActivity.b1;
                        appDetailActivity.x();
                        return;
                    case 4:
                        v11 v11Var4 = AppDetailActivity.b1;
                        appDetailActivity.C();
                        return;
                    case 5:
                        String str2 = appDetailActivity.F;
                        if (str2 == null || qb3.U(str2)) {
                            return;
                        }
                        om omVar = appDetailActivity.E;
                        if (omVar != null) {
                            omVar.e(str2);
                            return;
                        } else {
                            rf1.W("viewModel");
                            throw null;
                        }
                    case 6:
                        ImageButton imageButton4 = appDetailActivity.P0;
                        if (imageButton4 == null) {
                            rf1.W("btnOverflow");
                            throw null;
                        }
                        wk2 wk2Var = new wk2(appDetailActivity, imageButton4);
                        dd3 dd3Var = new dd3(appDetailActivity);
                        dz1 dz1Var = wk2Var.a;
                        dd3Var.inflate(R.menu.menu_app_detail_overflow, dz1Var);
                        try {
                            Field declaredField = wk2.class.getDeclaredField("mPopup");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(wk2Var);
                            if (obj2 != null) {
                                obj2.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj2, Boolean.TRUE);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        Drawable icon = dz1Var.findItem(R.id.action_report).getIcon();
                        if (icon != null && (drawableMutate3 = icon.mutate()) != null) {
                            drawableMutate3.setTint(appDetailActivity.getColor(R.color.toolbar_icon_flag));
                        }
                        MenuItem menuItemFindItem = dz1Var.findItem(R.id.action_wishlist);
                        ImageButton imageButton5 = appDetailActivity.N0;
                        if (imageButton5 == null) {
                            rf1.W("btnWishlist");
                            throw null;
                        }
                        if (imageButton5.isSelected()) {
                            menuItemFindItem.setTitle(appDetailActivity.getString(R.string.remove_from_wishlist));
                        }
                        Drawable icon2 = menuItemFindItem.getIcon();
                        if (icon2 != null && (drawableMutate2 = icon2.mutate()) != null) {
                            ImageButton imageButton6 = appDetailActivity.N0;
                            if (imageButton6 == null) {
                                rf1.W("btnWishlist");
                                throw null;
                            }
                            drawableMutate2.setTint(appDetailActivity.getColor(imageButton6.isSelected() ? R.color.toolbar_icon_active : R.color.toolbar_icon_default));
                        }
                        Drawable icon3 = dz1Var.findItem(R.id.action_share).getIcon();
                        if (icon3 != null && (drawableMutate = icon3.mutate()) != null) {
                            drawableMutate.setTint(appDetailActivity.getColor(R.color.toolbar_icon_default));
                        }
                        wk2Var.c = new rl(appDetailActivity, 2);
                        tz1 tz1Var = wk2Var.b;
                        if (tz1Var.b()) {
                            return;
                        }
                        if (tz1Var.e != null) {
                            tz1Var.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 7:
                        appDetailActivity.I = 0;
                        appDetailActivity.H();
                        AppDetailActivity.E(appDetailActivity, null, 0.0f, 3);
                        return;
                    case 8:
                        String str3 = appDetailActivity.F;
                        if (str3 == null) {
                            return;
                        }
                        appDetailActivity.startActivity(new Intent(appDetailActivity, (Class<?>) AppNavigation.class).putExtra("nav3_route", new xu2(str3)));
                        return;
                    case 9:
                        v11 v11Var5 = AppDetailActivity.b1;
                        view.getClass();
                        wk2 wk2Var2 = new wk2(appDetailActivity, view);
                        String string = appDetailActivity.getString(R.string.edit);
                        dz1 dz1Var2 = wk2Var2.a;
                        dz1Var2.a(0, 1, 0, string);
                        dz1Var2.a(0, 2, 1, appDetailActivity.getString(R.string.delete_action));
                        wk2Var2.c = new rl(appDetailActivity, 3);
                        tz1 tz1Var2 = wk2Var2.b;
                        if (tz1Var2.b()) {
                            return;
                        }
                        if (tz1Var2.e != null) {
                            tz1Var2.d(0, 0, false, false);
                            return;
                        } else {
                            c.k("MenuPopupHelper cannot be used without an anchor");
                            return;
                        }
                    case 10:
                        boolean z = appDetailActivity.X0;
                        appDetailActivity.X0 = !z;
                        TextView textView2 = appDetailActivity.e0;
                        if (textView2 == null) {
                            rf1.W("tvDescription");
                            throw null;
                        }
                        textView2.setMaxLines(z ? 3 : Integer.MAX_VALUE);
                        ImageView imageView5 = appDetailActivity.h0;
                        if (imageView5 == null) {
                            rf1.W("btnExpandDesc");
                            throw null;
                        }
                        if (appDetailActivity.X0) {
                            i17 = R.drawable.ic_expand_less;
                        }
                        imageView5.setImageResource(i17);
                        View view2 = appDetailActivity.f0;
                        if (view2 != null) {
                            view2.setVisibility(appDetailActivity.X0 ? 8 : 0);
                            return;
                        } else {
                            rf1.W("viewDescFade");
                            throw null;
                        }
                    case 11:
                        boolean z2 = appDetailActivity.Y0;
                        appDetailActivity.Y0 = !z2;
                        View view3 = appDetailActivity.l0;
                        if (view3 == null) {
                            rf1.W("sectionInfoExtra");
                            throw null;
                        }
                        view3.setVisibility(z2 ? 8 : 0);
                        ImageView imageView6 = appDetailActivity.k0;
                        if (imageView6 == null) {
                            rf1.W("btnExpandInfo");
                            throw null;
                        }
                        if (appDetailActivity.Y0) {
                            i17 = R.drawable.ic_expand_less;
                        }
                        imageView6.setImageResource(i17);
                        return;
                    default:
                        v11 v11Var6 = AppDetailActivity.b1;
                        appDetailActivity.z();
                        return;
                }
            }
        });
        SwipeRefreshLayout swipeRefreshLayout = this.S0;
        if (swipeRefreshLayout == null) {
            rf1.W("swipeRefresh");
            throw null;
        }
        swipeRefreshLayout.setOnRefreshListener(new rl(this, i3));
        B(false);
        om omVar = this.E;
        if (omVar == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar.d.e(this, new l3(new pl(this, i13), i4));
        om omVar2 = this.E;
        if (omVar2 == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar2.e.e(this, new l3(new pl(this, i3), i4));
        om omVar3 = this.E;
        if (omVar3 == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar3.l.e(this, new l3(new pl(this, i4), i4));
        om omVar4 = this.E;
        if (omVar4 == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar4.o.e(this, new l3(new pl(this, i5), i4));
        om omVar5 = this.E;
        if (omVar5 == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar5.s.e(this, new l3(new pl(this, i), i4));
        om omVar6 = this.E;
        if (omVar6 == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar6.f.e(this, new l3(new pl(this, i6), i4));
        om omVar7 = this.E;
        if (omVar7 == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar7.g.e(this, new l3(new pl(this, i2), i4));
        om omVar8 = this.E;
        if (omVar8 == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar8.h.e(this, new l3(new pl(this, i7), i4));
        om omVar9 = this.E;
        if (omVar9 == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar9.i.e(this, new l3(new pl(this, i8), i4));
        om omVar10 = this.E;
        if (omVar10 == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar10.j.e(this, new l3(new pl(this, i11), i4));
        om omVar11 = this.E;
        if (omVar11 == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar11.m.e(this, new l3(new pl(this, i14), i4));
        om omVar12 = this.E;
        if (omVar12 == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar12.p.e(this, new l3(new pl(this, i15), i4));
        om omVar13 = this.E;
        if (omVar13 == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar13.r.e(this, new l3(new pl(this, 13), i4));
        String stringExtra = getIntent().getStringExtra("app_id");
        if (stringExtra == null) {
            Uri data = getIntent().getData();
            stringExtra = data != null ? data.getLastPathSegment() : null;
            if (stringExtra == null) {
                Uri data2 = getIntent().getData();
                stringExtra = (data2 == null || (pathSegments = data2.getPathSegments()) == null) ? null : (String) p30.x0(pathSegments);
            }
        }
        this.F = stringExtra;
        if (stringExtra == null || qb3.U(stringExtra)) {
            String string = getString(R.string.error_format, getString(R.string.app_not_found));
            string.getClass();
            k92.u(this, string, l73.f, 2);
            finish();
            return;
        }
        om omVar14 = this.E;
        if (omVar14 == null) {
            rf1.W("viewModel");
            throw null;
        }
        String str = this.F;
        str.getClass();
        omVar14.g(str);
        om omVar15 = this.E;
        if (omVar15 == null) {
            rf1.W("viewModel");
            throw null;
        }
        kn knVar = omVar15.c;
        lm lmVar = new lm(omVar15, i4);
        knVar.getClass();
        knVar.b.S().b(new q62(i8, lmVar));
        w();
    }

    @Override // defpackage.y50, android.app.Activity
    public final void onNewIntent(Intent intent) {
        List<String> pathSegments;
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        String stringExtra = intent.getStringExtra("app_id");
        if (stringExtra == null) {
            Uri data = intent.getData();
            stringExtra = data != null ? data.getLastPathSegment() : null;
            if (stringExtra == null) {
                Uri data2 = intent.getData();
                stringExtra = (data2 == null || (pathSegments = data2.getPathSegments()) == null) ? null : (String) p30.x0(pathSegments);
            }
        }
        if (stringExtra == null || qb3.U(stringExtra) || stringExtra.equals(this.F)) {
            return;
        }
        this.F = stringExtra;
        om omVar = this.E;
        if (omVar == null) {
            rf1.W("viewModel");
            throw null;
        }
        omVar.g(stringExtra);
        om omVar2 = this.E;
        if (omVar2 == null) {
            rf1.W("viewModel");
            throw null;
        }
        kn knVar = omVar2.c;
        lm lmVar = new lm(omVar2, 1);
        knVar.getClass();
        knVar.b.S().b(new q62(7, lmVar));
        w();
    }

    @Override // defpackage.vi, android.app.Activity
    public final void onResume() {
        String str;
        super.onResume();
        G();
        boolean z = this.Q0;
        if (z && (str = this.F) != null) {
            b1 = new j(3, str, this);
        }
        if (this.F != null) {
            if (!z) {
                mi miVar = this.G;
                if (miVar == null || miVar.h) {
                    return;
                }
                miVar.getClass();
                if (miVar.F) {
                    return;
                }
            }
            om omVar = this.E;
            if (omVar == null) {
                rf1.W("viewModel");
                throw null;
            }
            String str2 = this.F;
            str2.getClass();
            omVar.h(str2);
        }
    }

    @Override // defpackage.vi, android.app.Activity
    public final void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("cu.uci.android.apklis.DOWNLOAD_COMPLETE");
        intentFilter.addAction("cu.uci.android.apklis.DOWNLOAD_FAILED");
        intentFilter.addAction("cu.uci.android.apklis.DOWNLOAD_CANCELLED");
        intentFilter.addAction("cu.uci.android.apklis.DOWNLOAD_PROGRESS");
        ih1.P(this, this.Z0, intentFilter, 4);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter2.addDataScheme("package");
        ih1.P(this, this.a1, intentFilter2, 2);
        this.O.post(this.P);
    }

    @Override // defpackage.vi, android.app.Activity
    public final void onStop() {
        super.onStop();
        unregisterReceiver(this.Z0);
        unregisterReceiver(this.a1);
        this.O.removeCallbacks(this.P);
        b1 = null;
    }

    public final Long u(String str) {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str, 0);
            return Long.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void v() {
        ComposeView composeView = this.T0;
        if (composeView != null) {
            ViewParent parent = composeView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(composeView);
            }
            this.T0 = null;
        }
    }

    public final void w() {
        String lowerCase;
        String str = this.F;
        if (str == null) {
            return;
        }
        Application application = getApplication();
        application.getClass();
        ot3 ot3VarG = ((AppApplication) application).b().g();
        String str2 = ot3VarG != null ? ot3VarG.b : null;
        if (str2 == null || qb3.U(str2)) {
            return;
        }
        om omVar = this.E;
        if (omVar == null) {
            rf1.W("viewModel");
            throw null;
        }
        if (str.length() == 0 || str2.length() == 0) {
            omVar.l.h(null);
            return;
        }
        kn knVar = omVar.c;
        nm nmVar = new nm(omVar, 1);
        knVar.getClass();
        String string = qb3.h0(str2).toString();
        if (string != null) {
            lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = "";
        }
        knVar.b.k(str, str2).b(new qm(knVar, lowerCase, nmVar, 13));
    }

    public final void x() {
        String str = this.F;
        if (str == null) {
            return;
        }
        Application application = getApplication();
        application.getClass();
        ot3 ot3VarG = ((AppApplication) application).b().g();
        String str2 = ot3VarG != null ? ot3VarG.b : null;
        if (str2 == null || qb3.U(str2)) {
            String string = getString(R.string.login_required_wishlist);
            string.getClass();
            D(string);
            return;
        }
        ImageButton imageButton = this.N0;
        if (imageButton == null) {
            rf1.W("btnWishlist");
            throw null;
        }
        boolean zIsSelected = imageButton.isSelected();
        boolean z = !zIsSelected;
        ImageButton imageButton2 = this.N0;
        if (imageButton2 == null) {
            rf1.W("btnWishlist");
            throw null;
        }
        int i = 0;
        imageButton2.setEnabled(false);
        ProgressBar progressBar = this.M0;
        if (progressBar == null) {
            rf1.W("progressBar");
            throw null;
        }
        progressBar.setVisibility(0);
        Application application2 = getApplication();
        application2.getClass();
        kn knVarA = ((AppApplication) application2).a();
        fm fmVar = new fm(i, this, z);
        b6 b6Var = new b6(str);
        wh whVar = knVarA.b;
        (!zIsSelected ? whVar.D(b6Var) : whVar.U(b6Var)).b(new qm(knVarA, str, fmVar, 6));
    }

    public final void y() {
        try {
            Intent intent = new Intent();
            if (Build.VERSION.SDK_INT >= 26) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
            } else {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("app_package", getPackageName());
                intent.putExtra("app_uid", getApplicationInfo().uid);
            }
            startActivity(intent);
        } catch (Exception unused) {
            k92.t(this, R.string.notification_settings_error, l73.f, 2);
        }
    }

    public final void z() {
        String str;
        tl2 tl2Var = this.L;
        tl2 tl2Var2 = tl2.i;
        int i = 0;
        l73 l73Var = l73.f;
        if (tl2Var == tl2Var2) {
            String str2 = this.F;
            if (str2 == null) {
                return;
            }
            Intent intent = new Intent(this, (Class<?>) ApkDownloadService.class);
            intent.setAction("action_cancel_download");
            intent.putExtra("extra_package_name", str2);
            try {
                startService(intent);
                mi miVar = this.G;
                if (miVar != null && (str = miVar.b) != null) {
                    str2 = str;
                }
                String string = getString(R.string.cancelling, str2);
                string.getClass();
                k92.u(this, string, l73.h, 2);
                return;
            } catch (Exception e) {
                String string2 = getString(R.string.error_format, e.getMessage());
                string2.getClass();
                k92.u(this, string2, l73Var, 2);
                return;
            }
        }
        if (tl2Var != tl2.e) {
            Application application = getApplication();
            application.getClass();
            ot3 ot3VarG = ((AppApplication) application).b().g();
            String str3 = ot3VarG != null ? ot3VarG.b : null;
            if (str3 == null || qb3.U(str3)) {
                String string3 = getString(R.string.login_required_download);
                string3.getClass();
                D(string3);
                return;
            }
        }
        int iOrdinal = this.L.ordinal();
        if (iOrdinal == 0) {
            String str4 = this.F;
            if (str4 == null) {
                return;
            }
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(str4);
            if (launchIntentForPackage != null) {
                startActivity(launchIntentForPackage);
                return;
            } else {
                k92.t(this, R.string.app_open_error, l73Var, 2);
                return;
            }
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    return;
                }
                g01.r();
                return;
            }
            String str5 = this.F;
            if (str5 != null) {
                if (qb3.U(str5)) {
                    str5 = null;
                }
                if (str5 == null) {
                    return;
                }
                ProgressBar progressBar = this.M0;
                if (progressBar == null) {
                    rf1.W("progressBar");
                    throw null;
                }
                progressBar.setVisibility(0);
                MaterialButton materialButton = this.Y;
                if (materialButton == null) {
                    rf1.W("btnDownload");
                    throw null;
                }
                materialButton.setEnabled(false);
                ce0.u().b(new qh2(str5)).b(new r62(7, this));
                return;
            }
            return;
        }
        String str6 = this.F;
        mi miVar2 = this.G;
        if (str6 == null || qb3.U(str6) || miVar2 == null) {
            k92.t(this, R.string.invalid_package, l73Var, 2);
            return;
        }
        Long lU = u(str6);
        long j = miVar2.k;
        if (lU != null && lU.longValue() >= j) {
            String str7 = this.F;
            if (str7 == null) {
                return;
            }
            Intent launchIntentForPackage2 = getPackageManager().getLaunchIntentForPackage(str7);
            if (launchIntentForPackage2 != null) {
                startActivity(launchIntentForPackage2);
                return;
            } else {
                k92.t(this, R.string.app_open_error, l73Var, 2);
                return;
            }
        }
        ConcurrentHashMap.KeySetView keySetView = ApkDownloadService.u;
        if (q41.t(this, str6, miVar2.b, miVar2.j)) {
            q41.u(this, str6, miVar2.b, miVar2.j, new bm(this, i));
            return;
        }
        om omVar = this.E;
        if (omVar == null) {
            rf1.W("viewModel");
            throw null;
        }
        mi miVar3 = (mi) omVar.d.d();
        String str8 = miVar3 != null ? miVar3.E : null;
        if (str8 == null) {
            str8 = "";
        }
        if (qb3.U(str8)) {
            String str9 = miVar3 != null ? miVar3.D : null;
            if (str9 != null && !qb3.U(str9)) {
                omVar.s.f(str9);
                return;
            }
        }
        kn knVar = omVar.c;
        nm nmVar = new nm(omVar, i);
        knVar.getClass();
        if (!qb3.U(str8)) {
            knVar.b.E(new ek0(str6, str8)).b(new sd1(17, nmVar, knVar));
            return;
        }
        String string4 = knVar.a.getString(R.string.repo_download_hash_error);
        string4.getClass();
        nmVar.b(string4);
    }
}
