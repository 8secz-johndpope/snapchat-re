package com.snap.composer.attributes.impl;

import android.view.View;
import android.widget.TextView;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.IntAttributeHandler;
import defpackage.ajxt;

public final class TextViewAttributesBinder$bindAttributes$$inlined$bindIntAttribute$1 extends IntAttributeHandler {
    private /* synthetic */ TextViewAttributesBinder a;
    private /* synthetic */ TextViewAttributesBinder b;

    public TextViewAttributesBinder$bindAttributes$$inlined$bindIntAttribute$1(TextViewAttributesBinder textViewAttributesBinder, TextViewAttributesBinder textViewAttributesBinder2) {
        this.a = textViewAttributesBinder;
        this.b = textViewAttributesBinder2;
    }

    public final void applyAttribute(Object obj, long j, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            int i = (int) j;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            TextView textView = (TextView) view;
            this.a.applyNumberOfLines(textView, i, (ComposerAnimator) animator);
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
            TextView textView = (TextView) view;
            this.b.resetNumberOfLines(textView, (ComposerAnimator) animator);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
