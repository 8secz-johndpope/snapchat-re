package defpackage;

/* renamed from: adch */
public final class adch<K, V extends adci> {
    private final jb<K, V> a;
    private final String b;

    public adch(final String str, int i) {
        this.b = str;
        this.a = new jb<K, V>(i) {
            public final /* synthetic */ void a(boolean z, Object obj, Object obj2, Object obj3) {
                adci adci = (adci) obj2;
                super.a(z, obj, adci, (adci) obj3);
                adci.dispose();
            }
        };
    }

    public final synchronized V a(K k) {
        adci adci = (adci) this.a.a((Object) k);
        if (adci == null) {
            return null;
        }
        if (adci.isDisposed()) {
            this.a.b(k);
            return null;
        }
        adci = adci.b(this.b);
        this.a.b(k);
        return adci;
    }

    public final synchronized void a() {
        this.a.a();
    }

    /* JADX WARNING: Missing block: B:13:0x0027, code skipped:
            return;
     */
    public final synchronized void a(K r3, V r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r4.isDisposed();	 Catch:{ all -> 0x0028 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r2);
        return;
    L_0x0009:
        r0 = r2.a;	 Catch:{ all -> 0x0028 }
        r0 = r0.a(r3);	 Catch:{ all -> 0x0028 }
        r0 = (defpackage.adci) r0;	 Catch:{ all -> 0x0028 }
        if (r0 == 0) goto L_0x0021;
    L_0x0013:
        r0 = r0.a();	 Catch:{ all -> 0x0028 }
        r1 = r4.a();	 Catch:{ all -> 0x0028 }
        r0 = r0.equals(r1);	 Catch:{ all -> 0x0028 }
        if (r0 != 0) goto L_0x0026;
    L_0x0021:
        r0 = r2.a;	 Catch:{ all -> 0x0028 }
        r0.a(r3, r4);	 Catch:{ all -> 0x0028 }
    L_0x0026:
        monitor-exit(r2);
        return;
    L_0x0028:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adch.a(java.lang.Object, adci):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0019 in {6, 8, 9, 12} preds:[]
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
    public final synchronized boolean b(K r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.a;	 Catch:{ all -> 0x0016 }
        r2 = r0.a(r2);	 Catch:{ all -> 0x0016 }
        r2 = (defpackage.adci) r2;	 Catch:{ all -> 0x0016 }
        if (r2 == 0) goto L_0x0014;	 Catch:{ all -> 0x0016 }
        r2 = r2.isDisposed();	 Catch:{ all -> 0x0016 }
        if (r2 != 0) goto L_0x0014;
        r2 = 1;
        monitor-exit(r1);
        return r2;
        r2 = 0;
        goto L_0x0012;
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adch.b(java.lang.Object):boolean");
    }
}
