package com.google.common.collect;

final class RegularImmutableSet<E> extends ImmutableSet<E> {
    static final RegularImmutableSet<Object> EMPTY = new RegularImmutableSet(new Object[0], 0, null, 0, 0);
    final transient Object[] elements;
    private final transient int hashCode;
    private final transient int mask;
    private final transient int size;
    final transient Object[] table;

    RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.elements = objArr;
        this.table = objArr2;
        this.mask = i2;
        this.hashCode = i;
        this.size = i3;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.table;
        if (obj == null || objArr == null) {
            return false;
        }
        int smearedHash = Hashing.smearedHash(obj);
        while (true) {
            smearedHash &= this.mask;
            Object obj2 = objArr[smearedHash];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            smearedHash++;
        }
    }

    /* Access modifiers changed, original: final */
    public final int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.elements, 0, objArr, i, this.size);
        return i + this.size;
    }

    /* Access modifiers changed, original: final */
    public final ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(this.elements, this.size);
    }

    public final int hashCode() {
        return this.hashCode;
    }

    /* Access modifiers changed, original: final */
    public final boolean isHashCodeFast() {
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean isPartialView() {
        return false;
    }

    public final UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }

    public final int size() {
        return this.size;
    }
}
