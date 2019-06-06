package com.snapchat.android.framework.ui.views.statusbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import defpackage.absj.a;

public class StatusBarTopMarginRelativeLayout extends RelativeLayout {
    private boolean a = false;

    public StatusBarTopMarginRelativeLayout(Context context, AttributeSet attributeSet) {
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
