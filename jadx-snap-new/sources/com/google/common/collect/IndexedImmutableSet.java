package com.google.common.collect;

abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    IndexedImmutableSet() {
    }

    /* Access modifiers changed, original: 0000 */
    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    /* Access modifiers changed, original: 0000 */
    public ImmutableList<E> createAsList() {
        return new ImmutableList<E>() {
            public E get(int i) {
                return IndexedImmutableSet.this.get(i);
            }

            /* Access modifiers changed, original: 0000 */
            public boolean isPartialView() {
                return IndexedImmutableSet.this.isPartialView();
            }

            public int size() {
                return IndexedImmutableSet.this.size();
            }
        };
    }

    public abstract E get(int i);

    public UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }
}
