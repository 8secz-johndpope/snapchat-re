package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Table.Cell;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Map.Entry;

final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    private final int[] columnCounts = new int[this.columnKeyToIndex.size()];
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableMap<C, ImmutableMap<R, V>> columnMap;
    private final int[] rowCounts = new int[this.rowKeyToIndex.size()];
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableMap<R, ImmutableMap<C, V>> rowMap;
    private final V[][] values;

    static abstract class ImmutableArrayMap<K, V> extends IteratorBasedImmutableMap<K, V> {
        private final int size;

        ImmutableArrayMap(int i) {
            this.size = i;
        }

        private boolean isFull() {
            return this.size == keyToIndex().size();
        }

        /* Access modifiers changed, original: 0000 */
        public ImmutableSet<K> createKeySet() {
            return isFull() ? keyToIndex().keySet() : super.createKeySet();
        }

        /* Access modifiers changed, original: 0000 */
        public UnmodifiableIterator<Entry<K, V>> entryIterator() {
            return new AbstractIterator<Entry<K, V>>() {
                private int index = -1;
                private final int maxIndex = ImmutableArrayMap.this.keyToIndex().size();

                /* Access modifiers changed, original: protected */
                public Entry<K, V> computeNext() {
                    int i = this.index;
                    while (true) {
                        this.index = i + 1;
                        i = this.index;
                        if (i >= this.maxIndex) {
                            return (Entry) endOfData();
                        }
                        Object value = ImmutableArrayMap.this.getValue(i);
                        if (value != null) {
                            return Maps.immutableEntry(ImmutableArrayMap.this.getKey(this.index), value);
                        }
                        i = this.index;
                    }
                }
            };
        }

        public V get(Object obj) {
            Integer num = (Integer) keyToIndex().get(obj);
            return num == null ? null : getValue(num.intValue());
        }

        /* Access modifiers changed, original: 0000 */
        public K getKey(int i) {
            return keyToIndex().keySet().asList().get(i);
        }

        public abstract V getValue(int i);

        public abstract ImmutableMap<K, Integer> keyToIndex();

        public int size() {
            return this.size;
        }
    }

    final class Column extends ImmutableArrayMap<R, V> {
        private final int columnIndex;

        Column(int i) {
            super(DenseImmutableTable.this.columnCounts[i]);
            this.columnIndex = i;
        }

        /* Access modifiers changed, original: final */
        public final V getValue(int i) {
            return DenseImmutableTable.this.values[i][this.columnIndex];
        }

        /* Access modifiers changed, original: final */
        public final boolean isPartialView() {
            return true;
        }

        /* Access modifiers changed, original: final */
        public final ImmutableMap<R, Integer> keyToIndex() {
            return DenseImmutableTable.this.rowKeyToIndex;
        }
    }

    final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        private ColumnMap() {
            super(DenseImmutableTable.this.columnCounts.length);
        }

        /* Access modifiers changed, original: final */
        public final ImmutableMap<R, V> getValue(int i) {
            return new Column(i);
        }

        /* Access modifiers changed, original: final */
        public final boolean isPartialView() {
            return false;
        }

        /* Access modifiers changed, original: final */
        public final ImmutableMap<C, Integer> keyToIndex() {
            return DenseImmutableTable.this.columnKeyToIndex;
        }
    }

    final class Row extends ImmutableArrayMap<C, V> {
        private final int rowIndex;

        Row(int i) {
            super(DenseImmutableTable.this.rowCounts[i]);
            this.rowIndex = i;
        }

        /* Access modifiers changed, original: final */
        public final V getValue(int i) {
            return DenseImmutableTable.this.values[this.rowIndex][i];
        }

        /* Access modifiers changed, original: final */
        public final boolean isPartialView() {
            return true;
        }

        /* Access modifiers changed, original: final */
        public final ImmutableMap<C, Integer> keyToIndex() {
            return DenseImmutableTable.this.columnKeyToIndex;
        }
    }

    final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        private RowMap() {
            super(DenseImmutableTable.this.rowCounts.length);
        }

        /* Access modifiers changed, original: final */
        public final ImmutableMap<C, V> getValue(int i) {
            return new Row(i);
        }

        /* Access modifiers changed, original: final */
        public final boolean isPartialView() {
            return false;
        }

        /* Access modifiers changed, original: final */
        public final ImmutableMap<R, Integer> keyToIndex() {
            return DenseImmutableTable.this.rowKeyToIndex;
        }
    }

    DenseImmutableTable(ImmutableList<Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        this.values = (Object[][]) Array.newInstance(Object.class, new int[]{immutableSet.size(), immutableSet2.size()});
        this.rowKeyToIndex = Maps.indexMap(immutableSet);
        this.columnKeyToIndex = Maps.indexMap(immutableSet2);
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            Cell cell = (Cell) immutableList.get(i);
            Object rowKey = cell.getRowKey();
            Object columnKey = cell.getColumnKey();
            int intValue = ((Integer) this.rowKeyToIndex.get(rowKey)).intValue();
            int intValue2 = ((Integer) this.columnKeyToIndex.get(columnKey)).intValue();
            Preconditions.checkArgument(this.values[intValue][intValue2] == null, "duplicate key: (%s, %s)", rowKey, columnKey);
            this.values[intValue][intValue2] = cell.getValue();
            int[] iArr3 = this.rowCounts;
            iArr3[intValue] = iArr3[intValue] + 1;
            iArr3 = this.columnCounts;
            iArr3[intValue2] = iArr3[intValue2] + 1;
            iArr[i] = intValue;
            iArr2[i] = intValue2;
        }
        this.cellRowIndices = iArr;
        this.cellColumnIndices = iArr2;
        this.rowMap = new RowMap();
        this.columnMap = new ColumnMap();
    }

    public final ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf(this.columnMap);
    }

    public final V get(Object obj, Object obj2) {
        Integer num = (Integer) this.rowKeyToIndex.get(obj);
        Integer num2 = (Integer) this.columnKeyToIndex.get(obj2);
        return (num == null || num2 == null) ? null : this.values[num.intValue()][num2.intValue()];
    }

    /* Access modifiers changed, original: final */
    public final Cell<R, C, V> getCell(int i) {
        int i2 = this.cellRowIndices[i];
        i = this.cellColumnIndices[i];
        return ImmutableTable.cellOf(rowKeySet().asList().get(i2), columnKeySet().asList().get(i), this.values[i2][i]);
    }

    public final ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf(this.rowMap);
    }

    public final int size() {
        return this.cellRowIndices.length;
    }
}
