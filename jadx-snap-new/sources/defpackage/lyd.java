package defpackage;

import defpackage.lyx.a;
import defpackage.lyx.b;

/* renamed from: lyd */
public final class lyd implements lyv {
    final lyw a;
    private final ajdp<lyx> b;
    private final ajdu<b, b> c;
    private final zfw d;

    /* renamed from: lyd$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            lyx lyx = (lyx) obj;
            akcr.b(lyx, "it");
            return lyx.a();
        }
    }

    /* renamed from: lyd$b */
    static final class b<T> implements ajfl<a> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            obj = (a) obj;
            akcr.b(obj, "it");
            return akcr.a(obj, a.a.a);
        }
    }

    /* renamed from: lyd$c */
    static final class c<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
        private /* synthetic */ lyd a;

        /* renamed from: lyd$c$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.lyw.b.a;
            }
        }

        c(lyd lyd) {
            this.a = lyd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajdp) obj, "it");
            obj = this.a.a.b().a((ajfl) a.a).a(lyw.b.a.class);
            akcr.a(obj, "this.filter { it is R }.cast(R::class.java)");
            return obj;
        }
    }

    /* renamed from: lyd$d */
    static final class d<T> implements ajfb<ajxm<? extends lyx, ? extends b>> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((lyx) ajxm.a).accept((b) ajxm.b);
        }
    }

    public lyd(ajdp<lyx> ajdp, lyw lyw, ajdu<b, b> ajdu, zfw zfw) {
        akcr.b(ajdp, "viewProvider");
        akcr.b(lyw, "useCase");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(zfw, "qualifiedSchedulers");
        this.b = ajdp;
        this.a = lyw;
        this.c = ajdu;
        this.d = zfw;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajdp b = this.a.b();
        akbl akbl = lye.a;
        if (akbl != null) {
            akbl = new lyf(akbl);
        }
        Object j = b.u((ajfc) akbl).a(this.c).h(b.a.a).j(ajfu.a);
        ajdp t = this.b.a((ajdw) this.d.l()).u(a.a).c((ajfl) b.a).t(new c(this));
        akbl akbl2 = lye.b;
        if (akbl2 != null) {
            akbl2 = new lyf(akbl2);
        }
        ajej f = t.p((ajfc) akbl2).f(this.a.a());
        akcr.a((Object) f, "viewProvider\n           …subscribe(useCase.inputs)");
        ajvv.a(ajei, f);
        t = this.b;
        akcr.a(j, "viewModels");
        ajej f2 = myu.a(t, j).a((ajdw) this.d.l()).f((ajfb) d.a);
        akcr.a((Object) f2, "pairLatest(viewProvider,…) -> view.accept(model) }");
        ajvv.a(ajei, f2);
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
