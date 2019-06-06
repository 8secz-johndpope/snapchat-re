package defpackage;

import android.os.Handler;

/* renamed from: blr */
public final class blr {
    final b a;
    final bly b;
    int c;
    Object d;
    Handler e;
    int f;
    long g = -9223372036854775807L;
    boolean h = true;
    private final a i;
    private boolean j;
    private boolean k;
    private boolean l;

    /* renamed from: blr$b */
    public interface b {
        void a(int i, Object obj);
    }

    /* renamed from: blr$a */
    public interface a {
        void a(blr blr);
    }

    public blr(a aVar, b bVar, bly bly, int i, Handler handler) {
        this.i = aVar;
        this.a = bVar;
        this.b = bly;
        this.e = handler;
        this.f = i;
    }

    public final blr a() {
        byo.b(this.j ^ 1);
        if (this.g == -9223372036854775807L) {
            byo.a(this.h);
        }
        this.j = true;
        this.i.a(this);
        return this;
    }

    public final blr a(int i) {
        byo.b(this.j ^ 1);
        this.c = i;
        return this;
    }

    public final blr a(Object obj) {
        byo.b(this.j ^ 1);
        this.d = obj;
        return this;
    }

    public final synchronized void a(boolean z) {
        this.k = z | this.k;
        this.l = true;
        notifyAll();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x002b in {4, 5, 9, 12, 15} preds:[]
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
        r2 = this;
        monitor-enter(r2);
        r0 = r2.j;	 Catch:{ all -> 0x0028 }
        defpackage.byo.b(r0);	 Catch:{ all -> 0x0028 }
        r0 = r2.e;	 Catch:{ all -> 0x0028 }
        r0 = r0.getLooper();	 Catch:{ all -> 0x0028 }
        r0 = r0.getThread();	 Catch:{ all -> 0x0028 }
        r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0028 }
        if (r0 == r1) goto L_0x0018;	 Catch:{ all -> 0x0028 }
        r0 = 1;	 Catch:{ all -> 0x0028 }
        goto L_0x0019;	 Catch:{ all -> 0x0028 }
        r0 = 0;	 Catch:{ all -> 0x0028 }
        defpackage.byo.b(r0);	 Catch:{ all -> 0x0028 }
        r0 = r2.l;	 Catch:{ all -> 0x0028 }
        if (r0 != 0) goto L_0x0024;	 Catch:{ all -> 0x0028 }
        r2.wait();	 Catch:{ all -> 0x0028 }
        goto L_0x001c;	 Catch:{ all -> 0x0028 }
        r0 = r2.k;	 Catch:{ all -> 0x0028 }
        monitor-exit(r2);
        return r0;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blr.b():boolean");
    }
}
