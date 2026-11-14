package cu.uci.android.apklis.presentation.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.h42;
import defpackage.rf1;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/**
 * Android AccountAuthenticator service bound by AccountManager.
 *
 * @obfuscated_class cu.uci.android.apklis.presentation.service.MyAuthenticatorService
 */
public final class MyAuthenticatorService extends Service {
    public h42 e;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        h42 h42Var = this.e;
        if (h42Var == null) {
            rf1.W("mAuthenticator");
            throw null;
        }
        IBinder iBinder = h42Var.getIBinder();
        iBinder.getClass();
        return iBinder;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.e = new h42(this);
    }
}
