package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.zom.a;
import defpackage.zoq.b;

/* renamed from: zos */
public final class zos extends a {
    private static final Interpolator a = new zoq.a(0.5f);
    private static final Interpolator b = new b(0.5f);

    public final Animator a(ViewGroup viewGroup, View view, zog zog) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
        ofFloat.setInterpolator(b);
        return ofFloat;
    }

    public final Animator a(ViewGroup viewGroup, View view, zog zog, zog zog2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
        ofFloat.setInterpolator(a);
        return ofFloat;
    }
}
