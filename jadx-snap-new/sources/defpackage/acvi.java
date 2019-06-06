package defpackage;

import android.graphics.PointF;

/* renamed from: acvi */
public final class acvi {
    final PointF a = new PointF();
    final PointF b = new PointF();
    final PointF c = new PointF();
    final PointF d = new PointF();
    final PointF e = new PointF();
    final PointF f = new PointF();
    final PointF g = new PointF();
    final PointF h = new PointF();

    static float a(float f, float f2, float f3) {
        double d = (double) f2;
        double d2 = (double) f;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        d *= cos;
        cos = (double) f3;
        d2 = Math.sin(d2);
        Double.isNaN(cos);
        return (float) (d - (cos * d2));
    }

    static float b(float f, float f2, float f3) {
        double d = (double) f2;
        double d2 = (double) f;
        double sin = Math.sin(d2);
        Double.isNaN(d);
        d *= sin;
        sin = (double) f3;
        d2 = Math.cos(d2);
        Double.isNaN(sin);
        return (float) (d + (sin * d2));
    }
}
