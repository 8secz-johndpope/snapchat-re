package com.snap.composer.attributes.impl;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.BorderAttributeHandler;
import defpackage.ajxt;

public final class ViewAttributesBinder$bindAttributes$$inlined$bindCornersAttribute$1 extends BorderAttributeHandler {
    private /* synthetic */ ViewAttributesBinder a;
    private /* synthetic */ ViewAttributesBinder b;

    public ViewAttributesBinder$bindAttributes$$inlined$bindCornersAttribute$1(ViewAttributesBinder viewAttributesBinder, ViewAttributesBinder viewAttributesBinder2) {
        this.a = viewAttributesBinder;
        this.b = viewAttributesBinder2;
    }

    public final void applyAttribute(Object obj, double d, boolean z, double d2, boolean z2, double d3, boolean z3, double d4, boolean z4, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            float f = (float) d;
            float f2 = (float) d2;
            float f3 = (float) d3;
            float f4 = (float) d4;
            Animator animator2 = animator;
            if (!(animator2 instanceof ComposerAnimator)) {
                animator2 = null;
            }
            this.a.setBorderRadius(view, f, z, f2, z2, f3, z3, f4, z4, (ComposerAnimator) animator2);
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
            this.b.resetBorderRadius(view, (ComposerAnimator) animator);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
