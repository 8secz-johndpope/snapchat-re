package defpackage;

import android.os.Looper;

/* renamed from: jxo */
public final class jxo {
    public static boolean a() {
        Object currentThread = Thread.currentThread();
        Object mainLooper = Looper.getMainLooper();
        akcr.a(mainLooper, "Looper.getMainLooper()");
        return akcr.a(currentThread, mainLooper.getThread());
    }
}
