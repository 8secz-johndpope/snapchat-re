package defpackage;

import android.content.ContentResolver;

@ftr(a = "camera_roll")
/* renamed from: fug */
public final class fug extends ggm {
    private final String[] a = new String[]{ohk.d};
    private final ContentResolver b;
    private final gel c;

    public fug(ContentResolver contentResolver, gel gel) {
        akcr.b(contentResolver, "contentResolver");
        akcr.b(gel, "contentResultFactory");
        this.b = contentResolver;
        this.c = gel;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0083 in {4, 7, 9, 15, 17} preds:[]
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
    public final defpackage.ajdx<defpackage.gej> a(android.net.Uri r7, java.util.Set<defpackage.rzg> r8, boolean r9, java.util.Set<? extends defpackage.gdy> r10) {
        /*
        r6 = this;
        r9 = "uri";
        defpackage.akcr.b(r7, r9);
        r0 = "schedulingContexts";
        defpackage.akcr.b(r8, r0);
        r8 = "cacheAccessControls";
        defpackage.akcr.b(r10, r8);
        r8 = r7.getQueryParameter(r9);
        r1 = android.net.Uri.parse(r8);
        r0 = r6.b;
        r2 = r6.a;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r8 = r0.query(r1, r2, r3, r4, r5);
        r9 = r8;
        r9 = (java.io.Closeable) r9;
        r10 = 0;
        r0 = r9;	 Catch:{ Throwable -> 0x007c }
        r0 = (android.database.Cursor) r0;	 Catch:{ Throwable -> 0x007c }
        r1 = "cursor";	 Catch:{ Throwable -> 0x007c }
        defpackage.akcr.a(r8, r1);	 Catch:{ Throwable -> 0x007c }
        r8 = r8.getCount();	 Catch:{ Throwable -> 0x007c }
        if (r8 <= 0) goto L_0x0053;	 Catch:{ Throwable -> 0x007c }
        r7 = 0;	 Catch:{ Throwable -> 0x007c }
        r0.moveToPosition(r7);	 Catch:{ Throwable -> 0x007c }
        r8 = r6.c;	 Catch:{ Throwable -> 0x007c }
        r1 = new java.io.File;	 Catch:{ Throwable -> 0x007c }
        r7 = r0.getString(r7);	 Catch:{ Throwable -> 0x007c }
        r1.<init>(r7);	 Catch:{ Throwable -> 0x007c }
        r7 = "camera_roll";	 Catch:{ Throwable -> 0x007c }
        r7 = r8.a(r1, r7);	 Catch:{ Throwable -> 0x007c }
        r7 = defpackage.ajdx.b(r7);	 Catch:{ Throwable -> 0x007c }
        r8 = "Single.just(contentResul…g(0)), CAMERA_ROLL_PATH))";	 Catch:{ Throwable -> 0x007c }
        defpackage.akcr.a(r7, r8);	 Catch:{ Throwable -> 0x007c }
        goto L_0x0076;	 Catch:{ Throwable -> 0x007c }
        r8 = new java.io.FileNotFoundException;	 Catch:{ Throwable -> 0x007c }
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x007c }
        r0.<init>();	 Catch:{ Throwable -> 0x007c }
        r0.append(r7);	 Catch:{ Throwable -> 0x007c }
        r7 = " not found";	 Catch:{ Throwable -> 0x007c }
        r0.append(r7);	 Catch:{ Throwable -> 0x007c }
        r7 = r0.toString();	 Catch:{ Throwable -> 0x007c }
        r8.<init>(r7);	 Catch:{ Throwable -> 0x007c }
        r8 = (java.lang.Throwable) r8;	 Catch:{ Throwable -> 0x007c }
        r7 = defpackage.ghx.a.a(r8, r10);	 Catch:{ Throwable -> 0x007c }
        r7 = defpackage.ajdx.b(r7);	 Catch:{ Throwable -> 0x007c }
        r8 = "Single.just(FailedConten…ption(\"$uri not found\")))";	 Catch:{ Throwable -> 0x007c }
        goto L_0x004f;
        defpackage.akax.a(r9, r10);
        return r7;
        r7 = move-exception;
        goto L_0x007f;
        r7 = move-exception;
        r10 = r7;
        throw r10;	 Catch:{ all -> 0x007a }
        defpackage.akax.a(r9, r10);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fug.a(android.net.Uri, java.util.Set, boolean, java.util.Set):ajdx");
    }
}
