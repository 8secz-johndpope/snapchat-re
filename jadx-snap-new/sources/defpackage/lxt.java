package defpackage;

import defpackage.lxs.b.a;

/* renamed from: lxt */
public final class lxt implements lxq {
    private final ajdp<lxs> a;
    private final lxr b;
    private final zfw c;

    /* renamed from: lxt$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            lxs lxs = (lxs) obj;
            akcr.b(lxs, "it");
            return lxs.a();
        }
    }

    /* renamed from: lxt$b */
    static final class b<T> implements ajfb<ajxm<? extends lxs, ? extends defpackage.lxs.b>> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((lxs) ajxm.a).accept((defpackage.lxs.b) ajxm.b);
        }
    }

    public lxt(ajdp<lxs> ajdp, lxr lxr, zfw zfw) {
        akcr.b(ajdp, "view");
        akcr.b(lxr, "debugUseCase");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = lxr;
        this.c = zfw;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajdp u = this.a.a((ajdw) this.c.l()).u(a.a);
        akbl akbl = lxu.b;
        if (akbl != null) {
            akbl = new lxv(akbl);
        }
        ajej f = u.p((ajfc) akbl).f(this.b.a());
        akcr.a((Object) f, "view\n                .ob…ribe(debugUseCase.inputs)");
        ajvv.a(ajei, f);
        u = this.b.b();
        akbl = lxu.a;
        if (akbl != null) {
            akbl = new lxv(akbl);
        }
        Object h = u.p((ajfc) akbl).h(a.a);
        ajdp ajdp = this.a;
        akcr.a(h, "viewModels");
        f = myu.a(ajdp, h).a((ajdw) this.c.l()).f((ajfb) b.a);
        akcr.a((Object) f, "pairLatest(view, viewMod…) -> view.accept(model) }");
        ajvv.a(ajei, f);
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
