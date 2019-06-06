package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

public interface Multiset<E> extends Collection<E> {

    public interface Entry<E> {
        int getCount();

        E getElement();

        String toString();
    }

    int add(E e, int i);

    boolean add(E e);

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    Set<E> elementSet();

    Set<Entry<E>> entrySet();

    boolean equals(Object obj);

    int hashCode();

    int remove(Object obj, int i);

    boolean remove(Object obj);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    int size();
}
