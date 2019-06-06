package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: ekz */
public final class ekz implements dno {
    public ebg a;
    public ajdw b;
    public dqm c;
    public ebf d;
    public ajdp<duz> e;
    public ajdp<ebs> f;
    public ajdp<dpy> g;
    public ajwy<absc> h;
    private boolean i = false;
    private boolean j = false;

    /* renamed from: ekz$a */
    static class a {
        static final a a = new a(0, true, null, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
        final int b;
        final boolean c;
        final abtl d;
        final float e;
        final float f;

        private a(int i, boolean z, abtl abtl, float f, float f2) {
            this.b = i;
            this.c = z;
            this.d = abtl;
            this.e = f;
            this.f = f2;
        }

        /* synthetic */ a(int i, boolean z, abtl abtl, float f, float f2, byte b) {
            this(i, z, abtl, f, f2);
        }
    }

    private ajdp<Boolean> a() {
        return this.e.p(new -$$Lambda$ekz$4ruuLuTLMITLmuMmR08rVgwFPP4(this)).j(ajfu.a);
    }

    private <T> ajdp<T> a(ajdp<T> ajdp) {
        return ajdp.a(a(), (ajdt) ajdp, -$$Lambda$yN2lTPFwCbB0_EuZ6lkD5pB0ScE.INSTANCE).a(-$$Lambda$ekz$L_L51sgF9YoU0bpOZrsyX0hxpwE.INSTANCE).p(-$$Lambda$ekz$Mqy9tAAjpC4NINJAsP6hDnHDOZ8.INSTANCE);
    }

    private boolean a(duz duz) {
        return duz == duz.FULLY_VISIBLE || duz == duz.PARTIALLY_VISIBLE;
    }

    private void b() {
        if (this.j) {
            this.a.a(null);
            this.j = false;
        }
    }

    private void c() {
        b();
        ebf ebf = this.d;
        if (ebf != null && this.i) {
            this.i = false;
            ebf.b();
        }
    }

    private /* synthetic */ void c(Boolean bool) {
        b();
    }

    private void d() {
        if (!this.i) {
            this.d.a();
            this.i = true;
        }
    }

    private static /* synthetic */ boolean d(Boolean bool) {
        return !bool.booleanValue();
    }

    private /* synthetic */ void e() {
        this.b.a(new -$$Lambda$ekz$bI4JSWWdfa-Um-BAFvfrKg8JEwQ(this));
    }

    private /* synthetic */ void e(Boolean bool) {
        d();
    }

    public final ajej start() {
        ajei ajei = new ajei();
        ajei.a(a().a(-$$Lambda$ekz$FqwUWCgXY71DjRAtE5LLOi2jd84.INSTANCE).a(this.b).f(new -$$Lambda$ekz$-qVcx_8gbLFHWbnk7GAPcg41WLI(this)));
        ajej ajei2 = new ajei();
        ajei.a(ajdp.a(a(this.f), a(this.c.l()).p(new -$$Lambda$ekz$11iH8Rz1Ct7ffR_WI0e6Xacp_VE(this)), -$$Lambda$ekz$TKR77X880yMd0hFyTAMsWtH6VEk.INSTANCE).a(-$$Lambda$ekz$Aq3p0UH40H50z6hqBrFMtkzYjNI.INSTANCE).f(new -$$Lambda$ekz$icPGqv8egLmXOKf0AuJFXYFNVj0(this, ajei2)));
        ajei.a(this.c.l().a(-$$Lambda$ekz$FCuIuB8P9n7NpnKVfMnd7fLo064.INSTANCE).f(new -$$Lambda$ekz$E4H_7bY2iVE7EVlqYKq2B5KtxWU(ajei2)));
        ajei.a(ajei2);
        ajei.a(ajdp.a(this.e, this.f, new -$$Lambda$ekz$rITWiPgNLHN6hsGzJqb4MfwaZcE(this)).a(-$$Lambda$ekz$mUO-x24rNIVchkvfMScUICKz2P4.INSTANCE).a(this.b).f(new -$$Lambda$ekz$6TOwH8KBiVVsWzTNn5V4YxIwsso(this)));
        ajei.a(this.g.a(-$$Lambda$ekz$6GvNJrkjI0e08NXhT_9L5me1bZQ.INSTANCE).a(this.b).f(new -$$Lambda$ekz$mVZKm0dNsa3n8ik4oI4G4G2xMXE(this)));
        ajei.a(ajek.a(new -$$Lambda$ekz$VLGGw349aSKqe9LCv9ur8mBFrns(this)));
        return ajei;
    }
}
