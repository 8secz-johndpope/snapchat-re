package defpackage;

/* renamed from: aksu */
final class aksu extends aktm {
    private final akso c;

    aksu(akso akso) {
        super(akra.j, 31556952000L);
        this.c = akso;
    }

    public final int a(long j) {
        return this.c.b(j);
    }

    public final long a(long j, int i) {
        return i == 0 ? j : b(j, a(j) + i);
    }

    public final long a(long j, long j2) {
        return a(j, aktl.a(j2));
    }

    public final long b(long j, int i) {
        aktl.a((akqz) this, Math.abs(i), -292275054, 292278993);
        int a = a(j);
        if (a == i) {
            return j;
        }
        int d = akso.d(j);
        a = this.c.a(a);
        int a2 = this.c.a(i);
        if (a2 < a) {
            a = a2;
        }
        a2 = this.c.c(j);
        if (a2 <= a) {
            a = a2;
        }
        j = this.c.d(j, i);
        a2 = a(j);
        if (a2 < i) {
            j += 604800000;
        } else if (a2 > i) {
            j -= 604800000;
        }
        return this.c.i.b(j + (((long) (a - this.c.c(j))) * 604800000), d);
    }

    public final boolean b(long j) {
        akso akso = this.c;
        return akso.a(akso.b(j)) > 52;
    }

    public final long c(long j, long j2) {
        if (j < j2) {
            return (long) (-b(j2, j));
        }
        int a = a(j);
        int a2 = a(j2);
        j -= d(j);
        j2 -= d(j2);
        if (j2 >= 31449600000L && this.c.a(a) <= 52) {
            j2 -= 604800000;
        }
        a -= a2;
        if (j < j2) {
            a--;
        }
        return (long) a;
    }

    public final long d(long j) {
        j = this.c.k.d(j);
        int c = this.c.c(j);
        return c > 1 ? j - (((long) (c - 1)) * 604800000) : j;
    }

    public final long e(long j) {
        return j - d(j);
    }

    public final akrf e() {
        return null;
    }

    public final akrf f() {
        return this.c.d;
    }

    public final int g() {
        return -292275054;
    }

    public final int h() {
        return 292278993;
    }
}
