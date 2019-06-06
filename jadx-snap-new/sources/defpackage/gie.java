package defpackage;

import java.io.InputStream;

/* renamed from: gie */
public final class gie extends ghm {
    private final akbl<InputStream, InputStream> a;
    private final giy b;
    private final gfl c;

    public gie(akbl<? super InputStream, ? extends InputStream> akbl, giy giy, gfl gfl) {
        akcr.b(akbl, "inputOperator");
        akcr.b(giy, "unzipProcessor");
        akcr.b(gfl, "defaultProcessor");
        super(akbl, null, 6);
        this.a = akbl;
        this.b = giy;
        this.c = gfl;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0098 in {10, 11, 17, 18, 23, 24} preds:[]
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
    public final defpackage.gez a(java.io.InputStream r3, defpackage.gdx.a r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
        r2 = this;
        r5 = "inputStream";
        defpackage.akcr.b(r3, r5);
        r5 = "cacheEntry";
        defpackage.akcr.b(r4, r5);
        r5 = new java.util.LinkedList;
        r5.<init>();
        r0 = r3;
        r0 = (java.io.Closeable) r0;
        defpackage.gij.a(r0, r5);
        r0 = r2.a;	 Catch:{ all -> 0x0082 }
        r3 = r0.invoke(r3);	 Catch:{ all -> 0x0082 }
        r3 = (java.io.Closeable) r3;	 Catch:{ all -> 0x0082 }
        r3 = defpackage.gij.a(r3, r5);	 Catch:{ all -> 0x0082 }
        r3 = (java.io.InputStream) r3;	 Catch:{ all -> 0x0082 }
        r3 = defpackage.giz.a(r3);	 Catch:{ all -> 0x0082 }
        r0 = r3.a();	 Catch:{ all -> 0x0082 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x0082 }
        r3 = r3.b();	 Catch:{ all -> 0x0082 }
        r3 = (java.io.Closeable) r3;	 Catch:{ all -> 0x0082 }
        r3 = defpackage.gij.a(r3, r5);	 Catch:{ all -> 0x0082 }
        r3 = (java.io.InputStream) r3;	 Catch:{ all -> 0x0082 }
        r1 = "isZipFile";	 Catch:{ all -> 0x0082 }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0082 }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x0082 }
        r1 = "newInputStream";
        if (r0 == 0) goto L_0x0064;
        r0 = r2.b;	 Catch:{ all -> 0x0082 }
        defpackage.akcr.a(r3, r1);	 Catch:{ all -> 0x0082 }
        r3 = r0.a(r3, r4, null);	 Catch:{ all -> 0x0082 }
        r4 = r5.iterator();
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0063;
        r5 = r4.next();
        r5 = (java.io.Closeable) r5;
        defpackage.aklc.a(r5);
        goto L_0x0053;
        return r3;
        r0 = r2.c;	 Catch:{ all -> 0x0082 }
        defpackage.akcr.a(r3, r1);	 Catch:{ all -> 0x0082 }
        r3 = r0.a(r3, r4, null);	 Catch:{ all -> 0x0082 }
        r4 = r5.iterator();
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0081;
        r5 = r4.next();
        r5 = (java.io.Closeable) r5;
        defpackage.aklc.a(r5);
        goto L_0x0071;
        return r3;
        r3 = move-exception;
        r4 = r5.iterator();
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0097;
        r5 = r4.next();
        r5 = (java.io.Closeable) r5;
        defpackage.aklc.a(r5);
        goto L_0x0087;
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gie.a(java.io.InputStream, gdx$a, java.util.Map):gez");
    }
}
