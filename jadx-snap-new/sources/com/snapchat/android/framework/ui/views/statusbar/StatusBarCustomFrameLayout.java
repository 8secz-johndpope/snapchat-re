package com.snapchat.android.framework.ui.views.statusbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import defpackage.abkw.a;
import defpackage.absj;

public class StatusBarCustomFrameLayout extends FrameLayout {
    public StatusBarCustomFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private StatusBarCustomFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        int i = 0;
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, a.h, 0, 0);
            try {
                i = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        if (i != 0) {
            absj.a.a.b(this);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2) + absj.a.a.b(), AudioPlayer.INFINITY_LOOP_COUNT);
        super.onMeasure(i, i2);
        setMeasuredDimension(i, i2);
    }
}
