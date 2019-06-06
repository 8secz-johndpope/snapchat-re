package defpackage;

/* renamed from: ict */
public final class ict {
    int a = 0;
    int b = 0;
    int c = 0;
    public int d = 0;
    double e = 0.0d;

    public final double a() {
        int i = this.a;
        if (i == 0) {
            return Double.NaN;
        }
        double d = (double) i;
        double d2 = 1.0E9d / this.e;
        Double.isNaN(d);
        return Math.min(60.0d, d * d2);
    }

    public final void a(long j, int i) {
        this.a++;
        this.c += i;
        double d = this.e;
        double d2 = (double) j;
        Double.isNaN(d2);
        this.e = d + d2;
        if (i >= 4) {
            this.d += this.c;
        }
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }
}
