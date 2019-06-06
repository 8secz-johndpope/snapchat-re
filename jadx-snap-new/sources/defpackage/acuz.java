package defpackage;

import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* renamed from: acuz */
public final class acuz {
    private final Queue<a> a = new ArrayDeque();
    private final List<a> b = new ArrayList();
    private final acyj c;
    private final acuj d;
    private EGLContext e;
    private EGLDisplay f;
    private EGLSurface g;

    /* renamed from: acuz$a */
    public static class a {
        public final int a;
        private boolean b = true;

        public a(int i) {
            this.a = i;
        }

        public final synchronized boolean a() {
            return this.b;
        }

        public final synchronized void b() {
            this.b = false;
        }
    }

    public acuz(acyj acyj, acuj acuj) {
        this.c = acyj;
        this.d = acuj;
    }

    public final synchronized void a(int i) {
        this.a.add(new a(i));
    }

    public final void a(Bitmap bitmap, int i, String str) {
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        acuj acuj = this.d;
        int byteCount = bitmap.getByteCount();
        synchronized (acuj.a) {
            acuj.a.put(i, byteCount);
            acuj.b.put(i, str);
        }
    }

    public final synchronized void a(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface) {
        this.f = eGLDisplay;
        this.e = eGLContext;
        this.g = eGLSurface;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x000d in {4, 6, 7, 10} preds:[]
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
    public final synchronized boolean a() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.e;	 Catch:{ all -> 0x000a }
        if (r0 == 0) goto L_0x0008;
        r0 = 1;
        monitor-exit(r1);
        return r0;
        r0 = 0;
        goto L_0x0006;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acuz.a():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x005c in {6, 14, 16, 19, 22} preds:[]
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
    public final synchronized boolean b() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.a;	 Catch:{ all -> 0x0059 }
        r0 = r0.size();	 Catch:{ all -> 0x0059 }
        r1 = 1;
        if (r1 >= r0) goto L_0x000c;
        monitor-exit(r6);
        return r1;
        r0 = r6.c;	 Catch:{ all -> 0x0059 }
        r0 = r0.a(r1);	 Catch:{ all -> 0x0059 }
        r2 = r0.a;	 Catch:{ all -> 0x0059 }
        android.opengl.GLES20.glGenTextures(r1, r2);	 Catch:{ all -> 0x0059 }
        r2 = 0;	 Catch:{ all -> 0x0059 }
        r3 = 0;	 Catch:{ all -> 0x0059 }
        if (r3 > 0) goto L_0x0052;	 Catch:{ all -> 0x0059 }
        r4 = r0.a;	 Catch:{ all -> 0x0059 }
        r4 = r4.get(r2);	 Catch:{ all -> 0x0059 }
        if (r4 > 0) goto L_0x0040;	 Catch:{ all -> 0x0059 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0059 }
        r1 = "Invalid texture handle generated, thread? ";	 Catch:{ all -> 0x0059 }
        r0.<init>(r1);	 Catch:{ all -> 0x0059 }
        r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0059 }
        r3 = r1.getId();	 Catch:{ all -> 0x0059 }
        r0.append(r3);	 Catch:{ all -> 0x0059 }
        r0 = r0.toString();	 Catch:{ all -> 0x0059 }
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0059 }
        r1.<init>(r0);	 Catch:{ all -> 0x0059 }
        monitor-exit(r6);
        return r2;
        r5 = new acuz$a;	 Catch:{ all -> 0x0059 }
        r5.<init>(r4);	 Catch:{ all -> 0x0059 }
        r4 = r6.b;	 Catch:{ all -> 0x0059 }
        r4.add(r5);	 Catch:{ all -> 0x0059 }
        r4 = r6.a;	 Catch:{ all -> 0x0059 }
        r4.add(r5);	 Catch:{ all -> 0x0059 }
        r3 = r3 + 1;	 Catch:{ all -> 0x0059 }
        goto L_0x0019;	 Catch:{ all -> 0x0059 }
        r2 = r6.c;	 Catch:{ all -> 0x0059 }
        r2.a(r0);	 Catch:{ all -> 0x0059 }
        monitor-exit(r6);
        return r1;
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acuz.b():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x0088 in {10, 14, 23, 26, 29} preds:[]
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
    public final synchronized void c() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.b;	 Catch:{ all -> 0x0085 }
        r0 = r0.size();	 Catch:{ all -> 0x0085 }
        r1 = r7.c;	 Catch:{ all -> 0x0085 }
        r1 = r1.a(r0);	 Catch:{ all -> 0x0085 }
        r2 = r7.b;	 Catch:{ all -> 0x0085 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0085 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x0085 }
        if (r3 == 0) goto L_0x003f;	 Catch:{ all -> 0x0085 }
        r3 = r2.next();	 Catch:{ all -> 0x0085 }
        r3 = (defpackage.acuz.a) r3;	 Catch:{ all -> 0x0085 }
        r3.b();	 Catch:{ all -> 0x0085 }
        r4 = r1.a;	 Catch:{ all -> 0x0085 }
        r5 = r3.a;	 Catch:{ all -> 0x0085 }
        r4.put(r5);	 Catch:{ all -> 0x0085 }
        r4 = r7.d;	 Catch:{ all -> 0x0085 }
        r3 = r3.a;	 Catch:{ all -> 0x0085 }
        r5 = r4.a;	 Catch:{ all -> 0x0085 }
        monitor-enter(r5);	 Catch:{ all -> 0x0085 }
        r6 = r4.a;	 Catch:{ all -> 0x003c }
        r6.delete(r3);	 Catch:{ all -> 0x003c }
        r4 = r4.b;	 Catch:{ all -> 0x003c }
        r4.remove(r3);	 Catch:{ all -> 0x003c }
        monitor-exit(r5);	 Catch:{ all -> 0x003c }
        goto L_0x0013;	 Catch:{ all -> 0x003c }
        r0 = move-exception;	 Catch:{ all -> 0x003c }
        monitor-exit(r5);	 Catch:{ all -> 0x003c }
        throw r0;	 Catch:{ all -> 0x0085 }
        r2 = r1.a;	 Catch:{ all -> 0x0085 }
        r3 = 0;	 Catch:{ all -> 0x0085 }
        r2.position(r3);	 Catch:{ all -> 0x0085 }
        r2 = r1.a;	 Catch:{ all -> 0x0085 }
        android.opengl.GLES20.glDeleteTextures(r0, r2);	 Catch:{ all -> 0x0085 }
        r0 = r7.b;	 Catch:{ all -> 0x0085 }
        r0.clear();	 Catch:{ all -> 0x0085 }
        r0 = r7.a;	 Catch:{ all -> 0x0085 }
        r0.clear();	 Catch:{ all -> 0x0085 }
        r0 = r7.c;	 Catch:{ all -> 0x0085 }
        r0.a(r1);	 Catch:{ all -> 0x0085 }
        r0 = r7.f;	 Catch:{ all -> 0x0085 }
        r1 = android.opengl.EGL14.EGL_NO_SURFACE;	 Catch:{ all -> 0x0085 }
        r2 = android.opengl.EGL14.EGL_NO_CONTEXT;	 Catch:{ all -> 0x0085 }
        android.opengl.EGL14.eglMakeCurrent(r0, r1, r1, r2);	 Catch:{ all -> 0x0085 }
        r0 = r7.e;	 Catch:{ all -> 0x0085 }
        if (r0 == 0) goto L_0x007f;	 Catch:{ all -> 0x0085 }
        r0 = r7.f;	 Catch:{ all -> 0x0085 }
        if (r0 == 0) goto L_0x007f;	 Catch:{ all -> 0x0085 }
        r0 = r7.g;	 Catch:{ all -> 0x0085 }
        if (r0 == 0) goto L_0x007f;	 Catch:{ all -> 0x0085 }
        r0 = r7.f;	 Catch:{ all -> 0x0085 }
        r1 = r7.e;	 Catch:{ all -> 0x0085 }
        r0 = android.opengl.EGL14.eglDestroyContext(r0, r1);	 Catch:{ all -> 0x0085 }
        if (r0 == 0) goto L_0x007f;	 Catch:{ all -> 0x0085 }
        r0 = r7.f;	 Catch:{ all -> 0x0085 }
        r1 = r7.g;	 Catch:{ all -> 0x0085 }
        android.opengl.EGL14.eglDestroySurface(r0, r1);	 Catch:{ all -> 0x0085 }
        r0 = 0;	 Catch:{ all -> 0x0085 }
        r7.a(r0, r0, r0);	 Catch:{ all -> 0x0085 }
        monitor-exit(r7);
        return;
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acuz.c():void");
    }

    public final synchronized a d() {
        return (a) this.a.poll();
    }
}
