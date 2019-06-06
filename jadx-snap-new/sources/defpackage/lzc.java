package defpackage;

import defpackage.miw.b.b;

/* renamed from: lzc */
public final class lzc implements lzo {
    final miw a;
    private final ajxe b = ajxh.a(new a(this));
    private final ajxe c = ajxh.a(new b(this));

    /* renamed from: lzc$a */
    static final class a extends akcs implements akbk<ajdp<Boolean>> {
        private /* synthetic */ lzc a;

        a(lzc lzc) {
            this.a = lzc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.a(b.a).a(mja.LENS_EXPLORER_TOOLTIP_ENABLED).c(Boolean.FALSE);
        }
    }

    /* renamed from: lzc$b */
    static final class b extends akcs implements akbk<ajdx<Integer>> {
        private /* synthetic */ lzc a;

        b(lzc lzc) {
            this.a = lzc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.a(defpackage.miw.b.b.a).d(mja.LENS_EXPLORER_TOOLTIP_SHOWN_TIMES_MAX).d(Integer.valueOf(0));
        }
    }

    /* renamed from: lzc$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            final Integer num = (Integer) obj;
            akcr.b(num, "maxShownTimes");
            return ((ajdp) lzd.b.b()).p(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    Integer num = (Integer) obj;
                    akcr.b(num, "it");
                    int intValue = num.intValue();
                    Object obj2 = num;
                    akcr.a(obj2, "maxShownTimes");
                    return Boolean.valueOf(akcr.a(intValue, obj2.intValue()) <= 0);
                }
            });
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lzc.class), "isTooltipEnabled", "isTooltipEnabled()Lio/reactivex/Observable;"), new akdc(akde.a(lzc.class), "tooltipMaxShowTimes", "getTooltipMaxShowTimes()Lio/reactivex/Single;")};
    }

    public lzc(miw miw) {
        akcr.b(miw, "configurationRepository");
        this.a = miw;
    }

    public final ajdp<Boolean> a() {
        return (ajdp) this.b.b();
    }

    public final ajcx b() {
        return this.a.a().a((mje) mja.LENS_EXPLORER_TOOLTIP_ENABLED, false).a();
    }

    public final ajdp<Boolean> c() {
        Object d = ((ajdx) this.c.b()).d((ajfc) c.a);
        akcr.a(d, "tooltipMaxShowTimes\n    …s }\n                    }");
        return d;
    }
}
