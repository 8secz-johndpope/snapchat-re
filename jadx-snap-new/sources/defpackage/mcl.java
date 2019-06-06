package defpackage;

import defpackage.miw.b.a;

/* renamed from: mcl */
public final class mcl implements mcg {
    final miw a;
    private final ajxe b = ajxh.a(new c(this));
    private final ajxe c = ajxh.a(new b(this));
    private final ajxe d = ajxh.a(new a(this));

    /* renamed from: mcl$c */
    static final class c extends akcs implements akbk<ajdx<Boolean>> {
        private /* synthetic */ mcl a;

        c(mcl mcl) {
            this.a = mcl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.a(a.a).a(mja.CAMERA_ONBOARDING_CAROUSEL_SWIPE_TOOLTIP_SHOWN).d(Boolean.FALSE);
        }
    }

    /* renamed from: mcl$b */
    static final class b extends akcs implements akbk<ajdx<Boolean>> {
        private /* synthetic */ mcl a;

        b(mcl mcl) {
            this.a = mcl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.a(a.a).a(mja.CAMERA_ONBOARDING_CAROUSEL_CAPTURE_TOOLTIP_SHOWN).d(Boolean.FALSE);
        }
    }

    /* renamed from: mcl$a */
    static final class a extends akcs implements akbk<ajdx<Boolean>> {
        private /* synthetic */ mcl a;

        a(mcl mcl) {
            this.a = mcl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.a(defpackage.miw.b.a.a).a(mja.LENSES_ONBOARDING_TOOLTIP_ENABLED).d(Boolean.FALSE);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(mcl.class), "isSwipeTipCompleted", "isSwipeTipCompleted()Lio/reactivex/Single;"), new akdc(akde.a(mcl.class), "isSnapCaptureTipCompleted", "isSnapCaptureTipCompleted()Lio/reactivex/Single;"), new akdc(akde.a(mcl.class), "isOnboardingTooltipEnabled", "isOnboardingTooltipEnabled()Lio/reactivex/Single;")};
    }

    public mcl(miw miw) {
        akcr.b(miw, "configurationRepository");
        this.a = miw;
    }

    public final ajdx<Boolean> a() {
        return (ajdx) this.b.b();
    }

    public final ajdx<Boolean> b() {
        return (ajdx) this.c.b();
    }

    public final ajdx<Boolean> c() {
        return (ajdx) this.d.b();
    }

    public final ajcx d() {
        return this.a.a().a((mje) mja.CAMERA_ONBOARDING_CAROUSEL_SWIPE_TOOLTIP_SHOWN, true).a();
    }

    public final ajcx e() {
        return this.a.a().a((mje) mja.CAMERA_ONBOARDING_CAROUSEL_CAPTURE_TOOLTIP_SHOWN, true).a();
    }
}
