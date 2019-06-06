package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* renamed from: acae */
public enum acae {
    INSTASNAP(0, aamf.INSTASNAP),
    MISS_ETIKATE(1, aamf.MISS_ETIKATE),
    GREYSCALE(2, aamf.GRAYSCALE),
    SMOOTHING(3, aamf.FACE_SMOOTHING),
    SKY_DAYLIGHT(4),
    SKY_SUNSET(5),
    SKY_NIGHT(6),
    FACE_LENS(7),
    UNFILTERED(-1);
    
    public static final Set<acae> SKY_FILTER_TYPES = null;
    private final aamf filterVisualType;
    public final int type;

    static {
        SKY_FILTER_TYPES = EnumSet.of(r2, r1, r3);
    }

    private acae(int i) {
        this(r2, r3, i, null);
    }

    private acae(int i, aamf aamf) {
        this.type = i;
        this.filterVisualType = aamf;
    }

    public final int a() {
        return this.type;
    }

    public final aamf b() {
        return this.filterVisualType;
    }

    public final boolean c() {
        return SKY_FILTER_TYPES.contains(this);
    }
}
