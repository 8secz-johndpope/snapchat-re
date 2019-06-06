package defpackage;

import com.google.android.gms.ads.AdSize;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

@Deprecated
/* renamed from: bbc */
public final class bbc {
    public static final bbc b = new bbc(-1, -2);
    public static final bbc c = new bbc(320, 50);
    public static final bbc d = new bbc(MapboxConstants.ANIMATION_DURATION, 250);
    public static final bbc e = new bbc(468, 60);
    public static final bbc f = new bbc(728, 90);
    public static final bbc g = new bbc(160, 600);
    public final AdSize a;

    private bbc(int i, int i2) {
        this(new AdSize(i, i2));
    }

    public bbc(AdSize adSize) {
        this.a = adSize;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bbc)) {
            return false;
        }
        return this.a.equals(((bbc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
