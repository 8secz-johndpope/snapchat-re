package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.kqe.ag;
import defpackage.mft.a;
import defpackage.mft.b;
import defpackage.mjn.c.f;
import defpackage.mjn.d;
import defpackage.mmi.c;

/* renamed from: mfg */
public final class mfg implements mft {
    final ajws<a> a;
    final ajdp<mmt> b;
    final ajdu<b, b> c;
    final kqf d;
    private final ajxe e = ajxh.a(new a(this));
    private final ajxe f = ajxh.a(new c(this));
    private final ajxe g = ajxh.a(new d(this));
    private final ajxe h = ajxh.a(new b(this));

    /* renamed from: mfg$a */
    static final class a extends akcs implements akbk<ajfb<defpackage.mft.a>> {
        private /* synthetic */ mfg a;

        a(mfg mfg) {
            this.a = mfg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new mfh(new akbl<defpackage.mft.a, ajxw>(this.a.a) {
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
                    defpackage.mft.a aVar = (defpackage.mft.a) obj;
                    akcr.b(aVar, "p1");
                    ((ajws) this.receiver).a((Object) aVar);
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: mfg$c */
    static final class c extends akcs implements akbk<ajdp<b>> {
        final /* synthetic */ mfg a;

        /* renamed from: mfg$c$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ c a;

            b(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                obj = (a) obj;
                akcr.b(obj, "action");
                if (akcr.a(obj, defpackage.mft.a.b.a.a)) {
                    obj = ajdp.b(defpackage.mft.b.b.a.a);
                    akcr.a(obj, "just(StartButtonUseCase.Result.Shown.Loading)");
                    return obj;
                } else if (akcr.a(obj, defpackage.mft.a.b.b.a)) {
                    obj = ajdp.b(defpackage.mft.b.b.b.a);
                    akcr.a(obj, "just(StartButtonUseCase.Result.Shown.Start)");
                    return obj;
                } else if (akcr.a(obj, a.a.a)) {
                    obj = ajdp.b(defpackage.mft.b.a.a);
                    akcr.a(obj, "just(StartButtonUseCase.Result.Hidden)");
                    return obj;
                } else if (akcr.a(obj, defpackage.mft.a.c.a)) {
                    return ((ajdp) this.a.a.g.b());
                } else {
                    throw new ajxk();
                }
            }
        }

        /* renamed from: mfg$c$c */
        static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ c a;

            /* renamed from: mfg$c$c$a */
            public static final class a<T> implements ajfl<d> {
                public static final a a = new a();

                public final /* synthetic */ boolean test(Object obj) {
                    d dVar = (d) obj;
                    akcr.b(dVar, "it");
                    return akcr.a(dVar.b(), f.a);
                }
            }

            /* renamed from: mfg$c$c$1 */
            static final class 1<T> implements ajfl<ajxm<? extends d, ? extends defpackage.mmi.c.a.a>> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ boolean test(Object obj) {
                    ajxm ajxm = (ajxm) obj;
                    akcr.b(ajxm, "<name for destructuring parameter 0>");
                    return akcr.a(((defpackage.mmi.c.a.a) ajxm.b).a, ((d) ajxm.a).a());
                }
            }

            /* renamed from: mfg$c$c$2 */
            static final class 2<T, R> implements ajfc<T, R> {
                public static final 2 a = new 2();

                2() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    ajxm ajxm = (ajxm) obj;
                    akcr.b(ajxm, "<name for destructuring parameter 0>");
                    return (d) ajxm.a;
                }
            }

            c(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                obj = mmt.g().a().a((ajfl) a.a);
                akcr.a(obj, "requests.filter { it.int…faceControl.StartButton }");
                return ajwb.a(obj, ((ajdp) this.a.a.h.b())).a((ajfl) 1.a).p(2.a);
            }
        }

        /* renamed from: mfg$c$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ c a;

            a(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                d dVar = (d) obj;
                akcr.b(dVar, "request");
                if (dVar instanceof d.b) {
                    obj = ajdp.b(b.b.b.a);
                    akcr.a(obj, "just(StartButtonUseCase.Result.Shown.Start)");
                    return obj;
                } else if (dVar instanceof defpackage.mjn.d.a) {
                    obj = ajdp.b(defpackage.mft.b.a.a);
                    akcr.a(obj, "just(StartButtonUseCase.Result.Hidden)");
                    return obj;
                } else if (dVar instanceof defpackage.mjn.d.c) {
                    return ((ajdp) this.a.a.g.b());
                } else {
                    throw new ajxk();
                }
            }
        }

        /* renamed from: mfg$c$1 */
        static final class 1<T> implements ajfb<b> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                if (((b) obj) instanceof defpackage.mft.b.c) {
                    this.a.a.d.a(ag.b);
                }
            }
        }

