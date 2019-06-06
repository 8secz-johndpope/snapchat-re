package defpackage;

import defpackage.lfu.a;

/* renamed from: kuy */
public final class kuy implements aiqc<gnb> {
    private final ajwy<a> a;
    private final ajwy<kws.a> b;
    private final ajwy<nal.a> c;
    private final ajwy<lni.a> d;
    private final ajwy<lbp> e;
    private final ajwy<kvl> f;
    private final ajwy<zgb> g;
    private final ajwy<dib> h;
    private final ajwy<zpo> i;

    public static gnb a(ajwy<a> ajwy, ajwy<kws.a> ajwy2, ajwy<nal.a> ajwy3, lni.a aVar, lbp lbp, kvl kvl, zgb zgb, ajwy<dib> ajwy4, ajwy<zpo> ajwy5) {
        ajwy<dib> ajwy6 = ajwy4;
        ajwy<a> ajwy7 = ajwy;
        akcr.b(ajwy, "lensesDataComponentBuilder");
        ajwy<kws.a> ajwy8 = ajwy2;
        akcr.b(ajwy8, "lensesBitmojiComponentBuilder");
        ajwy<nal.a> ajwy9 = ajwy3;
        akcr.b(ajwy9, "lensesUsageComponentBuilder");
        lni.a aVar2 = aVar;
        akcr.b(aVar2, "lensesUserComponentBuilder");
        lbp lbp2 = lbp;
        akcr.b(lbp2, "lensesConfigurationComponent");
        kvl kvl2 = kvl;
        akcr.b(kvl2, "lensesAnalyticsComponent");
        zgb zgb2 = zgb;
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(ajwy6, "blizzardEventLogger");
        ajwy<zpo> ajwy10 = ajwy5;
        akcr.b(ajwy10, "unlockablesApi");
        kus kus = kus.b;
        return (gnb) aiqf.a(new lft(kus, lbp.e(), ajwy6, new kuw.a.a(ajwy9, kus, ajwy7, kvl2, ajwy10, aVar2, ajwy8, lbp2, zgb2)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        ajwy ajwy4 = this.d;
        ajwy ajwy5 = this.e;
        ajwy ajwy6 = this.f;
        ajwy ajwy7 = this.g;
        return kuy.a(ajwy, ajwy2, ajwy3, (lni.a) ajwy4.get(), (lbp) ajwy5.get(), (kvl) ajwy6.get(), (zgb) ajwy7.get(), this.h, this.i);
    }
}
