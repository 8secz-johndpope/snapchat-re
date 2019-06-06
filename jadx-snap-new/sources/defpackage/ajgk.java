package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: ajgk */
public abstract class ajgk<T> extends CountDownLatch implements ajdv<T>, ajej {
    T a;
    Throwable b;
    ajej c;
    private volatile boolean d;

    public ajgk() {
        super(1);
    }

    public final void a() {
        countDown();
    }

    public final void a(ajej ajej) {
        this.c = ajej;
        if (this.d) {
            ajej.dispose();
        }
    }

    public final T b() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                dispose();
                throw ajur.a(e);
            }
        }
        Throwable e2 = this.b;
        if (e2 == null) {
            return this.a;
        }
        throw ajur.a(e2);
    }

    public final void dispose() {
        this.d = true;
        ajej ajej = this.c;
        if (ajej != null) {
            ajej.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.d;
    }
}
