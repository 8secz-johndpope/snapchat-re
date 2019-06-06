package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.zoq.a;
import defpackage.zoq.b;

/* renamed from: zok */
public final class zok extends zob {
    private static final String[] a = new String[]{"android:background_drawable_fade:background_drawable"};
    private static final Interpolator b = new a(0.8f);
    private static final Interpolator c = new b(0.2f);

    private static /* synthetic */ void a(Drawable drawable, Drawable drawable2, View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (drawable == null || drawable2 == null) {
            if (drawable != null) {
                drawable.setAlpha((int) ((1.0f - floatValue) * 255.0f));
                view.setBackground(drawable);
                return;
            }
            if (drawable2 != null) {
                drawable2.setAlpha((int) (floatValue * 255.0f));
                view.setBackground(drawable2);
            }
        } else if (floatValue < 0.5f) {
            drawable.setAlpha((int) ((1.0f - (floatValue * 2.0f)) * 255.0f));
            view.setBackground(drawable);
        } else {
            drawable2.setAlpha((int) ((floatValue * 2.0f) * 255.0f));
            view.setBackground(drawable2);
        }
    }

    private static void d(zog zog) {
        zog.b.put("android:background_drawable_fade:background_drawable", zog.a.getBackground());
    }

    public final Animator a(ViewGroup viewGroup, zog zog, zog zog2) {
        Animator animator = null;
        if (!(zog == null || zog2 == null)) {
            View view = zog2.a;
            String str = "android:background_drawable_fade:background_drawable";
            final Drawable drawable = (Drawable) zog.b.get(str);
            final Drawable drawable2 = (Drawable) zog2.b.get(str);
            if (!(drawable == null && drawable2 == null)) {
                Drawable newDrawable = (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable();
                Drawable newDrawable2 = (drawable2 == null || drawable2.getConstantState() == null) ? null : drawable2.getConstantState().newDrawable();
                Animator ofFloat = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
                if (drawable == null || drawable2 == null) {
                    ofFloat.setInterpolator(drawable2 != null ? b : c);
                } else if (drawable.getConstantState().equals(drawable2.getConstantState())) {
                    return null;
                }
                final zog zog3 = zog;
                final zog zog4 = zog2;
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        Drawable drawable = drawable;
                        if (drawable != null) {
                            drawable.setAlpha(255);
                        }
                        drawable = drawable2;
                        if (drawable != null) {
                            drawable.setAlpha(255);
                        }
                        zog3.a.setBackground(drawable);
                        zog4.a.setBackground(drawable2);
                    }
                });
                ofFloat.addUpdateListener(new -$$Lambda$zok$YO1OjjhspEs3pRzgwJCTZzANOL8(newDrawable, newDrawable2, view));
                animator = ofFloat;
            }
        }
        return animator;
    }

    public final void a(zog zog) {
        zok.d(zog);
    }

    public final String[] a() {
        return a;
    }

    public final void b(zog zog) {
        zok.d(zog);
    }
}
