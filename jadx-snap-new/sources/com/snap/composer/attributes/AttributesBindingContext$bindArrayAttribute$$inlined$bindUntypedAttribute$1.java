package com.snap.composer.attributes;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.exceptions.AttributeError;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.UntypedAttributeHandler;
import defpackage.ajxt;
import defpackage.akbw;
import defpackage.akca;

public final class AttributesBindingContext$bindArrayAttribute$$inlined$bindUntypedAttribute$1 extends UntypedAttributeHandler {
    private /* synthetic */ akbw a;
    private /* synthetic */ akca b;

    public AttributesBindingContext$bindArrayAttribute$$inlined$bindUntypedAttribute$1(akbw akbw, akca akca) {
        this.a = akbw;
        this.b = akca;
    }

    public final void applyAttribute(Object obj, Object obj2, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            ComposerAnimator composerAnimator = (ComposerAnimator) animator;
            if (obj2 instanceof Object[]) {
                this.b.invoke(view, (Object[]) obj2, composerAnimator);
                return;
            }
            throw new AttributeError("Not an array");
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }

    public final void resetAttribute(Object obj, Animator animator) {
        akbw akbw = this.a;
        if (obj != null) {
            View view = (View) obj;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            akbw.invoke(view, (ComposerAnimator) animator);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
