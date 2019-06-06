package defpackage;

import defpackage.mgu.a;
import defpackage.mgv.a.b;

/* renamed from: mgn */
public final class mgn implements mgt {
    private final ajdp<mgv> a;
    private final mgu b;
    private final zfw c;

    /* renamed from: mgn$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "it");
            if (aVar instanceof defpackage.mgu.a.b) {
                return new defpackage.mgv.a.b(((defpackage.mgu.a.b) aVar).a);
            }
            if (aVar instanceof a.a) {
                return mgv.a.a.a;
            }
            throw new ajxk();
        }
    }

    /* renamed from: mgn$c */
    static final class c<T1, T2> implements ajey<mgv.a, mgv.a> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            mgv.a aVar = (mgv.a) obj;
            mgv.a aVar2 = (mgv.a) obj2;
            akcr.b(aVar, "old");
            akcr.b(aVar2, "new");
            if (aVar instanceof mgv.a.a) {
                return akcr.a(akde.a(aVar.getClass()), akde.a(aVar2.getClass()));
            }
            if (aVar instanceof b) {
                return (aVar2 instanceof b) && akcr.a(((b) aVar).a, ((b) aVar2).a);
            } else {
                throw new ajxk();
            }
        }
    }

    /* renamed from: mgn$a */
    static final class a<T> implements ajfb<ajxm<? extends mgv, ? extends defpackage.mgv.a>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((mgv) ajxm.a).accept((defpackage.mgv.a) ajxm.b);
        }
    }

    public mgn(ajdp<mgv> ajdp, mgu mgu, zfw zfw) {
        akcr.b(ajdp, "view");
        akcr.b(mgu, "useCase");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = mgu;
        this.c = zfw;
    }

    public final ajej a() {
        Object a = this.b.b().p(b.a).h(mgv.a.a.a).a((ajey) c.a);
        ajdp ajdp = this.a;
        akcr.a(a, "viewModels");
        a = myu.a(ajdp, a).a((ajdw) this.c.l()).f((ajfb) a.a);
        akcr.a(a, "pairLatest(view, viewMod…) -> view.accept(model) }");
        return a;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
