package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: on */
final class on extends Drawable {
    float a;
    float b;
    ColorStateList c;
    private final Paint d;
    private final RectF e;
    private final Rect f;
    private boolean g = false;
    private boolean h = true;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private Mode k = Mode.SRC_IN;

    on(ColorStateList colorStateList, float f) {
        this.a = f;
        this.d = new Paint(5);
        a(colorStateList);
        this.e = new RectF();
        this.f = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode) {
        return (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* Access modifiers changed, original: final */
    public final void a(float f, boolean z, boolean z2) {
        if (f != this.b || this.g != z || this.h != z2) {
            this.b = f;
            this.g = z;
            this.h = z2;
            a(null);
            invalidateSelf();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.c = colorStateList;
        this.d.setColor(this.c.getColorForState(getState(), this.c.getDefaultColor()));
    }

    /* Access modifiers changed, original: final */
    public final void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.e.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f.set(rect);
        if (this.g) {
            float a = oo.a(this.b, this.a, this.h);
            this.f.inset((int) Math.ceil((double) oo.b(this.b, this.a, this.h)), (int) Math.ceil((double) a));
            this.e.set(this.f);
        }
    }

    public final void draw(Canvas canvas) {
        Object obj;
        Paint paint = this.d;
        if (this.i == null || paint.getColorFilter() != null) {
            obj = null;
        } else {
            paint.setColorFilter(this.i);
            obj = 1;
        }
        RectF rectF = this.e;
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (obj != null) {
            paint.setColorFilter(null);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f, this.a);
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            colorStateList = this.c;
            if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.d.getColor();
        if (z) {
            this.d.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 != null) {
            Mode mode = this.k;
            if (mode != null) {
                this.i = a(colorStateList2, mode);
                return true;
            }
        }
        return z;
    }

    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    public final void setTintMode(Mode mode) {
        this.k = mode;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }
}
