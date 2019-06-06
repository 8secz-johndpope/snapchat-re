package com.snap.identity.ui.legal;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import com.snapchat.android.R;
import com.snapchat.deck.views.DeckView;
import defpackage.achb;
import defpackage.aipn;
import defpackage.aipp;
import defpackage.aipq;
import defpackage.aipr;
import defpackage.aipy;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.fv;
import defpackage.itl;
import defpackage.jjn;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkf;

public final class LegalAgreementActivity extends ScopedFragmentActivity implements aipy {
    public itl i = itl.PrivacyPolicy;
    public aipn<achb<zjm, zjk>> j;
    public aipn<zkf> k;
    public aipn<jjn> l;
    public aipr<fv> m;
    private DeckView n;

    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ LegalAgreementActivity a;
        private /* synthetic */ Bundle b;

        a(LegalAgreementActivity legalAgreementActivity, Bundle bundle) {
            this.a = legalAgreementActivity;
            this.b = bundle;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            super.onCreate(this.b);
            return ajxw.a;
        }
    }

    public final /* synthetic */ aipq c() {
        aipr aipr = this.m;
        if (aipr == null) {
            akcr.a("fragmentDispatchingAndroidInjector");
        }
        return aipr;
    }

    public final void onBackPressed() {
        aipn aipn = this.j;
        if (aipn == null) {
            akcr.a("navigationHost");
        }
        if (!((achb) aipn.get()).e()) {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        aipp.a((Activity) this);
        defpackage.gvr.a.a(new a(this, bundle));
        Object stringExtra = getIntent().getStringExtra("REQUEST_LEGAL_AGREEMENT_TYPE");
        if (TextUtils.isEmpty((CharSequence) stringExtra)) {
            finish();
            return;
        }
        try {
            akcr.a(stringExtra, "typeName");
            this.i = itl.valueOf(stringExtra);
            setContentView(R.layout.activity_legal);
            stringExtra = findViewById(R.id.deckView);
            akcr.a(stringExtra, "findViewById(R.id.deckView)");
            this.n = (DeckView) stringExtra;
            aipn aipn = this.k;
            if (aipn == null) {
                akcr.a("rxBus");
            }
            zkf zkf = (zkf) aipn.get();
            aipn aipn2 = this.l;
            if (aipn2 == null) {
                akcr.a("legalAgreementCoordinator");
            }
            ScopedFragmentActivity.a(this, zkf.a(aipn2.get()), this, b.ON_DESTROY);
        } catch (IllegalArgumentException unused) {
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        aipn aipn = this.l;
        if (aipn == null) {
            akcr.a("legalAgreementCoordinator");
        }
        ((jjn) aipn.get()).a.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        aipn aipn = this.j;
        String str = "navigationHost";
        if (aipn == null) {
            akcr.a(str);
        }
        achb achb = (achb) aipn.get();
        DeckView deckView = this.n;
        if (deckView == null) {
            akcr.a("deckView");
        }
        achb.a(deckView);
        aipn = this.j;
        if (aipn == null) {
            akcr.a(str);
        }
        ((achb) aipn.get()).a(null, null, null);
    }
}
