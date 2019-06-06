package defpackage;

import android.media.audiofx.NoiseSuppressor;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: adls */
final class adls {
    final CountDownLatch A;
    private final AtomicInteger B;
    private Handler C;
    private NoiseSuppressor D = null;
    final ExecutorService a;
    final adjc b;
    final adjc c;
    final adfh d;
    final int e;
    String f;
    Surface g;
    adjj h;
    adlw i;
    adff j;
    adfo k;
    String l = "";
    boolean m = false;
    boolean n = false;
    boolean o = false;
    boolean p = false;
    volatile boolean q = false;
    boolean r = false;
    volatile long s = 0;
    Runnable t = null;
    Runnable u = null;
    Runnable v = null;
    adlv w = null;
    adlr x;
    a y = null;
    adlt z;

    /* renamed from: adls$1 */
    class 1 implements Runnable {
        1() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0052 in {5, 6, 8, 13, 14, 17, 19} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void run() {
            /*
            r13 = this;
            r0 = java.lang.Thread.currentThread();
            r1 = "VideoEncoderRunnable";
            r0.setName(r1);
            r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r0 = r0.q;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            if (r0 != 0) goto L_0x0025;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r0 = r0.i;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r0.ak_();	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r4 = defpackage.adls.this;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r4 = r4.i;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r4 = r4.d;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r0.s = r4;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            goto L_0x000d;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r8 = r4 - r2;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r10 = android.os.SystemClock.currentThreadTimeMillis();	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r6 = defpackage.adls.this;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r7 = 0;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r12 = r0.i;	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            defpackage.adls.a(r6, r7, r8, r10, r12);	 Catch:{ adkc -> 0x0048, Exception -> 0x0041 }
            r0 = defpackage.adls.this;
            r0.e();
            return;
            r0 = move-exception;
            goto L_0x004c;
            r0 = move-exception;
            r2 = defpackage.adls.this;	 Catch:{ all -> 0x003f }
            defpackage.adls.a(r2, r1, r0);	 Catch:{ all -> 0x003f }
            goto L_0x0039;	 Catch:{ all -> 0x003f }
            r0 = move-exception;	 Catch:{ all -> 0x003f }
            r2 = defpackage.adls.this;	 Catch:{ all -> 0x003f }
            goto L_0x0044;
            r1 = defpackage.adls.this;
            r1.e();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.adls$1.run():void");
        }
    }

    /* renamed from: adls$2 */
    class 2 implements Runnable {
        2() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:34:0x008b in {7, 15, 16, 17, 19, 20, 22, 27, 28, 31, 33} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void run() {
            /*
            r15 = this;
            r0 = java.lang.Thread.currentThread();
            r1 = "AudioEncoderRunnable";
            r0.setName(r1);
            r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = r0.q;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            if (r0 != 0) goto L_0x0021;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = r0.j;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            if (r0 == 0) goto L_0x000d;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = r0.j;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0.ak_();	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            goto L_0x000d;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = r0.j;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            if (r0 == 0) goto L_0x0072;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = r0.j;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r6 = r0.a;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            if (r6 == 0) goto L_0x003e;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = r0.a;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = r0.e();	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            if (r0 == 0) goto L_0x003c;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            goto L_0x003e;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = 0;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            goto L_0x003f;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = 1;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            if (r0 != 0) goto L_0x0049;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = r0.j;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0.ak_();	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            goto L_0x002b;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = r0.A;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0.countDown();	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r6 = r6 - r4;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = r0.w;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r6 = r6 / r4;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0.j = r6;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r8 = defpackage.adls.this;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r9 = 1;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r10 = r4 - r2;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r12 = android.os.SystemClock.currentThreadTimeMillis();	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r14 = r0.j;	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            defpackage.adls.a(r8, r9, r10, r12, r14);	 Catch:{ adkc -> 0x0081, Exception -> 0x007a }
            r0 = defpackage.adls.this;
            r0.e();
            return;
            r0 = move-exception;
            goto L_0x0085;
            r0 = move-exception;
            r2 = defpackage.adls.this;	 Catch:{ all -> 0x0078 }
            defpackage.adls.a(r2, r1, r0);	 Catch:{ all -> 0x0078 }
            goto L_0x0072;	 Catch:{ all -> 0x0078 }
            r0 = move-exception;	 Catch:{ all -> 0x0078 }
            r2 = defpackage.adls.this;	 Catch:{ all -> 0x0078 }
            goto L_0x007d;
            r1 = defpackage.adls.this;
            r1.e();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.adls$2.run():void");
        }
    }

    /* renamed from: adls$3 */
    class 3 implements Runnable {
        3() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:57:0x00ae in {7, 15, 16, 18, 19, 33, 45, 53, 55, 56} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void run() {
            /*
            r3 = this;
            r0 = java.lang.Thread.currentThread();
            r1 = "AudioRecorderRunnable";
            r0.setName(r1);
            r0 = defpackage.adls.this;
            r0 = r0.k;
            com.google.common.base.Preconditions.checkNotNull(r0);
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x006a, Exception -> 0x0049 }
            r0 = r0.q;	 Catch:{ adkc -> 0x006a, Exception -> 0x0049 }
            if (r0 != 0) goto L_0x0024;	 Catch:{ adkc -> 0x006a, Exception -> 0x0049 }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x006a, Exception -> 0x0049 }
            r0 = r0.k;	 Catch:{ adkc -> 0x006a, Exception -> 0x0049 }
            if (r0 == 0) goto L_0x0010;	 Catch:{ adkc -> 0x006a, Exception -> 0x0049 }
            r0 = defpackage.adls.this;	 Catch:{ adkc -> 0x006a, Exception -> 0x0049 }
            r0 = r0.k;	 Catch:{ adkc -> 0x006a, Exception -> 0x0049 }
            r0.ak_();	 Catch:{ adkc -> 0x006a, Exception -> 0x0049 }
            goto L_0x0010;
            r0 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.k;	 Catch:{ IllegalStateException -> 0x0041 }
            if (r0 == 0) goto L_0x0041;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.k;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.d();	 Catch:{ IllegalStateException -> 0x0041 }
            if (r0 != 0) goto L_0x0041;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.y;	 Catch:{ IllegalStateException -> 0x0041 }
            if (r0 == 0) goto L_0x0041;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.y;	 Catch:{ IllegalStateException -> 0x0041 }
            r0.a();	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = defpackage.adls.this;
            r0.e();
            return;
            r0 = move-exception;
            goto L_0x008b;
            r0 = move-exception;
            r2 = defpackage.adls.this;	 Catch:{ all -> 0x0047 }
            defpackage.adls.a(r2, r1, r0);	 Catch:{ all -> 0x0047 }
            r0 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.k;	 Catch:{ IllegalStateException -> 0x0041 }
            if (r0 == 0) goto L_0x0041;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.k;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.d();	 Catch:{ IllegalStateException -> 0x0041 }
            if (r0 != 0) goto L_0x0041;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.y;	 Catch:{ IllegalStateException -> 0x0041 }
            if (r0 == 0) goto L_0x0041;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.y;	 Catch:{ IllegalStateException -> 0x0041 }
            goto L_0x003e;
            r0 = move-exception;
            r2 = defpackage.adls.this;	 Catch:{ all -> 0x0047 }
            defpackage.adls.a(r2, r1, r0);	 Catch:{ all -> 0x0047 }
            r0 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.k;	 Catch:{ IllegalStateException -> 0x0041 }
            if (r0 == 0) goto L_0x0041;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.k;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.d();	 Catch:{ IllegalStateException -> 0x0041 }
            if (r0 != 0) goto L_0x0041;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.y;	 Catch:{ IllegalStateException -> 0x0041 }
            if (r0 == 0) goto L_0x0041;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x0041 }
            r0 = r0.y;	 Catch:{ IllegalStateException -> 0x0041 }
            goto L_0x003e;
            r1 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x00a8 }
            r1 = r1.k;	 Catch:{ IllegalStateException -> 0x00a8 }
            if (r1 == 0) goto L_0x00a8;	 Catch:{ IllegalStateException -> 0x00a8 }
            r1 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x00a8 }
            r1 = r1.k;	 Catch:{ IllegalStateException -> 0x00a8 }
            r1 = r1.d();	 Catch:{ IllegalStateException -> 0x00a8 }
            if (r1 != 0) goto L_0x00a8;	 Catch:{ IllegalStateException -> 0x00a8 }
            r1 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x00a8 }
            r1 = r1.y;	 Catch:{ IllegalStateException -> 0x00a8 }
            if (r1 == 0) goto L_0x00a8;	 Catch:{ IllegalStateException -> 0x00a8 }
            r1 = defpackage.adls.this;	 Catch:{ IllegalStateException -> 0x00a8 }
            r1 = r1.y;	 Catch:{ IllegalStateException -> 0x00a8 }
            r1.a();	 Catch:{ IllegalStateException -> 0x00a8 }
            r1 = defpackage.adls.this;
            r1.e();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.adls$3.run():void");
        }
    }

    /* renamed from: adls$4 */
    class 4 implements Runnable {
        4() {
        }

        public final void run() {
            if (adls.this.y != null) {
                adls.this.y.a(adls.this.l);
            }
        }
    }

    /* renamed from: adls$5 */
    class 5 implements Runnable {
        5() {
        }

        public final void run() {
            if (adls.this.z != null) {
                adls.this.z.a();
            }
        }
    }

    /* renamed from: adls$a */
    interface a {
        void a();

        void a(String str);
    }

    public adls(adjc adjc, adjc adjc2, adfh adfh, Handler handler, int i, boolean z) {
        this.b = adjc;
        this.c = adjc2;
        this.d = adfh;
        this.C = handler;
        this.e = i;
        int i2 = a() ? 3 : 1;
        this.B = new AtomicInteger(i2 + 1);
        this.a = Executors.newFixedThreadPool(i2);
        this.r = z;
        CountDownLatch countDownLatch = (!this.r || this.c == null) ? new CountDownLatch(0) : new CountDownLatch(1);
        this.A = countDownLatch;
        this.w = new adlv();
        this.x = new adlr();
    }

    static /* synthetic */ void a(adls adls, int i, long j, long j2, adjb adjb) {
        adlr adlr = adls.x;
        adlr.a(i);
        adlr.a[i] = j;
        adlr adlr2 = adls.x;
        adlr.a(i);
        adlr2.b[i] = j2;
        adlr2 = adls.x;
        int i2 = adjb.k;
        adlr.a(i);
        adlr2.c[i] = i2;
        adlr adlr3 = adls.x;
        int i3 = adjb.j;
        adlr.a(i);
        adlr3.d[i] = i3;
    }

    static /* synthetic */ void a(adls adls, String str, Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(adls.l);
        stringBuilder.append(str);
        stringBuilder.append(':');
        stringBuilder.append(Log.getStackTraceString(exception));
        adls.l = stringBuilder.toString();
        adls.C.post(new 4());
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.c != null;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (this.n && a() && NoiseSuppressor.isAvailable()) {
            adfo adfo = this.k;
            if (adfo != null) {
                this.D = NoiseSuppressor.create(adfo.a.f());
            }
            NoiseSuppressor noiseSuppressor = this.D;
            if (noiseSuppressor != null) {
                try {
                    if (noiseSuppressor.getEnabled() || this.D.setEnabled(true) == 0) {
                        this.o = true;
                    }
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    public final void c() {
        adlv adlv;
        adlw adlw = this.i;
        if (adlw != null) {
            adlw.e();
            this.w.i = this.i.d / 1000;
            adlv = this.w;
            adlw adlw2 = this.i;
            Preconditions.checkState(adlw2.n(), "getEncoderFrameMetrics() should be called after released");
            Preconditions.checkState(adlw2.f, "frame metrics not enabled");
            HashMap hashMap = new HashMap();
            hashMap.put("presentation_time", adlw2.g);
            hashMap.put("encoder_write_to_muxer", adlw2.h);
            hashMap.put("encoder_frame_finished_encoding_time", adlw2.i);
            adlv.l = hashMap;
        }
        adfo adfo = this.k;
        if (adfo != null) {
            adfo.e();
            this.w.f = this.k.c;
            this.w.g = this.k.d;
        }
        adff adff = this.j;
        if (adff != null) {
            this.w.h = adff.d / 1000;
            adlv = this.w;
            adff adff2 = this.j;
            adlv.k = (long) (adff2.a == null ? -1 : adff2.a.c);
        }
        adjj adjj = this.h;
        if (adjj != null) {
            try {
                adjj.e();
            } catch (IllegalStateException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.l);
                stringBuilder.append("Muxer releasing: ");
                stringBuilder.append(e);
                this.l = stringBuilder.toString();
            }
        }
        NoiseSuppressor noiseSuppressor = this.D;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
        }
        this.i = null;
        this.k = null;
        this.g = null;
        this.D = null;
        this.v = null;
        this.t = null;
        this.u = null;
        this.a.shutdown();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0048 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing block: B:29:0x004f, code skipped:
            r4 = r9.h.d();
     */
    /* JADX WARNING: Missing block: B:30:0x0057, code skipped:
            if ((r4 instanceof defpackage.adjk.a) != false) goto L_0x0059;
     */
    /* JADX WARNING: Missing block: B:31:0x0059, code skipped:
            r5 = r9.i;
     */
    /* JADX WARNING: Missing block: B:32:0x005b, code skipped:
            if (r5 == null) goto L_0x0065;
     */
    /* JADX WARNING: Missing block: B:35:0x0063, code skipped:
            r5 = null;
     */
    /* JADX WARNING: Missing block: B:36:0x0065, code skipped:
            r5 = 1;
     */
    /* JADX WARNING: Missing block: B:37:0x0066, code skipped:
            r6 = r9.j;
     */
    /* JADX WARNING: Missing block: B:41:0x0071, code skipped:
            r0 = 1;
     */
    /* JADX WARNING: Missing block: B:46:0x007c, code skipped:
            r0 = new defpackage.adjk.b(r4.a);
     */
    /* JADX WARNING: Missing block: B:47:0x0084, code skipped:
            r0 = r4;
     */
    /* JADX WARNING: Missing block: B:48:0x0085, code skipped:
            e();
     */
    /* JADX WARNING: Missing block: B:49:0x0088, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:50:0x0089, code skipped:
            r4 = r9.h.d();
     */
    /* JADX WARNING: Missing block: B:51:0x0091, code skipped:
            if ((r4 instanceof defpackage.adjk.a) != false) goto L_0x0093;
     */
    /* JADX WARNING: Missing block: B:52:0x0093, code skipped:
            r5 = r9.i;
     */
    /* JADX WARNING: Missing block: B:53:0x0095, code skipped:
            if (r5 == null) goto L_0x009f;
     */
    /* JADX WARNING: Missing block: B:56:0x009d, code skipped:
            r5 = null;
     */
    /* JADX WARNING: Missing block: B:57:0x009f, code skipped:
            r5 = 1;
     */
    /* JADX WARNING: Missing block: B:58:0x00a0, code skipped:
            r6 = r9.j;
     */
    /* JADX WARNING: Missing block: B:62:0x00ab, code skipped:
            r0 = 1;
     */
    /* JADX WARNING: Missing block: B:67:0x00b6, code skipped:
            r0 = new defpackage.adjk.b(r4.a);
     */
    /* JADX WARNING: Missing block: B:68:0x00be, code skipped:
            r0 = r4;
     */
    /* JADX WARNING: Missing block: B:69:0x00bf, code skipped:
            e();
     */
    /* JADX WARNING: Missing block: B:70:0x00c2, code skipped:
            return r0;
     */
    public final defpackage.adjk d() {
        /*
        r9 = this;
        r0 = 0;
        r1 = 0;
        r3 = 1;
        r4 = r9.r;	 Catch:{ InterruptedException -> 0x0048 }
        if (r4 == 0) goto L_0x000d;
    L_0x0008:
        r4 = r9.A;	 Catch:{ InterruptedException -> 0x0048 }
        r4.await();	 Catch:{ InterruptedException -> 0x0048 }
    L_0x000d:
        r4 = r9.h;
        r4 = r4.d();
        r5 = r4 instanceof defpackage.adjk.a;
        if (r5 == 0) goto L_0x0042;
    L_0x0017:
        r5 = r9.i;
        if (r5 == 0) goto L_0x0023;
    L_0x001b:
        r5 = r5.d;
        r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r7 == 0) goto L_0x0023;
    L_0x0021:
        r5 = 0;
        goto L_0x0024;
    L_0x0023:
        r5 = 1;
    L_0x0024:
        r6 = r9.j;
        if (r6 == 0) goto L_0x002f;
    L_0x0028:
        r6 = r6.d;
        r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r8 == 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0030;
    L_0x002f:
        r0 = 1;
    L_0x0030:
        if (r5 != 0) goto L_0x003a;
    L_0x0032:
        r1 = r9.a();
        if (r1 == 0) goto L_0x0042;
    L_0x0038:
        if (r0 == 0) goto L_0x0042;
    L_0x003a:
        r0 = new adjk$b;
        r1 = r4.a;
        r0.<init>(r1);
        goto L_0x0043;
    L_0x0042:
        r0 = r4;
    L_0x0043:
        r9.e();
        return r0;
    L_0x0047:
        goto L_0x0089;
    L_0x0048:
        r4 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0047 }
        r4.interrupt();	 Catch:{ all -> 0x0047 }
        r4 = r9.h;
        r4 = r4.d();
        r5 = r4 instanceof defpackage.adjk.a;
        if (r5 == 0) goto L_0x0084;
    L_0x0059:
        r5 = r9.i;
        if (r5 == 0) goto L_0x0065;
    L_0x005d:
        r5 = r5.d;
        r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r7 == 0) goto L_0x0065;
    L_0x0063:
        r5 = 0;
        goto L_0x0066;
    L_0x0065:
        r5 = 1;
    L_0x0066:
        r6 = r9.j;
        if (r6 == 0) goto L_0x0071;
    L_0x006a:
        r6 = r6.d;
        r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r8 == 0) goto L_0x0071;
    L_0x0070:
        goto L_0x0072;
    L_0x0071:
        r0 = 1;
    L_0x0072:
        if (r5 != 0) goto L_0x007c;
    L_0x0074:
        r1 = r9.a();
        if (r1 == 0) goto L_0x0084;
    L_0x007a:
        if (r0 == 0) goto L_0x0084;
    L_0x007c:
        r0 = new adjk$b;
        r1 = r4.a;
        r0.<init>(r1);
        goto L_0x0085;
    L_0x0084:
        r0 = r4;
    L_0x0085:
        r9.e();
        return r0;
    L_0x0089:
        r4 = r9.h;
        r4 = r4.d();
        r5 = r4 instanceof defpackage.adjk.a;
        if (r5 == 0) goto L_0x00be;
    L_0x0093:
        r5 = r9.i;
        if (r5 == 0) goto L_0x009f;
    L_0x0097:
        r5 = r5.d;
        r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r7 == 0) goto L_0x009f;
    L_0x009d:
        r5 = 0;
        goto L_0x00a0;
    L_0x009f:
        r5 = 1;
    L_0x00a0:
        r6 = r9.j;
        if (r6 == 0) goto L_0x00ab;
    L_0x00a4:
        r6 = r6.d;
        r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r8 == 0) goto L_0x00ab;
    L_0x00aa:
        goto L_0x00ac;
    L_0x00ab:
        r0 = 1;
    L_0x00ac:
        if (r5 != 0) goto L_0x00b6;
    L_0x00ae:
        r1 = r9.a();
        if (r1 == 0) goto L_0x00be;
    L_0x00b4:
        if (r0 == 0) goto L_0x00be;
    L_0x00b6:
        r0 = new adjk$b;
        r1 = r4.a;
        r0.<init>(r1);
        goto L_0x00bf;
    L_0x00be:
        r0 = r4;
    L_0x00bf:
        r9.e();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adls.d():adjk");
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        if (this.B.decrementAndGet() == 0) {
            this.C.post(new 5());
        }
    }
}
