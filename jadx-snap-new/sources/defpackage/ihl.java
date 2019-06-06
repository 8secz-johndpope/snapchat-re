package defpackage;

import android.os.SystemClock;
import java.util.TimeZone;

/* renamed from: ihl */
public final class ihl implements ihh {
    public final long a() {
        return System.currentTimeMillis();
    }

    public final long b() {
        return SystemClock.uptimeMillis();
    }

    public final long c() {
        return SystemClock.elapsedRealtime();
    }

    public final long d() {
        return System.nanoTime();
    }

    public final TimeZone e() {
        return TimeZone.getDefault();
    }
}
