package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: admc */
public final class admc implements Closeable {
    private final ReentrantLock a;
    private final Condition b;
    private final Object c;
    private final HandlerThread d;
    private final Handler e;
    private final admf f;
    private final CountDownLatch g;
    private final admj h;
    private final CopyOnWriteArraySet<Long> i;
    private final kpc j;
    private final idd k;
    private adml l;
    private SurfaceTexture m;
    private Surface n;
    private FileDescriptor o;
    private kaz<jwj> p;
    private int q;
    private volatile int r;
    private volatile int s;
    private volatile String t;
    private int u;
    private long v;

    public admc(adhk adhk, adhi adhi, admj admj, FileDescriptor fileDescriptor, abtl abtl, idd idd, kpc kpc) {
        this(new admf(adhk, adhi), admj, new CopyOnWriteArraySet(), fileDescriptor, abtl, kpc, idd);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x00ce in {6, 7, 10, 13, 14, 20, 22} preds:[]
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
    private admc(defpackage.admf r3, defpackage.admj r4, java.util.concurrent.CopyOnWriteArraySet<java.lang.Long> r5, java.io.FileDescriptor r6, defpackage.abtl r7, defpackage.kpc r8, defpackage.idd r9) {
        /*
        r2 = this;
        r2.<init>();
        r0 = 0;
        r2.o = r0;
        r2.p = r0;
        r0 = 0;
        r2.r = r0;
        r2.s = r0;
        r2.u = r0;
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2.v = r0;
        r2.f = r3;
        r2.h = r4;
        r2.o = r6;
        r2.j = r8;
        r3 = "FrameFetcher";
        r4 = r9.a(r3);
        r2.k = r4;
        r2.i = r5;
        r4 = new android.os.HandlerThread;
        r4.<init>(r3);
        r2.d = r4;
        r3 = r2.d;
        r3.start();
        r3 = new android.os.Handler;
        r4 = r2.d;
        r4 = r4.getLooper();
        r3.<init>(r4);
        r2.e = r3;
        r3 = new java.util.concurrent.CountDownLatch;
        r4 = 1;
        r3.<init>(r4);
        r2.g = r3;
        r3 = new java.lang.Object;
        r3.<init>();
        r2.c = r3;
        r3 = new java.util.concurrent.locks.ReentrantLock;
        r3.<init>();
        r2.a = r3;
        r3 = r2.a;
        r3 = r3.newCondition();
        r2.b = r3;
        r3 = defpackage.admj.a(r6);
        r4 = 24;
        r4 = r3.extractMetadata(r4);
        r5 = 18;
        r5 = r3.extractMetadata(r5);
        r6 = 19;
        r6 = r3.extractMetadata(r6);
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x00c1 }
        r2.u = r4;	 Catch:{ NumberFormatException -> 0x00c1 }
        r4 = r2.u;	 Catch:{ NumberFormatException -> 0x00c1 }
        r8 = 90;	 Catch:{ NumberFormatException -> 0x00c1 }
        if (r4 == r8) goto L_0x0092;	 Catch:{ NumberFormatException -> 0x00c1 }
        r4 = r2.u;	 Catch:{ NumberFormatException -> 0x00c1 }
        r8 = 270; // 0x10e float:3.78E-43 double:1.334E-321;	 Catch:{ NumberFormatException -> 0x00c1 }
        if (r4 != r8) goto L_0x0085;	 Catch:{ NumberFormatException -> 0x00c1 }
        goto L_0x0092;	 Catch:{ NumberFormatException -> 0x00c1 }
        r4 = java.lang.Integer.parseInt(r5);	 Catch:{ NumberFormatException -> 0x00c1 }
        r2.r = r4;	 Catch:{ NumberFormatException -> 0x00c1 }
        r4 = java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x00c1 }
        r2.s = r4;	 Catch:{ NumberFormatException -> 0x00c1 }
        goto L_0x009d;	 Catch:{ NumberFormatException -> 0x00c1 }
        r4 = java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x00c1 }
        r2.r = r4;	 Catch:{ NumberFormatException -> 0x00c1 }
        r4 = java.lang.Integer.parseInt(r5);	 Catch:{ NumberFormatException -> 0x00c1 }
        goto L_0x008f;
        r3.release();
        if (r7 == 0) goto L_0x00be;
        r3 = r7.b();
        r4 = r7.c();
        r5 = r2.r;
        r6 = r2.s;
        r3 = defpackage.admo.a(r5, r6, r3, r4);
        r4 = r3.b();
        r2.r = r4;
        r3 = r3.c();
        r2.s = r3;
        return;
        r4 = move-exception;
        goto L_0x00ca;
        r4 = move-exception;
        r5 = new adkd;	 Catch:{ all -> 0x00bf }
        r6 = "parsing video rotation or height or weight failed";	 Catch:{ all -> 0x00bf }
        r5.<init>(r6, r4);	 Catch:{ all -> 0x00bf }
        throw r5;	 Catch:{ all -> 0x00bf }
        r3.release();
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.admc.<init>(admf, admj, java.util.concurrent.CopyOnWriteArraySet, java.io.FileDescriptor, abtl, kpc, idd):void");
    }

    private void a(AtomicBoolean atomicBoolean) {
        synchronized (this.c) {
            kaz.b(this.p);
            this.p = null;
        }
        b(atomicBoolean);
    }

    private void a(jwa jwa, long j, AtomicBoolean atomicBoolean) {
        SurfaceTexture surfaceTexture = this.m;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(new -$$Lambda$admc$7B8aTevOEeKD3_Pol7iBsZowH2o(this, j, atomicBoolean, jwa));
        }
        if (this.l == null) {
            a(atomicBoolean);
        }
        try {
            if (!this.l.a(j)) {
                a(atomicBoolean);
            }
        } catch (admd e) {
            a(atomicBoolean);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A:{Catch:{ adjw -> 0x004a }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0020 */
    /* JADX WARNING: Failed to process nested try/catch */
    private /* synthetic */ void b() {
        /*
        r4 = this;
        r0 = r4.l;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0.a();
    L_0x0007:
        r0 = r4.m;
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r0.release();
    L_0x000e:
        r0 = r4.n;
        if (r0 == 0) goto L_0x0015;
    L_0x0012:
        r0.release();
    L_0x0015:
        r0 = r4.q;	 Catch:{ adjw -> 0x0020 }
        r1 = 1;
        r2 = new int[r1];	 Catch:{ adjw -> 0x0020 }
        r3 = 0;
        r2[r3] = r0;	 Catch:{ adjw -> 0x0020 }
        android.opengl.GLES20.glDeleteTextures(r1, r2, r3);	 Catch:{ adjw -> 0x0020 }
    L_0x0020:
        r0 = r4.f;	 Catch:{ adjw -> 0x004a }
        r1 = r0.d;	 Catch:{ adjw -> 0x004a }
        r2 = android.opengl.EGL14.EGL_NO_DISPLAY;	 Catch:{ adjw -> 0x004a }
        if (r1 == r2) goto L_0x003e;
    L_0x0028:
        r1 = r0.d;	 Catch:{ adjw -> 0x004a }
        r2 = r0.f;	 Catch:{ adjw -> 0x004a }
        defpackage.adhi.b(r1, r2);	 Catch:{ adjw -> 0x004a }
        r1 = r0.d;	 Catch:{ adjw -> 0x004a }
        r2 = r0.e;	 Catch:{ adjw -> 0x004a }
        defpackage.adhi.a(r1, r2);	 Catch:{ adjw -> 0x004a }
        defpackage.adhi.c();	 Catch:{ adjw -> 0x004a }
        r1 = r0.d;	 Catch:{ adjw -> 0x004a }
        defpackage.adhi.b(r1);	 Catch:{ adjw -> 0x004a }
    L_0x003e:
        r1 = android.opengl.EGL14.EGL_NO_DISPLAY;	 Catch:{ adjw -> 0x004a }
        r0.d = r1;	 Catch:{ adjw -> 0x004a }
        r1 = android.opengl.EGL14.EGL_NO_CONTEXT;	 Catch:{ adjw -> 0x004a }
        r0.e = r1;	 Catch:{ adjw -> 0x004a }
        r1 = android.opengl.EGL14.EGL_NO_SURFACE;	 Catch:{ adjw -> 0x004a }
        r0.f = r1;	 Catch:{ adjw -> 0x004a }
    L_0x004a:
        r0 = r4.d;
        r0.quit();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.admc.b():void");
    }

    private void b(AtomicBoolean atomicBoolean) {
        if (!atomicBoolean.get()) {
            this.a.lock();
            try {
                atomicBoolean.set(true);
                this.b.signal();
            } finally {
                this.a.unlock();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x0197 in {12, 14, 17, 19, 21, 23, 25, 29, 30, 33, 35} preds:[]
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
    private /* synthetic */ void c() {
        /*
        r16 = this;
        r1 = r16;
        r0 = r1.f;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r2 = r1.u;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r3 = r1.r;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r4 = r1.s;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0.g = r3;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0.h = r4;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5 = defpackage.adhi.a();	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0.d = r5;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5 = r0.d;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6 = android.opengl.EGL14.EGL_NO_DISPLAY;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        if (r5 == r6) goto L_0x017d;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5 = 2;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6 = new int[r5];	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r7 = r0.d;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6 = defpackage.adhi.a(r7, r6, r6);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        if (r6 == 0) goto L_0x0172;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6 = 13;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6 = new int[r6];	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r7 = 12324; // 0x3024 float:1.727E-41 double:6.089E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r8 = 0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r8] = r7;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r7 = 8;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r9 = 1;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r9] = r7;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r10 = 12323; // 0x3023 float:1.7268E-41 double:6.0884E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r5] = r10;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r10 = 3;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r10] = r7;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r11 = 12322; // 0x3022 float:1.7267E-41 double:6.088E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r12 = 4;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r12] = r11;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r11 = 5;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r11] = r7;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r13 = 6;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r14 = 12321; // 0x3021 float:1.7265E-41 double:6.0874E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r13] = r14;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r13 = 7;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r13] = r7;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r13 = 12352; // 0x3040 float:1.7309E-41 double:6.1027E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r7] = r13;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r7 = 9;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r7] = r12;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r7 = 10;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r13 = 12339; // 0x3033 float:1.729E-41 double:6.0963E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r7] = r13;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r7 = 11;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r7] = r9;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r7 = 12;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r13 = 12344; // 0x3038 float:1.7298E-41 double:6.0987E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r7] = r13;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r7 = new android.opengl.EGLConfig[r9];	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r14 = new int[r9];	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r15 = r0.d;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6 = defpackage.adhi.a(r15, r6, r7, r14);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        if (r6 == 0) goto L_0x016a;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6 = new int[r10];	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r14 = 12440; // 0x3098 float:1.7432E-41 double:6.146E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r8] = r14;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r9] = r5;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r5] = r13;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r14 = r0.d;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r15 = r7[r8];	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r12 = android.opengl.EGL14.EGL_NO_CONTEXT;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6 = defpackage.adhi.a(r14, r15, r12, r6);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0.e = r6;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6 = r0.e;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        if (r6 == 0) goto L_0x0162;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6 = new int[r11];	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r11 = 12375; // 0x3057 float:1.7341E-41 double:6.114E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r8] = r11;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r11 = r0.g;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r9] = r11;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r11 = 12374; // 0x3056 float:1.734E-41 double:6.1136E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r5] = r11;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5 = r0.h;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r10] = r5;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5 = 4;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6[r5] = r13;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5 = r0.d;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r7 = r7[r8];	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5 = defpackage.adhi.a(r5, r7, r6);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0.f = r5;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5 = r0.f;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        if (r5 == 0) goto L_0x015a;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5 = r0.b;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6 = r0.d;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r7 = r0.f;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r10 = r0.f;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r11 = r0.e;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5.a(r6, r7, r10, r11);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5 = new admk;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6 = r0.a;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5.<init>(r6);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0.c = r5;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0 = r0.c;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r3 = defpackage.admf.a(r3);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r4 = defpackage.admf.a(r4);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5 = 16;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5 = new float[r5];	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.Matrix.setIdentityM(r5, r8);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r6 = 0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r7 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.Matrix.translateM(r5, r8, r7, r7, r6);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.Matrix.scaleM(r5, r8, r3, r4, r7);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.Matrix.translateM(r5, r8, r7, r7, r6);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r11 = 0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r12 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r13 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r14 = 0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r15 = 0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r10 = r5;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.Matrix.rotateM(r10, r11, r12, r13, r14, r15);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r11 = 0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r12 = (float) r2;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r13 = 0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r14 = 0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r15 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r10 = r5;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.Matrix.rotateM(r10, r11, r12, r13, r14, r15);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r2 = r0.b;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.Matrix.setIdentityM(r2, r8);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r10 = r0.b;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r11 = 0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r13 = 0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r14 = r0.b;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r15 = 0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r12 = r5;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.Matrix.multiplyMM(r10, r11, r12, r13, r14, r15);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0 = new int[r9];	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.GLES20.glGenTextures(r9, r0, r8);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0 = r0[r8];	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r2 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.GLES20.glBindTexture(r2, r0);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r3 = 10241; // 0x2801 float:1.435E-41 double:5.0597E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r4 = 1175977984; // 0x46180000 float:9728.0 double:5.81010322E-315;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.GLES20.glTexParameterf(r2, r3, r4);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r3 = 10240; // 0x2800 float:1.4349E-41 double:5.059E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r4 = 1175979008; // 0x46180400 float:9729.0 double:5.81010828E-315;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.GLES20.glTexParameterf(r2, r3, r4);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r3 = 10242; // 0x2802 float:1.4352E-41 double:5.06E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r4 = 33071; // 0x812f float:4.6342E-41 double:1.6339E-319;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.GLES20.glTexParameteri(r2, r3, r4);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r3 = 10243; // 0x2803 float:1.4354E-41 double:5.0607E-320;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        android.opengl.GLES20.glTexParameteri(r2, r3, r4);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r1.q = r0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0 = r1.q;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r2 = new android.graphics.SurfaceTexture;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r2.<init>(r0);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r1.m = r2;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0 = new android.view.Surface;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r2 = r1.m;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0.<init>(r2);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r1.n = r0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0 = r1.o;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r2 = r1.n;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r3 = r1.j;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r4 = r1.k;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5 = new adml;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5.<init>(r0, r2, r3, r4);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r5.b();	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r1.l = r5;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0 = r1.g;
        r0.countDown();
        return;
        r0 = new adjw;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r2 = "surface was null";	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0.<init>(r2);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        throw r0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0 = new adjw;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r2 = "null context";	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0.<init>(r2);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        throw r0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0 = new adjw;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r2 = "unable to find RGB888+recordable ES2 EGL config";	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0.<init>(r2);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        throw r0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r2 = 0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0.d = r2;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0 = new adjw;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r2 = "unable to initialize EGL14";	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0.<init>(r2);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        throw r0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0 = new adjw;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r2 = "eglGetdisplay failed";	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0.<init>(r2);	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        throw r0;	 Catch:{ adjw -> 0x0189, adkd -> 0x0187 }
        r0 = move-exception;
        goto L_0x0191;
        r0 = move-exception;
        goto L_0x018a;
        r0 = move-exception;
        r0 = r0.getMessage();	 Catch:{ all -> 0x0185 }
        r1.t = r0;	 Catch:{ all -> 0x0185 }
        goto L_0x0154;
        r2 = r1.g;
        r2.countDown();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.admc.c():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:43:0x00c0 in {8, 9, 14, 16, 17, 27, 29, 31, 36, 39, 42} preds:[]
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
    public final defpackage.kaz<defpackage.jwj> a(defpackage.jwa r13, long r14) {
        /*
        r12 = this;
        r0 = r12.i;
        r1 = java.lang.Long.valueOf(r14);
        r0.add(r1);
        r0 = new java.util.concurrent.atomic.AtomicBoolean;
        r1 = 0;
        r0.<init>(r1);
        r9 = new java.util.concurrent.atomic.AtomicReference;
        r9.<init>();
        r10 = r12.e;
        r11 = new -$$Lambda$admc$IMurSbLfvqehPtP_O6wgD077Nfk;
        r2 = r11;
        r3 = r12;
        r4 = r13;
        r5 = r14;
        r7 = r0;
        r8 = r9;
        r2.<init>(r3, r4, r5, r7, r8);
        r10.post(r11);
        r13 = r0.get();
        r2 = 1;
        if (r13 != 0) goto L_0x005b;
        r13 = r12.a;
        r13.lock();
        r13 = 0;
        r3 = r0.get();	 Catch:{ InterruptedException -> 0x004d }
        if (r3 != 0) goto L_0x0045;	 Catch:{ InterruptedException -> 0x004d }
        if (r13 != 0) goto L_0x0045;	 Catch:{ InterruptedException -> 0x004d }
        r3 = r12.b;	 Catch:{ InterruptedException -> 0x004d }
        r4 = r12.v;	 Catch:{ InterruptedException -> 0x004d }
        r6 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x004d }
        r13 = r3.await(r4, r6);	 Catch:{ InterruptedException -> 0x004d }
        r13 = r13 ^ r2;
        goto L_0x0031;
        r3 = r12.a;
        r3.unlock();
        goto L_0x005c;
        r13 = move-exception;
        goto L_0x0055;
    L_0x004d:
        r3 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x004b }
        r3.interrupt();	 Catch:{ all -> 0x004b }
        goto L_0x0045;
        r14 = r12.a;
        r14.unlock();
        throw r13;
        r13 = 0;
        r0.set(r2);
        r0 = r12.c;
        monitor-enter(r0);
        r3 = 0;
        r4 = r12.p;	 Catch:{ all -> 0x00ab }
        if (r4 != 0) goto L_0x008d;	 Catch:{ all -> 0x00ab }
        if (r13 != 0) goto L_0x0077;	 Catch:{ all -> 0x00ab }
        r13 = r9.get();	 Catch:{ all -> 0x00ab }
        if (r13 != 0) goto L_0x0070;	 Catch:{ all -> 0x00ab }
        goto L_0x008d;	 Catch:{ all -> 0x00ab }
        r13 = r9.get();	 Catch:{ all -> 0x00ab }
        r13 = (defpackage.admd) r13;	 Catch:{ all -> 0x00ab }
        throw r13;	 Catch:{ all -> 0x00ab }
        r13 = new java.util.concurrent.TimeoutException;	 Catch:{ all -> 0x00ab }
        r4 = "Timeout for %dms";	 Catch:{ all -> 0x00ab }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x00ab }
        r5 = r12.v;	 Catch:{ all -> 0x00ab }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x00ab }
        r2[r1] = r5;	 Catch:{ all -> 0x00ab }
        r1 = java.lang.String.format(r4, r2);	 Catch:{ all -> 0x00ab }
        r13.<init>(r1);	 Catch:{ all -> 0x00ab }
        throw r13;	 Catch:{ all -> 0x00ab }
        r13 = r12.p;	 Catch:{ all -> 0x00ab }
        r1 = r12.k;	 Catch:{ all -> 0x00ab }
        r1 = r1.toString();	 Catch:{ all -> 0x00ab }
        r13 = defpackage.kaz.a(r13, r1);	 Catch:{ all -> 0x00ab }
        r1 = r12.p;	 Catch:{ all -> 0x00bd }
        defpackage.kaz.b(r1);	 Catch:{ all -> 0x00bd }
        r12.p = r3;	 Catch:{ all -> 0x00bd }
        r1 = r12.i;	 Catch:{ all -> 0x00bd }
        r14 = java.lang.Long.valueOf(r14);	 Catch:{ all -> 0x00bd }
        r1.remove(r14);	 Catch:{ all -> 0x00bd }
        monitor-exit(r0);	 Catch:{ all -> 0x00bd }
        return r13;	 Catch:{ all -> 0x00bd }
        r13 = move-exception;	 Catch:{ all -> 0x00bd }
        r1 = r12.p;	 Catch:{ all -> 0x00bd }
        defpackage.kaz.b(r1);	 Catch:{ all -> 0x00bd }
        r12.p = r3;	 Catch:{ all -> 0x00bd }
        r1 = r12.i;	 Catch:{ all -> 0x00bd }
        r14 = java.lang.Long.valueOf(r14);	 Catch:{ all -> 0x00bd }
        r1.remove(r14);	 Catch:{ all -> 0x00bd }
        throw r13;	 Catch:{ all -> 0x00bd }
        r13 = move-exception;	 Catch:{ all -> 0x00bd }
        monitor-exit(r0);	 Catch:{ all -> 0x00bd }
        throw r13;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.admc.a(jwa, long):kaz");
    }

    public final void a() {
        this.e.post(new -$$Lambda$admc$egq9bEgOqRaKY8UP-WTuUmWUe6s(this));
        try {
            this.g.await(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            if (abss.a().c()) {
                throw new RuntimeException(e);
            }
        }
        if (this.l == null) {
            throw new adkd(String.format("FrameFetcher failed: %s", new Object[]{this.t}));
        }
    }

    public final void close() {
        synchronized (this.c) {
            kaz.b(this.p);
            this.p = null;
        }
        this.i.clear();
        this.e.post(new -$$Lambda$admc$v-mtbunni2jBqkTO6BGZIE2mCqI(this));
    }
}
