package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: aday */
public class aday {
    private static Matrix a;
    private static Paint b;
    private static Canvas c;

    /* renamed from: aday$a */
    public static class a implements adcg {
        public final acua a(Context context, jwa jwa, int i, String str) {
            return aday.a(context, jwa, i, false, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, str);
        }
    }

    public static acua a(Context context, jwa jwa, int i, boolean z, int i2, int i3, int i4, String str) {
        Throwable th;
        Context context2 = context;
        amk amk = new amk(context, aim.PREFER_ARGB_8888);
        Closeable openRawResource;
        try {
            int i5 = i;
            openRawResource = context.getResources().openRawResource(i);
            i5 = i2;
            try {
                ajn a = amk.a((InputStream) openRawResource, i2, i3);
                Bitmap bitmap = (Bitmap) a.a();
                acua a2 = acua.a(aday.a(bitmap, (float) bitmap.getWidth(), (float) bitmap.getHeight(), i4, z, jwa, str));
                a.c();
                aklc.a(openRawResource);
                return a2;
            } catch (IOException unused) {
                aklc.a(openRawResource);
                return null;
            } catch (Throwable th2) {
                th = th2;
                aklc.a(openRawResource);
                throw th;
            }
        } catch (IOException unused2) {
            openRawResource = null;
            aklc.a(openRawResource);
            return null;
        } catch (Throwable th3) {
            th = th3;
            openRawResource = null;
            aklc.a(openRawResource);
            throw th;
        }
    }

    public static acua a(jwa jwa, Bitmap bitmap, String str) {
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Source is already recycled.");
        }
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        return (width >= 2.13116685E9f || height >= 2.13116685E9f) ? acua.a(aday.a(bitmap, width, height, R.dimen.map_status_bubble_size, false, jwa, str)) : acua.a(bitmap);
    }

    private static kaz<jwj> a(Bitmap bitmap, float f, float f2, int i, boolean z, jwa jwa, String str) {
        int i2;
        Matrix matrix;
        Paint paint;
        Canvas canvas;
        float f3 = f / f2;
        if (i == Integer.MIN_VALUE) {
            i = (int) f2;
            i2 = (int) f;
        } else if (f > f2) {
            int i3 = (int) (((float) i) / f3);
            i2 = i;
            i = i3;
        } else {
            i2 = (int) (((float) i) * f3);
        }
        float f4 = ((float) i2) / f;
        float f5 = ((float) i) / f2;
        synchronized (aday.class) {
            matrix = a;
            a = null;
            paint = b;
            b = null;
            canvas = c;
            c = null;
        }
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (paint == null) {
            paint = new Paint();
        } else {
            paint.reset();
        }
        paint.setFlags(3);
        if (canvas == null) {
            canvas = new Canvas();
        }
        matrix.setScale(f4, f5);
        if (z) {
            matrix.postScale(-1.0f, 1.0f, (f4 * f) / 2.0f, MapboxConstants.MINIMUM_ZOOM);
        }
        kaz a = jwa.a(i2, i, str);
        canvas.setBitmap(((jwj) a.a()).a());
        canvas.drawBitmap(bitmap, matrix, paint);
        canvas.setBitmap(null);
        synchronized (aday.class) {
            a = matrix;
            b = paint;
            c = canvas;
        }
        return a;
    }

    public static kaz<jwj> a(jwa jwa, kaz<jwj> kaz, int i, String str) {
        Bitmap a = ((jwj) kaz.a()).a();
        if (a.isRecycled()) {
            throw new IllegalArgumentException("Source is already recycled.");
        }
        float width = (float) a.getWidth();
        float height = (float) a.getHeight();
        float f = (float) i;
        return (width >= f || height >= f) ? aday.a(a, width, height, i, false, jwa, str) : kaz;
    }
}
