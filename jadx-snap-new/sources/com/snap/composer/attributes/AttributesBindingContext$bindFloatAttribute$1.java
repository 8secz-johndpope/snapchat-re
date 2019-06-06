package com.snap.composer.attributes;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.DoubleAttributeHandler;
import defpackage.ajxt;
import defpackage.akbw;
import defpackage.akca;

public final class AttributesBindingContext$bindFloatAttribute$1 extends DoubleAttributeHandler {
    private /* synthetic */ akca a;
    private /* synthetic */ akbw b;

    public AttributesBindingContext$bindFloatAttribute$1(akca akca, akbw akbw) {
        this.a = akca;
        this.b = akbw;
    }

    public final void applyAttribute(Object obj, double d, Animator animator) {
        akca akca = this.a;
        if (obj != null) {
            View view = (View) obj;
            Float valueOf = Float.valueOf((float) d);
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            akca.invoke(view, valueOf, (ComposerAnimator) animator);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }

    public final void resetAttribute(Object obj, Animator animator) {
        akbw akbw = this.b;
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
