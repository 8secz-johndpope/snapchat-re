package com.google.common.collect;

import java.util.Map;
import java.util.Set;

public interface Table<R, C, V> {

    public interface Cell<R, C, V> {
        C getColumnKey();

        R getRowKey();

        V getValue();
    }

    Set<Cell<R, C, V>> cellSet();

    V get(Object obj, Object obj2);

    V put(R r, C c, V v);

    Map<C, V> row(R r);

    Map<R, Map<C, V>> rowMap();

    int size();
}
