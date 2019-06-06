package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: krx */
public final class krx<T> extends AtomicReference<ajej> implements ajdz<T> {
    private final ajfb<T> a;
    private final ajfb<Throwable> b;
    private final ajei c;

    public krx(ajfb<T> ajfb, ajfb<Throwable> ajfb2, ajei ajei) {
        akcr.b(ajfb, "onSuccess");
        akcr.b(ajfb2, "onError");
        akcr.b(ajei, "compositeDisposable");
        this.a = ajfb;
        this.b = ajfb2;
        this.c = ajei;
    }

    private final void a() {
        ajej ajej = (ajej) getAndSet(null);
        if (ajej != null) {
            this.c.b(ajej);
        }
    }

    public final void a(ajej ajej) {
        akcr.b(ajej, "disposable");
        if (((ajej) getAndSet(ajej)) == null) {
            ajvv.a(this.c, ajej);
            return;
        }
        throw new IllegalStateException("Doesn't support multiple subscriptions, already subscribed.".toString());
    }

    public final void a(Throwable th) {
        akcr.b(th, "e");
        a();
        this.b.accept(th);
    }

    public final void b_(T t) {
        a();
        this.a.accept(t);
    }
}
