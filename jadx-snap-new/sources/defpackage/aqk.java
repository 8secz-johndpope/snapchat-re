package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aqk */
public final class aqk {
    private static /* synthetic */ boolean a = (aqk.class.desiredAssertionStatus() ^ 1);

    public static void a(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 65536.0d);
        byteBuffer.put((byte) (i >> 24));
        byteBuffer.put((byte) (i >> 16));
        byteBuffer.put((byte) (i >> 8));
        byteBuffer.put((byte) i);
    }

    public static void a(ByteBuffer byteBuffer, int i) {
        i &= 16777215;
        aqk.b(byteBuffer, i >> 8);
        aqk.c(byteBuffer, i);
    }

    public static void a(ByteBuffer byteBuffer, long j) {
        if (a || j >= 0) {
            byteBuffer.putLong(j);
            return;
        }
        throw new AssertionError("The given long is negative");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x003a in {5, 6, 8} preds:[]
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
    public static void a(java.nio.ByteBuffer r5, java.lang.String r6) {
        /*
        r0 = r6.getBytes();
        r0 = r0.length;
        r1 = 3;
        if (r0 != r1) goto L_0x0021;
        r0 = 0;
        r2 = 0;
        if (r0 < r1) goto L_0x0010;
        defpackage.aqk.b(r5, r2);
        return;
        r3 = r6.getBytes();
        r3 = r3[r0];
        r3 = r3 + -96;
        r4 = 2 - r0;
        r4 = r4 * 5;
        r3 = r3 << r4;
        r2 = r2 + r3;
        r0 = r0 + 1;
        goto L_0x000a;
        r5 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = "\"";
        r0.<init>(r1);
        r0.append(r6);
        r6 = "\" language string isn't exactly 3 characters long!";
        r0.append(r6);
        r6 = r0.toString();
        r5.<init>(r6);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqk.a(java.nio.ByteBuffer, java.lang.String):void");
    }

    public static void b(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 1.073741824E9d);
        byteBuffer.put((byte) (i >> 24));
        byteBuffer.put((byte) (i >> 16));
        byteBuffer.put((byte) (i >> 8));
        byteBuffer.put((byte) i);
    }

    public static void b(ByteBuffer byteBuffer, int i) {
        i &= 65535;
        aqk.c(byteBuffer, i >> 8);
        aqk.c(byteBuffer, i & 255);
    }

    public static void b(ByteBuffer byteBuffer, long j) {
        if (a || (j >= 0 && j <= 4294967296L)) {
            byteBuffer.putInt((int) j);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("The given long is not in the range of uint32 (");
        stringBuilder.append(j);
        stringBuilder.append(")");
        throw new AssertionError(stringBuilder.toString());
    }

    public static void b(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(aqn.a(str));
        aqk.c(byteBuffer, 0);
    }

    public static void c(ByteBuffer byteBuffer, double d) {
        short s = (short) ((int) (d * 256.0d));
        byteBuffer.put((byte) (s >> 8));
        byteBuffer.put((byte) s);
    }

    public static void c(ByteBuffer byteBuffer, int i) {
        byteBuffer.put((byte) (i & 255));
    }

    public static void c(ByteBuffer byteBuffer, long j) {
        j &= 281474976710655L;
        aqk.b(byteBuffer, (int) (j >> 32));
        aqk.b(byteBuffer, j & 4294967295L);
    }

    public static void c(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(aqn.a(str));
        aqk.c(byteBuffer, 0);
    }
}
