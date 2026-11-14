package cu.uci.android.apklis.presentation.provider;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import defpackage.g01;
import defpackage.i42;
import defpackage.j2;
import defpackage.j42;
import defpackage.me1;
import defpackage.q30;
import defpackage.rf1;
import defpackage.so;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/**
 * Exported ContentProvider exposing account_data (username, device_id, access_token, code) to third-party apps.
 *
 * @obfuscated_class cu.uci.android.apklis.presentation.provider.ApklisLicenseProvider
 */
public final class ApklisLicenseProvider extends ContentProvider {
    public static final Uri f;
    public static final UriMatcher g;
    public AccountManager e;

    static {
        Uri uri = Uri.parse("content://cu.uci.android.apklis.ApklisLicenseProvider/account_data");
        uri.getClass();
        f = uri;
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("cu.uci.android.apklis.ApklisLicenseProvider", "account_data", 1);
        g = uriMatcher;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException("Delete not supported");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        if (g.match(uri) == 1) {
            return "vnd.android.cursor.dir/vnd.cu.uci.android.apklis.account_data";
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
        AccountManager accountManager = AccountManager.get(getContext());
        accountManager.getClass();
        this.e = accountManager;
        Log.d("ApklisLicenseProvider", "ApklisLicenseProvider created");
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6 A[Catch: Exception -> 0x012e, TRY_ENTER, TryCatch #0 {Exception -> 0x012e, blocks: (B:47:0x00d0, B:50:0x00d6, B:52:0x00fe, B:54:0x010d, B:56:0x0115, B:58:0x011f, B:61:0x0130, B:62:0x0133, B:63:0x0134, B:64:0x0137, B:65:0x0138, B:66:0x013b, B:67:0x013c, B:69:0x014e, B:70:0x016a, B:72:0x0171, B:73:0x0184, B:74:0x0189), top: B:90:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe A[Catch: Exception -> 0x012e, TryCatch #0 {Exception -> 0x012e, blocks: (B:47:0x00d0, B:50:0x00d6, B:52:0x00fe, B:54:0x010d, B:56:0x0115, B:58:0x011f, B:61:0x0130, B:62:0x0133, B:63:0x0134, B:64:0x0137, B:65:0x0138, B:66:0x013b, B:67:0x013c, B:69:0x014e, B:70:0x016a, B:72:0x0171, B:73:0x0184, B:74:0x0189), top: B:90:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x010d A[Catch: Exception -> 0x012e, TryCatch #0 {Exception -> 0x012e, blocks: (B:47:0x00d0, B:50:0x00d6, B:52:0x00fe, B:54:0x010d, B:56:0x0115, B:58:0x011f, B:61:0x0130, B:62:0x0133, B:63:0x0134, B:64:0x0137, B:65:0x0138, B:66:0x013b, B:67:0x013c, B:69:0x014e, B:70:0x016a, B:72:0x0171, B:73:0x0184, B:74:0x0189), top: B:90:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0115 A[Catch: Exception -> 0x012e, TryCatch #0 {Exception -> 0x012e, blocks: (B:47:0x00d0, B:50:0x00d6, B:52:0x00fe, B:54:0x010d, B:56:0x0115, B:58:0x011f, B:61:0x0130, B:62:0x0133, B:63:0x0134, B:64:0x0137, B:65:0x0138, B:66:0x013b, B:67:0x013c, B:69:0x014e, B:70:0x016a, B:72:0x0171, B:73:0x0184, B:74:0x0189), top: B:90:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x011f A[Catch: Exception -> 0x012e, LOOP:1: B:51:0x00fc->B:58:0x011f, LOOP_END, TryCatch #0 {Exception -> 0x012e, blocks: (B:47:0x00d0, B:50:0x00d6, B:52:0x00fe, B:54:0x010d, B:56:0x0115, B:58:0x011f, B:61:0x0130, B:62:0x0133, B:63:0x0134, B:64:0x0137, B:65:0x0138, B:66:0x013b, B:67:0x013c, B:69:0x014e, B:70:0x016a, B:72:0x0171, B:73:0x0184, B:74:0x0189), top: B:90:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x014e A[Catch: Exception -> 0x012e, LOOP:2: B:68:0x014c->B:69:0x014e, LOOP_END, TryCatch #0 {Exception -> 0x012e, blocks: (B:47:0x00d0, B:50:0x00d6, B:52:0x00fe, B:54:0x010d, B:56:0x0115, B:58:0x011f, B:61:0x0130, B:62:0x0133, B:63:0x0134, B:64:0x0137, B:65:0x0138, B:66:0x013b, B:67:0x013c, B:69:0x014e, B:70:0x016a, B:72:0x0171, B:73:0x0184, B:74:0x0189), top: B:90:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0171 A[Catch: Exception -> 0x012e, LOOP:3: B:71:0x016f->B:72:0x0171, LOOP_END, TryCatch #0 {Exception -> 0x012e, blocks: (B:47:0x00d0, B:50:0x00d6, B:52:0x00fe, B:54:0x010d, B:56:0x0115, B:58:0x011f, B:61:0x0130, B:62:0x0133, B:63:0x0134, B:64:0x0137, B:65:0x0138, B:66:0x013b, B:67:0x013c, B:69:0x014e, B:70:0x016a, B:72:0x0171, B:73:0x0184, B:74:0x0189), top: B:90:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0184 A[Catch: Exception -> 0x012e, TryCatch #0 {Exception -> 0x012e, blocks: (B:47:0x00d0, B:50:0x00d6, B:52:0x00fe, B:54:0x010d, B:56:0x0115, B:58:0x011f, B:61:0x0130, B:62:0x0133, B:63:0x0134, B:64:0x0137, B:65:0x0138, B:66:0x013b, B:67:0x013c, B:69:0x014e, B:70:0x016a, B:72:0x0171, B:73:0x0184, B:74:0x0189), top: B:90:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e1  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00d6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x01c6, please report this as an issue */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        boolean z;
        boolean z2;
        MatrixCursor matrixCursor;
        Context context;
        i42 i42VarE;
        AccountManager accountManager;
        Account[] accountsByType;
        ArrayList arrayList;
        int length;
        int i;
        ArrayList arrayList2;
        int size;
        int i2;
        int size2;
        int i3;
        Account account;
        String str3;
        AccountManager accountManager2;
        String userData;
        AccountManager accountManager3;
        String userData2;
        Account[] accountArr;
        AccountManager accountManager4;
        uri.getClass();
        int callingUid = Binder.getCallingUid();
        Context context2 = getContext();
        if (context2 != null) {
            boolean z3 = callingUid == Process.myUid();
            boolean z4 = context2.checkCallingPermission("cu.uci.android.apklis.READ_ACCOUNT_DATA") == 0;
            try {
                String[] packagesForUid = context2.getPackageManager().getPackagesForUid(callingUid);
                z = false;
                z2 = false;
                if (packagesForUid != null) {
                    int i4 = 0;
                    while (i4 < packagesForUid.length) {
                        try {
                            int i5 = i4 + 1;
                            try {
                                String str4 = packagesForUid[i4];
                                if (context2.getPackageManager().checkSignatures(context2.getPackageName(), str4) == 0) {
                                    Log.i("ApklisLicenseProvider", "Authorized by signature match: " + str4);
                                    z = true;
                                }
                                PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(str4, 4096);
                                packageInfo.getClass();
                                String[] strArr3 = packageInfo.requestedPermissions;
                                if (strArr3 != null) {
                                    if (so.r0(strArr3, "cu.uci.android.apklis.READ_ACCOUNT_DATA") >= 0) {
                                        Log.i("ApklisLicenseProvider", "Authorized by manifest declaration: " + str4);
                                        z2 = true;
                                    }
                                }
                                i4 = i5;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw new NoSuchElementException(e.getMessage());
                            }
                        } catch (PackageManager.NameNotFoundException e2) {
                            e = e2;
                            Log.e("ApklisLicenseProvider", "Error checking caller identity", e);
                            if (!z3) {
                            }
                            if (g.match(uri) == 1) {
                                g01.h(uri, "Unknown URI: ");
                                return null;
                            }
                            Log.d("ApklisLicenseProvider", "Getting account data...");
                            matrixCursor = new MatrixCursor(new String[]{"username", "device_id", "access_token", "code"});
                            try {
                                accountManager = this.e;
                                if (accountManager != null) {
                                    rf1.W("accountManager");
                                    throw null;
                                }
                                accountsByType = accountManager.getAccountsByType("cu.uci.android.apklis");
                                accountsByType.getClass();
                                Log.d("ApklisLicenseProvider", "Found " + accountsByType.length + " accounts in AccountManager");
                                arrayList = new ArrayList(accountsByType.length);
                                length = accountsByType.length;
                                i = 0;
                                while (i < length) {
                                    account = accountsByType[i];
                                    str3 = account.name;
                                    str3.getClass();
                                    accountManager2 = this.e;
                                    if (accountManager2 != null) {
                                        rf1.W("accountManager");
                                        throw null;
                                    }
                                    userData = accountManager2.getUserData(account, "device_id");
                                    accountManager3 = this.e;
                                    if (accountManager3 != null) {
                                        rf1.W("accountManager");
                                        throw null;
                                    }
                                    userData2 = accountManager3.getUserData(account, "access_token");
                                    accountArr = accountsByType;
                                    accountManager4 = this.e;
                                    if (accountManager4 != null) {
                                        rf1.W("accountManager");
                                        throw null;
                                    }
                                    arrayList.add(new j2(str3, userData, userData2, accountManager4.getUserData(account, "code")));
                                    i++;
                                    accountsByType = accountArr;
                                }
                                arrayList2 = new ArrayList(q30.j0(arrayList, 10));
                                size = arrayList.size();
                                i2 = 0;
                                while (i2 < size) {
                                    Object obj = arrayList.get(i2);
                                    i2++;
                                    j2 j2Var = (j2) obj;
                                    arrayList2.add(me1.X(j2Var.a, j2Var.b, j2Var.c, j2Var.d));
                                }
                                size2 = arrayList2.size();
                                i3 = 0;
                                while (i3 < size2) {
                                    Object obj2 = arrayList2.get(i3);
                                    i3++;
                                    matrixCursor.addRow(((List) obj2).toArray(new Object[0]));
                                }
                                if (matrixCursor.getCount() != 0) {
                                    Log.d("ApklisLicenseProvider", "Returning cursor with " + matrixCursor.getCount() + " rows");
                                } else {
                                    context = getContext();
                                    if (context != null) {
                                        i42VarE = j42.e(context);
                                        if (i42VarE != null) {
                                            Log.i("ApklisLicenseProvider", "AccountManager empty or failed — falling back to SharedPreferences account data");
                                            matrixCursor.addRow(new String[]{i42VarE.a, i42VarE.b, i42VarE.c, i42VarE.d});
                                        }
                                        Log.d("ApklisLicenseProvider", "Returning cursor with " + matrixCursor.getCount() + " rows");
                                    }
                                }
                                return matrixCursor;
                            } catch (Exception e3) {
                                Log.e("ApklisLicenseProvider", "Error retrieving account data: " + e3.getMessage(), e3);
                            }
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e4) {
                e = e4;
                z = false;
                z2 = false;
            }
            if (!z3 || z4 || z || z2) {
                if (g.match(uri) == 1) {
                    g01.h(uri, "Unknown URI: ");
                    return null;
                }
                Log.d("ApklisLicenseProvider", "Getting account data...");
                matrixCursor = new MatrixCursor(new String[]{"username", "device_id", "access_token", "code"});
                accountManager = this.e;
                if (accountManager != null) {
                    rf1.W("accountManager");
                    throw null;
                }
                accountsByType = accountManager.getAccountsByType("cu.uci.android.apklis");
                accountsByType.getClass();
                Log.d("ApklisLicenseProvider", "Found " + accountsByType.length + " accounts in AccountManager");
                arrayList = new ArrayList(accountsByType.length);
                length = accountsByType.length;
                i = 0;
                while (i < length) {
                    account = accountsByType[i];
                    str3 = account.name;
                    str3.getClass();
                    accountManager2 = this.e;
                    if (accountManager2 != null) {
                        rf1.W("accountManager");
                        throw null;
                    }
                    userData = accountManager2.getUserData(account, "device_id");
                    accountManager3 = this.e;
                    if (accountManager3 != null) {
                        rf1.W("accountManager");
                        throw null;
                    }
                    userData2 = accountManager3.getUserData(account, "access_token");
                    accountArr = accountsByType;
                    accountManager4 = this.e;
                    if (accountManager4 != null) {
                        rf1.W("accountManager");
                        throw null;
                    }
                    arrayList.add(new j2(str3, userData, userData2, accountManager4.getUserData(account, "code")));
                    i++;
                    accountsByType = accountArr;
                }
                arrayList2 = new ArrayList(q30.j0(arrayList, 10));
                size = arrayList.size();
                i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    j2 j2Var2 = (j2) obj3;
                    arrayList2.add(me1.X(j2Var2.a, j2Var2.b, j2Var2.c, j2Var2.d));
                }
                size2 = arrayList2.size();
                i3 = 0;
                while (i3 < size2) {
                    Object obj4 = arrayList2.get(i3);
                    i3++;
                    matrixCursor.addRow(((List) obj4).toArray(new Object[0]));
                }
                if (matrixCursor.getCount() != 0) {
                    Log.d("ApklisLicenseProvider", "Returning cursor with " + matrixCursor.getCount() + " rows");
                } else {
                    context = getContext();
                    if (context != null) {
                        i42VarE = j42.e(context);
                        if (i42VarE != null) {
                            Log.i("ApklisLicenseProvider", "AccountManager empty or failed — falling back to SharedPreferences account data");
                            matrixCursor.addRow(new String[]{i42VarE.a, i42VarE.b, i42VarE.c, i42VarE.d});
                        }
                        Log.d("ApklisLicenseProvider", "Returning cursor with " + matrixCursor.getCount() + " rows");
                    }
                }
                return matrixCursor;
            }
        }
        Log.w("ApklisLicenseProvider", "Access DENIED for UID " + Binder.getCallingUid() + " — missing cu.uci.android.apklis.READ_ACCOUNT_DATA");
        throw new SecurityException("Permission Denial: requires cu.uci.android.apklis.READ_ACCOUNT_DATA");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        throw new UnsupportedOperationException("Update not supported");
    }
}
