package defpackage;

import defpackage.dns.a;
import defpackage.dns.b;

/* renamed from: eph */
public final class eph {
    final ajxe a;
    final ajdp<Boolean> b = ((dns) this.e.b()).observeTooltipState(b.LENS_CAROUSEL_CAPTURE_TOOLTIP, a.COMPLETED);
    final ajdp<Boolean> c = a().p(dnd.FRIENDS_SWIPE_TEACHING_TOOLTIP_ENABLED);
    final ajdx<Boolean> d = a().b((fth) dnd.SEEN_FRIENDS_PAGE_ONBOARDING_TOOLTIP);
    private final ajxe e;
    private final ajxe f;

    /* renamed from: eph$c */
    static final class c extends akcs implements akbk<dns> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (dns) this.a.get();
        }
    }

    /* renamed from: eph$b */
    static final class b extends akcs implements akbk<hxs> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (hxs) this.a.get();
        }
    }

    /* renamed from: eph$a */
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
        aken[] akenArr = new aken[]{new akdc(akde.a(eph.class), "onboardingTooltipSettings", "getOnboardingTooltipSettings()Lcom/snap/camera/api/OnboardingTooltipSettings;"), new akdc(akde.a(eph.class), "featureConfig", "getFeatureConfig()Lcom/snap/featureconfig/FeatureConfiguration;"), new akdc(akde.a(eph.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;")};
    }

    public eph(ajwy<dns> ajwy, ajwy<hxs> ajwy2, ajwy<ftl> ajwy3) {
        akcr.b(ajwy, "onboardingTooltipSettingsProvider");
        akcr.b(ajwy2, "featureConfiguration");
        akcr.b(ajwy3, "configurationProvider");
        this.e = ajxh.a(new c(ajwy));
        this.a = ajxh.a(new b(ajwy2));
        this.f = ajxh.a(new a(ajwy3));
    }

    private final ftl a() {
        return (ftl) this.f.b();
    }
}
