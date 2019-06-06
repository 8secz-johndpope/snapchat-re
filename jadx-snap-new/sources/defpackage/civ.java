package defpackage;

/* renamed from: civ */
public final class civ {
    private final ajxe a;

    /* renamed from: civ$a */
    static final class a extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(civ.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;");
    }

    public civ(ajwy<ftl> ajwy) {
        akcr.b(ajwy, "configurationProviderLazy");
        this.a = ajxh.a(new a(ajwy));
    }

    /* Access modifiers changed, original: final */
    public final ftl a() {
        return (ftl) this.a.b();
    }
}
