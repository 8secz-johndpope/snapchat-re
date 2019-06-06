package com.snap.composer.attributes.impl;

import android.view.View;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.actions.ComposerActions;
import com.snap.composer.attributes.impl.gestures.GestureAttributes;
import com.snap.composer.context.ComposerContext;
import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.extensions.ViewUtils;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.UntypedAttributeHandler;
import defpackage.ajxt;

public final class ViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$6 extends UntypedAttributeHandler {
    private /* synthetic */ GestureAttributes a;
    private /* synthetic */ GestureAttributes b;

    public ViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$6(GestureAttributes gestureAttributes, GestureAttributes gestureAttributes2) {
        this.a = gestureAttributes;
        this.b = gestureAttributes2;
    }

    public final void applyAttribute(Object obj, Object obj2, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            if (obj2 instanceof ComposerAction) {
                this.b.applyOnTouchStart(view, (ComposerAction) obj2);
                return;
            } else if (obj2 instanceof String) {
                ComposerContext findComposerContext = ViewUtils.INSTANCE.findComposerContext(view);
                if (findComposerContext != null) {
                    ComposerActions actions = findComposerContext.getActions();
                    if (actions != null) {
                        ComposerAction action = actions.getAction((String) obj2);
                        if (action != null) {
                            this.b.applyOnTouchStart(view, action);
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
            this.a.resetOnTouchStart((View) obj);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
