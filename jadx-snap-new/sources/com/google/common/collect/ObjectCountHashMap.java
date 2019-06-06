package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset.Entry;
import com.looksery.sdk.listener.AnalyticsListener;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Arrays;

class ObjectCountHashMap<K> {
    transient long[] entries;
    transient Object[] keys;
    private transient float loadFactor;
    transient int modCount;
    transient int size;
    private transient int[] table;
    private transient int threshold;
    transient int[] values;

    class MapEntry extends AbstractEntry<K> {
        final K key;
        int lastKnownIndex;

        MapEntry(int i) {
            this.key = ObjectCountHashMap.this.keys[i];
            this.lastKnownIndex = i;
        }

        public int getCount() {
            updateLastKnownIndex();
            return this.lastKnownIndex == -1 ? 0 : ObjectCountHashMap.this.values[this.lastKnownIndex];
        }

        public K getElement() {
            return this.key;
        }

        /* Access modifiers changed, original: 0000 */
        public void updateLastKnownIndex() {
            int i = this.lastKnownIndex;
            if (i == -1 || i >= ObjectCountHashMap.this.size() || !Objects.equal(this.key, ObjectCountHashMap.this.keys[this.lastKnownIndex])) {
                this.lastKnownIndex = ObjectCountHashMap.this.indexOf(this.key);
            }
        }
    }

    ObjectCountHashMap() {
        init(3, 1.0f);
    }

    ObjectCountHashMap(int i) {
        this(i, 1.0f);
    }

    ObjectCountHashMap(int i, float f) {
        init(i, f);
    }

    ObjectCountHashMap(ObjectCountHashMap<? extends K> objectCountHashMap) {
        init(objectCountHashMap.size(), 1.0f);
        int firstIndex = objectCountHashMap.firstIndex();
        while (firstIndex != -1) {
            put(objectCountHashMap.getKey(firstIndex), objectCountHashMap.getValue(firstIndex));
            firstIndex = objectCountHashMap.nextIndex(firstIndex);
        }
    }

    public static <K> ObjectCountHashMap<K> create() {
        return new ObjectCountHashMap();
    }

    public static <K> ObjectCountHashMap<K> createWithExpectedSize(int i) {
        return new ObjectCountHashMap(i);
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

    private int remove(Object obj, int i) {
        int hashTableMask = hashTableMask() & i;
        int i2 = this.table[hashTableMask];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (getHash(this.entries[i2]) == i && Objects.equal(obj, this.keys[i2])) {
                int i4 = this.values[i2];
                if (i3 == -1) {
                    this.table[hashTableMask] = getNext(this.entries[i2]);
                } else {
                    long[] jArr = this.entries;
                    jArr[i3] = swapNext(jArr[i3], getNext(jArr[i2]));
                }
                moveLastEntry(i2);
                this.size--;
                this.modCount++;
                return i4;
            }
            i3 = getNext(this.entries[i2]);
            if (i3 == -1) {
                return 0;
            }
            int i5 = i3;
            i3 = i2;
            i2 = i5;
        }
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

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.size, null);
        Arrays.fill(this.values, 0, this.size, 0);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, -1);
        this.size = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void ensureCapacity(int i) {
        if (i > this.entries.length) {
            resizeEntries(i);
        }
        if (i >= this.threshold) {
            resizeTable(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int firstIndex() {
        return this.size == 0 ? -1 : 0;
    }

    public int get(Object obj) {
        int indexOf = indexOf(obj);
        return indexOf == -1 ? 0 : this.values[indexOf];
    }

    /* Access modifiers changed, original: 0000 */
    public Entry<K> getEntry(int i) {
        Preconditions.checkElementIndex(i, this.size);
        return new MapEntry(i);
    }

    /* Access modifiers changed, original: 0000 */
    public K getKey(int i) {
        Preconditions.checkElementIndex(i, this.size);
        return this.keys[i];
    }

    /* Access modifiers changed, original: 0000 */
    public int getValue(int i) {
        Preconditions.checkElementIndex(i, this.size);
        return this.values[i];
    }

    /* Access modifiers changed, original: 0000 */
    public int indexOf(Object obj) {
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
        this.values = new int[i];
        this.entries = newEntries(i);
        this.threshold = Math.max(1, (int) (((float) closedTableSize) * f));
    }

    /* Access modifiers changed, original: 0000 */
    public void insertEntry(int i, K k, int i2, int i3) {
        this.entries[i] = (((long) i3) << 32) | 4294967295L;
        this.keys[i] = k;
        this.values[i] = i2;
    }

    /* Access modifiers changed, original: 0000 */
    public void moveLastEntry(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.keys;
            objArr[i] = objArr[size];
            int[] iArr = this.values;
            iArr[i] = iArr[size];
            objArr[size] = null;
            iArr[size] = 0;
            long[] jArr = this.entries;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int hash = getHash(j) & hashTableMask();
            int[] iArr2 = this.table;
            int i2 = iArr2[hash];
            if (i2 == size) {
                iArr2[hash] = i;
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
            this.values[i] = 0;
            this.entries[i] = -1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int nextIndex(int i) {
        i++;
        return i < this.size ? i : -1;
    }

    /* Access modifiers changed, original: 0000 */
    public int nextIndexAfterRemove(int i, int i2) {
        return i - 1;
    }

    public int put(K k, int i) {
        CollectPreconditions.checkPositive(i, AnalyticsListener.ANALYTICS_COUNT_KEY);
        long[] jArr = this.entries;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int smearedHash = Hashing.smearedHash(k);
        int hashTableMask = hashTableMask() & smearedHash;
        int i2 = this.size;
        int[] iArr2 = this.table;
        int i3 = iArr2[hashTableMask];
        if (i3 == -1) {
            iArr2[hashTableMask] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (getHash(j) == smearedHash && Objects.equal(k, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                hashTableMask = getNext(j);
                if (hashTableMask == -1) {
                    jArr[i3] = swapNext(j, i2);
                    break;
                }
                i3 = hashTableMask;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i5 = i2 + 1;
            resizeMeMaybe(i5);
            insertEntry(i2, k, i, smearedHash);
            this.size = i5;
            if (i2 >= this.threshold) {
                resizeTable(this.table.length * 2);
            }
            this.modCount++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    public int remove(Object obj) {
        return remove(obj, Hashing.smearedHash(obj));
    }

    /* Access modifiers changed, original: 0000 */
    public int removeEntry(int i) {
        return remove(this.keys[i], getHash(this.entries[i]));
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

    /* Access modifiers changed, original: 0000 */
    public void setValue(int i, int i2) {
        Preconditions.checkElementIndex(i, this.size);
        this.values[i] = i2;
    }

    /* Access modifiers changed, original: 0000 */
    public int size() {
        return this.size;
    }
}
