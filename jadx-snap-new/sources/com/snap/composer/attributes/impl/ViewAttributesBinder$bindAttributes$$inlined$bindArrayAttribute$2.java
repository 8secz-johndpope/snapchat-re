package com.snap.composer.attributes.impl;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.exceptions.AttributeError;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.UntypedAttributeHandler;
import defpackage.ajxt;

public final class ViewAttributesBinder$bindAttributes$$inlined$bindArrayAttribute$2 extends UntypedAttributeHandler {
    private /* synthetic */ ViewAttributesBinder a;
    private /* synthetic */ ViewAttributesBinder b;

    public ViewAttributesBinder$bindAttributes$$inlined$bindArrayAttribute$2(ViewAttributesBinder viewAttributesBinder, ViewAttributesBinder viewAttributesBinder2) {
        this.a = viewAttributesBinder;
        this.b = viewAttributesBinder2;
    }

    public final void applyAttribute(Object obj, Object obj2, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            ComposerAnimator composerAnimator = (ComposerAnimator) animator;
            if (obj2 instanceof Object[]) {
                this.b.applyBorder(view, (Object[]) obj2, composerAnimator);
                return;
            }
            throw new AttributeError("Not an array");
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }

    public final void resetAttribute(Object obj, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            this.a.resetBorder(view, (ComposerAnimator) animator);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
