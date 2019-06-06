package defpackage;

/* renamed from: agqh */
public enum agqh {
    NONE(0),
    IMPORTED(1),
    SCREENSHOT(2),
    DEVICE(3),
    LAGUNA(4),
    MOB_STORY(5),
    SHAREDSNAP(6),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private agqh(int i) {
        this.intValue = i;
    }

    public static agqh a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        agqh[] values = agqh.values();
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
