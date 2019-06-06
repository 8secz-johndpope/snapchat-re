package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    transient long[] entries;
    private transient Set<Entry<K, V>> entrySetView;
    private transient Set<K> keySetView;
    transient Object[] keys;
    transient float loadFactor;
    transient int modCount;
    private transient int size;
    private transient int[] table;
    private transient int threshold;
    transient Object[] values;
    private transient Collection<V> valuesView;

    abstract class Itr<T> implements Iterator<T> {
        int currentIndex;
        int expectedModCount;
        int indexToRemove;

        private Itr() {
            this.expectedModCount = CompactHashMap.this.modCount;
            this.currentIndex = CompactHashMap.this.firstEntryIndex();
            this.indexToRemove = -1;
        }

        /* synthetic */ Itr(CompactHashMap compactHashMap, AnonymousClass1 anonymousClass1) {
            this();
        }

        private void checkForConcurrentModification() {
            if (CompactHashMap.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract T getOutput(int i);

        public boolean hasNext() {
            return this.currentIndex >= 0;
        }

        public T next() {
            checkForConcurrentModification();
            if (hasNext()) {
                int i = this.currentIndex;
                this.indexToRemove = i;
                Object output = getOutput(i);
                this.currentIndex = CompactHashMap.this.getSuccessor(this.currentIndex);
                return output;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            checkForConcurrentModification();
            CollectPreconditions.checkRemove(this.indexToRemove >= 0);
            this.expectedModCount++;
            CompactHashMap.this.removeEntry(this.indexToRemove);
            this.currentIndex = CompactHashMap.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
            this.indexToRemove = -1;
        }
    }

    class EntrySetView extends AbstractSet<Entry<K, V>> {
        EntrySetView() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public boolean contains(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                int access$200 = CompactHashMap.this.indexOf(entry.getKey());
                if (access$200 != -1 && Objects.equal(CompactHashMap.this.values[access$200], entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        public Iterator<Entry<K, V>> iterator() {
            return CompactHashMap.this.entrySetIterator();
        }

        public boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                int access$200 = CompactHashMap.this.indexOf(entry.getKey());
                if (access$200 != -1 && Objects.equal(CompactHashMap.this.values[access$200], entry.getValue())) {
                    CompactHashMap.this.removeEntry(access$200);
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return CompactHashMap.this.size;
        }
    }

    final class MapEntry extends AbstractMapEntry<K, V> {
        private final K key;
        private int lastKnownIndex;

        MapEntry(int i) {
            this.key = CompactHashMap.this.keys[i];
            this.lastKnownIndex = i;
        }

        private void updateLastKnownIndex() {
            int i = this.lastKnownIndex;
            if (i == -1 || i >= CompactHashMap.this.size() || !Objects.equal(this.key, CompactHashMap.this.keys[this.lastKnownIndex])) {
                this.lastKnownIndex = CompactHashMap.this.indexOf(this.key);
            }
        }

        public final K getKey() {
            return this.key;
        }

        public final V getValue() {
            updateLastKnownIndex();
            return this.lastKnownIndex == -1 ? null : CompactHashMap.this.values[this.lastKnownIndex];
        }

        public final V setValue(V v) {
            updateLastKnownIndex();
            if (this.lastKnownIndex == -1) {
                CompactHashMap.this.put(this.key, v);
                return null;
            }
            V v2 = CompactHashMap.this.values[this.lastKnownIndex];
            CompactHashMap.this.values[this.lastKnownIndex] = v;
            return v2;
        }
    }

    class KeySetView extends AbstractSet<K> {
        KeySetView() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return CompactHashMap.this.keySetIterator();
        }

        public boolean remove(Object obj) {
            int access$200 = CompactHashMap.this.indexOf(obj);
            if (access$200 == -1) {
                return false;
            }
            CompactHashMap.this.removeEntry(access$200);
            return true;
        }

        public int size() {
            return CompactHashMap.this.size;
        }
    }

    class ValuesView extends AbstractCollection<V> {
        ValuesView() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public Iterator<V> iterator() {
            return CompactHashMap.this.valuesIterator();
        }

        public int size() {
            return CompactHashMap.this.size;
        }
    }

    CompactHashMap() {
        init(3, 1.0f);
    }

    CompactHashMap(int i) {
        this(i, 1.0f);
    }

    CompactHashMap(int i, float f) {
        init(i, f);
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i) {
        return new CompactHashMap(i);
    }

    private static int getHash(long j) {
        return (int) (j >>> 32);
    }

    private static int getNext(long j) {
        return (int) j;
    }

    private int hashTableMask() {
        return this.table.length - 1;
    }

    private int indexOf(Object obj) {
        int smearedHash = Hashing.smearedHash(obj);
        int i = this.table[hashTableMask() & smearedHash];
        while (i != -1) {
            long j = this.entries[i];
            if (getHash(j) == smearedHash && Objects.equal(obj, this.keys[i])) {
                return i;
            }
            i = getNext(j);
        }
        return -1;
    }

    private static long[] newEntries(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    private static int[] newTable(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private V remove(Object obj, int i) {
        int hashTableMask = hashTableMask() & i;
        int i2 = this.table[hashTableMask];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (getHash(this.entries[i2]) == i && Objects.equal(obj, this.keys[i2])) {
                V v = this.values[i2];
                if (i3 == -1) {
                    this.table[hashTableMask] = getNext(this.entries[i2]);
                } else {
                    long[] jArr = this.entries;
                    jArr[i3] = swapNext(jArr[i3], getNext(jArr[i2]));
                }
                moveLastEntry(i2);
                this.size--;
                this.modCount++;
                return v;
            }
            i3 = getNext(this.entries[i2]);
            if (i3 == -1) {
                return null;
            }
            int i4 = i3;
            i3 = i2;
            i2 = i4;
        }
    }

    private V removeEntry(int i) {
        return remove(this.keys[i], getHash(this.entries[i]));
    }

    private void resizeMeMaybe(int i) {
        int length = this.entries.length;
        if (i > length) {
            i = Math.max(1, length >>> 1) + length;
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
            if (i != length) {
                resizeEntries(i);
            }
        }
    }

    private void resizeTable(int i) {
        if (this.table.length >= AudioPlayer.INFINITY_LOOP_COUNT) {
            this.threshold = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.loadFactor)) + 1;
        int[] newTable = newTable(i);
        long[] jArr = this.entries;
        int length = newTable.length - 1;
        for (int i3 = 0; i3 < this.size; i3++) {
            int hash = getHash(jArr[i3]);
            int i4 = hash & length;
            int i5 = newTable[i4];
            newTable[i4] = i3;
            jArr[i3] = (((long) hash) << 32) | (4294967295L & ((long) i5));
        }
        this.threshold = i2;
        this.table = newTable;
    }

    private static long swapNext(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* Access modifiers changed, original: 0000 */
    public void accessEntry(int i) {
    }

    /* Access modifiers changed, original: 0000 */
    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.size, null);
        Arrays.fill(this.values, 0, this.size, null);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, -1);
        this.size = 0;
    }

    public boolean containsKey(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        for (int i = 0; i < this.size; i++) {
            if (Objects.equal(obj, this.values[i])) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public Set<Entry<K, V>> createEntrySet() {
        return new EntrySetView();
    }

    /* Access modifiers changed, original: 0000 */
    public Set<K> createKeySet() {
        return new KeySetView();
    }

    /* Access modifiers changed, original: 0000 */
    public Collection<V> createValues() {
        return new ValuesView();
    }

    public Set<Entry<K, V>> entrySet() {
        Set set = this.entrySetView;
        if (set != null) {
            return set;
        }
        set = createEntrySet();
        this.entrySetView = set;
        return set;
    }

    /* Access modifiers changed, original: 0000 */
    public Iterator<Entry<K, V>> entrySetIterator() {
        return new Itr<Entry<K, V>>() {
            /* Access modifiers changed, original: 0000 */
            public Entry<K, V> getOutput(int i) {
                return new MapEntry(i);
            }
        };
    }

    /* Access modifiers changed, original: 0000 */
    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    public V get(Object obj) {
        int indexOf = indexOf(obj);
        accessEntry(indexOf);
        return indexOf == -1 ? null : this.values[indexOf];
    }

    /* Access modifiers changed, original: 0000 */
    public int getSuccessor(int i) {
        i++;
        return i < this.size ? i : -1;
    }

    /* Access modifiers changed, original: 0000 */
    public void init(int i, float f) {
        boolean z = false;
        Preconditions.checkArgument(i >= 0, "Initial capacity must be non-negative");
        if (f > MapboxConstants.MINIMUM_ZOOM) {
            z = true;
        }
        Preconditions.checkArgument(z, "Illegal load factor");
        int closedTableSize = Hashing.closedTableSize(i, (double) f);
        this.table = newTable(closedTableSize);
        this.loadFactor = f;
        this.keys = new Object[i];
        this.values = new Object[i];
        this.entries = newEntries(i);
        this.threshold = Math.max(1, (int) (((float) closedTableSize) * f));
    }

    /* Access modifiers changed, original: 0000 */
    public void insertEntry(int i, K k, V v, int i2) {
        this.entries[i] = (((long) i2) << 32) | 4294967295L;
        this.keys[i] = k;
        this.values[i] = v;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public Set<K> keySet() {
        Set set = this.keySetView;
        if (set != null) {
            return set;
        }
        set = createKeySet();
        this.keySetView = set;
        return set;
    }

    /* Access modifiers changed, original: 0000 */
    public Iterator<K> keySetIterator() {
        return new Itr<K>() {
            /* Access modifiers changed, original: 0000 */
            public K getOutput(int i) {
                return CompactHashMap.this.keys[i];
            }
        };
    }

    /* Access modifiers changed, original: 0000 */
    public void moveLastEntry(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.keys;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.values;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.entries;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int hash = getHash(j) & hashTableMask();
            int[] iArr = this.table;
            int i2 = iArr[hash];
            if (i2 == size) {
                iArr[hash] = i;
                return;
            }
            while (true) {
                j = this.entries[i2];
                hash = getNext(j);
                if (hash == size) {
                    this.entries[i2] = swapNext(j, i);
                    return;
                }
                i2 = hash;
            }
        } else {
            this.keys[i] = null;
            this.values[i] = null;
            this.entries[i] = -1;
        }
    }

    public V put(K k, V v) {
        long[] jArr = this.entries;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int smearedHash = Hashing.smearedHash(k);
        int hashTableMask = hashTableMask() & smearedHash;
        int i = this.size;
        int[] iArr = this.table;
        int i2 = iArr[hashTableMask];
        if (i2 == -1) {
            iArr[hashTableMask] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (getHash(j) == smearedHash && Objects.equal(k, objArr[i2])) {
                    V v2 = objArr2[i2];
                    objArr2[i2] = v;
                    accessEntry(i2);
                    return v2;
                }
                hashTableMask = getNext(j);
                if (hashTableMask == -1) {
                    jArr[i2] = swapNext(j, i);
                    break;
                }
                i2 = hashTableMask;
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = i + 1;
            resizeMeMaybe(i3);
            insertEntry(i, k, v, smearedHash);
            this.size = i3;
            if (i >= this.threshold) {
                resizeTable(this.table.length * 2);
            }
            this.modCount++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    public V remove(Object obj) {
        return remove(obj, Hashing.smearedHash(obj));
    }

    /* Access modifiers changed, original: 0000 */
    public void resizeEntries(int i) {
        this.keys = Arrays.copyOf(this.keys, i);
        this.values = Arrays.copyOf(this.values, i);
        long[] jArr = this.entries;
        int length = jArr.length;
        jArr = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArr, length, i, -1);
        }
        this.entries = jArr;
    }

    public int size() {
        return this.size;
    }

    public Collection<V> values() {
        Collection collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        collection = createValues();
        this.valuesView = collection;
        return collection;
    }

    /* Access modifiers changed, original: 0000 */
    public Iterator<V> valuesIterator() {
        return new Itr<V>() {
            /* Access modifiers changed, original: 0000 */
            public V getOutput(int i) {
                return CompactHashMap.this.values[i];
            }
        };
    }
}
