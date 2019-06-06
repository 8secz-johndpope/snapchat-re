package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: ri */
public abstract class ri<T> {
    private static final String b = pq.a("ConstraintTracker");
    protected final Context a;
    private final Object c = new Object();
    private final Set<qt<T>> d = new LinkedHashSet();
    private T e;

    ri(Context context) {
        this.a = context.getApplicationContext();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x003a in {9, 13, 15, 17, 20} preds:[]
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
    public final void a(T r4) {
        /*
        r3 = this;
        r0 = r3.c;
        monitor-enter(r0);
        r1 = r3.e;	 Catch:{ all -> 0x0037 }
        if (r1 == r4) goto L_0x0035;	 Catch:{ all -> 0x0037 }
        r1 = r3.e;	 Catch:{ all -> 0x0037 }
        if (r1 == 0) goto L_0x0014;	 Catch:{ all -> 0x0037 }
        r1 = r3.e;	 Catch:{ all -> 0x0037 }
        r1 = r1.equals(r4);	 Catch:{ all -> 0x0037 }
        if (r1 == 0) goto L_0x0014;	 Catch:{ all -> 0x0037 }
        goto L_0x0035;	 Catch:{ all -> 0x0037 }
        r3.e = r4;	 Catch:{ all -> 0x0037 }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0037 }
        r1 = r3.d;	 Catch:{ all -> 0x0037 }
        r4.<init>(r1);	 Catch:{ all -> 0x0037 }
        r4 = r4.iterator();	 Catch:{ all -> 0x0037 }
        r1 = r4.hasNext();	 Catch:{ all -> 0x0037 }
        if (r1 == 0) goto L_0x0033;	 Catch:{ all -> 0x0037 }
        r1 = r4.next();	 Catch:{ all -> 0x0037 }
        r1 = (defpackage.qt) r1;	 Catch:{ all -> 0x0037 }
        r2 = r3.e;	 Catch:{ all -> 0x0037 }
        r1.a(r2);	 Catch:{ all -> 0x0037 }
        goto L_0x0021;	 Catch:{ all -> 0x0037 }
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;	 Catch:{ all -> 0x0037 }
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;	 Catch:{ all -> 0x0037 }
        r4 = move-exception;	 Catch:{ all -> 0x0037 }
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri.a(java.lang.Object):void");
    }

    public final void a(qt<T> qtVar) {
        synchronized (this.c) {
            if (this.d.add(qtVar)) {
                if (this.d.size() == 1) {
                    this.e = b();
                    pq.a().a(b, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.e}), new Throwable[0]);
                    c();
                }
                qtVar.a(this.e);
            }
        }
    }

    public abstract T b();

    public final void b(qt<T> qtVar) {
        synchronized (this.c) {
            if (this.d.remove(qtVar) && this.d.isEmpty()) {
                d();
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
