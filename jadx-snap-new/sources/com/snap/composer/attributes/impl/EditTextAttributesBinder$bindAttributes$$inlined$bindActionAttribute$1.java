package com.snap.composer.attributes.impl;

import android.view.View;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.actions.ComposerActions;
import com.snap.composer.context.ComposerContext;
import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.extensions.ViewUtils;
import com.snap.composer.views.ComposerEditText;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.UntypedAttributeHandler;
import defpackage.ajxt;

public final class EditTextAttributesBinder$bindAttributes$$inlined$bindActionAttribute$1 extends UntypedAttributeHandler {
    private /* synthetic */ EditTextAttributesBinder a;
    private /* synthetic */ EditTextAttributesBinder b;

    public EditTextAttributesBinder$bindAttributes$$inlined$bindActionAttribute$1(EditTextAttributesBinder editTextAttributesBinder, EditTextAttributesBinder editTextAttributesBinder2) {
        this.a = editTextAttributesBinder;
        this.b = editTextAttributesBinder2;
    }

    public final void applyAttribute(Object obj, Object obj2, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            if (obj2 instanceof ComposerAction) {
                ComposerEditText composerEditText = (ComposerEditText) view;
                composerEditText.setOnChangeAction((ComposerAction) obj2);
                return;
            } else if (obj2 instanceof String) {
                ComposerContext findComposerContext = ViewUtils.INSTANCE.findComposerContext(view);
                if (findComposerContext != null) {
                    ComposerActions actions = findComposerContext.getActions();
                    if (actions != null) {
                        ComposerAction action = actions.getAction((String) obj2);
                        if (action != null) {
                            ((ComposerEditText) view).setOnChangeAction(action);
                            return;
                        }
                    }
                }
                throw new AttributeError("Unable to get action ".concat(String.valueOf(obj2)));
            } else {
                throw new AttributeError("Invalid type for action attribute");
            }
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }

    public final void resetAttribute(Object obj, Animator animator) {
        if (obj != null) {
            ((ComposerEditText) ((View) obj)).setOnChangeAction(null);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
