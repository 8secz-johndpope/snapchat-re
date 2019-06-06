package com.snap.ui.view.statusbar;

import android.content.Context;
import android.util.AttributeSet;
import com.snap.ui.view.SnapFontTextView;
import defpackage.absj;
import defpackage.akcr;

public final class StatusBarTopMarginSnapFontTextView extends SnapFontTextView {
    private boolean mIncreasedTopMarginByStatusBarHeight;

    public StatusBarTopMarginSnapFontTextView(Context context) {
        akcr.b(context, "context");
        super(context, null);
    }

    public StatusBarTopMarginSnapFontTextView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    public StatusBarTopMarginSnapFontTextView(Context context, AttributeSet attributeSet, int i) {
        akcr.b(context, "context");
        super(context, attributeSet, i);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.mIncreasedTopMarginByStatusBarHeight) {
            absj.a().a(this);
            this.mIncreasedTopMarginByStatusBarHeight = true;
        }
    }
}
