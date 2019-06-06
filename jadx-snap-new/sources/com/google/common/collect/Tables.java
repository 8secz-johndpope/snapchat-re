package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.Table.Cell;
import defpackage.ppy;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

public final class Tables {
    private static final Function<? extends Map<?, ?>, ? extends Map<?, ?>> UNMODIFIABLE_WRAPPER = new Function<Map<Object, Object>, Map<Object, Object>>() {
        public final Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    };

    static final class ImmutableCell<R, C, V> extends AbstractCell<R, C, V> implements Serializable {
        private final C columnKey;
        private final R rowKey;
        private final V value;

        ImmutableCell(R r, C c, V v) {
            this.rowKey = r;
            this.columnKey = c;
            this.value = v;
        }

        public final C getColumnKey() {
            return this.columnKey;
        }

        public final R getRowKey() {
            return this.rowKey;
        }

        public final V getValue() {
            return this.value;
        }
    }

    static abstract class AbstractCell<R, C, V> implements Cell<R, C, V> {
        AbstractCell() {
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Cell) {
                Cell cell = (Cell) obj;
                return Objects.equal(getRowKey(), cell.getRowKey()) && Objects.equal(getColumnKey(), cell.getColumnKey()) && Objects.equal(getValue(), cell.getValue());
            }
        }

        public int hashCode() {
            return Objects.hashCode(getRowKey(), getColumnKey(), getValue());
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("(");
            stringBuilder.append(getRowKey());
            stringBuilder.append(ppy.b);
            stringBuilder.append(getColumnKey());
            stringBuilder.append(")=");
            stringBuilder.append(getValue());
            return stringBuilder.toString();
        }
    }

    static boolean equalsImpl(Table<?, ?, ?> table, Object obj) {
        if (obj == table) {
            return true;
        }
        if (!(obj instanceof Table)) {
            return false;
        }
        return table.cellSet().equals(((Table) obj).cellSet());
    }

    public static <R, C, V> Cell<R, C, V> immutableCell(R r, C c, V v) {
        return new ImmutableCell(r, c, v);
    }
}
