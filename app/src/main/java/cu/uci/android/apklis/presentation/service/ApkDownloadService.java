package cu.uci.android.apklis.presentation.service;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import androidx.core.content.FileProvider;
import cu.uci.android.apklis.presentation.service.ApkDownloadService;
import cu.uci.android.apklis.presentation.ui.detail.AppDetailActivity;
import defpackage.au2;
import defpackage.bk0;
import defpackage.bu2;
import defpackage.c40;
import defpackage.ce0;
import defpackage.ci;
import defpackage.ck0;
import defpackage.di;
import defpackage.dk0;
import defpackage.do2;
import defpackage.e4;
import defpackage.ek0;
import defpackage.eu2;
import defpackage.fi;
import defpackage.fk0;
import defpackage.g01;
import defpackage.h1;
import defpackage.hi;
import defpackage.me1;
import defpackage.n31;
import defpackage.p31;
import defpackage.q41;
import defpackage.q62;
import defpackage.qb3;
import defpackage.qd1;
import defpackage.qg0;
import defpackage.rf1;
import defpackage.se;
import defpackage.t72;
import defpackage.u92;
import defpackage.v11;
import defpackage.we;
import defpackage.wj;
import defpackage.z33;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/**
 * Foreground dataSync Service downloading APKs with Referer header and launching FileProvider install Intent.
 *
 * @obfuscated_class cu.uci.android.apklis.presentation.service.ApkDownloadService
 */
public final class ApkDownloadService extends Service {
    public ExecutorService e;
    public NotificationManager q;
    public boolean r;
    public z33 t;
    public static final ConcurrentHashMap.KeySetView u = ConcurrentHashMap.newKeySet();
    public static final ConcurrentHashMap.KeySetView v = ConcurrentHashMap.newKeySet();
    public static final ConcurrentHashMap w = new ConcurrentHashMap();
    public static final ConcurrentHashMap x = new ConcurrentHashMap();
    public static final ConcurrentHashMap y = new ConcurrentHashMap();
    public static final ConcurrentHashMap z = new ConcurrentHashMap();
    public static final ConcurrentHashMap A = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public final ConcurrentHashMap l = new ConcurrentHashMap();
    public final ConcurrentHashMap m = new ConcurrentHashMap();
    public final ConcurrentHashMap n = new ConcurrentHashMap();
    public final AtomicInteger o = new AtomicInteger(0);
    public final AtomicInteger p = new AtomicInteger(0);
    public final Object s = new Object();

    public static int g(long j, long j2) {
        if (j2 <= 0) {
            return 0;
        }
        return Math.max(0, Math.min(100, (int) ((j * 100) / j2)));
    }

