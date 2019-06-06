package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: zoj */
final class zoj {
    public static List<ValueAnimator> a(Animator animator) {
        ArrayList arrayList = new ArrayList();
        for (Animator animator2 : zoj.b(animator)) {
            if (animator2 instanceof ValueAnimator) {
                arrayList.add((ValueAnimator) animator2);
            }
        }
        return arrayList;
    }

    private static List<Animator> a(AnimatorSet animatorSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = animatorSet.getChildAnimations().iterator();
        while (it.hasNext()) {
            arrayList.addAll(zoj.b((Animator) it.next()));
        }
        return arrayList;
    }

    private static List<Animator> b(Animator animator) {
        if (animator instanceof AnimatorSet) {
            return zoj.a((AnimatorSet) animator);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(animator);
        return arrayList;
    }
}
