package defpackage;

import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b!\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b#\u0010\bR\u001c\u0010%\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u001c\u0010&\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001c\u0010(\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b)\u0010\b¨\u0006+"}, d2 = {"Luo1;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "uuid", "Luo1$b;", "b", "Luo1$b;", "h", "()Luo1$b;", "licenseGroup", "Luo1$a;", "c", "Luo1$a;", "g", "()Luo1$a;", "license", "d", "i", "name", "", "e", "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", "price", "f", "device", "k", "status", "l", "statusDisplay", "expireIn", "expireAt", "createdAt", "activatedAt", "getCancelledAt", "cancelledAt", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class uo1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("uuid")
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("license_group")
    private final b licenseGroup;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("license")
    private final a license;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("price")
    private final Double price;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("device")
    private final String device;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("status")
    private final String status;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("status_display")
    private final String statusDisplay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("expire_in")
    private final String expireIn;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @SerializedName("expire_at")
    private final String expireAt;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @SerializedName("created_at")
    private final String createdAt;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @SerializedName("activated_at")
    private final String activatedAt;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @SerializedName("cancelled_at")
    private final String cancelledAt;

    /* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087D¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\n\u0010\u000e¨\u0006\u0010"}, d2 = {"Luo1$a;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "uuid", "b", "name", "", "D", "()D", "price", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("uuid")
        private final String uuid;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("name")
        private final String name;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("price")
        private final double price;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getPrice() {
            return this.price;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u0010"}, d2 = {"Luo1$b;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "getUuid", "()Ljava/lang/String;", "uuid", "b", "c", "packageName", "name", "d", "icon", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("uuid")
        private final String uuid;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("package_name")
        private final String packageName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("name")
        private final String name;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("icon")
        private final String icon;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPackageName() {
            return this.packageName;
        }
    }

    public final Integer a() {
        Object iu2Var;
        String str = this.expireIn;
        if (str == null && (str = this.expireAt) == null) {
            return null;
        }
        Pattern patternCompile = Pattern.compile("\\.\\d+");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        Pattern patternCompile2 = Pattern.compile("[+-]\\d{2}:\\d{2}$");
        patternCompile2.getClass();
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("");
        strReplaceAll2.getClass();
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()).parse(strReplaceAll2);
            iu2Var = date != null ? Integer.valueOf((int) ((date.getTime() - System.currentTimeMillis()) / 86400000)) : null;
        } catch (Throwable th) {
            iu2Var = new iu2(th);
        }
        return (Integer) (iu2Var instanceof iu2 ? null : iu2Var);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActivatedAt() {
        return this.activatedAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getExpireAt() {
        return this.expireAt;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getExpireIn() {
        return this.expireIn;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final a getLicense() {
        return this.license;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getLicenseGroup() {
        return this.licenseGroup;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getStatusDisplay() {
        return this.statusDisplay;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }
}
