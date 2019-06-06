package org.chromium.net.impl;

import com.looksery.sdk.domain.uriservice.LensTextInputConstants;
import defpackage.akoo;
import defpackage.akov;
import defpackage.akpb;
import defpackage.akpk;
import defpackage.akpp;
import defpackage.akps;
import defpackage.akpz;
import defpackage.akqa;
import defpackage.akqb;
import defpackage.akqd;
import defpackage.akqf;
import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.impl.VersionSafeCallbacks.UrlRequestStatusListener;
import org.chromium.net.impl.VersionSafeCallbacks.c;
import org.chromium.net.impl.VersionSafeCallbacks.e;

public final class CronetUrlRequest extends akqd {
    private static /* synthetic */ boolean D = (CronetUrlRequest.class.desiredAssertionStatus() ^ 1);
    private int A;
    private CronetMetrics B;
    private b C;
    long a;
    boolean b;
    boolean c;
    final Object d = new Object();
    final e e;
    final c f;
    CronetUploadDataStream g;
    akqf h;
    akov i;
    private final boolean j;
    private boolean k;
    private final CronetUrlRequestContext l;
    private final Executor m;
    private final List<String> n = new ArrayList();
    private final String o;
    private final int p;
    private String q;
    private final a r = new a();
    private final Collection<Object> t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final int x;
    private final boolean y;
    private final int z;

    static final class a extends ArrayList<Entry<String, String>> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    final class b implements Runnable {
        ByteBuffer a;

        private b() {
        }

        /* synthetic */ b(CronetUrlRequest cronetUrlRequest, byte b) {
            this();
        }

        public final void run() {
            CronetUrlRequest.this.g();
            ByteBuffer byteBuffer = this.a;
            this.a = null;
            try {
                synchronized (CronetUrlRequest.this.d) {
                    if (CronetUrlRequest.this.f()) {
                        return;
                    }
                    CronetUrlRequest.this.c = true;
                    CronetUrlRequest.this.e.a(CronetUrlRequest.this, CronetUrlRequest.this.h, byteBuffer);
                }
            } catch (Exception e) {
                CronetUrlRequest.a(CronetUrlRequest.this, e);
            }
        }
    }

    CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, defpackage.akpm.b bVar, Executor executor, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, defpackage.akpi.a aVar) {
        if (str == null) {
            throw new NullPointerException("URL is required");
        } else if (bVar == null) {
            throw new NullPointerException("Listener is required");
        } else if (executor != null) {
            this.j = false;
            this.l = cronetUrlRequestContext;
            this.o = str;
            this.n.add(str);
            int i4 = 3;
            if (i == 0) {
                i4 = 1;
            } else if (i == 1) {
                i4 = 2;
            } else if (i != 2) {
                i4 = (i == 3 || i != 4) ? 4 : 5;
            }
            this.p = i4;
            this.e = new e(bVar);
            this.m = executor;
            this.t = collection;
            this.u = false;
            this.v = false;
            this.w = false;
            this.x = 0;
            this.y = false;
            this.z = 0;
            this.f = null;
        } else {
            throw new NullPointerException("Executor is required");
        }
    }

    private akqf a(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        String[] strArr2 = strArr;
        int i2 = 0;
        a aVar = new a();
        while (i2 < strArr2.length) {
            aVar.add(new SimpleImmutableEntry(strArr2[i2], strArr2[i2 + 1]));
            i2 += 2;
        }
        return new akqf(new ArrayList(this.n), i, str, aVar, z, str2, str3, j);
    }

    private void a(akov akov) {
        synchronized (this.d) {
            if (f()) {
                return;
            }
            if (!D) {
                if (this.i != null) {
                    throw new AssertionError();
                }
            }
            this.i = akov;
            a(1);
        }
    }

    private void a(Runnable runnable) {
        try {
            this.m.execute(runnable);
        } catch (RejectedExecutionException e) {
            String str = "Exception posting task to executor";
            akoo.c(CronetUrlRequestContext.b, str, e);
            a(new akps(str, e));
        }
    }

    private void h() {
        synchronized (this.d) {
            if (this.k || f()) {
                throw new IllegalStateException("Request is already started.");
            }
        }
    }

    private native boolean nativeAddRequestHeader(long j, String str, String str2);

    private native long nativeCreateRequestAdapter(long j, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3);

    private native void nativeDestroy(long j, boolean z);

    private native void nativeFollowDeferredRedirect(long j);

    private native void nativeGetStatus(long j, UrlRequestStatusListener urlRequestStatusListener);

    private native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    private native boolean nativeSetHttpMethod(long j, String str);

    private native void nativeStart(long j);

    @CalledByNative
    private void onCanceled() {
        a(new Runnable() {
            public final void run() {
                try {
                    CronetUrlRequest.this.e.c(CronetUrlRequest.this, CronetUrlRequest.this.h);
                    CronetUrlRequest.a(CronetUrlRequest.this);
                } catch (Exception e) {
                    akoo.c(CronetUrlRequestContext.b, "Exception in onCanceled method", e);
                }
            }
        });
    }

    @CalledByNative
    private void onError(int i, int i2, int i3, String str, long j) {
        akqf akqf = this.h;
        if (akqf != null) {
            akqf.a(j);
        }
        String str2 = "Exception in CronetUrlRequest: ";
        if (i == 10 || i == 3) {
            a(new akqb(str2.concat(String.valueOf(str)), i, i2, i3));
            return;
        }
        switch (i) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            default:
                akoo.c(CronetUrlRequestContext.b, "Unknown error code: ".concat(String.valueOf(i)), new Object[0]);
                break;
        }
        a(new akpz(str2.concat(String.valueOf(str)), i, i2));
    }

    @CalledByNative
    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        synchronized (this.d) {
            if (this.B == null) {
                this.B = new CronetMetrics(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
            } else {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
        }
    }

    @CalledByNative
    private void onNativeAdapterDestroyed() {
        synchronized (this.d) {
            if (this.i == null) {
                return;
            }
            try {
                this.m.execute(new Runnable() {
                    public final void run() {
                        try {
                            CronetUrlRequest.this.e.a(CronetUrlRequest.this, CronetUrlRequest.this.h, CronetUrlRequest.this.i);
                            CronetUrlRequest.a(CronetUrlRequest.this);
                        } catch (Exception e) {
                            akoo.c(CronetUrlRequestContext.b, "Exception in onFailed method", e);
                        }
                    }
                });
            } catch (RejectedExecutionException e) {
                akoo.c(CronetUrlRequestContext.b, "Exception posting task to executor", e);
            }
        }
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.h.a(j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (this.C == null) {
                this.C = new b(this, (byte) 0);
            }
            byteBuffer.position(i2 + i);
            Runnable runnable = this.C;
            runnable.a = byteBuffer;
            a(runnable);
            return;
        }
        a(new akps("ByteBuffer modified externally during read", null));
    }

    @CalledByNative
    private void onRedirectReceived(final String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        String str5 = str;
        final akqf a = a(i, str2, strArr, z, str3, str4, j);
        this.n.add(str);
        a(new Runnable() {
            public final void run() {
                CronetUrlRequest.this.g();
                synchronized (CronetUrlRequest.this.d) {
                    if (CronetUrlRequest.this.f()) {
                        return;
                    }
                    CronetUrlRequest.this.b = true;
                    try {
                        CronetUrlRequest.this.e.a(CronetUrlRequest.this, a, str);
                    } catch (Exception e) {
                        CronetUrlRequest.a(CronetUrlRequest.this, e);
                    }
                }
            }
        });
    }

    @CalledByNative
    private void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        this.h = a(i, str, strArr, z, str2, str3, j);
        a(new Runnable() {
            public final void run() {
                CronetUrlRequest.this.g();
                synchronized (CronetUrlRequest.this.d) {
                    if (CronetUrlRequest.this.f()) {
                        return;
                    }
                    CronetUrlRequest.this.c = true;
                    try {
                        CronetUrlRequest.this.e.a(CronetUrlRequest.this, CronetUrlRequest.this.h);
                    } catch (Exception e) {
                        CronetUrlRequest.a(CronetUrlRequest.this, e);
                    }
                }
            }
        });
    }

    @CalledByNative
    private void onStatus(final UrlRequestStatusListener urlRequestStatusListener, final int i) {
        a(new Runnable() {
            public final void run() {
                int i = i;
                if (akqd.s || (i >= 0 && i <= 15)) {
                    switch (i) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            return;
                        default:
                            throw new IllegalArgumentException("No request status found.");
                    }
                }
                throw new AssertionError();
            }
        });
    }

    @CalledByNative
    private void onSucceeded(long j) {
        this.h.a(j);
        a(new Runnable() {
            public final void run() {
                synchronized (CronetUrlRequest.this.d) {
                    if (CronetUrlRequest.this.f()) {
                        return;
                    }
                    CronetUrlRequest.this.a(0);
                    try {
                        CronetUrlRequest.this.e.b(CronetUrlRequest.this, CronetUrlRequest.this.h);
                        CronetUrlRequest.a(CronetUrlRequest.this);
                    } catch (Exception e) {
                        akoo.c(CronetUrlRequestContext.b, "Exception in onSucceeded method", e);
                    }
                }
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:53:0x00fb in {10, 11, 12, 17, 19, 27, 30, 32, 39, 42, 46, 49, 52} preds:[]
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
    public final void a() {
        /*
        r17 = this;
        r13 = r17;
        r14 = r13.d;
        monitor-enter(r14);
        r17.h();	 Catch:{ all -> 0x00f8 }
        r15 = 1;
        r0 = r13.l;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r0.d();	 Catch:{ RuntimeException -> 0x00f3 }
        r4 = r13.o;	 Catch:{ RuntimeException -> 0x00f3 }
        r5 = r13.p;	 Catch:{ RuntimeException -> 0x00f3 }
        r6 = r13.u;	 Catch:{ RuntimeException -> 0x00f3 }
        r7 = r13.v;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r13.l;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r0.b();	 Catch:{ RuntimeException -> 0x00f3 }
        r16 = 0;	 Catch:{ RuntimeException -> 0x00f3 }
        if (r0 != 0) goto L_0x0028;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r13.f;	 Catch:{ RuntimeException -> 0x00f3 }
        if (r0 == 0) goto L_0x0026;	 Catch:{ RuntimeException -> 0x00f3 }
        goto L_0x0028;	 Catch:{ RuntimeException -> 0x00f3 }
        r8 = 0;	 Catch:{ RuntimeException -> 0x00f3 }
        goto L_0x0029;	 Catch:{ RuntimeException -> 0x00f3 }
        r8 = 1;	 Catch:{ RuntimeException -> 0x00f3 }
        r9 = r13.w;	 Catch:{ RuntimeException -> 0x00f3 }
        r10 = r13.x;	 Catch:{ RuntimeException -> 0x00f3 }
        r11 = r13.y;	 Catch:{ RuntimeException -> 0x00f3 }
        r12 = r13.z;	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = r17;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r1.nativeCreateRequestAdapter(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ RuntimeException -> 0x00f3 }
        r13.a = r0;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r13.l;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r0.d;	 Catch:{ RuntimeException -> 0x00f3 }
        r0.incrementAndGet();	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r13.q;	 Catch:{ RuntimeException -> 0x00f3 }
        if (r0 == 0) goto L_0x0065;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r13.a;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r13.q;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r13.nativeSetHttpMethod(r0, r2);	 Catch:{ RuntimeException -> 0x00f3 }
        if (r0 == 0) goto L_0x004f;	 Catch:{ RuntimeException -> 0x00f3 }
        goto L_0x0065;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = "Invalid http method ";	 Catch:{ RuntimeException -> 0x00f3 }
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r13.q;	 Catch:{ RuntimeException -> 0x00f3 }
        r1.append(r2);	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x00f3 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x00f3 }
        throw r0;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r13.r;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r0.iterator();	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = r0.hasNext();	 Catch:{ RuntimeException -> 0x00f3 }
        if (r1 == 0) goto L_0x00d0;	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = r0.next();	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r1.getKey();	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = (java.lang.String) r2;	 Catch:{ RuntimeException -> 0x00f3 }
        r3 = "Content-Type";	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r2.equalsIgnoreCase(r3);	 Catch:{ RuntimeException -> 0x00f3 }
        if (r2 == 0) goto L_0x0093;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r1.getValue();	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = (java.lang.String) r2;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r2.isEmpty();	 Catch:{ RuntimeException -> 0x00f3 }
        if (r2 != 0) goto L_0x0093;	 Catch:{ RuntimeException -> 0x00f3 }
        r16 = 1;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r13.a;	 Catch:{ RuntimeException -> 0x00f3 }
        r4 = r1.getKey();	 Catch:{ RuntimeException -> 0x00f3 }
        r4 = (java.lang.String) r4;	 Catch:{ RuntimeException -> 0x00f3 }
        r5 = r1.getValue();	 Catch:{ RuntimeException -> 0x00f3 }
        r5 = (java.lang.String) r5;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = r13.nativeAddRequestHeader(r2, r4, r5);	 Catch:{ RuntimeException -> 0x00f3 }
        if (r2 == 0) goto L_0x00a8;	 Catch:{ RuntimeException -> 0x00f3 }
        goto L_0x006b;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ RuntimeException -> 0x00f3 }
        r2 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00f3 }
        r3 = "Invalid header ";	 Catch:{ RuntimeException -> 0x00f3 }
        r2.<init>(r3);	 Catch:{ RuntimeException -> 0x00f3 }
        r3 = r1.getKey();	 Catch:{ RuntimeException -> 0x00f3 }
        r3 = (java.lang.String) r3;	 Catch:{ RuntimeException -> 0x00f3 }
        r2.append(r3);	 Catch:{ RuntimeException -> 0x00f3 }
        r3 = "=";	 Catch:{ RuntimeException -> 0x00f3 }
        r2.append(r3);	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = r1.getValue();	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = (java.lang.String) r1;	 Catch:{ RuntimeException -> 0x00f3 }
        r2.append(r1);	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = r2.toString();	 Catch:{ RuntimeException -> 0x00f3 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x00f3 }
        throw r0;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r13.g;	 Catch:{ RuntimeException -> 0x00f3 }
        if (r0 == 0) goto L_0x00ec;	 Catch:{ RuntimeException -> 0x00f3 }
        if (r16 == 0) goto L_0x00e4;	 Catch:{ RuntimeException -> 0x00f3 }
        r13.k = r15;	 Catch:{ RuntimeException -> 0x00f3 }
        r0 = r13.g;	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = new org.chromium.net.impl.CronetUrlRequest$1;	 Catch:{ RuntimeException -> 0x00f3 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x00f3 }
        r0.a(r1);	 Catch:{ RuntimeException -> 0x00f3 }
        monitor-exit(r14);	 Catch:{ all -> 0x00f8 }
        return;
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ RuntimeException -> 0x00f3 }
        r1 = "Requests with upload data must have a Content-Type.";	 Catch:{ RuntimeException -> 0x00f3 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x00f3 }
        throw r0;	 Catch:{ RuntimeException -> 0x00f3 }
        r13.k = r15;	 Catch:{ all -> 0x00f8 }
        r17.e();	 Catch:{ all -> 0x00f8 }
        monitor-exit(r14);	 Catch:{ all -> 0x00f8 }
        return;	 Catch:{ all -> 0x00f8 }
        r0 = move-exception;	 Catch:{ all -> 0x00f8 }
        r13.a(r15);	 Catch:{ all -> 0x00f8 }
        throw r0;	 Catch:{ all -> 0x00f8 }
        r0 = move-exception;	 Catch:{ all -> 0x00f8 }
        monitor-exit(r14);	 Catch:{ all -> 0x00f8 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequest.a():void");
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        boolean z = true;
        if (D || this.i == null || i == 1) {
            this.A = i;
            if (this.a != 0) {
                this.l.c();
                long j = this.a;
                if (i != 2) {
                    z = false;
                }
                nativeDestroy(j, z);
                this.a = 0;
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    public final void a(akpk akpk, Executor executor) {
        if (akpk != null) {
            if (this.q == null) {
                this.q = LensTextInputConstants.REQUEST_METHOD;
            }
            this.g = new CronetUploadDataStream(akpk, executor, this);
            return;
        }
        throw new NullPointerException("Invalid UploadDataProvider.");
    }

    public final void a(String str) {
        h();
        if (str != null) {
            this.q = str;
            return;
        }
        throw new NullPointerException("Method is required.");
    }

    public final void a(String str, String str2) {
        h();
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 != null) {
            this.r.add(new SimpleImmutableEntry(str, str2));
        } else {
            throw new NullPointerException("Invalid header value.");
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Throwable th) {
        akov akpp = new akpp("Exception received from UploadDataProvider", th);
        akoo.c(CronetUrlRequestContext.b, "Exception in upload method", th);
        a(akpp);
    }

    public final void a(ByteBuffer byteBuffer) {
        akqa.b(byteBuffer);
        akqa.a(byteBuffer);
        synchronized (this.d) {
            if (this.c) {
                this.c = false;
                if (f()) {
                    return;
                }
                if (nativeReadData(this.a, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    return;
                } else {
                    this.c = true;
                    throw new IllegalArgumentException("Unable to call native read");
                }
            }
            throw new IllegalStateException("Unexpected read attempt.");
        }
    }

    public final void b() {
        synchronized (this.d) {
            if (this.b) {
                this.b = false;
                if (f()) {
                    return;
                }
                nativeFollowDeferredRedirect(this.a);
                return;
            }
            throw new IllegalStateException("No redirect to follow.");
        }
    }

    /* JADX WARNING: Missing block: B:12:0x0015, code skipped:
            return;
     */
    public final void c() {
        /*
        r2 = this;
        r0 = r2.d;
        monitor-enter(r0);
        r1 = r2.f();	 Catch:{ all -> 0x0016 }
        if (r1 != 0) goto L_0x0014;
    L_0x0009:
        r1 = r2.k;	 Catch:{ all -> 0x0016 }
        if (r1 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0014;
    L_0x000e:
        r1 = 2;
        r2.a(r1);	 Catch:{ all -> 0x0016 }
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        return;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        return;
    L_0x0016:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequest.c():void");
    }

    public final boolean d() {
        boolean f;
        synchronized (this.d) {
            f = f();
        }
        return f;
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        nativeStart(this.a);
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return this.k && this.a == 0;
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        if (!this.j && this.l.a(Thread.currentThread())) {
            throw new akpb();
        }
    }
}
