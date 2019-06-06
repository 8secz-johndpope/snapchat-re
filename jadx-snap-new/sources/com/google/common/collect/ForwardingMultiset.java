package com.google.common.collect;

import com.google.common.collect.Multiset.Entry;
import java.util.Collection;
import java.util.Set;

public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {
    protected ForwardingMultiset() {
    }

    public int add(E e, int i) {
        return delegate().add(e, i);
    }

    public int count(Object obj) {
        return delegate().count(obj);
    }

    public abstract Multiset<E> delegate();

    public Set<E> elementSet() {
        return delegate().elementSet();
    }

    public Set<Entry<E>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public int remove(Object obj, int i) {
        return delegate().remove(obj, i);
    }

    public int setCount(E e, int i) {
        return delegate().setCount(e, i);
    }

    public boolean setCount(E e, int i, int i2) {
        return delegate().setCount(e, i, i2);
    }

    /* Access modifiers changed, original: protected */
    public boolean standardAddAll(Collection<? extends E> collection) {
        return Multisets.addAllImpl((Multiset) this, (Collection) collection);
    }

    /* Access modifiers changed, original: protected */
    public boolean standardRemoveAll(Collection<?> collection) {
        return Multisets.removeAllImpl(this, collection);
    }
}
