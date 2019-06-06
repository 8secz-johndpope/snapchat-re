package defpackage;

import java.io.File;

/* renamed from: lhk */
public final class lhk implements akbl<File, byte[]> {

    /* renamed from: lhk$a */
    static final class a extends akcq implements akbl<File, Boolean> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final String getName() {
            return "isFile";
        }

        public final akej getOwner() {
            return akde.a(File.class);
        }

        public final String getSignature() {
            return "isFile()Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            File file = (File) obj;
            akcr.b(file, "p1");
            return Boolean.valueOf(file.isFile());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x00a4 in {15, 17, 19, 21, 23, 25, 27, 29, 31} preds:[]
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
    private static byte[] a(java.io.File r7) {
        /*
        r0 = "directory";
        defpackage.akcr.b(r7, r0);
        r0 = new java.io.ByteArrayOutputStream;
        r0.<init>();
        r1 = 0;
        r2 = new java.util.zip.ZipOutputStream;	 Catch:{ all -> 0x009c }
        r3 = r0;	 Catch:{ all -> 0x009c }
        r3 = (java.io.OutputStream) r3;	 Catch:{ all -> 0x009c }
        r2.<init>(r3);	 Catch:{ all -> 0x009c }
        r3 = r7.getPath();	 Catch:{ all -> 0x009a }
        r4 = "directory.path";	 Catch:{ all -> 0x009a }
        defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x009a }
        r3 = (java.lang.CharSequence) r3;	 Catch:{ all -> 0x009a }
        r4 = 47;	 Catch:{ all -> 0x009a }
        r3 = defpackage.akgc.a(r3, r4, defpackage.akgc.d(r3));	 Catch:{ all -> 0x009a }
        r3 = r3 + 1;	 Catch:{ all -> 0x009a }
        r4 = defpackage.akba.TOP_DOWN;	 Catch:{ all -> 0x009a }
        r7 = defpackage.akbe.a(r7, r4);	 Catch:{ all -> 0x009a }
        r7 = (defpackage.akez) r7;	 Catch:{ all -> 0x009a }
        r4 = defpackage.lhk.a.a;	 Catch:{ all -> 0x009a }
        r4 = (defpackage.akbl) r4;	 Catch:{ all -> 0x009a }
        r7 = defpackage.akfh.a(r7, r4);	 Catch:{ all -> 0x009a }
        r7 = r7.iterator();	 Catch:{ all -> 0x009a }
        r4 = r7.hasNext();	 Catch:{ all -> 0x009a }
        if (r4 == 0) goto L_0x008b;	 Catch:{ all -> 0x009a }
        r4 = r7.next();	 Catch:{ all -> 0x009a }
        r4 = (java.io.File) r4;	 Catch:{ all -> 0x009a }
        r5 = r4.getPath();	 Catch:{ all -> 0x009a }
        r6 = "file.path";	 Catch:{ all -> 0x009a }
        defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x009a }
        if (r5 == 0) goto L_0x0083;	 Catch:{ all -> 0x009a }
        r5 = r5.substring(r3);	 Catch:{ all -> 0x009a }
        r6 = "(this as java.lang.String).substring(startIndex)";	 Catch:{ all -> 0x009a }
        defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x009a }
        r6 = new java.util.zip.ZipEntry;	 Catch:{ all -> 0x009a }
        r6.<init>(r5);	 Catch:{ all -> 0x009a }
        r2.putNextEntry(r6);	 Catch:{ all -> 0x009a }
        r5 = new java.io.FileInputStream;	 Catch:{ all -> 0x007b }
        r5.<init>(r4);	 Catch:{ all -> 0x007b }
        r4 = r5;	 Catch:{ all -> 0x0079 }
        r4 = (java.io.InputStream) r4;	 Catch:{ all -> 0x0079 }
        r6 = r2;	 Catch:{ all -> 0x0079 }
        r6 = (java.io.OutputStream) r6;	 Catch:{ all -> 0x0079 }
        defpackage.aklc.a(r4, r6);	 Catch:{ all -> 0x0079 }
        r5 = (java.io.Closeable) r5;	 Catch:{ all -> 0x009a }
        defpackage.abqt.a(r5);	 Catch:{ all -> 0x009a }
        r2.closeEntry();	 Catch:{ all -> 0x009a }
        goto L_0x003a;	 Catch:{ all -> 0x009a }
        r7 = move-exception;	 Catch:{ all -> 0x009a }
        goto L_0x007d;	 Catch:{ all -> 0x009a }
        r7 = move-exception;	 Catch:{ all -> 0x009a }
        r5 = r1;	 Catch:{ all -> 0x009a }
        r5 = (java.io.Closeable) r5;	 Catch:{ all -> 0x009a }
        defpackage.abqt.a(r5);	 Catch:{ all -> 0x009a }
        throw r7;	 Catch:{ all -> 0x009a }
        r7 = new ajxt;	 Catch:{ all -> 0x009a }
        r0 = "null cannot be cast to non-null type java.lang.String";	 Catch:{ all -> 0x009a }
        r7.<init>(r0);	 Catch:{ all -> 0x009a }
        throw r7;	 Catch:{ all -> 0x009a }
        r2 = (java.io.Closeable) r2;
        defpackage.abqt.a(r2);
        r7 = r0.toByteArray();
        r0 = "outputStream.toByteArray()";
        defpackage.akcr.a(r7, r0);
        return r7;
        r7 = move-exception;
        goto L_0x009e;
        r7 = move-exception;
        r2 = r1;
        r2 = (java.io.Closeable) r2;
        defpackage.abqt.a(r2);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhk.a(java.io.File):byte[]");
    }

    public final /* synthetic */ Object invoke(Object obj) {
        return lhk.a((File) obj);
    }
}
