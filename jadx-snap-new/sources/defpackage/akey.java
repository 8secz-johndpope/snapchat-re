package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: akey */
final class akey<T> implements akez<T> {
    final akbk<T> a;
    final akbl<T, T> b;

    /* renamed from: akey$a */
    public static final class a implements akdh, Iterator<T> {
        private T a;
        private int b = -2;
        private /* synthetic */ akey c;

        a(akey akey) {
            this.c = akey;
        }

        private final void a() {
            Object invoke;
            if (this.b == -2) {
                invoke = this.c.a.invoke();
            } else {
                akbl akbl = this.c.b;
                Object obj = this.a;
                if (obj == null) {
                    akcr.a();
                }
                invoke = akbl.invoke(obj);
            }
            this.a = invoke;
            this.b = this.a == null ? 0 : 1;
        }

        public final boolean hasNext() {
            if (this.b < 0) {
                a();
            }
            return this.b == 1;
        }

        public final T next() {
            if (this.b < 0) {
                a();
            }
            if (this.b != 0) {
                Object obj = this.a;
                if (obj != null) {
                    this.b = -1;
                    return obj;
                }
                throw new ajxt("null cannot be cast to non-null type T");
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public akey(akbk<? extends T> akbk, akbl<? super T, ? extends T> akbl) {
        akcr.b(akbk, "getInitialValue");
        akcr.b(akbl, "getNextValue");
        this.a = akbk;
        this.b = akbl;
    }

    public final Iterator<T> iterator() {
        return new a(this);
    }
}
