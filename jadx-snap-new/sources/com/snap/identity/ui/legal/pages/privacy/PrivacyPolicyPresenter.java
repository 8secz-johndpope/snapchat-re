package com.snap.identity.ui.legal.pages.privacy;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.snapchat.android.R;
import defpackage.abtp;
import defpackage.aipn;
import defpackage.akcr;
import defpackage.j;
import defpackage.jjk;
import defpackage.jjm;
import defpackage.jjt;
import defpackage.k;
import defpackage.s;
import defpackage.zke;
import defpackage.zll;

public final class PrivacyPolicyPresenter extends zll<jjt> implements k {
    final aipn<zke> a;
    private final Context b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ PrivacyPolicyPresenter a;

        b(PrivacyPolicyPresenter privacyPolicyPresenter) {
            this.a = privacyPolicyPresenter;
        }

        public final void onClick(View view) {
            ((zke) this.a.a.get()).a(new jjm());
        }
    }

    static final class c implements OnClickListener {
        private /* synthetic */ PrivacyPolicyPresenter a;

        c(PrivacyPolicyPresenter privacyPolicyPresenter) {
            this.a = privacyPolicyPresenter;
        }

        public final void onClick(View view) {
            ((zke) this.a.a.get()).a(new jjk());
        }
    }

    static {
        a aVar = new a();
    }

    public PrivacyPolicyPresenter(Context context, aipn<zke> aipn) {
        akcr.b(context, "context");
        akcr.b(aipn, "eventDispatcher");
        this.b = context;
        this.a = aipn;
    }

    /* renamed from: a */
    public final void takeTarget(jjt jjt) {
        akcr.b(jjt, "target");
        super.takeTarget(jjt);
        jjt.getLifecycle().a(this);
    }

    public final void dropTarget() {
        super.dropTarget();
        jjt jjt = (jjt) getTarget();
        if (jjt != null) {
            j lifecycle = jjt.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        jjt jjt = (jjt) getTarget();
        if (jjt != null) {
            jjt.b().setOnClickListener(null);
            jjt.f().setOnClickListener(null);
        }
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        float c = abtp.c(this.b);
        int i = c <= 450.0f ? R.drawable.tos_quarterheight_illustration : c <= 800.0f ? R.drawable.tos_halfheight_illustration : R.drawable.tos_fullheight_illustration;
        jjt jjt = (jjt) getTarget();
        if (jjt != null) {
            ImageView g = jjt.g();
            if (g != null) {
                g.setImageResource(i);
            }
        }
        jjt jjt2 = (jjt) getTarget();
        if (jjt2 != null) {
            jjt2.b().setOnClickListener(new b(this));
            jjt2.f().setOnClickListener(new c(this));
        }
    }
}
