package cu.uci.android.apklis.di;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import cu.uci.android.apklis.presentation.receiver.PackageInstallReceiver;
import defpackage.ce0;
import defpackage.h1;
import defpackage.hj;
import defpackage.ih1;
import defpackage.kn;
import defpackage.la3;
import defpackage.ni;
import defpackage.rf1;
import defpackage.rt3;
import defpackage.t62;
import defpackage.to1;
import defpackage.u00;
import defpackage.un;
import defpackage.v42;
import defpackage.wh;
import defpackage.xv;
import defpackage.y21;
import defpackage.zs1;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/* JADX INFO: loaded from: classes.dex */
public final class AppApplication extends Application {
    public kn e;
    public rt3 f;
    public to1 g;
    public final PackageInstallReceiver h = new PackageInstallReceiver();
    public v42 i;
    public u00 j;
    public y21 k;
    public y21 l;
    public u00 m;
    public zs1 n;

    public final kn a() {
        kn knVar = this.e;
        if (knVar != null) {
            return knVar;
        }
        rf1.W("appRepository");
        throw null;
    }

    public final rt3 b() {
        rt3 rt3Var = this.f;
        if (rt3Var != null) {
            return rt3Var;
        }
        rf1.W("userRepository");
        throw null;
    }

    @Override // android.app.Application
    public final void onCreate() {
        ConnectivityManager connectivityManager;
        super.onCreate();
        boolean z = false;
        String string = getSharedPreferences("app_settings", 0).getString("theme_mode", "system");
        un.i.getClass();
        hj.k(xv.t(string).h);
        registerActivityLifecycleCallbacks(new ni());
        ce0.u = getApplicationContext();
        if (t62.a == null) {
            Object systemService = getSystemService("connectivity");
            systemService.getClass();
            t62.a = (ConnectivityManager) systemService;
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            ConnectivityManager connectivityManager2 = t62.a;
            if (connectivityManager2 != null) {
                connectivityManager2.registerNetworkCallback(networkRequestBuild, t62.c);
            }
            ConnectivityManager connectivityManager3 = t62.a;
            Network activeNetwork = connectivityManager3 != null ? connectivityManager3.getActiveNetwork() : null;
            NetworkCapabilities networkCapabilities = (activeNetwork == null || (connectivityManager = t62.a) == null) ? null : connectivityManager.getNetworkCapabilities(activeNetwork);
            la3 la3Var = t62.b;
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            la3Var.getClass();
            la3Var.i(null, boolValueOf);
        }
        wh whVarU = ce0.u();
        this.e = new kn(this, whVarU);
        this.f = new rt3(this, whVarU);
        this.g = new to1(this, whVarU);
        this.i = new v42();
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            h1.j();
            NotificationChannel notificationChannelX = h1.x();
            notificationChannelX.setDescription("Notificaciones de aplicaciones y actualizaciones");
            notificationManager.createNotificationChannel(notificationChannelX);
            h1.j();
            NotificationChannel notificationChannelB = h1.B();
            notificationChannelB.setDescription("Notificaciones en tiempo real de NATS");
            notificationManager.createNotificationChannel(notificationChannelB);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        ih1.P(this, this.h, intentFilter, 2);
        this.j = new u00(a());
        this.k = new y21(a());
        a();
        this.l = new y21(a());
        this.m = new u00(a(), this);
        this.n = new zs1(b());
        b();
    }
}
