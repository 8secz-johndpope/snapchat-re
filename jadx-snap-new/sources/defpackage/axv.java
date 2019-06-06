package defpackage;

import android.graphics.drawable.Drawable;
import defpackage.awm.a;

/* renamed from: axv */
public final class axv<DH extends axs> implements axk {
    boolean a = false;
    DH b;
    axr c = null;
    final awm d = awm.a();
    private boolean e = false;
    private boolean f = true;

    axv() {
    }

    private void f() {
        if (!this.e) {
            this.d.a(a.ON_ATTACH_CONTROLLER);
            this.e = true;
            axr axr = this.c;
            if (!(axr == null || axr.b() == null)) {
                this.c.c();
            }
        }
    }

    private void g() {
        if (this.e) {
            this.d.a(a.ON_DETACH_CONTROLLER);
            this.e = false;
            if (e()) {
                this.c.d();
            }
        }
    }

    public final void a() {
        if (!this.e) {
            auk.b(awm.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.c)), toString());
            this.a = true;
            this.f = true;
            d();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(axk axk) {
        Drawable c = c();
        if (c instanceof axj) {
            ((axj) c).a(axk);
        }
    }

    public final void a(axr axr) {
        boolean z = this.e;
        if (z) {
            g();
        }
        if (e()) {
            this.d.a(a.ON_CLEAR_OLD_CONTROLLER);
            this.c.a(null);
        }
        this.c = axr;
        if (this.c != null) {
            this.d.a(a.ON_SET_CONTROLLER);
            this.c.a(this.b);
        } else {
            this.d.a(a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            f();
        }
    }

    public final void a(boolean z) {
        if (this.f != z) {
            this.d.a(z ? a.ON_DRAWABLE_SHOW : a.ON_DRAWABLE_HIDE);
            this.f = z;
            d();
        }
    }

    public final void b() {
        this.d.a(a.ON_HOLDER_ATTACH);
        this.a = true;
        d();
    }

    public final Drawable c() {
        axs axs = this.b;
        return axs == null ? null : axs.a();
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        if (this.a && this.f) {
            f();
        } else {
            g();
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean e() {
        axr axr = this.c;
        return axr != null && axr.b() == this.b;
    }

    public final String toString() {
        String str = "holderAttached";
        str = "drawableVisible";
        return aug.a(this).a("controllerAttached", this.e).a(str, this.a).a(str, this.f).a(aqd.a, this.d.toString()).toString();
    }
}
