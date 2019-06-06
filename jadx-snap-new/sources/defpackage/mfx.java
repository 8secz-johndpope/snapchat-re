package defpackage;

import defpackage.mgj.a;
import defpackage.mgj.b;

/* renamed from: mfx */
public final class mfx implements mgj {
    final ajws<a> a;
    final ajdp<mmt> b;
    private final ajxe c = ajxh.a(new b(this));

    /* renamed from: mfx$a */
    static final class a extends akcq implements akbl<defpackage.mgj.a, ajxw> {
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
            defpackage.mgj.a aVar = (defpackage.mgj.a) obj;
            akcr.b(aVar, "p1");
            ((ajws) this.receiver).a((Object) aVar);
            return ajxw.a;
        }
    }

    /* renamed from: mfx$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.mgj.b>> {
        final /* synthetic */ mfx a;

        /* renamed from: mfx$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;

            /* renamed from: mfx$b$1$a */
            static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ mmt a;

                a(mmt mmt) {
                    this.a = mmt;
                }

                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0048 in {2, 6, 8, 10} preds:[]
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
                    r9 = (defpackage.mgj.a) r9;
                    r0 = "it";
                    defpackage.akcr.b(r9, r0);
                    r0 = r8.a;
                    r0 = r0.q();
                    r0 = r0.c();
                    r1 = r9 instanceof defpackage.mgj.a.b;
                    if (r1 == 0) goto L_0x002a;
                    r1 = new mou$a$b;
                    r9 = (defpackage.mgj.a.b) r9;
                    r3 = r9.a;
                    r4 = r9.b;
                    r5 = r9.c;
                    r6 = r9.d;
                    r7 = r9.e;
                    r2 = r1;
                    r2.<init>(r3, r4, r5, r6, r7);
                    r1 = (defpackage.mou.a) r1;
                    goto L_0x0038;
                    r1 = r9 instanceof defpackage.mgj.a.a;
                    if (r1 == 0) goto L_0x0042;
                    r1 = new mou$a$a;
                    r9 = (defpackage.mgj.a.a) r9;
                    r9 = r9.a;
                    r1.<init>(r9);
                    goto L_0x0027;
                    r0.accept(r1);
                    r9 = defpackage.ajot.a;
                    r9 = defpackage.ajvo.a(r9);
                    return r9;
                    r9 = new ajxk;
                    r9.<init>();
                    throw r9;
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mfx$b$1$a.apply(java.lang.Object):java.lang.Object");
                }
            }

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "lensCore");
                return ajdp.b((ajdt) mmt.q().d(), (ajdt) this.a.a.a.u(new a(mmt)));
            }
        }

        /* renamed from: mfx$b$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x0088 in {10, 12, 13, 14, 15, 19, 20, 21, 22, 23, 24, 25, 26, 28, 32, 35, 37} preds:[]
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
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r8) {
                /*
                r7 = this;
                r8 = (defpackage.mou.c) r8;
                r0 = "it";
                defpackage.akcr.b(r8, r0);
                r0 = r8 instanceof defpackage.mou.c.b;
                if (r0 == 0) goto L_0x0069;
                r0 = new mgj$b$b;
                r8 = (defpackage.mou.c.b) r8;
                r2 = r8.a;
                r3 = r8.b;
                r4 = r8.c;
                r1 = r8.d;
                r5 = defpackage.mfy.a;
                r1 = r1.ordinal();
                r1 = r5[r1];
                r5 = 1;
                if (r1 == r5) goto L_0x003a;
                r5 = 2;
                if (r1 == r5) goto L_0x0037;
                r5 = 3;
                if (r1 == r5) goto L_0x0034;
                r5 = 4;
                if (r1 != r5) goto L_0x002e;
                r1 = defpackage.mgc.Url;
                goto L_0x003c;
                r8 = new ajxk;
                r8.<init>();
                throw r8;
                r1 = defpackage.mgc.Phone;
                goto L_0x003c;
                r1 = defpackage.mgc.Number;
                goto L_0x003c;
                r1 = defpackage.mgc.Text;
                r5 = r1;
                r8 = r8.e;
                r1 = defpackage.mfy.b;
                r8 = r8.ordinal();
                r8 = r1[r8];
                switch(r8) {
                    case 1: goto L_0x005f;
                    case 2: goto L_0x005c;
                    case 3: goto L_0x0059;
                    case 4: goto L_0x0056;
                    case 5: goto L_0x0053;
                    case 6: goto L_0x0050;
                    default: goto L_0x004a;
                };
                r8 = new ajxk;
                r8.<init>();
                throw r8;
                r8 = defpackage.mgd.Send;
                goto L_0x0061;
                r8 = defpackage.mgd.Search;
                goto L_0x0061;
                r8 = defpackage.mgd.Return;
                goto L_0x0061;
                r8 = defpackage.mgd.Next;
                goto L_0x0061;
                r8 = defpackage.mgd.Go;
                goto L_0x0061;
                r8 = defpackage.mgd.Done;
                r6 = r8;
                r1 = r0;
                r1.<init>(r2, r3, r4, r5, r6);
                r0 = (defpackage.mgj.b) r0;
                return r0;
                r0 = r8 instanceof defpackage.mou.c.a;
                if (r0 == 0) goto L_0x0072;
                r8 = defpackage.mgj.b.a.a;
                r8 = (defpackage.mgj.b) r8;
                return r8;
                r0 = r8 instanceof defpackage.mou.c.c;
                if (r0 == 0) goto L_0x0082;
                r0 = new mgj$b$c;
                r8 = (defpackage.mou.c.c) r8;
                r1 = r8.a;
                r8 = r8.b;
                r0.<init>(r1, r8);
                goto L_0x0066;
                r8 = new ajxk;
                r8.<init>();
                throw r8;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mfx$b$2.apply(java.lang.Object):java.lang.Object");
            }
        }

        b(mfx mfx) {
            this.a = mfx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(this.a.b.u(new 1(this)).p(2.a)).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mfx.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public mfx(ajdp<mmt> ajdp) {
        akcr.b(ajdp, "lensCore");
        this.b = ajdp;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Te….Action>().toSerialized()");
        this.a = r;
    }

    public final ajfb<a> a() {
        return new mfz(new a(this.a));
    }

    public final ajdp<b> b() {
        return (ajdp) this.c.b();
    }
}
