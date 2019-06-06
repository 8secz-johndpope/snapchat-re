package defpackage;

import android.opengl.GLES20;

/* renamed from: acui */
public final class acui {
    public final acul a;

    public acui(acyj acyj) {
        this(acyj, new acul(acyj, true, "rect"));
    }

    public acui(acyj acyj, acul acul) {
        this.a = acul;
        acyg b = acyj.b(12);
        b.a.put(new float[]{1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f}).position(0);
        this.a.a(b, 35044);
        acyh a = acyj.a(6);
        a.a.put(new int[]{0, 1, 2, 3, 0, 2}).position(0);
        acul = this.a;
        if (acul.a != null) {
            GLES20.glBindBuffer(34963, acul.a.c());
            GLES20.glBufferData(34963, a.a(), a.b(), 35044);
            GLES20.glBindBuffer(34963, 0);
            acyj.a(b);
            acyj.a(a);
            return;
        }
        throw new UnsupportedOperationException("This buffer does not support buffer binding.");
    }

    public final void a(int i) {
        this.a.a(i, 2, 8);
    }
}
