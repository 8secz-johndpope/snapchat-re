package com.snapchat.android.framework.ui.views.statusbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.absj.a;

public class StatusBarTopMarginFrameLayout extends FrameLayout {
    private boolean a = false;

    public StatusBarTopMarginFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.a) {
            a.a.a(this);
            this.a = true;
        }
    }
}
