package defpackage;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: ablv */
public final class ablv implements FrameCallback {
    private final Runnable a;
    private int b = 0;

    private ablv(Runnable runnable) {
        this.a = runnable;
    }

    public static ablv a(Runnable runnable) {
        ablv ablv = new ablv(runnable);
        Choreographer.getInstance().postFrameCallback(ablv);
        return ablv;
    }

    public final void a() {
        Choreographer.getInstance().removeFrameCallback(this);
    }

    public final void doFrame(long j) {
        this.b++;
        int i = this.b;
        if (i < 2) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        if (i == 2) {
            abmr.c(this.a);
        }
    }
}
