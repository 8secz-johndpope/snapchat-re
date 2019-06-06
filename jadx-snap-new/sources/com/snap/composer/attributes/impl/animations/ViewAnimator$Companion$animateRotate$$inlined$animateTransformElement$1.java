package com.snap.composer.attributes.impl.animations;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import defpackage.ajxt;
import defpackage.akcr;

public final class ViewAnimator$Companion$animateRotate$$inlined$animateTransformElement$1 implements AnimatorUpdateListener {
    private /* synthetic */ View a;

    public ViewAnimator$Companion$animateRotate$$inlined$animateTransformElement$1(View view) {
        this.a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.a;
        akcr.a((Object) valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            view.setRotation(((Float) animatedValue).floatValue());
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Float");
    }
}
