package defpackage;

/* renamed from: muu */
public enum muu implements mwg {
    SCHEDULED_FRONT(r2, true),
    SCHEDULED_REAR(r5, true),
    SCHEDULED_PRECACHED(r2, true),
    UNLOCKED("SCAN_UNLOCKED", true),
    GEO(r2, true),
    BUNDLED(r5, false),
    BUNDLED_METADATA(r5, true),
    TEST(r2, false);
    
    private final boolean remote;
    private final String sourceName;

    private muu(String str, boolean z) {
        akcr.b(str, "sourceName");
        this.sourceName = str;
        this.remote = z;
    }

    public final String a() {
        return this.sourceName;
    }

    public final boolean b() {
        return this.remote;
    }

    public final String toString() {
        return this.sourceName;
    }
}
