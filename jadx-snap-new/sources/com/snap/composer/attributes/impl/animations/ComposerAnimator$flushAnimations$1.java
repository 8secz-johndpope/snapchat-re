package com.snap.composer.attributes.impl.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.snap.composer.actions.ComposerAction;

public final class ComposerAnimator$flushAnimations$1 extends AnimatorListenerAdapter {
    private /* synthetic */ ComposerAnimator a;
    private /* synthetic */ Object b;

    ComposerAnimator$flushAnimations$1(ComposerAnimator composerAnimator, Object obj) {
        this.a = composerAnimator;
        this.b = obj;
    }

    public final void onAnimationEnd(Animator animator) {
        ComposerAnimator.access$removeAnimations(this.a);
        Object obj = this.b;
        if (!(obj instanceof ComposerAction)) {
            obj = null;
        }
        ComposerAction composerAction = (ComposerAction) obj;
        if (composerAction != null) {
            composerAction.perform(new Object[0]);
        }
    }
}
