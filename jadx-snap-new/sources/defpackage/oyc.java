package defpackage;

/* renamed from: oyc */
public enum oyc implements ygk {
    THUMBNAIL(".thumbnail", true, "memories_thumbnail"),
    THUMBNAIL_PACKAGE(".packaged", false, "memories_thumbnail"),
    OVERLAY(".overlay", false, "memories_overlay"),
    OVERLAY_METADATA(".overlay_meta", false, "memories_edits"),
    MEDIA(".media", false, "memories_media"),
    HD_MEDIA(".media.hd", false, "memories_media");
    
    protected final String mContentTypeName;
    protected final String mFileKey;
    protected final boolean mIsMultiFile;

    private oyc(String str, boolean z, String str2) {
        this.mFileKey = str;
        this.mIsMultiFile = z;
        this.mContentTypeName = str2;
    }

    public final String a() {
        return this.mFileKey;
    }

    public final String b() {
        return this.mContentTypeName;
    }
}
