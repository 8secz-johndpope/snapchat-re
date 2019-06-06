package com.google.common.collect;

import com.google.common.collect.Multiset.Entry;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

public interface SortedMultiset<E> extends SortedIterable<E>, SortedMultisetBridge<E> {
    Comparator<? super E> comparator();

    SortedMultiset<E> descendingMultiset();

    NavigableSet<E> elementSet();

    Set<Entry<E>> entrySet();

    Entry<E> firstEntry();

    SortedMultiset<E> headMultiset(E e, BoundType boundType);

    Entry<E> lastEntry();

    Entry<E> pollFirstEntry();

    Entry<E> pollLastEntry();

    SortedMultiset<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2);

    SortedMultiset<E> tailMultiset(E e, BoundType boundType);
}
