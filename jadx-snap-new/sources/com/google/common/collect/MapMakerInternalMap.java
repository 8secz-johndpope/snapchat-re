package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import org.opencv.imgproc.Imgproc;

class MapMakerInternalMap<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements Serializable, ConcurrentMap<K, V> {
    static final WeakValueReference<Object, Object, DummyInternalEntry> UNSET_WEAK_VALUE_REFERENCE = new WeakValueReference<Object, Object, DummyInternalEntry>() {
        public final void clear() {
        }

        public final WeakValueReference<Object, Object, DummyInternalEntry> copyFor(ReferenceQueue<Object> referenceQueue, DummyInternalEntry dummyInternalEntry) {
            return this;
        }

        public final Object get() {
            return null;
        }

        public final DummyInternalEntry getEntry() {
            return null;
        }
    };
    final int concurrencyLevel;
    final transient InternalEntryHelper<K, V, E, S> entryHelper;
    transient Set<Entry<K, V>> entrySet;
    final Equivalence<Object> keyEquivalence;
    transient Set<K> keySet;
    final transient int segmentMask;
    final transient int segmentShift;
    final transient Segment<K, V, E, S>[] segments;
    transient Collection<V> values;

    enum Strength {
        STRONG {
            /* Access modifiers changed, original: final */
            public final Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }
        },
        WEAK {
            /* Access modifiers changed, original: final */
            public final Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();
    }

    static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<V> queueForValues = new ReferenceQueue();

        StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        /* Access modifiers changed, original: final */
        public final void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForValues);
        }

        /* Access modifiers changed, original: final */
        public final void maybeDrainReferenceQueues() {
            drainValueReferenceQueue(this.queueForValues);
        }

        /* Access modifiers changed, original: final */
        public final StrongKeyWeakValueSegment<K, V> self() {
            return this;
        }
    }

    interface WeakValueReference<K, V, E extends InternalEntry<K, V, E>> {
        void clear();

        WeakValueReference<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e);

        V get();

        E getEntry();
    }

    interface InternalEntryHelper<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> {
        E copy(S s, E e, E e2);

        E newEntry(S s, K k, int i, E e);

        S newSegment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2);

        void setValue(S s, E e, V v);

        Strength valueStrength();
    }

    static abstract class Segment<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        volatile int count;
        final MapMakerInternalMap<K, V, E, S> map;
        final int maxSegmentSize;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        volatile AtomicReferenceArray<E> table;
        int threshold;

        Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2) {
            this.map = mapMakerInternalMap;
            this.maxSegmentSize = i2;
            initTable(newEntryArray(i));
        }

        static <K, V, E extends InternalEntry<K, V, E>> boolean isCollected(E e) {
            return e.getValue() == null;
        }

        /* Access modifiers changed, original: 0000 */
        public void clear() {
            if (this.count != 0) {
                lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    maybeClearReferenceQueues();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public <T> void clearReferenceQueue(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean containsKey(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    InternalEntry liveEntry = getLiveEntry(obj, i);
                    if (!(liveEntry == null || liveEntry.getValue() == null)) {
                        z = true;
                    }
                    postReadCleanup();
                    return z;
                }
                postReadCleanup();
                return false;
            } catch (Throwable th) {
                postReadCleanup();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public E copyEntry(E e, E e2) {
            return this.map.entryHelper.copy(self(), e, e2);
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void drainKeyReferenceQueue(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference poll = referenceQueue.poll();
                if (poll != null) {
                    this.map.reclaimKey((InternalEntry) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void drainValueReferenceQueue(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference poll = referenceQueue.poll();
                if (poll != null) {
                    this.map.reclaimValue((WeakValueReference) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void expand() {
            AtomicReferenceArray atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < AudioPlayer.INFINITY_LOOP_COUNT) {
                int i = this.count;
                AtomicReferenceArray newEntryArray = newEntryArray(length << 1);
                this.threshold = (newEntryArray.length() * 3) / 4;
                int length2 = newEntryArray.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(i2);
                    if (internalEntry != null) {
                        InternalEntry next = internalEntry.getNext();
                        int hash = internalEntry.getHash() & length2;
                        if (next == null) {
                            newEntryArray.set(hash, internalEntry);
                        } else {
                            InternalEntry internalEntry2 = internalEntry;
                            while (next != null) {
                                int hash2 = next.getHash() & length2;
                                if (hash2 != hash) {
                                    internalEntry2 = next;
                                    hash = hash2;
                                }
                                next = next.getNext();
                            }
                            newEntryArray.set(hash, internalEntry2);
                            while (internalEntry != internalEntry2) {
                                int hash3 = internalEntry.getHash() & length2;
                                InternalEntry copyEntry = copyEntry(internalEntry, (InternalEntry) newEntryArray.get(hash3));
                                if (copyEntry != null) {
                                    newEntryArray.set(hash3, copyEntry);
                                } else {
                                    i--;
                                }
                                internalEntry = internalEntry.getNext();
                            }
                        }
                    }
                }
                this.table = newEntryArray;
                this.count = i;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V get(Object obj, int i) {
            try {
                InternalEntry liveEntry = getLiveEntry(obj, i);
                if (liveEntry == null) {
                    return null;
                }
                obj = liveEntry.getValue();
                if (obj == null) {
                    tryDrainReferenceQueues();
                }
                postReadCleanup();
                return obj;
            } finally {
                postReadCleanup();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public E getEntry(Object obj, int i) {
            if (this.count != 0) {
                for (InternalEntry first = getFirst(i); first != null; first = first.getNext()) {
                    if (first.getHash() == i) {
                        Object key = first.getKey();
                        if (key == null) {
                            tryDrainReferenceQueues();
                        } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                            return first;
                        }
                    }
                }
            }
            return null;
        }

        /* Access modifiers changed, original: 0000 */
        public E getFirst(int i) {
            AtomicReferenceArray atomicReferenceArray = this.table;
            return (InternalEntry) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* Access modifiers changed, original: 0000 */
        public E getLiveEntry(Object obj, int i) {
            return getEntry(obj, i);
        }

        /* Access modifiers changed, original: 0000 */
        public V getLiveValue(E e) {
            if (e.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            Object value = e.getValue();
            if (value != null) {
                return value;
            }
            tryDrainReferenceQueues();
            return null;
        }

        /* Access modifiers changed, original: 0000 */
        public void initTable(AtomicReferenceArray<E> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            int i = this.threshold;
            if (i == this.maxSegmentSize) {
                this.threshold = i + 1;
            }
            this.table = atomicReferenceArray;
        }

        /* Access modifiers changed, original: 0000 */
        public void maybeClearReferenceQueues() {
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void maybeDrainReferenceQueues() {
        }

        /* Access modifiers changed, original: 0000 */
        public AtomicReferenceArray<E> newEntryArray(int i) {
            return new AtomicReferenceArray(i);
        }

        /* Access modifiers changed, original: 0000 */
        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                runCleanup();
            }
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void preWriteCleanup() {
            runLockedCleanup();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x0090 in {4, 17, 20, 24, 26, 29, 32} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        V put(K r9, int r10, V r11, boolean r12) {
            /*
            r8 = this;
            r8.lock();
            r8.preWriteCleanup();	 Catch:{ all -> 0x008b }
            r0 = r8.count;	 Catch:{ all -> 0x008b }
            r0 = r0 + 1;	 Catch:{ all -> 0x008b }
            r1 = r8.threshold;	 Catch:{ all -> 0x008b }
            if (r0 <= r1) goto L_0x0015;	 Catch:{ all -> 0x008b }
            r8.expand();	 Catch:{ all -> 0x008b }
            r0 = r8.count;	 Catch:{ all -> 0x008b }
            r0 = r0 + 1;	 Catch:{ all -> 0x008b }
            r1 = r8.table;	 Catch:{ all -> 0x008b }
            r2 = r1.length();	 Catch:{ all -> 0x008b }
            r2 = r2 + -1;	 Catch:{ all -> 0x008b }
            r2 = r2 & r10;	 Catch:{ all -> 0x008b }
            r3 = r1.get(r2);	 Catch:{ all -> 0x008b }
            r3 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r3;	 Catch:{ all -> 0x008b }
            r4 = r3;	 Catch:{ all -> 0x008b }
            r5 = 0;	 Catch:{ all -> 0x008b }
            if (r4 == 0) goto L_0x006d;	 Catch:{ all -> 0x008b }
            r6 = r4.getKey();	 Catch:{ all -> 0x008b }
            r7 = r4.getHash();	 Catch:{ all -> 0x008b }
            if (r7 != r10) goto L_0x0068;	 Catch:{ all -> 0x008b }
            if (r6 == 0) goto L_0x0068;	 Catch:{ all -> 0x008b }
            r7 = r8.map;	 Catch:{ all -> 0x008b }
            r7 = r7.keyEquivalence;	 Catch:{ all -> 0x008b }
            r6 = r7.equivalent(r9, r6);	 Catch:{ all -> 0x008b }
            if (r6 == 0) goto L_0x0068;	 Catch:{ all -> 0x008b }
            r9 = r4.getValue();	 Catch:{ all -> 0x008b }
            if (r9 != 0) goto L_0x0055;	 Catch:{ all -> 0x008b }
            r9 = r8.modCount;	 Catch:{ all -> 0x008b }
            r9 = r9 + 1;	 Catch:{ all -> 0x008b }
            r8.modCount = r9;	 Catch:{ all -> 0x008b }
            r8.setValue(r4, r11);	 Catch:{ all -> 0x008b }
            r9 = r8.count;	 Catch:{ all -> 0x008b }
            r8.count = r9;	 Catch:{ all -> 0x008b }
            r8.unlock();
            return r5;
            if (r12 == 0) goto L_0x005b;
            r8.unlock();
            return r9;
            r10 = r8.modCount;	 Catch:{ all -> 0x008b }
            r10 = r10 + 1;	 Catch:{ all -> 0x008b }
            r8.modCount = r10;	 Catch:{ all -> 0x008b }
            r8.setValue(r4, r11);	 Catch:{ all -> 0x008b }
            r8.unlock();
            return r9;
            r4 = r4.getNext();	 Catch:{ all -> 0x008b }
            goto L_0x0025;	 Catch:{ all -> 0x008b }
            r12 = r8.modCount;	 Catch:{ all -> 0x008b }
            r12 = r12 + 1;	 Catch:{ all -> 0x008b }
            r8.modCount = r12;	 Catch:{ all -> 0x008b }
            r12 = r8.map;	 Catch:{ all -> 0x008b }
            r12 = r12.entryHelper;	 Catch:{ all -> 0x008b }
            r4 = r8.self();	 Catch:{ all -> 0x008b }
            r9 = r12.newEntry(r4, r9, r10, r3);	 Catch:{ all -> 0x008b }
            r8.setValue(r9, r11);	 Catch:{ all -> 0x008b }
            r1.set(r2, r9);	 Catch:{ all -> 0x008b }
            r8.count = r0;	 Catch:{ all -> 0x008b }
            r8.unlock();
            return r5;
            r9 = move-exception;
            r8.unlock();
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap$Segment.put(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x003d in {7, 10, 12, 15} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        boolean reclaimKey(E r5, int r6) {
            /*
            r4 = this;
            r4.lock();
            r0 = r4.count;	 Catch:{ all -> 0x0038 }
            r0 = r4.table;	 Catch:{ all -> 0x0038 }
            r1 = r0.length();	 Catch:{ all -> 0x0038 }
            r2 = 1;	 Catch:{ all -> 0x0038 }
            r1 = r1 - r2;	 Catch:{ all -> 0x0038 }
            r6 = r6 & r1;	 Catch:{ all -> 0x0038 }
            r1 = r0.get(r6);	 Catch:{ all -> 0x0038 }
            r1 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r1;	 Catch:{ all -> 0x0038 }
            r3 = r1;	 Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x0033;	 Catch:{ all -> 0x0038 }
            if (r3 != r5) goto L_0x002e;	 Catch:{ all -> 0x0038 }
            r5 = r4.modCount;	 Catch:{ all -> 0x0038 }
            r5 = r5 + r2;	 Catch:{ all -> 0x0038 }
            r4.modCount = r5;	 Catch:{ all -> 0x0038 }
            r5 = r4.removeFromChain(r1, r3);	 Catch:{ all -> 0x0038 }
            r1 = r4.count;	 Catch:{ all -> 0x0038 }
            r1 = r1 - r2;	 Catch:{ all -> 0x0038 }
            r0.set(r6, r5);	 Catch:{ all -> 0x0038 }
            r4.count = r1;	 Catch:{ all -> 0x0038 }
            r4.unlock();
            return r2;
            r3 = r3.getNext();	 Catch:{ all -> 0x0038 }
            goto L_0x0015;
            r4.unlock();
            r5 = 0;
            return r5;
            r5 = move-exception;
            r4.unlock();
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap$Segment.reclaimKey(com.google.common.collect.MapMakerInternalMap$InternalEntry, int):boolean");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x005e in {14, 16, 19, 21, 24} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        boolean reclaimValue(K r9, int r10, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> r11) {
            /*
            r8 = this;
            r8.lock();
            r0 = r8.count;	 Catch:{ all -> 0x0059 }
            r0 = r8.table;	 Catch:{ all -> 0x0059 }
            r1 = r0.length();	 Catch:{ all -> 0x0059 }
            r2 = 1;	 Catch:{ all -> 0x0059 }
            r1 = r1 - r2;	 Catch:{ all -> 0x0059 }
            r1 = r1 & r10;	 Catch:{ all -> 0x0059 }
            r3 = r0.get(r1);	 Catch:{ all -> 0x0059 }
            r3 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r3;	 Catch:{ all -> 0x0059 }
            r4 = r3;	 Catch:{ all -> 0x0059 }
            r5 = 0;	 Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0055;	 Catch:{ all -> 0x0059 }
            r6 = r4.getKey();	 Catch:{ all -> 0x0059 }
            r7 = r4.getHash();	 Catch:{ all -> 0x0059 }
            if (r7 != r10) goto L_0x0050;	 Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0050;	 Catch:{ all -> 0x0059 }
            r7 = r8.map;	 Catch:{ all -> 0x0059 }
            r7 = r7.keyEquivalence;	 Catch:{ all -> 0x0059 }
            r6 = r7.equivalent(r9, r6);	 Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0050;	 Catch:{ all -> 0x0059 }
            r9 = r4;	 Catch:{ all -> 0x0059 }
            r9 = (com.google.common.collect.MapMakerInternalMap.WeakValueEntry) r9;	 Catch:{ all -> 0x0059 }
            r9 = r9.getValueReference();	 Catch:{ all -> 0x0059 }
            if (r9 != r11) goto L_0x004c;	 Catch:{ all -> 0x0059 }
            r9 = r8.modCount;	 Catch:{ all -> 0x0059 }
            r9 = r9 + r2;	 Catch:{ all -> 0x0059 }
            r8.modCount = r9;	 Catch:{ all -> 0x0059 }
            r9 = r8.removeFromChain(r3, r4);	 Catch:{ all -> 0x0059 }
            r10 = r8.count;	 Catch:{ all -> 0x0059 }
            r10 = r10 - r2;	 Catch:{ all -> 0x0059 }
            r0.set(r1, r9);	 Catch:{ all -> 0x0059 }
            r8.count = r10;	 Catch:{ all -> 0x0059 }
            r8.unlock();
            return r2;
            r8.unlock();
            return r5;
            r4 = r4.getNext();	 Catch:{ all -> 0x0059 }
            goto L_0x0015;
            r8.unlock();
            return r5;
            r9 = move-exception;
            r8.unlock();
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap$Segment.reclaimValue(java.lang.Object, int, com.google.common.collect.MapMakerInternalMap$WeakValueReference):boolean");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0066 in {15, 19, 22, 24, 27} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        V remove(java.lang.Object r8, int r9) {
            /*
            r7 = this;
            r7.lock();
            r7.preWriteCleanup();	 Catch:{ all -> 0x0061 }
            r0 = r7.count;	 Catch:{ all -> 0x0061 }
            r0 = r7.table;	 Catch:{ all -> 0x0061 }
            r1 = r0.length();	 Catch:{ all -> 0x0061 }
            r1 = r1 + -1;	 Catch:{ all -> 0x0061 }
            r1 = r1 & r9;	 Catch:{ all -> 0x0061 }
            r2 = r0.get(r1);	 Catch:{ all -> 0x0061 }
            r2 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r2;	 Catch:{ all -> 0x0061 }
            r3 = r2;	 Catch:{ all -> 0x0061 }
            r4 = 0;	 Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x005d;	 Catch:{ all -> 0x0061 }
            r5 = r3.getKey();	 Catch:{ all -> 0x0061 }
            r6 = r3.getHash();	 Catch:{ all -> 0x0061 }
            if (r6 != r9) goto L_0x0058;	 Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0058;	 Catch:{ all -> 0x0061 }
            r6 = r7.map;	 Catch:{ all -> 0x0061 }
            r6 = r6.keyEquivalence;	 Catch:{ all -> 0x0061 }
            r5 = r6.equivalent(r8, r5);	 Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0058;	 Catch:{ all -> 0x0061 }
            r8 = r3.getValue();	 Catch:{ all -> 0x0061 }
            if (r8 != 0) goto L_0x0041;	 Catch:{ all -> 0x0061 }
            r9 = isCollected(r3);	 Catch:{ all -> 0x0061 }
            if (r9 != 0) goto L_0x0041;
            r7.unlock();
            return r4;
            r9 = r7.modCount;	 Catch:{ all -> 0x0061 }
            r9 = r9 + 1;	 Catch:{ all -> 0x0061 }
            r7.modCount = r9;	 Catch:{ all -> 0x0061 }
            r9 = r7.removeFromChain(r2, r3);	 Catch:{ all -> 0x0061 }
            r2 = r7.count;	 Catch:{ all -> 0x0061 }
            r2 = r2 + -1;	 Catch:{ all -> 0x0061 }
            r0.set(r1, r9);	 Catch:{ all -> 0x0061 }
            r7.count = r2;	 Catch:{ all -> 0x0061 }
            r7.unlock();
            return r8;
            r3 = r3.getNext();	 Catch:{ all -> 0x0061 }
            goto L_0x0018;
            r7.unlock();
            return r4;
            r8 = move-exception;
            r7.unlock();
            throw r8;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap$Segment.remove(java.lang.Object, int):java.lang.Object");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x0070 in {12, 16, 20, 23, 25, 28} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        boolean remove(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
            r8 = this;
            r8.lock();
            r8.preWriteCleanup();	 Catch:{ all -> 0x006b }
            r0 = r8.count;	 Catch:{ all -> 0x006b }
            r0 = r8.table;	 Catch:{ all -> 0x006b }
            r1 = r0.length();	 Catch:{ all -> 0x006b }
            r2 = 1;	 Catch:{ all -> 0x006b }
            r1 = r1 - r2;	 Catch:{ all -> 0x006b }
            r1 = r1 & r10;	 Catch:{ all -> 0x006b }
            r3 = r0.get(r1);	 Catch:{ all -> 0x006b }
            r3 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r3;	 Catch:{ all -> 0x006b }
            r4 = r3;	 Catch:{ all -> 0x006b }
            r5 = 0;	 Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0067;	 Catch:{ all -> 0x006b }
            r6 = r4.getKey();	 Catch:{ all -> 0x006b }
            r7 = r4.getHash();	 Catch:{ all -> 0x006b }
            if (r7 != r10) goto L_0x0062;	 Catch:{ all -> 0x006b }
            if (r6 == 0) goto L_0x0062;	 Catch:{ all -> 0x006b }
            r7 = r8.map;	 Catch:{ all -> 0x006b }
            r7 = r7.keyEquivalence;	 Catch:{ all -> 0x006b }
            r6 = r7.equivalent(r9, r6);	 Catch:{ all -> 0x006b }
            if (r6 == 0) goto L_0x0062;	 Catch:{ all -> 0x006b }
            r9 = r4.getValue();	 Catch:{ all -> 0x006b }
            r10 = r8.map;	 Catch:{ all -> 0x006b }
            r10 = r10.valueEquivalence();	 Catch:{ all -> 0x006b }
            r9 = r10.equivalent(r11, r9);	 Catch:{ all -> 0x006b }
            if (r9 == 0) goto L_0x0043;	 Catch:{ all -> 0x006b }
            r5 = 1;	 Catch:{ all -> 0x006b }
            goto L_0x004d;	 Catch:{ all -> 0x006b }
            r9 = isCollected(r4);	 Catch:{ all -> 0x006b }
            if (r9 != 0) goto L_0x004d;
            r8.unlock();
            return r5;
            r9 = r8.modCount;	 Catch:{ all -> 0x006b }
            r9 = r9 + r2;	 Catch:{ all -> 0x006b }
            r8.modCount = r9;	 Catch:{ all -> 0x006b }
            r9 = r8.removeFromChain(r3, r4);	 Catch:{ all -> 0x006b }
            r10 = r8.count;	 Catch:{ all -> 0x006b }
            r10 = r10 - r2;	 Catch:{ all -> 0x006b }
            r0.set(r1, r9);	 Catch:{ all -> 0x006b }
            r8.count = r10;	 Catch:{ all -> 0x006b }
            r8.unlock();
            return r5;
            r4 = r4.getNext();	 Catch:{ all -> 0x006b }
            goto L_0x0018;
            r8.unlock();
            return r5;
            r9 = move-exception;
            r8.unlock();
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap$Segment.remove(java.lang.Object, int, java.lang.Object):boolean");
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public E removeFromChain(E e, E e2) {
            int i = this.count;
            InternalEntry next = e2.getNext();
            while (e != e2) {
                InternalEntry copyEntry = copyEntry(e, next);
                if (copyEntry != null) {
                    next = copyEntry;
                } else {
                    i--;
                }
                e = e.getNext();
            }
            this.count = i;
            return next;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x006f in {14, 16, 20, 23, 25, 28} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        V replace(K r8, int r9, V r10) {
            /*
            r7 = this;
            r7.lock();
            r7.preWriteCleanup();	 Catch:{ all -> 0x006a }
            r0 = r7.table;	 Catch:{ all -> 0x006a }
            r1 = r0.length();	 Catch:{ all -> 0x006a }
            r1 = r1 + -1;	 Catch:{ all -> 0x006a }
            r1 = r1 & r9;	 Catch:{ all -> 0x006a }
            r2 = r0.get(r1);	 Catch:{ all -> 0x006a }
            r2 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r2;	 Catch:{ all -> 0x006a }
            r3 = r2;	 Catch:{ all -> 0x006a }
            r4 = 0;	 Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x0066;	 Catch:{ all -> 0x006a }
            r5 = r3.getKey();	 Catch:{ all -> 0x006a }
            r6 = r3.getHash();	 Catch:{ all -> 0x006a }
            if (r6 != r9) goto L_0x0061;	 Catch:{ all -> 0x006a }
            if (r5 == 0) goto L_0x0061;	 Catch:{ all -> 0x006a }
            r6 = r7.map;	 Catch:{ all -> 0x006a }
            r6 = r6.keyEquivalence;	 Catch:{ all -> 0x006a }
            r5 = r6.equivalent(r8, r5);	 Catch:{ all -> 0x006a }
            if (r5 == 0) goto L_0x0061;	 Catch:{ all -> 0x006a }
            r8 = r3.getValue();	 Catch:{ all -> 0x006a }
            if (r8 != 0) goto L_0x0054;	 Catch:{ all -> 0x006a }
            r8 = isCollected(r3);	 Catch:{ all -> 0x006a }
            if (r8 == 0) goto L_0x0050;	 Catch:{ all -> 0x006a }
            r8 = r7.count;	 Catch:{ all -> 0x006a }
            r8 = r7.modCount;	 Catch:{ all -> 0x006a }
            r8 = r8 + 1;	 Catch:{ all -> 0x006a }
            r7.modCount = r8;	 Catch:{ all -> 0x006a }
            r8 = r7.removeFromChain(r2, r3);	 Catch:{ all -> 0x006a }
            r9 = r7.count;	 Catch:{ all -> 0x006a }
            r9 = r9 + -1;	 Catch:{ all -> 0x006a }
            r0.set(r1, r8);	 Catch:{ all -> 0x006a }
            r7.count = r9;	 Catch:{ all -> 0x006a }
            r7.unlock();
            return r4;
            r9 = r7.modCount;	 Catch:{ all -> 0x006a }
            r9 = r9 + 1;	 Catch:{ all -> 0x006a }
            r7.modCount = r9;	 Catch:{ all -> 0x006a }
            r7.setValue(r3, r10);	 Catch:{ all -> 0x006a }
            r7.unlock();
            return r8;
            r3 = r3.getNext();	 Catch:{ all -> 0x006a }
            goto L_0x0016;
            r7.unlock();
            return r4;
            r8 = move-exception;
            r7.unlock();
            throw r8;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap$Segment.replace(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x007c in {14, 16, 22, 24, 27, 29, 32} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        boolean replace(K r9, int r10, V r11, V r12) {
            /*
            r8 = this;
            r8.lock();
            r8.preWriteCleanup();	 Catch:{ all -> 0x0077 }
            r0 = r8.table;	 Catch:{ all -> 0x0077 }
            r1 = r0.length();	 Catch:{ all -> 0x0077 }
            r2 = 1;	 Catch:{ all -> 0x0077 }
            r1 = r1 - r2;	 Catch:{ all -> 0x0077 }
            r1 = r1 & r10;	 Catch:{ all -> 0x0077 }
            r3 = r0.get(r1);	 Catch:{ all -> 0x0077 }
            r3 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r3;	 Catch:{ all -> 0x0077 }
            r4 = r3;	 Catch:{ all -> 0x0077 }
            r5 = 0;	 Catch:{ all -> 0x0077 }
            if (r4 == 0) goto L_0x0073;	 Catch:{ all -> 0x0077 }
            r6 = r4.getKey();	 Catch:{ all -> 0x0077 }
            r7 = r4.getHash();	 Catch:{ all -> 0x0077 }
            if (r7 != r10) goto L_0x006e;	 Catch:{ all -> 0x0077 }
            if (r6 == 0) goto L_0x006e;	 Catch:{ all -> 0x0077 }
            r7 = r8.map;	 Catch:{ all -> 0x0077 }
            r7 = r7.keyEquivalence;	 Catch:{ all -> 0x0077 }
            r6 = r7.equivalent(r9, r6);	 Catch:{ all -> 0x0077 }
            if (r6 == 0) goto L_0x006e;	 Catch:{ all -> 0x0077 }
            r9 = r4.getValue();	 Catch:{ all -> 0x0077 }
            if (r9 != 0) goto L_0x0052;	 Catch:{ all -> 0x0077 }
            r9 = isCollected(r4);	 Catch:{ all -> 0x0077 }
            if (r9 == 0) goto L_0x004e;	 Catch:{ all -> 0x0077 }
            r9 = r8.count;	 Catch:{ all -> 0x0077 }
            r9 = r8.modCount;	 Catch:{ all -> 0x0077 }
            r9 = r9 + r2;	 Catch:{ all -> 0x0077 }
            r8.modCount = r9;	 Catch:{ all -> 0x0077 }
            r9 = r8.removeFromChain(r3, r4);	 Catch:{ all -> 0x0077 }
            r10 = r8.count;	 Catch:{ all -> 0x0077 }
            r10 = r10 - r2;	 Catch:{ all -> 0x0077 }
            r0.set(r1, r9);	 Catch:{ all -> 0x0077 }
            r8.count = r10;	 Catch:{ all -> 0x0077 }
            r8.unlock();
            return r5;
            r10 = r8.map;	 Catch:{ all -> 0x0077 }
            r10 = r10.valueEquivalence();	 Catch:{ all -> 0x0077 }
            r9 = r10.equivalent(r11, r9);	 Catch:{ all -> 0x0077 }
            if (r9 == 0) goto L_0x006a;	 Catch:{ all -> 0x0077 }
            r9 = r8.modCount;	 Catch:{ all -> 0x0077 }
            r9 = r9 + r2;	 Catch:{ all -> 0x0077 }
            r8.modCount = r9;	 Catch:{ all -> 0x0077 }
            r8.setValue(r4, r12);	 Catch:{ all -> 0x0077 }
            r8.unlock();
            return r2;
            r8.unlock();
            return r5;
            r4 = r4.getNext();	 Catch:{ all -> 0x0077 }
            goto L_0x0016;
            r8.unlock();
            return r5;
            r9 = move-exception;
            r8.unlock();
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap$Segment.replace(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        /* Access modifiers changed, original: 0000 */
        public void runCleanup() {
            runLockedCleanup();
        }

        /* Access modifiers changed, original: 0000 */
        public void runLockedCleanup() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S self();

        /* Access modifiers changed, original: 0000 */
        public void setValue(E e, V v) {
            this.map.entryHelper.setValue(self(), e, v);
        }

        /* Access modifiers changed, original: 0000 */
        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }
    }

    static final class StrongKeyWeakValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, StrongKeyWeakValueEntry<K, V>> {
        private volatile WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> valueReference = MapMakerInternalMap.unsetWeakValueReference();

        static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {
            private static final Helper<?, ?> INSTANCE = new Helper();

            Helper() {
            }

            static <K, V> Helper<K, V> instance() {
                return INSTANCE;
            }

            public final StrongKeyWeakValueEntry<K, V> copy(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry2) {
                return Segment.isCollected(strongKeyWeakValueEntry) ? null : strongKeyWeakValueEntry.copy(strongKeyWeakValueSegment.queueForValues, strongKeyWeakValueEntry2);
            }

            public final StrongKeyWeakValueEntry<K, V> newEntry(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k, int i, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
                return new StrongKeyWeakValueEntry(k, i, strongKeyWeakValueEntry);
            }

            public final StrongKeyWeakValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyWeakValueSegment(mapMakerInternalMap, i, i2);
            }

            public final void setValue(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, V v) {
                strongKeyWeakValueEntry.setValue(v, strongKeyWeakValueSegment.queueForValues);
            }

            public final Strength valueStrength() {
                return Strength.WEAK;
            }
        }

        StrongKeyWeakValueEntry(K k, int i, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
            super(k, i, strongKeyWeakValueEntry);
        }

        /* Access modifiers changed, original: final */
        public final StrongKeyWeakValueEntry<K, V> copy(ReferenceQueue<V> referenceQueue, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
            StrongKeyWeakValueEntry strongKeyWeakValueEntry2 = new StrongKeyWeakValueEntry(this.key, this.hash, strongKeyWeakValueEntry);
            strongKeyWeakValueEntry2.valueReference = this.valueReference.copyFor(referenceQueue, strongKeyWeakValueEntry2);
            return strongKeyWeakValueEntry2;
        }

        public final V getValue() {
            return this.valueReference.get();
        }

        public final WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> getValueReference() {
            return this.valueReference;
        }

        /* Access modifiers changed, original: final */
        public final void setValue(V v, ReferenceQueue<V> referenceQueue) {
            WeakValueReference weakValueReference = this.valueReference;
            this.valueReference = new WeakValueReferenceImpl(referenceQueue, v, this);
            weakValueReference.clear();
        }
    }

    static final class WeakValueReferenceImpl<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<V> implements WeakValueReference<K, V, E> {
        final E entry;

        WeakValueReferenceImpl(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.entry = e;
        }

        public final WeakValueReference<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e) {
            return new WeakValueReferenceImpl(referenceQueue, get(), e);
        }

        public final E getEntry() {
            return this.entry;
        }
    }

    interface InternalEntry<K, V, E extends InternalEntry<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    static abstract class AbstractStrongKeyEntry<K, V, E extends InternalEntry<K, V, E>> implements InternalEntry<K, V, E> {
        final int hash;
        final K key;
        final E next;

        AbstractStrongKeyEntry(K k, int i, E e) {
            this.key = k;
            this.hash = i;
            this.next = e;
        }

        public int getHash() {
            return this.hash;
        }

        public K getKey() {
            return this.key;
        }

        public E getNext() {
            return this.next;
        }
    }

    interface WeakValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
        WeakValueReference<K, V, E> getValueReference();
    }

    abstract class HashIterator<T> implements Iterator<T> {
        Segment<K, V, E, S> currentSegment;
        AtomicReferenceArray<E> currentTable;
        WriteThroughEntry lastReturned;
        E nextEntry;
        WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex = -1;

        HashIterator() {
            this.nextSegmentIndex = MapMakerInternalMap.this.segments.length - 1;
            advance();
        }

        /* Access modifiers changed, original: final */
        public final void advance() {
            this.nextExternal = null;
            if (!nextInChain() && !nextInTable()) {
                while (this.nextSegmentIndex >= 0) {
                    Segment[] segmentArr = MapMakerInternalMap.this.segments;
                    int i = this.nextSegmentIndex;
                    this.nextSegmentIndex = i - 1;
                    this.currentSegment = segmentArr[i];
                    if (this.currentSegment.count != 0) {
                        this.currentTable = this.currentSegment.table;
                        this.nextTableIndex = this.currentTable.length() - 1;
                        if (nextInTable()) {
                            break;
                        }
                    }
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean advanceTo(E e) {
            try {
                Object key = e.getKey();
                Object liveValue = MapMakerInternalMap.this.getLiveValue(e);
                if (liveValue != null) {
                    this.nextExternal = new WriteThroughEntry(key, liveValue);
                    return true;
                }
                this.currentSegment.postReadCleanup();
                return false;
            } finally {
                this.currentSegment.postReadCleanup();
            }
        }

        public boolean hasNext() {
            return this.nextExternal != null;
        }

        /* Access modifiers changed, original: 0000 */
        public WriteThroughEntry nextEntry() {
            WriteThroughEntry writeThroughEntry = this.nextExternal;
            if (writeThroughEntry != null) {
                this.lastReturned = writeThroughEntry;
                advance();
                return this.lastReturned;
            }
            throw new NoSuchElementException();
        }

        /* Access modifiers changed, original: 0000 */
        public boolean nextInChain() {
            InternalEntry internalEntry = this.nextEntry;
            if (internalEntry != null) {
                while (true) {
                    this.nextEntry = internalEntry.getNext();
                    internalEntry = this.nextEntry;
                    if (internalEntry == null) {
                        break;
                    } else if (advanceTo(internalEntry)) {
                        return true;
                    } else {
                        internalEntry = this.nextEntry;
                    }
                }
            }
            return false;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean nextInTable() {
            while (true) {
                int i = this.nextTableIndex;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.currentTable;
                this.nextTableIndex = i - 1;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(i);
                this.nextEntry = internalEntry;
                if (internalEntry == null || !(advanceTo(this.nextEntry) || nextInChain())) {
                }
            }
            return true;
        }

        public void remove() {
            CollectPreconditions.checkRemove(this.lastReturned != null);
            MapMakerInternalMap.this.remove(this.lastReturned.getKey());
            this.lastReturned = null;
        }
    }

    static abstract class SafeToArraySet<E> extends AbstractSet<E> {
        private SafeToArraySet() {
        }

        /* synthetic */ SafeToArraySet(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Object[] toArray() {
            return MapMakerInternalMap.toArrayList(this).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return MapMakerInternalMap.toArrayList(this).toArray(tArr);
        }
    }

    final class Values extends AbstractCollection<V> {
        Values() {
        }

        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new ValueIterator();
        }

        public final int size() {
            return MapMakerInternalMap.this.size();
        }

        public final Object[] toArray() {
            return MapMakerInternalMap.toArrayList(this).toArray();
        }

        public final <T> T[] toArray(T[] tArr) {
            return MapMakerInternalMap.toArrayList(this).toArray(tArr);
        }
    }

    static abstract class AbstractWeakKeyEntry<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<K> implements InternalEntry<K, V, E> {
        final int hash;
        final E next;

        AbstractWeakKeyEntry(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
            super(k, referenceQueue);
            this.hash = i;
            this.next = e;
        }

        public int getHash() {
            return this.hash;
        }

        public K getKey() {
            return get();
        }

        public E getNext() {
            return this.next;
        }
    }

    static final class DummyInternalEntry implements InternalEntry<Object, Object, DummyInternalEntry> {
        private DummyInternalEntry() {
            throw new AssertionError();
        }

        public final int getHash() {
            throw new AssertionError();
        }

        public final Object getKey() {
            throw new AssertionError();
        }

        public final DummyInternalEntry getNext() {
            throw new AssertionError();
        }

        public final Object getValue() {
            throw new AssertionError();
        }
    }

    final class EntryIterator extends HashIterator<Entry<K, V>> {
        EntryIterator() {
            super();
        }

        public final Entry<K, V> next() {
            return nextEntry();
        }
    }

    final class EntrySet extends SafeToArraySet<Entry<K, V>> {
        EntrySet() {
            super();
        }

        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null) {
                return false;
            }
            key = MapMakerInternalMap.this.get(key);
            return key != null && MapMakerInternalMap.this.valueEquivalence().equivalent(entry.getValue(), key);
        }

        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            return key != null && MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    final class KeyIterator extends HashIterator<K> {
        KeyIterator() {
            super();
        }

        public final K next() {
            return nextEntry().getKey();
        }
    }

    final class KeySet extends SafeToArraySet<K> {
        KeySet() {
            super();
        }

        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public final Iterator<K> iterator() {
            return new KeyIterator();
        }

        public final boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
        StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        /* Access modifiers changed, original: final */
        public final StrongKeyStrongValueSegment<K, V> self() {
            return this;
        }
    }

    interface StrongValueEntry extends InternalEntry {
    }

    final class ValueIterator extends HashIterator<V> {
        ValueIterator() {
            super();
        }

        public final V next() {
            return nextEntry().getValue();
        }
    }

    static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys = new ReferenceQueue();

        WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        /* Access modifiers changed, original: final */
        public final void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        /* Access modifiers changed, original: final */
        public final void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        /* Access modifiers changed, original: final */
        public final WeakKeyStrongValueSegment<K, V> self() {
            return this;
        }
    }

    static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys = new ReferenceQueue();
        private final ReferenceQueue<V> queueForValues = new ReferenceQueue();

        WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        /* Access modifiers changed, original: final */
        public final void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        /* Access modifiers changed, original: final */
        public final void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
            drainValueReferenceQueue(this.queueForValues);
        }

        /* Access modifiers changed, original: final */
        public final WeakKeyWeakValueSegment<K, V> self() {
            return this;
        }
    }

    final class WriteThroughEntry extends AbstractMapEntry<K, V> {
        final K key;
        V value;

        WriteThroughEntry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                if (this.key.equals(entry.getKey()) && this.value.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        public final K getKey() {
            return this.key;
        }

        public final V getValue() {
            return this.value;
        }

        public final int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        public final V setValue(V v) {
            Object put = MapMakerInternalMap.this.put(this.key, v);
            this.value = v;
            return put;
        }
    }

    static final class StrongKeyStrongValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {
        private volatile V value = null;

        static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
            private static final Helper<?, ?> INSTANCE = new Helper();

            Helper() {
            }

            static <K, V> Helper<K, V> instance() {
                return INSTANCE;
            }

            public final StrongKeyStrongValueEntry<K, V> copy(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry2) {
                return strongKeyStrongValueEntry.copy(strongKeyStrongValueEntry2);
            }

            public final StrongKeyStrongValueEntry<K, V> newEntry(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k, int i, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
                return new StrongKeyStrongValueEntry(k, i, strongKeyStrongValueEntry);
            }

            public final StrongKeyStrongValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyStrongValueSegment(mapMakerInternalMap, i, i2);
            }

            public final void setValue(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, V v) {
                strongKeyStrongValueEntry.setValue(v);
            }

            public final Strength valueStrength() {
                return Strength.STRONG;
            }
        }

        StrongKeyStrongValueEntry(K k, int i, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
            super(k, i, strongKeyStrongValueEntry);
        }

        /* Access modifiers changed, original: final */
        public final StrongKeyStrongValueEntry<K, V> copy(StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
            StrongKeyStrongValueEntry strongKeyStrongValueEntry2 = new StrongKeyStrongValueEntry(this.key, this.hash, strongKeyStrongValueEntry);
            strongKeyStrongValueEntry2.value = this.value;
            return strongKeyStrongValueEntry2;
        }

        public final V getValue() {
            return this.value;
        }

        /* Access modifiers changed, original: final */
        public final void setValue(V v) {
            this.value = v;
        }
    }

    static final class WeakKeyStrongValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {
        private volatile V value = null;

        static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {
            private static final Helper<?, ?> INSTANCE = new Helper();

            Helper() {
            }

            static <K, V> Helper<K, V> instance() {
                return INSTANCE;
            }

            public final WeakKeyStrongValueEntry<K, V> copy(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry2) {
                return weakKeyStrongValueEntry.getKey() == null ? null : weakKeyStrongValueEntry.copy(weakKeyStrongValueSegment.queueForKeys, weakKeyStrongValueEntry2);
            }

            public final WeakKeyStrongValueEntry<K, V> newEntry(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k, int i, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
                return new WeakKeyStrongValueEntry(weakKeyStrongValueSegment.queueForKeys, k, i, weakKeyStrongValueEntry);
            }

            public final WeakKeyStrongValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyStrongValueSegment(mapMakerInternalMap, i, i2);
            }

            public final void setValue(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, V v) {
                weakKeyStrongValueEntry.setValue(v);
            }

            public final Strength valueStrength() {
                return Strength.STRONG;
            }
        }

        WeakKeyStrongValueEntry(ReferenceQueue<K> referenceQueue, K k, int i, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
            super(referenceQueue, k, i, weakKeyStrongValueEntry);
        }

        /* Access modifiers changed, original: final */
        public final WeakKeyStrongValueEntry<K, V> copy(ReferenceQueue<K> referenceQueue, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
            WeakKeyStrongValueEntry weakKeyStrongValueEntry2 = new WeakKeyStrongValueEntry(referenceQueue, getKey(), this.hash, weakKeyStrongValueEntry);
            weakKeyStrongValueEntry2.setValue(this.value);
            return weakKeyStrongValueEntry2;
        }

        public final V getValue() {
            return this.value;
        }

        /* Access modifiers changed, original: final */
        public final void setValue(V v) {
            this.value = v;
        }
    }

    static final class WeakKeyWeakValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, WeakKeyWeakValueEntry<K, V>> {
        private volatile WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> valueReference = MapMakerInternalMap.unsetWeakValueReference();

        static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {
            private static final Helper<?, ?> INSTANCE = new Helper();

            Helper() {
            }

            static <K, V> Helper<K, V> instance() {
                return INSTANCE;
            }

            public final WeakKeyWeakValueEntry<K, V> copy(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry2) {
                return (weakKeyWeakValueEntry.getKey() == null || Segment.isCollected(weakKeyWeakValueEntry)) ? null : weakKeyWeakValueEntry.copy(weakKeyWeakValueSegment.queueForKeys, weakKeyWeakValueSegment.queueForValues, weakKeyWeakValueEntry2);
            }

            public final WeakKeyWeakValueEntry<K, V> newEntry(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k, int i, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
                return new WeakKeyWeakValueEntry(weakKeyWeakValueSegment.queueForKeys, k, i, weakKeyWeakValueEntry);
            }

            public final WeakKeyWeakValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyWeakValueSegment(mapMakerInternalMap, i, i2);
            }

            public final void setValue(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, V v) {
                weakKeyWeakValueEntry.setValue(v, weakKeyWeakValueSegment.queueForValues);
            }

            public final Strength valueStrength() {
                return Strength.WEAK;
            }
        }

        WeakKeyWeakValueEntry(ReferenceQueue<K> referenceQueue, K k, int i, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
            super(referenceQueue, k, i, weakKeyWeakValueEntry);
        }

        /* Access modifiers changed, original: final */
        public final WeakKeyWeakValueEntry<K, V> copy(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
            WeakKeyWeakValueEntry weakKeyWeakValueEntry2 = new WeakKeyWeakValueEntry(referenceQueue, getKey(), this.hash, weakKeyWeakValueEntry);
            weakKeyWeakValueEntry2.valueReference = this.valueReference.copyFor(referenceQueue2, weakKeyWeakValueEntry2);
            return weakKeyWeakValueEntry2;
        }

        public final V getValue() {
            return this.valueReference.get();
        }

        public final WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> getValueReference() {
            return this.valueReference;
        }

        /* Access modifiers changed, original: final */
        public final void setValue(V v, ReferenceQueue<V> referenceQueue) {
            WeakValueReference weakValueReference = this.valueReference;
            this.valueReference = new WeakValueReferenceImpl(referenceQueue, v, this);
            weakValueReference.clear();
        }
    }

    private MapMakerInternalMap(MapMaker mapMaker, InternalEntryHelper<K, V, E, S> internalEntryHelper) {
        this.concurrencyLevel = Math.min(mapMaker.getConcurrencyLevel(), Imgproc.FLOODFILL_FIXED_RANGE);
        this.keyEquivalence = mapMaker.getKeyEquivalence();
        this.entryHelper = internalEntryHelper;
        int min = Math.min(mapMaker.getInitialCapacity(), AudioPlayer.INFINITY_LOOP_COUNT);
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.concurrencyLevel) {
            i4++;
            i3 <<= 1;
        }
        this.segmentShift = 32 - i4;
        this.segmentMask = i3 - 1;
        this.segments = newSegmentArray(i3);
        i4 = min / i3;
        if (i3 * i4 < min) {
            i4++;
        }
        while (i2 < i4) {
            i2 <<= 1;
        }
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i < segmentArr.length) {
                segmentArr[i] = createSegment(i2, -1);
                i++;
            } else {
                return;
            }
        }
    }

    static <K, V> MapMakerInternalMap<K, V, ? extends InternalEntry<K, V, ?>, ?> create(MapMaker mapMaker) {
        if (mapMaker.getKeyStrength() == Strength.STRONG && mapMaker.getValueStrength() == Strength.STRONG) {
            return new MapMakerInternalMap(mapMaker, Helper.instance());
        }
        if (mapMaker.getKeyStrength() == Strength.STRONG && mapMaker.getValueStrength() == Strength.WEAK) {
            return new MapMakerInternalMap(mapMaker, Helper.instance());
        }
        if (mapMaker.getKeyStrength() == Strength.WEAK && mapMaker.getValueStrength() == Strength.STRONG) {
            return new MapMakerInternalMap(mapMaker, Helper.instance());
        }
        if (mapMaker.getKeyStrength() == Strength.WEAK && mapMaker.getValueStrength() == Strength.WEAK) {
            return new MapMakerInternalMap(mapMaker, Helper.instance());
        }
        throw new AssertionError();
    }

    static int rehash(int i) {
        i += (i << 15) ^ -12931;
        i ^= i >>> 10;
        i += i << 3;
        i ^= i >>> 6;
        i += (i << 2) + (i << 14);
        return i ^ (i >>> 16);
    }

    private static <E> ArrayList<E> toArrayList(Collection<E> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterators.addAll(arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V, E extends InternalEntry<K, V, E>> WeakValueReference<K, V, E> unsetWeakValueReference() {
        return UNSET_WEAK_VALUE_REFERENCE;
    }

    public void clear() {
        for (Segment clear : this.segments) {
            clear.clear();
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int hash = hash(obj);
        return segmentFor(hash).containsKey(obj, hash);
    }

    public boolean containsValue(Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        Segment[] segmentArr = this.segments;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (Segment segment : segmentArr) {
                int i2 = segment.count;
                AtomicReferenceArray atomicReferenceArray = segment.table;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(i3); internalEntry != null; internalEntry = internalEntry.getNext()) {
                        Object liveValue = segment.getLiveValue(internalEntry);
                        if (liveValue != null && valueEquivalence().equivalent(obj2, liveValue)) {
                            return true;
                        }
                    }
                }
                j2 += (long) segment.modCount;
            }
            if (j2 == j) {
                break;
            }
            i++;
            j = j2;
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public Segment<K, V, E, S> createSegment(int i, int i2) {
        return this.entryHelper.newSegment(this, i, i2);
    }

    public Set<Entry<K, V>> entrySet() {
        Set set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).get(obj, hash);
    }

    /* Access modifiers changed, original: 0000 */
    public V getLiveValue(E e) {
        if (e.getKey() == null) {
            return null;
        }
        Object value = e.getValue();
        return value == null ? null : value;
    }

    /* Access modifiers changed, original: 0000 */
    public int hash(Object obj) {
        return rehash(this.keyEquivalence.hash(obj));
    }

    public boolean isEmpty() {
        int i;
        Segment[] segmentArr = this.segments;
        long j = 0;
        for (i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += (long) segmentArr[i].modCount;
        }
        if (j != 0) {
            for (i = 0; i < segmentArr.length; i++) {
                if (segmentArr[i].count != 0) {
                    return false;
                }
                j -= (long) segmentArr[i].modCount;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public Set<K> keySet() {
        Set set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    /* Access modifiers changed, original: final */
    public final Segment<K, V, E, S>[] newSegmentArray(int i) {
        return new Segment[i];
    }

    public V put(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public V putIfAbsent(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, true);
    }

    /* Access modifiers changed, original: 0000 */
    public void reclaimKey(E e) {
        int hash = e.getHash();
        segmentFor(hash).reclaimKey(e, hash);
    }

    /* Access modifiers changed, original: 0000 */
    public void reclaimValue(WeakValueReference<K, V, E> weakValueReference) {
        InternalEntry entry = weakValueReference.getEntry();
        int hash = entry.getHash();
        segmentFor(hash).reclaimValue(entry.getKey(), hash, weakValueReference);
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash, obj2);
    }

    public V replace(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v);
    }

    public boolean replace(K k, V v, V v2) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v2);
        if (v == null) {
            return false;
        }
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v, v2);
    }

    /* Access modifiers changed, original: 0000 */
    public Segment<K, V, E, S> segmentFor(int i) {
        return this.segments[(i >>> this.segmentShift) & this.segmentMask];
    }

    public int size() {
        long j = 0;
        for (Segment segment : this.segments) {
            j += (long) segment.count;
        }
        return Ints.saturatedCast(j);
    }

    /* Access modifiers changed, original: 0000 */
    public Equivalence<Object> valueEquivalence() {
        return this.entryHelper.valueStrength().defaultEquivalence();
    }

    public Collection<V> values() {
        Collection collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.values = values;
        return values;
    }
}
