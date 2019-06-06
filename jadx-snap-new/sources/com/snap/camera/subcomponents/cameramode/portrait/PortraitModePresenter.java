package com.snap.camera.subcomponents.cameramode.portrait;

import android.graphics.Rect;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import defpackage.ablc;
import defpackage.abps;
import defpackage.aipn;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajek;
import defpackage.ajfu;
import defpackage.ajwl;
import defpackage.ajwo;
import defpackage.ajws;
import defpackage.dnd;
import defpackage.dnh;
import defpackage.dos;
import defpackage.dox;
import defpackage.dpp;
import defpackage.dpw;
import defpackage.dqi;
import defpackage.duz;
import defpackage.dyt;
import defpackage.dza;
import defpackage.dzb;
import defpackage.ebk;
import defpackage.ebs;
import defpackage.ebs.d;
import defpackage.eeb;
import defpackage.eec;
import defpackage.egb.a;
import defpackage.egb.b;
import defpackage.ego;
import defpackage.egp;
import defpackage.egq;
import defpackage.ftl;
import defpackage.j;
import defpackage.k;
import defpackage.s;
import defpackage.t;
import defpackage.zfw;
import defpackage.zgb;
import java.util.List;

public class PortraitModePresenter implements dos, a, k {
    public zgb a;
    public ftl b;
    public ajdp<ebs> c;
    public dqi d;
    public dyt e;
    public ajdp<egq> f;
    public egp g;
    public dza h;
    public ego i;
    public ajdp<ebk> j;
    public aipn<ablc> k;
    public b l;
    public ajdp<Boolean> m;
    public ajdp<Optional<eeb>> n;
    public Supplier<Optional<eeb>> o;
    public ajwo<eec> p;
    public ajws<Runnable> q;
    public Supplier<String> r;
    public ajwo<List<Rect>> s;
    public ajdp<dpw> t;
    public ajdp<duz> u;
    private zfw v;
    private ajwl<Boolean> w = ajwl.i(Boolean.FALSE);

    private b.a a(Boolean bool, egq egq) {
        if (!bool.booleanValue()) {
            return b.a.GONE;
        }
        float f = egq.a.d;
        return f < 0.1f ? b.a.VISIBLE_FIND_FACE : f < 0.3f ? b.a.VISIBLE_MOVE_CLOSER : f > 0.9f ? b.a.VISIBLE_MOVE_FURTHER_AWAY : b.a.INVISIBLE;
    }

    private static /* synthetic */ Boolean a(Boolean bool, ebs ebs, Boolean bool2) {
        boolean z = bool.booleanValue() && ebs == d.b && bool2.booleanValue();
        return Boolean.valueOf(z);
    }

    private void a(boolean z) {
        dpp a = this.d.a();
        if (a != null) {
            if (z) {
                a.a((dos) this);
            } else {
                a.b((dos) this);
            }
        }
        this.l.d(z);
    }

    private void b() {
        this.w.a(Boolean.FALSE);
        this.l.a(false);
    }

    private void c() {
        dza dza = this.h;
        ego ego = this.i;
        if (dza.a.contains(ego)) {
            boolean z = false;
            ego.a(false);
            for (dzb a : dza.a) {
                if (a.a()) {
                    z = true;
                    break;
                }
            }
            dza.b = z;
        }
        this.g.b();
        dox dox = this.e;
        if (dox.c != null) {
            dox.c.b(dox);
            dox.c = null;
            dox.b.a = null;
        }
        this.l.a(b.a.GONE);
    }

    private /* synthetic */ void c(Boolean bool) {
        c();
    }

    private void d() {
        t.i.getLifecycle().b(this);
    }

    private static /* synthetic */ boolean d(Boolean bool) {
        return !bool.booleanValue();
    }

    private /* synthetic */ void e(Boolean bool) {
        dox dox = this.e;
        dox.c = dox.a.a();
        if (dox.c != null) {
            dox.c.a(dox);
        }
        this.g.a();
        dza dza = this.h;
        ego ego = this.i;
        if (!dza.a.contains(ego)) {
            dza.a.add(ego);
        }
        ego.a(true);
        dza.b = true;
    }

    private /* synthetic */ Boolean f(Boolean bool) {
        String str = (String) this.r.get();
        Preconditions.checkState(abps.b(str) ^ 1);
        return Boolean.valueOf(this.g.a(str));
    }

    private /* synthetic */ void h(Boolean bool) {
        this.l.c(bool.booleanValue());
        if (!((Boolean) this.w.p()).booleanValue()) {
            this.l.a(bool.booleanValue());
        }
    }

    private /* synthetic */ void i(Boolean bool) {
        b();
    }

    public void a() {
        ajwl ajwl = this.w;
        ajwl.a(Boolean.valueOf(((Boolean) ajwl.p()).booleanValue() ^ 1));
        this.p.a(new eec(eeb.PORTRAIT, ((Boolean) this.w.p()).booleanValue()));
        ((ablc) this.k.get()).a(ablc.a.PORTRAIT);
    }

