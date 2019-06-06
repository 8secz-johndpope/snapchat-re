package defpackage;

/* renamed from: agqb */
public enum agqb {
    ADD_SNAP(0),
    DELETE_SNAP(1),
    ADD_HIGHLIGHT(2),
    DELETE_HIGHLIGHT(3),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private agqb(int i) {
        this.intValue = i;
    }

    public static agqb a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        agqb[] values = agqb.values();
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
