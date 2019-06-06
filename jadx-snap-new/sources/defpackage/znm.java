package defpackage;

import java.util.Iterator;

/* renamed from: znm */
public final class znm<T> implements znh<T> {
    private final znh<T> a;
    private final znh<T> b;
    private final int c;

    public znm(znh<T> znh, znh<T> znh2, int i) {
        akcr.b(znh, "content");
        akcr.b(znh2, "splice");
        this.a = znh;
        this.b = znh2;
        this.c = i;
    }

    public final int a() {
        return this.a.a() + this.b.a();
    }

    public final T a(int i) {
        int i2 = this.c;
        if (i < i2) {
            return i < this.a.a() ? this.a.a(i) : this.b.a(i - this.a.a());
        } else {
            i2 = Math.min(i2, this.a.a());
            if (this.c >= this.a.a()) {
                return this.b.a(i - this.a.a());
            }
            i2 = i - i2;
            return i2 < this.b.a() ? this.b.a(i2) : this.a.a(i - this.b.a());
        }
    }

    public final Iterator<T> iterator() {
        return new zni(this);
    }
}
