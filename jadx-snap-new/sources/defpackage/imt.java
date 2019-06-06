package defpackage;

/* renamed from: imt */
public final class imt {
    public final ajxe a = ajxh.a(new a(this));
    final ftl b;
    final ims c;

    /* renamed from: imt$a */
    static final class a extends akcs implements akbk<akwt> {
        private /* synthetic */ imt a;

        a(imt imt) {
            this.a = imt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new defpackage.akwt.a().a((defpackage.akgx.a) this.a.c).a(this.a.b.j(ima.GRAPHENE_HOST)).a((defpackage.akwi.a) akxd.a()).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(imt.class), "retrofit", "getRetrofit()Lretrofit2/Retrofit;");
    }

    public imt(ftl ftl, ims ims) {
        akcr.b(ftl, "configProvider");
        akcr.b(ims, "grapheneCallFactory");
        this.b = ftl;
        this.c = ims;
    }
}
