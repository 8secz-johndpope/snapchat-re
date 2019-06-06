package defpackage;

import defpackage.lum.b;
import defpackage.lum.b.a;

/* renamed from: ltz */
public final class ltz implements luk {
    private final ajdp<lum> a;
    private final lul b;
    private final ajdu<b, b> c;
    private final zfw d;

    /* renamed from: ltz$a */
    static final class a<T> implements ajfb<ajxm<? extends lum, ? extends b>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((lum) ajxm.a).accept((b) ajxm.b);
        }
    }

    /* renamed from: ltz$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            lum lum = (lum) ajxm.a;
            final defpackage.lum.b bVar = (defpackage.lum.b) ajxm.b;
            return bVar instanceof a ? lum.a().p(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((lum.a) obj, "it");
                    return new lul.a.a(((a) bVar).a);
                }
            }) : ajvo.a(ajot.a);
        }
    }

    public ltz(ajdp<lum> ajdp, lul lul, ajdu<b, b> ajdu, zfw zfw) {
        akcr.b(ajdp, "viewProvider");
        akcr.b(lul, "useCase");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = lul;
        this.c = ajdu;
        this.d = zfw;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajdp b = this.b.b();
        akbl akbl = lua.a;
        if (akbl != null) {
            akbl = new lub(akbl);
        }
        Object j = b.p((ajfc) akbl).a(this.c).h(b.b.a).j(ajfu.a);
        Object a = this.a.a((ajdw) this.d.l());
        akcr.a(a, "view");
        akcr.a(j, "viewModels");
        b = ajpy.k(myu.a(a, j)).a().a((ajdw) this.d.l());
        ajej f = b.f((ajfb) a.a);
        akcr.a((Object) f, "viewModel.subscribe { (v, m) -> v.accept(m) }");
        ajvv.a(ajei, f);
        ajej f2 = b.u(b.a).f(this.b.a());
        akcr.a((Object) f2, "viewModel\n              …subscribe(useCase.inputs)");
        ajvv.a(ajei, f2);
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
