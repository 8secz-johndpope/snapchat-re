package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements SetMultimap<K, V> {
    protected AbstractSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    public abstract Set<V> createCollection();

    public Set<Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Set<V> get(K k) {
        return (Set) super.get(k);
    }

    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    /* Access modifiers changed, original: 0000 */
    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new WrappedSet(k, (Set) collection);
    }
}
