package defpackage;

import com.google.common.collect.Iterators;
import java.util.Iterator;

/* renamed from: abpx */
public final class abpx<T> extends abpj<T> {
    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void a() {
        this.a = new abpw();
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized boolean a(T t) {
        boolean add;
        abpw abpw = new abpw();
        abpw.addAll(this.a);
        add = abpw.add(t);
        this.a = abpw;
        return add;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x002c in {7, 10, 13} preds:[]
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
    protected final synchronized boolean a(java.util.Collection<? extends T> r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = new abpw;	 Catch:{ all -> 0x0029 }
        r0.<init>();	 Catch:{ all -> 0x0029 }
        r1 = r3.a;	 Catch:{ all -> 0x0029 }
        r0.addAll(r1);	 Catch:{ all -> 0x0029 }
        r1 = 0;	 Catch:{ all -> 0x0029 }
        r4 = r4.iterator();	 Catch:{ all -> 0x0029 }
        r2 = r4.hasNext();	 Catch:{ all -> 0x0029 }
        if (r2 == 0) goto L_0x0025;	 Catch:{ all -> 0x0029 }
        r2 = r4.next();	 Catch:{ all -> 0x0029 }
        com.google.common.base.Preconditions.checkNotNull(r2);	 Catch:{ all -> 0x0029 }
        r2 = r0.add(r2);	 Catch:{ all -> 0x0029 }
        if (r2 == 0) goto L_0x0010;	 Catch:{ all -> 0x0029 }
        r1 = 1;	 Catch:{ all -> 0x0029 }
        goto L_0x0010;	 Catch:{ all -> 0x0029 }
        r3.a = r0;	 Catch:{ all -> 0x0029 }
        monitor-exit(r3);
        return r1;
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abpx.a(java.util.Collection):boolean");
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized boolean b(T t) {
        boolean remove;
        abpw abpw = new abpw();
        abpw.addAll(this.a);
        remove = abpw.remove(t);
        this.a = abpw;
        return remove;
    }

    public final Iterator<T> iterator() {
        return Iterators.unmodifiableIterator(this.a.iterator());
    }
}
