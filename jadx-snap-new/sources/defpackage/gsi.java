package defpackage;

import java.util.Set;

/* renamed from: gsi */
public final class gsi {
    public ajwy<Set<gqc>> a;
    private final ajwy<Set<gqc>> b;

    public gsi(ajwy<Set<gqc>> ajwy) {
        akcr.b(ajwy, "singletonCrashMetadataProviders");
        this.b = ajwy;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x006a in {7, 12, 19, 20, 22} preds:[]
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
    public final java.util.List<defpackage.gqb> a(defpackage.gqf r4) {
        /*
        r3 = this;
        r0 = "crashType";
        defpackage.akcr.b(r4, r0);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0068 }
        r0.<init>();	 Catch:{ all -> 0x0068 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0068 }
        r1 = r3.b;	 Catch:{ all -> 0x0068 }
        r1 = r1.get();	 Catch:{ all -> 0x0068 }
        r2 = "singletonCrashMetadataProviders.get()";	 Catch:{ all -> 0x0068 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0068 }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0068 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0068 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0068 }
        if (r2 == 0) goto L_0x0035;	 Catch:{ all -> 0x0068 }
        r2 = r1.next();	 Catch:{ all -> 0x0068 }
        r2 = (defpackage.gqc) r2;	 Catch:{ all -> 0x0068 }
        r2 = r2.a(r4);	 Catch:{ all -> 0x0068 }
        if (r2 == 0) goto L_0x001d;	 Catch:{ all -> 0x0068 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0068 }
        r0.addAll(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x001d;	 Catch:{ all -> 0x0068 }
        r1 = r3.a;	 Catch:{ all -> 0x0068 }
        if (r1 == 0) goto L_0x0067;	 Catch:{ all -> 0x0068 }
        r1 = r3.a;	 Catch:{ all -> 0x0068 }
        if (r1 != 0) goto L_0x0040;	 Catch:{ all -> 0x0068 }
        defpackage.akcr.a();	 Catch:{ all -> 0x0068 }
        r1 = r1.get();	 Catch:{ all -> 0x0068 }
        r2 = "activityScopeCrashMetadataProviders!!.get()";	 Catch:{ all -> 0x0068 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0068 }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0068 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0068 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0068 }
        if (r2 == 0) goto L_0x0067;	 Catch:{ all -> 0x0068 }
        r2 = r1.next();	 Catch:{ all -> 0x0068 }
        r2 = (defpackage.gqc) r2;	 Catch:{ all -> 0x0068 }
        r2 = r2.a(r4);	 Catch:{ all -> 0x0068 }
        if (r2 == 0) goto L_0x004f;	 Catch:{ all -> 0x0068 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0068 }
        r0.addAll(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x004f;
        return r0;
        r4 = move-exception;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsi.a(gqf):java.util.List");
    }
}
