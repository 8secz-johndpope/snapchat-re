package defpackage;

/* renamed from: dbm */
public final class dbm extends dat<dbl> {
    private final ajwy<iha> a;
    private long b;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x005e in {8, 10, 16, 17, 21} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final boolean a(defpackage.dbl r11) {
        /*
        r10 = this;
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = android.os.SystemClock.elapsedRealtime();
        monitor-enter(r10);
        r3 = 0;
        r0.putAll(r3);	 Catch:{ all -> 0x005b }
        r3.clear();	 Catch:{ all -> 0x005b }
        r10.b = r1;	 Catch:{ all -> 0x005b }
        monitor-exit(r10);	 Catch:{ all -> 0x005b }
        r1 = r0.isEmpty();
        r2 = 1;
        if (r1 == 0) goto L_0x0020;
        r11.a = r3;
        r11.b = r3;
        return r2;
        r4 = 0;
        r1 = r0.entrySet();
        r1 = r1.iterator();
        r6 = r1.hasNext();
        if (r6 == 0) goto L_0x004c;
        r6 = r1.next();
        r6 = (java.util.Map.Entry) r6;
        r7 = r6.getValue();
        r7 = (java.lang.Long) r7;
        r7 = r7.longValue();
        r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r9 <= 0) goto L_0x002a;
        r3 = r6.getKey();
        r3 = (java.lang.String) r3;
        r4 = r7;
        goto L_0x002a;
        r1 = r10.a;
        r1 = r1.get();
        r1 = (defpackage.iha) r1;
        r0 = r1.b(r0);
        r11.a = r0;
        goto L_0x001d;
        r11 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x005b }
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbm.a(dbl):boolean");
    }

    public final /* synthetic */ das b() {
        return new dbl();
    }
}
