package com.google.protobuf;

import com.google.protobuf.FieldSet.FieldDescriptorLite;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private List<Entry> entryList;
    private boolean isImmutable;
    private volatile EntrySet lazyEntrySet;
    private final int maxArraySize;
    private Map<K, V> overflowEntries;

    static class EmptySet {
        private static final Iterable<Object> ITERABLE = new Iterable<Object>() {
            public final Iterator<Object> iterator() {
                return EmptySet.ITERATOR;
            }
        };
        private static final Iterator<Object> ITERATOR = new Iterator<Object>() {
            public final boolean hasNext() {
                return false;
            }

            public final Object next() {
                throw new NoSuchElementException();
            }

            public final void remove() {
                throw new UnsupportedOperationException();
            }
        };

        private EmptySet() {
        }

        static <T> Iterable<T> iterable() {
            return ITERABLE;
        }
    }

    class Entry implements Comparable<Entry>, java.util.Map.Entry<K, V> {
        private final K key;
        private V value;

        Entry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        Entry(SmallSortedMap smallSortedMap, java.util.Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean equals(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        public int compareTo(Entry entry) {
            return getKey().compareTo(entry.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public int hashCode() {
            Comparable comparable = this.key;
            int i = 0;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.value;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            SmallSortedMap.this.checkMutable();
            Object obj = this.value;
            this.value = v;
            return obj;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.key);
            stringBuilder.append("=");
            stringBuilder.append(this.value);
            return stringBuilder.toString();
        }
    }

    class EntryIterator implements Iterator<java.util.Map.Entry<K, V>> {
        private Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;

        private EntryIterator() {
            this.pos = -1;
        }

        /* synthetic */ EntryIterator(SmallSortedMap smallSortedMap, AnonymousClass1 anonymousClass1) {
            this();
        }

        private Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = SmallSortedMap.this.overflowEntries.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }

        public boolean hasNext() {
            return this.pos + 1 < SmallSortedMap.this.entryList.size() || getOverflowIterator().hasNext();
        }

        public java.util.Map.Entry<K, V> next() {
            this.nextCalledBeforeRemove = true;
            int i = this.pos + 1;
            this.pos = i;
            return (java.util.Map.Entry) (i < SmallSortedMap.this.entryList.size() ? SmallSortedMap.this.entryList.get(this.pos) : getOverflowIterator().next());
        }

        public void remove() {
            if (this.nextCalledBeforeRemove) {
                this.nextCalledBeforeRemove = false;
                SmallSortedMap.this.checkMutable();
                if (this.pos < SmallSortedMap.this.entryList.size()) {
                    SmallSortedMap smallSortedMap = SmallSortedMap.this;
                    int i = this.pos;
                    this.pos = i - 1;
                    smallSortedMap.removeArrayEntryAt(i);
                    return;
                }
                getOverflowIterator().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    class EntrySet extends AbstractSet<java.util.Map.Entry<K, V>> {
        private EntrySet() {
        }

        /* synthetic */ EntrySet(SmallSortedMap smallSortedMap, AnonymousClass1 anonymousClass1) {
            this();
        }

        public boolean add(java.util.Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            SmallSortedMap.this.clear();
        }

        public boolean contains(Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            obj = entry.getValue();
            return obj2 == obj || (obj2 != null && obj2.equals(obj));
        }

        public Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new EntryIterator(SmallSortedMap.this, null);
        }

        public boolean remove(Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return SmallSortedMap.this.size();
        }
    }

    private SmallSortedMap(int i) {
        this.maxArraySize = i;
        this.entryList = Collections.emptyList();
        this.overflowEntries = Collections.emptyMap();
    }

    /* synthetic */ SmallSortedMap(int i, AnonymousClass1 anonymousClass1) {
        this(i);
    }

    private int binarySearchInArray(K k) {
        int compareTo;
        int size = this.entryList.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo(((Entry) this.entryList.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        compareTo = 0;
        while (compareTo <= size) {
            int i = (compareTo + size) / 2;
            int compareTo2 = k.compareTo(((Entry) this.entryList.get(i)).getKey());
            if (compareTo2 < 0) {
                size = i - 1;
            } else if (compareTo2 <= 0) {
                return i;
            } else {
                compareTo = i + 1;
            }
        }
        return -(compareTo + 1);
    }

    private void checkMutable() {
        if (this.isImmutable) {
            throw new UnsupportedOperationException();
        }
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (this.entryList.isEmpty() && !(this.entryList instanceof ArrayList)) {
            this.entryList = new ArrayList(this.maxArraySize);
        }
    }

    private SortedMap<K, V> getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            this.overflowEntries = new TreeMap();
        }
        return (SortedMap) this.overflowEntries;
    }

    static <FieldDescriptorType extends FieldDescriptorLite<FieldDescriptorType>> SmallSortedMap<FieldDescriptorType, Object> newFieldMap(int i) {
        return new SmallSortedMap<FieldDescriptorType, Object>(i) {
            public final void makeImmutable() {
                if (!isImmutable()) {
                    java.util.Map.Entry arrayEntryAt;
                    for (int i = 0; i < getNumArrayEntries(); i++) {
                        arrayEntryAt = getArrayEntryAt(i);
                        if (((FieldDescriptorLite) arrayEntryAt.getKey()).isRepeated()) {
                            arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                        }
                    }
                    for (java.util.Map.Entry arrayEntryAt2 : getOverflowEntries()) {
                        if (((FieldDescriptorLite) arrayEntryAt2.getKey()).isRepeated()) {
                            arrayEntryAt2.setValue(Collections.unmodifiableList((List) arrayEntryAt2.getValue()));
                        }
                    }
                }
                super.makeImmutable();
            }

            public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((FieldDescriptorLite) obj, obj2);
            }
        };
    }

    static <K extends Comparable<K>, V> SmallSortedMap<K, V> newInstanceForTest(int i) {
        return new SmallSortedMap(i);
    }

    private V removeArrayEntryAt(int i) {
        checkMutable();
        Object value = ((Entry) this.entryList.remove(i)).getValue();
        if (!this.overflowEntries.isEmpty()) {
            Iterator it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new Entry(this, (java.util.Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        checkMutable();
        if (!this.entryList.isEmpty()) {
            this.entryList.clear();
        }
        if (!this.overflowEntries.isEmpty()) {
            this.overflowEntries.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return binarySearchInArray(comparable) >= 0 || this.overflowEntries.containsKey(comparable);
    }

    public Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new EntrySet(this, null);
        }
        return this.lazyEntrySet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size != smallSortedMap.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != smallSortedMap.getNumArrayEntries()) {
            return entrySet().equals(smallSortedMap.entrySet());
        }
        for (int i = 0; i < numArrayEntries; i++) {
            if (!getArrayEntryAt(i).equals(smallSortedMap.getArrayEntryAt(i))) {
                return false;
            }
        }
        return numArrayEntries != size ? this.overflowEntries.equals(smallSortedMap.overflowEntries) : true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        return binarySearchInArray >= 0 ? ((Entry) this.entryList.get(binarySearchInArray)).getValue() : this.overflowEntries.get(comparable);
    }

    public java.util.Map.Entry<K, V> getArrayEntryAt(int i) {
        return (java.util.Map.Entry) this.entryList.get(i);
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public Iterable<java.util.Map.Entry<K, V>> getOverflowEntries() {
        return this.overflowEntries.isEmpty() ? EmptySet.iterable() : this.overflowEntries.entrySet();
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < getNumArrayEntries(); i2++) {
            i += ((Entry) this.entryList.get(i2)).hashCode();
        }
        return getNumOverflowEntries() > 0 ? i + this.overflowEntries.hashCode() : i;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void makeImmutable() {
        if (!this.isImmutable) {
            this.overflowEntries = this.overflowEntries.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.overflowEntries);
            this.isImmutable = true;
        }
    }

    public V put(K k, V v) {
        checkMutable();
        int binarySearchInArray = binarySearchInArray(k);
        if (binarySearchInArray >= 0) {
            return ((Entry) this.entryList.get(binarySearchInArray)).setValue(v);
        }
        ensureEntryArrayMutable();
        binarySearchInArray = -(binarySearchInArray + 1);
        if (binarySearchInArray >= this.maxArraySize) {
            return getOverflowEntriesMutable().put(k, v);
        }
        int size = this.entryList.size();
        int i = this.maxArraySize;
        if (size == i) {
            Entry entry = (Entry) this.entryList.remove(i - 1);
            getOverflowEntriesMutable().put(entry.getKey(), entry.getValue());
        }
        this.entryList.add(binarySearchInArray, new Entry(k, v));
        return null;
    }

    public V remove(Object obj) {
        checkMutable();
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        return binarySearchInArray >= 0 ? removeArrayEntryAt(binarySearchInArray) : this.overflowEntries.isEmpty() ? null : this.overflowEntries.remove(comparable);
    }

    public int size() {
        return this.entryList.size() + this.overflowEntries.size();
    }
}
