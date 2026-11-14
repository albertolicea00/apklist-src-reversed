package cu.uci.android.apklis.presentation.ui.main;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.gson.Gson;
import cu.uci.android.apklis.R;
import cu.uci.android.apklis.di.AppApplication;
import cu.uci.android.apklis.presentation.service.ApkDownloadService;
import cu.uci.android.apklis.presentation.ui.action.ActionFormActivity;
import cu.uci.android.apklis.presentation.ui.detail.AppDetailActivity;
import cu.uci.android.apklis.presentation.ui.main.MainActivity;
import cu.uci.android.apklis.presentation.ui.notification.NotificationsActivity;
import de.hdodenhof.circleimageview.CircleImageView;
import defpackage.a21;
import defpackage.ag2;
import defpackage.au3;
import defpackage.aw1;
import defpackage.b40;
import defpackage.bf;
import defpackage.c;
import defpackage.c40;
import defpackage.c80;
import defpackage.ce0;
import defpackage.cw1;
import defpackage.d40;
import defpackage.d80;
import defpackage.dg2;
import defpackage.dm1;
import defpackage.e12;
import defpackage.e70;
import defpackage.ef2;
import defpackage.em;
import defpackage.ew1;
import defpackage.ey1;
import defpackage.f14;
import defpackage.f6;
import defpackage.f60;
import defpackage.f70;
import defpackage.fc2;
import defpackage.fq;
import defpackage.ft3;
import defpackage.fw1;
import defpackage.g22;
import defpackage.gw1;
import defpackage.gw2;
import defpackage.h12;
import defpackage.h70;
import defpackage.hc2;
import defpackage.he;
import defpackage.ht3;
import defpackage.hu;
import defpackage.hw1;
import defpackage.ia3;
import defpackage.ih1;
import defpackage.ij3;
import defpackage.it3;
import defpackage.iw1;
import defpackage.j5;
import defpackage.jh0;
import defpackage.ju3;
import defpackage.jw;
import defpackage.k11;
import defpackage.k71;
import defpackage.k92;
import defpackage.ke2;
import defpackage.kn;
import defpackage.kx1;
import defpackage.l40;
import defpackage.li;
import defpackage.lz0;
import defpackage.m10;
import defpackage.m40;
import defpackage.m8;
import defpackage.m9;
import defpackage.me1;
import defpackage.mo2;
import defpackage.mu;
import defpackage.mw2;
import defpackage.n31;
import defpackage.n70;
import defpackage.nr3;
import defpackage.ny1;
import defpackage.o10;
import defpackage.o5;
import defpackage.oo2;
import defpackage.ot3;
import defpackage.ov1;
import defpackage.p30;
import defpackage.p31;
import defpackage.pe;
import defpackage.pn0;
import defpackage.pw1;
import defpackage.q31;
import defpackage.qb3;
import defpackage.qc2;
import defpackage.qf1;
import defpackage.qo1;
import defpackage.qv1;
import defpackage.r20;
import defpackage.r9;
import defpackage.rf1;
import defpackage.rh;
import defpackage.s8;
import defpackage.sa2;
import defpackage.sd1;
import defpackage.sq2;
import defpackage.ss;
import defpackage.t32;
import defpackage.t72;
import defpackage.th0;
import defpackage.tj3;
import defpackage.tt3;
import defpackage.u;
import defpackage.u00;
import defpackage.u22;
import defpackage.un0;
import defpackage.un1;
import defpackage.uy;
import defpackage.v03;
import defpackage.v11;
import defpackage.v22;
import defpackage.v30;
import defpackage.v42;
import defpackage.vi;
import defpackage.vv1;
import defpackage.w42;
import defpackage.we;
import defpackage.x63;
import defpackage.xh2;
import defpackage.xv;
import defpackage.xv1;
import defpackage.y21;
import defpackage.yc0;
import defpackage.yc2;
import defpackage.yq;
import defpackage.z11;
import defpackage.z3;
import defpackage.z50;
import defpackage.za1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/**
 * Main catalog, search, updates, and categories screen.
 *
 * @obfuscated_class cu.uci.android.apklis.presentation.ui.main.MainActivity
 */
public final class MainActivity extends vi {
    public static final /* synthetic */ int Q0 = 0;
    public RecyclerView A0;
    public final xv1 D0;
    public u00 E0;
    public int F;
    public LinearLayout F0;
    public k71 G;
    public ComposeView G0;
    public it3 H;
    public ComposeView H0;
    public View I;
    public ComposeView I0;
    public boolean J;
    public TextView J0;
    public boolean K;
    public boolean L;
    public EditText M;
    public boolean M0;
    public ImageView O;
    public final iw1 O0;
    public int P0;
    public CircleImageView R;
    public ImageView S;
    public ComposeView T;
    public ImageView U;
    public ImageView V;
    public FrameLayout W;
    public TextView X;
    public int Y;
    public View Z;
    public MaterialCardView a0;
    public final hw1 c0;
    public RecyclerView e0;
    public RecyclerView f0;
    public RecyclerView g0;
    public FrameLayout h0;
    public ShimmerFrameLayout i0;
    public NestedScrollView j0;
    public LinearLayout k0;
    public LinearLayout l0;
    public NestedScrollView m0;
    public RecyclerView n0;
    public TextView o0;
    public TextView p0;
    public MaterialButton q0;
    public ft3 r0;
    public yq s0;
    public v03 t0;
    public yq u0;
    public uy v0;
    public uy w0;
    public RecyclerView x0;
    public RecyclerView y0;
    public uy z0;
    public final dg2 E = hc2.q(Boolean.FALSE);
    public final o5 N = l(new ov1(this, 9), new j5(3));
    public final Handler P = new Handler(Looper.getMainLooper());
    public Runnable Q = new m8(1);
    public final we b0 = new we(sq2.a(o10.class), new pw1(1, this), new pw1(0, this), new pw1(2, this));
    public final hw1 d0 = new hw1(this, 1);
    public final Handler B0 = new Handler(Looper.getMainLooper());
    public final Handler C0 = new Handler(Looper.getMainLooper());
    public final ag2 K0 = new ag2(R.id.nav_apps);
    public final ag2 L0 = new ag2(0);
    public final Handler N0 = new Handler(Looper.getMainLooper());

    public MainActivity() {
        int i = 0;
        this.c0 = new hw1(this, i);
        this.D0 = new xv1(this, i);
        this.O0 = new iw1(this, i);
    }

    public static final void y(MainActivity mainActivity, z3 z3Var) {
        if (z3Var == null || z3Var.getAction() == null || z3Var.getFields() == null) {
            return;
        }
        Log.d("MainActivity", "checkPendingAction: found pending action=" + z3Var.getAction());
        String json = new Gson().toJson(z3Var);
        Intent intent = new Intent(mainActivity, (Class<?>) ActionFormActivity.class);
        intent.putExtra("action_json", json);
        intent.setFlags(268468224);
        mainActivity.startActivity(intent);
        mainActivity.finish();
    }

    public static final void z(MainActivity mainActivity, w42 w42Var) {
        Application application = mainActivity.getApplication();
        application.getClass();
        Intent intent = new Intent(mainActivity, (Class<?>) NotificationsActivity.class);
        intent.setFlags(603979776);
        int i = mainActivity.P0 + 1;
        mainActivity.P0 = i;
        PendingIntent activity = PendingIntent.getActivity(mainActivity, i, intent, 201326592);
        t72 t72Var = new t72(mainActivity, "apklis_notifications_nats");
        t72Var.r.icon = R.mipmap.ic_launcher;
        String strB = w42Var.getName();
        if (strB == null && (strB = w42Var.getType()) == null) {
            strB = "Apklis";
        }
        t72Var.e = t72.c(strB);
        String strA = w42Var.getMessage();
        if (strA == null) {
            strA = "";
        }
        t72Var.f = t72.c(strA);
        t72Var.d(16, true);
        t72Var.g = activity;
        Notification notificationB = t72Var.b();
        notificationB.getClass();
        ((NotificationManager) mainActivity.getSystemService(NotificationManager.class)).notify(mainActivity.P0, notificationB);
    }

