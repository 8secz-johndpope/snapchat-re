package defpackage;

import java.util.List;

/* renamed from: lhf */
public final class lhf implements ajdu<List<? extends zsm>, List<? extends mux>> {
    final lfq a;
    final muu b;
    private final ajdp<Boolean> c;
    private final ajdp<Boolean> d;

    /* renamed from: lhf$a */
    public static final class a<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
        private /* synthetic */ lhf a;

        public a(lhf lhf) {
            this.a = lhf;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x004e in {5, 7, 9} preds:[]
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
        public final R apply(T1 r3, T2 r4, T3 r5) {
            /*
            r2 = this;
            r5 = (java.lang.Boolean) r5;
            r5 = r5.booleanValue();
            r4 = (java.lang.Boolean) r4;
            r4 = r4.booleanValue();
            r3 = (java.util.List) r3;
            r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x004c }
            r0 = new java.util.ArrayList;	 Catch:{ all -> 0x004c }
            r1 = 10;	 Catch:{ all -> 0x004c }
            r1 = defpackage.ajyn.a(r3, r1);	 Catch:{ all -> 0x004c }
            r0.<init>(r1);	 Catch:{ all -> 0x004c }
            r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x004c }
            r3 = r3.iterator();	 Catch:{ all -> 0x004c }
            r1 = r3.hasNext();	 Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0033;	 Catch:{ all -> 0x004c }
            r1 = r3.next();	 Catch:{ all -> 0x004c }
            r1 = (defpackage.zsm) r1;	 Catch:{ all -> 0x004c }
            r1 = r1.b;	 Catch:{ all -> 0x004c }
            r0.add(r1);	 Catch:{ all -> 0x004c }
            goto L_0x0021;	 Catch:{ all -> 0x004c }
            r0 = (java.util.List) r0;	 Catch:{ all -> 0x004c }
            r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x004c }
            r3 = defpackage.lhe.a;	 Catch:{ all -> 0x004c }
            r3 = defpackage.ajyu.a(r0, r3);	 Catch:{ all -> 0x004c }
            r0 = r2.a;	 Catch:{ all -> 0x004c }
            r0 = r0.a;	 Catch:{ all -> 0x004c }
            r1 = r2.a;	 Catch:{ all -> 0x004c }
            r1 = r1.b;	 Catch:{ all -> 0x004c }
            r1 = (defpackage.mwg) r1;	 Catch:{ all -> 0x004c }
            r3 = defpackage.lfr.a(r3, r0, r1, r4, r5);	 Catch:{ all -> 0x004c }
            return r3;
            r3 = move-exception;
            throw r3;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lhf$a.apply(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public lhf(ajdp<Boolean> ajdp, ajdp<Boolean> ajdp2, lfq lfq, muu muu) {
        akcr.b(ajdp, "sponsoredLensesEnabled");
        akcr.b(ajdp2, "snappablesEnabled");
        akcr.b(lfq, "geofilterToLensMapper");
        akcr.b(muu, "lensSource");
        this.c = ajdp;
        this.d = ajdp2;
        this.a = lfq;
        this.b = muu;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        ajdp = ajdp.a((ajdt) ajdp, (ajdt) this.c, (ajdt) this.d, (ajfd) new a(this));
        if (ajdp == null) {
            akcr.a();
        }
        Object f = ajdp.f((ajdt) ajvo.a(ajot.a));
        akcr.a(f, "Observables\n            …eNext(Observable.empty())");
        return (ajdt) f;
    }
}
