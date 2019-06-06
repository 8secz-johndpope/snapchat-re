package defpackage;

import android.view.ViewConfiguration;
import java.util.Iterator;

/* renamed from: abun */
public class abun {
    public boolean a;
    public float b;
    public float c;
    public float d;
    public long e;
    private final abpx<Object> f;

    static {
        ViewConfiguration.getJumpTapTimeout();
    }

    public abun(float f) {
        this(f, new abpx());
    }

    private abun(float f, abpx<Object> abpx) {
        this.e = 0;
        this.c = 0.974f;
        this.d = f;
        this.f = abpx;
        this.a = false;
        this.b = f;
        this.e = 0;
    }

    private static float a(float f, float f2) {
        return Double.valueOf(Math.log((double) f) / Math.log((double) f2)).floatValue();
    }

    private void c() {
        if (this.f.b() > 0) {
            d();
        }
    }

    private void d() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final float a() {
        float f = this.b;
        float f2 = this.d;
        if (f > f2) {
            return abun.a((f - f2) + 1.0f, 40.0f) + this.d;
        }
        f2 = this.c;
        if (f >= f2) {
            return f;
        }
        return this.c - abun.a((f2 - f) + 1.0f, 15.0f);
    }

    public final void a(boolean z) {
        if (this.a != z) {
            this.a = z;
            c();
        }
    }

    public final float b(boolean z) {
        return z ? this.c : this.d;
    }

    public final void b() {
        this.b = b(this.a);
    }
}
