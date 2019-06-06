package defpackage;

/* renamed from: acil */
public abstract class acil<T extends achg, C extends achd<T, C>> extends acig<T, C> {
    private final boolean a;

    public /* synthetic */ acil(boolean z) {
        this(z, null);
    }

    protected acil(boolean z, byte b) {
        this(z);
    }

    protected acil(boolean z, acih acih) {
        super(acih);
        this.a = z;
    }

    public acgu<T> c(achc<T, C> achc, acjd<T, C> acjd) {
        akcr.b(achc, "navigationSpecs");
        akcr.b(acjd, "navigationStack");
        Object d = acjd.k().j().g().a(this.a).d();
        akcr.a(d, "navigationStack.topNavig…te(shouldAnimate).build()");
        return d;
    }
}
