package defpackage;

/* renamed from: eaq */
public final class eaq {
    private final adoe a;

    public eaq(adoe adoe) {
        akcr.b(adoe, "videoMetadataRetrieverProvider");
        this.a = adoe;
    }

    public static void a(long j) {
        if (j < 600) {
            throw new ect("Recorded video too short: ".concat(String.valueOf(j)));
        }
    }

    private final void a(String str) {
        adob b = this.a.b(str, adno.RECORDER);
        try {
            boolean k = b.k();
            b.l();
            if (!k) {
                throw new ecs("No video track!");
            }
        } catch (adke e) {
            throw new ecs("Failed to read video metadata", e);
        } catch (Throwable th) {
            b.l();
        }
    }

    public final void a(String str, long j) {
        akcr.b(str, "videoPath");
        eaq.a(j);
        a(str);
    }
}