        c(mfg mfg) {
            this.a = mfg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object u = this.a.a.u(new b(this));
            akcr.a(u, "actionsRelay\n           …      }\n                }");
            Object u2 = this.a.b.u(new c(this)).u(new a(this));
            akcr.a(u2, "startButtonRequests\n    …      }\n                }");
            u = ajdp.a((ajdt) u, (ajdt) u2, (ajdt) myu.a(((ajdp) this.a.h.b()))).a(this.a.c).j(ajfu.a).d((ajfb) new 1(this));
            akcr.a(u, "Observable.merge(commonR…      }\n                }");
            return ajpy.k(u).a();
        }
    }

    /* renamed from: mfg$d */
    static final class d extends akcs implements akbk<ajdp<b>> {
        final /* synthetic */ mfg a;

        /* renamed from: mfg$d$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                c.a.a aVar = (c.a.a) obj;
                akcr.b(aVar, "lifecycle");
                return aVar.a;
            }
        }

        /* renamed from: mfg$d$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ d a;

            /* renamed from: mfg$d$2$1 */
            static final class 1<T, R> implements ajfc<T, R> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    mmt mmt = (mmt) obj;
                    akcr.b(mmt, "it");
                    return mmt.g().b();
                }
            }

            2(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final mhs.b bVar = (mhs.b) obj;
                akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                return this.a.a.b.p(1.a).u(new ajfc<T, ajdt<? extends R>>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        mid mid = (mid) obj;
                        akcr.b(mid, "operation");
                        Object obj2 = bVar;
                        akcr.a(obj2, DiscoverStorySnapModel.LENSID);
                        return mid.c(new mjn.a.a(obj2, f.a));
                    }
                });
            }
        }

        /* renamed from: mfg$d$3 */
        static final class 3<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 3 a = new 3();

            3() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ajxw) obj, "it");
                return ajdp.a(b.c.a, b.a.a);
            }
        }

        d(mfg mfg) {
            this.a = mfg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ajdp) this.a.h.b()).p(1.a).j(ajfu.a).u(new 2(this)).u(3.a);
        }
    }

    /* renamed from: mfg$b */
    static final class b extends akcs implements akbk<ajdp<c.a.a>> {
        private /* synthetic */ mfg a;

        /* renamed from: mfg$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 1 a = new 1();

            /* renamed from: mfg$b$1$a */
            public static final class a<T> implements ajfl<Object> {
                public static final a a = new a();

                public final boolean test(Object obj) {
                    akcr.b(obj, "it");
                    return obj instanceof defpackage.mmi.c.a.a;
                }
            }

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                obj = mmt.a().b().a((ajfl) a.a).a(c.a.a.class);
                akcr.a(obj, "this.filter { it is R }.cast(R::class.java)");
                return obj;
            }
        }

        b(mfg mfg) {
            this.a = mfg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.u(1.a).i().a();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(mfg.class), "inputs", "getInputs()Lio/reactivex/functions/Consumer;"), new akdc(akde.a(mfg.class), "outputs", "getOutputs()Lio/reactivex/Observable;"), new akdc(akde.a(mfg.class), "resultWhenTrigger", "getResultWhenTrigger()Lio/reactivex/Observable;"), new akdc(akde.a(mfg.class), "lastInitiatedLensId", "getLastInitiatedLensId()Lio/reactivex/Observable;")};
    }

    public mfg(ajdp<mmt> ajdp, ajdu<b, b> ajdu, kqf kqf) {
        akcr.b(ajdp, "lensCore");
        akcr.b(ajdu, "startButtonResultTransformer");
        akcr.b(kqf, "analyticsEventHandler");
        this.b = ajdp;
        this.c = ajdu;
        this.d = kqf;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<St….Action>().toSerialized()");
        this.a = r;
    }

    public final ajfb<a> a() {
        return (ajfb) this.e.b();
    }

    public final ajdp<b> b() {
        return (ajdp) this.f.b();
    }
}
