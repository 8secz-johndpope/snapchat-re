package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Primitives;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class MutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {
    private final Map<Class<? extends B>, B> delegate;

    private MutableClassToInstanceMap(Map<Class<? extends B>, B> map) {
        this.delegate = (Map) Preconditions.checkNotNull(map);
    }

    private static <B, T extends B> T cast(Class<T> cls, B b) {
        return Primitives.wrap(cls).cast(b);
    }

    static <B> Entry<Class<? extends B>, B> checkedEntry(final Entry<Class<? extends B>, B> entry) {
        return new ForwardingMapEntry<Class<? extends B>, B>() {
            /* Access modifiers changed, original: protected|final */
            public final Entry<Class<? extends B>, B> delegate() {
                return entry;
            }

            public final B setValue(B b) {
                return super.setValue(MutableClassToInstanceMap.cast((Class) getKey(), b));
            }
        };
    }

    public static <B> MutableClassToInstanceMap<B> create() {
        return new MutableClassToInstanceMap(new HashMap());
    }

    /* Access modifiers changed, original: protected|final */
    public final Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    public final Set<Entry<Class<? extends B>, B>> entrySet() {
        return new ForwardingSet<Entry<Class<? extends B>, B>>() {
            /* Access modifiers changed, original: protected */
            public Set<Entry<Class<? extends B>, B>> delegate() {
                return MutableClassToInstanceMap.this.delegate().entrySet();
            }

            public Iterator<Entry<Class<? extends B>, B>> iterator() {
                return new TransformedIterator<Entry<Class<? extends B>, B>, Entry<Class<? extends B>, B>>(delegate().iterator()) {
                    /* Access modifiers changed, original: 0000 */
                    public Entry<Class<? extends B>, B> transform(Entry<Class<? extends B>, B> entry) {
                        return MutableClassToInstanceMap.checkedEntry(entry);
                    }
                };
            }

            public Object[] toArray() {
                return standardToArray();
            }

            public <T> T[] toArray(T[] tArr) {
                return standardToArray(tArr);
            }
        };
    }

    public final <T extends B> T getInstance(Class<T> cls) {
        return cast(cls, get(cls));
    }

    public final B put(Class<? extends B> cls, B b) {
        return super.put(cls, cast(cls, b));
    }

    public final void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Entry entry : linkedHashMap.entrySet()) {
            cast((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    public final <T extends B> T putInstance(Class<T> cls, T t) {
        return cast(cls, put((Class) cls, (Object) t));
    }
}
