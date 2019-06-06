package defpackage;

/* renamed from: aetp */
public enum aetp {
    CONNECTIONCLASS_UNDER400KBITPS(0),
    CONNECTIONCLASS_400KBITPS_800KBITPS(1),
    CONNECTIONCLASS_800KBITPS_1600KBITPS(2),
    CONNECTIONCLASS_1600KBITPS_4MBITPS(3),
    CONNECTIONCLASS_4MBITPS_8MBITPS(4),
    CONNECTIONCLASS_8MBITPS_16MBITPS(5),
    CONNECTIONCLASS_ABOVE16MBITPS(6),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private aetp(int i) {
        this.intValue = i;
    }

    public static aetp a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        aetp[] values = aetp.values();
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
