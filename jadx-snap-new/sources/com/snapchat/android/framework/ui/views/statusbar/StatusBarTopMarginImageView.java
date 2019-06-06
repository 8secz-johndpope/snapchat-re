package com.snapchat.android.framework.ui.views.statusbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.absj.a;

public class StatusBarTopMarginImageView extends ImageView {
    private boolean a = false;
    private boolean b = false;

    public StatusBarTopMarginImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public boolean hasOverlappingRendering() {
        return super.hasOverlappingRendering();
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
