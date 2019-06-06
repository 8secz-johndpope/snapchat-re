package com.snap.ui.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$TakeSnapButtonLightModeTransition$QG10OjxGsJFqG2u7nZSBM01HCVk implements AnimatorUpdateListener {
    private final /* synthetic */ TakeSnapButton f$0;
    private final /* synthetic */ ColorStateList f$1;

    public /* synthetic */ -$$Lambda$TakeSnapButtonLightModeTransition$QG10OjxGsJFqG2u7nZSBM01HCVk(TakeSnapButton takeSnapButton, ColorStateList colorStateList) {
        this.f$0 = takeSnapButton;
        this.f$1 = colorStateList;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.setCameraButtonTint(this.f$1.withAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
    }
}
