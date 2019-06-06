package defpackage;

import android.util.Log;

/* renamed from: acbs */
public final class acbs {
    private static final String a = "acbs";
    private static volatile Boolean b;

    private acbs() {
        throw new AssertionError("No instances.");
    }

    public static boolean a() {
        Boolean bool = b;
        if (bool == null) {
            synchronized (acbs.class) {
                bool = b;
                if (bool == null) {
                    bool = Boolean.valueOf(acbs.b());
                    b = bool;
                }
            }
        }
        return bool.booleanValue();
    }

    private static boolean b() {
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("catalyst");
            return true;
        } catch (Throwable th) {
            String str = a;
            StringBuilder stringBuilder = new StringBuilder("UnsatisfiedLinkError: ");
            stringBuilder.append(th.getMessage());
            Log.e(str, stringBuilder.toString(), th);
            return false;
        }
    }
}
