package defpackage;

import android.opengl.GLES20;

/* renamed from: acul */
public final class acul {
    final acyi a;
    private final acyi b;
    private final String c;
    private final acyj d;
    private boolean e;

    public acul(acyj acyj, boolean z, String str) {
        this.d = acyj;
        this.b = acyj.b();
        this.c = str;
        GLES20.glGenBuffers(1, this.b.a);
        if (z) {
            this.a = acyj.b();
            GLES20.glGenBuffers(1, this.a.a);
            return;
        }
        this.a = null;
    }

    public final void a() {
        this.e = true;
        this.d.a(this.b);
        acyi acyi = this.a;
        if (acyi != null) {
            this.d.a(acyi);
        }
    }

    public final void a(int i) {
        a(i, 4, 16);
    }

    public final void a(int i, int i2, int i3) {
        if (i2 > 4 || i2 <= 0) {
            throw new IllegalArgumentException("Invalid size, must be 1, 2, 3, or 4.");
        } else if (i3 >= 0) {
            GLES20.glBindBuffer(34962, this.b.c());
            acyi acyi = this.a;
            if (acyi != null) {
                GLES20.glBindBuffer(34963, acyi.c());
            }
            GLES20.glEnableVertexAttribArray(i);
            GLES20.glVertexAttribPointer(i, i2, 5126, false, i3, 0);
        } else {
            throw new IllegalArgumentException("Negative stride values are not legal.");
        }
    }

    public final void a(acye<?> acye, int i) {
        GLES20.glBindBuffer(34962, this.b.c());
        GLES20.glBufferData(34962, acye.a(), acye.b(), i);
        GLES20.glBindBuffer(34962, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        super.finalize();
        if (!this.e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append(hashCode());
        }
    }
}
