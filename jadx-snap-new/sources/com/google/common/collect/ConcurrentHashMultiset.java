package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset.Entry;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class ConcurrentHashMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private final transient ConcurrentMap<E, AtomicInteger> countMap;

    class EntrySet extends EntrySet {
        private EntrySet() {
            super();
        }

        /* synthetic */ EntrySet(ConcurrentHashMultiset concurrentHashMultiset, AnonymousClass1 anonymousClass1) {
            this();
        }

        private List<Entry<E>> snapshot() {
            ArrayList newArrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(size());
            Iterators.addAll(newArrayListWithExpectedSize, iterator());
            return newArrayListWithExpectedSize;
        }

        /* Access modifiers changed, original: 0000 */
        public ConcurrentHashMultiset<E> multiset() {
            return ConcurrentHashMultiset.this;
        }

        public Object[] toArray() {
            return snapshot().toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return snapshot().toArray(tArr);
        }
    }

    ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        Preconditions.checkArgument(concurrentMap.isEmpty(), "the backing map (%s) must be empty", (Object) concurrentMap);
        this.countMap = concurrentMap;
    }

    public static <E> ConcurrentHashMultiset<E> create() {
        return new ConcurrentHashMultiset(new ConcurrentHashMap());
    }

    private List<E> snapshot() {
        ArrayList newArrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(size());
        for (Entry entry : entrySet()) {
            Object element = entry.getElement();
            for (int count = entry.getCount(); count > 0; count--) {
                newArrayListWithExpectedSize.add(element);
            }
        }
        return newArrayListWithExpectedSize;
    }

    /* JADX WARNING: Missing block: B:19:0x0057, code skipped:
            r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Missing block: B:20:0x0062, code skipped:
            if (r4.countMap.putIfAbsent(r5, r2) == null) goto L_0x006c;
     */
    public final int add(E r5, int r6) {
        /*
        r4 = this;
        com.google.common.base.Preconditions.checkNotNull(r5);
        if (r6 != 0) goto L_0x000a;
    L_0x0005:
        r5 = r4.count(r5);
        return r5;
    L_0x000a:
        r0 = "occurences";
        com.google.common.collect.CollectPreconditions.checkPositive(r6, r0);
    L_0x000f:
        r0 = r4.countMap;
        r0 = com.google.common.collect.Maps.safeGet(r0, r5);
        r0 = (java.util.concurrent.atomic.AtomicInteger) r0;
        r1 = 0;
        if (r0 != 0) goto L_0x002a;
    L_0x001a:
        r0 = r4.countMap;
        r2 = new java.util.concurrent.atomic.AtomicInteger;
        r2.<init>(r6);
        r0 = r0.putIfAbsent(r5, r2);
        r0 = (java.util.concurrent.atomic.AtomicInteger) r0;
        if (r0 != 0) goto L_0x002a;
    L_0x0029:
        return r1;
    L_0x002a:
        r2 = r0.get();
        if (r2 == 0) goto L_0x0057;
    L_0x0030:
        r3 = com.google.common.math.IntMath.checkedAdd(r2, r6);	 Catch:{ ArithmeticException -> 0x003b }
        r3 = r0.compareAndSet(r2, r3);	 Catch:{ ArithmeticException -> 0x003b }
        if (r3 == 0) goto L_0x002a;
    L_0x003a:
        return r2;
    L_0x003b:
        r5 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = "Overflow adding ";
        r0.<init>(r1);
        r0.append(r6);
        r6 = " occurrences to a count of ";
        r0.append(r6);
        r0.append(r2);
        r6 = r0.toString();
        r5.<init>(r6);
        throw r5;
    L_0x0057:
        r2 = new java.util.concurrent.atomic.AtomicInteger;
        r2.<init>(r6);
        r3 = r4.countMap;
        r3 = r3.putIfAbsent(r5, r2);
        if (r3 == 0) goto L_0x006c;
    L_0x0064:
        r3 = r4.countMap;
        r0 = r3.replace(r5, r0, r2);
        if (r0 == 0) goto L_0x000f;
    L_0x006c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.add(java.lang.Object, int):int");
    }

    public final void clear() {
        this.countMap.clear();
    }

    public final /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public final int count(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) Maps.safeGet(this.countMap, obj);
        return atomicInteger == null ? 0 : atomicInteger.get();
    }

    /* Access modifiers changed, original: final */
    public final Set<E> createElementSet() {
        final Set keySet = this.countMap.keySet();
        return new ForwardingSet<E>() {
            public boolean contains(Object obj) {
                return obj != null && Collections2.safeContains(keySet, obj);
            }

            public boolean containsAll(Collection<?> collection) {
                return standardContainsAll(collection);
            }

            /* Access modifiers changed, original: protected */
            public Set<E> delegate() {
                return keySet;
            }

            public boolean remove(Object obj) {
                return obj != null && Collections2.safeRemove(keySet, obj);
            }

            public boolean removeAll(Collection<?> collection) {
                return standardRemoveAll(collection);
            }
        };
    }

    @Deprecated
    public final Set<Entry<E>> createEntrySet() {
        return new EntrySet(this, null);
    }

    /* Access modifiers changed, original: final */
    public final int distinctElements() {
        return this.countMap.size();
    }

    /* Access modifiers changed, original: final */
    public final Iterator<E> elementIterator() {
        throw new AssertionError("should never be called");
    }

    public final /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    /* Access modifiers changed, original: final */
    public final Iterator<Entry<E>> entryIterator() {
        final AnonymousClass2 anonymousClass2 = new AbstractIterator<Entry<E>>() {
            private final Iterator<Map.Entry<E, AtomicInteger>> mapEntries = ConcurrentHashMultiset.this.countMap.entrySet().iterator();

            /* Access modifiers changed, original: protected */
            public Entry<E> computeNext() {
                while (this.mapEntries.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.mapEntries.next();
                    int i = ((AtomicInteger) entry.getValue()).get();
                    if (i != 0) {
                        return Multisets.immutableEntry(entry.getKey(), i);
                    }
                }
                return (Entry) endOfData();
            }
        };
        return new ForwardingIterator<Entry<E>>() {
            private Entry<E> last;

            /* Access modifiers changed, original: protected */
            public Iterator<Entry<E>> delegate() {
                return anonymousClass2;
            }

            public Entry<E> next() {
                this.last = (Entry) super.next();
                return this.last;
            }

            public void remove() {
                CollectPreconditions.checkRemove(this.last != null);
                ConcurrentHashMultiset.this.setCount(this.last.getElement(), 0);
                this.last = null;
            }
        };
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public final boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    public final Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    public final int remove(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        CollectPreconditions.checkPositive(i, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.safeGet(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        int i2;
        int max;
        do {
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return 0;
            }
            max = Math.max(0, i2 - i);
        } while (!atomicInteger.compareAndSet(i2, max));
        if (max == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return i2;
    }

    public final boolean removeExactly(Object obj, int i) {
        if (i == 0) {
            return true;
        }
        CollectPreconditions.checkPositive(i, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.safeGet(this.countMap, obj);
        if (atomicInteger == null) {
            return false;
        }
        int i2;
        int i3;
        do {
            i3 = atomicInteger.get();
            if (i3 < i) {
                return false;
            }
            i2 = i3 - i;
        } while (!atomicInteger.compareAndSet(i3, i2));
        if (i2 == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return true;
    }

    /* JADX WARNING: Missing block: B:10:0x002c, code skipped:
            if (r6 != 0) goto L_0x002f;
     */
    /* JADX WARNING: Missing block: B:11:0x002e, code skipped:
            return 0;
     */
    /* JADX WARNING: Missing block: B:12:0x002f, code skipped:
            r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Missing block: B:13:0x003a, code skipped:
            if (r4.countMap.putIfAbsent(r5, r2) == null) goto L_0x0044;
     */
    public final int setCount(E r5, int r6) {
        /*
        r4 = this;
        com.google.common.base.Preconditions.checkNotNull(r5);
        r0 = "count";
        com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0);
    L_0x0008:
        r0 = r4.countMap;
        r0 = com.google.common.collect.Maps.safeGet(r0, r5);
        r0 = (java.util.concurrent.atomic.AtomicInteger) r0;
        r1 = 0;
        if (r0 != 0) goto L_0x0026;
    L_0x0013:
        if (r6 != 0) goto L_0x0016;
    L_0x0015:
        return r1;
    L_0x0016:
        r0 = r4.countMap;
        r2 = new java.util.concurrent.atomic.AtomicInteger;
        r2.<init>(r6);
        r0 = r0.putIfAbsent(r5, r2);
        r0 = (java.util.concurrent.atomic.AtomicInteger) r0;
        if (r0 != 0) goto L_0x0026;
    L_0x0025:
        return r1;
    L_0x0026:
        r2 = r0.get();
        if (r2 != 0) goto L_0x0045;
    L_0x002c:
        if (r6 != 0) goto L_0x002f;
    L_0x002e:
        return r1;
    L_0x002f:
        r2 = new java.util.concurrent.atomic.AtomicInteger;
        r2.<init>(r6);
        r3 = r4.countMap;
        r3 = r3.putIfAbsent(r5, r2);
        if (r3 == 0) goto L_0x0044;
    L_0x003c:
        r3 = r4.countMap;
        r0 = r3.replace(r5, r0, r2);
        if (r0 == 0) goto L_0x0008;
    L_0x0044:
        return r1;
    L_0x0045:
        r3 = r0.compareAndSet(r2, r6);
        if (r3 == 0) goto L_0x0026;
    L_0x004b:
        if (r6 != 0) goto L_0x0052;
    L_0x004d:
        r6 = r4.countMap;
        r6.remove(r5, r0);
    L_0x0052:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.setCount(java.lang.Object, int):int");
    }

    public final boolean setCount(E e, int i, int i2) {
        Preconditions.checkNotNull(e);
        CollectPreconditions.checkNonnegative(i, "oldCount");
        CollectPreconditions.checkNonnegative(i2, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.safeGet(this.countMap, e);
        if (atomicInteger == null) {
            return i != 0 ? false : i2 == 0 || this.countMap.putIfAbsent(e, new AtomicInteger(i2)) == null;
        } else {
            int i3 = atomicInteger.get();
            if (i3 == i) {
                if (i3 == 0) {
                    if (i2 == 0) {
                        this.countMap.remove(e, atomicInteger);
                        return true;
                    }
                    AtomicInteger atomicInteger2 = new AtomicInteger(i2);
                    return this.countMap.putIfAbsent(e, atomicInteger2) == null || this.countMap.replace(e, atomicInteger, atomicInteger2);
                } else if (atomicInteger.compareAndSet(i3, i2)) {
                    if (i2 == 0) {
                        this.countMap.remove(e, atomicInteger);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public final int size() {
        long j = 0;
        for (AtomicInteger atomicInteger : this.countMap.values()) {
            j += (long) atomicInteger.get();
        }
        return Ints.saturatedCast(j);
    }

    public final Object[] toArray() {
        return snapshot().toArray();
    }

    public final <T> T[] toArray(T[] tArr) {
        return snapshot().toArray(tArr);
    }
}
