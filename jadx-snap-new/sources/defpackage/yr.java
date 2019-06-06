package defpackage;

import java.io.Closeable;
import java.nio.charset.Charset;

/* renamed from: yr */
final class yr {
    static final Charset a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x003f in {6, 9, 11, 12, 14} preds:[]
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
    static void a(java.io.File r4) {
        /*
        r0 = r4.listFiles();
        if (r0 == 0) goto L_0x002f;
        r4 = r0.length;
        r1 = 0;
        if (r1 >= r4) goto L_0x002e;
        r2 = r0[r1];
        r3 = r2.isDirectory();
        if (r3 == 0) goto L_0x0015;
        defpackage.yr.a(r2);
        r3 = r2.delete();
        if (r3 == 0) goto L_0x001e;
        r1 = r1 + 1;
        goto L_0x0008;
        r4 = new java.io.IOException;
        r0 = java.lang.String.valueOf(r2);
        r1 = "failed to delete file: ";
        r0 = r1.concat(r0);
        r4.<init>(r0);
        throw r4;
        return;
        r0 = new java.io.IOException;
        r4 = java.lang.String.valueOf(r4);
        r1 = "not a readable directory: ";
        r4 = r1.concat(r4);
        r0.<init>(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr.a(java.io.File):void");
    }
}
