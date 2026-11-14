package cu.uci.android.apklis.presentation.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import defpackage.c;
import defpackage.g01;
import defpackage.i42;
import defpackage.j42;
import defpackage.vt1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/* JADX INFO: loaded from: classes.dex */
public final class PaymentProvider extends ContentProvider {
    public static final UriMatcher f;
    public static final String[] g;
    public static final Uri h;
    public final ExecutorService e = Executors.newFixedThreadPool(2);

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("cu.uci.android.apklis.PaymentProvider", "app/*", 1);
        f = uriMatcher;
        g = new String[]{"paid", "user_name"};
        Uri uri = Uri.parse("content://cu.uci.android.apklis.PaymentProvider");
        uri.getClass();
        h = uri;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException("Delete not supported");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        if (f.match(uri) == 1) {
            return "vnd.android.cursor.item/vnd.cu.uci.android.apklis.PaymentProvider.app";
        }
        g01.h(uri, "Unknown URI: ");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        throw new UnsupportedOperationException("Insert not supported");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.getClass();
        Boolean bool = null;
        if (f.match(uri) != 1) {
            g01.h(uri, "Unknown URI: ");
            return null;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null || lastPathSegment.length() == 0) {
            c.j("Package name must be provided");
            return null;
        }
        Context context = getContext();
        if (context == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(g);
        SharedPreferences sharedPreferences = context.getSharedPreferences("payment_cache", 0);
        i42 i42VarE = j42.e(context);
        String str3 = i42VarE != null ? i42VarE.a : "";
        Log.d("PaymentProvider", "Checking payment for package: ".concat(lastPathSegment));
        Log.d("PaymentProvider", "Using username: ".concat(str3));
        ?? BooleanValue = sharedPreferences.getBoolean("cached_paid_".concat(lastPathSegment), false);
        Log.d("PaymentProvider", "Cached payment status: " + ((boolean) BooleanValue));
        Future futureSubmit = this.e.submit(new vt1(lastPathSegment, sharedPreferences));
        try {
            bool = (Boolean) futureSubmit.get(5L, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            Log.e("PaymentProvider", "API call timed out", e);
            futureSubmit.cancel(true);
        } catch (Exception e2) {
            Log.e("PaymentProvider", "Error getting API call result", e2);
        }
        if (bool != null) {
            BooleanValue = bool.booleanValue();
        }
        Log.d("PaymentProvider", "Final payment status: " + ((boolean) BooleanValue) + " (from " + (bool != null ? "API" : "cache") + ")");
        matrixCursor.addRow(new Object[]{Integer.valueOf((int) BooleanValue), str3});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        super.shutdown();
        this.e.shutdown();
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException("Update not supported");
    }
}
