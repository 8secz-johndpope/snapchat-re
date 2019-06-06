package defpackage;

import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: dyc */
public final class dyc {
    public final adhh a;

    public dyc(adhl adhl, adhi adhi) {
        try {
            this.a = new adhh(adhl, adhi);
        } catch (adjz e) {
            throw new dxx(e);
        }
    }

    public dyc(adhl adhl, adhi adhi, EGLContext eGLContext) {
        try {
            this.a = new adhh(adhl, adhi, eGLContext);
        } catch (adjz e) {
            throw new dxx(e);
        }
    }

    public final EGLSurface a(int i, int i2) {
        try {
            return this.a.a(i, i2);
        } catch (adjz e) {
            throw new dxx(e);
        }
    }

    public final EGLSurface a(Surface surface) {
        try {
            return this.a.a(surface);
        } catch (adjz e) {
            throw new dxx(e);
        }
    }

    public final void a() {
        try {
            this.a.a();
        } catch (adjz e) {
            throw new dxx(e);
        }
    }

    public final void a(EGLSurface eGLSurface) {
        try {
            this.a.a(eGLSurface);
        } catch (adjz e) {
            throw new dxx(e);
        }
    }

    public final void a(EGLSurface eGLSurface, long j) {
        try {
            this.a.a(eGLSurface, j);
        } catch (adjz e) {
            throw new dxx(e);
        }
    }

    public final void b() {
        try {
            this.a.b();
        } catch (adjz e) {
            throw new dxx(e);
        }
    }

    public final boolean b(EGLSurface eGLSurface) {
        try {
            return this.a.b(eGLSurface);
        } catch (adjz e) {
            throw new dxx(e);
        }
    }

    public final void c(EGLSurface eGLSurface) {
        try {
            this.a.c(eGLSurface);
        } catch (adjz e) {
            throw new dxx(e);
        }
    }
}
