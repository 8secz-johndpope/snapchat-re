package defpackage;

import java.util.List;

/* renamed from: fxd */
public final class fxd<T> implements aipq<T> {
    private final List<aipq<T>> a;

    public fxd(List<aipq<T>> list) {
        this.a = list;
    }

    public final void a(T t) {
        for (aipq a : this.a) {
            try {
                a.a(t);
                return;
            } catch (Exception unused) {
            }
        }
        throw new fwz(t.getClass());
    }
}
