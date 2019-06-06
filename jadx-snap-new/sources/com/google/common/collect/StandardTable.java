package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Table.Cell;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class StandardTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    final Map<R, Map<C, V>> backingMap;
    final Supplier<? extends Map<C, V>> factory;
    private transient Map<R, Map<C, V>> rowMap;

    class RowMap extends ViewCachingAbstractMap<R, Map<C, V>> {

        class EntrySet extends TableSet<Entry<R, Map<C, V>>> {
            EntrySet() {
                super();
            }

            public boolean contains(Object obj) {
                if (obj instanceof Entry) {
                    Entry entry = (Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && Collections2.safeContains(StandardTable.this.backingMap.entrySet(), entry)) {
                        return true;
                    }
                }
                return false;
            }

            public Iterator<Entry<R, Map<C, V>>> iterator() {
                return Maps.asMapEntryIterator(StandardTable.this.backingMap.keySet(), new Function<R, Map<C, V>>() {
                    public Map<C, V> apply(R r) {
                        return StandardTable.this.row(r);
                    }
                });
            }

            public boolean remove(Object obj) {
                if (obj instanceof Entry) {
                    Entry entry = (Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && StandardTable.this.backingMap.entrySet().remove(entry)) {
                        return true;
                    }
                }
                return false;
            }

            public int size() {
                return StandardTable.this.backingMap.size();
            }
        }

        RowMap() {
        }

        public boolean containsKey(Object obj) {
            return StandardTable.this.containsRow(obj);
        }

        /* Access modifiers changed, original: protected */
        public Set<Entry<R, Map<C, V>>> createEntrySet() {
            return new EntrySet();
        }

        public Map<C, V> get(Object obj) {
            return StandardTable.this.containsRow(obj) ? StandardTable.this.row(obj) : null;
        }

        public Map<C, V> remove(Object obj) {
            return obj == null ? null : (Map) StandardTable.this.backingMap.remove(obj);
        }
    }

    class Row extends IteratorBasedAbstractMap<C, V> {
        Map<C, V> backingRowMap;
        final R rowKey;

        Row(R r) {
            this.rowKey = Preconditions.checkNotNull(r);
        }

        /* Access modifiers changed, original: 0000 */
        public Map<C, V> backingRowMap() {
            Map map = this.backingRowMap;
            if (map != null && (!map.isEmpty() || !StandardTable.this.backingMap.containsKey(this.rowKey))) {
                return this.backingRowMap;
            }
            map = computeBackingRowMap();
            this.backingRowMap = map;
            return map;
        }

        public void clear() {
            Map backingRowMap = backingRowMap();
            if (backingRowMap != null) {
                backingRowMap.clear();
            }
            maintainEmptyInvariant();
        }

        /* Access modifiers changed, original: 0000 */
        public Map<C, V> computeBackingRowMap() {
            return (Map) StandardTable.this.backingMap.get(this.rowKey);
        }

        public boolean containsKey(Object obj) {
            Map backingRowMap = backingRowMap();
            return (obj == null || backingRowMap == null || !Maps.safeContainsKey(backingRowMap, obj)) ? false : true;
        }

        /* Access modifiers changed, original: 0000 */
        public Iterator<Entry<C, V>> entryIterator() {
            Map backingRowMap = backingRowMap();
            if (backingRowMap == null) {
                return Iterators.emptyModifiableIterator();
            }
            final Iterator it = backingRowMap.entrySet().iterator();
            return new Iterator<Entry<C, V>>() {
                public boolean hasNext() {
                    return it.hasNext();
                }

                public Entry<C, V> next() {
                    return Row.this.wrapEntry((Entry) it.next());
                }

                public void remove() {
                    it.remove();
                    Row.this.maintainEmptyInvariant();
                }
            };
        }

        public V get(Object obj) {
            Map backingRowMap = backingRowMap();
            return (obj == null || backingRowMap == null) ? null : Maps.safeGet(backingRowMap, obj);
        }

        /* Access modifiers changed, original: 0000 */
        public void maintainEmptyInvariant() {
            if (backingRowMap() != null && this.backingRowMap.isEmpty()) {
                StandardTable.this.backingMap.remove(this.rowKey);
                this.backingRowMap = null;
            }
        }

        public V put(C c, V v) {
            Preconditions.checkNotNull(c);
            Preconditions.checkNotNull(v);
            Map map = this.backingRowMap;
            return (map == null || map.isEmpty()) ? StandardTable.this.put(this.rowKey, c, v) : this.backingRowMap.put(c, v);
        }

        public V remove(Object obj) {
            Map backingRowMap = backingRowMap();
            if (backingRowMap == null) {
                return null;
            }
            obj = Maps.safeRemove(backingRowMap, obj);
            maintainEmptyInvariant();
            return obj;
        }

        public int size() {
            Map backingRowMap = backingRowMap();
            return backingRowMap == null ? 0 : backingRowMap.size();
        }

        /* Access modifiers changed, original: 0000 */
        public Entry<C, V> wrapEntry(final Entry<C, V> entry) {
            return new ForwardingMapEntry<C, V>() {
                /* Access modifiers changed, original: protected */
                public Entry<C, V> delegate() {
                    return entry;
                }

                public boolean equals(Object obj) {
                    return standardEquals(obj);
                }

                public V setValue(V v) {
                    return super.setValue(Preconditions.checkNotNull(v));
                }
            };
        }
    }

    class CellIterator implements Iterator<Cell<R, C, V>> {
        Iterator<Entry<C, V>> columnIterator;
        Entry<R, Map<C, V>> rowEntry;
        final Iterator<Entry<R, Map<C, V>>> rowIterator;

        private CellIterator() {
            this.rowIterator = StandardTable.this.backingMap.entrySet().iterator();
            this.columnIterator = Iterators.emptyModifiableIterator();
        }

        public boolean hasNext() {
            return this.rowIterator.hasNext() || this.columnIterator.hasNext();
        }

        public Cell<R, C, V> next() {
            if (!this.columnIterator.hasNext()) {
                this.rowEntry = (Entry) this.rowIterator.next();
                this.columnIterator = ((Map) this.rowEntry.getValue()).entrySet().iterator();
            }
            Entry entry = (Entry) this.columnIterator.next();
            return Tables.immutableCell(this.rowEntry.getKey(), entry.getKey(), entry.getValue());
        }

        public void remove() {
            this.columnIterator.remove();
            if (((Map) this.rowEntry.getValue()).isEmpty()) {
                this.rowIterator.remove();
                this.rowEntry = null;
            }
        }
    }

    abstract class TableSet<T> extends ImprovedAbstractSet<T> {
        private TableSet() {
        }

        public void clear() {
            StandardTable.this.backingMap.clear();
        }

        public boolean isEmpty() {
            return StandardTable.this.backingMap.isEmpty();
        }
    }

    StandardTable(Map<R, Map<C, V>> map, Supplier<? extends Map<C, V>> supplier) {
        this.backingMap = map;
        this.factory = supplier;
    }

    private Map<C, V> getOrCreate(R r) {
        Map map = (Map) this.backingMap.get(r);
        if (map != null) {
            return map;
        }
        map = (Map) this.factory.get();
        this.backingMap.put(r, map);
        return map;
    }

    /* Access modifiers changed, original: 0000 */
    public Iterator<Cell<R, C, V>> cellIterator() {
        return new CellIterator();
    }

    public Set<Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    public void clear() {
        this.backingMap.clear();
    }

    public boolean containsRow(Object obj) {
        return obj != null && Maps.safeContainsKey(this.backingMap, obj);
    }

    /* Access modifiers changed, original: 0000 */
    public Map<R, Map<C, V>> createRowMap() {
        return new RowMap();
    }

    public V get(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? null : super.get(obj, obj2);
    }

    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    public V put(R r, C c, V v) {
        Preconditions.checkNotNull(r);
        Preconditions.checkNotNull(c);
        Preconditions.checkNotNull(v);
        return getOrCreate(r).put(c, v);
    }

    public Map<C, V> row(R r) {
        return new Row(r);
    }

    public Map<R, Map<C, V>> rowMap() {
        Map map = this.rowMap;
        if (map != null) {
            return map;
        }
        map = createRowMap();
        this.rowMap = map;
        return map;
    }

    public int size() {
        int i = 0;
        for (Map size : this.backingMap.values()) {
            i += size.size();
        }
        return i;
    }
}
