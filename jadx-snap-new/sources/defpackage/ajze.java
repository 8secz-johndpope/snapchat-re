package defpackage;

import java.util.Iterator;

/* renamed from: ajze */
public final class ajze<T> implements akdh, Iterable<ajzd<? extends T>> {
    private final akbk<Iterator<T>> a;

    public ajze(akbk<? extends Iterator<? extends T>> akbk) {
        akcr.b(akbk, "iteratorFactory");
        this.a = akbk;
    }

    public final Iterator<ajzd<T>> iterator() {
        return new ajzf((Iterator) this.a.invoke());
    }
}
