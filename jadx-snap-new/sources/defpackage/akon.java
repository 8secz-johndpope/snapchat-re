package defpackage;

import android.content.Context;

/* renamed from: akon */
public final class akon {
    public static Context a;
    private static String b;

    public static String a() {
        String str = b;
        if (str != null) {
            return str;
        }
        try {
            Class cls = Class.forName("android.app.ActivityThread");
            str = (String) cls.getMethod("getProcessName", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            b = str;
            return str;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
