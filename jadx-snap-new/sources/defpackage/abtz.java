package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: abtz */
public class abtz extends AnimatorListenerAdapter {
    private boolean a;

    public void a() {
    }

    public void b() {
    }

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            a();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.a = false;
        b();
    }
}
