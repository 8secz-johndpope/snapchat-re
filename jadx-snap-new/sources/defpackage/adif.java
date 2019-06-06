package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Arrays;

/* renamed from: adif */
public final class adif {
    float[] a = new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM};

    public final boolean equals(Object obj) {
        return !(obj instanceof adif) ? false : Arrays.equals(this.a, ((adif) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
