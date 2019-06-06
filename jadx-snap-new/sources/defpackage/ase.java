package defpackage;

import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ase */
final class ase implements Flushable {
    final byte[] a;
    final int b = 4096;
    int c = 0;
    final OutputStream d;

    /* renamed from: ase$a */
    static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private ase(OutputStream outputStream, byte[] bArr) {
        this.d = outputStream;
        this.a = bArr;
    }

    public static ase a(OutputStream outputStream) {
        return new ase(outputStream, new byte[4096]);
    }

    private void a(long j) {
        while ((-128 & j) != 0) {
            a((byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        a((byte) ((int) j));
    }

    public static int b(int i) {
        return ase.d(16) + ase.d(ase.e(i));
    }

    public static int b(int i, long j) {
        int i2 = 3;
        i = ase.d(i << 3);
        if ((-128 & j) == 0) {
            i2 = 1;
        } else if ((-16384 & j) == 0) {
            i2 = 2;
        } else if ((-2097152 & j) != 0) {
            i2 = (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
        }
        return i + i2;
    }

    public static int b(int i, asb asb) {
        return ase.d(i << 3) + (ase.d(asb.a.length) + asb.a.length);
    }

    public static int c(int i, int i2) {
        return ase.d(i << 3) + ase.d(i2);
    }

    public static int d(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public static int d(int i, int i2) {
        return ase.d(i << 3) + (i2 >= 0 ? ase.d(i2) : 10);
    }

    private static int e(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        OutputStream outputStream = this.d;
        if (outputStream != null) {
            outputStream.write(this.a, 0, this.c);
            this.c = 0;
            return;
        }
        throw new a();
    }

    public final void a(byte b) {
        if (this.c == 4096) {
            a();
        }
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b;
    }

    public final void a(int i) {
        e(2, 0);
        c(ase.e(i));
    }

    public final void a(int i, int i2) {
        e(i, 0);
        c(i2);
    }

    public final void a(int i, long j) {
        e(i, 0);
        a(j);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0070 in {3, 7, 13, 15, 16, 18} preds:[]
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
    public final void a(int r9, defpackage.asb r10) {
        /*
        r8 = this;
        r0 = 2;
        r8.e(r9, r0);
        r9 = r10.a;
        r9 = r9.length;
        r8.c(r9);
        r9 = r10.a;
        r9 = r9.length;
        r0 = r8.c;
        r1 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r2 = 4096 - r0;
        r3 = 0;
        if (r2 < r9) goto L_0x0021;
        r1 = r8.a;
        r10.a(r1, r3, r0, r9);
        r10 = r8.c;
        r10 = r10 + r9;
        r8.c = r10;
        return;
        r2 = 4096 - r0;
        r4 = r8.a;
        r10.a(r4, r3, r0, r2);
        r9 = r9 - r2;
        r8.c = r1;
        r8.a();
        if (r9 > r1) goto L_0x0038;
        r0 = r8.a;
        r10.a(r0, r2, r3, r9);
        r8.c = r9;
        return;
        r0 = new java.io.ByteArrayInputStream;
        r10 = r10.a;
        r0.<init>(r10);
        r4 = (long) r2;
        r6 = r0.skip(r4);
        r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r10 != 0) goto L_0x0068;
        if (r9 <= 0) goto L_0x0067;
        r10 = java.lang.Math.min(r9, r1);
        r2 = r8.a;
        r2 = r0.read(r2, r3, r10);
        if (r2 != r10) goto L_0x005f;
        r10 = r8.d;
        r4 = r8.a;
        r10.write(r4, r3, r2);
        r9 = r9 - r2;
        goto L_0x0048;
        r9 = new java.lang.IllegalStateException;
        r10 = "Read failed.";
        r9.<init>(r10);
        throw r9;
        return;
        r9 = new java.lang.IllegalStateException;
        r10 = "Skip failed.";
        r9.<init>(r10);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ase.a(int, asb):void");
    }

    public final void a(int i, boolean z) {
        e(i, 0);
        a((byte) z);
    }

    public final void b(int i, int i2) {
        e(i, 0);
        if (i2 >= 0) {
            c(i2);
        } else {
            a((long) i2);
        }
    }

    public final void c(int i) {
        while ((i & -128) != 0) {
            a((byte) ((i & 127) | 128));
            i >>>= 7;
        }
        a((byte) i);
    }

    public final void e(int i, int i2) {
        c((i << 3) | i2);
    }

    public final void flush() {
        if (this.d != null) {
            a();
        }
    }
}
