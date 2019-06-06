package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;

/* renamed from: amd */
public class amd extends amo {
    a a;
    private final Rect b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    /* renamed from: amd$a */
    static class a extends ConstantState {
        private static final Paint d = new Paint(6);
        final Bitmap a;
        int b;
        Paint c;

        a(a aVar) {
            this(aVar.a);
            this.b = aVar.b;
        }

        public a(Bitmap bitmap) {
            this.c = d;
            this.a = bitmap;
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            if (d == this.c) {
                this.c = new Paint(6);
            }
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new amd(null, this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new amd(resources, this);
        }
    }

    amd(Resources resources, a aVar) {
        int i;
        this.b = new Rect();
        this.a = aVar;
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
            if (i == 0) {
                i = 160;
            }
            aVar.b = i;
        } else {
            i = aVar.b;
        }
        this.c = aVar.a.getScaledWidth(i);
        this.d = aVar.a.getScaledHeight(i);
    }

    public amd(Resources resources, Bitmap bitmap) {
        this(resources, new a(bitmap));
    }

    public final void a(int i) {
    }

    public final boolean a() {
        return false;
    }

    public void draw(Canvas canvas) {
        if (this.e) {
            Gravity.apply(119, this.c, this.d, getBounds(), this.b);
            this.e = false;
        }
        canvas.drawBitmap(this.a.a, null, this.b, this.a.c);
    }

    public ConstantState getConstantState() {
        return this.a;
    }

    public int getIntrinsicHeight() {
        return this.d;
    }

    public int getIntrinsicWidth() {
        return this.c;
    }

    public int getOpacity() {
        Bitmap bitmap = this.a.a;
        return (bitmap == null || bitmap.hasAlpha() || this.a.c.getAlpha() < 255) ? -3 : -1;
    }

    public boolean isRunning() {
        return false;
    }

    public Drawable mutate() {
        if (!this.f && super.mutate() == this) {
            this.a = new a(this.a);
            this.f = true;
        }
        return this;
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.e = true;
    }

    public void setAlpha(int i) {
        if (this.a.c.getAlpha() != i) {
            a aVar = this.a;
            aVar.a();
            aVar.c.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        a aVar = this.a;
        aVar.a();
        aVar.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void start() {
    }

    public void stop() {
    }
}
