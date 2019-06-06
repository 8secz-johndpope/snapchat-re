package defpackage;

import defpackage.mhk.b;

/* renamed from: kpp */
public final class kpp implements aiqc<kqf> {
    private final ajwy<ksr> a;
    private final ajwy<ksu> b;
    private final ajwy<kqu> c;
    private final ajwy<krj> d;
    private final ajwy<ksf> e;
    private final ajwy<krk> f;
    private final ajwy<ksk> g;
    private final ajwy<krw> h;

    public static kqf a(ksr ksr, ksu ksu, kqu kqu, krj krj, ksf ksf, krk krk, ksk ksk, krw krw) {
        ksr ksr2 = ksr;
        akcr.b(ksr, "lensAnalyticsReporter");
        ksu ksu2 = ksu;
        akcr.b(ksu, "nativeAccidentsReporter");
        kqu kqu2 = kqu;
        akcr.b(kqu, "adTrackReporter");
        krj krj2 = krj;
        akcr.b(krj, "snappablesEventReporter");
        ksf ksf2 = ksf;
        akcr.b(ksf, "lensExplorerEventTracker");
        krk krk2 = krk;
        akcr.b(krk2, "carouselSessionTracker");
        ksk ksk2 = ksk;
        akcr.b(ksk2, "performanceEventsTracker");
        krw krw2 = krw;
        akcr.b(krw2, "analyticsDeviceClassProvider");
        return (kqf) aiqf.a(new kqp(ksr2, ksu2, kqu2, krj2, ksf2, ksk2, krk2, krw2, b.a), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kpp.a((ksr) this.a.get(), (ksu) this.b.get(), (kqu) this.c.get(), (krj) this.d.get(), (ksf) this.e.get(), (krk) this.f.get(), (ksk) this.g.get(), (krw) this.h.get());
    }
}
