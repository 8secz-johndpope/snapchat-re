package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.List;

final class FilteredKeyListMultimap<K, V> extends FilteredKeyMultimap<K, V> implements ListMultimap<K, V> {
    FilteredKeyListMultimap(ListMultimap<K, V> listMultimap, Predicate<? super K> predicate) {
        super(listMultimap, predicate);
    }

    public final List<V> get(K k) {
        return (List) super.get(k);
    }

    public final ListMultimap<K, V> unfiltered() {
        return (ListMultimap) super.unfiltered();
    }
}
