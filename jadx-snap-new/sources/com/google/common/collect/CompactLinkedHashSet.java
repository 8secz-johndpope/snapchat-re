package com.google.common.collect;

import java.util.Arrays;

class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    private transient int firstEntry;
    private transient int lastEntry;
    private transient int[] predecessor;
    private transient int[] successor;

    CompactLinkedHashSet() {
    }

    CompactLinkedHashSet(int i) {
        super(i);
    }

    public static <E> CompactLinkedHashSet<E> createWithExpectedSize(int i) {
        return new CompactLinkedHashSet(i);
    }

    private void succeeds(int i, int i2) {
        if (i == -2) {
            this.firstEntry = i2;
        } else {
            this.successor[i] = i2;
        }
        if (i2 == -2) {
            this.lastEntry = i;
        } else {
            this.predecessor[i2] = i;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int adjustAfterRemove(int i, int i2) {
        return i == size() ? i2 : i;
    }

    public void clear() {
        super.clear();
        this.firstEntry = -2;
        this.lastEntry = -2;
        Arrays.fill(this.predecessor, -1);
        Arrays.fill(this.successor, -1);
    }

    /* Access modifiers changed, original: 0000 */
    public int firstEntryIndex() {
        return this.firstEntry;
    }

    /* Access modifiers changed, original: 0000 */
    public int getSuccessor(int i) {
        return this.successor[i];
    }

    /* Access modifiers changed, original: 0000 */
    public void init(int i, float f) {
        super.init(i, f);
        this.predecessor = new int[i];
        this.successor = new int[i];
        Arrays.fill(this.predecessor, -1);
        Arrays.fill(this.successor, -1);
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    /* Access modifiers changed, original: 0000 */
    public void insertEntry(int i, E e, int i2) {
        super.insertEntry(i, e, i2);
        succeeds(this.lastEntry, i);
        succeeds(i, -2);
    }

    /* Access modifiers changed, original: 0000 */
    public void moveEntry(int i) {
        int size = size() - 1;
        super.moveEntry(i);
        succeeds(this.predecessor[i], this.successor[i]);
        if (size != i) {
            succeeds(this.predecessor[size], i);
            succeeds(i, this.successor[size]);
        }
        this.predecessor[size] = -1;
        this.successor[size] = -1;
    }

    /* Access modifiers changed, original: 0000 */
    public void resizeEntries(int i) {
        super.resizeEntries(i);
        int[] iArr = this.predecessor;
        int length = iArr.length;
        this.predecessor = Arrays.copyOf(iArr, i);
        this.successor = Arrays.copyOf(this.successor, i);
        if (length < i) {
            Arrays.fill(this.predecessor, length, i, -1);
            Arrays.fill(this.successor, length, i, -1);
        }
    }

    public Object[] toArray() {
        return ObjectArrays.toArrayImpl(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return ObjectArrays.toArrayImpl(this, tArr);
    }
}
