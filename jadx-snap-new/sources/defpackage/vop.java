package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;

/* renamed from: vop */
public final class vop {
    public static boolean a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int[] iArr, int i2) {
        akcr.b(eGLDisplay, "dpy");
        akcr.b(eGLConfig, "config");
        akcr.b(iArr, "value");
        return EGL14.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr, i2);
    }
}
