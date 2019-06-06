package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: akik */
public final class akik {
    private final Set<akhx> a = new LinkedHashSet();

    public final synchronized void a(akhx akhx) {
        this.a.add(akhx);
    }

    public final synchronized void b(akhx akhx) {
        this.a.remove(akhx);
    }

    public final synchronized boolean c(akhx akhx) {
        return this.a.contains(akhx);
    }
}
