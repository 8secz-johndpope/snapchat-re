package defpackage;

import java.util.List;

/* renamed from: acig */
public abstract class acig<T extends achg, C extends achd<T, C>> {
    private int a;
    private acjc<T, C> b;
    private final acih c;

    public /* synthetic */ acig() {
        this(null);
    }

    public acig(acih acih) {
        this.c = acih;
    }

    public acih a() {
        return this.c;
    }

    public void a(achc<T, C> achc, acjd<T, C> acjd) {
        akcr.b(achc, "navigationSpecs");
        akcr.b(acjd, "navigationStack");
    }

    public final acjc<T, C> b() {
        acjc acjc = this.b;
        if (acjc == null) {
            akcr.a("appliedNavigationStack");
        }
        return acjc;
    }

    public abstract boolean b(achc<T, C> achc, acjd<T, C> acjd);

    public final acgu<T> c() {
        acjc acjc = this.b;
        if (acjc == null) {
            akcr.a("appliedNavigationStack");
        }
        List a = acjc.a();
        int i = this.a;
        this.a = i + 1;
        Object obj = a.get(i);
        akcr.a(obj, "appliedNavigationStack.navigationActions[next++]");
        return (acgu) obj;
    }

    public abstract acgu<T> c(achc<T, C> achc, acjd<T, C> acjd);

    public final boolean d() {
        return this.a == 1;
    }

    public final boolean e(achc<T, C> achc, acjd<T, C> acjd) {
        akcr.b(achc, "navigationSpecs");
        akcr.b(acjd, "navigationStack");
        if (this.b == null) {
            a(achc, acjd);
            Object a = acjd.a(this);
            akcr.a(a, "navigationStack.apply(this)");
            this.b = a;
        }
        int i = this.a;
        acjc acjc = this.b;
        if (acjc == null) {
            akcr.a("appliedNavigationStack");
        }
        return i == acjc.a().size();
    }
}
