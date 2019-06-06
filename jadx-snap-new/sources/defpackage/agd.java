package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agd */
public final class agd {
    private final List<a<?>> a = new ArrayList();

    /* renamed from: agd$a */
    static final class a<T> {
        final Class<T> a;
        final zh<T> b;

        a(Class<T> cls, zh<T> zhVar) {
            this.a = cls;
            this.b = zhVar;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0027 in {9, 10, 13, 16} preds:[]
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
    public final synchronized <Z> defpackage.zh<Z> a(java.lang.Class<Z> r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = 0;
        r1 = r4.a;	 Catch:{ all -> 0x0024 }
        r1 = r1.size();	 Catch:{ all -> 0x0024 }
        if (r0 >= r1) goto L_0x0021;	 Catch:{ all -> 0x0024 }
        r2 = r4.a;	 Catch:{ all -> 0x0024 }
        r2 = r2.get(r0);	 Catch:{ all -> 0x0024 }
        r2 = (defpackage.agd.a) r2;	 Catch:{ all -> 0x0024 }
        r3 = r2.a;	 Catch:{ all -> 0x0024 }
        r3 = r3.isAssignableFrom(r5);	 Catch:{ all -> 0x0024 }
        if (r3 == 0) goto L_0x001e;	 Catch:{ all -> 0x0024 }
        r5 = r2.b;	 Catch:{ all -> 0x0024 }
        monitor-exit(r4);
        return r5;
        r0 = r0 + 1;
        goto L_0x0008;
        r5 = 0;
        monitor-exit(r4);
        return r5;
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agd.a(java.lang.Class):zh");
    }

    public final synchronized <Z> void a(Class<Z> cls, zh<Z> zhVar) {
        this.a.add(new a(cls, zhVar));
    }
}
