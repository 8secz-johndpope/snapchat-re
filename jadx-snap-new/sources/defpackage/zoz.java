package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: zoz */
public final class zoz extends zob {
    private static final String[] a = new String[]{"android:ting_fade:tint"};

    private static void d(zog zog) {
        if (zog.a instanceof ImageView) {
            zog.b.put("android:ting_fade:tint", la.a((ImageView) zog.a));
        }
    }

    public final Animator a(ViewGroup viewGroup, zog zog, zog zog2) {
        Animator animator = null;
        if (!(zog == null || zog2 == null || !(zog2.a instanceof ImageView))) {
            final ImageView imageView = (ImageView) zog2.a;
            String str = "android:ting_fade:tint";
            ColorStateList colorStateList = (ColorStateList) zog.b.get(str);
            final ColorStateList colorStateList2 = (ColorStateList) zog2.b.get(str);
            if (colorStateList != null && colorStateList2 != null) {
                animator = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
                animator.addUpdateListener(new -$$Lambda$zoz$X_YRrRtK0jwYtS897Byi0BLg57M(new ArgbEvaluator(), colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), imageView));
            } else if (!(colorStateList == null && colorStateList2 == null)) {
                if (colorStateList2 != null) {
                    animator = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
                    colorStateList = colorStateList2;
                } else {
                    animator = ValueAnimator.ofFloat(new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
                }
                animator.addUpdateListener(new -$$Lambda$zoz$fkaRwVGX-le10AUD6-4FOSQ-oBs(imageView, colorStateList));
            }
            if (animator != null) {
                animator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        la.a(imageView, colorStateList2);
                    }
                });
            }
        }
        return animator;
    }

    public final void a(zog zog) {
        zoz.d(zog);
    }

    public final String[] a() {
        return a;
    }

    public final void b(zog zog) {
        zoz.d(zog);
    }
}
