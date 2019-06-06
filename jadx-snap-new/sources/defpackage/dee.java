package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.v4.content.ContextCompat;
import com.google.common.collect.MapMaker;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: dee */
public final class dee {
    private static final ConcurrentMap<Rect, ded> j = new MapMaker().weakValues().makeMap();
    public int a;
    public int b;
    private final int c;
    private final Paint d;
    private final Rect e;
    private Matrix f;
    private Path g;
    private Path h;
    private ded i;

    /* renamed from: dee$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public /* synthetic */ dee(Context context) {
        this(context, null);
    }

    public dee(Context context, String str) {
        Context context2 = context;
        akcr.b(context2, "context");
        this.c = ContextCompat.getColor(context2, R.color.bitmoji_silhouette_border_color);
        Paint paint = new Paint(1);
        paint.setStyle(Style.FILL);
        this.d = paint;
        this.a = ddu.a(str);
        this.b = 255;
        this.e = new Rect(0, 0, 100, 100);
        this.f = new Matrix();
        Path path = new Path();
        path.moveTo(69.91f, 93.0f);
        Path path2 = path;
        path2.cubicTo(68.91f, 75.59f, 64.91f, 69.77f, 59.28f, 65.26f);
        path2.cubicTo(54.45f, 61.39f, 47.8f, 59.76f, 41.84f, 58.7f);
        path.lineTo(41.75f, 57.7f);
        path2.cubicTo(49.25f, 53.08f, 51.31f, 48.23f, 54.47f, 37.64f);
        path.lineTo(54.55f, 37.3f);
        path2 = path;
        path2.cubicTo(55.38f, 36.77f, 57.35f, 35.07f, 57.71f, 30.77f);
        path2.cubicTo(57.95f, 27.94f, 57.66f, 26.23f, 56.81f, 25.37f);
        path.lineTo(56.8f, 25.36f);
        path.cubicTo(56.48f, 25.04f, 56.06f, 24.84f, 55.6f, 24.79f);
        path.lineTo(55.61f, 24.71f);
        path2 = path;
        path2.cubicTo(55.93f, 20.99f, 55.64f, 17.24f, 54.73f, 13.61f);
        path2.cubicTo(52.33f, 5.35f, 44.59f, MapboxConstants.MINIMUM_ZOOM, 35.0f, MapboxConstants.MINIMUM_ZOOM);
        path2.cubicTo(25.41f, MapboxConstants.MINIMUM_ZOOM, 17.67f, 5.35f, 15.28f, 13.62f);
        path.lineTo(15.28f, 13.6f);
        path2.cubicTo(14.38f, 17.22f, 14.09f, 20.97f, 14.41f, 24.68f);
        path.lineTo(14.42f, 24.77f);
        path2.cubicTo(13.96f, 24.82f, 13.54f, 25.02f, 13.22f, 25.34f);
        path2.cubicTo(12.36f, 26.21f, 12.07f, 27.93f, 12.31f, 30.75f);
        path2.cubicTo(12.67f, 35.05f, 14.64f, 36.75f, 15.47f, 37.28f);
        path.lineTo(15.56f, 37.67f);
        path.cubicTo(18.7f, 48.21f, 20.76f, 53.06f, 28.26f, 57.67f);
        path.lineTo(28.17f, 58.67f);
        path2 = path;
        path2.cubicTo(22.17f, 59.73f, 15.56f, 61.36f, 10.73f, 65.23f);
        path2.cubicTo(5.08f, 69.73f, 1.11f, 75.55f, 0.09f, 93.0f);
        path.lineTo(0.09f, 93.79f);
        path.lineTo(70.0f, 93.79f);
        path.lineTo(69.91f, 93.0f);
        path.close();
        this.g = path;
        path = new Path();
        path.moveTo(69.91f, 93.0f);
        Path path3 = path;
        path3.cubicTo(68.91f, 75.59f, 64.91f, 69.77f, 59.28f, 65.26f);
        path3.cubicTo(54.45f, 61.39f, 47.8f, 59.76f, 41.84f, 58.7f);
        path.lineTo(41.75f, 57.7f);
        path3.cubicTo(49.25f, 53.08f, 51.31f, 48.23f, 54.45f, 37.7f);
        path.lineTo(54.54f, 37.31f);
        path3.cubicTo(55.37f, 36.78f, 57.34f, 35.08f, 57.7f, 30.78f);
        path3.cubicTo(57.94f, 27.95f, 57.65f, 26.24f, 56.8f, 25.38f);
        path.lineTo(56.79f, 25.37f);
        path3.cubicTo(56.47f, 25.05f, 56.05f, 24.85f, 55.59f, 24.8f);
        path.lineTo(55.6f, 24.71f);
        path3.cubicTo(55.92f, 21.0f, 55.63f, 17.25f, 54.73f, 13.63f);
        path3.cubicTo(52.33f, 5.35f, 44.59f, MapboxConstants.MINIMUM_ZOOM, 35.0f, MapboxConstants.MINIMUM_ZOOM);
        path.lineTo(35.0f, MapboxConstants.MINIMUM_ZOOM);
        path3.cubicTo(25.41f, MapboxConstants.MINIMUM_ZOOM, 17.67f, 5.35f, 15.28f, 13.62f);
        path.lineTo(15.28f, 13.6f);
        path3.cubicTo(14.38f, 17.22f, 14.09f, 20.97f, 14.41f, 24.68f);
        path.lineTo(14.42f, 24.77f);
        path3.cubicTo(13.96f, 24.82f, 13.54f, 25.02f, 13.22f, 25.34f);
        path3.cubicTo(12.36f, 26.21f, 12.07f, 27.93f, 12.31f, 30.75f);
        path3.cubicTo(12.67f, 35.05f, 14.64f, 36.75f, 15.47f, 37.28f);
        path.lineTo(15.56f, 37.67f);
        path3.cubicTo(18.7f, 48.21f, 20.76f, 53.06f, 28.26f, 57.67f);
        path.lineTo(28.17f, 58.67f);
        path3.cubicTo(22.17f, 59.73f, 15.56f, 61.36f, 10.73f, 65.23f);
        path3.cubicTo(5.08f, 69.73f, 1.11f, 75.55f, 0.09f, 93.0f);
        path.lineTo(0.09f, 93.79f);
        path.lineTo(70.0f, 93.79f);
        path.lineTo(69.91f, 93.0f);
        path.close();
        path.moveTo(35.0f, 92.25f);
        path.lineTo(1.64f, 92.25f);
        path3.cubicTo(2.7f, 75.99f, 6.42f, 70.58f, 11.64f, 66.39f);
        path3.cubicTo(16.38f, 62.61f, 23.07f, 61.05f, 29.0f, 60.0f);
        path.lineTo(29.57f, 59.9f);
        path.lineTo(29.86f, 56.84f);
        path.lineTo(29.45f, 56.6f);
        path3.cubicTo(22.0f, 52.2f, 20.13f, 47.79f, 17.0f, 37.29f);
        path.lineTo(16.76f, 36.29f);
        path.lineTo(16.42f, 36.13f);
        path3.cubicTo(16.33f, 36.13f, 14.16f, 35.05f, 13.79f, 30.65f);
        path3.cubicTo(13.53f, 27.53f, 14.05f, 26.65f, 14.26f, 26.42f);
        path3.cubicTo(14.86f, 25.76f, 15.35f, 26.5f, 15.71f, 26.34f);
        path3.cubicTo(16.07f, 26.18f, 15.96f, 25.34f, 15.96f, 25.34f);
        path.lineTo(15.95f, 25.23f);
        path3.cubicTo(15.55f, 21.45f, 15.82f, 17.62f, 16.74f, 13.92f);
        path3.cubicTo(18.92f, 6.42f, 26.1f, 1.5f, 35.0f, 1.5f);
        path3.cubicTo(43.9f, 1.5f, 51.08f, 6.42f, 53.28f, 14.0f);
        path.lineTo(53.23f, 13.81f);
        path3.cubicTo(54.15f, 17.51f, 54.42f, 21.34f, 54.02f, 25.12f);
        path3.cubicTo(54.0f, 25.35f, 53.89f, 26.16f, 54.25f, 26.35f);
        path3.cubicTo(54.61f, 26.54f, 55.1f, 25.77f, 55.7f, 26.43f);
        path3.cubicTo(55.92f, 26.67f, 56.43f, 27.54f, 56.17f, 30.66f);
        path3.cubicTo(55.8f, 35.06f, 53.64f, 36.1f, 53.54f, 36.14f);
        path.lineTo(53.2f, 36.3f);
        path.lineTo(52.96f, 37.3f);
        path3.cubicTo(49.83f, 47.8f, 47.96f, 52.21f, 40.53f, 56.64f);
        path.lineTo(40.12f, 56.88f);
        path.lineTo(40.41f, 59.94f);
        path.lineTo(41.0f, 60.0f);
        path3.cubicTo(46.92f, 61.0f, 53.6f, 62.58f, 58.33f, 66.35f);
        path3.cubicTo(63.57f, 70.54f, 67.33f, 75.96f, 68.33f, 92.21f);
        path.lineTo(35.0f, 92.25f);
        path.close();
        this.h = path;
    }

