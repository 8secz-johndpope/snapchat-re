package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cmd */
public final class cmd implements cjo {
    private final List<ajej> a = new ArrayList();
    private final ajei b;

    public cmd(gpu gpu) {
        akcr.b(gpu, "userSession");
        ajei ajei = new ajei();
        gpu.a.a((ajej) ajei);
        this.b = ajei;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0027 in {8, 10, 13} preds:[]
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
    public final void a() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.a;	 Catch:{ all -> 0x0024 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0024 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0024 }
        if (r1 == 0) goto L_0x0022;	 Catch:{ all -> 0x0024 }
        r1 = r0.next();	 Catch:{ all -> 0x0024 }
        r1 = (defpackage.ajej) r1;	 Catch:{ all -> 0x0024 }
        r2 = r1.isDisposed();	 Catch:{ all -> 0x0024 }
        if (r2 == 0) goto L_0x0007;	 Catch:{ all -> 0x0024 }
        r2 = r3.b;	 Catch:{ all -> 0x0024 }
        r2.c(r1);	 Catch:{ all -> 0x0024 }
        r0.remove();	 Catch:{ all -> 0x0024 }
        goto L_0x0007;
        monitor-exit(r3);
        return;
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmd.a():void");
    }

    public final void a(ajej ajej) {
        akcr.b(ajej, "disposable");
        synchronized (this) {
            if (!ajej.isDisposed()) {
                this.a.add(ajej);
                this.b.a(ajej);
            }
        }
    }
}
