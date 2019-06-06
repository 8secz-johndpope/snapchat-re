package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class FilteredEntryMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {
    final Predicate<? super Entry<K, V>> predicate;
    final Multimap<K, V> unfiltered;

    class AsMap extends ViewCachingAbstractMap<K, Collection<V>> {
        AsMap() {
        }

        public void clear() {
            FilteredEntryMultimap.this.clear();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* Access modifiers changed, original: 0000 */
        public Set<Entry<K, Collection<V>>> createEntrySet() {
            return new EntrySet<K, Collection<V>>() {
                public Iterator<Entry<K, Collection<V>>> iterator() {
                    return new AbstractIterator<Entry<K, Collection<V>>>() {
                        final Iterator<Entry<K, Collection<V>>> backingIterator = FilteredEntryMultimap.this.unfiltered.asMap().entrySet().iterator();

                        /* Access modifiers changed, original: protected */
                        public Entry<K, Collection<V>> computeNext() {
                            while (this.backingIterator.hasNext()) {
                                Entry entry = (Entry) this.backingIterator.next();
                                Object key = entry.getKey();
                                Collection filterCollection = FilteredEntryMultimap.filterCollection((Collection) entry.getValue(), new ValuePredicate(key));
                                if (!filterCollection.isEmpty()) {
                                    return Maps.immutableEntry(key, filterCollection);
                                }
                            }
                            return (Entry) endOfData();
                        }
                    };
                }

                /* Access modifiers changed, original: 0000 */
                public Map<K, Collection<V>> map() {
                    return AsMap.this;
                }

                public boolean removeAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.removeEntriesIf(Predicates.in(collection));
                }

                public boolean retainAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.removeEntriesIf(Predicates.not(Predicates.in(collection)));
                }

                public int size() {
                    return Iterators.size(iterator());
                }
            };
        }

        /* Access modifiers changed, original: 0000 */
        public Set<K> createKeySet() {
            return new KeySet<K, Collection<V>>() {
                public boolean remove(Object obj) {
                    return AsMap.this.remove(obj) != null;
                }

                public boolean removeAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.removeEntriesIf(Maps.keyPredicateOnEntries(Predicates.in(collection)));
                }

                public boolean retainAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.removeEntriesIf(Maps.keyPredicateOnEntries(Predicates.not(Predicates.in(collection))));
                }
            };
        }

        /* Access modifiers changed, original: 0000 */
        public Collection<Collection<V>> createValues() {
            return new Values<K, Collection<V>>() {
                public boolean remove(Object obj) {
                    if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        Iterator it = FilteredEntryMultimap.this.unfiltered.asMap().entrySet().iterator();
                        while (it.hasNext()) {
                            Entry entry = (Entry) it.next();
                            Collection filterCollection = FilteredEntryMultimap.filterCollection((Collection) entry.getValue(), new ValuePredicate(entry.getKey()));
                            if (!filterCollection.isEmpty() && collection.equals(filterCollection)) {
                                if (filterCollection.size() == ((Collection) entry.getValue()).size()) {
                                    it.remove();
                                } else {
                                    filterCollection.clear();
                                }
                                return true;
                            }
                        }
                    }
                    return false;
                }

                public boolean removeAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.removeEntriesIf(Maps.valuePredicateOnEntries(Predicates.in(collection)));
                }

                public boolean retainAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.removeEntriesIf(Maps.valuePredicateOnEntries(Predicates.not(Predicates.in(collection))));
                }
            };
        }

        public Collection<V> get(Object obj) {
            Collection collection = (Collection) FilteredEntryMultimap.this.unfiltered.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            Collection filterCollection = FilteredEntryMultimap.filterCollection(collection, new ValuePredicate(obj));
            return filterCollection.isEmpty() ? null : filterCollection;
        }

        public Collection<V> remove(Object obj) {
            Collection collection = (Collection) FilteredEntryMultimap.this.unfiltered.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList newArrayList = Lists.newArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (FilteredEntryMultimap.this.satisfies(obj, next)) {
                    it.remove();
                    newArrayList.add(next);
                }
            }
            return newArrayList.isEmpty() ? null : FilteredEntryMultimap.this.unfiltered instanceof SetMultimap ? Collections.unmodifiableSet(Sets.newLinkedHashSet(newArrayList)) : Collections.unmodifiableList(newArrayList);
        }
    }

    final class ValuePredicate implements Predicate<V> {
        private final K key;

        ValuePredicate(K k) {
            this.key = k;
        }

        public final boolean apply(V v) {
            return FilteredEntryMultimap.this.satisfies(this.key, v);
        }
    }

    FilteredEntryMultimap(Multimap<K, V> multimap, Predicate<? super Entry<K, V>> predicate) {
        this.unfiltered = (Multimap) Preconditions.checkNotNull(multimap);
        this.predicate = (Predicate) Preconditions.checkNotNull(predicate);
    }

    static <E> Collection<E> filterCollection(Collection<E> collection, Predicate<? super E> predicate) {
        return collection instanceof Set ? Sets.filter((Set) collection, (Predicate) predicate) : Collections2.filter(collection, predicate);
    }

    private boolean satisfies(K k, V v) {
        return this.predicate.apply(Maps.immutableEntry(k, v));
    }

    public void clear() {
        entries().clear();
    }

    public boolean containsKey(Object obj) {
        return asMap().get(obj) != null;
    }

    /* Access modifiers changed, original: 0000 */
    public Map<K, Collection<V>> createAsMap() {
        return new AsMap();
    }

    /* Access modifiers changed, original: 0000 */
    public Collection<Entry<K, V>> createEntries() {
        return filterCollection(this.unfiltered.entries(), this.predicate);
    }

    /* Access modifiers changed, original: 0000 */
    public Set<K> createKeySet() {
        return asMap().keySet();
    }

    /* Access modifiers changed, original: 0000 */
    public Iterator<Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    public Predicate<? super Entry<K, V>> entryPredicate() {
        return this.predicate;
    }

    public Collection<V> get(K k) {
        return filterCollection(this.unfiltered.get(k), new ValuePredicate(k));
    }

    /* Access modifiers changed, original: 0000 */
    public boolean removeEntriesIf(Predicate<? super Entry<K, Collection<V>>> predicate) {
        Iterator it = this.unfiltered.asMap().entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            Object key = entry.getKey();
            Collection filterCollection = filterCollection((Collection) entry.getValue(), new ValuePredicate(key));
            if (!filterCollection.isEmpty() && predicate.apply(Maps.immutableEntry(key, filterCollection))) {
                if (filterCollection.size() == ((Collection) entry.getValue()).size()) {
                    it.remove();
                } else {
                    filterCollection.clear();
                }
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return entries().size();
    }

    public Multimap<K, V> unfiltered() {
        return this.unfiltered;
    }
}
