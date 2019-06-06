package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: at */
public abstract class at {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final ap b;
    private volatile ae c;

    public at(ap apVar) {
        this.b = apVar;
    }

    private ae c() {
        return this.b.a(a());
    }

    public abstract String a();

    public final void a(ae aeVar) {
        if (aeVar == this.c) {
            this.a.set(false);
        }
    }

    public final ae b() {
        this.b.b();
        if (!this.a.compareAndSet(false, true)) {
            return c();
        }
        if (this.c == null) {
            this.c = c();
        }
        return this.c;
    }
}
