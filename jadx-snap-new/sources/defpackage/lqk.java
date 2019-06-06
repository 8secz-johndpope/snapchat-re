package defpackage;

import defpackage.kqe.aa;
import defpackage.kqe.m;
import defpackage.lqh.a;
import defpackage.lqh.a.a.c;
import defpackage.lqh.b;
import defpackage.miq.f;
import defpackage.mmi.d;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: lqk */
public final class lqk implements lqh {
    final mib<a> a = mhv.a(TimeUnit.MILLISECONDS, this.g.h());
    final akbw<a, a, Boolean> b = p.a;
    final akbw<a, a, Boolean> c = o.a;
    final ajdp<mmt> d;
    final mwe e;
    final miw f;
    final zfw g;
    final kqf h;
    private final ajfb<a> i = this.a.a();
    private final ajxe j = ajxh.a(new d(this));
    private final ajxe k = ajxh.a(new c(this));
    private final ajxe l = ajxh.a(new b(this));

    /* renamed from: lqk$p */
    static final class p extends akcs implements akbw<a, a, Boolean> {
        public static final p a = new p();

        p() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            obj = (a) obj;
            obj2 = (a) obj2;
            akcr.b(obj, "previous");
            akcr.b(obj2, "next");
            boolean z = false;
            if (obj instanceof a.a.a) {
                if (obj2 instanceof a.a.a) {
                    a.a.a aVar = (a.a.a) obj2;
                    if (aVar.a == 0 && aVar.b == 0) {
                        z = true;
                    }
                }
            } else if (!((obj2 instanceof c) && ((c) obj2).b)) {
                z = akcr.a(obj, obj2);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: lqk$o */
    static final class o extends akcs implements akbw<a, a, Boolean> {
        public static final o a = new o();

        o() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            boolean z;
            a aVar = (a) obj;
            a aVar2 = (a) obj2;
            akcr.b(aVar, "previous");
            akcr.b(aVar2, "next");
            if ((aVar instanceof c) && (aVar2 instanceof c)) {
                c cVar = (c) aVar2;
                if (akcr.a(((c) aVar).a, cVar.a) && !cVar.b) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: lqk$d */
    static final class d extends akcs implements akbk<ajdp<b>> {
        final /* synthetic */ lqk a;

        /* renamed from: lqk$d$a */
        static final class a extends akcs implements akbl<lov, ajdp<? extends b>> {
            private /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                lov lov = (lov) obj;
                akcr.b(lov, "actions");
                Object obj2 = lov.b;
                String str = "empty()";
                lqk lqk;
                if (akcr.a(obj2, defpackage.lqh.a.b.a)) {
                    if ((akcr.a(lov.a, defpackage.lqh.a.b.a) ^ 1) != 0) {
                        lqk = this.a.a;
                        obj = lqk.d.u(new g(lqk));
                        akcr.a(obj, "lensCore\n               …      }\n                }");
                        return obj;
                    }
                    obj = ajvo.a(ajot.a);
                    akcr.a(obj, str);
                    return obj;
                } else if (obj2 instanceof defpackage.lqh.a.a) {
                    if (lov.a()) {
                        this.a.a.h.a(m.b);
                    }
                    lqk lqk2 = this.a.a;
                    defpackage.lqh.a.a aVar = (defpackage.lqh.a.a) obj2;
                    boolean a = lov.a();
                    if (aVar instanceof c) {
                        c cVar = (c) aVar;
                        obj = lqk2.d.u(new e(lqk2, aVar)).h((ajdt) ajdp.b(new defpackage.lqh.b.a.b.b(cVar.a, cVar.c)));
                        akcr.a(obj, "lensCore.switchMap { res…                      )))");
                        return obj;
                    } else if (aVar instanceof defpackage.lqh.a.a.a) {
                        obj = lqk2.d.u(new f(lqk2, aVar, a)).h((ajdt) ajdp.b(new defpackage.lqh.b.a.a(((defpackage.lqh.a.a.a) aVar).c))).j(ajfu.a);
                        akcr.a(obj, "lensCore.switchMap { res…  .distinctUntilChanged()");
                        return obj;
                    } else if (aVar instanceof defpackage.lqh.a.a.b) {
                        obj = ajdp.b(new defpackage.lqh.b.a.b.a(((defpackage.lqh.a.a.b) aVar).a));
                        akcr.a(obj, "just(CameraUseCase.Resul…stLens(tag = action.tag))");
                        return obj;
                    } else {
                        throw new ajxk();
                    }
                } else if (!(obj2 instanceof defpackage.lqh.a.c)) {
                    throw new ajxk();
                } else if ((akcr.a(lov.a, defpackage.lqh.a.b.a) ^ 1) != 0) {
                    lqk = this.a.a;
                    obj = lqk.d.a((ajfc) new j(lqk, (defpackage.lqh.a.c) obj2));
                    akcr.a(obj, "lensCore\n               …RT_TAG)\n                }");
                    return obj;
                } else {
                    obj = ajvo.a(ajot.a);
                    akcr.a(obj, str);
                    return obj;
                }
            }
        }

        /* renamed from: lqk$d$1 */
        static final class 1<T1, T2, R> implements ajex<R, T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                lov lov = (lov) obj;
                a aVar = (a) obj2;
                akcr.b(lov, "previousActions");
                akcr.b(aVar, "action");
                return new lov(lov.b, aVar);
            }
        }

        d(lqk lqk) {
            this.a = lqk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            final akbl aVar = new a(this);
            lqk lqk = this.a;
            ajdp ajdp = (ajdp) lqk.a.invoke();
            akbw akbw = this.a.b;
            if (akbw != null) {
                akbw = new lqm(akbw);
            }
            ajdp = ajdp.a((ajey) akbw);
            akbw = this.a.c;
            if (akbw != null) {
                akbw = new lqm(akbw);
            }
            Object a = ajdp.a((ajey) akbw);
            akcr.a(a, "observableInput()\n      …tionOfAlreadyAppliedLens)");
            a = a.b(lov.c, (ajex) 1.a).b(1);
            akcr.a(a, "observableInput()\n      …\n                .skip(1)");
            Object u = mip.c(a, "DefaultCameraUseCase:actionsToResult").u(new ajfc<T, ajdt<? extends R>>() {
                public final /* synthetic */ Object apply(Object obj) {
                    lov lov = (lov) obj;
                    akcr.b(lov, "actions");
                    return (ajdp) aVar.invoke(lov);
                }
            });
            akcr.a(u, "observableInput()\n      …ctions)\n                }");
            ajdp a2 = ajpy.k(u).a();
            a = a2.a((ajfl) a.a).a(b.a.class);
            akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
            u = a2.a((ajdb) a.c(1).u(new q(lqk)).a((ajfl) s.a).a((ajfc) new r(lqk), false)).h(b.b.a);
            akcr.a(u, "observableInput()\n      …eCase.Result.Deactivated)");
            return mip.c(cfc.a(u), "DefaultCameraUseCase:resultDownstream");
        }
    }

