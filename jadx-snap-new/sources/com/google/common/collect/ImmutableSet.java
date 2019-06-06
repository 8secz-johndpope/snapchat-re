package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private transient ImmutableList<E> asList;

    public static class Builder<E> extends ArrayBasedBuilder<E> {
        private int hashCode;
        Object[] hashTable;

        public Builder() {
            super(4);
        }

        Builder(int i) {
            super(i);
            this.hashTable = new Object[ImmutableSet.chooseTableSize(i)];
        }

        private void addDeduping(E e) {
            int length = this.hashTable.length - 1;
            int hashCode = e.hashCode();
            int smear = Hashing.smear(hashCode);
            while (true) {
                smear &= length;
                Object[] objArr = this.hashTable;
                Object obj = objArr[smear];
                if (obj == null) {
                    objArr[smear] = e;
                    this.hashCode += hashCode;
                    super.add((Object) e);
                    return;
                } else if (!obj.equals(e)) {
                    smear++;
                } else {
                    return;
                }
            }
        }

        public Builder<E> add(E e) {
            Preconditions.checkNotNull(e);
            if (this.hashTable == null || ImmutableSet.chooseTableSize(this.size) > this.hashTable.length) {
                this.hashTable = null;
                super.add((Object) e);
                return this;
            }
            addDeduping(e);
            return this;
        }

        public Builder<E> add(E... eArr) {
            if (this.hashTable != null) {
                for (Object add : eArr) {
                    add(add);
                }
            } else {
                super.add((Object[]) eArr);
            }
            return this;
        }

        public Builder<E> addAll(Iterable<? extends E> iterable) {
            Preconditions.checkNotNull(iterable);
            if (this.hashTable != null) {
                for (Object add : iterable) {
                    add(add);
                }
            } else {
                super.addAll(iterable);
            }
            return this;
        }

        public Builder<E> addAll(Iterator<? extends E> it) {
            Preconditions.checkNotNull(it);
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        public ImmutableSet<E> build() {
            int i = this.size;
            if (i == 0) {
                return ImmutableSet.of();
            }
            if (i == 1) {
                return ImmutableSet.of(this.contents[0]);
            }
            ImmutableSet<E> access$100;
            if (this.hashTable == null || ImmutableSet.chooseTableSize(this.size) != this.hashTable.length) {
                access$100 = ImmutableSet.construct(this.size, this.contents);
                this.size = access$100.size();
            } else {
                Object[] copyOf = ImmutableSet.shouldTrim(this.size, this.contents.length) ? Arrays.copyOf(this.contents, this.size) : this.contents;
                int i2 = this.hashCode;
                Object[] objArr = this.hashTable;
                ImmutableSet<E> regularImmutableSet = new RegularImmutableSet(copyOf, i2, objArr, objArr.length - 1, this.size);
            }
            this.forceCopy = true;
            this.hashTable = null;
            return access$100;
        }
    }

    ImmutableSet() {
    }

    public static <E> Builder<E> builder() {
        return new Builder();
    }

    public static <E> Builder<E> builderWithExpectedSize(int i) {
        CollectPreconditions.checkNonnegative(i, "expectedSize");
        return new Builder(i);
    }

    static int chooseTableSize(int i) {
        i = Math.max(i, 2);
        boolean z = true;
        if (i < 751619276) {
            int highestOneBit = Integer.highestOneBit(i - 1) << 1;
            while (true) {
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= ((double) i)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (i >= AudioPlayer.INFINITY_LOOP_COUNT) {
                z = false;
            }
            Preconditions.checkArgument(z, "collection too large");
            return AudioPlayer.INFINITY_LOOP_COUNT;
        }
    }

    private static <E> ImmutableSet<E> construct(int i, Object... objArr) {
        while (i != 0) {
            if (i == 1) {
                return of(objArr[0]);
            }
            int chooseTableSize = chooseTableSize(i);
            Object[] objArr2 = new Object[chooseTableSize];
            int i2 = chooseTableSize - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object checkElementNotNull = ObjectArrays.checkElementNotNull(objArr[i5], i5);
                int hashCode = checkElementNotNull.hashCode();
                int smear = Hashing.smear(hashCode);
                while (true) {
                    int i6 = smear & i2;
                    Object obj = objArr2[i6];
                    if (obj != null) {
                        if (obj.equals(checkElementNotNull)) {
                            break;
                        }
                        smear++;
                    } else {
                        smear = i4 + 1;
                        objArr[i4] = checkElementNotNull;
                        objArr2[i6] = checkElementNotNull;
                        i3 += hashCode;
                        i4 = smear;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, null);
            if (i4 == 1) {
                return new SingletonImmutableSet(objArr[0], i3);
            }
            if (chooseTableSize(i4) < chooseTableSize / 2) {
                i = i4;
            } else {
                if (shouldTrim(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
            }
        }
        return of();
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? copyOf((Collection) iterable) : copyOf(iterable.iterator());
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] toArray = collection.toArray();
        return construct(toArray.length, toArray);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        Object next = it.next();
        return !it.hasNext() ? of(next) : new Builder().add(next).addAll((Iterator) it).build();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? construct(eArr.length, (Object[]) eArr.clone()) : of(eArr[0]) : of();
    }

    public static <E> ImmutableSet<E> of() {
        return RegularImmutableSet.EMPTY;
    }

    public static <E> ImmutableSet<E> of(E e) {
        return new SingletonImmutableSet(e);
    }

    public static <E> ImmutableSet<E> of(E e, E e2) {
        return construct(2, e, e2);
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3) {
        return construct(3, e, e2, e3);
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4) {
        return construct(4, e, e2, e3, e4);
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr.length + 6)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(objArr.length, objArr);
    }

    private static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public ImmutableList<E> asList() {
        ImmutableList immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        immutableList = createAsList();
        this.asList = immutableList;
        return immutableList;
    }

    /* Access modifiers changed, original: 0000 */
    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    public boolean equals(Object obj) {
        return obj == this ? true : ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) obj).isHashCodeFast() && hashCode() != obj.hashCode()) ? false : Sets.equalsImpl(this, obj);
    }

    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isHashCodeFast() {
        return false;
    }

    public abstract UnmodifiableIterator<E> iterator();
}
