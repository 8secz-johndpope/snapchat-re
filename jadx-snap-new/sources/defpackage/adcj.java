package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: adcj */
public final class adcj<T> implements Iterator<T> {
    private final adcf<T> a;
    private int b;
    private int c;

    public adcj(adcf<T> adcf) {
        this.a = adcf;
    }

    public final Iterator<T> a() {
        this.b = 0;
        this.c = this.a.b;
        return this;
    }

    public final boolean hasNext() {
        return this.b < this.a.b;
    }

    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        } else if (this.a.b == this.c) {
            Object[] objArr = this.a.a;
            int i = this.b;
            this.b = i + 1;
            return objArr[i];
        } else {
            throw new ConcurrentModificationException("Array was modified during the iteration.");
        }
    }

    public final void remove() {
        if (this.c != 0) {
            adcf adcf;
            if (this.b > 0) {
                adcf = this.a;
                adcf.b(adcf.a[this.b - 1]);
                this.b--;
            } else {
                adcf = this.a;
                adcf.b(adcf.a[0]);
            }
            this.c--;
            return;
        }
        throw new NoSuchElementException("There's nothing to remove.");
    }
}
