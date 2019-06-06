package defpackage;

import defpackage.nab.a;

/* renamed from: mzp */
public final class mzp implements mzz {
    private final ajdp<nab> a;
    private final naa b;
    private final ajdu<a, a> c;
    private final zfw d;

    /* renamed from: mzp$a */
    static final class a<T> implements ajfb<ajxm<? extends nab, ? extends defpackage.nab.a>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((nab) ajxm.a).accept((defpackage.nab.a) ajxm.b);
        }
    }

    public mzp(ajdp<nab> ajdp, naa naa, ajdu<a, a> ajdu, zfw zfw) {
        akcr.b(ajdp, "viewProvider");
        akcr.b(naa, "touchUseCase");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = naa;
        this.c = ajdu;
        this.d = zfw;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajdp b = this.b.b();
        akbl akbl = mzq.a;
        if (akbl != null) {
            akbl = new mzr(akbl);
        }
        Object a = b.p((ajfc) akbl).h(a.a.a).a(this.c);
        ajdp ajdp = this.a;
        akcr.a(a, "viewModels");
        ajei.a(myu.a(ajdp, a).a((ajdw) this.d.l()).f((ajfb) a.a));
        ajei.a(ajdx.b(naa.a.a.a).e(this.b.a()));
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
