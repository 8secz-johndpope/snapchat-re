package com.snap.composer.utils;

import com.snap.composer.attributes.impl.animations.transition.ComposerTransitionInfo;
import com.snap.composer.context.ComposerContext;
import com.snap.composer.nodes.ComposerViewNode;
import com.snap.composer.views.touches.GestureRecognizers;

public final class ComposerObjects {
    private ComposerContext a;
    private ComposerViewNode b;
    private ComposerTransitionInfo c;
    private GestureRecognizers d;

    public final ComposerContext getComposerContext() {
        return this.a;
    }

    public final ComposerTransitionInfo getComposerTransitionInfo() {
        return this.c;
    }

    public final ComposerViewNode getComposerViewNode() {
        return this.b;
    }

    public final GestureRecognizers getGestureRecognizers() {
        return this.d;
    }

    public final void setComposerContext(ComposerContext composerContext) {
        this.a = composerContext;
    }

    public final void setComposerTransitionInfo(ComposerTransitionInfo composerTransitionInfo) {
        this.c = composerTransitionInfo;
    }

    public final void setComposerViewNode(ComposerViewNode composerViewNode) {
        this.b = composerViewNode;
    }

    public final void setGestureRecognizers(GestureRecognizers gestureRecognizers) {
        this.d = gestureRecognizers;
    }
}
