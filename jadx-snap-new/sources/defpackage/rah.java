package defpackage;

import java.util.HashSet;

/* renamed from: rah */
public final class rah {
    private final HashSet<rak> a = new HashSet();

    public final synchronized void a() {
        this.a.clear();
    }

    public final synchronized boolean a(rak rak) {
        akcr.b(rak, "action");
        return this.a.add(rak);
    }

    public final synchronized boolean b(rak rak) {
        akcr.b(rak, "action");
        return this.a.contains(rak);
    }
}
