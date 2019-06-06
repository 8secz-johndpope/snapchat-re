package defpackage;

import android.opengl.GLES20;
import java.io.IOException;

/* renamed from: acww */
public final class acww {
    private int a;
    private int b;
    private int c;
    private boolean d;

    public final int a(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.a, str);
        if ((glGetAttribLocation < 0 ? 1 : null) == null) {
            return glGetAttribLocation;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" is not a valid name for this program.");
        throw new IllegalAccessException(stringBuilder.toString());
    }

    public final void a() {
        this.d = true;
        GLES20.glDeleteShader(this.b);
        GLES20.glDeleteShader(this.c);
        GLES20.glDeleteProgram(this.a);
    }

    public final void a(int i, String str, String str2) {
        this.a = i;
        this.b = GLES20.glCreateShader(35633);
        int i2 = this.b;
        if (i2 > 0) {
            GLES20.glShaderSource(i2, str);
            GLES20.glCompileShader(this.b);
            if (acuk.b(this.b)) {
                throw new IOException("glCompileShaderV");
            }
            GLES20.glAttachShader(i, this.b);
            String str3 = "glAttachShaderF";
            if (acuk.b(this.b)) {
                throw new IOException(str3);
            }
            this.c = GLES20.glCreateShader(35632);
            GLES20.glShaderSource(this.c, str2);
            GLES20.glCompileShader(this.c);
            if (acuk.b(this.c)) {
                throw new IOException("glCompileShaderF");
            }
            GLES20.glAttachShader(i, this.c);
            if (acuk.b(this.c)) {
                throw new IOException(str3);
            }
            GLES20.glLinkProgram(this.a);
            if (!acuk.a(this.a)) {
                throw new IOException("Failed to link program.");
            }
            return;
        }
        throw new IOException("glCreateShaderV");
    }

    public final int b(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.a, str);
        if ((glGetUniformLocation < 0 ? 1 : null) == null) {
            return glGetUniformLocation;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" is not a valid name for this program.");
        throw new IllegalAccessException(stringBuilder.toString());
    }

    public final boolean b() {
        GLES20.glUseProgram(this.a);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        super.finalize();
        if (!this.d) {
            new StringBuilder("Program ").append(hashCode());
        }
    }
}
