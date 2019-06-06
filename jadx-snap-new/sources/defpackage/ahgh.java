package defpackage;

/* renamed from: ahgh */
public enum ahgh {
    WHITE_BACKGROUND(0),
    BLACK_BACKGROUND(1),
    SQUARE(2),
    HORIZONTAL_4_3(3),
    HORIZONTAL_16_9(4),
    PORTRAIT_9_16(5),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private ahgh(int i) {
        this.intValue = i;
    }

    public static ahgh a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        ahgh[] values = ahgh.values();
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
