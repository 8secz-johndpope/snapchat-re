package defpackage;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

@TargetApi(18)
/* renamed from: adhh */
public final class adhh implements adhg {
    public EGLContext a;
    private EGLDisplay b;
    private EGLConfig c;
    private adhi d;

    public adhh(adhl adhl, adhi adhi) {
        this.d = adhi;
        a(adhl, EGL14.EGL_NO_CONTEXT);
    }

    public adhh(adhl adhl, adhi adhi, EGLContext eGLContext) {
        this.d = adhi;
        a(adhl, eGLContext);
    }

    public adhh(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLConfig eGLConfig, adhi adhi) {
        this.b = eGLDisplay;
        this.a = eGLContext;
        this.c = eGLConfig;
        this.d = adhi;
    }

    private void a(adhl adhl, EGLContext eGLContext) {
        this.b = adhi.a();
        if (this.b != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (adhi.a(this.b, iArr, iArr)) {
                this.c = adhi.a(this.b, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344});
                int[] iArr2 = new int[3];
                boolean z = false;
                iArr2[0] = 12440;
                iArr2[1] = adhl == adhl.GLES30 ? 3 : 2;
                iArr2[2] = 12344;
                this.a = adhi.a(this.b, this.c, eGLContext, iArr2);
                eGLContext = this.a;
                if (eGLContext == null || eGLContext == EGL14.EGL_NO_CONTEXT) {
                    Object[] objArr = new Object[3];
                    objArr[0] = Boolean.valueOf(this.a == null);
                    if (this.a == EGL14.EGL_NO_CONTEXT) {
                        z = true;
                    }
                    objArr[1] = Boolean.valueOf(z);
                    objArr[2] = adhl.toString();
                    throw new adjw(String.format("null context? %b; NO_CONTEXT? %b; requested version %s", objArr));
                }
                return;
            }
            this.b = null;
            throw new adjw("unable to initialize EGL14");
        }
        throw new adjw("unable to get EGL14 display");
    }

    public final EGLSurface a(int i, int i2) {
        return adhi.a(this.b, this.c, new int[]{12375, i, 12374, i2, 12344});
    }

    public final EGLSurface a(Surface surface) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.b, this.c, surface, new int[]{12344}, 0);
        adhi.a("eglCreateWindowSurface", true);
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new adjw("surface was null");
    }

    public final void a() {
        this.d.a(this.b);
    }

    public final void a(EGLSurface eGLSurface) {
        if (!this.d.a(this.b, eGLSurface, eGLSurface, this.a)) {
            throw new adjw("eglMakeCurrent failed");
        }
    }

    public final void a(EGLSurface eGLSurface, long j) {
        adhi adhi = this.d;
        boolean eglPresentationTimeANDROID = EGLExt.eglPresentationTimeANDROID(this.b, eGLSurface, j);
        if (adhi.a) {
            adhi.a("eglPresentationTimeANDROID", eglPresentationTimeANDROID);
        }
    }

    public final void a(EGLSurface eGLSurface, int[] iArr) {
        adhi.a(this.b, eGLSurface, 12375, iArr, 0);
        adhi.a(this.b, eGLSurface, 12374, iArr, 1);
    }

    public final void b() {
        if (adhi.b().equals(this.a)) {
            adhi adhi = this.d;
            EGLDisplay eGLDisplay = this.b;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            adhi.a(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        adhi.a(this.b, this.a);
        adhi.c();
        adhi.b(this.b);
        this.b = EGL14.EGL_NO_DISPLAY;
        this.a = EGL14.EGL_NO_CONTEXT;
        this.c = null;
    }

    public final boolean b(EGLSurface eGLSurface) {
        return this.d.a(this.b, eGLSurface);
    }

    public final void c(EGLSurface eGLSurface) {
        adhi.b(this.b, eGLSurface);
    }
}
