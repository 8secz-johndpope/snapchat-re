package defpackage;

import defpackage.mbw.a;

/* renamed from: mbj */
public final class mbj implements mbt {
    private final ajdp<mbw> a;
    private final mbv b;
    private final ajdu<a, a> c;
    private final zfw d;

    /* renamed from: mbj$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0028 in {2, 4, 7, 9} preds:[]
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
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r2) {
            /*
            r1 = this;
            r2 = (defpackage.mbv.b) r2;
            r0 = "result";
            defpackage.akcr.b(r2, r0);
            r0 = defpackage.mbv.b.b.a;
            r0 = defpackage.akcr.a(r2, r0);
            if (r0 == 0) goto L_0x0017;
            r2 = new mbw$a$b;
            r2.<init>();
            r2 = (defpackage.mbw.a) r2;
            return r2;
            r0 = defpackage.mbv.b.a.a;
            r2 = defpackage.akcr.a(r2, r0);
            if (r2 == 0) goto L_0x0022;
            r2 = defpackage.mbw.a.a.a;
            goto L_0x0014;
            r2 = new ajxk;
            r2.<init>();
            throw r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mbj$b.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: mbj$a */
    static final class a<T> implements ajfb<ajxm<? extends mbw, ? extends defpackage.mbw.a>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((mbw) ajxm.a).accept((defpackage.mbw.a) ajxm.b);
        }
    }

    public mbj(ajdp<mbw> ajdp, mbv mbv, ajdu<a, a> ajdu, zfw zfw) {
        akcr.b(ajdp, "view");
        akcr.b(mbv, "useCase");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(zfw, "schedulers");
        this.a = ajdp;
        this.b = mbv;
        this.c = ajdu;
        this.d = zfw;
    }

    public final ajej a() {
        Object j = this.b.b().p(b.a).a(this.c).j(ajfu.a);
        ajdp ajdp = this.a;
        akcr.a(j, "viewModels");
        j = myu.a(ajdp, j).a((ajdw) this.d.l()).f((ajfb) a.a);
        akcr.a(j, "pairLatest(view, viewMod…) -> view.accept(model) }");
        return j;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
