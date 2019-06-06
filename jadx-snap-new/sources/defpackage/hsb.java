package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.record.StoryModel;
import com.snap.discoverfeed.ui.main.fragment.DiscoverChannelFragment;
import com.snap.ui.avatar.AvatarView;
import com.snapchat.android.R;
import defpackage.hhc.e;
import defpackage.hhc.f;
import defpackage.hhv.a;
import defpackage.hhv.b;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: hsb */
public final class hsb implements hsa {
    final ajxe a;
    List<View> b;
    final aipn<hhc> c;
    final aipn<iqs> d;
    private final ajxe e;
    private final ajxe f;
    private final ajxe g;
    private final ajxe h;
    private final ajxe i;
    private final ajxe j;
    private final ajxe k;
    private final ajxe l = ajxh.a(new u(this.w));
    private hse m;
    private zke n;
    private long o;
    private final ajei p = new ajei();
    private final Context q;
    private final zfw r;
    private final achb<zjm, zjk> s;
    private final aipn<yut> t;
    private final aipn<ezb> u;
    private final aipn<eyo> v;
    private final ajwy<khb> w;
    private final aipn<hrf> x;
    private final aipn<hoy> y;

    /* renamed from: hsb$g */
    static final class g implements Runnable {
        private /* synthetic */ hsb a;

        g(hsb hsb) {
            this.a = hsb;
        }

        public final void run() {
            List<View> list = this.a.b;
            if (list == null) {
                akcr.a("hovaViewsClickGuard");
            }
            for (View clickable : list) {
                clickable.setClickable(true);
            }
        }
    }

    /* renamed from: hsb$q */
    static final class q<V> implements Callable<T> {
        private /* synthetic */ hjh a;
        private /* synthetic */ hsb b;
        private /* synthetic */ hro c;

        q(hjh hjh, hsb hsb, hro hro) {
            this.a = hjh;
            this.b = hsb;
            this.c = hro;
        }

        public final /* synthetic */ Object call() {
            return Long.valueOf(this.b.a(this.a));
        }
    }

    /* renamed from: hsb$h */
    static final class h<T, R> implements ajfc<T, R> {
        private /* synthetic */ b a;
        private /* synthetic */ hsb b;
        private /* synthetic */ hjx c;
        private /* synthetic */ long d;
        private /* synthetic */ View e;

        h(b bVar, hsb hsb, hjx hjx, long j, View view) {
            this.a = bVar;
            this.b = hsb;
            this.c = hjx;
            this.d = j;
            this.e = view;
        }

        public final /* synthetic */ Object apply(Object obj) {
            hhh hhh = (hhh) obj;
            akcr.b(hhh, "it");
            return this.b.a().a(this.e, this.b.b(), this.a, aahb.DISCOVER_FEED, new hho(this.d), hhh, this.c.a().g().k());
        }
    }

    /* renamed from: hsb$i */
    static final class i<T> implements ajfb<a> {
        private /* synthetic */ long a;
        private /* synthetic */ hsb b;
        private /* synthetic */ hjx c;
        private /* synthetic */ long d;
        private /* synthetic */ View e;

        i(long j, hsb hsb, hjx hjx, long j2, View view) {
            this.a = j;
            this.b = hsb;
            this.c = hjx;
            this.d = j2;
            this.e = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            a aVar = (a) obj;
            if (this.b.c().a() - this.a > 1000) {
                ieg.a("DF is taking too long to prepare story data to launch opera. Please shake.", true, 0);
            }
            aVar.a();
        }
    }

    /* renamed from: hsb$l */
    static final class l<T> implements ajfb<Throwable> {
        public static final l a = new l();

        l() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: hsb$m */
    static final class m<T> implements ajfb<List<? extends hjh>> {
        private /* synthetic */ hsb a;
        private /* synthetic */ hjh b;
        private /* synthetic */ View c;

        m(hsb hsb, hjh hjh, View view) {
            this.a = hsb;
            this.b = hjh;
            this.c = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            hhv a = this.a.a();
            hjh hjh = this.b;
            a.a(hjh, list, this.c, hkb.a((hio) hjh), this.a.b());
        }
    }

    /* renamed from: hsb$r */
    static final class r<T> implements ajfb<Long> {
        private /* synthetic */ hsb a;
        private /* synthetic */ hro b;

        r(hsb hsb, hro hro) {
            this.a = hsb;
            this.b = hro;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Long) obj;
            pqn pqn = (pqn) this.a.a.b();
            akcr.a(obj, "feedId");
            pqn.a(obj.longValue(), abbd.DISCOVER);
            this.a.b().e(this.b.a.u.a());
        }
    }

    /* renamed from: hsb$s */
    static final class s<T> implements ajfb<Boolean> {
        private /* synthetic */ boolean a;
        private /* synthetic */ hjx b;
        private /* synthetic */ hsb c;
        private /* synthetic */ hrs d;

        s(boolean z, hjx hjx, hsb hsb, hrs hrs) {
            this.a = z;
            this.b = hjx;
            this.c = hsb;
            this.d = hrs;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (this.a) {
                this.c.b().a(this.b.a(), zyr.TAP, null, null, abfb.FEED_PAGE, null, null);
            } else {
                this.c.b().b(this.b.a(), zyr.TAP, null, null, abfb.FEED_PAGE, null, null);
            }
        }
    }

    /* renamed from: hsb$t */
    static final class t<T> implements ajfb<Throwable> {
        public static final t a = new t();

        t() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: hsb$o */
    static final class o extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ hsb a;
        private /* synthetic */ hjk b;

        o(hsb hsb, hjk hjk) {
            this.a = hsb;
            this.b = hjk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            if (akcr.a(this.b.a, hje.e)) {
                ((iqs) this.a.d.get()).a(new isu(FriendSuggestionPlacement.STORIES_PAGE));
                hsb.a(this.a).d.a(Boolean.FALSE);
            } else {
                how how = new how(this.b.a);
                hhc hhc = (hhc) this.a.c.get();
                akcr.b(how, "sectionHideEvent");
                hjd hjd = how.a;
                akcr.a((Object) hjd, "sectionHideEvent.mSection");
                obj = hiu.a(hjd);
                akcr.a(obj, "ClientActionableStoryKeys.fromSection(section)");
                hpl hpl = hhc.g;
                String str = hhc.a;
                if (str == null) {
                    akcr.a();
                }
                ajej a = hpl.a(str, obj).g(e.a).b((ajdw) hhc.i.g()).a((ajdw) hhc.i.f()).a((ajfb) new f(hhc), igu.a("HiddenCardsStore"));
                akcr.a((Object) a, "discoverFeedNetworkApi.h…rrorLoggingConsumer(TAG))");
                ajvv.a(a, hhc.f);
                hse a2 = hsb.a(this.a);
                Object obj2 = this.b.a;
                akcr.b(obj2, "section");
                a2.f.a(obj2);
                this.a.b().a(this.b.a, zyr.TAP);
            }
            return ajxw.a;
        }
    }

