package defpackage;

/* renamed from: aeuy */
public enum aeuy {
    NOT_PRESENT(0),
    IN_CHAT(1),
    IN_CALL(2),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private aeuy(int i) {
        this.intValue = i;
    }

    public static aeuy a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        aeuy[] values = aeuy.values();
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
