package com.google.common.collect;

import java.util.Map.Entry;
import java.util.Set;

public interface SetMultimap<K, V> extends Multimap<K, V> {
    Set<Entry<K, V>> entries();
}
