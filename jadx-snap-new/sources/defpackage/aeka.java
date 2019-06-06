package defpackage;

/* renamed from: aeka */
public enum aeka {
    UNICODE(0),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private aeka(int i) {
        this.intValue = i;
    }

    public static aeka a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        aeka[] values = aeka.values();
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
