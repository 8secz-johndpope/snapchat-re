package com.snap.camera.subcomponents.cameramode;

import com.google.common.base.Optional;
import defpackage.ablc;
import defpackage.aipn;
import defpackage.ajdp;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajek;
import defpackage.ajwl;
import defpackage.dnd;
import defpackage.dva;
import defpackage.ebk;
import defpackage.eeb;
import defpackage.eec;
import defpackage.eed;
import defpackage.eef.a;
import defpackage.eef.b;
import defpackage.eoe;
import defpackage.ftl;
import defpackage.j;
import defpackage.k;
import defpackage.s;
import defpackage.t;

public class CameraModeContainerPresenter implements a, k {
    public eoe a;
    public b b;
    public eed.a c;
    public ajwl<Boolean> d;
    public ajdp<eec> e;
    public ajwl<Optional<eeb>> f;
    public ajdp<Optional<eeb>> g;
    public ajdp<dva> h;
    public ftl i;
    public ajdp<ebk> j;
    public aipn<ablc> k;

    private void a(boolean z) {
        this.b.a(z);
        this.d.a(Boolean.valueOf(z));
    }

    private void b() {
        a(false);
        if (!((Optional) this.f.p()).asSet().contains(eeb.BATCH_CAPTURE)) {
            this.f.a(Optional.absent());
        }
    }

    private void c() {
        t.i.getLifecycle().b(this);
    }

    private static /* synthetic */ boolean d(ebk ebk) {
        return ebk == ebk.REQUESTED;
    }

    public final void a() {
        a(((Boolean) this.d.p()).booleanValue() ^ 1);
        ((ablc) this.k.get()).a(ablc.a.DROP_DOWN);
    }

    /* Access modifiers changed, original: 0000 */
    @s(a = j.a.ON_STOP)
    public void onApplicationBackground() {
        b();
    }

    public ajej start() {
        t.i.getLifecycle().a(this);
        ajei ajei = new ajei();
        ajei.a(ajek.a(new -$$Lambda$CameraModeContainerPresenter$zbsYTjZ8jpHqNm446nTLZEdfdRg(this)));
        ajei.a(this.b.a().f(new -$$Lambda$CameraModeContainerPresenter$wdslgZMPNU_SfbkgvoGCY6n54D8(this)));
        ajei.a(this.b.b().f(new -$$Lambda$CameraModeContainerPresenter$c6tma_teu_3yzbq9YkfpHrO8QC8(this)));
        ajei.a(this.c.a.f(new -$$Lambda$CameraModeContainerPresenter$B9YcZpGLrFDqPO1o1o3pkDPO_Ds(this)));
        ajei.a(this.g.a(-$$Lambda$Ak8QL176mRumGTfug98PPjKgiWY.INSTANCE).f(new -$$Lambda$CameraModeContainerPresenter$fwbYsaJ3E1GdN1XGlDff80hTZYo(this)));
        ajei.a(this.h.a(-$$Lambda$CameraModeContainerPresenter$r9xInWeGKjKVeTI0rCwW6yWPuCk.INSTANCE).f(new -$$Lambda$CameraModeContainerPresenter$GGrayKYhZTgGfOmGR-d9PCmIJz8(this)));
        ajei.a(this.j.a(-$$Lambda$CameraModeContainerPresenter$Sd1F8_XIvSntbg4gooTYekIB0PE.INSTANCE).f(new -$$Lambda$CameraModeContainerPresenter$n14P4dAqC8DB62nJvjVO3kGgRqw(this)));
        ajei.a(this.e.f(new -$$Lambda$CameraModeContainerPresenter$3hSzeTtS21p-gmbL3ohIzk4DaKM(this)));
        ajei.a(this.i.p(dnd.RESET_AFTER_CAPTURE).a(-$$Lambda$CameraModeContainerPresenter$tvOmL4OhdhtAF0QnaQCKbiGT57M.INSTANCE).d().b(new -$$Lambda$CameraModeContainerPresenter$8XJiuqr1f21j3cnuJx3eccKuaO4(this)).a(-$$Lambda$CameraModeContainerPresenter$JH1piGTqjz3_OXg1anKdORMWsy8.INSTANCE).f(new -$$Lambda$CameraModeContainerPresenter$r78OuJErF3yqLZ1MtfK2X68XEYM(this)));
        ajei.a(this.a.start());
        return ajei;
    }
}
