package defpackage;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

/* renamed from: apo */
public final class apo {
    private static final double a;

    static {
        double d = 1.0d;
        if (17 <= VERSION.SDK_INT) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        a = d;
    }

    public static double a(long j) {
        double a = (double) (apo.a() - j);
        double d = a;
        Double.isNaN(a);
        return a * d;
    }

    @TargetApi(17)
    public static long a() {
        return 17 <= VERSION.SDK_INT ? SystemClock.elapsedRealtimeNanos() : System.currentTimeMillis();
    }
}
