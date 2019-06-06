package com.snap.spectacles.lib.fragments.presenters;

import com.snap.spectacles.lib.fragments.SpectaclesContextNotificationSettingsFragment;
import com.snapchat.android.R;
import defpackage.acgu;
import defpackage.acgv;
import defpackage.achb;
import defpackage.achd;
import defpackage.acih;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxk;
import defpackage.ajxw;
import defpackage.ajyn;
import defpackage.ajyt;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.fth;
import defpackage.ftl;
import defpackage.idd;
import defpackage.rgq;
import defpackage.rgs;
import defpackage.rgt;
import defpackage.rgu;
import defpackage.rgv;
import defpackage.rhh;
import defpackage.rhl;
import defpackage.rhm;
import defpackage.rhp;
import defpackage.s;
import defpackage.tnj;
import defpackage.xai;
import defpackage.xiz;
import defpackage.xjd;
import defpackage.xjk;
import defpackage.xlp;
import defpackage.xmi;
import defpackage.xmo;
import defpackage.xmp;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zhn;
import defpackage.zjf;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class SpectaclesContextNotificationSettingsPresenter extends zll<xmi> implements defpackage.k {
    private static final rgq o;
    final ajxe a = ajxh.a(c.a);
    public final ajei b = new ajei();
    public final ajxe c;
    public final ajxe d;
    public final ajxe e;
    public xiz f;
    public List<xjk> g;
    public final akbl<Throwable, ajxw> h;
    final ftl i;
    public final aipn<tnj> j;
    private final ajxe k;
    private final akbl<Object, ajxw> l;
    private final achb<zjm, zjk> m;
    private final rgt n;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class g<V> implements Callable<T> {
        private /* synthetic */ SpectaclesContextNotificationSettingsPresenter a;

        g(SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter) {
            this.a = spectaclesContextNotificationSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            return (List) this.a.i.o(xjd.CONTEXT_NOTIFICATION_CUSTOM_USER_WHITELIST);
        }
    }

    static final class p<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesContextNotificationSettingsPresenter a;
        private /* synthetic */ xiz b;
        private /* synthetic */ List c;

        p(SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter, xiz xiz, List list) {
            this.a = spectaclesContextNotificationSettingsPresenter;
            this.b = xiz;
            this.c = list;
        }

        public final /* synthetic */ Object call() {
            return ((tnj) this.a.j.get()).b().a((fth) xjd.CONTEXT_NOTIFICATION_FRIEND_SELECTION, (Enum) this.b).b(xjd.CONTEXT_NOTIFICATION_CUSTOM_USER_WHITELIST, this.c).b();
        }
    }

    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ SpectaclesContextNotificationSettingsPresenter a;

        e(SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter) {
            this.a = spectaclesContextNotificationSettingsPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            xmi xmi = (xmi) this.a.getTarget();
            if (xmi == null) {
                return null;
            }
            xmi.a(bool.booleanValue());
            return ajxw.a;
        }
    }

    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ SpectaclesContextNotificationSettingsPresenter a;

        f(SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter) {
            this.a = spectaclesContextNotificationSettingsPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            xiz xiz = (xiz) obj;
            akcr.b(xiz, "it");
            this.a.a(xiz);
            xmi xmi = (xmi) this.a.getTarget();
            if (xmi == null) {
                return null;
            }
            xmi.a(SpectaclesContextNotificationSettingsPresenter.b(this.a.b()));
            return ajxw.a;
        }
    }

    static final class h<T> implements ajfb<List<? extends xjk>> {
        private /* synthetic */ SpectaclesContextNotificationSettingsPresenter a;

        h(SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter) {
            this.a = spectaclesContextNotificationSettingsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter = this.a;
            akcr.a(obj, "whiteList");
            akcr.b(obj, "<set-?>");
            spectaclesContextNotificationSettingsPresenter.g = obj;
        }
    }

    public static final class i<T, R> implements ajfc<T, R> {
        private /* synthetic */ SpectaclesContextNotificationSettingsPresenter a;

        public i(SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter) {
            this.a = spectaclesContextNotificationSettingsPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            xjk xjk = (xjk) obj;
            akcr.b(xjk, "it");
            String str = xjk.a;
            String str2 = xjk.b;
            String str3 = xjk.c;
            return new rhp(str, str2, str3 != null ? new rhh(str3, str3) : null, null, 24);
        }
    }

    static final class k<T> implements ajfb<rgv> {
        private /* synthetic */ SpectaclesContextNotificationSettingsPresenter a;

        k(SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter) {
            this.a = spectaclesContextNotificationSettingsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str;
            Iterable<rhp> a = ajyt.a(((rgv) obj).a.a, rhp.class);
            Collection arrayList = new ArrayList(ajyn.a((Iterable) a, 10));
            for (rhp rhp : a) {
                String str2 = rhp.a;
                str = rhp.b;
                rhh rhh = rhp.f;
                arrayList.add(new xjk(str2, str, rhh != null ? rhh.a : null));
            }
            Object obj2 = (List) arrayList;
            SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter = this.a;
            akcr.b(obj2, "selectedUserWhitelist");
            xiz xiz = spectaclesContextNotificationSettingsPresenter.f;
            String str3 = "notificationSelection";
            if (xiz == null) {
                akcr.a(str3);
            }
            str = "currentFriendsWhitelist";
            if (xiz == xiz.CUSTOM) {
                Object obj3 = spectaclesContextNotificationSettingsPresenter.g;
                if (obj3 == null) {
                    akcr.a(str);
                }
                if (akcr.a(obj3, obj2)) {
                    return;
                }
            }
            if (obj2.isEmpty()) {
                xmi xmi = (xmi) spectaclesContextNotificationSettingsPresenter.getTarget();
                if (xmi != null) {
                    xmi.a(SpectaclesContextNotificationSettingsPresenter.b(xiz.ALL_FRIENDS));
                }
                xiz = xiz.ALL_FRIENDS;
            } else {
                xiz = xiz.CUSTOM;
            }
            spectaclesContextNotificationSettingsPresenter.f = xiz;
            spectaclesContextNotificationSettingsPresenter.g = obj2;
            xiz xiz2 = spectaclesContextNotificationSettingsPresenter.f;
            if (xiz2 == null) {
                akcr.a(str3);
            }
            List list = spectaclesContextNotificationSettingsPresenter.g;
            if (list == null) {
                akcr.a(str);
            }
            spectaclesContextNotificationSettingsPresenter.a(xiz2, list);
        }
    }

    static final class c extends akcs implements akbk<idd> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return xai.f.callsite(xmp.a);
        }
    }

    static final class l extends akcs implements akbk<zjm> {
        public static final l a = new l();

        l() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zjm(xai.f, xmp.a, false, false, true, false, null, false, false, false, false, null, 4076);
        }
    }

    static final class m extends akcs implements akbl<Throwable, ajxw> {
        public static final m a = new m();

        m() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "throwable");
            return ajxw.a;
        }
    }

    static final class n extends akcs implements akbl<Object, ajxw> {
        public static final n a = new n();

        n() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b(obj, "it");
            return ajxw.a;
        }
    }

    static final class o extends akcs implements akbk<zfw> {
        private /* synthetic */ SpectaclesContextNotificationSettingsPresenter a;
        private /* synthetic */ ajwy b;

        o(SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter, ajwy ajwy) {
            this.a = spectaclesContextNotificationSettingsPresenter;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.b.get();
            return zgb.a((idd) this.a.a.b());
        }
    }

    static final class b extends akcq implements akbk<zhn> {
        b(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (zhn) ((ajwy) this.receiver).get();
        }
    }

    static final class d extends akcq implements akbk<xlp> {
        d(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (xlp) ((ajwy) this.receiver).get();
        }
    }

    public static final class j extends akcq implements akbl<List<? extends rhp>, ajxw> {
        public j(SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter) {
            super(1, spectaclesContextNotificationSettingsPresenter);
        }

        public final String getName() {
            return "launchSendToFragment";
        }

        public final akej getOwner() {
            return akde.a(SpectaclesContextNotificationSettingsPresenter.class);
        }

        public final String getSignature() {
            return "launchSendToFragment(Ljava/util/List;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "p1");
            ((SpectaclesContextNotificationSettingsPresenter) this.receiver).a(list);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SpectaclesContextNotificationSettingsPresenter.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(SpectaclesContextNotificationSettingsPresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(SpectaclesContextNotificationSettingsPresenter.class), "colorSelectionActionMenuDataProvider", "getColorSelectionActionMenuDataProvider()Lcom/snap/spectacles/lib/fragments/contextnotification/ContextNotificationColorActionMenuDataProvider;"), new akdc(akde.a(SpectaclesContextNotificationSettingsPresenter.class), "actionMenuLauncher", "getActionMenuLauncher()Lcom/snap/ui/actionmenu/ActionMenuLauncher;"), new akdc(akde.a(SpectaclesContextNotificationSettingsPresenter.class), "mainPageType", "getMainPageType()Lcom/snap/ui/deck/MainPageType;")};
        a aVar = new a();
        Integer valueOf = Integer.valueOf(R.string.context_notifications_custom_privacy_title);
        Integer valueOf2 = Integer.valueOf(R.string.spectacles_notification_settings);
        rgu rgu = r1;
        rgu rgu2 = new rgu(R.drawable.settings_checkmark);
        o = new rgq(false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, null, valueOf, valueOf2, rgu, null, null, false, false, false, Integer.valueOf(Integer.MAX_VALUE), false, false, false, 133235440, 1);
    }

    public SpectaclesContextNotificationSettingsPresenter(achb<zjm, zjk> achb, ajwy<zgb> ajwy, ftl ftl, aipn<tnj> aipn, ajwy<zhn> ajwy2, ajwy<xlp> ajwy3, rgt rgt) {
        akcr.b(achb, "navigationHost");
        akcr.b(ajwy, "schedulersProvider");
        akcr.b(ftl, "configProvider");
        akcr.b(aipn, "preferences");
        akcr.b(ajwy2, "actionMenuLauncherProvider");
        akcr.b(ajwy3, "contextNotificationColorActionMenuDataProvider");
        akcr.b(rgt, "sendToFragmentControllerFactory");
        this.m = achb;
        this.i = ftl;
        this.j = aipn;
        this.n = rgt;
        this.k = ajxh.a(new o(this, ajwy));
        this.c = ajxh.a(new d(ajwy3));
        this.d = ajxh.a(new b(ajwy2));
        this.e = ajxh.a(l.a);
        this.l = n.a;
        this.h = m.a;
    }

    public static int b(xiz xiz) {
        akcr.b(xiz, "selection");
        int i = xmo.a[xiz.ordinal()];
        if (i == 1) {
            return R.id.best_friends;
        }
        if (i == 2) {
            return R.id.only_these_friends;
        }
        if (i == 3) {
            return R.id.all_friends;
        }
        throw new ajxk();
    }

    public final zfw a() {
        return (zfw) this.k.b();
    }

    public final void a(List<rhp> list) {
        rgs a = this.n.a();
        ajej f = a.b().b((ajdw) a().b()).f((ajfb) new k(this));
        akcr.a((Object) f, "sendToController.abandon…telist)\n                }");
        ajvv.a(f, this.b);
        zjf zjf = new zjf(SpectaclesContextNotificationSettingsFragment.h, a.h(), acgv.a().a(SpectaclesContextNotificationSettingsFragment.j).a());
        rhm rhm = new rhm(new rhl(list, null, null, false, null, 126), o);
        achb achb = this.m;
        achd achd = zjf;
        acgu acgu = SpectaclesContextNotificationSettingsFragment.i;
        akcr.a((Object) acgu, "SpectaclesContextNotific…SELECTION_PRESENT_DEFAULT");
        achb.a(achd, acgu, (acih) rhm);
    }

    public final void a(xiz xiz) {
        akcr.b(xiz, "<set-?>");
        this.f = xiz;
    }

    public final void a(xiz xiz, List<xjk> list) {
        akcr.b(xiz, "selection");
        akcr.b(list, "whiteList");
        ajej e = ajcx.b((Callable) new p(this, xiz, list)).b((ajdw) a().i()).e();
        akcr.a((Object) e, "Completable.fromCallable…             .subscribe()");
        ajvv.a(e, this.b);
    }

    /* renamed from: a */
    public final void takeTarget(xmi xmi) {
        akcr.b(xmi, "target");
        super.takeTarget(xmi);
        xmi.getLifecycle().a(this);
    }

    public final xiz b() {
        xiz xiz = this.f;
        if (xiz == null) {
            akcr.a("notificationSelection");
        }
        return xiz;
    }

    public final void dropTarget() {
        xmi xmi = (xmi) getTarget();
        if (xmi != null) {
            defpackage.j lifecycle = xmi.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        ajej c = this.i.b((fth) xjd.CONTEXT_NOTIFICATION_ENABLED).b((ajdw) a().i()).a((ajdw) a().l()).f(new e(this)).c();
        akcr.a((Object) c, "configProvider.getBoolea…             .subscribe()");
        ajvv.a(c, this.b);
        c = this.i.m(xjd.CONTEXT_NOTIFICATION_FRIEND_SELECTION).b((ajdw) a().i()).a((ajdw) a().l()).f(new f(this)).c();
        akcr.a((Object) c, "configProvider.getEnumCo…             .subscribe()");
        ajvv.a(c, this.b);
        c = ajdx.c((Callable) new g(this)).b((ajdw) a().i()).a((ajdw) a().l()).e((ajfb) new h(this));
        akcr.a((Object) c, "Single.fromCallable {\n  …iteList\n                }");
        ajvv.a(c, this.b);
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onDestroy() {
        this.b.a();
    }
}
