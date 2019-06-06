package defpackage;

import defpackage.lxb.b.a;
import defpackage.lxc.b;

/* renamed from: lxe */
public final class lxe implements lxa {
    private final ajdp<lxc> a;
    private final lxb b;
    private final ajdu<b, b> c;
    private final zfw d;

    /* renamed from: lxe$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            lxb.b bVar = (lxb.b) obj;
            akcr.b(bVar, "it");
            if (bVar instanceof lxb.b.b) {
                return new b.b(((lxb.b.b) bVar).a);
            }
            if (bVar instanceof a) {
                return b.a.a;
            }
            throw new ajxk();
        }
    }

    /* renamed from: lxe$a */
    static final class a<T> implements ajfb<ajxm<? extends lxc, ? extends b>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((lxc) ajxm.a).accept((b) ajxm.b);
        }
    }

    /* renamed from: lxe$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            lxc lxc = (lxc) obj;
            akcr.b(lxc, "it");
            return lxc.a();
        }
    }

    /* renamed from: lxe$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            lxc.a aVar = (lxc.a) obj;
            akcr.b(aVar, "it");
            if (aVar instanceof lxc.a.a) {
                return new lxb.a.a(((lxc.a.a) aVar).a);
            }
            throw new ajxk();
        }
    }

    public lxe(ajdp<lxc> ajdp, lxb lxb, ajdu<b, b> ajdu, zfw zfw) {
        akcr.b(ajdp, "view");
        akcr.b(lxb, "ctaUseCase");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = lxb;
        this.c = ajdu;
        this.d = zfw;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        Object j = this.b.b().p(d.a).a(this.c).h(b.a.a).j(ajfu.a);
        ajdp ajdp = this.a;
        akcr.a(j, "viewModel");
        ajej f = myu.a(ajdp, j).a((ajdw) this.d.l()).f((ajfb) a.a);
        akcr.a((Object) f, "pairLatest(view, viewMod…) -> view.accept(model) }");
        ajvv.a(ajei, f);
        f = this.a.a((ajdw) this.d.l()).u(b.a).p(c.a).f(this.b.a());
        akcr.a((Object) f, "view\n                .ob…scribe(ctaUseCase.inputs)");
        ajvv.a(ajei, f);
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
