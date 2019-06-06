package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;

/* renamed from: amc */
public final class amc extends alx {
    public amc(ajr ajr) {
        super(ajr);
    }

    /* Access modifiers changed, original: protected|final */
    public final Bitmap a(ajr ajr, Bitmap bitmap, int i, int i2) {
        String str = "TransformationUtils";
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int width = (int) (((float) bitmap.getWidth()) * min);
        int height = (int) (((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == width && bitmap.getHeight() == height) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Config a = aml.a(bitmap);
        Bitmap a2 = ajr.a(width, height, a);
        if (a2 == null) {
            a2 = Bitmap.createBitmap(width, height, a);
        }
        aml.a(bitmap, a2);
        if (Log.isLoggable(str, 2)) {
            StringBuilder stringBuilder = new StringBuilder("request: ");
            stringBuilder.append(i);
            String str2 = "x";
            stringBuilder.append(str2);
            stringBuilder.append(i2);
            Log.v(str, stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder("toFit:   ");
            stringBuilder2.append(bitmap.getWidth());
            stringBuilder2.append(str2);
            stringBuilder2.append(bitmap.getHeight());
            Log.v(str, stringBuilder2.toString());
            stringBuilder2 = new StringBuilder("toReuse: ");
            stringBuilder2.append(a2.getWidth());
            stringBuilder2.append(str2);
            stringBuilder2.append(a2.getHeight());
            Log.v(str, stringBuilder2.toString());
            Log.v(str, "minPct:   ".concat(String.valueOf(min)));
        }
        Canvas canvas = new Canvas(a2);
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        canvas.drawBitmap(bitmap, matrix, new Paint(6));
        return a2;
    }

    public final String a() {
        return "FitCenter.com.bumptech.glide.load.resource.bitmap";
    }
}
