package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class FilteredKeyMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {
    final Predicate<? super K> keyPredicate;
    final Multimap<K, V> unfiltered;

    class Entries extends ForwardingCollection<Entry<K, V>> {
        Entries() {
        }

        /* Access modifiers changed, original: protected */
        public Collection<Entry<K, V>> delegate() {
            return Collections2.filter(FilteredKeyMultimap.this.unfiltered.entries(), FilteredKeyMultimap.this.entryPredicate());
        }

        public boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                if (FilteredKeyMultimap.this.unfiltered.containsKey(entry.getKey()) && FilteredKeyMultimap.this.keyPredicate.apply(entry.getKey())) {
                    return FilteredKeyMultimap.this.unfiltered.remove(entry.getKey(), entry.getValue());
                }
            }
            return false;
        }
    }

    static class AddRejectingList<K, V> extends ForwardingList<V> {
        final K key;

        AddRejectingList(K k) {
            this.key = k;
        }

        public void add(int i, V v) {
            Preconditions.checkPositionIndex(i, 0);
            StringBuilder stringBuilder = new StringBuilder("Key does not satisfy predicate: ");
            stringBuilder.append(this.key);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public boolean add(V v) {
            add(0, v);
            return true;
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            Preconditions.checkNotNull(collection);
            Preconditions.checkPositionIndex(i, 0);
            StringBuilder stringBuilder = new StringBuilder("Key does not satisfy predicate: ");
            stringBuilder.append(this.key);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        /* Access modifiers changed, original: protected */
        public List<V> delegate() {
            return Collections.emptyList();
        }
    }

    static class AddRejectingSet<K, V> extends ForwardingSet<V> {
        final K key;

        AddRejectingSet(K k) {
            this.key = k;
        }

        public boolean add(V v) {
            StringBuilder stringBuilder = new StringBuilder("Key does not satisfy predicate: ");
            stringBuilder.append(this.key);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public boolean addAll(Collection<? extends V> collection) {
            Preconditions.checkNotNull(collection);
            StringBuilder stringBuilder = new StringBuilder("Key does not satisfy predicate: ");
            stringBuilder.append(this.key);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        /* Access modifiers changed, original: protected */
        public Set<V> delegate() {
            return Collections.emptySet();
        }
    }

    FilteredKeyMultimap(Multimap<K, V> multimap, Predicate<? super K> predicate) {
        this.unfiltered = (Multimap) Preconditions.checkNotNull(multimap);
        this.keyPredicate = (Predicate) Preconditions.checkNotNull(predicate);
    }

    public void clear() {
        keySet().clear();
    }

    public boolean containsKey(Object obj) {
        return this.unfiltered.containsKey(obj) ? this.keyPredicate.apply(obj) : false;
    }

    /* Access modifiers changed, original: 0000 */
    public Map<K, Collection<V>> createAsMap() {
        return Maps.filterKeys(this.unfiltered.asMap(), this.keyPredicate);
    }

    /* Access modifiers changed, original: 0000 */
    public Collection<Entry<K, V>> createEntries() {
        return new Entries();
    }

    /* Access modifiers changed, original: 0000 */
    public Set<K> createKeySet() {
        return Sets.filter(this.unfiltered.keySet(), this.keyPredicate);
    }

    /* Access modifiers changed, original: 0000 */
    public Iterator<Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    public Predicate<? super Entry<K, V>> entryPredicate() {
        return Maps.keyPredicateOnEntries(this.keyPredicate);
    }

    public Collection<V> get(K k) {
        return this.keyPredicate.apply(k) ? this.unfiltered.get(k) : this.unfiltered instanceof SetMultimap ? new AddRejectingSet(k) : new AddRejectingList(k);
    }

    public int size() {
        int i = 0;
        for (Collection size : asMap().values()) {
            i += size.size();
        }
        return i;
    }

    public Multimap<K, V> unfiltered() {
        return this.unfiltered;
    }
}
