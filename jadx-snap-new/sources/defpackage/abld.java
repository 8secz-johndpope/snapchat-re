package defpackage;

import java.util.Set;

/* renamed from: abld */
public final class abld implements ablh {
    private final Set<ablh> a;

    public abld(Set<ablh> set) {
        this.a = set;
    }

    public final void a() {
        for (ablh a : this.a) {
            a.a();
        }
    }

    public final void a(ablm ablm) {
        for (ablh a : this.a) {
            a.a(ablm);
        }
    }
}
