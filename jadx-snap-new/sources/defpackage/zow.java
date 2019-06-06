package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.zom.a;

/* renamed from: zow */
public final class zow extends a {
    public final Animator a(ViewGroup viewGroup, View view, zog zog) {
        return ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
    }

    public final Animator a(ViewGroup viewGroup, View view, zog zog, zog zog2) {
        return ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
    }
}
