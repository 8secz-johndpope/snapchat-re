package com.snap.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.kb;

public class RoundedCornerFrameLayout extends FrameLayout {
    private Path mCornerRadiusPath;
    private int mCornerRadiusPx;
    private boolean mCornerRadiusPxBottomLeft;
    private boolean mCornerRadiusPxBottomRight;
    private boolean mCornerRadiusPxTopLeft;
    private boolean mCornerRadiusPxTopRight;
    private RectF mCornerRadiusRect;

    public RoundedCornerFrameLayout(Context context) {
        this(context, null);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private boolean hasCornerRadiusChanged(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.mCornerRadiusPx == i) {
            if (this.mCornerRadiusPxTopLeft == (z5 ? z2 : z)) {
                boolean z6 = this.mCornerRadiusPxTopRight;
                if (!z5) {
                    z = z2;
                }
                if (z6 == z) {
                    if (this.mCornerRadiusPxBottomLeft == (z5 ? z3 : z4)) {
                        z6 = this.mCornerRadiusPxBottomRight;
                        if (z5) {
                            z3 = z4;
                        }
                        if (z6 == z3) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.mCornerRadiusRect != null) {
            if (this.mCornerRadiusPath == null) {
                this.mCornerRadiusPath = new Path();
                Path path = this.mCornerRadiusPath;
                int width = (int) this.mCornerRadiusRect.width();
                int height = (int) this.mCornerRadiusRect.height();
                int i = this.mCornerRadiusPx;
                boolean z = this.mCornerRadiusPxTopLeft;
                boolean z2 = this.mCornerRadiusPxTopRight;
                boolean z3 = this.mCornerRadiusPxBottomLeft;
                boolean z4 = this.mCornerRadiusPxBottomRight;
                int i2 = i * 2;
                width -= i2;
                height -= i2;
                path.reset();
                float f = (float) i;
                path.moveTo(MapboxConstants.MINIMUM_ZOOM, f);
                if (z) {
                    float f2 = (float) (-i);
                    path.rQuadTo(MapboxConstants.MINIMUM_ZOOM, f2, f, f2);
                } else {
                    path.rLineTo(MapboxConstants.MINIMUM_ZOOM, (float) (-i));
                    path.rLineTo(f, MapboxConstants.MINIMUM_ZOOM);
                }
                path.rLineTo((float) width, MapboxConstants.MINIMUM_ZOOM);
                if (z2) {
                    path.rQuadTo(f, MapboxConstants.MINIMUM_ZOOM, f, f);
                } else {
                    path.rLineTo(f, MapboxConstants.MINIMUM_ZOOM);
                    path.rLineTo(MapboxConstants.MINIMUM_ZOOM, f);
                }
                path.rLineTo(MapboxConstants.MINIMUM_ZOOM, (float) height);
                if (z4) {
                    path.rQuadTo(MapboxConstants.MINIMUM_ZOOM, f, (float) (-i), f);
                } else {
                    path.rLineTo(MapboxConstants.MINIMUM_ZOOM, f);
                    path.rLineTo((float) (-i), MapboxConstants.MINIMUM_ZOOM);
                }
                path.rLineTo((float) (-width), MapboxConstants.MINIMUM_ZOOM);
                float f3;
                if (z3) {
                    f3 = (float) (-i);
                    path.rQuadTo(f3, MapboxConstants.MINIMUM_ZOOM, f3, f3);
                } else {
                    f3 = (float) (-i);
                    path.rLineTo(f3, MapboxConstants.MINIMUM_ZOOM);
                    path.rLineTo(MapboxConstants.MINIMUM_ZOOM, f3);
                }
                path.rLineTo(MapboxConstants.MINIMUM_ZOOM, (float) (-height));
                path.close();
            }
            int save = canvas.save();
            canvas.clipPath(this.mCornerRadiusPath);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.dispatchDraw(canvas);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.mCornerRadiusRect;
        if (rectF != null) {
            rectF.set(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) getWidth(), (float) getHeight());
            this.mCornerRadiusPath = null;
        }
    }

    public void setCornerRadius(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        if (i <= 0 || !(z || z2 || z4 || z3)) {
            this.mCornerRadiusPxTopLeft = false;
            this.mCornerRadiusPxTopRight = false;
            this.mCornerRadiusPxBottomRight = false;
            this.mCornerRadiusPxBottomLeft = false;
            this.mCornerRadiusRect = null;
            this.mCornerRadiusPath = null;
            return;
        }
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            z5 = true;
        }
        Boolean valueOf = Boolean.valueOf(z5);
        if (hasCornerRadiusChanged(i, z, z2, z3, z4, valueOf.booleanValue())) {
            this.mCornerRadiusPx = i;
            this.mCornerRadiusPxTopLeft = valueOf.booleanValue() ? z2 : z;
            if (!valueOf.booleanValue()) {
                z = z2;
            }
            this.mCornerRadiusPxTopRight = z;
            this.mCornerRadiusPxBottomLeft = valueOf.booleanValue() ? z3 : z4;
            if (valueOf.booleanValue()) {
                z3 = z4;
            }
            this.mCornerRadiusPxBottomRight = z3;
            this.mCornerRadiusPath = null;
            this.mCornerRadiusRect = new RectF();
            if (kb.a.q(this)) {
                this.mCornerRadiusRect.set(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) getWidth(), (float) getHeight());
            }
        }
    }
}
