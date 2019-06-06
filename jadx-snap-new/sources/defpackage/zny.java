package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: zny */
public final class zny extends zob {
    private static final String[] a = new String[]{"android:changeScroll:x", "android:changeScroll:y"};

    private static void d(zog zog) {
        zog.b.put("android:changeScroll:x", Integer.valueOf(zog.a.getScrollX()));
        zog.b.put("android:changeScroll:y", Integer.valueOf(zog.a.getScrollY()));
    }

    public final Animator a(ViewGroup viewGroup, zog zog, zog zog2) {
        Animator animator = null;
        if (zog == null || zog2 == null) {
            return null;
        }
        Animator ofInt;
        View view = zog2.a;
        String str = "android:changeScroll:x";
        int intValue = ((Integer) zog.b.get(str)).intValue();
        int intValue2 = ((Integer) zog2.b.get(str)).intValue();
        String str2 = "android:changeScroll:y";
        int intValue3 = ((Integer) zog.b.get(str2)).intValue();
        int intValue4 = ((Integer) zog2.b.get(str2)).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            ofInt = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            ofInt = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            animator = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        return zof.a(ofInt, animator);
    }

    public final void a(zog zog) {
        zny.d(zog);
    }

    public final String[] a() {
        return a;
    }

    public final void b(zog zog) {
        zny.d(zog);
    }
}
