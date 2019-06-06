package defpackage;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: akbh */
public final class akbh {
    private static long a(Reader reader, Writer writer) {
        akcr.b(reader, "receiver$0");
        akcr.b(writer, "out");
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }

    public static final String a(Reader reader) {
        akcr.b(reader, "receiver$0");
        StringWriter stringWriter = new StringWriter();
        akbh.a(reader, (Writer) stringWriter);
        Object stringWriter2 = stringWriter.toString();
        akcr.a(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x003f in {6, 8, 14, 16} preds:[]
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
    public static final void a(java.io.Reader r3, defpackage.akbl<? super java.lang.String, defpackage.ajxw> r4) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r3, r0);
        r1 = "action";
        defpackage.akcr.b(r4, r1);
        r3 = (java.io.BufferedReader) r3;
        r3 = (java.io.Closeable) r3;
        r1 = 0;
        r2 = r3;	 Catch:{ Throwable -> 0x0038 }
        r2 = (java.io.BufferedReader) r2;	 Catch:{ Throwable -> 0x0038 }
        defpackage.akcr.b(r2, r0);	 Catch:{ Throwable -> 0x0038 }
        r0 = new akbg;	 Catch:{ Throwable -> 0x0038 }
        r0.<init>(r2);	 Catch:{ Throwable -> 0x0038 }
        r0 = (defpackage.akez) r0;	 Catch:{ Throwable -> 0x0038 }
        r0 = defpackage.akff.a(r0);	 Catch:{ Throwable -> 0x0038 }
        r0 = r0.iterator();	 Catch:{ Throwable -> 0x0038 }
        r2 = r0.hasNext();	 Catch:{ Throwable -> 0x0038 }
        if (r2 == 0) goto L_0x0032;	 Catch:{ Throwable -> 0x0038 }
        r2 = r0.next();	 Catch:{ Throwable -> 0x0038 }
        r4.invoke(r2);	 Catch:{ Throwable -> 0x0038 }
        goto L_0x0024;
        defpackage.akax.a(r3, r1);
        return;
        r4 = move-exception;
        goto L_0x003b;
        r4 = move-exception;
        r1 = r4;
        throw r1;	 Catch:{ all -> 0x0036 }
        defpackage.akax.a(r3, r1);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbh.a(java.io.Reader, akbl):void");
    }
}
