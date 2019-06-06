package defpackage;

import android.graphics.Bitmap;

/* renamed from: alw */
public final class alw implements ajn<Bitmap> {
    private final Bitmap a;
    private final ajr b;

    public alw(Bitmap bitmap, ajr ajr) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (ajr != null) {
            this.a = bitmap;
            this.b = ajr;
        } else {
            throw new NullPointerException("BitmapPool must not be null");
        }
    }

    public static alw a(Bitmap bitmap, ajr ajr) {
        return bitmap == null ? null : new alw(bitmap, ajr);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return this.a;
    }

    public final int b() {
        return aps.a(this.a);
    }

    public final void c() {
        this.b.a(this.a);
    }
}
