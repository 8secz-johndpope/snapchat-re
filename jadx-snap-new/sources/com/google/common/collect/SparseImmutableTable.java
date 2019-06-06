package com.google.common.collect;

import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.collect.Table.Cell;
import defpackage.ppy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    static final ImmutableTable<Object, Object, Object> EMPTY = new SparseImmutableTable(ImmutableList.of(), ImmutableSet.of(), ImmutableSet.of());
    private final int[] cellColumnInRowIndices;
    private final int[] cellRowIndices;
    private final ImmutableMap<C, ImmutableMap<R, V>> columnMap;
    private final ImmutableMap<R, ImmutableMap<C, V>> rowMap;

    SparseImmutableTable(ImmutableList<Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap indexMap = Maps.indexMap(immutableSet);
        LinkedHashMap newLinkedHashMap = Maps.newLinkedHashMap();
        UnmodifiableIterator it = immutableSet.iterator();
        while (it.hasNext()) {
            newLinkedHashMap.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap newLinkedHashMap2 = Maps.newLinkedHashMap();
        UnmodifiableIterator it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            newLinkedHashMap2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        int i = 0;
        while (i < immutableList.size()) {
            Cell cell = (Cell) immutableList.get(i);
            Object rowKey = cell.getRowKey();
            Object columnKey = cell.getColumnKey();
            Object value = cell.getValue();
            iArr[i] = ((Integer) indexMap.get(rowKey)).intValue();
            Map map = (Map) newLinkedHashMap.get(rowKey);
            iArr2[i] = map.size();
            Object put = map.put(columnKey, value);
            if (put == null) {
                ((Map) newLinkedHashMap2.get(columnKey)).put(rowKey, value);
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Duplicate value for row=");
                stringBuilder.append(rowKey);
                stringBuilder.append(", column=");
                stringBuilder.append(columnKey);
                stringBuilder.append(": ");
                stringBuilder.append(value);
                stringBuilder.append(ppy.d);
                stringBuilder.append(put);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        this.cellRowIndices = iArr;
        this.cellColumnInRowIndices = iArr2;
        Builder builder = new Builder(newLinkedHashMap.size());
        for (Entry entry : newLinkedHashMap.entrySet()) {
            builder.put(entry.getKey(), ImmutableMap.copyOf((Map) entry.getValue()));
        }
        this.rowMap = builder.build();
        builder = new Builder(newLinkedHashMap2.size());
        for (Entry entry2 : newLinkedHashMap2.entrySet()) {
            builder.put(entry2.getKey(), ImmutableMap.copyOf((Map) entry2.getValue()));
        }
        this.columnMap = builder.build();
    }

    public final ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf(this.columnMap);
    }

    /* Access modifiers changed, original: final */
    public final Cell<R, C, V> getCell(int i) {
        Entry entry = (Entry) this.rowMap.entrySet().asList().get(this.cellRowIndices[i]);
        ImmutableMap immutableMap = (ImmutableMap) entry.getValue();
        Entry entry2 = (Entry) immutableMap.entrySet().asList().get(this.cellColumnInRowIndices[i]);
        return ImmutableTable.cellOf(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    public final ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf(this.rowMap);
    }

    public final int size() {
        return this.cellRowIndices.length;
    }
}
