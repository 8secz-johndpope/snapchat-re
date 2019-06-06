package defpackage;

import java.util.Iterator;

/* renamed from: zne */
public final class zne<T> implements znh<T> {
    public final int a() {
        return 0;
    }

    public final T a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final Iterator<T> iterator() {
        return new zni(this);
    }
}
