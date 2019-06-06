package defpackage;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLUtils;
import com.google.common.base.Preconditions;

@TargetApi(18)
/* renamed from: adhi */
public final class adhi {
    final boolean a;

    public adhi(boolean z) {
        this.a = z;
    }

    public static EGLConfig a(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (adhi.a(eGLDisplay, iArr, eGLConfigArr, new int[1])) {
            return eGLConfigArr[0];
        }
        throw new adjw("unable to find RGB888+recordable ES2 EGL config");
    }

    public static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int[] iArr) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        adhi.a("eglCreateContext", true);
        return eglCreateContext;
    }

    public static EGLDisplay a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        adhi.a("eglGetDisplay", true);
        return eglGetDisplay;
    }

    public static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int[] iArr) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
        adhi.a("eglCreatePbufferSurface", true);
        return eglCreatePbufferSurface;
    }

    public static void a(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i, int[] iArr, int i2) {
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i, iArr, i2);
    }

    static void a(String str, boolean z) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288 || !z) {
            adni.e("%s: glError %d %s", str, Integer.valueOf(eglGetError), GLUtils.getEGLErrorString(eglGetError));
            if (eglGetError == 12291) {
                adnm.a();
            }
            throw adjw.a(str, eglGetError);
        }
    }

    public static boolean a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int[] iArr, int i2) {
        boolean eglGetConfigAttrib = EGL14.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr, i2);
        adhi.a("eglGetConfigAttrib", true);
        return eglGetConfigAttrib;
    }

    public static boolean a(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        boolean eglDestroyContext = EGL14.eglDestroyContext(eGLDisplay, eGLContext);
        adhi.a("eglDestroyContext", eglDestroyContext);
        return eglDestroyContext;
    }

    public static boolean a(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) {
        boolean eglInitialize = EGL14.eglInitialize(eGLDisplay, iArr, 0, iArr2, 1);
        adhi.a("eglInitialize", eglInitialize);
        return eglInitialize;
    }

    public static boolean a(EGLDisplay eGLDisplay, int[] iArr, EGLConfig[] eGLConfigArr, int[] iArr2) {
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0);
        adhi.a("eglChooseConfig", eglChooseConfig);
        return eglChooseConfig;
    }

    public static EGLContext b() {
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        adhi.a("eglGetCurrentContext", true);
        return eglGetCurrentContext;
    }

    public static boolean b(EGLDisplay eGLDisplay) {
        boolean eglTerminate = EGL14.eglTerminate(eGLDisplay);
        adhi.a("eglTerminate", eglTerminate);
        return eglTerminate;
    }

    public static boolean b(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        boolean eglDestroySurface = EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        adhi.a("eglDestroySurface", eglDestroySurface);
        return eglDestroySurface;
    }

    public static boolean c() {
        boolean eglReleaseThread = EGL14.eglReleaseThread();
        adhi.a("eglReleaseThread", eglReleaseThread);
        return eglReleaseThread;
    }

    public final boolean a(EGLDisplay eGLDisplay) {
        boolean eglMakeCurrent;
        Preconditions.checkState(eGLDisplay != null, "Error makeUnCurrent, mEGLDisplay is null");
        synchronized (adhj.a) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            eglMakeCurrent = EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        if (this.a) {
            adhi.a("eglMakeCurrent", eglMakeCurrent);
        }
        return eglMakeCurrent;
    }

    public final boolean a(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        boolean eglSwapBuffers;
        synchronized (adhj.a) {
            eglSwapBuffers = EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        }
        if (this.a) {
            adhi.a("eglSwapBuffers", eglSwapBuffers);
        }
        return eglSwapBuffers;
    }

    public final boolean a(EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLSurface eGLSurface2, EGLContext eGLContext) {
        boolean eglMakeCurrent;
        synchronized (adhj.a) {
            eglMakeCurrent = EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface2, eGLContext);
        }
        if (this.a) {
            adhi.a("eglMakeCurrent", eglMakeCurrent);
        }
        return eglMakeCurrent;
    }
}
