package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: ajgm */
public final class ajgm<T> extends CountDownLatch implements ajcz, ajdl<T>, ajdz<T> {
    private T a;
    private Throwable b;
    private ajej c;
    private volatile boolean d;

    public ajgm() {
        super(1);
    }

    private void d() {
        this.d = true;
        ajej ajej = this.c;
        if (ajej != null) {
            ajej.dispose();
        }
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

    public final void a(Throwable th) {
        this.b = th;
        countDown();
    }

    public final T b() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                d();
                throw ajur.a(e);
            }
        }
        Throwable e2 = this.b;
        if (e2 == null) {
            return this.a;
        }
        throw ajur.a(e2);
    }

    public final void b_(T t) {
        this.a = t;
        countDown();
    }

    public final Throwable c() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                d();
                return e;
            }
        }
        return this.b;
    }
}
