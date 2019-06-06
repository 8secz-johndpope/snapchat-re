package com.google.common.collect;

import com.google.common.collect.Multiset.Entry;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

abstract class DescendingMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {
    private transient Comparator<? super E> comparator;
    private transient NavigableSet<E> elementSet;
    private transient Set<Entry<E>> entrySet;

    DescendingMultiset() {
    }

    public Comparator<? super E> comparator() {
        Comparator comparator = this.comparator;
        if (comparator != null) {
            return comparator;
        }
        Ordering reverse = Ordering.from(forwardMultiset().comparator()).reverse();
        this.comparator = reverse;
        return reverse;
    }

    /* Access modifiers changed, original: 0000 */
    public Set<Entry<E>> createEntrySet() {
        return new EntrySet<E>() {
            public Iterator<Entry<E>> iterator() {
                return DescendingMultiset.this.entryIterator();
            }

            /* Access modifiers changed, original: 0000 */
            public Multiset<E> multiset() {
                return DescendingMultiset.this;
            }

            public int size() {
                return DescendingMultiset.this.forwardMultiset().entrySet().size();
            }
        };
    }

    /* Access modifiers changed, original: protected */
    public Multiset<E> delegate() {
        return forwardMultiset();
    }

    public SortedMultiset<E> descendingMultiset() {
        return forwardMultiset();
    }

    public NavigableSet<E> elementSet() {
        NavigableSet navigableSet = this.elementSet;
        if (navigableSet != null) {
            return navigableSet;
        }
        NavigableElementSet navigableElementSet = new NavigableElementSet(this);
        this.elementSet = navigableElementSet;
        return navigableElementSet;
    }

    public abstract Iterator<Entry<E>> entryIterator();

    public Set<Entry<E>> entrySet() {
        Set set = this.entrySet;
        if (set != null) {
            return set;
        }
        set = createEntrySet();
        this.entrySet = set;
        return set;
    }

    public Entry<E> firstEntry() {
        return forwardMultiset().lastEntry();
    }

    public abstract SortedMultiset<E> forwardMultiset();

    public SortedMultiset<E> headMultiset(E e, BoundType boundType) {
        return forwardMultiset().tailMultiset(e, boundType).descendingMultiset();
    }

    public Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    public Entry<E> lastEntry() {
        return forwardMultiset().firstEntry();
    }

    public Entry<E> pollFirstEntry() {
        return forwardMultiset().pollLastEntry();
    }

    public Entry<E> pollLastEntry() {
        return forwardMultiset().pollFirstEntry();
    }

    public SortedMultiset<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        return forwardMultiset().subMultiset(e2, boundType2, e, boundType).descendingMultiset();
    }

    public SortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        return forwardMultiset().headMultiset(e, boundType).descendingMultiset();
    }

    public Object[] toArray() {
        return standardToArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return standardToArray(tArr);
    }

    public String toString() {
        return entrySet().toString();
    }
}
