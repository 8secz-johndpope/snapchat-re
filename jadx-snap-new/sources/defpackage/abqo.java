package defpackage;

import android.os.SystemClock;

/* renamed from: abqo */
public final class abqo {
    public static long a() {
        return System.currentTimeMillis();
    }

    public static akqy a(long j) {
        return new akqy(j);
    }

    public static long b() {
        return SystemClock.uptimeMillis();
    }

    public static long c() {
        return SystemClock.elapsedRealtime();
    }

    public static akqy d() {
        return new akqy(System.currentTimeMillis());
    }

    public static long e() {
        return SystemClock.currentThreadTimeMillis();
    }
}
