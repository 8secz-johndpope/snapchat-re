package com.snap.identity.loginsignup.ui.pages.usernamesuggestion;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import defpackage.aipn;
import defpackage.akcr;
import defpackage.izq;
import defpackage.jbf;
import defpackage.jbw;
import defpackage.jgz;
import defpackage.k;
import defpackage.s;
import defpackage.zke;
import defpackage.zll;

public final class UsernameSuggestionPresenter extends zll<jgz> implements k {
    String a;
    final aipn<zke> b;
    final aipn<Context> c;
    private final aipn<jbw> d;

    static final class a implements OnClickListener {
        private /* synthetic */ UsernameSuggestionPresenter a;

        a(UsernameSuggestionPresenter usernameSuggestionPresenter) {
            this.a = usernameSuggestionPresenter;
        }

        public final void onClick(View view) {
            ((zke) this.a.b.get()).a(new izq());
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ UsernameSuggestionPresenter a;

        b(UsernameSuggestionPresenter usernameSuggestionPresenter) {
            this.a = usernameSuggestionPresenter;
        }

        public final void onClick(View view) {
            UsernameSuggestionPresenter usernameSuggestionPresenter = this.a;
            zke zke = (zke) usernameSuggestionPresenter.b.get();
            String str = usernameSuggestionPresenter.a;
            if (str == null) {
                akcr.a("usernameSuggestion");
            }
            zke.a(new jbf(str));
        }
    }

    public UsernameSuggestionPresenter(aipn<zke> aipn, aipn<Context> aipn2, aipn<jbw> aipn3) {
        akcr.b(aipn, "eventDispatcher");
        akcr.b(aipn2, "context");
        akcr.b(aipn3, "store");
        this.b = aipn;
        this.c = aipn2;
        this.d = aipn3;
    }

    /* renamed from: a */
    public final void takeTarget(jgz jgz) {
        akcr.b(jgz, "target");
        super.takeTarget(jgz);
        jgz.getLifecycle().a(this);
    }

    public final void dropTarget() {
        Object obj = (jgz) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        this.a = ((jbw) this.d.get()).c().s;
    }
}
