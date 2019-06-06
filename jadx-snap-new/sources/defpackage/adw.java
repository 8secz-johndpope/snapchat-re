package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.opencv.imgproc.Imgproc;

/* renamed from: adw */
public final class adw extends FilterInputStream {
    private volatile byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final abd f;

    /* renamed from: adw$a */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public adw(InputStream inputStream, abd abd) {
        this(inputStream, abd, (byte) 0);
    }

    private adw(InputStream inputStream, abd abd, byte b) {
        super(inputStream);
        this.d = -1;
        this.f = abd;
        this.a = (byte[]) abd.a(Imgproc.FLOODFILL_FIXED_RANGE, byte[].class);
    }

    private int a(InputStream inputStream, byte[] bArr) {
        int read;
        int i = this.d;
        if (i != -1) {
            int i2 = this.e - i;
            int i3 = this.c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.b == bArr.length) {
                    i = bArr.length << 1;
                    if (i > i3) {
                        i = i3;
                    }
                    byte[] bArr2 = (byte[]) this.f.a(i, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.a = bArr2;
                    this.f.a((Object) bArr);
                    bArr = bArr2;
                } else {
                    i = this.d;
                    if (i > 0) {
                        System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                    }
                }
                this.e -= this.d;
                this.d = 0;
                this.b = 0;
                i = this.e;
                read = inputStream.read(bArr, i, bArr.length - i);
                this.b = read <= 0 ? this.e : this.e + read;
                return read;
            }
        }
        read = inputStream.read(bArr);
        if (read > 0) {
            this.d = -1;
            this.e = 0;
            this.b = read;
        }
        return read;
    }

    private static IOException c() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized void a() {
        this.c = this.a.length;
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.a == null || inputStream == null) {
            throw adw.c();
        }
        return (this.b - this.e) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.a != null) {
            this.f.a(this.a);
            this.a = null;
        }
    }

    public final void close() {
        if (this.a != null) {
            this.f.a(this.a);
            this.a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void mark(int i) {
        this.c = Math.max(this.c, i);
        this.d = this.e;
    }

    public final boolean markSupported() {
        return true;
    }

    public final synchronized int read() {
        byte[] bArr = this.a;
        InputStream inputStream = this.in;
        if (bArr == null || inputStream == null) {
            throw adw.c();
        } else if (this.e >= this.b && a(inputStream, bArr) == -1) {
            return -1;
        } else {
            if (bArr != this.a) {
                bArr = this.a;
                if (bArr == null) {
                    throw adw.c();
                }
            }
            if (this.b - this.e <= 0) {
                return -1;
            }
            int i = this.e;
            this.e = i + 1;
            return bArr[i] & 255;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:74:0x009c in {7, 15, 16, 21, 22, 24, 25, 35, 38, 44, 50, 52, 55, 56, 57, 61, 65, 66, 68, 70, 73} preds:[]
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
    public final synchronized int read(byte[] r6, int r7, int r8) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.a;	 Catch:{ all -> 0x0099 }
        if (r0 == 0) goto L_0x0094;
        if (r8 != 0) goto L_0x000a;
        r6 = 0;
        monitor-exit(r5);
        return r6;
        r1 = r5.in;	 Catch:{ all -> 0x0099 }
        if (r1 == 0) goto L_0x008f;	 Catch:{ all -> 0x0099 }
        r2 = r5.e;	 Catch:{ all -> 0x0099 }
        r3 = r5.b;	 Catch:{ all -> 0x0099 }
        if (r2 >= r3) goto L_0x003b;	 Catch:{ all -> 0x0099 }
        r2 = r5.b;	 Catch:{ all -> 0x0099 }
        r3 = r5.e;	 Catch:{ all -> 0x0099 }
        r2 = r2 - r3;	 Catch:{ all -> 0x0099 }
        if (r2 < r8) goto L_0x001d;	 Catch:{ all -> 0x0099 }
        r2 = r8;	 Catch:{ all -> 0x0099 }
        goto L_0x0022;	 Catch:{ all -> 0x0099 }
        r2 = r5.b;	 Catch:{ all -> 0x0099 }
        r3 = r5.e;	 Catch:{ all -> 0x0099 }
        r2 = r2 - r3;	 Catch:{ all -> 0x0099 }
        r3 = r5.e;	 Catch:{ all -> 0x0099 }
        java.lang.System.arraycopy(r0, r3, r6, r7, r2);	 Catch:{ all -> 0x0099 }
        r3 = r5.e;	 Catch:{ all -> 0x0099 }
        r3 = r3 + r2;	 Catch:{ all -> 0x0099 }
        r5.e = r3;	 Catch:{ all -> 0x0099 }
        if (r2 == r8) goto L_0x0039;	 Catch:{ all -> 0x0099 }
        r3 = r1.available();	 Catch:{ all -> 0x0099 }
        if (r3 != 0) goto L_0x0035;
        goto L_0x0039;
        r7 = r7 + r2;
        r2 = r8 - r2;
        goto L_0x003c;
        monitor-exit(r5);
        return r2;
        r2 = r8;
        r3 = r5.d;	 Catch:{ all -> 0x0099 }
        r4 = -1;	 Catch:{ all -> 0x0099 }
        if (r3 != r4) goto L_0x0051;	 Catch:{ all -> 0x0099 }
        r3 = r0.length;	 Catch:{ all -> 0x0099 }
        if (r2 < r3) goto L_0x0051;	 Catch:{ all -> 0x0099 }
        r3 = r1.read(r6, r7, r2);	 Catch:{ all -> 0x0099 }
        if (r3 != r4) goto L_0x0081;
        if (r2 != r8) goto L_0x004e;
        monitor-exit(r5);
        return r4;
        r8 = r8 - r2;
        monitor-exit(r5);
        return r8;
        r3 = r5.a(r1, r0);	 Catch:{ all -> 0x0099 }
        if (r3 != r4) goto L_0x005b;
        if (r2 != r8) goto L_0x004e;
        monitor-exit(r5);
        return r4;
        r3 = r5.a;	 Catch:{ all -> 0x0099 }
        if (r0 == r3) goto L_0x0069;	 Catch:{ all -> 0x0099 }
        r0 = r5.a;	 Catch:{ all -> 0x0099 }
        if (r0 == 0) goto L_0x0064;	 Catch:{ all -> 0x0099 }
        goto L_0x0069;	 Catch:{ all -> 0x0099 }
        r6 = defpackage.adw.c();	 Catch:{ all -> 0x0099 }
        throw r6;	 Catch:{ all -> 0x0099 }
        r3 = r5.b;	 Catch:{ all -> 0x0099 }
        r4 = r5.e;	 Catch:{ all -> 0x0099 }
        r3 = r3 - r4;	 Catch:{ all -> 0x0099 }
        if (r3 < r2) goto L_0x0072;	 Catch:{ all -> 0x0099 }
        r3 = r2;	 Catch:{ all -> 0x0099 }
        goto L_0x0077;	 Catch:{ all -> 0x0099 }
        r3 = r5.b;	 Catch:{ all -> 0x0099 }
        r4 = r5.e;	 Catch:{ all -> 0x0099 }
        r3 = r3 - r4;	 Catch:{ all -> 0x0099 }
        r4 = r5.e;	 Catch:{ all -> 0x0099 }
        java.lang.System.arraycopy(r0, r4, r6, r7, r3);	 Catch:{ all -> 0x0099 }
        r4 = r5.e;	 Catch:{ all -> 0x0099 }
        r4 = r4 + r3;	 Catch:{ all -> 0x0099 }
        r5.e = r4;	 Catch:{ all -> 0x0099 }
        r2 = r2 - r3;
        if (r2 != 0) goto L_0x0086;
        monitor-exit(r5);
        return r8;
        r4 = r1.available();	 Catch:{ all -> 0x0099 }
        if (r4 != 0) goto L_0x008d;	 Catch:{ all -> 0x0099 }
        goto L_0x004e;	 Catch:{ all -> 0x0099 }
        r7 = r7 + r3;	 Catch:{ all -> 0x0099 }
        goto L_0x003c;	 Catch:{ all -> 0x0099 }
        r6 = defpackage.adw.c();	 Catch:{ all -> 0x0099 }
        throw r6;	 Catch:{ all -> 0x0099 }
        r6 = defpackage.adw.c();	 Catch:{ all -> 0x0099 }
        throw r6;	 Catch:{ all -> 0x0099 }
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adw.read(byte[], int, int):int");
    }

    public final synchronized void reset() {
        if (this.a == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.d) {
            this.e = this.d;
        } else {
            StringBuilder stringBuilder = new StringBuilder("Mark has been invalidated, pos: ");
            stringBuilder.append(this.e);
            stringBuilder.append(" markLimit: ");
            stringBuilder.append(this.c);
            throw new a(stringBuilder.toString());
        }
    }

    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                throw adw.c();
            } else if (((long) (this.b - this.e)) >= j) {
                this.e = (int) (((long) this.e) + j);
                return j;
            } else {
                long j2 = ((long) this.b) - ((long) this.e);
                this.e = this.b;
                if (this.d == -1 || j > ((long) this.c)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    if (((long) (this.b - this.e)) >= j - j2) {
                        this.e = (int) ((((long) this.e) + j) - j2);
                        return j;
                    }
                    j2 = (j2 + ((long) this.b)) - ((long) this.e);
                    this.e = this.b;
                    return j2;
                }
            }
        }
        throw adw.c();
    }
}
