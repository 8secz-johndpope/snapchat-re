package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import defpackage.axg.b;
import defpackage.axg.l;

/* renamed from: axf */
public final class axf extends awz {
    public b a;
    private Object b;
    private PointF c = null;
    private int d = 0;
    private int e = 0;
    private Matrix f;
    private Matrix g = new Matrix();

    public axf(Drawable drawable, b bVar) {
        super((Drawable) auh.a((Object) drawable));
        this.a = bVar;
    }

    private void b() {
        b bVar = this.a;
        Object obj = 1;
        Object obj2;
        if (bVar instanceof l) {
            Object a = ((l) bVar).a();
            obj2 = (a == null || !a.equals(this.b)) ? 1 : null;
            this.b = a;
        } else {
            obj2 = null;
        }
        if (this.d == getCurrent().getIntrinsicWidth() && this.e == getCurrent().getIntrinsicHeight()) {
            obj = null;
        }
        if (obj != null || obj2 != null) {
            c();
        }
    }

    private void c() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.d = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.e = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f = null;
        } else if (this.a == b.a) {
            current.setBounds(bounds);
            this.f = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.a.a(this.g, bounds, intrinsicWidth, intrinsicHeight, 0.5f, 0.5f);
            this.f = this.g;
        }
    }

    public final Drawable b(Drawable drawable) {
        drawable = super.b(drawable);
        c();
        return drawable;
    }

    public final void draw(Canvas canvas) {
        b();
        if (this.f != null) {
            int save = canvas.save();
            if (this.a == b.g || this.a == b.e || this.a == b.h) {
                canvas.clipRect(getBounds());
            }
            canvas.concat(this.f);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public final void getTransform(Matrix matrix) {
        a(matrix);
        b();
        Matrix matrix2 = this.f;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        c();
    }
}
