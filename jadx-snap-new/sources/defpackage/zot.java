package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.zom.a;

/* renamed from: zot */
public final class zot extends a {
    private static Interpolator a;

    /* renamed from: zot$a */
    static class a implements Interpolator {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final float getInterpolation(float f) {
            return f > 0.2f ? 1.0f : f / 0.2f;
        }
    }

    private static float a(zog zog, float f) {
        if (zog == null) {
            return f;
        }
        Float f2 = (Float) zog.b.get("android:fade:alpha");
        return f2 != null ? f2.floatValue() : f;
    }

    private static Interpolator a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public final Animator a(ViewGroup viewGroup, View view, zog zog) {
        float a = zot.a(zog, 1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{a, MapboxConstants.MINIMUM_ZOOM});
        ofFloat.setInterpolator(zot.a());
        return ofFloat;
    }

    public final Animator a(ViewGroup viewGroup, View view, zog zog, zog zog2) {
        float a = zot.a(zog, MapboxConstants.MINIMUM_ZOOM);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{a, 1.0f});
        ofFloat.setInterpolator(zot.a());
        return ofFloat;
    }

    public final void a(zog zog) {
        super.a(zog);
        zog.b.put("android:fade:alpha", Float.valueOf(zog.a.getAlpha()));
    }
}
