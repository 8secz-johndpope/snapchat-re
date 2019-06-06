package com.snap.bitmoji.ui.avatar.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import defpackage.akcr;
import defpackage.ddc.a;

public final class GenderPickerRatioLayout extends FrameLayout {
    private boolean a;

    public GenderPickerRatioLayout(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a);
            try {
                this.a = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        double d;
        if (this.a) {
            i = MeasureSpec.getSize(i);
            d = (double) i;
            Double.isNaN(d);
            i2 = (int) (d / 0.75d);
        } else {
            i2 = MeasureSpec.getSize(i2);
            d = (double) i2;
            Double.isNaN(d);
            i = (int) (d * 0.75d);
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(i, AudioPlayer.INFINITY_LOOP_COUNT), MeasureSpec.makeMeasureSpec(i2, AudioPlayer.INFINITY_LOOP_COUNT));
    }
}
