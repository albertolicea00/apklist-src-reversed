package cu.uci.android.apklis.presentation.ui.action;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.google.gson.Gson;
import cu.uci.android.apklis.R;
import cu.uci.android.apklis.di.AppApplication;
import cu.uci.android.apklis.presentation.ui.action.ActionFormActivity;
import cu.uci.android.apklis.presentation.ui.main.MainActivity;
import defpackage.aq0;
import defpackage.f60;
import defpackage.l3;
import defpackage.m3;
import defpackage.t2;
import defpackage.un0;
import defpackage.v11;
import defpackage.v2;
import defpackage.y50;
import defpackage.z3;
import defpackage.z50;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/* JADX INFO: loaded from: classes.dex */
public final class ActionFormActivity extends y50 {
    public static final /* synthetic */ int y = 0;

    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.y50, defpackage.x50, android.app.Activity
    public final void onCreate(Bundle bundle) {
        z3 z3Var;
        List fields;
        String name;
        Object arrayList;
        String name2;
        un0.a(this);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("action_json");
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            z3Var = (z3) new Gson().fromJson(stringExtra, z3.class);
        } catch (Exception unused) {
            z3Var = null;
        }
        if (z3Var == null || (fields = z3Var.getFields()) == null || fields.isEmpty()) {
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.setFlags(268468224);
            startActivity(intent);
            finish();
            return;
        }
        Application application = getApplication();
        application.getClass();
        m3 m3Var = new m3(((AppApplication) application).b(), z3Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<t2> fields2 = m3Var.c.getFields();
        if (fields2 == null) {
            fields2 = aq0.e;
        }
        for (t2 t2Var : fields2) {
            String type = t2Var.getType();
            if (type != null) {
                switch (type.hashCode()) {
                    case -1361224287:
                        if (type.equals("choice")) {
                            name = t2Var.getName();
                            if (name == null) {
                                name = "";
                            }
                            if (t2Var.getMultiple()) {
                                arrayList = new ArrayList();
                            } else {
                                arrayList = "";
                            }
                            linkedHashMap.put(name, arrayList);
                        }
                        break;
                    case -906021636:
                        if (type.equals("select")) {
                            name = t2Var.getName();
                            if (name == null) {
                                name = "";
                            }
                            if (t2Var.getMultiple()) {
                                arrayList = new ArrayList();
                            } else {
                                arrayList = "";
                            }
                            linkedHashMap.put(name, arrayList);
                        }
                        break;
                    case 3002509:
                        if (type.equals("area")) {
                            name2 = t2Var.getName();
                            if (name2 == null) {
                                name2 = "";
                            }
                            linkedHashMap.put(name2, "");
                        }
                        break;
                    case 3556653:
                        if (type.equals("text")) {
                            name2 = t2Var.getName();
                            if (name2 == null) {
                                name2 = "";
                            }
                            linkedHashMap.put(name2, "");
                        }
                        break;
                    case 1216985755:
                        if (type.equals("password")) {
                            name2 = t2Var.getName();
                            if (name2 == null) {
                                name2 = "";
                            }
                            linkedHashMap.put(name2, "");
                        }
                        break;
                }
            }
        }
        m3Var.h.h(linkedHashMap);
        final byte b = 0;
        m3Var.f.e(this, new l3(new v11(this) { // from class: u2
            public final /* synthetic */ ActionFormActivity f;

            {
                this.f = this;
            }

            @Override // defpackage.v11
            public final Object g(Object obj) {
                int i = b;
                os3 os3Var = os3.a;
                ActionFormActivity actionFormActivity = this.f;
                switch (i) {
                    case 0:
                        String str = (String) obj;
                        int i2 = ActionFormActivity.y;
                        if (str != null && !qb3.U(str)) {
                            k92.u(actionFormActivity, str, l73.f, 2);
                        }
                        break;
                    default:
                        int i3 = ActionFormActivity.y;
                        if (rf1.o((Boolean) obj, Boolean.TRUE)) {
                            String string = actionFormActivity.getString(rf1.o(Locale.getDefault().getLanguage(), "es") ? R.string.action_form_success_es : R.string.action_form_success_en);
                            string.getClass();
                            k92.u(actionFormActivity, string, l73.g, 2);
                            Intent intent2 = new Intent(actionFormActivity, (Class<?>) MainActivity.class);
                            intent2.setFlags(268468224);
                            actionFormActivity.startActivity(intent2);
                            actionFormActivity.finish();
                        }
                        break;
                }
                return os3Var;
            }
        }, 0));
        final int i = 1;
        m3Var.e.e(this, new l3(new v11(this) { // from class: u2
            public final /* synthetic */ ActionFormActivity f;

            {
                this.f = this;
            }

            @Override // defpackage.v11
            public final Object g(Object obj) {
                int i2 = i;
                os3 os3Var = os3.a;
                ActionFormActivity actionFormActivity = this.f;
                switch (i2) {
                    case 0:
                        String str = (String) obj;
                        int i3 = ActionFormActivity.y;
                        if (str != null && !qb3.U(str)) {
                            k92.u(actionFormActivity, str, l73.f, 2);
                        }
                        break;
                    default:
                        int i4 = ActionFormActivity.y;
                        if (rf1.o((Boolean) obj, Boolean.TRUE)) {
                            String string = actionFormActivity.getString(rf1.o(Locale.getDefault().getLanguage(), "es") ? R.string.action_form_success_es : R.string.action_form_success_en);
                            string.getClass();
                            k92.u(actionFormActivity, string, l73.g, 2);
                            Intent intent2 = new Intent(actionFormActivity, (Class<?>) MainActivity.class);
                            intent2.setFlags(268468224);
                            actionFormActivity.startActivity(intent2);
                            actionFormActivity.finish();
                        }
                        break;
                }
                return os3Var;
            }
        }, 0));
        z50.a(this, new f60(-1459974560, true, new v2(m3Var, b, b)));
    }
}
