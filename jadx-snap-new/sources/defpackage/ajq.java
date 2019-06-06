package defpackage;

import java.util.Queue;

/* renamed from: ajq */
abstract class ajq<T extends ajx> {
    private final Queue<T> a = aps.a(20);

    ajq() {
    }

    public abstract T a();

    public final void a(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final T b() {
        ajx ajx = (ajx) this.a.poll();
        return ajx == null ? a() : ajx;
    }
}
