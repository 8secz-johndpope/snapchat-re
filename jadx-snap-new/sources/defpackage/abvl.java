package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abvl */
public final class abvl implements abvf {
    public float a = 1.0f;
    public int b = 0;
    public float c = 1.0f;
    public int d = 0;
    public float e;
    public float f;
    private final Path g = new Path();
    private int h = 0;
    private boolean i;

    public final void a(Canvas canvas) {
        float width;
        float height;
        int ceil;
        int ceil2;
        int i = 0;
        if (this.i) {
            canvas.save();
            width = (float) canvas.getWidth();
            height = (float) canvas.getHeight();
            ceil = (int) Math.ceil((double) ((1.0f - this.a) * width));
            ceil2 = (int) Math.ceil((double) ((1.0f - this.c) * height));
            int height2 = (canvas.getHeight() - ceil2) + (height == MapboxConstants.MINIMUM_ZOOM ? 0 : (int) Math.ceil((double) (((float) (this.d * ceil2)) / height)));
            this.g.reset();
            this.g.addCircle((float) (canvas.getWidth() / 2), (float) (height2 / 2), Math.min((width / 2.0f) - ((float) ceil), (height / 2.0f) - ((float) ceil2)), Direction.CW);
            canvas.clipPath(this.g);
        }
        if (this.h != 0) {
            canvas.save();
            width = (float) canvas.getWidth();
            height = (float) canvas.getHeight();
            ceil = (int) Math.ceil((double) ((1.0f - this.a) * width));
            ceil2 = (int) Math.ceil((double) ((1.0f - this.c) * height));
            int ceil3 = width == MapboxConstants.MINIMUM_ZOOM ? 0 : (int) Math.ceil((double) (((float) (this.b * ceil)) / width));
            if (height != MapboxConstants.MINIMUM_ZOOM) {
                i = (int) Math.ceil((double) (((float) (this.d * ceil2)) / height));
            }
            int width2 = (canvas.getWidth() - ceil) + ceil3;
            int height3 = (canvas.getHeight() - ceil2) + i;
            this.g.reset();
            float f = (float) i;
            this.g.moveTo((float) (this.h + ceil3), f);
            this.g.lineTo((float) (width2 - this.h), f);
            float f2 = (float) width2;
            this.g.quadTo(f2, f, f2, (float) (this.h + i));
            this.g.lineTo(f2, (float) (height3 - this.h));
            float f3 = (float) height3;
            this.g.quadTo(f2, f3, (float) (width2 - this.h), f3);
            this.g.lineTo((float) (this.h + ceil3), f3);
            float f4 = (float) ceil3;
            this.g.quadTo(f4, f3, f4, (float) (height3 - this.h));
            this.g.lineTo(f4, (float) (i + this.h));
            this.g.quadTo(f4, f, (float) (ceil3 + this.h), f);
            this.g.close();
            canvas.clipPath(this.g);
        }
        if (this.a < 1.0f || this.c < 1.0f) {
            canvas.scale(this.a, this.c, (float) this.b, (float) this.d);
        }
    }

    public final void b(Canvas canvas) {
        if (this.a < 1.0f || this.c < 1.0f) {
            canvas.scale(1.0f / this.a, 1.0f / this.c, (float) this.b, (float) this.d);
        }
        if (this.i || this.h != 0) {
            canvas.restore();
        }
    }

    public final int getScalePX() {
        return this.b;
    }

    public final int getScalePY() {
        return this.d;
    }

    public final float getScaleX() {
        return this.a;
    }

    public final float getScaleY() {
        return this.c;
    }

    public final void setCornerRadius(int i) {
        this.h = i;
        this.i = false;
    }

    public final void setEnableCircleMask(boolean z) {
        this.i = z;
        this.h = 0;
    }

    public final void setScalePX(int i) {
        this.b = i;
    }

    public final void setScalePY(int i) {
        this.d = i;
    }

    public final void setScaleX(float f) {
        this.a = f;
    }

    public final void setScaleY(float f) {
        this.c = f;
    }
}
