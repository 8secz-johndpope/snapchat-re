package defpackage;

import com.google.common.base.Supplier;
import defpackage.elq.a;
import defpackage.elq.b;

/* renamed from: elv */
public final class elv implements a {
    public b a;
    public zgb b;
    public dqm c;
    public dqi d;
    public ajdp<duz> e;
    public ajdp<ebs> f;
    public Supplier<Boolean> g;
    public ajwl<aaqd> h;
    public ajdp<ebk> i;
    public ajdp<Boolean> j;
    public aipn<ablc> k;
    public aipn<dnr> l;
    private boolean m = false;

    private /* synthetic */ void a() {
        this.c.b((dow) this);
    }

    public final void a(boolean z) {
        if (z) {
            this.a.a();
            this.m = true;
        }
        this.h.a(z ? aaqd.DETECTED : aaqd.NOT_DETECTED);
    }

    public final ajej start() {
        zfw a = zgb.a(dnh.f.callsite("NightModePresenter"));
        ajei ajei = new ajei();
        ajei.a(this.j.a((ajdw) a.l()).f(new -$$Lambda$elv$zF_my-cN4EfgJi9pV_HuYYRixO0(this)));
        ajei.a(this.f.a(-$$Lambda$elv$Q4yAvfdPvNDUbTed-iVIkjvHWqE.INSTANCE).f(new -$$Lambda$elv$wC26pnfQE2fyLJ6UDUb_Zvi4-XA(this)));
        ajei.a(ajdp.a(this.e, this.i, -$$Lambda$elv$d-L2GBDP0jolkfCJ9O71TP9ufww.INSTANCE).j(ajfu.a).f(new -$$Lambda$elv$bguyzPVAcqVxaFD-52smne5alDA(this)));
        ajei.a(ajek.a(new -$$Lambda$elv$HzpplUkVNxiRkBObzwI3yP__17M(this)));
        ajei.a(this.a.c().f(new -$$Lambda$elv$HXt_zD_crc1x9l0OfGLbid2EhNY(this)));
        ajei.a(this.a.d().e(new -$$Lambda$elv$0G7fMIGdMT4yCgQyjdfU-z6LHMw(this, ajei)));
        return ajei;
    }
}
