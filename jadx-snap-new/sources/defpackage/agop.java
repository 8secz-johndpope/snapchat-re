package defpackage;

/* renamed from: agop */
public enum agop {
    SNAP(0),
    STORY(1),
    LAGUNA_STORY(2),
    GROUP_STORY(3),
    MULTI_SNAP(4),
    FEATURED_STORY(5),
    SHARED_STORY(6),
    SHARED_SNAP(7),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private agop(int i) {
        this.intValue = i;
    }

    public static agop a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        agop[] values = agop.values();
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
