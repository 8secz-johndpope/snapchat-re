package defpackage;

import defpackage.gdx.a;
import defpackage.gdx.b;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: giy */
public final class giy extends ghm {
    private final akbl<InputStream, InputStream> a;
    private final akbl<OutputStream, OutputStream> b;
    private final akbl<a, b> c;

    public giy(akbl<? super InputStream, ? extends InputStream> akbl, akbl<? super OutputStream, ? extends OutputStream> akbl2, akbl<? super a, ? extends b> akbl3) {
        akcr.b(akbl, "inputOperator");
        akcr.b(akbl2, "outputOperator");
        akcr.b(akbl3, "cacheEditorFactory");
        super(akbl, akbl2, 4);
        this.a = akbl;
        this.b = akbl2;
        this.c = akbl3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x00d3 in {6, 11, 12, 15, 21, 25, 26} preds:[]
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
    public final defpackage.gez a(java.io.InputStream r6, defpackage.gdx.a r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
        r5 = this;
        r8 = "inputStream";
        defpackage.akcr.b(r6, r8);
        r8 = "cacheEntry";
        defpackage.akcr.b(r7, r8);
        r8 = r5.c;
        r8 = r8.invoke(r7);
        r8 = (defpackage.gdx.b) r8;
        r0 = new java.util.LinkedList;
        r0.<init>();
        r1 = r6;
        r1 = (java.io.Closeable) r1;
        defpackage.gij.a(r1, r0);
        r1 = r8.a();	 Catch:{ Exception -> 0x00b7 }
        r1 = (java.io.Closeable) r1;	 Catch:{ Exception -> 0x00b7 }
        r1 = defpackage.gij.a(r1, r0);	 Catch:{ Exception -> 0x00b7 }
        r1 = (java.io.OutputStream) r1;	 Catch:{ Exception -> 0x00b7 }
        r2 = r5.a;	 Catch:{ Exception -> 0x00b7 }
        r6 = r2.invoke(r6);	 Catch:{ Exception -> 0x00b7 }
        r6 = (java.io.Closeable) r6;	 Catch:{ Exception -> 0x00b7 }
        r6 = defpackage.gij.a(r6, r0);	 Catch:{ Exception -> 0x00b7 }
        r6 = (java.io.InputStream) r6;	 Catch:{ Exception -> 0x00b7 }
        r2 = new abnr;	 Catch:{ Exception -> 0x00b7 }
        r2.<init>(r6);	 Catch:{ Exception -> 0x00b7 }
        r2 = (java.io.Closeable) r2;	 Catch:{ Exception -> 0x00b7 }
        r6 = defpackage.gij.a(r2, r0);	 Catch:{ Exception -> 0x00b7 }
        r6 = (defpackage.abnr) r6;	 Catch:{ Exception -> 0x00b7 }
        r2 = r6.getNextEntry();	 Catch:{ Exception -> 0x00b7 }
        if (r2 == 0) goto L_0x00ab;	 Catch:{ Exception -> 0x00b7 }
        r3 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00b7 }
        r3.<init>();	 Catch:{ Exception -> 0x00b7 }
        if (r2 == 0) goto L_0x0083;	 Catch:{ Exception -> 0x00b7 }
        r2 = r2.getName();	 Catch:{ Exception -> 0x00b7 }
        r3.add(r2);	 Catch:{ Exception -> 0x00b7 }
        r2 = r8.a();	 Catch:{ Exception -> 0x00b7 }
        r2 = (java.io.Closeable) r2;	 Catch:{ Exception -> 0x00b7 }
        r2 = defpackage.gij.a(r2, r0);	 Catch:{ Exception -> 0x00b7 }
        r2 = (java.io.OutputStream) r2;	 Catch:{ Exception -> 0x00b7 }
        r4 = r5.b;	 Catch:{ Exception -> 0x00b7 }
        r2 = r4.invoke(r2);	 Catch:{ Exception -> 0x00b7 }
        r2 = (java.io.Closeable) r2;	 Catch:{ Exception -> 0x00b7 }
        r2 = defpackage.gij.a(r2, r0);	 Catch:{ Exception -> 0x00b7 }
        r2 = (java.io.OutputStream) r2;	 Catch:{ Exception -> 0x00b7 }
        r4 = r6;	 Catch:{ Exception -> 0x00b7 }
        r4 = (java.io.InputStream) r4;	 Catch:{ Exception -> 0x00b7 }
        defpackage.aklc.a(r4, r2);	 Catch:{ Exception -> 0x00b7 }
        r2.close();	 Catch:{ Exception -> 0x00b7 }
        r6.closeEntry();	 Catch:{ Exception -> 0x00b7 }
        r2 = r6.getNextEntry();	 Catch:{ Exception -> 0x00b7 }
        goto L_0x004f;	 Catch:{ Exception -> 0x00b7 }
        r6 = r7.d;	 Catch:{ Exception -> 0x00b7 }
        r6 = r6.b();	 Catch:{ Exception -> 0x00b7 }
        r6 = (defpackage.iha) r6;	 Catch:{ Exception -> 0x00b7 }
        r6 = r6.a(r3);	 Catch:{ Exception -> 0x00b7 }
        defpackage.aklc.a(r6, r1);	 Catch:{ Exception -> 0x00b7 }
        r6 = r8.b();	 Catch:{ Exception -> 0x00b7 }
        r7 = r0.iterator();
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x00aa;
        r8 = r7.next();
        r8 = (java.io.Closeable) r8;
        defpackage.aklc.a(r8);
        goto L_0x009a;
        return r6;
        r6 = new java.util.zip.ZipException;	 Catch:{ Exception -> 0x00b7 }
        r7 = "Invalid zip";	 Catch:{ Exception -> 0x00b7 }
        r6.<init>(r7);	 Catch:{ Exception -> 0x00b7 }
        r6 = (java.lang.Throwable) r6;	 Catch:{ Exception -> 0x00b7 }
        throw r6;	 Catch:{ Exception -> 0x00b7 }
        r6 = move-exception;
        goto L_0x00be;
        r6 = move-exception;
        r8.c();	 Catch:{ all -> 0x00b5 }
        r6 = (java.lang.Throwable) r6;	 Catch:{ all -> 0x00b5 }
        throw r6;	 Catch:{ all -> 0x00b5 }
        r7 = r0.iterator();
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x00d2;
        r8 = r7.next();
        r8 = (java.io.Closeable) r8;
        defpackage.aklc.a(r8);
        goto L_0x00c2;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.giy.a(java.io.InputStream, gdx$a, java.util.Map):gez");
    }
}
