package com.snap.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ScrollView;
import defpackage.zhg.a;

public class ScrollViewWithMaxHeight extends ScrollView {
    public static final int WITHOUT_MAX_HEIGHT_VALUE = -1;
    private int maxHeight;

    public ScrollViewWithMaxHeight(Context context) {
        super(context);
        this.maxHeight = -1;
    }

    public ScrollViewWithMaxHeight(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollViewWithMaxHeight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maxHeight = -1;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.k, 0, 0);
        try {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(0, -1));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        try {
            int size = MeasureSpec.getSize(i2);
            if (this.maxHeight != -1 && size > this.maxHeight) {
                size = this.maxHeight;
            }
            i2 = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            getLayoutParams().height = size;
        } catch (Exception unused) {
        } finally {
            super.onMeasure(i, i2);
        }
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }
}
