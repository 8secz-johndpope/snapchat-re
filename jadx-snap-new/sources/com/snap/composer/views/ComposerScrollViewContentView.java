package com.snap.composer.views;

import android.content.Context;
import defpackage.akcr;

public final class ComposerScrollViewContentView extends ComposerView {
    private int a;
    private int b;

    public ComposerScrollViewContentView(Context context) {
        akcr.b(context, "context");
        super(context);
    }

    public final int getContentHeight() {
        return this.b;
    }

    public final int getContentWidth() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.a, this.b);
    }

    public final void setContentSize(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!isInLayout()) {
            requestLayout();
        }
    }
}
