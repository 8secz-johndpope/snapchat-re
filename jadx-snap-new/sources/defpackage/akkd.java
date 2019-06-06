package defpackage;

import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: akkd */
public final class akkd implements akke, akkf, Cloneable {
    private static final byte[] c = new byte[]{(byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102};
    akkr a;
    public long b;

    /* renamed from: akkd$2 */
    class 2 extends InputStream {
        2() {
        }

        public final int available() {
            return (int) Math.min(akkd.this.b, 2147483647L);
        }

        public final void close() {
        }

        public final int read() {
            return akkd.this.b > 0 ? akkd.this.g() & 255 : -1;
        }

        public final int read(byte[] bArr, int i, int i2) {
            return akkd.this.a(bArr, i, i2);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(akkd.this);
            stringBuilder.append(".inputStream()");
            return stringBuilder.toString();
        }
    }

    /* renamed from: akkd$1 */
    public class 1 extends OutputStream {
        public final void close() {
        }

        public final void flush() {
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(akkd.this);
            stringBuilder.append(".outputStream()");
            return stringBuilder.toString();
        }

        public final void write(int i) {
            akkd.this.j((byte) i);
        }

        public final void write(byte[] bArr, int i, int i2) {
            akkd.this.c(bArr, i, i2);
        }
    }

    private String a(long j, Charset charset) {
        akkx.a(this.b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        } else if (j == 0) {
            return "";
        } else {
            akkr akkr = this.a;
            if (((long) akkr.b) + j > ((long) akkr.c)) {
                return new String(e(j), charset);
            }
            String str = new String(akkr.a, akkr.b, (int) j, charset);
            akkr.b = (int) (((long) akkr.b) + j);
            this.b -= j;
            if (akkr.b == akkr.c) {
                this.a = akkr.a();
                akks.a(akkr);
            }
            return str;
        }
    }

    private akkg k(int i) {
        return i == 0 ? akkg.a : new akkt(this, i);
    }

    private String k(long j) {
        return a(j, akkx.a);
    }

    public final int a(byte[] bArr, int i, int i2) {
        akkx.a((long) bArr.length, (long) i, (long) i2);
        akkr akkr = this.a;
        if (akkr == null) {
            return -1;
        }
        i2 = Math.min(i2, akkr.c - akkr.b);
        System.arraycopy(akkr.a, akkr.b, bArr, i, i2);
        akkr.b += i2;
        this.b -= (long) i2;
        if (akkr.b == akkr.c) {
            this.a = akkr.a();
            akks.a(akkr);
        }
        return i2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x00a5 in {6, 7, 10, 13, 18, 21, 30, 31, 32, 33, 35} preds:[]
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
    public final long a(byte r16, long r17, long r19) {
        /*
        r15 = this;
        r0 = r15;
        r1 = 0;
        r3 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1));
        if (r3 < 0) goto L_0x007f;
        r3 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1));
        if (r3 < 0) goto L_0x007f;
        r3 = r0.b;
        r5 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1));
        if (r5 <= 0) goto L_0x0012;
        goto L_0x0014;
        r3 = r19;
        r5 = -1;
        r7 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1));
        if (r7 != 0) goto L_0x001b;
        return r5;
        r7 = r0.a;
        if (r7 != 0) goto L_0x0020;
        return r5;
        r8 = r0.b;
        r10 = r8 - r17;
        r12 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1));
        if (r12 >= 0) goto L_0x0036;
        r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1));
        if (r1 <= 0) goto L_0x0045;
        r7 = r7.g;
        r1 = r7.c;
        r2 = r7.b;
        r1 = r1 - r2;
        r1 = (long) r1;
        r8 = r8 - r1;
        goto L_0x0028;
        r8 = r1;
        r1 = r7.c;
        r2 = r7.b;
        r1 = r1 - r2;
        r1 = (long) r1;
        r1 = r1 + r8;
        r10 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1));
        if (r10 >= 0) goto L_0x0045;
        r7 = r7.f;
        goto L_0x0036;
        r1 = r17;
        r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r10 >= 0) goto L_0x007e;
        r10 = r7.a;
        r11 = r7.c;
        r11 = (long) r11;
        r13 = r7.b;
        r13 = (long) r13;
        r13 = r13 + r3;
        r13 = r13 - r8;
        r11 = java.lang.Math.min(r11, r13);
        r12 = (int) r11;
        r11 = r7.b;
        r13 = (long) r11;
        r13 = r13 + r1;
        r13 = r13 - r8;
        r1 = (int) r13;
        if (r1 >= r12) goto L_0x0071;
        r2 = r10[r1];
        r11 = r16;
        if (r2 != r11) goto L_0x006e;
        r2 = r7.b;
        r1 = r1 - r2;
        r1 = (long) r1;
        r1 = r1 + r8;
        return r1;
        r1 = r1 + 1;
        goto L_0x0060;
        r11 = r16;
        r1 = r7.c;
        r2 = r7.b;
        r1 = r1 - r2;
        r1 = (long) r1;
        r1 = r1 + r8;
        r7 = r7.f;
        r8 = r1;
        goto L_0x0047;
        return r5;
        r1 = new java.lang.IllegalArgumentException;
        r2 = 3;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r0.b;
        r4 = java.lang.Long.valueOf(r4);
        r2[r3] = r4;
        r3 = java.lang.Long.valueOf(r17);
        r4 = 1;
        r2[r4] = r3;
        r3 = 2;
        r4 = java.lang.Long.valueOf(r19);
        r2[r3] = r4;
        r3 = "size=%s fromIndex=%s toIndex=%s";
        r2 = java.lang.String.format(r3, r2);
        r1.<init>(r2);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkd.a(byte, long, long):long");
    }

    public final long a(akkd akkd, long j) {
        if (akkd == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            akkd.a_(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
    }

    public final long a(akku akku) {
        long j = this.b;
        if (j > 0) {
            akku.a_(this, j);
        }
        return j;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:8:0x001b in {4, 5, 7} preds:[]
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
    public final long a(defpackage.akkv r8) {
        /*
        r7 = this;
        if (r8 == 0) goto L_0x0013;
        r0 = 0;
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r2 = r8.a(r7, r2);
        r4 = -1;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x0012;
        r0 = r0 + r2;
        goto L_0x0004;
        return r0;
        r8 = new java.lang.IllegalArgumentException;
        r0 = "source == null";
        r8.<init>(r0);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkd.a(akkv):long");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x0060 in {2, 5, 6, 13, 14, 17, 18, 19, 21} preds:[]
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
    public final defpackage.akkd a(int r4) {
        /*
        r3 = this;
        r0 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r4 >= r0) goto L_0x0008;
        r3.j(r4);
        goto L_0x0047;
        r1 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r2 = 63;
        if (r4 >= r1) goto L_0x0018;
        r1 = r4 >> 6;
        r1 = r1 | 192;
        r3.j(r1);
        r4 = r4 & r2;
        r4 = r4 | r0;
        goto L_0x0004;
        r1 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r4 >= r1) goto L_0x002f;
        r1 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r4 < r1) goto L_0x002a;
        r1 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r4 > r1) goto L_0x002a;
        r3.j(r2);
        goto L_0x0047;
        r1 = r4 >> 12;
        r1 = r1 | 224;
        goto L_0x003f;
        r1 = 1114111; // 0x10ffff float:1.561202E-39 double:5.50444E-318;
        if (r4 > r1) goto L_0x0048;
        r1 = r4 >> 18;
        r1 = r1 | 240;
        r3.j(r1);
        r1 = r4 >> 12;
        r1 = r1 & r2;
        r1 = r1 | r0;
        r3.j(r1);
        r1 = r4 >> 6;
        r1 = r1 & r2;
        r1 = r1 | r0;
        goto L_0x0012;
        return r3;
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Unexpected code point: ";
        r1.<init>(r2);
        r4 = java.lang.Integer.toHexString(r4);
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkd.a(int):akkd");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x006b in {3, 7, 12, 13, 14, 15, 17} preds:[]
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
    public final defpackage.akkd a(defpackage.akkd r7, long r8, long r10) {
        /*
        r6 = this;
        if (r7 == 0) goto L_0x0063;
        r0 = r6.b;
        r2 = r8;
        r4 = r10;
        defpackage.akkx.a(r0, r2, r4);
        r0 = 0;
        r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r2 != 0) goto L_0x0010;
        return r6;
        r2 = r7.b;
        r2 = r2 + r10;
        r7.b = r2;
        r2 = r6.a;
        r3 = r2.c;
        r4 = r2.b;
        r3 = r3 - r4;
        r3 = (long) r3;
        r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r5 < 0) goto L_0x002b;
        r3 = r2.c;
        r4 = r2.b;
        r3 = r3 - r4;
        r3 = (long) r3;
        r8 = r8 - r3;
        r2 = r2.f;
        goto L_0x0017;
        r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r3 <= 0) goto L_0x0062;
        r3 = new akkr;
        r3.<init>(r2);
        r4 = r3.b;
        r4 = (long) r4;
        r4 = r4 + r8;
        r8 = (int) r4;
        r3.b = r8;
        r8 = r3.b;
        r9 = (int) r10;
        r8 = r8 + r9;
        r9 = r3.c;
        r8 = java.lang.Math.min(r8, r9);
        r3.c = r8;
        r8 = r7.a;
        if (r8 != 0) goto L_0x0052;
        r3.g = r3;
        r3.f = r3;
        r7.a = r3;
        goto L_0x0057;
        r8 = r8.g;
        r8.a(r3);
        r8 = r3.c;
        r9 = r3.b;
        r8 = r8 - r9;
        r8 = (long) r8;
        r10 = r10 - r8;
        r2 = r2.f;
        r8 = r0;
        goto L_0x002b;
        return r6;
        r7 = new java.lang.IllegalArgumentException;
        r8 = "out == null";
        r7.<init>(r8);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkd.a(akkd, long, long):akkd");
    }

    /* renamed from: a */
    public final akkd c(akkg akkg) {
        if (akkg != null) {
            akkg.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:8:0x0037 in {4, 5, 7} preds:[]
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
    public final defpackage.akkd a(java.io.InputStream r7) {
        /*
        r6 = this;
        if (r7 == 0) goto L_0x002f;
        r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r2 = 1;
        r2 = r6.f(r2);
        r3 = r2.c;
        r3 = 8192 - r3;
        r3 = (long) r3;
        r3 = java.lang.Math.min(r0, r3);
        r4 = (int) r3;
        r3 = r2.a;
        r5 = r2.c;
        r3 = r7.read(r3, r5, r4);
        r4 = -1;
        if (r3 == r4) goto L_0x002e;
        r4 = r2.c;
        r4 = r4 + r3;
        r2.c = r4;
        r4 = r6.b;
        r2 = (long) r3;
        r4 = r4 + r2;
        r6.b = r4;
        r0 = r0 - r2;
        goto L_0x0007;
        return r6;
        r7 = new java.lang.IllegalArgumentException;
        r0 = "in == null";
        r7.<init>(r0);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkd.a(java.io.InputStream):akkd");
    }

    /* renamed from: a */
    public final akkd b(String str) {
        return a(str, 0, str.length());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:46:0x0117 in {13, 14, 17, 18, 23, 26, 27, 33, 34, 35, 36, 37, 39, 41, 43, 45} preds:[]
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
    public final defpackage.akkd a(java.lang.String r8, int r9, int r10) {
        /*
        r7 = this;
        if (r8 == 0) goto L_0x010f;
        if (r9 < 0) goto L_0x00ff;
        if (r10 < r9) goto L_0x00e3;
        r0 = r8.length();
        if (r10 > r0) goto L_0x00c3;
        if (r9 >= r10) goto L_0x00c2;
        r0 = r8.charAt(r9);
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r0 >= r1) goto L_0x004c;
        r2 = 1;
        r2 = r7.f(r2);
        r3 = r2.a;
        r4 = r2.c;
        r4 = r4 - r9;
        r5 = 8192 - r4;
        r5 = java.lang.Math.min(r10, r5);
        r6 = r9 + 1;
        r9 = r9 + r4;
        r0 = (byte) r0;
        r3[r9] = r0;
        r9 = r6;
        if (r9 >= r5) goto L_0x003c;
        r0 = r8.charAt(r9);
        if (r0 >= r1) goto L_0x003c;
        r6 = r9 + 1;
        r9 = r9 + r4;
        r0 = (byte) r0;
        r3[r9] = r0;
        goto L_0x002c;
        r4 = r4 + r9;
        r0 = r2.c;
        r4 = r4 - r0;
        r0 = r2.c;
        r0 = r0 + r4;
        r2.c = r0;
        r0 = r7.b;
        r2 = (long) r4;
        r0 = r0 + r2;
        r7.b = r0;
        goto L_0x000c;
        r2 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r0 >= r2) goto L_0x0060;
        r2 = r0 >> 6;
        r2 = r2 | 192;
        r7.j(r2);
        r0 = r0 & 63;
        r0 = r0 | r1;
        r7.j(r0);
        r9 = r9 + 1;
        goto L_0x000c;
        r2 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        r3 = 63;
        if (r0 < r2) goto L_0x00b6;
        r2 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r0 <= r2) goto L_0x006d;
        goto L_0x00b6;
        r4 = r9 + 1;
        if (r4 >= r10) goto L_0x0076;
        r5 = r8.charAt(r4);
        goto L_0x0077;
        r5 = 0;
        r6 = 56319; // 0xdbff float:7.892E-41 double:2.78253E-319;
        if (r0 > r6) goto L_0x00b0;
        r6 = 56320; // 0xdc00 float:7.8921E-41 double:2.7826E-319;
        if (r5 < r6) goto L_0x00b0;
        if (r5 <= r2) goto L_0x0084;
        goto L_0x00b0;
        r2 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r4 = -55297; // 0xffffffffffff27ff float:NaN double:NaN;
        r0 = r0 & r4;
        r0 = r0 << 10;
        r4 = -56321; // 0xffffffffffff23ff float:NaN double:NaN;
        r4 = r4 & r5;
        r0 = r0 | r4;
        r0 = r0 + r2;
        r2 = r0 >> 18;
        r2 = r2 | 240;
        r7.j(r2);
        r2 = r0 >> 12;
        r2 = r2 & r3;
        r2 = r2 | r1;
        r7.j(r2);
        r2 = r0 >> 6;
        r2 = r2 & r3;
        r2 = r2 | r1;
        r7.j(r2);
        r0 = r0 & r3;
        r0 = r0 | r1;
        r7.j(r0);
        r9 = r9 + 2;
        goto L_0x000c;
        r7.j(r3);
        r9 = r4;
        goto L_0x000c;
        r2 = r0 >> 12;
        r2 = r2 | 224;
        r7.j(r2);
        r2 = r0 >> 6;
        r2 = r2 & r3;
        r2 = r2 | r1;
        goto L_0x0054;
        return r7;
        r9 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = "endIndex > string.length: ";
        r0.<init>(r1);
        r0.append(r10);
        r10 = " > ";
        r0.append(r10);
        r8 = r8.length();
        r0.append(r8);
        r8 = r0.toString();
        r9.<init>(r8);
        throw r9;
        r8 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = "endIndex < beginIndex: ";
        r0.<init>(r1);
        r0.append(r10);
        r10 = " < ";
        r0.append(r10);
        r0.append(r9);
        r9 = r0.toString();
        r8.<init>(r9);
        throw r8;
        r8 = new java.lang.IllegalArgumentException;
        r9 = java.lang.String.valueOf(r9);
        r10 = "beginIndex < 0: ";
        r9 = r10.concat(r9);
        r8.<init>(r9);
        throw r8;
        r8 = new java.lang.IllegalArgumentException;
        r9 = "string == null";
        r8.<init>(r9);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkd.a(java.lang.String, int, int):akkd");
    }

    public final akkd a(String str, int i, int i2, Charset charset) {
        StringBuilder stringBuilder;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        } else if (i2 < i) {
            stringBuilder = new StringBuilder("endIndex < beginIndex: ");
            stringBuilder.append(i2);
            stringBuilder.append(" < ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 > str.length()) {
            stringBuilder = new StringBuilder("endIndex > string.length: ");
            stringBuilder.append(i2);
            stringBuilder.append(" > ");
            stringBuilder.append(str.length());
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(akkx.a)) {
            return a(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return c(bytes, 0, bytes.length);
        }
    }

    public final akkw a() {
        return akkw.f;
    }

    public final String a(Charset charset) {
        try {
            return a(this.b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void a(long j) {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    public final void a(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a = a(bArr, i, bArr.length - i);
            if (a != -1) {
                i += a;
            } else {
                throw new EOFException();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:55:0x0102 in {9, 10, 16, 17, 21, 28, 29, 30, 32, 35, 42, 43, 46, 47, 49, 50, 52, 54} preds:[]
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
    public final void a_(defpackage.akkd r8, long r9) {
        /*
        r7 = this;
        if (r8 == 0) goto L_0x00fa;
        if (r8 == r7) goto L_0x00f2;
        r0 = r8.b;
        r2 = 0;
        r4 = r9;
        defpackage.akkx.a(r0, r2, r4);
        r0 = 0;
        r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x00f1;
        r0 = r8.a;
        r0 = r0.c;
        r1 = r8.a;
        r1 = r1.b;
        r0 = r0 - r1;
        r0 = (long) r0;
        r2 = 0;
        r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r3 >= 0) goto L_0x008f;
        r0 = r7.a;
        if (r0 == 0) goto L_0x0028;
        r0 = r0.g;
        goto L_0x0029;
        r0 = 0;
        if (r0 == 0) goto L_0x0054;
        r1 = r0.e;
        if (r1 == 0) goto L_0x0054;
        r1 = r0.c;
        r3 = (long) r1;
        r3 = r3 + r9;
        r1 = r0.d;
        if (r1 == 0) goto L_0x0039;
        r1 = 0;
        goto L_0x003b;
        r1 = r0.b;
        r5 = (long) r1;
        r3 = r3 - r5;
        r5 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 > 0) goto L_0x0054;
        r1 = r8.a;
        r2 = (int) r9;
        r1.a(r0, r2);
        r0 = r8.b;
        r0 = r0 - r9;
        r8.b = r0;
        r0 = r7.b;
        r0 = r0 + r9;
        r7.b = r0;
        return;
        r0 = r8.a;
        r1 = (int) r9;
        if (r1 <= 0) goto L_0x0089;
        r3 = r0.c;
        r4 = r0.b;
        r3 = r3 - r4;
        if (r1 > r3) goto L_0x0089;
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r1 < r3) goto L_0x006a;
        r3 = new akkr;
        r3.<init>(r0);
        goto L_0x0077;
        r3 = defpackage.akks.a();
        r4 = r0.a;
        r5 = r0.b;
        r6 = r3.a;
        java.lang.System.arraycopy(r4, r5, r6, r2, r1);
        r4 = r3.b;
        r4 = r4 + r1;
        r3.c = r4;
        r4 = r0.b;
        r4 = r4 + r1;
        r0.b = r4;
        r0 = r0.g;
        r0.a(r3);
        r8.a = r3;
        goto L_0x008f;
        r8 = new java.lang.IllegalArgumentException;
        r8.<init>();
        throw r8;
        r0 = r8.a;
        r1 = r0.c;
        r3 = r0.b;
        r1 = r1 - r3;
        r3 = (long) r1;
        r1 = r0.a();
        r8.a = r1;
        r1 = r7.a;
        if (r1 != 0) goto L_0x00aa;
        r7.a = r0;
        r0 = r7.a;
        r0.g = r0;
        r0.f = r0;
        goto L_0x00de;
        r1 = r1.g;
        r0 = r1.a(r0);
        r1 = r0.g;
        if (r1 == r0) goto L_0x00eb;
        r1 = r0.g;
        r1 = r1.e;
        if (r1 == 0) goto L_0x00de;
        r1 = r0.c;
        r5 = r0.b;
        r1 = r1 - r5;
        r5 = r0.g;
        r5 = r5.c;
        r5 = 8192 - r5;
        r6 = r0.g;
        r6 = r6.d;
        if (r6 == 0) goto L_0x00cc;
        goto L_0x00d0;
        r2 = r0.g;
        r2 = r2.b;
        r5 = r5 + r2;
        if (r1 > r5) goto L_0x00de;
        r2 = r0.g;
        r0.a(r2, r1);
        r0.a();
        defpackage.akks.a(r0);
        r0 = r8.b;
        r0 = r0 - r3;
        r8.b = r0;
        r0 = r7.b;
        r0 = r0 + r3;
        r7.b = r0;
        r9 = r9 - r3;
        goto L_0x000c;
        r8 = new java.lang.IllegalStateException;
        r8.<init>();
        throw r8;
        return;
        r8 = new java.lang.IllegalArgumentException;
        r9 = "source == this";
        r8.<init>(r9);
        throw r8;
        r8 = new java.lang.IllegalArgumentException;
        r9 = "source == null";
        r8.<init>(r9);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkd.a_(akkd, long):void");
    }

    public final byte b(long j) {
        akkx.a(this.b, j, 1);
        akkr akkr = this.a;
        while (true) {
            long j2 = (long) (akkr.c - akkr.b);
            if (j < j2) {
                return akkr.a[akkr.b + ((int) j)];
            }
            j -= j2;
            akkr = akkr.f;
        }
    }

    public final long b() {
        return this.b;
    }

    /* renamed from: b */
    public final akkd j(int i) {
        akkr f = f(1);
        byte[] bArr = f.a;
        int i2 = f.c;
        f.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    /* renamed from: b */
    public final akkd c(byte[] bArr) {
        if (bArr != null) {
            return c(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:8:0x0038 in {3, 5, 7} preds:[]
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
    /* renamed from: b */
    public final defpackage.akkd c(byte[] r10, int r11, int r12) {
        /*
        r9 = this;
        if (r10 == 0) goto L_0x0030;
        r0 = r10.length;
        r1 = (long) r0;
        r3 = (long) r11;
        r7 = (long) r12;
        r5 = r7;
        defpackage.akkx.a(r1, r3, r5);
        r12 = r12 + r11;
        if (r11 >= r12) goto L_0x002a;
        r0 = 1;
        r0 = r9.f(r0);
        r1 = r12 - r11;
        r2 = r0.c;
        r2 = 8192 - r2;
        r1 = java.lang.Math.min(r1, r2);
        r2 = r0.a;
        r3 = r0.c;
        java.lang.System.arraycopy(r10, r11, r2, r3, r1);
        r11 = r11 + r1;
        r2 = r0.c;
        r2 = r2 + r1;
        r0.c = r2;
        goto L_0x000b;
        r10 = r9.b;
        r10 = r10 + r7;
        r9.b = r10;
        return r9;
        r10 = new java.lang.IllegalArgumentException;
        r11 = "source == null";
        r10.<init>(r11);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkd.c(byte[], int, int):akkd");
    }

    public final boolean b(akkg akkg) {
        int g = akkg.g();
        if (g < 0 || this.b < ((long) g) || akkg.g() < g) {
            return false;
        }
        for (int i = 0; i < g; i++) {
            if (b(((long) i) + 0) != akkg.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final akkd c() {
        return this;
    }

    /* renamed from: c */
    public final akkd i(int i) {
        akkr f = f(2);
        byte[] bArr = f.a;
        int i2 = f.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        i2 = i3 + 1;
        bArr[i3] = (byte) i;
        f.c = i2;
        this.b += 2;
        return this;
    }

    public final akkg c(long j) {
        return new akkg(e(j));
    }

    public final void close() {
    }

    /* renamed from: d */
    public final akkd h(int i) {
        akkr f = f(4);
        byte[] bArr = f.a;
        int i2 = f.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        i2 = i3 + 1;
        bArr[i3] = (byte) i;
        f.c = i2;
        this.b += 4;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final String d(long j) {
        String k;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (b(j3) == (byte) 13) {
                k = k(j3);
                j2 = 2;
                f(j2);
                return k;
            }
        }
        k = k(j);
        f(j2);
        return k;
    }

    public final boolean d() {
        return this.b == 0;
    }

    /* renamed from: e */
    public final akkd g(int i) {
        return h(akkx.a(i));
    }

    public final InputStream e() {
        return new 2();
    }

    public final byte[] e(long j) {
        akkx.a(this.b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akkd)) {
            return false;
        }
        akkd akkd = (akkd) obj;
        long j = this.b;
        if (j != akkd.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        akkr akkr = this.a;
        akkr akkr2 = akkd.a;
        int i = akkr.b;
        int i2 = akkr2.b;
        while (j2 < this.b) {
            long min = (long) Math.min(akkr.c - i, akkr2.c - i2);
            int i3 = i2;
            i2 = i;
            i = 0;
            while (((long) i) < min) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (akkr.a[i2] != akkr2.a[i3]) {
                    return false;
                }
                i++;
                i2 = i4;
                i3 = i5;
            }
            if (i2 == akkr.c) {
                akkr = akkr.f;
                i = akkr.b;
            } else {
                i = i2;
            }
            if (i3 == akkr2.c) {
                akkr2 = akkr2.f;
                i2 = akkr2.b;
            } else {
                i2 = i3;
            }
            j2 += min;
        }
        return true;
    }

    public final long f() {
        long j = this.b;
        if (j == 0) {
            return 0;
        }
        akkr akkr = this.a.g;
        if (akkr.c < 8192 && akkr.e) {
            j -= (long) (akkr.c - akkr.b);
        }
        return j;
    }

    /* Access modifiers changed, original: final */
    public final akkr f(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        akkr akkr = this.a;
        if (akkr == null) {
            this.a = akks.a();
            akkr akkr2 = this.a;
            akkr2.g = akkr2;
            akkr2.f = akkr2;
            return akkr2;
        }
        akkr = akkr.g;
        if (akkr.c + i > 8192 || !akkr.e) {
            akkr = akkr.a(akks.a());
        }
        return akkr;
    }

    public final void f(long j) {
        while (j > 0) {
            akkr akkr = this.a;
            if (akkr != null) {
                int min = (int) Math.min(j, (long) (akkr.c - this.a.b));
                long j2 = (long) min;
                this.b -= j2;
                j -= j2;
                akkr = this.a;
                akkr.b += min;
                if (this.a.b == this.a.c) {
                    akkr = this.a;
                    this.a = akkr.a();
                    akks.a(akkr);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final void flush() {
    }

    public final byte g() {
        if (this.b != 0) {
            akkr akkr = this.a;
            int i = akkr.b;
            int i2 = akkr.c;
            int i3 = i + 1;
            byte b = akkr.a[i];
            this.b--;
            if (i3 == i2) {
                this.a = akkr.a();
                akks.a(akkr);
            } else {
                akkr.b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: g */
    public final akkd j(long j) {
        if (j == 0) {
            return j(48);
        }
        Object obj = null;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return b("-9223372036854775808");
            }
            obj = 1;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= TelemetryConstants.FLUSH_DELAY_MS) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (obj != null) {
            i++;
        }
        akkr f = f(i);
        byte[] bArr = f.a;
        int i2 = f.c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = c[(int) (j % 10)];
            j /= 10;
        }
        if (obj != null) {
            bArr[i2 - 1] = (byte) 45;
        }
        f.c += i;
        this.b += (long) i;
        return this;
    }

    /* renamed from: h */
    public final akkd i(long j) {
        if (j == 0) {
            return j(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        akkr f = f(numberOfTrailingZeros);
        byte[] bArr = f.a;
        int i = f.c;
        for (int i2 = (f.c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = c[(int) (15 & j)];
            j >>>= 4;
        }
        f.c += numberOfTrailingZeros;
        this.b += (long) numberOfTrailingZeros;
        return this;
    }

    public final short h() {
        if (this.b >= 2) {
            akkr akkr = this.a;
            int i = akkr.b;
            int i2 = akkr.c;
            if (i2 - i < 2) {
                return (short) (((g() & 255) << 8) | (g() & 255));
            }
            byte[] bArr = akkr.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            i = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.b -= 2;
            if (i4 == i2) {
                this.a = akkr.a();
                akks.a(akkr);
            } else {
                akkr.b = i4;
            }
            return (short) i;
        }
        StringBuilder stringBuilder = new StringBuilder("size < 2: ");
        stringBuilder.append(this.b);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final int hashCode() {
        akkr akkr = this.a;
        if (akkr == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = akkr.b; i2 < akkr.c; i2++) {
                i = (i * 31) + akkr.a[i2];
            }
            akkr = akkr.f;
        } while (akkr != this.a);
        return i;
    }

    public final int i() {
        if (this.b >= 4) {
            akkr akkr = this.a;
            int i = akkr.b;
            int i2 = akkr.c;
            if (i2 - i < 4) {
                return ((((g() & 255) << 24) | ((g() & 255) << 16)) | ((g() & 255) << 8)) | (g() & 255);
            }
            byte[] bArr = akkr.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            i = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            i3 = i4 + 1;
            i |= (bArr[i4] & 255) << 8;
            i4 = i3 + 1;
            i |= bArr[i3] & 255;
            this.b -= 4;
            if (i4 == i2) {
                this.a = akkr.a();
                akks.a(akkr);
            } else {
                akkr.b = i4;
            }
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder("size < 4: ");
        stringBuilder.append(this.b);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final short j() {
        int h = h() & 65535;
        return (short) (((h & 255) << 8) | ((h >>> 8) & 255));
    }

    public final int k() {
        return akkx.a(i());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:40:0x00af in {9, 14, 15, 20, 23, 25, 27, 29, 31, 32, 35, 37, 39} preds:[]
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
    public final long l() {
        /*
        r15 = this;
        r0 = r15.b;
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 == 0) goto L_0x00a7;
        r0 = 0;
        r0 = r2;
        r4 = 0;
        r5 = 0;
        r6 = r15.a;
        r7 = r6.a;
        r8 = r6.b;
        r9 = r6.c;
        if (r8 >= r9) goto L_0x008c;
        r10 = r7[r8];
        r11 = 48;
        if (r10 < r11) goto L_0x0023;
        r11 = 57;
        if (r10 > r11) goto L_0x0023;
        r11 = r10 + -48;
        goto L_0x003b;
        r11 = 97;
        if (r10 < r11) goto L_0x0030;
        r11 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r10 > r11) goto L_0x0030;
        r11 = r10 + -97;
        r11 = r11 + 10;
        goto L_0x003b;
        r11 = 65;
        if (r10 < r11) goto L_0x0070;
        r11 = 70;
        if (r10 > r11) goto L_0x0070;
        r11 = r10 + -65;
        goto L_0x002d;
        r12 = -1152921504606846976; // 0xf000000000000000 float:0.0 double:-3.105036184601418E231;
        r12 = r12 & r0;
        r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r14 != 0) goto L_0x004b;
        r10 = 4;
        r0 = r0 << r10;
        r10 = (long) r11;
        r0 = r0 | r10;
        r8 = r8 + 1;
        r4 = r4 + 1;
        goto L_0x0014;
        r2 = new akkd;
        r2.<init>();
        r0 = r2.i(r0);
        r0 = r0.j(r10);
        r1 = new java.lang.NumberFormatException;
        r2 = new java.lang.StringBuilder;
        r3 = "Number too large: ";
        r2.<init>(r3);
        r0 = r0.n();
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
        if (r4 == 0) goto L_0x0074;
        r5 = 1;
        goto L_0x008c;
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected leading [0-9a-fA-F] character but was 0x";
        r1.<init>(r2);
        r2 = java.lang.Integer.toHexString(r10);
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        if (r8 != r9) goto L_0x0098;
        r7 = r6.a();
        r15.a = r7;
        defpackage.akks.a(r6);
        goto L_0x009a;
        r6.b = r8;
        if (r5 != 0) goto L_0x00a0;
        r6 = r15.a;
        if (r6 != 0) goto L_0x000c;
        r2 = r15.b;
        r4 = (long) r4;
        r2 = r2 - r4;
        r15.b = r2;
        return r0;
        r0 = new java.lang.IllegalStateException;
        r1 = "size == 0";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkd.l():long");
    }

    public final akkg m() {
        return new akkg(q());
    }

    public final String n() {
        try {
            return a(this.b, akkx.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final String o() {
        return p();
    }

    public final String p() {
        long a = a((byte) 10, 0, Long.MAX_VALUE);
        if (a != -1) {
            return d(a);
        }
        if (Long.MAX_VALUE < this.b && b(9223372036854775806L) == (byte) 13 && b(Long.MAX_VALUE) == (byte) 10) {
            return d(Long.MAX_VALUE);
        }
        akkd akkd = new akkd();
        a(akkd, 0, Math.min(32, this.b));
        StringBuilder stringBuilder = new StringBuilder("\\n not found: limit=");
        stringBuilder.append(Math.min(this.b, Long.MAX_VALUE));
        stringBuilder.append(" content=");
        stringBuilder.append(akkd.m().e());
        stringBuilder.append(8230);
        throw new EOFException(stringBuilder.toString());
    }

    public final byte[] q() {
        try {
            return e(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void r() {
        try {
            f(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final long s() {
        return a((byte) 0, 0, Long.MAX_VALUE);
    }

    /* renamed from: t */
    public final akkd clone() {
        akkd akkd = new akkd();
        if (this.b == 0) {
            return akkd;
        }
        akkd.a = new akkr(this.a);
        akkr akkr = akkd.a;
        akkr.g = akkr;
        akkr.f = akkr;
        akkr = this.a;
        while (true) {
            akkr = akkr.f;
            if (akkr != this.a) {
                akkd.a.g.a(new akkr(akkr));
            } else {
                akkd.b = this.b;
                return akkd;
            }
        }
    }

    public final String toString() {
        return u().toString();
    }

    public final akkg u() {
        long j = this.b;
        if (j <= 2147483647L) {
            return k((int) j);
        }
        StringBuilder stringBuilder = new StringBuilder("size > Integer.MAX_VALUE: ");
        stringBuilder.append(this.b);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final /* bridge */ /* synthetic */ akke v() {
        return this;
    }
}
