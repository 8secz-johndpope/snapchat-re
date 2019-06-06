package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Table.Cell;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    final class CellSet extends IndexedImmutableSet<Cell<R, C, V>> {
        private CellSet() {
        }

        /* synthetic */ CellSet(RegularImmutableTable regularImmutableTable, AnonymousClass1 anonymousClass1) {
            this();
        }

        public final boolean contains(Object obj) {
            if (obj instanceof Cell) {
                Cell cell = (Cell) obj;
                Object obj2 = RegularImmutableTable.this.get(cell.getRowKey(), cell.getColumnKey());
                if (obj2 != null && obj2.equals(cell.getValue())) {
                    return true;
                }
            }
            return false;
        }

        /* Access modifiers changed, original: final */
        public final Cell<R, C, V> get(int i) {
            return RegularImmutableTable.this.getCell(i);
        }

        /* Access modifiers changed, original: final */
        public final boolean isPartialView() {
            return false;
        }

        public final int size() {
            return RegularImmutableTable.this.size();
        }
    }

    RegularImmutableTable() {
    }

    static <R, C, V> RegularImmutableTable<R, C, V> forCells(List<Cell<R, C, V>> list, final Comparator<? super R> comparator, final Comparator<? super C> comparator2) {
        Preconditions.checkNotNull(list);
        if (!(comparator == null && comparator2 == null)) {
            Collections.sort(list, new Comparator<Cell<R, C, V>>() {
                public final int compare(Cell<R, C, V> cell, Cell<R, C, V> cell2) {
                    Comparator comparator = comparator;
                    int compare = comparator == null ? 0 : comparator.compare(cell.getRowKey(), cell2.getRowKey());
                    if (compare != 0) {
                        return compare;
                    }
                    comparator = comparator2;
                    return comparator == null ? 0 : comparator.compare(cell.getColumnKey(), cell2.getColumnKey());
                }
            });
        }
        return forCellsInternal(list, comparator, comparator2);
    }

    private static <R, C, V> RegularImmutableTable<R, C, V> forCellsInternal(Iterable<Cell<R, C, V>> iterable, Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        Collection linkedHashSet = new LinkedHashSet();
        Collection linkedHashSet2 = new LinkedHashSet();
        ImmutableList copyOf = ImmutableList.copyOf((Iterable) iterable);
        for (Cell cell : iterable) {
            linkedHashSet.add(cell.getRowKey());
            linkedHashSet2.add(cell.getColumnKey());
        }
        return forOrderedComponents(copyOf, comparator == null ? ImmutableSet.copyOf(linkedHashSet) : ImmutableSet.copyOf(ImmutableList.sortedCopyOf(comparator, linkedHashSet)), comparator2 == null ? ImmutableSet.copyOf(linkedHashSet2) : ImmutableSet.copyOf(ImmutableList.sortedCopyOf(comparator2, linkedHashSet2)));
    }

    static <R, C, V> RegularImmutableTable<R, C, V> forOrderedComponents(ImmutableList<Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        return ((long) immutableList.size()) > (((long) immutableSet.size()) * ((long) immutableSet2.size())) / 2 ? new DenseImmutableTable(immutableList, immutableSet, immutableSet2) : new SparseImmutableTable(immutableList, immutableSet, immutableSet2);
    }

    /* Access modifiers changed, original: final */
    public final ImmutableSet<Cell<R, C, V>> createCellSet() {
        return isEmpty() ? ImmutableSet.of() : new CellSet(this, null);
    }

    public abstract Cell<R, C, V> getCell(int i);
}
