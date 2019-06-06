package com.snap.composer.attributes;

import android.view.View;
import com.snap.composer.attributes.conversions.ColorConversions;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.ColorAttributeHandler;
import defpackage.ajxt;
import defpackage.akbw;
import defpackage.akca;

public final class AttributesBindingContext$bindColorAttribute$1 extends ColorAttributeHandler {
    private /* synthetic */ akca a;
    private /* synthetic */ akbw b;

    public AttributesBindingContext$bindColorAttribute$1(akca akca, akbw akbw) {
        this.a = akca;
        this.b = akbw;
    }

    public final void applyAttribute(Object obj, long j, Animator animator) {
        akca akca = this.a;
        if (obj != null) {
            View view = (View) obj;
            Integer valueOf = Integer.valueOf(ColorConversions.Companion.fromRGBA(j));
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