    public final void a(int i, int i2) {
        if (!(this.e.right == i && this.e.bottom == i2)) {
            this.e.set(0, 0, i, i2);
            Rect rect = this.e;
            ded ded = (ded) j.get(rect);
            if (ded != null) {
                this.f = ded.a;
                this.h = ded.c;
                this.g = ded.b;
                return;
            }
            float min = ((float) Math.min(rect.width(), rect.height())) / 100.0f;
            this.f.reset();
            this.f.setTranslate((((float) rect.width()) - (70.0f * min)) / 2.0f, ((float) rect.height()) - (92.0f * min));
            this.f.preScale(min, min);
            this.g.transform(this.f);
            this.h.transform(this.f);
            this.i = new ded(this.f, this.g, this.h);
            Object obj = j;
            akcr.a(obj, "pathCache");
            ((Map) obj).put(new Rect(rect), this.i);
        }
    }

    public final void a(Canvas canvas) {
        akcr.b(canvas, "canvas");
        this.d.setStyle(Style.FILL);
        this.d.setColor(def.a(this.a, this.b));
        canvas.drawPath(this.g, this.d);
        this.d.setColor(def.a(this.c, this.b));
        canvas.drawPath(this.h, this.d);
    }

    public final void a(String str) {
        this.a = ddu.a(str);
    }
}
