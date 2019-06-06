package com.snap.ui.view.stackdraw;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View.MeasureSpec;
import com.snap.ui.view.stackdraw.StackDrawLayout.LayoutParams;
import com.snap.ui.view.stackdraw.gesture.StackDrawLayoutTouchable;
import defpackage.akcr;

public abstract class ItemHolder implements StackDrawLayoutTouchable {
    private boolean boundsChanged = true;
    private final StackDrawLayout container;
    private Rect itemBounds = new Rect();
    private LayoutParams layoutParams;
    private int measuredHeight;
    private int measuredWidth;
    private int suggestedMinimumHeight;
    private int suggestedMinimumWidth;
    private int visibility;

    public ItemHolder(StackDrawLayout stackDrawLayout, LayoutParams layoutParams) {
        akcr.b(stackDrawLayout, "container");
        akcr.b(layoutParams, "layoutParams");
        this.container = stackDrawLayout;
        this.layoutParams = layoutParams;
        this.measuredWidth = -1;
        this.measuredHeight = -1;
    }

    private final void setMeasuredHeight(int i) {
        this.measuredHeight = i;
    }

    private final void setMeasuredWidth(int i) {
        this.measuredWidth = i;
    }

    public abstract void draw(Canvas canvas);

    public final int getBottomMargin() {
        return this.layoutParams.getBottomMargin();
    }

    public final boolean getBoundsChanged() {
        return this.boundsChanged;
    }

    /* Access modifiers changed, original: protected|final */
    public final StackDrawLayout getContainer() {
        return this.container;
    }

    public final int getDefaultSize(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || (mode != 0 && mode == AudioPlayer.INFINITY_LOOP_COUNT)) ? MeasureSpec.getSize(i2) : i;
    }

    public final int getEndMargin() {
        return this.layoutParams.getEndMargin();
    }

    public final int getGravity() {
        return this.layoutParams.getGravity();
    }

    public final int getHeight() {
        return this.layoutParams.getHeight();
    }

    public Rect getItemBounds() {
        return this.itemBounds;
    }

    public final LayoutParams getLayoutParams() {
        return this.layoutParams;
    }

    public final int getMeasuredHeight() {
        return this.measuredHeight;
    }

    public final int getMeasuredState() {
        return (this.measuredWidth & -16777216) | ((this.measuredHeight >> 16) & -256);
    }

    public final int getMeasuredWidth() {
        return this.measuredWidth;
    }

    public final int getStartMargin() {
        return this.layoutParams.getStartMargin();
    }

    public int getSuggestedMinimumHeight() {
        return this.suggestedMinimumHeight;
    }

    public int getSuggestedMinimumWidth() {
        return this.suggestedMinimumWidth;
    }

    public final int getTopMargin() {
        return this.layoutParams.getTopMargin();
    }

    public final int getVisibility() {
        return this.visibility;
    }

    public final int getWidth() {
        return this.layoutParams.getWidth();
    }

    public final void invalidate() {
        this.container.invalidate();
    }

    public final void measure(int i, int i2) {
        onMeasure(i, i2);
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    public final String printSpec() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.layoutParams.getConsumeSpace().name());
        stringBuilder.append(": width: ");
        stringBuilder.append(this.measuredWidth);
        stringBuilder.append(", height: ");
        stringBuilder.append(this.measuredHeight);
        stringBuilder.append(", occupied width: ");
        stringBuilder.append((this.measuredWidth + this.layoutParams.getStartMargin()) + this.layoutParams.getEndMargin());
        stringBuilder.append(", occupied height: ");
        stringBuilder.append((this.measuredHeight + this.layoutParams.getTopMargin()) + this.layoutParams.getBottomMargin());
        return stringBuilder.toString();
    }

    public final void requestLayout() {
        this.container.requestLayout();
    }

    public final void setBottomMargin(int i) {
        if (this.layoutParams.getBottomMargin() != i) {
            this.layoutParams.setBottomMargin(i);
            requestLayout();
            invalidate();
        }
    }

    public final void setBoundsChanged(boolean z) {
        this.boundsChanged = z;
    }

    public final void setEndMargin(int i) {
        if (this.layoutParams.getEndMargin() != i) {
            this.layoutParams.setEndMargin(i);
            requestLayout();
            invalidate();
        }
    }

    public final void setGravity(int i) {
        if (this.layoutParams.getGravity() != i) {
            this.layoutParams.setGravity(i);
            requestLayout();
            invalidate();
        }
    }

    public final void setHeight(int i) {
        if (this.layoutParams.getHeight() != i) {
            this.layoutParams.setHeight(i);
            requestLayout();
            invalidate();
        }
    }

    public void setItemBounds(Rect rect) {
        akcr.b(rect, "<set-?>");
        this.itemBounds = rect;
    }

    public final void setLayoutParams(LayoutParams layoutParams) {
        akcr.b(layoutParams, "value");
        if ((akcr.a(this.layoutParams, (Object) layoutParams) ^ 1) != 0) {
            this.layoutParams = layoutParams;
            requestLayout();
            invalidate();
        }
    }

    public final void setMeasuredDimension(int i, int i2) {
        this.measuredWidth = i;
        this.measuredHeight = i2;
    }

    public final void setStartMargin(int i) {
        if (this.layoutParams.getStartMargin() != i) {
            this.layoutParams.setStartMargin(i);
            requestLayout();
            invalidate();
        }
    }

    public void setSuggestedMinimumHeight(int i) {
        this.suggestedMinimumHeight = i;
    }

    public void setSuggestedMinimumWidth(int i) {
        this.suggestedMinimumWidth = i;
    }

    public final void setTopMargin(int i) {
        if (this.layoutParams.getTopMargin() != i) {
            this.layoutParams.setTopMargin(i);
            requestLayout();
            invalidate();
        }
    }

    public final void setVisibility(int i) {
        if (this.visibility != i) {
            this.visibility = i;
            this.container.invalidate();
        }
    }

    public final void setWidth(int i) {
        if (this.layoutParams.getWidth() != i) {
            this.layoutParams.setWidth(i);
            requestLayout();
            invalidate();
        }
    }
}
