package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: aly */
public final class aly extends alx {
    public aly(ajr ajr) {
        super(ajr);
    }

    /* Access modifiers changed, original: protected|final */
    public final Bitmap a(ajr ajr, Bitmap bitmap, int i, int i2) {
        Bitmap a = ajr.a(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
        if (bitmap == null) {
            bitmap = null;
        } else if (!(bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
            float height;
            float width;
            Matrix matrix = new Matrix();
            int width2 = bitmap.getWidth() * i2;
            int height2 = bitmap.getHeight() * i;
            float f = MapboxConstants.MINIMUM_ZOOM;
            if (width2 > height2) {
                height = ((float) i2) / ((float) bitmap.getHeight());
                width = (((float) i) - (((float) bitmap.getWidth()) * height)) * 0.5f;
            } else {
                height = ((float) i) / ((float) bitmap.getWidth());
                f = (((float) i2) - (((float) bitmap.getHeight()) * height)) * 0.5f;
                width = MapboxConstants.MINIMUM_ZOOM;
            }
            matrix.setScale(height, height);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (f + 0.5f)));
            Bitmap createBitmap = a == null ? Bitmap.createBitmap(i, i2, aml.a(bitmap)) : a;
            aml.a(bitmap, createBitmap);
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(6));
            bitmap = createBitmap;
        }
        if (!(a == null || a == bitmap)) {
            ajr.a(a);
        }
        return bitmap;
    }

    public final String a() {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }
}
