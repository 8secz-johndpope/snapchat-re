package com.snap.identity.ui.legal.pages.terms;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.snapchat.android.R;
import defpackage.abpz;
import defpackage.abqi;
import defpackage.aipn;
import defpackage.akcr;
import defpackage.ilv;
import defpackage.ind;
import defpackage.j;
import defpackage.jjl;
import defpackage.jjs;
import defpackage.jju;
import defpackage.k;
import defpackage.s;
import defpackage.zke;
import defpackage.zll;

public final class TermsOfUsePresenter extends zll<jju> implements k {
    final aipn<zke> a;
    private final Context b;
    private final aipn<ilv> c;

    static final class a implements OnClickListener {
        private /* synthetic */ TermsOfUsePresenter a;

        a(TermsOfUsePresenter termsOfUsePresenter) {
            this.a = termsOfUsePresenter;
        }

        public final void onClick(View view) {
            ((zke) this.a.a.get()).a(new jjs());
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ TermsOfUsePresenter a;

        b(TermsOfUsePresenter termsOfUsePresenter) {
            this.a = termsOfUsePresenter;
        }

        public final void onClick(View view) {
            ((zke) this.a.a.get()).a(new jjl());
        }
    }

    public TermsOfUsePresenter(Context context, aipn<zke> aipn, aipn<ilv> aipn2) {
        akcr.b(context, "context");
        akcr.b(aipn, "eventDispatcher");
        akcr.b(aipn2, "graphene");
        this.b = context;
        this.a = aipn;
        this.c = aipn2;
    }

    /* renamed from: a */
    public final void takeTarget(jju jju) {
        akcr.b(jju, "target");
        super.takeTarget(jju);
        jju.getLifecycle().a(this);
    }

    public final void dropTarget() {
        super.dropTarget();
        jju jju = (jju) getTarget();
        if (jju != null) {
            j lifecycle = jju.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onTargetCreate() {
        ((ilv) this.c.get()).c(ind.TOU_SHOW.a("version", "7"), 1);
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        jju jju = (jju) getTarget();
        if (jju != null) {
            jju.g().setOnClickListener(null);
            jju.b().setOnClickListener(null);
        }
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        jju jju = (jju) getTarget();
        if (jju != null) {
            jju.f().setText(this.b.getString(R.string.tou_v7_title_emoji, new Object[]{abqi.a(abpz.WAVING_HAND)}));
        }
        jju = (jju) getTarget();
        if (jju != null) {
            jju.g().setOnClickListener(new a(this));
            jju.b().setOnClickListener(new b(this));
        }
    }
}
