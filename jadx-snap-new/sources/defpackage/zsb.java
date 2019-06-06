package defpackage;

import com.snap.unlockables.lib.network.api.GtqHttpInterface;

/* renamed from: zsb */
public final class zsb {
    private final ajxe a;

    /* renamed from: zsb$a */
    static final class a extends akcs implements akbk<akwt> {
        private /* synthetic */ gde a;

        a(gde gde) {
            this.a = gde;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a("https://gtq.sct.sc-prod.net");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zsb.class), "retrofit", "getRetrofit()Lretrofit2/Retrofit;");
    }

    public zsb(gde gde) {
        akcr.b(gde, "retrofitFactory");
        this.a = ajxh.a(new a(gde));
    }

    public final GtqHttpInterface a() {
        Object a = ((akwt) this.a.b()).a(GtqHttpInterface.class);
        akcr.a(a, "retrofit.create(GtqHttpInterface::class.java)");
        a = (GtqHttpInterface) a;
        akcr.a(a, "trace(\"\") {\n        retr…erface::class.java)\n    }");
        return a;
    }
}
