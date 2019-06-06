package defpackage;

/* renamed from: acid */
public final class acid<T extends achg, C extends achd<T, C>> extends acig<T, C> {
    public final boolean b(achc<T, C> achc, acjd<T, C> acjd) {
        akcr.b(achc, "navigationSpecs");
        akcr.b(acjd, "navigationStack");
        return true;
    }

    public final acgu<T> c(achc<T, C> achc, acjd<T, C> acjd) {
        akcr.b(achc, "navigationSpecs");
        akcr.b(acjd, "navigationStack");
        throw new IllegalStateException("calling next on complete navigable");
    }
}
