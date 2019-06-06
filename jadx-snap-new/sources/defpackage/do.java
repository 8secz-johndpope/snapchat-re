package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;

/* renamed from: do */
final class do {
    static final dr a = (VERSION.SDK_INT >= 19 ? new dq() : new dp());

    static void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        a.a(animator, animatorListenerAdapter);
    }
}
