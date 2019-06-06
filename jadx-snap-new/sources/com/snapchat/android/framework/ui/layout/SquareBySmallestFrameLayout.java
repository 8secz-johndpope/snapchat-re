package com.snapchat.android.framework.ui.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class SquareBySmallestFrameLayout extends FrameLayout {
    public SquareBySmallestFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        i = Math.min(i, i2);
        super.onMeasure(i, i);
    }
}
