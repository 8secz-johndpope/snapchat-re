package defpackage;

import defpackage.boi.a;

/* renamed from: bok */
final class bok implements a {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long[] e;

    bok(long j, int i, long j2) {
        this(j, i, j2, -1, null);
    }

    bok(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }

    private long a(int i) {
        return (this.c * ((long) i)) / 100;
    }

    public final long a(long j) {
        j -= this.a;
        if (!k_() || j <= ((long) this.b)) {
            return 0;
        }
        double d;
        double d2 = (double) j;
        Double.isNaN(d2);
        d2 *= 256.0d;
        double d3 = (double) this.d;
        Double.isNaN(d3);
        d2 /= d3;
        int a = bzo.a(this.e, (long) d2, true);
        long a2 = a(a);
        long j2 = this.e[a];
        int i = a + 1;
        long a3 = a(i);
        long j3 = a == 99 ? 256 : this.e[i];
        if (j2 == j3) {
            d2 = 0.0d;
        } else {
            double d4 = (double) j2;
            Double.isNaN(d4);
            d2 -= d4;
            d = (double) (j3 - j2);
            Double.isNaN(d);
            d2 /= d;
        }
        d = (double) (a3 - a2);
        Double.isNaN(d);
        return a2 + Math.round(d2 * d);
    }

    public final long b() {
        return this.c;
    }

    public final bns.a b(long j) {
        if (!k_()) {
            return new bns.a(new bnt(0, this.a + ((long) this.b)));
        }
        j = bzo.a(j, 0, this.c);
        double d = (double) j;
        Double.isNaN(d);
        d *= 100.0d;
        double d2 = (double) this.c;
        Double.isNaN(d2);
        d /= d2;
        d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.e;
                d2 = (double) jArr[i];
                double d3 = i == 99 ? 256.0d : (double) jArr[i + 1];
                double d4 = (double) i;
                Double.isNaN(d4);
                d -= d4;
                Double.isNaN(d2);
                d *= d3 - d2;
                Double.isNaN(d2);
                d2 += d;
            }
        }
        d2 /= 256.0d;
        d = (double) this.d;
        Double.isNaN(d);
        return new bns.a(new bnt(j, this.a + bzo.a(Math.round(d2 * d), (long) this.b, this.d - 1)));
    }

    public final boolean k_() {
        return this.e != null;
    }
}
