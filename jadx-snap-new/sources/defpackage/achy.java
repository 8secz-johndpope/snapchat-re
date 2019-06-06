package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: achy */
public final class achy extends ValueAnimator {
    boolean a;
    final achx b;

    /* renamed from: achy$2 */
    public static final class 2 implements AnimatorListener {
        private /* synthetic */ achy a;

        2(achy achy) {
            this.a = achy;
        }

        public final void onAnimationCancel(Animator animator) {
            this.a.a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.a.a) {
                achx achx = this.a.b;
                Object animatedValue = this.a.getAnimatedValue();
                if (animatedValue != null) {
                    achx.a(((Float) animatedValue).floatValue());
                } else {
                    throw new ajxt("null cannot be cast to non-null type kotlin.Float");
                }
            }
            this.a.a = false;
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: achy$1 */
    static final class 1 implements AnimatorUpdateListener {
        private /* synthetic */ achy a;

        1(achy achy) {
            this.a = achy;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            achx achx = this.a.b;
            akcr.a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                achx.b(((Float) animatedValue).floatValue());
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public achy(achx achx) {
        akcr.b(achx, "delegate");
        this.b = achx;
        addUpdateListener(new 1(this));
        addListener(new 2(this));
    }
}
