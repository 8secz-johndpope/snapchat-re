package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLUtils;

/* renamed from: adhm */
public final class adhm {
    static final adhm a = new adhm();

    private adhm() {
    }

    public static void a(Bitmap bitmap) {
        GLUtils.texImage2D(3553, 0, bitmap, 0);
    }
}
