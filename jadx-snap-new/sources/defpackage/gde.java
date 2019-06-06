package defpackage;

import defpackage.akgx.a;

/* renamed from: gde */
public final class gde {
    private final ajxe a;

    /* renamed from: gde$a */
    static final class a extends akcs implements akbk<akwt> {
        private /* synthetic */ defpackage.akgx.a a;
        private /* synthetic */ ajwy b;
        private /* synthetic */ ajwy c;
        private /* synthetic */ gdd d;
        private /* synthetic */ gjw e;

        a(defpackage.akgx.a aVar, ajwy ajwy, ajwy ajwy2, gdd gdd, gjw gjw) {
            this.a = aVar;
            this.b = ajwy;
            this.c = ajwy2;
            this.d = gdd;
            this.e = gjw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new defpackage.akwt.a().a(this.a).a(((gcw) this.b.get()).a()).a((defpackage.akwi.a) akxd.b()).a(gkd.a()).a((defpackage.akwk.a) new gjz()).a((defpackage.akwk.a) new gka()).a((defpackage.akwk.a) gjm.a((iha) this.c.get(), this.d)).a((defpackage.akwk.a) akxj.a()).a((defpackage.akwk.a) this.e).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gde.class), "retrofit", "getRetrofit()Lretrofit2/Retrofit;");
    }

    public gde(ajwy<gcw> ajwy, a aVar, ajwy<iha> ajwy2, gdd gdd, gjw gjw) {
        akcr.b(ajwy, "endpointManagerProvider");
        akcr.b(aVar, "callFactory");
        akcr.b(ajwy2, "serializationHelperProvider");
        akcr.b(gdd, "payloadSignerInterface");
        akcr.b(gjw, "interceptingGsonConverterFactory");
        this.a = ajxh.a(new a(aVar, ajwy, ajwy2, gdd, gjw));
    }

    private final akwt a() {
        return (akwt) this.a.b();
    }

    public final akwt a(String str) {
        akcr.b(str, "baseUrl");
        Object a = a().a().a(str).a();
        akcr.a(a, "retrofit.newBuilder()\n  …\n                .build()");
        return a;
    }
}
