package defpackage;

/* renamed from: uav */
public final class uav {
    private final tnj a;
    private final ftl b;

    public uav(tnj tnj, ftl ftl) {
        akcr.b(tnj, "preferences");
        akcr.b(ftl, "configProvider");
        this.a = tnj;
        this.b = ftl;
    }

    public final boolean a(uaj uaj) {
        akcr.b(uaj, "tooltipType");
        fth a = uaw.a(uaj);
        return a != null ? this.b.a(a) : false;
    }

    public final ajej b(uaj uaj) {
        akcr.b(uaj, "tooltipType");
        fth a = uaw.a(uaj);
        return a != null ? this.a.b().a(a, Boolean.TRUE).b() : null;
    }
}
