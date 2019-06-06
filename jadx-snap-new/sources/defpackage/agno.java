package defpackage;

/* renamed from: agno */
public enum agno {
    DEGREE_0(0),
    DEGREE_90(90),
    DEGREE_180(180),
    DEGREE_270(270),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private agno(int i) {
        this.intValue = i;
    }

    public static agno a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        agno[] values = agno.values();
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
