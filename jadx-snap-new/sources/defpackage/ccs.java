package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ccs */
public final class ccs {
    private static final double c;
    public final ccw a = new ccw();
    public int b;
    private final double d;
    private long e;
    private final ccw f = new ccw();

    static {
        double convert = (double) TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS);
        Double.isNaN(convert);
        c = 1.0d / convert;
    }

    public ccs(double d) {
        this.d = 1.0d / (d * 6.283185307179586d);
    }

    public final void a(ccw ccw, long j, double d) {
        this.b++;
        if (this.b == 1) {
            this.a.a(ccw);
        } else {
            double d2 = (double) (j - this.e);
            Double.isNaN(d2);
            d = (d * d2) * c;
            d /= this.d + d;
            this.a.a(1.0d - d);
            this.f.a(ccw);
            this.f.a(d);
            ccw = this.f;
            ccw ccw2 = this.a;
            ccw2.a(ccw2.a + ccw.a, ccw2.b + ccw.b, ccw2.c + ccw.c);
        }
        this.e = j;
    }
}
