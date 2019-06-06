package defpackage;

import java.io.InputStream;

/* renamed from: akz */
public final class akz implements ain<InputStream> {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0036 in {6, 8, 16, 18, 20} preds:[]
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
    private static boolean a(java.io.InputStream r5, java.io.OutputStream r6) {
        /*
        r0 = "StreamEncoder";
        r1 = defpackage.apl.a;
        r1 = r1.a();
        r2 = 0;
        r3 = r5.read(r1);	 Catch:{ IOException -> 0x001d }
        r4 = -1;	 Catch:{ IOException -> 0x001d }
        if (r3 == r4) goto L_0x0014;	 Catch:{ IOException -> 0x001d }
        r6.write(r1, r2, r3);	 Catch:{ IOException -> 0x001d }
        goto L_0x0008;
        r5 = defpackage.apl.a;
        r5.a(r1);
        r5 = 1;
        return r5;
        r5 = move-exception;
        goto L_0x0030;
        r5 = move-exception;
        r6 = 3;
        r6 = android.util.Log.isLoggable(r0, r6);	 Catch:{ all -> 0x001b }
        if (r6 == 0) goto L_0x002a;	 Catch:{ all -> 0x001b }
        r6 = "Failed to encode data onto the OutputStream";	 Catch:{ all -> 0x001b }
        android.util.Log.d(r0, r6, r5);	 Catch:{ all -> 0x001b }
        r5 = defpackage.apl.a;
        r5.a(r1);
        return r2;
        r6 = defpackage.apl.a;
        r6.a(r1);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akz.a(java.io.InputStream, java.io.OutputStream):boolean");
    }

    public final String a() {
        return "";
    }
}
