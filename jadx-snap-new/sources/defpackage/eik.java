package defpackage;

import java.util.NavigableMap;

/* renamed from: eik */
public final class eik {
    public final Object a = new Object();
    public NavigableMap<Integer, kaz<jwj>> b;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0041 in {8, 9, 12, 15} preds:[]
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
    public final java.util.NavigableMap<java.lang.Integer, defpackage.kaz<defpackage.jwj>> a(java.lang.String r6) {
        /*
        r5 = this;
        r0 = "owner";
        defpackage.akcr.b(r6, r0);
        r0 = r5.a;
        monitor-enter(r0);
        r1 = r5.b;	 Catch:{ all -> 0x003e }
        if (r1 == 0) goto L_0x0039;	 Catch:{ all -> 0x003e }
        r2 = new java.util.concurrent.ConcurrentSkipListMap;	 Catch:{ all -> 0x003e }
        r2.<init>();	 Catch:{ all -> 0x003e }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x003e }
        r1 = r1.entrySet();	 Catch:{ all -> 0x003e }
        r1 = r1.iterator();	 Catch:{ all -> 0x003e }
        r3 = r1.hasNext();	 Catch:{ all -> 0x003e }
        if (r3 == 0) goto L_0x003a;	 Catch:{ all -> 0x003e }
        r3 = r1.next();	 Catch:{ all -> 0x003e }
        r3 = (java.util.Map.Entry) r3;	 Catch:{ all -> 0x003e }
        r4 = r3.getKey();	 Catch:{ all -> 0x003e }
        r3 = r3.getValue();	 Catch:{ all -> 0x003e }
        r3 = (defpackage.kaz) r3;	 Catch:{ all -> 0x003e }
        r3 = r3.a(r6);	 Catch:{ all -> 0x003e }
        r2.put(r4, r3);	 Catch:{ all -> 0x003e }
        goto L_0x001b;	 Catch:{ all -> 0x003e }
        r2 = 0;	 Catch:{ all -> 0x003e }
        r2 = (java.util.NavigableMap) r2;	 Catch:{ all -> 0x003e }
        monitor-exit(r0);
        return r2;
        r6 = move-exception;
        monitor-exit(r0);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eik.a(java.lang.String):java.util.NavigableMap");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x002f in {8, 11, 14} preds:[]
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
    public final void a() {
        /*
        r3 = this;
        r0 = r3.a;
        monitor-enter(r0);
        r1 = r3.b;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x0027;	 Catch:{ all -> 0x002c }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x002c }
        r1 = r1.entrySet();	 Catch:{ all -> 0x002c }
        r1 = r1.iterator();	 Catch:{ all -> 0x002c }
        r2 = r1.hasNext();	 Catch:{ all -> 0x002c }
        if (r2 == 0) goto L_0x0027;	 Catch:{ all -> 0x002c }
        r2 = r1.next();	 Catch:{ all -> 0x002c }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x002c }
        r2 = r2.getValue();	 Catch:{ all -> 0x002c }
        r2 = (defpackage.kaz) r2;	 Catch:{ all -> 0x002c }
        r2.dispose();	 Catch:{ all -> 0x002c }
        goto L_0x0011;	 Catch:{ all -> 0x002c }
        r1 = 0;	 Catch:{ all -> 0x002c }
        r3.b = r1;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);
        return;
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eik.a():void");
    }
}
