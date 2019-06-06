package defpackage;

import defpackage.mde.a.a;
import defpackage.mde.b;
import java.util.concurrent.TimeUnit;

/* renamed from: mcr */
public final class mcr implements mdc {
    private final ajdp<mde> a;
    private final ajdu<b, b> b;
    private final mdd c;
    private final zfw d;

    /* renamed from: mcr$f */
    static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mde mde = (mde) obj;
            akcr.b(mde, "it");
            return mde.a();
        }
    }

    /* renamed from: mcr$a */
    public static final class a<T> implements ajfl<Object> {
        public static final a a = new a();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof defpackage.mde.a.a;
        }
    }

    /* renamed from: mcr$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((a) obj, "it");
            return mdd.a.b.a;
        }
    }

    /* renamed from: mcr$b */
    public static final class b<T> implements ajfl<Object> {
        public static final b a = new b();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof defpackage.mde.a.b;
        }
    }

    /* renamed from: mcr$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((mde.a.b) obj, "it");
            return mdd.a.a.a;
        }
    }

    /* renamed from: mcr$g */
    static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mdd.b bVar = (mdd.b) obj;
            akcr.b(bVar, "it");
            if (bVar instanceof mdd.b.b) {
                return new b.b();
            }
            if (bVar instanceof mdd.b.a) {
                return new b.a(((mdd.b.a) bVar).a);
            }
            throw new ajxk();
        }
    }

    /* renamed from: mcr$h */
    static final class h<T1, T2> implements ajey<b, b> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            b bVar = (b) obj;
            b bVar2 = (b) obj2;
            akcr.b(bVar, "old");
            akcr.b(bVar2, "new");
            if (bVar instanceof b.b) {
                return akcr.a(akde.a(bVar.getClass()), akde.a(bVar2.getClass()));
            }
            if (bVar instanceof b.a) {
                return false;
            }
            throw new ajxk();
        }
    }

    /* renamed from: mcr$c */
    static final class c<T> implements ajfb<ajxm<? extends mde, ? extends b>> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((mde) ajxm.a).accept((b) ajxm.b);
        }
    }

    public mcr(ajdp<mde> ajdp, ajdu<b, b> ajdu, mdd mdd, zfw zfw) {
        akcr.b(ajdp, "view");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(mdd, "slugUseCase");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = ajdu;
        this.c = mdd;
        this.d = zfw;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        Object u = this.a.a((ajdw) this.d.l()).u(f.a);
        akcr.a(u, "viewEvents");
        Object a = u.a((ajfl) a.a).a(a.class);
        String str = "this.filter { it is R }.cast(R::class.java)";
        akcr.a(a, str);
        a = a.p(d.a);
        akcr.a(a, "viewEvents\n             …SlugUseCase.Action.Open }");
        u = u.a((ajfl) b.a).a(mde.a.b.class);
        akcr.a(u, str);
        u = u.d(3000, TimeUnit.MILLISECONDS, this.d.b()).p(e.a);
        akcr.a(u, "viewEvents\n             …UseCase.Action.Activate }");
        ajej f = a.e((ajdt) u).f(this.c.a());
        akcr.a((Object) f, "badgeClickEvents.mergeWi…cribe(slugUseCase.inputs)");
        ajvv.a(ajei, f);
        u = this.c.b().p(g.a).h(new b.b()).a(this.b).a((ajey) h.a);
        ajdp ajdp = this.a;
        akcr.a(u, "viewModels");
        f = myu.a(ajdp, u).a((ajdw) this.d.l()).f((ajfb) c.a);
        akcr.a((Object) f, "pairLatest(view, viewMod…) -> view.accept(model) }");
        ajvv.a(ajei, f);
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
