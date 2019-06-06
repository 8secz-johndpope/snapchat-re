package defpackage;

/* renamed from: wrh */
public final class wrh {
    public final abss a;
    public final ftl b;
    public wrb c = wrb.EMPLOYEE;
    private final tnj d;

    public wrh(abss abss, ftl ftl, tnj tnj) {
        this.a = abss;
        this.b = ftl;
        this.d = tnj;
    }

    public final boolean a() {
        return this.a.f() && this.c == wrb.EMPLOYEE;
    }

    public final aima b() {
        return (aima) this.b.y(wrc.SHAKE_SENSITIVITY);
    }

    public final boolean c() {
        int f = this.b.f(wrc.NUMBER_OF_SHAKES);
        this.d.b().a(wrc.NUMBER_OF_SHAKES, Integer.valueOf(f + 1)).b();
        return f < 2;
    }

    public final boolean d() {
        return this.b.a(wrc.DB_DUMP_ENABLED);
    }

    public final boolean e() {
        return this.a.g() || this.b.a(wrc.S2R_ELIGIBILITY_IN_PROD);
    }
}
