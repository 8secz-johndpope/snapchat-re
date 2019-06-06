package defpackage;

/* renamed from: ajd */
public enum ajd {
    ALL(true, true),
    NONE(false, false),
    SOURCE(true, false),
    RESULT(false, true);
    
    public final boolean cacheResult;
    public final boolean cacheSource;

    private ajd(boolean z, boolean z2) {
        this.cacheSource = z;
        this.cacheResult = z2;
    }
}
