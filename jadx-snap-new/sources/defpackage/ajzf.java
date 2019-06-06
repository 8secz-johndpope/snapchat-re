package defpackage;

import java.util.Iterator;

/* renamed from: ajzf */
public final class ajzf<T> implements akdh, Iterator<ajzd<? extends T>> {
    private int a;
    private final Iterator<T> b;

    public ajzf(Iterator<? extends T> it) {
        akcr.b(it, "iterator");
        this.b = it;
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final /* synthetic */ Object next() {
        int i = this.a;
        this.a = i + 1;
        if (i < 0) {
            ajym.a();
        }
        return new ajzd(i, this.b.next());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
