package com.snap.shake2report.ui;

import android.app.Activity;
import android.os.Bundle;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity;
import com.snapchat.android.R;
import com.snapchat.deck.views.DeckView;
import defpackage.aazr;
import defpackage.achb;
import defpackage.achg;
import defpackage.aciv;
import defpackage.aily;
import defpackage.aipn;
import defpackage.aipp;
import defpackage.aipq;
import defpackage.aipr;
import defpackage.aipy;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajef;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajvv;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.fv;
import defpackage.gvr;
import defpackage.wqp;
import defpackage.wqv;
import defpackage.wtq;
import defpackage.wvl;
import defpackage.wvt;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkf;

public final class Shake2ReportActivity extends ScopedFragmentActivity implements aipy {
    public aipr<fv> i;
    public achb<zjm, zjk> j;
    public aipn<wqp> k;
    public aipn<wvt> l;
    public aipn<zkf> m;
    public aipn<wtq> n;
    public aipn<zgb> o;
    public aipn<wvl> p;
    private DeckView q;
    private final ajxe r = ajxh.a(new c(this));
    private final ajei s = new ajei();

    static final class a implements ajev {
        private /* synthetic */ Shake2ReportActivity a;

        a(Shake2ReportActivity shake2ReportActivity) {
            this.a = shake2ReportActivity;
        }

        public final void run() {
            aipn aipn = this.a.n;
            if (aipn == null) {
                akcr.a("shake2ReportFileManager");
            }
            wtq wtq = (wtq) aipn.get();
            aipn aipn2 = this.a.p;
            if (aipn2 == null) {
                akcr.a("reportConfigProvider");
            }
            String str = ((wvl) aipn2.get()).a;
            if (str == null) {
                akcr.a();
            }
            wtq.m(str);
        }
    }

    static final class b implements ajev {
        private /* synthetic */ Shake2ReportActivity a;

        b(Shake2ReportActivity shake2ReportActivity) {
            this.a = shake2ReportActivity;
        }

        public final void run() {
            this.a.finish();
        }
    }

    static final class c extends akcs implements akbk<zfw> {
        private /* synthetic */ Shake2ReportActivity a;

        c(Shake2ReportActivity shake2ReportActivity) {
            this.a = shake2ReportActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            aipn aipn = this.a.o;
            if (aipn == null) {
                akcr.a("schedulerProvider");
            }
            aipn.get();
            return zgb.a(wqv.g, "Shake2ReportActivity");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(Shake2ReportActivity.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public final aipq<fv> c() {
        aipr aipr = this.i;
        if (aipr == null) {
            akcr.a("fragmentInjector");
        }
        return aipr;
    }

    public final void onBackPressed() {
        achb achb = this.j;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        aciv i = achb.i();
        if (akcr.a(i != null ? (zjm) i.e() : null, wqv.a)) {
            aipn aipn = this.p;
            str = "reportConfigProvider";
            if (aipn == null) {
                akcr.a(str);
            }
            String str2 = "blizzardAnalyticsHelper";
            wqp wqp;
            aipn aipn2;
            if (((wvl) aipn.get()).c == aily.IN_SETTING_REPORT) {
                aipn = this.k;
                if (aipn == null) {
                    akcr.a(str2);
                }
                wqp = (wqp) aipn.get();
                aipn2 = this.p;
                if (aipn2 == null) {
                    akcr.a(str);
                }
                String str3 = ((wvl) aipn2.get()).a;
                if (str3 == null) {
                    akcr.a();
                }
                aipn aipn3 = this.p;
                if (aipn3 == null) {
                    akcr.a(str);
                }
                str = ((wvl) aipn3.get()).o;
                if (str == null) {
                    str = "";
                }
                wqp.b(str3, str);
            } else {
                aipn = this.k;
                if (aipn == null) {
                    akcr.a(str2);
                }
                wqp = (wqp) aipn.get();
                aipn2 = this.p;
                if (aipn2 == null) {
                    akcr.a(str);
                }
                str = ((wvl) aipn2.get()).a;
                if (str == null) {
                    akcr.a();
                }
                wqp.a(str, aazr.FEEDBACK_PAGE);
            }
            ajej e = ajcx.a((ajev) new a(this)).b((ajdw) ((zfw) this.r.b()).f()).e();
            akcr.a((Object) e, "Completable.fromAction {…             .subscribe()");
            ajvv.a(e, this.s);
            super.onBackPressed();
            return;
        }
        achb = this.j;
        if (achb == null) {
            akcr.a(str);
        }
        achb.a((achg) wqv.a, false, true, null);
    }

    public final void onCreate(Bundle bundle) {
        gvr.a.incrementAndGet();
        aipp.a((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.s2r_activity);
        Object findViewById = findViewById(R.id.s2r_deckView);
        akcr.a(findViewById, "findViewById(R.id.s2r_deckView)");
        this.q = (DeckView) findViewById;
        aipn aipn = this.l;
        String str = "shake2ReportUiCoordinator";
        if (aipn == null) {
            akcr.a(str);
        }
        ajej g = ((wvt) aipn.get()).a.a(ajef.a()).g(new b(this));
        ScopedFragmentActivity scopedFragmentActivity = this;
        ScopedFragmentActivity.a(this, g, scopedFragmentActivity, com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b.ON_DESTROY);
        aipn = this.m;
        if (aipn == null) {
            akcr.a("rxBus");
        }
        zkf zkf = (zkf) aipn.get();
        aipn aipn2 = this.l;
        if (aipn2 == null) {
            akcr.a(str);
        }
        ScopedFragmentActivity.a(this, zkf.a(aipn2.get()), scopedFragmentActivity, com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b.ON_DESTROY);
        aipn = this.l;
        if (aipn == null) {
            akcr.a(str);
        }
        ScopedFragmentActivity.a(this, (ajej) aipn.get(), scopedFragmentActivity, com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b.ON_DESTROY);
    }

    public final void onDestroy() {
        super.onDestroy();
        aipn aipn = this.l;
        if (aipn == null) {
            akcr.a("shake2ReportUiCoordinator");
        }
        ((wvt) aipn.get()).dispose();
        gvr.a.decrementAndGet();
        this.s.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        achb achb = this.j;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        DeckView deckView = this.q;
        if (deckView == null) {
            akcr.a("deckView");
        }
        achb.a(deckView);
        achb = this.j;
        if (achb == null) {
            akcr.a(str);
        }
        achb.a(null, null, null);
    }
}
