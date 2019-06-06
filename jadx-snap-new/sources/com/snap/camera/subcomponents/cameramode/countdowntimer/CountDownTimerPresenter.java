package com.snap.camera.subcomponents.cameramode.countdowntimer;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import defpackage.ablc;
import defpackage.aipn;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajek;
import defpackage.ajfb;
import defpackage.ajfu;
import defpackage.ajwl;
import defpackage.ajwo;
import defpackage.ajws;
import defpackage.dnd;
import defpackage.dnh;
import defpackage.dpu;
import defpackage.ebk;
import defpackage.eeb;
import defpackage.eec;
import defpackage.efj.a;
import defpackage.efj.b;
import defpackage.ftl;
import defpackage.j;
import defpackage.k;
import defpackage.s;
import defpackage.t;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zkr;

public class CountDownTimerPresenter implements a, k {
    public b a;
    public ajdp<ebk> b;
    public zgb c;
    public ajdp<Boolean> d;
    public ajwo<eec> e;
    public ajdp<Optional<eeb>> f;
    public Supplier<Optional<eeb>> g;
    public ajws<Runnable> h;
    public ajfb<dpu> i;
    public ftl j;
    public aipn<ablc> k;
    public zkr l;
    private ajwl<Boolean> m = ajwl.i(Boolean.FALSE);
    private boolean n = false;

    private void b() {
        this.m.a(Boolean.FALSE);
        this.a.b(false);
    }

    private void c() {
        t.i.getLifecycle().b(this);
    }

    private /* synthetic */ boolean f(ebk ebk) {
        return ebk == ebk.REQUESTED && ((Boolean) this.m.p()).booleanValue();
    }

    private /* synthetic */ void g(ebk ebk) {
        b();
    }

    private static /* synthetic */ boolean h(ebk ebk) {
        return ebk == ebk.PRESENTING_CAPTURE_RESULT;
    }

    public void a() {
        ajwl ajwl = this.m;
        ajwl.a(Boolean.valueOf(((Boolean) ajwl.p()).booleanValue() ^ 1));
        this.e.a(new eec(eeb.TIMER, ((Boolean) this.m.p()).booleanValue()));
        ((ablc) this.k.get()).a(ablc.a.TIMER);
    }

    /* Access modifiers changed, original: 0000 */
    @s(a = j.a.ON_STOP)
    public void onApplicationBackground() {
        b();
    }

    public ajej start() {
        t.i.getLifecycle().a(this);
        zfw a = zgb.a(dnh.f.callsite("CountDownTimerPresenter"));
        ajei ajei = new ajei();
        ajei.a(ajek.a(new -$$Lambda$CountDownTimerPresenter$Yb8Whf2gutC8EqsjdVlrF7-z2pU(this)));
        ajei.a(this.l.a().f(new -$$Lambda$CountDownTimerPresenter$NId9EXXtpzPj06_PXTIDDOyeRvA(this)));
        ajei.a(this.a.a().f(new -$$Lambda$CountDownTimerPresenter$bpI6GpOSRiHNT05SbBiFZBGqsOY(this)));
        ajei.a(this.f.p(-$$Lambda$CountDownTimerPresenter$oW7OgVABQMF2rooJgkrVVnqk-fc.INSTANCE).j(ajfu.a).a(-$$Lambda$CountDownTimerPresenter$K0Wtescm0wQ5LtLQLcyEW0SjXpI.INSTANCE).f(new -$$Lambda$CountDownTimerPresenter$u6fXJ3DzVGQPYvKZpEfIG0Ippp0(this)));
        ajei.a(this.d.j(ajfu.a).f(new -$$Lambda$CountDownTimerPresenter$h189g8J1YQCf-VfcwAwYytsybF4(this)));
        ajdp j = this.m.j(ajfu.a);
        b bVar = this.a;
        bVar.getClass();
        ajei.a(j.f(new -$$Lambda$QLu2U21vb8A66alKQ1LjXSD6EwI(bVar)));
        ajei.a(this.j.p(dnd.RESET_AFTER_CAPTURE).a(-$$Lambda$CountDownTimerPresenter$HtlaWl9rXwqZU2UUVRKnxlpBL5o.INSTANCE).d().b(new -$$Lambda$CountDownTimerPresenter$IH8mbg0J2WkZfPNKRJFwU12aL5I(this)).a(-$$Lambda$CountDownTimerPresenter$XKudIjYbbvA8Cug4LzIFUIdjibk.INSTANCE).f(new -$$Lambda$CountDownTimerPresenter$2qNs3c4c-hoJ04xWt58IiLF2GiM(this)));
        ajei.a(this.b.a(new -$$Lambda$CountDownTimerPresenter$8BF5qMOvkcYTpfNo6jHHcpy9J80(this)).a((ajdw) a.l()).f(new -$$Lambda$CountDownTimerPresenter$uORv7Tm7okYy56RLRkdykEi85SI(this)));
        ajei.a(this.b.a(new -$$Lambda$CountDownTimerPresenter$Blr3D-P68JKzAizETVnGDSEPe1g(this)).a((ajdw) a.l()).f(new -$$Lambda$CountDownTimerPresenter$5hfjUI2iuSxUQqlDuPA6HFJbjQU(this)));
        ajei.a(this.b.a(-$$Lambda$CountDownTimerPresenter$vvv8qp7TdPzP1oTgpA3VQOjMcWA.INSTANCE).a((ajdw) a.l()).f(new -$$Lambda$CountDownTimerPresenter$inJApKKSUY-u6Bajy9S2wTg9pFw(this)));
        return ajei;
    }
}
