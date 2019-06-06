package defpackage;

import defpackage.mpl.c;
import defpackage.nba.a;

/* renamed from: nav */
public final class nav implements mha {
    private final ajdp<mmt> a;
    private final nba b;

    /* renamed from: nav$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "it");
            return mmt.u().a();
        }
    }

    /* renamed from: nav$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((defpackage.mpl.b) obj, "it");
            return a.a;
        }
    }

    /* renamed from: nav$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "it");
            return ajdp.b(mmt.u());
        }
    }

    /* renamed from: nav$c */
    static final class c<T1, T2, R> implements ajex<mpl, defpackage.mpl.c, ajxm<? extends mpl, ? extends defpackage.mpl.c>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            mpl mpl = (mpl) obj;
            defpackage.mpl.c cVar = (defpackage.mpl.c) obj2;
            akcr.b(mpl, "first");
            akcr.b(cVar, "second");
            return ajxs.a(mpl, cVar);
        }
    }

    /* renamed from: nav$d */
    static final class d<T> implements ajfb<ajxm<? extends mpl, ? extends c>> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((mpl) ajxm.a).a((c) ajxm.b);
        }
    }

    public nav(ajdp<mmt> ajdp, nba nba) {
        akcr.b(ajdp, "lensCore");
        akcr.b(nba, "userDataUseCase");
        this.a = ajdp;
        this.b = nba;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajej f = this.a.u(a.a).p(b.a).f(this.b.a());
        akcr.a((Object) f, "lensCore\n               …(userDataUseCase.actions)");
        ajvv.a(ajei, f);
        ajdp u = this.a.u(e.a);
        ajdp b = this.b.b();
        akbl akbl = naw.a;
        if (akbl != null) {
            akbl = new nax(akbl);
        }
        f = ajdp.a((ajdt) u, (ajdt) b.p((ajfc) akbl), (ajex) c.a).f((ajfb) d.a);
        akcr.a((Object) f, "Observable.combineLatest…first.accept(it.second) }");
        ajvv.a(ajei, f);
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
