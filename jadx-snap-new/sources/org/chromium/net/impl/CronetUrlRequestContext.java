package org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Process;
import android.util.Log;
import defpackage.akoo;
import defpackage.akop;
import defpackage.akpi;
import defpackage.akpm;
import defpackage.akpq;
import defpackage.akpr;
import defpackage.akqd;
import defpackage.akqg;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.UsedByReflection;
import org.chromium.net.impl.VersionSafeCallbacks.a;
import org.chromium.net.impl.VersionSafeCallbacks.b;
import org.chromium.net.impl.VersionSafeCallbacks.c;

@UsedByReflection
public class CronetUrlRequestContext extends akpq {
    static final String b = "CronetUrlRequestContext";
    private static final HashSet<String> t = new HashSet();
    final Object c = new Object();
    final AtomicInteger d = new AtomicInteger(0);
    long e = 0;
    private final ConditionVariable f = new ConditionVariable(false);
    private Thread g;
    private final boolean h;
    private final int i;
    private final Object j = new Object();
    private final Object k = new Object();
    private int l = 0;
    private int m;
    private int n;
    private int o;
    private final akop<a> p;
    private final akop<b> q;
    private final Map<akpi.a, c> r;
    private volatile ConditionVariable s;
    private final String u;
    private boolean v;

    /* renamed from: org.chromium.net.impl.CronetUrlRequestContext$4 */
    class AnonymousClass4 implements Runnable {
        private /* synthetic */ c a;
        private /* synthetic */ akpi b;

        AnonymousClass4(c cVar, akpi akpi) {
            this.a = cVar;
            this.b = akpi;
        }

        public final void run() {
            this.a.a(this.b);
        }
    }

    /* renamed from: org.chromium.net.impl.CronetUrlRequestContext$2 */
    class AnonymousClass2 implements Runnable {
        private /* synthetic */ a a;
        private /* synthetic */ int b;
        private /* synthetic */ long c;
        private /* synthetic */ int d;

        AnonymousClass2(a aVar, int i, long j, int i2) {
            this.a = aVar;
            this.b = i;
            this.c = j;
            this.d = i2;
        }

        public final void run() {
        }
    }

    /* renamed from: org.chromium.net.impl.CronetUrlRequestContext$3 */
    class AnonymousClass3 implements Runnable {
        private /* synthetic */ b a;
        private /* synthetic */ int b;
        private /* synthetic */ long c;
        private /* synthetic */ int d;

        AnonymousClass3(b bVar, int i, long j, int i2) {
            this.a = bVar;
            this.b = i;
            this.c = j;
            this.d = i2;
        }

        public final void run() {
        }
    }

    @UsedByReflection
    public CronetUrlRequestContext(akpr akpr) {
        int i = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = new akop();
        this.q = new akop();
        this.r = new HashMap();
        this.h = false;
        this.i = akpr.a(10);
        CronetLibraryLoader.a(akpr.a);
        if (Log.isLoggable(b, 2)) {
            i = -2;
        } else if (!Log.isLoggable(b, 3)) {
            i = 3;
        }
        nativeSetMinLogLevel(i);
        if (akpr.k == 1) {
            this.u = akpr.f;
            synchronized (t) {
                if (t.add(this.u)) {
                } else {
                    throw new IllegalStateException("Disk cache storage path already in use");
                }
            }
        }
        this.u = null;
        synchronized (this.c) {
            this.e = nativeCreateRequestContextAdapter(a(akpr));
            if (this.e != 0) {
            } else {
                throw new NullPointerException("Context Adapter creation failed.");
            }
        }
        CronetLibraryLoader.a(new Runnable() {
            public final void run() {
                CronetLibraryLoader.a();
                synchronized (CronetUrlRequestContext.this.c) {
                    CronetUrlRequestContext.this.nativeInitRequestContextOnInitThread(CronetUrlRequestContext.this.e);
                }
            }
        });
    }

