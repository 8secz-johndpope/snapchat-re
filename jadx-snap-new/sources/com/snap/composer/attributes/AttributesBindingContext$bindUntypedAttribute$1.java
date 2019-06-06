package com.snap.composer.attributes;

import android.view.View;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.UntypedAttributeHandler;
import defpackage.ajxt;
import defpackage.akbl;
import defpackage.akbw;

public final class AttributesBindingContext$bindUntypedAttribute$1 extends UntypedAttributeHandler {
    private /* synthetic */ akbw a;
    private /* synthetic */ akbl b;

    public AttributesBindingContext$bindUntypedAttribute$1(akbw akbw, akbl akbl) {
        this.a = akbw;
        this.b = akbl;
    }

    public final void applyAttribute(Object obj, Object obj2, Animator animator) {
        akbw akbw = this.a;
        if (obj != null) {
            akbw.invoke((View) obj, obj2);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }

    public final void resetAttribute(Object obj, Animator animator) {
        akbl akbl = this.b;
        if (obj != null) {
            akbl.invoke((View) obj);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
