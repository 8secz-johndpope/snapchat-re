package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.EnumMap;
import java.util.Map.Entry;

final class ImmutableEnumMap<K extends Enum<K>, V> extends IteratorBasedImmutableMap<K, V> {
    private final transient EnumMap<K, V> delegate;

    private ImmutableEnumMap(EnumMap<K, V> enumMap) {
        this.delegate = enumMap;
        Preconditions.checkArgument(enumMap.isEmpty() ^ 1);
    }

    static <K extends Enum<K>, V> ImmutableMap<K, V> asImmutable(EnumMap<K, V> enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return ImmutableMap.of();
        }
        if (size != 1) {
            return new ImmutableEnumMap(enumMap);
        }
        Entry entry = (Entry) Iterables.getOnlyElement(enumMap.entrySet());
        return ImmutableMap.of(entry.getKey(), entry.getValue());
    }

    public final boolean containsKey(Object obj) {
        return this.delegate.containsKey(obj);
    }

    /* Access modifiers changed, original: final */
    public final UnmodifiableIterator<Entry<K, V>> entryIterator() {
        return Maps.unmodifiableEntryIterator(this.delegate.entrySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumMap) {
            obj = ((ImmutableEnumMap) obj).delegate;
        }
        return this.delegate.equals(obj);
    }

    public final V get(Object obj) {
        return this.delegate.get(obj);
    }

    /* Access modifiers changed, original: final */
    public final boolean isPartialView() {
        return false;
    }

    /* Access modifiers changed, original: final */
    public final UnmodifiableIterator<K> keyIterator() {
        return Iterators.unmodifiableIterator(this.delegate.keySet().iterator());
    }

    public final int size() {
        return this.delegate.size();
    }
}
