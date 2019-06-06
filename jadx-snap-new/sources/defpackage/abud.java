package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abud */
public final class abud implements Interpolator {
    private final AccelerateDecelerateInterpolator a;
    private final float b;
    private final float c;

    public abud() {
        this((byte) 0);
    }

    private abud(byte b) {
        this.a = new AccelerateDecelerateInterpolator();
        this.b = 1.03f;
        this.c = 0.98f;
    }

    public final float getInterpolation(float f) {
        float f2;
        float f3 = 1.03f;
        if (f < 0.79999995f) {
            f /= 0.79999995f;
            f3 = MapboxConstants.MINIMUM_ZOOM;
            f2 = 1.03f;
        } else if (f < 0.9f) {
            f = (f - 0.79999995f) / 0.1f;
            f2 = -0.049999952f;
        } else {
            f = (f - 0.9f) / 0.1f;
            f3 = 0.98f;
            f2 = 0.01999998f;
        }
        return f3 + (f2 * this.a.getInterpolation(f));
    }
}
