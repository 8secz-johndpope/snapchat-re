package defpackage;

import defpackage.mep.b;
import defpackage.mep.b.a;

/* renamed from: mee */
public final class mee implements men {
    private final ajdp<mep> a;
    private final meo b;
    private final zfw c;

    /* renamed from: mee$a */
    static final class a<T> implements ajfb<ajxm<? extends mep, ? extends b>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((mep) ajxm.a).accept((b) ajxm.b);
        }
    }

    /* renamed from: mee$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mep mep = (mep) obj;
            akcr.b(mep, "it");
            return mep.a();
        }
    }

    public mee(ajdp<mep> ajdp, meo meo, zfw zfw) {
        akcr.b(ajdp, "viewProvider");
        akcr.b(meo, "useCase");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = meo;
        this.c = zfw;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajdp b = this.b.b();
        akbl akbl = mef.a;
        if (akbl != null) {
            akbl = new meg(akbl);
        }
        Object j = b.p((ajfc) akbl).h(a.a).j(ajfu.a);
        akcr.a(j, "useCase.outputs\n        …  .distinctUntilChanged()");
        ajej f = myu.a(this.a, j).a((ajdw) this.c.l()).f((ajfb) a.a);
        akcr.a((Object) f, "pairLatest(viewProvider,…) -> view.accept(model) }");
        ajvv.a(ajei, f);
        b = this.a.u(b.a);
        akbl = mef.b;
        if (akbl != null) {
            akbl = new meg(akbl);
        }
        f = b.p((ajfc) akbl).f(this.b.a());
        akcr.a((Object) f, "viewProvider\n           …subscribe(useCase.inputs)");
        ajvv.a(ajei, f);
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
