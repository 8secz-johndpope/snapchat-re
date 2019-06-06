package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Map.Entry;
import java.util.Set;

final class FilteredKeySetMultimap<K, V> extends FilteredKeyMultimap<K, V> implements FilteredSetMultimap<K, V> {

    class EntrySet extends Entries implements Set<Entry<K, V>> {
        EntrySet() {
            super();
        }

        public boolean equals(Object obj) {
            return Sets.equalsImpl(this, obj);
        }

        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }
    }

    FilteredKeySetMultimap(SetMultimap<K, V> setMultimap, Predicate<? super K> predicate) {
        super(setMultimap, predicate);
    }

    /* Access modifiers changed, original: final */
    public final Set<Entry<K, V>> createEntries() {
        return new EntrySet();
    }

    public final Set<Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    public final Set<V> get(K k) {
        return (Set) super.get(k);
    }

    public final SetMultimap<K, V> unfiltered() {
        return (SetMultimap) this.unfiltered;
    }
}
