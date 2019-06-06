package defpackage;

/* renamed from: ohq */
public enum ohq implements ygk {
    MEDIA(".media"),
    EDITS(".edits"),
    OVERLAY(".overlay");
    
    private final String extension;
    private final boolean isMultiFile;

    private ohq(String str) {
        this.extension = str;
        this.isMultiFile = false;
    }

    public final String a() {
        return this.extension;
    }
}
