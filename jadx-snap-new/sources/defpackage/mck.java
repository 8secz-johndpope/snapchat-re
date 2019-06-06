package defpackage;

import defpackage.mci.a;

/* renamed from: mck */
public final class mck implements mcf {
    private final ajdp<mci> a;
    private final mch b;
    private final ajdu<a, a> c;
    private final zfw d;

    /* renamed from: mck$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x002a in {2, 4, 7, 10, 12} preds:[]
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
            r2 = (defpackage.mch.a) r2;
            r0 = "result";
            defpackage.akcr.b(r2, r0);
            r0 = r2 instanceof defpackage.mch.a.b.b;
            if (r0 == 0) goto L_0x0013;
            r2 = new mci$a$b$b;
            r2.<init>();
            r2 = (defpackage.mci.a) r2;
            return r2;
            r0 = r2 instanceof defpackage.mch.a.b.a;
            if (r0 == 0) goto L_0x001d;
            r2 = new mci$a$b$a;
            r2.<init>();
            goto L_0x0010;
            r2 = r2 instanceof defpackage.mch.a.a;
            if (r2 == 0) goto L_0x0024;
            r2 = defpackage.mci.a.a.a;
            goto L_0x0010;
            r2 = new ajxk;
            r2.<init>();
            throw r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mck$b.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: mck$a */
    static final class a<T> implements ajfb<ajxm<? extends mci, ? extends defpackage.mci.a>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((mci) ajxm.a).accept((defpackage.mci.a) ajxm.b);
        }
    }

    public mck(ajdp<mci> ajdp, mch mch, ajdu<a, a> ajdu, zfw zfw) {
        akcr.b(ajdp, "view");
        akcr.b(mch, "useCase");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = mch;
        this.c = ajdu;
        this.d = zfw;
    }

    public final ajej a() {
        Object a = this.b.b().p(b.a).a(this.c);
        ajdp ajdp = this.a;
        akcr.a(a, "viewModel");
        a = myu.a(ajdp, a).a((ajdw) this.d.l()).f((ajfb) a.a);
        akcr.a(a, "pairLatest(view, viewMod…) -> view.accept(model) }");
        return a;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
