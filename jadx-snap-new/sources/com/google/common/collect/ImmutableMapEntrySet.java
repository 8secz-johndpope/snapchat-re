package com.google.common.collect;

import java.util.Map.Entry;

abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Entry<K, V>> {
    ImmutableMapEntrySet() {
    }

    public boolean contains(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            Object obj2 = map().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return map().hashCode();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isHashCodeFast() {
        return map().isHashCodeFast();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isPartialView() {
        return map().isPartialView();
    }

    public abstract ImmutableMap<K, V> map();

    public int size() {
        return map().size();
    }
}