    public final void a(List<Rect> list) {
        this.s.a((Object) list);
    }

    /* Access modifiers changed, original: 0000 */
    @s(a = j.a.ON_STOP)
    public void onApplicationBackground() {
        b();
    }

    public ajej start() {
        t.i.getLifecycle().a(this);
        this.v = zgb.a(dnh.f.callsite("PortraitModePresenter"));
        ajei ajei = new ajei();
        ajei.a(ajek.a(new -$$Lambda$PortraitModePresenter$reKPEBvL4haqNavZ-SdQt64mGj0(this)));
        ajei.a(ajek.a(new -$$Lambda$PortraitModePresenter$pVveD58_ljQ0ypKmYoiUx4dx6RI(this)));
        ajei.a(this.l.a().f(new -$$Lambda$PortraitModePresenter$WNPoS8tDrFGoMMLGdDrCmEb6kQE(this)));
        ajei.a(this.n.p(-$$Lambda$PortraitModePresenter$koT5MbEeosiTVbPZFhGvGNu2C-s.INSTANCE).j(ajfu.a).a(-$$Lambda$PortraitModePresenter$0dA-LxvMh_jZ5-IJC7AH3rWKYt4.INSTANCE).f(new -$$Lambda$PortraitModePresenter$jyLHL8ynj2Tof1JhxUDehvmfErs(this)));
        ajei.a(this.m.j(ajfu.a).f(new -$$Lambda$PortraitModePresenter$Ay0rIP6JL_ZCSPtwjuPUPPVrwmg(this)));
        ajdp j = this.w.j(ajfu.a);
        b bVar = this.l;
        bVar.getClass();
        ajei.a(j.f(new -$$Lambda$ZIGR7d-qbJ4CI-Rg2_t3joMXw6Q(bVar)));
        ajdt j2 = ajdp.a(ajdp.a(this.u, this.j, -$$Lambda$PortraitModePresenter$IcIgvA98AVDOgevQB6bNtxjlfrQ.INSTANCE).j(ajfu.a), this.c, this.w, -$$Lambda$PortraitModePresenter$HOwZ0ODpJasYW2lKYLuG4dgMqrQ.INSTANCE).j(ajfu.a);
        ajei.a(j2.a(-$$Lambda$PortraitModePresenter$J0I_jBBAS7yrVD3XRBnhh_1GW5U.INSTANCE).a((ajdw) this.v.f()).p(new -$$Lambda$PortraitModePresenter$z_3q-_oc8atstC1L8dqJ4s158lA(this)).a((ajdw) this.v.l()).a(new -$$Lambda$PortraitModePresenter$ryOSftCt6cLT5TvDWLh66LcR4Mc(this), -$$Lambda$PortraitModePresenter$cqflxdw9Ng5y331yTsBQzGyAjDY.INSTANCE));
        ajei.a(j2.a(-$$Lambda$PortraitModePresenter$11rZDHcsBPpcA13q3hrlh25mk_Y.INSTANCE).a((ajdw) this.v.l()).a(new -$$Lambda$PortraitModePresenter$08L0halNb8qbb8UurTu4hXONnZc(this), -$$Lambda$PortraitModePresenter$ob8csdvpqhqMIYgS8JzSH4W8tAs.INSTANCE));
        ajei.a(ajdp.a(j2, this.f, new -$$Lambda$PortraitModePresenter$g_de8z1e-w492LepMj-Ot_NF3lE(this)).j(ajfu.a).a((ajdw) this.v.l()).f(new -$$Lambda$PortraitModePresenter$7-StjTrhqYjbt8qrEfxRkb0qXxs(this)));
        ajei.a(this.s.a((ajdw) this.v.l()).f(new -$$Lambda$PortraitModePresenter$sq7C_h8MJr2ON4VVOxpueFqovrk(this)));
        ajei.a(this.b.p(dnd.RESET_AFTER_CAPTURE).a(-$$Lambda$PortraitModePresenter$wU0Hf59t1pIdKmKiVPNTUKzuYSE.INSTANCE).d().b(new -$$Lambda$PortraitModePresenter$d8Cv_MXLtGILiwu3165eTi_kGjQ(this)).a(-$$Lambda$PortraitModePresenter$JpaqKZOAw4M-lBDm_ZesQODUqeg.INSTANCE).f(new -$$Lambda$PortraitModePresenter$VqwoZyxrZVYlXM3pwqVjfjWxrY0(this)));
        ajei.a(ajdp.a(j2, this.t.p(-$$Lambda$PortraitModePresenter$SOEtx05xBNmcyi-WTQ_8KnhLCok.INSTANCE).h(Boolean.FALSE), -$$Lambda$PortraitModePresenter$9GpHajfv3YungRL4vtW189jz6Vg.INSTANCE).j(ajfu.a).a((ajdw) this.v.l()).f(new -$$Lambda$PortraitModePresenter$K-MWboPCRRaNWR4mMXOh3oQNZSc(this)));
        return ajei;
    }
}
