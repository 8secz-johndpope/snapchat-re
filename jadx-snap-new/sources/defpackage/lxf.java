package defpackage;

import defpackage.kqe.n;
import defpackage.kqe.o;
import defpackage.kqe.p;
import defpackage.kqe.q;
import defpackage.lxb.a;
import defpackage.lxb.b;
import defpackage.mjn.d;
import defpackage.mmi.c;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: lxf */
public final class lxf implements lxb {
    final ajws<a> a;
    final ajdp<mmt> b;
    final mwe c;
    final lxh d;
    final zfw e;
    final kqf f;
    private final ajxe g = ajxh.a(new f(this));
    private final ajxe h = ajxh.a(new h(this));

    /* renamed from: lxf$c */
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

    /* renamed from: lxf$f */
    static final class f extends akcs implements akbk<ajdp<c>> {
        private /* synthetic */ lxf a;

        /* renamed from: lxf$f$1 */
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

        f(lxf lxf) {
            this.a = lxf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.u(1.a);
        }
    }

    /* renamed from: lxf$h */
    static final class h extends akcs implements akbk<ajdp<b>> {
        final /* synthetic */ lxf a;

        /* renamed from: lxf$h$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ h a;

            1(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                a aVar = (a) obj;
                akcr.b(aVar, "it");
                if (aVar instanceof a.a) {
                    return lxf.a(this.a.a, ((a.a) aVar).a);
                }
                throw new ajxk();
            }
        }

        /* renamed from: lxf$h$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            private /* synthetic */ h a;

            2(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                mux mux = (mux) obj;
                akcr.b(mux, "it");
                mva mva = mux.l;
                return (mva == null || !this.a.a.d.a(mva)) ? b.a.a : new b.b(mva);
            }
        }

        /* renamed from: lxf$h$3 */
        static final class 3<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 3 a = new 3();

            /* renamed from: lxf$h$3$a */
            public static final class a<T> implements ajfl<d> {
                public static final a a = new a();

                public final /* synthetic */ boolean test(Object obj) {
                    d dVar = (d) obj;
                    akcr.b(dVar, "it");
                    return akcr.a(dVar.b(), defpackage.mjn.c.a.a);
                }
            }

