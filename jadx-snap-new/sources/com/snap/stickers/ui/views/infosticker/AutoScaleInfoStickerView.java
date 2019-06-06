package com.snap.stickers.ui.views.infosticker;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import defpackage.akcr;

public final class AutoScaleInfoStickerView extends FrameLayout {
    private float a;

    public AutoScaleInfoStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AutoScaleInfoStickerView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.a = 1.0f;
        setClipChildren(false);
        setWillNotDraw(false);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.a == 1.0f) {
            return super.drawChild(canvas, view, j);
        }
        if (view == null || canvas == null) {
            return false;
        }
        canvas.save();
        float measuredWidth = (float) view.getMeasuredWidth();
        float measuredWidth2 = (float) view.getMeasuredWidth();
        float f = this.a;
        measuredWidth = (measuredWidth - (measuredWidth2 * f)) / 2.0f;
        canvas.scale(f, f);
        canvas.translate(measuredWidth, measuredWidth);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            i2 = MeasureSpec.getMode(0);
            int size = MeasureSpec.getSize(0);
            Object childAt = getChildAt(0);
            childAt.measure(i2, size);
            akcr.a(childAt, "child");
            float measuredWidth = (float) childAt.getMeasuredWidth();
            float measuredWidth2 = (float) getMeasuredWidth();
            this.a = measuredWidth > measuredWidth2 ? measuredWidth2 / measuredWidth : 1.0f;
        }
    }
}
