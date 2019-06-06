package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: hs */
public abstract class hs extends Drawable {
    public final Paint a = new Paint(3);
    public final BitmapShader b;
    float c;
    final Rect d = new Rect();
    public boolean e = true;
    public boolean f;
    private Bitmap g;
    private int h = 160;
    private int i = 119;
    private final Matrix j = new Matrix();
    private final RectF k = new RectF();
    private int l;
    private int m;

    hs(Resources resources, Bitmap bitmap) {
        BitmapShader bitmapShader;
        if (resources != null) {
            this.h = resources.getDisplayMetrics().densityDpi;
        }
        this.g = bitmap;
        Bitmap bitmap2 = this.g;
        if (bitmap2 != null) {
            this.l = bitmap2.getScaledWidth(this.h);
            this.m = this.g.getScaledHeight(this.h);
            bitmap = this.g;
            TileMode tileMode = TileMode.CLAMP;
            bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.m = -1;
            this.l = -1;
            bitmapShader = null;
        }
        this.b = bitmapShader;
    }

    private static boolean b(float f) {
        return f > 0.05f;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (this.e) {
            if (this.f) {
                int min = Math.min(this.l, this.m);
                a(this.i, min, min, getBounds(), this.d);
                int min2 = Math.min(this.d.width(), this.d.height());
                this.d.inset(Math.max(0, (this.d.width() - min2) / 2), Math.max(0, (this.d.height() - min2) / 2));
                this.c = ((float) min2) * 0.5f;
            } else {
                a(this.i, this.l, this.m, getBounds(), this.d);
            }
            this.k.set(this.d);
            if (this.b != null) {
                this.j.setTranslate(this.k.left, this.k.top);
                this.j.preScale(this.k.width() / ((float) this.g.getWidth()), this.k.height() / ((float) this.g.getHeight()));
                this.b.setLocalMatrix(this.j);
                this.a.setShader(this.b);
            }
            this.e = false;
        }
    }

    public final void a(float f) {
        if (this.c != f) {
            Paint paint;
            Shader shader;
            this.f = false;
            if (hs.b(f)) {
                paint = this.a;
                shader = this.b;
            } else {
                paint = this.a;
                shader = null;
            }
            paint.setShader(shader);
            this.c = f;
            invalidateSelf();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        this.c = (float) (Math.min(this.m, this.l) / 2);
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.g;
        if (bitmap != null) {
            a();
            if (this.a.getShader() == null) {
                canvas.drawBitmap(bitmap, null, this.d, this.a);
                return;
            }
            RectF rectF = this.k;
            float f = this.c;
            canvas.drawRoundRect(rectF, f, f, this.a);
        }
    }

    public int getAlpha() {
        return this.a.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.m;
    }

    public int getIntrinsicWidth() {
        return this.l;
    }

    public int getOpacity() {
        if (this.i == 119 && !this.f) {
            Bitmap bitmap = this.g;
            if (!(bitmap == null || bitmap.hasAlpha() || this.a.getAlpha() < 255 || hs.b(this.c))) {
                return -1;
            }
        }
        return -3;
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f) {
            b();
        }
        this.e = true;
    }

    public void setAlpha(int i) {
        if (i != this.a.getAlpha()) {
            this.a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.a.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
        invalidateSelf();
    }
}
