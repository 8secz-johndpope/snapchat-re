package defpackage;

import defpackage.lzq.b;
import defpackage.lzq.b.a;

/* renamed from: lyz */
public final class lyz implements lzn {
    private final ajdp<lzq> a;
    private final lzp b;
    private final ajdu<b, b> c;
    private final zfw d;

    /* renamed from: lyz$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            lzp.b bVar = (lzp.b) obj;
            akcr.b(bVar, "result");
            return bVar instanceof lzp.b.b ? new b.b() : a.a;
        }
    }

    /* renamed from: lyz$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            lzq lzq = (lzq) obj;
            akcr.b(lzq, "it");
            return lzq.a();
        }
    }

    /* renamed from: lyz$b */
    static final class b<T> implements ajfb<ajxm<? extends lzq, ? extends defpackage.lzq.b>> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((lzq) ajxm.a).accept((defpackage.lzq.b) ajxm.b);
        }
    }

    public lyz(ajdp<lzq> ajdp, lzp lzp, ajdu<b, b> ajdu, zfw zfw) {
        akcr.b(ajdp, "viewProvider");
        akcr.b(lzp, "useCase");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = lzp;
        this.c = ajdu;
        this.d = zfw;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        Object j = this.b.b().p(c.a).a(this.c).j(ajfu.a);
        ajdp u = this.a.a((ajdw) this.d.l()).u(a.a);
        akbl akbl = lza.a;
        if (akbl != null) {
            akbl = new lzb(akbl);
        }
        ajej f = u.p((ajfc) akbl).f(this.b.a());
        akcr.a((Object) f, "viewProvider\n           …subscribe(useCase.inputs)");
        ajvv.a(ajei, f);
        u = this.a;
        akcr.a(j, "viewModels");
        ajej f2 = myu.a(u, j).a((ajdw) this.d.l()).f((ajfb) b.a);
        akcr.a((Object) f2, "pairLatest(viewProvider,…) -> view.accept(model) }");
        ajvv.a(ajei, f2);
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
