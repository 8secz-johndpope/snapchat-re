package defpackage;

import android.graphics.Bitmap;

/* renamed from: alx */
public abstract class alx implements ais<Bitmap> {
    private ajr a;

    public alx(ajr ajr) {
        this.a = ajr;
    }

    public final ajn<Bitmap> a(ajn<Bitmap> ajn, int i, int i2) {
        if (aps.a(i, i2)) {
            Bitmap bitmap = (Bitmap) ajn.a();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = a(this.a, bitmap, i, i2);
            return !bitmap.equals(a) ? alw.a(a, this.a) : ajn;
        } else {
            StringBuilder stringBuilder = new StringBuilder("Cannot apply transformation on width: ");
            stringBuilder.append(i);
            stringBuilder.append(" or height: ");
            stringBuilder.append(i2);
            stringBuilder.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public abstract Bitmap a(ajr ajr, Bitmap bitmap, int i, int i2);
}
