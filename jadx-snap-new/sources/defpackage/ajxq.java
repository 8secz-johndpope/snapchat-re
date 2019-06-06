package defpackage;

import java.io.Serializable;

/* renamed from: ajxq */
final class ajxq<T> implements ajxe<T>, Serializable {
    private akbk<? extends T> a;
    private volatile Object b;
    private final Object c;

    private ajxq(akbk<? extends T> akbk) {
        akcr.b(akbk, "initializer");
        this.a = akbk;
        this.b = ajxu.a;
        this.c = this;
    }

    public /* synthetic */ ajxq(akbk akbk, byte b) {
        this(akbk);
    }

    public final boolean a() {
        return this.b != ajxu.a;
    }

    public final T b() {
        ajxu ajxu = this.b;
        if (ajxu != ajxu.a) {
            return ajxu;
        }
        T t;
        synchronized (this.c) {
            t = this.b;
            if (t == ajxu.a) {
                akbk akbk = this.a;
                if (akbk == null) {
                    akcr.a();
                }
                t = akbk.invoke();
                this.b = t;
                this.a = null;
            }
        }
        return t;
    }

    public final String toString() {
        return a() ? String.valueOf(b()) : "Lazy value not initialized yet.";
    }
}
