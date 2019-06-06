package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: akfj */
public final class akfj<T> implements akeu<T>, akez<T> {
    final akez<T> a;
    final int b;

    /* renamed from: akfj$a */
    public static final class a implements akdh, Iterator<T> {
        private int a;
        private final Iterator<T> b;
        private /* synthetic */ akfj c;

        a(akfj akfj) {
            this.c = akfj;
            this.a = akfj.b;
            this.b = akfj.a.iterator();
        }

        public final boolean hasNext() {
            return this.a > 0 && this.b.hasNext();
        }

        public final T next() {
            int i = this.a;
            if (i != 0) {
                this.a = i - 1;
                return this.b.next();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public akfj(akez<? extends T> akez, int i) {
        akcr.b(akez, "sequence");
        this.a = akez;
        this.b = i;
        if ((this.b >= 0 ? 1 : null) == null) {
            StringBuilder stringBuilder = new StringBuilder("count must be non-negative, but was ");
            stringBuilder.append(this.b);
            stringBuilder.append('.');
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
    }

    public final akez<T> a(int i) {
        int i2 = this.b;
        return i >= i2 ? akev.a : new akfi(this.a, i, i2);
    }

    public final akez<T> b(int i) {
        return i >= this.b ? this : new akfj(this.a, i);
    }

    public final Iterator<T> iterator() {
        return new a(this);
    }
}
