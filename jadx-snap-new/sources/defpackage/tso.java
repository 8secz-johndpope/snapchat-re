package defpackage;

import java.util.Set;

/* renamed from: tso */
public final class tso implements zgj {
    private final ajei a = new ajei();
    private final Set<tpw> b;

    public tso(Set<? extends tpw> set) {
        akcr.b(set, "featureActivators");
        this.b = set;
    }

    public final ajej start() {
        for (tpw tpw : this.b) {
            tpw.a();
            this.a.a(tpw.start());
        }
        return this.a;
    }
}
