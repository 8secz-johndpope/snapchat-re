package defpackage;

/* renamed from: ncm */
public final class ncm implements nbs {
    private final ftl a;

    public ncm(ftl ftl) {
        akcr.b(ftl, "configProvider");
        this.a = ftl;
    }

    public final boolean a() {
        return this.a.f((fth) nfc.GET_LAST_LOCATION_INTERVAL_MS) != -1;
    }

    public final int b() {
        return this.a.f(nfc.GET_LAST_LOCATION_INTERVAL_MS);
    }
}
