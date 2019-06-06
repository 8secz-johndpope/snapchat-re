package defpackage;

/* renamed from: acij */
public final class acij<T extends achg, C extends achd<T, C>> extends acig<T, C> {
    private final acig<T, C> a;

    public acij(acig<T, C> acig, acih acih) {
        akcr.b(acig, "navigable");
        super(acih);
        this.a = acig;
    }

    public final void a(achc<T, C> achc, acjd<T, C> acjd) {
        akcr.b(achc, "navigationSpecs");
        akcr.b(acjd, "navigationStack");
        this.a.a(achc, acjd);
    }

    public final boolean b(achc<T, C> achc, acjd<T, C> acjd) {
        akcr.b(achc, "navigationSpecs");
        akcr.b(acjd, "navigationStack");
        return this.a.b(achc, acjd);
    }

    public final acgu<T> c(achc<T, C> achc, acjd<T, C> acjd) {
        akcr.b(achc, "navigationSpecs");
        akcr.b(acjd, "navigationStack");
        Object d = this.a.c(achc, acjd).g().a(false).d();
        akcr.a(d, "navigationAction.toBuild…uldAnimate(false).build()");
        return d;
    }
}
