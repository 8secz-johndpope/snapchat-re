package com.snap.spectacles.lib.fragments.presenters;

import android.view.View;
import com.snap.spectacles.api.SpectaclesLifeCycleAwareStatusBarPresenterInterface;
import defpackage.abur;
import defpackage.achk;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.j;

public final class SpectaclesLifeCycleAwareStatusBarPresenter implements SpectaclesLifeCycleAwareStatusBarPresenterInterface {
    private j a;
    private final ajxe b;

    static final class a extends akcs implements akbk<SpectaclesStatusBarPresenter> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SpectaclesStatusBarPresenter) this.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(SpectaclesLifeCycleAwareStatusBarPresenter.class), "statusBarPresenter", "getStatusBarPresenter()Lcom/snap/spectacles/lib/fragments/presenters/SpectaclesStatusBarPresenter;");
    }

    public SpectaclesLifeCycleAwareStatusBarPresenter(ajwy<SpectaclesStatusBarPresenter> ajwy) {
        akcr.b(ajwy, "statusBarPresenterLazy");
        this.b = ajxh.a(new a(ajwy));
    }

    private final SpectaclesStatusBarPresenter b() {
        return (SpectaclesStatusBarPresenter) this.b.b();
    }

    public final void a() {
        SpectaclesStatusBarPresenter b = b();
        b.a.a();
        j jVar = b.b;
        if (jVar != null) {
            jVar.b(b);
        }
        b.d().b((achk) b);
        b.c = null;
        b.d = null;
        b.b = null;
        this.a = null;
    }

    public final void a(abur<View> abur) {
        String str = "statusBarView";
        akcr.b(abur, str);
        SpectaclesStatusBarPresenter b = b();
        j jVar = this.a;
        akcr.b(abur, str);
        b.d = abur;
        b.d().a((achk) b);
        b.b = jVar;
        j jVar2 = b.b;
        if (jVar2 != null) {
            jVar2.a(b);
        }
        b.f();
    }

    public final void a(j jVar) {
        akcr.b(jVar, "cycle");
        this.a = jVar;
    }
}
