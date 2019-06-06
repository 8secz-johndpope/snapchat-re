package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ajug */
public final class ajug<T> extends AtomicInteger implements ajgc<T> {
    private T a;
    private akux<? super T> b;

    public ajug(akux<? super T> akux, T t) {
        this.b = akux;
        this.a = t;
    }

    public final int a(int i) {
        return i & 1;
    }

    public final void a(long j) {
        if (ajui.b(j) && compareAndSet(0, 1)) {
            akux akux = this.b;
            akux.a(this.a);
            if (get() != 2) {
                akux.a();
            }
        }
    }

    public final void b() {
        lazySet(2);
    }

    public final void clear() {
        lazySet(1);
    }

    public final boolean isEmpty() {
        return get() != 0;
    }

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.a;
    }
}
