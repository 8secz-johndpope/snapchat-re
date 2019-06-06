package com.snap.composer.attributes;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.BorderAttributeHandler;
import defpackage.ajxt;
import defpackage.akbm;
import defpackage.akbw;

public final class AttributesBindingContext$bindCornersAttribute$1 extends BorderAttributeHandler {
    private /* synthetic */ akbm a;
    private /* synthetic */ akbw b;

    public AttributesBindingContext$bindCornersAttribute$1(akbm akbm, akbw akbw) {
        this.a = akbm;
        this.b = akbw;
    }

    public final void applyAttribute(Object obj, double d, boolean z, double d2, boolean z2, double d3, boolean z3, double d4, boolean z4, Animator animator) {
        akbm akbm = this.a;
        if (obj != null) {
            View view = (View) obj;
            Float valueOf = Float.valueOf((float) d);
            Boolean valueOf2 = Boolean.valueOf(z);
            Float valueOf3 = Float.valueOf((float) d2);
            Boolean valueOf4 = Boolean.valueOf(z2);
            Float valueOf5 = Float.valueOf((float) d3);
            Boolean valueOf6 = Boolean.valueOf(z3);
            Float valueOf7 = Float.valueOf((float) d4);
            Boolean valueOf8 = Boolean.valueOf(z4);
            Animator animator2 = animator;
            if (!(animator2 instanceof ComposerAnimator)) {
                animator2 = null;
            }
            akbm.a(view, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, (ComposerAnimator) animator2);
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
