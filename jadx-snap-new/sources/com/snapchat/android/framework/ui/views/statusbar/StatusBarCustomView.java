package com.snapchat.android.framework.ui.views.statusbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import defpackage.abkw.a;
import defpackage.absj;

public class StatusBarCustomView extends View {
    private final int a;

    public StatusBarCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = a(attributeSet);
    }

    private int a(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return 0;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, a.i, 0, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            return dimensionPixelSize;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(i, MeasureSpec.makeMeasureSpec(this.a + absj.a.a.b(), AudioPlayer.INFINITY_LOOP_COUNT));
    }
}
