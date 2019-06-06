package defpackage;

/* renamed from: kwz */
public final class kwz implements mhi<mha> {
    final ajdp<dps> a;
    private final mhi<mza> b;

    /* renamed from: kwz$a */
    public static final class a implements mha {
        private /* synthetic */ kwz a;
        private /* synthetic */ mza b;

        /* renamed from: kwz$a$a */
        static final class a<T, R> implements ajfc<T, R> {
            public static final a a = new a();

            a() {
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x003c in {2, 6, 8, 10} preds:[]
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
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r7) {
                /*
                r6 = this;
                r7 = (defpackage.dps) r7;
                r0 = "location";
                defpackage.akcr.b(r7, r0);
                r0 = new mzc$a$b;
                r1 = r7.a;
                r2 = defpackage.dps.a.b.a;
                r2 = defpackage.akcr.a(r1, r2);
                if (r2 == 0) goto L_0x0018;
                r1 = defpackage.mzc.a.a.b.a;
                r1 = (defpackage.mzc.a.a) r1;
                goto L_0x0023;
                r2 = defpackage.dps.a.a.a;
                r1 = defpackage.akcr.a(r1, r2);
                if (r1 == 0) goto L_0x0036;
                r1 = defpackage.mzc.a.a.a.a;
                goto L_0x0015;
                r7 = r7.b;
                r2 = new mih;
                r3 = r7.left;
                r4 = r7.top;
                r5 = r7.right;
                r7 = r7.bottom;
                r2.<init>(r3, r4, r5, r7);
                r0.<init>(r1, r2);
                return r0;
                r7 = new ajxk;
                r7.<init>();
                throw r7;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kwz$a$a.apply(java.lang.Object):java.lang.Object");
            }
        }

        a(kwz kwz, mza mza) {
            this.a = kwz;
            this.b = mza;
        }

        public final ajej a() {
            ajei ajei = new ajei();
            ajvv.a(ajei, this.b.a());
            ajej f = this.a.a.p(a.a).f(this.b.d().a());
            akcr.a((Object) f, "lensesCameraControlLocat…Component.useCase.inputs)");
            ajvv.a(ajei, f);
            return ajei;
        }

        public final ajdp<Object> b() {
            return defpackage.mha.a.a(this);
        }
    }

    public kwz(ajdp<dps> ajdp, mhi<mza> mhi) {
        akcr.b(ajdp, "lensesCameraControlLocation");
        akcr.b(mhi, "screenZonesBuilder");
        this.a = ajdp;
        this.b = mhi;
    }

    public final /* synthetic */ Object a() {
        return new a(this, (mza) this.b.a());
    }
}
