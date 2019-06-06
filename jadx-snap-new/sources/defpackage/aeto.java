package defpackage;

/* renamed from: aeto */
public enum aeto {
    CONNECTIONCLASSUNDER50KB(0),
    CONNECTIONCLASS50KB_100KB(1),
    CONNECTIONCLASS100KB_200KB(2),
    CONNECTIONCLASS200KB_500KB(3),
    CONNECTIONCLASS500KB_1MB(4),
    CONNECTIONCLASS1MB_2MB(5),
    CONNECTIONCLASSABOVE2MB(6),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private aeto(int i) {
        this.intValue = i;
    }

    public static aeto a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        aeto[] values = aeto.values();
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
