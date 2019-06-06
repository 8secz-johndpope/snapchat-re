package defpackage;

import android.annotation.TargetApi;
import android.opengl.EGLSurface;
import android.view.Surface;

@TargetApi(18)
/* renamed from: adhg */
public interface adhg {
    EGLSurface a(int i, int i2);

    EGLSurface a(Surface surface);

    void a();

    void a(EGLSurface eGLSurface);

    void a(EGLSurface eGLSurface, long j);

    void a(EGLSurface eGLSurface, int[] iArr);

    void b();

    boolean b(EGLSurface eGLSurface);

    void c(EGLSurface eGLSurface);
}
