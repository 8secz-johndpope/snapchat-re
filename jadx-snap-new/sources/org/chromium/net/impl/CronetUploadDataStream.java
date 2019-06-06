package org.chromium.net.impl;

import android.annotation.SuppressLint;
import defpackage.akoo;
import defpackage.akpk;
import defpackage.akpl;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.impl.VersionSafeCallbacks.d;

public final class CronetUploadDataStream extends akpl {
    static final String a = "CronetUploadDataStream";
    final d b;
    final CronetUrlRequest c;
    long d;
    long e;
    ByteBuffer f = null;
    final Object g = new Object();
    long h = 0;
    a i = a.NOT_IN_CALLBACK;
    private final Executor j;
    private long k;
    private final Runnable l = new Runnable() {
        private static /* synthetic */ boolean a = (CronetUploadDataStream.class.desiredAssertionStatus() ^ 1);

        /* JADX WARNING: Missing block: B:12:?, code skipped:
            r6.b.c.g();
     */
        /* JADX WARNING: Missing block: B:13:0x002e, code skipped:
            if (a != false) goto L_0x0041;
     */
        /* JADX WARNING: Missing block: B:15:0x0038, code skipped:
            if (r6.b.f.position() != 0) goto L_0x003b;
     */
        /* JADX WARNING: Missing block: B:18:0x0040, code skipped:
            throw new java.lang.AssertionError();
     */
        /* JADX WARNING: Missing block: B:19:0x0041, code skipped:
            r6.b.b.a(r6.b, r6.b.f);
     */
        /* JADX WARNING: Missing block: B:20:0x004e, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:21:0x004f, code skipped:
            r0 = move-exception;
     */
        /* JADX WARNING: Missing block: B:22:0x0050, code skipped:
            r6.b.a(r0);
     */
        /* JADX WARNING: Missing block: B:23:0x0055, code skipped:
            return;
     */
        public final void run() {
            /*
            r6 = this;
            r0 = org.chromium.net.impl.CronetUploadDataStream.this;
            r0 = r0.g;
            monitor-enter(r0);
            r1 = org.chromium.net.impl.CronetUploadDataStream.this;	 Catch:{ all -> 0x005e }
            r1 = r1.h;	 Catch:{ all -> 0x005e }
            r3 = 0;
            r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
            if (r5 != 0) goto L_0x0011;
        L_0x000f:
            monitor-exit(r0);	 Catch:{ all -> 0x005e }
            return;
        L_0x0011:
            r1 = org.chromium.net.impl.CronetUploadDataStream.this;	 Catch:{ all -> 0x005e }
            r2 = org.chromium.net.impl.CronetUploadDataStream.a.NOT_IN_CALLBACK;	 Catch:{ all -> 0x005e }
            r1.a(r2);	 Catch:{ all -> 0x005e }
            r1 = org.chromium.net.impl.CronetUploadDataStream.this;	 Catch:{ all -> 0x005e }
            r1 = r1.f;	 Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0056;
        L_0x001e:
            r1 = org.chromium.net.impl.CronetUploadDataStream.this;	 Catch:{ all -> 0x005e }
            r2 = org.chromium.net.impl.CronetUploadDataStream.a.READ;	 Catch:{ all -> 0x005e }
            r1.i = r2;	 Catch:{ all -> 0x005e }
            monitor-exit(r0);	 Catch:{ all -> 0x005e }
            r0 = org.chromium.net.impl.CronetUploadDataStream.this;	 Catch:{ Exception -> 0x004f }
            r0 = r0.c;	 Catch:{ Exception -> 0x004f }
            r0.g();	 Catch:{ Exception -> 0x004f }
            r0 = a;	 Catch:{ Exception -> 0x004f }
            if (r0 != 0) goto L_0x0041;
        L_0x0030:
            r0 = org.chromium.net.impl.CronetUploadDataStream.this;	 Catch:{ Exception -> 0x004f }
            r0 = r0.f;	 Catch:{ Exception -> 0x004f }
            r0 = r0.position();	 Catch:{ Exception -> 0x004f }
            if (r0 != 0) goto L_0x003b;
        L_0x003a:
            goto L_0x0041;
        L_0x003b:
            r0 = new java.lang.AssertionError;	 Catch:{ Exception -> 0x004f }
            r0.<init>();	 Catch:{ Exception -> 0x004f }
            throw r0;	 Catch:{ Exception -> 0x004f }
        L_0x0041:
            r0 = org.chromium.net.impl.CronetUploadDataStream.this;	 Catch:{ Exception -> 0x004f }
            r0 = r0.b;	 Catch:{ Exception -> 0x004f }
            r1 = org.chromium.net.impl.CronetUploadDataStream.this;	 Catch:{ Exception -> 0x004f }
            r2 = org.chromium.net.impl.CronetUploadDataStream.this;	 Catch:{ Exception -> 0x004f }
            r2 = r2.f;	 Catch:{ Exception -> 0x004f }
            r0.a(r1, r2);	 Catch:{ Exception -> 0x004f }
            return;
        L_0x004f:
            r0 = move-exception;
            r1 = org.chromium.net.impl.CronetUploadDataStream.this;
            r1.a(r0);
            return;
        L_0x0056:
            r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x005e }
            r2 = "Unexpected readData call. Buffer is null";
            r1.<init>(r2);	 Catch:{ all -> 0x005e }
            throw r1;	 Catch:{ all -> 0x005e }
        L_0x005e:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x005e }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUploadDataStream$AnonymousClass1.run():void");
        }
    };
    private boolean m = false;

    enum a {
        READ,
        REWIND,
        GET_LENGTH,
        NOT_IN_CALLBACK
    }

    public CronetUploadDataStream(akpk akpk, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.j = executor;
        this.b = new d(akpk);
        this.c = cronetUrlRequest;
    }

    private void c() {
        synchronized (this.g) {
            if (this.i == a.READ) {
                this.m = true;
            } else if (this.h == 0) {
            } else {
                nativeDestroy(this.h);
                this.h = 0;
                a(new Runnable() {
                    public final void run() {
                        try {
                            CronetUploadDataStream.this.c.g();
                            CronetUploadDataStream.this.b.close();
                        } catch (Exception e) {
                            akoo.c(CronetUploadDataStream.a, "Exception thrown when closing", e);
                        }
                    }
                });
            }
        }
    }

    private void d() {
        synchronized (this.g) {
            if (this.i != a.READ) {
                if (this.m) {
                    c();
                }
            } else {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            }
        }
    }

    private native long nativeCreateAdapterForTesting();

    private native long nativeCreateUploadDataStreamForTesting(long j, long j2);

    private static native void nativeDestroy(long j);

    private native void nativeOnReadSucceeded(long j, int i, boolean z);

    private native void nativeOnRewindSucceeded(long j);

    @SuppressLint({"DefaultLocale"})
    public final void a() {
        synchronized (this.g) {
            a(a.READ);
            if (this.k == ((long) this.f.limit())) {
                int position = this.f.position();
                this.e -= (long) position;
                if (this.e < 0) {
                    if (this.d >= 0) {
                        throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.d - this.e), Long.valueOf(this.d)}));
                    }
                }
                this.f.position(0);
                this.f = null;
                this.i = a.NOT_IN_CALLBACK;
                d();
                if (this.h == 0) {
                    return;
                }
                nativeOnReadSucceeded(this.h, position, false);
                return;
            }
            throw new IllegalStateException("ByteBuffer limit changed");
        }
    }

    public final void a(Exception exception) {
        synchronized (this.g) {
            a(a.READ);
            a((Throwable) exception);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Runnable runnable) {
        try {
            this.j.execute(runnable);
        } catch (Throwable th) {
            this.c.a(th);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Throwable th) {
        Object obj;
        synchronized (this.g) {
            if (this.i != a.NOT_IN_CALLBACK) {
                obj = this.i == a.GET_LENGTH ? 1 : null;
                this.i = a.NOT_IN_CALLBACK;
                this.f = null;
                d();
            } else {
                throw new IllegalStateException("There is no read or rewind or length check in progress.");
            }
        }
        if (obj != null) {
            try {
                this.b.close();
            } catch (Exception e) {
                akoo.c(a, "Failure closing data provider", e);
            }
        }
        this.c.a(th);
    }

    /* Access modifiers changed, original: final */
    public final void a(a aVar) {
        if (this.i != aVar) {
            StringBuilder stringBuilder = new StringBuilder("Expected ");
            stringBuilder.append(aVar);
            stringBuilder.append(", but was ");
            stringBuilder.append(this.i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void b() {
        synchronized (this.g) {
            a(a.REWIND);
            this.i = a.NOT_IN_CALLBACK;
            this.e = this.d;
            if (this.h == 0) {
                return;
            }
            nativeOnRewindSucceeded(this.h);
        }
    }

    public final void b(Exception exception) {
        synchronized (this.g) {
            a(a.REWIND);
            a((Throwable) exception);
        }
    }

    public final native long nativeAttachUploadDataToRequest(long j, long j2);

    /* Access modifiers changed, original: final */
    @CalledByNative
    public final void onUploadDataStreamDestroyed() {
        c();
    }

    /* Access modifiers changed, original: final */
    @CalledByNative
    public final void readData(ByteBuffer byteBuffer) {
        this.f = byteBuffer;
        this.k = (long) byteBuffer.limit();
        a(this.l);
    }

    /* Access modifiers changed, original: final */
    @CalledByNative
    public final void rewind() {
        a(new Runnable() {
            public final void run() {
                synchronized (CronetUploadDataStream.this.g) {
                    if (CronetUploadDataStream.this.h == 0) {
                        return;
                    }
                    CronetUploadDataStream.this.a(a.NOT_IN_CALLBACK);
                    CronetUploadDataStream.this.i = a.REWIND;
                    try {
                        CronetUploadDataStream.this.c.g();
                        CronetUploadDataStream.this.b.a(CronetUploadDataStream.this);
                    } catch (Exception e) {
                        CronetUploadDataStream.this.a(e);
                    }
                }
            }
        });
    }
}
