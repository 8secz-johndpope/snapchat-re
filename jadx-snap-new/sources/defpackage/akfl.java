package defpackage;

import java.util.Iterator;

/* renamed from: akfl */
public final class akfl<T, R> implements akez<R> {
    public final akez<T> a;
    public final akbl<T, R> b;

    /* renamed from: akfl$a */
    public static final class a implements akdh, Iterator<R> {
        private final Iterator<T> a;
        private /* synthetic */ akfl b;

        a(akfl akfl) {
            this.b = akfl;
            this.a = akfl.a.iterator();
        }

        public final boolean hasNext() {
            return this.a.hasNext();
        }

        public final R next() {
            return this.b.b.invoke(this.a.next());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public akfl(akez<? extends T> akez, akbl<? super T, ? extends R> akbl) {
        akcr.b(akez, "sequence");
        akcr.b(akbl, "transformer");
        this.a = akez;
        this.b = akbl;
    }

    public final Iterator<R> iterator() {
        return new a(this);
    }
}
