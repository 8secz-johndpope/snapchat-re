package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache.StatsCounter;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opencv.imgproc.Imgproc;

class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    static final Queue<?> DISCARDING_QUEUE = new AbstractQueue<Object>() {
        public final Iterator<Object> iterator() {
            return ImmutableSet.of().iterator();
        }

        public final boolean offer(Object obj) {
            return true;
        }

        public final Object peek() {
            return null;
        }

        public final Object poll() {
            return null;
        }

        public final int size() {
            return 0;
        }
    };
    static final ValueReference<Object, Object> UNSET = new ValueReference<Object, Object>() {
        public final ValueReference<Object, Object> copyFor(ReferenceQueue<Object> referenceQueue, Object obj, ReferenceEntry<Object, Object> referenceEntry) {
            return this;
        }

        public final Object get() {
            return null;
        }

        public final ReferenceEntry<Object, Object> getEntry() {
            return null;
        }

        public final int getWeight() {
            return 0;
        }

        public final boolean isActive() {
            return false;
        }

        public final boolean isLoading() {
            return false;
        }

        public final void notifyNewValue(Object obj) {
        }

        public final Object waitForValue() {
            return null;
        }
    };
    static final Logger logger = Logger.getLogger(LocalCache.class.getName());
    final int concurrencyLevel;
    final CacheLoader<? super K, V> defaultLoader;
    final EntryFactory entryFactory;
    Set<Entry<K, V>> entrySet;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final StatsCounter globalStatsCounter;
    final Equivalence<Object> keyEquivalence;
    Set<K> keySet;
    final Strength keyStrength;
    final long maxWeight;
    final long refreshNanos;
    final RemovalListener<K, V> removalListener;
    final Queue<RemovalNotification<K, V>> removalNotificationQueue;
    final int segmentMask;
    final int segmentShift;
    final Segment<K, V>[] segments;
    final Ticker ticker;
    final Equivalence<Object> valueEquivalence;
    final Strength valueStrength;
    Collection<V> values;
    final Weigher<K, V> weigher;

    static class LoadingValueReference<K, V> implements ValueReference<K, V> {
        final SettableFuture<V> futureValue;
        volatile ValueReference<K, V> oldValue;
        final Stopwatch stopwatch;

        public LoadingValueReference() {
            this(LocalCache.unset());
        }

        public LoadingValueReference(ValueReference<K, V> valueReference) {
            this.futureValue = SettableFuture.create();
            this.stopwatch = Stopwatch.createUnstarted();
            this.oldValue = valueReference;
        }

        private ListenableFuture<V> fullyFailedFuture(Throwable th) {
            return Futures.immediateFailedFuture(th);
        }

        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        public long elapsedNanos() {
            return this.stopwatch.elapsed(TimeUnit.NANOSECONDS);
        }

        public V get() {
            return this.oldValue.get();
        }

        public ReferenceEntry<K, V> getEntry() {
            return null;
        }

        public ValueReference<K, V> getOldValue() {
            return this.oldValue;
        }

        public int getWeight() {
            return this.oldValue.getWeight();
        }

        public boolean isActive() {
            return this.oldValue.isActive();
        }

        public boolean isLoading() {
            return true;
        }

        public ListenableFuture<V> loadFuture(K k, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.stopwatch.start();
                Object obj = this.oldValue.get();
                if (obj == null) {
                    Object load = cacheLoader.load(k);
                    return set(load) ? this.futureValue : Futures.immediateFuture(load);
                } else {
                    ListenableFuture reload = cacheLoader.reload(k, obj);
                    return reload == null ? Futures.immediateFuture(null) : Futures.transform(reload, new Function<V, V>() {
                        public V apply(V v) {
                            LoadingValueReference.this.set(v);
                            return v;
                        }
                    }, MoreExecutors.directExecutor());
                }
            } catch (Throwable th) {
                ListenableFuture<V> fullyFailedFuture = setException(th) ? this.futureValue : fullyFailedFuture(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return fullyFailedFuture;
            }
        }

        public void notifyNewValue(V v) {
            if (v != null) {
                set(v);
            } else {
                this.oldValue = LocalCache.unset();
            }
        }

        public boolean set(V v) {
            return this.futureValue.set(v);
        }

        public boolean setException(Throwable th) {
            return this.futureValue.setException(th);
        }

        public V waitForValue() {
            return Uninterruptibles.getUninterruptibly(this.futureValue);
        }
    }

    enum EntryFactory {
        STRONG {
            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongEntry(k, i, referenceEntry);
            }
        },
        STRONG_ACCESS {
            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyAccessEntry(referenceEntry, copyEntry);
                return copyEntry;
            }

            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessEntry(k, i, referenceEntry);
            }
        },
        STRONG_WRITE {
            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyWriteEntry(referenceEntry, copyEntry);
                return copyEntry;
            }

            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongWriteEntry(k, i, referenceEntry);
            }
        },
        STRONG_ACCESS_WRITE {
            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyAccessEntry(referenceEntry, copyEntry);
                copyWriteEntry(referenceEntry, copyEntry);
                return copyEntry;
            }

            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessWriteEntry(k, i, referenceEntry);
            }
        },
        WEAK {
            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        },
        WEAK_ACCESS {
            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyAccessEntry(referenceEntry, copyEntry);
                return copyEntry;
            }

            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        },
        WEAK_WRITE {
            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyWriteEntry(referenceEntry, copyEntry);
                return copyEntry;
            }

            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakWriteEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        },
        WEAK_ACCESS_WRITE {
            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry copyEntry = super.copyEntry(segment, referenceEntry, referenceEntry2);
                copyAccessEntry(referenceEntry, copyEntry);
                copyWriteEntry(referenceEntry, copyEntry);
                return copyEntry;
            }

            /* Access modifiers changed, original: final */
            public final <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessWriteEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        };
        
        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final EntryFactory[] factories = null;

        static {
            factories = new EntryFactory[]{r10, r11, r12, r13, r14, r15, r16, r17};
        }

        static EntryFactory getFactory(Strength strength, boolean z, boolean z2) {
            int i = 0;
            int i2 = (strength == Strength.WEAK ? 4 : 0) | z;
            if (z2) {
                i = 2;
            }
            return factories[i2 | i];
        }

        /* Access modifiers changed, original: 0000 */
        public <K, V> void copyAccessEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setAccessTime(referenceEntry.getAccessTime());
            LocalCache.connectAccessOrder(referenceEntry.getPreviousInAccessQueue(), referenceEntry2);
            LocalCache.connectAccessOrder(referenceEntry2, referenceEntry.getNextInAccessQueue());
            LocalCache.nullifyAccessOrder(referenceEntry);
        }

        /* Access modifiers changed, original: 0000 */
        public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            return newEntry(segment, referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
        }

        /* Access modifiers changed, original: 0000 */
        public <K, V> void copyWriteEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setWriteTime(referenceEntry.getWriteTime());
            LocalCache.connectWriteOrder(referenceEntry.getPreviousInWriteQueue(), referenceEntry2);
            LocalCache.connectWriteOrder(referenceEntry2, referenceEntry.getNextInWriteQueue());
            LocalCache.nullifyWriteOrder(referenceEntry);
        }

        public abstract <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry);
    }

    static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements LoadingCache<K, V> {
        LocalLoadingCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super(new LocalCache(cacheBuilder, (CacheLoader) Preconditions.checkNotNull(cacheLoader)), null);
        }

        public final V apply(K k) {
            return getUnchecked(k);
        }

        public V get(K k) {
            return this.localCache.getOrLoad(k);
        }

        public V getUnchecked(K k) {
            try {
                return get(k);
            } catch (ExecutionException e) {
                throw new UncheckedExecutionException(e.getCause());
            }
        }
    }

    static class StrongValueReference<K, V> implements ValueReference<K, V> {
        final V referent;

        StrongValueReference(V v) {
            this.referent = v;
        }

        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        public V get() {
            return this.referent;
        }

        public ReferenceEntry<K, V> getEntry() {
            return null;
        }

        public int getWeight() {
            return 1;
        }

        public boolean isActive() {
            return true;
        }

        public boolean isLoading() {
            return false;
        }

        public void notifyNewValue(V v) {
        }

        public V waitForValue() {
            return get();
        }
    }

    enum Strength {
        STRONG {
            /* Access modifiers changed, original: final */
            public final Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }

            /* Access modifiers changed, original: final */
            public final <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                return i == 1 ? new StrongValueReference(v) : new WeightedStrongValueReference(v, i);
            }
        },
        SOFT {
            /* Access modifiers changed, original: final */
            public final Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            /* Access modifiers changed, original: final */
            public final <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                return i == 1 ? new SoftValueReference(segment.valueReferenceQueue, v, referenceEntry) : new WeightedSoftValueReference(segment.valueReferenceQueue, v, referenceEntry, i);
            }
        },
        WEAK {
            /* Access modifiers changed, original: final */
            public final Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            /* Access modifiers changed, original: final */
            public final <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                return i == 1 ? new WeakValueReference(segment.valueReferenceQueue, v, referenceEntry) : new WeightedWeakValueReference(segment.valueReferenceQueue, v, referenceEntry, i);
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();

        public abstract <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i);
    }

    static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {
        final LocalCache<K, V> localCache;

        LocalManualCache(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new LocalCache(cacheBuilder, null));
        }

        private LocalManualCache(LocalCache<K, V> localCache) {
            this.localCache = localCache;
        }

        /* synthetic */ LocalManualCache(LocalCache localCache, AnonymousClass1 anonymousClass1) {
            this(localCache);
        }

        public ConcurrentMap<K, V> asMap() {
            return this.localCache;
        }

        public V getIfPresent(Object obj) {
            return this.localCache.getIfPresent(obj);
        }

        public void invalidate(Object obj) {
            Preconditions.checkNotNull(obj);
            this.localCache.remove(obj);
        }

        public void invalidateAll() {
            this.localCache.clear();
        }

        public void put(K k, V v) {
            this.localCache.put(k, v);
        }

        public long size() {
            return this.localCache.longSize();
        }
    }

    interface ValueReference<K, V> {
        ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry);

        V get();

        ReferenceEntry<K, V> getEntry();

        int getWeight();

        boolean isActive();

        boolean isLoading();

        void notifyNewValue(V v);

        V waitForValue();
    }

    static class Segment<K, V> extends ReentrantLock {
        @GuardedBy("this")
        final Queue<ReferenceEntry<K, V>> accessQueue;
        volatile int count;
        final ReferenceQueue<K> keyReferenceQueue;
        final LocalCache<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<ReferenceEntry<K, V>> recencyQueue;
        final StatsCounter statsCounter;
        volatile AtomicReferenceArray<ReferenceEntry<K, V>> table;
        int threshold;
        @GuardedBy("this")
        long totalWeight;
        final ReferenceQueue<V> valueReferenceQueue;
        @GuardedBy("this")
        final Queue<ReferenceEntry<K, V>> writeQueue;

        Segment(LocalCache<K, V> localCache, int i, long j, StatsCounter statsCounter) {
            this.map = localCache;
            this.maxSegmentWeight = j;
            this.statsCounter = (StatsCounter) Preconditions.checkNotNull(statsCounter);
            initTable(newEntryArray(i));
            ReferenceQueue referenceQueue = null;
            this.keyReferenceQueue = localCache.usesKeyReferences() ? new ReferenceQueue() : null;
            if (localCache.usesValueReferences()) {
                referenceQueue = new ReferenceQueue();
            }
            this.valueReferenceQueue = referenceQueue;
            this.recencyQueue = localCache.usesAccessQueue() ? new ConcurrentLinkedQueue() : LocalCache.discardingQueue();
            this.writeQueue = localCache.usesWriteQueue() ? new WriteQueue() : LocalCache.discardingQueue();
            this.accessQueue = localCache.usesAccessQueue() ? new AccessQueue() : LocalCache.discardingQueue();
        }

        /* Access modifiers changed, original: 0000 */
        public void cleanUp() {
            runLockedCleanup(this.map.ticker.read());
            runUnlockedCleanup();
        }

        /* Access modifiers changed, original: 0000 */
        public void clear() {
            if (this.count != 0) {
                lock();
                try {
                    int i;
                    preWriteCleanup(this.map.ticker.read());
                    AtomicReferenceArray atomicReferenceArray = this.table;
                    for (i = 0; i < atomicReferenceArray.length(); i++) {
                        for (ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                            if (referenceEntry.getValueReference().isActive()) {
                                RemovalCause removalCause;
                                Object key = referenceEntry.getKey();
                                Object obj = referenceEntry.getValueReference().get();
                                if (key != null) {
                                    if (obj != null) {
                                        removalCause = RemovalCause.EXPLICIT;
                                        enqueueNotification(key, referenceEntry.getHash(), obj, referenceEntry.getValueReference().getWeight(), removalCause);
                                    }
                                }
                                removalCause = RemovalCause.COLLECTED;
                                enqueueNotification(key, referenceEntry.getHash(), obj, referenceEntry.getValueReference().getWeight(), removalCause);
                            }
                        }
                    }
                    for (i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    clearReferenceQueues();
                    this.writeQueue.clear();
                    this.accessQueue.clear();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                    postWriteCleanup();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void clearKeyReferenceQueue() {
            do {
            } while (this.keyReferenceQueue.poll() != null);
        }

        /* Access modifiers changed, original: 0000 */
        public void clearReferenceQueues() {
            if (this.map.usesKeyReferences()) {
                clearKeyReferenceQueue();
            }
            if (this.map.usesValueReferences()) {
                clearValueReferenceQueue();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void clearValueReferenceQueue() {
            do {
            } while (this.valueReferenceQueue.poll() != null);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean containsKey(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    ReferenceEntry liveEntry = getLiveEntry(obj, i, this.map.ticker.read());
                    if (liveEntry == null) {
                        return z;
                    }
                    if (liveEntry.getValueReference().get() != null) {
                        z = true;
                    }
                    postReadCleanup();
                    return z;
                }
                postReadCleanup();
                return z;
            } finally {
                postReadCleanup();
            }
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public ReferenceEntry<K, V> copyEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            if (referenceEntry.getKey() == null) {
                return null;
            }
            ValueReference valueReference = referenceEntry.getValueReference();
            Object obj = valueReference.get();
            if (obj == null && valueReference.isActive()) {
                return null;
            }
            ReferenceEntry copyEntry = this.map.entryFactory.copyEntry(this, referenceEntry, referenceEntry2);
            copyEntry.setValueReference(valueReference.copyFor(this.valueReferenceQueue, obj, copyEntry));
            return copyEntry;
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void drainKeyReferenceQueue() {
            int i = 0;
            do {
                Reference poll = this.keyReferenceQueue.poll();
                if (poll != null) {
                    this.map.reclaimKey((ReferenceEntry) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void drainRecencyQueue() {
            while (true) {
                ReferenceEntry referenceEntry = (ReferenceEntry) this.recencyQueue.poll();
                if (referenceEntry == null) {
                    return;
                }
                if (this.accessQueue.contains(referenceEntry)) {
                    this.accessQueue.add(referenceEntry);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void drainReferenceQueues() {
            if (this.map.usesKeyReferences()) {
                drainKeyReferenceQueue();
            }
            if (this.map.usesValueReferences()) {
                drainValueReferenceQueue();
            }
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void drainValueReferenceQueue() {
            int i = 0;
            do {
                Reference poll = this.valueReferenceQueue.poll();
                if (poll != null) {
                    this.map.reclaimValue((ValueReference) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void enqueueNotification(K k, int i, V v, int i2, RemovalCause removalCause) {
            this.totalWeight -= (long) i2;
            if (removalCause.wasEvicted()) {
                this.statsCounter.recordEviction();
            }
            if (this.map.removalNotificationQueue != LocalCache.DISCARDING_QUEUE) {
                this.map.removalNotificationQueue.offer(RemovalNotification.create(k, v, removalCause));
            }
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void evictEntries(ReferenceEntry<K, V> referenceEntry) {
            if (this.map.evictsBySize()) {
                drainRecencyQueue();
                if (((long) referenceEntry.getValueReference().getWeight()) <= this.maxSegmentWeight || removeEntry(referenceEntry, referenceEntry.getHash(), RemovalCause.SIZE)) {
                    while (this.totalWeight > this.maxSegmentWeight) {
                        ReferenceEntry nextEvictable = getNextEvictable();
                        if (!removeEntry(nextEvictable, nextEvictable.getHash(), RemovalCause.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
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
                    ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i2);
                    if (referenceEntry != null) {
                        ReferenceEntry next = referenceEntry.getNext();
                        int hash = referenceEntry.getHash() & length2;
                        if (next == null) {
                            newEntryArray.set(hash, referenceEntry);
                        } else {
                            ReferenceEntry referenceEntry2 = referenceEntry;
                            while (next != null) {
                                int hash2 = next.getHash() & length2;
                                if (hash2 != hash) {
                                    referenceEntry2 = next;
                                    hash = hash2;
                                }
                                next = next.getNext();
                            }
                            newEntryArray.set(hash, referenceEntry2);
                            while (referenceEntry != referenceEntry2) {
                                int hash3 = referenceEntry.getHash() & length2;
                                ReferenceEntry copyEntry = copyEntry(referenceEntry, (ReferenceEntry) newEntryArray.get(hash3));
                                if (copyEntry != null) {
                                    newEntryArray.set(hash3, copyEntry);
                                } else {
                                    removeCollectedEntry(referenceEntry);
                                    i--;
                                }
                                referenceEntry = referenceEntry.getNext();
                            }
                        }
                    }
                }
                this.table = newEntryArray;
                this.count = i;
            }
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void expireEntries(long j) {
            ReferenceEntry referenceEntry;
            drainRecencyQueue();
            while (true) {
                referenceEntry = (ReferenceEntry) this.writeQueue.peek();
                if (referenceEntry == null || !this.map.isExpired(referenceEntry, j)) {
                    while (true) {
                        referenceEntry = (ReferenceEntry) this.accessQueue.peek();
                    }
                } else if (!removeEntry(referenceEntry, referenceEntry.getHash(), RemovalCause.EXPIRED)) {
                    throw new AssertionError();
                }
            }
            while (true) {
                referenceEntry = (ReferenceEntry) this.accessQueue.peek();
                if (referenceEntry != null && this.map.isExpired(referenceEntry, j)) {
                    if (!removeEntry(referenceEntry, referenceEntry.getHash(), RemovalCause.EXPIRED)) {
                        throw new AssertionError();
                    }
                } else {
                    return;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V get(Object obj, int i) {
            try {
                V v = null;
                if (this.count != 0) {
                    long read = this.map.ticker.read();
                    ReferenceEntry liveEntry = getLiveEntry(obj, i, read);
                    if (liveEntry == null) {
                        return v;
                    }
                    Object obj2 = liveEntry.getValueReference().get();
                    if (obj2 != null) {
                        recordRead(liveEntry, read);
                        obj = scheduleRefresh(liveEntry, liveEntry.getKey(), i, obj2, read, this.map.defaultLoader);
                        postReadCleanup();
                        return obj;
                    }
                    tryDrainReferenceQueues();
                }
                postReadCleanup();
                return v;
            } finally {
                postReadCleanup();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V get(K k, int i, CacheLoader<? super K, V> cacheLoader) {
            Preconditions.checkNotNull(k);
            Preconditions.checkNotNull(cacheLoader);
            try {
                Object scheduleRefresh;
                if (this.count != 0) {
                    ReferenceEntry entry = getEntry(k, i);
                    if (entry != null) {
                        long read = this.map.ticker.read();
                        Object liveValue = getLiveValue(entry, read);
                        if (liveValue != null) {
                            recordRead(entry, read);
                            this.statsCounter.recordHits(1);
                            scheduleRefresh = scheduleRefresh(entry, k, i, liveValue, read, cacheLoader);
                            postReadCleanup();
                            return scheduleRefresh;
                        }
                        ValueReference valueReference = entry.getValueReference();
                        if (valueReference.isLoading()) {
                            scheduleRefresh = waitForLoadingValue(entry, k, valueReference);
                            postReadCleanup();
                            return scheduleRefresh;
                        }
                    }
                }
                scheduleRefresh = lockedGetOrLoad(k, i, cacheLoader);
                postReadCleanup();
                return scheduleRefresh;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw new ExecutionError((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw new UncheckedExecutionException(cause);
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                postReadCleanup();
            }
        }

        /* Access modifiers changed, original: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
        public V getAndRecordStats(K r4, int r5, com.google.common.cache.LocalCache.LoadingValueReference<K, V> r6, com.google.common.util.concurrent.ListenableFuture<V> r7) {
            /*
            r3 = this;
            r7 = com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r7);	 Catch:{ all -> 0x003c }
            if (r7 == 0) goto L_0x0023;
        L_0x0006:
            r0 = r3.statsCounter;	 Catch:{ all -> 0x0021 }
            r1 = r6.elapsedNanos();	 Catch:{ all -> 0x0021 }
            r0.recordLoadSuccess(r1);	 Catch:{ all -> 0x0021 }
            r3.storeLoadedValue(r4, r5, r6, r7);	 Catch:{ all -> 0x0021 }
            if (r7 != 0) goto L_0x0020;
        L_0x0014:
            r0 = r3.statsCounter;
            r1 = r6.elapsedNanos();
            r0.recordLoadException(r1);
            r3.removeLoadingValue(r4, r5, r6);
        L_0x0020:
            return r7;
        L_0x0021:
            r0 = move-exception;
            goto L_0x003e;
        L_0x0023:
            r0 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException;	 Catch:{ all -> 0x0021 }
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0021 }
            r2 = "CacheLoader returned null for key ";
            r1.<init>(r2);	 Catch:{ all -> 0x0021 }
            r1.append(r4);	 Catch:{ all -> 0x0021 }
            r2 = ".";
            r1.append(r2);	 Catch:{ all -> 0x0021 }
            r1 = r1.toString();	 Catch:{ all -> 0x0021 }
            r0.<init>(r1);	 Catch:{ all -> 0x0021 }
            throw r0;	 Catch:{ all -> 0x0021 }
        L_0x003c:
            r0 = move-exception;
            r7 = 0;
        L_0x003e:
            if (r7 != 0) goto L_0x004c;
        L_0x0040:
            r7 = r3.statsCounter;
            r1 = r6.elapsedNanos();
            r7.recordLoadException(r1);
            r3.removeLoadingValue(r4, r5, r6);
        L_0x004c:
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.getAndRecordStats(java.lang.Object, int, com.google.common.cache.LocalCache$LoadingValueReference, com.google.common.util.concurrent.ListenableFuture):java.lang.Object");
        }

        /* Access modifiers changed, original: 0000 */
        public ReferenceEntry<K, V> getEntry(Object obj, int i) {
            for (ReferenceEntry first = getFirst(i); first != null; first = first.getNext()) {
                if (first.getHash() == i) {
                    Object key = first.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        return first;
                    }
                }
            }
            return null;
        }

        /* Access modifiers changed, original: 0000 */
        public ReferenceEntry<K, V> getFirst(int i) {
            AtomicReferenceArray atomicReferenceArray = this.table;
            return (ReferenceEntry) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* Access modifiers changed, original: 0000 */
        public ReferenceEntry<K, V> getLiveEntry(Object obj, int i, long j) {
            ReferenceEntry entry = getEntry(obj, i);
            if (entry == null) {
                return null;
            }
            if (!this.map.isExpired(entry, j)) {
                return entry;
            }
            tryExpireEntries(j);
            return null;
        }

        /* Access modifiers changed, original: 0000 */
        public V getLiveValue(ReferenceEntry<K, V> referenceEntry, long j) {
            if (referenceEntry.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            Object obj = referenceEntry.getValueReference().get();
            if (obj == null) {
                tryDrainReferenceQueues();
                return null;
            } else if (!this.map.isExpired(referenceEntry, j)) {
                return obj;
            } else {
                tryExpireEntries(j);
                return null;
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:8:0x0023 in {5, 7} preds:[]
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
        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        com.google.common.cache.ReferenceEntry<K, V> getNextEvictable() {
            /*
            r3 = this;
            r0 = r3.accessQueue;
            r0 = r0.iterator();
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x001d;
            r1 = r0.next();
            r1 = (com.google.common.cache.ReferenceEntry) r1;
            r2 = r1.getValueReference();
            r2 = r2.getWeight();
            if (r2 <= 0) goto L_0x0006;
            return r1;
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.getNextEvictable():com.google.common.cache.ReferenceEntry");
        }

        /* Access modifiers changed, original: 0000 */
        public void initTable(AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            if (!this.map.customWeigher()) {
                int i = this.threshold;
                if (((long) i) == this.maxSegmentWeight) {
                    this.threshold = i + 1;
                }
            }
            this.table = atomicReferenceArray;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0096 in {14, 17, 19, 21, 24, 27} preds:[]
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
        com.google.common.cache.LocalCache.LoadingValueReference<K, V> insertLoadingValueReference(K r9, int r10, boolean r11) {
            /*
            r8 = this;
            r8.lock();
            r0 = r8.map;	 Catch:{ all -> 0x008e }
            r0 = r0.ticker;	 Catch:{ all -> 0x008e }
            r0 = r0.read();	 Catch:{ all -> 0x008e }
            r8.preWriteCleanup(r0);	 Catch:{ all -> 0x008e }
            r2 = r8.table;	 Catch:{ all -> 0x008e }
            r3 = r2.length();	 Catch:{ all -> 0x008e }
            r3 = r3 + -1;	 Catch:{ all -> 0x008e }
            r3 = r3 & r10;	 Catch:{ all -> 0x008e }
            r4 = r2.get(r3);	 Catch:{ all -> 0x008e }
            r4 = (com.google.common.cache.ReferenceEntry) r4;	 Catch:{ all -> 0x008e }
            r5 = r4;	 Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x0072;	 Catch:{ all -> 0x008e }
            r6 = r5.getKey();	 Catch:{ all -> 0x008e }
            r7 = r5.getHash();	 Catch:{ all -> 0x008e }
            if (r7 != r10) goto L_0x006d;	 Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x006d;	 Catch:{ all -> 0x008e }
            r7 = r8.map;	 Catch:{ all -> 0x008e }
            r7 = r7.keyEquivalence;	 Catch:{ all -> 0x008e }
            r6 = r7.equivalent(r9, r6);	 Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x006d;	 Catch:{ all -> 0x008e }
            r9 = r5.getValueReference();	 Catch:{ all -> 0x008e }
            r10 = r9.isLoading();	 Catch:{ all -> 0x008e }
            if (r10 != 0) goto L_0x0065;	 Catch:{ all -> 0x008e }
            if (r11 == 0) goto L_0x0050;	 Catch:{ all -> 0x008e }
            r10 = r5.getWriteTime();	 Catch:{ all -> 0x008e }
            r0 = r0 - r10;	 Catch:{ all -> 0x008e }
            r10 = r8.map;	 Catch:{ all -> 0x008e }
            r10 = r10.refreshNanos;	 Catch:{ all -> 0x008e }
            r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));	 Catch:{ all -> 0x008e }
            if (r2 >= 0) goto L_0x0050;	 Catch:{ all -> 0x008e }
            goto L_0x0065;	 Catch:{ all -> 0x008e }
            r10 = r8.modCount;	 Catch:{ all -> 0x008e }
            r10 = r10 + 1;	 Catch:{ all -> 0x008e }
            r8.modCount = r10;	 Catch:{ all -> 0x008e }
            r10 = new com.google.common.cache.LocalCache$LoadingValueReference;	 Catch:{ all -> 0x008e }
            r10.<init>(r9);	 Catch:{ all -> 0x008e }
            r5.setValueReference(r10);	 Catch:{ all -> 0x008e }
            r8.unlock();
            r8.postWriteCleanup();
            return r10;
            r8.unlock();
            r8.postWriteCleanup();
            r9 = 0;
            return r9;
            r5 = r5.getNext();	 Catch:{ all -> 0x008e }
            goto L_0x001e;	 Catch:{ all -> 0x008e }
            r11 = r8.modCount;	 Catch:{ all -> 0x008e }
            r11 = r11 + 1;	 Catch:{ all -> 0x008e }
            r8.modCount = r11;	 Catch:{ all -> 0x008e }
            r11 = new com.google.common.cache.LocalCache$LoadingValueReference;	 Catch:{ all -> 0x008e }
            r11.<init>();	 Catch:{ all -> 0x008e }
            r9 = r8.newEntry(r9, r10, r4);	 Catch:{ all -> 0x008e }
            r9.setValueReference(r11);	 Catch:{ all -> 0x008e }
            r2.set(r3, r9);	 Catch:{ all -> 0x008e }
            r8.unlock();
            r8.postWriteCleanup();
            return r11;
            r9 = move-exception;
            r8.unlock();
            r8.postWriteCleanup();
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.insertLoadingValueReference(java.lang.Object, int, boolean):com.google.common.cache.LocalCache$LoadingValueReference");
        }

        /* Access modifiers changed, original: 0000 */
        public ListenableFuture<V> loadAsync(K k, int i, LoadingValueReference<K, V> loadingValueReference, CacheLoader<? super K, V> cacheLoader) {
            ListenableFuture loadFuture = loadingValueReference.loadFuture(k, cacheLoader);
            final K k2 = k;
            final int i2 = i;
            final LoadingValueReference<K, V> loadingValueReference2 = loadingValueReference;
            final ListenableFuture listenableFuture = loadFuture;
            loadFuture.addListener(new Runnable() {
                public void run() {
                    try {
                        Segment.this.getAndRecordStats(k2, i2, loadingValueReference2, listenableFuture);
                    } catch (Throwable th) {
                        LocalCache.logger.log(Level.WARNING, "Exception thrown during refresh", th);
                        loadingValueReference2.setException(th);
                    }
                }
            }, MoreExecutors.directExecutor());
            return loadFuture;
        }

        /* Access modifiers changed, original: 0000 */
        public V loadSync(K k, int i, LoadingValueReference<K, V> loadingValueReference, CacheLoader<? super K, V> cacheLoader) {
            return getAndRecordStats(k, i, loadingValueReference, loadingValueReference.loadFuture(k, cacheLoader));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:56:0x00de in {12, 15, 19, 20, 23, 25, 26, 27, 31, 32, 42, 47, 50, 52, 55} preds:[]
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
        V lockedGetOrLoad(K r18, int r19, com.google.common.cache.CacheLoader<? super K, V> r20) {
            /*
            r17 = this;
            r7 = r17;
            r0 = r18;
            r8 = r19;
            r17.lock();
            r1 = r7.map;	 Catch:{ all -> 0x00d6 }
            r1 = r1.ticker;	 Catch:{ all -> 0x00d6 }
            r1 = r1.read();	 Catch:{ all -> 0x00d6 }
            r7.preWriteCleanup(r1);	 Catch:{ all -> 0x00d6 }
            r3 = r7.count;	 Catch:{ all -> 0x00d6 }
            r9 = 1;	 Catch:{ all -> 0x00d6 }
            r10 = r3 + -1;	 Catch:{ all -> 0x00d6 }
            r11 = r7.table;	 Catch:{ all -> 0x00d6 }
            r3 = r11.length();	 Catch:{ all -> 0x00d6 }
            r3 = r3 - r9;	 Catch:{ all -> 0x00d6 }
            r12 = r8 & r3;	 Catch:{ all -> 0x00d6 }
            r3 = r11.get(r12);	 Catch:{ all -> 0x00d6 }
            r13 = r3;	 Catch:{ all -> 0x00d6 }
            r13 = (com.google.common.cache.ReferenceEntry) r13;	 Catch:{ all -> 0x00d6 }
            r14 = r13;	 Catch:{ all -> 0x00d6 }
            r15 = 0;	 Catch:{ all -> 0x00d6 }
            if (r14 == 0) goto L_0x0098;	 Catch:{ all -> 0x00d6 }
            r3 = r14.getKey();	 Catch:{ all -> 0x00d6 }
            r4 = r14.getHash();	 Catch:{ all -> 0x00d6 }
            if (r4 != r8) goto L_0x0093;	 Catch:{ all -> 0x00d6 }
            if (r3 == 0) goto L_0x0093;	 Catch:{ all -> 0x00d6 }
            r4 = r7.map;	 Catch:{ all -> 0x00d6 }
            r4 = r4.keyEquivalence;	 Catch:{ all -> 0x00d6 }
            r4 = r4.equivalent(r0, r3);	 Catch:{ all -> 0x00d6 }
            if (r4 == 0) goto L_0x0093;	 Catch:{ all -> 0x00d6 }
            r16 = r14.getValueReference();	 Catch:{ all -> 0x00d6 }
            r4 = r16.isLoading();	 Catch:{ all -> 0x00d6 }
            if (r4 == 0) goto L_0x0051;	 Catch:{ all -> 0x00d6 }
            r1 = 0;	 Catch:{ all -> 0x00d6 }
            r2 = r16;	 Catch:{ all -> 0x00d6 }
            goto L_0x009a;	 Catch:{ all -> 0x00d6 }
            r4 = r16.get();	 Catch:{ all -> 0x00d6 }
            if (r4 != 0) goto L_0x0066;	 Catch:{ all -> 0x00d6 }
            r5 = r16.getWeight();	 Catch:{ all -> 0x00d6 }
            r6 = com.google.common.cache.RemovalCause.COLLECTED;	 Catch:{ all -> 0x00d6 }
            r1 = r17;	 Catch:{ all -> 0x00d6 }
            r2 = r3;	 Catch:{ all -> 0x00d6 }
            r3 = r19;	 Catch:{ all -> 0x00d6 }
            r1.enqueueNotification(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00d6 }
            goto L_0x0075;	 Catch:{ all -> 0x00d6 }
            r5 = r7.map;	 Catch:{ all -> 0x00d6 }
            r5 = r5.isExpired(r14, r1);	 Catch:{ all -> 0x00d6 }
            if (r5 == 0) goto L_0x0084;	 Catch:{ all -> 0x00d6 }
            r5 = r16.getWeight();	 Catch:{ all -> 0x00d6 }
            r6 = com.google.common.cache.RemovalCause.EXPIRED;	 Catch:{ all -> 0x00d6 }
            goto L_0x005d;	 Catch:{ all -> 0x00d6 }
            r1 = r7.writeQueue;	 Catch:{ all -> 0x00d6 }
            r1.remove(r14);	 Catch:{ all -> 0x00d6 }
            r1 = r7.accessQueue;	 Catch:{ all -> 0x00d6 }
            r1.remove(r14);	 Catch:{ all -> 0x00d6 }
            r7.count = r10;	 Catch:{ all -> 0x00d6 }
            r2 = r16;	 Catch:{ all -> 0x00d6 }
            goto L_0x0099;	 Catch:{ all -> 0x00d6 }
            r7.recordLockedRead(r14, r1);	 Catch:{ all -> 0x00d6 }
            r0 = r7.statsCounter;	 Catch:{ all -> 0x00d6 }
            r0.recordHits(r9);	 Catch:{ all -> 0x00d6 }
            r17.unlock();
            r17.postWriteCleanup();
            return r4;
            r14 = r14.getNext();	 Catch:{ all -> 0x00d6 }
            goto L_0x002a;	 Catch:{ all -> 0x00d6 }
            r2 = r15;	 Catch:{ all -> 0x00d6 }
            r1 = 1;	 Catch:{ all -> 0x00d6 }
            if (r1 == 0) goto L_0x00b1;	 Catch:{ all -> 0x00d6 }
            r15 = new com.google.common.cache.LocalCache$LoadingValueReference;	 Catch:{ all -> 0x00d6 }
            r15.<init>();	 Catch:{ all -> 0x00d6 }
            if (r14 != 0) goto L_0x00ae;	 Catch:{ all -> 0x00d6 }
            r14 = r7.newEntry(r0, r8, r13);	 Catch:{ all -> 0x00d6 }
            r14.setValueReference(r15);	 Catch:{ all -> 0x00d6 }
            r11.set(r12, r14);	 Catch:{ all -> 0x00d6 }
            goto L_0x00b1;	 Catch:{ all -> 0x00d6 }
            r14.setValueReference(r15);	 Catch:{ all -> 0x00d6 }
            r17.unlock();
            r17.postWriteCleanup();
            if (r1 == 0) goto L_0x00d1;
            monitor-enter(r14);	 Catch:{ all -> 0x00ca }
            r1 = r20;
            r0 = r7.loadSync(r0, r8, r15, r1);	 Catch:{ all -> 0x00c7 }
            monitor-exit(r14);	 Catch:{ all -> 0x00c7 }
            r1 = r7.statsCounter;
            r1.recordMisses(r9);
            return r0;
            r0 = move-exception;
            monitor-exit(r14);	 Catch:{ all -> 0x00c7 }
            throw r0;	 Catch:{ all -> 0x00ca }
            r0 = move-exception;
            r1 = r7.statsCounter;
            r1.recordMisses(r9);
            throw r0;
            r0 = r7.waitForLoadingValue(r14, r0, r2);
            return r0;
            r0 = move-exception;
            r17.unlock();
            r17.postWriteCleanup();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.lockedGetOrLoad(java.lang.Object, int, com.google.common.cache.CacheLoader):java.lang.Object");
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public ReferenceEntry<K, V> newEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            return this.map.entryFactory.newEntry(this, Preconditions.checkNotNull(k), i, referenceEntry);
        }

        /* Access modifiers changed, original: 0000 */
        public AtomicReferenceArray<ReferenceEntry<K, V>> newEntryArray(int i) {
            return new AtomicReferenceArray(i);
        }

        /* Access modifiers changed, original: 0000 */
        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                cleanUp();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void postWriteCleanup() {
            runUnlockedCleanup();
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void preWriteCleanup(long j) {
            runLockedCleanup(j);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x00ea in {4, 17, 18, 19, 22, 25, 27, 29, 30, 32, 35} preds:[]
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
        V put(K r15, int r16, V r17, boolean r18) {
            /*
            r14 = this;
            r7 = r14;
            r0 = r15;
            r3 = r16;
            r14.lock();
            r1 = r7.map;	 Catch:{ all -> 0x00e2 }
            r1 = r1.ticker;	 Catch:{ all -> 0x00e2 }
            r8 = r1.read();	 Catch:{ all -> 0x00e2 }
            r14.preWriteCleanup(r8);	 Catch:{ all -> 0x00e2 }
            r1 = r7.count;	 Catch:{ all -> 0x00e2 }
            r1 = r1 + 1;	 Catch:{ all -> 0x00e2 }
            r2 = r7.threshold;	 Catch:{ all -> 0x00e2 }
            if (r1 <= r2) goto L_0x001f;	 Catch:{ all -> 0x00e2 }
            r14.expand();	 Catch:{ all -> 0x00e2 }
            r1 = r7.count;	 Catch:{ all -> 0x00e2 }
            r10 = r7.table;	 Catch:{ all -> 0x00e2 }
            r1 = r10.length();	 Catch:{ all -> 0x00e2 }
            r1 = r1 + -1;	 Catch:{ all -> 0x00e2 }
            r11 = r3 & r1;	 Catch:{ all -> 0x00e2 }
            r1 = r10.get(r11);	 Catch:{ all -> 0x00e2 }
            r1 = (com.google.common.cache.ReferenceEntry) r1;	 Catch:{ all -> 0x00e2 }
            r12 = r1;	 Catch:{ all -> 0x00e2 }
            r13 = 0;	 Catch:{ all -> 0x00e2 }
            if (r12 == 0) goto L_0x00c5;	 Catch:{ all -> 0x00e2 }
            r2 = r12.getKey();	 Catch:{ all -> 0x00e2 }
            r4 = r12.getHash();	 Catch:{ all -> 0x00e2 }
            if (r4 != r3) goto L_0x00bf;	 Catch:{ all -> 0x00e2 }
            if (r2 == 0) goto L_0x00bf;	 Catch:{ all -> 0x00e2 }
            r4 = r7.map;	 Catch:{ all -> 0x00e2 }
            r4 = r4.keyEquivalence;	 Catch:{ all -> 0x00e2 }
            r2 = r4.equivalent(r15, r2);	 Catch:{ all -> 0x00e2 }
            if (r2 == 0) goto L_0x00bf;	 Catch:{ all -> 0x00e2 }
            r1 = r12.getValueReference();	 Catch:{ all -> 0x00e2 }
            r10 = r1.get();	 Catch:{ all -> 0x00e2 }
            if (r10 != 0) goto L_0x0092;	 Catch:{ all -> 0x00e2 }
            r2 = r7.modCount;	 Catch:{ all -> 0x00e2 }
            r2 = r2 + 1;	 Catch:{ all -> 0x00e2 }
            r7.modCount = r2;	 Catch:{ all -> 0x00e2 }
            r2 = r1.isActive();	 Catch:{ all -> 0x00e2 }
            if (r2 == 0) goto L_0x0079;	 Catch:{ all -> 0x00e2 }
            r5 = r1.getWeight();	 Catch:{ all -> 0x00e2 }
            r6 = com.google.common.cache.RemovalCause.COLLECTED;	 Catch:{ all -> 0x00e2 }
            r1 = r14;	 Catch:{ all -> 0x00e2 }
            r2 = r15;	 Catch:{ all -> 0x00e2 }
            r3 = r16;	 Catch:{ all -> 0x00e2 }
            r4 = r10;	 Catch:{ all -> 0x00e2 }
            r1.enqueueNotification(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00e2 }
            r1 = r14;	 Catch:{ all -> 0x00e2 }
            r2 = r12;	 Catch:{ all -> 0x00e2 }
            r3 = r15;	 Catch:{ all -> 0x00e2 }
            r4 = r17;	 Catch:{ all -> 0x00e2 }
            r5 = r8;	 Catch:{ all -> 0x00e2 }
            r1.setValue(r2, r3, r4, r5);	 Catch:{ all -> 0x00e2 }
            r0 = r7.count;	 Catch:{ all -> 0x00e2 }
            goto L_0x0086;	 Catch:{ all -> 0x00e2 }
            r1 = r14;	 Catch:{ all -> 0x00e2 }
            r2 = r12;	 Catch:{ all -> 0x00e2 }
            r3 = r15;	 Catch:{ all -> 0x00e2 }
            r4 = r17;	 Catch:{ all -> 0x00e2 }
            r5 = r8;	 Catch:{ all -> 0x00e2 }
            r1.setValue(r2, r3, r4, r5);	 Catch:{ all -> 0x00e2 }
            r0 = r7.count;	 Catch:{ all -> 0x00e2 }
            r0 = r0 + 1;	 Catch:{ all -> 0x00e2 }
            r7.count = r0;	 Catch:{ all -> 0x00e2 }
            r14.evictEntries(r12);	 Catch:{ all -> 0x00e2 }
            r14.unlock();
            r14.postWriteCleanup();
            return r13;
            if (r18 == 0) goto L_0x009e;
            r14.recordLockedRead(r12, r8);	 Catch:{ all -> 0x00e2 }
            r14.unlock();
            r14.postWriteCleanup();
            return r10;
            r2 = r7.modCount;	 Catch:{ all -> 0x00e2 }
            r2 = r2 + 1;	 Catch:{ all -> 0x00e2 }
            r7.modCount = r2;	 Catch:{ all -> 0x00e2 }
            r5 = r1.getWeight();	 Catch:{ all -> 0x00e2 }
            r6 = com.google.common.cache.RemovalCause.REPLACED;	 Catch:{ all -> 0x00e2 }
            r1 = r14;	 Catch:{ all -> 0x00e2 }
            r2 = r15;	 Catch:{ all -> 0x00e2 }
            r3 = r16;	 Catch:{ all -> 0x00e2 }
            r4 = r10;	 Catch:{ all -> 0x00e2 }
            r1.enqueueNotification(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00e2 }
            r1 = r14;	 Catch:{ all -> 0x00e2 }
            r2 = r12;	 Catch:{ all -> 0x00e2 }
            r3 = r15;	 Catch:{ all -> 0x00e2 }
            r4 = r17;	 Catch:{ all -> 0x00e2 }
            r5 = r8;	 Catch:{ all -> 0x00e2 }
            r1.setValue(r2, r3, r4, r5);	 Catch:{ all -> 0x00e2 }
            r14.evictEntries(r12);	 Catch:{ all -> 0x00e2 }
            goto L_0x0097;	 Catch:{ all -> 0x00e2 }
            r12 = r12.getNext();	 Catch:{ all -> 0x00e2 }
            goto L_0x0030;	 Catch:{ all -> 0x00e2 }
            r2 = r7.modCount;	 Catch:{ all -> 0x00e2 }
            r2 = r2 + 1;	 Catch:{ all -> 0x00e2 }
            r7.modCount = r2;	 Catch:{ all -> 0x00e2 }
            r12 = r14.newEntry(r15, r3, r1);	 Catch:{ all -> 0x00e2 }
            r1 = r14;	 Catch:{ all -> 0x00e2 }
            r2 = r12;	 Catch:{ all -> 0x00e2 }
            r3 = r15;	 Catch:{ all -> 0x00e2 }
            r4 = r17;	 Catch:{ all -> 0x00e2 }
            r5 = r8;	 Catch:{ all -> 0x00e2 }
            r1.setValue(r2, r3, r4, r5);	 Catch:{ all -> 0x00e2 }
            r10.set(r11, r12);	 Catch:{ all -> 0x00e2 }
            r0 = r7.count;	 Catch:{ all -> 0x00e2 }
            r0 = r0 + 1;	 Catch:{ all -> 0x00e2 }
            r7.count = r0;	 Catch:{ all -> 0x00e2 }
            goto L_0x0088;
            r0 = move-exception;
            r14.unlock();
            r14.postWriteCleanup();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.put(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x005b in {7, 10, 12, 15} preds:[]
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
        boolean reclaimKey(com.google.common.cache.ReferenceEntry<K, V> r13, int r14) {
            /*
            r12 = this;
            r12.lock();
            r0 = r12.count;	 Catch:{ all -> 0x0053 }
            r0 = r12.table;	 Catch:{ all -> 0x0053 }
            r1 = r0.length();	 Catch:{ all -> 0x0053 }
            r2 = 1;	 Catch:{ all -> 0x0053 }
            r1 = r1 - r2;	 Catch:{ all -> 0x0053 }
            r1 = r1 & r14;	 Catch:{ all -> 0x0053 }
            r3 = r0.get(r1);	 Catch:{ all -> 0x0053 }
            r5 = r3;	 Catch:{ all -> 0x0053 }
            r5 = (com.google.common.cache.ReferenceEntry) r5;	 Catch:{ all -> 0x0053 }
            r6 = r5;	 Catch:{ all -> 0x0053 }
            if (r6 == 0) goto L_0x004b;	 Catch:{ all -> 0x0053 }
            if (r6 != r13) goto L_0x0046;	 Catch:{ all -> 0x0053 }
            r13 = r12.modCount;	 Catch:{ all -> 0x0053 }
            r13 = r13 + r2;	 Catch:{ all -> 0x0053 }
            r12.modCount = r13;	 Catch:{ all -> 0x0053 }
            r7 = r6.getKey();	 Catch:{ all -> 0x0053 }
            r13 = r6.getValueReference();	 Catch:{ all -> 0x0053 }
            r9 = r13.get();	 Catch:{ all -> 0x0053 }
            r10 = r6.getValueReference();	 Catch:{ all -> 0x0053 }
            r11 = com.google.common.cache.RemovalCause.COLLECTED;	 Catch:{ all -> 0x0053 }
            r4 = r12;	 Catch:{ all -> 0x0053 }
            r8 = r14;	 Catch:{ all -> 0x0053 }
            r13 = r4.removeValueFromChain(r5, r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0053 }
            r14 = r12.count;	 Catch:{ all -> 0x0053 }
            r14 = r14 - r2;	 Catch:{ all -> 0x0053 }
            r0.set(r1, r13);	 Catch:{ all -> 0x0053 }
            r12.count = r14;	 Catch:{ all -> 0x0053 }
            r12.unlock();
            r12.postWriteCleanup();
            return r2;
            r6 = r6.getNext();	 Catch:{ all -> 0x0053 }
            goto L_0x0016;
            r12.unlock();
            r12.postWriteCleanup();
            r13 = 0;
            return r13;
            r13 = move-exception;
            r12.unlock();
            r12.postWriteCleanup();
            throw r13;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.reclaimKey(com.google.common.cache.ReferenceEntry, int):boolean");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x0089 in {15, 16, 19, 20, 23, 26, 27, 31, 32} preds:[]
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
        boolean reclaimValue(K r13, int r14, com.google.common.cache.LocalCache.ValueReference<K, V> r15) {
            /*
            r12 = this;
            r12.lock();
            r0 = r12.count;	 Catch:{ all -> 0x007b }
            r0 = r12.table;	 Catch:{ all -> 0x007b }
            r1 = r0.length();	 Catch:{ all -> 0x007b }
            r2 = 1;	 Catch:{ all -> 0x007b }
            r1 = r1 - r2;	 Catch:{ all -> 0x007b }
            r1 = r1 & r14;	 Catch:{ all -> 0x007b }
            r3 = r0.get(r1);	 Catch:{ all -> 0x007b }
            r5 = r3;	 Catch:{ all -> 0x007b }
            r5 = (com.google.common.cache.ReferenceEntry) r5;	 Catch:{ all -> 0x007b }
            r6 = r5;	 Catch:{ all -> 0x007b }
            r3 = 0;	 Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x006e;	 Catch:{ all -> 0x007b }
            r7 = r6.getKey();	 Catch:{ all -> 0x007b }
            r4 = r6.getHash();	 Catch:{ all -> 0x007b }
            if (r4 != r14) goto L_0x0069;	 Catch:{ all -> 0x007b }
            if (r7 == 0) goto L_0x0069;	 Catch:{ all -> 0x007b }
            r4 = r12.map;	 Catch:{ all -> 0x007b }
            r4 = r4.keyEquivalence;	 Catch:{ all -> 0x007b }
            r4 = r4.equivalent(r13, r7);	 Catch:{ all -> 0x007b }
            if (r4 == 0) goto L_0x0069;	 Catch:{ all -> 0x007b }
            r13 = r6.getValueReference();	 Catch:{ all -> 0x007b }
            if (r13 != r15) goto L_0x005c;	 Catch:{ all -> 0x007b }
            r13 = r12.modCount;	 Catch:{ all -> 0x007b }
            r13 = r13 + r2;	 Catch:{ all -> 0x007b }
            r12.modCount = r13;	 Catch:{ all -> 0x007b }
            r9 = r15.get();	 Catch:{ all -> 0x007b }
            r11 = com.google.common.cache.RemovalCause.COLLECTED;	 Catch:{ all -> 0x007b }
            r4 = r12;	 Catch:{ all -> 0x007b }
            r8 = r14;	 Catch:{ all -> 0x007b }
            r10 = r15;	 Catch:{ all -> 0x007b }
            r13 = r4.removeValueFromChain(r5, r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x007b }
            r14 = r12.count;	 Catch:{ all -> 0x007b }
            r14 = r14 - r2;	 Catch:{ all -> 0x007b }
            r0.set(r1, r13);	 Catch:{ all -> 0x007b }
            r12.count = r14;	 Catch:{ all -> 0x007b }
            r12.unlock();
            r13 = r12.isHeldByCurrentThread();
            if (r13 != 0) goto L_0x005b;
            r12.postWriteCleanup();
            return r2;
            r12.unlock();
            r13 = r12.isHeldByCurrentThread();
            if (r13 != 0) goto L_0x0068;
            r12.postWriteCleanup();
            return r3;
            r6 = r6.getNext();	 Catch:{ all -> 0x007b }
            goto L_0x0016;
            r12.unlock();
            r13 = r12.isHeldByCurrentThread();
            if (r13 != 0) goto L_0x007a;
            r12.postWriteCleanup();
            return r3;
            r13 = move-exception;
            r12.unlock();
            r14 = r12.isHeldByCurrentThread();
            if (r14 != 0) goto L_0x0088;
            r12.postWriteCleanup();
            throw r13;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.reclaimValue(java.lang.Object, int, com.google.common.cache.LocalCache$ValueReference):boolean");
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void recordLockedRead(ReferenceEntry<K, V> referenceEntry, long j) {
            if (this.map.recordsAccess()) {
                referenceEntry.setAccessTime(j);
            }
            this.accessQueue.add(referenceEntry);
        }

        /* Access modifiers changed, original: 0000 */
        public void recordRead(ReferenceEntry<K, V> referenceEntry, long j) {
            if (this.map.recordsAccess()) {
                referenceEntry.setAccessTime(j);
            }
            this.recencyQueue.add(referenceEntry);
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void recordWrite(ReferenceEntry<K, V> referenceEntry, int i, long j) {
            drainRecencyQueue();
            this.totalWeight += (long) i;
            if (this.map.recordsAccess()) {
                referenceEntry.setAccessTime(j);
            }
            if (this.map.recordsWrite()) {
                referenceEntry.setWriteTime(j);
            }
            this.accessQueue.add(referenceEntry);
            this.writeQueue.add(referenceEntry);
        }

        /* Access modifiers changed, original: 0000 */
        public V refresh(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            LoadingValueReference insertLoadingValueReference = insertLoadingValueReference(k, i, z);
            if (insertLoadingValueReference == null) {
                return null;
            }
            ListenableFuture loadAsync = loadAsync(k, i, insertLoadingValueReference, cacheLoader);
            if (loadAsync.isDone()) {
                try {
                    return Uninterruptibles.getUninterruptibly(loadAsync);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0082 in {12, 16, 19, 21, 24, 27} preds:[]
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
        V remove(java.lang.Object r12, int r13) {
            /*
            r11 = this;
            r11.lock();
            r0 = r11.map;	 Catch:{ all -> 0x007a }
            r0 = r0.ticker;	 Catch:{ all -> 0x007a }
            r0 = r0.read();	 Catch:{ all -> 0x007a }
            r11.preWriteCleanup(r0);	 Catch:{ all -> 0x007a }
            r0 = r11.count;	 Catch:{ all -> 0x007a }
            r0 = r11.table;	 Catch:{ all -> 0x007a }
            r1 = r0.length();	 Catch:{ all -> 0x007a }
            r1 = r1 + -1;	 Catch:{ all -> 0x007a }
            r1 = r1 & r13;	 Catch:{ all -> 0x007a }
            r2 = r0.get(r1);	 Catch:{ all -> 0x007a }
            r4 = r2;	 Catch:{ all -> 0x007a }
            r4 = (com.google.common.cache.ReferenceEntry) r4;	 Catch:{ all -> 0x007a }
            r5 = r4;	 Catch:{ all -> 0x007a }
            r2 = 0;	 Catch:{ all -> 0x007a }
            if (r5 == 0) goto L_0x006e;	 Catch:{ all -> 0x007a }
            r6 = r5.getKey();	 Catch:{ all -> 0x007a }
            r3 = r5.getHash();	 Catch:{ all -> 0x007a }
            if (r3 != r13) goto L_0x0075;	 Catch:{ all -> 0x007a }
            if (r6 == 0) goto L_0x0075;	 Catch:{ all -> 0x007a }
            r3 = r11.map;	 Catch:{ all -> 0x007a }
            r3 = r3.keyEquivalence;	 Catch:{ all -> 0x007a }
            r3 = r3.equivalent(r12, r6);	 Catch:{ all -> 0x007a }
            if (r3 == 0) goto L_0x0075;	 Catch:{ all -> 0x007a }
            r9 = r5.getValueReference();	 Catch:{ all -> 0x007a }
            r12 = r9.get();	 Catch:{ all -> 0x007a }
            if (r12 == 0) goto L_0x0048;	 Catch:{ all -> 0x007a }
            r2 = com.google.common.cache.RemovalCause.EXPLICIT;	 Catch:{ all -> 0x007a }
            r10 = r2;	 Catch:{ all -> 0x007a }
            goto L_0x0051;	 Catch:{ all -> 0x007a }
            r3 = r9.isActive();	 Catch:{ all -> 0x007a }
            if (r3 == 0) goto L_0x006e;	 Catch:{ all -> 0x007a }
            r2 = com.google.common.cache.RemovalCause.COLLECTED;	 Catch:{ all -> 0x007a }
            goto L_0x0046;	 Catch:{ all -> 0x007a }
            r2 = r11.modCount;	 Catch:{ all -> 0x007a }
            r2 = r2 + 1;	 Catch:{ all -> 0x007a }
            r11.modCount = r2;	 Catch:{ all -> 0x007a }
            r3 = r11;	 Catch:{ all -> 0x007a }
            r7 = r13;	 Catch:{ all -> 0x007a }
            r8 = r12;	 Catch:{ all -> 0x007a }
            r13 = r3.removeValueFromChain(r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x007a }
            r2 = r11.count;	 Catch:{ all -> 0x007a }
            r2 = r2 + -1;	 Catch:{ all -> 0x007a }
            r0.set(r1, r13);	 Catch:{ all -> 0x007a }
            r11.count = r2;	 Catch:{ all -> 0x007a }
            r11.unlock();
            r11.postWriteCleanup();
            return r12;
            r11.unlock();
            r11.postWriteCleanup();
            return r2;
            r5 = r5.getNext();	 Catch:{ all -> 0x007a }
            goto L_0x0021;
            r12 = move-exception;
            r11.unlock();
            r11.postWriteCleanup();
            throw r12;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.remove(java.lang.Object, int):java.lang.Object");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x008e in {12, 16, 19, 20, 22, 24, 27, 30} preds:[]
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
        boolean remove(java.lang.Object r13, int r14, java.lang.Object r15) {
            /*
            r12 = this;
            r12.lock();
            r0 = r12.map;	 Catch:{ all -> 0x0086 }
            r0 = r0.ticker;	 Catch:{ all -> 0x0086 }
            r0 = r0.read();	 Catch:{ all -> 0x0086 }
            r12.preWriteCleanup(r0);	 Catch:{ all -> 0x0086 }
            r0 = r12.count;	 Catch:{ all -> 0x0086 }
            r0 = r12.table;	 Catch:{ all -> 0x0086 }
            r1 = r0.length();	 Catch:{ all -> 0x0086 }
            r2 = 1;	 Catch:{ all -> 0x0086 }
            r1 = r1 - r2;	 Catch:{ all -> 0x0086 }
            r1 = r1 & r14;	 Catch:{ all -> 0x0086 }
            r3 = r0.get(r1);	 Catch:{ all -> 0x0086 }
            r5 = r3;	 Catch:{ all -> 0x0086 }
            r5 = (com.google.common.cache.ReferenceEntry) r5;	 Catch:{ all -> 0x0086 }
            r6 = r5;	 Catch:{ all -> 0x0086 }
            r3 = 0;	 Catch:{ all -> 0x0086 }
            if (r6 == 0) goto L_0x007a;	 Catch:{ all -> 0x0086 }
            r7 = r6.getKey();	 Catch:{ all -> 0x0086 }
            r4 = r6.getHash();	 Catch:{ all -> 0x0086 }
            if (r4 != r14) goto L_0x0081;	 Catch:{ all -> 0x0086 }
            if (r7 == 0) goto L_0x0081;	 Catch:{ all -> 0x0086 }
            r4 = r12.map;	 Catch:{ all -> 0x0086 }
            r4 = r4.keyEquivalence;	 Catch:{ all -> 0x0086 }
            r4 = r4.equivalent(r13, r7);	 Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x0081;	 Catch:{ all -> 0x0086 }
            r10 = r6.getValueReference();	 Catch:{ all -> 0x0086 }
            r9 = r10.get();	 Catch:{ all -> 0x0086 }
            r13 = r12.map;	 Catch:{ all -> 0x0086 }
            r13 = r13.valueEquivalence;	 Catch:{ all -> 0x0086 }
            r13 = r13.equivalent(r15, r9);	 Catch:{ all -> 0x0086 }
            if (r13 == 0) goto L_0x004f;	 Catch:{ all -> 0x0086 }
            r13 = com.google.common.cache.RemovalCause.EXPLICIT;	 Catch:{ all -> 0x0086 }
            goto L_0x0059;	 Catch:{ all -> 0x0086 }
            if (r9 != 0) goto L_0x007a;	 Catch:{ all -> 0x0086 }
            r13 = r10.isActive();	 Catch:{ all -> 0x0086 }
            if (r13 == 0) goto L_0x007a;	 Catch:{ all -> 0x0086 }
            r13 = com.google.common.cache.RemovalCause.COLLECTED;	 Catch:{ all -> 0x0086 }
            r15 = r12.modCount;	 Catch:{ all -> 0x0086 }
            r15 = r15 + r2;	 Catch:{ all -> 0x0086 }
            r12.modCount = r15;	 Catch:{ all -> 0x0086 }
            r4 = r12;	 Catch:{ all -> 0x0086 }
            r8 = r14;	 Catch:{ all -> 0x0086 }
            r11 = r13;	 Catch:{ all -> 0x0086 }
            r14 = r4.removeValueFromChain(r5, r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0086 }
            r15 = r12.count;	 Catch:{ all -> 0x0086 }
            r15 = r15 - r2;	 Catch:{ all -> 0x0086 }
            r0.set(r1, r14);	 Catch:{ all -> 0x0086 }
            r12.count = r15;	 Catch:{ all -> 0x0086 }
            r14 = com.google.common.cache.RemovalCause.EXPLICIT;	 Catch:{ all -> 0x0086 }
            if (r13 != r14) goto L_0x0072;
            goto L_0x0073;
            r2 = 0;
            r12.unlock();
            r12.postWriteCleanup();
            return r2;
            r12.unlock();
            r12.postWriteCleanup();
            return r3;
            r6 = r6.getNext();	 Catch:{ all -> 0x0086 }
            goto L_0x0021;
            r13 = move-exception;
            r12.unlock();
            r12.postWriteCleanup();
            throw r13;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.remove(java.lang.Object, int, java.lang.Object):boolean");
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void removeCollectedEntry(ReferenceEntry<K, V> referenceEntry) {
            enqueueNotification(referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry.getValueReference().get(), referenceEntry.getValueReference().getWeight(), RemovalCause.COLLECTED);
            this.writeQueue.remove(referenceEntry);
            this.accessQueue.remove(referenceEntry);
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public boolean removeEntry(ReferenceEntry<K, V> referenceEntry, int i, RemovalCause removalCause) {
            int i2 = this.count;
            AtomicReferenceArray atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            ReferenceEntry<K, V> referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.getNext()) {
                if (referenceEntry3 == referenceEntry) {
                    this.modCount++;
                    i = this.count - 1;
                    atomicReferenceArray.set(length, removeValueFromChain(referenceEntry2, referenceEntry3, referenceEntry3.getKey(), i, referenceEntry3.getValueReference().get(), referenceEntry3.getValueReference(), removalCause));
                    this.count = i;
                    return true;
                }
            }
            return false;
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public ReferenceEntry<K, V> removeEntryFromChain(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            int i = this.count;
            ReferenceEntry next = referenceEntry2.getNext();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry copyEntry = copyEntry(referenceEntry, next);
                if (copyEntry != null) {
                    next = copyEntry;
                } else {
                    removeCollectedEntry(referenceEntry);
                    i--;
                }
                referenceEntry = referenceEntry.getNext();
            }
            this.count = i;
            return next;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0062 in {14, 15, 17, 19, 22, 25} preds:[]
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
        boolean removeLoadingValue(K r9, int r10, com.google.common.cache.LocalCache.LoadingValueReference<K, V> r11) {
            /*
            r8 = this;
            r8.lock();
            r0 = r8.table;	 Catch:{ all -> 0x005a }
            r1 = r0.length();	 Catch:{ all -> 0x005a }
            r2 = 1;	 Catch:{ all -> 0x005a }
            r1 = r1 - r2;	 Catch:{ all -> 0x005a }
            r1 = r1 & r10;	 Catch:{ all -> 0x005a }
            r3 = r0.get(r1);	 Catch:{ all -> 0x005a }
            r3 = (com.google.common.cache.ReferenceEntry) r3;	 Catch:{ all -> 0x005a }
            r4 = r3;	 Catch:{ all -> 0x005a }
            r5 = 0;	 Catch:{ all -> 0x005a }
            if (r4 == 0) goto L_0x004e;	 Catch:{ all -> 0x005a }
            r6 = r4.getKey();	 Catch:{ all -> 0x005a }
            r7 = r4.getHash();	 Catch:{ all -> 0x005a }
            if (r7 != r10) goto L_0x0055;	 Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x0055;	 Catch:{ all -> 0x005a }
            r7 = r8.map;	 Catch:{ all -> 0x005a }
            r7 = r7.keyEquivalence;	 Catch:{ all -> 0x005a }
            r6 = r7.equivalent(r9, r6);	 Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x0055;	 Catch:{ all -> 0x005a }
            r9 = r4.getValueReference();	 Catch:{ all -> 0x005a }
            if (r9 != r11) goto L_0x004e;	 Catch:{ all -> 0x005a }
            r9 = r11.isActive();	 Catch:{ all -> 0x005a }
            if (r9 == 0) goto L_0x0040;	 Catch:{ all -> 0x005a }
            r9 = r11.getOldValue();	 Catch:{ all -> 0x005a }
            r4.setValueReference(r9);	 Catch:{ all -> 0x005a }
            goto L_0x0047;	 Catch:{ all -> 0x005a }
            r9 = r8.removeEntryFromChain(r3, r4);	 Catch:{ all -> 0x005a }
            r0.set(r1, r9);	 Catch:{ all -> 0x005a }
            r8.unlock();
            r8.postWriteCleanup();
            return r2;
            r8.unlock();
            r8.postWriteCleanup();
            return r5;
            r4 = r4.getNext();	 Catch:{ all -> 0x005a }
            goto L_0x0013;
            r9 = move-exception;
            r8.unlock();
            r8.postWriteCleanup();
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.removeLoadingValue(java.lang.Object, int, com.google.common.cache.LocalCache$LoadingValueReference):boolean");
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public ReferenceEntry<K, V> removeValueFromChain(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k, int i, V v, ValueReference<K, V> valueReference, RemovalCause removalCause) {
            enqueueNotification(k, i, v, valueReference.getWeight(), removalCause);
            this.writeQueue.remove(referenceEntry2);
            this.accessQueue.remove(referenceEntry2);
            if (!valueReference.isLoading()) {
                return removeEntryFromChain(referenceEntry, referenceEntry2);
            }
            valueReference.notifyNewValue(null);
            return referenceEntry;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x00b1 in {14, 16, 20, 21, 24, 27} preds:[]
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
        V replace(K r18, int r19, V r20) {
            /*
            r17 = this;
            r9 = r17;
            r0 = r19;
            r17.lock();
            r1 = r9.map;	 Catch:{ all -> 0x00a9 }
            r1 = r1.ticker;	 Catch:{ all -> 0x00a9 }
            r7 = r1.read();	 Catch:{ all -> 0x00a9 }
            r9.preWriteCleanup(r7);	 Catch:{ all -> 0x00a9 }
            r10 = r9.table;	 Catch:{ all -> 0x00a9 }
            r1 = r10.length();	 Catch:{ all -> 0x00a9 }
            r1 = r1 + -1;	 Catch:{ all -> 0x00a9 }
            r11 = r0 & r1;	 Catch:{ all -> 0x00a9 }
            r1 = r10.get(r11);	 Catch:{ all -> 0x00a9 }
            r2 = r1;	 Catch:{ all -> 0x00a9 }
            r2 = (com.google.common.cache.ReferenceEntry) r2;	 Catch:{ all -> 0x00a9 }
            r12 = r2;	 Catch:{ all -> 0x00a9 }
            r13 = 0;	 Catch:{ all -> 0x00a9 }
            if (r12 == 0) goto L_0x006e;	 Catch:{ all -> 0x00a9 }
            r4 = r12.getKey();	 Catch:{ all -> 0x00a9 }
            r1 = r12.getHash();	 Catch:{ all -> 0x00a9 }
            if (r1 != r0) goto L_0x00a1;	 Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x00a1;	 Catch:{ all -> 0x00a9 }
            r1 = r9.map;	 Catch:{ all -> 0x00a9 }
            r1 = r1.keyEquivalence;	 Catch:{ all -> 0x00a9 }
            r14 = r18;	 Catch:{ all -> 0x00a9 }
            r1 = r1.equivalent(r14, r4);	 Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x00a3;	 Catch:{ all -> 0x00a9 }
            r15 = r12.getValueReference();	 Catch:{ all -> 0x00a9 }
            r16 = r15.get();	 Catch:{ all -> 0x00a9 }
            if (r16 != 0) goto L_0x0075;	 Catch:{ all -> 0x00a9 }
            r1 = r15.isActive();	 Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x006e;	 Catch:{ all -> 0x00a9 }
            r1 = r9.count;	 Catch:{ all -> 0x00a9 }
            r1 = r9.modCount;	 Catch:{ all -> 0x00a9 }
            r1 = r1 + 1;	 Catch:{ all -> 0x00a9 }
            r9.modCount = r1;	 Catch:{ all -> 0x00a9 }
            r8 = com.google.common.cache.RemovalCause.COLLECTED;	 Catch:{ all -> 0x00a9 }
            r1 = r17;	 Catch:{ all -> 0x00a9 }
            r3 = r12;	 Catch:{ all -> 0x00a9 }
            r5 = r19;	 Catch:{ all -> 0x00a9 }
            r6 = r16;	 Catch:{ all -> 0x00a9 }
            r7 = r15;	 Catch:{ all -> 0x00a9 }
            r0 = r1.removeValueFromChain(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x00a9 }
            r1 = r9.count;	 Catch:{ all -> 0x00a9 }
            r1 = r1 + -1;	 Catch:{ all -> 0x00a9 }
            r10.set(r11, r0);	 Catch:{ all -> 0x00a9 }
            r9.count = r1;	 Catch:{ all -> 0x00a9 }
            r17.unlock();
            r17.postWriteCleanup();
            return r13;
            r1 = r9.modCount;	 Catch:{ all -> 0x00a9 }
            r1 = r1 + 1;	 Catch:{ all -> 0x00a9 }
            r9.modCount = r1;	 Catch:{ all -> 0x00a9 }
            r5 = r15.getWeight();	 Catch:{ all -> 0x00a9 }
            r6 = com.google.common.cache.RemovalCause.REPLACED;	 Catch:{ all -> 0x00a9 }
            r1 = r17;	 Catch:{ all -> 0x00a9 }
            r2 = r18;	 Catch:{ all -> 0x00a9 }
            r3 = r19;	 Catch:{ all -> 0x00a9 }
            r4 = r16;	 Catch:{ all -> 0x00a9 }
            r1.enqueueNotification(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00a9 }
            r1 = r17;	 Catch:{ all -> 0x00a9 }
            r2 = r12;	 Catch:{ all -> 0x00a9 }
            r3 = r18;	 Catch:{ all -> 0x00a9 }
            r4 = r20;	 Catch:{ all -> 0x00a9 }
            r5 = r7;	 Catch:{ all -> 0x00a9 }
            r1.setValue(r2, r3, r4, r5);	 Catch:{ all -> 0x00a9 }
            r9.evictEntries(r12);	 Catch:{ all -> 0x00a9 }
            r17.unlock();
            r17.postWriteCleanup();
            return r16;
            r14 = r18;
            r12 = r12.getNext();	 Catch:{ all -> 0x00a9 }
            goto L_0x0024;
            r0 = move-exception;
            r17.unlock();
            r17.postWriteCleanup();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.replace(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x00bf in {14, 16, 22, 24, 25, 27, 30} preds:[]
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
        boolean replace(K r18, int r19, V r20, V r21) {
            /*
            r17 = this;
            r9 = r17;
            r0 = r19;
            r17.lock();
            r1 = r9.map;	 Catch:{ all -> 0x00b7 }
            r1 = r1.ticker;	 Catch:{ all -> 0x00b7 }
            r7 = r1.read();	 Catch:{ all -> 0x00b7 }
            r9.preWriteCleanup(r7);	 Catch:{ all -> 0x00b7 }
            r10 = r9.table;	 Catch:{ all -> 0x00b7 }
            r1 = r10.length();	 Catch:{ all -> 0x00b7 }
            r11 = 1;	 Catch:{ all -> 0x00b7 }
            r1 = r1 - r11;	 Catch:{ all -> 0x00b7 }
            r12 = r0 & r1;	 Catch:{ all -> 0x00b7 }
            r1 = r10.get(r12);	 Catch:{ all -> 0x00b7 }
            r2 = r1;	 Catch:{ all -> 0x00b7 }
            r2 = (com.google.common.cache.ReferenceEntry) r2;	 Catch:{ all -> 0x00b7 }
            r13 = r2;	 Catch:{ all -> 0x00b7 }
            r14 = 0;	 Catch:{ all -> 0x00b7 }
            if (r13 == 0) goto L_0x006b;	 Catch:{ all -> 0x00b7 }
            r4 = r13.getKey();	 Catch:{ all -> 0x00b7 }
            r1 = r13.getHash();	 Catch:{ all -> 0x00b7 }
            if (r1 != r0) goto L_0x00ad;	 Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x00ad;	 Catch:{ all -> 0x00b7 }
            r1 = r9.map;	 Catch:{ all -> 0x00b7 }
            r1 = r1.keyEquivalence;	 Catch:{ all -> 0x00b7 }
            r15 = r18;	 Catch:{ all -> 0x00b7 }
            r1 = r1.equivalent(r15, r4);	 Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x00af;	 Catch:{ all -> 0x00b7 }
            r16 = r13.getValueReference();	 Catch:{ all -> 0x00b7 }
            r6 = r16.get();	 Catch:{ all -> 0x00b7 }
            if (r6 != 0) goto L_0x0072;	 Catch:{ all -> 0x00b7 }
            r1 = r16.isActive();	 Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x006b;	 Catch:{ all -> 0x00b7 }
            r1 = r9.count;	 Catch:{ all -> 0x00b7 }
            r1 = r9.modCount;	 Catch:{ all -> 0x00b7 }
            r1 = r1 + r11;	 Catch:{ all -> 0x00b7 }
            r9.modCount = r1;	 Catch:{ all -> 0x00b7 }
            r8 = com.google.common.cache.RemovalCause.COLLECTED;	 Catch:{ all -> 0x00b7 }
            r1 = r17;	 Catch:{ all -> 0x00b7 }
            r3 = r13;	 Catch:{ all -> 0x00b7 }
            r5 = r19;	 Catch:{ all -> 0x00b7 }
            r7 = r16;	 Catch:{ all -> 0x00b7 }
            r0 = r1.removeValueFromChain(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x00b7 }
            r1 = r9.count;	 Catch:{ all -> 0x00b7 }
            r1 = r1 - r11;	 Catch:{ all -> 0x00b7 }
            r10.set(r12, r0);	 Catch:{ all -> 0x00b7 }
            r9.count = r1;	 Catch:{ all -> 0x00b7 }
            r17.unlock();
            r17.postWriteCleanup();
            return r14;
            r1 = r9.map;	 Catch:{ all -> 0x00b7 }
            r1 = r1.valueEquivalence;	 Catch:{ all -> 0x00b7 }
            r3 = r20;	 Catch:{ all -> 0x00b7 }
            r1 = r1.equivalent(r3, r6);	 Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x00a9;	 Catch:{ all -> 0x00b7 }
            r1 = r9.modCount;	 Catch:{ all -> 0x00b7 }
            r1 = r1 + r11;	 Catch:{ all -> 0x00b7 }
            r9.modCount = r1;	 Catch:{ all -> 0x00b7 }
            r5 = r16.getWeight();	 Catch:{ all -> 0x00b7 }
            r10 = com.google.common.cache.RemovalCause.REPLACED;	 Catch:{ all -> 0x00b7 }
            r1 = r17;	 Catch:{ all -> 0x00b7 }
            r2 = r18;	 Catch:{ all -> 0x00b7 }
            r3 = r19;	 Catch:{ all -> 0x00b7 }
            r4 = r6;	 Catch:{ all -> 0x00b7 }
            r6 = r10;	 Catch:{ all -> 0x00b7 }
            r1.enqueueNotification(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00b7 }
            r1 = r17;	 Catch:{ all -> 0x00b7 }
            r2 = r13;	 Catch:{ all -> 0x00b7 }
            r3 = r18;	 Catch:{ all -> 0x00b7 }
            r4 = r21;	 Catch:{ all -> 0x00b7 }
            r5 = r7;	 Catch:{ all -> 0x00b7 }
            r1.setValue(r2, r3, r4, r5);	 Catch:{ all -> 0x00b7 }
            r9.evictEntries(r13);	 Catch:{ all -> 0x00b7 }
            r17.unlock();
            r17.postWriteCleanup();
            return r11;
            r9.recordLockedRead(r13, r7);	 Catch:{ all -> 0x00b7 }
            goto L_0x006b;	 Catch:{ all -> 0x00b7 }
            r15 = r18;	 Catch:{ all -> 0x00b7 }
            r3 = r20;	 Catch:{ all -> 0x00b7 }
            r13 = r13.getNext();	 Catch:{ all -> 0x00b7 }
            goto L_0x0024;
            r0 = move-exception;
            r17.unlock();
            r17.postWriteCleanup();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.replace(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        /* Access modifiers changed, original: 0000 */
        public void runLockedCleanup(long j) {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                    expireEntries(j);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void runUnlockedCleanup() {
            if (!isHeldByCurrentThread()) {
                this.map.processPendingNotifications();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V scheduleRefresh(ReferenceEntry<K, V> referenceEntry, K k, int i, V v, long j, CacheLoader<? super K, V> cacheLoader) {
            if (this.map.refreshes() && j - referenceEntry.getWriteTime() > this.map.refreshNanos && !referenceEntry.getValueReference().isLoading()) {
                Object refresh = refresh(k, i, cacheLoader, true);
                if (refresh != null) {
                    return refresh;
                }
            }
            return v;
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("this")
        public void setValue(ReferenceEntry<K, V> referenceEntry, K k, V v, long j) {
            ValueReference valueReference = referenceEntry.getValueReference();
            int weigh = this.map.weigher.weigh(k, v);
            Preconditions.checkState(weigh >= 0, "Weights must be non-negative");
            referenceEntry.setValueReference(this.map.valueStrength.referenceValue(this, referenceEntry, v, weigh));
            recordWrite(referenceEntry, weigh, j);
            valueReference.notifyNewValue(v);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:40:0x00d1 in {4, 17, 20, 25, 26, 27, 28, 31, 34, 36, 39} preds:[]
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
        boolean storeLoadedValue(K r16, int r17, com.google.common.cache.LocalCache.LoadingValueReference<K, V> r18, V r19) {
            /*
            r15 = this;
            r7 = r15;
            r0 = r16;
            r3 = r17;
            r15.lock();
            r1 = r7.map;	 Catch:{ all -> 0x00c9 }
            r1 = r1.ticker;	 Catch:{ all -> 0x00c9 }
            r8 = r1.read();	 Catch:{ all -> 0x00c9 }
            r15.preWriteCleanup(r8);	 Catch:{ all -> 0x00c9 }
            r1 = r7.count;	 Catch:{ all -> 0x00c9 }
            r10 = 1;	 Catch:{ all -> 0x00c9 }
            r1 = r1 + r10;	 Catch:{ all -> 0x00c9 }
            r2 = r7.threshold;	 Catch:{ all -> 0x00c9 }
            if (r1 <= r2) goto L_0x0021;	 Catch:{ all -> 0x00c9 }
            r15.expand();	 Catch:{ all -> 0x00c9 }
            r1 = r7.count;	 Catch:{ all -> 0x00c9 }
            r1 = r1 + r10;	 Catch:{ all -> 0x00c9 }
            r11 = r1;	 Catch:{ all -> 0x00c9 }
            r12 = r7.table;	 Catch:{ all -> 0x00c9 }
            r1 = r12.length();	 Catch:{ all -> 0x00c9 }
            r1 = r1 - r10;	 Catch:{ all -> 0x00c9 }
            r13 = r3 & r1;	 Catch:{ all -> 0x00c9 }
            r1 = r12.get(r13);	 Catch:{ all -> 0x00c9 }
            r1 = (com.google.common.cache.ReferenceEntry) r1;	 Catch:{ all -> 0x00c9 }
            r14 = r1;	 Catch:{ all -> 0x00c9 }
            if (r14 == 0) goto L_0x00b0;	 Catch:{ all -> 0x00c9 }
            r2 = r14.getKey();	 Catch:{ all -> 0x00c9 }
            r4 = r14.getHash();	 Catch:{ all -> 0x00c9 }
            if (r4 != r3) goto L_0x00a9;	 Catch:{ all -> 0x00c9 }
            if (r2 == 0) goto L_0x00a9;	 Catch:{ all -> 0x00c9 }
            r4 = r7.map;	 Catch:{ all -> 0x00c9 }
            r4 = r4.keyEquivalence;	 Catch:{ all -> 0x00c9 }
            r2 = r4.equivalent(r0, r2);	 Catch:{ all -> 0x00c9 }
            if (r2 == 0) goto L_0x00a9;	 Catch:{ all -> 0x00c9 }
            r1 = r14.getValueReference();	 Catch:{ all -> 0x00c9 }
            r4 = r1.get();	 Catch:{ all -> 0x00c9 }
            r2 = r18;	 Catch:{ all -> 0x00c9 }
            if (r2 == r1) goto L_0x0072;	 Catch:{ all -> 0x00c9 }
            if (r4 != 0) goto L_0x005d;	 Catch:{ all -> 0x00c9 }
            r5 = com.google.common.cache.LocalCache.UNSET;	 Catch:{ all -> 0x00c9 }
            if (r1 == r5) goto L_0x005d;	 Catch:{ all -> 0x00c9 }
            goto L_0x0072;	 Catch:{ all -> 0x00c9 }
            r5 = 0;	 Catch:{ all -> 0x00c9 }
            r6 = com.google.common.cache.RemovalCause.REPLACED;	 Catch:{ all -> 0x00c9 }
            r1 = r15;	 Catch:{ all -> 0x00c9 }
            r2 = r16;	 Catch:{ all -> 0x00c9 }
            r3 = r17;	 Catch:{ all -> 0x00c9 }
            r4 = r19;	 Catch:{ all -> 0x00c9 }
            r1.enqueueNotification(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00c9 }
            r15.unlock();
            r15.postWriteCleanup();
            r0 = 0;
            return r0;
            r1 = r7.modCount;	 Catch:{ all -> 0x00c9 }
            r1 = r1 + r10;	 Catch:{ all -> 0x00c9 }
            r7.modCount = r1;	 Catch:{ all -> 0x00c9 }
            r1 = r18.isActive();	 Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x0093;	 Catch:{ all -> 0x00c9 }
            if (r4 != 0) goto L_0x0082;	 Catch:{ all -> 0x00c9 }
            r1 = com.google.common.cache.RemovalCause.COLLECTED;	 Catch:{ all -> 0x00c9 }
            goto L_0x0084;	 Catch:{ all -> 0x00c9 }
            r1 = com.google.common.cache.RemovalCause.REPLACED;	 Catch:{ all -> 0x00c9 }
            r6 = r1;	 Catch:{ all -> 0x00c9 }
            r5 = r18.getWeight();	 Catch:{ all -> 0x00c9 }
            r1 = r15;	 Catch:{ all -> 0x00c9 }
            r2 = r16;	 Catch:{ all -> 0x00c9 }
            r3 = r17;	 Catch:{ all -> 0x00c9 }
            r1.enqueueNotification(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00c9 }
            r11 = r11 + -1;	 Catch:{ all -> 0x00c9 }
            r1 = r15;	 Catch:{ all -> 0x00c9 }
            r2 = r14;	 Catch:{ all -> 0x00c9 }
            r3 = r16;	 Catch:{ all -> 0x00c9 }
            r4 = r19;	 Catch:{ all -> 0x00c9 }
            r5 = r8;	 Catch:{ all -> 0x00c9 }
            r1.setValue(r2, r3, r4, r5);	 Catch:{ all -> 0x00c9 }
            r7.count = r11;	 Catch:{ all -> 0x00c9 }
            r15.evictEntries(r14);	 Catch:{ all -> 0x00c9 }
            r15.unlock();
            r15.postWriteCleanup();
            return r10;
            r2 = r18;
            r14 = r14.getNext();	 Catch:{ all -> 0x00c9 }
            goto L_0x0032;	 Catch:{ all -> 0x00c9 }
            r2 = r7.modCount;	 Catch:{ all -> 0x00c9 }
            r2 = r2 + r10;	 Catch:{ all -> 0x00c9 }
            r7.modCount = r2;	 Catch:{ all -> 0x00c9 }
            r14 = r15.newEntry(r0, r3, r1);	 Catch:{ all -> 0x00c9 }
            r1 = r15;	 Catch:{ all -> 0x00c9 }
            r2 = r14;	 Catch:{ all -> 0x00c9 }
            r3 = r16;	 Catch:{ all -> 0x00c9 }
            r4 = r19;	 Catch:{ all -> 0x00c9 }
            r5 = r8;	 Catch:{ all -> 0x00c9 }
            r1.setValue(r2, r3, r4, r5);	 Catch:{ all -> 0x00c9 }
            r12.set(r13, r14);	 Catch:{ all -> 0x00c9 }
            r7.count = r11;	 Catch:{ all -> 0x00c9 }
            goto L_0x009f;
            r0 = move-exception;
            r15.unlock();
            r15.postWriteCleanup();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.storeLoadedValue(java.lang.Object, int, com.google.common.cache.LocalCache$LoadingValueReference, java.lang.Object):boolean");
        }

        /* Access modifiers changed, original: 0000 */
        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void tryExpireEntries(long j) {
            if (tryLock()) {
                try {
                    expireEntries(j);
                } finally {
                    unlock();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public V waitForLoadingValue(ReferenceEntry<K, V> referenceEntry, K k, ValueReference<K, V> valueReference) {
            if (valueReference.isLoading()) {
                Preconditions.checkState(Thread.holdsLock(referenceEntry) ^ 1, "Recursive load of: %s", (Object) k);
                try {
                    V waitForValue = valueReference.waitForValue();
                    if (waitForValue != null) {
                        recordRead(referenceEntry, this.map.ticker.read());
                        return waitForValue;
                    }
                    StringBuilder stringBuilder = new StringBuilder("CacheLoader returned null for key ");
                    stringBuilder.append(k);
                    stringBuilder.append(".");
                    throw new InvalidCacheLoadException(stringBuilder.toString());
                } finally {
                    this.statsCounter.recordMisses(1);
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {
        final int hash;
        final ReferenceEntry<K, V> next;
        volatile ValueReference<K, V> valueReference = LocalCache.unset();

        WeakEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, referenceQueue);
            this.hash = i;
            this.next = referenceEntry;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        public int getHash() {
            return this.hash;
        }

        public K getKey() {
            return get();
        }

        public ReferenceEntry<K, V> getNext() {
            return this.next;
        }

        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(ValueReference<K, V> valueReference) {
            this.valueReference = valueReference;
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        AbstractReferenceEntry() {
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        public int getHash() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public ValueReference<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(ValueReference<K, V> valueReference) {
            throw new UnsupportedOperationException();
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    static final class AccessQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        final ReferenceEntry<K, V> head = new AbstractReferenceEntry<K, V>() {
            ReferenceEntry<K, V> nextAccess = this;
            ReferenceEntry<K, V> previousAccess = this;

            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            public ReferenceEntry<K, V> getNextInAccessQueue() {
                return this.nextAccess;
            }

            public ReferenceEntry<K, V> getPreviousInAccessQueue() {
                return this.previousAccess;
            }

            public void setAccessTime(long j) {
            }

            public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.nextAccess = referenceEntry;
            }

            public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.previousAccess = referenceEntry;
            }
        };

        AccessQueue() {
        }

        public final void clear() {
            ReferenceEntry nextInAccessQueue = this.head.getNextInAccessQueue();
            while (true) {
                ReferenceEntry referenceEntry = this.head;
                if (nextInAccessQueue != referenceEntry) {
                    referenceEntry = nextInAccessQueue.getNextInAccessQueue();
                    LocalCache.nullifyAccessOrder(nextInAccessQueue);
                    nextInAccessQueue = referenceEntry;
                } else {
                    referenceEntry.setNextInAccessQueue(referenceEntry);
                    nextInAccessQueue = this.head;
                    nextInAccessQueue.setPreviousInAccessQueue(nextInAccessQueue);
                    return;
                }
            }
        }

        public final boolean contains(Object obj) {
            return ((ReferenceEntry) obj).getNextInAccessQueue() != NullEntry.INSTANCE;
        }

        public final boolean isEmpty() {
            return this.head.getNextInAccessQueue() == this.head;
        }

        public final Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) {
                /* Access modifiers changed, original: protected */
                public ReferenceEntry<K, V> computeNext(ReferenceEntry<K, V> referenceEntry) {
                    ReferenceEntry nextInAccessQueue = referenceEntry.getNextInAccessQueue();
                    return nextInAccessQueue == AccessQueue.this.head ? null : nextInAccessQueue;
                }
            };
        }

        public final boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.connectAccessOrder(referenceEntry.getPreviousInAccessQueue(), referenceEntry.getNextInAccessQueue());
            LocalCache.connectAccessOrder(this.head.getPreviousInAccessQueue(), referenceEntry);
            LocalCache.connectAccessOrder(referenceEntry, this.head);
            return true;
        }

        public final ReferenceEntry<K, V> peek() {
            ReferenceEntry nextInAccessQueue = this.head.getNextInAccessQueue();
            return nextInAccessQueue == this.head ? null : nextInAccessQueue;
        }

        public final ReferenceEntry<K, V> poll() {
            ReferenceEntry nextInAccessQueue = this.head.getNextInAccessQueue();
            if (nextInAccessQueue == this.head) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        public final boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry previousInAccessQueue = referenceEntry.getPreviousInAccessQueue();
            ReferenceEntry nextInAccessQueue = referenceEntry.getNextInAccessQueue();
            LocalCache.connectAccessOrder(previousInAccessQueue, nextInAccessQueue);
            LocalCache.nullifyAccessOrder(referenceEntry);
            return nextInAccessQueue != NullEntry.INSTANCE;
        }

        public final int size() {
            int i = 0;
            for (ReferenceEntry nextInAccessQueue = this.head.getNextInAccessQueue(); nextInAccessQueue != this.head; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }
    }

    abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        final ConcurrentMap<?, ?> map;

        AbstractCacheSet(ConcurrentMap<?, ?> concurrentMap) {
            this.map = concurrentMap;
        }

        public void clear() {
            this.map.clear();
        }

        public boolean isEmpty() {
            return this.map.isEmpty();
        }

        public int size() {
            return this.map.size();
        }

        public Object[] toArray() {
            return LocalCache.toArrayList(this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return LocalCache.toArrayList(this).toArray(eArr);
        }
    }

    abstract class HashIterator<T> implements Iterator<T> {
        Segment<K, V> currentSegment;
        AtomicReferenceArray<ReferenceEntry<K, V>> currentTable;
        WriteThroughEntry lastReturned;
        ReferenceEntry<K, V> nextEntry;
        WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex = -1;

        HashIterator() {
            this.nextSegmentIndex = LocalCache.this.segments.length - 1;
            advance();
        }

        /* Access modifiers changed, original: final */
        public final void advance() {
            this.nextExternal = null;
            if (!nextInChain() && !nextInTable()) {
                while (this.nextSegmentIndex >= 0) {
                    Segment[] segmentArr = LocalCache.this.segments;
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
        public boolean advanceTo(ReferenceEntry<K, V> referenceEntry) {
            try {
                long read = LocalCache.this.ticker.read();
                Object key = referenceEntry.getKey();
                Object liveValue = LocalCache.this.getLiveValue(referenceEntry, read);
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
            ReferenceEntry referenceEntry = this.nextEntry;
            if (referenceEntry != null) {
                while (true) {
                    this.nextEntry = referenceEntry.getNext();
                    referenceEntry = this.nextEntry;
                    if (referenceEntry == null) {
                        break;
                    } else if (advanceTo(referenceEntry)) {
                        return true;
                    } else {
                        referenceEntry = this.nextEntry;
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
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i);
                this.nextEntry = referenceEntry;
                if (referenceEntry == null || !(advanceTo(this.nextEntry) || nextInChain())) {
                }
            }
            return true;
        }

        public void remove() {
            Preconditions.checkState(this.lastReturned != null);
            LocalCache.this.remove(this.lastReturned.getKey());
            this.lastReturned = null;
        }
    }

    final class Values extends AbstractCollection<V> {
        private final ConcurrentMap<?, ?> map;

        Values(ConcurrentMap<?, ?> concurrentMap) {
            this.map = concurrentMap;
        }

        public final void clear() {
            this.map.clear();
        }

        public final boolean contains(Object obj) {
            return this.map.containsValue(obj);
        }

        public final boolean isEmpty() {
            return this.map.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new ValueIterator();
        }

        public final int size() {
            return this.map.size();
        }

        public final Object[] toArray() {
            return LocalCache.toArrayList(this).toArray();
        }

        public final <E> E[] toArray(E[] eArr) {
            return LocalCache.toArrayList(this).toArray(eArr);
        }
    }

    static final class WriteQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        final ReferenceEntry<K, V> head = new AbstractReferenceEntry<K, V>() {
            ReferenceEntry<K, V> nextWrite = this;
            ReferenceEntry<K, V> previousWrite = this;

            public ReferenceEntry<K, V> getNextInWriteQueue() {
                return this.nextWrite;
            }

            public ReferenceEntry<K, V> getPreviousInWriteQueue() {
                return this.previousWrite;
            }

            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.nextWrite = referenceEntry;
            }

            public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.previousWrite = referenceEntry;
            }

            public void setWriteTime(long j) {
            }
        };

        WriteQueue() {
        }

        public final void clear() {
            ReferenceEntry nextInWriteQueue = this.head.getNextInWriteQueue();
            while (true) {
                ReferenceEntry referenceEntry = this.head;
                if (nextInWriteQueue != referenceEntry) {
                    referenceEntry = nextInWriteQueue.getNextInWriteQueue();
                    LocalCache.nullifyWriteOrder(nextInWriteQueue);
                    nextInWriteQueue = referenceEntry;
                } else {
                    referenceEntry.setNextInWriteQueue(referenceEntry);
                    nextInWriteQueue = this.head;
                    nextInWriteQueue.setPreviousInWriteQueue(nextInWriteQueue);
                    return;
                }
            }
        }

        public final boolean contains(Object obj) {
            return ((ReferenceEntry) obj).getNextInWriteQueue() != NullEntry.INSTANCE;
        }

        public final boolean isEmpty() {
            return this.head.getNextInWriteQueue() == this.head;
        }

        public final Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) {
                /* Access modifiers changed, original: protected */
                public ReferenceEntry<K, V> computeNext(ReferenceEntry<K, V> referenceEntry) {
                    ReferenceEntry nextInWriteQueue = referenceEntry.getNextInWriteQueue();
                    return nextInWriteQueue == WriteQueue.this.head ? null : nextInWriteQueue;
                }
            };
        }

        public final boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.connectWriteOrder(referenceEntry.getPreviousInWriteQueue(), referenceEntry.getNextInWriteQueue());
            LocalCache.connectWriteOrder(this.head.getPreviousInWriteQueue(), referenceEntry);
            LocalCache.connectWriteOrder(referenceEntry, this.head);
            return true;
        }

        public final ReferenceEntry<K, V> peek() {
            ReferenceEntry nextInWriteQueue = this.head.getNextInWriteQueue();
            return nextInWriteQueue == this.head ? null : nextInWriteQueue;
        }

        public final ReferenceEntry<K, V> poll() {
            ReferenceEntry nextInWriteQueue = this.head.getNextInWriteQueue();
            if (nextInWriteQueue == this.head) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        public final boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry previousInWriteQueue = referenceEntry.getPreviousInWriteQueue();
            ReferenceEntry nextInWriteQueue = referenceEntry.getNextInWriteQueue();
            LocalCache.connectWriteOrder(previousInWriteQueue, nextInWriteQueue);
            LocalCache.nullifyWriteOrder(referenceEntry);
            return nextInWriteQueue != NullEntry.INSTANCE;
        }

        public final int size() {
            int i = 0;
            for (ReferenceEntry nextInWriteQueue = this.head.getNextInWriteQueue(); nextInWriteQueue != this.head; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }
    }

    final class WriteThroughEntry implements Entry<K, V> {
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
            Object put = LocalCache.this.put(this.key, v);
            this.value = v;
            return put;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getKey());
            stringBuilder.append("=");
            stringBuilder.append(getValue());
            return stringBuilder.toString();
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

    final class EntrySet extends AbstractCacheSet<Entry<K, V>> {
        EntrySet(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
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
            key = LocalCache.this.get(key);
            return key != null && LocalCache.this.valueEquivalence.equivalent(entry.getValue(), key);
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
            return key != null && LocalCache.this.remove(key, entry.getValue());
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

    final class KeySet extends AbstractCacheSet<K> {
        KeySet(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        public final boolean contains(Object obj) {
            return this.map.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new KeyIterator();
        }

        public final boolean remove(Object obj) {
            return this.map.remove(obj) != null;
        }
    }

    enum NullEntry implements ReferenceEntry<Object, Object> {
        INSTANCE;

        public final long getAccessTime() {
            return 0;
        }

        public final int getHash() {
            return 0;
        }

        public final Object getKey() {
            return null;
        }

        public final ReferenceEntry<Object, Object> getNext() {
            return null;
        }

        public final ReferenceEntry<Object, Object> getNextInAccessQueue() {
            return this;
        }

        public final ReferenceEntry<Object, Object> getNextInWriteQueue() {
            return this;
        }

        public final ReferenceEntry<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        public final ReferenceEntry<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        public final ValueReference<Object, Object> getValueReference() {
            return null;
        }

        public final long getWriteTime() {
            return 0;
        }

        public final void setAccessTime(long j) {
        }

        public final void setNextInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        public final void setNextInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        public final void setPreviousInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        public final void setPreviousInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        public final void setValueReference(ValueReference<Object, Object> valueReference) {
        }

        public final void setWriteTime(long j) {
        }
    }

    static class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {
        final ReferenceEntry<K, V> entry;

        SoftValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.entry = referenceEntry;
        }

        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new SoftValueReference(referenceQueue, v, referenceEntry);
        }

        public ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }

        public int getWeight() {
            return 1;
        }

        public boolean isActive() {
            return true;
        }

        public boolean isLoading() {
            return false;
        }

        public void notifyNewValue(V v) {
        }

        public V waitForValue() {
            return get();
        }
    }

    final class ValueIterator extends HashIterator<V> {
        ValueIterator() {
            super();
        }

        public final V next() {
            return nextEntry().getValue();
        }
    }

    static class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {
        final ReferenceEntry<K, V> entry;

        WeakValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.entry = referenceEntry;
        }

        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeakValueReference(referenceQueue, v, referenceEntry);
        }

        public ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }

        public int getWeight() {
            return 1;
        }

        public boolean isActive() {
            return true;
        }

        public boolean isLoading() {
            return false;
        }

        public void notifyNewValue(V v) {
        }

        public V waitForValue() {
            return get();
        }
    }

    static class StrongEntry<K, V> extends AbstractReferenceEntry<K, V> {
        final int hash;
        final K key;
        final ReferenceEntry<K, V> next;
        volatile ValueReference<K, V> valueReference = LocalCache.unset();

        StrongEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            this.key = k;
            this.hash = i;
            this.next = referenceEntry;
        }

        public int getHash() {
            return this.hash;
        }

        public K getKey() {
            return this.key;
        }

        public ReferenceEntry<K, V> getNext() {
            return this.next;
        }

        public ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        public void setValueReference(ValueReference<K, V> valueReference) {
            this.valueReference = valueReference;
        }
    }

    static final class WeakAccessEntry<K, V> extends WeakEntry<K, V> {
        volatile long accessTime = Long.MAX_VALUE;
        ReferenceEntry<K, V> nextAccess = LocalCache.nullEntry();
        ReferenceEntry<K, V> previousAccess = LocalCache.nullEntry();

        WeakAccessEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
        }

        public final long getAccessTime() {
            return this.accessTime;
        }

        public final ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        public final ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        public final void setAccessTime(long j) {
            this.accessTime = j;
        }

        public final void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        public final void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }
    }

    static final class WeakAccessWriteEntry<K, V> extends WeakEntry<K, V> {
        volatile long accessTime = Long.MAX_VALUE;
        ReferenceEntry<K, V> nextAccess = LocalCache.nullEntry();
        ReferenceEntry<K, V> nextWrite = LocalCache.nullEntry();
        ReferenceEntry<K, V> previousAccess = LocalCache.nullEntry();
        ReferenceEntry<K, V> previousWrite = LocalCache.nullEntry();
        volatile long writeTime = Long.MAX_VALUE;

        WeakAccessWriteEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
        }

        public final long getAccessTime() {
            return this.accessTime;
        }

        public final ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        public final ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        public final ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        public final ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        public final long getWriteTime() {
            return this.writeTime;
        }

        public final void setAccessTime(long j) {
            this.accessTime = j;
        }

        public final void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        public final void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        public final void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }

        public final void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        public final void setWriteTime(long j) {
            this.writeTime = j;
        }
    }

    static final class WeakWriteEntry<K, V> extends WeakEntry<K, V> {
        ReferenceEntry<K, V> nextWrite = LocalCache.nullEntry();
        ReferenceEntry<K, V> previousWrite = LocalCache.nullEntry();
        volatile long writeTime = Long.MAX_VALUE;

        WeakWriteEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
        }

        public final ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        public final ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        public final long getWriteTime() {
            return this.writeTime;
        }

        public final void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        public final void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        public final void setWriteTime(long j) {
            this.writeTime = j;
        }
    }

    static final class WeightedSoftValueReference<K, V> extends SoftValueReference<K, V> {
        final int weight;

        WeightedSoftValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
            super(referenceQueue, v, referenceEntry);
            this.weight = i;
        }

        public final ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedSoftValueReference(referenceQueue, v, referenceEntry, this.weight);
        }

        public final int getWeight() {
            return this.weight;
        }
    }

    static final class WeightedStrongValueReference<K, V> extends StrongValueReference<K, V> {
        final int weight;

        WeightedStrongValueReference(V v, int i) {
            super(v);
            this.weight = i;
        }

        public final int getWeight() {
            return this.weight;
        }
    }

    static final class WeightedWeakValueReference<K, V> extends WeakValueReference<K, V> {
        final int weight;

        WeightedWeakValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
            super(referenceQueue, v, referenceEntry);
            this.weight = i;
        }

        public final ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedWeakValueReference(referenceQueue, v, referenceEntry, this.weight);
        }

        public final int getWeight() {
            return this.weight;
        }
    }

    static final class StrongAccessEntry<K, V> extends StrongEntry<K, V> {
        volatile long accessTime = Long.MAX_VALUE;
        ReferenceEntry<K, V> nextAccess = LocalCache.nullEntry();
        ReferenceEntry<K, V> previousAccess = LocalCache.nullEntry();

        StrongAccessEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
        }

        public final long getAccessTime() {
            return this.accessTime;
        }

        public final ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        public final ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        public final void setAccessTime(long j) {
            this.accessTime = j;
        }

        public final void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        public final void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }
    }

    static final class StrongAccessWriteEntry<K, V> extends StrongEntry<K, V> {
        volatile long accessTime = Long.MAX_VALUE;
        ReferenceEntry<K, V> nextAccess = LocalCache.nullEntry();
        ReferenceEntry<K, V> nextWrite = LocalCache.nullEntry();
        ReferenceEntry<K, V> previousAccess = LocalCache.nullEntry();
        ReferenceEntry<K, V> previousWrite = LocalCache.nullEntry();
        volatile long writeTime = Long.MAX_VALUE;

        StrongAccessWriteEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
        }

        public final long getAccessTime() {
            return this.accessTime;
        }

        public final ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        public final ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        public final ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        public final ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        public final long getWriteTime() {
            return this.writeTime;
        }

        public final void setAccessTime(long j) {
            this.accessTime = j;
        }

        public final void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        public final void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        public final void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }

        public final void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        public final void setWriteTime(long j) {
            this.writeTime = j;
        }
    }

    static final class StrongWriteEntry<K, V> extends StrongEntry<K, V> {
        ReferenceEntry<K, V> nextWrite = LocalCache.nullEntry();
        ReferenceEntry<K, V> previousWrite = LocalCache.nullEntry();
        volatile long writeTime = Long.MAX_VALUE;

        StrongWriteEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
        }

        public final ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        public final ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        public final long getWriteTime() {
            return this.writeTime;
        }

        public final void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        public final void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        public final void setWriteTime(long j) {
            this.writeTime = j;
        }
    }

    LocalCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
        this.concurrencyLevel = Math.min(cacheBuilder.getConcurrencyLevel(), Imgproc.FLOODFILL_FIXED_RANGE);
        this.keyStrength = cacheBuilder.getKeyStrength();
        this.valueStrength = cacheBuilder.getValueStrength();
        this.keyEquivalence = cacheBuilder.getKeyEquivalence();
        this.valueEquivalence = cacheBuilder.getValueEquivalence();
        this.maxWeight = cacheBuilder.getMaximumWeight();
        this.weigher = cacheBuilder.getWeigher();
        this.expireAfterAccessNanos = cacheBuilder.getExpireAfterAccessNanos();
        this.expireAfterWriteNanos = cacheBuilder.getExpireAfterWriteNanos();
        this.refreshNanos = cacheBuilder.getRefreshNanos();
        this.removalListener = cacheBuilder.getRemovalListener();
        this.removalNotificationQueue = this.removalListener == NullListener.INSTANCE ? discardingQueue() : new ConcurrentLinkedQueue();
        this.ticker = cacheBuilder.getTicker(recordsTime());
        this.entryFactory = EntryFactory.getFactory(this.keyStrength, usesAccessEntries(), usesWriteEntries());
        this.globalStatsCounter = (StatsCounter) cacheBuilder.getStatsCounterSupplier().get();
        this.defaultLoader = cacheLoader;
        int min = Math.min(cacheBuilder.getInitialCapacity(), AudioPlayer.INFINITY_LOOP_COUNT);
        if (evictsBySize() && !customWeigher()) {
            min = (int) Math.min((long) min, this.maxWeight);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.concurrencyLevel && (!evictsBySize() || ((long) (i3 * 20)) <= this.maxWeight)) {
            i4++;
            i3 <<= 1;
        }
        this.segmentShift = 32 - i4;
        this.segmentMask = i3 - 1;
        this.segments = newSegmentArray(i3);
        i4 = min / i3;
        if (i4 * i3 < min) {
            i4++;
        }
        while (i2 < i4) {
            i2 <<= 1;
        }
        if (evictsBySize()) {
            long j = this.maxWeight;
            long j2 = (long) i3;
            long j3 = (j / j2) + 1;
            j %= j2;
            while (i < this.segments.length) {
                if (((long) i) == j) {
                    j3--;
                }
                this.segments[i] = createSegment(i2, j3, (StatsCounter) cacheBuilder.getStatsCounterSupplier().get());
                i++;
            }
            return;
        }
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i < segmentArr.length) {
                segmentArr[i] = createSegment(i2, -1, (StatsCounter) cacheBuilder.getStatsCounterSupplier().get());
                i++;
            } else {
                return;
            }
        }
    }

    static <K, V> void connectAccessOrder(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInAccessQueue(referenceEntry2);
        referenceEntry2.setPreviousInAccessQueue(referenceEntry);
    }

    static <K, V> void connectWriteOrder(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInWriteQueue(referenceEntry2);
        referenceEntry2.setPreviousInWriteQueue(referenceEntry);
    }

    static <E> Queue<E> discardingQueue() {
        return DISCARDING_QUEUE;
    }

    static <K, V> ReferenceEntry<K, V> nullEntry() {
        return NullEntry.INSTANCE;
    }

    static <K, V> void nullifyAccessOrder(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry nullEntry = nullEntry();
        referenceEntry.setNextInAccessQueue(nullEntry);
        referenceEntry.setPreviousInAccessQueue(nullEntry);
    }

    static <K, V> void nullifyWriteOrder(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry nullEntry = nullEntry();
        referenceEntry.setNextInWriteQueue(nullEntry);
        referenceEntry.setPreviousInWriteQueue(nullEntry);
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

    static <K, V> ValueReference<K, V> unset() {
        return UNSET;
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
        long read = this.ticker.read();
        Segment[] segmentArr = this.segments;
        long j = -1;
        int i = 0;
        while (i < 3) {
            Segment[] segmentArr2;
            long j2;
            int length = segmentArr.length;
            long j3 = 0;
            int i2 = 0;
            while (i2 < length) {
                Segment segment = segmentArr[i2];
                int i3 = segment.count;
                AtomicReferenceArray atomicReferenceArray = segment.table;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i4);
                    while (referenceEntry != null) {
                        segmentArr2 = segmentArr;
                        Object liveValue = segment.getLiveValue(referenceEntry, read);
                        if (liveValue != null) {
                            j2 = read;
                            if (this.valueEquivalence.equivalent(obj2, liveValue)) {
                                return true;
                            }
                        } else {
                            j2 = read;
                        }
                        referenceEntry = referenceEntry.getNext();
                        segmentArr = segmentArr2;
                        read = j2;
                    }
                    j2 = read;
                    segmentArr2 = segmentArr;
                }
                segmentArr2 = segmentArr;
                j3 += (long) segment.modCount;
                i2++;
                read = read;
            }
            j2 = read;
            segmentArr2 = segmentArr;
            if (j3 == j) {
                break;
            }
            i++;
            j = j3;
            segmentArr = segmentArr2;
            read = j2;
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public Segment<K, V> createSegment(int i, long j, StatsCounter statsCounter) {
        return new Segment(this, i, j, statsCounter);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean customWeigher() {
        return this.weigher != OneWeigher.INSTANCE;
    }

    public Set<Entry<K, V>> entrySet() {
        Set set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet(this);
        this.entrySet = entrySet;
        return entrySet;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean evictsBySize() {
        return this.maxWeight >= 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean expiresAfterAccess() {
        return this.expireAfterAccessNanos > 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean expiresAfterWrite() {
        return this.expireAfterWriteNanos > 0;
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).get(obj, hash);
    }

    /* Access modifiers changed, original: 0000 */
    public V get(K k, CacheLoader<? super K, V> cacheLoader) {
        int hash = hash(Preconditions.checkNotNull(k));
        return segmentFor(hash).get(k, hash, cacheLoader);
    }

    public V getIfPresent(Object obj) {
        int hash = hash(Preconditions.checkNotNull(obj));
        obj = segmentFor(hash).get(obj, hash);
        if (obj == null) {
            this.globalStatsCounter.recordMisses(1);
        } else {
            this.globalStatsCounter.recordHits(1);
        }
        return obj;
    }

    /* Access modifiers changed, original: 0000 */
    public V getLiveValue(ReferenceEntry<K, V> referenceEntry, long j) {
        if (referenceEntry.getKey() == null) {
            return null;
        }
        Object obj = referenceEntry.getValueReference().get();
        return (obj == null || isExpired(referenceEntry, j)) ? null : obj;
    }

    public V getOrDefault(Object obj, V v) {
        obj = get(obj);
        return obj != null ? obj : v;
    }

    /* Access modifiers changed, original: 0000 */
    public V getOrLoad(K k) {
        return get(k, this.defaultLoader);
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

    /* Access modifiers changed, original: 0000 */
    public boolean isExpired(ReferenceEntry<K, V> referenceEntry, long j) {
        Preconditions.checkNotNull(referenceEntry);
        return (!expiresAfterAccess() || j - referenceEntry.getAccessTime() < this.expireAfterAccessNanos) ? expiresAfterWrite() && j - referenceEntry.getWriteTime() >= this.expireAfterWriteNanos : true;
    }

    public Set<K> keySet() {
        Set set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet(this);
        this.keySet = keySet;
        return keySet;
    }

    /* Access modifiers changed, original: 0000 */
    public long longSize() {
        long j = 0;
        for (Segment segment : this.segments) {
            j += (long) Math.max(0, segment.count);
        }
        return j;
    }

    /* Access modifiers changed, original: final */
    public final Segment<K, V>[] newSegmentArray(int i) {
        return new Segment[i];
    }

    /* Access modifiers changed, original: 0000 */
    public void processPendingNotifications() {
        while (true) {
            RemovalNotification removalNotification = (RemovalNotification) this.removalNotificationQueue.poll();
            if (removalNotification != null) {
                try {
                    this.removalListener.onRemoval(removalNotification);
                } catch (Throwable th) {
                    logger.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
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
    public void reclaimKey(ReferenceEntry<K, V> referenceEntry) {
        int hash = referenceEntry.getHash();
        segmentFor(hash).reclaimKey(referenceEntry, hash);
    }

    /* Access modifiers changed, original: 0000 */
    public void reclaimValue(ValueReference<K, V> valueReference) {
        ReferenceEntry entry = valueReference.getEntry();
        int hash = entry.getHash();
        segmentFor(hash).reclaimValue(entry.getKey(), hash, valueReference);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean recordsAccess() {
        return expiresAfterAccess();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean recordsTime() {
        return recordsWrite() || recordsAccess();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean recordsWrite() {
        return expiresAfterWrite() || refreshes();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean refreshes() {
        return this.refreshNanos > 0;
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
    public Segment<K, V> segmentFor(int i) {
        return this.segments[(i >>> this.segmentShift) & this.segmentMask];
    }

    public int size() {
        return Ints.saturatedCast(longSize());
    }

    /* Access modifiers changed, original: 0000 */
    public boolean usesAccessEntries() {
        return usesAccessQueue() || recordsAccess();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean usesAccessQueue() {
        return expiresAfterAccess() || evictsBySize();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean usesKeyReferences() {
        return this.keyStrength != Strength.STRONG;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean usesValueReferences() {
        return this.valueStrength != Strength.STRONG;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean usesWriteEntries() {
        return usesWriteQueue() || recordsWrite();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean usesWriteQueue() {
        return expiresAfterWrite();
    }

    public Collection<V> values() {
        Collection collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values = new Values(this);
        this.values = values;
        return values;
    }
}
