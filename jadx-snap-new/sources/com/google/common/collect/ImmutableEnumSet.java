package com.google.common.collect;

import java.util.Collection;
import java.util.EnumSet;

final class ImmutableEnumSet<E extends Enum<E>> extends ImmutableSet<E> {
    private final transient EnumSet<E> delegate;
    private transient int hashCode;

    private ImmutableEnumSet(EnumSet<E> enumSet) {
        this.delegate = enumSet;
    }

    static ImmutableSet asImmutable(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new ImmutableEnumSet(enumSet) : ImmutableSet.of(Iterables.getOnlyElement(enumSet)) : ImmutableSet.of();
    }

    public final boolean contains(Object obj) {
        return this.delegate.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        Collection collection2;
        if (collection2 instanceof ImmutableEnumSet) {
            collection2 = ((ImmutableEnumSet) collection2).delegate;
        }
        return this.delegate.containsAll(collection2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumSet) {
            obj = ((ImmutableEnumSet) obj).delegate;
        }
        return this.delegate.equals(obj);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        i = this.delegate.hashCode();
        this.hashCode = i;
        return i;
    }

    public final boolean isEmpty() {
        return this.delegate.isEmpty();
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
        return Iterators.unmodifiableIterator(this.delegate.iterator());
    }

    public final int size() {
        return this.delegate.size();
    }

    public final String toString() {
        return this.delegate.toString();
    }
}
