package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: aius */
public final class aius implements Comparable<aius> {
    private static final a a = new a();
    private static final long b;
    private static final long c;
    private final b d;
    private final long e;
    private volatile boolean f;

    /* renamed from: aius$b */
    static abstract class b {
        b() {
        }

        public abstract long a();
    }

    /* renamed from: aius$a */
    static class a extends b {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final long a() {
            return System.nanoTime();
        }
    }

    static {
        long toNanos = TimeUnit.DAYS.toNanos(36500);
        b = toNanos;
        c = -toNanos;
    }

    private aius(b bVar, long j) {
        this(bVar, bVar.a(), j);
    }

    private aius(b bVar, long j, long j2) {
        this.d = bVar;
        j2 = Math.min(b, Math.max(c, j2));
        this.e = j + j2;
        this.f = j2 <= 0;
    }

    public static aius a(long j, TimeUnit timeUnit) {
        a aVar = a;
        if (timeUnit != null) {
            return new aius(aVar, timeUnit.toNanos(j));
        }
        throw new NullPointerException("units");
    }

    public final long a(TimeUnit timeUnit) {
        long a = this.d.a();
        if (!this.f && this.e - a <= 0) {
            this.f = true;
        }
        return timeUnit.convert(this.e - a, TimeUnit.NANOSECONDS);
    }

    public final aius a(aius aius) {
        return (((this.e - aius.e) > 0 ? 1 : ((this.e - aius.e) == 0 ? 0 : -1)) < 0 ? 1 : null) != null ? this : aius;
    }

    public final boolean a() {
        if (!this.f) {
            if (this.e - this.d.a() > 0) {
                return false;
            }
            this.f = true;
        }
        return true;
    }

    /* renamed from: b */
    public final int compareTo(aius aius) {
        long j = this.e - aius.e;
        return j < 0 ? -1 : j > 0 ? 1 : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a(TimeUnit.NANOSECONDS));
        stringBuilder.append(" ns from now");
        return stringBuilder.toString();
    }
}
