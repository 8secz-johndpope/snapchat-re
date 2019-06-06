package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: akew */
public final class akew<T> implements akez<T> {
    final akez<T> a;
    final boolean b;
    final akbl<T, Boolean> c;

    /* renamed from: akew$a */
    public static final class a implements akdh, Iterator<T> {
        private final Iterator<T> a;
        private int b = -1;
        private T c;
        private /* synthetic */ akew d;

        a(akew akew) {
            this.d = akew;
            this.a = akew.a.iterator();
        }

        private final void a() {
            int i;
            while (this.a.hasNext()) {
                Object next = this.a.next();
                if (((Boolean) this.d.c.invoke(next)).booleanValue() == this.d.b) {
                    this.c = next;
                    i = 1;
                    break;
                }
            }
            i = 0;
            this.b = i;
        }

        public final boolean hasNext() {
            if (this.b == -1) {
                a();
            }
            return this.b == 1;
        }

        public final T next() {
            if (this.b == -1) {
                a();
            }
            if (this.b != 0) {
                Object obj = this.c;
                this.c = null;
                this.b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public akew(akez<? extends T> akez, boolean z, akbl<? super T, Boolean> akbl) {
        akcr.b(akez, "sequence");
        akcr.b(akbl, "predicate");
        this.a = akez;
        this.b = z;
        this.c = akbl;
    }

    public final Iterator<T> iterator() {
        return new a(this);
    }
}
