package com.google.common.collect;

import java.util.Map.Entry;

final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {
    private final ImmutableMap<K, V> map;

    ImmutableMapValues(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    public final ImmutableList<V> asList() {
        final ImmutableList asList = this.map.entrySet().asList();
        return new ImmutableList<V>() {
            public V get(int i) {
                return ((Entry) asList.get(i)).getValue();
            }

            /* Access modifiers changed, original: 0000 */
            public boolean isPartialView() {
                return true;
            }

            public int size() {
                return asList.size();
            }
        };
    }

    public final boolean contains(Object obj) {
        return obj != null && Iterators.contains(iterator(), obj);
    }

    /* Access modifiers changed, original: final */
    public final boolean isPartialView() {
        return true;
    }

    public final UnmodifiableIterator<V> iterator() {
        return new UnmodifiableIterator<V>() {
            final UnmodifiableIterator<Entry<K, V>> entryItr = ImmutableMapValues.this.map.entrySet().iterator();

            public boolean hasNext() {
                return this.entryItr.hasNext();
            }

            public V next() {
                return ((Entry) this.entryItr.next()).getValue();
            }
        };
    }

    public final int size() {
        return this.map.size();
    }
}
