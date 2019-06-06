package defpackage;

/* renamed from: akjc */
public enum akjc {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);
    
    public final int httpCode;

    private akjc(int i) {
        this.httpCode = i;
    }

    public static akjc a(int i) {
        for (akjc akjc : akjc.values()) {
            if (akjc.httpCode == i) {
                return akjc;
            }
        }
        return null;
    }
}
