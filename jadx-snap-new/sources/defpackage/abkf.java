package defpackage;

@Deprecated
/* renamed from: abkf */
public enum abkf {
    BLOB(r2),
    TEXT(r3),
    MAP(r3),
    INTEGER(r5),
    LONG(r5),
    BOOLEAN(r5),
    REAL(r8);
    
    private final String mStringFormat;

    private abkf(String str) {
        this.mStringFormat = str;
    }

    public final String toString() {
        return this.mStringFormat;
    }
}
