package defpackage;

import defpackage.mhs.c;
import defpackage.miq.f;
import defpackage.mmi.d;
import defpackage.myl.a;
import defpackage.myl.b;
import java.util.Collection;
import java.util.List;

/* renamed from: myn */
public final class myn implements myl {
    final ajws<a> a;
    final ajxe b = ajxh.a(new a(this));
    final ajxe c = ajxh.a(new b(this));
    final ajdp<mmt> d;
    final mwe e;
    private final ajxe f = ajxh.a(new d(this));
    private final ajxe g = ajxh.a(new e(this));

    /* renamed from: myn$d */
    static final class d extends akcs implements akbk<ajfb<a>> {
        private /* synthetic */ myn a;

        d(myn myn) {
            this.a = myn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new myo(new akbl<a, ajxw>(this.a.a) {
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
            });
        }
    }

    /* renamed from: myn$e */
    static final class e extends akcs implements akbk<ajdp<b>> {
        final /* synthetic */ myn a;

        /* renamed from: myn$e$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ e a;

            1(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                a.a aVar = (a.a) obj;
                akcr.b(aVar, "it");
                myn myn = this.a.a;
                obj = myn.d.u(new c(myn, aVar.a));
                akcr.a(obj, "lensCoreObservable.switc…              }\n        }");
                return obj;
            }
        }

        /* renamed from: myn$e$a */
        public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
            public final R apply(T1 t1, T2 t2) {
                Object obj = (mhs) t2;
                Object obj2 = (List) t1;
                akcr.a(obj, "appliedLens");
                akcr.a(obj2, "lensesList");
                return new defpackage.myl.b.a(obj, obj2);
            }
        }

        e(myn myn) {
            this.a = myn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object b = this.a.a.b(a.a.class);
            akcr.a(b, "ofType(R::class.java)");
            ajdp u = b.u(new 1(this));
            akcr.a((Object) u, "relay.logAll(TAG, \"input…pplyLensById(it.lensId) }");
            u = myu.a(u);
            Object obj = (ajdp) this.a.b.b();
            akcr.a(obj, "allLensesList");
            Object obj2 = (ajdp) this.a.c.b();
            akcr.a(obj2, "appliedLens");
            ajdp a = ajdp.a((ajdt) obj, (ajdt) obj2, (ajex) new a());
            if (a == null) {
                akcr.a();
            }
            b = u.e((ajdt) a);
            akcr.a(b, "relay.logAll(TAG, \"input…sList)\n                })");
            return b;
        }
    }

    /* renamed from: myn$a */
    static final class a extends akcs implements akbk<ajdp<List<? extends mux>>> {
        private /* synthetic */ myn a;

        /* renamed from: myn$a$1 */
        static final class 1<T> implements ajfl<List<? extends mux>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return !((Collection) list).isEmpty();
            }
        }

        a(myn myn) {
            this.a = myn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.e.a(defpackage.mwe.a.a.a).b(ajfu.a).b((ajfl) 1.a).j();
        }
    }

    /* renamed from: myn$b */
    static final class b extends akcs implements akbk<ajdp<mhs>> {
        private /* synthetic */ myn a;

        /* renamed from: myn$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 1 a = new 1();

            /* renamed from: myn$b$1$1 */
            static final class 1<T, R> implements ajfc<T, R> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    defpackage.mmi.c.a.b bVar = (defpackage.mmi.c.a.b) obj;
                    akcr.b(bVar, "it");
                    return bVar.a;
                }
            }

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "lensCore");
                obj = mmt.a().b().b(defpackage.mmi.c.a.b.class);
                akcr.a(obj, "ofType(R::class.java)");
                obj = obj.p(1.a);
                akcr.a(obj, "lensCore.filterApplicato…           .map { it.id }");
                obj = obj.a(mhs.class);
                akcr.a(obj, "cast(R::class.java)");
                obj = obj.h(c.a);
                akcr.a(obj, "lensCore.filterApplicato…tWith(Identifier.Unknown)");
                return obj;
            }
        }

        b(myn myn) {
            this.a = myn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.d.u(1.a);
        }
    }

    /* renamed from: myn$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ myn a;
        private /* synthetic */ mhs.b b;

        /* renamed from: myn$c$1 */
        static final class 1<T> implements ajfl<List<? extends mux>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return !((Collection) list).isEmpty();
            }
        }

        /* renamed from: myn$c$2 */
        static final class 2<T> implements ajfl<List<? extends mux>> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return !(((mux) ajyu.f(list)).b instanceof f);
            }
        }

        c(myn myn, mhs.b bVar) {
            this.a = myn;
            this.b = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final mmt mmt = (mmt) obj;
            akcr.b(mmt, "lensCore");
            Object c = this.a.e.a(new mwe.a.b(this.b)).b((ajfl) 1.a).b((ajfl) 2.a).j().c(1);
            akcr.a(c, "lensRepository.query(Len…                 .take(1)");
            return c.x(new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ c a;

                public final /* synthetic */ Object apply(Object obj) {
                    List list = (List) obj;
                    akcr.b(list, "it");
                    mux mux = (mux) ajyu.f(list);
                    return mmt.a().a().b(new d(mux.a, mux.b, false, mux.g, mux.d, null, 140));
                }
            });
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(myn.class), "inputs", "getInputs()Lio/reactivex/functions/Consumer;"), new akdc(akde.a(myn.class), "outputs", "getOutputs()Lio/reactivex/Observable;"), new akdc(akde.a(myn.class), "allLensesList", "getAllLensesList()Lio/reactivex/Observable;"), new akdc(akde.a(myn.class), "appliedLens", "getAppliedLens()Lio/reactivex/Observable;")};
    }

    public myn(ajdp<mmt> ajdp, mwe mwe) {
        akcr.b(ajdp, "lensCoreObservable");
        akcr.b(mwe, "lensRepository");
        this.d = ajdp;
        this.e = mwe;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Ca….Action>().toSerialized()");
        this.a = r;
    }

    public final ajfb<a> a() {
        return (ajfb) this.f.b();
    }

    public final ajdp<b> b() {
        return (ajdp) this.g.b();
    }
}
