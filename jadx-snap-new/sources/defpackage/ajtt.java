package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajtt */
public final class ajtt<T> extends AtomicReference<akuy> implements ajdh<T>, ajej, akuy {
    private ajfb<? super T> a;
    private ajfb<? super Throwable> b;
    private ajev c;
    private ajfb<? super akuy> d;

    public ajtt(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev, ajfb<? super akuy> ajfb3) {
        this.a = ajfb;
        this.b = ajfb2;
        this.c = ajev;
        this.d = ajfb3;
    }

    public final void a() {
        if (get() != ajui.CANCELLED) {
            lazySet(ajui.CANCELLED);
            try {
                this.c.run();
            } catch (Throwable th) {
                ajep.a(th);
                ajvo.a(th);
            }
        }
    }

    public final void a(long j) {
        ((akuy) get()).a(j);
    }

    public final void a(akuy akuy) {
        if (ajui.a((AtomicReference) this, akuy)) {
            try {
                this.d.accept(this);
            } catch (Throwable th) {
                ajep.a(th);
                akuy.b();
                a(th);
            }
        }
    }

    public final void a(T t) {
        if (!isDisposed()) {
            try {
                this.a.accept(t);
            } catch (Throwable th) {
                ajep.a(th);
                ((akuy) get()).b();
                a(th);
            }
        }
    }

    public final void a(Throwable th) {
        if (get() != ajui.CANCELLED) {
            lazySet(ajui.CANCELLED);
            try {
                this.b.accept(th);
                return;
            } catch (Throwable th2) {
                ajep.a(th2);
                ajvo.a(new ajeo(th, th2));
                return;
            }
        }
        ajvo.a(th);
    }

    public final void b() {
        ajui.a((AtomicReference) this);
    }

    public final void dispose() {
        ajui.a((AtomicReference) this);
    }

    public final boolean isDisposed() {
        return get() == ajui.CANCELLED;
    }
}
