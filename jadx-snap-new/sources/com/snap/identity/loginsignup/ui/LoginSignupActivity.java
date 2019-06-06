package com.snap.identity.loginsignup.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity;
import com.snap.tweaks.ui.TweaksUITapDetector;
import com.snapchat.deck.views.DeckView;
import defpackage.abme;
import defpackage.abmf;
import defpackage.abmg;
import defpackage.abss;
import defpackage.achb;
import defpackage.aipn;
import defpackage.aipq;
import defpackage.aipr;
import defpackage.aipy;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajzs;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.fv;
import defpackage.fwx;
import defpackage.gpz;
import defpackage.gqd;
import defpackage.ifs;
import defpackage.ifx;
import defpackage.ise;
import defpackage.jag;
import defpackage.jag.y;
import defpackage.jbj;
import defpackage.jbk;
import defpackage.jbp;
import defpackage.jbt;
import defpackage.jbu;
import defpackage.jbw;
import defpackage.jea;
import defpackage.jig;
import defpackage.ppm;
import defpackage.sec;
import defpackage.zgb;
import defpackage.zgi;
import defpackage.zgk;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjs;
import defpackage.zjt;
import defpackage.zkf;
import java.util.Set;

public final class LoginSignupActivity extends ScopedFragmentActivity implements abmg, aipy {
    public zgb A;
    public ajwy<ise> B;
    private DeckView E;
    private final ajxe F = ajxh.a(new c(this));
    public aipn<achb<zjm, zjk>> i;
    public aipn<aipr<fv>> j;
    public aipn<fwx> k;
    public aipn<jag> l;
    public aipn<zkf> m;
    public aipn<jbw> n;
    public aipn<jea> o;
    public aipn<ifs> p;
    public aipn<Set<zgi>> q;
    public aipn<jbk> r;
    public ajwy<abss> s;
    public aipn<TweaksUITapDetector> t;
    public aipn<jbp> u;
    public aipn<jbt> v;
    public aipn<abme> w;
    public aipn<jbj> x;
    public gpz y;
    public ajwy<ppm> z;

    static final class a<T> implements ajfb<jbu> {
        private /* synthetic */ LoginSignupActivity a;

        a(LoginSignupActivity loginSignupActivity) {
            this.a = loginSignupActivity;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (jbu) obj;
            LoginSignupActivity loginSignupActivity = this.a;
            akcr.a(obj, "completionSource");
            aipn aipn = loginSignupActivity.k;
            if (aipn == null) {
                akcr.a("intentFactory");
            }
            loginSignupActivity.sendBroadcast(((fwx) aipn.get()).a("snap.intent.action.LOGIN_COMPLETE"));
            aipn = loginSignupActivity.v;
            if (aipn == null) {
                akcr.a("loginSignupCompletionHandler");
            }
            ((jbt) aipn.get()).a(loginSignupActivity, obj);
        }
    }

    static final class b<T> implements ajwy<Set<? extends gqd>> {
        final /* synthetic */ zjt a;

        /* renamed from: com.snap.identity.loginsignup.ui.LoginSignupActivity$b$1 */
        static final class AnonymousClass1<T> implements ajwy<zjt> {
            private /* synthetic */ b a;

            AnonymousClass1(b bVar) {
                this.a = bVar;
            }

            public final /* bridge */ /* synthetic */ Object get() {
                return this.a.a;
            }
        }

        b(zjt zjt) {
            this.a = zjt;
        }

        public final /* synthetic */ Object get() {
            return ajzs.a(new zjs(new AnonymousClass1(this)));
        }
    }

    static final class c extends akcs implements akbk<ise> {
        private /* synthetic */ LoginSignupActivity a;

        c(LoginSignupActivity loginSignupActivity) {
            this.a = loginSignupActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajwy ajwy = this.a.B;
            if (ajwy == null) {
                akcr.a("regPushAnalyticsProvider");
            }
            return (ise) ajwy.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(LoginSignupActivity.class), "regPushAnalytics", "getRegPushAnalytics()Lcom/snap/identity/api/analytics/RegistrationReengagementPushAnalyticsApi;");
    }

