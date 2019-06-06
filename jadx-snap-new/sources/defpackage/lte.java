package defpackage;

import defpackage.lqf.b;
import defpackage.lsa.a;
import defpackage.lsa.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: lte */
public final class lte implements lsa {
    final mib<a> a;
    final mwe b;
    final ajdp<lqf> c;
    private final ajfb<a> d = this.a.a();
    private final ajxe e = ajxh.a(new a(this));
    private final lsw f;

    /* renamed from: lte$a */
    static final class a extends akcs implements akbk<ajdp<d>> {
        final /* synthetic */ lte a;

        /* renamed from: lte$a$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof b;
            }
        }

        /* renamed from: lte$a$d */
        static final class d<T, R> implements ajfc<T, R> {
            public static final d a = new d();

            d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                b bVar = (b) obj;
                akcr.b(bVar, "it");
                return bVar.a();
            }
        }

        /* renamed from: lte$a$h */
        static final class h<T> implements ajfl<defpackage.lsa.a> {
            public static final h a = new h();

            h() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                obj = (defpackage.lsa.a) obj;
                akcr.b(obj, "it");
                return akcr.a(obj, defpackage.lsa.a.b.a);
            }
        }

        /* renamed from: lte$a$b */
        static final class b<T> implements ajfl<defpackage.lsa.a> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                defpackage.lsa.a aVar = (defpackage.lsa.a) obj;
                akcr.b(aVar, "it");
                return aVar instanceof defpackage.lsa.a.a;
            }
        }

        /* renamed from: lte$a$e */
        static final class e extends akcs implements akbw<lrd, lqe, lrd> {
            public static final e a = new e();

            e() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                lrd lrd = (lrd) obj;
                obj2 = (lqe) obj2;
                akcr.b(lrd, "previousFlipEvent");
                lqe lqe = lrd.a;
                akcr.a(obj2, "arrivedCameraFacing");
                return new lrd(lqe, obj2);
            }
        }

        /* renamed from: lte$a$c */
        static final class c<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
            private /* synthetic */ ajdp a;

            c(ajdp ajdp) {
                this.a = ajdp;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ajdp) obj, "<anonymous parameter 0>");
                return this.a;
            }
        }

        /* renamed from: lte$a$f */
        static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ ajdp a;

            f(ajdp ajdp) {
                this.a = ajdp;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajxm ajxm = (ajxm) obj;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                final lrd lrd = (lrd) ajxm.a;
                final List list = (List) ajxm.b;
                return this.a.p(new ajfc<T, R>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        defpackage.lsa.a aVar = (defpackage.lsa.a) obj;
                        akcr.b(aVar, "action");
                        Object obj2 = lrd;
                        akcr.a(obj2, "flipEvent");
                        Object obj3 = list;
                        akcr.a(obj3, "lenses");
                        return new lse(obj2, aVar, obj3);
                    }
                });
            }
        }

        /* renamed from: lte$a$g */
        static final class g<T1, T2> implements ajey<lse, lse> {
            public static final g a = new g();

            g() {
            }

            public final /* synthetic */ boolean test(Object obj, Object obj2) {
                lse lse = (lse) obj;
                lse lse2 = (lse) obj2;
                akcr.b(lse, "previous");
                akcr.b(lse2, "new");
                return akcr.a(lse.d, defpackage.lsa.a.b.a) && akcr.a(lse2.d, defpackage.lsa.a.b.a);
            }
        }

        /* renamed from: lte$a$1 */
        static final class 1 extends akcs implements akbw<ltd, lse, ltd> {
            private /* synthetic */ a a;

            1(a aVar) {
                this.a = aVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                ltd ltd = (ltd) obj;
                lse lse = (lse) obj2;
                akcr.b(ltd, "previousState");
                lte lte = this.a.a;
                akcr.a((Object) lse, "event");
                return lte.a(ltd, lse);
            }
        }

        /* renamed from: lte$a$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 2 a = new 2();

            2() {
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:40:0x0126 in {2, 4, 7, 14, 15, 16, 19, 20, 23, 24, 25, 27, 32, 33, 35, 37, 39} preds:[]
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
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r9) {
                /*
                r8 = this;
                r9 = (defpackage.ltd) r9;
                r0 = "state";
                defpackage.akcr.b(r9, r0);
                r0 = r9.f;
                r1 = defpackage.lsa.a.b.a;
                r1 = defpackage.akcr.a(r0, r1);
                if (r1 == 0) goto L_0x001a;
                r9 = defpackage.lsa.d.b.a;
                r9 = defpackage.ajdp.b(r9);
                r9 = (defpackage.ajdt) r9;
                return r9;
                r1 = r0 instanceof defpackage.lsa.a.a.a;
                if (r1 == 0) goto L_0x0036;
                r0 = new lsa$d$a$a;
                r1 = r9.c;
                r2 = r9.b;
                r3 = r9.a();
                r9 = r9.f;
                r9 = (defpackage.lsa.a.a.a) r9;
                r9 = r9.a;
                r0.<init>(r1, r2, r3, r9);
                r9 = defpackage.ajdp.b(r0);
                goto L_0x0017;
                r1 = r0 instanceof defpackage.lsa.a.a.c;
                if (r1 == 0) goto L_0x00e4;
                r0 = r9.g;
                if (r0 == 0) goto L_0x006e;
                r0 = r9.h;
                r1 = "just(CarouselUseCase.Res…tivationSource.EXTERNAL))";
                if (r0 == 0) goto L_0x0057;
                r0 = new lsa$d$a$b;
                r3 = r9.h;
                r4 = r9.c;
                r5 = r9.b;
                r6 = r9.a();
                r7 = defpackage.lsa.b.EXTERNAL;
                r2 = r0;
                r2.<init>(r3, r4, r5, r6, r7);
                goto L_0x0066;
                r0 = new lsa$d$a$a;
                r2 = r9.c;
                r3 = r9.b;
                r9 = r9.a();
                r4 = defpackage.lsa.b.EXTERNAL;
                r0.<init>(r2, r3, r9, r4);
                r9 = defpackage.ajdp.b(r0);
                defpackage.akcr.a(r9, r1);
                goto L_0x00e1;
                r0 = r9.b;
                r0 = (java.util.Collection) r0;
                r1 = r9.c;
                r1 = (java.lang.Iterable) r1;
                r0 = defpackage.ajyu.d(r0, r1);
                r0 = (java.lang.Iterable) r0;
                r1 = r9.f;
                r1 = (defpackage.lsa.a.a.c) r1;
                r1 = r1.a;
                r1 = (defpackage.mhs) r1;
                r0 = defpackage.ltf.a(r0, r1);
                if (r0 == 0) goto L_0x00ae;
                r0 = new lsa$d$a$b;
                r1 = r9.f;
                r1 = (defpackage.lsa.a.a.c) r1;
                r2 = r1.a;
                r3 = r9.c;
                r4 = r9.b;
                r5 = r9.a();
                r9 = r9.f;
                r9 = (defpackage.lsa.a.a.c) r9;
                r6 = r9.b;
                r1 = r0;
                r1.<init>(r2, r3, r4, r5, r6);
                r9 = defpackage.ajdp.b(r0);
                r0 = "just(CarouselUseCase.Res… tag = state.action.tag))";
                defpackage.akcr.a(r9, r0);
                goto L_0x00e1;
                r0 = r9.d;
                r0 = (java.lang.Iterable) r0;
                r1 = r9.f;
                r1 = (defpackage.lsa.a.a.c) r1;
                r1 = r1.a;
                r1 = (defpackage.mhs) r1;
                r0 = defpackage.ltf.a(r0, r1);
                if (r0 == 0) goto L_0x00d8;
                r0 = new lsa$d$a$a;
                r1 = r9.c;
                r2 = r9.b;
                r3 = r9.a();
                r9 = r9.f;
                r9 = (defpackage.lsa.a.a.c) r9;
                r9 = r9.b;
                r0.<init>(r1, r2, r3, r9);
                r9 = defpackage.ajdp.b(r0);
                goto L_0x00de;
                r9 = defpackage.ajot.a;
                r9 = defpackage.ajvo.a(r9);
                r0 = "if (state.removedLenses.…                        }";
                goto L_0x00aa;
                r9 = (defpackage.ajdt) r9;
                return r9;
                r1 = r0 instanceof defpackage.lsa.a.a.b;
                if (r1 == 0) goto L_0x0116;
                r0 = r9.c;
                r0 = defpackage.ajyu.g(r0);
                r0 = (defpackage.mux) r0;
                if (r0 != 0) goto L_0x00f9;
                r9 = defpackage.ajot.a;
                r9 = defpackage.ajvo.a(r9);
                goto L_0x0113;
                r6 = new lsa$d$a$b;
                r1 = r0.a;
                r2 = r9.c;
                r3 = r9.b;
                r4 = r9.a();
                r9 = r9.f;
                r9 = (defpackage.lsa.a.a.b) r9;
                r5 = r9.a;
                r0 = r6;
                r0.<init>(r1, r2, r3, r4, r5);
                r9 = defpackage.ajdp.b(r6);
                r9 = (defpackage.ajdt) r9;
                return r9;
                if (r0 != 0) goto L_0x0120;
                r9 = defpackage.ajot.a;
                r9 = defpackage.ajvo.a(r9);
                goto L_0x0017;
                r9 = new ajxk;
                r9.<init>();
                throw r9;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lte$a$2.apply(java.lang.Object):java.lang.Object");
            }
        }

        a(lte lte) {
            this.a = lte;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object j = this.a.c.j(ajfu.a);
            akcr.a(j, "cameraLifecycle\n        …  .distinctUntilChanged()");
            j = j.a((ajfl) a.a).a(b.class);
            akcr.a(j, "this.filter { it is R }.cast(R::class.java)");
            j = j.p(d.a);
            akcr.a(j, "cameraLifecycle\n        … .map { it.cameraFacing }");
            j = ltf.a(j, lrd.b, e.a);
            ajdp ajdp = (ajdp) this.a.a.invoke();
            ajdp a = ajdp.a((ajfl) h.a);
            ajdp = cfc.a(ajdp);
            ajdp a2 = ajdp.a((ajfl) b.a);
            Object h = this.a.b.a(defpackage.mwe.a.a.a).j().j((ajdt) a).t(new c(a2)).d((ajdt) a2).h((Object) ajyw.a);
            akcr.a(h, "lensRepository.query(Len…rtWith(emptyList<Lens>())");
            akcr.a(j, "cameraFlips");
            j = ajwa.a(j, h).e((ajdt) myu.a(ajdp)).u(new f(ajdp)).a((ajey) g.a);
            akcr.a(j, "Observables.combineLates…ctivate\n                }");
            j = ltf.a(j, new ltd(), new 1(this));
            akcr.a(j, "compositeEvents\n        …e(previousState, event) }");
            j = mip.c(j, "SwitchScheduleCarouselUseCase:resultDownstream").u(2.a);
            akcr.a(j, "compositeEvents\n        …      }\n                }");
            return cfc.a(j);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lte.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public lte(mwe mwe, ajdp<lqf> ajdp, lsw lsw, zfw zfw) {
        akcr.b(mwe, "lensRepository");
        akcr.b(ajdp, "cameraLifecycle");
        akcr.b(lsw, "lensesListTransformer");
        akcr.b(zfw, "qualifiedSchedulers");
        this.b = mwe;
        this.c = ajdp;
        this.f = lsw;
        this.a = mhv.a(TimeUnit.MILLISECONDS, zfw.h());
    }

    private static List<mux> a(List<mux> list, mux mux) {
        int i;
        Object obj;
        Iterator it = list.iterator();
        Object obj2;
        do {
            i = 0;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            mux mux2 = (mux) obj;
            if (mux2.k == muu.SCHEDULED_FRONT || mux2.k == muu.SCHEDULED_REAR) {
                obj2 = 1;
                continue;
            } else {
                obj2 = null;
                continue;
            }
        } while (obj2 == null);
        mux mux3 = (mux) obj;
        if (mux3 != null) {
            i = list.indexOf(mux3);
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(i, mux);
        return arrayList;
    }

    public final ajfb<a> a() {
        return this.d;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:55:0x0178 in {9, 10, 16, 17, 20, 21, 24, 26, 29, 30, 33, 36, 42, 48, 51, 52, 54} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final defpackage.ltd a(defpackage.ltd r12, defpackage.lse r13) {
        /*
        r11 = this;
        r0 = "rightLenses";
        r10 = r13.d;	 Catch:{ all -> 0x0176 }
        r1 = r12.e;	 Catch:{ all -> 0x0176 }
        r2 = r13.c;	 Catch:{ all -> 0x0176 }
        r2 = r2.a;	 Catch:{ all -> 0x0176 }
        r3 = defpackage.lqe.FRONT;	 Catch:{ all -> 0x0176 }
        if (r2 != r3) goto L_0x0041;	 Catch:{ all -> 0x0176 }
        r2 = r13.e;	 Catch:{ all -> 0x0176 }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x0176 }
        r3 = r13.a;	 Catch:{ all -> 0x0176 }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0176 }
        r4.<init>();	 Catch:{ all -> 0x0176 }
        r4 = (java.util.Collection) r4;	 Catch:{ all -> 0x0176 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0176 }
        r5 = r2.hasNext();	 Catch:{ all -> 0x0176 }
        if (r5 == 0) goto L_0x0039;	 Catch:{ all -> 0x0176 }
        r5 = r2.next();	 Catch:{ all -> 0x0176 }
        r6 = r3.invoke(r5);	 Catch:{ all -> 0x0176 }
        r6 = (java.lang.Boolean) r6;	 Catch:{ all -> 0x0176 }
        r6 = r6.booleanValue();	 Catch:{ all -> 0x0176 }
        if (r6 == 0) goto L_0x001f;	 Catch:{ all -> 0x0176 }
        r4.add(r5);	 Catch:{ all -> 0x0176 }
        goto L_0x001f;	 Catch:{ all -> 0x0176 }
        r4 = (java.util.List) r4;	 Catch:{ all -> 0x0176 }
        r2 = new lsx$a;	 Catch:{ all -> 0x0176 }
        r2.<init>(r4);	 Catch:{ all -> 0x0176 }
        goto L_0x0073;	 Catch:{ all -> 0x0176 }
        r2 = r13.e;	 Catch:{ all -> 0x0176 }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x0176 }
        r3 = r13.b;	 Catch:{ all -> 0x0176 }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0176 }
        r4.<init>();	 Catch:{ all -> 0x0176 }
        r4 = (java.util.Collection) r4;	 Catch:{ all -> 0x0176 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0176 }
        r5 = r2.hasNext();	 Catch:{ all -> 0x0176 }
        if (r5 == 0) goto L_0x006c;	 Catch:{ all -> 0x0176 }
        r5 = r2.next();	 Catch:{ all -> 0x0176 }
        r6 = r3.invoke(r5);	 Catch:{ all -> 0x0176 }
        r6 = (java.lang.Boolean) r6;	 Catch:{ all -> 0x0176 }
        r6 = r6.booleanValue();	 Catch:{ all -> 0x0176 }
        if (r6 == 0) goto L_0x0052;	 Catch:{ all -> 0x0176 }
        r4.add(r5);	 Catch:{ all -> 0x0176 }
        goto L_0x0052;	 Catch:{ all -> 0x0176 }
        r4 = (java.util.List) r4;	 Catch:{ all -> 0x0176 }
        r2 = new lsx$b;	 Catch:{ all -> 0x0176 }
        r2.<init>(r4);	 Catch:{ all -> 0x0176 }
        r2 = (defpackage.lsx) r2;	 Catch:{ all -> 0x0176 }
        r6 = r2;	 Catch:{ all -> 0x0176 }
        r1 = r1.getClass();	 Catch:{ all -> 0x0176 }
        r2 = r6.getClass();	 Catch:{ all -> 0x0176 }
        r1 = defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0176 }
        r8 = r1 ^ 1;	 Catch:{ all -> 0x0176 }
        r1 = r10 instanceof defpackage.lsa.a.a.c;	 Catch:{ all -> 0x0176 }
        r2 = 0;	 Catch:{ all -> 0x0176 }
        if (r1 != 0) goto L_0x008b;	 Catch:{ all -> 0x0176 }
        r1 = r2;	 Catch:{ all -> 0x0176 }
        goto L_0x008c;	 Catch:{ all -> 0x0176 }
        r1 = r10;	 Catch:{ all -> 0x0176 }
        r1 = (defpackage.lsa.a.a.c) r1;	 Catch:{ all -> 0x0176 }
        if (r1 == 0) goto L_0x0092;	 Catch:{ all -> 0x0176 }
        r2 = r1.a;	 Catch:{ all -> 0x0176 }
        if (r8 == 0) goto L_0x0095;	 Catch:{ all -> 0x0176 }
        goto L_0x0099;	 Catch:{ all -> 0x0176 }
        r1 = r12.h;	 Catch:{ all -> 0x0176 }
        if (r1 != 0) goto L_0x009b;	 Catch:{ all -> 0x0176 }
        r9 = r2;	 Catch:{ all -> 0x0176 }
        goto L_0x009c;	 Catch:{ all -> 0x0176 }
        r9 = r1;	 Catch:{ all -> 0x0176 }
        r1 = r9;	 Catch:{ all -> 0x0176 }
        r1 = (defpackage.mhs) r1;	 Catch:{ all -> 0x0176 }
        r2 = r6.a();	 Catch:{ all -> 0x0176 }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x0176 }
        r1 = defpackage.ltf.a(r2, r1);	 Catch:{ all -> 0x0176 }
        if (r1 == 0) goto L_0x00b0;	 Catch:{ all -> 0x0176 }
        r1 = r6.a();	 Catch:{ all -> 0x0176 }
        goto L_0x00c5;	 Catch:{ all -> 0x0176 }
        r1 = r13.e;	 Catch:{ all -> 0x0176 }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0176 }
        r2 = r9;	 Catch:{ all -> 0x0176 }
        r2 = (defpackage.mhs) r2;	 Catch:{ all -> 0x0176 }
        r1 = defpackage.ltf.a(r1, r2);	 Catch:{ all -> 0x0176 }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ all -> 0x0176 }
        r2 = r6.a();	 Catch:{ all -> 0x0176 }
        r1 = defpackage.lte.a(r2, r1);	 Catch:{ all -> 0x0176 }
        r2 = r13.e;	 Catch:{ all -> 0x0176 }
        r13 = r11.f;	 Catch:{ all -> 0x0176 }
        r3 = r1;	 Catch:{ all -> 0x0176 }
        r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x0176 }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0176 }
        r4.<init>();	 Catch:{ all -> 0x0176 }
        r4 = (java.util.Collection) r4;	 Catch:{ all -> 0x0176 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0176 }
        r5 = r3.hasNext();	 Catch:{ all -> 0x0176 }
        if (r5 == 0) goto L_0x00ec;	 Catch:{ all -> 0x0176 }
        r5 = r3.next();	 Catch:{ all -> 0x0176 }
        r7 = r5;	 Catch:{ all -> 0x0176 }
        r7 = (defpackage.mux) r7;	 Catch:{ all -> 0x0176 }
        r7 = r7.p;	 Catch:{ all -> 0x0176 }
        if (r7 == 0) goto L_0x00d7;	 Catch:{ all -> 0x0176 }
        r4.add(r5);	 Catch:{ all -> 0x0176 }
        goto L_0x00d7;	 Catch:{ all -> 0x0176 }
        r4 = (java.util.List) r4;	 Catch:{ all -> 0x0176 }
        r13 = r13.apply(r4);	 Catch:{ all -> 0x0176 }
        r3 = "lensesListTransformer.ap…er { it.isLeftCarousel })";	 Catch:{ all -> 0x0176 }
        defpackage.akcr.a(r13, r3);	 Catch:{ all -> 0x0176 }
        r13 = (java.util.List) r13;	 Catch:{ all -> 0x0176 }
        r3 = defpackage.ajys.d(r13);	 Catch:{ all -> 0x0176 }
        r13 = r11.f;	 Catch:{ all -> 0x0176 }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0176 }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0176 }
        r4.<init>();	 Catch:{ all -> 0x0176 }
        r4 = (java.util.Collection) r4;	 Catch:{ all -> 0x0176 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0176 }
        r5 = r1.hasNext();	 Catch:{ all -> 0x0176 }
        if (r5 == 0) goto L_0x0123;	 Catch:{ all -> 0x0176 }
        r5 = r1.next();	 Catch:{ all -> 0x0176 }
        r7 = r5;	 Catch:{ all -> 0x0176 }
        r7 = (defpackage.mux) r7;	 Catch:{ all -> 0x0176 }
        r7 = r7.p;	 Catch:{ all -> 0x0176 }
        r7 = r7 ^ 1;	 Catch:{ all -> 0x0176 }
        if (r7 == 0) goto L_0x010c;	 Catch:{ all -> 0x0176 }
        r4.add(r5);	 Catch:{ all -> 0x0176 }
        goto L_0x010c;	 Catch:{ all -> 0x0176 }
        r4 = (java.util.List) r4;	 Catch:{ all -> 0x0176 }
        r13 = r13.apply(r4);	 Catch:{ all -> 0x0176 }
        r4 = r13;	 Catch:{ all -> 0x0176 }
        r4 = (java.util.List) r4;	 Catch:{ all -> 0x0176 }
        r12 = r12.a;	 Catch:{ all -> 0x0176 }
        r12 = (java.lang.Iterable) r12;	 Catch:{ all -> 0x0176 }
        r13 = r2;	 Catch:{ all -> 0x0176 }
        r13 = (java.lang.Iterable) r13;	 Catch:{ all -> 0x0176 }
        r5 = defpackage.ajyu.c(r12, r13);	 Catch:{ all -> 0x0176 }
        r12 = new ltd;	 Catch:{ all -> 0x0176 }
        defpackage.akcr.a(r4, r0);	 Catch:{ all -> 0x0176 }
        r1 = r12;	 Catch:{ all -> 0x0176 }
        r7 = r10;	 Catch:{ all -> 0x0176 }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0176 }
        r13 = defpackage.lsa.a.b.a;	 Catch:{ all -> 0x0176 }
        r13 = defpackage.akcr.a(r10, r13);	 Catch:{ all -> 0x0176 }
        if (r13 == 0) goto L_0x0175;	 Catch:{ all -> 0x0176 }
        r2 = r12.a;	 Catch:{ all -> 0x0176 }
        r3 = r12.b;	 Catch:{ all -> 0x0176 }
        r4 = r12.c;	 Catch:{ all -> 0x0176 }
        r5 = r12.d;	 Catch:{ all -> 0x0176 }
        r6 = r12.e;	 Catch:{ all -> 0x0176 }
        r7 = r12.f;	 Catch:{ all -> 0x0176 }
        r8 = r12.g;	 Catch:{ all -> 0x0176 }
        r12 = "allLenses";	 Catch:{ all -> 0x0176 }
        defpackage.akcr.b(r2, r12);	 Catch:{ all -> 0x0176 }
        r12 = "leftLenses";	 Catch:{ all -> 0x0176 }
        defpackage.akcr.b(r3, r12);	 Catch:{ all -> 0x0176 }
        defpackage.akcr.b(r4, r0);	 Catch:{ all -> 0x0176 }
        r12 = "removedLenses";	 Catch:{ all -> 0x0176 }
        defpackage.akcr.b(r5, r12);	 Catch:{ all -> 0x0176 }
        r12 = "currentSchedule";	 Catch:{ all -> 0x0176 }
        defpackage.akcr.b(r6, r12);	 Catch:{ all -> 0x0176 }
        r12 = new ltd;	 Catch:{ all -> 0x0176 }
        r9 = 0;	 Catch:{ all -> 0x0176 }
        r1 = r12;	 Catch:{ all -> 0x0176 }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0176 }
        return r12;
        r12 = move-exception;
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lte.a(ltd, lse):ltd");
    }

    public final ajdp<d> b() {
        return (ajdp) this.e.b();
    }
}
