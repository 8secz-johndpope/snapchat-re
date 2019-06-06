package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mec.a;
import defpackage.mec.a.d.b;
import defpackage.mec.c;

/* renamed from: mdp */
public final class mdp implements mec {
    final ajws<a> a;
    final ajxe b = ajxh.a(new b(this));
    final ajxe c = ajxh.a(new a(this));
    final ajdp<mmt> d;
    final ajdp<lqf> e;
    private final ajxe f = ajxh.a(new d(this));
    private final ajxe g = ajxh.a(new e(this));

    /* renamed from: mdp$c */
    static final class c extends akcq implements akbl<a, ajxw> {
        c(ajws ajws) {
            super(1, ajws);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajws.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "p1");
            ((ajws) this.receiver).a((Object) aVar);
            return ajxw.a;
        }
    }

    /* renamed from: mdp$d */
    static final class d extends akcs implements akbk<ajdp<c>> {
        final /* synthetic */ mdp a;

        /* renamed from: mdp$d$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ d a;

            1(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                obj = (a) obj;
                akcr.b(obj, "action");
                if (akcr.a(obj, defpackage.mec.a.d.a.a)) {
                    return ajdp.b(defpackage.mec.c.d.a.a);
                }
                if (akcr.a(obj, b.a)) {
                    return ajdp.b(defpackage.mec.c.d.b.a);
                }
                if (akcr.a(obj, a.c.a)) {
                    return ajdp.b(c.c.a);
                }
                if (akcr.a(obj, a.a.a)) {
                    return ajdp.b(c.a.a).c((ajdt) (ajdp) this.a.a.b.b());
                }
                if (akcr.a(obj, a.b.a)) {
                    return ((ajdp) this.a.a.g.b());
                }
                throw new ajxk();
            }
        }

        d(mdp mdp) {
            this.a = mdp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp u = this.a.a.u(new 1(this));
            akbw akbw = mdq.a;
            if (akbw != null) {
                akbw = new mdr(akbw);
            }
            u = u.b((ajex) akbw);
            akbw = mdq.b;
            if (akbw != null) {
                akbw = new mds(akbw);
            }
            Object a = u.a((ajey) akbw);
            akcr.a(a, "actionsRelay\n           …STINCT_ACTIVATED_RESULTS)");
            return ajpy.k(a).a();
        }
    }

    /* renamed from: mdp$e */
    static final class e extends akcs implements akbk<ajdp<c.b>> {
        private /* synthetic */ mdp a;

        /* renamed from: mdp$e$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mhs.b bVar = (mhs.b) obj;
                akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                return new c.b(bVar);
            }
        }

        e(mdp mdp) {
            this.a = mdp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ajdp) this.a.c.b()).c(1).p(1.a);
        }
    }

    /* renamed from: mdp$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.mec.c.b>> {
        final /* synthetic */ mdp a;

        /* renamed from: mdp$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((defpackage.lqf.b.a) obj, "it");
                return ((ajdp) this.a.a.g.b());
            }
        }

        b(mdp mdp) {
            this.a = mdp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object j = this.a.e.j(ajfu.a);
            akcr.a(j, "cameraLifecycle\n        …  .distinctUntilChanged()");
            j = j.b(defpackage.lqf.b.a.class);
            akcr.a(j, "ofType(R::class.java)");
            return j.u(new 1(this));
        }
    }

    /* renamed from: mdp$a */
    static final class a extends akcs implements akbk<ajdp<mhs.b>> {
        private /* synthetic */ mdp a;

        /* renamed from: mdp$a$1 */
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

        /* renamed from: mdp$a$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                defpackage.mmi.c.a aVar = (defpackage.mmi.c.a) obj;
                akcr.b(aVar, "event");
                return aVar.a;
            }
        }

        /* renamed from: mdp$a$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.mmi.c.a;
            }
        }

        a(mdp mdp) {
            this.a = mdp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object u = this.a.d.u(1.a);
            akcr.a(u, "lensCore.switchMap { it.…licator.filterLifecycle }");
            u = u.a((ajfl) a.a).a(defpackage.mmi.c.a.class);
            akcr.a(u, "this.filter { it is R }.cast(R::class.java)");
            return ajpy.k(u.p(2.a).j(ajfu.a)).a();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(mdp.class), "outputs", "getOutputs()Lio/reactivex/Observable;"), new akdc(akde.a(mdp.class), "resultWhenDeactivated", "getResultWhenDeactivated()Lio/reactivex/Observable;"), new akdc(akde.a(mdp.class), "cameraDeactivateResults", "getCameraDeactivateResults()Lio/reactivex/Observable;"), new akdc(akde.a(mdp.class), "activatedLensId", "getActivatedLensId()Lio/reactivex/Observable;")};
    }

    public mdp(ajdp<mmt> ajdp, ajdp<lqf> ajdp2) {
        akcr.b(ajdp, "lensCore");
        akcr.b(ajdp2, "cameraLifecycle");
        this.d = ajdp;
        this.e = ajdp2;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Sn….Action>().toSerialized()");
        this.a = r;
    }

    public final ajfb<a> a() {
        return new mdt(new c(this.a));
    }

    public final ajdp<c> b() {
        return (ajdp) this.f.b();
    }
}
