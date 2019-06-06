package defpackage;

/* renamed from: dmt */
public final class dmt implements dmo {
    private dmp a;
    private final ajwl<String> b = new ajwl();

    public dmt(wnl wnl) {
        wnl.g(rxp.BOLT_NETWORK_RULES).a((ajdw) zgb.a(dlw.a, "DefaultBoltServerConfig").f()).a(-$$Lambda$Ak8QL176mRumGTfug98PPjKgiWY.INSTANCE).p(-$$Lambda$hpQEhcsIn_uY4urDnBrJtI_Yyg8.INSTANCE).p(-$$Lambda$dmt$0Csc6t367goGcEWikSOsGLHa7cA.INSTANCE).b(new -$$Lambda$dmt$xCG6IN3QlqD96Pug-3Qe1fqJ9H0(this)).c(-$$Lambda$dmt$CGLwUTK9krjfcyawXGiciXa4piU.INSTANCE).a(this.b);
    }

    private synchronized void b() {
        if (this.a != null) {
            this.a.c();
        }
    }

    public final String a() {
        return (String) this.b.p();
    }

    public final synchronized void a(dmp dmp) {
        this.a = dmp;
    }
}
