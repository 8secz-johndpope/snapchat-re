package com.snap.composer.attributes.impl;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.BooleanAttributeHandler;
import defpackage.ajxt;

public final class ViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$1 extends BooleanAttributeHandler {
    private /* synthetic */ ViewAttributesBinder a;
    private /* synthetic */ ViewAttributesBinder b;

    public ViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$1(ViewAttributesBinder viewAttributesBinder, ViewAttributesBinder viewAttributesBinder2) {
        this.a = viewAttributesBinder;
        this.b = viewAttributesBinder2;
    }

    public final void applyAttribute(Object obj, boolean z, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            this.a.applyTouchEnabled(view, z, (ComposerAnimator) animator);
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
            this.b.resetTouchEnabled(view, (ComposerAnimator) animator);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
