package com.snap.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.TransparentMaskViewHelper.TransparentMaskView;
import com.snapchat.android.R;
import defpackage.zhg.a;

public class SnapHovaNavBarLayout extends LinearLayout implements TransparentMaskView {
    private final Paint cameraButtonPaint;
    private final float cameraButtonRadiusPixel;
    private final TransparentMaskViewHelper transparentMaskViewHelper;

    public SnapHovaNavBarLayout(Context context) {
        this(context, null);
    }

    public SnapHovaNavBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SnapHovaNavBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.transparentMaskViewHelper = new TransparentMaskViewHelper(this);
        this.cameraButtonRadiusPixel = (float) context.getResources().getDimensionPixelSize(R.dimen.camera_button_radius);
        this.cameraButtonPaint = new Paint();
        this.cameraButtonPaint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.s);
        i = obtainStyledAttributes.getResourceId(0, -1);
        if (i != -1) {
            this.transparentMaskViewHelper.setBackground(context.getResources().getDrawable(i));
        }
        obtainStyledAttributes.recycle();
    }

    public void drawTransparentMask(Canvas canvas) {
        canvas.drawCircle(((float) (getLeft() + getRight())) * 0.5f, MapboxConstants.MINIMUM_ZOOM, this.cameraButtonRadiusPixel, this.cameraButtonPaint);
    }

    public void onDraw(Canvas canvas) {
        this.transparentMaskViewHelper.onDraw(canvas);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.transparentMaskViewHelper.onSizeChanged(i, i2);
    }
}
