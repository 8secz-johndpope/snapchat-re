package defpackage;

import defpackage.gdx.b;
import defpackage.gfl.a;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;

/* renamed from: ghm */
public class ghm implements gfl {
    private final akbl<InputStream, InputStream> a;
    private final akbl<OutputStream, OutputStream> b;
    private final a c;

    public ghm() {
        this(null, null, 7);
    }

    private ghm(akbl<? super InputStream, ? extends InputStream> akbl, akbl<? super OutputStream, ? extends OutputStream> akbl2) {
        akcr.b(akbl, "inputOperator");
        akcr.b(akbl2, "outputOperator");
        this.a = akbl;
        this.b = akbl2;
        this.c = null;
    }

    public /* synthetic */ ghm(akbl akbl, akbl akbl2, int i) {
        if ((i & 1) != 0) {
            akbl = gij.b;
        }
        if ((i & 2) != 0) {
            akbl2 = gij.a;
        }
        this(akbl, akbl2);
    }

    private final void a(InputStream inputStream, b bVar, LinkedList<Closeable> linkedList) {
        OutputStream outputStream = (OutputStream) gij.a((Closeable) this.b.invoke((OutputStream) gij.a(bVar.a(), linkedList)), linkedList);
        aklc.a((InputStream) gij.a((Closeable) this.a.invoke(inputStream), linkedList), outputStream);
        outputStream.close();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:49:0x00f4 in {10, 16, 18, 23, 27, 32, 33, 39, 43, 44, 46, 48} preds:[]
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
    public final defpackage.gez a(defpackage.gej r5, defpackage.gdx.a r6) {
        /*
        r4 = this;
        r0 = "contentResult";
        defpackage.akcr.b(r5, r0);
        r0 = "cacheEntry";
        defpackage.akcr.b(r6, r0);
        r0 = r5.a();
        if (r0 == 0) goto L_0x00dd;
        r0 = r5.c();
        r0 = r0.size();
        if (r0 <= 0) goto L_0x00d3;
        r0 = r5.c();
        r0 = r0.size();
        r1 = 1;
        if (r0 != r1) goto L_0x0040;
        r5 = r5.b();
        r5 = (java.io.Closeable) r5;
        r0 = 0;
        r1 = r5;	 Catch:{ Throwable -> 0x0039 }
        r1 = (java.io.InputStream) r1;	 Catch:{ Throwable -> 0x0039 }
        r6 = r4.a(r1, r6, r0);	 Catch:{ Throwable -> 0x0039 }
        defpackage.akax.a(r5, r0);
        return r6;
        r6 = move-exception;
        goto L_0x003c;
        r6 = move-exception;
        r0 = r6;
        throw r0;	 Catch:{ all -> 0x0037 }
        defpackage.akax.a(r5, r0);
        throw r6;
        r0 = new gjb;
        r2 = r5.c();
        r2 = r2.size();
        r2 = r2 + r1;
        r0.<init>(r6, r2);
        r0 = (defpackage.gdx.b) r0;
        r1 = new java.util.LinkedList;
        r1.<init>();
        r6 = r6.d;	 Catch:{ Exception -> 0x00b7 }
        r6 = defpackage.ghn.a(r6, r0, r5);	 Catch:{ Exception -> 0x00b7 }
        if (r6 == 0) goto L_0x0062;	 Catch:{ Exception -> 0x00b7 }
        r6 = (java.io.Closeable) r6;	 Catch:{ Exception -> 0x00b7 }
        defpackage.gij.a(r6, r1);	 Catch:{ Exception -> 0x00b7 }
        r5 = r5.c();	 Catch:{ Exception -> 0x00b7 }
        r6 = "contentResult.assets";	 Catch:{ Exception -> 0x00b7 }
        defpackage.akcr.a(r5, r6);	 Catch:{ Exception -> 0x00b7 }
        r5 = (java.lang.Iterable) r5;	 Catch:{ Exception -> 0x00b7 }
        r6 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00b7 }
        r2 = 10;	 Catch:{ Exception -> 0x00b7 }
        r2 = defpackage.ajyn.a(r5, r2);	 Catch:{ Exception -> 0x00b7 }
        r6.<init>(r2);	 Catch:{ Exception -> 0x00b7 }
        r6 = (java.util.Collection) r6;	 Catch:{ Exception -> 0x00b7 }
        r5 = r5.iterator();	 Catch:{ Exception -> 0x00b7 }
        r2 = r5.hasNext();	 Catch:{ Exception -> 0x00b7 }
        if (r2 == 0) goto L_0x009c;	 Catch:{ Exception -> 0x00b7 }
        r2 = r5.next();	 Catch:{ Exception -> 0x00b7 }
        r2 = (defpackage.gdt) r2;	 Catch:{ Exception -> 0x00b7 }
        r2 = r2.b();	 Catch:{ Exception -> 0x00b7 }
        r3 = "it.openStream()";	 Catch:{ Exception -> 0x00b7 }
        defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x00b7 }
        r4.a(r2, r0, r1);	 Catch:{ Exception -> 0x00b7 }
        r2 = defpackage.ajxw.a;	 Catch:{ Exception -> 0x00b7 }
        r6.add(r2);	 Catch:{ Exception -> 0x00b7 }
        goto L_0x007e;	 Catch:{ Exception -> 0x00b7 }
        r5 = r0.b();	 Catch:{ Exception -> 0x00b7 }
        r6 = r1.iterator();
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x00b4;
        r0 = r6.next();
        r0 = (java.io.Closeable) r0;
        defpackage.aklc.a(r0);
        goto L_0x00a4;
        return r5;
        r5 = move-exception;
        goto L_0x00be;
        r5 = move-exception;
        r0.c();	 Catch:{ all -> 0x00b5 }
        r5 = (java.lang.Throwable) r5;	 Catch:{ all -> 0x00b5 }
        throw r5;	 Catch:{ all -> 0x00b5 }
        r6 = r1.iterator();
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x00d2;
        r0 = r6.next();
        r0 = (java.io.Closeable) r0;
        defpackage.aklc.a(r0);
        goto L_0x00c2;
        throw r5;
        r5 = new java.lang.IllegalArgumentException;
        r6 = "empty content result";
        r5.<init>(r6);
        r5 = (java.lang.Throwable) r5;
        throw r5;
        r6 = new java.lang.IllegalArgumentException;
        r5 = r5.e();
        r0 = "contentResult.failureReason";
        defpackage.akcr.a(r5, r0);
        r5 = r5.c();
        r0 = "Invalid content result";
        r6.<init>(r0, r5);
        r6 = (java.lang.Throwable) r6;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghm.a(gej, gdx$a):gez");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x005a in {6, 7, 13, 17, 18} preds:[]
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
    public defpackage.gez a(java.io.InputStream r2, defpackage.gdx.a r3, java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
        r1 = this;
        r4 = "inputStream";
        defpackage.akcr.b(r2, r4);
        r4 = "cacheEntry";
        defpackage.akcr.b(r3, r4);
        r4 = 1;
        r4 = defpackage.ghw.a(r4);
        r3 = r4.invoke(r3);
        r3 = (defpackage.gdx.b) r3;
        r4 = new java.util.LinkedList;
        r4.<init>();
        r0 = r2;
        r0 = (java.io.Closeable) r0;
        defpackage.gij.a(r0, r4);
        r1.a(r2, r3, r4);	 Catch:{ Exception -> 0x003e }
        r2 = r3.b();	 Catch:{ Exception -> 0x003e }
        r3 = r4.iterator();
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x003b;
        r4 = r3.next();
        r4 = (java.io.Closeable) r4;
        defpackage.aklc.a(r4);
        goto L_0x002b;
        return r2;
        r2 = move-exception;
        goto L_0x0045;
        r2 = move-exception;
        r3.c();	 Catch:{ all -> 0x003c }
        r2 = (java.lang.Throwable) r2;	 Catch:{ all -> 0x003c }
        throw r2;	 Catch:{ all -> 0x003c }
        r3 = r4.iterator();
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0059;
        r4 = r3.next();
        r4 = (java.io.Closeable) r4;
        defpackage.aklc.a(r4);
        goto L_0x0049;
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghm.a(java.io.InputStream, gdx$a, java.util.Map):gez");
    }

    public a a() {
        return null;
    }
}
