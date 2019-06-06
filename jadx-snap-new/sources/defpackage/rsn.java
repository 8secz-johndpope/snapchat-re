package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import com.brightcove.player.event.Event;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.snap.core.db.api.SnapDb;
import com.snap.mushroom.base.StartupInitDagger.StartupInitComponent;
import com.snap.mushroom.base.StartupInitDagger.StartupInitComponent.Builder;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.iti.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: rsn */
public final class rsn extends zgi {
    final ajxe a = ajxh.a(new n(this));
    final ajxe b = ajxh.a(new a(this));
    final Activity c;
    final aipn<SnapDb> d;
    final goz e;
    final ajwy<Builder> f;
    final aipn<nbl> g;
    final ajwy<qws> h;
    final aipn<iti> i;
    final aipn<jif> j;
    final aipn<jig> k;
    private final zfw l = zgb.a(zgu.a.callsite("TransitoryActivityObserver"));
    private final ajxe m = ajxh.a(new o(this));
    private boolean n = true;
    private final aipn<sen> o;
    private final aipn<ygi> p;
    private final aipn<ifa> q;

    /* renamed from: rsn$o */
    static final class o extends akcs implements akbk<StartupInitComponent> {
        private /* synthetic */ rsn a;

        o(rsn rsn) {
            this.a = rsn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((Builder) this.a.f.get()).build();
        }
    }

    /* renamed from: rsn$n */
    static final class n extends akcs implements akbk<rwm> {
        private /* synthetic */ rsn a;

        n(rsn rsn) {
            this.a = rsn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((StartupInitComponent) this.a.m.b()).syncer();
        }
    }

    /* renamed from: rsn$a */
    static final class a extends akcs implements akbk<rwn> {
        private /* synthetic */ rsn a;

        a(rsn rsn) {
            this.a = rsn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((StartupInitComponent) this.a.m.b()).hovaController();
        }
    }

    /* renamed from: rsn$l */
    static final class l<V> implements Callable<T> {
        private /* synthetic */ rsn a;
        private /* synthetic */ ajei b;

        l(rsn rsn, ajei ajei) {
            this.a = rsn;
            this.b = ajei;
        }

        public final /* synthetic */ Object call() {
            return (SnapDb) this.a.d.get();
        }
    }

    /* renamed from: rsn$m */
    static final class m<T, R> implements ajfc<SnapDb, ajdb> {
        private /* synthetic */ rsn a;
        private /* synthetic */ ajei b;

        m(rsn rsn, ajei ajei) {
            this.a = rsn;
            this.b = ajei;
        }

        public final /* synthetic */ Object apply(Object obj) {
            SnapDb snapDb = (SnapDb) obj;
            akcr.b(snapDb, "db");
            return snapDb.init(this.a.c);
        }
    }

    /* renamed from: rsn$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ rsn a;
        private /* synthetic */ ajei b;

        b(rsn rsn, ajei ajei) {
            this.a = rsn;
            this.b = ajei;
        }

