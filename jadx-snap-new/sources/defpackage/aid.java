package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: aid */
final class aid implements Closeable {
    final Charset a;
    int b;
    private final InputStream c;
    private byte[] d;
    private int e;

    /* renamed from: aid$1 */
    class 1 extends ByteArrayOutputStream {
        1(int i) {
            super(i);
        }

        public final String toString() {
            int i = (this.count <= 0 || this.buf[this.count - 1] != (byte) 13) ? this.count : this.count - 1;
            try {
                return new String(this.buf, 0, i, aid.this.a.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public aid(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private aid(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(aie.a)) {
            this.c = inputStream;
            this.a = charset;
            this.d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    private void b() {
        InputStream inputStream = this.c;
        byte[] bArr = this.d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.e = 0;
            this.b = read;
            return;
        }
        throw new EOFException();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x009a in {7, 17, 18, 21, 22, 31, 34, 35, 37, 40} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final java.lang.String a() {
        /*
        r7 = this;
        r0 = r7.c;
        monitor-enter(r0);
        r1 = r7.d;	 Catch:{ all -> 0x0097 }
        if (r1 == 0) goto L_0x008f;	 Catch:{ all -> 0x0097 }
        r1 = r7.e;	 Catch:{ all -> 0x0097 }
        r2 = r7.b;	 Catch:{ all -> 0x0097 }
        if (r1 < r2) goto L_0x0010;	 Catch:{ all -> 0x0097 }
        r7.b();	 Catch:{ all -> 0x0097 }
        r1 = r7.e;	 Catch:{ all -> 0x0097 }
        r2 = r7.b;	 Catch:{ all -> 0x0097 }
        r3 = 10;	 Catch:{ all -> 0x0097 }
        if (r1 == r2) goto L_0x0049;	 Catch:{ all -> 0x0097 }
        r2 = r7.d;	 Catch:{ all -> 0x0097 }
        r2 = r2[r1];	 Catch:{ all -> 0x0097 }
        if (r2 != r3) goto L_0x0046;	 Catch:{ all -> 0x0097 }
        r2 = r7.e;	 Catch:{ all -> 0x0097 }
        if (r1 == r2) goto L_0x002d;	 Catch:{ all -> 0x0097 }
        r2 = r7.d;	 Catch:{ all -> 0x0097 }
        r3 = r1 + -1;	 Catch:{ all -> 0x0097 }
        r2 = r2[r3];	 Catch:{ all -> 0x0097 }
        r4 = 13;	 Catch:{ all -> 0x0097 }
        if (r2 != r4) goto L_0x002d;	 Catch:{ all -> 0x0097 }
        goto L_0x002e;	 Catch:{ all -> 0x0097 }
        r3 = r1;	 Catch:{ all -> 0x0097 }
        r2 = new java.lang.String;	 Catch:{ all -> 0x0097 }
        r4 = r7.d;	 Catch:{ all -> 0x0097 }
        r5 = r7.e;	 Catch:{ all -> 0x0097 }
        r6 = r7.e;	 Catch:{ all -> 0x0097 }
        r3 = r3 - r6;	 Catch:{ all -> 0x0097 }
        r6 = r7.a;	 Catch:{ all -> 0x0097 }
        r6 = r6.name();	 Catch:{ all -> 0x0097 }
        r2.<init>(r4, r5, r3, r6);	 Catch:{ all -> 0x0097 }
        r1 = r1 + 1;	 Catch:{ all -> 0x0097 }
        r7.e = r1;	 Catch:{ all -> 0x0097 }
        monitor-exit(r0);	 Catch:{ all -> 0x0097 }
        return r2;	 Catch:{ all -> 0x0097 }
        r1 = r1 + 1;	 Catch:{ all -> 0x0097 }
        goto L_0x0012;	 Catch:{ all -> 0x0097 }
        r1 = new aid$1;	 Catch:{ all -> 0x0097 }
        r2 = r7.b;	 Catch:{ all -> 0x0097 }
        r4 = r7.e;	 Catch:{ all -> 0x0097 }
        r2 = r2 - r4;	 Catch:{ all -> 0x0097 }
        r2 = r2 + 80;	 Catch:{ all -> 0x0097 }
        r1.<init>(r2);	 Catch:{ all -> 0x0097 }
        r2 = r7.d;	 Catch:{ all -> 0x0097 }
        r4 = r7.e;	 Catch:{ all -> 0x0097 }
        r5 = r7.b;	 Catch:{ all -> 0x0097 }
        r6 = r7.e;	 Catch:{ all -> 0x0097 }
        r5 = r5 - r6;	 Catch:{ all -> 0x0097 }
        r1.write(r2, r4, r5);	 Catch:{ all -> 0x0097 }
        r2 = -1;	 Catch:{ all -> 0x0097 }
        r7.b = r2;	 Catch:{ all -> 0x0097 }
        r7.b();	 Catch:{ all -> 0x0097 }
        r2 = r7.e;	 Catch:{ all -> 0x0097 }
        r4 = r7.b;	 Catch:{ all -> 0x0097 }
        if (r2 == r4) goto L_0x0055;	 Catch:{ all -> 0x0097 }
        r4 = r7.d;	 Catch:{ all -> 0x0097 }
        r4 = r4[r2];	 Catch:{ all -> 0x0097 }
        if (r4 != r3) goto L_0x008c;	 Catch:{ all -> 0x0097 }
        r3 = r7.e;	 Catch:{ all -> 0x0097 }
        if (r2 == r3) goto L_0x0082;	 Catch:{ all -> 0x0097 }
        r3 = r7.d;	 Catch:{ all -> 0x0097 }
        r4 = r7.e;	 Catch:{ all -> 0x0097 }
        r5 = r7.e;	 Catch:{ all -> 0x0097 }
        r5 = r2 - r5;	 Catch:{ all -> 0x0097 }
        r1.write(r3, r4, r5);	 Catch:{ all -> 0x0097 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0097 }
        r7.e = r2;	 Catch:{ all -> 0x0097 }
        r1 = r1.toString();	 Catch:{ all -> 0x0097 }
        monitor-exit(r0);	 Catch:{ all -> 0x0097 }
        return r1;	 Catch:{ all -> 0x0097 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0097 }
        goto L_0x0069;	 Catch:{ all -> 0x0097 }
        r1 = new java.io.IOException;	 Catch:{ all -> 0x0097 }
        r2 = "LineReader is closed";	 Catch:{ all -> 0x0097 }
        r1.<init>(r2);	 Catch:{ all -> 0x0097 }
        throw r1;	 Catch:{ all -> 0x0097 }
        r1 = move-exception;	 Catch:{ all -> 0x0097 }
        monitor-exit(r0);	 Catch:{ all -> 0x0097 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aid.a():java.lang.String");
    }

    public final void close() {
        synchronized (this.c) {
            if (this.d != null) {
                this.d = null;
                this.c.close();
            }
        }
    }
}
