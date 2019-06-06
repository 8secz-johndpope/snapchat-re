package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: akkq */
final class akkq implements akkf {
    public final akkd a = new akkd();
    public final akkv b;
    boolean c;

    /* renamed from: akkq$1 */
    class 1 extends InputStream {
        1() {
        }

        public final int available() {
            if (!akkq.this.c) {
                return (int) Math.min(akkq.this.a.b, 2147483647L);
            }
            throw new IOException("closed");
        }

        public final void close() {
            akkq.this.close();
        }

        public final int read() {
            if (!akkq.this.c) {
                return (akkq.this.a.b == 0 && akkq.this.b.a(akkq.this.a, 8192) == -1) ? -1 : akkq.this.a.g() & 255;
            } else {
                throw new IOException("closed");
            }
        }

        public final int read(byte[] bArr, int i, int i2) {
            if (akkq.this.c) {
                throw new IOException("closed");
            }
            akkx.a((long) bArr.length, (long) i, (long) i2);
            return (akkq.this.a.b == 0 && akkq.this.b.a(akkq.this.a, 8192) == -1) ? -1 : akkq.this.a.a(bArr, i, i2);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(akkq.this);
            stringBuilder.append(".inputStream()");
            return stringBuilder.toString();
        }
    }

    akkq(akkv akkv) {
        if (akkv != null) {
            this.b = akkv;
            return;
        }
        throw new NullPointerException("source == null");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0060 in {8, 13, 14, 15, 17, 19} preds:[]
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
    private long a(byte r10, long r11, long r13) {
        /*
        r9 = this;
        r0 = r9.c;
        if (r0 != 0) goto L_0x0058;
        r0 = 0;
        r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1));
        if (r2 < 0) goto L_0x003b;
        r0 = -1;
        r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r2 >= 0) goto L_0x003a;
        r3 = r9.a;
        r4 = r10;
        r5 = r11;
        r7 = r13;
        r2 = r3.a(r4, r5, r7);
        r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r4 == 0) goto L_0x001e;
        return r2;
        r2 = r9.a;
        r2 = r2.b;
        r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1));
        if (r4 >= 0) goto L_0x003a;
        r4 = r9.b;
        r5 = r9.a;
        r6 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r4 = r4.a(r5, r6);
        r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r6 != 0) goto L_0x0035;
        goto L_0x003a;
        r11 = java.lang.Math.max(r11, r2);
        goto L_0x000a;
        return r0;
        r10 = new java.lang.IllegalArgumentException;
        r11 = 2;
        r11 = new java.lang.Object[r11];
        r12 = 0;
        r0 = java.lang.Long.valueOf(r0);
        r11[r12] = r0;
        r12 = 1;
        r13 = java.lang.Long.valueOf(r13);
        r11[r12] = r13;
        r12 = "fromIndex=%s toIndex=%s";
        r11 = java.lang.String.format(r12, r11);
        r10.<init>(r11);
        throw r10;
        r10 = new java.lang.IllegalStateException;
        r11 = "closed";
        r10.<init>(r11);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkq.a(byte, long, long):long");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x003e in {9, 11, 13, 15} preds:[]
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
    private boolean b(long r6) {
        /*
        r5 = this;
        r0 = 0;
        r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r2 < 0) goto L_0x002e;
        r0 = r5.c;
        if (r0 != 0) goto L_0x0026;
        r0 = r5.a;
        r0 = r0.b;
        r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x0024;
        r0 = r5.b;
        r1 = r5.a;
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r0 = r0.a(r1, r2);
        r2 = -1;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x000a;
        r6 = 0;
        return r6;
        r6 = 1;
        return r6;
        r6 = new java.lang.IllegalStateException;
        r7 = "closed";
        r6.<init>(r7);
        throw r6;
        r0 = new java.lang.IllegalArgumentException;
        r6 = java.lang.String.valueOf(r6);
        r7 = "byteCount < 0: ";
        r6 = r7.concat(r6);
        r0.<init>(r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkq.b(long):boolean");
    }

    public final long a(akkd akkd, long j) {
        if (akkd == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.c) {
            throw new IllegalStateException("closed");
        } else if (this.a.b == 0 && this.b.a(this.a, 8192) == -1) {
            return -1;
        } else {
            return this.a.a(akkd, Math.min(j, this.a.b));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0043 in {6, 9, 10, 12} preds:[]
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
    public final long a(defpackage.akku r10) {
        /*
        r9 = this;
        if (r10 == 0) goto L_0x003b;
        r0 = 0;
        r2 = r0;
        r4 = r9.b;
        r5 = r9.a;
        r6 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r4 = r4.a(r5, r6);
        r6 = -1;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x0026;
        r4 = r9.a;
        r4 = r4.f();
        r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r6 <= 0) goto L_0x0005;
        r2 = r2 + r4;
        r6 = r9.a;
        r10.a_(r6, r4);
        goto L_0x0005;
        r4 = r9.a;
        r4 = r4.b;
        r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r6 <= 0) goto L_0x003a;
        r0 = r9.a;
        r0 = r0.b;
        r2 = r2 + r0;
        r0 = r9.a;
        r4 = r0.b;
        r10.a_(r0, r4);
        return r2;
        r10 = new java.lang.IllegalArgumentException;
        r0 = "sink == null";
        r10.<init>(r0);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkq.a(akku):long");
    }

    public final akkw a() {
        return this.b.a();
    }

    public final String a(Charset charset) {
        if (charset != null) {
            this.a.a(this.b);
            return this.a.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final void a(long j) {
        if (!b(j)) {
            throw new EOFException();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x002c in {3, 10, 12, 13} preds:[]
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
    public final void a(byte[] r8) {
        /*
        r7 = this;
        r0 = r8.length;	 Catch:{ EOFException -> 0x000b }
        r0 = (long) r0;	 Catch:{ EOFException -> 0x000b }
        r7.a(r0);	 Catch:{ EOFException -> 0x000b }
        r0 = r7.a;
        r0.a(r8);
        return;
        r0 = move-exception;
        r1 = 0;
        r2 = r7.a;
        r2 = r2.b;
        r4 = 0;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x002b;
        r2 = r7.a;
        r3 = r2.b;
        r4 = (int) r3;
        r2 = r2.a(r8, r1, r4);
        r3 = -1;
        if (r2 == r3) goto L_0x0025;
        r1 = r1 + r2;
        goto L_0x000d;
        r8 = new java.lang.AssertionError;
        r8.<init>();
        throw r8;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkq.a(byte[]):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x003e in {6, 11, 14, 15, 17, 18, 20} preds:[]
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
    public final boolean b(defpackage.akkg r8) {
        /*
        r7 = this;
        r0 = r8.g();
        r1 = r7.c;
        if (r1 != 0) goto L_0x0036;
        r1 = 0;
        if (r0 < 0) goto L_0x0035;
        r2 = r8.g();
        if (r2 >= r0) goto L_0x0012;
        goto L_0x0035;
        r2 = 0;
        if (r2 >= r0) goto L_0x0033;
        r3 = 0;
        r5 = (long) r2;
        r5 = r5 + r3;
        r3 = 1;
        r3 = r3 + r5;
        r3 = r7.b(r3);
        if (r3 != 0) goto L_0x0023;
        return r1;
        r3 = r7.a;
        r3 = r3.b(r5);
        r4 = r8.a(r2);
        if (r3 == r4) goto L_0x0030;
        return r1;
        r2 = r2 + 1;
        goto L_0x0013;
        r8 = 1;
        return r8;
        return r1;
        r8 = new java.lang.IllegalStateException;
        r0 = "closed";
        r8.<init>(r0);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkq.b(akkg):boolean");
    }

    public final akkd c() {
        return this.a;
    }

    public final akkg c(long j) {
        a(j);
        return this.a.c(j);
    }

    public final void close() {
        if (!this.c) {
            this.c = true;
            this.b.close();
            this.a.r();
        }
    }

    public final boolean d() {
        if (!this.c) {
            return this.a.d() && this.b.a(this.a, 8192) == -1;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final InputStream e() {
        return new 1();
    }

    public final byte[] e(long j) {
        a(j);
        return this.a.e(j);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0041 in {8, 10, 11, 12, 14} preds:[]
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
    public final void f(long r6) {
        /*
        r5 = this;
        r0 = r5.c;
        if (r0 != 0) goto L_0x0039;
        r0 = 0;
        r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x0038;
        r2 = r5.a;
        r2 = r2.b;
        r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r4 != 0) goto L_0x0029;
        r0 = r5.b;
        r1 = r5.a;
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r0 = r0.a(r1, r2);
        r2 = -1;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 == 0) goto L_0x0023;
        goto L_0x0029;
        r6 = new java.io.EOFException;
        r6.<init>();
        throw r6;
        r0 = r5.a;
        r0 = r0.b;
        r0 = java.lang.Math.min(r6, r0);
        r2 = r5.a;
        r2.f(r0);
        r6 = r6 - r0;
        goto L_0x0004;
        return;
        r6 = new java.lang.IllegalStateException;
        r7 = "closed";
        r6.<init>(r7);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkq.f(long):void");
    }

    public final byte g() {
        a(1);
        return this.a.g();
    }

    public final short h() {
        a(2);
        return this.a.h();
    }

    public final int i() {
        a(4);
        return this.a.i();
    }

    public final short j() {
        a(2);
        return this.a.j();
    }

    public final int k() {
        a(4);
        return akkx.a(this.a.i());
    }

    public final long l() {
        a(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!b((long) i2)) {
                break;
            }
            byte b = this.a.b((long) i);
            if ((b >= (byte) 48 && b <= (byte) 57) || ((b >= (byte) 97 && b <= (byte) 102) || (b >= (byte) 65 && b <= (byte) 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(b)}));
            }
        }
        return this.a.l();
    }

    public final String o() {
        long a = a((byte) 10, 0, Long.MAX_VALUE);
        if (a != -1) {
            return this.a.d(a);
        }
        akkd akkd = new akkd();
        akkd akkd2 = this.a;
        akkd2.a(akkd, 0, Math.min(32, akkd2.b));
        StringBuilder stringBuilder = new StringBuilder("\\n not found: limit=");
        stringBuilder.append(Math.min(this.a.b, Long.MAX_VALUE));
        stringBuilder.append(" content=");
        stringBuilder.append(akkd.m().e());
        stringBuilder.append(8230);
        throw new EOFException(stringBuilder.toString());
    }

    public final byte[] q() {
        this.a.a(this.b);
        return this.a.q();
    }

    public final long s() {
        return a((byte) 0, 0, Long.MAX_VALUE);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("buffer(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
