package com.snap.cognac.internal.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$CognacWaveformView$0oPWvjslxBMqyO2npcP23k-IZT4 implements AnimatorUpdateListener {
    private final /* synthetic */ CognacWaveformView f$0;

    public /* synthetic */ -$$Lambda$CognacWaveformView$0oPWvjslxBMqyO2npcP23k-IZT4(CognacWaveformView cognacWaveformView) {
        this.f$0 = cognacWaveformView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.b(valueAnimator);
    }
}
