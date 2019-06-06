package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import java.util.List;

/* renamed from: zof */
public final class zof {
    static int a = 1048576;

    public static Animator a(final Animator animator, final Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2});
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                animator.end();
                animator2.end();
            }
        });
        return animatorSet;
    }

    public static Animator a(final List<Animator> list) {
        if (list.size() == 0) {
            return null;
        }
        if (list.size() == 1) {
            return (Animator) list.get(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(list);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                for (Animator animator2 : list) {
                    if (animator2 != null) {
                        animator2.end();
                    }
                }
            }
        });
        return animatorSet;
    }
}
