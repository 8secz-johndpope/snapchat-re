package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import java.nio.ByteBuffer;

/* renamed from: admf */
public final class admf {
    final adhk a;
    final adhi b;
    admk c;
    public EGLDisplay d = EGL14.EGL_NO_DISPLAY;
    EGLContext e = EGL14.EGL_NO_CONTEXT;
    EGLSurface f = EGL14.EGL_NO_SURFACE;
    int g;
    int h;

    public admf(adhk adhk, adhi adhi) {
        this.a = adhk;
        this.b = adhi;
    }

    static float a(int i) {
        int i2 = i % 16;
        return i2 != 0 ? ((float) ((i + 16) - i2)) / ((float) i) : 1.0f;
    }

    public static kaz<jwj> a(int i, int i2, String str, jwa jwa) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i * 4) * i2);
        allocateDirect.position(0);
        adhk.b(i, i2, 6408, allocateDirect);
        kaz a = jwa.a(i, i2, str);
        Bitmap a2 = ((jwj) a.a()).a();
        allocateDirect.position(0);
        a2.copyPixelsFromBuffer(allocateDirect);
        try {
            kaz<jwj> a3 = jwa.a(a2, Config.RGB_565, str);
            return a3;
        } finally {
            a.dispose();
        }
    }
}
