package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: bzj */
final class bzj implements byq {
    bzj() {
    }

    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    public final byw a(Looper looper, Callback callback) {
        return new bzk(new Handler(looper, callback));
    }

    public final long b() {
        return SystemClock.uptimeMillis();
    }
}
