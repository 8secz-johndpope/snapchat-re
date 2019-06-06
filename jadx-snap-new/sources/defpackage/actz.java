package defpackage;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: actz */
public final class actz {
    boolean a;
    Handler b;
    public final acuz c;
    final List<Runnable> d = new ArrayList();
    private HandlerThread e;
    private final Runnable f = new 2();

    /* renamed from: actz$2 */
    class 2 implements Runnable {
        2() {
        }

        public final void run() {
            actz.this.c.c();
        }
    }

    /* renamed from: actz$a */
    class a implements Runnable {
        private final EGLDisplay a;
        private final EGLConfig[] b;
        private final EGLContext c;
        private final Handler d;

        a(EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr, EGLContext eGLContext, Handler handler) {
            this.a = eGLDisplay;
            this.b = eGLConfigArr;
            this.c = eGLContext;
            this.d = handler;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0069 in {8, 11, 14, 15, 21, 24} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void run() {
            /*
            r6 = this;
            r0 = 9;
            r0 = new int[r0];
            r0 = {12375, 1, 12374, 1, 12417, 12380, 12416, 12380, 12344};
            r1 = r6.a;
            r2 = r6.b;
            r3 = 0;
            r2 = r2[r3];
            r0 = android.opengl.EGL14.eglCreatePbufferSurface(r1, r2, r0, r3);
            r1 = r6.a;
            r2 = r6.c;
            r1 = android.opengl.EGL14.eglMakeCurrent(r1, r0, r0, r2);
            if (r1 == 0) goto L_0x0056;
            r1 = defpackage.actz.this;
            monitor-enter(r1);
            r2 = defpackage.actz.this;	 Catch:{ all -> 0x0053 }
            r2 = r2.c;	 Catch:{ all -> 0x0053 }
            r4 = r6.a;	 Catch:{ all -> 0x0053 }
            r5 = r6.c;	 Catch:{ all -> 0x0053 }
            r2.a(r4, r5, r0);	 Catch:{ all -> 0x0053 }
            r0 = defpackage.actz.this;	 Catch:{ all -> 0x0053 }
            r0 = r0.d;	 Catch:{ all -> 0x0053 }
            r0 = r0.iterator();	 Catch:{ all -> 0x0053 }
            r2 = r0.hasNext();	 Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0044;	 Catch:{ all -> 0x0053 }
            r2 = r0.next();	 Catch:{ all -> 0x0053 }
            r2 = (java.lang.Runnable) r2;	 Catch:{ all -> 0x0053 }
            r4 = r6.d;	 Catch:{ all -> 0x0053 }
            r4.post(r2);	 Catch:{ all -> 0x0053 }
            goto L_0x0032;	 Catch:{ all -> 0x0053 }
            r0 = defpackage.actz.this;	 Catch:{ all -> 0x0053 }
            r0 = r0.d;	 Catch:{ all -> 0x0053 }
            r0.clear();	 Catch:{ all -> 0x0053 }
            r0 = defpackage.actz.this;	 Catch:{ all -> 0x0053 }
            r2 = r6.d;	 Catch:{ all -> 0x0053 }
            r0.b = r2;	 Catch:{ all -> 0x0053 }
            monitor-exit(r1);	 Catch:{ all -> 0x0053 }
            goto L_0x005d;	 Catch:{ all -> 0x0053 }
            r0 = move-exception;	 Catch:{ all -> 0x0053 }
            monitor-exit(r1);	 Catch:{ all -> 0x0053 }
            throw r0;
            r0 = new java.lang.RuntimeException;
            r1 = "Failed to create thread context.";
            r0.<init>(r1);
            r0 = defpackage.actz.this;
            monitor-enter(r0);
            r1 = defpackage.actz.this;	 Catch:{ all -> 0x0066 }
            r1.a = r3;	 Catch:{ all -> 0x0066 }
            monitor-exit(r0);	 Catch:{ all -> 0x0066 }
            return;	 Catch:{ all -> 0x0066 }
            r1 = move-exception;	 Catch:{ all -> 0x0066 }
            monitor-exit(r0);	 Catch:{ all -> 0x0066 }
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.actz$a.run():void");
        }
    }

    /* renamed from: actz$b */
    enum b {
        READY,
        DEAD,
        WRONG_THREAD,
        NOT_SWITCHED
    }

    public actz(acyj acyj, acuj acuj) {
        this.c = new acuz(acyj, acuj);
    }

    /* JADX WARNING: Missing block: B:40:0x011a, code skipped:
            return;
     */
    public final synchronized void a() {
        /*
        r18 = this;
        r7 = r18;
        monitor-enter(r18);
        r0 = r7.e;	 Catch:{ all -> 0x011b }
        if (r0 != 0) goto L_0x0015;
    L_0x0007:
        r0 = new android.os.HandlerThread;	 Catch:{ all -> 0x011b }
        r1 = "GLBackgroundThread";
        r0.<init>(r1);	 Catch:{ all -> 0x011b }
        r7.e = r0;	 Catch:{ all -> 0x011b }
        r0 = r7.e;	 Catch:{ all -> 0x011b }
        r0.start();	 Catch:{ all -> 0x011b }
    L_0x0015:
        r0 = r7.c;	 Catch:{ all -> 0x011b }
        r0 = r0.a();	 Catch:{ all -> 0x011b }
        if (r0 != 0) goto L_0x0119;
    L_0x001d:
        r0 = r7.a;	 Catch:{ all -> 0x011b }
        if (r0 == 0) goto L_0x0023;
    L_0x0021:
        goto L_0x0119;
    L_0x0023:
        r0 = 1;
        r7.a = r0;	 Catch:{ all -> 0x011b }
        r8 = new android.os.Handler;	 Catch:{ all -> 0x011b }
        r1 = r7.e;	 Catch:{ all -> 0x011b }
        r1 = r1.getLooper();	 Catch:{ all -> 0x011b }
        r8.<init>(r1);	 Catch:{ all -> 0x011b }
        r1 = android.opengl.EGL14.eglGetCurrentContext();	 Catch:{ all -> 0x011b }
        if (r1 == 0) goto L_0x0111;
    L_0x0037:
        r2 = 0;
        r3 = android.opengl.EGL14.eglGetDisplay(r2);	 Catch:{ all -> 0x011b }
        r4 = android.opengl.EGL14.EGL_NO_DISPLAY;	 Catch:{ all -> 0x011b }
        if (r3 == r4) goto L_0x0109;
    L_0x0040:
        r4 = 2;
        r5 = new int[r4];	 Catch:{ all -> 0x011b }
        r5 = android.opengl.EGL14.eglInitialize(r3, r5, r2, r5, r0);	 Catch:{ all -> 0x011b }
        if (r5 == 0) goto L_0x00f1;
    L_0x0049:
        r5 = 11;
        r10 = new int[r5];	 Catch:{ all -> 0x011b }
        r5 = 12324; // 0x3024 float:1.727E-41 double:6.089E-320;
        r10[r2] = r5;	 Catch:{ all -> 0x011b }
        r5 = 8;
        r10[r0] = r5;	 Catch:{ all -> 0x011b }
        r6 = 12323; // 0x3023 float:1.7268E-41 double:6.0884E-320;
        r10[r4] = r6;	 Catch:{ all -> 0x011b }
        r6 = 3;
        r10[r6] = r5;	 Catch:{ all -> 0x011b }
        r9 = 12322; // 0x3022 float:1.7267E-41 double:6.088E-320;
        r11 = 4;
        r10[r11] = r9;	 Catch:{ all -> 0x011b }
        r9 = 5;
        r10[r9] = r5;	 Catch:{ all -> 0x011b }
        r9 = 6;
        r12 = 12321; // 0x3021 float:1.7265E-41 double:6.0874E-320;
        r10[r9] = r12;	 Catch:{ all -> 0x011b }
        r9 = 7;
        r10[r9] = r5;	 Catch:{ all -> 0x011b }
        r9 = 12352; // 0x3040 float:1.7309E-41 double:6.1027E-320;
        r10[r5] = r9;	 Catch:{ all -> 0x011b }
        r5 = 9;
        r10[r5] = r11;	 Catch:{ all -> 0x011b }
        r5 = 10;
        r17 = 12344; // 0x3038 float:1.7298E-41 double:6.0987E-320;
        r10[r5] = r17;	 Catch:{ all -> 0x011b }
        r5 = new android.opengl.EGLConfig[r0];	 Catch:{ all -> 0x011b }
        r15 = new int[r0];	 Catch:{ all -> 0x011b }
        r11 = 0;
        r13 = 0;
        r14 = 1;
        r16 = 0;
        r9 = r3;
        r12 = r5;
        r9 = android.opengl.EGL14.eglChooseConfig(r9, r10, r11, r12, r13, r14, r15, r16);	 Catch:{ all -> 0x011b }
        if (r9 == 0) goto L_0x00d9;
    L_0x008b:
        r6 = new int[r6];	 Catch:{ all -> 0x011b }
        r9 = 12440; // 0x3098 float:1.7432E-41 double:6.146E-320;
        r6[r2] = r9;	 Catch:{ all -> 0x011b }
        r6[r0] = r4;	 Catch:{ all -> 0x011b }
        r6[r4] = r17;	 Catch:{ all -> 0x011b }
        r0 = r5[r2];	 Catch:{ all -> 0x011b }
        r0 = android.opengl.EGL14.eglCreateContext(r3, r0, r1, r6, r2);	 Catch:{ all -> 0x011b }
        r1 = android.opengl.EGL14.EGL_NO_CONTEXT;	 Catch:{ all -> 0x011b }
        if (r0 == r1) goto L_0x00a9;
    L_0x009f:
        r1 = r0.getNativeHandle();	 Catch:{ all -> 0x011b }
        r9 = 0;
        r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1));
        if (r4 != 0) goto L_0x00b1;
    L_0x00a9:
        r1 = android.opengl.EGL14.eglGetError();	 Catch:{ all -> 0x011b }
        r2 = 12293; // 0x3005 float:1.7226E-41 double:6.0735E-320;
        if (r1 == r2) goto L_0x00c1;
    L_0x00b1:
        r9 = new actz$a;	 Catch:{ all -> 0x011b }
        r1 = r9;
        r2 = r18;
        r4 = r5;
        r5 = r0;
        r6 = r8;
        r1.<init>(r3, r4, r5, r6);	 Catch:{ all -> 0x011b }
        r8.post(r9);	 Catch:{ all -> 0x011b }
        monitor-exit(r18);
        return;
    L_0x00c1:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x011b }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x011b }
        r2 = "Failed to create EGL Context: ";
        r1.<init>(r2);	 Catch:{ all -> 0x011b }
        r2 = android.opengl.EGL14.eglGetError();	 Catch:{ all -> 0x011b }
        r1.append(r2);	 Catch:{ all -> 0x011b }
        r1 = r1.toString();	 Catch:{ all -> 0x011b }
        r0.<init>(r1);	 Catch:{ all -> 0x011b }
        throw r0;	 Catch:{ all -> 0x011b }
    L_0x00d9:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x011b }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x011b }
        r2 = "unable to choose EGL config: ";
        r1.<init>(r2);	 Catch:{ all -> 0x011b }
        r2 = android.opengl.EGL14.eglGetError();	 Catch:{ all -> 0x011b }
        r1.append(r2);	 Catch:{ all -> 0x011b }
        r1 = r1.toString();	 Catch:{ all -> 0x011b }
        r0.<init>(r1);	 Catch:{ all -> 0x011b }
        throw r0;	 Catch:{ all -> 0x011b }
    L_0x00f1:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x011b }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x011b }
        r2 = "unable to initialize EGL: ";
        r1.<init>(r2);	 Catch:{ all -> 0x011b }
        r2 = android.opengl.EGL14.eglGetError();	 Catch:{ all -> 0x011b }
        r1.append(r2);	 Catch:{ all -> 0x011b }
        r1 = r1.toString();	 Catch:{ all -> 0x011b }
        r0.<init>(r1);	 Catch:{ all -> 0x011b }
        throw r0;	 Catch:{ all -> 0x011b }
    L_0x0109:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x011b }
        r1 = "unable to get EGL display";
        r0.<init>(r1);	 Catch:{ all -> 0x011b }
        throw r0;	 Catch:{ all -> 0x011b }
    L_0x0111:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x011b }
        r1 = "Existing GL Context is null, possibly on the wrong thread. ";
        r0.<init>(r1);	 Catch:{ all -> 0x011b }
        throw r0;	 Catch:{ all -> 0x011b }
    L_0x0119:
        monitor-exit(r18);
        return;
    L_0x011b:
        r0 = move-exception;
        monitor-exit(r18);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actz.a():void");
    }

    public final synchronized void a(final int i) {
        if (this.b != null) {
            this.b.post(new Runnable() {
                public final void run() {
                    actz.this.c.a(i);
                }
            });
        }
    }

    public final synchronized void a(Runnable runnable) {
        Handler handler = this.b;
        if (handler == null) {
            this.d.add(runnable);
        } else {
            handler.post(runnable);
        }
    }

    public final boolean a(kaz<jwj> kaz, String str, acus acus) {
        if (!this.c.a()) {
            return false;
        }
        kaz a = kaz.a("BackgroundGLThread");
        a(new acva(((jwj) a.a()).a(), str, new -$$Lambda$actz$smXMKlOj5RHV0j8J1fNz3oOaAw8(acus, a), this, this.c));
        return true;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized b b() {
        if (this.b == null) {
            return b.DEAD;
        } else if (Looper.myLooper() != this.b.getLooper()) {
            return b.WRONG_THREAD;
        } else if (this.c.a()) {
            return b.READY;
        } else {
            return b.NOT_SWITCHED;
        }
    }

    public final synchronized void b(Runnable runnable) {
        if (this.b != null) {
            this.b.removeCallbacks(null);
            runnable.run();
            this.b.post(this.f);
            this.b = null;
        }
        if (this.e != null) {
            this.e.quitSafely();
            this.e = null;
        }
    }
}
