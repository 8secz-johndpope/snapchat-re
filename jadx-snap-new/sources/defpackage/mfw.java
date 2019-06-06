package defpackage;

import defpackage.mgk.b;
import defpackage.mgk.b.a;

/* renamed from: mfw */
public final class mfw implements mgi {
    private final ajdp<mgk> a;
    private final mgj b;
    private final zfw c;

    /* renamed from: mfw$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x003f in {2, 4, 8, 11, 13} preds:[]
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
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r8) {
            /*
            r7 = this;
            r8 = (defpackage.mgj.b) r8;
            r0 = "it";
            defpackage.akcr.b(r8, r0);
            r0 = r8 instanceof defpackage.mgj.b.b;
            if (r0 == 0) goto L_0x0020;
            r0 = new mgk$b$b;
            r8 = (defpackage.mgj.b.b) r8;
            r2 = r8.a;
            r3 = r8.b;
            r4 = r8.c;
            r5 = r8.d;
            r6 = r8.e;
            r1 = r0;
            r1.<init>(r2, r3, r4, r5, r6);
            r0 = (defpackage.mgk.b) r0;
            return r0;
            r0 = r8 instanceof defpackage.mgj.b.a;
            if (r0 == 0) goto L_0x0029;
            r8 = defpackage.mgk.b.a.a;
            r8 = (defpackage.mgk.b) r8;
            return r8;
            r0 = r8 instanceof defpackage.mgj.b.c;
            if (r0 == 0) goto L_0x0039;
            r0 = new mgk$b$c;
            r8 = (defpackage.mgj.b.c) r8;
            r1 = r8.a;
            r8 = r8.b;
            r0.<init>(r1, r8);
            goto L_0x001d;
            r8 = new ajxk;
            r8.<init>();
            throw r8;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mfw$d.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: mfw$a */
    static final class a<T> implements ajfb<ajxm<? extends mgk, ? extends b>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((mgk) ajxm.a).accept((b) ajxm.b);
        }
    }

    /* renamed from: mfw$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mgk mgk = (mgk) obj;
            akcr.b(mgk, "it");
            return mgk.a();
        }
    }

    /* renamed from: mfw$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0034 in {2, 4, 7, 9} preds:[]
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
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r8) {
            /*
            r7 = this;
            r8 = (defpackage.mgk.a) r8;
            r0 = "it";
            defpackage.akcr.b(r8, r0);
            r0 = r8 instanceof defpackage.mgk.a.b;
            if (r0 == 0) goto L_0x0020;
            r0 = new mgj$a$b;
            r8 = (defpackage.mgk.a.b) r8;
            r2 = r8.a;
            r3 = r8.b;
            r4 = r8.c;
            r5 = r8.d;
            r6 = r8.e;
            r1 = r0;
            r1.<init>(r2, r3, r4, r5, r6);
            r0 = (defpackage.mgj.a) r0;
            return r0;
            r0 = r8 instanceof defpackage.mgk.a.a;
            if (r0 == 0) goto L_0x002e;
            r0 = new mgj$a$a;
            r8 = (defpackage.mgk.a.a) r8;
            r8 = r8.a;
            r0.<init>(r8);
            goto L_0x001d;
            r8 = new ajxk;
            r8.<init>();
            throw r8;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mfw$c.apply(java.lang.Object):java.lang.Object");
        }
    }

    public mfw(ajdp<mgk> ajdp, mgj mgj, zfw zfw) {
        akcr.b(ajdp, "view");
        akcr.b(mgj, "useCase");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = mgj;
        this.c = zfw;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        Object h = this.b.b().p(d.a).h(a.a);
        ajdp ajdp = this.a;
        akcr.a(h, "viewModel");
        ajej f = myu.a(ajdp, h).a((ajdw) this.c.l()).f((ajfb) a.a);
        akcr.a((Object) f, "pairLatest(view, viewMod…) -> view.accept(model) }");
        ajvv.a(ajei, f);
        f = this.a.a((ajdw) this.c.l()).u(b.a).p(c.a).f(this.b.a());
        akcr.a((Object) f, "view\n                .ob…subscribe(useCase.inputs)");
        ajvv.a(ajei, f);
        return ajei;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
