package defpackage;

import java.util.Queue;

/* renamed from: abf */
abstract class abf<T extends abo> {
    private final Queue<T> a = ahm.a(20);

    abf() {
    }

    public abstract T a();

    public final void a(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }

    /* Access modifiers changed, original: final */
    public final T b() {
        abo abo = (abo) this.a.poll();
        return abo == null ? a() : abo;
    }
}
