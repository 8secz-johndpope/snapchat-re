package defpackage;

import defpackage.ltr.b;
import defpackage.ltr.b.a;

/* renamed from: ltt */
public final class ltt implements ltp {
    private final ajdp<ltr> a;
    private final ltq b;
    private final ajdu<b, b> c;
    private final zfw d;

    /* renamed from: ltt$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ltr ltr = (ltr) obj;
            akcr.b(ltr, "view");
            return ltr.a();
        }
    }

    /* renamed from: ltt$b */
    static final class b<T> implements ajfb<ajxm<? extends ltr, ? extends defpackage.ltr.b>> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((ltr) ajxm.a).accept((defpackage.ltr.b) ajxm.b);
        }
    }

    public ltt(ajdp<ltr> ajdp, ltq ltq, ajdu<b, b> ajdu, zfw zfw) {
        akcr.b(ajdp, "view");
        akcr.b(ltq, "useCase");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = ltq;
        this.c = ajdu;
        this.d = zfw;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajdp b = this.b.b();
        akbl akbl = ltu.a;
        if (akbl != null) {
            akbl = new ltv(akbl);
        }
        Object j = b.p((ajfc) akbl).a(this.c).h(a.a).j(ajfu.a);
        ajdp u = this.a.a((ajdw) this.d.l()).u(a.a);
        akbl akbl2 = ltu.b;
        if (akbl2 != null) {
            akbl2 = new ltv(akbl2);
        }
        ajej f = u.p((ajfc) akbl2).f(this.b.a());
        akcr.a((Object) f, "view\n                .ob…subscribe(useCase.inputs)");
        ajvv.a(ajei, f);
        u = this.a;
        akcr.a(j, "viewModelsObservable");
        ajej f2 = myu.a(u, j).a((ajdw) this.d.l()).f((ajfb) b.a);
        akcr.a((Object) f2, "pairLatest(view, viewMod…) -> view.accept(model) }");
        ajvv.a(ajei, f2);
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
