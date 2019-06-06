package com.snap.composer.attributes.impl;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.views.ComposerImageView;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.UntypedAttributeHandler;
import defpackage.ajxt;

public final class ImageViewAttributesBinder$bindAttributes$$inlined$bindCompositeAttribute$1 extends UntypedAttributeHandler {
    private /* synthetic */ ImageViewAttributesBinder a;
    private /* synthetic */ ImageViewAttributesBinder b;

    public ImageViewAttributesBinder$bindAttributes$$inlined$bindCompositeAttribute$1(ImageViewAttributesBinder imageViewAttributesBinder, ImageViewAttributesBinder imageViewAttributesBinder2) {
        this.a = imageViewAttributesBinder;
        this.b = imageViewAttributesBinder2;
    }

    public final void applyAttribute(Object obj, Object obj2, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            ComposerImageView composerImageView = (ComposerImageView) view;
            this.a.applySrcOnLoad(composerImageView, obj2, (ComposerAnimator) animator);
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
            ComposerImageView composerImageView = (ComposerImageView) view;
            this.b.resetSrcOnLoad(composerImageView, (ComposerAnimator) animator);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
