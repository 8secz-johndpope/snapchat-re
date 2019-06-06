package defpackage;

/* renamed from: cct */
public final class cct {
    public double[] a = new double[9];

    private void a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double[] dArr = this.a;
        dArr[0] = d;
        dArr[1] = d2;
        dArr[2] = d3;
        dArr[3] = d4;
        dArr[4] = d5;
        dArr[5] = d6;
        dArr[6] = d7;
        dArr[7] = d8;
        dArr[8] = d9;
    }

    public static void a(cct cct, cct cct2, cct cct3) {
        double[] dArr = cct3.a;
        double[] dArr2 = cct.a;
        double d = dArr2[0];
        double[] dArr3 = cct2.a;
        dArr[0] = d + dArr3[0];
        dArr[1] = dArr2[1] + dArr3[1];
        dArr[2] = dArr2[2] + dArr3[2];
        dArr[3] = dArr2[3] + dArr3[3];
        dArr[4] = dArr2[4] + dArr3[4];
        dArr[5] = dArr2[5] + dArr3[5];
        dArr[6] = dArr2[6] + dArr3[6];
        dArr[7] = dArr2[7] + dArr3[7];
        dArr[8] = dArr2[8] + dArr3[8];
    }

    public static void a(cct cct, ccw ccw, ccw ccw2) {
        double d = ((cct.a[3] * ccw.a) + (cct.a[4] * ccw.b)) + (cct.a[5] * ccw.c);
        double d2 = ((cct.a[6] * ccw.a) + (cct.a[7] * ccw.b)) + (cct.a[8] * ccw.c);
        ccw2.a = ((cct.a[0] * ccw.a) + (cct.a[1] * ccw.b)) + (cct.a[2] * ccw.c);
        ccw2.b = d;
        ccw2.c = d2;
    }

    public static void b(cct cct, cct cct2, cct cct3) {
        cct cct4 = cct3;
        double[] dArr = cct.a;
        double d = dArr[0];
        double[] dArr2 = cct2.a;
        double[] dArr3 = dArr2;
        double[] dArr4 = dArr;
        cct4.a(((d * dArr2[0]) + (dArr[1] * dArr2[3])) + (dArr[2] * dArr2[6]), ((dArr[0] * dArr2[1]) + (dArr[1] * dArr2[4])) + (dArr[2] * dArr2[7]), ((dArr[0] * dArr2[2]) + (dArr[1] * dArr2[5])) + (dArr[2] * dArr2[8]), ((dArr[3] * dArr2[0]) + (dArr[4] * dArr2[3])) + (dArr[5] * dArr2[6]), ((dArr[3] * dArr2[1]) + (dArr[4] * dArr2[4])) + (dArr[5] * dArr2[7]), ((dArr[3] * dArr2[2]) + (dArr[4] * dArr2[5])) + (dArr[5] * dArr2[8]), ((dArr[6] * dArr2[0]) + (dArr[7] * dArr2[3])) + (dArr[8] * dArr2[6]), ((dArr[6] * dArr3[1]) + (dArr[7] * dArr3[4])) + (dArr[8] * dArr3[7]), ((dArr4[6] * dArr3[2]) + (dArr4[7] * dArr3[5])) + (dArr4[8] * dArr3[8]));
    }

    public final double a(int i, int i2) {
        return this.a[(i * 3) + i2];
    }

    public final void a() {
        double[] dArr = this.a;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[0] = 0.0d;
    }

    public final void a(double d) {
        double[] dArr = this.a;
        dArr[8] = d;
        dArr[4] = d;
        dArr[0] = d;
    }

    public final void a(int i, int i2, double d) {
        this.a[(i * 3) + i2] = d;
    }

    public final void a(int i, ccw ccw) {
        this.a[i] = ccw.a;
        this.a[i + 3] = ccw.b;
        this.a[i + 6] = ccw.c;
    }

    public final void a(cct cct) {
        double[] dArr = this.a;
        double[] dArr2 = cct.a;
        dArr[0] = dArr2[0];
        dArr[1] = dArr2[1];
        dArr[2] = dArr2[2];
        dArr[3] = dArr2[3];
        dArr[4] = dArr2[4];
        dArr[5] = dArr2[5];
        dArr[6] = dArr2[6];
        dArr[7] = dArr2[7];
        dArr[8] = dArr2[8];
    }

    public final void b() {
        double[] dArr = this.a;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[8] = 1.0d;
        dArr[4] = 1.0d;
        dArr[0] = 1.0d;
    }

    public final void b(cct cct) {
        double[] dArr = this.a;
        double d = dArr[0];
        double[] dArr2 = cct.a;
        dArr[0] = d - dArr2[0];
        dArr[1] = dArr[1] - dArr2[1];
        dArr[2] = dArr[2] - dArr2[2];
        dArr[3] = dArr[3] - dArr2[3];
        dArr[4] = dArr[4] - dArr2[4];
        dArr[5] = dArr[5] - dArr2[5];
        dArr[6] = dArr[6] - dArr2[6];
        dArr[7] = dArr[7] - dArr2[7];
        dArr[8] = dArr[8] - dArr2[8];
    }

    public final void c() {
        double[] dArr = this.a;
        double d = dArr[1];
        dArr[1] = dArr[3];
        dArr[3] = d;
        d = dArr[2];
        dArr[2] = dArr[6];
        dArr[6] = d;
        d = dArr[5];
        dArr[5] = dArr[7];
        dArr[7] = d;
    }

    public final void c(cct cct) {
        double[] dArr = this.a;
        double d = dArr[1];
        double d2 = dArr[2];
        double d3 = dArr[5];
        double[] dArr2 = cct.a;
        dArr2[0] = dArr[0];
        dArr2[1] = dArr[3];
        dArr2[2] = dArr[6];
        dArr2[3] = d;
        dArr2[4] = dArr[4];
        dArr2[5] = dArr[7];
        dArr2[6] = d2;
        dArr2[7] = d3;
        dArr2[8] = dArr[8];
    }

    public final boolean d(cct cct) {
        double a = ((a(0, 0) * ((a(1, 1) * a(2, 2)) - (a(2, 1) * a(1, 2)))) - (a(0, 1) * ((a(1, 0) * a(2, 2)) - (a(1, 2) * a(2, 0))))) + (a(0, 2) * ((a(1, 0) * a(2, 1)) - (a(1, 1) * a(2, 0))));
        if (a == 0.0d) {
            return false;
        }
        double d = 1.0d / a;
        double[] dArr = this.a;
        cct.a(((dArr[4] * dArr[8]) - (dArr[7] * dArr[5])) * d, (-((dArr[1] * dArr[8]) - (dArr[2] * dArr[7]))) * d, ((dArr[1] * dArr[5]) - (dArr[2] * dArr[4])) * d, (-((dArr[3] * dArr[8]) - (dArr[5] * dArr[6]))) * d, ((dArr[0] * dArr[8]) - (dArr[2] * dArr[6])) * d, (-((dArr[0] * dArr[5]) - (dArr[3] * dArr[2]))) * d, ((dArr[3] * dArr[7]) - (dArr[6] * dArr[4])) * d, (-((dArr[0] * dArr[7]) - (dArr[6] * dArr[1]))) * d, ((dArr[0] * dArr[4]) - (dArr[3] * dArr[1])) * d);
        return true;
    }
}
