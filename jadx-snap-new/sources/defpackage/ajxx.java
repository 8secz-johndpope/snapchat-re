package defpackage;

import java.io.Serializable;

/* renamed from: ajxx */
public final class ajxx<T> implements ajxe<T>, Serializable {
    private akbk<? extends T> a;
    private Object b = ajxu.a;

    public ajxx(akbk<? extends T> akbk) {
        akcr.b(akbk, "initializer");
        this.a = akbk;
    }

    public final boolean a() {
        return this.b != ajxu.a;
    }

    public final T b() {
        if (this.b == ajxu.a) {
            akbk akbk = this.a;
            if (akbk == null) {
                akcr.a();
            }
            this.b = akbk.invoke();
            this.a = null;
        }
        return this.b;
    }

    public final String toString() {
        return a() ? String.valueOf(b()) : "Lazy value not initialized yet.";
    }
}
