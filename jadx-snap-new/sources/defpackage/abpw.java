package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: abpw */
final class abpw<E> implements Set<E> {
    private final Set<E> a = Collections.newSetFromMap(new WeakHashMap());

    abpw() {
    }

    public final boolean add(E e) {
        return this.a.add(e);
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return this.a.addAll(collection);
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.a.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.a.iterator();
    }

    public final boolean remove(Object obj) {
        return this.a.remove(obj);
    }

    public final boolean removeAll(Collection<?> collection) {
        return this.a.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return this.a.retainAll(collection);
    }

    public final int size() {
        return this.a.size();
    }

    public final Object[] toArray() {
        return this.a.toArray();
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.a.toArray(tArr);
    }
}
