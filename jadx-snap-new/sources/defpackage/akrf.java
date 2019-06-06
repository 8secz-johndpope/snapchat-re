package defpackage;

/* renamed from: akrf */
public abstract class akrf implements Comparable<akrf> {
    private long d(long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            return a(j, -j2);
        }
        throw new ArithmeticException("Long.MIN_VALUE cannot be negated");
    }

    public abstract long a(long j, int i);

    public abstract long a(long j, long j2);

    public abstract akrg a();

    public abstract int b(long j, long j2);

    public final long b(long j, int i) {
        return i == Integer.MIN_VALUE ? d(j, (long) i) : a(j, -i);
    }

    public abstract boolean b();

    public abstract long c(long j, long j2);

    public abstract boolean c();

    public abstract long d();
}
