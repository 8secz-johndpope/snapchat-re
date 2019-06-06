package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: zou */
public final class zou extends zob {
    private static final String[] a = new String[]{"android:margin:left"};

    private static /* synthetic */ void a(zog zog, ValueAnimator valueAnimator) {
        LayoutParams layoutParams = zog.a.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            ((MarginLayoutParams) layoutParams).leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            zog.a.requestLayout();
        }
    }

    private static void d(zog zog) {
        LayoutParams layoutParams = zog.a.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            String str = "android:margin:left";
            zog.b.put(str, Integer.valueOf(((MarginLayoutParams) layoutParams).leftMargin));
        }
    }

    public final Animator a(ViewGroup viewGroup, zog zog, zog zog2) {
        if (zog == null || zog2 == null) {
            return null;
        }
        String str = "android:margin:left";
        if (((Integer) zog.b.get(str)).intValue() == ((Integer) zog2.b.get(str)).intValue()) {
            return null;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{((Integer) zog.b.get(str)).intValue(), ((Integer) zog2.b.get(str)).intValue()});
        ofInt.addUpdateListener(new -$$Lambda$zou$ejIubbk0GvEQMOW5Gib_oCLfT_8(zog2));
        return ofInt;
    }

    public final void a(zog zog) {
        zou.d(zog);
    }

    public final String[] a() {
        return a;
    }

    public final void b(zog zog) {
        zou.d(zog);
    }
}
