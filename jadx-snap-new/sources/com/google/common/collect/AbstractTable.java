package com.google.common.collect;

import com.google.common.collect.Table.Cell;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class AbstractTable<R, C, V> implements Table<R, C, V> {
    private transient Set<Cell<R, C, V>> cellSet;

    class CellSet extends AbstractSet<Cell<R, C, V>> {
        CellSet() {
        }

        public void clear() {
            AbstractTable.this.clear();
        }

        public boolean contains(Object obj) {
            if (obj instanceof Cell) {
                Cell cell = (Cell) obj;
                Map map = (Map) Maps.safeGet(AbstractTable.this.rowMap(), cell.getRowKey());
                if (map != null && Collections2.safeContains(map.entrySet(), Maps.immutableEntry(cell.getColumnKey(), cell.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        public Iterator<Cell<R, C, V>> iterator() {
            return AbstractTable.this.cellIterator();
        }

        public boolean remove(Object obj) {
            if (obj instanceof Cell) {
                Cell cell = (Cell) obj;
                Map map = (Map) Maps.safeGet(AbstractTable.this.rowMap(), cell.getRowKey());
                if (map != null && Collections2.safeRemove(map.entrySet(), Maps.immutableEntry(cell.getColumnKey(), cell.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return AbstractTable.this.size();
        }
    }

    AbstractTable() {
    }

    public abstract Iterator<Cell<R, C, V>> cellIterator();

    public Set<Cell<R, C, V>> cellSet() {
        Set set = this.cellSet;
        if (set != null) {
            return set;
        }
        set = createCellSet();
        this.cellSet = set;
        return set;
    }

    public void clear() {
        Iterators.clear(cellSet().iterator());
    }

    public boolean containsRow(Object obj) {
        return Maps.safeContainsKey(rowMap(), obj);
    }

    /* Access modifiers changed, original: 0000 */
    public Set<Cell<R, C, V>> createCellSet() {
        return new CellSet();
    }

    public boolean equals(Object obj) {
        return Tables.equalsImpl(this, obj);
    }

    public V get(Object obj, Object obj2) {
        Map map = (Map) Maps.safeGet(rowMap(), obj);
        return map == null ? null : Maps.safeGet(map, obj2);
    }

    public int hashCode() {
        return cellSet().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public V put(R r, C c, V v) {
        return row(r).put(c, v);
    }

    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        for (Cell cell : table.cellSet()) {
            put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
        }
    }

    public String toString() {
        return rowMap().toString();
    }
}
