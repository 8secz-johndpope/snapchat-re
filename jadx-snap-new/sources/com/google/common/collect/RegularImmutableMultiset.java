package com.google.common.collect;

import com.google.common.collect.Multiset.Entry;
import com.google.common.primitives.Ints;

class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    static final RegularImmutableMultiset<Object> EMPTY = new RegularImmutableMultiset(ObjectCountHashMap.create());
    final transient ObjectCountHashMap<E> contents;
    private transient ImmutableSet<E> elementSet;
    private final transient int size;

    final class ElementSet extends IndexedImmutableSet<E> {
        private ElementSet() {
        }

        /* synthetic */ ElementSet(RegularImmutableMultiset regularImmutableMultiset, AnonymousClass1 anonymousClass1) {
            this();
        }

        public final boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        /* Access modifiers changed, original: final */
        public final E get(int i) {
            return RegularImmutableMultiset.this.contents.getKey(i);
        }

        /* Access modifiers changed, original: final */
        public final boolean isPartialView() {
            return true;
        }

        public final int size() {
            return RegularImmutableMultiset.this.contents.size();
        }
    }

    RegularImmutableMultiset(ObjectCountHashMap<E> objectCountHashMap) {
        this.contents = objectCountHashMap;
        long j = 0;
        for (int i = 0; i < objectCountHashMap.size(); i++) {
            j += (long) objectCountHashMap.getValue(i);
        }
        this.size = Ints.saturatedCast(j);
    }

    public int count(Object obj) {
        return this.contents.get(obj);
    }

    public ImmutableSet<E> elementSet() {
        ImmutableSet immutableSet = this.elementSet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet(this, null);
        this.elementSet = elementSet;
        return elementSet;
    }

    /* Access modifiers changed, original: 0000 */
    public Entry<E> getEntry(int i) {
        return this.contents.getEntry(i);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.size;
    }
}
