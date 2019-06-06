package com.snap.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class FrameContainerView extends FrameLayout {
    private static final int BORDER_WIDTH_DP = 1;
    private static final int CORNER_RADIUS_DP = 6;
    private final Paint mBorderPaint = new Paint();
    private final Path mBorderPath = new Path();
    private int mBorderWidth;
    private int mCornerRadius;
    private boolean mFramingEnabled;
    private final Path mOuterCrop = new Path();
    private final RectF mRectF = new RectF();
    private boolean mStroke = true;

    public FrameContainerView(Context context) {
        super(context);
    }

    public FrameContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FrameContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean canScrollHorizontally(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).canScrollHorizontally(i)) {
                return true;
            }
        }
        return super.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).canScrollVertically(i)) {
                return true;
            }
        }
        return super.canScrollVertically(i);
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.mFramingEnabled) {
            this.mOuterCrop.reset();
            this.mBorderPath.reset();
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            this.mRectF.set(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) width, (float) height);
            Path path = this.mOuterCrop;
            RectF rectF = this.mRectF;
            int i = this.mCornerRadius;
            path.addRoundRect(rectF, (float) i, (float) i, Direction.CW);
            this.mOuterCrop.setFillType(FillType.WINDING);
            RectF rectF2 = this.mRectF;
            int i2 = this.mBorderWidth;
            rectF2.set((float) i2, (float) i2, (float) (width - i2), (float) (height - i2));
            Path path2 = this.mBorderPath;
            RectF rectF3 = this.mRectF;
            int i3 = this.mCornerRadius;
            path2.addRoundRect(rectF3, (float) i3, (float) i3, Direction.CW);
            this.mBorderPath.setFillType(FillType.INVERSE_WINDING);
            canvas.clipPath(this.mOuterCrop);
            super.dispatchDraw(canvas);
            if (this.mStroke) {
                canvas.drawPath(this.mBorderPath, this.mBorderPaint);
            }
            return;
        }
        super.dispatchDraw(canvas);
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    public void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
        /*
        r3 = this;
        r4 = r3.getChildCount();
        r5 = 0;
        r6 = 0;
    L_0x0006:
        if (r6 >= r4) goto L_0x0082;
    L_0x0008:
        r7 = r3.getChildAt(r6);
        r8 = r7.getVisibility();
        r0 = 8;
        if (r8 == r0) goto L_0x007f;
    L_0x0014:
        r8 = r7.getLayoutParams();
        r8 = (android.widget.FrameLayout.LayoutParams) r8;
        r0 = r7.getMeasuredHeight();
        r1 = r3.getMeasuredHeight();
        if (r0 >= r1) goto L_0x0030;
    L_0x0024:
        r0 = r3.getMeasuredHeight();
        r1 = r7.getMeasuredHeight();
        r0 = r0 - r1;
        r0 = r0 / 2;
        goto L_0x0047;
    L_0x0030:
        r0 = r8.gravity;
        r0 = r0 & 112;
        r1 = 16;
        if (r0 == r1) goto L_0x0024;
    L_0x0038:
        r1 = 80;
        if (r0 == r1) goto L_0x003e;
    L_0x003c:
        r0 = 0;
        goto L_0x0047;
    L_0x003e:
        r0 = r3.getMeasuredHeight();
        r1 = r7.getMeasuredHeight();
        r0 = r0 - r1;
    L_0x0047:
        r1 = r7.getMeasuredWidth();
        r2 = r3.getMeasuredWidth();
        if (r1 >= r2) goto L_0x005d;
    L_0x0051:
        r8 = r3.getMeasuredWidth();
        r1 = r7.getMeasuredWidth();
        r8 = r8 - r1;
        r8 = r8 / 2;
        goto L_0x0072;
    L_0x005d:
        r8 = r8.gravity;
        r8 = r8 & 7;
        r1 = 1;
        if (r8 == r1) goto L_0x0051;
    L_0x0064:
        r1 = 5;
        if (r8 == r1) goto L_0x0069;
    L_0x0067:
        r8 = 0;
        goto L_0x0072;
    L_0x0069:
        r8 = r3.getMeasuredWidth();
        r1 = r7.getMeasuredWidth();
        r8 = r8 - r1;
    L_0x0072:
        r1 = r7.getMeasuredWidth();
        r1 = r1 + r8;
        r2 = r7.getMeasuredHeight();
        r2 = r2 + r0;
        r7.layout(r8, r0, r1, r2);
    L_0x007f:
        r6 = r6 + 1;
        goto L_0x0006;
    L_0x0082:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.FrameContainerView.onLayout(boolean, int, int, int, int):void");
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i4 = layoutParams.width == -2 ? 0 : MeasureSpec.getMode(layoutParams.width) == AudioPlayer.INFINITY_LOOP_COUNT ? layoutParams.width : i;
                int i5 = layoutParams.height == -2 ? 0 : MeasureSpec.getMode(layoutParams.height) == AudioPlayer.INFINITY_LOOP_COUNT ? layoutParams.height : i2;
                childAt.measure(i4, i5);
            }
        }
        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
    }

    public void setFramingEnabled(boolean z) {
        if (this.mFramingEnabled != z) {
            this.mFramingEnabled = z;
            if (this.mFramingEnabled) {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                this.mBorderWidth = (int) (displayMetrics.density * 1.0f);
                this.mCornerRadius = (int) (displayMetrics.density * 6.0f);
                this.mBorderPaint.setARGB(255, 234, 237, 239);
                this.mBorderPaint.setStrokeWidth((float) this.mBorderWidth);
            } else {
                setPadding(0, 0, 0, 0);
            }
            invalidate();
        }
    }

    public void setStroke(boolean z) {
        this.mStroke = z;
    }
}