    public static String h(long j) {
        if (j < 1024) {
            return j + " B";
        }
        double d = j / 1024.0d;
        if (d < 1024.0d) {
            return String.format(Locale.US, "%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        }
        double d2 = d / 1024.0d;
        return d2 < 1024.0d ? String.format(Locale.US, "%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)) : String.format(Locale.US, "%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1024.0d)}, 1));
    }

    public static String i(long j) {
        if (j <= 0) {
            return "";
        }
        if (j >= 1024) {
            double d = j / 1024.0d;
            return d < 1024.0d ? String.format(Locale.US, "%.1f KB/s", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)) : String.format(Locale.US, "%.2f MB/s", Arrays.copyOf(new Object[]{Double.valueOf(d / 1024.0d)}, 1));
        }
        return j + " B/s";
    }

    public static String m(String str, String str2, String str3) {
        ek0 ek0Var;
        if (str3 != null) {
            try {
                ek0Var = qb3.U(str3) ? new ek0(str, null) : new ek0(str, str3);
            } catch (Exception e) {
                Log.w("ApkDownloadService", "get_url falló — usando fallback: " + e.getMessage());
                return str2;
            }
        }
        au2 au2VarD = ce0.u().E(ek0Var).d();
        bu2 bu2Var = au2VarD.a;
        Object obj = au2VarD.b;
        if (bu2Var.t && obj != null && ((fk0) obj).getUrl() != null) {
            Log.d("ApkDownloadService", "URL firmada obtenida para ".concat(str));
            return ((fk0) obj).getUrl();
        }
        Log.w("ApkDownloadService", "get_url respondió " + au2VarD.a.h + " — usando fallback");
        return str2;
    }

    public static void o(ci ciVar, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() + j;
        while (!ciVar.d && System.currentTimeMillis() < jCurrentTimeMillis) {
            long jMin = Math.min(500L, Math.max(50L, jCurrentTimeMillis - System.currentTimeMillis()));
            synchronized (ciVar.a) {
                try {
                    ciVar.a.wait(jMin);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (ciVar.c) {
                return;
            }
        }
    }

    public final void a(String str) {
        Intent intent = new Intent("cu.uci.android.apklis.DOWNLOAD_FAILED");
        intent.putExtra("extra_package_name", str);
        intent.setPackage(getPackageName());
        sendBroadcast(intent);
    }

    public final void b(String str) {
        if (str == null) {
            return;
        }
        ci ciVar = (ci) this.h.get(str);
        Integer num = (Integer) this.g.get(str);
        ConcurrentHashMap concurrentHashMap = w;
        Object orDefault = concurrentHashMap.getOrDefault(str, str);
        orDefault.getClass();
        String str2 = (String) orDefault;
        ConcurrentHashMap concurrentHashMap2 = x;
        String str3 = (String) concurrentHashMap2.get(str);
        if (ciVar != null) {
            ciVar.d = true;
            Log.i("ApkDownloadService", "[CANCEL] pkg=" + str + " notifId=" + num + " running=" + ciVar.e);
            synchronized (ciVar.a) {
                ciVar.a.notifyAll();
            }
        }
        Future future = (Future) this.f.remove(str);
        if (future != null) {
            future.cancel(true);
        }
        if (num != null) {
            int iIntValue = num.intValue();
            if (this.q != null) {
                Log.i("ApkDownloadService", "[NOTIFY_CANCELLED] notifId=" + iIntValue + " app=" + str2);
                int i = 200000 + iIntValue;
                NotificationManager notificationManager = this.q;
                if (notificationManager == null) {
                    rf1.W("nm");
                    throw null;
                }
                notificationManager.cancel(iIntValue);
                NotificationManager notificationManager2 = this.q;
                if (notificationManager2 == null) {
                    rf1.W("nm");
                    throw null;
                }
                t72 t72Var = new t72(this, "apklis_download_channel");
                t72Var.r.icon = R.drawable.stat_notify_error;
                t72Var.e = t72.c("Descarga cancelada");
                t72Var.f = t72.c(str2.concat(" cancelada"));
                v11 v11Var = AppDetailActivity.b1;
                t72Var.g = PendingIntent.getActivity(this, i, me1.Z(this, str).addFlags(335544320), 201326592);
                t72Var.d(16, true);
                t72Var.d(8, true);
                notificationManager2.notify(i, t72Var.b());
            }
        }
        this.g.remove(str);
        concurrentHashMap.remove(str);
        concurrentHashMap2.remove(str);
        v.remove(str);
        u.remove(str);
        ConcurrentHashMap concurrentHashMap3 = A;
        dk0 dk0VarF = (dk0) concurrentHashMap3.get(str);
        if (dk0VarF == null) {
            dk0VarF = z33.f(this);
        }
        String strE = q41.e(str, str2, str3);
        if (dk0VarF instanceof bk0) {
            File file = ((bk0) dk0VarF).a;
            new File(file, strE).delete();
            new File(file, strE.concat(".part")).delete();
        } else {
            if (!(dk0VarF instanceof ck0)) {
                g01.r();
                return;
            }
            try {
                qd1 qd1Var = new qd1(this, ((ck0) dk0VarF).a);
                qg0 qg0VarT = qd1Var.t(strE);
                if (qg0VarT != null) {
                    qg0VarT.b();
                }
                qg0 qg0VarT2 = qd1Var.t(strE.concat(".part"));
                if (qg0VarT2 != null) {
                    qg0VarT2.b();
                }
            } catch (Exception e) {
                Log.w("ApkDownloadService", "[CANCEL] fallo eliminando en destino SAF: " + e.getMessage());
            }
        }
        concurrentHashMap3.remove(str);
        new File(getCacheDir(), str.concat(".apk")).delete();
        Intent intent = new Intent("cu.uci.android.apklis.DOWNLOAD_CANCELLED");
        intent.putExtra("extra_package_name", str);
        intent.setPackage(getPackageName());
        sendBroadcast(intent);
        if (ciVar == null || ciVar.e) {
            return;
        }
        this.h.remove(str);
        c(ciVar);
    }

    public final void c(ci ciVar) {
        if (ciVar.b.compareAndSet(false, true)) {
            int iDecrementAndGet = this.p.decrementAndGet();
            c40.C(iDecrementAndGet, "[COMPLETE_TASK] remaining=", "ApkDownloadService");
            if (iDecrementAndGet <= 0) {
                synchronized (this.s) {
                    if (this.r) {
                        stopForeground(false);
                        this.r = false;
                        Log.d("ApkDownloadService", "[FG_STOP]");
                    }
                }
                stopSelf();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [long] */
    /* JADX WARN: Type inference failed for: r0v23, types: [long] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17, types: [ci] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v23, types: [int] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r28v0, types: [bu2] */
    /* JADX WARN: Type inference failed for: r36v0, types: [long] */
    /* JADX WARN: Type inference failed for: r38v0, types: [cu.uci.android.apklis.presentation.service.ApkDownloadService] */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r39v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3, types: [bu2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r40v1 */
    /* JADX WARN: Type inference failed for: r40v10 */
    /* JADX WARN: Type inference failed for: r40v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r40v12, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r40v13 */
    /* JADX WARN: Type inference failed for: r40v14 */
    /* JADX WARN: Type inference failed for: r40v15 */
    /* JADX WARN: Type inference failed for: r40v16 */
    /* JADX WARN: Type inference failed for: r40v17 */
    /* JADX WARN: Type inference failed for: r40v18 */
    /* JADX WARN: Type inference failed for: r40v19 */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r40v20 */
    /* JADX WARN: Type inference failed for: r40v3 */
    /* JADX WARN: Type inference failed for: r40v4 */
    /* JADX WARN: Type inference failed for: r40v5 */
    /* JADX WARN: Type inference failed for: r40v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r40v7 */
    /* JADX WARN: Type inference failed for: r40v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r40v9 */
    /* JADX WARN: Type inference failed for: r41v0, types: [n31] */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v10 */
    /* JADX WARN: Type inference failed for: r41v11 */
    /* JADX WARN: Type inference failed for: r41v12 */
    /* JADX WARN: Type inference failed for: r41v13 */
    /* JADX WARN: Type inference failed for: r41v14 */
    /* JADX WARN: Type inference failed for: r41v15 */
    /* JADX WARN: Type inference failed for: r41v17 */
    /* JADX WARN: Type inference failed for: r41v19 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v20 */
    /* JADX WARN: Type inference failed for: r41v21 */
    /* JADX WARN: Type inference failed for: r41v22 */
    /* JADX WARN: Type inference failed for: r41v23, types: [bu2] */
    /* JADX WARN: Type inference failed for: r41v24 */
    /* JADX WARN: Type inference failed for: r41v25 */
    /* JADX WARN: Type inference failed for: r41v26 */
    /* JADX WARN: Type inference failed for: r41v27 */
    /* JADX WARN: Type inference failed for: r41v28 */
    /* JADX WARN: Type inference failed for: r41v29 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r41v30 */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r41v6 */
    /* JADX WARN: Type inference failed for: r41v7 */
    /* JADX WARN: Type inference failed for: r41v8 */
    /* JADX WARN: Type inference failed for: r41v9 */
    /* JADX WARN: Type inference failed for: r42v0, types: [long] */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r42v11 */
    /* JADX WARN: Type inference failed for: r42v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r42v13 */
    /* JADX WARN: Type inference failed for: r42v14 */
    /* JADX WARN: Type inference failed for: r42v15 */
    /* JADX WARN: Type inference failed for: r42v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r42v17 */
    /* JADX WARN: Type inference failed for: r42v18 */
    /* JADX WARN: Type inference failed for: r42v19 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v20 */
    /* JADX WARN: Type inference failed for: r42v21 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v5 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v7 */
    /* JADX WARN: Type inference failed for: r42v8 */
    /* JADX WARN: Type inference failed for: r42v9 */
    /* JADX WARN: Type inference failed for: r44v0, types: [ci] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r8v9, types: [long] */
    public final q62 d(u92 u92Var, String str, n31 n31Var, long j, ci ciVar, String str2, String str3, int i) {
        Throwable th;
        ?? r41;
        eu2 eu2Var;
        Throwable th2;
        ?? r42;
        ?? r40;
        Throwable th3;
        ?? r43;
        ?? r39;
        int i2;
        String str4;
        long j2;
        int iMin;
        long j3;
        ?? r0 = j;
        ciVar = ciVar;
        hi hiVar = hi.h;
        we weVar = new we(9);
        weVar.v(str);
        ((se) weVar.h).d("User-Agent", "ApklisApp/1.0 (Android)");
        ((se) weVar.h).d("Referer", "https://www.apklis.cu/");
        if (r0 > 0) {
            ((se) weVar.h).d("Range", "bytes=" + r0 + "-");
        }
        int i3 = 4;
        try {
            try {
                n31Var = new do2(u92Var, new wj(weVar), false).h();
                try {
                    int i4 = n31Var.h;
                    try {
                        if (200 > i4 || i4 >= 300 || (eu2Var = n31Var.k) == null) {
                            Log.e("ApkDownloadService", "Fallo HTTP " + i4 + " para " + str3);
                            q62 q62Var = new q62(i3, hiVar);
                            n31Var.close();
                            return q62Var;
                        }
                        if (r0 <= 0 || i4 != 200) {
                            long jB = eu2Var.b();
                            long j4 = jB > 0 ? jB + r0 : -1L;
                            int iG = g(r0, j4);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            int iMax = Math.max(1, iG);
                            try {
                                eu2 eu2Var2 = n31Var.k;
                                eu2Var2.getClass();
                                j = eu2Var2.g().E();
                                try {
                                    ?? C = n31Var.C(r0 > 0);
                                    try {
                                        try {
                                            byte[] bArr = new byte[16384];
                                            boolean z2 = false;
                                            long j5 = 0;
                                            long j6 = 0;
                                            long j7 = -1;
                                            while (true) {
                                                int i5 = j.read(bArr);
                                                ?? r28 = n31Var;
                                                if (i5 == -1) {
                                                    ?? r44 = j;
                                                    int i6 = 4;
                                                    C.close();
                                                    r44.close();
                                                    q62 q62Var2 = new q62(i6, hi.e);
                                                    r28.close();
                                                    return q62Var2;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (ciVar.d || Thread.currentThread().isInterrupted()) {
                                                                ?? r45 = C;
                                                                ?? r46 = j;
                                                                q62 q62Var3 = new q62(4, hi.i);
                                                                r45.close();
                                                                r46.close();
                                                                r28.close();
                                                                return q62Var3;
                                                            }
                                                            if (ciVar.c) {
                                                                ?? r3 = C;
                                                                try {
                                                                    r43 = r3;
                                                                    r39 = j;
                                                                    i2 = 4;
                                                                    ciVar = 4;
                                                                    ciVar = 4;
                                                                    ciVar = 4;
                                                                    try {
                                                                        p(str2, str3, i, g(r0, j4), r0, j4, -1L, true, false);
                                                                        q62 q62Var4 = new q62(i2, hi.f);
                                                                        try {
                                                                            r43.close();
                                                                            try {
                                                                                r39.close();
                                                                                try {
                                                                                    r28.close();
                                                                                    return q62Var4;
                                                                                } catch (IOException e) {
                                                                                    e = e;
                                                                                    str3 = str3;
                                                                                    Log.w("ApkDownloadService", "Error de red en descarga de " + str3 + ": " + e.getMessage());
                                                                                    return new q62((int) ciVar, hiVar);
                                                                                }
                                                                            } catch (Throwable th4) {
                                                                                str3 = str3;
                                                                                th = th4;
                                                                                r41 = r28;
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th5) {
                                                                            r42 = r39;
                                                                            str3 = str3;
                                                                            th2 = th5;
                                                                            n31Var = r28;
                                                                            try {
                                                                                throw th2;
                                                                            } catch (Throwable th6) {
                                                                                p31.l(r42, th2);
                                                                                throw th6;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        j = r39;
                                                                        str3 = str3;
                                                                        th3 = th;
                                                                        n31Var = r28;
                                                                        ciVar = i2;
                                                                        r40 = r43;
                                                                        throw th3;
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    r43 = r3;
                                                                    r39 = j;
                                                                    i2 = 4;
                                                                }
                                                            } else {
                                                                str = C;
                                                                long j8 = j4;
                                                                ciVar = 4;
                                                                ciVar = 4;
                                                                ciVar = 4;
                                                                ciVar = 4;
                                                                ?? r36 = r0;
                                                                ?? r1 = j;
                                                                byte[] bArr2 = bArr;
                                                                try {
                                                                    if (!j()) {
                                                                        str4 = str3;
                                                                        j = r1;
                                                                        n31Var = r28;
                                                                        p(str2, str4, i, g(r36, j8), r36, j8, -1L, true, true);
                                                                        q62 q62Var5 = new q62((int) ciVar, hi.g);
                                                                        str.close();
                                                                        j.close();
                                                                        n31Var.close();
                                                                        return q62Var5;
                                                                    }
                                                                    j = r1;
                                                                    n31Var = r28;
                                                                    str3 = str3;
                                                                    try {
                                                                        str.write(bArr2, 0, i5);
                                                                        long j9 = i5;
                                                                        long j10 = r36 + j9;
                                                                        long j11 = j6 + j9;
                                                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                                        long j12 = jCurrentTimeMillis2 - jCurrentTimeMillis;
                                                                        if (j12 >= 400) {
                                                                            if (j12 > 0) {
                                                                                try {
                                                                                    j3 = (j11 * 1000) / j12;
                                                                                } catch (Throwable th9) {
                                                                                    th3 = th9;
                                                                                    r40 = str;
                                                                                    n31Var = n31Var;
                                                                                    j = j;
                                                                                }
                                                                            } else {
                                                                                j3 = -1;
                                                                            }
                                                                            j7 = j3;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis2;
                                                                            j2 = 0;
                                                                        } else {
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            j7 = j7;
                                                                            j2 = j11;
                                                                        }
                                                                        if (j8 > 0) {
                                                                            iMin = (int) ((100 * j10) / j8);
                                                                            iMax = iMax;
                                                                        } else {
                                                                            iMin = Math.min(98, iMax + 1);
                                                                            iMax = iMin;
                                                                        }
                                                                        boolean z3 = !z2 || iMin != iG || jCurrentTimeMillis2 - j5 >= 220 || iMin >= 100;
                                                                        Long l = (Long) this.j.get(str3);
                                                                        if (l == null || jCurrentTimeMillis2 - l.longValue() >= 700) {
                                                                            this.j.put(str3, Long.valueOf(jCurrentTimeMillis2));
                                                                        }
                                                                        if (z3) {
                                                                            str4 = str3;
                                                                            str = str;
                                                                            int i7 = iMin;
                                                                            try {
                                                                                p(str2, str4, i, i7, j10, j8, j7, false, false);
                                                                                str3 = str4;
                                                                                j6 = j2;
                                                                                iG = i7;
                                                                                r0 = j10;
                                                                                j4 = j8;
                                                                                z2 = true;
                                                                                bArr = bArr2;
                                                                                j5 = jCurrentTimeMillis2;
                                                                                C = str;
                                                                            } catch (Throwable th10) {
                                                                                th = th10;
                                                                                str3 = str4;
                                                                            }
                                                                        } else {
                                                                            str = str;
                                                                            bArr = bArr2;
                                                                            r0 = j10;
                                                                            j6 = j2;
                                                                            C = str;
                                                                            j4 = j8;
                                                                        }
                                                                    } catch (Throwable th11) {
                                                                        th = th11;
                                                                        str = str;
                                                                        th3 = th;
                                                                        ciVar = ciVar;
                                                                        r40 = str;
                                                                        n31Var = n31Var;
                                                                        j = j;
                                                                    }
                                                                    th = th10;
                                                                    str3 = str4;
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    j = r1;
                                                                    n31Var = r28;
                                                                    str3 = str3;
                                                                }
                                                            }
                                                            throw th3;
                                                            throw th3;
                                                        } catch (Throwable th13) {
                                                            p31.l(r40, th3);
                                                            throw th13;
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                    }
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                    str = C;
                                                    j = j;
                                                    n31Var = r28;
                                                    ciVar = 4;
                                                }
                                                th3 = th;
                                                ciVar = ciVar;
                                                r40 = str;
                                                n31Var = n31Var;
                                                j = j;
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            n31Var = n31Var;
                                            str = C;
                                            j = j;
                                        }
                                    } catch (Throwable th17) {
                                        th = th17;
                                        th2 = th;
                                        ciVar = ciVar;
                                        n31Var = n31Var;
                                        r42 = j;
                                        throw th2;
                                    }
                                } catch (Throwable th18) {
                                    th = th18;
                                    str3 = str3;
                                    n31Var = n31Var;
                                    j = j;
                                    ciVar = 4;
                                }
                            } catch (Throwable th19) {
                                th = th19;
                                str3 = str3;
                                n31Var = n31Var;
                                ciVar = 4;
                                th = th;
                                ciVar = ciVar;
                                r41 = n31Var;
                            }
                        } else {
                            try {
                                n31Var.p();
                                q62 q62Var6 = new q62(i3, hiVar);
                                n31Var.close();
                                return q62Var6;
                            } catch (Throwable th20) {
                                str3 = str3;
                                th = th20;
                                r41 = n31Var;
                                ciVar = 4;
                            }
                        }
                        try {
                            throw th;
                        } catch (Throwable th21) {
                            p31.l(r41, th);
                            throw th21;
                        }
                    } catch (Throwable th22) {
                        th = th22;
                        th = th;
                        ciVar = ciVar;
                        r41 = n31Var;
                        throw th;
                    }
                } catch (Throwable th23) {
                    th = th23;
                    str3 = str3;
                    n31Var = n31Var;
                    ciVar = 4;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            str3 = str3;
            ciVar = 4;
        }
    }

    public final void e(int i, String str, String str2) {
        if (this.q == null) {
            return;
        }
        synchronized (this.s) {
            if (this.r) {
                return;
            }
            v11 v11Var = AppDetailActivity.b1;
            PendingIntent activity = PendingIntent.getActivity(this, i, me1.Z(this, str2).addFlags(335544320), 201326592);
            t72 t72Var = new t72(this, "apklis_download_channel");
            t72Var.r.icon = R.drawable.stat_sys_download;
            t72Var.e = t72.c("Preparando descarga");
            t72Var.f = t72.c(str);
            t72Var.g = activity;
            t72Var.d(8, true);
            t72Var.d(2, true);
            t72Var.k = 100;
            t72Var.l = 0;
            t72Var.m = true;
            Notification notificationB = t72Var.b();
            notificationB.getClass();
            startForeground(i, notificationB);
            this.r = true;
        }
    }

    public final void f(int i, ci ciVar, String str, String str2) {
        Long l = (Long) this.i.get(str2);
        if (System.currentTimeMillis() - (l != null ? l.longValue() : System.currentTimeMillis()) >= 550 || ciVar.d || ciVar.c) {
            return;
        }
        p(str, str2, i, 35, 35L, 100L, -1L, false, false);
        o(ciVar, 140L);
        if (ciVar.d || ciVar.c) {
            return;
        }
        p(str, str2, i, 75, 75L, 100L, -1L, false, false);
        o(ciVar, 140L);
    }

    public final boolean j() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        Object systemService = getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasCapability(12);
    }

    public final void k(String str, File file, int i) {
        String name;
        if (this.q == null) {
            return;
        }
        String name2 = file.getName();
        name2.getClass();
        if (name2.endsWith(".apk")) {
            String name3 = file.getName();
            name3.getClass();
            name = name3.substring(0, file.getName().length() - 4);
        } else {
            name = file.getName();
        }
        int iAbs = Math.abs(name != null ? name.hashCode() : 0) + 1000000;
        Uri uriD = FileProvider.d(this, getPackageName() + ".fileprovider", file);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uriD, "application/vnd.android.package-archive");
        intent.addFlags(268435457);
        PendingIntent activity = PendingIntent.getActivity(this, iAbs, intent, 201326592);
        NotificationManager notificationManager = this.q;
        if (notificationManager == null) {
            rf1.W("nm");
            throw null;
        }
        notificationManager.cancel(i);
        NotificationManager notificationManager2 = this.q;
        if (notificationManager2 == null) {
            rf1.W("nm");
            throw null;
        }
        t72 t72Var = new t72(this, "apklis_download_channel");
        t72Var.r.icon = R.drawable.stat_sys_download_done;
        t72Var.e = t72.c("Instalación lista");
        t72Var.f = t72.c(str.concat(" lista para instalar"));
        t72Var.d(16, false);
        t72Var.g = activity;
        t72Var.a(R.drawable.stat_sys_download_done, "Instalar", activity);
        notificationManager2.notify(iAbs, t72Var.b());
        z33 z33Var = this.t;
        if (z33Var == null) {
            rf1.W("settingsManager");
            throw null;
        }
        if (!z33Var.a.getBoolean("auto_install", true)) {
            Log.d("ApkDownloadService", "[AUTO_INSTALL_DISABLED] Not launching installer for ".concat(str));
            return;
        }
        try {
            startActivity(intent);
        } catch (Exception e) {
            Log.w("ApkDownloadService", "No se pudo abrir instalador automáticamente: " + e.getMessage());
        }
    }

    public final void l(int i, String str, String str2) {
        if (this.q == null) {
            return;
        }
        Log.w("ApkDownloadService", "[NOTIFY_FAILED] notifId=" + i + " app=" + str);
        int i2 = 300000 + i;
        NotificationManager notificationManager = this.q;
        if (notificationManager == null) {
            rf1.W("nm");
            throw null;
        }
        notificationManager.cancel(i);
        NotificationManager notificationManager2 = this.q;
        if (notificationManager2 == null) {
            rf1.W("nm");
            throw null;
        }
        t72 t72Var = new t72(this, "apklis_download_channel");
        t72Var.r.icon = R.drawable.stat_notify_error;
        t72Var.e = t72.c("Error al descargar");
        t72Var.f = t72.c("No se pudo descargar ".concat(str));
        v11 v11Var = AppDetailActivity.b1;
        t72Var.g = PendingIntent.getActivity(this, i2, me1.Z(this, str2).addFlags(335544320), 201326592);
        t72Var.d(16, true);
        notificationManager2.notify(i2, t72Var.b());
    }

    public final void n(String str) {
        if (str == null) {
            return;
        }
        ci ciVar = (ci) this.h.get(str);
        Integer num = (Integer) this.g.get(str);
        if (ciVar == null || num == null) {
            return;
        }
        ciVar.c = false;
        Log.i("ApkDownloadService", "[RESUME] pkg=" + str + " notifId=" + num);
        synchronized (ciVar.a) {
            ciVar.a.notifyAll();
        }
        fi fiVar = (fi) z.get(str);
        int i = fiVar != null ? fiVar.a : 0;
        long j = fiVar != null ? fiVar.b : 0L;
        long j2 = fiVar != null ? fiVar.c : -1L;
        long j3 = fiVar != null ? fiVar.d : -1L;
        Object orDefault = w.getOrDefault(str, str);
        orDefault.getClass();
        p((String) orDefault, str, num.intValue(), i, j, j2, j3, false, false);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = getSystemService("notification");
            NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
            if (notificationManager != null) {
                notificationManager.deleteNotificationChannel("apklis_download_channel");
                h1.j();
                NotificationChannel notificationChannelA = h1.a();
                notificationChannelA.setDescription("Progreso de descarga de aplicaciones");
                notificationManager.createNotificationChannel(notificationChannelA);
            }
        }
        Object systemService2 = getSystemService("notification");
        systemService2.getClass();
        this.q = (NotificationManager) systemService2;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(3);
        executorServiceNewFixedThreadPool.getClass();
        this.e = executorServiceNewFixedThreadPool;
        this.t = new z33(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ExecutorService executorService = this.e;
        if (executorService == null) {
            rf1.W("executor");
            throw null;
        }
        executorService.shutdownNow();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (intent != null) {
            String action = intent.getAction();
            boolean zHasTransport = false;
            zHasTransport = false;
            zHasTransport = false;
            if ("action_pause_download".equals(action)) {
                String stringExtra = intent.getStringExtra("extra_package_name");
                if (stringExtra != null) {
                    ci ciVar = (ci) this.h.get(stringExtra);
                    Integer num = (Integer) this.g.get(stringExtra);
                    if (ciVar != null && num != null) {
                        ciVar.c = true;
                        Log.i("ApkDownloadService", "[PAUSE] pkg=" + stringExtra + " notifId=" + num);
                        synchronized (ciVar.a) {
                            ciVar.a.notifyAll();
                        }
                        fi fiVar = (fi) z.get(stringExtra);
                        int i3 = fiVar != null ? fiVar.a : 0;
                        long j = fiVar != null ? fiVar.b : 0L;
                        long j2 = fiVar != null ? fiVar.c : -1L;
                        long j3 = fiVar != null ? fiVar.d : -1L;
                        Object orDefault = w.getOrDefault(stringExtra, stringExtra);
                        orDefault.getClass();
                        p((String) orDefault, stringExtra, num.intValue(), i3, j, j2, j3, true, false);
                        return 2;
                    }
                }
            } else {
                if ("action_resume_download".equals(action)) {
                    n(intent.getStringExtra("extra_package_name"));
                    return 2;
                }
                if ("action_cancel_download".equals(action)) {
                    String stringExtra2 = intent.getStringExtra("extra_package_name");
                    Log.i("ApkDownloadService", "[ACTION_CANCEL] pkg=" + stringExtra2);
                    b(stringExtra2);
                    return 2;
                }
                final String stringExtra3 = intent.getStringExtra("extra_package_name");
                if (stringExtra3 != null) {
                    String stringExtra4 = intent.getStringExtra("extra_app_name");
                    String stringExtra5 = intent.getStringExtra("extra_package_version");
                    final String stringExtra6 = intent.getStringExtra("extra_url");
                    final String stringExtra7 = intent.getStringExtra("extra_sha256");
                    String str = stringExtra4 == null ? stringExtra3 : stringExtra4;
                    z33 z33Var = this.t;
                    if (z33Var == null) {
                        rf1.W("settingsManager");
                        throw null;
                    }
                    if (z33Var.a.getBoolean("wifi_only", false)) {
                        Object systemService = getSystemService("connectivity");
                        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                        if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                            zHasTransport = networkCapabilities.hasTransport(1);
                        }
                        if (!zHasTransport) {
                            int iIncrementAndGet = this.o.incrementAndGet() + 2000;
                            if (this.q != null) {
                                Log.w("ApkDownloadService", "[NOTIFY_WIFI_BLOCKED] notifId=" + iIncrementAndGet + " app=" + str);
                                NotificationManager notificationManager = this.q;
                                if (notificationManager == null) {
                                    rf1.W("nm");
                                    throw null;
                                }
                                t72 t72Var = new t72(this, "apklis_download_channel");
                                t72Var.r.icon = R.drawable.stat_sys_warning;
                                t72Var.e = t72.c("Descarga bloqueada");
                                t72Var.f = t72.c(str.concat(" - Requiere conexion WiFi. Activa WiFi para descargar."));
                                v11 v11Var = AppDetailActivity.b1;
                                t72Var.g = PendingIntent.getActivity(this, iIncrementAndGet, me1.Z(this, stringExtra3).addFlags(335544320), 201326592);
                                t72Var.d(16, true);
                                t72Var.d(8, true);
                                notificationManager.notify(iIncrementAndGet, t72Var.b());
                            }
                            a(stringExtra3);
                            return 2;
                        }
                    }
                    Integer num2 = (Integer) this.g.get(stringExtra3);
                    int iIntValue = num2 != null ? num2.intValue() : this.o.incrementAndGet() + 2000;
                    e(iIntValue, str, stringExtra3);
                    if (!this.f.containsKey(stringExtra3)) {
                        if (q41.t(this, stringExtra3, stringExtra4, stringExtra5)) {
                            int iIncrementAndGet2 = this.o.incrementAndGet() + 2000;
                            File fileQ = q41.q(this, stringExtra3, stringExtra4, stringExtra5);
                            if (fileQ == null) {
                                Log.e("ApkDownloadService", "APK marcado como descargado pero el archivo no es accesible: ".concat(stringExtra3));
                                l(iIntValue, str, stringExtra3);
                                a(stringExtra3);
                                return 2;
                            }
                            A.put(stringExtra3, z33.f(this));
                            k(str, fileQ, iIncrementAndGet2);
                            y.put(stringExtra3, new di(stringExtra3, str, stringExtra5 == null ? "" : stringExtra5, 100, true));
                            Intent intent2 = new Intent("cu.uci.android.apklis.DOWNLOAD_COMPLETE");
                            intent2.putExtra("extra_apk_path", fileQ.getAbsolutePath());
                            intent2.putExtra("extra_package_name", stringExtra3);
                            intent2.putExtra("extra_app_name", stringExtra4);
                            intent2.putExtra("extra_package_version", stringExtra5);
                            intent2.setPackage(getPackageName());
                            sendBroadcast(intent2);
                            return 2;
                        }
                        final String str2 = str;
                        this.h.put(stringExtra3, new ci());
                        A.put(stringExtra3, z33.f(this));
                        u.add(stringExtra3);
                        this.g.put(stringExtra3, Integer.valueOf(iIntValue));
                        this.i.put(stringExtra3, Long.valueOf(System.currentTimeMillis()));
                        this.p.incrementAndGet();
                        w.put(stringExtra3, str2);
                        if (stringExtra5 != null && stringExtra5.length() != 0) {
                            x.put(stringExtra3, stringExtra5);
                        }
                        ExecutorService executorService = this.e;
                        if (executorService == null) {
                            rf1.W("executor");
                            throw null;
                        }
                        final int i4 = iIntValue;
                        this.f.put(stringExtra3, executorService.submit(new Runnable() { // from class: yh
                            /*  JADX ERROR: Type inference failed
                                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19141. Try increasing type updates limit count.
                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                                */
                            @Override // java.lang.Runnable
                            public final void run() {
                                /*
                                    Method dump skipped, instruction units count: 1914
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.yh.run():void");
                            }
                        }));
                        Log.d("ApkDownloadService", "[ENQUEUE_OK] pkg=" + stringExtra3 + " notifId=" + i4 + " activeCount=" + this.p.get());
                        p(str2, stringExtra3, i4, 0, 0L, -1L, -1L, false, false);
                        return 2;
                    }
                }
            }
        }
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0237 A[Catch: all -> 0x00b4, TryCatch #1 {all -> 0x00b4, blocks: (B:22:0x00a1, B:24:0x00af, B:28:0x00b9, B:30:0x00c3, B:32:0x00c9, B:34:0x00d3, B:43:0x00ea, B:52:0x0104, B:65:0x0127, B:69:0x014e, B:90:0x01f5, B:92:0x01ff, B:94:0x0208, B:101:0x0242, B:102:0x0285, B:111:0x02b6, B:112:0x02b7, B:114:0x02c7, B:116:0x02ce, B:120:0x02e1, B:125:0x0364, B:126:0x0365, B:100:0x0237, B:93:0x0204, B:75:0x016d, B:77:0x0173, B:81:0x01ae, B:80:0x01a4, B:82:0x01c6, B:86:0x01da, B:85:0x01d6, B:103:0x0286, B:105:0x028a, B:108:0x02af, B:110:0x02b3, B:123:0x035d, B:124:0x0363), top: B:132:0x00a1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x028a A[Catch: all -> 0x02ac, TryCatch #3 {all -> 0x02ac, blocks: (B:103:0x0286, B:105:0x028a, B:108:0x02af, B:110:0x02b3, B:123:0x035d, B:124:0x0363), top: B:135:0x0286, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02b3 A[Catch: all -> 0x02ac, TRY_LEAVE, TryCatch #3 {all -> 0x02ac, blocks: (B:103:0x0286, B:105:0x028a, B:108:0x02af, B:110:0x02b3, B:123:0x035d, B:124:0x0363), top: B:135:0x0286, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x035d A[Catch: all -> 0x02ac, TRY_ENTER, TryCatch #3 {all -> 0x02ac, blocks: (B:103:0x0286, B:105:0x028a, B:108:0x02af, B:110:0x02b3, B:123:0x035d, B:124:0x0363), top: B:135:0x0286, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0286 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0149  */
    /* JADX WARN: Code duplicated, block: B:68:0x014c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0162  */
    /* JADX WARN: Code duplicated, block: B:73:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x016a  */
    /* JADX WARN: Code duplicated, block: B:75:0x016d A[Catch: all -> 0x00b4, TryCatch #1 {all -> 0x00b4, blocks: (B:22:0x00a1, B:24:0x00af, B:28:0x00b9, B:30:0x00c3, B:32:0x00c9, B:34:0x00d3, B:43:0x00ea, B:52:0x0104, B:65:0x0127, B:69:0x014e, B:90:0x01f5, B:92:0x01ff, B:94:0x0208, B:101:0x0242, B:102:0x0285, B:111:0x02b6, B:112:0x02b7, B:114:0x02c7, B:116:0x02ce, B:120:0x02e1, B:125:0x0364, B:126:0x0365, B:100:0x0237, B:93:0x0204, B:75:0x016d, B:77:0x0173, B:81:0x01ae, B:80:0x01a4, B:82:0x01c6, B:86:0x01da, B:85:0x01d6, B:103:0x0286, B:105:0x028a, B:108:0x02af, B:110:0x02b3, B:123:0x035d, B:124:0x0363), top: B:132:0x00a1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0173 A[Catch: all -> 0x00b4, TryCatch #1 {all -> 0x00b4, blocks: (B:22:0x00a1, B:24:0x00af, B:28:0x00b9, B:30:0x00c3, B:32:0x00c9, B:34:0x00d3, B:43:0x00ea, B:52:0x0104, B:65:0x0127, B:69:0x014e, B:90:0x01f5, B:92:0x01ff, B:94:0x0208, B:101:0x0242, B:102:0x0285, B:111:0x02b6, B:112:0x02b7, B:114:0x02c7, B:116:0x02ce, B:120:0x02e1, B:125:0x0364, B:126:0x0365, B:100:0x0237, B:93:0x0204, B:75:0x016d, B:77:0x0173, B:81:0x01ae, B:80:0x01a4, B:82:0x01c6, B:86:0x01da, B:85:0x01d6, B:103:0x0286, B:105:0x028a, B:108:0x02af, B:110:0x02b3, B:123:0x035d, B:124:0x0363), top: B:132:0x00a1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x019f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4 A[Catch: all -> 0x00b4, TryCatch #1 {all -> 0x00b4, blocks: (B:22:0x00a1, B:24:0x00af, B:28:0x00b9, B:30:0x00c3, B:32:0x00c9, B:34:0x00d3, B:43:0x00ea, B:52:0x0104, B:65:0x0127, B:69:0x014e, B:90:0x01f5, B:92:0x01ff, B:94:0x0208, B:101:0x0242, B:102:0x0285, B:111:0x02b6, B:112:0x02b7, B:114:0x02c7, B:116:0x02ce, B:120:0x02e1, B:125:0x0364, B:126:0x0365, B:100:0x0237, B:93:0x0204, B:75:0x016d, B:77:0x0173, B:81:0x01ae, B:80:0x01a4, B:82:0x01c6, B:86:0x01da, B:85:0x01d6, B:103:0x0286, B:105:0x028a, B:108:0x02af, B:110:0x02b3, B:123:0x035d, B:124:0x0363), top: B:132:0x00a1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c6 A[Catch: all -> 0x00b4, TryCatch #1 {all -> 0x00b4, blocks: (B:22:0x00a1, B:24:0x00af, B:28:0x00b9, B:30:0x00c3, B:32:0x00c9, B:34:0x00d3, B:43:0x00ea, B:52:0x0104, B:65:0x0127, B:69:0x014e, B:90:0x01f5, B:92:0x01ff, B:94:0x0208, B:101:0x0242, B:102:0x0285, B:111:0x02b6, B:112:0x02b7, B:114:0x02c7, B:116:0x02ce, B:120:0x02e1, B:125:0x0364, B:126:0x0365, B:100:0x0237, B:93:0x0204, B:75:0x016d, B:77:0x0173, B:81:0x01ae, B:80:0x01a4, B:82:0x01c6, B:86:0x01da, B:85:0x01d6, B:103:0x0286, B:105:0x028a, B:108:0x02af, B:110:0x02b3, B:123:0x035d, B:124:0x0363), top: B:132:0x00a1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d6 A[Catch: all -> 0x00b4, TryCatch #1 {all -> 0x00b4, blocks: (B:22:0x00a1, B:24:0x00af, B:28:0x00b9, B:30:0x00c3, B:32:0x00c9, B:34:0x00d3, B:43:0x00ea, B:52:0x0104, B:65:0x0127, B:69:0x014e, B:90:0x01f5, B:92:0x01ff, B:94:0x0208, B:101:0x0242, B:102:0x0285, B:111:0x02b6, B:112:0x02b7, B:114:0x02c7, B:116:0x02ce, B:120:0x02e1, B:125:0x0364, B:126:0x0365, B:100:0x0237, B:93:0x0204, B:75:0x016d, B:77:0x0173, B:81:0x01ae, B:80:0x01a4, B:82:0x01c6, B:86:0x01da, B:85:0x01d6, B:103:0x0286, B:105:0x028a, B:108:0x02af, B:110:0x02b3, B:123:0x035d, B:124:0x0363), top: B:132:0x00a1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ff A[Catch: all -> 0x00b4, TryCatch #1 {all -> 0x00b4, blocks: (B:22:0x00a1, B:24:0x00af, B:28:0x00b9, B:30:0x00c3, B:32:0x00c9, B:34:0x00d3, B:43:0x00ea, B:52:0x0104, B:65:0x0127, B:69:0x014e, B:90:0x01f5, B:92:0x01ff, B:94:0x0208, B:101:0x0242, B:102:0x0285, B:111:0x02b6, B:112:0x02b7, B:114:0x02c7, B:116:0x02ce, B:120:0x02e1, B:125:0x0364, B:126:0x0365, B:100:0x0237, B:93:0x0204, B:75:0x016d, B:77:0x0173, B:81:0x01ae, B:80:0x01a4, B:82:0x01c6, B:86:0x01da, B:85:0x01d6, B:103:0x0286, B:105:0x028a, B:108:0x02af, B:110:0x02b3, B:123:0x035d, B:124:0x0363), top: B:132:0x00a1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0204 A[Catch: all -> 0x00b4, TryCatch #1 {all -> 0x00b4, blocks: (B:22:0x00a1, B:24:0x00af, B:28:0x00b9, B:30:0x00c3, B:32:0x00c9, B:34:0x00d3, B:43:0x00ea, B:52:0x0104, B:65:0x0127, B:69:0x014e, B:90:0x01f5, B:92:0x01ff, B:94:0x0208, B:101:0x0242, B:102:0x0285, B:111:0x02b6, B:112:0x02b7, B:114:0x02c7, B:116:0x02ce, B:120:0x02e1, B:125:0x0364, B:126:0x0365, B:100:0x0237, B:93:0x0204, B:75:0x016d, B:77:0x0173, B:81:0x01ae, B:80:0x01a4, B:82:0x01c6, B:86:0x01da, B:85:0x01d6, B:103:0x0286, B:105:0x028a, B:108:0x02af, B:110:0x02b3, B:123:0x035d, B:124:0x0363), top: B:132:0x00a1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x022c  */
    /* JADX WARN: Code duplicated, block: B:97:0x022f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0233  */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x028a, please report this as an issue */
    /* JADX WARN: Type inference failed for: r9v7, types: [zh] */
    public final void p(String str, String str2, int i, int i2, long j, long j2, long j3, boolean z2, boolean z3) {
        int i3;
        int iMax;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        String str3;
        int i6;
        String strI;
        String strConcat;
        String str4;
        String strConcat2;
        String str5;
        Long l;
        long jCurrentTimeMillis;
        int i7;
        boolean z6;
        int iMax2;
        Notification notificationB;
        NotificationManager notificationManager;
        long j4;
        int i8;
        if (this.q == null) {
            return;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        z.put(str2, new fi(i2, j, j2, j3));
        if (j2 > 0) {
            i3 = 0;
            iMax = Math.max(0, Math.min(1000, (int) ((1000 * j) / j2)));
        } else {
            i3 = 0;
            iMax = Math.max(0, Math.min(1000, i2 * 10));
        }
        int iMax3 = j2 > 0 ? Math.max(0, Math.min(100, (int) ((100 * j) / j2))) : Math.max(i3, Math.min(100, i2));
        if (z3) {
            i4 = 2;
        } else {
            i4 = z2 ? 1 : 0;
        }
        ConcurrentHashMap concurrentHashMap = this.n;
        int i9 = iMax;
        final e4 e4Var = new e4(3);
        Object objComputeIfAbsent = concurrentHashMap.computeIfAbsent(str2, new Function() { // from class: zh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                e4 e4Var2 = e4Var;
                ConcurrentHashMap.KeySetView keySetView = ApkDownloadService.u;
                return e4Var2.g(obj);
            }
        });
        objComputeIfAbsent.getClass();
        synchronized (objComputeIfAbsent) {
            try {
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                Long l2 = (Long) this.k.get(str2);
                long jLongValue = l2 != null ? l2.longValue() : 0L;
                Integer num = (Integer) this.l.get(str2);
                int iIntValue = num != null ? num.intValue() : -1;
                Integer num2 = (Integer) this.m.get(str2);
                boolean z7 = i4 != (num2 != null ? num2.intValue() : -1);
                int i10 = iIntValue;
                boolean z8 = iMax3 >= 100;
                long j5 = jCurrentTimeMillis3 - jLongValue;
                boolean z9 = j5 >= 700;
                boolean z10 = j5 >= 2000;
                if (i10 >= 0) {
                    z4 = z8;
                    int i11 = i10 + 2;
                    i5 = i4;
                    if (iMax3 < Math.min(100, i11)) {
                        z5 = false;
                    }
                    if (!z7 || z4 || ((z9 && z5) || z10)) {
                        Intent intent = new Intent(this, (Class<?>) ApkDownloadService.class);
                        intent.setAction("action_cancel_download");
                        intent.putExtra("extra_package_name", str2);
                        PendingIntent service = PendingIntent.getService(this, i + 2, intent, 201326592);
                        Intent intent2 = new Intent(this, (Class<?>) ApkDownloadService.class);
                        if (z2) {
                            str3 = "action_resume_download";
                        } else {
                            str3 = "action_pause_download";
                        }
                        intent2.setAction(str3);
                        intent2.putExtra("extra_package_name", str2);
                        i6 = iMax3;
                        PendingIntent service2 = PendingIntent.getService(this, i + 1, intent2, 201326592);
                        if (z3) {
                            if (z2) {
                                str4 = "Pausada";
                            } else {
                                strI = i(j3);
                                if (j2 > 0) {
                                    double dMax = Math.max(0.0d, Math.min(100.0d, (j * 100.0d) / j2));
                                    Locale locale = Locale.US;
                                    Double dValueOf = Double.valueOf(dMax);
                                    String strH = h(j);
                                    String strH2 = h(j2);
                                    if (strI.length() == 0) {
                                        strConcat2 = "";
                                    } else {
                                        strConcat2 = " • ".concat(strI);
                                    }
                                    str4 = String.format(locale, "%.1f%% • %s/%s%s", Arrays.copyOf(new Object[]{dValueOf, strH, strH2, strConcat2}, 4));
                                } else {
                                    int iMax4 = Math.max(0, i2);
                                    if (strI.length() == 0) {
                                        strConcat = "";
                                    } else {
                                        strConcat = " • ".concat(strI);
                                    }
                                    str4 = iMax4 + "%" + strConcat;
                                }
                            }
                            if (z2) {
                                str5 = "Reanudar";
                            } else {
                                str5 = "Pausar";
                            }
                            l = (Long) this.i.get(str2);
                            if (l != null) {
                                jCurrentTimeMillis = l.longValue();
                            } else {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            }
                            t72 t72Var = new t72(this, "apklis_download_channel");
                            t72Var.r.icon = R.drawable.stat_sys_download;
                            t72Var.e = t72.c("Descargando ".concat(str));
                            t72Var.f = t72.c(str4);
                            if (j2 > 0) {
                                i7 = 1000;
                            } else {
                                i7 = 100;
                            }
                            if (j2 > 0) {
                                iMax2 = i9;
                                z6 = false;
                            } else {
                                z6 = false;
                                iMax2 = Math.max(0, Math.min(i2, 100));
                            }
                            t72Var.k = i7;
                            t72Var.l = iMax2;
                            t72Var.m = z6;
                            t72Var.r.when = jCurrentTimeMillis;
                            t72Var.i = true;
                            t72Var.d(2, true);
                            t72Var.d(8, true);
                            v11 v11Var = AppDetailActivity.b1;
                            t72Var.g = PendingIntent.getActivity(this, i, me1.Z(this, str2).addFlags(335544320), 201326592);
                            t72Var.a(R.drawable.ic_media_pause, str5, service2);
                            t72Var.a(R.drawable.ic_delete, "Cancelar", service);
                            notificationB = t72Var.b();
                            notificationB.getClass();
                            synchronized (this.s) {
                                try {
                                    if (!this.r) {
                                        startForeground(i, notificationB);
                                        this.r = true;
                                        Log.d("ApkDownloadService", "[FG_START] pkg=" + str2 + " notifId=" + i);
                                    }
                                    notificationManager = this.q;
                                    if (notificationManager != null) {
                                        rf1.W("nm");
                                        throw null;
                                    }
                                    notificationManager.notify(i, notificationB);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            try {
                                Intent intent3 = new Intent("cu.uci.android.apklis.DOWNLOAD_PROGRESS");
                                intent3.putExtra("extra_package_name", str2);
                                i8 = i6;
                                try {
                                    intent3.putExtra("progress", i8);
                                    j4 = j;
                                    try {
                                        intent3.putExtra("done_bytes", j4);
                                        intent3.putExtra("total_bytes", j2);
                                        sendBroadcast(intent3);
                                    } catch (Exception unused) {
                                    }
                                } catch (Exception unused2) {
                                    j4 = j;
                                }
                            } catch (Exception unused3) {
                                j4 = j;
                                i8 = i6;
                            }
                            this.k.put(str2, Long.valueOf(jCurrentTimeMillis3));
                            this.l.put(str2, Integer.valueOf(i8));
                            this.m.put(str2, Integer.valueOf(i5));
                            Log.d("ApkDownloadService", "[NOTIFY_PROGRESS] pkg=" + str2 + " notifId=" + i + " pct=" + i2 + " done=" + j4 + " total=" + j2 + " speed=" + j3 + " paused=" + z2 + " waitingNet=" + z3 + " dtMs=" + (System.currentTimeMillis() - jCurrentTimeMillis2));
                        }
                        str4 = "Sin conexion. Reintentando...";
                        if (z2) {
                            str5 = "Reanudar";
                        } else {
                            str5 = "Pausar";
                        }
                        l = (Long) this.i.get(str2);
                        if (l != null) {
                            jCurrentTimeMillis = l.longValue();
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        t72 t72Var2 = new t72(this, "apklis_download_channel");
                        t72Var2.r.icon = R.drawable.stat_sys_download;
                        t72Var2.e = t72.c("Descargando ".concat(str));
                        t72Var2.f = t72.c(str4);
                        if (j2 > 0) {
                            i7 = 1000;
                        } else {
                            i7 = 100;
                        }
                        if (j2 > 0) {
                            iMax2 = i9;
                            z6 = false;
                        } else {
                            z6 = false;
                            iMax2 = Math.max(0, Math.min(i2, 100));
                        }
                        t72Var2.k = i7;
                        t72Var2.l = iMax2;
                        t72Var2.m = z6;
                        t72Var2.r.when = jCurrentTimeMillis;
                        t72Var2.i = true;
                        t72Var2.d(2, true);
                        t72Var2.d(8, true);
                        v11 v11Var2 = AppDetailActivity.b1;
                        t72Var2.g = PendingIntent.getActivity(this, i, me1.Z(this, str2).addFlags(335544320), 201326592);
                        t72Var2.a(R.drawable.ic_media_pause, str5, service2);
                        t72Var2.a(R.drawable.ic_delete, "Cancelar", service);
                        notificationB = t72Var2.b();
                        notificationB.getClass();
                        synchronized (this.s) {
                            if (!this.r) {
                                startForeground(i, notificationB);
                                this.r = true;
                                Log.d("ApkDownloadService", "[FG_START] pkg=" + str2 + " notifId=" + i);
                            }
                            notificationManager = this.q;
                            if (notificationManager != null) {
                                rf1.W("nm");
                                throw null;
                            }
                            notificationManager.notify(i, notificationB);
                            Intent intent4 = new Intent("cu.uci.android.apklis.DOWNLOAD_PROGRESS");
                            intent4.putExtra("extra_package_name", str2);
                            i8 = i6;
                            intent4.putExtra("progress", i8);
                            j4 = j;
                            intent4.putExtra("done_bytes", j4);
                            intent4.putExtra("total_bytes", j2);
                            sendBroadcast(intent4);
                            this.k.put(str2, Long.valueOf(jCurrentTimeMillis3));
                            this.l.put(str2, Integer.valueOf(i8));
                            this.m.put(str2, Integer.valueOf(i5));
                            Log.d("ApkDownloadService", "[NOTIFY_PROGRESS] pkg=" + str2 + " notifId=" + i + " pct=" + i2 + " done=" + j4 + " total=" + j2 + " speed=" + j3 + " paused=" + z2 + " waitingNet=" + z3 + " dtMs=" + (System.currentTimeMillis() - jCurrentTimeMillis2));
                        }
                    }
                    return;
                }
                z4 = z8;
                i5 = i4;
                z5 = true;
                if (z7) {
                }
                Intent intent5 = new Intent(this, (Class<?>) ApkDownloadService.class);
                intent5.setAction("action_cancel_download");
                intent5.putExtra("extra_package_name", str2);
                PendingIntent service3 = PendingIntent.getService(this, i + 2, intent5, 201326592);
                Intent intent6 = new Intent(this, (Class<?>) ApkDownloadService.class);
                if (z2) {
                    str3 = "action_resume_download";
                } else {
                    str3 = "action_pause_download";
                }
                intent6.setAction(str3);
                intent6.putExtra("extra_package_name", str2);
                i6 = iMax3;
                PendingIntent service4 = PendingIntent.getService(this, i + 1, intent6, 201326592);
                if (z3) {
                    if (z2) {
                        str4 = "Pausada";
                    } else {
                        strI = i(j3);
                        if (j2 > 0) {
                            double dMax2 = Math.max(0.0d, Math.min(100.0d, (j * 100.0d) / j2));
                            Locale locale2 = Locale.US;
                            Double dValueOf2 = Double.valueOf(dMax2);
                            String strH3 = h(j);
                            String strH4 = h(j2);
                            if (strI.length() == 0) {
                                strConcat2 = "";
                            } else {
                                strConcat2 = " • ".concat(strI);
                            }
                            str4 = String.format(locale2, "%.1f%% • %s/%s%s", Arrays.copyOf(new Object[]{dValueOf2, strH3, strH4, strConcat2}, 4));
                        } else {
                            int iMax5 = Math.max(0, i2);
                            if (strI.length() == 0) {
                                strConcat = "";
                            } else {
                                strConcat = " • ".concat(strI);
                            }
                            str4 = iMax5 + "%" + strConcat;
                        }
                    }
                    if (z2) {
                        str5 = "Reanudar";
                    } else {
                        str5 = "Pausar";
                    }
                    l = (Long) this.i.get(str2);
                    if (l != null) {
                        jCurrentTimeMillis = l.longValue();
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    t72 t72Var3 = new t72(this, "apklis_download_channel");
                    t72Var3.r.icon = R.drawable.stat_sys_download;
                    t72Var3.e = t72.c("Descargando ".concat(str));
                    t72Var3.f = t72.c(str4);
                    if (j2 > 0) {
                        i7 = 1000;
                    } else {
                        i7 = 100;
                    }
                    if (j2 > 0) {
                        iMax2 = i9;
                        z6 = false;
                    } else {
                        z6 = false;
                        iMax2 = Math.max(0, Math.min(i2, 100));
                    }
                    t72Var3.k = i7;
                    t72Var3.l = iMax2;
                    t72Var3.m = z6;
                    t72Var3.r.when = jCurrentTimeMillis;
                    t72Var3.i = true;
                    t72Var3.d(2, true);
                    t72Var3.d(8, true);
                    v11 v11Var3 = AppDetailActivity.b1;
                    t72Var3.g = PendingIntent.getActivity(this, i, me1.Z(this, str2).addFlags(335544320), 201326592);
                    t72Var3.a(R.drawable.ic_media_pause, str5, service4);
                    t72Var3.a(R.drawable.ic_delete, "Cancelar", service3);
                    notificationB = t72Var3.b();
                    notificationB.getClass();
                    synchronized (this.s) {
                        if (!this.r) {
                            startForeground(i, notificationB);
                            this.r = true;
                            Log.d("ApkDownloadService", "[FG_START] pkg=" + str2 + " notifId=" + i);
                        }
                        notificationManager = this.q;
                        if (notificationManager != null) {
                            rf1.W("nm");
                            throw null;
                        }
                        notificationManager.notify(i, notificationB);
                        Intent intent7 = new Intent("cu.uci.android.apklis.DOWNLOAD_PROGRESS");
                        intent7.putExtra("extra_package_name", str2);
                        i8 = i6;
                        intent7.putExtra("progress", i8);
                        j4 = j;
                        intent7.putExtra("done_bytes", j4);
                        intent7.putExtra("total_bytes", j2);
                        sendBroadcast(intent7);
                        this.k.put(str2, Long.valueOf(jCurrentTimeMillis3));
                        this.l.put(str2, Integer.valueOf(i8));
                        this.m.put(str2, Integer.valueOf(i5));
                        Log.d("ApkDownloadService", "[NOTIFY_PROGRESS] pkg=" + str2 + " notifId=" + i + " pct=" + i2 + " done=" + j4 + " total=" + j2 + " speed=" + j3 + " paused=" + z2 + " waitingNet=" + z3 + " dtMs=" + (System.currentTimeMillis() - jCurrentTimeMillis2));
                    }
                }
                str4 = "Sin conexion. Reintentando...";
                if (z2) {
                    str5 = "Reanudar";
                } else {
                    str5 = "Pausar";
                }
                l = (Long) this.i.get(str2);
                if (l != null) {
                    jCurrentTimeMillis = l.longValue();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                t72 t72Var4 = new t72(this, "apklis_download_channel");
                t72Var4.r.icon = R.drawable.stat_sys_download;
                t72Var4.e = t72.c("Descargando ".concat(str));
                t72Var4.f = t72.c(str4);
                if (j2 > 0) {
                    i7 = 1000;
                } else {
                    i7 = 100;
                }
                if (j2 > 0) {
                    iMax2 = i9;
                    z6 = false;
                } else {
                    z6 = false;
                    iMax2 = Math.max(0, Math.min(i2, 100));
                }
                t72Var4.k = i7;
                t72Var4.l = iMax2;
                t72Var4.m = z6;
                t72Var4.r.when = jCurrentTimeMillis;
                t72Var4.i = true;
                t72Var4.d(2, true);
                t72Var4.d(8, true);
                v11 v11Var4 = AppDetailActivity.b1;
                t72Var4.g = PendingIntent.getActivity(this, i, me1.Z(this, str2).addFlags(335544320), 201326592);
                t72Var4.a(R.drawable.ic_media_pause, str5, service4);
                t72Var4.a(R.drawable.ic_delete, "Cancelar", service3);
                notificationB = t72Var4.b();
                notificationB.getClass();
                synchronized (this.s) {
                    if (!this.r) {
                        startForeground(i, notificationB);
                        this.r = true;
                        Log.d("ApkDownloadService", "[FG_START] pkg=" + str2 + " notifId=" + i);
                    }
                    notificationManager = this.q;
                    if (notificationManager != null) {
                        rf1.W("nm");
                        throw null;
                    }
                    notificationManager.notify(i, notificationB);
                    Intent intent8 = new Intent("cu.uci.android.apklis.DOWNLOAD_PROGRESS");
                    intent8.putExtra("extra_package_name", str2);
                    i8 = i6;
                    intent8.putExtra("progress", i8);
                    j4 = j;
                    intent8.putExtra("done_bytes", j4);
                    intent8.putExtra("total_bytes", j2);
                    sendBroadcast(intent8);
                    this.k.put(str2, Long.valueOf(jCurrentTimeMillis3));
                    this.l.put(str2, Integer.valueOf(i8));
                    this.m.put(str2, Integer.valueOf(i5));
                    Log.d("ApkDownloadService", "[NOTIFY_PROGRESS] pkg=" + str2 + " notifId=" + i + " pct=" + i2 + " done=" + j4 + " total=" + j2 + " speed=" + j3 + " paused=" + z2 + " waitingNet=" + z3 + " dtMs=" + (System.currentTimeMillis() - jCurrentTimeMillis2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q(int i, ci ciVar, String str, String str2) {
        while (!ciVar.d && !ciVar.c && !j()) {
            fi fiVar = (fi) z.get(str2);
            p(str, str2, i, fiVar != null ? fiVar.a : 0, fiVar != null ? fiVar.b : 0L, fiVar != null ? fiVar.c : -1L, fiVar != null ? fiVar.d : -1L, true, true);
            synchronized (ciVar.a) {
                try {
                    ciVar.a.wait(2000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public final void r(int i, ci ciVar, String str, String str2) {
        while (ciVar.c && !ciVar.d) {
            fi fiVar = (fi) z.get(str2);
            p(str, str2, i, fiVar != null ? fiVar.a : 0, fiVar != null ? fiVar.b : 0L, fiVar != null ? fiVar.c : -1L, fiVar != null ? fiVar.d : -1L, true, false);
            synchronized (ciVar.a) {
                try {
                    ciVar.a.wait(1500L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
