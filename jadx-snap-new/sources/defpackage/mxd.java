package defpackage;

import defpackage.mxl.a;
import defpackage.mxl.b;

/* renamed from: mxd */
public final class mxd implements mxl {
    final ajvr<a> a;
    final mnr b;
    private final ajxe c = ajxh.a(new b(this));

    /* renamed from: mxd$a */
    static final class a extends akcq implements akbl<defpackage.mxl.a, ajxw> {
        a(ajvr ajvr) {
            super(1, ajvr);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajvr.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((ajvr) this.receiver).a((defpackage.mxl.a) obj);
            return ajxw.a;
        }
    }

    /* renamed from: mxd$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.mxl.b>> {
        final /* synthetic */ mxd a;

        /* renamed from: mxd$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;

            /* renamed from: mxd$b$1$1 */
            static final class 1<T, R> implements ajfc<T, R> {
                private /* synthetic */ a a;

                1(a aVar) {
                    this.a = aVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    byte[] bArr = (byte[]) obj;
                    akcr.b(bArr, "res");
                    return new defpackage.mxl.b.b(((defpackage.mxl.a.b) this.a).a, bArr);
                }
            }

            1(b bVar) {
                this.a = bVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x005c in {2, 4, 7, 8, 11, 13} preds:[]
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
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r3) {
                /*
                r2 = this;
                r3 = (defpackage.mxl.a) r3;
                r0 = "it";
                defpackage.akcr.b(r3, r0);
                r0 = r3 instanceof defpackage.mxl.a.b;
                if (r0 == 0) goto L_0x002a;
                r0 = r2.a;
                r0 = r0.a;
                r0 = r0.b;
                r1 = r3;
                r1 = (defpackage.mxl.a.b) r1;
                r1 = r1.a;
                r0 = r0.a(r1);
                r1 = new mxd$b$1$1;
                r1.<init>(r3);
                r1 = (defpackage.ajfc) r1;
                r3 = r0.f(r1);
                r3 = r3.i();
                return r3;
                r0 = r3 instanceof defpackage.mxl.a.c;
                if (r0 == 0) goto L_0x0045;
                r0 = r2.a;
                r0 = r0.a;
                r0 = r0.b;
                r3 = (defpackage.mxl.a.c) r3;
                r1 = r3.a;
                r3 = r3.b;
                r3 = r0.a(r1, r3);
                r0 = defpackage.mxl.b.c.a;
                r3 = r3.a(r0);
                goto L_0x0025;
                r3 = r3 instanceof defpackage.mxl.a.a;
                if (r3 == 0) goto L_0x0056;
                r3 = r2.a;
                r3 = r3.a;
                r3 = r3.b;
                r3 = r3.b();
                r0 = defpackage.mxl.b.a.a;
                goto L_0x0040;
                r3 = new ajxk;
                r3.<init>();
                throw r3;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mxd$b$1.apply(java.lang.Object):java.lang.Object");
            }
        }

        b(mxd mxd) {
            this.a = mxd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(this.a.a.j().u(new 1(this))).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mxd.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public mxd(mnr mnr) {
        akcr.b(mnr, "repository");
        this.b = mnr;
        Object l = ajvr.l();
        l.m();
        akcr.a(l, "MulticastProcessor.creat…y {\n        start()\n    }");
        this.a = l;
    }

    public final ajfb<a> a() {
        return new mxe(new a(this.a));
    }

    public final ajdp<b> b() {
        return (ajdp) this.c.b();
    }
}
