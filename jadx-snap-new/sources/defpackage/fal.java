package defpackage;

/* renamed from: fal */
public final class fal implements ezd {
    private final aipn<ftl> a;
    private final aipn<hxs> b;

    public fal(aipn<ftl> aipn, aipn<hxs> aipn2) {
        this.a = aipn;
        this.b = aipn2;
    }

    private static /* synthetic */ Boolean a(Boolean bool, Boolean bool2) {
        boolean z = bool.booleanValue() && bool2.booleanValue();
        return Boolean.valueOf(z);
    }

    public final ajdp<Boolean> a() {
        return ajdp.a(((ftl) this.a.get()).p(ezu.ENABLE_COGNAC), ((ftl) this.a.get()).p(ezu.COGNAC_GATING_ENABLED), -$$Lambda$fal$gTC_ELsfMCq4gUJ1Qd-ZXGN9OKI.INSTANCE);
    }

    public final void a(long j) {
        ((hxs) this.b.get()).a(ezu.LAST_LOAD_APP_LIST_TIMESTAMP, Long.valueOf(j));
    }

    public final ajdp<Boolean> b() {
        return ((ftl) this.a.get()).p(ezu.COGNAC_GATING_ENABLED);
    }

    public final ajdp<Boolean> c() {
        return ((ftl) this.a.get()).p(ezu.ENABLE_COGNAC);
    }

    public final boolean d() {
        return f() && e();
    }

    public final boolean e() {
        return ((ftl) this.a.get()).a(ezu.COGNAC_GATING_ENABLED);
    }

    public final boolean f() {
        return ((ftl) this.a.get()).a(ezu.ENABLE_COGNAC);
    }

    public final boolean g() {
        return ((ftl) this.a.get()).a(ezu.ENABLE_COGNAC_APP_1);
    }

    public final boolean h() {
        return ((ftl) this.a.get()).a(ezu.ENABLE_WEBVIEW_DEBUG);
    }

    public final boolean i() {
        return ((ftl) this.a.get()).a(ezu.COGNAC_BACKGROUND_PRELOAD);
    }

    public final ajdx<Integer> j() {
        return ((ftl) this.a.get()).g(ezu.COGNAC_BACKGROUND_PRELOAD_COUNT);
    }

    public final String k() {
        return (String) fer.l.get(((ezx) ((ftl) this.a.get()).y(ezu.CHOOSE_ORGANIZATION)).name);
    }

    public final boolean l() {
        return ((ftl) this.a.get()).y(ezu.CHOOSE_ORGANIZATION) != ezx.NONE;
    }

    public final int m() {
        return ((ftl) this.a.get()).f(ezu.COGNAC_NOTIFICATION_EXPIRATION_THRESHOLD);
    }

    public final ajdx<Integer> n() {
        return ((ftl) this.a.get()).g(ezu.COGNAC_APPLIST_EXPIRATION_IN_SECONDS);
    }

    public final ajdx<Long> o() {
        return ((ftl) this.a.get()).i(ezu.LAST_LOAD_APP_LIST_TIMESTAMP);
    }

    public final int p() {
        return ((ftl) this.a.get()).a(ezu.DISABLE_RATE_LIMIT) ? 0 : ((ftl) this.a.get()).f(ezu.COGNAC_AD_CAP_SEC);
    }

    public final int q() {
        return ((ftl) this.a.get()).a(ezu.DISABLE_RATE_LIMIT) ? 0 : ((ftl) this.a.get()).f(ezu.COGNAC_AD_COUNT);
    }

    public final int r() {
        return ((ftl) this.a.get()).a(ezu.DISABLE_RATE_LIMIT) ? 0 : ((ftl) this.a.get()).f(ezu.COGNAC_AD_DURATION_SEC);
    }

    public final boolean s() {
        return ((ftl) this.a.get()).a(ezu.COGNAC_AD_ENABLED);
    }

    public final float t() {
        return ((ftl) this.a.get()).c(ezu.COGNAC_DOCK_ZONE_DISTANCE);
    }

    public final float u() {
        return ((ftl) this.a.get()).c(ezu.COGNAC_DOCK_RESISTANCE);
    }

    public final boolean v() {
        return ((ftl) this.a.get()).a(ezu.ENABLE_APP_PROFILE);
    }

    public final boolean w() {
        return ((ftl) this.a.get()).a(ezu.ENABLE_APP_PERFORMANCE_LOGGING);
    }
}
