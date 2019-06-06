package defpackage;

/* renamed from: agqc */
public enum agqc {
    PORTRAIT(0),
    PORTRAITUPSIDEDOWN(1),
    LANDSCAPELEFT(2),
    LANDSCAPERIGHT(3),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private agqc(int i) {
        this.intValue = i;
    }

    public static agqc a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        agqc[] values = agqc.values();
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
