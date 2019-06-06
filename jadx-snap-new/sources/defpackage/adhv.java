package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.google.common.base.Preconditions;

/* renamed from: adhv */
public final class adhv {
    public final adhu a;
    private final adhi b;
    private final int c;
    private final int d;
    private EGLDisplay e = EGL14.EGL_NO_DISPLAY;
    private EGLContext f = EGL14.EGL_NO_CONTEXT;
    private EGLSurface g = EGL14.EGL_NO_SURFACE;

    public adhv(int i, int i2, adhl adhl, adhi adhi) {
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        this.b = adhi;
        this.c = i;
        this.d = i2;
        this.a = new adhu(this.c, this.d, 0, new int[]{0, 0, this.c, this.d}, null);
        this.e = adhi.a();
        if (this.e != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (adhi.a(this.e, iArr, iArr)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (adhi.a(this.e, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344}, eGLConfigArr, new int[1])) {
                    iArr = new int[3];
                    iArr[0] = 12440;
                    iArr[1] = adhl == adhl.GLES30 ? 3 : 2;
                    iArr[2] = 12344;
                    this.f = adhi.a(this.e, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, iArr);
                    if (this.f != null) {
                        iArr = new int[]{0, 0, 0};
                        adhi.a(this.e, eGLConfigArr[0], 12332, iArr, 0);
                        adhi.a(this.e, eGLConfigArr[0], 12330, iArr, 1);
                        adhi.a(this.e, eGLConfigArr[0], 12331, iArr, 2);
                        if ((iArr[0] <= 0 || this.c <= iArr[0]) && ((iArr[1] <= 0 || this.d <= iArr[1]) && (iArr[2] <= 0 || this.c * this.d <= iArr[2]))) {
                            this.g = adhi.a(this.e, eGLConfigArr[0], new int[]{12375, this.c, 12374, this.d, 12344});
                            EGLSurface eGLSurface = this.g;
                            if (eGLSurface != null) {
                                this.b.a(this.e, eGLSurface, eGLSurface, this.f);
                                return;
                            }
                            throw new adjw("surface was null");
                        }
                        throw new adjw(String.format("Output surface resolution is too large. mPbufferSurfaceWidth = %d, mPbufferSurfaceHeight = %d, max pbuffer width = %d, max pbuffer height = %d, max pbuffer pixels = %d", new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr[2])}));
                    }
                    throw new adjw("null context");
                }
                throw new adjw("unable to find RGB888+recordable ES2 EGL config");
            }
            this.e = null;
            throw new adjw("unable to initialize EGL14");
        }
        throw new adjw("unable to get EGL14 display");
    }

    private void b() {
        adhi adhi = this.b;
        EGLDisplay eGLDisplay = this.e;
        EGLSurface eGLSurface = this.g;
        adhi.a(eGLDisplay, eGLSurface, eGLSurface, this.f);
    }

    public final void a() {
        b();
        adni.c("mEGLDisplay: %s", this.e);
        this.b.a(this.e);
        adhi.b(this.e, this.g);
        adhi.a(this.e, this.f);
        adhi.c();
        adhi.b(this.e);
        this.e = EGL14.EGL_NO_DISPLAY;
        this.f = EGL14.EGL_NO_CONTEXT;
        this.g = EGL14.EGL_NO_SURFACE;
    }
}
