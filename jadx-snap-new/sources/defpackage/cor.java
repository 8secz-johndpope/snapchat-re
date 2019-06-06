package defpackage;

import com.snap.ads.core.lib.network.AdRequestHttpInterface;

/* renamed from: cor */
public final class cor {
    private final ajxe a;

    /* renamed from: cor$a */
    static final class a extends akcs implements akbk<akwt> {
        private /* synthetic */ gde a;

        a(gde gde) {
            this.a = gde;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a("https://usc.adserver.snapads.com");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(cor.class), "retrofit", "getRetrofit()Lretrofit2/Retrofit;");
    }

    public cor(gde gde) {
        akcr.b(gde, "retrofitFactory");
        this.a = ajxh.a(new a(gde));
    }

    public final AdRequestHttpInterface a() {
        Object a = ((akwt) this.a.b()).a(AdRequestHttpInterface.class);
        akcr.a(a, "retrofit.create(AdReques…ttpInterface::class.java)");
        a = (AdRequestHttpInterface) a;
        akcr.a(a, "trace(\"\") {\n        retr…erface::class.java)\n    }");
        return a;
    }
}
