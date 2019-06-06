package defpackage;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ami */
public final class ami extends FilterInputStream {
    private volatile byte[] a;
    private int b;
    private int c;
    private int d = -1;
    private int e;

    /* renamed from: ami$a */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public ami(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("buffer is null or empty");
        }
        this.a = bArr;
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
                    String str = "BufferedIs";
                    if (Log.isLoggable(str, 3)) {
                        Log.d(str, "allocate buffer of length: ".concat(String.valueOf(i)));
                    }
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.a = bArr2;
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

    private static IOException b() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized void a() {
        this.c = this.a.length;
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.a == null || inputStream == null) {
            throw ami.b();
        }
        return (this.b - this.e) + inputStream.available();
    }

    public final void close() {
        this.a = null;
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
            throw ami.b();
        } else if (this.e >= this.b && a(inputStream, bArr) == -1) {
            return -1;
        } else {
            if (bArr != this.a) {
                bArr = this.a;
                if (bArr == null) {
                    throw ami.b();
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
        r6 = defpackage.ami.b();	 Catch:{ all -> 0x0099 }
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
        r6 = defpackage.ami.b();	 Catch:{ all -> 0x0099 }
        throw r6;	 Catch:{ all -> 0x0099 }
        r6 = defpackage.ami.b();	 Catch:{ all -> 0x0099 }
        throw r6;	 Catch:{ all -> 0x0099 }
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ami.read(byte[], int, int):int");
    }

    public final synchronized void reset() {
        if (this.a == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.d) {
            this.e = this.d;
        } else {
            throw new a("Mark has been invalidated");
        }
    }

    public final synchronized long skip(long j) {
        byte[] bArr = this.a;
        InputStream inputStream = this.in;
        if (bArr == null) {
            throw ami.b();
        } else if (j < 1) {
            return 0;
        } else {
            if (inputStream == null) {
                throw ami.b();
            } else if (((long) (this.b - this.e)) >= j) {
                this.e = (int) (((long) this.e) + j);
                return j;
            } else {
                long j2 = (long) (this.b - this.e);
                this.e = this.b;
                if (this.d == -1 || j > ((long) this.c)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    long j3 = j - j2;
                    if (((long) (this.b - this.e)) >= j3) {
                        this.e = (int) (((long) this.e) + j3);
                        return j;
                    }
                    j2 = (j2 + ((long) this.b)) - ((long) this.e);
                    this.e = this.b;
                    return j2;
                }
            }
        }
    }
}
