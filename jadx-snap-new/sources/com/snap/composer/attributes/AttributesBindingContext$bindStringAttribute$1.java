package com.snap.composer.attributes;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.StringAttributeHandler;
import defpackage.ajxt;
import defpackage.akbw;
import defpackage.akca;
import defpackage.akcr;

public final class AttributesBindingContext$bindStringAttribute$1 extends StringAttributeHandler {
    private /* synthetic */ akca a;
    private /* synthetic */ akbw b;

    public AttributesBindingContext$bindStringAttribute$1(akca akca, akbw akbw) {
        this.a = akca;
        this.b = akbw;
    }

    public final void applyAttribute(Object obj, String str, Animator animator) {
        akcr.b(str, "p1");
        akca akca = this.a;
        if (obj != null) {
            View view = (View) obj;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            akca.invoke(view, str, (ComposerAnimator) animator);
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
