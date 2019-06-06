package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: bzk */
final class bzk implements byw {
    private final Handler a;

    public bzk(Handler handler) {
        this.a = handler;
    }

    public final Looper a() {
        return this.a.getLooper();
    }

    public final Message a(int i, int i2) {
        return this.a.obtainMessage(i, i2, 0);
    }

    public final Message a(int i, int i2, Object obj) {
        return this.a.obtainMessage(0, i, i2, obj);
    }

    public final Message a(int i, Object obj) {
        return this.a.obtainMessage(i, obj);
    }

    public final boolean a(int i) {
        return this.a.sendEmptyMessage(i);
    }

    public final boolean a(long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    public final void b() {
        this.a.removeMessages(2);
    }
}
