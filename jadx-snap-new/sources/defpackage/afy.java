package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: afy */
public final class afy {
    private final List<a<?>> a = new ArrayList();

    /* renamed from: afy$a */
    static final class a<T> {
        final Class<T> a;
        final za<T> b;

        a(Class<T> cls, za<T> zaVar) {
            this.a = cls;
            this.b = zaVar;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0025 in {9, 12, 15} preds:[]
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
    public final synchronized <T> defpackage.za<T> a(java.lang.Class<T> r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.a;	 Catch:{ all -> 0x0022 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0022 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0022 }
        if (r1 == 0) goto L_0x001f;	 Catch:{ all -> 0x0022 }
        r1 = r0.next();	 Catch:{ all -> 0x0022 }
        r1 = (defpackage.afy.a) r1;	 Catch:{ all -> 0x0022 }
        r2 = r1.a;	 Catch:{ all -> 0x0022 }
        r2 = r2.isAssignableFrom(r4);	 Catch:{ all -> 0x0022 }
        if (r2 == 0) goto L_0x0007;	 Catch:{ all -> 0x0022 }
        r4 = r1.b;	 Catch:{ all -> 0x0022 }
        monitor-exit(r3);
        return r4;
        r4 = 0;
        monitor-exit(r3);
        return r4;
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afy.a(java.lang.Class):za");
    }

    public final synchronized <T> void a(Class<T> cls, za<T> zaVar) {
        this.a.add(new a(cls, zaVar));
    }
}