    /* renamed from: lqk$c */
    static final class c extends akcs implements akbk<ajdp<low>> {
        private /* synthetic */ lqk a;

        /* renamed from: lqk$c$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                return mmt.a().b();
            }
        }

        c(lqk lqk) {
            this.a = lqk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object k = this.a.d.k((ajfc) 1.a);
            akcr.a(k, "lensCore.flatMap { it.fi…licator.filterLifecycle }");
            akbl akbl = lql.a;
            if (akbl != null) {
                akbl = new lqn(akbl);
            }
            return ajpy.k(k.u((ajfc) akbl)).a();
        }
    }

    /* renamed from: lqk$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.lqh.b.a>> {
        private /* synthetic */ lqk a;

        b(lqk lqk) {
            this.a = lqk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return lql.a(((ajdp) this.a.k.b()));
        }
    }

    /* renamed from: lqk$a */
    public static final class a<T> implements ajfl<Object> {
        public static final a a = new a();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof defpackage.lqh.b.a;
        }
    }

    /* renamed from: lqk$q */
    static final class q<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lqk a;

        q(lqk lqk) {
            this.a = lqk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((b.a) obj, "it");
            return this.a.f.a(miw.b.a.a).a(mja.CAMERA_LENSES_ACTIVATED);
        }
    }

    /* renamed from: lqk$s */
    static final class s<T> implements ajfl<Boolean> {
        public static final s a = new s();

        s() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return !bool.booleanValue();
        }
    }

    /* renamed from: lqk$r */
    static final class r<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ lqk a;

        r(lqk lqk) {
            this.a = lqk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return this.a.f.a().a((mje) mja.CAMERA_LENSES_ACTIVATED, true).a();
        }
    }

    /* renamed from: lqk$f */
    static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lqk a;
        private /* synthetic */ a.a b;
        private /* synthetic */ boolean c;

        f(lqk lqk, a.a aVar, boolean z) {
            this.a = lqk;
            this.b = aVar;
            this.c = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "it");
            lqk lqk = this.a;
            a.a.a aVar = (a.a.a) this.b;
            boolean z = this.c;
            String str = aVar.c;
            Object d = mmt.t().a().b(new mpb.a(aVar.a, aVar.b)).d((ajfc) new i(lqk));
            akcr.a(d, "lensCore.tracker.activat…ilterLifecycleAsResults }");
            obj = mie.a(mmt.a().d()).d((ajfc) new h(z, d));
            akcr.a(obj, "lensCore.filterApplicato…      }\n                }");
            obj = lql.a(obj, str);
            akcr.a(obj, "lensCore.filterApplicato…            .tagWith(tag)");
            return obj;
        }
    }

    /* renamed from: lqk$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lqk a;
        private /* synthetic */ a.a b;

        e(lqk lqk, a.a aVar) {
            this.a = lqk;
            this.b = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "it");
            lqk lqk = this.a;
            mhs.b bVar = ((c) this.b).a;
            boolean z = ((c) this.b).b;
            String str = ((c) this.b).c;
            mwe.a.b bVar2 = new mwe.a.b(bVar);
            Object p = lqk.e.a(bVar2).j().a((ajfl) k.a).p(l.a);
            akcr.a(p, "lensRepository.query(que…           .map { it[0] }");
            p = mip.c(p, "DefaultCameraUseCase:resultsWhenWithLens").a((ajey) m.a);
            akcr.a(p, "lensRepository.query(que…mageUri\n                }");
            StringBuilder stringBuilder = new StringBuilder("lenses[");
            stringBuilder.append(bVar2);
            stringBuilder.append(']');
            obj = p.u(new n(lqk, mmt, z, str));
            akcr.a(obj, "lensRepository.query(que…      }\n                }");
            return obj;
        }
    }

    /* renamed from: lqk$k */
    static final class k<T> implements ajfl<List<? extends mux>> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return !((Collection) list).isEmpty();
        }
    }

    /* renamed from: lqk$l */
    static final class l<T, R> implements ajfc<T, R> {
        public static final l a = new l();

        l() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return (mux) list.get(0);
        }
    }

    /* renamed from: lqk$m */
    static final class m<T1, T2> implements ajey<mux, mux> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            mux mux = (mux) obj;
            mux mux2 = (mux) obj2;
            akcr.b(mux, "prev");
            akcr.b(mux2, "curr");
            return akcr.a(mux.a, mux2.a) && akcr.a(mux.b, mux2.b) && akcr.a(mux.g, mux2.g);
        }
    }

    /* renamed from: lqk$n */
    static final class n<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ lqk a;
        final /* synthetic */ mmt b;
        final /* synthetic */ String c;
        private /* synthetic */ boolean d;

        /* renamed from: lqk$n$3 */
        static final class 3<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ n a;

            3(n nVar) {
                this.a = nVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "applied");
                if (!bool.booleanValue()) {
                    return ajvo.a(ajot.a);
                }
                obj = lql.a(((ajdp) this.a.a.k.b()));
                akcr.a(obj, "filterLifecycleAsResults…istinctActivatedResults()");
                return lql.a(obj, this.a.c);
            }
        }

        /* renamed from: lqk$n$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Boolean) obj, "it");
                return Boolean.FALSE;
            }
        }

        n(lqk lqk, mmt mmt, boolean z, String str) {
            this.a = lqk;
            this.b = mmt;
            this.d = z;
            this.c = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajdx f;
            final mux mux = (mux) obj;
            akcr.b(mux, "lensToApply");
            if (mux.b instanceof f) {
                f = mie.a(this.b.a().d()).f(1.a);
            } else if (mux.g instanceof f) {
                f = ajvo.a(ajsn.a);
            } else {
                ajdx a;
                this.a.h.a(new aa(mux.a.a));
                if (this.d) {
                    a = mie.a(this.b.a().d());
                } else {
                    a = ajdx.b(ajxw.a);
                    akcr.a((Object) a, "Single.just(Unit)");
                }
                f = a.a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                    private /* synthetic */ n a;

                    public final /* synthetic */ Object apply(Object obj) {
                        return this.a.b.a().a().b(new d(mux.a, mux.b, true, mux.g, mux.d, null, 140));
                    }
                });
            }
            return f.d((ajfc) new 3(this));
        }
    }

    /* renamed from: lqk$g */
    static final class g<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lqk a;

        /* renamed from: lqk$g$1 */
        static final class 1<T, R> implements ajfc<Throwable, Boolean> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Throwable) obj, "it");
                return Boolean.FALSE;
            }
        }

        /* renamed from: lqk$g$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Boolean) obj, "it");
                return ajdp.b(b.b.a);
            }
        }

        g(lqk lqk) {
            this.a = lqk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "lensCore");
            return mie.a(mmt.a().d()).c(1, TimeUnit.SECONDS, this.a.g.b()).g(1.a).d((ajfc) 2.a);
        }
    }

    /* renamed from: lqk$h */
    static final class h<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ boolean a;
        private /* synthetic */ ajdp b;

        h(boolean z, ajdp ajdp) {
            this.a = z;
            this.b = ajdp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return this.a ? this.b.h(new b.a.a()) : ajdp.b(new b.a.a());
        }
    }

    /* renamed from: lqk$i */
    static final class i<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lqk a;

        i(lqk lqk) {
            this.a = lqk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return ((ajdp) this.a.l.b());
        }
    }

    /* renamed from: lqk$j */
    static final class j<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ lqk a;
        private /* synthetic */ a.c b;

        /* renamed from: lqk$j$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ j a;

            1(j jVar) {
                this.a = jVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Boolean) obj, "it");
                return ((ajdp) this.a.a.l.b());
            }
        }

        j(lqk lqk, a.c cVar) {
            this.a = lqk;
            this.b = cVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "lensCore");
            obj = mmt.t().b().c(new mpb.b.a(this.b.a, this.b.b)).u(new 1(this));
            akcr.a(obj, "lensCore.tracker.restart…ilterLifecycleAsResults }");
            return lql.a(obj, "Restart");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lqk.class), "outputs", "getOutputs()Lio/reactivex/Observable;"), new akdc(akde.a(lqk.class), "filterLifecycleAsResultsWithStatus", "getFilterLifecycleAsResultsWithStatus()Lio/reactivex/Observable;"), new akdc(akde.a(lqk.class), "filterLifecycleAsResults", "getFilterLifecycleAsResults()Lio/reactivex/Observable;")};
    }

    public lqk(ajdp<mmt> ajdp, mwe mwe, miw miw, zfw zfw, kqf kqf) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mwe, "lensRepository");
        akcr.b(miw, "configurationRepository");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(kqf, "analyticsEventHandler");
        this.d = ajdp;
        this.e = mwe;
        this.f = miw;
        this.g = zfw;
        this.h = kqf;
    }

    public final ajfb<a> a() {
        return this.i;
    }

    public final ajdp<b> b() {
        return (ajdp) this.j.b();
    }
}
