package com.snap.ui.view.scrollbar;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import defpackage.akcr;

public final class SnapScrollBarIndicator$hideIndicatorTextView$animation$1 extends TranslateAnimation {
    final /* synthetic */ float $fromX;
    final /* synthetic */ float $toX;
    final /* synthetic */ SnapScrollBarIndicator this$0;

    SnapScrollBarIndicator$hideIndicatorTextView$animation$1(SnapScrollBarIndicator snapScrollBarIndicator, float f, float f2, int i, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
        this.this$0 = snapScrollBarIndicator;
        this.$fromX = f;
        this.$toX = f2;
        super(i, f3, i2, f4, i3, f5, i4, f6);
    }

    /* Access modifiers changed, original: protected|final */
    public final void applyTransformation(float f, Transformation transformation) {
        akcr.b(transformation, "t");
        super.applyTransformation(f, transformation);
        SnapScrollBarIndicator snapScrollBarIndicator = this.this$0;
        snapScrollBarIndicator.currentShownFraction = (1.0f - f) * snapScrollBarIndicator.targetShownFraction;
    }
}
