package com.snap.composer.attributes.impl;

import android.view.View;
import com.snap.composer.attributes.conversions.ColorConversions;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.views.ComposerSpinnerView;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.ColorAttributeHandler;
import defpackage.ajxt;

public final class SpinnerViewAttributesBinder$bindAttributes$$inlined$bindColorAttribute$1 extends ColorAttributeHandler {
    private /* synthetic */ SpinnerViewAttributesBinder a;
    private /* synthetic */ SpinnerViewAttributesBinder b;

    public SpinnerViewAttributesBinder$bindAttributes$$inlined$bindColorAttribute$1(SpinnerViewAttributesBinder spinnerViewAttributesBinder, SpinnerViewAttributesBinder spinnerViewAttributesBinder2) {
        this.a = spinnerViewAttributesBinder;
        this.b = spinnerViewAttributesBinder2;
    }

    public final void applyAttribute(Object obj, long j, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            int fromRGBA = ColorConversions.Companion.fromRGBA(j);
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            ComposerSpinnerView composerSpinnerView = (ComposerSpinnerView) view;
            this.a.applyColor(composerSpinnerView, fromRGBA, (ComposerAnimator) animator);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }

    public final void resetAttribute(Object obj, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            ComposerSpinnerView composerSpinnerView = (ComposerSpinnerView) view;
            this.b.resetColor(composerSpinnerView, (ComposerAnimator) animator);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
