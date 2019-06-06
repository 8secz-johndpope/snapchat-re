package com.mapbox.mapboxsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import defpackage.kn;

public class AnimatorUtils {

    public interface OnAnimationEndListener {
        void onAnimationEnd();
    }

    public static void alpha(View view, float f) {
        alpha(view, f, null);
    }

    public static void alpha(final View view, float f, final OnAnimationEndListener onAnimationEndListener) {
        view.setLayerType(2, null);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{view.getAlpha(), f});
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setLayerType(0, null);
                OnAnimationEndListener onAnimationEndListener = onAnimationEndListener;
                if (onAnimationEndListener != null) {
                    onAnimationEndListener.onAnimationEnd();
                }
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                view.setVisibility(0);
            }
        });
        ofFloat.start();
    }

    public static void animate(View view, int i) {
        animate(view, i, -1);
    }

    public static void animate(View view, int i, int i2) {
        animate(view, i, i2, null);
    }

    public static void animate(final View view, int i, int i2, final OnAnimationEndListener onAnimationEndListener) {
        if (view != null) {
            view.setLayerType(2, null);
            Animator loadAnimator = AnimatorInflater.loadAnimator(view.getContext(), i);
            if (i2 != -1) {
                loadAnimator.setDuration((long) i2);
            }
            loadAnimator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    view.setLayerType(0, null);
                    OnAnimationEndListener onAnimationEndListener = onAnimationEndListener;
                    if (onAnimationEndListener != null) {
                        onAnimationEndListener.onAnimationEnd();
                    }
                }
            });
            loadAnimator.setTarget(view);
            loadAnimator.start();
        }
    }

    public static void animate(View view, int i, OnAnimationEndListener onAnimationEndListener) {
        animate(view, i, -1, onAnimationEndListener);
    }

    public static void rotate(final View view, float f) {
        view.setLayerType(2, null);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ROTATION, new float[]{view.getRotation(), f});
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setLayerType(0, null);
            }
        });
        ofFloat.start();
    }

    public static void rotateBy(final View view, float f) {
        view.setLayerType(2, null);
        view.animate().rotationBy(f).setInterpolator(new kn()).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setLayerType(0, null);
            }
        });
    }
}
