package com.snap.composer.utils;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import defpackage.akcr;

public final class CanvasClipper {
    private boolean a = true;
    private final Path b = new Path();
    private final RectF c = new RectF();
    private final Rect d = new Rect();
    private float[] e;
    private boolean f;

    public final void clip(Canvas canvas, Rect rect) {
        akcr.b(canvas, "canvas");
        akcr.b(rect, "clipBounds");
        if (this.f) {
            canvas.clipPath(getPath(rect));
        } else {
            canvas.clipRect(rect);
        }
    }

    public final boolean getDirty() {
        return this.a;
    }

    public final boolean getHasNonNullCornerRadius() {
        return this.f;
    }

    public final Path getPath(Rect rect) {
        akcr.b(rect, "clipBounds");
        float[] fArr = this.e;
        if (this.a || (akcr.a(this.d, (Object) rect) ^ 1) != 0) {
            this.d.set(rect);
            this.b.reset();
            this.c.left = (float) rect.left;
            this.c.top = (float) rect.top;
            this.c.right = (float) rect.right;
            this.c.bottom = (float) rect.bottom;
            if (!this.f || fArr == null) {
                this.b.addRect(this.c, Direction.CW);
            } else {
                this.b.addRoundRect(this.c, fArr, Direction.CW);
            }
            this.a = false;
        }
        return this.b;
    }

    public final void setBorderRadii(float[] fArr, boolean z) {
        akcr.b(fArr, "borderRadii");
        this.a = true;
        this.f = z;
        if (z) {
            if (this.e == null) {
                this.e = new float[8];
            }
            float[] fArr2 = this.e;
            if (fArr2 == null) {
                akcr.a();
            }
            int length = fArr.length;
            akcr.b(fArr, "receiver$0");
            akcr.b(fArr2, "destination");
            System.arraycopy(fArr, 0, fArr2, 0, length);
        }
    }
}
