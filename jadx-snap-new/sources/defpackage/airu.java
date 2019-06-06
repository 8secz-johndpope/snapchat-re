package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: airu */
public final class airu<E extends airt & aisd & aisa> extends PriorityBlockingQueue<E> {
    private Queue<E> a = new LinkedList();
    private final ReentrantLock b = new ReentrantLock();

    private E a(int i, Long l, TimeUnit timeUnit) {
        Object take;
        if (i == 0) {
            take = super.take();
        } else if (i == 1) {
            take = super.peek();
        } else if (i == 2) {
            take = super.poll();
        } else if (i != 3) {
            return null;
        } else {
            take = super.poll(l.longValue(), timeUnit);
        }
        return (airt) take;
    }

    private boolean a(int i, E e) {
        try {
            this.b.lock();
            if (i == 1) {
                super.remove(e);
            }
            boolean offer = this.a.offer(e);
            return offer;
        } finally {
            this.b.unlock();
        }
    }

    private static <T> T[] a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, objArr, 0, length);
        System.arraycopy(tArr2, 0, objArr, length, length2);
        return objArr;
    }

    private E b() {
        try {
            return b(1, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    private E b(int i, Long l, TimeUnit timeUnit) {
        airt a;
        while (true) {
            a = a(i, l, timeUnit);
            if (a == null || a.g()) {
                return a;
            }
            a(i, a);
        }
        return a;
    }

    private E c() {
        try {
            return b(2, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0031 in {7, 9, 12} preds:[]
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
        r0 = r3.b;	 Catch:{ all -> 0x002a }
        r0.lock();	 Catch:{ all -> 0x002a }
        r0 = r3.a;	 Catch:{ all -> 0x002a }
        r0 = r0.iterator();	 Catch:{ all -> 0x002a }
        r1 = r0.hasNext();	 Catch:{ all -> 0x002a }
        if (r1 == 0) goto L_0x0024;	 Catch:{ all -> 0x002a }
        r1 = r0.next();	 Catch:{ all -> 0x002a }
        r1 = (defpackage.airt) r1;	 Catch:{ all -> 0x002a }
        r2 = r1.g();	 Catch:{ all -> 0x002a }
        if (r2 == 0) goto L_0x000b;	 Catch:{ all -> 0x002a }
        super.offer(r1);	 Catch:{ all -> 0x002a }
        r0.remove();	 Catch:{ all -> 0x002a }
        goto L_0x000b;
        r0 = r3.b;
        r0.unlock();
        return;
        r0 = move-exception;
        r1 = r3.b;
        r1.unlock();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airu.a():void");
    }

    public final void clear() {
        try {
            this.b.lock();
            this.a.clear();
            super.clear();
        } finally {
            this.b.unlock();
        }
    }

    public final boolean contains(Object obj) {
        try {
            this.b.lock();
            boolean z = super.contains(obj) || this.a.contains(obj);
            this.b.unlock();
            return z;
        } catch (Throwable th) {
            this.b.unlock();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x002f in {5, 7, 10} preds:[]
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
    public final int drainTo(java.util.Collection<? super E> r3) {
        /*
        r2 = this;
        r0 = r2.b;	 Catch:{ all -> 0x0028 }
        r0.lock();	 Catch:{ all -> 0x0028 }
        r0 = super.drainTo(r3);	 Catch:{ all -> 0x0028 }
        r1 = r2.a;	 Catch:{ all -> 0x0028 }
        r1 = r1.size();	 Catch:{ all -> 0x0028 }
        r0 = r0 + r1;	 Catch:{ all -> 0x0028 }
        r1 = r2.a;	 Catch:{ all -> 0x0028 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0028 }
        if (r1 != 0) goto L_0x0022;	 Catch:{ all -> 0x0028 }
        r1 = r2.a;	 Catch:{ all -> 0x0028 }
        r1 = r1.poll();	 Catch:{ all -> 0x0028 }
        r3.add(r1);	 Catch:{ all -> 0x0028 }
        goto L_0x0010;
        r3 = r2.b;
        r3.unlock();
        return r0;
        r3 = move-exception;
        r0 = r2.b;
        r0.unlock();
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airu.drainTo(java.util.Collection):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x002c in {6, 8, 11} preds:[]
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
    public final int drainTo(java.util.Collection<? super E> r3, int r4) {
        /*
        r2 = this;
        r0 = r2.b;	 Catch:{ all -> 0x0025 }
        r0.lock();	 Catch:{ all -> 0x0025 }
        r0 = super.drainTo(r3, r4);	 Catch:{ all -> 0x0025 }
        r1 = r2.a;	 Catch:{ all -> 0x0025 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0025 }
        if (r1 != 0) goto L_0x001f;	 Catch:{ all -> 0x0025 }
        if (r0 > r4) goto L_0x001f;	 Catch:{ all -> 0x0025 }
        r1 = r2.a;	 Catch:{ all -> 0x0025 }
        r1 = r1.poll();	 Catch:{ all -> 0x0025 }
        r3.add(r1);	 Catch:{ all -> 0x0025 }
        r0 = r0 + 1;
        goto L_0x0009;
        r3 = r2.b;
        r3.unlock();
        return r0;
        r3 = move-exception;
        r4 = r2.b;
        r4.unlock();
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airu.drainTo(java.util.Collection, int):int");
    }

    public final /* synthetic */ Object peek() {
        return b();
    }

    public final /* synthetic */ Object poll() {
        return c();
    }

    public final /* synthetic */ Object poll(long j, TimeUnit timeUnit) {
        return b(3, Long.valueOf(j), timeUnit);
    }

    public final boolean remove(Object obj) {
        try {
            this.b.lock();
            boolean z = super.remove(obj) || this.a.remove(obj);
            this.b.unlock();
            return z;
        } catch (Throwable th) {
            this.b.unlock();
        }
    }

    public final boolean removeAll(Collection<?> collection) {
        try {
            this.b.lock();
            boolean removeAll = this.a.removeAll(collection) | super.removeAll(collection);
            return removeAll;
        } finally {
            this.b.unlock();
        }
    }

    public final int size() {
        try {
            this.b.lock();
            int size = this.a.size() + super.size();
            return size;
        } finally {
            this.b.unlock();
        }
    }

    public final /* synthetic */ Object take() {
        return b(0, null, null);
    }

    public final Object[] toArray() {
        try {
            this.b.lock();
            Object[] a = airu.a(super.toArray(), this.a.toArray());
            return a;
        } finally {
            this.b.unlock();
        }
    }

    public final <T> T[] toArray(T[] tArr) {
        try {
            this.b.lock();
            tArr = airu.a(super.toArray(tArr), this.a.toArray(tArr));
            return tArr;
        } finally {
            this.b.unlock();
        }
    }
}
