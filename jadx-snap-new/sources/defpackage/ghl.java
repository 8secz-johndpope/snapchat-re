package defpackage;

import android.os.Looper;

/* renamed from: ghl */
public final class ghl implements gfd {
    public final boolean a() {
        Object currentThread = Thread.currentThread();
        Object mainLooper = Looper.getMainLooper();
        akcr.a(mainLooper, "Looper.getMainLooper()");
        return akcr.a(currentThread, mainLooper.getThread());
    }
}
