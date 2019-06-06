package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: tyq */
public final class tyq {
    private static final Interpolator a = new OvershootInterpolator();

    public static Animator a(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{f2});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        return animatorSet;
    }

    public static Animator a(final View view, final int i, final int i2) {
        boolean z = i == 0 || i == 1;
        Preconditions.checkState(z);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", new float[]{(float) i}).setDuration(150);
        duration.addListener(new abtx() {
            public final void onAnimationEnd(Animator animator) {
                View view;
                int i;
                view.setAlpha((float) i);
                if (i == 1) {
                    view = view;
                    i = i2;
                } else {
                    view = view;
                    i = 4;
                }
                view.setVisibility(i);
            }
        });
        return duration;
    }

    public static AnimatorSet a(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{tyq.b(view, 167, 0), tyq.c(view, 233, 1684)});
        return animatorSet;
    }

    public static AnimatorSet a(View view, float f) {
        ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{f, 1.0f}).setDuration(267).setInterpolator(a);
        ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{1.0f, f}).setDuration(233).setStartDelay(1584);
        new AnimatorSet().playSequentially(new Animator[]{r0, r2});
        ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{f, 1.0f}).setDuration(267).setInterpolator(a);
        ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{1.0f, f}).setDuration(233).setStartDelay(1584);
        new AnimatorSet().playSequentially(new Animator[]{r0, r14});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r12, r15});
        return animatorSet;
    }

    public static AnimatorSet b(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{tyq.c(view, 167, 0), tyq.b(view, 233, 1684)});
        return animatorSet;
    }

    public static AnimatorSet b(View view, float f, float f2) {
        ObjectAnimator.ofFloat(view, View.X, new float[]{f, f2}).setDuration(267).setInterpolator(a);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, View.X, new float[]{f2, f}).setDuration(233);
        duration.setInterpolator(a);
        duration.setStartDelay(1584);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{r0, duration});
        return animatorSet;
    }

    private static ObjectAnimator b(View view, int i, int i2) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM}).setDuration((long) i);
        if (i2 > 0) {
            duration.setStartDelay((long) i2);
        }
        return duration;
    }

    private static ObjectAnimator c(View view, int i, int i2) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f}).setDuration((long) i);
        if (i2 > 0) {
            duration.setStartDelay((long) i2);
        }
        return duration;
    }
}
