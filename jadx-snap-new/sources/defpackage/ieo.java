package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ieo */
public abstract class ieo {
    private final abnm a;
    private final abtb b;
    private final RuntimeException c;
    private AtomicBoolean d;

    public ieo() {
        this((byte) 0);
    }

    public ieo(byte b) {
        this(abnm.a, abtb.a);
    }

    private ieo(abnm abnm, abtb abtb) {
        this.d = new AtomicBoolean(false);
        this.a = abnm;
        this.b = abtb;
        StringBuilder stringBuilder = new StringBuilder("Failed to release: ");
        stringBuilder.append(getClass().getName());
        this.c = new RuntimeException(stringBuilder.toString());
    }

    public abstract void a();

    /* Access modifiers changed, original: protected */
    public void finalize() {
        super.finalize();
        if (!this.d.get()) {
            getClass().getName();
            m();
        }
    }

    public final void m() {
        if (this.d.compareAndSet(false, true)) {
            a();
        }
    }

    public final boolean n() {
        return this.d.get();
    }

    /* Access modifiers changed, original: protected|final */
    public final void o() {
        if (this.d.get()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getName());
            stringBuilder.append(" already released!");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
