package defpackage;

/* renamed from: xjh */
public enum xjh implements ygk {
    METADATA(".MDA"),
    THUMBNAIL(".THM"),
    VIDEO(".MOV"),
    PSYCHOMANTIS(".JPG"),
    IMU(".IMU"),
    ANALYTICS_FILE(".ANALYTICS_LOG"),
    FIRMWARE_LOG_FILE(".FIRMWARE_LOG"),
    FILE_ZIP(".ZIP"),
    FIRMWARE_UPDATE_BIN(".FIRMWAREUPDATE"),
    LUT(".LUT"),
    ALIGNMENT_MATRIX(".ALIGNMENTMATRIX");
    
    private final String extension;
    private final boolean isMultiFile;

    private xjh(String str) {
        akcr.b(str, "extension");
        this.extension = str;
        this.isMultiFile = false;
    }

    public final String a() {
        return this.extension;
    }
}
