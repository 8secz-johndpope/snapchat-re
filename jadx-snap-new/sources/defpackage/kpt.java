package defpackage;

/* renamed from: kpt */
public final class kpt implements aiqc<ksr> {
    private final ajwy<krh> a;
    private final ajwy<kss> b;
    private final ajwy<kqu> c;
    private final ajwy<ksv> d;

    public static ksr a(krh krh, kss kss, kqu kqu, ksv ksv) {
        akcr.b(krh, "blizzardEventReporter");
        akcr.b(kss, "lensAnalyticsSessionReporter");
        akcr.b(kqu, "adTrackReporter");
        akcr.b(ksv, "performanceEventsReporter");
        return (ksr) aiqf.a(new ksn(krh, kqu, kss, ksv), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kpt.a((krh) this.a.get(), (kss) this.b.get(), (kqu) this.c.get(), (ksv) this.d.get());
    }
}
