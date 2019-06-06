package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset.Entry;
import com.google.common.primitives.Ints;
import com.looksery.sdk.listener.AnalyticsListener;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {
    transient ObjectCountHashMap<E> backingMap;
    transient long size;

    abstract class Itr<T> implements Iterator<T> {
        int entryIndex = AbstractMapBasedMultiset.this.backingMap.firstIndex();
        int expectedModCount = AbstractMapBasedMultiset.this.backingMap.modCount;
        int toRemove = -1;

        Itr() {
        }

        private void checkForConcurrentModification() {
            if (AbstractMapBasedMultiset.this.backingMap.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasNext() {
            checkForConcurrentModification();
            return this.entryIndex >= 0;
        }

        public T next() {
            if (hasNext()) {
                Object result = result(this.entryIndex);
                this.toRemove = this.entryIndex;
                this.entryIndex = AbstractMapBasedMultiset.this.backingMap.nextIndex(this.entryIndex);
                return result;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            checkForConcurrentModification();
            CollectPreconditions.checkRemove(this.toRemove != -1);
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            abstractMapBasedMultiset.size -= (long) AbstractMapBasedMultiset.this.backingMap.removeEntry(this.toRemove);
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.nextIndexAfterRemove(this.entryIndex, this.toRemove);
            this.toRemove = -1;
            this.expectedModCount = AbstractMapBasedMultiset.this.backingMap.modCount;
        }

        public abstract T result(int i);
    }

    AbstractMapBasedMultiset(int i) {
        init(i);
    }

    public final int add(E e, int i) {
        if (i == 0) {
            return count(e);
        }
        boolean z = true;
        Preconditions.checkArgument(i > 0, "occurrences cannot be negative: %s", i);
        int indexOf = this.backingMap.indexOf(e);
        if (indexOf == -1) {
            this.backingMap.put(e, i);
            this.size += (long) i;
            return 0;
        }
        int value = this.backingMap.getValue(indexOf);
        long j = (long) i;
        long j2 = ((long) value) + j;
        if (j2 > 2147483647L) {
            z = false;
        }
        Preconditions.checkArgument(z, "too many occurrences: %s", j2);
        this.backingMap.setValue(indexOf, (int) j2);
        this.size += j;
        return value;
    }

    /* Access modifiers changed, original: 0000 */
    public void addTo(Multiset<? super E> multiset) {
        Preconditions.checkNotNull(multiset);
        int firstIndex = this.backingMap.firstIndex();
        while (firstIndex >= 0) {
            multiset.add(this.backingMap.getKey(firstIndex), this.backingMap.getValue(firstIndex));
            firstIndex = this.backingMap.nextIndex(firstIndex);
        }
    }

    public final void clear() {
        this.backingMap.clear();
        this.size = 0;
    }

    public final int count(Object obj) {
        return this.backingMap.get(obj);
    }

    /* Access modifiers changed, original: final */
    public final int distinctElements() {
        return this.backingMap.size();
    }

    /* Access modifiers changed, original: final */
    public final Iterator<E> elementIterator() {
        return new Itr<E>() {
            /* Access modifiers changed, original: 0000 */
            public E result(int i) {
                return AbstractMapBasedMultiset.this.backingMap.getKey(i);
            }
        };
    }

    /* Access modifiers changed, original: final */
    public final Iterator<Entry<E>> entryIterator() {
        return new Itr<Entry<E>>() {
            /* Access modifiers changed, original: 0000 */
            public Entry<E> result(int i) {
                return AbstractMapBasedMultiset.this.backingMap.getEntry(i);
            }
        };
    }

    public abstract void init(int i);

    public final Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    public final int remove(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        Preconditions.checkArgument(i > 0, "occurrences cannot be negative: %s", i);
        int indexOf = this.backingMap.indexOf(obj);
        if (indexOf == -1) {
            return 0;
        }
        int value = this.backingMap.getValue(indexOf);
        if (value > i) {
            this.backingMap.setValue(indexOf, value - i);
        } else {
            this.backingMap.removeEntry(indexOf);
            i = value;
        }
        this.size -= (long) i;
        return value;
    }

    public final int setCount(E e, int i) {
        CollectPreconditions.checkNonnegative(i, AnalyticsListener.ANALYTICS_COUNT_KEY);
        int remove = i == 0 ? this.backingMap.remove(e) : this.backingMap.put(e, i);
        this.size += (long) (i - remove);
        return remove;
    }

    public final boolean setCount(E e, int i, int i2) {
        CollectPreconditions.checkNonnegative(i, "oldCount");
        CollectPreconditions.checkNonnegative(i2, "newCount");
        int indexOf = this.backingMap.indexOf(e);
        if (indexOf == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.put(e, i2);
                this.size += (long) i2;
            }
            return true;
        } else if (this.backingMap.getValue(indexOf) != i) {
            return false;
        } else {
            long j;
            if (i2 == 0) {
                this.backingMap.removeEntry(indexOf);
                j = this.size - ((long) i);
            } else {
                this.backingMap.setValue(indexOf, i2);
                j = this.size + ((long) (i2 - i));
            }
            this.size = j;
            return true;
        }
    }

    public final int size() {
        return Ints.saturatedCast(this.size);
    }
}