        public final /* synthetic */ Object call() {
            return (iti) this.a.i.get();
        }
    }

    /* renamed from: rsn$f */
    static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            iti iti = (iti) obj;
            akcr.b(iti, "it");
            return iti.a();
        }
    }

    /* renamed from: rsn$c */
    static final class c<T, R> implements ajfc<Throwable, ajeb<? extends a>> {
        private /* synthetic */ rsn a;
        private /* synthetic */ ajei b;

        c(rsn rsn, ajei ajei) {
            this.a = rsn;
            this.b = ajei;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            jig jig = (jig) this.a.k.get();
            Object obj2 = jig.c.get();
            akcr.a(obj2, "userAuthStore.get()");
            String str = ((gpb) obj2).a().a;
            if (str == null) {
                str = "";
            }
            if (akgb.a(str)) {
                obj = ajdx.b((Throwable) new IllegalStateException());
                str = "Single.error(IllegalStateException())";
            } else {
                obj = jig.a.a((ajfc) new defpackage.jig.c(jig.a(str, "tos_version_7_accepted"), jig.a(str, "seen_privacy_policy_gdpr"), jig.a(str, "show_privacy_policy_gdpr")));
                str = "sharedPreferences.flatMa…}\n            }\n        }";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: rsn$d */
    static final class d<T> implements ajfb<a> {
        private /* synthetic */ rsn a;
        private /* synthetic */ ajei b;

        d(rsn rsn, ajei ajei) {
            this.a = rsn;
            this.b = ajei;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (a) obj;
            iti iti = (iti) this.a.i.get();
            Activity activity = this.a.c;
            akcr.a(obj, "status");
            iti.a(activity, obj);
        }
    }

    /* renamed from: rsn$e */
    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ rsn a;
        private /* synthetic */ ajei b;

        e(rsn rsn, ajei ajei) {
            this.a = rsn;
            this.b = ajei;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((jif) this.a.j.get()).a()) {
                if (!((jif) this.a.j.get()).b() && ((jif) this.a.j.get()).a.a((fth) iui.SHOW_PRIVACY_POLICY_GDPR)) {
                    ((iti) this.a.i.get()).a(this.a.c, a.NeedPrivacyPolicy);
                }
                return;
            }
            ((iti) this.a.i.get()).a(this.a.c, a.NeedTermsOfUse);
        }
    }

    /* renamed from: rsn$g */
    static final class g<T> implements ajfb<Intent> {
        private /* synthetic */ rsn a;

        g(rsn rsn) {
            this.a = rsn;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Intent) obj;
            rsn rsn = this.a;
            akcr.a(obj, "it");
            akcr.a(abtb.a(), "TestStatus.getInstance()");
            if (abtb.b()) {
                rsn.c.startActivity(rsn.c.getPackageManager().getLaunchIntentForPackage(rsn.c.getPackageName()));
                rsn.c.finish();
                return;
            }
            ProcessPhoenix.a(rsn.c);
        }
    }

    /* renamed from: rsn$h */
    static final class h implements ajev {
        private /* synthetic */ rsn a;

        h(rsn rsn) {
            this.a = rsn;
        }

        public final void run() {
            goz goz = this.a.e;
            if (goz.a.getAndSet(false)) {
                goz.e.a();
            }
        }
    }

    /* renamed from: rsn$i */
    static final class i implements ajev {
        private /* synthetic */ rsn a;

        i(rsn rsn) {
            this.a = rsn;
        }

        public final void run() {
            ((qws) this.a.h.get()).e.set(true);
        }
    }

    /* renamed from: rsn$k */
    static final class k implements ajev {
        private /* synthetic */ rsn a;

        k(rsn rsn) {
            this.a = rsn;
        }

        public final void run() {
            ((nbl) this.a.g.get()).d();
        }
    }

    /* renamed from: rsn$j */
    static final class j implements Runnable {
        private /* synthetic */ rsn a;
        private /* synthetic */ ajei b;
        private /* synthetic */ boolean c;

        j(rsn rsn, ajei ajei, boolean z) {
            this.a = rsn;
            this.b = ajei;
            this.c = z;
        }

        public final void run() {
            this.b.a(((rwm) this.a.a.b()).a(this.c));
            this.b.a(((rwn) this.a.b.b()).a());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(rsn.class), "startupInit", "getStartupInit()Lcom/snap/mushroom/base/StartupInitDagger$StartupInitComponent;"), new akdc(akde.a(rsn.class), "startupDataSyncer", "getStartupDataSyncer()Lcom/snap/mushroom/sync/StartupDataSyncer;"), new akdc(akde.a(rsn.class), "appHovaController", "getAppHovaController()Lcom/snap/mushroom/ui/AppHovaController;")};
    }

    public rsn(zgb zgb, zgk<b> zgk, Activity activity, aipn<sen> aipn, aipn<SnapDb> aipn2, goz goz, aipn<ygi> aipn3, aipn<ifa> aipn4, ajwy<Builder> ajwy, aipn<nbl> aipn5, ajwy<qws> ajwy2, aipn<iti> aipn6, aipn<jif> aipn7, aipn<jig> aipn8) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zgk, "taskScoper");
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(aipn, "appIconBadgeManager");
        akcr.b(aipn2, "snapDb");
        akcr.b(goz, "screenshotWatchman");
        akcr.b(aipn3, "fileCache");
        akcr.b(aipn4, "networkStatusManager");
        akcr.b(ajwy, "startupInitBuilder");
        akcr.b(aipn5, "currentLocationManager");
        akcr.b(ajwy2, "foregroundServiceManager");
        akcr.b(aipn6, "legalAgreement");
        akcr.b(aipn7, "legalAgreementStore");
        akcr.b(aipn8, "legalAgreementStoreSharedPrefs");
        super(zgk);
        this.c = activity;
        this.o = aipn;
        this.d = aipn2;
        this.e = goz;
        this.p = aipn3;
        this.q = aipn4;
        this.f = ajwy;
        this.g = aipn5;
        this.h = ajwy2;
        this.i = aipn6;
        this.j = aipn7;
        this.k = aipn8;
    }

    private final boolean a(ajei ajei) {
        return ajei.a(ajdx.c((Callable) new b(this, ajei)).b((ajdw) this.l.f()).d((ajfc) f.a).a(10, TimeUnit.SECONDS, null, ajwh.b).e().h(new c(this, ajei)).a((ajdw) this.l.l()).a((ajfb) new d(this, ajei), (ajfb) new e(this, ajei)));
    }

    public final ajej a() {
        ajei ajei = new ajei();
        a(ajei);
        goz goz = this.e;
        if (!goz.a.getAndSet(true)) {
            if (goz.f.i()) {
                goz.e.a(goz.d);
            } else {
                goz.e.a();
                goz.a.set(false);
            }
        }
        ((qws) this.h.get()).e.set(false);
        ajei.a(igr.a(this.c, new IntentFilter("snap.intent.action.LOGGED_OUT")).a((ajdw) this.l.l()).f((ajfb) new g(this)), ((ifa) this.q.get()).e().l(), ajek.a((ajev) new h(this)), ajek.a((ajev) new i(this)));
        boolean z = this.n;
        if (!z) {
            this.l.f().a((Runnable) new j(this, ajei, z));
        }
        ((nbl) this.g.get()).a();
        Object obj = this.p.get();
        akcr.a(obj, "fileCache.get()");
        if (!((ygi) obj).b()) {
            ((ygi) this.p.get()).a();
        }
        ajei.a(ajek.a((ajev) new k(this)));
        this.n = false;
        return ajei;
    }

    public final ajej b() {
        ajei ajei = new ajei();
        ((sen) this.o.get()).a();
        ajei.a(ajdx.c((Callable) new l(this, ajei)).e((ajfc) new m(this, ajei)).b((ajdw) this.l.m()).e());
        return ajei;
    }
}
