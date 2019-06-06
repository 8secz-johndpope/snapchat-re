package org.chromium.net.impl;

import defpackage.akoo;
import defpackage.akov;
import defpackage.akox;
import defpackage.akpi.b;
import defpackage.akpo;
import defpackage.akps;
import defpackage.akqb;
import defpackage.akqc;
import defpackage.akqf;
import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.annotations.CalledByNative;

public class CronetBidirectionalStream extends akox {
    private static /* synthetic */ boolean n = (CronetBidirectionalStream.class.desiredAssertionStatus() ^ 1);
    final String a;
    final Object b;
    boolean c;
    int d;
    int e;
    private final CronetUrlRequestContext f;
    private final Executor g;
    private final String h;
    private final Collection<Object> i;
    private akov j;
    private b k;
    private long l;
    private akqf m;

    final class a implements Runnable {
        private ByteBuffer a;
        private final boolean b;

        a(ByteBuffer byteBuffer, boolean z) {
            this.a = byteBuffer;
            this.b = z;
        }

        /* JADX WARNING: Missing block: B:16:0x0029, code skipped:
            if (r3 == null) goto L_0x0030;
     */
        /* JADX WARNING: Missing block: B:18:?, code skipped:
            org.chromium.net.impl.CronetBidirectionalStream.a(r6.c);
     */
        /* JADX WARNING: Missing block: B:19:0x0030, code skipped:
            return;
     */
        public final void run() {
            /*
            r6 = this;
            r0 = 0;
            r1 = 1;
            r2 = 0;
            r6.a = r0;	 Catch:{ Exception -> 0x0034 }
            r0 = org.chromium.net.impl.CronetBidirectionalStream.this;	 Catch:{ Exception -> 0x0034 }
            r0 = r0.b;	 Catch:{ Exception -> 0x0034 }
            monitor-enter(r0);	 Catch:{ Exception -> 0x0034 }
            r3 = org.chromium.net.impl.CronetBidirectionalStream.this;	 Catch:{ all -> 0x0031 }
            r3 = r3.a();	 Catch:{ all -> 0x0031 }
            if (r3 == 0) goto L_0x0014;
        L_0x0012:
            monitor-exit(r0);	 Catch:{ all -> 0x0031 }
            return;
        L_0x0014:
            r3 = r6.b;	 Catch:{ all -> 0x0031 }
            if (r3 == 0) goto L_0x0027;
        L_0x0018:
            r3 = org.chromium.net.impl.CronetBidirectionalStream.this;	 Catch:{ all -> 0x0031 }
            r4 = 11;
            r3.e = r4;	 Catch:{ all -> 0x0031 }
            r3 = org.chromium.net.impl.CronetBidirectionalStream.this;	 Catch:{ all -> 0x0031 }
            r3 = r3.d;	 Catch:{ all -> 0x0031 }
            r4 = 5;
            if (r3 != r4) goto L_0x0027;
        L_0x0025:
            r3 = 1;
            goto L_0x0028;
        L_0x0027:
            r3 = 0;
        L_0x0028:
            monitor-exit(r0);	 Catch:{ all -> 0x0031 }
            if (r3 == 0) goto L_0x0030;
        L_0x002b:
            r0 = org.chromium.net.impl.CronetBidirectionalStream.this;	 Catch:{ Exception -> 0x0034 }
            org.chromium.net.impl.CronetBidirectionalStream.a(r0);	 Catch:{ Exception -> 0x0034 }
        L_0x0030:
            return;
        L_0x0031:
            r3 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0031 }
            throw r3;	 Catch:{ Exception -> 0x0034 }
        L_0x0034:
            r0 = move-exception;
            r3 = org.chromium.net.impl.CronetBidirectionalStream.this;
            r4 = new akpp;
            r5 = "CalledByNative method has thrown an exception";
            r4.<init>(r5, r0);
            r5 = org.chromium.net.impl.CronetUrlRequestContext.b;
            r1 = new java.lang.Object[r1];
            r1[r2] = r0;
            r0 = "Exception in CalledByNative method";
            defpackage.akoo.c(r5, r0, r1);
            r3.a(r4);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream$a.run():void");
        }
    }

    private static ArrayList<Entry<String, String>> a(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length / 2);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    private void a(Runnable runnable) {
        try {
            this.g.execute(runnable);
        } catch (RejectedExecutionException e) {
            akoo.c(CronetUrlRequestContext.b, "Exception posting task to executor", e);
            synchronized (this.b) {
                this.e = 7;
                this.d = 7;
                c();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0070 in {4, 6, 9, 14, 16, 20, 22, 25, 27} preds:[]
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
    private void b() {
        /*
        r10 = this;
        r0 = n;
        r1 = 9;
        if (r0 != 0) goto L_0x0011;
        r0 = r10.e;
        if (r0 != r1) goto L_0x000b;
        goto L_0x0011;
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
        r0 = 0;
        r2 = r0.size();
        r6 = new java.nio.ByteBuffer[r2];
        r7 = new int[r2];
        r8 = new int[r2];
        r3 = 0;
        if (r3 >= r2) goto L_0x0036;
        r4 = r0.poll();
        r4 = (java.nio.ByteBuffer) r4;
        r6[r3] = r4;
        r5 = r4.position();
        r7[r3] = r5;
        r4 = r4.limit();
        r8[r3] = r4;
        r3 = r3 + 1;
        goto L_0x001d;
        r3 = n;
        if (r3 != 0) goto L_0x0047;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0041;
        goto L_0x0047;
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
        r0 = n;
        if (r0 != 0) goto L_0x0054;
        if (r2 <= 0) goto L_0x004e;
        goto L_0x0054;
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
        r0 = 10;
        r10.e = r0;
        r0 = 1;
        r10.c = r0;
        r4 = 0;
        r9 = 0;
        r3 = r10;
        r0 = r3.nativeWritevData(r4, r6, r7, r8, r9);
        if (r0 == 0) goto L_0x0066;
        return;
        r10.e = r1;
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Unable to call native writev.";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.b():void");
    }

    private void b(final akov akov) {
        a(new Runnable() {
            public final void run() {
                CronetBidirectionalStream.this.a(akov);
            }
        });
    }

    private void c() {
        String str = CronetUrlRequestContext.b;
        StringBuilder stringBuilder = new StringBuilder("destroyNativeStreamLocked ");
        stringBuilder.append(toString());
        akoo.a(str, stringBuilder.toString(), new Object[0]);
    }

    private native long nativeCreateBidirectionalStream(long j, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2);

    private native void nativeDestroy(long j, boolean z);

    private native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeSendRequestHeaders(long j);

    private native int nativeStart(long j, String str, int i, String str2, String[] strArr, boolean z);

    private native boolean nativeWritevData(long j, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z);

    @CalledByNative
    private void onCanceled() {
        a(new Runnable() {
            public final void run() {
            }
        });
    }

    @CalledByNative
    private void onError(int i, int i2, int i3, String str, long j) {
        akqf akqf = this.m;
        if (akqf != null) {
            akqf.a(j);
        }
        String str2 = "Exception in BidirectionalStream: ";
        if (i == 10 || i == 3) {
            b(new akqb(str2.concat(String.valueOf(str)), i, i2, i3));
        } else {
            b(new akpo(str2.concat(String.valueOf(str)), i, i2));
        }
    }

    @CalledByNative
    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        synchronized (this.b) {
            if (this.k == null) {
                this.k = new CronetMetrics(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
                if (!n) {
                    if (this.d != this.e) {
                        throw new AssertionError();
                    }
                }
                if (!(n || this.d == 8 || this.d == 7)) {
                    if (this.d != 6) {
                        throw new AssertionError();
                    }
                }
                int i = this.d == 8 ? 0 : this.d == 6 ? 2 : 1;
                this.f.a(new akqc(this.h, this.i, this.k, i, this.m, this.j));
            } else {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
        }
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.m.a(j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (i >= 0) {
                i2 += i;
                if (i2 <= i3) {
                    byteBuffer.position(i2);
                    a(null);
                    return;
                }
            }
            b(new akps("Invalid number of bytes read", null));
            return;
        }
        b(new akps("ByteBuffer modified externally during read", null));
    }

    @CalledByNative
    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            int i2 = i;
            this.m = new akqf(Arrays.asList(new String[]{this.h}), i2, "", a(strArr), false, str, null, j);
            a(new Runnable() {
                public final void run() {
                    synchronized (CronetBidirectionalStream.this.b) {
                        if (CronetBidirectionalStream.this.a()) {
                            return;
                        }
                        CronetBidirectionalStream.this.d = 3;
                    }
                }
            });
        } catch (Exception unused) {
            b(new akps("Cannot prepare ResponseInfo", null));
        }
    }

    @CalledByNative
    private void onResponseTrailersReceived(String[] strArr) {
        final defpackage.akqf.a aVar = new defpackage.akqf.a(a(strArr));
        a(new Runnable() {
            public final void run() {
                synchronized (CronetBidirectionalStream.this.b) {
                    if (CronetBidirectionalStream.this.a()) {
                    }
                }
            }
        });
    }

    @CalledByNative
    private void onStreamReady(final boolean z) {
        a(new Runnable() {
            /* JADX WARNING: Missing block: B:19:0x0047, code skipped:
            return;
     */
            public final void run() {
                /*
                r3 = this;
                r0 = org.chromium.net.impl.CronetBidirectionalStream.this;
                r0 = r0.b;
                monitor-enter(r0);
                r1 = org.chromium.net.impl.CronetBidirectionalStream.this;	 Catch:{ all -> 0x0048 }
                r1 = r1.a();	 Catch:{ all -> 0x0048 }
                if (r1 == 0) goto L_0x000f;
            L_0x000d:
                monitor-exit(r0);	 Catch:{ all -> 0x0048 }
                return;
            L_0x000f:
                r1 = org.chromium.net.impl.CronetBidirectionalStream.this;	 Catch:{ all -> 0x0048 }
                r2 = r2;	 Catch:{ all -> 0x0048 }
                r1.c = r2;	 Catch:{ all -> 0x0048 }
                r1 = org.chromium.net.impl.CronetBidirectionalStream.this;	 Catch:{ all -> 0x0048 }
                r2 = 3;
                r1.d = r2;	 Catch:{ all -> 0x0048 }
                r1 = org.chromium.net.impl.CronetBidirectionalStream.this;	 Catch:{ all -> 0x0048 }
                r1 = r1.a;	 Catch:{ all -> 0x0048 }
                r2 = "GET";
                r2 = r1.equals(r2);	 Catch:{ all -> 0x0048 }
                if (r2 != 0) goto L_0x0030;
            L_0x0026:
                r2 = "HEAD";
                r1 = r1.equals(r2);	 Catch:{ all -> 0x0048 }
                if (r1 != 0) goto L_0x0030;
            L_0x002e:
                r1 = 1;
                goto L_0x0031;
            L_0x0030:
                r1 = 0;
            L_0x0031:
                if (r1 != 0) goto L_0x0040;
            L_0x0033:
                r1 = org.chromium.net.impl.CronetBidirectionalStream.this;	 Catch:{ all -> 0x0048 }
                r1 = r1.c;	 Catch:{ all -> 0x0048 }
                if (r1 == 0) goto L_0x0040;
            L_0x0039:
                r1 = org.chromium.net.impl.CronetBidirectionalStream.this;	 Catch:{ all -> 0x0048 }
                r2 = 11;
                r1.e = r2;	 Catch:{ all -> 0x0048 }
                goto L_0x0046;
            L_0x0040:
                r1 = org.chromium.net.impl.CronetBidirectionalStream.this;	 Catch:{ all -> 0x0048 }
                r2 = 9;
                r1.e = r2;	 Catch:{ all -> 0x0048 }
            L_0x0046:
                monitor-exit(r0);	 Catch:{ all -> 0x0048 }
                return;
            L_0x0048:
                r1 = move-exception;
                monitor-exit(r0);	 Catch:{ all -> 0x0048 }
                throw r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream$AnonymousClass1.run():void");
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:46:0x0079 in {4, 6, 11, 13, 20, 23, 32, 37, 38, 39, 40, 41, 45} preds:[]
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
    @org.chromium.base.annotations.CalledByNative
    private void onWritevCompleted(java.nio.ByteBuffer[] r8, int[] r9, int[] r10, boolean r11) {
        /*
        r7 = this;
        r0 = n;
        if (r0 != 0) goto L_0x000f;
        r0 = r8.length;
        r1 = r9.length;
        if (r0 != r1) goto L_0x0009;
        goto L_0x000f;
        r8 = new java.lang.AssertionError;
        r8.<init>();
        throw r8;
        r0 = n;
        if (r0 != 0) goto L_0x001e;
        r0 = r8.length;
        r1 = r10.length;
        if (r0 != r1) goto L_0x0018;
        goto L_0x001e;
        r8 = new java.lang.AssertionError;
        r8.<init>();
        throw r8;
        r0 = r7.b;
        monitor-enter(r0);
        r1 = r7.a();	 Catch:{ all -> 0x0076 }
        if (r1 == 0) goto L_0x0029;	 Catch:{ all -> 0x0076 }
        monitor-exit(r0);	 Catch:{ all -> 0x0076 }
        return;	 Catch:{ all -> 0x0076 }
        r1 = 9;	 Catch:{ all -> 0x0076 }
        r7.e = r1;	 Catch:{ all -> 0x0076 }
        r1 = 0;	 Catch:{ all -> 0x0076 }
        r2 = r1.isEmpty();	 Catch:{ all -> 0x0076 }
        if (r2 != 0) goto L_0x0037;	 Catch:{ all -> 0x0076 }
        r7.b();	 Catch:{ all -> 0x0076 }
        monitor-exit(r0);	 Catch:{ all -> 0x0076 }
        r0 = 0;
        r2 = 0;
        r3 = r8.length;
        if (r2 >= r3) goto L_0x0075;
        r3 = r8[r2];
        r4 = r3.position();
        r5 = r9[r2];
        if (r4 != r5) goto L_0x006b;
        r4 = r3.limit();
        r5 = r10[r2];
        if (r4 == r5) goto L_0x0050;
        goto L_0x006b;
        r4 = r3.limit();
        r3.position(r4);
        r4 = new org.chromium.net.impl.CronetBidirectionalStream$a;
        r5 = 1;
        if (r11 == 0) goto L_0x0061;
        r6 = r8.length;
        r6 = r6 - r5;
        if (r2 != r6) goto L_0x0061;
        goto L_0x0062;
        r5 = 0;
        r4.<init>(r3, r5);
        r7.a(r4);
        r2 = r2 + 1;
        goto L_0x003a;
        r8 = new akps;
        r9 = "ByteBuffer modified externally during write";
        r8.<init>(r9, r1);
        r7.b(r8);
        return;
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0076 }
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.onWritevCompleted(java.nio.ByteBuffer[], int[], int[], boolean):void");
    }

    /* Access modifiers changed, original: final */
    public final void a(akov akov) {
        this.j = akov;
        synchronized (this.b) {
            if (a()) {
                return;
            }
            this.e = 7;
            this.d = 7;
            c();
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.d != 1;
    }
}
