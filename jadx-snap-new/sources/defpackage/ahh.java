package defpackage;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

/* renamed from: ahh */
public final class ahh {
    private static final double a;

    static {
        double d = 1.0d;
        if (VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        a = d;
    }

    public static double a(long j) {
        double a = (double) (ahh.a() - j);
        double d = a;
        Double.isNaN(a);
        return a * d;
    }

    @TargetApi(17)
    public static long a() {
        return VERSION.SDK_INT >= 17 ? SystemClock.elapsedRealtimeNanos() : SystemClock.uptimeMillis();
    }
}