    private final void a(Intent intent) {
        if (intent != null) {
            boolean z = false;
            if (intent.getBooleanExtra("fromServerNotification", false) && akcr.a(intent.getStringExtra("type"), sec.REGISTRATION_REENGAGEMENT.name())) {
                z = true;
            }
            if (z) {
                d().d();
            }
        }
    }

    private final ise d() {
        return (ise) this.F.b();
    }

    public final aipq<fv> c() {
        aipn aipn = this.j;
        if (aipn == null) {
            akcr.a("dispatchingFragmentInjector");
        }
        Object obj = aipn.get();
        akcr.a(obj, "dispatchingFragmentInjector.get()");
        return (aipq) obj;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        aipn aipn = this.t;
        if (aipn == null) {
            akcr.a("tweaksUITapDetector");
        }
        aipn.get();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final <T extends abmf> T getTestBridge(Class<T> cls) {
        akcr.b(cls, "bridgeClass");
        aipn aipn = this.w;
        if (aipn == null) {
            akcr.a("testDependency");
        }
        return ((abme) aipn.get()).getTestBridge(cls);
    }

    public final void onBackPressed() {
        aipn aipn = this.i;
        if (aipn == null) {
            akcr.a("navigationHost");
        }
        if (!((achb) aipn.get()).e()) {
            super.onBackPressed();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x00c0 in {2, 5, 8, 11, 16, 18, 20, 24, 25, 27} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void onCreate(android.os.Bundle r4) {
        /*
        r3 = this;
        r0 = r3;
        r0 = (android.app.Activity) r0;
        defpackage.aipp.a(r0);
        super.onCreate(r4);
        r4 = 2131558442; // 0x7f0d002a float:1.87422E38 double:1.0531297983E-314;
        r3.setContentView(r4);
        r4 = 2131428231; // 0x7f0b0387 float:1.84781E38 double:1.0530654655E-314;
        r4 = r3.findViewById(r4);
        r0 = "findViewById(R.id.deckView)";
        defpackage.akcr.a(r4, r0);
        r4 = (com.snapchat.deck.views.DeckView) r4;
        r3.E = r4;
        r4 = r3.getIntent();
        r3.a(r4);
        r4 = r3.m;
        if (r4 != 0) goto L_0x002f;
        r0 = "rxBus";
        defpackage.akcr.a(r0);
        r4 = r4.get();
        r4 = (defpackage.zkf) r4;
        r0 = r3.l;
        r1 = "loginSignupCoordinator";
        if (r0 != 0) goto L_0x003e;
        defpackage.akcr.a(r1);
        r0 = r0.get();
        r4 = r4.a(r0);
        r0 = r3;
        r0 = (com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity) r0;
        r2 = com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b.ON_DESTROY;
        com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.a(r3, r4, r0, r2);
        r4 = r3.l;
        if (r4 != 0) goto L_0x0055;
        defpackage.akcr.a(r1);
        r4 = r4.get();
        r4 = (defpackage.jag) r4;
        r4 = r4.a;
        r2 = defpackage.ajef.a();
        r4 = r4.a(r2);
        r2 = new com.snap.identity.loginsignup.ui.LoginSignupActivity$a;
        r2.<init>(r3);
        r2 = (defpackage.ajfb) r2;
        r4 = r4.e(r2);
        r2 = com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b.ON_DESTROY;
        com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.a(r3, r4, r0, r2);
        r4 = r3.l;
        if (r4 != 0) goto L_0x007c;
        defpackage.akcr.a(r1);
        r4 = r4.get();
        r4 = (defpackage.ajej) r4;
        r1 = com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b.ON_DESTROY;
        com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.a(r3, r4, r0, r1);
        r4 = "notification";
        r4 = r3.getSystemService(r4);
        if (r4 == 0) goto L_0x00b8;
        r4 = (android.app.NotificationManager) r4;
        r4.cancelAll();	 Catch:{ SecurityException -> 0x0094 }
        r4 = r3.q;
        if (r4 != 0) goto L_0x009d;
        r0 = "activityLifecycleObservers";
        defpackage.akcr.a(r0);
        r4 = r4.get();
        r4 = (java.util.Set) r4;
        r4 = r4.iterator();
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00b7;
        r0 = r4.next();
        r0 = (defpackage.zgi) r0;
        r0.h();
        goto L_0x00a7;
        return;
        r4 = new ajxt;
        r0 = "null cannot be cast to non-null type android.app.NotificationManager";
        r4.<init>(r0);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.LoginSignupActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        super.onDestroy();
        aipn aipn = this.n;
        if (aipn == null) {
            akcr.a("store");
        }
        ((jbw) aipn.get()).l();
        aipn = this.o;
        if (aipn == null) {
            akcr.a("mPersistentSessionService");
        }
        ((jea) aipn.get()).e.a();
        aipn = this.r;
        if (aipn == null) {
            akcr.a("loginSignupAnalytics");
        }
        ((jbk) aipn.get()).a.a();
        aipn = this.u;
        if (aipn == null) {
            akcr.a("signupFriendSuggestionMetadataService");
        }
        ((jbp) aipn.get()).c.a();
        aipn = this.x;
        if (aipn == null) {
            akcr.a("installAnalyticsService");
        }
        jbj jbj = (jbj) aipn.get();
        jbj.g.a((Object) "");
        jbj.a.a();
        gpz gpz = this.y;
        if (gpz == null) {
            akcr.a("crashBreadcrumbProviderFactory");
        }
        gpz.c = null;
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent);
        setIntent(intent);
    }

    public final void onPause() {
        super.onPause();
        aipn aipn = this.x;
        if (aipn == null) {
            akcr.a("installAnalyticsService");
        }
        ((jbj) aipn.get()).a(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        aipn aipn = this.i;
        String str = "navigationHost";
        if (aipn == null) {
            akcr.a(str);
        }
        achb achb = (achb) aipn.get();
        DeckView deckView = this.E;
        if (deckView == null) {
            akcr.a("deckView");
        }
        achb.a(deckView);
        aipn = this.i;
        if (aipn == null) {
            akcr.a(str);
        }
        ((achb) aipn.get()).a(null, null, null);
        zgk zgk = this.D;
        aipn aipn2 = this.i;
        if (aipn2 == null) {
            akcr.a(str);
        }
        Object obj = aipn2.get();
        akcr.a(obj, "navigationHost.get()");
        achb achb2 = (achb) obj;
        ajwy ajwy = this.z;
        if (ajwy == null) {
            akcr.a("memoryInfo");
        }
        zgb zgb = this.A;
        if (zgb == null) {
            akcr.a("schedulersProvider");
        }
        zjt zjt = new zjt(zgk, achb2, ajwy, zgb);
        zjt.c();
        gpz gpz = this.y;
        if (gpz == null) {
            akcr.a("crashBreadcrumbProviderFactory");
        }
        ajwy bVar = new b(zjt);
        akcr.b(bVar, "crashBreadcrumbProviders");
        gpz.c = bVar;
        aipn = this.l;
        if (aipn == null) {
            akcr.a("loginSignupCoordinator");
        }
        jag jag = (jag) aipn.get();
        ajcx a = ((jbw) jag.h.get()).b().a((ajdw) jag.d.l());
        Object e = ((jig) jag.v.get()).a.c((ajfb) defpackage.jig.b.a).e();
        akcr.a(e, "sharedPreferences.doOnSu…        }.ignoreElement()");
        Object d = a.b((ajdb) e).a((ajdw) jag.d.f()).a((ajdt) ((jbw) jag.h.get()).a()).d().a((ajdw) jag.d.l()).c((ajfb) new y(jag)).d();
        akcr.a(d, "store.get().init()\n     …         .ignoreElement()");
        ScopedFragmentActivity.a(this, d.e(), this, com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b.ON_DESTROY);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        akcr.b(strArr, "permissions");
        akcr.b(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        aipn aipn = this.p;
        if (aipn == null) {
            akcr.a("permissionHelper");
        }
        ((ifs) aipn.get()).a(ifx.a(this, i, strArr, iArr));
    }

    public final void onResume() {
        super.onResume();
        aipn aipn = this.q;
        if (aipn == null) {
            akcr.a("activityLifecycleObservers");
        }
        for (zgi i : (Set) aipn.get()) {
            i.i();
        }
    }
}
