package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public final class EvictingQueue<E> extends ForwardingQueue<E> implements Serializable {
    private final Queue<E> delegate;
    final int maxSize;

    private EvictingQueue(int i) {
        Preconditions.checkArgument(i >= 0, "maxSize (%s) must >= 0", i);
        this.delegate = new ArrayDeque(i);
        this.maxSize = i;
    }

    public static <E> EvictingQueue<E> create(int i) {
        return new EvictingQueue(i);
    }

    public final boolean add(E e) {
        Preconditions.checkNotNull(e);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return standardAddAll(collection);
        }
        clear();
        return Iterables.addAll(this, Iterables.skip(collection, size - this.maxSize));
    }

    public final boolean contains(Object obj) {
        return delegate().contains(Preconditions.checkNotNull(obj));
    }

    /* Access modifiers changed, original: protected|final */
    public final Queue<E> delegate() {
        return this.delegate;
    }

    public final boolean offer(E e) {
        return add(e);
    }

    public final boolean remove(Object obj) {
        return delegate().remove(Preconditions.checkNotNull(obj));
    }
}
