package com.google.common.cache;

import com.google.common.base.Function;

public interface LoadingCache<K, V> extends Function<K, V>, Cache<K, V> {
    V getUnchecked(K k);
}
