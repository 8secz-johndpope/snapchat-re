package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ajxp */
final class ajxp<T> implements ajxe<T>, Serializable {
    private static final AtomicReferenceFieldUpdater<ajxp<?>, Object> d = AtomicReferenceFieldUpdater.newUpdater(ajxp.class, Object.class, "b");
    private volatile akbk<? extends T> a;
    private volatile Object b = ajxu.a;
    private final Object c = ajxu.a;

    /* renamed from: ajxp$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public ajxp(akbk<? extends T> akbk) {
        akcr.b(akbk, "initializer");
        this.a = akbk;
    }

    public final boolean a() {
        return this.b != ajxu.a;
    }

    public final T b() {
        ajxu ajxu = this.b;
        if (ajxu != ajxu.a) {
            return ajxu;
        }
        akbk akbk = this.a;
        if (akbk != null) {
            Object invoke = akbk.invoke();
            if (d.compareAndSet(this, ajxu.a, invoke)) {
                this.a = null;
                return invoke;
            }
        }
        return this.b;
    }

    public final String toString() {
        return a() ? String.valueOf(b()) : "Lazy value not initialized yet.";
    }
}
