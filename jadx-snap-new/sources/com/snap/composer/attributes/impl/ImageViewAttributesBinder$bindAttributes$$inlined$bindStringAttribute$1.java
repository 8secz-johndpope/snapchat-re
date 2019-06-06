package com.snap.composer.attributes.impl;

import android.view.View;
import android.widget.ImageView;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.StringAttributeHandler;
import defpackage.ajxt;
import defpackage.akcr;

public final class ImageViewAttributesBinder$bindAttributes$$inlined$bindStringAttribute$1 extends StringAttributeHandler {
    private /* synthetic */ ImageViewAttributesBinder a;
    private /* synthetic */ ImageViewAttributesBinder b;

    public ImageViewAttributesBinder$bindAttributes$$inlined$bindStringAttribute$1(ImageViewAttributesBinder imageViewAttributesBinder, ImageViewAttributesBinder imageViewAttributesBinder2) {
        this.a = imageViewAttributesBinder;
        this.b = imageViewAttributesBinder2;
    }

    public final void applyAttribute(Object obj, String str, Animator animator) {
        akcr.b(str, "p1");
        if (obj != null) {
            View view = (View) obj;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            ImageView imageView = (ImageView) view;
            this.a.applyObjectFit(imageView, str, (ComposerAnimator) animator);
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
            ImageView imageView = (ImageView) view;
            this.b.resetObjectFit(imageView, (ComposerAnimator) animator);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
