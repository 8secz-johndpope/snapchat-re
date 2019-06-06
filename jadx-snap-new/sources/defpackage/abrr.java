package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.snapchat.android.framework.misc.AppContext;
import java.util.HashMap;

/* renamed from: abrr */
public final class abrr {
    public static final HashMap<String, a> a;
    public static final boolean b;

    /* renamed from: abrr$a */
    public enum a {
        EMUI,
        MIUI,
        FLYME,
        SAMSUNG,
        HUAWEI,
        SONY,
        LG,
        VIVO,
        OPPO,
        LENOVO,
        LETV,
        QIKU,
        OTHER,
        MTK
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("SAMSUNG", a.SAMSUNG);
        a.put("HUAWEI", a.HUAWEI);
        a.put("SONY", a.SONY);
        a.put("OPPO", a.OPPO);
        a.put("LG", a.LG);
        a.put("LETV", a.LETV);
        a.put("QIKU", a.QIKU);
        a.put("360", a.QIKU);
        a.put("VIVO", a.VIVO);
        a.put("LENOVO", a.LENOVO);
        Context applicationContext = AppContext.get().getApplicationContext();
        b = applicationContext != null ? applicationContext.getPackageManager().hasSystemFeature("org.chromium.arc.device_management") : false;
    }

    public static int a() {
        String a = absm.a("ro.miui.ui.version.name", "");
        if (!TextUtils.isEmpty(a)) {
            try {
                return Integer.parseInt(a.substring(1));
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static double b() {
        try {
            String a = absm.a("ro.build.version.emui", "");
            if (!TextUtils.isEmpty(a)) {
                a = a.substring(a.indexOf(95) + 1);
                if (a.split("\\.").length > 2) {
                    a = a.substring(0, a.lastIndexOf(46));
                }
                return Double.parseDouble(a);
            }
        } catch (NumberFormatException unused) {
        }
        return -1.0d;
    }

    public static boolean c() {
        return b;
    }
}
