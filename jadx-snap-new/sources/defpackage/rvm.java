package defpackage;

import com.brightcove.player.event.Event;
import com.snap.camera.api.CameraFragment;
import com.snap.hockey.HockeyUpdateManager;
import com.snap.memories.api.MemoriesFragment;
import com.snap.mushroom.fragments.NeonFriendsFeedFragment;
import com.snap.mushroom.fragments.discoverfeed.NeonDiscoverFeedFragment;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.deck.views.DeckView;
import defpackage.acgv.a;
import defpackage.rvq.g;
import defpackage.rvq.h;
import java.util.List;

/* renamed from: rvm */
public final class rvm extends ache<zjm, zjk> {
    final ajxe a;
    final HockeyUpdateManager b;
    final ajwy<oje> c;
    final aipn<rvq> d;
    final nkk e;
    final ajwy<fxj> f;
    private final fz h;
    private final ppl i;
    private final aipn<vxd> j;
    private final ajwy<CameraFragment> k;
    private final nmb l;
    private final nmn m;
    private final obo n;
    private final nnb o;
    private final ihh p;
    private final aipn<icz> q;
    private final ajwy<fxi> r;

    /* renamed from: rvm$e */
    static final class e extends akcq implements akbk<hno> {
        e(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (hno) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: rvm$a */
    static final class a<T> implements ajwy<List<? extends acgu<zjm>>> {
        private /* synthetic */ rvm a;

        a(rvm rvm) {
            this.a = rvm;
        }

        public final /* synthetic */ Object get() {
            Object obj;
            String str;
            Object obj2 = (Boolean) ((fxj) this.a.f.get()).a().b();
            r1 = new acgu[3];
            akcr.a(obj2, "isV11Mode");
            r1[0] = qxo.a(obj2.booleanValue());
            r1[1] = hbn.a(obj2.booleanValue());
            r1[2] = defpackage.ojc.a.a(obj2.booleanValue());
            List c = ajym.c(r1);
            if (this.a.e.a) {
                obj = nmh.a;
                str = "MapScreenFeature.PRESENT_PULLDOWN";
            } else {
                obj = vxc.c;
                str = "SEARCH_PRESENT_DEFAULT";
            }
            akcr.a(obj, str);
            c.add(obj);
            return c;
        }
    }

    /* renamed from: rvm$b */
    static final class b extends akcs implements akbk<NeonFriendsFeedFragment> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new NeonFriendsFeedFragment();
        }
    }

    /* renamed from: rvm$c */
    static final class c extends akcs implements akbk<NeonDiscoverFeedFragment> {
        private /* synthetic */ rvm a;

        c(rvm rvm) {
            this.a = rvm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ((hno) this.a.a.b()).d();
            NeonDiscoverFeedFragment neonDiscoverFeedFragment = new NeonDiscoverFeedFragment();
            neonDiscoverFeedFragment.getLifecycle().a(this.a.b);
            return neonDiscoverFeedFragment;
        }
    }

    /* renamed from: rvm$d */
    static final class d extends akcs implements akbk<MemoriesFragment> {
        private /* synthetic */ rvm a;