    public final void A() {
        float f = getResources().getConfiguration().fontScale;
        float f2 = getResources().getDisplayMetrics().density;
        float f3 = f - 1.0f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        int i = (int) (((f3 * 28.0f) + 80.0f + (this.F / f2) + 4.0f) * f2);
        View view = this.I;
        if (view == null) {
            rf1.W("rootView");
            throw null;
        }
        View viewFindViewById = view.findViewById(R.id.shimmerHome);
        NestedScrollView nestedScrollView = this.j0;
        if (nestedScrollView == null) {
            rf1.W("nestedScrollHome");
            throw null;
        }
        LinearLayout linearLayout = this.k0;
        if (linearLayout == null) {
            rf1.W("panelUpdates");
            throw null;
        }
        LinearLayout linearLayout2 = this.l0;
        if (linearLayout2 == null) {
            rf1.W("panelSearch");
            throw null;
        }
        ComposeView composeView = this.G0;
        if (composeView == null) {
            rf1.W("errorHomeContent");
            throw null;
        }
        for (View view2 : me1.X(nestedScrollView, viewFindViewById, linearLayout, linearLayout2, composeView)) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
    }

    public final void B() {
        Application application = getApplication();
        application.getClass();
        ot3 ot3VarG = ((AppApplication) application).b().g();
        int i = ot3VarG != null ? ot3VarG.j : 0;
        Log.d("MainActivity", "bindNotificationBadgeFromCache: cached=" + i);
        P(i);
    }

    public final void C(String str) {
        Application application = getApplication();
        application.getClass();
        AppApplication appApplication = (AppApplication) application;
        v42 v42Var = appApplication.i;
        if (v42Var == null) {
            rf1.W("natManager");
            throw null;
        }
        v42Var.b = new gw1(this);
        if (v42Var == null) {
            rf1.W("natManager");
            throw null;
        }
        if (v42Var.e.get()) {
            Log.d("MainActivity", "doConnectNats: ya conectado, re-utilizando conexión");
            return;
        }
        v42 v42Var2 = appApplication.i;
        if (v42Var2 == null) {
            rf1.W("natManager");
            throw null;
        }
        str.getClass();
        Log.d("NatManager", "🔌 connect: userCode=".concat(str));
        Log.i("NatManager", "Cerrando NATS manualmente...");
        AtomicBoolean atomicBoolean = v42Var2.g;
        boolean z = false;
        atomicBoolean.set(false);
        ScheduledExecutorService scheduledExecutorService = v42Var2.d;
        if (scheduledExecutorService != null) {
            try {
                scheduledExecutorService.shutdownNow();
            } catch (Exception unused) {
            }
        }
        v42Var2.d = null;
        mo2 mo2Var = v42Var2.c;
        if (mo2Var != null) {
            try {
                mo2Var.b(1000, "Client closing");
            } catch (Exception unused2) {
            }
        }
        v42Var2.c = null;
        v42Var2.e.set(false);
        v42Var2.f = null;
        gw1 gw1Var = v42Var2.b;
        if (gw1Var != null) {
            MainActivity mainActivity = gw1Var.e;
            mainActivity.runOnUiThread(new em(z, mainActivity));
        }
        String strConcat = "APKLIS.".concat(str);
        v42Var2.f = strConcat;
        Log.i("NatManager", "📡 Topic a suscribir: ".concat(strConcat));
        v42Var2.h = 1000L;
        atomicBoolean.set(true);
        v42Var2.c();
    }

    public final void D() {
        Application application = getApplication();
        application.getClass();
        AppApplication appApplication = (AppApplication) application;
        B();
        appApplication.b().e(new un1(2, this));
        kn knVarA = appApplication.a();
        gw2 gw2Var = new gw2(26, this);
        Integer num = (Integer) knVarA.m.b("unread");
        if (num == null) {
            knVarA.b.m(0).b(new sd1(19, knVarA, gw2Var));
        } else {
            new Handler(Looper.getMainLooper()).post(new rh(num.intValue(), 1, gw2Var));
        }
    }

    public final void E() {
        k71 k71Var = this.G;
        if (k71Var == null) {
            rf1.W("viewModel");
            throw null;
        }
        if (k71Var.j()) {
            k71 k71Var2 = this.G;
            if (k71Var2 == null) {
                rf1.W("viewModel");
                throw null;
            }
            k71Var2.m = null;
            k71Var2.k = 0;
            k71Var2.l = false;
            M();
            return;
        }
        LinearLayout linearLayout = this.l0;
        if (linearLayout == null) {
            rf1.W("panelSearch");
            throw null;
        }
        if (linearLayout.getVisibility() == 0) {
            L();
            return;
        }
        RecyclerView recyclerView = this.e0;
        if (recyclerView == null) {
            rf1.W("rvBanners");
            throw null;
        }
        recyclerView.setVisibility(0);
        RecyclerView recyclerView2 = this.f0;
        if (recyclerView2 == null) {
            rf1.W("rvSections");
            throw null;
        }
        recyclerView2.setVisibility(0);
        RecyclerView recyclerView3 = this.g0;
        if (recyclerView3 != null) {
            recyclerView3.setVisibility(8);
        } else {
            rf1.W("rvSearchResults");
            throw null;
        }
    }

    public final boolean F() {
        Application application = getApplication();
        application.getClass();
        return !((AppApplication) application).b().h();
    }

    public final void G() {
        Application application = getApplication();
        application.getClass();
        ot3 ot3VarG = ((AppApplication) application).b().g();
        String str = ot3VarG != null ? ot3VarG.f : null;
        Log.d("MainActivity", "loadProfileAvatar: isGuest=" + F() + ", user=" + (ot3VarG != null ? ot3VarG.b : null) + ", avatarUrl=" + str);
        if (!F() && str != null && !qb3.U(str)) {
            CircleImageView circleImageView = this.R;
            if (circleImageView == null) {
                rf1.W("ivProfile");
                throw null;
            }
            circleImageView.setColorFilter((ColorFilter) null);
            CircleImageView circleImageView2 = this.R;
            if (circleImageView2 != null) {
                m9.R(circleImageView2, str, null);
                return;
            } else {
                rf1.W("ivProfile");
                throw null;
            }
        }
        if (F()) {
            CircleImageView circleImageView3 = this.R;
            if (circleImageView3 == null) {
                rf1.W("ivProfile");
                throw null;
            }
            circleImageView3.setImageResource(R.drawable.profile);
            CircleImageView circleImageView4 = this.R;
            if (circleImageView4 != null) {
                circleImageView4.setColorFilter(getColor(R.color.text_secondary), PorterDuff.Mode.SRC_IN);
                return;
            } else {
                rf1.W("ivProfile");
                throw null;
            }
        }
        String upperCase = "";
        if (ot3VarG != null) {
            String str2 = ot3VarG.d;
            if (str2 == null || qb3.U(str2)) {
                String str3 = ot3VarG.b;
                if (str3 != null && !qb3.U(str3)) {
                    String strValueOf = String.valueOf(qb3.O(qb3.h0(str3).toString()));
                    strValueOf.getClass();
                    upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                }
            } else {
                String strValueOf2 = String.valueOf(qb3.O(qb3.h0(str2).toString()));
                strValueOf2.getClass();
                upperCase = strValueOf2.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            }
        }
        CircleImageView circleImageView5 = this.R;
        if (circleImageView5 == null) {
            rf1.W("ivProfile");
            throw null;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.profile_avatar_size);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f = dimensionPixelSize;
        float f2 = f / 2.0f;
        Paint paint = new Paint(1);
        paint.setColor(getColor(R.color.colorPrimary));
        canvas.drawCircle(f2, f2, f2, paint);
        if (!qb3.U(upperCase)) {
            Paint paint2 = new Paint(1);
            paint2.setColor(-1);
            paint2.setTextSize(f * 0.45f);
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setTypeface(Typeface.DEFAULT_BOLD);
            canvas.drawText(upperCase, f2, (((paint2.descent() - paint2.ascent()) / 2.0f) - paint2.descent()) + f2, paint2);
        }
        circleImageView5.setImageDrawable(new BitmapDrawable(getResources(), bitmapCreateBitmap));
    }

    public final void H(String str) throws Exception {
        str.getClass();
        Intent intentPutExtra = new Intent(this, (Class<?>) AppDetailActivity.class).putExtra("app_id", str);
        intentPutExtra.getClass();
        this.N.z(intentPutExtra);
    }

    public final void I() {
        if (this.q0 == null) {
            return;
        }
        ft3 ft3Var = this.r0;
        if (ft3Var == null) {
            rf1.W("updateAdapter");
            throw null;
        }
        boolean zIsEmpty = ft3Var.g.isEmpty();
        MaterialButton materialButton = this.q0;
        if (materialButton == null) {
            rf1.W("btnUpdateAll");
            throw null;
        }
        materialButton.setText(!zIsEmpty ? getString(R.string.cancel_all) : getString(R.string.update_all));
        MaterialButton materialButton2 = this.q0;
        if (materialButton2 == null) {
            rf1.W("btnUpdateAll");
            throw null;
        }
        materialButton2.setBackgroundTintList(ColorStateList.valueOf(!zIsEmpty ? getColor(android.R.color.holo_red_light) : getColor(R.color.colorPrimary)));
        iw1 iw1Var = this.O0;
        Handler handler = this.N0;
        if (zIsEmpty) {
            handler.removeCallbacks(iw1Var);
        } else {
            handler.removeCallbacks(iw1Var);
            handler.post(iw1Var);
        }
    }

