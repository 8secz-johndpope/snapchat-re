package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ihm */
public final class ihm {
    private long a;
    private long b;
    private AtomicBoolean c = new AtomicBoolean(false);
    private final ihh d;

    public ihm(ihh ihh) {
        akcr.b(ihh, "clock");
        this.d = ihh;
    }

    public final void a() {
        if (this.c.compareAndSet(false, true)) {
            this.a = this.d.c();
        }
    }

    public final void b() {
        if (this.c.compareAndSet(true, false)) {
            this.b = this.d.c();
        }
    }

    public final long c() {
        return (this.c.get() ? this.d.c() : this.b) - this.a;
    }
}
