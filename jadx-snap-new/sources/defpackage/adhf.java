package defpackage;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.view.Surface;
import com.google.common.base.Preconditions;

/* renamed from: adhf */
public final class adhf implements OnFrameAvailableListener {
    public adiv a;
    public final boolean b;
    public SurfaceTexture c;
    public Surface d;
    public volatile int e;
    private adhk f;
    private final Object g;
    private int h;

    public adhf(boolean z) {
        this(z, adhk.a);
    }

    private adhf(boolean z, adhk adhk) {
        this.g = new Object();
        this.h = 0;
        this.b = z;
        this.f = adhk;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.e = iArr[0];
        GLES20.glBindTexture(36197, this.e);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        this.c = new SurfaceTexture(this.e);
        this.c.setOnFrameAvailableListener(this);
        this.d = new Surface(this.c);
    }

    public final void a() {
        this.d.release();
        b();
        this.d = null;
        this.c = null;
    }

    public final void a(adiv adiv) {
        this.a = (adiv) Preconditions.checkNotNull(adiv);
    }

    public final void b() {
        GLES20.glDeleteTextures(1, new int[]{this.e}, 0);
        this.e = -1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x003e in {11, 14, 21, 24, 27, 31} preds:[]
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
    public final boolean c() {
        /*
        r5 = this;
        r0 = r5.g;
        monitor-enter(r0);
        r1 = r5.h;	 Catch:{ all -> 0x003b }
        r2 = 0;
        if (r1 != 0) goto L_0x0023;
        r1 = r5.g;	 Catch:{ InterruptedException -> 0x0015 }
        r3 = 100;	 Catch:{ InterruptedException -> 0x0015 }
        r1.wait(r3);	 Catch:{ InterruptedException -> 0x0015 }
        r1 = r5.h;	 Catch:{ InterruptedException -> 0x0015 }
        if (r1 != 0) goto L_0x0003;
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        return r2;	 Catch:{ all -> 0x003b }
        r1 = move-exception;	 Catch:{ all -> 0x003b }
        r2 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x003b }
        r2.interrupt();	 Catch:{ all -> 0x003b }
        r2 = new adkc;	 Catch:{ all -> 0x003b }
        r2.<init>(r1);	 Catch:{ all -> 0x003b }
        throw r2;	 Catch:{ all -> 0x003b }
        r1 = r5.h;	 Catch:{ all -> 0x003b }
        r5.h = r2;	 Catch:{ all -> 0x003b }
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        r3 = defpackage.adhj.a;
        monitor-enter(r3);
        if (r2 >= r1) goto L_0x0035;
        r0 = r5.c;	 Catch:{ all -> 0x0038 }
        r0.updateTexImage();	 Catch:{ all -> 0x0038 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0038 }
        goto L_0x002b;	 Catch:{ all -> 0x0038 }
        monitor-exit(r3);	 Catch:{ all -> 0x0038 }
        r0 = 1;	 Catch:{ all -> 0x0038 }
        return r0;	 Catch:{ all -> 0x0038 }
        r0 = move-exception;	 Catch:{ all -> 0x0038 }
        monitor-exit(r3);	 Catch:{ all -> 0x0038 }
        throw r0;
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adhf.c():boolean");
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.g) {
            this.h++;
            this.g.notifyAll();
        }
    }
}
