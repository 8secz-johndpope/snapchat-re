package com.google.common.collect;

import com.google.common.base.Preconditions;

final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    private transient int cachedHashCode;
    final transient E element;

    SingletonImmutableSet(E e) {
        this.element = Preconditions.checkNotNull(e);
    }

    SingletonImmutableSet(E e, int i) {
        this.element = e;
        this.cachedHashCode = i;
    }

    public final boolean contains(Object obj) {
        return this.element.equals(obj);
    }

    /* Access modifiers changed, original: final */
    public final int copyIntoArray(Object[] objArr, int i) {
        objArr[i] = this.element;
        return i + 1;
    }

    /* Access modifiers changed, original: final */
    public final ImmutableList<E> createAsList() {
        return ImmutableList.of(this.element);
    }

    public final int hashCode() {
        int i = this.cachedHashCode;
        if (i != 0) {
            return i;
        }
        i = this.element.hashCode();
        this.cachedHashCode = i;
        return i;
    }

    /* Access modifiers changed, original: final */
    public final boolean isHashCodeFast() {
        return this.cachedHashCode != 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean isPartialView() {
        return false;
    }

    public final UnmodifiableIterator<E> iterator() {
        return Iterators.singletonIterator(this.element);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(this.element.toString());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
