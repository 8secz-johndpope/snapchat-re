package defpackage;

/* renamed from: ndc */
public final class ndc implements ncc {
    private final ifs a;
    private final nbw b;

    public ndc(ifs ifs, nbw nbw) {
        akcr.b(ifs, "permissionHelper");
        akcr.b(nbw, "locationConfigurationProvider");
        this.a = ifs;
        this.b = nbw;
    }

    public final boolean a() {
        return this.a.l() && this.b.b();
    }
}
