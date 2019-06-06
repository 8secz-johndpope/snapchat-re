package com.snap.composer.attributes;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.FlexBoxAttributeHandler;
import defpackage.ajxt;
import defpackage.akbw;
import defpackage.akca;

public final class AttributesBindingContext$bindFlexBoxAttribute$1 extends FlexBoxAttributeHandler {
    private /* synthetic */ akca a;
    private /* synthetic */ akca b;
    private /* synthetic */ akbw c;
    private /* synthetic */ akbw d;

    public AttributesBindingContext$bindFlexBoxAttribute$1(akca akca, akca akca2, akbw akbw, akbw akbw2) {
        this.a = akca;
        this.b = akca2;
        this.c = akbw;
        this.d = akbw2;
    }

    public final void applyAttributeAuto(Object obj, Animator animator) {
        akbw akbw = this.c;
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

    public final void applyAttributePercent(Object obj, double d, Animator animator) {
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

    public final void applyAttributeRaw(Object obj, double d, Animator animator) {
        akca akca = this.b;
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
        akbw akbw = this.d;
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
