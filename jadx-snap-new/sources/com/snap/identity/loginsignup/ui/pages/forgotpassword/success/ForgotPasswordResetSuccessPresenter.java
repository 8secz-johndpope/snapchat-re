package com.snap.identity.loginsignup.ui.pages.forgotpassword.success;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.snap.identity.api.sharedui.ProgressButton;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.akcr;
import defpackage.izn;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jeb;
import defpackage.jfq;
import defpackage.k;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;

public final class ForgotPasswordResetSuccessPresenter extends zll<jfq> implements k {
    String a = "";
    final aipn<Context> b;
    private final zfw c = zgb.a(jbv.y.callsite(jbv.t.b()));
    private final aipn<zke> d;
    private final aipn<jbw> e;

    static final class a implements OnClickListener {
        private /* synthetic */ ForgotPasswordResetSuccessPresenter a;

        a(ForgotPasswordResetSuccessPresenter forgotPasswordResetSuccessPresenter) {
            this.a = forgotPasswordResetSuccessPresenter;
        }

        public final void onClick(View view) {
            this.a.a();
        }
    }

    static final class b<T> implements ajfb<jeb> {
        private /* synthetic */ ForgotPasswordResetSuccessPresenter a;

        b(ForgotPasswordResetSuccessPresenter forgotPasswordResetSuccessPresenter) {
            this.a = forgotPasswordResetSuccessPresenter;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            jeb jeb = (jeb) obj;
            this.a.a = jeb.D;
        }
    }

    public ForgotPasswordResetSuccessPresenter(aipn<Context> aipn, aipn<zke> aipn2, aipn<jbw> aipn3, zgb zgb) {
        akcr.b(aipn, "context");
        akcr.b(aipn2, "eventDispatcher");
        akcr.b(aipn3, "store");
        akcr.b(zgb, "schedulersProvider");
        this.b = aipn;
        this.d = aipn2;
        this.e = aipn3;
    }

    public final void a() {
        ((zke) this.d.get()).a(new izn(this.a));
    }

    /* renamed from: a */
    public final void takeTarget(jfq jfq) {
        akcr.b(jfq, "target");
        super.takeTarget(jfq);
        jfq.getLifecycle().a(this);
    }

    public final void dropTarget() {
        Object obj = (jfq) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        zln.bindTo$default(this, ((jbw) this.e.get()).a().a((ajdw) this.c.l()).f((ajfb) new b(this)), this, null, null, 6, null);
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onPause() {
        jfq jfq = (jfq) getTarget();
        if (jfq != null) {
            ProgressButton a = jfq.a();
            if (a != null) {
                a.setOnClickListener(null);
            }
        }
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        jfq jfq = (jfq) getTarget();
        if (jfq != null) {
            ProgressButton a = jfq.a();
            if (a != null) {
                a.setOnClickListener(new a(this));
            }
        }
    }
}
