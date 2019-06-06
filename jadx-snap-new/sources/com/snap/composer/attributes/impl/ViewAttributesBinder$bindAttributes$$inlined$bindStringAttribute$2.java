package com.snap.composer.attributes.impl;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.StringAttributeHandler;
import defpackage.ajxt;
import defpackage.akcr;

public final class ViewAttributesBinder$bindAttributes$$inlined$bindStringAttribute$2 extends StringAttributeHandler {
    private /* synthetic */ ViewAttributesBinder a;
    private /* synthetic */ ViewAttributesBinder b;

    public ViewAttributesBinder$bindAttributes$$inlined$bindStringAttribute$2(ViewAttributesBinder viewAttributesBinder, ViewAttributesBinder viewAttributesBinder2) {
        this.a = viewAttributesBinder;
        this.b = viewAttributesBinder2;
    }

    public final void applyAttribute(Object obj, String str, Animator animator) {
        akcr.b(str, "p1");
        if (obj != null) {
            View view = (View) obj;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            this.a.applyOverflow(view, str, (ComposerAnimator) animator);
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
            this.b.resetOverflow(view, (ComposerAnimator) animator);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
