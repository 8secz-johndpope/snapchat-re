package com.snap.identity.loginsignup.ui.pages.landing;

import android.content.Context;
import android.view.View;
import com.snap.core.db.record.LocalMessageActionModel;
import defpackage.aapz;
import defpackage.aipn;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.jaz;
import defpackage.jba;
import defpackage.jbk;
import defpackage.jft;
import defpackage.jfu;
import defpackage.k;
import defpackage.s;
import defpackage.zke;
import defpackage.zll;

public final class LandingPresenter extends zll<jfu> implements k {
    final aipn<Context> a;
    final aipn<zke> b;
    final jbk c;
    private final akbl<View, ajxw> d = new a(this);
    private final akbl<View, ajxw> e = new b(this);

    static final class a extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ LandingPresenter a;

        a(LandingPresenter landingPresenter) {
            this.a = landingPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ((zke) this.a.b.get()).a(new jaz(aapz.USERNAME_PASSWORD_LOGIN));
            return ajxw.a;
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ LandingPresenter a;

        b(LandingPresenter landingPresenter) {
            this.a = landingPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ((zke) this.a.b.get()).a(new jba());
            return ajxw.a;
        }
    }

    public LandingPresenter(aipn<Context> aipn, aipn<zke> aipn2, jbk jbk) {
        akcr.b(aipn, "context");
        akcr.b(aipn2, "eventDispatcher");
        akcr.b(jbk, LocalMessageActionModel.ANALYTICS);
        this.a = aipn;
        this.b = aipn2;
        this.c = jbk;
    }

    /* renamed from: a */
    public final void takeTarget(jfu jfu) {
        akcr.b(jfu, "target");
        super.takeTarget(jfu);
        jfu.getLifecycle().a(this);
    }

    public final void dropTarget() {
        Object obj = (jfu) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        jfu jfu = (jfu) getTarget();
        if (jfu != null) {
            jfu.a().setOnClickListener(null);
            jfu.b().setOnClickListener(null);
        }
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        jfu jfu = (jfu) getTarget();
        if (jfu != null) {
            jfu.a().setOnClickListener(new jft(this.d));
            jfu.b().setOnClickListener(new jft(this.e));
        }
    }
}
