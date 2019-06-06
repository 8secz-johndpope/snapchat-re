package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajub */
public class ajub<T> extends AtomicInteger implements ajdh<T>, akuy {
    private akux<? super T> a;
    private ajul b = new ajul();
    private AtomicLong c = new AtomicLong();
    private AtomicReference<akuy> d = new AtomicReference();
    private AtomicBoolean e = new AtomicBoolean();
    private volatile boolean f;

    public ajub(akux<? super T> akux) {
        this.a = akux;
    }

    public final void a() {
        this.f = true;
        ajus.a(this.a, (AtomicInteger) this, this.b);
    }

    public final void a(long j) {
        if (j <= 0) {
            b();
            a(new IllegalArgumentException("§3.9 violated: positive request amount required but it was ".concat(String.valueOf(j))));
            return;
        }
        ajui.a(this.d, this.c, j);
    }

    public final void a(akuy akuy) {
        if (this.e.compareAndSet(false, true)) {
            this.a.a((akuy) this);
            ajui.a(this.d, this.c, akuy);
            return;
        }
        akuy.b();
        b();
        a(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public void a(T t) {
        ajus.a(this.a, (Object) t, (AtomicInteger) this, this.b);
    }

    public final void a(Throwable th) {
        this.f = true;
        ajus.a(this.a, th, (AtomicInteger) this, this.b);
    }

    public final void b() {
        if (!this.f) {
            ajui.a(this.d);
        }
    }
}
