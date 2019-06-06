package defpackage;

import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: scd */
public final class scd extends InputStream {
    private final int a;
    private final ihh b;
    private final Queue<ByteBuffer> c;
    private final sca d;
    private boolean e;
    private Throwable f;
    private a g;
    private boolean h;
    private boolean i;

    /* renamed from: scd$a */
    public interface a {
        void a();

        void a(ByteBuffer byteBuffer);
    }

    public scd(ihh ihh, int i, sca sca) {
        Preconditions.checkArgument(i >= 0, "readTimeoutSeconds can't be negative");
        this.b = (ihh) Preconditions.checkNotNull(ihh);
        this.a = i;
        this.d = sca;
        this.c = new ArrayDeque();
        this.h = false;
        this.i = false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0030 in {6, 9, 10, 12, 15} preds:[]
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
    private synchronized void a() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.e;	 Catch:{ all -> 0x002d }
        if (r0 != 0) goto L_0x002b;	 Catch:{ all -> 0x002d }
        r0 = 1;	 Catch:{ all -> 0x002d }
        r1.e = r0;	 Catch:{ all -> 0x002d }
        r0 = r1.g;	 Catch:{ all -> 0x002d }
        if (r0 == 0) goto L_0x0014;	 Catch:{ all -> 0x002d }
        r0 = r1.g;	 Catch:{ all -> 0x002d }
        r0.a();	 Catch:{ all -> 0x002d }
        r0 = 0;	 Catch:{ all -> 0x002d }
        r1.g = r0;	 Catch:{ all -> 0x002d }
        r0 = r1.c;	 Catch:{ all -> 0x002d }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x002d }
        if (r0 != 0) goto L_0x0028;	 Catch:{ all -> 0x002d }
        r0 = r1.c;	 Catch:{ all -> 0x002d }
        r0 = r0.poll();	 Catch:{ all -> 0x002d }
        r0 = (java.nio.ByteBuffer) r0;	 Catch:{ all -> 0x002d }
        r1.b(r0);	 Catch:{ all -> 0x002d }
        goto L_0x0014;	 Catch:{ all -> 0x002d }
        r1.notifyAll();	 Catch:{ all -> 0x002d }
        monitor-exit(r1);
        return;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.scd.a():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0058 in {4, 11, 17, 19, 21, 23, 25, 27} preds:[]
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
    private java.nio.ByteBuffer b() {
        /*
        r7 = this;
        r0 = r7.b;	 Catch:{ all -> 0x0056 }
        r0 = r0.c();	 Catch:{ all -> 0x0056 }
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0056 }
        r3 = r7.a;	 Catch:{ all -> 0x0056 }
        r3 = (long) r3;	 Catch:{ all -> 0x0056 }
        r2 = r2.toMillis(r3);	 Catch:{ all -> 0x0056 }
        r0 = r0 + r2;	 Catch:{ all -> 0x0056 }
        r2 = r7.c();	 Catch:{ all -> 0x0056 }
        if (r2 == 0) goto L_0x0017;	 Catch:{ all -> 0x0056 }
        return r2;	 Catch:{ all -> 0x0056 }
        r2 = r7.f;	 Catch:{ all -> 0x0056 }
        if (r2 != 0) goto L_0x004b;	 Catch:{ all -> 0x0056 }
        r2 = r7.e;	 Catch:{ all -> 0x0056 }
        if (r2 != 0) goto L_0x0049;	 Catch:{ all -> 0x0056 }
        r2 = r7.g;	 Catch:{ all -> 0x0056 }
        if (r2 != 0) goto L_0x0024;	 Catch:{ all -> 0x0056 }
        goto L_0x0049;	 Catch:{ all -> 0x0056 }
        r7.d();	 Catch:{ all -> 0x0056 }
        r2 = r7.b;	 Catch:{ all -> 0x0056 }
        r2 = r2.c();	 Catch:{ all -> 0x0056 }
        r2 = r0 - r2;
        r4 = 0;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x0041;
        r7.wait(r2);	 Catch:{ InterruptedException -> 0x0039 }
        goto L_0x0010;
    L_0x0039:
        r2 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0056 }
        r2.interrupt();	 Catch:{ all -> 0x0056 }
        goto L_0x0010;	 Catch:{ all -> 0x0056 }
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0056 }
        r1 = "Timeout";	 Catch:{ all -> 0x0056 }
        r0.<init>(r1);	 Catch:{ all -> 0x0056 }
        throw r0;	 Catch:{ all -> 0x0056 }
        r0 = 0;	 Catch:{ all -> 0x0056 }
        return r0;	 Catch:{ all -> 0x0056 }
        r0 = 1;	 Catch:{ all -> 0x0056 }
        r7.e = r0;	 Catch:{ all -> 0x0056 }
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0056 }
        r1 = r7.f;	 Catch:{ all -> 0x0056 }
        r0.<init>(r1);	 Catch:{ all -> 0x0056 }
        throw r0;	 Catch:{ all -> 0x0056 }
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.scd.b():java.nio.ByteBuffer");
    }

    private void b(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.d.a(byteBuffer);
        }
    }

    private ByteBuffer c() {
        ByteBuffer byteBuffer;
        while (true) {
            byteBuffer = (ByteBuffer) this.c.peek();
            if (byteBuffer == null || byteBuffer.hasRemaining()) {
                return byteBuffer;
            }
            this.c.poll();
            b(byteBuffer);
        }
        return byteBuffer;
    }

    private void d() {
        Preconditions.checkState(this.g != null, "Refillable must be set already");
        if (!this.e && !this.h) {
            this.h = true;
            this.g.a((ByteBuffer) Preconditions.checkNotNull(this.d.a()));
        }
    }

    public final synchronized scd a(a aVar, boolean z) {
        Preconditions.checkState(this.g == null, "Refillable is set already");
        this.g = (a) Preconditions.checkNotNull(aVar);
        this.i = z;
        d();
        notifyAll();
        return this;
    }

    public final synchronized void a(ByteBuffer byteBuffer) {
        Preconditions.checkState(this.h, "put() can only be called after refill() is called");
        this.h = false;
        if (this.e) {
            this.d.a(byteBuffer);
        } else {
            this.c.offer(byteBuffer);
            if (this.i) {
                d();
            }
        }
        notifyAll();
    }

    public final synchronized void a(ByteBuffer byteBuffer, Throwable th) {
        if (this.g != null) {
            this.g = null;
            this.i = false;
            if (th != null) {
                this.f = th;
            }
        }
        if (byteBuffer != null) {
            a(byteBuffer);
        }
        notifyAll();
    }

    public final void close() {
        a();
    }

    public final synchronized int read() {
        try {
            ByteBuffer b = b();
            if (b != null) {
                int i = b.get() & 255;
                c();
                return i;
            }
            c();
            return -1;
        } catch (Throwable th) {
            c();
        }
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        try {
            ByteBuffer b = b();
            if (b != null) {
                i2 = Math.min(b.remaining(), i2);
                b.get(bArr, i, i2);
                c();
                return i2;
            }
            c();
            return -1;
        } catch (Throwable th) {
            c();
        }
    }
}
