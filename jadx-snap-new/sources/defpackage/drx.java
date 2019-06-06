package defpackage;

import com.snap.ui.view.surfaceview.SurfaceViewManager;

/* renamed from: drx */
public final class drx implements aiqc<duh> {
    private final ajwy<SurfaceViewManager> a;
    private final ajwy<dqg> b;
    private final ajwy<ecv> c;
    private final ajwy<zgb> d;
    private final ajwy<ebh> e;
    private final ajwy<ebw> f;
    private final ajwy<ilv> g;
    private final ajwy<ajei> h;

    public static duh a(SurfaceViewManager surfaceViewManager, dqg dqg, ecv ecv, zgb zgb, ebh ebh, ebw ebw, ilv ilv, ajei ajei) {
        akcr.b(surfaceViewManager, "surfaceViewManager");
        akcr.b(dqg, "cameraFrameProvider");
        akcr.b(ecv, "surfaceRequestFactory");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ebh, "cameraTypeCache");
        akcr.b(ebw, "zoomModel");
        akcr.b(ilv, "graphene");
        akcr.b(ajei, "onDestroyDisposable");
        duh duh = new duh(surfaceViewManager, dqg, ecv, ebh, ebw, ilv);
        ajei.a(duh.a());
        return (duh) aiqf.a(duh, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return drx.a((SurfaceViewManager) this.a.get(), (dqg) this.b.get(), (ecv) this.c.get(), (zgb) this.d.get(), (ebh) this.e.get(), (ebw) this.f.get(), (ilv) this.g.get(), (ajei) this.h.get());
    }
}
