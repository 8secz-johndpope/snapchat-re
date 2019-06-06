package com.google.common.collect;

import com.google.common.collect.Multiset.Entry;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

final class SortedMultisets {

    static class ElementSet<E> extends ElementSet<E> implements SortedSet<E> {
        private final SortedMultiset<E> multiset;

        ElementSet(SortedMultiset<E> sortedMultiset) {
            this.multiset = sortedMultiset;
        }

        public Comparator<? super E> comparator() {
            return multiset().comparator();
        }

        public E first() {
            return SortedMultisets.getElementOrThrow(multiset().firstEntry());
        }

        public SortedSet<E> headSet(E e) {
            return multiset().headMultiset(e, BoundType.OPEN).elementSet();
        }

        public Iterator<E> iterator() {
            return Multisets.elementIterator(multiset().entrySet().iterator());
        }

        public E last() {
            return SortedMultisets.getElementOrThrow(multiset().lastEntry());
        }

        /* Access modifiers changed, original: final */
        public final SortedMultiset<E> multiset() {
            return this.multiset;
        }

        public SortedSet<E> subSet(E e, E e2) {
            return multiset().subMultiset(e, BoundType.CLOSED, e2, BoundType.OPEN).elementSet();
        }

        public SortedSet<E> tailSet(E e) {
            return multiset().tailMultiset(e, BoundType.CLOSED).elementSet();
        }
    }

    static class NavigableElementSet<E> extends ElementSet<E> implements NavigableSet<E> {
        NavigableElementSet(SortedMultiset<E> sortedMultiset) {
            super(sortedMultiset);
        }

        public E ceiling(E e) {
            return SortedMultisets.getElementOrNull(multiset().tailMultiset(e, BoundType.CLOSED).firstEntry());
        }

        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<E> descendingSet() {
            return new NavigableElementSet(multiset().descendingMultiset());
        }

        public E floor(E e) {
            return SortedMultisets.getElementOrNull(multiset().headMultiset(e, BoundType.CLOSED).lastEntry());
        }

        public NavigableSet<E> headSet(E e, boolean z) {
            return new NavigableElementSet(multiset().headMultiset(e, BoundType.forBoolean(z)));
        }

        public E higher(E e) {
            return SortedMultisets.getElementOrNull(multiset().tailMultiset(e, BoundType.OPEN).firstEntry());
        }

        public E lower(E e) {
            return SortedMultisets.getElementOrNull(multiset().headMultiset(e, BoundType.OPEN).lastEntry());
        }

        public E pollFirst() {
            return SortedMultisets.getElementOrNull(multiset().pollFirstEntry());
        }

        public E pollLast() {
            return SortedMultisets.getElementOrNull(multiset().pollLastEntry());
        }

        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return new NavigableElementSet(multiset().subMultiset(e, BoundType.forBoolean(z), e2, BoundType.forBoolean(z2)));
        }

        public NavigableSet<E> tailSet(E e, boolean z) {
            return new NavigableElementSet(multiset().tailMultiset(e, BoundType.forBoolean(z)));
        }
    }

    private static <E> E getElementOrNull(Entry<E> entry) {
        return entry == null ? null : entry.getElement();
    }

    private static <E> E getElementOrThrow(Entry<E> entry) {
        if (entry != null) {
            return entry.getElement();
        }
        throw new NoSuchElementException();
    }
}
