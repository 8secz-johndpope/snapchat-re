package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.snap.spectacles.base.service.SpectaclesService.b;
import com.snap.spectacles.sharedui.SpectaclesIconView;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity;
import defpackage.xed.a;
import defpackage.xgk.as;
import defpackage.xgk.bd;
import defpackage.xgk.be;
import defpackage.xgk.l;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jcodec.containers.mp4.boxes.Box;

/* renamed from: xoc */
public final class xoc extends zgi implements achk<zjm, zjk> {
    final ajxe a = ajxh.a(b.a);
    final ajxe b;
    final ajxe c;
    final ajxe d;
    final ajxe e;
    int f;
    final ajei g;
    final AtomicBoolean h;
    final ajxe i;
    public AtomicBoolean j;
    ajxr<? extends acgw, ? extends achg, ? extends achg> k;
    private final ajxe l;
    private final ajxe m;
    private final ajxe n;
    private final ajxe o;
    private final ajxe p;
    private final ajxe q;
    private final ajxe r;
    private SpectaclesIconView s;
    private final ajxe t;

    /* renamed from: xoc$b */
    static final class b extends akcs implements akbk<idd> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return xai.f.callsite("SpectaclesActivityObserver");
        }
    }

    /* renamed from: xoc$v */
    static final class v extends akcs implements akbk<xbd> {
        private /* synthetic */ ajwy a;

        v(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xbd) this.a.get();
        }
    }

    /* renamed from: xoc$t */
    static final class t extends akcs implements akbk<zfw> {
        private /* synthetic */ xoc a;
        private /* synthetic */ ajwy b;

        t(xoc xoc, ajwy ajwy) {
            this.a = xoc;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.b.get();
            return zgb.a((idd) this.a.a.b());
        }
    }

    /* renamed from: xoc$r */
    static final class r extends akcs implements akbk<abss> {
        private /* synthetic */ ajwy a;

        r(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (abss) this.a.get();
        }
    }

    /* renamed from: xoc$j */
    static final class j extends akcs implements akbk<achb<zjm, zjk>> {
        private /* synthetic */ ajwy a;

        j(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (achb) this.a.get();
        }
    }

    /* renamed from: xoc$d */
    static final class d extends akcs implements akbk<xpg> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xpg) this.a.get();
        }
    }

    /* renamed from: xoc$c */
    static final class c extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    /* renamed from: xoc$q */
    static final class q extends akcs implements akbk<ifs> {
        private /* synthetic */ ajwy a;

        q(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ifs) this.a.get();
        }
    }

    /* renamed from: xoc$w */
    static final class w extends akcs implements akbk<xoo> {
        private /* synthetic */ ajwy a;

        w(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xoo) this.a.get();
        }
    }

    /* renamed from: xoc$a */
    static final class a extends akcs implements akbk<xmm> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xmm) this.a.get();
        }
    }

    /* renamed from: xoc$i */
    static final class i extends akcs implements akbk<xmu> {
        private /* synthetic */ ajwy a;

        i(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xmu) this.a.get();
        }
    }

    /* renamed from: xoc$x */
    static final class x extends akcs implements akbk<xaj> {
        private /* synthetic */ ajwy a;

        x(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xaj) this.a.get();
        }
    }

    /* renamed from: xoc$h */
    static final class h extends akcs implements akbk<ipt> {
        private /* synthetic */ ajwy a;

        h(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ipt) this.a.get();
        }
    }

    /* renamed from: xoc$s */
    static final class s extends akcs implements akbk<ajdw> {
        private /* synthetic */ xoc a;

        s(xoc xoc) {
            this.a = xoc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zfx.a((ajdw) this.a.d().f(), 1);
        }
    }

    /* renamed from: xoc$p */
    static final class p implements ajev {
        private /* synthetic */ xoc a;

        p(xoc xoc) {
            this.a = xoc;
        }

        public final void run() {
            this.a.e().b((achk) this.a);
            this.a.k = null;
        }
    }

    /* renamed from: xoc$l */
    static final class l<V> implements Callable<T> {
        private /* synthetic */ xoc a;

        l(xoc xoc) {
            this.a = xoc;
        }

        public final /* synthetic */ Object call() {
            Object e = this.a.c().e();
            e.a(e, (akbl) as.a);
            return ajxw.a;
        }
    }

    /* renamed from: xoc$m */
    static final class m<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ xoc a;

        m(xoc xoc) {
            this.a = xoc;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajxw) obj, "it");
            return ajdp.a(3, TimeUnit.SECONDS, this.a.g());
        }
    }

    /* renamed from: xoc$n */
    static final class n<T> implements ajfb<Long> {
        final /* synthetic */ xoc a;

        /* renamed from: xoc$n$1 */
        static final class 1<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ n a;

            1(n nVar) {
                this.a = nVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                obj = (Boolean) obj;
                akcr.b(obj, "hasUsedSpectacles");
                xoc xoc = this.a.a;
                AtomicBoolean atomicBoolean = new AtomicBoolean(obj.booleanValue());
                akcr.b(atomicBoolean, "<set-?>");
                xoc.j = atomicBoolean;
                return ajdx.b(obj);
            }
        }

        /* renamed from: xoc$n$2 */
        static final class 2<T> implements ajfb<Boolean> {
            private /* synthetic */ n a;

            2(n nVar) {
                this.a = nVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                ajxr ajxr = this.a.a.k;
                if (ajxr != null) {
                    this.a.a.a((acgw) ajxr.a, (achg) ajxr.b, (achg) ajxr.c);
                    this.a.a.k = null;
                }
            }
        }

        n(xoc xoc) {
            this.a = xoc;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajej f = this.a.f().p(xjd.HAS_USED_SPECTACLES).a(this.a.g()).n(new 1(this)).a((ajdw) this.a.d().l()).f((ajfb) new 2(this));
            akcr.a((Object) f, "configProvider.observeBo…  }\n                    }");
            ajvv.a(f, this.a.g);
            if (!this.a.h.getAndSet(true)) {
                xgq h = this.a.c().h();
                Object systemService = h.c.getSystemService("alarm");
                if (systemService != null) {
                    AlarmManager alarmManager = (AlarmManager) systemService;
                    Object obj2 = b.HANDLE_OTA_CHECK.a(h.c).setPackage(h.c.getPackageName());
                    String str = "intent";
                    akcr.a(obj2, str);
                    String str2 = "com.snapchat.spectacles.base.service.SpectaclesService";
                    obj2.setComponent(new ComponentName(h.c.getPackageName(), str2));
                    PendingIntent service = PendingIntent.getService(h.c, 0, obj2, Box.MAX_BOX_SIZE);
                    String str3 = "alarmManager cancel exception";
                    if (service != null) {
                        try {
                            alarmManager.cancel(service);
                        } catch (RuntimeException e) {
                            xhq.a(e, str3, new Object[0]);
                        }
                    }
                    obj2 = new Intent("snapchat.intent.action.OTA_CHECK").setPackage(h.c.getPackageName());
                    akcr.a(obj2, str);
                    obj2.setComponent(new ComponentName(h.c.getPackageName(), str2));
                    service = PendingIntent.getBroadcast(h.c, 0, obj2, Box.MAX_BOX_SIZE);
                    if (service != null) {
                        try {
                            alarmManager.cancel(service);
                        } catch (RuntimeException e2) {
                            xhq.a(e2, str3, new Object[0]);
                        }
                    }
                    obj2 = b.HANDLE_WATCHDOG.a(h.c).setPackage(h.c.getPackageName());
                    akcr.a(obj2, str);
                    obj2.setComponent(new ComponentName(h.c.getPackageName(), str2));
                    PendingIntent service2 = PendingIntent.getService(h.c, 0, obj2, Box.MAX_BOX_SIZE);
                    if (service2 != null) {
                        try {
                            alarmManager.cancel(service2);
                        } catch (RuntimeException e3) {
                            xhq.a(e3, str3, new Object[0]);
                        }
                    }
                } else {
                    throw new ajxt("null cannot be cast to non-null type android.app.AlarmManager");
                }
            }
        }
    }

    /* renamed from: xoc$o */
    static final class o implements ajev {
        private /* synthetic */ xoc a;

        o(xoc xoc) {
            this.a = xoc;
        }

        public final void run() {
            xoc xoc = this.a;
            xoc.g.a();
            xoc.f--;
            ajcx.b((Callable) new k(xoc)).b(xoc.g()).e();
        }
    }

    /* renamed from: xoc$k */
    static final class k<V> implements Callable<Object> {
        private /* synthetic */ xoc a;

        k(xoc xoc) {
            this.a = xoc;
        }

        public final /* synthetic */ Object call() {
            if (this.a.f <= 0) {
                Object e = this.a.c().e();
                e.a(e, (akbl) l.a);
                if (this.a.f < 0) {
                    this.a.f = 0;
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: xoc$e */
    static final class e<V> implements Callable<Object> {
        private /* synthetic */ xoc a;

        e(xoc xoc) {
            this.a = xoc;
        }

        public final /* synthetic */ Object call() {
            this.a.c().d().b();
            return ajxw.a;
        }
    }

    /* renamed from: xoc$f */
    static final class f<V> implements Callable<Object> {
        private /* synthetic */ xoc a;

        f(xoc xoc) {
            this.a = xoc;
        }

        public final /* synthetic */ Object call() {
            ((xoo) this.a.e.b()).b();
            if (((ifs) this.a.d.b()).l() && this.a.c().j().i()) {
                this.a.c().h().a(a.LOW_LATENCY, (long) TelemetryConstants.FLUSH_DELAY_MS);
            }
            Object e = this.a.c().e();
            e.a(e, (akbl) bd.a);
            this.a.c().c().a();
            ((xpg) this.a.c.b()).a(null);
            xoc xoc = this.a;
            Object obj = (abss) xoc.b.b();
            akcr.a(obj, "releaseManager");
            if (obj.p()) {
                int f = xoc.f().f(xjd.BATTERY_MOCK);
                if (f == 0) {
                    xoc.c().b().p();
                } else {
                    xoc.c().b().a(f);
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: xoc$g */
    static final class g<V> implements Callable<Object> {
        private /* synthetic */ xoc a;

        g(xoc xoc) {
            this.a = xoc;
        }

        public final /* synthetic */ Object call() {
            Object e = this.a.c().e();
            e.a(e, (akbl) be.a);
            return ajxw.a;
        }
    }

    /* renamed from: xoc$u */
    static final class u implements OnClickListener {
        private /* synthetic */ xoc a;

        u(xoc xoc) {
            this.a = xoc;
        }

        public final void onClick(View view) {
            zjf zjf = new zjf(xai.a, ((xaj) this.a.i.b()).a(), acgv.a().a(xai.c).a());
            achb e = this.a.e();
            achd achd = zjf;
            acgu acgu = xai.b;
            akcr.a((Object) acgu, "SpectaclesFeature.SPECTA…_SETTINGS_PRESENT_DEFAULT");
            e.a(achd, acgu, null);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(xoc.class), "specsCoreComponent", "getSpecsCoreComponent()Lcom/snap/spectacles/base/di/components/SpectaclesCoreComponent;"), new akdc(akde.a(xoc.class), "callSite", "getCallSite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(xoc.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(xoc.class), "releaseManager", "getReleaseManager()Lcom/snapchat/android/framework/release/ReleaseManager;"), new akdc(akde.a(xoc.class), "navHost", "getNavHost()Lcom/snapchat/deck/api/NavigationHost;"), new akdc(akde.a(xoc.class), "firmwareUpdatesChecker", "getFirmwareUpdatesChecker()Lcom/snap/spectacles/lib/main/firmwareupdate/SpectaclesFirmwareUpdatesChecker;"), new akdc(akde.a(xoc.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(xoc.class), "permissionHelper", "getPermissionHelper()Lcom/snap/framework/permission/PermissionHelper;"), new akdc(akde.a(xoc.class), "specsSdkInitializer", "getSpecsSdkInitializer()Lcom/snap/spectacles/lib/main/SpectaclesSdkInitializer;"), new akdc(akde.a(xoc.class), "batteryViewPresenter", "getBatteryViewPresenter()Lcom/snap/spectacles/lib/fragments/presenters/SpectaclesBatteryViewPresenter;"), new akdc(akde.a(xoc.class), "iconViewPresenter", "getIconViewPresenter()Lcom/snap/spectacles/lib/fragments/presenters/SpectaclesIconViewPresenter;"), new akdc(akde.a(xoc.class), "spectaclesFragmentFactory", "getSpectaclesFragmentFactory()Lcom/snap/spectacles/api/SpectaclesFragmentFactory;"), new akdc(akde.a(xoc.class), "hovaController", "getHovaController()Lcom/snap/hova/api/HovaController;"), new akdc(akde.a(xoc.class), "scheduler", "getScheduler()Lio/reactivex/Scheduler;")};
    }

    public xoc(ajwy<xbd> ajwy, ajwy<achb<zjm, zjk>> ajwy2, ajwy<ftl> ajwy3, ajwy<abss> ajwy4, ajwy<xpg> ajwy5, ajwy<ifs> ajwy6, zgk<ScopedFragmentActivity.b> zgk, ajwy<zgb> ajwy7, ajwy<ipt> ajwy8, ajwy<xmm> ajwy9, ajwy<xmu> ajwy10, ajwy<xaj> ajwy11, ajwy<xoo> ajwy12) {
        akcr.b(ajwy, "specsCoreComponentLazy");
        akcr.b(ajwy2, "navHostLazy");
        akcr.b(ajwy3, "configProviderLazy");
        akcr.b(ajwy4, "releaseManagerLazy");
        akcr.b(ajwy5, "firmwareUpdatesCheckerLazy");
        akcr.b(ajwy6, "permissionHelperLazy");
        akcr.b(zgk, "taskScoper");
        akcr.b(ajwy7, "schedulersProvider");
        akcr.b(ajwy8, "hovaControllerLazy");
        akcr.b(ajwy9, "batteryViewPresenterLazy");
        akcr.b(ajwy10, "iconViewPresenterLazy");
        akcr.b(ajwy11, "spectaclesFragmentFactoryLazy");
        akcr.b(ajwy12, "specsSdkInitializerLazy");
        super(zgk);
        this.l = ajxh.a(new v(ajwy));
        this.m = ajxh.a(new t(this, ajwy7));
        this.b = ajxh.a(new r(ajwy4));
        this.n = ajxh.a(new j(ajwy2));
        this.c = ajxh.a(new d(ajwy5));
        this.o = ajxh.a(new c(ajwy3));
        this.d = ajxh.a(new q(ajwy6));
        this.e = ajxh.a(new w(ajwy12));
        this.g = new ajei();
        this.h = new AtomicBoolean(false);
        this.p = ajxh.a(new a(ajwy9));
        this.q = ajxh.a(new i(ajwy10));
        this.i = ajxh.a(new x(ajwy11));
        this.r = ajxh.a(new h(ajwy8));
        this.t = ajxh.a(new s(this));
    }

    private final xmm j() {
        return (xmm) this.p.b();
    }

    private final xmu k() {
        return (xmu) this.q.b();
    }

    private final boolean l() {
        if (this.j == null) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.j;
        if (atomicBoolean == null) {
            akcr.a("spectaclesUser");
        }
        return atomicBoolean.get();
    }

    public final ajej a() {
        this.f++;
        ajej f = ajdx.c((Callable) new l(this)).b(g()).d((ajfc) new m(this)).a(g()).f((ajfb) new n(this));
        akcr.a((Object) f, "Single.fromCallable {\n  …)\n            }\n        }");
        ajvv.a(f, this.g);
        Object a = ajek.a((ajev) new o(this));
        akcr.a(a, "Disposables.fromAction { onActivityPaused() }");
        return a;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0153  */
    public final void a(defpackage.acgw r9, defpackage.achg r10, defpackage.achg r11) {
        /*
        r8 = this;
        r0 = "destinationPage";
        defpackage.akcr.b(r11, r0);
        r1 = defpackage.ojc.a;
        r1 = defpackage.akcr.a(r11, r1);
        r2 = 0;
        r3 = 1;
        if (r1 == 0) goto L_0x0017;
    L_0x000f:
        r1 = r8.l();
        if (r1 == 0) goto L_0x0017;
    L_0x0015:
        r1 = 1;
        goto L_0x0018;
    L_0x0017:
        r1 = 0;
    L_0x0018:
        if (r1 == 0) goto L_0x00bf;
    L_0x001a:
        r1 = r8;
        r1 = (defpackage.xoc) r1;
        r1 = r1.s;
        if (r1 != 0) goto L_0x00bf;
    L_0x0021:
        r1 = r8.r;
        r1 = r1.b();
        r1 = (defpackage.ipt) r1;
        r4 = 2131430340; // 0x7f0b0bc4 float:1.8482378E38 double:1.0530665075E-314;
        r5 = defpackage.ojc.a;
        r1 = r1.a(r4, r5);
        if (r1 == 0) goto L_0x00b7;
    L_0x0034:
        r1 = (android.view.ViewStub) r1;
        r4 = 2131559400; // 0x7f0d03e8 float:1.8744143E38 double:1.0531302716E-314;
        r1.setLayoutResource(r4);
        r1 = r1.inflate();
        if (r1 == 0) goto L_0x00af;
    L_0x0042:
        r1 = (com.snap.spectacles.sharedui.SpectaclesIconView) r1;
        r4 = r8.k();
        r5 = r8.j();
        r6 = "batteryViewPresenter";
        defpackage.akcr.a(r5, r6);
        r7 = "<set-?>";
        defpackage.akcr.b(r5, r7);
        r4.f = r5;
        r4 = r8.k();
        r5 = "iconViewPresenter";
        defpackage.akcr.a(r4, r5);
        r4 = (defpackage.xak) r4;
        r7 = r8.j();
        defpackage.akcr.a(r7, r6);
        r7 = (defpackage.xac) r7;
        defpackage.akcr.b(r4, r5);
        defpackage.akcr.b(r7, r6);
        r1.f = r4;
        r4 = r1.d;
        r4.g = r7;
        r4 = r1.f;
        if (r4 == 0) goto L_0x0081;
    L_0x007c:
        r5 = r1.h;
        r4.a(r5);
    L_0x0081:
        r4 = r1.f;
        if (r4 == 0) goto L_0x008b;
    L_0x0085:
        r5 = r1;
        r5 = (defpackage.xal) r5;
        r4.a(r5);
    L_0x008b:
        r4 = r1.f;
        if (r4 == 0) goto L_0x0094;
    L_0x008f:
        r5 = r1.g;
        r4.a(r5);
    L_0x0094:
        r4 = r1.f;
        if (r4 == 0) goto L_0x009b;
    L_0x0098:
        r4.d();
    L_0x009b:
        r4 = r1.f;
        if (r4 == 0) goto L_0x00a2;
    L_0x009f:
        r4.a();
    L_0x00a2:
        r4 = new xoc$u;
        r4.<init>(r8);
        r4 = (android.view.View.OnClickListener) r4;
        r1.setOnClickListener(r4);
        r8.s = r1;
        goto L_0x00bf;
    L_0x00af:
        r9 = new ajxt;
        r10 = "null cannot be cast to non-null type com.snap.spectacles.sharedui.SpectaclesIconView";
        r9.<init>(r10);
        throw r9;
    L_0x00b7:
        r9 = new ajxt;
        r10 = "null cannot be cast to non-null type android.view.ViewStub";
        r9.<init>(r10);
        throw r9;
    L_0x00bf:
        r1 = defpackage.ojc.a;
        r1 = defpackage.akcr.a(r10, r1);
        if (r1 == 0) goto L_0x00cf;
    L_0x00c7:
        r1 = r8.l();
        if (r1 == 0) goto L_0x00cf;
    L_0x00cd:
        r1 = 1;
        goto L_0x00d0;
    L_0x00cf:
        r1 = 0;
    L_0x00d0:
        r4 = "Completable.fromCallable…             .subscribe()";
        if (r1 == 0) goto L_0x00f9;
    L_0x00d4:
        r1 = new xoc$e;
        r1.<init>(r8);
        r1 = (java.util.concurrent.Callable) r1;
        r1 = defpackage.ajcx.b(r1);
        r5 = r8.d();
        r5 = r5.b();
        r5 = (defpackage.ajdw) r5;
        r1 = r1.b(r5);
        r1 = r1.e();
        defpackage.akcr.a(r1, r4);
        r5 = r8.g;
        defpackage.ajvv.a(r1, r5);
    L_0x00f9:
        r1 = "navigationType";
        defpackage.akcr.b(r9, r1);
        r5 = "sourcePage";
        defpackage.akcr.b(r10, r5);
        defpackage.akcr.b(r11, r0);
        r6 = defpackage.acgw.PRESENT;
        if (r9 != r6) goto L_0x012b;
    L_0x010a:
        r6 = defpackage.xai.a;
        r6 = defpackage.akcr.a(r11, r6);
        if (r6 == 0) goto L_0x011b;
    L_0x0112:
        r6 = defpackage.ojc.a;
        r6 = defpackage.akcr.a(r10, r6);
        r6 = r6 ^ r3;
        if (r6 != 0) goto L_0x0129;
    L_0x011b:
        r6 = defpackage.ojc.a;
        r6 = defpackage.akcr.a(r11, r6);
        if (r6 == 0) goto L_0x012b;
    L_0x0123:
        r6 = r8.l();
        if (r6 == 0) goto L_0x012b;
    L_0x0129:
        r6 = 1;
        goto L_0x012c;
    L_0x012b:
        r6 = 0;
    L_0x012c:
        if (r6 != 0) goto L_0x0150;
    L_0x012e:
        r6 = defpackage.acgw.DISMISS;
        if (r9 != r6) goto L_0x014a;
    L_0x0132:
        r6 = defpackage.ojc.a;
        r6 = defpackage.akcr.a(r11, r6);
        if (r6 == 0) goto L_0x014a;
    L_0x013a:
        r6 = defpackage.upp.b;
        r6 = defpackage.akcr.a(r10, r6);
        if (r6 == 0) goto L_0x014a;
    L_0x0142:
        r6 = r8.l();
        if (r6 == 0) goto L_0x014a;
    L_0x0148:
        r6 = 1;
        goto L_0x014b;
    L_0x014a:
        r6 = 0;
    L_0x014b:
        if (r6 == 0) goto L_0x014e;
    L_0x014d:
        goto L_0x0150;
    L_0x014e:
        r6 = 0;
        goto L_0x0151;
    L_0x0150:
        r6 = 1;
    L_0x0151:
        if (r6 == 0) goto L_0x0173;
    L_0x0153:
        r9 = new xoc$f;
        r9.<init>(r8);
        r9 = (java.util.concurrent.Callable) r9;
        r9 = defpackage.ajcx.b(r9);
        r10 = r8.g();
        r9 = r9.b(r10);
        r9 = r9.e();
        defpackage.akcr.a(r9, r4);
        r10 = r8.g;
        defpackage.ajvv.a(r9, r10);
        return;
    L_0x0173:
        defpackage.akcr.b(r9, r1);
        defpackage.akcr.b(r10, r5);
        defpackage.akcr.b(r11, r0);
        r0 = defpackage.acgw.DISMISS;
        if (r9 != r0) goto L_0x01a0;
    L_0x0180:
        r9 = defpackage.xai.a;
        r9 = defpackage.akcr.a(r10, r9);
        if (r9 == 0) goto L_0x0191;
    L_0x0188:
        r9 = defpackage.ojc.a;
        r9 = defpackage.akcr.a(r11, r9);
        r9 = r9 ^ r3;
        if (r9 != 0) goto L_0x019f;
    L_0x0191:
        r9 = defpackage.ojc.a;
        r9 = defpackage.akcr.a(r10, r9);
        if (r9 == 0) goto L_0x01a0;
    L_0x0199:
        r9 = r8.l();
        if (r9 == 0) goto L_0x01a0;
    L_0x019f:
        r2 = 1;
    L_0x01a0:
        if (r2 == 0) goto L_0x01c1;
    L_0x01a2:
        r9 = new xoc$g;
        r9.<init>(r8);
        r9 = (java.util.concurrent.Callable) r9;
        r9 = defpackage.ajcx.b(r9);
        r10 = r8.g();
        r9 = r9.b(r10);
        r9 = r9.e();
        defpackage.akcr.a(r9, r4);
        r10 = r8.g;
        defpackage.ajvv.a(r9, r10);
    L_0x01c1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xoc.a(acgw, achg, achg):void");
    }

    public final void a(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    public final ajej b() {
        e().a((achk) this);
        Object a = ajek.a((ajev) new p(this));
        akcr.a(a, "Disposables.fromAction {…onObject = null\n        }");
        return a;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (this.j == null) {
            this.k = new ajxr(achi.d, achi.e.e(), achi.f.e());
            return;
        }
        acgw acgw = achi.d;
        Object e = achi.e.e();
        akcr.a(e, "navigationEvent.sourcePage.pageType");
        Object e2 = achi.f.e();
        akcr.a(e2, "navigationEvent.destinationPage.pageType");
        a(acgw, e, e2);
    }

    /* Access modifiers changed, original: final */
    public final xbd c() {
        return (xbd) this.l.b();
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    /* Access modifiers changed, original: final */
    public final zfw d() {
        return (zfw) this.m.b();
    }

    /* Access modifiers changed, original: final */
    public final achb<zjm, zjk> e() {
        return (achb) this.n.b();
    }

    /* Access modifiers changed, original: final */
    public final ftl f() {
        return (ftl) this.o.b();
    }

    /* Access modifiers changed, original: final */
    public final ajdw g() {
        return (ajdw) this.t.b();
    }
}
