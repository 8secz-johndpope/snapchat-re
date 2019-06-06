package defpackage;

import android.graphics.Point;
import defpackage.ebn.a;

/* renamed from: emw */
public final class emw implements dqe {
    public ajwo<Point> a;
    public ajwo<Point> b;
    public ajwo<Float> c;
    public ajwo<Float> d;
    public ajwo<ebn> e;

    public final void a(float f) {
        this.c.a(Float.valueOf(f));
    }

    public final void a(int i, int i2) {
        this.a.a(new Point(i, i2));
    }

    public final void b(float f) {
        this.d.a(Float.valueOf(f));
    }

    public final void b(int i, int i2) {
        this.b.a(new Point(i, i2));
    }

    public final void c(int i, int i2) {
        this.e.a(new ebn(a.START, new Point(i, i2)));
    }

    public final void d(int i, int i2) {
        this.e.a(new ebn(a.MOVE, new Point(i, i2)));
    }

    public final void e(int i, int i2) {
        this.e.a(new ebn(a.STOP, new Point(i, i2)));
    }
}
