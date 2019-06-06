package defpackage;

/* renamed from: oyh */
public final class oyh implements oyg {
    final ftl a;
    private final ajxe b = ajxh.a(new b(this));
    private final ajxe c = ajxh.a(new c(this));
    private final ajxe d = ajxh.a(new d(this));
    private final ajxe e = ajxh.a(new e(this));
    private final ajxe f = ajxh.a(new a(this));

    /* renamed from: oyh$b */
    static final class b extends akcs implements akbk<Long> {
        private /* synthetic */ oyh a;

        b(oyh oyh) {
            this.a = oyh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf((((long) this.a.a.f(ojo.MEDIA_CACHE_SIZE_MB)) << 10) << 10);
        }
    }

    /* renamed from: oyh$c */
    static final class c extends akcs implements akbk<Long> {
        private /* synthetic */ oyh a;

        c(oyh oyh) {
            this.a = oyh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf((((long) this.a.a.f(ojo.MEDIA_CACHE_SIZE_MB)) << 10) << 10);
        }
    }

    /* renamed from: oyh$d */
    static final class d extends akcs implements akbk<Float> {
        private /* synthetic */ oyh a;

        d(oyh oyh) {
            this.a = oyh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(this.a.a.c(ojo.MEDIA_CACHE_SIZE_PERCENTAGE));
        }
    }

    /* renamed from: oyh$e */
    static final class e extends akcs implements akbk<Long> {
        private /* synthetic */ oyh a;

        e(oyh oyh) {
            this.a = oyh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf((((long) this.a.a.f(ojo.THUMBNAIL_CACHE_SIZE_MB)) << 10) << 10);
        }
    }

    /* renamed from: oyh$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ oyh a;

        a(oyh oyh) {
            this.a = oyh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.a.a((fth) ojo.HAS_USED_SPECTACLES));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(oyh.class), "maxMediaCacheSize", "getMaxMediaCacheSize()J"), new akdc(akde.a(oyh.class), "maxMediaCacheSizeForSpectaclesUser", "getMaxMediaCacheSizeForSpectaclesUser()J"), new akdc(akde.a(oyh.class), "maxMediaCacheSizePercentage", "getMaxMediaCacheSizePercentage()F"), new akdc(akde.a(oyh.class), "maxThumbnailCacheSize", "getMaxThumbnailCacheSize()J"), new akdc(akde.a(oyh.class), "hasUsedSpectacles", "getHasUsedSpectacles()Z")};
    }

    public oyh(ftl ftl) {
        akcr.b(ftl, "configProvider");
        this.a = ftl;
    }

    public final long a() {
        abmr.a("[getMediaMaxCacheSizeInBytes] should be called on background thread");
        long longValue = ((Number) (((Boolean) this.f.b()).booleanValue() ? this.c : this.b).b()).longValue();
        float floatValue = ((Number) this.d.b()).floatValue();
        ygs ygs = new ygs();
        return Math.max(longValue, (long) (floatValue * ((float) ygs.c())));
    }

    public final long b() {
        abmr.a("[getThumbnailsMaxCacheSizeInBytes] should be called on background thread");
        return ((Number) this.e.b()).longValue();
    }
}
