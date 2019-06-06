package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: blp */
public final class blp {
    public static final blp a = new blp();
    public final float b;
    public final float c;
    public final boolean d;
    public final int e;

    private blp() {
        this(1.0f, 1.0f, false);
    }

    public blp(float f) {
        this(f, 1.0f, false);
    }

    public blp(float f, float f2, boolean z) {
        boolean z2 = true;
        byo.a(f > MapboxConstants.MINIMUM_ZOOM);
        if (f2 <= MapboxConstants.MINIMUM_ZOOM) {
            z2 = false;
        }
        byo.a(z2);
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            blp blp = (blp) obj;
            return this.b == blp.b && this.c == blp.c && this.d == blp.d;
        }
    }

    public final int hashCode() {
        return ((((Float.floatToRawIntBits(this.b) + 527) * 31) + Float.floatToRawIntBits(this.c)) * 31) + this.d;
    }
}
