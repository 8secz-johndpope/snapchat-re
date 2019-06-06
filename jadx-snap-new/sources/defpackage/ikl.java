package defpackage;

/* renamed from: ikl */
public final class ikl implements aiqc<tqi> {
    private final ajwy<ikn> a;
    private final ajwy<ijx> b;
    private final ajwy<ijb> c;
    private final ajwy<ils> d;
    private final ajwy<oeb> e;
    private final ajwy<iko> f;
    private final ajwy<ftl> g;
    private final ajwy<tvd> h;
    private final ajwy<zgb> i;

    public static tqi a(ikn ikn, ajwy<ijx> ajwy, ajwy<ijb> ajwy2, ajwy<ils> ajwy3, ajwy<oeb> ajwy4, ajwy<iko> ajwy5, ftl ftl, tvd tvd, zgb zgb) {
        ikn ikn2 = ikn;
        akcr.b(ikn, "geofiltersDataSource");
        ajwy<ijx> ajwy6 = ajwy;
        akcr.b(ajwy, "createViewModelStageProvider");
        ajwy<ijb> ajwy7 = ajwy2;
        akcr.b(ajwy2, "geofilterPreparer");
        ajwy<ils> ajwy8 = ajwy3;
        akcr.b(ajwy3, "geofilterOverlayCacheKeyHelperProvider");
        ajwy<oeb> ajwy9 = ajwy4;
        akcr.b(ajwy4, "geofilterPipelineContextStoreProvider");
        ajwy<iko> ajwy10 = ajwy5;
        akcr.b(ajwy10, "friendFilterDataSourceProvider");
        ftl ftl2 = ftl;
        akcr.b(ftl2, "compositeConfigurationProvider");
        tvd tvd2 = tvd;
        akcr.b(tvd2, "previewDataSource");
        zgb zgb2 = zgb;
        akcr.b(zgb2, "schedulersProvider");
        return (tqi) aiqf.a(new ijt(ikn2, ajwy6, ajwy7, ajwy8, ajwy9, ajwy10, ftl2, tvd2, zgb2), "Cannot return null from a non-@Nullable @Provides method");
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
        return ikl.a((ikn) ajwy.get(), ajwy2, ajwy3, ajwy4, ajwy5, ajwy6, (ftl) ajwy7.get(), (tvd) ajwy8.get(), (zgb) this.i.get());
    }
}
