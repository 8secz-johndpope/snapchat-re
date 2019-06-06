package defpackage;

import java.util.Iterator;

/* renamed from: zni */
public final class zni<T> implements akdh, Iterator<T> {
    private int a;
    private final znh<T> b;

    public zni(znh<T> znh) {
        akcr.b(znh, "seekable");
        this.b = znh;
    }

    public final boolean hasNext() {
        return this.a < this.b.a();
    }

    public final T next() {
        znh znh = this.b;
        int i = this.a;
        this.a = i + 1;
        return znh.a(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
