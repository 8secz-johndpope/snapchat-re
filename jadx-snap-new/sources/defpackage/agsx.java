package defpackage;

/* renamed from: agsx */
public enum agsx {
    SNAP_ID(0),
    MEDIA_ID(1),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private agsx(int i) {
        this.intValue = i;
    }

    public static agsx a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        agsx[] values = agsx.values();
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
