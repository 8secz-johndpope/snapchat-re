package com.google.common.collect;

import com.google.common.collect.Multiset.Entry;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {
    private transient Set<E> elementSet;
    private transient Set<Entry<E>> entrySet;

    class EntrySet extends EntrySet<E> {
        EntrySet() {
        }

        public Iterator<Entry<E>> iterator() {
            return AbstractMultiset.this.entryIterator();
        }

        /* Access modifiers changed, original: 0000 */
        public Multiset<E> multiset() {
            return AbstractMultiset.this;
        }

        public int size() {
            return AbstractMultiset.this.distinctElements();
        }
    }

    class ElementSet extends ElementSet<E> {
        ElementSet() {
        }

        public Iterator<E> iterator() {
            return AbstractMultiset.this.elementIterator();
        }

        /* Access modifiers changed, original: 0000 */
        public Multiset<E> multiset() {
            return AbstractMultiset.this;
        }
    }

    AbstractMultiset() {
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.addAllImpl((Multiset) this, (Collection) collection);
    }

    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    /* Access modifiers changed, original: 0000 */
    public Set<E> createElementSet() {
        return new ElementSet();
    }

    /* Access modifiers changed, original: 0000 */
    public Set<Entry<E>> createEntrySet() {
        return new EntrySet();
    }

    public abstract int distinctElements();

    public abstract Iterator<E> elementIterator();

    public Set<E> elementSet() {
        Set set = this.elementSet;
        if (set != null) {
            return set;
        }
        set = createElementSet();
        this.elementSet = set;
        return set;
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

    public final boolean equals(Object obj) {
        return Multisets.equalsImpl(this, obj);
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    public final boolean removeAll(Collection<?> collection) {
        return Multisets.removeAllImpl(this, collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return Multisets.retainAllImpl(this, collection);
    }

    public int setCount(E e, int i) {
        return Multisets.setCountImpl(this, e, i);
    }

    public boolean setCount(E e, int i, int i2) {
        return Multisets.setCountImpl(this, e, i, i2);
    }

    public final String toString() {
        return entrySet().toString();
    }
}
