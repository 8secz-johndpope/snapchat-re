package com.snap.composer.attributes.impl;

import android.view.View;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.views.ComposerEditText;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.IntAttributeHandler;
import defpackage.ajxt;

public final class EditTextAttributesBinder$bindAttributes$$inlined$bindIntAttribute$2 extends IntAttributeHandler {
    private /* synthetic */ EditTextAttributesBinder a;
    private /* synthetic */ EditTextAttributesBinder b;

    public EditTextAttributesBinder$bindAttributes$$inlined$bindIntAttribute$2(EditTextAttributesBinder editTextAttributesBinder, EditTextAttributesBinder editTextAttributesBinder2) {
        this.a = editTextAttributesBinder;
        this.b = editTextAttributesBinder2;
    }

    public final void applyAttribute(Object obj, long j, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            int i = (int) j;
            if (!(animator instanceof ComposerAnimator)) {
                animator = null;
            }
            ComposerEditText composerEditText = (ComposerEditText) view;
            composerEditText.setCharacterLimit(i);
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
            composerEditText.resetCharacterLimit();
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
