package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: abh */
public class abh implements abg {
    public final Bitmap a(int i, int i2, Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    public final void a() {
    }

    public final void a(float f) {
    }

    public final void a(int i) {
    }

    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }

    public final Bitmap b(int i, int i2, Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
