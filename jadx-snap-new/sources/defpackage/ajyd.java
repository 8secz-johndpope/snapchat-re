package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: ajyd */
final class ajyd<T> implements akdh, Collection<T> {
    private final T[] a;
    private final boolean b;

    public ajyd(T[] tArr, boolean z) {
        akcr.b(tArr, "values");
        this.a = tArr;
        this.b = z;
    }

    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        return ajyi.a(this.a, obj);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        akcr.b(collection, "elements");
        Iterable<Object> iterable = collection;
        if (!((Collection) iterable).isEmpty()) {
            for (Object contains : iterable) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    public final Iterator<T> iterator() {
        return akci.a(this.a);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return this.a.length;
    }

    public final Object[] toArray() {
        Object[] objArr = this.a;
        boolean z = this.b;
        akcr.b(objArr, "receiver$0");
        if (z && akcr.a(objArr.getClass(), (Object) Object[].class)) {
            return objArr;
        }
        Object copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        akcr.a(copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }

    public final <T> T[] toArray(T[] tArr) {
        return akcn.a(this, tArr);
    }
}
