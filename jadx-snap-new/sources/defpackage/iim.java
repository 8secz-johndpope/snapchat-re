package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: iim */
public final class iim<T> {
    private WeakReference<T> a;

    public iim(T t) {
        this.a = new WeakReference(t);
    }

    public final T a(aken<?> aken) {
        akcr.b(aken, "property");
        return this.a.get();
    }

    public final void a(aken<?> aken, T t) {
        akcr.b(aken, "property");
        this.a = new WeakReference(t);
    }
}
