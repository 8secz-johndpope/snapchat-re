package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    transient Object[] elements;
    private transient long[] entries;
    transient float loadFactor;
    transient int modCount;
    private transient int size;
    private transient int[] table;
    private transient int threshold;

    CompactHashSet() {
        init(3, 1.0f);
    }

    CompactHashSet(int i) {
        init(i, 1.0f);
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i) {
        return new CompactHashSet(i);
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

    private boolean remove(Object obj, int i) {
        int hashTableMask = hashTableMask() & i;
        int i2 = this.table[hashTableMask];
        if (i2 == -1) {
            return false;
        }
        int i3 = -1;
        while (true) {
            if (getHash(this.entries[i2]) == i && Objects.equal(obj, this.elements[i2])) {
                if (i3 == -1) {
                    this.table[hashTableMask] = getNext(this.entries[i2]);
                } else {
                    long[] jArr = this.entries;
                    jArr[i3] = swapNext(jArr[i3], getNext(jArr[i2]));
                }
                moveEntry(i2);
                this.size--;
                this.modCount++;
                return true;
            }
            i3 = getNext(this.entries[i2]);
            if (i3 == -1) {
                return false;
            }
            int i4 = i3;
            i3 = i2;
            i2 = i4;
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

    public boolean add(E e) {
        long[] jArr = this.entries;
        Object[] objArr = this.elements;
        int smearedHash = Hashing.smearedHash(e);
        int hashTableMask = hashTableMask() & smearedHash;
        int i = this.size;
        int[] iArr = this.table;
        int i2 = iArr[hashTableMask];
        if (i2 == -1) {
            iArr[hashTableMask] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (getHash(j) == smearedHash && Objects.equal(e, objArr[i2])) {
                    return false;
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
            insertEntry(i, e, smearedHash);
            this.size = i3;
            if (i >= this.threshold) {
                resizeTable(this.table.length * 2);
            }
            this.modCount++;
            return true;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* Access modifiers changed, original: 0000 */
    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.elements, 0, this.size, null);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, -1);
        this.size = 0;
    }

    public boolean contains(Object obj) {
        int smearedHash = Hashing.smearedHash(obj);
        int i = this.table[hashTableMask() & smearedHash];
        while (i != -1) {
            long j = this.entries[i];
            if (getHash(j) == smearedHash && Objects.equal(obj, this.elements[i])) {
                return true;
            }
            i = getNext(j);
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
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
        this.elements = new Object[i];
        this.entries = newEntries(i);
        this.threshold = Math.max(1, (int) (((float) closedTableSize) * f));
    }

    /* Access modifiers changed, original: 0000 */
    public void insertEntry(int i, E e, int i2) {
        this.entries[i] = (((long) i2) << 32) | 4294967295L;
        this.elements[i] = e;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int expectedModCount = CompactHashSet.this.modCount;
            int index = CompactHashSet.this.firstEntryIndex();
            int indexToRemove = -1;

            private void checkForConcurrentModification() {
                if (CompactHashSet.this.modCount != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                return this.index >= 0;
            }

            public E next() {
                checkForConcurrentModification();
                if (hasNext()) {
                    this.indexToRemove = this.index;
                    Object[] objArr = CompactHashSet.this.elements;
                    int i = this.index;
                    E e = objArr[i];
                    this.index = CompactHashSet.this.getSuccessor(i);
                    return e;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                checkForConcurrentModification();
                CollectPreconditions.checkRemove(this.indexToRemove >= 0);
                this.expectedModCount++;
                CompactHashSet compactHashSet = CompactHashSet.this;
                compactHashSet.remove(compactHashSet.elements[this.indexToRemove], CompactHashSet.getHash(CompactHashSet.this.entries[this.indexToRemove]));
                this.index = CompactHashSet.this.adjustAfterRemove(this.index, this.indexToRemove);
                this.indexToRemove = -1;
            }
        };
    }

    /* Access modifiers changed, original: 0000 */
    public void moveEntry(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.elements;
            objArr[i] = objArr[size];
            objArr[size] = null;
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
            this.elements[i] = null;
            this.entries[i] = -1;
        }
    }

    public boolean remove(Object obj) {
        return remove(obj, Hashing.smearedHash(obj));
    }

    /* Access modifiers changed, original: 0000 */
    public void resizeEntries(int i) {
        this.elements = Arrays.copyOf(this.elements, i);
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

    public Object[] toArray() {
        return Arrays.copyOf(this.elements, this.size);
    }

    public <T> T[] toArray(T[] tArr) {
        return ObjectArrays.toArrayImpl(this.elements, 0, this.size, tArr);
    }
}
