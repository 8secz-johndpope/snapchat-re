package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aau */
final class aau {
    private final Map<zd, aan<?>> a = new HashMap();
    private final Map<zd, aan<?>> b = new HashMap();

    aau() {
    }

    /* Access modifiers changed, original: final */
    public final Map<zd, aan<?>> a(boolean z) {
        return z ? this.b : this.a;
    }

    /* Access modifiers changed, original: final */
    public final void a(zd zdVar, aan<?> aan) {
        Map a = a(aan.b);
        if (aan.equals(a.get(zdVar))) {
            a.remove(zdVar);
        }
    }
}
