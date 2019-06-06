package defpackage;

/* renamed from: acio */
public final class acio<T extends achg, C extends achd<T, C>> extends acil<T, C> {
    private final T a;
    private final boolean b;
    private boolean c;
    private boolean d;

    public acio(T t) {
        this(t, false);
    }

    public acio(T t, boolean z) {
        this(t, z, false);
    }

    public acio(T t, boolean z, boolean z2) {
        super(z2, (byte) 0);
        this.c = true;
        this.d = false;
        this.a = t;
        this.b = z;
    }

    public acio(T t, boolean z, boolean z2, acih acih) {
        super(z2, acih);
        this.c = true;
        this.d = false;
        this.a = t;
        this.b = z;
    }

    public final void a(achc<T, C> achc, acjd<T, C> acjd) {
        super.a(achc, acjd);
        if (acjd.b(this.a) == null) {
            this.c = false;
        }
    }

    public final boolean b(achc<T, C> achc, acjd<T, C> acjd) {
        return !this.c ? true : this.b ? this.d : acjd.d().equals(this.a);
    }

    public final acgu<T> c(achc<T, C> achc, acjd<T, C> acjd) {
        acgu c = super.c(achc, acjd);
        if (this.b && c.h().equals(this.a)) {
            this.d = true;
        }
        return c;
    }
}
