package defpackage;

import defpackage.ltq.a;
import defpackage.ltq.b;
import defpackage.mjn.c.c;
import defpackage.mjn.d;

/* renamed from: ltw */
public final class ltw implements ltq {
    final ajws<a> a;
    final ajxe b = ajxh.a(f.a);
    final ajxe c = ajxh.a(new e(this));
    final ajdp<mmt> d;
    final lth e;
    private final ajfb<a> f = new ltx(new a(this.a));
    private final ajxe g = ajxh.a(new b(this));
    private final ajxe h = ajxh.a(d.a);
    private final ajxe i = ajxh.a(new c(this));

    /* renamed from: ltw$a */
    static final class a extends akcq implements akbl<defpackage.ltq.a, ajxw> {
        a(ajws ajws) {
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
            defpackage.ltq.a aVar = (defpackage.ltq.a) obj;
            akcr.b(aVar, "p1");
            ((ajws) this.receiver).a((Object) aVar);
            return ajxw.a;
        }
    }

    /* renamed from: ltw$d */
    static final class d extends akcs implements akbk<ajdp<b>> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.b(b.a.a);
        }
    }

    /* renamed from: ltw$f */
    static final class f extends akcs implements akbk<ajdp<b>> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.b(b.b.a.a);
        }
    }

    /* renamed from: ltw$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.ltq.b>> {
        final /* synthetic */ ltw a;

        /* renamed from: ltw$b$e */
        static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final e a = new e();

            /* renamed from: ltw$b$e$a */
            public static final class a<T> implements ajfl<d> {
                public static final a a = new a();

                public final /* synthetic */ boolean test(Object obj) {
                    d dVar = (d) obj;
                    akcr.b(dVar, "it");
                    return akcr.a(dVar.b(), c.a);
                }
            }

            e() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                obj = mmt.g().a().a((ajfl) a.a);
                akcr.a(obj, "requests.filter { it.int…faceControl.LinkBitmoji }");
                return obj;
            }
        }

        /* renamed from: ltw$b$f */
        static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;

            f(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                d dVar = (d) obj;
                akcr.b(dVar, "request");
                if (dVar instanceof defpackage.mjn.d.b) {
                    return ((ajdp) this.a.a.i.b());
                }
                if (dVar instanceof d.a) {
                    return ((ajdp) this.a.a.h.b());
                }
                obj = ajvo.a(ajot.a);
                akcr.a(obj, "Observable.empty()");
                return obj;
            }
        }

        /* renamed from: ltw$b$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                return mmt.a().b();
            }
        }

        /* renamed from: ltw$b$c */
        static final class c<T> implements ajfl<defpackage.mmi.c> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                defpackage.mmi.c cVar = (defpackage.mmi.c) obj;
                akcr.b(cVar, "lifecycle");
                return (cVar instanceof defpackage.mmi.c.a.d) || (cVar instanceof defpackage.mmi.c.a.c);
            }
        }

        /* renamed from: ltw$b$d */
        static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;
            private /* synthetic */ ajdp b;

            d(b bVar, ajdp ajdp) {
                this.a = bVar;
                this.b = ajdp;
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmi.c cVar = (mmi.c) obj;
                akcr.b(cVar, "lifecycle");
                if (cVar instanceof defpackage.mmi.c.a.d) {
                    defpackage.mmi.c.a.d dVar = (defpackage.mmi.c.a.d) cVar;
                    if (dVar.b.h) {
                        return dVar.b.i ? ((ajdp) this.a.a.i.b()) : this.b;
                    }
                }
                if ((cVar instanceof mmi.c.a.c) && ((mmi.c.a.c) cVar).b.h) {
                    return ((ajdp) this.a.a.h.b());
                }
                obj = ajvo.a(ajot.a);
                akcr.a(obj, "Observable.empty()");
                return obj;
            }
        }

        /* renamed from: ltw$b$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;

            a(b bVar) {
                this.a = bVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0029 in {2, 4, 7, 9} preds:[]
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
                r2 = (defpackage.ltq.a) r2;
                r0 = "event";
                defpackage.akcr.b(r2, r0);
                r0 = r2 instanceof defpackage.ltq.a.a;
                if (r0 == 0) goto L_0x0018;
                r2 = r1.a;
                r2 = r2.a;
                r2 = r2.c;
                r2 = r2.b();
                r2 = (defpackage.ajdp) r2;
                return r2;
                r2 = r2 instanceof defpackage.ltq.a.b;
                if (r2 == 0) goto L_0x0023;
                r2 = r1.a;
                r2 = r2.a;
                r2 = r2.b;
                goto L_0x0011;
                r2 = new ajxk;
                r2.<init>();
                throw r2;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ltw$b$a.apply(java.lang.Object):java.lang.Object");
            }
        }

        b(ltw ltw) {
            this.a = ltw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object u = this.a.d.u(e.a).u(new f(this));
            String str = "lensCore.switchMap { it.…      }\n                }";
            akcr.a(u, str);
            u = this.a.d.u(b.a).a((ajfl) c.a).u(new d(this, u));
            akcr.a(u, str);
            Object u2 = this.a.a.u(new a(this));
            akcr.a(u2, "relay\n                .s…      }\n                }");
            return ajpy.k(ajdp.b((ajdt) u, (ajdt) u2)).a();
        }
    }

    /* renamed from: ltw$c */
    static final class c extends akcs implements akbk<ajdp<b>> {
        private /* synthetic */ ltw a;

        /* renamed from: ltw$c$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "isLinked");
                return bool.booleanValue() ? b.a.a : b.b.a.a;
            }
        }

        c(ltw ltw) {
            this.a = ltw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.e.a().p(1.a);
        }
    }

    /* renamed from: ltw$e */
    static final class e extends akcs implements akbk<ajdp<b>> {
        private /* synthetic */ ltw a;

        e(ltw ltw) {
            this.a = ltw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.e.b().a((ajdt) ajdp.b(b.a.a)).f((ajdt) ajdp.b(b.b.a.a)).h((ajdt) ajdp.b(b.b.b.a));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ltw.class), "outputs", "getOutputs()Lio/reactivex/Observable;"), new akdc(akde.a(ltw.class), "resultHidden", "getResultHidden()Lio/reactivex/Observable;"), new akdc(akde.a(ltw.class), "resultShownDefault", "getResultShownDefault()Lio/reactivex/Observable;"), new akdc(akde.a(ltw.class), "resultCheckBitmoji", "getResultCheckBitmoji()Lio/reactivex/Observable;"), new akdc(akde.a(ltw.class), "resultLinkBitmoji", "getResultLinkBitmoji()Lio/reactivex/Observable;")};
    }

    public ltw(ajdp<mmt> ajdp, lth lth) {
        akcr.b(ajdp, "lensCore");
        akcr.b(lth, "bitmojiLensInteractor");
        this.d = ajdp;
        this.e = lth;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Bi….Action>().toSerialized()");
        this.a = r;
    }

    public final ajfb<a> a() {
        return this.f;
    }

    public final ajdp<b> b() {
        return (ajdp) this.g.b();
    }
}
