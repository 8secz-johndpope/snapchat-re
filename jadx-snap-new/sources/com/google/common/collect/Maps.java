package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableMap.Builder;
import defpackage.ppy;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class Maps {

    static abstract class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {
        private transient Set<Entry<K, V>> entrySet;
        private transient Set<K> keySet;
        private transient Collection<V> values;

        ViewCachingAbstractMap() {
        }

        public abstract Set<Entry<K, V>> createEntrySet();

        /* Access modifiers changed, original: 0000 */
        public Set<K> createKeySet() {
            return new KeySet(this);
        }

        /* Access modifiers changed, original: 0000 */
        public Collection<V> createValues() {
            return new Values(this);
        }

        public Set<Entry<K, V>> entrySet() {
            Set set = this.entrySet;
            if (set != null) {
                return set;
            }
            set = createEntrySet();
            this.entrySet = set;
            return set;
        }

        public Set<K> keySet() {
            Set set = this.keySet;
            if (set != null) {
                return set;
            }
            set = createKeySet();
            this.keySet = set;
            return set;
        }

        public Collection<V> values() {
            Collection collection = this.values;
            if (collection != null) {
                return collection;
            }
            collection = createValues();
            this.values = collection;
            return collection;
        }
    }

    public interface EntryTransformer<K, V1, V2> {
        V2 transformEntry(K k, V1 v1);
    }

    static abstract class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {
        IteratorBasedAbstractMap() {
        }

        public void clear() {
            Iterators.clear(entryIterator());
        }

        public abstract Iterator<Entry<K, V>> entryIterator();

        public Set<Entry<K, V>> entrySet() {
            return new EntrySet<K, V>() {
                public Iterator<Entry<K, V>> iterator() {
                    return IteratorBasedAbstractMap.this.entryIterator();
                }

                /* Access modifiers changed, original: 0000 */
                public Map<K, V> map() {
                    return IteratorBasedAbstractMap.this;
                }
            };
        }
    }

    static abstract class EntrySet<K, V> extends ImprovedAbstractSet<Entry<K, V>> {
        EntrySet() {
        }

        public void clear() {
            map().clear();
        }

        public boolean contains(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                Object safeGet = Maps.safeGet(map(), key);
                if (Objects.equal(safeGet, entry.getValue()) && (safeGet != null || map().containsKey(key))) {
                    return true;
                }
            }
            return false;
        }

        public boolean isEmpty() {
            return map().isEmpty();
        }

        public abstract Map<K, V> map();

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            return map().keySet().remove(((Entry) obj).getKey());
        }

        public boolean removeAll(Collection<?> collection) {
            Collection collection2;
            try {
                collection2 = super.removeAll((Collection) Preconditions.checkNotNull(collection2));
                return collection2;
            } catch (UnsupportedOperationException unused) {
                return Sets.removeAllImpl((Set) this, collection2.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            Collection collection2;
            try {
                collection2 = super.retainAll((Collection) Preconditions.checkNotNull(collection2));
                return collection2;
            } catch (UnsupportedOperationException unused) {
                HashSet newHashSetWithExpectedSize = Sets.newHashSetWithExpectedSize(collection2.size());
                for (Object next : collection2) {
                    if (contains(next)) {
                        newHashSetWithExpectedSize.add(((Entry) next).getKey());
                    }
                }
                return map().keySet().retainAll(newHashSetWithExpectedSize);
            }
        }

        public int size() {
            return map().size();
        }
    }

    enum EntryFunction implements Function<Entry<?, ?>, Object> {
        KEY {
            public final Object apply(Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            public final Object apply(Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    static class TransformedEntriesMap<K, V1, V2> extends IteratorBasedAbstractMap<K, V2> {
        final Map<K, V1> fromMap;
        final EntryTransformer<? super K, ? super V1, V2> transformer;

        TransformedEntriesMap(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            this.fromMap = (Map) Preconditions.checkNotNull(map);
            this.transformer = (EntryTransformer) Preconditions.checkNotNull(entryTransformer);
        }

        public void clear() {
            this.fromMap.clear();
        }

        public boolean containsKey(Object obj) {
            return this.fromMap.containsKey(obj);
        }

        /* Access modifiers changed, original: 0000 */
        public Iterator<Entry<K, V2>> entryIterator() {
            return Iterators.transform(this.fromMap.entrySet().iterator(), Maps.asEntryToEntryFunction(this.transformer));
        }

        public V2 get(Object obj) {
            Object obj2 = this.fromMap.get(obj);
            return (obj2 != null || this.fromMap.containsKey(obj)) ? this.transformer.transformEntry(obj, obj2) : null;
        }

        public Set<K> keySet() {
            return this.fromMap.keySet();
        }

        public V2 remove(Object obj) {
            return this.fromMap.containsKey(obj) ? this.transformer.transformEntry(obj, this.fromMap.remove(obj)) : null;
        }

        public int size() {
            return this.fromMap.size();
        }

        public Collection<V2> values() {
            return new Values(this);
        }
    }

    static class Values<K, V> extends AbstractCollection<V> {
        final Map<K, V> map;

        Values(Map<K, V> map) {
            this.map = (Map) Preconditions.checkNotNull(map);
        }

        public void clear() {
            map().clear();
        }

        public boolean contains(Object obj) {
            return map().containsValue(obj);
        }

        public boolean isEmpty() {
            return map().isEmpty();
        }

        public Iterator<V> iterator() {
            return Maps.valueIterator(map().entrySet().iterator());
        }

        /* Access modifiers changed, original: final */
        public final Map<K, V> map() {
            return this.map;
        }

        public boolean remove(Object obj) {
            try {
                obj = super.remove(obj);
                return obj;
            } catch (UnsupportedOperationException unused) {
                for (Entry entry : map().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        map().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            Collection collection2;
            try {
                collection2 = super.removeAll((Collection) Preconditions.checkNotNull(collection2));
                return collection2;
            } catch (UnsupportedOperationException unused) {
                HashSet newHashSet = Sets.newHashSet();
                for (Entry entry : map().entrySet()) {
                    if (collection2.contains(entry.getValue())) {
                        newHashSet.add(entry.getKey());
                    }
                }
                return map().keySet().removeAll(newHashSet);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            Collection collection2;
            try {
                collection2 = super.retainAll((Collection) Preconditions.checkNotNull(collection2));
                return collection2;
            } catch (UnsupportedOperationException unused) {
                HashSet newHashSet = Sets.newHashSet();
                for (Entry entry : map().entrySet()) {
                    if (collection2.contains(entry.getValue())) {
                        newHashSet.add(entry.getKey());
                    }
                }
                return map().keySet().retainAll(newHashSet);
            }
        }

        public int size() {
            return map().size();
        }
    }

    static abstract class AbstractFilteredMap<K, V> extends ViewCachingAbstractMap<K, V> {
        final Predicate<? super Entry<K, V>> predicate;
        final Map<K, V> unfiltered;

        AbstractFilteredMap(Map<K, V> map, Predicate<? super Entry<K, V>> predicate) {
            this.unfiltered = map;
            this.predicate = predicate;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean apply(Object obj, V v) {
            return this.predicate.apply(Maps.immutableEntry(obj, v));
        }

        public boolean containsKey(Object obj) {
            return this.unfiltered.containsKey(obj) && apply(obj, this.unfiltered.get(obj));
        }

        /* Access modifiers changed, original: 0000 */
        public Collection<V> createValues() {
            return new FilteredMapValues(this, this.unfiltered, this.predicate);
        }

        public V get(Object obj) {
            Object obj2 = this.unfiltered.get(obj);
            return (obj2 == null || !apply(obj, obj2)) ? null : obj2;
        }

        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        public V put(K k, V v) {
            Preconditions.checkArgument(apply(k, v));
            return this.unfiltered.put(k, v);
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            for (Entry entry : map.entrySet()) {
                Preconditions.checkArgument(apply(entry.getKey(), entry.getValue()));
            }
            this.unfiltered.putAll(map);
        }

        public V remove(Object obj) {
            return containsKey(obj) ? this.unfiltered.remove(obj) : null;
        }
    }

    static final class FilteredMapValues<K, V> extends Values<K, V> {
        final Predicate<? super Entry<K, V>> predicate;
        final Map<K, V> unfiltered;

        FilteredMapValues(Map<K, V> map, Map<K, V> map2, Predicate<? super Entry<K, V>> predicate) {
            super(map);
            this.unfiltered = map2;
            this.predicate = predicate;
        }

        public final boolean remove(Object obj) {
            Iterator it = this.unfiltered.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (this.predicate.apply(entry) && Objects.equal(entry.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        public final boolean removeAll(Collection<?> collection) {
            Iterator it = this.unfiltered.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (this.predicate.apply(entry) && collection.contains(entry.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            Iterator it = this.unfiltered.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (this.predicate.apply(entry) && !collection.contains(entry.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public final Object[] toArray() {
            return Lists.newArrayList(iterator()).toArray();
        }

        public final <T> T[] toArray(T[] tArr) {
            return Lists.newArrayList(iterator()).toArray(tArr);
        }
    }

    static class KeySet<K, V> extends ImprovedAbstractSet<K> {
        final Map<K, V> map;

        KeySet(Map<K, V> map) {
            this.map = (Map) Preconditions.checkNotNull(map);
        }

        public void clear() {
            map().clear();
        }

        public boolean contains(Object obj) {
            return map().containsKey(obj);
        }

        public boolean isEmpty() {
            return map().isEmpty();
        }

        public Iterator<K> iterator() {
            return Maps.keyIterator(map().entrySet().iterator());
        }

        /* Access modifiers changed, original: 0000 */
        public Map<K, V> map() {
            return this.map;
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            map().remove(obj);
            return true;
        }

        public int size() {
            return map().size();
        }
    }

    static class FilteredEntryMap<K, V> extends AbstractFilteredMap<K, V> {
        final Set<Entry<K, V>> filteredEntrySet;

        class KeySet extends KeySet<K, V> {
            KeySet() {
                super(FilteredEntryMap.this);
            }

            public boolean remove(Object obj) {
                if (!FilteredEntryMap.this.containsKey(obj)) {
                    return false;
                }
                FilteredEntryMap.this.unfiltered.remove(obj);
                return true;
            }

            public boolean removeAll(Collection<?> collection) {
                return FilteredEntryMap.removeAllKeys(FilteredEntryMap.this.unfiltered, FilteredEntryMap.this.predicate, collection);
            }

            public boolean retainAll(Collection<?> collection) {
                return FilteredEntryMap.retainAllKeys(FilteredEntryMap.this.unfiltered, FilteredEntryMap.this.predicate, collection);
            }

            public Object[] toArray() {
                return Lists.newArrayList(iterator()).toArray();
            }

            public <T> T[] toArray(T[] tArr) {
                return Lists.newArrayList(iterator()).toArray(tArr);
            }
        }

        class EntrySet extends ForwardingSet<Entry<K, V>> {
            private EntrySet() {
            }

            /* synthetic */ EntrySet(FilteredEntryMap filteredEntryMap, AnonymousClass1 anonymousClass1) {
                this();
            }

            /* Access modifiers changed, original: protected */
            public Set<Entry<K, V>> delegate() {
                return FilteredEntryMap.this.filteredEntrySet;
            }

            public Iterator<Entry<K, V>> iterator() {
                return new TransformedIterator<Entry<K, V>, Entry<K, V>>(FilteredEntryMap.this.filteredEntrySet.iterator()) {
                    /* Access modifiers changed, original: 0000 */
                    public Entry<K, V> transform(final Entry<K, V> entry) {
                        return new ForwardingMapEntry<K, V>() {
                            /* Access modifiers changed, original: protected */
                            public Entry<K, V> delegate() {
                                return entry;
                            }

                            public V setValue(V v) {
                                Preconditions.checkArgument(FilteredEntryMap.this.apply(getKey(), v));
                                return super.setValue(v);
                            }
                        };
                    }
                };
            }
        }

        FilteredEntryMap(Map<K, V> map, Predicate<? super Entry<K, V>> predicate) {
            super(map, predicate);
            this.filteredEntrySet = Sets.filter(map.entrySet(), this.predicate);
        }

        static <K, V> boolean removeAllKeys(Map<K, V> map, Predicate<? super Entry<K, V>> predicate, Collection<?> collection) {
            Iterator it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (predicate.apply(entry) && collection.contains(entry.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        static <K, V> boolean retainAllKeys(Map<K, V> map, Predicate<? super Entry<K, V>> predicate, Collection<?> collection) {
            Iterator it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (predicate.apply(entry) && !collection.contains(entry.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        /* Access modifiers changed, original: protected */
        public Set<Entry<K, V>> createEntrySet() {
            return new EntrySet(this, null);
        }

        /* Access modifiers changed, original: 0000 */
        public Set<K> createKeySet() {
            return new KeySet();
        }
    }

    static class FilteredKeyMap<K, V> extends AbstractFilteredMap<K, V> {
        final Predicate<? super K> keyPredicate;

        FilteredKeyMap(Map<K, V> map, Predicate<? super K> predicate, Predicate<? super Entry<K, V>> predicate2) {
            super(map, predicate2);
            this.keyPredicate = predicate;
        }

        public boolean containsKey(Object obj) {
            return this.unfiltered.containsKey(obj) && this.keyPredicate.apply(obj);
        }

        /* Access modifiers changed, original: protected */
        public Set<Entry<K, V>> createEntrySet() {
            return Sets.filter(this.unfiltered.entrySet(), this.predicate);
        }

        /* Access modifiers changed, original: 0000 */
        public Set<K> createKeySet() {
            return Sets.filter(this.unfiltered.keySet(), this.keyPredicate);
        }
    }

    static <K, V1, V2> Function<Entry<K, V1>, Entry<K, V2>> asEntryToEntryFunction(final EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        Preconditions.checkNotNull(entryTransformer);
        return new Function<Entry<K, V1>, Entry<K, V2>>() {
            public final Entry<K, V2> apply(Entry<K, V1> entry) {
                return Maps.transformEntry(entryTransformer, entry);
            }
        };
    }

    static <K, V1, V2> EntryTransformer<K, V1, V2> asEntryTransformer(final Function<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return new EntryTransformer<K, V1, V2>() {
            public final V2 transformEntry(K k, V1 v1) {
                return function.apply(v1);
            }
        };
    }

    static <K, V> Iterator<Entry<K, V>> asMapEntryIterator(Set<K> set, final Function<? super K, V> function) {
        return new TransformedIterator<K, Entry<K, V>>(set.iterator()) {
            /* Access modifiers changed, original: final */
            public final Entry<K, V> transform(K k) {
                return Maps.immutableEntry(k, function.apply(k));
            }
        };
    }

    static <K, V1, V2> Function<V1, V2> asValueToValueFunction(final EntryTransformer<? super K, V1, V2> entryTransformer, final K k) {
        Preconditions.checkNotNull(entryTransformer);
        return new Function<V1, V2>() {
            public final V2 apply(V1 v1) {
                return entryTransformer.transformEntry(k, v1);
            }
        };
    }

    static int capacity(int i) {
        if (i >= 3) {
            return i < AudioPlayer.INFINITY_LOOP_COUNT ? (int) ((((float) i) / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        } else {
            CollectPreconditions.checkNonnegative(i, "expectedSize");
            return i + 1;
        }
    }

    static boolean equalsImpl(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    private static <K, V> Map<K, V> filterFiltered(AbstractFilteredMap<K, V> abstractFilteredMap, Predicate<? super Entry<K, V>> predicate) {
        return new FilteredEntryMap(abstractFilteredMap.unfiltered, Predicates.and(abstractFilteredMap.predicate, predicate));
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> map, Predicate<? super K> predicate) {
        Preconditions.checkNotNull(predicate);
        Predicate keyPredicateOnEntries = keyPredicateOnEntries(predicate);
        return map instanceof AbstractFilteredMap ? filterFiltered((AbstractFilteredMap) map, keyPredicateOnEntries) : new FilteredKeyMap((Map) Preconditions.checkNotNull(map), predicate, keyPredicateOnEntries);
    }

    public static <K, V> Entry<K, V> immutableEntry(K k, V v) {
        return new ImmutableEntry(k, v);
    }

    public static <K extends Enum<K>, V> ImmutableMap<K, V> immutableEnumMap(Map<K, ? extends V> map) {
        if (map instanceof ImmutableEnumMap) {
            return (ImmutableEnumMap) map;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ImmutableMap.of();
        }
        Entry entry = (Entry) it.next();
        Enum enumR = (Enum) entry.getKey();
        Object value = entry.getValue();
        CollectPreconditions.checkEntryNotNull(enumR, value);
        EnumMap enumMap = new EnumMap(enumR.getDeclaringClass());
        while (true) {
            enumMap.put(enumR, value);
            if (!it.hasNext()) {
                return ImmutableEnumMap.asImmutable(enumMap);
            }
            entry = (Entry) it.next();
            enumR = (Enum) entry.getKey();
            value = entry.getValue();
            CollectPreconditions.checkEntryNotNull(enumR, value);
        }
    }

    static <E> ImmutableMap<E, Integer> indexMap(Collection<E> collection) {
        Builder builder = new Builder(collection.size());
        int i = 0;
        for (E put : collection) {
            int i2 = i + 1;
            builder.put(put, Integer.valueOf(i));
            i = i2;
        }
        return builder.build();
    }

    static <K> Function<Entry<K, ?>, K> keyFunction() {
        return EntryFunction.KEY;
    }

    static <K, V> Iterator<K> keyIterator(Iterator<Entry<K, V>> it) {
        return new TransformedIterator<Entry<K, V>, K>(it) {
            /* Access modifiers changed, original: final */
            public final K transform(Entry<K, V> entry) {
                return entry.getKey();
            }
        };
    }

    static <K> Predicate<Entry<K, ?>> keyPredicateOnEntries(Predicate<? super K> predicate) {
        return Predicates.compose(predicate, keyFunction());
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> cls) {
        return new EnumMap((Class) Preconditions.checkNotNull(cls));
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap();
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        return new HashMap(map);
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i) {
        return new HashMap(capacity(i));
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i) {
        return new LinkedHashMap(capacity(i));
    }

    static boolean safeContainsKey(Map<?, ?> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V safeGet(Map<?, V> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V safeRemove(Map<?, V> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterable<K> iterable, Function<? super K, V> function) {
        return toMap(iterable.iterator(), (Function) function);
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterator<K> it, Function<? super K, V> function) {
        Preconditions.checkNotNull(function);
        Map newLinkedHashMap = newLinkedHashMap();
        while (it.hasNext()) {
            Object next = it.next();
            newLinkedHashMap.put(next, function.apply(next));
        }
        return ImmutableMap.copyOf(newLinkedHashMap);
    }

    static String toStringImpl(Map<?, ?> map) {
        StringBuilder newStringBuilderForCollection = Collections2.newStringBuilderForCollection(map.size());
        newStringBuilderForCollection.append('{');
        Object obj = 1;
        for (Entry entry : map.entrySet()) {
            if (obj == null) {
                newStringBuilderForCollection.append(ppy.d);
            }
            obj = null;
            newStringBuilderForCollection.append(entry.getKey());
            newStringBuilderForCollection.append('=');
            newStringBuilderForCollection.append(entry.getValue());
        }
        newStringBuilderForCollection.append('}');
        return newStringBuilderForCollection.toString();
    }

    public static <K, V1, V2> Map<K, V2> transformEntries(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesMap(map, entryTransformer);
    }

    static <V2, K, V1> Entry<K, V2> transformEntry(final EntryTransformer<? super K, ? super V1, V2> entryTransformer, final Entry<K, V1> entry) {
        Preconditions.checkNotNull(entryTransformer);
        Preconditions.checkNotNull(entry);
        return new AbstractMapEntry<K, V2>() {
            public final K getKey() {
                return entry.getKey();
            }

            public final V2 getValue() {
                return entryTransformer.transformEntry(entry.getKey(), entry.getValue());
            }
        };
    }

    public static <K, V1, V2> Map<K, V2> transformValues(Map<K, V1> map, Function<? super V1, V2> function) {
        return transformEntries(map, asEntryTransformer(function));
    }

    static <K, V> Entry<K, V> unmodifiableEntry(final Entry<? extends K, ? extends V> entry) {
        Preconditions.checkNotNull(entry);
        return new AbstractMapEntry<K, V>() {
            public final K getKey() {
                return entry.getKey();
            }

            public final V getValue() {
                return entry.getValue();
            }
        };
    }

    static <K, V> UnmodifiableIterator<Entry<K, V>> unmodifiableEntryIterator(final Iterator<Entry<K, V>> it) {
        return new UnmodifiableIterator<Entry<K, V>>() {
            public final boolean hasNext() {
                return it.hasNext();
            }

            public final Entry<K, V> next() {
                return Maps.unmodifiableEntry((Entry) it.next());
            }
        };
    }

    static <V> Function<Entry<?, V>, V> valueFunction() {
        return EntryFunction.VALUE;
    }

    static <K, V> Iterator<V> valueIterator(Iterator<Entry<K, V>> it) {
        return new TransformedIterator<Entry<K, V>, V>(it) {
            /* Access modifiers changed, original: final */
            public final V transform(Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    static <V> Predicate<Entry<?, V>> valuePredicateOnEntries(Predicate<? super V> predicate) {
        return Predicates.compose(predicate, valueFunction());
    }
}
