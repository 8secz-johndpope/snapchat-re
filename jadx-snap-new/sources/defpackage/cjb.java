package defpackage;

import defpackage.tnj.a;

/* renamed from: cjb */
public final class cjb implements cim {
    private final ajxe a;
    private final ajxe b;
    private final abqo c;

    /* renamed from: cjb$a */
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

    /* renamed from: cjb$b */
    static final class b extends akcs implements akbk<tnj> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tnj) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(cjb.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(cjb.class), "preferences", "getPreferences()Lcom/snap/prefs/Preferences;")};
    }

    public cjb(ajwy<tnj> ajwy, ajwy<ftl> ajwy2, abqo abqo) {
        akcr.b(ajwy, "prefsProvider");
        akcr.b(ajwy2, "compositeConfigProvider");
        akcr.b(abqo, "clock");
        this.c = abqo;
        this.a = ajxh.a(new a(ajwy2));
        this.b = ajxh.a(new b(ajwy));
    }

    private final ftl d() {
        return (ftl) this.a.b();
    }

    private final tnj e() {
        return (tnj) this.b.b();
    }

    public final String a() {
        String j = d().j(cip.USER_AD_ID);
        CharSequence charSequence = j;
        int i = (charSequence == null || charSequence.length() == 0) ? 1 : 0;
        return (i ^ 1) != 0 ? j : null;
    }

    public final void a(String str) {
        akcr.b(str, "userAdId");
        a b = e().b();
        b.a((fth) cip.USER_AD_ID, str);
        b.a((fth) cip.USER_AD_ID_TIMESTAMP, Long.valueOf(abqo.a()));
        b.b();
    }

    public final void a(boolean z) {
        a b = e().b();
        b.a((fth) cip.LIMIT_AD_TRACKING_ENABLED, Boolean.valueOf(z));
        b.b();
    }

    public final long b() {
        return d().h(cip.USER_AD_ID_TIMESTAMP);
    }

    public final boolean c() {
        return d().a((fth) cip.LIMIT_AD_TRACKING_ENABLED);
    }
}
