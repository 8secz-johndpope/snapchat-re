package com.snap.composer.attributes.impl;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.views.ComposerEditText;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.StringAttributeHandler;
import defpackage.ajxt;
import defpackage.akcr;

public final class EditTextAttributesBinder$bindAttributes$$inlined$bindStringAttribute$4 extends StringAttributeHandler {
    private /* synthetic */ EditTextAttributesBinder a;
    private /* synthetic */ EditTextAttributesBinder b;

    public EditTextAttributesBinder$bindAttributes$$inlined$bindStringAttribute$4(EditTextAttributesBinder editTextAttributesBinder, EditTextAttributesBinder editTextAttributesBinder2) {
        this.a = editTextAttributesBinder;
        this.b = editTextAttributesBinder2;
    }

    public final void applyAttribute(Object obj, String str, Animator animator) {
        akcr.b(str, "p1");
        if (obj != null) {
            View view = (View) obj;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            ComposerEditText composerEditText = (ComposerEditText) view;
            composerEditText.setPrefix(str);
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
            ComposerEditText composerEditText = (ComposerEditText) view;
            composerEditText.setPrefix(null);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
