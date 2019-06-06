package defpackage;

import android.opengl.GLUtils;

/* renamed from: adjw */
public final class adjw extends adjz {
    public int a = 12288;

    public adjw(String str) {
        super(str);
    }

    private adjw(String str, int i) {
        super(str);
        this.a = i;
    }

    public adjw(Throwable th) {
        super(th);
    }

    public static adjw a(String str, int i) {
        return new adjw(String.format("Command: %s, EGL error: %s", new Object[]{str, GLUtils.getEGLErrorString(i)}), i);
    }

    public final int a() {
        return this.a;
    }
}