    public final boolean J(String str) {
        if (!F()) {
            return false;
        }
        kx1 kx1Var = new kx1(this, 0);
        f6 f6Var = (f6) kx1Var.g;
        f6Var.d = getString(R.string.login_required_title);
        f6Var.f = str;
        String string = getString(R.string.login);
        qv1 qv1Var = new qv1(1, this);
        f6Var.g = string;
        f6Var.h = qv1Var;
        f6Var.i = getString(R.string.cancel);
        f6Var.j = null;
        kx1Var.m().show();
        return true;
    }

    public final void K(int i) {
        Object obj;
        if (i == R.id.nav_apps) {
            obj = "Applications";
        } else {
            obj = i == R.id.nav_games ? "Games" : null;
        }
        ag2 ag2Var = this.K0;
        if (obj != null && ag2Var.h() != i) {
            k71 k71Var = this.G;
            if (k71Var == null) {
                rf1.W("viewModel");
                throw null;
            }
            if (!obj.equals(k71Var.x.d())) {
                v03 v03Var = this.t0;
                if (v03Var == null) {
                    rf1.W("sectionAdapter");
                    throw null;
                }
                v03Var.g = SystemClock.uptimeMillis();
                v03Var.h = -1;
            }
        }
        ag2Var.i(i);
        if (i == R.id.nav_apps) {
            k71 k71Var2 = this.G;
            if (k71Var2 != null) {
                k71Var2.o("Applications");
                return;
            } else {
                rf1.W("viewModel");
                throw null;
            }
        }
        if (i == R.id.nav_games) {
            k71 k71Var3 = this.G;
            if (k71Var3 != null) {
                k71Var3.o("Games");
            } else {
                rf1.W("viewModel");
                throw null;
            }
        }
    }

