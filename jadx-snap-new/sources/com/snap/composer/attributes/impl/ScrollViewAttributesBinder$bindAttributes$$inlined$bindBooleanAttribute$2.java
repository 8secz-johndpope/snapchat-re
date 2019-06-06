package com.snap.composer.attributes.impl;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.views.ComposerScrollView;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.BooleanAttributeHandler;
import defpackage.ajxt;

public final class ScrollViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$2 extends BooleanAttributeHandler {
    private /* synthetic */ ScrollViewAttributesBinder a;
    private /* synthetic */ ScrollViewAttributesBinder b;

    public ScrollViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$2(ScrollViewAttributesBinder scrollViewAttributesBinder, ScrollViewAttributesBinder scrollViewAttributesBinder2) {
        this.a = scrollViewAttributesBinder;
        this.b = scrollViewAttributesBinder2;
    }

    public final void applyAttribute(Object obj, boolean z, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            ComposerScrollView composerScrollView = (ComposerScrollView) view;
            this.a.applyPagingEnabled(composerScrollView, z, (ComposerAnimator) animator);
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
            ComposerScrollView composerScrollView = (ComposerScrollView) view;
            this.b.resetPagingEnabled(composerScrollView, (ComposerAnimator) animator);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
