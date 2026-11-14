package cu.uci.android.apklis.presentation.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import cu.uci.android.apklis.presentation.receiver.PackageInstallReceiver;
import cu.uci.android.apklis.presentation.service.ApkDownloadService;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/* JADX INFO: loaded from: classes.dex */
public final class PackageInstallReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        String action = intent.getAction();
        Log.d("PackageInstallReceiver", "onReceive action=" + action + " data=" + intent.getData());
        if (!"android.intent.action.PACKAGE_ADDED".equals(action) && !"android.intent.action.PACKAGE_REPLACED".equals(action)) {
            Log.d("PackageInstallReceiver", "Ignoring action=" + action);
            return;
        }
        Uri data = intent.getData();
        final String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (schemeSpecificPart == null || schemeSpecificPart.length() == 0) {
            Log.w("PackageInstallReceiver", "Empty package name, aborting delete");
            return;
        }
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Log.d("PackageInstallReceiver", "Installed package=" + schemeSpecificPart + ", starting async delete flow");
        final boolean z = ApkDownloadService.y.containsKey(schemeSpecificPart) || ApkDownloadService.v.contains(schemeSpecificPart) || ApkDownloadService.u.contains(schemeSpecificPart);
        Log.d("PackageInstallReceiver", "wasDownloadedByApklis=" + z + " for " + schemeSpecificPart);
        new Thread(new Runnable() { // from class: wd2
            @Override // java.lang.Runnable
            public final void run() {
                String string;
                String str = schemeSpecificPart;
                Context context2 = context;
                BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                int i = PackageInstallReceiver.a;
                try {
                    try {
                        Log.d("PackageInstallReceiver", "Waiting 1500ms before delete for ".concat(str));
                        Thread.sleep(1500L);
                        Log.d("PackageInstallReceiver", "Calling deletePendingApkIfNeeded for ".concat(str));
                        ConcurrentHashMap.KeySetView keySetView = ApkDownloadService.u;
                        q41.o(context2, str);
                        if (z) {
                            try {
                                PackageManager packageManager = context2.getPackageManager();
                                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
                                applicationInfo.getClass();
                                string = packageManager.getApplicationLabel(applicationInfo).toString();
                            } catch (PackageManager.NameNotFoundException unused) {
                                string = str;
                            }
                            Log.d("PackageInstallReceiver", "Showing install notification for " + string + " (" + str + ")");
                            ConcurrentHashMap.KeySetView keySetView2 = ApkDownloadService.u;
                            q41.w(context2, str, string);
                        } else {
                            Log.d("PackageInstallReceiver", "Skipping notification — " + str + " was not downloaded by Apklis");
                        }
                        Log.d("PackageInstallReceiver", "Delete flow finished for ".concat(str));
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        Log.w("PackageInstallReceiver", "Interrupted while waiting to delete ".concat(str));
                    }
                } finally {
                    Log.d("PackageInstallReceiver", "Finishing async receiver for ".concat(str));
                    pendingResult.finish();
                }
            }
        }).start();
    }
}
