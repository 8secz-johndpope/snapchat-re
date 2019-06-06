package defpackage;

/* renamed from: dpm */
public final class dpm implements dpl {
    private final long a;
    private long b = -1;

    public dpm(int i) {
        if (i <= 0 || i > 1000000000) {
            throw new AssertionError();
        }
        this.a = (long) (1000000000 / i);
    }

    public final boolean a(long j) {
        long j2 = this.b;
        if (j2 == -1) {
            this.b = j;
            return true;
        }
        j2 = j - j2;
        long j3 = this.a;
        this.b = j - (j2 % j3);
        return j2 >= j3;
    }
}
