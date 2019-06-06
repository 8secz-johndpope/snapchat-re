package defpackage;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.axg.b;
import defpackage.axp.a;

/* renamed from: axl */
public final class axl implements axt {
    private final Drawable a = new ColorDrawable(0);
    private final Resources b;
    private axp c;
    private final axo d;
    private final awy e;
    private final awz f;
    private final boolean g;

    axl(axm axm) {
        this.b = axm.a;
        this.c = axm.p;
        this.g = axm.q;
        this.f = new awz(this.a);
        int size = (axm.n != null ? axm.n.size() : 1) + (axm.o != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[(size + 6)];
        drawableArr[0] = a(axm.m, null);
        drawableArr[1] = a(axm.d, axm.e);
        Drawable drawable = this.f;
        b bVar = axm.l;
        drawable.setColorFilter(null);
        drawableArr[2] = axq.a(axq.a(drawable, this.g ? new Matrix() : null), bVar);
        drawableArr[3] = a(axm.j, axm.k);
        drawableArr[4] = a(axm.f, axm.g);
        drawableArr[5] = a(axm.h, axm.i);
        if (size > 0) {
            int i;
            if (axm.n != null) {
                i = 0;
                for (Drawable drawable2 : axm.n) {
                    int i2 = i + 1;
                    drawableArr[i + 6] = a(drawable2, null);
                    i = i2;
                }
            } else {
                i = 1;
            }
            if (axm.o != null) {
                drawableArr[i + 6] = a(axm.o, null);
            }
        }
        this.e = new awy(drawableArr);
        awy awy = this.e;
        awy.b = axm.b;
        if (awy.a == 1) {
            awy.a = 0;
        }
        Drawable drawable3 = this.e;
        axp axp = this.c;
        if (axp != null && axp.a == a.OVERLAY_COLOR) {
            axb axe = new axe(drawable3);
            axq.a(axe, axp);
            axe.a = axp.d;
            axe.invalidateSelf();
            drawable3 = axe;
        }
        this.d = new axo(drawable3);
        this.d.mutate();
        e();
    }

    private Drawable a(Drawable drawable, b bVar) {
        return axq.a(axq.a(axq.a(drawable, this.c, this.b), this.g ? new Matrix() : null), bVar);
    }

    private void a(float f) {
        Drawable drawable = this.e.getDrawable(3);
        if (drawable != null) {
            if (f >= 0.999f) {
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).stop();
                }
                b(3);
            } else {
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
                a(3);
            }
            drawable.setLevel(Math.round(f * 10000.0f));
        }
    }

    private void a(int i) {
        if (i >= 0) {
            this.e.a(i);
        }
    }

    private void b(int i) {
        if (i >= 0) {
            this.e.b(i);
        }
    }

    private void e() {
        this.e.a();
        this.e.c();
        f();
        a(1);
        this.e.d();
        this.e.b();
    }

    private void f() {
        b(1);
        b(2);
        b(3);
        b(4);
        b(5);
    }

    public final Drawable a() {
        return this.d;
    }

    public final void a(Drawable drawable) {
        axo axo = this.d;
        axo.a = drawable;
        axo.invalidateSelf();
    }

    public final void a(Drawable drawable, float f, boolean z) {
        drawable = axq.a(drawable, this.c, this.b);
        drawable.mutate();
        this.f.b(drawable);
        this.e.a();
        f();
        a(2);
        a(f);
        if (z) {
            this.e.d();
        }
        this.e.b();
    }

    public final void b() {
        this.f.b(this.a);
        e();
    }

    public final void c() {
        if (this.e.getDrawable(3) != null) {
            this.e.a();
            a((float) MapboxConstants.MINIMUM_ZOOM);
            this.e.d();
            this.e.b();
        }
    }

    public final void d() {
        this.e.a();
        f();
        if (this.e.getDrawable(5) != null) {
            a(5);
        } else {
            a(1);
        }
        this.e.b();
    }
}
