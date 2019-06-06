package defpackage;

/* renamed from: ebz */
public enum ebz {
    UNKNOWN(0),
    LEGACY(1),
    LIMITED(2),
    FULL(3),
    LEVEL_3(4),
    UNUSED(5);
    
    public final int value;

    private ebz(int i) {
        this.value = i;
    }
}
