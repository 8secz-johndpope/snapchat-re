package defpackage;

import defpackage.mhs.a;
import defpackage.mjn.c;
import defpackage.mjn.d;
import defpackage.mjn.d.b;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: mwv */
public final class mwv implements mwz {
    final mwe a;
    final mwy b;
    private final ajdp c;
    private final ajdp<mmt> d;

    /* renamed from: mwv$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final e a = new e();

        /* renamed from: mwv$e$a */
        public static final class a<T> implements ajfl<d> {
            public static final a a = new a();

            public final /* synthetic */ boolean test(Object obj) {
                d dVar = (d) obj;
                akcr.b(dVar, "it");
                return dVar.b() instanceof c.d;
            }
        }

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "it");
            obj = mmt.g().a().a((ajfl) a.a);
            akcr.a(obj, "requests.filter { it.int…faceControl.ModalDialog }");
            return obj;
        }
    }

    /* renamed from: mwv$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "it");
            return mmt.a().b();
        }
    }

    /* renamed from: mwv$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ mwv a;

        b(mwv mwv) {
            this.a = mwv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            defpackage.mmi.c.a.b bVar = (defpackage.mmi.c.a.b) obj;
            akcr.b(bVar, "it");
            obj = this.a.a.a(new defpackage.mwe.a.b(bVar.a)).b((ajfl) c.a).d((ajfc) d.a).j();
            akcr.a(obj, "lensRepository.query(Len…          .toObservable()");
            return obj;
        }
    }

    /* renamed from: mwv$f */
    static final class f<T1, T2> implements ajey<ajxm<? extends d, ? extends mux>, ajxm<? extends d, ? extends mux>> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            ajxm ajxm = (ajxm) obj;
            ajxm ajxm2 = (ajxm) obj2;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            akcr.b(ajxm2, "<name for destructuring parameter 1>");
            return akcr.a((d) ajxm.a, (d) ajxm2.a) && akcr.a(((mux) ajxm.b).a, ((mux) ajxm2.b).a);
        }
    }

    /* renamed from: mwv$g */
    static final class g<T> implements ajfl<ajxm<? extends d, ? extends mux>> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            return akcr.a(((d) ajxm.a).a(), ((mux) ajxm.b).a);
        }
    }

    /* renamed from: mwv$h */
    static final class h<T, R> implements ajfc<ajxm<? extends d, ? extends mux>, ajdb> {
        private /* synthetic */ mwv a;

        h(mwv mwv) {
            this.a = mwv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx a;
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            d dVar = (d) ajxm.a;
            mux mux = (mux) ajxm.b;
            if (dVar instanceof b) {
                c b = dVar.b();
                if (b != null) {
                    c.d dVar2 = (c.d) b;
                    Map b2 = mux.h.b();
                    a = this.a.b.a(new mwy.b(mux.f, (String) b2.get(dVar2.a), a.a(dVar2.a), (String) b2.get(dVar2.b), a.a(dVar2.b), false, null, null, 224));
                } else {
                    throw new ajxt("null cannot be cast to non-null type com.snap.lenses.core.ClientInterfaceProcessor.InterfaceControl.ModalDialog");
                }
            }
            a = ajvo.a(ajhn.a);
            return a;
        }
    }

    /* renamed from: mwv$c */
    static final class c<T> implements ajfl<List<? extends mux>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return !((Collection) list).isEmpty();
        }
    }

    /* renamed from: mwv$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return (mux) ajyu.f(list);
        }
    }

    public mwv(ajdp<mmt> ajdp, mwe mwe, mwy mwy) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mwe, "lensRepository");
        akcr.b(mwy, "modalDialogLauncher");
        this.d = ajdp;
        this.a = mwe;
        this.b = mwy;
        Object u = this.d.u(e.a);
        akcr.a(u, "lensCore.switchMap { it.…sor.modalDialogRequests }");
        Object u2 = this.d.u(a.a);
        akcr.a(u2, "lensCore.switchMap { it.…licator.filterLifecycle }");
        u2 = u2.b(mmi.c.a.b.class);
        akcr.a(u2, "ofType(R::class.java)");
        u2 = u2.u(new b(this));
        akcr.a(u2, "lensCore.switchMap { it.…chMap { lensById(it.id) }");
        u = ajwa.a(u, u2).a((ajey) f.a).a((ajfl) g.a).v(new h(this)).h();
        akcr.a(u, "Observables.combineLates…          .toObservable()");
        this.c = u;
    }

    public final ajfb a() {
        return myr.a();
    }

    public final ajdp b() {
        return this.c;
    }
}