    /* renamed from: hsb$p */
    static final class p extends akcs implements akbl<AvatarView, Drawable> {
        public static final p a = new p();

        p() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            AvatarView avatarView = (AvatarView) obj;
            akcr.b(avatarView, "view");
            return avatarView.getStoryView().getDrawable();
        }
    }

    /* renamed from: hsb$a */
    static final class a extends akcq implements akbk<pqn> {
        a(aipn aipn) {
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
            return (pqn) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: hsb$b */
    static final class b extends akcq implements akbk<ihh> {
        b(aipn aipn) {
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
            return (ihh) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: hsb$c */
    static final class c extends akcq implements akbk<hgr> {
        c(aipn aipn) {
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
            return (hgr) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: hsb$d */
    static final class d extends akcq implements akbk<prc> {
        d(aipn aipn) {
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
            return (prc) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: hsb$e */
    static final class e extends akcq implements akbk<iqy> {
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
            return (iqy) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: hsb$f */
    static final class f extends akcq implements akbk<hhv> {
        f(aipn aipn) {
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
            return (hhv) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: hsb$j */
    static final class j extends akcq implements akbl<hhh, hhh> {
        j(hsb hsb) {
            super(1, hsb);
        }

        public final String getName() {
            return "filterViewedStoriesAndAds";
        }

        public final akej getOwner() {
            return akde.a(hsb.class);
        }

        public final String getSignature() {
            return "filterViewedStoriesAndAds(Lcom/snap/discoverfeed/dependency/DataModelsBundle;)Lcom/snap/discoverfeed/dependency/DataModelsBundle;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            hhh hhh = (hhh) obj;
            akcr.b(hhh, "p1");
            return hsb.b(hhh);
        }
    }

    /* renamed from: hsb$k */
    static final class k extends akcq implements akbl<hhh, hhh> {
        k(hsb hsb) {
            super(1, hsb);
        }

        public final String getName() {
            return "deDupeDataModelsBundle";
        }

        public final akej getOwner() {
            return akde.a(hsb.class);
        }

        public final String getSignature() {
            return "deDupeDataModelsBundle(Lcom/snap/discoverfeed/dependency/DataModelsBundle;)Lcom/snap/discoverfeed/dependency/DataModelsBundle;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            hhh hhh = (hhh) obj;
            akcr.b(hhh, "p1");
            return hsb.a(hhh);
        }
    }

    /* renamed from: hsb$n */
    static final class n extends akcq implements akbk<hvl> {
        n(aipn aipn) {
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
            return (hvl) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: hsb$u */
    static final class u extends akcq implements akbk<khb> {
        u(ajwy ajwy) {
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
            return (khb) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hsb$v */
    static final class v extends akcq implements akbk<hhu> {
        v(aipn aipn) {
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
            return (hhu) ((aipn) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hsb.class), "fullscreenViewerLauncher", "getFullscreenViewerLauncher()Lcom/snap/discoverfeed/dependency/StoriesFullscreenViewerLauncher;"), new akdc(akde.a(hsb.class), "storiesAnalytics", "getStoriesAnalytics()Lcom/snap/discoverfeed/dependency/StoriesAnalytics;"), new akdc(akde.a(hsb.class), "friendingApi", "getFriendingApi()Lcom/snap/identity/api/FriendingApi;"), new akdc(akde.a(hsb.class), "chatLauncher", "getChatLauncher()Lcom/snap/messaging/api/ChatLauncher;"), new akdc(akde.a(hsb.class), "feedIdRepository", "getFeedIdRepository()Lcom/snap/messaging/api/FeedIdRepository;"), new akdc(akde.a(hsb.class), "miniProfileLauncher", "getMiniProfileLauncher()Lcom/snap/discoverfeed/ui/storyprofile/DiscoverFeedMiniProfileLauncher;"), new akdc(akde.a(hsb.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(hsb.class), "discoverStoriesRepo", "getDiscoverStoriesRepo()Lcom/snap/discoverfeed/data/DiscoverFeedStoriesRepo;"), new akdc(akde.a(hsb.class), "showProfileLauncher", "getShowProfileLauncher()Lcom/snap/impala/model/shows/ShowProfileLauncher;")};
    }

    public hsb(Context context, zfw zfw, aipn<hhv> aipn, aipn<hhu> aipn2, aipn<iqy> aipn3, achb<zjm, zjk> achb, aipn<pqn> aipn4, aipn<prc> aipn5, aipn<hvl> aipn6, aipn<ihh> aipn7, aipn<hgr> aipn8, aipn<yut> aipn9, aipn<hhc> aipn10, aipn<ezb> aipn11, aipn<eyo> aipn12, ajwy<khb> ajwy, aipn<hrf> aipn13, aipn<hoy> aipn14, aipn<iqs> aipn15) {
        Context context2 = context;
        zfw zfw2 = zfw;
        aipn<hhv> aipn16 = aipn;
        aipn<hhu> aipn17 = aipn2;
        aipn<iqy> aipn18 = aipn3;
        achb<zjm, zjk> achb2 = achb;
        aipn<pqn> aipn19 = aipn4;
        aipn<prc> aipn20 = aipn5;
        aipn<hvl> aipn21 = aipn6;
        aipn<ihh> aipn22 = aipn7;
        aipn<hgr> aipn23 = aipn8;
        aipn<yut> aipn24 = aipn9;
        aipn<hhc> aipn25 = aipn10;
        aipn<ezb> aipn26 = aipn11;
        aipn<eyo> aipn27 = aipn12;
        ajwy<khb> ajwy2 = ajwy;
        akcr.b(context2, "context");
        akcr.b(zfw2, "schedulers");
        akcr.b(aipn16, "fullscreenViewerLauncherLazy");
        akcr.b(aipn17, "storiesAnalyticsLazy");
        akcr.b(aipn18, "friendingApiLazy");
        akcr.b(achb2, "navigationHost");
        akcr.b(aipn19, "chatLauncherLazy");
        akcr.b(aipn20, "feedIdRepositoryLazy");
        akcr.b(aipn21, "miniProfileLauncherLazy");
        akcr.b(aipn22, "clockLazy");
        akcr.b(aipn23, "discoverFeedStoriesRepoLazy");
        akcr.b(aipn24, "subscriptionDataSource");
        akcr.b(aipn25, "hiddenCardsStore");
        akcr.b(aipn26, "cognacStoryProvider");
        akcr.b(aipn27, "cognacFragmentService");
        akcr.b(ajwy, "showProfileLauncherProvider");
        aipn<hrf> aipn28 = aipn13;
        akcr.b(aipn28, "dfStoryPrefetcher");
        aipn<hoy> aipn29 = aipn14;
        akcr.b(aipn29, "discoverFeedFeatureFlagManager");
        aipn<iqs> aipn30 = aipn15;
        akcr.b(aipn30, "friendActionDispatcher");
        ajwy<khb> ajwy3 = ajwy;
        this.q = context2;
        this.r = zfw2;
        this.s = achb2;
        this.t = aipn24;
        this.c = aipn25;
        this.u = aipn26;
        this.v = aipn27;
        this.w = ajwy3;
        this.x = aipn28;
        this.y = aipn29;
        this.d = aipn30;
        this.e = ajxh.a(new f(aipn16));
        this.f = ajxh.a(new v(aipn17));
        this.g = ajxh.a(new e(aipn18));
        this.a = ajxh.a(new a(aipn19));
        this.h = ajxh.a(new d(aipn5));
        this.i = ajxh.a(new n(aipn6));
        this.j = ajxh.a(new b(aipn7));
        this.k = ajxh.a(new c(aipn8));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x008f in {8, 11, 13, 15} preds:[]
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
    static defpackage.hhh a(defpackage.hhh r8) {
        /*
        r0 = r8.b;	 Catch:{ all -> 0x008d }
        r1 = new java.util.LinkedHashSet;	 Catch:{ all -> 0x008d }
        r1.<init>();	 Catch:{ all -> 0x008d }
        r1 = (java.util.Set) r1;	 Catch:{ all -> 0x008d }
        r2 = new java.util.LinkedHashSet;	 Catch:{ all -> 0x008d }
        r2.<init>();	 Catch:{ all -> 0x008d }
        r2 = (java.util.Set) r2;	 Catch:{ all -> 0x008d }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x008d }
        r3.<init>();	 Catch:{ all -> 0x008d }
        r3 = (java.util.List) r3;	 Catch:{ all -> 0x008d }
        r4 = r0;	 Catch:{ all -> 0x008d }
        r4 = (java.lang.Iterable) r4;	 Catch:{ all -> 0x008d }
        r4 = r4.iterator();	 Catch:{ all -> 0x008d }
        r5 = r4.hasNext();	 Catch:{ all -> 0x008d }
        if (r5 == 0) goto L_0x0072;	 Catch:{ all -> 0x008d }
        r5 = r4.next();	 Catch:{ all -> 0x008d }
        r5 = (defpackage.hjx) r5;	 Catch:{ all -> 0x008d }
        r6 = r5.a();	 Catch:{ all -> 0x008d }
        r6 = r6.e();	 Catch:{ all -> 0x008d }
        r6 = r1.contains(r6);	 Catch:{ all -> 0x008d }
        if (r6 != 0) goto L_0x001e;	 Catch:{ all -> 0x008d }
        r6 = r5.a();	 Catch:{ all -> 0x008d }
        r6 = r6.af();	 Catch:{ all -> 0x008d }
        r6 = r6.b();	 Catch:{ all -> 0x008d }
        r6 = r2.contains(r6);	 Catch:{ all -> 0x008d }
        if (r6 != 0) goto L_0x001e;	 Catch:{ all -> 0x008d }
        r3.add(r5);	 Catch:{ all -> 0x008d }
        r6 = r5.a();	 Catch:{ all -> 0x008d }
        r6 = r6.e();	 Catch:{ all -> 0x008d }
        r7 = "it.data.itemId()";	 Catch:{ all -> 0x008d }
        defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x008d }
        r1.add(r6);	 Catch:{ all -> 0x008d }
        r5 = r5.a();	 Catch:{ all -> 0x008d }
        r5 = r5.af();	 Catch:{ all -> 0x008d }
        r5 = r5.b();	 Catch:{ all -> 0x008d }
        r6 = "it.data.storyId().storyId()";	 Catch:{ all -> 0x008d }
        defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x008d }
        r2.add(r5);	 Catch:{ all -> 0x008d }
        goto L_0x001e;	 Catch:{ all -> 0x008d }
        r1 = r3.size();	 Catch:{ all -> 0x008d }
        r0 = r0.size();	 Catch:{ all -> 0x008d }
        if (r1 >= r0) goto L_0x0083;	 Catch:{ all -> 0x008d }
        r0 = "Found duplicates in data models bundle. Please shake.";	 Catch:{ all -> 0x008d }
        r1 = 1;	 Catch:{ all -> 0x008d }
        r2 = 0;	 Catch:{ all -> 0x008d }
        defpackage.ieg.a(r0, r1, r2);	 Catch:{ all -> 0x008d }
        r0 = new hhh;	 Catch:{ all -> 0x008d }
        r1 = r8.a;	 Catch:{ all -> 0x008d }
        r4 = r8.c;	 Catch:{ all -> 0x008d }
        r0.<init>(r1, r3, r4);	 Catch:{ all -> 0x008d }
        return r0;
        r8 = move-exception;
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsb.a(hhh):hhh");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0068 in {6, 9, 10, 13, 14, 16, 18, 20} preds:[]
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
    static defpackage.hhh b(defpackage.hhh r9) {
        /*
        r0 = r9.a;	 Catch:{ all -> 0x0066 }
        r1 = r9.b;	 Catch:{ all -> 0x0066 }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0066 }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0066 }
        r2.<init>();	 Catch:{ all -> 0x0066 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0066 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0066 }
        r3 = r1.hasNext();	 Catch:{ all -> 0x0066 }
        if (r3 == 0) goto L_0x005c;	 Catch:{ all -> 0x0066 }
        r3 = r1.next();	 Catch:{ all -> 0x0066 }
        r4 = r3;	 Catch:{ all -> 0x0066 }
        r4 = (defpackage.hjx) r4;	 Catch:{ all -> 0x0066 }
        r5 = r4.a();	 Catch:{ all -> 0x0066 }
        r5 = r5.c();	 Catch:{ all -> 0x0066 }
        r6 = r9.a;	 Catch:{ all -> 0x0066 }
        r6 = r6.a();	 Catch:{ all -> 0x0066 }
        r6 = r6.c();	 Catch:{ all -> 0x0066 }
        r5 = defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x0066 }
        r6 = 0;	 Catch:{ all -> 0x0066 }
        r7 = 1;	 Catch:{ all -> 0x0066 }
        if (r5 == 0) goto L_0x0039;	 Catch:{ all -> 0x0066 }
        goto L_0x0056;	 Catch:{ all -> 0x0066 }
        r5 = r4.a();	 Catch:{ all -> 0x0066 }
        r5 = r5.r();	 Catch:{ all -> 0x0066 }
        r4 = r4.a();	 Catch:{ all -> 0x0066 }
        r4 = r4.d();	 Catch:{ all -> 0x0066 }
        r8 = defpackage.hbj.PROMOTED_STORY_CARD;	 Catch:{ all -> 0x0066 }
        if (r4 != r8) goto L_0x004f;	 Catch:{ all -> 0x0066 }
        r4 = 1;	 Catch:{ all -> 0x0066 }
        goto L_0x0050;	 Catch:{ all -> 0x0066 }
        r4 = 0;	 Catch:{ all -> 0x0066 }
        if (r5 != 0) goto L_0x0055;	 Catch:{ all -> 0x0066 }
        if (r4 != 0) goto L_0x0055;	 Catch:{ all -> 0x0066 }
        goto L_0x0056;	 Catch:{ all -> 0x0066 }
        r7 = 0;	 Catch:{ all -> 0x0066 }
        if (r7 == 0) goto L_0x0011;	 Catch:{ all -> 0x0066 }
        r2.add(r3);	 Catch:{ all -> 0x0066 }
        goto L_0x0011;	 Catch:{ all -> 0x0066 }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x0066 }
        r3 = r9.c;	 Catch:{ all -> 0x0066 }
        r9 = new hhh;	 Catch:{ all -> 0x0066 }
        r9.<init>(r0, r2, r3);	 Catch:{ all -> 0x0066 }
        return r9;
        r9 = move-exception;
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsb.b(hhh):hhh");
    }

    private final iqy d() {
        return (iqy) this.g.b();
    }

    private final prc e() {
        return (prc) this.h.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x005a in {7, 11, 13, 16, 18, 20} preds:[]
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
    private boolean f() {
        /*
        r7 = this;
        r0 = r7.c();	 Catch:{ all -> 0x0058 }
        r0 = r0.a();	 Catch:{ all -> 0x0058 }
        r2 = r7.o;	 Catch:{ all -> 0x0058 }
        r2 = r0 - r2;	 Catch:{ all -> 0x0058 }
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ all -> 0x0058 }
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ all -> 0x0058 }
        if (r6 <= 0) goto L_0x0056;	 Catch:{ all -> 0x0058 }
        r7.o = r0;	 Catch:{ all -> 0x0058 }
        r0 = r7.b;	 Catch:{ all -> 0x0054 }
        if (r0 != 0) goto L_0x001d;	 Catch:{ all -> 0x0054 }
        r1 = "hovaViewsClickGuard";	 Catch:{ all -> 0x0054 }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x0054 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0054 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0054 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0054 }
        r2 = 0;	 Catch:{ all -> 0x0054 }
        if (r1 == 0) goto L_0x0034;	 Catch:{ all -> 0x0054 }
        r1 = r0.next();	 Catch:{ all -> 0x0054 }
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x0054 }
        r1.setClickable(r2);	 Catch:{ all -> 0x0054 }
        goto L_0x0023;	 Catch:{ all -> 0x0054 }
        r0 = r7.r;	 Catch:{ all -> 0x0054 }
        r0 = r0.l();	 Catch:{ all -> 0x0054 }
        r0 = (defpackage.zfr) r0;	 Catch:{ all -> 0x0054 }
        r1 = new hsb$g;	 Catch:{ all -> 0x0054 }
        r1.<init>(r7);	 Catch:{ all -> 0x0054 }
        r1 = (java.lang.Runnable) r1;	 Catch:{ all -> 0x0054 }
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x0054 }
        r0 = r0.a(r1, r4, r3);	 Catch:{ all -> 0x0054 }
        r1 = "schedulers\n             …   TimeUnit.MILLISECONDS)";	 Catch:{ all -> 0x0054 }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0054 }
        r1 = r7.p;	 Catch:{ all -> 0x0054 }
        defpackage.ajvv.a(r0, r1);	 Catch:{ all -> 0x0054 }
        return r2;
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0058 }
        r0 = 1;
        return r0;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsb.f():boolean");
    }

    /* Access modifiers changed, original: final */
    public final long a(hjh hjh) {
        prc e;
        Object z = hjh.z();
        hji F = hjh.F();
        String str = StoryModel.USERNAME;
        if (F != null) {
            if (hsc.a[F.ordinal()] == 1) {
                e = e();
                akcr.a(z, str);
                return e.b(z);
            }
        }
        e = e();
        akcr.a(z, str);
        return e.a(z);
    }

    /* Access modifiers changed, original: final */
    public final hhv a() {
        return (hhv) this.e.b();
    }

    public final void a(hse hse, zkf zkf, List<View> list) {
        akcr.b(hse, "presenter");
        akcr.b(zkf, "bus");
        akcr.b(list, "hovaClickGuard");
        this.m = hse;
        ajej a = zkf.a(this);
        akcr.a((Object) a, "bus.subscribe(this)");
        ajvv.a(a, this.p);
        this.b = list;
        Object a2 = zkf.a();
        akcr.a(a2, "bus.eventDispatcher");
        this.n = a2;
    }

    /* Access modifiers changed, original: final */
    public final hhu b() {
        return (hhu) this.f.b();
    }

    /* Access modifiers changed, original: final */
    public final ihh c() {
        return (ihh) this.j.b();
    }

    public final void dispose() {
        this.p.dispose();
    }

    public final boolean isDisposed() {
        return this.p.isDisposed();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAddFriendEvent(isj isj) {
        akcr.b(isj, "event");
        ((iqs) this.d.get()).a(isj);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClickSectionHeaderEvent(his his) {
        akcr.b(his, "event");
        if (akcr.a(his.a, hje.e)) {
            iqy.a.a(d(), this.s, 0, false, ith.QUICK_ADD_CAROUSEL_HEADER_ON_DISCOVER_FEED, null, 22);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onDebugCardClickEvent(hrp hrp) {
        akcr.b(hrp, "event");
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onDiscoverFriendsFooterClickEvent(hrq hrq) {
        akcr.b(hrq, "event");
        iqy.a.a(d(), this.s, 0, true, ith.ADD_FRIENDS_CTA_BUTTON_ON_DISCOVER_FEED, null, 18);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendClickAvatarIconEvent(iso iso) {
        akcr.b(iso, "event");
        ((iqs) this.d.get()).a(iso);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendLongClickEvent(isr isr) {
        akcr.b(isr, "event");
        ((iqs) this.d.get()).a(isr);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onHideCarouselSectionEvent(hjk hjk) {
        hjk hjk2 = hjk;
        akcr.b(hjk2, "event");
        zgy.a a = new zgy.a(this.q, this.s, new zjm(hbn.f, "hide_section_dialog", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 16).a((int) R.string.hide_section_confirmation);
        zgy.a.a(a.a((int) R.string.hide_section, (akbl) new o(this, hjk2), true), null, false, null, null, null, 31);
        zgy a2 = a.a();
        this.s.a((achd) a2, a2.a, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onHideFriendEvent(ist ist) {
        akcr.b(ist, "event");
        ((iqs) this.d.get()).a(ist);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onLeaveMobStoryEvent(hov hov) {
        akcr.b(hov, "event");
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onLongClickCardEvent(hrr hrr) {
        akcr.b(hrr, "event");
        hio a = hrr.a().u.a();
        akcr.a((Object) a, "event.cardViewModel.dataModel.data");
        Object peekFirst = this.s.g().peekFirst();
        akcr.a(peekFirst, "navigationHost.pageStack.peekFirst()");
        b().a(a, zyr.TAP_AND_HOLD, akcr.a((zjm) ((aciv) peekFirst).e(), hbn.b) ? "channel_2" : null);
        ajvv.a(((hvl) this.i.b()).a(a, hvl.a.ACTION_MENU, a(), hrr.a().v), this.p);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:67:0x029b in {4, 13, 18, 21, 28, 30, 33, 35, 43, 45, 50, 51, 54, 57, 59, 61, 64, 66} preds:[]
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
    @defpackage.akqq(a = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onOnClickCardEvent(defpackage.hrn r15) {
        /*
        r14 = this;
        r0 = "event";
        defpackage.akcr.b(r15, r0);
        r0 = r14.f();	 Catch:{ all -> 0x0299 }
        if (r0 == 0) goto L_0x000c;	 Catch:{ all -> 0x0299 }
        return;	 Catch:{ all -> 0x0299 }
        r0 = r15.b();	 Catch:{ all -> 0x0299 }
        r0 = r0.u;	 Catch:{ all -> 0x0299 }
        r0 = r0.a();	 Catch:{ all -> 0x0299 }
        r0 = r0 instanceof defpackage.hjg;	 Catch:{ all -> 0x0299 }
        r1 = "presenter";
        r2 = "event.cardView";
        if (r0 != 0) goto L_0x016a;
        r0 = r15.b();	 Catch:{ all -> 0x0299 }
        r0 = r0.u;	 Catch:{ all -> 0x0299 }
        r0 = r0.a();	 Catch:{ all -> 0x0299 }
        r0 = r0 instanceof defpackage.hjf;	 Catch:{ all -> 0x0299 }
        if (r0 != 0) goto L_0x016a;	 Catch:{ all -> 0x0299 }
        r0 = r15.b();	 Catch:{ all -> 0x0299 }
        r0 = r0.u;	 Catch:{ all -> 0x0299 }
        r0 = r0.a();	 Catch:{ all -> 0x0299 }
        r0 = r0 instanceof defpackage.hjq;	 Catch:{ all -> 0x0299 }
        if (r0 == 0) goto L_0x003c;	 Catch:{ all -> 0x0299 }
        goto L_0x016a;	 Catch:{ all -> 0x0299 }
        r0 = r15.b();	 Catch:{ all -> 0x0299 }
        r0 = r0.u;	 Catch:{ all -> 0x0299 }
        r0 = r0.a();	 Catch:{ all -> 0x0299 }
        r0 = r0 instanceof defpackage.hjh;	 Catch:{ all -> 0x0299 }
        if (r0 == 0) goto L_0x00ef;	 Catch:{ all -> 0x0299 }
        r0 = r15.b();	 Catch:{ all -> 0x0299 }
        r0 = r0.u;	 Catch:{ all -> 0x0299 }
        r3 = r15.a();	 Catch:{ all -> 0x0299 }
        r4 = r3 instanceof com.snap.ui.avatar.AvatarView;	 Catch:{ all -> 0x0299 }
        if (r4 != 0) goto L_0x0059;	 Catch:{ all -> 0x0299 }
        r3 = 0;	 Catch:{ all -> 0x0299 }
        r3 = (com.snap.ui.avatar.AvatarView) r3;	 Catch:{ all -> 0x0299 }
        if (r3 == 0) goto L_0x0071;	 Catch:{ all -> 0x0299 }
        r4 = new slo;	 Catch:{ all -> 0x0299 }
        r3 = (android.view.View) r3;	 Catch:{ all -> 0x0299 }
        r5 = defpackage.hsb.p.a;	 Catch:{ all -> 0x0299 }
        r5 = (defpackage.akbl) r5;	 Catch:{ all -> 0x0299 }
        r4.<init>(r3, r5);	 Catch:{ all -> 0x0299 }
        r3 = r14.a();	 Catch:{ all -> 0x0299 }
        r4 = (android.view.View) r4;	 Catch:{ all -> 0x0299 }
        r3.a(r0, r4);	 Catch:{ all -> 0x0299 }
        r0 = r14.x;	 Catch:{ all -> 0x0299 }
        r0 = r0.get();	 Catch:{ all -> 0x0299 }
        r0 = (defpackage.hrf) r0;	 Catch:{ all -> 0x0299 }
        r3 = r15.b();	 Catch:{ all -> 0x0299 }
        r3 = r3.t;	 Catch:{ all -> 0x0299 }
        r0.a(r3);	 Catch:{ all -> 0x0299 }
        r0 = r15.b();	 Catch:{ all -> 0x0299 }
        r0 = r0.u;	 Catch:{ all -> 0x0299 }
        r0 = r0.a();	 Catch:{ all -> 0x0299 }
        if (r0 == 0) goto L_0x00e7;	 Catch:{ all -> 0x0299 }
        r0 = (defpackage.hjh) r0;	 Catch:{ all -> 0x0299 }
        r15 = r15.a();	 Catch:{ all -> 0x0299 }
        defpackage.akcr.a(r15, r2);	 Catch:{ all -> 0x0299 }
        r2 = r14.m;	 Catch:{ all -> 0x00e5 }
        if (r2 != 0) goto L_0x009e;	 Catch:{ all -> 0x00e5 }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x00e5 }
        r1 = "friendStoryData";	 Catch:{ all -> 0x00e5 }
        defpackage.akcr.b(r0, r1);	 Catch:{ all -> 0x00e5 }
        r1 = r2.c;	 Catch:{ all -> 0x00e5 }
        r2 = defpackage.hje.c;	 Catch:{ all -> 0x00e5 }
        r1 = r1.a(r2);	 Catch:{ all -> 0x00e5 }
        r2 = defpackage.hse.l.a;	 Catch:{ all -> 0x00e5 }
        r2 = (defpackage.ajfc) r2;	 Catch:{ all -> 0x00e5 }
        r1 = r1.f(r2);	 Catch:{ all -> 0x00e5 }
        r2 = new hse$m;	 Catch:{ all -> 0x00e5 }
        r2.<init>(r0);	 Catch:{ all -> 0x00e5 }
        r2 = (defpackage.ajfc) r2;	 Catch:{ all -> 0x00e5 }
        r1 = r1.f(r2);	 Catch:{ all -> 0x00e5 }
        r2 = "storiesRepo.getData(DF_S…    it)\n                }";	 Catch:{ all -> 0x00e5 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x00e5 }
        r2 = r14.r;	 Catch:{ all -> 0x00e5 }
        r2 = r2.h();	 Catch:{ all -> 0x00e5 }
        r2 = (defpackage.ajdw) r2;	 Catch:{ all -> 0x00e5 }
        r1 = r1.b(r2);	 Catch:{ all -> 0x00e5 }
        r2 = new hsb$m;	 Catch:{ all -> 0x00e5 }
        r2.<init>(r14, r0, r15);	 Catch:{ all -> 0x00e5 }
        r2 = (defpackage.ajfb) r2;	 Catch:{ all -> 0x00e5 }
        r15 = r1.e(r2);	 Catch:{ all -> 0x00e5 }
        r0 = "presenter\n              …cs)\n                    }";	 Catch:{ all -> 0x00e5 }
        defpackage.akcr.a(r15, r0);	 Catch:{ all -> 0x00e5 }
        r0 = r14.p;	 Catch:{ all -> 0x00e5 }
        defpackage.ajvv.a(r15, r0);	 Catch:{ all -> 0x00e5 }
        return;
        r15 = move-exception;
        throw r15;	 Catch:{ all -> 0x0299 }
        r15 = new ajxt;	 Catch:{ all -> 0x0299 }
        r0 = "null cannot be cast to non-null type com.snap.discoverfeed.model.FriendStoryData";	 Catch:{ all -> 0x0299 }
        r15.<init>(r0);	 Catch:{ all -> 0x0299 }
        throw r15;	 Catch:{ all -> 0x0299 }
        r15 = r15.b();	 Catch:{ all -> 0x0299 }
        r15 = r15.u;	 Catch:{ all -> 0x0299 }
        r15 = r15.a();	 Catch:{ all -> 0x0299 }
        r0 = "event.cardViewModel.dataModel.data";	 Catch:{ all -> 0x0299 }
        defpackage.akcr.a(r15, r0);	 Catch:{ all -> 0x0299 }
        r0 = r14.u;	 Catch:{ all -> 0x0299 }
        r0 = r0.get();	 Catch:{ all -> 0x0299 }
        r1 = "cognacStoryProvider.get()";	 Catch:{ all -> 0x0299 }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0299 }
        r0 = (defpackage.ezb) r0;	 Catch:{ all -> 0x0299 }
        r0 = r0.a();	 Catch:{ all -> 0x0299 }
        if (r0 == 0) goto L_0x015b;	 Catch:{ all -> 0x0299 }
        r0 = r14.y;	 Catch:{ all -> 0x0299 }
        r0 = r0.get();	 Catch:{ all -> 0x0299 }
        r1 = "discoverFeedFeatureFlagManager.get()";	 Catch:{ all -> 0x0299 }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0299 }
        r0 = (defpackage.hoy) r0;	 Catch:{ all -> 0x0299 }
        r0 = r0.F();	 Catch:{ all -> 0x0299 }
        if (r0 == 0) goto L_0x015b;	 Catch:{ all -> 0x0299 }
        r0 = r15 instanceof defpackage.hix;	 Catch:{ all -> 0x0299 }
        if (r0 == 0) goto L_0x015b;	 Catch:{ all -> 0x0299 }
        r0 = r14.v;	 Catch:{ all -> 0x0299 }
        r0 = r0.get();	 Catch:{ all -> 0x0299 }
        r1 = r0;	 Catch:{ all -> 0x0299 }
        r1 = (defpackage.eyo) r1;	 Catch:{ all -> 0x0299 }
        r0 = r15;	 Catch:{ all -> 0x0299 }
        r0 = (defpackage.hix) r0;	 Catch:{ all -> 0x0299 }
        r3 = r0.B();	 Catch:{ all -> 0x0299 }
        r0 = r15;	 Catch:{ all -> 0x0299 }
        r0 = (defpackage.hix) r0;	 Catch:{ all -> 0x0299 }
        r4 = r0.C();	 Catch:{ all -> 0x0299 }
        r0 = r15;	 Catch:{ all -> 0x0299 }
        r0 = (defpackage.hix) r0;	 Catch:{ all -> 0x0299 }
        r6 = r0.z();	 Catch:{ all -> 0x0299 }
        r15 = (defpackage.hix) r15;	 Catch:{ all -> 0x0299 }
        r7 = r15.y();	 Catch:{ all -> 0x0299 }
        r8 = "INDIVIDUAL";	 Catch:{ all -> 0x0299 }
        r15 = defpackage.ajyw.a;	 Catch:{ all -> 0x0299 }
        r9 = r15;	 Catch:{ all -> 0x0299 }
        r9 = (java.util.List) r9;	 Catch:{ all -> 0x0299 }
        r2 = 0;	 Catch:{ all -> 0x0299 }
        r5 = 0;	 Catch:{ all -> 0x0299 }
        r10 = defpackage.eza.COGNAC_OPENED_FROM_DISCOVER;	 Catch:{ all -> 0x0299 }
        r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0299 }
        return;	 Catch:{ all -> 0x0299 }
        r15 = r14.q;	 Catch:{ all -> 0x0299 }
        r0 = "Mushroom DF story playback coming Soon!";	 Catch:{ all -> 0x0299 }
        r0 = (java.lang.CharSequence) r0;	 Catch:{ all -> 0x0299 }
        r1 = 1;	 Catch:{ all -> 0x0299 }
        r15 = android.widget.Toast.makeText(r15, r0, r1);	 Catch:{ all -> 0x0299 }
        r15.show();	 Catch:{ all -> 0x0299 }
        return;	 Catch:{ all -> 0x0299 }
        r0 = r14.x;	 Catch:{ all -> 0x0299 }
        r0 = r0.get();	 Catch:{ all -> 0x0299 }
        r0 = (defpackage.hrf) r0;	 Catch:{ all -> 0x0299 }
        r3 = r15.b();	 Catch:{ all -> 0x0299 }
        r3 = r3.t;	 Catch:{ all -> 0x0299 }
        r0.a(r3);	 Catch:{ all -> 0x0299 }
        r11 = r15.a();	 Catch:{ all -> 0x0299 }
        defpackage.akcr.a(r11, r2);	 Catch:{ all -> 0x0299 }
        r0 = r15.b();	 Catch:{ all -> 0x0299 }
        r0 = r0.u;	 Catch:{ all -> 0x0299 }
        r2 = r15.c();	 Catch:{ all -> 0x0299 }
        r15 = r14.c();	 Catch:{ all -> 0x0297 }
        r12 = r15.a();	 Catch:{ all -> 0x0297 }
        r15 = r14.s;	 Catch:{ all -> 0x0297 }
        r15 = r15.g();	 Catch:{ all -> 0x0297 }
        r15 = r15.peekFirst();	 Catch:{ all -> 0x0297 }
        r4 = "navigationHost.pageStack.peekFirst()";	 Catch:{ all -> 0x0297 }
        defpackage.akcr.a(r15, r4);	 Catch:{ all -> 0x0297 }
        r15 = (defpackage.aciv) r15;	 Catch:{ all -> 0x0297 }
        r15 = r15.e();	 Catch:{ all -> 0x0297 }
        r4 = "navigationHost.pageStack.peekFirst().pageType";	 Catch:{ all -> 0x0297 }
        defpackage.akcr.a(r15, r4);	 Catch:{ all -> 0x0297 }
        r4 = defpackage.hbn.b;	 Catch:{ all -> 0x0297 }
        r15 = defpackage.akcr.a(r15, r4);	 Catch:{ all -> 0x0297 }
        if (r15 == 0) goto L_0x01b9;	 Catch:{ all -> 0x0297 }
        r15 = defpackage.hhv.b.DF_CHANNEL_PIVOT;	 Catch:{ all -> 0x0297 }
        goto L_0x01bb;	 Catch:{ all -> 0x0297 }
        r15 = defpackage.hhv.b.CHEETAH_STORIES;	 Catch:{ all -> 0x0297 }
        r5 = r15;	 Catch:{ all -> 0x0297 }
        r15 = r14.m;	 Catch:{ all -> 0x0297 }
        if (r15 != 0) goto L_0x01c3;	 Catch:{ all -> 0x0297 }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x0297 }
        r1 = "tappedCard";	 Catch:{ all -> 0x0297 }
        defpackage.akcr.b(r0, r1);	 Catch:{ all -> 0x0297 }
        r6 = defpackage.abqo.c();	 Catch:{ all -> 0x0297 }
        r1 = r0.a();	 Catch:{ all -> 0x0297 }
        r1 = r1.d();	 Catch:{ all -> 0x0297 }
        r4 = defpackage.hbj.PROMOTED_STORY_CARD;	 Catch:{ all -> 0x0297 }
        if (r1 != r4) goto L_0x01f2;	 Catch:{ all -> 0x0297 }
        r15 = new hhh;	 Catch:{ all -> 0x0297 }
        r1 = com.google.common.collect.ImmutableList.of(r0);	 Catch:{ all -> 0x0297 }
        r4 = "ImmutableList.of(tappedCard)";	 Catch:{ all -> 0x0297 }
        defpackage.akcr.a(r1, r4);	 Catch:{ all -> 0x0297 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x0297 }
        r15.<init>(r0, r1, r6);	 Catch:{ all -> 0x0297 }
        r15 = defpackage.ajdx.b(r15);	 Catch:{ all -> 0x0297 }
        r1 = "Single.just(DataModelsBu…tartTimeMs\n            ))";	 Catch:{ all -> 0x0297 }
        defpackage.akcr.a(r15, r1);	 Catch:{ all -> 0x0297 }
        goto L_0x0224;	 Catch:{ all -> 0x0297 }
        r1 = r0.a();	 Catch:{ all -> 0x0297 }
        r1 = r1.g();	 Catch:{ all -> 0x0297 }
        r1 = r1.k();	 Catch:{ all -> 0x0297 }
        r4 = "tappedCard.data.cardLogg…o().discoverFeedSection()";	 Catch:{ all -> 0x0297 }
        defpackage.akcr.a(r1, r4);	 Catch:{ all -> 0x0297 }
        r15 = r15.c;	 Catch:{ all -> 0x0297 }
        r15 = r15.a(r1);	 Catch:{ all -> 0x0297 }
        r1 = defpackage.hse.n.a;	 Catch:{ all -> 0x0297 }
        r1 = (defpackage.ajfc) r1;	 Catch:{ all -> 0x0297 }
        r15 = r15.f(r1);	 Catch:{ all -> 0x0297 }
        r1 = "storiesRepo.getData(section).map { it.toList() }";	 Catch:{ all -> 0x0297 }
        defpackage.akcr.a(r15, r1);	 Catch:{ all -> 0x0297 }
        r1 = new hse$k;	 Catch:{ all -> 0x0297 }
        r1.<init>(r0, r6);	 Catch:{ all -> 0x0297 }
        r1 = (defpackage.ajfc) r1;	 Catch:{ all -> 0x0297 }
        r15 = r15.f(r1);	 Catch:{ all -> 0x0297 }
        r1 = "getPlayableStories(tappe…Ms)\n                    }";	 Catch:{ all -> 0x0297 }
        goto L_0x01ee;	 Catch:{ all -> 0x0297 }
        r1 = new hsb$j;	 Catch:{ all -> 0x0297 }
        r4 = r14;	 Catch:{ all -> 0x0297 }
        r4 = (defpackage.hsb) r4;	 Catch:{ all -> 0x0297 }
        r1.<init>(r4);	 Catch:{ all -> 0x0297 }
        r1 = (defpackage.akbl) r1;	 Catch:{ all -> 0x0297 }
        r4 = new hsd;	 Catch:{ all -> 0x0297 }
        r4.<init>(r1);	 Catch:{ all -> 0x0297 }
        r4 = (defpackage.ajfc) r4;	 Catch:{ all -> 0x0297 }
        r15 = r15.f(r4);	 Catch:{ all -> 0x0297 }
        r1 = new hsb$k;	 Catch:{ all -> 0x0297 }
        r4 = r14;	 Catch:{ all -> 0x0297 }
        r4 = (defpackage.hsb) r4;	 Catch:{ all -> 0x0297 }
        r1.<init>(r4);	 Catch:{ all -> 0x0297 }
        r1 = (defpackage.akbl) r1;	 Catch:{ all -> 0x0297 }
        r4 = new hsd;	 Catch:{ all -> 0x0297 }
        r4.<init>(r1);	 Catch:{ all -> 0x0297 }
        r4 = (defpackage.ajfc) r4;	 Catch:{ all -> 0x0297 }
        r15 = r15.f(r4);	 Catch:{ all -> 0x0297 }
        r1 = r14.r;	 Catch:{ all -> 0x0297 }
        r1 = r1.h();	 Catch:{ all -> 0x0297 }
        r1 = (defpackage.ajdw) r1;	 Catch:{ all -> 0x0297 }
        r15 = r15.b(r1);	 Catch:{ all -> 0x0297 }
        r1 = new hsb$h;	 Catch:{ all -> 0x0297 }
        r4 = r1;	 Catch:{ all -> 0x0297 }
        r6 = r14;	 Catch:{ all -> 0x0297 }
        r7 = r0;	 Catch:{ all -> 0x0297 }
        r8 = r2;	 Catch:{ all -> 0x0297 }
        r10 = r11;	 Catch:{ all -> 0x0297 }
        r4.<init>(r5, r6, r7, r8, r10);	 Catch:{ all -> 0x0297 }
        r1 = (defpackage.ajfc) r1;	 Catch:{ all -> 0x0297 }
        r15 = r15.f(r1);	 Catch:{ all -> 0x0297 }
        r1 = r14.r;	 Catch:{ all -> 0x0297 }
        r1 = r1.l();	 Catch:{ all -> 0x0297 }
        r1 = (defpackage.zfr) r1;	 Catch:{ all -> 0x0297 }
        r1 = (defpackage.ajdw) r1;	 Catch:{ all -> 0x0297 }
        r15 = r15.a(r1);	 Catch:{ all -> 0x0297 }
        r1 = new hsb$i;	 Catch:{ all -> 0x0297 }
        r4 = r1;	 Catch:{ all -> 0x0297 }
        r5 = r12;	 Catch:{ all -> 0x0297 }
        r7 = r14;	 Catch:{ all -> 0x0297 }
        r8 = r0;	 Catch:{ all -> 0x0297 }
        r9 = r2;	 Catch:{ all -> 0x0297 }
        r4.<init>(r5, r7, r8, r9, r11);	 Catch:{ all -> 0x0297 }
        r1 = (defpackage.ajfb) r1;	 Catch:{ all -> 0x0297 }
        r0 = defpackage.hsb.l.a;	 Catch:{ all -> 0x0297 }
        r0 = (defpackage.ajfb) r0;	 Catch:{ all -> 0x0297 }
        r15 = r15.a(r1, r0);	 Catch:{ all -> 0x0297 }
        r0 = "presenter.getPlayableDat…it.localizedMessage}\") })";	 Catch:{ all -> 0x0297 }
        defpackage.akcr.a(r15, r0);	 Catch:{ all -> 0x0297 }
        r0 = r14.p;	 Catch:{ all -> 0x0297 }
        defpackage.ajvv.a(r15, r0);	 Catch:{ all -> 0x0297 }
        return;
        r15 = move-exception;
        throw r15;	 Catch:{ all -> 0x0299 }
        r15 = move-exception;
        throw r15;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsb.onOnClickCardEvent(hrn):void");
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onOnClickChatEvent(hro hro) {
        akcr.b(hro, "event");
        if (hro.a instanceof huy) {
            Object c = hro.a.u.c();
            akcr.a(c, "event.model.dataModel.getTypedData()");
            ajej e = ajdx.c((Callable) new q((hjh) c, this, hro)).b((ajdw) this.r.i()).a((ajdw) this.r.h()).e((ajfb) new r(this, hro));
            akcr.a((Object) e, "Single.fromCallable { ge…ta)\n                    }");
            ajvv.a(e, this.p);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPostViewClickCardEvent(hrs hrs) {
        String str = "dataModel.data";
        akcr.b(hrs, "event");
        if (!f()) {
            hjx hjx = hrs.a().u;
            Object a = hjx.a();
            akcr.a(a, str);
            if (a.d() == hbj.FRIEND_STORY_CARD) {
                Object a2 = hrs.a();
                akcr.a(a2, "event.cardViewModel");
                onOnClickChatEvent(new hro(a2));
                return;
            }
            alfb e = hkc.e(a);
            if (e != null) {
                ((khb) this.l.b()).b(e, aaua.DISCOVER_FEED, aats.DEFAULT);
                return;
            }
            a = hjx.a();
            akcr.a(a, str);
            ajej a3 = ((yut) this.t.get()).a(hjy.a(hjx, null)).a((ajfb) new s(!a.q(), hjx, this, hrs), (ajfb) t.a);
            akcr.a((Object) a3, "subscriptionDataSource.g…story failed: %s\", it) })");
            ajvv.a(a3, this.p);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onRemoveFriendEvent(itc itc) {
        akcr.b(itc, "event");
        ((iqs) this.d.get()).a(itc);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onStartReplyCameraEvent(ite ite) {
        akcr.b(ite, "event");
        ((iqs) this.d.get()).a(ite);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onViewAllSectionEvent(hkf hkf) {
        akcr.b(hkf, "event");
        DiscoverChannelFragment discoverChannelFragment = new DiscoverChannelFragment();
        hjd hjd = hkf.a;
        zke zke = this.n;
        if (zke == null) {
            akcr.a("eventDispatcher");
        }
        hrz hrz = new hrz(hjd, zke);
        zjf zjf = new zjf(hbn.b, discoverChannelFragment, acgv.a().a(hbn.d).a());
        achb achb = this.s;
        achd achd = zjf;
        acgu acgu = hbn.c;
        akcr.a((Object) acgu, "DiscoverFeedFeature.DISC…FEED_CHANNEL_PAGE_PRESENT");
        achb.a(achd, acgu, (acih) hrz);
        b().a(hkf.a);
    }

    @akqq(a = ThreadMode.BACKGROUND)
    public final void onViewBoundEvent(hrt hrt) {
        akcr.b(hrt, "event");
        if (hrt.b instanceof hvj) {
            zmy zmy = hrt.b;
            if (zmy != null) {
                a().a(((hvj) zmy).u, hrt.a);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.discoverfeed.ui.main.viewmodel.StoryCardBaseViewModel");
        }
    }

    @akqq(a = ThreadMode.BACKGROUND)
    public final void onViewRecycledEvent(hru hru) {
        akcr.b(hru, "event");
        if (hru.b instanceof hvj) {
            zmy zmy = hru.b;
            if (zmy != null) {
                a().b(((hvj) zmy).u, hru.a);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.discoverfeed.ui.main.viewmodel.StoryCardBaseViewModel");
        }
    }
}