    public final void L() {
        NestedScrollView nestedScrollView = this.m0;
        if (nestedScrollView == null) {
            rf1.W("panelSearchExplorer");
            throw null;
        }
        nestedScrollView.setVisibility(0);
        FrameLayout frameLayout = this.h0;
        if (frameLayout == null) {
            rf1.W("flSearchResultsContainer");
            throw null;
        }
        frameLayout.setVisibility(8);
        RecyclerView recyclerView = this.g0;
        if (recyclerView == null) {
            rf1.W("rvSearchResults");
            throw null;
        }
        recyclerView.setVisibility(8);
        RecyclerView recyclerView2 = this.A0;
        if (recyclerView2 == null) {
            rf1.W("rvCategoryPicker");
            throw null;
        }
        recyclerView2.setVisibility(8);
        this.M0 = false;
        yq yqVar = this.u0;
        if (yqVar == null) {
            rf1.W("searchAdapter");
            throw null;
        }
        yqVar.j(null);
        TextView textView = this.J0;
        if (textView == null) {
            rf1.W("tvSearchEmpty");
            throw null;
        }
        textView.setVisibility(8);
        ShimmerFrameLayout shimmerFrameLayout = this.i0;
        if (shimmerFrameLayout == null) {
            rf1.W("shimmerSearch");
            throw null;
        }
        shimmerFrameLayout.setVisibility(8);
        ShimmerFrameLayout shimmerFrameLayout2 = this.i0;
        if (shimmerFrameLayout2 == null) {
            rf1.W("shimmerSearch");
            throw null;
        }
        shimmerFrameLayout2.d();
        k71 k71Var = this.G;
        if (k71Var == null) {
            rf1.W("viewModel");
            throw null;
        }
        if (rf1.o(k71Var.t.d(), Boolean.TRUE)) {
            FrameLayout frameLayout2 = this.h0;
            if (frameLayout2 == null) {
                rf1.W("flSearchResultsContainer");
                throw null;
            }
            frameLayout2.setVisibility(0);
            ShimmerFrameLayout shimmerFrameLayout3 = this.i0;
            if (shimmerFrameLayout3 == null) {
                rf1.W("shimmerSearch");
                throw null;
            }
            shimmerFrameLayout3.setVisibility(0);
            ShimmerFrameLayout shimmerFrameLayout4 = this.i0;
            if (shimmerFrameLayout4 == null) {
                rf1.W("shimmerSearch");
                throw null;
            }
            shimmerFrameLayout4.c();
            NestedScrollView nestedScrollView2 = this.m0;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setVisibility(8);
            } else {
                rf1.W("panelSearchExplorer");
                throw null;
            }
        }
    }

    public final void M() {
        NestedScrollView nestedScrollView = this.m0;
        if (nestedScrollView == null) {
            rf1.W("panelSearchExplorer");
            throw null;
        }
        nestedScrollView.setVisibility(8);
        FrameLayout frameLayout = this.h0;
        if (frameLayout == null) {
            rf1.W("flSearchResultsContainer");
            throw null;
        }
        frameLayout.setVisibility(0);
        RecyclerView recyclerView = this.g0;
        if (recyclerView == null) {
            rf1.W("rvSearchResults");
            throw null;
        }
        recyclerView.setVisibility(0);
        RecyclerView recyclerView2 = this.A0;
        if (recyclerView2 == null) {
            rf1.W("rvCategoryPicker");
            throw null;
        }
        recyclerView2.setVisibility(0);
        this.M0 = true;
        TextView textView = this.J0;
        if (textView == null) {
            rf1.W("tvSearchEmpty");
            throw null;
        }
        textView.setVisibility(8);
        yq yqVar = this.u0;
        if (yqVar == null) {
            rf1.W("searchAdapter");
            throw null;
        }
        yqVar.j(null);
        k71 k71Var = this.G;
        if (k71Var == null) {
            rf1.W("viewModel");
            throw null;
        }
        List list = (List) k71Var.s.d();
        if (list == null || list.isEmpty()) {
            return;
        }
        yq yqVar2 = this.u0;
        if (yqVar2 != null) {
            yqVar2.j(list);
        } else {
            rf1.W("searchAdapter");
            throw null;
        }
    }

    public final void N() {
        NestedScrollView nestedScrollView = this.j0;
        if (nestedScrollView == null) {
            rf1.W("nestedScrollHome");
            throw null;
        }
        nestedScrollView.setVisibility(8);
        LinearLayout linearLayout = this.k0;
        if (linearLayout == null) {
            rf1.W("panelUpdates");
            throw null;
        }
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.l0;
        if (linearLayout2 == null) {
            rf1.W("panelSearch");
            throw null;
        }
        linearLayout2.setVisibility(0);
        ImageView imageView = this.S;
        if (imageView == null) {
            rf1.W("ivAppLogo");
            throw null;
        }
        imageView.setVisibility(8);
        ComposeView composeView = this.T;
        if (composeView == null) {
            rf1.W("cvAppWordmark");
            throw null;
        }
        composeView.setVisibility(8);
        FrameLayout frameLayout = this.W;
        if (frameLayout == null) {
            rf1.W("notificationBadgeContainer");
            throw null;
        }
        frameLayout.setVisibility(8);
        View view = this.Z;
        if (view == null) {
            rf1.W("headerSpacer");
            throw null;
        }
        view.setVisibility(8);
        MaterialCardView materialCardView = this.a0;
        if (materialCardView == null) {
            rf1.W("headerSearchBar");
            throw null;
        }
        materialCardView.setVisibility(0);
        ImageView imageView2 = this.V;
        if (imageView2 == null) {
            rf1.W("ivPriceFilter");
            throw null;
        }
        imageView2.setVisibility(0);
        CircleImageView circleImageView = this.R;
        if (circleImageView == null) {
            rf1.W("ivProfile");
            throw null;
        }
        circleImageView.setVisibility(8);
        EditText editText = this.M;
        if (editText == null) {
            rf1.W("etSearch");
            throw null;
        }
        editText.setText("");
        L();
        k71 k71Var = this.G;
        if (k71Var == null) {
            rf1.W("viewModel");
            throw null;
        }
        k71Var.n("");
        k71 k71Var2 = this.G;
        if (k71Var2 != null) {
            k71Var2.g();
        } else {
            rf1.W("viewModel");
            throw null;
        }
    }

    public final void O() {
        NestedScrollView nestedScrollView = this.m0;
        if (nestedScrollView == null) {
            rf1.W("panelSearchExplorer");
            throw null;
        }
        nestedScrollView.setVisibility(8);
        FrameLayout frameLayout = this.h0;
        if (frameLayout == null) {
            rf1.W("flSearchResultsContainer");
            throw null;
        }
        frameLayout.setVisibility(0);
        RecyclerView recyclerView = this.e0;
        if (recyclerView == null) {
            rf1.W("rvBanners");
            throw null;
        }
        recyclerView.setVisibility(8);
        RecyclerView recyclerView2 = this.f0;
        if (recyclerView2 == null) {
            rf1.W("rvSections");
            throw null;
        }
        recyclerView2.setVisibility(8);
        RecyclerView recyclerView3 = this.g0;
        if (recyclerView3 == null) {
            rf1.W("rvSearchResults");
            throw null;
        }
        recyclerView3.setVisibility(0);
        RecyclerView recyclerView4 = this.A0;
        if (recyclerView4 == null) {
            rf1.W("rvCategoryPicker");
            throw null;
        }
        k71 k71Var = this.G;
        if (k71Var == null) {
            rf1.W("viewModel");
            throw null;
        }
        recyclerView4.setVisibility(k71Var.j() ? 0 : 8);
        this.M0 = false;
        yq yqVar = this.u0;
        if (yqVar == null) {
            rf1.W("searchAdapter");
            throw null;
        }
        yqVar.j(null);
        TextView textView = this.J0;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            rf1.W("tvSearchEmpty");
            throw null;
        }
    }

    public final void P(int i) {
        this.Y = i;
        if (this.X == null) {
            Log.w("MainActivity", "updateNotificationBadge: tvNotificationBadge aún no inicializado, count=" + i);
            return;
        }
        c40.C(i, "updateNotificationBadge: count=", "MainActivity");
        TextView textView = this.X;
        if (i <= 0) {
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                rf1.W("tvNotificationBadge");
                throw null;
            }
        }
        if (textView == null) {
            rf1.W("tvNotificationBadge");
            throw null;
        }
        textView.setText(String.valueOf(i));
        TextView textView2 = this.X;
        if (textView2 != null) {
            textView2.setVisibility(0);
        } else {
            rf1.W("tvNotificationBadge");
            throw null;
        }
    }

    @Override // defpackage.vi, defpackage.y50, defpackage.x50, android.app.Activity
    public final void onCreate(Bundle bundle) {
        un0.a(this);
        super.onCreate(bundle);
        this.L = bundle != null;
        b().a(new fq(2, this, false), this);
        Application application = getApplication();
        application.getClass();
        AppApplication appApplication = (AppApplication) application;
        u00 u00Var = appApplication.j;
        if (u00Var == null) {
            rf1.W("getHomeDataUseCase");
            throw null;
        }
        y21 y21Var = appApplication.k;
        if (y21Var == null) {
            rf1.W("searchAppsUseCase");
            throw null;
        }
        this.G = new k71(u00Var, y21Var, appApplication.a());
        v22 v22Var = it3.f;
        u00 u00Var2 = appApplication.m;
        if (u00Var2 == null) {
            rf1.W("getUpdatesUseCase");
            throw null;
        }
        g22 g22Var = new g22(g(), new ht3(u00Var2), e());
        r20 r20VarA = sq2.a(it3.class);
        String qualifiedName = r20VarA.getQualifiedName();
        if (qualifiedName == null) {
            c.j("Local and anonymous classes can not be ViewModels");
        } else {
            this.H = (it3) g22Var.M(r20VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName));
            z50.a(this, new f60(-1204148067, true, new vv1(this, 8)));
        }
    }

    @Override // defpackage.vi, android.app.Activity
    public final void onDestroy() {
        Application application = getApplication();
        application.getClass();
        v42 v42Var = ((AppApplication) application).i;
        if (v42Var == null) {
            rf1.W("natManager");
            throw null;
        }
        v42Var.b = null;
        this.B0.removeCallbacksAndMessages(null);
        this.P.removeCallbacksAndMessages(null);
        this.C0.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // defpackage.vi, android.app.Activity
    public final void onPause() {
        super.onPause();
        u00 u00Var = this.E0;
        if (u00Var != null) {
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) u00Var.f;
            shimmerFrameLayout.d();
            shimmerFrameLayout.setVisibility(8);
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) u00Var.g;
            shimmerFrameLayout2.d();
            shimmerFrameLayout2.setVisibility(8);
        }
        try {
            unregisterReceiver(this.c0);
            unregisterReceiver(this.d0);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.vi, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean zF = F();
        Application application = getApplication();
        application.getClass();
        Log.d("MainActivity", "onResume: isGuest=" + zF + ", isLoggedIn=" + ((AppApplication) application).b().h());
        boolean z = this.K;
        boolean z2 = true;
        this.K = true;
        if (this.L && !z) {
            z2 = false;
        }
        if (this.R != null) {
            G();
        }
        if (this.H != null && z2) {
            Log.d("MainActivity", "Loading updates in onResume (recreation=" + this.L + ")");
            it3 it3Var = this.H;
            if (it3Var == null) {
                rf1.W("updatesViewModel");
                throw null;
            }
            it3Var.e();
        }
        if (this.X != null) {
            if (z2) {
                D();
            } else {
                B();
            }
        }
        if (this.r0 != null) {
            ConcurrentHashMap.KeySetView keySetView = ApkDownloadService.u;
            HashSet hashSet = new HashSet(ApkDownloadService.u);
            ft3 ft3Var = this.r0;
            if (ft3Var == null) {
                rf1.W("updateAdapter");
                throw null;
            }
            LinkedHashSet linkedHashSet = ft3Var.g;
            ArrayList arrayList = new ArrayList();
            for (Object obj : linkedHashSet) {
                if (!hashSet.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            Set<String> setJ0 = p30.J0(arrayList);
            if (!setJ0.isEmpty()) {
                for (String str : setJ0) {
                    linkedHashSet.remove(str);
                    ft3Var.h.remove(str);
                }
                ft3Var.c();
            }
            I();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("cu.uci.android.apklis.DOWNLOAD_COMPLETE");
        intentFilter.addAction("cu.uci.android.apklis.DOWNLOAD_FAILED");
        intentFilter.addAction("cu.uci.android.apklis.DOWNLOAD_CANCELLED");
        intentFilter.addAction("cu.uci.android.apklis.DOWNLOAD_PROGRESS");
        int i = Build.VERSION.SDK_INT;
        hw1 hw1Var = this.c0;
        if (i < 33 && i < 32) {
            registerReceiver(hw1Var, intentFilter);
        } else {
            registerReceiver(hw1Var, intentFilter, 4);
        }
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter2.addDataScheme("package");
        hw1 hw1Var2 = this.d0;
        if (i >= 33) {
            registerReceiver(hw1Var2, intentFilter2, 4);
        } else if (i >= 32) {
            registerReceiver(hw1Var2, intentFilter2, 4);
        } else {
            registerReceiver(hw1Var2, intentFilter2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(final o10 o10Var, v11 v11Var, v11 v11Var2, h12 h12Var, n70 n70Var, int i) {
        final v11 v11Var3;
        boolean z;
        Object obj;
        boolean z2;
        boolean z3;
        final int i2;
        Object obj2;
        final int i3;
        Object obj3;
        final v11 v11Var4 = v11Var2;
        n70Var.g0(-1067151694);
        int i4 = i | (n70Var.h(o10Var) ? 4 : 2) | (n70Var.h(v11Var) ? 32 : 16) | (n70Var.h(v11Var4) ? 256 : 128) | (n70Var.f(h12Var) ? 2048 : 1024);
        if (n70Var.W(i4 & 1, (i4 & 1171) != 1170)) {
            t32 t32VarA = nr3.A(o10Var.h, n70Var);
            t32 t32VarA2 = nr3.A(o10Var.f, n70Var);
            t32 t32VarA3 = nr3.A(o10Var.j, n70Var);
            jh0 jh0Var = (jh0) n70Var.j(d80.h);
            float fC = jh0Var.c();
            float fM = jh0Var.m();
            View view = (View) n70Var.j(r9.f);
            int identifier = view.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            float dimension = identifier > 0 ? view.getResources().getDimension(identifier) / fC : 0.0f;
            jh0Var.l0((Math.max(0.0f, fM - 1.0f) * 28.0f) + 80.0f + dimension + 20.0f);
            h12 h12VarA0 = m9.a0(h12Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            ss ssVar = xv.g;
            ny1 ny1VarD = hu.d(ssVar, false);
            long j = n70Var.T;
            int i5 = (int) (j ^ (j >>> 32));
            xh2 xh2VarL = n70Var.l();
            h12 h12VarZ = n31.z(n70Var, h12VarA0);
            f70.b.getClass();
            k11 k11Var = e70.b;
            n70Var.i0();
            if (n70Var.S) {
                n70Var.k(k11Var);
            } else {
                n70Var.r0();
            }
            he heVar = e70.f;
            ke2.p(n70Var, heVar, ny1VarD);
            he heVar2 = e70.e;
            ke2.p(n70Var, heVar2, xh2VarL);
            Integer numValueOf = Integer.valueOf(i5);
            he heVar3 = e70.g;
            ke2.i(n70Var, numValueOf, heVar3);
            s8 s8Var = e70.h;
            ke2.m(n70Var, s8Var);
            he heVar4 = e70.d;
            ke2.p(n70Var, heVar4, h12VarZ);
            float f = dimension + 85.0f;
            ss ssVar2 = xv.o;
            mu muVar = mu.a;
            e12 e12Var = e12.a;
            h12 h12VarA1 = m9.a0(muVar.a(e12Var, ssVar2), 0.0f, 0.0f, 0.0f, f, 7);
            ny1 ny1VarD2 = hu.d(ssVar, false);
            long j2 = n70Var.T;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            xh2 xh2VarL2 = n70Var.l();
            h12 h12VarZ2 = n31.z(n70Var, h12VarA1);
            n70Var.i0();
            if (n70Var.S) {
                n70Var.k(k11Var);
            } else {
                n70Var.r0();
            }
            ke2.p(n70Var, heVar, ny1VarD2);
            ke2.p(n70Var, heVar2, xh2VarL2);
            c40.B(i6, n70Var, heVar3, n70Var, s8Var);
            ke2.p(n70Var, heVar4, h12VarZ2);
            int i7 = i4 & 14;
            boolean z4 = i7 == 4 || n70Var.h(o10Var);
            Object objR = n70Var.R();
            Object obj4 = h70.a;
            if (z4 || objR == obj4) {
                z = true;
                Object m10Var = new m10(o10Var, true ? 1 : 0);
                n70Var.o0(m10Var);
                obj = m10Var;
            } else {
                z = true;
                obj = objR;
            }
            nr3.h((k11) obj, null, n70Var, 0);
            n70Var.q(z);
            if (((Boolean) t32VarA.getValue()).booleanValue()) {
                n70Var.f0(678837363);
                h12 h12VarF = q31.F(q31.Y(muVar.a(e12Var, ssVar2), new ju3(17)));
                ny1 ny1VarD3 = hu.d(ssVar, false);
                long j3 = n70Var.T;
                int i8 = (int) (j3 ^ (j3 >>> 32));
                xh2 xh2VarL3 = n70Var.l();
                h12 h12VarZ3 = n31.z(n70Var, h12VarF);
                n70Var.i0();
                if (n70Var.S) {
                    n70Var.k(k11Var);
                } else {
                    n70Var.r0();
                }
                ke2.p(n70Var, heVar, ny1VarD3);
                ke2.p(n70Var, heVar2, xh2VarL3);
                c40.B(i8, n70Var, heVar3, n70Var, s8Var);
                ke2.p(n70Var, heVar4, h12VarZ3);
                List list = (List) t32VarA2.getValue();
                boolean zBooleanValue = ((Boolean) t32VarA3.getValue()).booleanValue();
                boolean z5 = i7 == 4 || n70Var.h(o10Var);
                Object objR2 = n70Var.R();
                Object obj5 = objR2;
                if (z5 || objR2 == obj4) {
                    Object uVar = new u(21, o10Var);
                    n70Var.o0(uVar);
                    obj5 = uVar;
                }
                v11 v11Var5 = (v11) obj5;
                boolean z6 = ((i4 & 112) == 32) | (i7 == 4 || n70Var.h(o10Var));
                Object objR3 = n70Var.R();
                if (z6 || objR3 == obj4) {
                    v11Var3 = v11Var;
                    i2 = 0;
                    Object obj6 = new v11() { // from class: wv1
                        @Override // defpackage.v11
                        public final Object g(Object obj7) {
                            int i9 = i2;
                            os3 os3Var = os3.a;
                            v11 v11Var6 = v11Var3;
                            o10 o10Var2 = o10Var;
                            String str = (String) obj7;
                            switch (i9) {
                                case 0:
                                    int i10 = MainActivity.Q0;
                                    str.getClass();
                                    o10Var2.l.h(null);
                                    la3 la3Var = o10Var2.g;
                                    Boolean bool = Boolean.FALSE;
                                    la3Var.getClass();
                                    la3Var.i(null, bool);
                                    v11Var6.g(str);
                                    break;
                                default:
                                    int i11 = MainActivity.Q0;
                                    str.getClass();
                                    o10Var2.l.h(null);
                                    la3 la3Var2 = o10Var2.g;
                                    Boolean bool2 = Boolean.FALSE;
                                    la3Var2.getClass();
                                    la3Var2.i(null, bool2);
                                    v11Var6.g(str);
                                    break;
                            }
                            return os3Var;
                        }
                    };
                    n70Var.o0(obj6);
                    obj2 = obj6;
                } else {
                    v11Var3 = v11Var;
                    i2 = 0;
                    obj2 = objR3;
                }
                v11 v11Var6 = (v11) obj2;
                int i9 = ((i4 & 896) == 256 ? 1 : i2) | ((i7 == 4 || n70Var.h(o10Var)) ? 1 : i2);
                Object objR4 = n70Var.R();
                if (i9 != 0 || objR4 == obj4) {
                    v11Var4 = v11Var2;
                    i3 = 1;
                    Object obj7 = new v11() { // from class: wv1
                        @Override // defpackage.v11
                        public final Object g(Object obj8) {
                            int i10 = i3;
                            os3 os3Var = os3.a;
                            v11 v11Var7 = v11Var4;
                            o10 o10Var2 = o10Var;
                            String str = (String) obj8;
                            switch (i10) {
                                case 0:
                                    int i11 = MainActivity.Q0;
                                    str.getClass();
                                    o10Var2.l.h(null);
                                    la3 la3Var = o10Var2.g;
                                    Boolean bool = Boolean.FALSE;
                                    la3Var.getClass();
                                    la3Var.i(null, bool);
                                    v11Var7.g(str);
                                    break;
                                default:
                                    int i12 = MainActivity.Q0;
                                    str.getClass();
                                    o10Var2.l.h(null);
                                    la3 la3Var2 = o10Var2.g;
                                    Boolean bool2 = Boolean.FALSE;
                                    la3Var2.getClass();
                                    la3Var2.i(null, bool2);
                                    v11Var7.g(str);
                                    break;
                            }
                            return os3Var;
                        }
                    };
                    n70Var.o0(obj7);
                    obj3 = obj7;
                } else {
                    v11Var4 = v11Var2;
                    i3 = 1;
                    obj3 = objR4;
                }
                v11 v11Var7 = (v11) obj3;
                int i10 = (i7 == 4 || n70Var.h(o10Var)) ? i3 : i2;
                Object objR5 = n70Var.R();
                Object obj8 = objR5;
                if (i10 != 0 || objR5 == obj4) {
                    Object m10Var2 = new m10(o10Var, 2);
                    n70Var.o0(m10Var2);
                    obj8 = m10Var2;
                }
                k11 k11Var2 = (k11) obj8;
                z2 = i2;
                boolean z7 = i3;
                au3.c(list, zBooleanValue, v11Var5, v11Var6, v11Var7, k11Var2, n70Var, 0);
                n70Var.q(z7);
                z3 = z7;
            } else {
                v11Var3 = v11Var;
                v11Var4 = v11Var2;
                z2 = 0;
                z3 = true;
                n70Var.f0(653838870);
            }
            n70Var.q(z2);
            n70Var.q(z3);
        } else {
            v11Var3 = v11Var;
            n70Var.Z();
        }
        oo2 oo2VarU = n70Var.u();
        if (oo2VarU != null) {
            oo2VarU.d = new th0(this, o10Var, v11Var3, v11Var4, h12Var, i);
        }
    }

    public final void v(v11 v11Var, n70 n70Var, int i) {
        n70Var.g0(131753383);
        int i2 = (n70Var.h(v11Var) ? 4 : 2) | i | (n70Var.h(this) ? 32 : 16);
        if (n70Var.W(i2 & 1, (i2 & 19) != 18)) {
            li.a(false, tt3.N(-1434518364, new ew1(this, v11Var), n70Var), n70Var, 48);
        } else {
            n70Var.Z();
        }
        oo2 oo2VarU = n70Var.u();
        if (oo2VarU != null) {
            oo2VarU.d = new ew1(this, v11Var, i);
        }
    }

    public final void w(final int i, final int i2, v11 v11Var, h12 h12Var, n70 n70Var, int i3) {
        final v11 v11Var2;
        int i4;
        int i5;
        MainActivity mainActivity;
        n70Var.g0(1868171986);
        int i6 = (n70Var.d(i) ? 4 : 2) | i3 | (n70Var.d(i2) ? 32 : 16) | (n70Var.h(v11Var) ? 256 : 128) | (n70Var.f(h12Var) ? 2048 : 1024) | (n70Var.h(this) ? 16384 : 8192);
        if (n70Var.W(i6 & 1, (i6 & 9363) != 9362)) {
            final tj3 tj3VarQ = fc2.q(n70Var);
            final jh0 jh0Var = (jh0) n70Var.j(d80.h);
            h12 h12VarX = m9.X(q31.J(n31.k(x63.e(h12Var, 64.0f, 110.0f), ((b40) n70Var.j(d40.a)).p, ey1.w)), 4.0f, 4.0f);
            v11Var2 = v11Var;
            a21 a21Var = new a21() { // from class: yv1
                /* JADX WARN: Code duplicated, block: B:53:0x01b4  */
                /* JADX WARN: Code duplicated, block: B:55:0x01b7  */
                /* JADX WARN: Code duplicated, block: B:59:0x01cb  */
                /* JADX WARN: Code duplicated, block: B:62:0x01e9  */
                /* JADX WARN: Code duplicated, block: B:63:0x01eb  */
                /* JADX WARN: Code duplicated, block: B:67:0x0200  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.a21
                public final Object d(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
                    jw jwVar;
                    boolean z;
                    final int i7;
                    boolean zF;
                    Object objR;
                    boolean z2;
                    final int i8;
                    boolean zF2;
                    Object objR2;
                    nu nuVar = (nu) obj;
                    n70 n70Var2 = (n70) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i9 = MainActivity.Q0;
                    nuVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= n70Var2.f(nuVar) ? 4 : 2;
                    }
                    final int i10 = 0;
                    final int i11 = 1;
                    if (n70Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        MainActivity mainActivity2 = this.e;
                        List listX = me1.X(mainActivity2.getString(R.string.nav_games), mainActivity2.getString(R.string.nav_apps), mainActivity2.getString(R.string.nav_search), mainActivity2.getString(R.string.nav_updates));
                        jh0 jh0Var2 = nuVar.a;
                        long j = nuVar.b;
                        float fW = jh0Var.w((d90.d(j) ? jh0Var2.j0(d90.h(j)) : Float.POSITIVE_INFINITY) / listX.size());
                        Iterator it = listX.iterator();
                        float f = 0.0f;
                        while (it.hasNext()) {
                            float f2 = (int) (tj3.a(tj3VarQ, new ch((String) it.next()), new gk3(0L, qc2.n(1), lz0.j, null, 0L, 0, 0L, 16777209)).c >> 32);
                            if (f2 > f) {
                                f = f2;
                            }
                        }
                        float fC = f > 0.0f ? le2.c((fW / f) * 0.9f, 6.0f, 12.0f) : 12.0f;
                        h12 h12VarC = x63.c(e12.a, 1.0f);
                        zw2 zw2VarA = xw2.a(m9.f, xv.q, n70Var2, 54);
                        long j2 = n70Var2.T;
                        int i12 = (int) (j2 ^ (j2 >>> 32));
                        xh2 xh2VarL = n70Var2.l();
                        h12 h12VarZ = n31.z(n70Var2, h12VarC);
                        f70.b.getClass();
                        c80 c80Var = e70.b;
                        n70Var2.i0();
                        if (n70Var2.S) {
                            n70Var2.k(c80Var);
                        } else {
                            n70Var2.r0();
                        }
                        ke2.p(n70Var2, e70.f, zw2VarA);
                        ke2.p(n70Var2, e70.e, xh2VarL);
                        ke2.i(n70Var2, Integer.valueOf(i12), e70.g);
                        ke2.m(n70Var2, e70.h);
                        ke2.p(n70Var2, e70.d, h12VarZ);
                        int i13 = i;
                        boolean z3 = i13 == R.id.nav_games;
                        String str = (String) listX.get(0);
                        final v11 v11Var3 = v11Var2;
                        boolean zF3 = n70Var2.f(v11Var3);
                        Object objR3 = n70Var2.R();
                        jw jwVar2 = h70.a;
                        if (zF3 || objR3 == jwVar2) {
                            objR3 = new k11() { // from class: zv1
                                @Override // defpackage.k11
                                public final Object a() {
                                    int i14 = i10;
                                    os3 os3Var = os3.a;
                                    v11 v11Var4 = v11Var3;
                                    switch (i14) {
                                        case 0:
                                            int i15 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_games));
                                            break;
                                        case 1:
                                            int i16 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_apps));
                                            break;
                                        case 2:
                                            int i17 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_search));
                                            break;
                                        default:
                                            int i18 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_updates));
                                            break;
                                    }
                                    return os3Var;
                                }
                            };
                            n70Var2.o0(objR3);
                        }
                        mainActivity2.x(z3, R.drawable.games_outline, str, (k11) objR3, fC, 0, ax2.h(), n70Var2, 0, 32);
                        boolean z4 = i13 == R.id.nav_apps;
                        String str2 = (String) listX.get(1);
                        boolean zF4 = n70Var2.f(v11Var3);
                        Object objR4 = n70Var2.R();
                        if (zF4) {
                            jwVar = jwVar2;
                        } else {
                            jwVar = jwVar2;
                            if (objR4 == jwVar) {
                            }
                            jw jwVar3 = jwVar;
                            mainActivity2.x(z4, R.drawable.apps_outline, str2, (k11) objR4, fC, 0, ax2.h(), n70Var2, 0, 32);
                            if (i13 == R.id.nav_search) {
                                z = true;
                            } else {
                                z = false;
                            }
                            i7 = 2;
                            String str3 = (String) listX.get(2);
                            zF = n70Var2.f(v11Var3);
                            objR = n70Var2.R();
                            if (zF || objR == jwVar3) {
                                objR = new k11() { // from class: zv1
                                    @Override // defpackage.k11
                                    public final Object a() {
                                        int i14 = i7;
                                        os3 os3Var = os3.a;
                                        v11 v11Var4 = v11Var3;
                                        switch (i14) {
                                            case 0:
                                                int i15 = MainActivity.Q0;
                                                v11Var4.g(Integer.valueOf(R.id.nav_games));
                                                break;
                                            case 1:
                                                int i16 = MainActivity.Q0;
                                                v11Var4.g(Integer.valueOf(R.id.nav_apps));
                                                break;
                                            case 2:
                                                int i17 = MainActivity.Q0;
                                                v11Var4.g(Integer.valueOf(R.id.nav_search));
                                                break;
                                            default:
                                                int i18 = MainActivity.Q0;
                                                v11Var4.g(Integer.valueOf(R.id.nav_updates));
                                                break;
                                        }
                                        return os3Var;
                                    }
                                };
                                n70Var2.o0(objR);
                            }
                            mainActivity2.x(z, R.drawable.ic_search, str3, (k11) objR, fC, 0, ax2.h(), n70Var2, 0, 32);
                            if (i13 == R.id.nav_updates) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i8 = 3;
                            String str4 = (String) listX.get(3);
                            zF2 = n70Var2.f(v11Var3);
                            objR2 = n70Var2.R();
                            if (zF2 || objR2 == jwVar3) {
                                objR2 = new k11() { // from class: zv1
                                    @Override // defpackage.k11
                                    public final Object a() {
                                        int i14 = i8;
                                        os3 os3Var = os3.a;
                                        v11 v11Var4 = v11Var3;
                                        switch (i14) {
                                            case 0:
                                                int i15 = MainActivity.Q0;
                                                v11Var4.g(Integer.valueOf(R.id.nav_games));
                                                break;
                                            case 1:
                                                int i16 = MainActivity.Q0;
                                                v11Var4.g(Integer.valueOf(R.id.nav_apps));
                                                break;
                                            case 2:
                                                int i17 = MainActivity.Q0;
                                                v11Var4.g(Integer.valueOf(R.id.nav_search));
                                                break;
                                            default:
                                                int i18 = MainActivity.Q0;
                                                v11Var4.g(Integer.valueOf(R.id.nav_updates));
                                                break;
                                        }
                                        return os3Var;
                                    }
                                };
                                n70Var2.o0(objR2);
                            }
                            mainActivity2.x(z2, R.drawable.ic_updates, str4, (k11) objR2, fC, i2, ax2.h(), n70Var2, 0, 0);
                            n70Var2.q(true);
                        }
                        objR4 = new k11() { // from class: zv1
                            @Override // defpackage.k11
                            public final Object a() {
                                int i14 = i11;
                                os3 os3Var = os3.a;
                                v11 v11Var4 = v11Var3;
                                switch (i14) {
                                    case 0:
                                        int i15 = MainActivity.Q0;
                                        v11Var4.g(Integer.valueOf(R.id.nav_games));
                                        break;
                                    case 1:
                                        int i16 = MainActivity.Q0;
                                        v11Var4.g(Integer.valueOf(R.id.nav_apps));
                                        break;
                                    case 2:
                                        int i17 = MainActivity.Q0;
                                        v11Var4.g(Integer.valueOf(R.id.nav_search));
                                        break;
                                    default:
                                        int i18 = MainActivity.Q0;
                                        v11Var4.g(Integer.valueOf(R.id.nav_updates));
                                        break;
                                }
                                return os3Var;
                            }
                        };
                        n70Var2.o0(objR4);
                        jw jwVar4 = jwVar;
                        mainActivity2.x(z4, R.drawable.apps_outline, str2, (k11) objR4, fC, 0, ax2.h(), n70Var2, 0, 32);
                        if (i13 == R.id.nav_search) {
                            z = true;
                        } else {
                            z = false;
                        }
                        i7 = 2;
                        String str5 = (String) listX.get(2);
                        zF = n70Var2.f(v11Var3);
                        objR = n70Var2.R();
                        if (zF) {
                            objR = new k11() { // from class: zv1
                                @Override // defpackage.k11
                                public final Object a() {
                                    int i14 = i7;
                                    os3 os3Var = os3.a;
                                    v11 v11Var4 = v11Var3;
                                    switch (i14) {
                                        case 0:
                                            int i15 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_games));
                                            break;
                                        case 1:
                                            int i16 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_apps));
                                            break;
                                        case 2:
                                            int i17 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_search));
                                            break;
                                        default:
                                            int i18 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_updates));
                                            break;
                                    }
                                    return os3Var;
                                }
                            };
                            n70Var2.o0(objR);
                        } else {
                            objR = new k11() { // from class: zv1
                                @Override // defpackage.k11
                                public final Object a() {
                                    int i14 = i7;
                                    os3 os3Var = os3.a;
                                    v11 v11Var4 = v11Var3;
                                    switch (i14) {
                                        case 0:
                                            int i15 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_games));
                                            break;
                                        case 1:
                                            int i16 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_apps));
                                            break;
                                        case 2:
                                            int i17 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_search));
                                            break;
                                        default:
                                            int i18 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_updates));
                                            break;
                                    }
                                    return os3Var;
                                }
                            };
                            n70Var2.o0(objR);
                        }
                        mainActivity2.x(z, R.drawable.ic_search, str5, (k11) objR, fC, 0, ax2.h(), n70Var2, 0, 32);
                        if (i13 == R.id.nav_updates) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        i8 = 3;
                        String str6 = (String) listX.get(3);
                        zF2 = n70Var2.f(v11Var3);
                        objR2 = n70Var2.R();
                        if (zF2) {
                            objR2 = new k11() { // from class: zv1
                                @Override // defpackage.k11
                                public final Object a() {
                                    int i14 = i8;
                                    os3 os3Var = os3.a;
                                    v11 v11Var4 = v11Var3;
                                    switch (i14) {
                                        case 0:
                                            int i15 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_games));
                                            break;
                                        case 1:
                                            int i16 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_apps));
                                            break;
                                        case 2:
                                            int i17 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_search));
                                            break;
                                        default:
                                            int i18 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_updates));
                                            break;
                                    }
                                    return os3Var;
                                }
                            };
                            n70Var2.o0(objR2);
                        } else {
                            objR2 = new k11() { // from class: zv1
                                @Override // defpackage.k11
                                public final Object a() {
                                    int i14 = i8;
                                    os3 os3Var = os3.a;
                                    v11 v11Var4 = v11Var3;
                                    switch (i14) {
                                        case 0:
                                            int i15 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_games));
                                            break;
                                        case 1:
                                            int i16 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_apps));
                                            break;
                                        case 2:
                                            int i17 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_search));
                                            break;
                                        default:
                                            int i18 = MainActivity.Q0;
                                            v11Var4.g(Integer.valueOf(R.id.nav_updates));
                                            break;
                                    }
                                    return os3Var;
                                }
                            };
                            n70Var2.o0(objR2);
                        }
                        mainActivity2.x(z2, R.drawable.ic_updates, str6, (k11) objR2, fC, i2, ax2.h(), n70Var2, 0, 0);
                        n70Var2.q(true);
                    } else {
                        n70Var2.Z();
                    }
                    return os3.a;
                }
            };
            mainActivity = this;
            i5 = i;
            i4 = i2;
            me1.b(h12VarX, null, tt3.N(1019624636, a21Var, n70Var), n70Var, 3072);
        } else {
            v11Var2 = v11Var;
            i4 = i2;
            i5 = i;
            mainActivity = this;
            n70Var.Z();
        }
        oo2 oo2VarU = n70Var.u();
        if (oo2VarU != null) {
            oo2VarU.d = new dm1(mainActivity, i5, i4, v11Var2, h12Var, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    public final void x(final boolean z, final int i, final String str, final k11 k11Var, float f, int i2, final h12 h12Var, n70 n70Var, final int i3, final int i4) throws XmlPullParserException, IOException {
        int i5;
        int i6;
        final int i7;
        int i8;
        long j;
        long jB;
        long jB2;
        e12 e12Var;
        boolean z2;
        h12 h12VarT;
        int i9;
        int i10;
        final float f2 = f;
        n70 n70Var2 = n70Var;
        n70Var2.g0(439249673);
        int i11 = i3 | (n70Var2.g(z) ? 4 : 2) | (n70Var2.d(i) ? 32 : 16) | (n70Var2.f(str) ? 256 : 128) | (n70Var2.h(k11Var) ? 2048 : 1024) | (n70Var2.c(f2) ? 16384 : 8192);
        int i12 = i4 & 32;
        if (i12 != 0) {
            i6 = i11 | 196608;
            i5 = i2;
        } else {
            i5 = i2;
            i6 = i11 | (n70Var2.d(i5) ? 131072 : 65536);
        }
        int i13 = i6 | (n70Var2.f(h12Var) ? 1048576 : 524288);
        if (n70Var2.W(i13 & 1, (599187 & i13) != 599186)) {
            int i14 = i12 != 0 ? 0 : i5;
            jh0 jh0Var = (jh0) n70Var2.j(d80.h);
            float fL0 = jh0Var.l0(Math.max(1.0f, jh0Var.m()) * 12.0f);
            long jE = qf1.e(4294940672L);
            Context context = (Context) n70Var2.j(r9.b);
            context.getClass();
            long jE2 = (context.getResources().getConfiguration().uiMode & 48) == 32 ? qf1.e(4292926937L) : qf1.e(4284572001L);
            if (z) {
                if (i == R.drawable.games_outline) {
                    i10 = R.drawable.games;
                } else if (i == R.drawable.apps_outline) {
                    i10 = R.drawable.apps;
                } else if (i == R.drawable.ic_updates) {
                    i10 = R.drawable.ic_updates_filled;
                } else {
                    i8 = i;
                }
                i8 = i10;
            } else {
                i8 = i;
            }
            Object objR = n70Var2.R();
            jw jwVar = h70.a;
            if (objR == jwVar) {
                objR = new u22();
                n70Var2.o0(objR);
            }
            u22 u22Var = (u22) objR;
            float f3 = z ? 0.65f : 0.0f;
            yc0 yc0Var = pn0.a;
            ia3 ia3VarB = bf.b(f3, nr3.a0(200, 0, yc0Var, 2), "navHighlightAlpha", n70Var2, 20);
            t32 t32VarN = sa2.n(u22Var, n70Var2);
            ia3 ia3VarB2 = bf.b(((Boolean) t32VarN.getValue()).booleanValue() ? 0.18f : 0.0f, nr3.a0(120, 0, yc0Var, 2), "navPressedAlpha", n70Var2, 20);
            boolean z3 = i == R.drawable.ic_search;
            Object objR2 = n70Var2.R();
            if (objR2 == jwVar) {
                objR2 = ih1.a(0.0f);
                n70Var2.o0(objR2);
            }
            pe peVar = (pe) objR2;
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z3);
            boolean zG = n70Var2.g(z3) | ((i13 & 14) == 4) | n70Var2.h(peVar);
            Object objR3 = n70Var2.R();
            if (zG || objR3 == jwVar) {
                objR3 = new fw1(z3, z, peVar, null);
                n70Var2.o0(objR3);
            }
            ey1.h(boolValueOf, boolValueOf2, (z11) objR3, n70Var2);
            final float fFloatValue = ((Number) peVar.d()).floatValue();
            h12 h12VarA0 = m9.a0(rf1.r(h12Var, u22Var, null, false, null, k11Var, 28), 0.0f, 4.0f, 0.0f, fL0, 5);
            ny1 ny1VarD = hu.d(xv.g, false);
            long j2 = n70Var2.T;
            int i15 = (int) (j2 ^ (j2 >>> 32));
            xh2 xh2VarL = n70Var2.l();
            h12 h12VarZ = n31.z(n70Var2, h12VarA0);
            f70.b.getClass();
            c80 c80Var = e70.b;
            n70Var2.i0();
            if (n70Var2.S) {
                n70Var2.k(c80Var);
            } else {
                n70Var2.r0();
            }
            he heVar = e70.f;
            ke2.p(n70Var2, heVar, ny1VarD);
            he heVar2 = e70.e;
            ke2.p(n70Var2, heVar2, xh2VarL);
            Integer numValueOf = Integer.valueOf(i15);
            he heVar3 = e70.g;
            ke2.i(n70Var2, numValueOf, heVar3);
            s8 s8Var = e70.h;
            ke2.m(n70Var2, s8Var);
            he heVar4 = e70.d;
            ke2.p(n70Var2, heVar4, h12VarZ);
            e12 e12Var2 = e12.a;
            final boolean z4 = z3;
            h12 h12VarC = x63.c(e12Var2, 1.0f);
            int i16 = i14;
            m40 m40VarA = l40.a(m9.d, xv.t, n70Var2, 48);
            long j3 = n70Var2.T;
            int i17 = (int) (j3 ^ (j3 >>> 32));
            xh2 xh2VarL2 = n70Var2.l();
            h12 h12VarZ2 = n31.z(n70Var2, h12VarC);
            n70Var2.i0();
            if (n70Var2.S) {
                n70Var2.k(c80Var);
            } else {
                n70Var2.r0();
            }
            ke2.p(n70Var2, heVar, m40VarA);
            ke2.p(n70Var2, heVar2, xh2VarL2);
            c40.B(i17, n70Var2, heVar3, n70Var2, s8Var);
            ke2.p(n70Var2, heVar4, h12VarZ2);
            h12 h12VarG = ce0.g(e12Var2, mw2.a(20.0f));
            if (z) {
                jB2 = v30.b(((Number) ia3VarB.getValue()).floatValue(), jE);
                j = jE2;
            } else {
                if (((Boolean) t32VarN.getValue()).booleanValue()) {
                    j = jE2;
                    jB = v30.b(((Number) ia3VarB2.getValue()).floatValue(), j);
                } else {
                    j = jE2;
                    jB = v30.f;
                }
                jB2 = jB;
            }
            h12 h12VarX = m9.X(n31.k(h12VarG, jB2, ey1.w), 20.0f, 6.0f);
            ny1 ny1VarD2 = hu.d(xv.k, false);
            long j4 = n70Var2.T;
            int i18 = (int) (j4 ^ (j4 >>> 32));
            xh2 xh2VarL3 = n70Var2.l();
            h12 h12VarZ3 = n31.z(n70Var2, h12VarX);
            n70Var2.i0();
            final long j5 = j;
            if (n70Var2.S) {
                n70Var2.k(c80Var);
            } else {
                n70Var2.r0();
            }
            ke2.p(n70Var2, heVar, ny1VarD2);
            ke2.p(n70Var2, heVar2, xh2VarL3);
            c40.B(i18, n70Var2, heVar3, n70Var2, s8Var);
            ke2.p(n70Var2, heVar4, h12VarZ3);
            if (i16 > 0) {
                n70Var2.f0(922620291);
                e12Var = e12Var2;
                final int i19 = i8;
                f14.b(tt3.N(93959982, new aw1(i16, 0), n70Var2), null, tt3.N(645203820, new a21() { // from class: bw1
                    @Override // defpackage.a21
                    public final Object d(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
                        n70 n70Var3 = (n70) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        int i20 = MainActivity.Q0;
                        ((lu) obj).getClass();
                        if (n70Var3.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                            ef2 ef2VarQ = k92.q(i19, n70Var3, 0);
                            h12 h12VarT2 = e12.a;
                            h12 h12VarH = x63.h(h12VarT2, 24.0f);
                            if (z4) {
                                n70Var3.f0(1288780442);
                                Object objR4 = n70Var3.R();
                                jw jwVar2 = h70.a;
                                if (objR4 == jwVar2) {
                                    objR4 = new qo1(6);
                                    n70Var3.o0(objR4);
                                }
                                h12 h12VarT3 = p31.t(h12VarT2, (v11) objR4);
                                float f4 = fFloatValue;
                                boolean zC = n70Var3.c(f4);
                                Object objR5 = n70Var3.R();
                                if (zC || objR5 == jwVar2) {
                                    objR5 = new cw1(1, f4);
                                    n70Var3.o0(objR5);
                                }
                                h12 h12VarT4 = p31.t(h12VarT3, (v11) objR5);
                                Object objR6 = n70Var3.R();
                                if (objR6 == jwVar2) {
                                    objR6 = new qo1(7);
                                    n70Var3.o0(objR6);
                                }
                                h12VarT2 = p31.t(h12VarT4, (v11) objR6);
                                n70Var3.q(false);
                            } else {
                                n70Var3.f0(1289308310);
                                n70Var3.q(false);
                            }
                            za1.b(ef2VarQ, str, h12VarH.h(h12VarT2), j5, n70Var3, 8, 0);
                        } else {
                            n70Var3.Z();
                        }
                        return os3.a;
                    }
                }, n70Var2), n70Var2, 390);
                n70Var2.q(false);
                i9 = i16;
            } else {
                e12Var = e12Var2;
                n70Var2.f0(924000876);
                ef2 ef2VarQ = k92.q(i8, n70Var2, 0);
                h12 h12VarH = x63.h(e12Var, 24.0f);
                if (z4) {
                    n70Var2.f0(924363483);
                    Object objR4 = n70Var2.R();
                    if (objR4 == jwVar) {
                        objR4 = new qo1(4);
                        n70Var2.o0(objR4);
                    }
                    h12 h12VarT2 = p31.t(e12Var, (v11) objR4);
                    boolean zC = n70Var2.c(fFloatValue);
                    Object objR5 = n70Var2.R();
                    if (zC || objR5 == jwVar) {
                        objR5 = new cw1(0, fFloatValue);
                        n70Var2.o0(objR5);
                    }
                    h12 h12VarT3 = p31.t(h12VarT2, (v11) objR5);
                    Object objR6 = n70Var2.R();
                    if (objR6 == jwVar) {
                        objR6 = new qo1(5);
                        n70Var2.o0(objR6);
                    }
                    h12VarT = p31.t(h12VarT3, (v11) objR6);
                    z2 = false;
                    n70Var2.q(false);
                } else {
                    z2 = false;
                    n70Var2.f0(924860351);
                    n70Var2.q(false);
                    h12VarT = e12Var;
                }
                i9 = i16;
                za1.b(ef2VarQ, str, h12VarH.h(h12VarT), j5, n70Var2, 8 | ((i13 >> 3) & 112), 0);
                n70Var2.q(z2);
            }
            n70Var2.q(true);
            yc2.a(n70Var2, x63.d(e12Var, 4.0f));
            f2 = f;
            ij3.b(str, null, z ? jE : j5, qc2.o(f2, 4294967296L), lz0.j, 0L, null, 0L, 0, false, 1, 0, null, n70Var2, ((i13 >> 6) & 14) | 196608, 3072, 122834);
            n70Var2 = n70Var2;
            n70Var2.q(true);
            n70Var2.q(true);
            i7 = i9;
        } else {
            n70Var2.Z();
            i7 = i5;
        }
        oo2 oo2VarU = n70Var2.u();
        if (oo2VarU != null) {
            oo2VarU.d = new z11(z, i, str, k11Var, f2, i7, h12Var, i3, i4) { // from class: dw1
                public final /* synthetic */ boolean f;
                public final /* synthetic */ int g;
                public final /* synthetic */ String h;
                public final /* synthetic */ k11 i;
                public final /* synthetic */ float j;
                public final /* synthetic */ int k;
                public final /* synthetic */ h12 l;
                public final /* synthetic */ int m;

                {
                    this.m = i4;
                }

                @Override // defpackage.z11
                public final Object e(Object obj, Object obj2) throws XmlPullParserException, IOException {
                    n70 n70Var3 = (n70) obj;
                    ((Integer) obj2).getClass();
                    int i20 = MainActivity.Q0;
                    this.e.x(this.f, this.g, this.h, this.i, this.j, this.k, this.l, n70Var3, b92.p(1), this.m);
                    return os3.a;
                }
            };
        }
    }
}
