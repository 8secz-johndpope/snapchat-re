package defpackage;

/* renamed from: admo */
public final class admo {
    public static final abtl a(int i, int i2, int i3, int i4) {
        if (i3 <= 0 || i4 <= 0 || i3 > i || i4 > i2) {
            return new abtl(i, i2);
        }
        double d = (double) i3;
        double d2 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d2);
        d /= d2;
        double d3 = (double) i4;
        double d4 = (double) i2;
        Double.isNaN(d3);
        Double.isNaN(d4);
        d3 = Math.max(d, d3 / d4);
        Double.isNaN(d2);
        int i5 = (int) (d2 * d3);
        Double.isNaN(d4);
        return new abtl(i5, (int) (d4 * d3));
    }
}
