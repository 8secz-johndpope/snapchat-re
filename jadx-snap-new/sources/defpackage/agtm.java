package defpackage;

/* renamed from: agtm */
public enum agtm {
    MEDIA(0),
    THUMBNAIL(1),
    OVERLAY_IMAGE(2),
    HD_MEDIA(3),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private agtm(int i) {
        this.intValue = i;
    }

    public static agtm a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        agtm[] values = agtm.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].intValue == num.intValue()) {
                return values[i];
            }
        }
        return UNRECOGNIZED_VALUE;
    }

    public final int a() {
        return this.intValue;
    }
}