            3() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                obj = mmt.g().a().a((ajfl) a.a);
                akcr.a(obj, "requests.filter { it.int…ontrol.AttachmentButton }");
                return obj;
            }
        }

        /* renamed from: lxf$h$4 */
        static final class 4<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ h a;

            4(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajxm ajxm = (ajxm) obj;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                d dVar = (d) ajxm.a;
                mva mva = ((mux) ajxm.b).l;
                if (mva == null || !this.a.a.d.a(mva)) {
                    obj = ajvo.a(ajot.a);
                    akcr.a(obj, "empty()");
                    return obj;
                } else if (dVar instanceof d.b) {
                    obj = ajdp.b(new b.b(mva));
                    akcr.a(obj, "just(CtaUseCase.Result.Shown(attachment))");
                    return obj;
                } else if (dVar instanceof d.a) {
                    obj = ajdp.b(b.a.a);
                    akcr.a(obj, "just(CtaUseCase.Result.Hidden)");
                    return obj;
                } else if (dVar instanceof d.c) {
                    return lxf.a(this.a.a, mva);
                } else {
                    throw new ajxk();
                }
            }
        }

        h(lxf lxf) {
            this.a = lxf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp u = this.a.a.d(500, TimeUnit.MILLISECONDS, this.a.e.b()).u(new 1(this));
            Object p = lxf.a(this.a).p(new 2(this));
            akcr.a(p, "appliedLens()\n          …                        }");
            u = u.e((ajdt) p);
            p = this.a.c().b(c.a.c.class);
            akcr.a(p, "ofType(R::class.java)");
            p = p.p(b.a);
            akcr.a(p, "lensCoreResults\n        …taUseCase.Result.Hidden }");
            u = u.e((ajdt) p);
            p = this.a.b.u(3.a);
            akcr.a(p, "lensCore.switchMap { it.…ttachmentButtonRequests }");
            p = ajwa.a(p, lxf.a(this.a)).u(new 4(this));
            akcr.a(p, "combineLatest(\n         …                        }");
            return ajpy.k(u.e((ajdt) p)).a();
        }
    }

    /* renamed from: lxf$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lxf a;

        a(lxf lxf) {
            this.a = lxf;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final defpackage.mmi.c.a.b bVar = (defpackage.mmi.c.a.b) obj;
            akcr.b(bVar, "it");
            Object j = this.a.c.a(new defpackage.mwe.a.b(bVar.a)).b((ajfl) d.a).d((ajfc) e.a).j();
            akcr.a(j, "lensRepository.query(Len…          .toObservable()");
            return j.j((ajdt) this.a.c().a((ajfl) new ajfl<c>() {
                public final /* synthetic */ boolean test(Object obj) {
                    obj = (c) obj;
                    akcr.b(obj, "filterLifecycle");
                    return ((obj instanceof defpackage.mmi.c.a.c) && akcr.a(((defpackage.mmi.c.a.c) obj).b.a, bVar.a)) || akcr.a(obj, c.b.a);
                }
            }));
        }
    }

    /* renamed from: lxf$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((c.a.c) obj, "it");
            return defpackage.lxb.b.a.a;
        }
    }

    /* renamed from: lxf$d */
    static final class d<T> implements ajfl<List<? extends mux>> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return !list.isEmpty();
        }
    }

    /* renamed from: lxf$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return (mux) ajyu.f(list);
        }
    }

    /* renamed from: lxf$g */
    static final class g<T> implements ajfb<lxh.a> {
        private /* synthetic */ lxf a;

        g(lxf lxf) {
            this.a = lxf;
        }

        public final /* synthetic */ void accept(Object obj) {
            kqf kqf;
            o oVar;
            lxh.a aVar = (lxh.a) obj;
            if (aVar instanceof lxh.a.b) {
                kqf = this.a.f;
                oVar = o.b;
            } else if (aVar instanceof lxh.a.c) {
                kqf = this.a.f;
                oVar = p.b;
            } else if (aVar instanceof lxh.a.d) {
                kqf = this.a.f;
                oVar = q.b;
            } else {
                if (aVar instanceof lxh.a.a) {
                    this.a.f.a(n.b);
                }
                return;
            }
            kqf.a(oVar);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lxf.class), "lensCoreResults", "getLensCoreResults()Lio/reactivex/Observable;"), new akdc(akde.a(lxf.class), "outputs", "getOutputs()Lio/reactivex/Observable;")};
    }

    public lxf(ajdp<mmt> ajdp, mwe mwe, lxh lxh, zfw zfw, kqf kqf) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mwe, "lensRepository");
        akcr.b(lxh, "lensAttachmentOpener");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(kqf, "analyticsEventHandler");
        this.b = ajdp;
        this.c = mwe;
        this.d = lxh;
        this.e = zfw;
        this.f = kqf;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Ct….Action>().toSerialized()");
        this.a = r;
    }

    public static final /* synthetic */ ajdp a(lxf lxf) {
        Object b = lxf.c().b(c.a.b.class);
        akcr.a(b, "ofType(R::class.java)");
        Object u = b.u(new a(lxf));
        akcr.a(u, "lensCoreResults\n        …     })\n                }");
        return u;
    }

    public static final /* synthetic */ ajdp a(lxf lxf, mva mva) {
        ajdp d = lxf.d.b(mva).d((ajfb) new g(lxf));
        akcr.a((Object) d, "lensAttachmentOpener.ope…      }\n                }");
        return myu.a(d);
    }

    public final ajfb<a> a() {
        return new lxg(new c(this.a));
    }

    public final ajdp<b> b() {
        return (ajdp) this.h.b();
    }

    /* Access modifiers changed, original: final */
    public final ajdp<c> c() {
        return (ajdp) this.g.b();
    }
}
