package com.snap.composer.attributes.impl;

import android.view.View;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.actions.ComposerActions;
import com.snap.composer.context.ComposerContext;
import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.extensions.ViewUtils;
import com.snap.composer.views.ComposerScrollView;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.UntypedAttributeHandler;
import defpackage.ajxt;

public final class ScrollViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$2 extends UntypedAttributeHandler {
    private /* synthetic */ ScrollViewAttributesBinder a;
    private /* synthetic */ ScrollViewAttributesBinder b;

    public ScrollViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$2(ScrollViewAttributesBinder scrollViewAttributesBinder, ScrollViewAttributesBinder scrollViewAttributesBinder2) {
        this.a = scrollViewAttributesBinder;
        this.b = scrollViewAttributesBinder2;
    }

    public final void applyAttribute(Object obj, Object obj2, Animator animator) {
        if (obj != null) {
            View view = (View) obj;
            if (obj2 instanceof ComposerAction) {
                ComposerScrollView composerScrollView = (ComposerScrollView) view;
                this.b.applyOnScrollEnd(composerScrollView, (ComposerAction) obj2);
                return;
            } else if (obj2 instanceof String) {
                ComposerContext findComposerContext = ViewUtils.INSTANCE.findComposerContext(view);
                if (findComposerContext != null) {
                    ComposerActions actions = findComposerContext.getActions();
                    if (actions != null) {
                        ComposerAction action = actions.getAction((String) obj2);
                        if (action != null) {
                            this.b.applyOnScrollEnd((ComposerScrollView) view, action);
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
            this.a.resetOnScrollEnd((ComposerScrollView) ((View) obj));
            return;
        }
        throw new ajxt("null cannot be cast to non-null type T");
    }
}
