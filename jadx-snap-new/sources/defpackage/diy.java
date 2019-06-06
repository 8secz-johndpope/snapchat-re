package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: diy */
final class diy extends HandlerThread {
    Handler a;

    public diy(String str) {
        super(str, 10);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        if (this.a == null) {
            this.a = new Handler(getLooper());
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Runnable runnable, long j) {
        a();
        this.a.postDelayed(runnable, j);
    }
}
