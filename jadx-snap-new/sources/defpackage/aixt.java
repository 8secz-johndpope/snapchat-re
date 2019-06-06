package defpackage;

import java.util.HashSet;

/* renamed from: aixt */
abstract class aixt<T> {
    private final HashSet<T> a = new HashSet();

    aixt() {
    }

    /* Access modifiers changed, original: final */
    public final void a(T t, boolean z) {
        int size = this.a.size();
        if (z) {
            this.a.add(t);
            if (size == 0) {
                b();
            }
        } else if (this.a.remove(t) && size == 1) {
            c();
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return !this.a.isEmpty();
    }

    public abstract void b();

    public abstract void c();
}
