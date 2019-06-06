package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Arrays;

/* renamed from: axp */
public final class axp {
    a a = a.BITMAP_ONLY;
    boolean b = false;
    float[] c = null;
    int d = 0;
    float e = MapboxConstants.MINIMUM_ZOOM;
    int f = 0;
    float g = MapboxConstants.MINIMUM_ZOOM;

    /* renamed from: axp$a */
    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axp axp = (axp) obj;
        return (this.b == axp.b && this.d == axp.d && Float.compare(axp.e, this.e) == 0 && this.f == axp.f && Float.compare(axp.g, this.g) == 0 && this.a == axp.a) ? Arrays.equals(this.c, axp.c) : false;
    }

    public final int hashCode() {
        a aVar = this.a;
        int i = 0;
        int hashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + this.b) * 31;
        float[] fArr = this.c;
        hashCode = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.d) * 31;
        float f = this.e;
        hashCode = (((hashCode + (f != MapboxConstants.MINIMUM_ZOOM ? Float.floatToIntBits(f) : 0)) * 31) + this.f) * 31;
        f = this.g;
        if (f != MapboxConstants.MINIMUM_ZOOM) {
            i = Float.floatToIntBits(f);
        }
        return hashCode + i;
    }
}
