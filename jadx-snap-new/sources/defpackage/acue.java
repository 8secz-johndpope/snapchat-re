package defpackage;

import android.view.animation.Interpolator;

/* renamed from: acue */
public final class acue implements Interpolator {
    public static final Interpolator a = new acue();

    public final float getInterpolation(float f) {
        return (2.0f * f) - (f * f);
    }
}
