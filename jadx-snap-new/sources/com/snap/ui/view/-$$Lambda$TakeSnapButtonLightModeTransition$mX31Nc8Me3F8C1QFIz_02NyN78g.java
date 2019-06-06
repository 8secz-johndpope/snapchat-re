package com.snap.ui.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$TakeSnapButtonLightModeTransition$mX31Nc8Me3F8C1QFIz_02NyN78g implements AnimatorUpdateListener {
    private final /* synthetic */ TakeSnapButton f$0;

    public /* synthetic */ -$$Lambda$TakeSnapButtonLightModeTransition$mX31Nc8Me3F8C1QFIz_02NyN78g(TakeSnapButton takeSnapButton) {
        this.f$0 = takeSnapButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.setCameraButtonBorderAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
