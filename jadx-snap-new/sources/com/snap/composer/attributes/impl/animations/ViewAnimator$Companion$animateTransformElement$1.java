package com.snap.composer.attributes.impl.animations;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import defpackage.ajxt;
import defpackage.akbw;
import defpackage.akcr;

public final class ViewAnimator$Companion$animateTransformElement$1 implements AnimatorUpdateListener {
    private /* synthetic */ akbw a;
    private /* synthetic */ View b;

    public ViewAnimator$Companion$animateTransformElement$1(akbw akbw, View view) {
        this.a = akbw;
        this.b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        akbw akbw = this.a;
        View view = this.b;
        akcr.a((Object) valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            akbw.invoke(view, (Float) animatedValue);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Float");
    }
}
