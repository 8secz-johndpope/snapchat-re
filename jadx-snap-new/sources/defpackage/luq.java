package defpackage;

import defpackage.lvi.a;
import defpackage.lvi.b;

/* renamed from: luq */
public final class luq implements lvg {
    private final ajdp<lvi> a;
    private final lvh b;
    private final ajdu<b, b> c;
    private final zfw d;

    /* renamed from: luq$a */
    static final class a<T> implements ajfb<ajxm<? extends lvi, ? extends b>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((lvi) ajxm.a).accept((b) ajxm.b);
        }
    }

    /* renamed from: luq$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            lvi lvi = (lvi) obj;
            akcr.b(lvi, "it");
            return lvi.b();
        }
    }

    /* renamed from: luq$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (a) obj;
            akcr.b(obj, "event");
            if (akcr.a(obj, a.b.a)) {
                return lvh.a.a.a;
            }
            if (obj instanceof a.a) {
                mhs a;
                obj = ((a.a) obj).a;
                if (obj instanceof lvf.a.b) {
                    a = ((lvf.a.b) obj).a();
                } else if (akcr.a(obj, lvf.a.a.a)) {
                    a = defpackage.mhs.c.a;
                } else {
                    throw new ajxk();
                }
                return new lvh.a.b(a);
            }
            throw new ajxk();
        }
    }

    public luq(ajdp<lvi> ajdp, lvh lvh, ajdu<b, b> ajdu, zfw zfw) {
        akcr.b(ajdp, "view");
        akcr.b(lvh, "useCase");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = lvh;
        this.c = ajdu;
        this.d = zfw;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajdp b = this.b.b();
        akbl akbl = lur.a;
        if (akbl != null) {
            akbl = new lus(akbl);
        }
        Object j = b.p((ajfc) akbl).h(b.a.a).a(this.c).j(ajfu.a);
        ajdp ajdp = this.a;
        akcr.a(j, "viewModels");
        ajej f = myu.a(ajdp, j).a((ajdw) this.d.l()).f((ajfb) a.a);
        akcr.a((Object) f, "pairLatest(view, viewMod…) -> view.accept(model) }");
        ajvv.a(ajei, f);
        f = this.a.a((ajdw) this.d.l()).u(b.a).p(c.a).f(this.b.a());
        akcr.a((Object) f, "view\n                .ob…subscribe(useCase.inputs)");
        ajvv.a(ajei, f);
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
