package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: adr */
final class adr {
    private static final abg a = new 1();

    /* renamed from: adr$1 */
    class 1 extends abh {
        1() {
        }

        public final void a(Bitmap bitmap) {
        }
    }

    static aax<Bitmap> a(abg abg, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        drawable = drawable.getCurrent();
        Object obj = null;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else if (drawable instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = adr.b(abg, drawable, i, i2);
            obj = 1;
        }
        if (obj == null) {
            abg = a;
        }
        return adl.a(bitmap, abg);
    }

    private static Bitmap b(abg abg, Drawable drawable, int i, int i2) {
        String str = "Unable to draw ";
        String str2 = "DrawableToBitmap";
        StringBuilder stringBuilder;
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(str2, 5)) {
                stringBuilder = new StringBuilder(str);
                stringBuilder.append(drawable);
                stringBuilder.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                Log.w(str2, stringBuilder.toString());
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock lock = adz.b;
            lock.lock();
            Bitmap a = abg.a(i, i2, Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(a);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return a;
            } finally {
                lock.unlock();
            }
        } else {
            if (Log.isLoggable(str2, 5)) {
                stringBuilder = new StringBuilder(str);
                stringBuilder.append(drawable);
                stringBuilder.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                Log.w(str2, stringBuilder.toString());
            }
            return null;
        }
    }
}
