package defpackage;

import java.util.Iterator;

/* renamed from: znl */
public final class znl<T> implements znh<T> {
    private final ji<T> a = new ji();
    private final znh<T> b;

    public znl(znh<T> znh) {
        akcr.b(znh, "source");
        this.b = znh;
    }

    public final int a() {
        return this.b.a();
    }

    public final T a(int i) {
        return this.a.a(i, this.b.a(i));
    }

    public final void a(int i, T t) {
        if (i < a()) {
            this.a.b(i, t);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zni(this);
    }
}
