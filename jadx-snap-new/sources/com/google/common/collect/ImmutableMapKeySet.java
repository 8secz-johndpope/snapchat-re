package com.google.common.collect;

import java.util.Map.Entry;

final class ImmutableMapKeySet<K, V> extends IndexedImmutableSet<K> {
    private final ImmutableMap<K, V> map;

    ImmutableMapKeySet(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    public final boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    /* Access modifiers changed, original: final */
    public final K get(int i) {
        return ((Entry) this.map.entrySet().asList().get(i)).getKey();
    }

    /* Access modifiers changed, original: final */
    public final boolean isPartialView() {
        return true;
    }

    public final UnmodifiableIterator<K> iterator() {
        return this.map.keyIterator();
    }

    public final int size() {
        return this.map.size();
    }
}
