package defpackage;

import defpackage.mdd.a;
import defpackage.mdd.b;
import defpackage.mmi.c;
import defpackage.mmi.c.a.d;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: mcs */
public final class mcs implements mdd {
    final ajws<a> a;
    final ajxe b = ajxh.a(new a(this));
    final ajxe c = ajxh.a(new e(this));
    final ajxe d = ajxh.a(new f(this));
    final ajdp<mmt> e;
    final kpk f;
    private final ajxe g = ajxh.a(new d(this));
    private final ajxe h = ajxh.a(new b(this));
    private final mwe i;

    /* renamed from: mcs$c */
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

    /* renamed from: mcs$d */
    static final class d extends akcs implements akbk<ajdp<b>> {
        final /* synthetic */ mcs a;

        /* renamed from: mcs$d$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ d a;

            b(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                c.a aVar = (c.a) obj;
                akcr.b(aVar, "filterLifecycle");
                if (aVar instanceof defpackage.mmi.c.a.d) {
                    return mcs.a(this.a.a, aVar.a);
                }
                obj = ajdp.b(defpackage.mdd.b.b.a);
                akcr.a(obj, "Observable.just(Sponsore…lugUseCase.Result.Hidden)");
                return obj;
            }
        }

        /* renamed from: mcs$d$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0031 in {2, 4, 7, 9} preds:[]
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.ProcessClass.process(ProcessClass.java:32)
                	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
                	at java.lang.Iterable.forEach(Iterable.java:75)
                	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
                	at jadx.core.ProcessClass.process(ProcessClass.java:37)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r2) {
                /*
                r1 = this;
                r2 = (defpackage.mdd.a) r2;
                r0 = "action";
                defpackage.akcr.b(r2, r0);
                r0 = defpackage.mdd.a.b.a;
                r0 = defpackage.akcr.a(r2, r0);
                if (r0 == 0) goto L_0x001c;
                r2 = r1.a;
                r2 = r2.a;
                r2 = r2.d;
                r2 = r2.b();
                r2 = (defpackage.ajdp) r2;
                return r2;
                r0 = defpackage.mdd.a.a.a;
                r2 = defpackage.akcr.a(r2, r0);
                if (r2 == 0) goto L_0x002b;
                r2 = r1.a;
                r2 = r2.a;
                r2 = r2.c;
                goto L_0x0015;
                r2 = new ajxk;
                r2.<init>();
                throw r2;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mcs$d$a.apply(java.lang.Object):java.lang.Object");
            }
        }

        d(mcs mcs) {
            this.a = mcs;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(ajdp.b((ajdt) ((ajdp) this.a.b.b()).u(new b(this)), (ajdt) this.a.a.u(new a(this)))).a();
        }
    }

    /* renamed from: mcs$b */
    static final class b extends akcs implements akbk<ajdp<c.a>> {
        private /* synthetic */ mcs a;

        /* renamed from: mcs$b$1 */
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

        /* renamed from: mcs$b$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.mmi.c.a;
            }
        }

        b(mcs mcs) {
            this.a = mcs;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object u = this.a.e.u(1.a);
            akcr.a(u, "lensCore.switchMap { it.…licator.filterLifecycle }");
            u = u.a((ajfl) a.a).a(c.a.class);
            akcr.a(u, "this.filter { it is R }.cast(R::class.java)");
            return u;
        }
    }

    /* renamed from: mcs$a */
    static final class a extends akcs implements akbk<ajdp<defpackage.mmi.c.a>> {
        private /* synthetic */ mcs a;

        /* renamed from: mcs$a$1 */
        static final class 1<T> implements ajfl<defpackage.mmi.c.a> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                defpackage.mmi.c.a aVar = (defpackage.mmi.c.a) obj;
                akcr.b(aVar, "it");
                return (aVar instanceof d) || (aVar instanceof defpackage.mmi.c.a.c);
            }
        }

        a(mcs mcs) {
            this.a = mcs;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ajdp) this.a.h.b()).a((ajfl) 1.a);
        }
    }

    /* renamed from: mcs$e */
    static final class e extends akcs implements akbk<ajdp<b>> {
        final /* synthetic */ mcs a;

        /* renamed from: mcs$e$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ e a;

            1(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                c.a aVar = (c.a) obj;
                akcr.b(aVar, "it");
                return mcs.a(this.a.a, aVar.a);
            }
        }

        e(mcs mcs) {
            this.a = mcs;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ajdp) this.a.h.b()).c(1).u(new 1(this));
        }
    }

    /* renamed from: mcs$f */
    static final class f extends akcs implements akbk<ajdp<b>> {
        final /* synthetic */ mcs a;

        /* renamed from: mcs$f$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ f a;

            1(f fVar) {
                this.a = fVar;
            }

            public final /* synthetic */ Object call() {
                this.a.a.f.a(false);
                return ajxw.a;
            }
        }

        /* renamed from: mcs$f$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ajxw) obj, "it");
                return b.b.a;
            }
        }

        f(mcs mcs) {
            this.a = mcs;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.b((Callable) new 1(this)).p(2.a);
        }
    }

    /* renamed from: mcs$g */
    static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "lenses");
            if (!list.isEmpty()) {
                mws mws = ((mux) ajyu.f(list)).m;
                if (mws instanceof mws.c) {
                    mws.b bVar = ((mws.c) mws).a;
                    if (bVar != null) {
                        return new b.a(bVar);
                    }
                }
            }
            return b.b.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(mcs.class), "outputs", "getOutputs()Lio/reactivex/Observable;"), new akdc(akde.a(mcs.class), "filterLifecycle", "getFilterLifecycle()Lio/reactivex/Observable;"), new akdc(akde.a(mcs.class), "filterActions", "getFilterActions()Lio/reactivex/Observable;"), new akdc(akde.a(mcs.class), "resultWhenActivated", "getResultWhenActivated()Lio/reactivex/Observable;"), new akdc(akde.a(mcs.class), "resultWhenOpened", "getResultWhenOpened()Lio/reactivex/Observable;")};
    }

    public mcs(ajdp<mmt> ajdp, mwe mwe, kpk kpk) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mwe, "lensRepository");
        akcr.b(kpk, "adInfoLauncher");
        this.e = ajdp;
        this.i = mwe;
        this.f = kpk;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Sp….Action>().toSerialized()");
        this.a = r;
    }

    public static final /* synthetic */ ajdp a(mcs mcs, mhs.b bVar) {
        Object p = mcs.i.a(new mwe.a.b(bVar)).j().c(1).p(g.a);
        akcr.a(p, "lensRepository.query(Len…  }\n                    }");
        return p;
    }

    public final ajfb<a> a() {
        return new mct(new c(this.a));
    }

    public final ajdp<b> b() {
        return (ajdp) this.g.b();
    }
}
