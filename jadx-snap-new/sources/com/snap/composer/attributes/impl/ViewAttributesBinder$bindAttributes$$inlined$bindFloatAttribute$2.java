package com.snap.composer.attributes.impl;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.DoubleAttributeHandler;
import defpackage.ajxt;

public final class ViewAttributesBinder$bindAttributes$$inlined$bindFloatAttribute$2 extends DoubleAttributeHandler {
    private /* synthetic */ ViewAttributesBinder a;
    private /* synthetic */ ViewAttributesBinder b;

    public ViewAttributesBinder$bindAttributes$$inlined$bindFloatAttribute$2(ViewAttributesBinder viewAttributesBinder, ViewAttributesBinder viewAttributesBinder2) {
        this.a = viewAttributesBinder;
        this.b = viewAttributesBinder2;
    }

    public final void applyAttribute(Object obj, double d, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            float f = (float) d;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            ViewAttributesBinder.access$applyElevation(this.a, view, f, (ComposerAnimator) animator);
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
            ViewAttributesBinder.access$resetElevation(this.b, view, (ComposerAnimator) animator);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
