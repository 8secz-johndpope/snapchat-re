package defpackage;

import java.util.Iterator;

/* renamed from: ajzg */
public abstract class ajzg implements akdh, Iterator<Integer> {
    public abstract int a();

    public /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
