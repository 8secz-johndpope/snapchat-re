package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: id */
public final class id {
    public static float a(float f) {
        return f < MapboxConstants.MINIMUM_ZOOM ? MapboxConstants.MINIMUM_ZOOM : f > 1.0f ? 1.0f : f;
    }

    public static int a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }
}
