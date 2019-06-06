package defpackage;

/* renamed from: aktq */
public abstract class aktq extends aktg {
    final long a;
    private final akrf c;

    public aktq(akra akra, akrf akrf) {
        super(akra);
        if (akrf.c()) {
            this.a = akrf.d();
            if (this.a >= 1) {
                this.c = akrf;
                return;
            }
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        throw new IllegalArgumentException("Unit duration field must be precise");
    }

    public long b(long j, int i) {
        aktl.a((akqz) this, i, g(), d(j, i));
        return j + (((long) (i - a(j))) * this.a);
    }

    /* Access modifiers changed, original: protected */
    public int d(long j, int i) {
        return c(j);
    }

    public long d(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.a;
        } else {
            j++;
            j2 = this.a;
            j -= j % j2;
        }
        return j - j2;
    }

    public final akrf d() {
        return this.c;
    }

    public long e(long j) {
        if (j >= 0) {
            return j % this.a;
        }
        j++;
        long j2 = this.a;
        return ((j % j2) + j2) - 1;
    }

    public int g() {
        return 0;
    }
}
