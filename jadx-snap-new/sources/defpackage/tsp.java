package defpackage;

import java.util.Set;

/* renamed from: tsp */
public final class tsp implements zgj {
    private final ajei a = new ajei();
    private final Set<toe> b;

    public tsp(Set<? extends toe> set) {
        akcr.b(set, "featurePreloaders");
        this.b = set;
    }

    public final ajej start() {
        for (toe start : this.b) {
            this.a.a(start.start());
        }
        return this.a;
    }
}
