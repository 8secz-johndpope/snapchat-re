package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajsz */
public final class ajsz<T> implements ajge<T> {
    private final AtomicReference<a<T>> a = new AtomicReference();
    private final AtomicReference<a<T>> b = new AtomicReference();

    /* renamed from: ajsz$a */
    static final class a<E> extends AtomicReference<a<E>> {
        private E a;

        a() {
        }

        a(E e) {
            this.a = e;
        }

        public final E a() {
            Object obj = this.a;
            this.a = null;
            return obj;
        }
    }

    public ajsz() {
        a aVar = new a();
        b(aVar);
        a(aVar);
    }

    private a<T> a() {
        return (a) this.a.get();
    }

    private a<T> a(a<T> aVar) {
        return (a) this.a.getAndSet(aVar);
    }

    private void b(a<T> aVar) {
        this.b.lazySet(aVar);
    }

    public final void clear() {
        while (poll() != null) {
            if (isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        return ((a) this.b.get()) == a();
    }

    public final boolean offer(T t) {
        if (t != null) {
            a aVar = new a(t);
            a(aVar).lazySet(aVar);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final T poll() {
        a aVar = (a) this.b.get();
        a aVar2 = (a) aVar.get();
        if (aVar2 == null) {
            if (aVar == a()) {
                return null;
            }
            do {
                aVar2 = (a) aVar.get();
            } while (aVar2 == null);
        }
        Object a = aVar2.a();
        b(aVar2);
        return a;
    }
}
