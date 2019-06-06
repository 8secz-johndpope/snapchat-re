package defpackage;

/* renamed from: ahfz */
public enum ahfz {
    NONE(1),
    BLACK(2),
    CLEAR(3),
    CORAL(4),
    TEAL(5),
    ONYX(0),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private ahfz(int i) {
        this.intValue = i;
    }

    public static ahfz a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        ahfz[] values = ahfz.values();
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
