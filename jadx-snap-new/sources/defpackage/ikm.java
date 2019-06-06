package defpackage;

/* renamed from: ikm */
public final class ikm implements aiqc<ijb> {
    private final ajwy<ijy> a;
    private final ajwy<ikb> b;
    private final ajwy<ijv> c;
    private final ajwy<ijx> d;
    private final ajwy<iko> e;
    private final ajwy<ilv> f;
    private final ajwy<ihh> g;
    private final ajwy<ftl> h;
    private final ajwy<ajdx<iha>> i;
    private final ajwy<zgb> j;
    private final ajwy<ijm> k;
    private final ajwy<gqr> l;

    public static ijb a(ajwy<ijy> ajwy, ajwy<ikb> ajwy2, ajwy<ijv> ajwy3, ajwy<ijx> ajwy4, ajwy<iko> ajwy5, ajwy<ilv> ajwy6, ihh ihh, ajwy<ftl> ajwy7, ajdx<iha> ajdx, ajwy<zgb> ajwy8, ajwy<ijm> ajwy9, ajwy<gqr> ajwy10) {
        ajwy<ijy> ajwy11 = ajwy;
        akcr.b(ajwy, "eliminationStageProvider");
        ajwy<ikb> ajwy12 = ajwy2;
        akcr.b(ajwy2, "prefetchResourcesStageProvider");
        ajwy<ijv> ajwy13 = ajwy3;
        akcr.b(ajwy3, "composeResourcesStageProvider");
        ajwy<ijx> ajwy14 = ajwy4;
        akcr.b(ajwy14, "createViewModelStageProvider");
        akcr.b(ajwy5, "friendFilterDataSourceProvider");
        ajwy<ilv> ajwy15 = ajwy6;
        akcr.b(ajwy15, "grapheneProvider");
        ihh ihh2 = ihh;
        akcr.b(ihh2, "clock");
        ajwy<ftl> ajwy16 = ajwy7;
        akcr.b(ajwy16, "compositeConfigProvider");
        ajdx<iha> ajdx2 = ajdx;
        akcr.b(ajdx2, "serializationProvider");
        ajwy<zgb> ajwy17 = ajwy8;
        akcr.b(ajwy17, "schedulersProvider");
        ajwy<ijm> ajwy18 = ajwy9;
        akcr.b(ajwy18, "carouselConfigProvider");
        ajwy<gqr> ajwy19 = ajwy10;
        akcr.b(ajwy19, "exceptionTracker");
        return (ijb) aiqf.a(new ijz(ajwy11, ajwy12, ajwy13, ajwy14, ajwy15, ihh2, ajwy16, ajdx2, ajwy17, ajwy18, ajwy19), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        ajwy ajwy4 = this.d;
        ajwy ajwy5 = this.e;
        ajwy ajwy6 = this.f;
        ajwy ajwy7 = this.g;
        ajwy ajwy8 = this.h;
        ajwy ajwy9 = this.i;
        return ikm.a(ajwy, ajwy2, ajwy3, ajwy4, ajwy5, ajwy6, (ihh) ajwy7.get(), ajwy8, (ajdx) ajwy9.get(), this.j, this.k, this.l);
    }
}
