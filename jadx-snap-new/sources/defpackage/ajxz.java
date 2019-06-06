package defpackage;

import java.util.Collection;

/* renamed from: ajxz */
public abstract class ajxz<E> implements akdh, Collection<E> {

    /* renamed from: ajxz$a */
    static final class a extends akcs implements akbl<E, CharSequence> {
        private /* synthetic */ ajxz a;

        a(ajxz ajxz) {
            this.a = ajxz;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return obj == this.a ? "(this Collection)" : String.valueOf(obj);
        }
    }

    protected ajxz() {
    }

    public abstract int a();

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (!isEmpty()) {
            for (Object a : this) {
                if (akcr.a(a, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
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

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return a();
    }

    public Object[] toArray() {
        return akcn.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        akcr.b(tArr, "array");
        Object[] a = akcn.a(this, tArr);
        if (a != null) {
            return a;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public String toString() {
        return ajyu.a((Iterable) this, (CharSequence) ppy.d, (CharSequence) "[", (CharSequence) "]", 0, null, (akbl) new a(this), 24);
    }
}
