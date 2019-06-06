package defpackage;

/* renamed from: ccw */
public final class ccw {
    public double a;
    public double b;
    public double c;

    public ccw(double d) {
        a(d, 0.0d, 0.0d);
    }

    public static double a(ccw ccw, ccw ccw2) {
        return ((ccw.a * ccw2.a) + (ccw.b * ccw2.b)) + (ccw.c * ccw2.c);
    }

    public static void a(ccw ccw, ccw ccw2, ccw ccw3) {
        ccw3.a(ccw.a - ccw2.a, ccw.b - ccw2.b, ccw.c - ccw2.c);
    }

    private static int b(ccw ccw) {
        double abs = Math.abs(ccw.a);
        double abs2 = Math.abs(ccw.b);
        double abs3 = Math.abs(ccw.c);
        int i = 2;
        if (abs > abs2) {
            if (abs > abs3) {
                i = 0;
            }
            return i;
        }
        if (abs2 > abs3) {
            i = 1;
        }
        return i;
    }

    public static void b(ccw ccw, ccw ccw2) {
        int b = ccw.b(ccw) - 1;
        if (b < 0) {
            b = 2;
        }
        ccw2.a();
        ccw2.a(b, 1.0d);
        ccw.b(ccw, ccw2, ccw2);
        ccw2.b();
    }

    public static void b(ccw ccw, ccw ccw2, ccw ccw3) {
        ccw ccw4 = ccw;
        ccw ccw5 = ccw2;
        double d = ccw4.b;
        double d2 = ccw5.c;
        double d3 = d * d2;
        double d4 = ccw4.c;
        double d5 = ccw5.b;
        double d6 = d3 - (d4 * d5);
        d3 = ccw5.a;
        d4 *= d3;
        double d7 = ccw4.a;
        ccw3.a(d6, d4 - (d2 * d7), (d7 * d5) - (d * d3));
    }

    public final void a() {
        this.c = 0.0d;
        this.b = 0.0d;
        this.a = 0.0d;
    }

    public final void a(double d) {
        this.a *= d;
        this.b *= d;
        this.c *= d;
    }

    public final void a(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final void a(int i, double d) {
        if (i == 0) {
            this.a = d;
        } else if (i == 1) {
            this.b = d;
        } else {
            this.c = d;
        }
    }

    public final void a(ccw ccw) {
        this.a = ccw.a;
        this.b = ccw.b;
        this.c = ccw.c;
    }

    public final void b() {
        double c = c();
        if (c != 0.0d) {
            a(1.0d / c);
        }
    }

    public final double c() {
        double d = this.a;
        d *= d;
        double d2 = this.b;
        d += d2 * d2;
        d2 = this.c;
        return Math.sqrt(d + (d2 * d2));
    }

    public final String toString() {
        return String.format("%+05f %+05f %+05f", new Object[]{Double.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.c)});
    }
}
