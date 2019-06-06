package defpackage;

import android.opengl.GLES20;
import com.google.common.base.Preconditions;

/* renamed from: adhy */
public final class adhy {
    private final adhk a;
    private final adht b;
    private int c;
    private int d;
    private boolean e;

    /* renamed from: adhy$a */
    public static class a {
        public static adhy a() {
            return new adhy();
        }
    }

    public adhy() {
        this(adhk.a, adht.a);
    }

    private adhy(adhk adhk, adht adht) {
        this.e = false;
        this.a = adhk;
        this.b = adht;
    }

    public final int a() {
        Preconditions.checkState(this.e);
        return this.c;
    }

    public final void a(int i, String str) {
        Preconditions.checkState(this.e ^ 1);
        boolean z = i == 35633 || i == 35632;
        Preconditions.checkArgument(z);
        this.d = i;
        this.c = adht.a(i, str);
        this.e = true;
    }

    public final void b() {
        if (this.e) {
            GLES20.glDeleteShader(this.c);
            this.e = false;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        try {
            if (this.e) {
                StringBuilder stringBuilder = new StringBuilder("Shader not released. type = ");
                stringBuilder.append(this.d);
                stringBuilder.append(", id = ");
                stringBuilder.append(this.c);
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }
}
