package defpackage;

/* renamed from: aeva */
public enum aeva {
    NORMAL(0),
    LOW_BANDWIDTH(1),
    THROTTLED(2),
    POOR(3),
    GOOD(4),
    EXCELLENT(5),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private aeva(int i) {
        this.intValue = i;
    }

    public static aeva a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        aeva[] values = aeva.values();
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
