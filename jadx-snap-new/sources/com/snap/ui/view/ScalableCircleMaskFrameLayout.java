package com.snap.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class ScalableCircleMaskFrameLayout extends FrameLayout {
    private float mCircleBaseScale;
    private float mCircleCenterX;
    private float mCircleCenterY;
    private final Path mCirclePath;
    private float mCircleRelativeScale;
    private boolean mEnableCircleMask;

    public ScalableCircleMaskFrameLayout(Context context) {
        super(context);
        this.mCirclePath = new Path();
        this.mCircleCenterX = MapboxConstants.MINIMUM_ZOOM;
        this.mCircleCenterY = MapboxConstants.MINIMUM_ZOOM;
        this.mCircleBaseScale = 1.0f;
        this.mCircleRelativeScale = 1.0f;
        this.mEnableCircleMask = false;
    }

    public ScalableCircleMaskFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScalableCircleMaskFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCirclePath = new Path();
        this.mCircleCenterX = MapboxConstants.MINIMUM_ZOOM;
        this.mCircleCenterY = MapboxConstants.MINIMUM_ZOOM;
        this.mCircleBaseScale = 1.0f;
        this.mCircleRelativeScale = 1.0f;
        this.mEnableCircleMask = false;
    }

    private void updateCirclePath() {
        float min = (Math.min(this.mCircleCenterX, this.mCircleCenterY) * this.mCircleBaseScale) * this.mCircleRelativeScale;
        this.mCirclePath.reset();
        this.mCirclePath.addCircle(this.mCircleCenterX, this.mCircleCenterY, min, Direction.CW);
    }

    public void clearCircleBaseScale() {
        this.mCircleBaseScale = 1.0f;
        this.mEnableCircleMask = false;
        this.mCirclePath.reset();
        invalidate();
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.mEnableCircleMask) {
            canvas.clipPath(this.mCirclePath);
        }
        super.dispatchDraw(canvas);
    }

    public float getCircleRelativeScale() {
        return this.mCircleRelativeScale;
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mCircleCenterX = (float) (i / 2);
        this.mCircleCenterY = (float) (i2 / 2);
        if (this.mEnableCircleMask) {
            updateCirclePath();
        }
    }

    public void setCircleBaseScale(float f) {
        this.mCircleBaseScale = f;
        this.mEnableCircleMask = true;
    }

    public void setCircleRelativeScale(float f) {
        this.mCircleRelativeScale = f;
        if (this.mEnableCircleMask) {
            updateCirclePath();
            invalidate();
        }
    }
}
