package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.Region.Op;

/* renamed from: abvc */
public final class abvc implements abvf {
    private final Path a = new Path();
    private final RectF b = new RectF();
    private Path c;
    private RectF d;
    private float e = 4.0f;
    private float f = 4.0f;
    private float g = 1.0f;

    public final void a(Canvas canvas) {
        if (this.e < 4.0f || this.f < 4.0f) {
            canvas.save();
            this.a.reset();
            float width = (((float) canvas.getWidth()) * this.f) * this.g;
            float width2 = (((float) canvas.getWidth()) * this.e) * this.g;
            float width3 = ((float) canvas.getWidth()) / 2.0f;
            float height = ((float) canvas.getHeight()) / 2.0f;
            RectF rectF = this.b;
            float f = width2 / 2.0f;
            rectF.left = width3 - f;
            width /= 2.0f;
            rectF.top = height - width;
            rectF.right = width3 + f;
            rectF.bottom = height + width;
            this.a.addOval(rectF, Direction.CW);
            canvas.clipPath(this.a);
            RectF rectF2 = this.d;
            if (!(rectF2 == null || this.c == null)) {
                rectF2.left = this.b.left + (-0.12424f * width2);
                this.d.right = this.b.left + (0.24548f * width2);
                this.d.top = this.b.top + (0.04545f * width2);
                this.d.bottom = this.b.top + (width2 * 0.41518f);
                this.c.reset();
                this.c.addOval(this.d, Direction.CW);
                canvas.clipPath(this.c, Op.DIFFERENCE);
            }
        }
    }

    public final void b(Canvas canvas) {
        if (this.e < 4.0f || this.f < 4.0f) {
            canvas.restore();
        }
    }

    public final float getScaleX() {
        return this.e;
    }

    public final float getScaleY() {
        return this.f;
    }

    public final void setContentToPaddingRatio(float f) {
        this.g = f;
    }

    public final void setScaleX(float f) {
        this.e = f;
    }

    public final void setScaleY(float f) {
        this.f = f;
    }

    public final void setSpecsCutoutEnabled(boolean z) {
        RectF rectF;
        if (z) {
            this.c = new Path();
            rectF = new RectF();
        } else {
            rectF = null;
            this.c = null;
        }
        this.d = rectF;
    }
}
