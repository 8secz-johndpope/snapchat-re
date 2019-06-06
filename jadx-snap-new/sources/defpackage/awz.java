package defpackage;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: awz */
public class awz extends Drawable implements Callback, awv, axh, axi {
    private Drawable a;
    private final aww b = new aww();
    private axi c;

    static {
        Matrix matrix = new Matrix();
    }

    public awz(Drawable drawable) {
        this.a = drawable;
        awx.a(this.a, this, this);
    }

    public final Drawable a() {
        return getCurrent();
    }

    public final Drawable a(Drawable drawable) {
        return b(drawable);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Matrix matrix) {
        axi axi = this.c;
        if (axi != null) {
            axi.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    public Drawable b(Drawable drawable) {
        Drawable drawable2 = this.a;
        awx.a(drawable2, null, null);
        awx.a(drawable, null, null);
        awx.a(drawable, this.b);
        awx.a(drawable, (Drawable) this);
        awx.a(drawable, this, this);
        this.a = drawable;
        invalidateSelf();
        return drawable2;
    }

    public void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    public ConstantState getConstantState() {
        return this.a.getConstantState();
    }

    public Drawable getCurrent() {
        return this.a;
    }

    public int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.a.getPadding(rect);
    }

    public void getRootBounds(RectF rectF) {
        axi axi = this.c;
        if (axi != null) {
            axi.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void getTransform(Matrix matrix) {
        a(matrix);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        return this.a.isStateful();
    }

    public Drawable mutate() {
        this.a.mutate();
        return this;
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    /* Access modifiers changed, original: protected */
    public boolean onLevelChange(int i) {
        return this.a.setLevel(i);
    }

    /* Access modifiers changed, original: protected */
    public boolean onStateChange(int[] iArr) {
        return this.a.setState(iArr);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.b.a = i;
        this.a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.a(colorFilter);
        this.a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.b.a(z);
        this.a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.b.b(z);
        this.a.setFilterBitmap(z);
    }

    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        this.a.setHotspot(f, f2);
    }

    public void setTransformCallback(axi axi) {
        this.c = axi;
    }

    public boolean setVisible(boolean z, boolean z2) {
        super.setVisible(z, z2);
        return this.a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
