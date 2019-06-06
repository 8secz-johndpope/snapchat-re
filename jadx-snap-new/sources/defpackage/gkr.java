package defpackage;

/* renamed from: gkr */
public final class gkr {
    private final ryk a;

    public gkr(ryk ryk) {
        akcr.b(ryk, "rxNetworkStatusManager");
        this.a = ryk;
    }

    private final ilz a(ilz ilz) {
        Object g = this.a.g();
        akcr.a(g, "rxNetworkStatusManager.getNetworkReachability()");
        return ilz.a("reachability", (Enum) g);
    }

    private static ilz a(ilz ilz, geg geg) {
        return ilz.a("content_type", gkv.a(geg.f().a()));
    }

    static ilz b(ily ily, geg geg) {
        return gkr.c(gkr.b(gkr.a(new ilz(ily), geg), geg), geg);
    }

    private static ilz b(ilz ilz, geg geg) {
        return ilz.a("priority_uipage", gkv.a(gkv.a(gei.c(geg), geg.g())));
    }

    static ilz c(ily ily, geg geg) {
        return gkr.a(new ilz(ily), geg);
    }

    private static ilz c(ilz ilz, geg geg) {
        rzg a = gkv.a(geg.g());
        return ilz.a("uipage", gkv.a(gkv.a(a != null ? a.a : null)));
    }

    /* Access modifiers changed, original: final */
    public final ilz a(ily ily, geg geg) {
        return gkr.c(gkr.b(gkr.a(a(new ilz(ily)), geg), geg), geg);
    }
}
