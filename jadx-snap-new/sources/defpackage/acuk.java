package defpackage;

import android.opengl.GLES20;

/* renamed from: acuk */
public final class acuk {
    private static final acyj a = new acyj();

    /* renamed from: acuk$a */
    public static class a extends RuntimeException {
    }

    public static void a() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return;
            }
            if (glGetError == 1285) {
                throw new a();
            }
        }
    }

    public static boolean a(int i) {
        acyi b = a.b();
        GLES20.glGetProgramiv(i, 35714, b.a);
        boolean z = b.c() != 0;
        if (!z) {
            GLES20.glDeleteProgram(i);
        }
        a.a(b);
        return z;
    }

    public static boolean b(int i) {
        acyi b = a.b();
        GLES20.glGetShaderiv(i, 35713, b.a);
        boolean z = b.c() == 0;
        a.a(b);
        return z;
    }
}
