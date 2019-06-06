package com.snap.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.zhg.a;

@Deprecated
public class RoundedImageView extends OptimizedImageView implements RoundedView {
    private static final Paint CLEAR_PAINT = new Paint() {
        {
            setAntiAlias(true);
            setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        }
    };
    private static final Paint CLIPPING_PAINT = new Paint() {
        {
            setAntiAlias(true);
            setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        }
    };
    private static final Paint LAYER_PAINT = new Paint() {
        {
            setAntiAlias(true);
            setXfermode(new PorterDuffXfermode(Mode.SRC_OVER));
        }
    };
    private final Path mClippingPath;
    private final float[] mCornerRadii;
    private final RectF mDrawRectF;
    private boolean mIsCircular;

    public RoundedImageView(Context context) {
        this(context, null);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mClippingPath = new Path();
        this.mDrawRectF = new RectF();
        this.mCornerRadii = new float[8];
        init(context, attributeSet);
    }

    private void addCircle(float f, float f2, float f3) {
        Path path;
        Direction direction;
        if (VERSION.SDK_INT > 26) {
            this.mClippingPath.addRect(this.mDrawRectF, Direction.CW);
            path = this.mClippingPath;
            direction = Direction.CCW;
        } else {
            path = this.mClippingPath;
            direction = Direction.CW;
        }
        path.addCircle(f, f2, f3, direction);
    }

    private void addRoundedRect() {
        Path path;
        RectF rectF;
        float[] fArr;
        Direction direction;
        if (VERSION.SDK_INT > 26) {
            this.mClippingPath.addRect(this.mDrawRectF, Direction.CW);
            path = this.mClippingPath;
            rectF = this.mDrawRectF;
            fArr = this.mCornerRadii;
            direction = Direction.CCW;
        } else {
            path = this.mClippingPath;
            rectF = this.mDrawRectF;
            fArr = this.mCornerRadii;
            direction = Direction.CW;
        }
        path.addRoundRect(rectF, fArr, direction);
    }

    private void drawPath(Canvas canvas) {
        Path path;
        Paint paint;
        if (VERSION.SDK_INT > 26) {
            path = this.mClippingPath;
            paint = CLEAR_PAINT;
        } else {
            path = this.mClippingPath;
            paint = CLIPPING_PAINT;
        }
        canvas.drawPath(path, paint);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.h, 0, 0);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                float[] fArr = this.mCornerRadii;
                float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
                this.mCornerRadii[1] = dimensionPixelSize2;
                fArr[0] = dimensionPixelSize2;
                fArr = this.mCornerRadii;
                float dimensionPixelSize3 = (float) obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
                this.mCornerRadii[3] = dimensionPixelSize3;
                fArr[2] = dimensionPixelSize3;
                fArr = this.mCornerRadii;
                float dimensionPixelSize4 = (float) obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
                this.mCornerRadii[5] = dimensionPixelSize4;
                fArr[4] = dimensionPixelSize4;
                fArr = this.mCornerRadii;
                float dimensionPixelSize5 = (float) obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
                this.mCornerRadii[7] = dimensionPixelSize5;
                fArr[6] = dimensionPixelSize5;
                this.mIsCircular = obtainStyledAttributes.getBoolean(5, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private void paintRoundedness(Canvas canvas) {
        int i = 0;
        Object obj = (isHardwareAccelerated() && getLayerType() == 2) ? 1 : null;
        if (obj == null) {
            i = canvas.saveLayer(this.mDrawRectF, LAYER_PAINT, 31);
        }
        drawPath(canvas);
        if (obj == null) {
            canvas.restoreToCount(i);
        }
    }

    private void refreshClippingPath() {
        this.mClippingPath.reset();
        if (this.mIsCircular) {
            float centerX = this.mDrawRectF.centerX();
            float centerY = this.mDrawRectF.centerY();
            addCircle(centerX, centerY, (float) ((int) Math.min(centerX, centerY)));
            return;
        }
        addRoundedRect();
    }

    private void refreshCorners() {
        refreshClippingPath();
        invalidate();
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        paintRoundedness(canvas);
    }

    public float getCornerRadiusBottomLeft() {
        return this.mCornerRadii[4];
    }

    public float getCornerRadiusBottomRight() {
        return this.mCornerRadii[6];
    }

    public float getCornerRadiusTopLeft() {
        return this.mCornerRadii[0];
    }

    public float getCornerRadiusTopRight() {
        return this.mCornerRadii[2];
    }

    public boolean isCircular() {
        return this.mIsCircular;
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        i2 = getMeasuredHeight();
        if (((int) this.mDrawRectF.right) != i || ((int) this.mDrawRectF.bottom) != i2) {
            this.mDrawRectF.set(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) getMeasuredWidth(), (float) getMeasuredHeight());
            refreshClippingPath();
        }
    }

    public void setCircular(boolean z) {
        this.mIsCircular = z;
        refreshClippingPath();
    }

    public void setCornerRadii(float f) {
        setCornerRadii(f, f, f, f);
    }

    public void setCornerRadii(float f, float f2, float f3, float f4) {
        float[] fArr = this.mCornerRadii;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
        refreshCorners();
    }

    public void setCornerRadiusBottomLeft(float f) {
        float[] fArr = this.mCornerRadii;
        fArr[5] = f;
        fArr[4] = f;
        refreshCorners();
    }

    public void setCornerRadiusBottomRight(float f) {
        float[] fArr = this.mCornerRadii;
        fArr[7] = f;
        fArr[6] = f;
        refreshCorners();
    }

    public void setCornerRadiusTopLeft(float f) {
        float[] fArr = this.mCornerRadii;
        fArr[1] = f;
        fArr[0] = f;
        refreshCorners();
    }

    public void setCornerRadiusTopRight(float f) {
        float[] fArr = this.mCornerRadii;
        fArr[3] = f;
        fArr[2] = f;
        refreshCorners();
    }
}
