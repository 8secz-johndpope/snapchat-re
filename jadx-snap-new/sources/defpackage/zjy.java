package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import com.snapchat.android.R;

/* renamed from: zjy */
public final class zjy extends Drawable implements Runnable {
    public boolean a;
    private final RectF b = new RectF();
    private final RectF c = new RectF();
    private final Paint d;
    private final long e;
    private float f;

    public zjy(Context context) {
        akcr.b(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(ContextCompat.getColor(context, R.color.light_charcoal));
        paint.setStyle(Style.STROKE);
        paint.setStrokeCap(Cap.ROUND);
        this.d = paint;
        this.e = SystemClock.elapsedRealtime();
    }

    public final void a(int i) {
        this.d.setColor(i);
    }

    public final void draw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        float elapsedRealtime = (((float) (SystemClock.elapsedRealtime() - this.e)) / 1000.0f) * 360.0f;
        canvas.drawArc(this.b, elapsedRealtime + 90.0f, 180.0f, false, this.d);
        canvas.drawArc(this.c, 90.0f - elapsedRealtime, -180.0f, false, this.d);
    }

    public final int getOpacity() {
        return -1;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        akcr.b(rect, "bounds");
        float width = ((float) rect.width()) / 12.0f;
        float height = ((float) rect.height()) / 12.0f;
        this.f = width;
        this.d.setStrokeWidth(width);
        this.b.set(width * 3.0f, 3.0f * height, width * 9.0f, 9.0f * height);
        this.c.set(width, height, width * 11.0f, 11.0f * height);
    }

    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        invalidateSelf();
        if (this.a) {
            scheduleSelf(this, uptimeMillis + 16);
        }
    }

    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
