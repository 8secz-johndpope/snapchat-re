package defpackage;

import android.os.Looper;

/* renamed from: cfg */
public final class cfg {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean a(ajdv<?> ajdv) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected to be called on the main thread but was ");
        stringBuilder.append(Thread.currentThread().getName());
        ajdv.a(new IllegalStateException(stringBuilder.toString()));
        return false;
    }
}
