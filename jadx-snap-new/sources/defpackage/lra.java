package defpackage;

import defpackage.kqe.ah;
import defpackage.kqe.e;
import defpackage.kqe.f;
import defpackage.kqe.l;
import defpackage.kqe.t;
import defpackage.kqe.u;
import defpackage.lqf.b;
import defpackage.lsa.a;
import defpackage.lsa.d;
import defpackage.mmi.c;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: lra */
public final class lra implements lsa {
    final lsa a;
    final ajdp<mmt> b;
    final kqf c;
    final ajdp<lqf> d;
    final ajdp<Double> e;
    final mhk f;
    final zfw g;
    private final ajfb<a> h = this.a.a();
    private final ajxe i = ajxh.a(new aa(this));

    /* renamed from: lra$aa */
    static final class aa extends akcs implements akbk<ajdp<d>> {
        final /* synthetic */ lra a;

        /* renamed from: lra$aa$a */
        static final class a extends akcq implements akbl<kqe, ajxw> {
            a(kqf kqf) {
                super(1, kqf);
            }

            public final String getName() {
                return "handle";
            }

            public final akej getOwner() {
                return akde.a(kqf.class);
            }

            public final String getSignature() {
                return "handle(Lcom/snap/lenses/analytics/AnalyticsEvent;)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                kqe kqe = (kqe) obj;
                akcr.b(kqe, "p1");
                ((kqf) this.receiver).a(kqe);
                return ajxw.a;
            }
        }

        /* renamed from: lra$aa$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((kqe) obj, "it");
                return ajvo.a(ajot.a);
            }
        }

        /* renamed from: lra$aa$c */
        static final class c implements ajev {
            private /* synthetic */ aa a;

            c(aa aaVar) {
                this.a = aaVar;
            }

            public final void run() {
                this.a.a.c.a(kqe.a.b);
            }
        }

        aa(lra lra) {
            this.a = lra;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp b = this.a.a.b();
            Object u = b.a((ajey) g.a).u(new h(this.a));
            akcr.a(u, "result\n                .…      }\n                }");
            ajdt ajdt = (ajdt) u;
            Object d = this.a.d.j(ajfu.a).d((ajdt) b.a((ajfl) b.a));
            akcr.a(d, "cameraLifecycle\n        …eCase.Result.Activated })");
            d = d.a((ajfl) a.a).a(b.class);
            akcr.a(d, "this.filter { it is R }.cast(R::class.java)");
            d = d.p(c.a);
            akcr.a(d, "cameraLifecycle\n        …(it.cameraFacing.value) }");
            ajdt ajdt2 = (ajdt) d;
            lra lra = this.a;
            Object u2 = lra.b.d((ajdt) b.a((ajfl) n.a)).u(o.a).u(new p(lra));
            akcr.a(u2, "lensCore\n               …      }\n                }");
            ajdt ajdt3 = (ajdt) u2;
            Object u3 = this.a.b.d((ajdt) b.a((ajfl) i.a)).u(j.a).u(k.a);
            akcr.a(u3, "lensCore\n               …nt(it))\n                }");
            return ajdp.b((ajdt) b, (ajdt) ajpy.k(ajdp.a(ajdt, ajdt2, ajdt3, (ajdt) u3).d((ajfb) new lrb(new a(this.a.c))).u(b.a).b((ajev) new c(this))).a());
        }
    }

