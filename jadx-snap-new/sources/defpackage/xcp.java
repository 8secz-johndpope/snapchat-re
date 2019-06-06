package defpackage;

/* renamed from: xcp */
public enum xcp {
    BT_CLASSIC_FAILURE("Bluetooth classic connectivity"),
    METADATA_MISSING("Metadata missing"),
    METADATA_NO_UTC("Metadata contains no_utc"),
    DEMO_APP_TESTING("Testing"),
    S2R("Shake To Report"),
    INVALID("Invalid"),
    PAIRING_FAILURE("Pairing failure"),
    FIRMWARE_UPDATE_FAILURE("Failed to update firmware"),
    ZERO_FILE_SIZE("Zero File size"),
    METADATA_CORRUPTED("Metadata corrupted");
    
    private String mReason;
    public String mSubject;

    private xcp(String str) {
        this.mReason = str;
    }
}
