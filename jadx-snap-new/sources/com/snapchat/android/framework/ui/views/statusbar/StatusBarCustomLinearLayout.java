package com.snapchat.android.framework.ui.views.statusbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import defpackage.abkw.a;
import defpackage.absj;
import defpackage.abuv;

public class StatusBarCustomLinearLayout extends abuv {
    public StatusBarCustomLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private StatusBarCustomLinearLayout(Context context, AttributeSet attributeSet, byte b) {
        b = (byte) 0;
        super(context, attributeSet, (byte) 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, a.h, 0, 0);
            try {
                b = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        if (b != (byte) 0) {
            absj.a.a.b(this);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2) + absj.a.a.b(), AudioPlayer.INFINITY_LOOP_COUNT));
    }
}