    private static long a(akpr akpr) {
        String stringBuilder;
        akpr akpr2 = akpr;
        String str = akpr2.e;
        String str2 = akpr2.f;
        boolean z = akpr2.g;
        if (akpr2.g) {
            Context context = akpr2.a;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(context.getPackageName());
            akqg.a(stringBuilder2);
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        long nativeCreateRequestContextConfig = nativeCreateRequestContextConfig(str, str2, z, stringBuilder, akpr2.h, akpr2.i, akpr2.j, akpr2.k, akpr2.l, akpr2.m, 0, false, akpr2.d);
        for (akpr.b bVar : akpr2.b) {
            nativeAddQuicHint(nativeCreateRequestContextConfig, bVar.a, bVar.b, bVar.c);
        }
        for (akpr.a aVar : akpr2.c) {
            stringBuilder = aVar.a;
            byte[][] bArr = aVar.b;
            nativeAddPkp(nativeCreateRequestContextConfig, stringBuilder, bArr, aVar.c, aVar.d.getTime());
        }
        return nativeCreateRequestContextConfig;
    }

    private static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            akoo.c(b, "Exception posting task to executor", e);
        }
    }

    private void e() {
        if (!f()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private boolean f() {
        return this.e != 0;
    }

    @CalledByNative
    private void initNetworkThread() {
        this.g = Thread.currentThread();
        this.f.open();
        Thread.currentThread().setName("ChromiumNet");
        Process.setThreadPriority(this.i);
    }

    private static native void nativeAddPkp(long j, String str, byte[][] bArr, boolean z, long j2);

    private static native void nativeAddQuicHint(long j, String str, int i, int i2);

    private native void nativeConfigureNetworkQualityEstimatorForTesting(long j, boolean z, boolean z2, boolean z3);

    private static native long nativeCreateRequestContextAdapter(long j);

    private static native long nativeCreateRequestContextConfig(String str, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4, int i, long j, String str4, long j2, boolean z5, boolean z6);

    private native void nativeDestroy(long j);

    private static native byte[] nativeGetHistogramDeltas();

    private native void nativeProvideRTTObservations(long j, boolean z);

    private native void nativeProvideThroughputObservations(long j, boolean z);

    private static native int nativeSetMinLogLevel(int i);

    private native void nativeStartNetLogToDisk(long j, String str, boolean z, int i);

    private native boolean nativeStartNetLogToFile(long j, String str, boolean z);

    private native void nativeStopNetLog(long j);

    @CalledByNative
    private void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.j) {
            this.l = i;
        }
    }

    @CalledByNative
    private void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        synchronized (this.j) {
            this.m = i;
            this.n = i2;
            this.o = i3;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x002f in {6, 8, 11} preds:[]
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
    @org.chromium.base.annotations.CalledByNative
    private void onRttObservation(int r12, long r13, int r15) {
        /*
        r11 = this;
        r0 = r11.j;
        monitor-enter(r0);
        r1 = r11.p;	 Catch:{ all -> 0x002c }
        r1 = r1.iterator();	 Catch:{ all -> 0x002c }
        r2 = r1.hasNext();	 Catch:{ all -> 0x002c }
        if (r2 == 0) goto L_0x002a;	 Catch:{ all -> 0x002c }
        r2 = r1.next();	 Catch:{ all -> 0x002c }
        r2 = (org.chromium.net.impl.VersionSafeCallbacks.a) r2;	 Catch:{ all -> 0x002c }
        r10 = new org.chromium.net.impl.CronetUrlRequestContext$2;	 Catch:{ all -> 0x002c }
        r3 = r10;	 Catch:{ all -> 0x002c }
        r4 = r11;	 Catch:{ all -> 0x002c }
        r5 = r2;	 Catch:{ all -> 0x002c }
        r6 = r12;	 Catch:{ all -> 0x002c }
        r7 = r13;	 Catch:{ all -> 0x002c }
        r9 = r15;	 Catch:{ all -> 0x002c }
        r3.<init>(r5, r6, r7, r9);	 Catch:{ all -> 0x002c }
        r2 = r2.a;	 Catch:{ all -> 0x002c }
        r2 = r2.a();	 Catch:{ all -> 0x002c }
        a(r2, r10);	 Catch:{ all -> 0x002c }
        goto L_0x0009;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        return;	 Catch:{ all -> 0x002c }
        r12 = move-exception;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequestContext.onRttObservation(int, long, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x002f in {6, 8, 11} preds:[]
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
    @org.chromium.base.annotations.CalledByNative
    private void onThroughputObservation(int r12, long r13, int r15) {
        /*
        r11 = this;
        r0 = r11.j;
        monitor-enter(r0);
        r1 = r11.q;	 Catch:{ all -> 0x002c }
        r1 = r1.iterator();	 Catch:{ all -> 0x002c }
        r2 = r1.hasNext();	 Catch:{ all -> 0x002c }
        if (r2 == 0) goto L_0x002a;	 Catch:{ all -> 0x002c }
        r2 = r1.next();	 Catch:{ all -> 0x002c }
        r2 = (org.chromium.net.impl.VersionSafeCallbacks.b) r2;	 Catch:{ all -> 0x002c }
        r10 = new org.chromium.net.impl.CronetUrlRequestContext$3;	 Catch:{ all -> 0x002c }
        r3 = r10;	 Catch:{ all -> 0x002c }
        r4 = r11;	 Catch:{ all -> 0x002c }
        r5 = r2;	 Catch:{ all -> 0x002c }
        r6 = r12;	 Catch:{ all -> 0x002c }
        r7 = r13;	 Catch:{ all -> 0x002c }
        r9 = r15;	 Catch:{ all -> 0x002c }
        r3.<init>(r5, r6, r7, r9);	 Catch:{ all -> 0x002c }
        r2 = r2.a;	 Catch:{ all -> 0x002c }
        r2 = r2.a();	 Catch:{ all -> 0x002c }
        a(r2, r10);	 Catch:{ all -> 0x002c }
        goto L_0x0009;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        return;	 Catch:{ all -> 0x002c }
        r12 = move-exception;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequestContext.onThroughputObservation(int, long, int):void");
    }

    public final akqd a(String str, akpm.b bVar, Executor executor, int i, Collection<Object> collection) {
        Throwable th;
        Object obj = this.c;
        synchronized (obj) {
            Object obj2;
            try {
                e();
                CronetUrlRequest cronetUrlRequest = cronetUrlRequest;
                obj2 = obj;
                cronetUrlRequest = new CronetUrlRequest(this, str, i, bVar, executor, collection, false, false, false, false, 0, false, 0, null);
                return cronetUrlRequest;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void a() {
        synchronized (this.c) {
            if (this.v) {
                e();
                this.s = new ConditionVariable();
                nativeStopNetLog(this.e);
                this.v = false;
                this.s.block();
                return;
            }
        }
    }

    public final void a(akpi.a aVar) {
        synchronized (this.k) {
            this.r.put(aVar, new c(aVar));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x003c in {6, 12, 13, 17} preds:[]
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
    final void a(defpackage.akpi r4) {
        /*
        r3 = this;
        r0 = r3.k;
        monitor-enter(r0);
        r1 = r3.r;	 Catch:{ all -> 0x0039 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0039 }
        if (r1 == 0) goto L_0x000d;	 Catch:{ all -> 0x0039 }
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        return;	 Catch:{ all -> 0x0039 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0039 }
        r2 = r3.r;	 Catch:{ all -> 0x0039 }
        r2 = r2.values();	 Catch:{ all -> 0x0039 }
        r1.<init>(r2);	 Catch:{ all -> 0x0039 }
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        r0 = r1.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0038;
        r1 = r0.next();
        r1 = (org.chromium.net.impl.VersionSafeCallbacks.c) r1;
        r2 = new org.chromium.net.impl.CronetUrlRequestContext$4;
        r2.<init>(r1, r4);
        r1 = r1.a;
        r1 = r1.a();
        a(r1, r2);
        goto L_0x001d;
        return;
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequestContext.a(akpi):void");
    }

    public final void a(String str, int i) {
        synchronized (this.c) {
            e();
            nativeStartNetLogToDisk(this.e, str, false, i);
            this.v = true;
        }
    }

    public final boolean a(Thread thread) {
        return thread == this.g;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        boolean z;
        synchronized (this.k) {
            z = !this.r.isEmpty();
        }
        return z;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        this.d.decrementAndGet();
    }

    public final long d() {
        long j;
        synchronized (this.c) {
            e();
            j = this.e;
        }
        return j;
    }

    public native void nativeInitRequestContextOnInitThread(long j);

    @CalledByNative
    public void stopNetLogCompleted() {
        this.s.open();
    }
}