        d(rvm rvm) {
            this.a = rvm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            MemoriesFragment a = ((oje) this.a.c.get()).a();
            rvq rvq = (rvq) this.a.d.get();
            ajdp b = a.b();
            akcr.b(b, "memoriesEditEventObservable");
            Object f = b.a((ajdw) rvq.a().l()).f((ajfb) new g(rvq));
            akcr.a(f, "memoriesEditEventObserva…ession)\n                }");
            std.a(f, rvq.a);
            rvq = (rvq) this.a.d.get();
            b = a.f();
            akcr.b(b, "memoriesSendEventObservable");
            f = b.a((ajdw) rvq.a().l()).f((ajfb) new h(rvq));
            akcr.a(f, "memoriesSendEventObserva…ession)\n                }");
            std.a(f, rvq.a);
            return a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rvm.class), "discoverFeedPerformanceAnalytics", "getDiscoverFeedPerformanceAnalytics()Lcom/snap/discoverfeed/shared/analytics/DiscoverFeedPerformanceAnalytics;");
    }

    public rvm(aipn<hno> aipn, fz fzVar, HockeyUpdateManager hockeyUpdateManager, ppl ppl, ajwy<oje> ajwy, aipn<vxd> aipn2, ajwy<CameraFragment> ajwy2, aipn<rvq> aipn3, nkk nkk, nmb nmb, nmn nmn, obo obo, nnb nnb, ihh ihh, aipn<icz> aipn4, ajwy<fxi> ajwy3, ajwy<fxj> ajwy4) {
        fz fzVar2 = fzVar;
        HockeyUpdateManager hockeyUpdateManager2 = hockeyUpdateManager;
        ppl ppl2 = ppl;
        ajwy<oje> ajwy5 = ajwy;
        aipn<vxd> aipn5 = aipn2;
        ajwy<CameraFragment> ajwy6 = ajwy2;
        aipn<rvq> aipn6 = aipn3;
        nkk nkk2 = nkk;
        nmb nmb2 = nmb;
        nmn nmn2 = nmn;
        obo obo2 = obo;
        nnb nnb2 = nnb;
        ihh ihh2 = ihh;
        aipn<icz> aipn7 = aipn4;
        ajwy<fxi> ajwy7 = ajwy3;
        akcr.b(aipn, "discoverFeedPerformanceAnalyticsLazy");
        akcr.b(fzVar2, "fragmentManager");
        akcr.b(hockeyUpdateManager2, "hockeyUpdateManager");
        akcr.b(ppl2, "leakTracker");
        akcr.b(ajwy5, "memoriesFragmentFactory");
        akcr.b(aipn5, "searchLauncher");
        akcr.b(ajwy6, "cameraFragmentProvider");
        akcr.b(aipn6, "sendSessionLauncher");
        akcr.b(nkk2, "mapConfigurationProvider");
        akcr.b(nmb2, "mapMapPageFactory");
        akcr.b(nmn2, "mapSettingsPageFactory");
        akcr.b(obo2, "mapStatusPageFactory");
        akcr.b(nnb2, "mapPassportPageFactory");
        akcr.b(ihh2, "clock");
        akcr.b(aipn7, "pageLoadMetricReporter");
        ajwy<fxi> ajwy8 = ajwy3;
        akcr.b(ajwy8, "deviceConfiguration");
        akcr.b(ajwy4, "v11Configuration");
        ajwy<fxi> ajwy9 = ajwy8;
        super(fzVar2, new rvp(ajwy8));
        this.h = fzVar2;
        this.b = hockeyUpdateManager2;
        this.i = ppl2;
        this.c = ajwy5;
        this.j = aipn5;
        this.k = ajwy6;
        this.d = aipn6;
        this.e = nkk2;
        this.l = nmb2;
        this.m = nmn2;
        this.n = obo2;
        this.o = nnb2;
        this.p = ihh2;
        ajwy<fxj> ajwy10 = ajwy4;
        this.q = aipn4;
        this.r = ajwy9;
        this.f = ajwy10;
        this.a = ajxh.a(new e(aipn));
    }

    private final acgv<zjm> a(zjm zjm) {
        if (((fxi) this.r.get()).b) {
            return null;
        }
        if (akcr.a((Object) zjm, dnh.a)) {
            return new rvl(new a(this));
        }
        String str = "isV11Mode";
        Object obj;
        a a;
        if (akcr.a((Object) zjm, qxo.a)) {
            obj = (Boolean) ((fxj) this.f.get()).a().b();
            a = acgv.a();
            akcr.a(obj, str);
            return a.a(qxo.b(obj.booleanValue())).a(pql.c).a();
        } else if (akcr.a((Object) zjm, hbn.a)) {
            obj = (Boolean) ((fxj) this.f.get()).a().b();
            a = acgv.a();
            akcr.a(obj, str);
            return a.a(hbn.b(obj.booleanValue())).a();
        } else if (akcr.a((Object) zjm, pql.a)) {
            return acgv.a().a(pql.d).a();
        } else {
            if (akcr.a((Object) zjm, ojc.a)) {
                obj = (Boolean) ((fxj) this.f.get()).a().b();
                a = acgv.a();
                akcr.a(obj, str);
                return a.a(ojc.a.b(obj.booleanValue())).a();
            } else if (akcr.a((Object) zjm, adcw.a)) {
                return acgv.a().a(nmh.b).a();
            } else {
                StringBuilder stringBuilder = new StringBuilder("unexpected navigation action spec for {");
                stringBuilder.append(zjm);
                stringBuilder.append("} requested from page factory");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private aciv<zjm, zjk> a(DeckView deckView, zjk zjk, int i) {
        akcr.b(deckView, "deckView");
        akcr.b(zjk, "pageController");
        if (zjk instanceof zjf) {
            zjk.getDeckPageType();
        }
        return super.a(deckView, (achd) zjk, i);
    }

    private static zjk a(zjm zjm, akbk<? extends MainPageFragment> akbk, acgv<zjm> acgv) {
        new StringBuilder("fragmentFactory#").append(zjm);
        return new zjf(zjm, (MainPageFragment) akbk.invoke(), acgv);
    }

    public final void a(fv fvVar) {
        akcr.b(fvVar, Event.FRAGMENT);
        this.h.b();
        if (fvVar.getView() == null) {
            throw new acgy("Fragment content view is null \n Fragment = ".concat(String.valueOf(fvVar)));
        }
    }
}
