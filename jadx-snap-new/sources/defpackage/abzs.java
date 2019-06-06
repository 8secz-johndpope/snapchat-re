package defpackage;

/* renamed from: abzs */
public enum abzs {
    NO_BATTERY_FILTER(0),
    EMPTY(1),
    FULL(2);
    
    private final int status;

    private abzs(int i) {
        this.status = i;
    }

    public final int a() {
        return this.status;
    }
}
