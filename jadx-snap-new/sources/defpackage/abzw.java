package defpackage;

@Deprecated
/* renamed from: abzw */
public enum abzw {
    WEATHER(0),
    SPEED(1),
    BATTERY(2),
    DATE(3),
    ALTITUDE(4),
    UNRECOGNIZED_VALUE(5);
    
    public final int type;

    private abzw(int i) {
        this.type = i;
    }

    public static abzw a(int i) {
        for (abzw abzw : abzw.values()) {
            if (abzw.type == i) {
                return abzw;
            }
        }
        return null;
    }
}
