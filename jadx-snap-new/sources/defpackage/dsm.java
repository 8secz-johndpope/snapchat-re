package defpackage;

import defpackage.dru.b.a;

/* renamed from: dsm */
public final class dsm implements aiqc<dyw> {
    private final ajwy<edp> a;
    private final ajwy<ebg> b;
    private final ajwy<dza> c;
    private final ajwy<jwa> d;
    private final ajwy<adhk> e;
    private final ajwy<gqr> f;
    private final ajwy<abss> g;
    private final ajwy<dvm> h;

    public static dyw a(edp edp, ebg ebg, dza dza, jwa jwa, adhk adhk, gqr gqr, abss abss, dvm dvm) {
        edp edp2 = edp;
        ebg ebg2 = ebg;
        dza dza2 = dza;
        akcr.b(edp, "deviceScoreProvider");
        akcr.b(ebg, "lensesProcessingCoreSubProxy");
        akcr.b(dza, "compositeFrameTextureProcessor");
        jwa jwa2 = jwa;
        akcr.b(jwa2, "bitmapFactory");
        adhk adhk2 = adhk;
        akcr.b(adhk2, "gles20Wrapper");
        gqr gqr2 = gqr;
        akcr.b(gqr2, "exceptionTracker");
        abss abss2 = abss;
        akcr.b(abss2, "releaseManager");
        dvm dvm2 = dvm;
        akcr.b(dvm2, "cameraFpsDispatcher");
        return (dyw) aiqf.a(new dyw(aiqb.b(new a(ebg)), dza2, jwa2, edp2, adhk2, gqr2, abss2, dvm2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dsm.a((edp) this.a.get(), (ebg) this.b.get(), (dza) this.c.get(), (jwa) this.d.get(), (adhk) this.e.get(), (gqr) this.f.get(), (abss) this.g.get(), (dvm) this.h.get());
    }
}
