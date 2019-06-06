package defpackage;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.GLES20;
import defpackage.acuz.a;

/* renamed from: acva */
public final class acva implements Runnable {
    private final Bitmap a;
    private final String b;
    private final acus c;
    private final actz d;
    private final acuz e;

    public acva(Bitmap bitmap, String str, acus acus, actz actz, acuz acuz) {
        akcr.b(bitmap, "bitmap");
        akcr.b(str, "ownerName");
        akcr.b(acus, "callBack");
        akcr.b(actz, "thread");
        akcr.b(acuz, "textureContext");
        this.a = bitmap;
        this.b = str;
        this.c = acus;
        this.d = actz;
        this.e = acuz;
    }

    public final void run() {
        try {
            Object b = this.d.b();
            akcr.a(b, "thread.checkStatus()");
            int i = acvb.a[b.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("You can only run this in the thread it was created.");
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (EGL14.eglGetCurrentContext() == null) {
                            throw new IllegalStateException("Existing GL Context is null, we need to switch again?");
                        }
                    }
                }
                if (this.e.b()) {
                    acxn acxn;
                    if (this.a.isRecycled()) {
                        acxn = null;
                    } else {
                        a d = this.e.d();
                        GLES20.glBindTexture(3553, d.a);
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        this.e.a(this.a, d.a, this.b);
                        acxn = new acxn(d, this.a.getWidth(), this.a.getHeight());
                    }
                    this.c.onTextureUploaded(acxn);
                }
            } else {
                throw new IllegalStateException("GL Context is not ready yet.");
            }
        } catch (RuntimeException unused) {
        }
    }
}
