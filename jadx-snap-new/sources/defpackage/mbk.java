package defpackage;

import defpackage.miw.c;

/* renamed from: mbk */
public final class mbk implements mbu {
    final miw a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: mbk$a */
    static final class a extends akcs implements akbk<ajdx<Boolean>> {
        private /* synthetic */ mbk a;

        /* renamed from: mbk$a$a */
        public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
            public final R apply(T1 t1, T2 t2) {
                boolean z = !((Boolean) t1).booleanValue() && ((Boolean) t2).booleanValue();
                return Boolean.valueOf(z);
            }
        }

        a(mbk mbk) {
            this.a = mbk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            c a = this.a.a.a(defpackage.miw.b.a.a);
            ajdp a2 = ajdp.a((ajdt) a.a(mja.CAMERA_LENSES_ACTIVATED), (ajdt) a.a(mja.LENSES_ONBOARDING_TOOLTIP_ENABLED), (ajex) new a());
            if (a2 == null) {
                akcr.a();
            }
            return a2.d(Boolean.FALSE);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mbk.class), "shouldShowLensButtonTooltip", "getShouldShowLensButtonTooltip()Lio/reactivex/Single;");
    }

    public mbk(miw miw) {
        akcr.b(miw, "configurationRepository");
        this.a = miw;
    }

    public final ajdx<Boolean> a() {
        return (ajdx) this.b.b();
    }
}
