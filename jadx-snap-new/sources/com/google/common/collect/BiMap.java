package com.google.common.collect;

import java.util.Map;
import java.util.Set;

public interface BiMap<K, V> extends Map<K, V> {
    BiMap<V, K> inverse();

    V put(K k, V v);

    Set<V> values();
}
