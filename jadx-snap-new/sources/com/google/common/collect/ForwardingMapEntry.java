package com.google.common.collect;

import com.google.common.base.Objects;
import java.util.Map.Entry;

public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Entry<K, V> {
    protected ForwardingMapEntry() {
    }

    public abstract Entry<K, V> delegate();

    public boolean equals(Object obj) {
        return delegate().equals(obj);
    }

    public K getKey() {
        return delegate().getKey();
    }

    public V getValue() {
        return delegate().getValue();
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public V setValue(V v) {
        return delegate().setValue(v);
    }

    /* Access modifiers changed, original: protected */
    public boolean standardEquals(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            if (Objects.equal(getKey(), entry.getKey()) && Objects.equal(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }
}
