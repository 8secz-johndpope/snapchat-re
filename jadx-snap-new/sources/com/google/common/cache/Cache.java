package com.google.common.cache;

import java.util.concurrent.ConcurrentMap;

public interface Cache<K, V> {
    ConcurrentMap<K, V> asMap();

    V getIfPresent(Object obj);

    void invalidate(Object obj);

    void invalidateAll();

    void put(K k, V v);

    long size();
}
