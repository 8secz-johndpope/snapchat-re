package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: adce */
public final class adce {
    public adaz a = new adat();
    private final String b;
    private final List<Runnable> c = new ArrayList();
    private boolean d = true;
    private Handler e;

    public adce(ide ide) {
        akcr.b(ide, "attributedFeature");
        StringBuilder stringBuilder = new StringBuilder("QueuedHandlerThread_");
        stringBuilder.append(ide.getName());
        this.b = stringBuilder.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0044 in {10, 11, 12, 14, 17} preds:[]
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
    private final synchronized void a(android.os.Handler r10) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.c;	 Catch:{ all -> 0x0041 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0041 }
        if (r0 != 0) goto L_0x003f;	 Catch:{ all -> 0x0041 }
        if (r10 == 0) goto L_0x003f;	 Catch:{ all -> 0x0041 }
        r0 = r9.c;	 Catch:{ all -> 0x0041 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0041 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0041 }
        if (r1 == 0) goto L_0x003a;	 Catch:{ all -> 0x0041 }
        r1 = r0.next();	 Catch:{ all -> 0x0041 }
        r1 = (java.lang.Runnable) r1;	 Catch:{ all -> 0x0041 }
        r2 = r1 instanceof defpackage.adau;	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x0036;	 Catch:{ all -> 0x0041 }
        r2 = r1;	 Catch:{ all -> 0x0041 }
        r2 = (defpackage.adau) r2;	 Catch:{ all -> 0x0041 }
        r2 = r2.b;	 Catch:{ all -> 0x0041 }
        r1 = (defpackage.adau) r1;	 Catch:{ all -> 0x0041 }
        r3 = r1.c;	 Catch:{ all -> 0x0041 }
        r5 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0041 }
        r7 = r1.a;	 Catch:{ all -> 0x0041 }
        r5 = r5 - r7;	 Catch:{ all -> 0x0041 }
        r3 = r3 - r5;	 Catch:{ all -> 0x0041 }
        r10.postDelayed(r2, r3);	 Catch:{ all -> 0x0041 }
        goto L_0x0011;	 Catch:{ all -> 0x0041 }
        r10.post(r1);	 Catch:{ all -> 0x0041 }
        goto L_0x0011;	 Catch:{ all -> 0x0041 }
        r10 = r9.c;	 Catch:{ all -> 0x0041 }
        r10.clear();	 Catch:{ all -> 0x0041 }
        monitor-exit(r9);
        return;
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adce.a(android.os.Handler):void");
    }

    public final synchronized void a() {
        Handler a = this.a.a(this.b);
        if (a != null) {
            if (this.d) {
                a(a);
            }
            this.e = a;
        }
    }

    public final synchronized void a(Runnable runnable) {
        akcr.b(runnable, "runnable");
        Handler handler = this.e;
        if (handler == null || !this.d) {
            this.c.add(runnable);
        } else {
            handler.post(runnable);
        }
    }

    public final synchronized void a(Runnable runnable, long j) {
        akcr.b(runnable, "runnable");
        Handler handler = this.e;
        if (handler == null || !this.d) {
            this.c.add(new adau(runnable, j));
        } else {
            handler.postDelayed(runnable, j);
        }
    }

    public final synchronized void a(boolean z) {
        this.d = z;
    }

    public final void b() {
        if (this.d) {
            a(this.e);
        }
    }
}