    /* renamed from: lra$g */
    static final class g<T1, T2> implements ajey<d, d> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            obj = (d) obj;
            obj2 = (d) obj2;
            akcr.b(obj, "old");
            akcr.b(obj2, "new");
            if (obj instanceof d.a.a) {
                return akcr.a(akde.a(obj.getClass()), akde.a(obj2.getClass()));
            }
            if (obj instanceof d.a.b) {
                return akcr.a(obj, obj2);
            }
            if (akcr.a(obj, d.b.a)) {
                return akcr.a(obj, obj2);
            }
            throw new ajxk();
        }
    }

    /* renamed from: lra$h */
    static final class h<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lra a;

        h(lra lra) {
            this.a = lra;
        }

        public final /* synthetic */ Object apply(Object obj) {
            d dVar = (d) obj;
            akcr.b(dVar, "it");
            if (dVar instanceof d.a.b) {
                d.a.b bVar = (d.a.b) dVar;
                Object u = this.a.b.u(x.a);
                String str = "lensCore\n               …licator.filterLifecycle }";
                akcr.a(u, str);
                u = u.a((ajfl) w.a).a(c.a.a.class);
                String str2 = "this.filter { it is R }.cast(R::class.java)";
                akcr.a(u, str2);
                u = u.a((ajfl) new y(bVar)).p(z.a);
                akcr.a(u, "lensCore\n               …sInitiated(it.id.value) }");
                ajdt ajdt = (ajdt) u;
                lra lra = this.a;
                ajdp j = lra.d.j(ajfu.a);
                Object a = ajdp.a((ajdt) j.u(new d(lra)).e(1500, TimeUnit.MILLISECONDS, lra.g.b()), (ajdt) lra.e.e(1500, TimeUnit.MILLISECONDS, lra.g.b()), (ajdt) j.p(e.a), (ajfd) new f(bVar));
                akcr.a(a, "Observable.combineLatest…rding)\n                })");
                ajdt ajdt2 = (ajdt) a;
                lra lra2 = this.a;
                ajdt b = ajdp.b((Callable) new r(lra2));
                Object u2 = lra2.b.u(s.a);
                akcr.a(u2, str);
                Object a2 = u2.a((ajfl) q.a).a(c.a.b.class);
                akcr.a(a2, str2);
                obj = ajdp.a(b, (ajdt) a2.a((ajfl) new t(bVar)).p(u.a), (ajex) new v(lra2)).c(1);
                akcr.a(obj, "Observable.combineLatest…\n                .take(1)");
                return ajdp.a(ajdt, ajdt2, (ajdt) obj);
            } else if (dVar instanceof d.a.a) {
                d.a.a aVar = (d.a.a) dVar;
                return ajdp.b(new e(aVar.a().size(), aVar.a.value));
            } else if (dVar instanceof d.b) {
                return ajvo.a(ajot.a);
            } else {
                throw new ajxk();
            }
        }
    }

    /* renamed from: lra$b */
    static final class b<T> implements ajfl<d> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            d dVar = (d) obj;
            akcr.b(dVar, "it");
            return dVar instanceof d.a;
        }
    }

    /* renamed from: lra$a */
    public static final class a<T> implements ajfl<Object> {
        public static final a a = new a();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof b;
        }
    }

    /* renamed from: lra$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "it");
            return new f(bVar.a().value);
        }
    }

    /* renamed from: lra$n */
    static final class n<T> implements ajfl<d> {
        public static final n a = new n();

        n() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            d dVar = (d) obj;
            akcr.b(dVar, "it");
            return dVar instanceof d.a;
        }
    }

    /* renamed from: lra$o */
    static final class o<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "it");
            return mmt.h().a();
        }
    }

    /* renamed from: lra$p */
    static final class p<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lra a;

        p(lra lra) {
            this.a = lra;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0051 in {2, 4, 7, 9} preds:[]
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
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r3) {
            /*
            r2 = this;
            r3 = (defpackage.mmg.b) r3;
            r0 = "it";
            defpackage.akcr.b(r3, r0);
            r0 = r3 instanceof defpackage.mmg.b.b;
            if (r0 == 0) goto L_0x0037;
            r0 = r2.a;
            r3 = (defpackage.mmg.b.b) r3;
            r3 = r3.a;
            r0 = r0.d;
            r1 = defpackage.lra.l.a;
            r1 = (defpackage.ajfl) r1;
            r0 = r0.a(r1);
            r1 = defpackage.lqf.b.class;
            r0 = r0.a(r1);
            r1 = "this.filter { it is R }.cast(R::class.java)";
            defpackage.akcr.a(r0, r1);
            r1 = new lra$m;
            r1.<init>(r3);
            r1 = (defpackage.ajfc) r1;
            r3 = r0.p(r1);
            r0 = "cameraLifecycle\n        ….value)\n                }";
            defpackage.akcr.a(r3, r0);
            return r3;
            r0 = r3 instanceof defpackage.mmg.b.a;
            if (r0 == 0) goto L_0x004b;
            r0 = new kqe$k;
            r3 = (defpackage.mmg.b.a) r3;
            r3 = r3.a;
            r0.<init>(r3);
            r3 = defpackage.ajdp.b(r0);
            r0 = "just(OnExpressionOccurred(it.expression))";
            goto L_0x0033;
            r3 = new ajxk;
            r3.<init>();
            throw r3;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lra$p.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: lra$i */
    static final class i<T> implements ajfl<d> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            d dVar = (d) obj;
            akcr.b(dVar, "it");
            return dVar instanceof d.a;
        }
    }

    /* renamed from: lra$j */
    static final class j<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final j a = new j();

        j() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "it");
            return mmt.b().a();
        }
    }

    /* renamed from: lra$k */
    static final class k<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mjf.b bVar = (mjf.b) obj;
            akcr.b(bVar, "it");
            return ajdp.b(new t(bVar));
        }
    }

    /* renamed from: lra$x */
    static final class x<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final x a = new x();

        x() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "lensCore");
            return mmt.a().b();
        }
    }

    /* renamed from: lra$w */
    public static final class w<T> implements ajfl<Object> {
        public static final w a = new w();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof c.a.a;
        }
    }

    /* renamed from: lra$y */
    static final class y<T> implements ajfl<c.a.a> {
        private /* synthetic */ d.a.b a;

        y(d.a.b bVar) {
            this.a = bVar;
        }

        public final /* synthetic */ boolean test(Object obj) {
            c.a.a aVar = (c.a.a) obj;
            akcr.b(aVar, "it");
            return akcr.a(this.a.a, aVar.a);
        }
    }

    /* renamed from: lra$z */
    static final class z<T, R> implements ajfc<T, R> {
        public static final z a = new z();

        z() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            c.a.a aVar = (c.a.a) obj;
            akcr.b(aVar, "it");
            return new u(aVar.a.a);
        }
    }

    /* renamed from: lra$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lra a;

        /* renamed from: lra$d$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "lensCore");
                return mmt.r().a().a(1, TimeUnit.SECONDS);
            }
        }

        d(lra lra) {
            this.a = lra;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((lqf) obj, "it");
            return this.a.b.u(1.a);
        }
    }

    /* renamed from: lra$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            lqf lqf = (lqf) obj;
            akcr.b(lqf, "it");
            return Boolean.valueOf(lqf instanceof b.b.c);
        }
    }

    /* renamed from: lra$f */
    static final class f<T1, T2, T3, R> implements ajfd<min, Double, Boolean, ah> {
        private /* synthetic */ d.a.b a;

        f(d.a.b bVar) {
            this.a = bVar;
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
            min min = (min) obj;
            double doubleValue = ((Number) obj2).doubleValue();
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            akcr.b(min, "statistic");
            return new ah(this.a.a.toString(), doubleValue, min.a, min.b, booleanValue);
        }
    }

    /* renamed from: lra$r */
    static final class r<V> implements Callable<T> {
        private /* synthetic */ lra a;

        r(lra lra) {
            this.a = lra;
        }

        public final /* synthetic */ Object call() {
            return Long.valueOf(this.a.f.a(TimeUnit.MILLISECONDS));
        }
    }

    /* renamed from: lra$s */
    static final class s<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final s a = new s();

        s() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "lensCore");
            return mmt.a().b();
        }
    }

    /* renamed from: lra$q */
    public static final class q<T> implements ajfl<Object> {
        public static final q a = new q();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof c.a.b;
        }
    }

    /* renamed from: lra$t */
    static final class t<T> implements ajfl<c.a.b> {
        private /* synthetic */ d.a.b a;

        t(d.a.b bVar) {
            this.a = bVar;
        }

        public final /* synthetic */ boolean test(Object obj) {
            c.a.b bVar = (c.a.b) obj;
            akcr.b(bVar, "it");
            return akcr.a(this.a.a, bVar.b.a);
        }
    }

    /* renamed from: lra$u */
    static final class u<T, R> implements ajfc<T, R> {
        public static final u a = new u();

        u() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            c.a.b bVar = (c.a.b) obj;
            akcr.b(bVar, "it");
            return bVar.b.a.a;
        }
    }

    /* renamed from: lra$v */
    static final class v<T1, T2, R> implements ajex<Long, String, defpackage.kqe.v> {
        private /* synthetic */ lra a;

        v(lra lra) {
            this.a = lra;
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            akcr.b(str, "id");
            return new defpackage.kqe.v(str, this.a.f.a(TimeUnit.MILLISECONDS) - longValue);
        }
    }

    /* renamed from: lra$l */
    public static final class l<T> implements ajfl<Object> {
        public static final l a = new l();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof b;
        }
    }

    /* renamed from: lra$m */
    static final class m<T, R> implements ajfc<T, R> {
        private /* synthetic */ int a;

        m(int i) {
            this.a = i;
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "it");
            return new l(this.a, bVar.a().value);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lra.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public lra(lsa lsa, ajdp<mmt> ajdp, kqf kqf, ajdp<lqf> ajdp2, ajdp<Double> ajdp3, mhk mhk, zfw zfw) {
        akcr.b(lsa, "carouselUseCase");
        akcr.b(ajdp, "lensCore");
        akcr.b(kqf, "analyticsEventHandler");
        akcr.b(ajdp2, "cameraLifecycle");
        akcr.b(ajdp3, "cameraAverageFps");
        akcr.b(mhk, "clock");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = lsa;
        this.b = ajdp;
        this.c = kqf;
        this.d = ajdp2;
        this.e = ajdp3;
        this.f = mhk;
        this.g = zfw;
    }

    public final ajfb<a> a() {
        return this.h;
    }

    public final ajdp<d> b() {
        return (ajdp) this.i.b();
    }
}
