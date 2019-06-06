package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Map.Entry;
import java.util.Set;

final class FilteredEntrySetMultimap<K, V> extends FilteredEntryMultimap<K, V> implements FilteredSetMultimap<K, V> {
    FilteredEntrySetMultimap(SetMultimap<K, V> setMultimap, Predicate<? super Entry<K, V>> predicate) {
        super(setMultimap, predicate);
    }

    /* Access modifiers changed, original: final */
    public final Set<Entry<K, V>> createEntries() {
        return Sets.filter(unfiltered().entries(), entryPredicate());
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
