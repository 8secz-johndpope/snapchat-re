package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: abpt */
public final class abpt<T> extends abpj<T> {
    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void a() {
        this.a = new CopyOnWriteArraySet();
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized boolean a(T t) {
        return this.a.add(t);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x001e in {5, 8, 11} preds:[]
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
    protected final synchronized boolean a(java.util.Collection<? extends T> r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r3.iterator();	 Catch:{ all -> 0x001b }
        r1 = r0.hasNext();	 Catch:{ all -> 0x001b }
        if (r1 == 0) goto L_0x0013;	 Catch:{ all -> 0x001b }
        r1 = r0.next();	 Catch:{ all -> 0x001b }
        com.google.common.base.Preconditions.checkNotNull(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0005;	 Catch:{ all -> 0x001b }
        r0 = r2.a;	 Catch:{ all -> 0x001b }
        r3 = r0.addAll(r3);	 Catch:{ all -> 0x001b }
        monitor-exit(r2);
        return r3;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abpt.a(java.util.Collection):boolean");
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized boolean b(T t) {
        return this.a.remove(t);
    }

    public final Iterator<T> iterator() {
        return this.a.iterator();
    }
}
