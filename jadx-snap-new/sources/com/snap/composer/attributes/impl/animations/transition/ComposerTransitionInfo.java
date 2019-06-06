package com.snap.composer.attributes.impl.animations.transition;

import android.animation.Animator;
import defpackage.ajyu;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ComposerTransitionInfo {
    private final Map<Object, Animator> a = new LinkedHashMap();

    public final void addAnimator(Object obj, Animator animator) {
        akcr.b(obj, "key");
        akcr.b(animator, "animator");
        cancelAnimator(obj);
        this.a.put(obj, animator);
    }

    public final void cancelAllAnimators() {
        while ((this.a.isEmpty() ^ 1) != 0) {
            cancelAnimator(ajyu.d((Iterable) this.a.keySet()));
        }
    }

    public final void cancelAnimator(Object obj) {
        akcr.b(obj, "key");
        Animator animator = (Animator) this.a.remove(obj);
        if (animator != null) {
            animator.cancel();
        }
    }

    public final Animator getAnimator(Object obj) {
        akcr.b(obj, "key");
        return (Animator) this.a.get(obj);
    }
}
