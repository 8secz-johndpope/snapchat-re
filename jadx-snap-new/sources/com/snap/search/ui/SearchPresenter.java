package com.snap.search.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.snap.core.db.column.FeatureType;
import com.snap.ui.avatar.AvatarCache;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajey;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajot;
import defpackage.ajvo;
import defpackage.ajwl;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.hwg;
import defpackage.hwl;
import defpackage.j;
import defpackage.k;
import defpackage.kcl;
import defpackage.ocl;
import defpackage.s;
import defpackage.vxc;
import defpackage.vxe;
import defpackage.vzi;
import defpackage.vzn;
import defpackage.wae;
import defpackage.wai;
import defpackage.waj;
import defpackage.wal;
import defpackage.way;
import defpackage.waz;
import defpackage.wbi;
import defpackage.weh;
import defpackage.wei;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zlm;
import defpackage.zmh;
import defpackage.zms;
import java.util.concurrent.TimeUnit;

public final class SearchPresenter extends zll<zlm> implements k {
    public vxe a;
    public Class<? extends vzi> b;
    final zfw c = zgb.a(vxc.f, "SearchPresenter");
    public final ajwl<wae> d;
    public final wbi e;
    final vzn f;
    final ajwy<ocl> g;
    private final ajxe h;
    private final ajxe i;
    private ajei j;
    private zms k;
    private zkf l;
    private zmh m;
    private waz n;
    private ajcx o;
    private ajej p;
    private Context q;
    private final ajxe r;
    private final ajxe s;
    private final way t;
    private final AvatarCache u;
    private final ajdx<hwl> v;
    private final kcl w;
    private final wai x;

    static final class e<T, R> implements ajfc<hwl, ajdb> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            hwl hwl = (hwl) obj;
            akcr.b(hwl, "it");
            return hwl.a((hwg) com.snap.discover.playback.db.durableJob.PlaybackSnapsCleanupJob.a.a(FeatureType.SEARCH, "playback_cleanup_job_tag_search"));
        }
    }

    static final class f<T, R> implements ajfc<T, ajdt<U>> {
        private /* synthetic */ SearchPresenter a;
        private /* synthetic */ zlm b;

        f(SearchPresenter searchPresenter, zlm zlm) {
            this.a = searchPresenter;
            this.b = zlm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            wae wae = (wae) obj;
            akcr.b(wae, "query");
            return TextUtils.isEmpty((CharSequence) wae.b) ? ajvo.a(ajot.a) : ajdp.b(150, TimeUnit.MILLISECONDS).b((ajdw) this.a.c.b());
        }
    }

    static final class g<T> implements ajfb<wae> {
        private /* synthetic */ SearchPresenter a;
        private /* synthetic */ zlm b;

        g(SearchPresenter searchPresenter, zlm zlm) {
            this.a = searchPresenter;
            this.b = zlm;
        }

        public final /* synthetic */ void accept(Object obj) {
            wae wae = (wae) obj;
            vzn vzn = this.a.f;
            akcr.a((Object) wae, "it");
            vzn.a(wae);
        }
    }

    static final class b extends akcs implements akbk<ocl> {
        private /* synthetic */ SearchPresenter a;

        b(SearchPresenter searchPresenter) {
            this.a = searchPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ocl) this.a.g.get();
        }
    }

    static final class d extends akcs implements akbk<ajdp<wae>> {
        private /* synthetic */ SearchPresenter a;

        d(SearchPresenter searchPresenter) {
            this.a = searchPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.d.a((ajey) AnonymousClass1.a);
        }
    }

    static final class a extends akcq implements akbk<wal> {
        a(ajwy ajwy) {
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
            return (wal) ((ajwy) this.receiver).get();
        }
    }

    static final class c extends akcq implements akbk<waj> {
        c(ajwy ajwy) {
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
            return (waj) ((ajwy) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SearchPresenter.class), "friendingManager", "getFriendingManager()Lcom/snap/search/manager/SearchFriendingManager;"), new akdc(akde.a(SearchPresenter.class), "searchDiscoverPlaybackManager", "getSearchDiscoverPlaybackManager()Lcom/snap/search/manager/SearchDiscoverPlaybackManager;"), new akdc(akde.a(SearchPresenter.class), "searchQuery", "getSearchQuery()Lio/reactivex/Observable;"), new akdc(akde.a(SearchPresenter.class), "mapSearchControllerFactory", "getMapSearchControllerFactory()Lcom/snap/mapsearchpretype/api/MapSearchPretypeControllerFactory;")};
    }

    public SearchPresenter(way way, AvatarCache avatarCache, ajdx<hwl> ajdx, wbi wbi, vzn vzn, ajwy<wal> ajwy, ajwy<waj> ajwy2, zgb zgb, ajwy<ocl> ajwy3, kcl kcl, wai wai) {
        akcr.b(way, "searchEventDispatcher");
        akcr.b(avatarCache, "avatarCache");
        akcr.b(ajdx, "durableJobManager");
        akcr.b(wbi, "searchSectionManager");
        akcr.b(vzn, "searchEventObserver");
        akcr.b(ajwy, "friendingManagerProvider");
        akcr.b(ajwy2, "searchDiscoverPlaybackManagerProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy3, "mapSearchControllerProvider");
        akcr.b(kcl, "impalaStudySettings");
        akcr.b(wai, "loadCompleteMetricsManager");
        this.t = way;
        this.u = avatarCache;
        this.v = ajdx;
        this.e = wbi;
        this.f = vzn;
        this.g = ajwy3;
        this.w = kcl;
        this.x = wai;
        this.h = ajxh.a(new a(ajwy));
        this.i = ajxh.a(new c(ajwy2));
        Object i = ajwl.i(wae.d);
        akcr.a(i, "BehaviorSubject.createDe…(SearchQuery.SEARCH_OPEN)");
        this.d = i;
        this.r = ajxh.a(new d(this));
        this.s = ajxh.a(new b(this));
    }

    private final ajdp<wae> a() {
        return (ajdp) this.r.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:89:0x038a in {6, 11, 14, 16, 21, 26, 31, 36, 39, 42, 45, 51, 52, 55, 58, 61, 64, 67, 70, 73, 76, 79, 82, 85, 86, 88} preds:[]
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
    /* renamed from: a */
    public final void takeTarget(defpackage.zlm r35) {
        /*
        r34 = this;
        r8 = r34;
        r0 = r35;
        r9 = "bus.eventDispatcher";
        r10 = "searchQuery";
        r1 = "target";
        defpackage.akcr.b(r0, r1);
        super.takeTarget(r35);	 Catch:{ all -> 0x0388 }
        r1 = r8.f;	 Catch:{ all -> 0x0388 }
        r2 = r8.a;	 Catch:{ all -> 0x0388 }
        r11 = "searchOptions";
        if (r2 != 0) goto L_0x001b;
        defpackage.akcr.a(r11);	 Catch:{ all -> 0x0388 }
        r2 = r2.a;	 Catch:{ all -> 0x0388 }
        r1.a(r2);	 Catch:{ all -> 0x0388 }
        r1 = r35.d();	 Catch:{ all -> 0x0388 }
        r2 = "target.activity";	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0388 }
        r1 = (android.content.Context) r1;	 Catch:{ all -> 0x0388 }
        r8.q = r1;	 Catch:{ all -> 0x0388 }
        r1 = new ajei;	 Catch:{ all -> 0x0388 }
        r1.<init>();	 Catch:{ all -> 0x0388 }
        r2 = r1;	 Catch:{ all -> 0x0388 }
        r2 = (defpackage.ajej) r2;	 Catch:{ all -> 0x0388 }
        r3 = r8;	 Catch:{ all -> 0x0388 }
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0388 }
        r4 = 0;	 Catch:{ all -> 0x0388 }
        r5 = 0;	 Catch:{ all -> 0x0388 }
        r6 = 6;	 Catch:{ all -> 0x0388 }
        r7 = 0;	 Catch:{ all -> 0x0388 }
        r1 = r34;	 Catch:{ all -> 0x0388 }
        r1 = defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0388 }
        r1 = (defpackage.ajei) r1;	 Catch:{ all -> 0x0388 }
        r8.j = r1;	 Catch:{ all -> 0x0388 }
        r1 = new zkf;	 Catch:{ all -> 0x0388 }
        r1.<init>();	 Catch:{ all -> 0x0388 }
        r2 = r1;	 Catch:{ all -> 0x0388 }
        r2 = (defpackage.ajej) r2;	 Catch:{ all -> 0x0388 }
        r3 = r8;	 Catch:{ all -> 0x0388 }
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0388 }
        r4 = 0;	 Catch:{ all -> 0x0388 }
        r5 = 0;	 Catch:{ all -> 0x0388 }
        r6 = 6;	 Catch:{ all -> 0x0388 }
        r7 = 0;	 Catch:{ all -> 0x0388 }
        r1 = r34;	 Catch:{ all -> 0x0388 }
        r1 = defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0388 }
        r1 = (defpackage.zkf) r1;	 Catch:{ all -> 0x0388 }
        r8.l = r1;	 Catch:{ all -> 0x0388 }
        r1 = r8.l;	 Catch:{ all -> 0x0388 }
        r12 = "bus";
        if (r1 != 0) goto L_0x0068;
        defpackage.akcr.a(r12);	 Catch:{ all -> 0x0388 }
        r2 = r8.t;	 Catch:{ all -> 0x0388 }
        r1.a(r2);	 Catch:{ all -> 0x0388 }
        r1 = r8.e;	 Catch:{ all -> 0x0388 }
        r2 = r1;	 Catch:{ all -> 0x0388 }
        r2 = (defpackage.ajej) r2;	 Catch:{ all -> 0x0388 }
        r3 = r8;	 Catch:{ all -> 0x0388 }
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0388 }
        r4 = 0;	 Catch:{ all -> 0x0388 }
        r5 = 0;	 Catch:{ all -> 0x0388 }
        r6 = 6;	 Catch:{ all -> 0x0388 }
        r7 = 0;	 Catch:{ all -> 0x0388 }
        r1 = r34;	 Catch:{ all -> 0x0388 }
        defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0388 }
        r1 = r8.t;	 Catch:{ all -> 0x0388 }
        r2 = r1;	 Catch:{ all -> 0x0388 }
        r2 = (defpackage.ajej) r2;	 Catch:{ all -> 0x0388 }
        r3 = r8;	 Catch:{ all -> 0x0388 }
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0388 }
        r4 = 0;	 Catch:{ all -> 0x0388 }
        r5 = 0;	 Catch:{ all -> 0x0388 }
        r6 = 6;	 Catch:{ all -> 0x0388 }
        r7 = 0;	 Catch:{ all -> 0x0388 }
        r1 = r34;	 Catch:{ all -> 0x0388 }
        defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0388 }
        r1 = 1;	 Catch:{ all -> 0x0388 }
        r2 = new java.lang.Class[r1];	 Catch:{ all -> 0x0388 }
        r3 = defpackage.wba.class;	 Catch:{ all -> 0x0388 }
        r4 = 0;	 Catch:{ all -> 0x0388 }
        r2[r4] = r3;	 Catch:{ all -> 0x0388 }
        r2 = defpackage.ajym.c(r2);	 Catch:{ all -> 0x0388 }
        r3 = r8.b;	 Catch:{ all -> 0x0388 }
        if (r3 != 0) goto L_0x00a4;	 Catch:{ all -> 0x0388 }
        r5 = "viewTypeClass";	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r5);	 Catch:{ all -> 0x0388 }
        if (r3 == 0) goto L_0x00a9;	 Catch:{ all -> 0x0388 }
        r2.add(r3);	 Catch:{ all -> 0x0388 }
        r3 = new zms;	 Catch:{ all -> 0x0388 }
        r5 = new wax;	 Catch:{ all -> 0x0388 }
        r14 = r8.u;	 Catch:{ all -> 0x0388 }
        r15 = r8.c;	 Catch:{ all -> 0x0388 }
        r6 = r8.s;	 Catch:{ all -> 0x0388 }
        r6 = r6.b();	 Catch:{ all -> 0x0388 }
        r6 = (defpackage.ocl) r6;	 Catch:{ all -> 0x0388 }
        r7 = "mapSearchControllerFactory";	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x0388 }
        r7 = r8.w;	 Catch:{ all -> 0x0388 }
        r13 = r8.x;	 Catch:{ all -> 0x0388 }
        r18 = r13;	 Catch:{ all -> 0x0388 }
        r13 = r5;	 Catch:{ all -> 0x0388 }
        r16 = r6;	 Catch:{ all -> 0x0388 }
        r17 = r7;	 Catch:{ all -> 0x0388 }
        r13.<init>(r14, r15, r16, r17, r18);	 Catch:{ all -> 0x0388 }
        r5 = (defpackage.zlx) r5;	 Catch:{ all -> 0x0388 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0388 }
        r3.<init>(r5, r2);	 Catch:{ all -> 0x0388 }
        r8.k = r3;	 Catch:{ all -> 0x0388 }
        r2 = r8.q;	 Catch:{ all -> 0x0388 }
        r13 = "context";
        if (r2 != 0) goto L_0x00de;
        defpackage.akcr.a(r13);	 Catch:{ all -> 0x0388 }
        r3 = r8.c;	 Catch:{ all -> 0x0388 }
        r3 = r3.h();	 Catch:{ all -> 0x0388 }
        r3 = (defpackage.ajdw) r3;	 Catch:{ all -> 0x0388 }
        r5 = android.view.LayoutInflater.from(r2);	 Catch:{ all -> 0x0388 }
        r6 = new android.support.v7.widget.RecyclerView;	 Catch:{ all -> 0x0388 }
        r6.<init>(r2);	 Catch:{ all -> 0x0388 }
        r7 = new android.support.v7.widget.LinearLayoutManager;	 Catch:{ all -> 0x0388 }
        r7.<init>(r2);	 Catch:{ all -> 0x0388 }
        r7 = (android.support.v7.widget.RecyclerView.LayoutManager) r7;	 Catch:{ all -> 0x0388 }
        r6.setLayoutManager(r7);	 Catch:{ all -> 0x0388 }
        r6 = (android.view.ViewGroup) r6;	 Catch:{ all -> 0x0388 }
        r2 = new zmv;	 Catch:{ all -> 0x0388 }
        r2.<init>(r3, r5, r6);	 Catch:{ all -> 0x0388 }
        r3 = r8.k;	 Catch:{ all -> 0x0388 }
        r14 = "viewFactory";
        if (r3 != 0) goto L_0x0109;
        defpackage.akcr.a(r14);	 Catch:{ all -> 0x0388 }
        r5 = r2;	 Catch:{ all -> 0x0388 }
        r5 = (defpackage.zmx) r5;	 Catch:{ all -> 0x0388 }
        r3.setViewPrefetcher(r5);	 Catch:{ all -> 0x0388 }
        r3 = 5;	 Catch:{ all -> 0x0388 }
        r3 = new defpackage.ajxm[r3];	 Catch:{ all -> 0x0388 }
        r5 = 2131559278; // 0x7f0d036e float:1.8743896E38 double:1.0531302113E-314;	 Catch:{ all -> 0x0388 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0388 }
        r6 = 8;	 Catch:{ all -> 0x0388 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x0388 }
        r5 = defpackage.ajxs.a(r5, r6);	 Catch:{ all -> 0x0388 }
        r3[r4] = r5;	 Catch:{ all -> 0x0388 }
        r4 = 2131559285; // 0x7f0d0375 float:1.874391E38 double:1.053130215E-314;	 Catch:{ all -> 0x0388 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0388 }
        r5 = 3;	 Catch:{ all -> 0x0388 }
        r6 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0388 }
        r4 = defpackage.ajxs.a(r4, r6);	 Catch:{ all -> 0x0388 }
        r3[r1] = r4;	 Catch:{ all -> 0x0388 }
        r4 = 2131559286; // 0x7f0d0376 float:1.8743912E38 double:1.0531302153E-314;	 Catch:{ all -> 0x0388 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0388 }
        r6 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x0388 }
        r4 = defpackage.ajxs.a(r4, r6);	 Catch:{ all -> 0x0388 }
        r6 = 2;	 Catch:{ all -> 0x0388 }
        r3[r6] = r4;	 Catch:{ all -> 0x0388 }
        r4 = 2131559283; // 0x7f0d0373 float:1.8743906E38 double:1.053130214E-314;	 Catch:{ all -> 0x0388 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0388 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x0388 }
        r4 = defpackage.ajxs.a(r4, r6);	 Catch:{ all -> 0x0388 }
        r3[r5] = r4;	 Catch:{ all -> 0x0388 }
        r4 = 4;	 Catch:{ all -> 0x0388 }
        r5 = 2131559269; // 0x7f0d0365 float:1.8743877E38 double:1.053130207E-314;	 Catch:{ all -> 0x0388 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0388 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x0388 }
        r1 = defpackage.ajxs.a(r5, r1);	 Catch:{ all -> 0x0388 }
        r3[r4] = r1;	 Catch:{ all -> 0x0388 }
        r1 = defpackage.ajzm.a(r3);	 Catch:{ all -> 0x0388 }
        r1 = r2.a(r1);	 Catch:{ all -> 0x0388 }
        r2 = "preloader.load(mapOf(Sea…LOAD_EMPTY_HEADER_COUNT))";	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0388 }
        r1 = r1.d();	 Catch:{ all -> 0x0388 }
        r2 = "preloadViews(context).cache()";	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0388 }
        r8.o = r1;	 Catch:{ all -> 0x0388 }
        r1 = r8.o;	 Catch:{ all -> 0x0388 }
        r15 = "preloads";
        if (r1 != 0) goto L_0x018d;
        defpackage.akcr.a(r15);	 Catch:{ all -> 0x0388 }
        r1 = r1.e();	 Catch:{ all -> 0x0388 }
        r2 = "preloads.subscribe()";	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0388 }
        r2 = r8.j;	 Catch:{ all -> 0x0388 }
        r16 = "disposables";
        if (r2 != 0) goto L_0x019f;
        defpackage.akcr.a(r16);	 Catch:{ all -> 0x0388 }
        defpackage.ajvv.a(r1, r2);	 Catch:{ all -> 0x0388 }
        r1 = r34.a();	 Catch:{ all -> 0x0388 }
        r2 = new com.snap.search.ui.SearchPresenter$f;	 Catch:{ all -> 0x0388 }
        r2.<init>(r8, r0);	 Catch:{ all -> 0x0388 }
        r2 = (defpackage.ajfc) r2;	 Catch:{ all -> 0x0388 }
        r1 = r1.h(r2);	 Catch:{ all -> 0x0388 }
        r2 = r8.c;	 Catch:{ all -> 0x0388 }
        r2 = r2.l();	 Catch:{ all -> 0x0388 }
        r2 = (defpackage.zfr) r2;	 Catch:{ all -> 0x0388 }
        r2 = (defpackage.ajdw) r2;	 Catch:{ all -> 0x0388 }
        r1 = r1.a(r2);	 Catch:{ all -> 0x0388 }
        r2 = new com.snap.search.ui.SearchPresenter$g;	 Catch:{ all -> 0x0388 }
        r2.<init>(r8, r0);	 Catch:{ all -> 0x0388 }
        r2 = (defpackage.ajfb) r2;	 Catch:{ all -> 0x0388 }
        r2 = r1.f(r2);	 Catch:{ all -> 0x0388 }
        r3 = r8;	 Catch:{ all -> 0x0388 }
        r3 = (defpackage.zln) r3;	 Catch:{ all -> 0x0388 }
        r4 = 0;	 Catch:{ all -> 0x0388 }
        r5 = 0;	 Catch:{ all -> 0x0388 }
        r6 = 6;	 Catch:{ all -> 0x0388 }
        r7 = 0;	 Catch:{ all -> 0x0388 }
        r1 = r34;	 Catch:{ all -> 0x0388 }
        defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0388 }
        r1 = new wdt;	 Catch:{ all -> 0x0388 }
        r1.<init>();	 Catch:{ all -> 0x0388 }
        r2 = r8.e;	 Catch:{ all -> 0x0388 }
        r3 = r8.q;	 Catch:{ all -> 0x0388 }
        if (r3 != 0) goto L_0x01e4;	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r13);	 Catch:{ all -> 0x0388 }
        r4 = r8.l;	 Catch:{ all -> 0x0388 }
        if (r4 != 0) goto L_0x01eb;	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r12);	 Catch:{ all -> 0x0388 }
        r5 = r34.a();	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r5, r10);	 Catch:{ all -> 0x0388 }
        defpackage.akcr.b(r3, r13);	 Catch:{ all -> 0x0388 }
        defpackage.akcr.b(r4, r12);	 Catch:{ all -> 0x0388 }
        defpackage.akcr.b(r5, r10);	 Catch:{ all -> 0x0388 }
        r6 = new wbi$a;	 Catch:{ all -> 0x0388 }
        r6.<init>(r2);	 Catch:{ all -> 0x0388 }
        r6 = (defpackage.ajfc) r6;	 Catch:{ all -> 0x0388 }
        r5 = r5.h(r6);	 Catch:{ all -> 0x0388 }
        r6 = r2.a;	 Catch:{ all -> 0x0388 }
        r6 = r6.h();	 Catch:{ all -> 0x0388 }
        r6 = (defpackage.ajdw) r6;	 Catch:{ all -> 0x0388 }
        r5 = r5.a(r6);	 Catch:{ all -> 0x0388 }
        r6 = defpackage.wbi.b.a;	 Catch:{ all -> 0x0388 }
        r6 = (defpackage.ajfc) r6;	 Catch:{ all -> 0x0388 }
        r5 = r5.p(r6);	 Catch:{ all -> 0x0388 }
        r6 = new java.util.ArrayList;	 Catch:{ all -> 0x0388 }
        r6.<init>();	 Catch:{ all -> 0x0388 }
        r6 = (java.util.List) r6;	 Catch:{ all -> 0x0388 }
        r7 = r2.c;	 Catch:{ all -> 0x0388 }
        if (r7 != 0) goto L_0x022a;	 Catch:{ all -> 0x0388 }
        r17 = "sectionProviders";	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r17);	 Catch:{ all -> 0x0388 }
        r7 = (java.lang.Iterable) r7;	 Catch:{ all -> 0x0388 }
        r7 = r7.iterator();	 Catch:{ all -> 0x0388 }
        r17 = r7.hasNext();	 Catch:{ all -> 0x0388 }
        if (r17 == 0) goto L_0x025c;	 Catch:{ all -> 0x0388 }
        r17 = r7.next();	 Catch:{ all -> 0x0388 }
        r0 = r17;	 Catch:{ all -> 0x0388 }
        r0 = (defpackage.vzy) r0;	 Catch:{ all -> 0x0388 }
        r17 = r7;	 Catch:{ all -> 0x0388 }
        r7 = "processedSearchQuery";	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r5, r7);	 Catch:{ all -> 0x0388 }
        r7 = r2.d;	 Catch:{ all -> 0x0388 }
        if (r7 != 0) goto L_0x024c;	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r11);	 Catch:{ all -> 0x0388 }
        r7 = r7.a;	 Catch:{ all -> 0x0388 }
        r0 = r0.a(r3, r4, r5, r7);	 Catch:{ all -> 0x0388 }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0388 }
        r6.addAll(r0);	 Catch:{ all -> 0x0388 }
        r0 = r35;	 Catch:{ all -> 0x0388 }
        r7 = r17;	 Catch:{ all -> 0x0388 }
        goto L_0x0230;	 Catch:{ all -> 0x0388 }
        r0 = r8.e;	 Catch:{ all -> 0x0388 }
        r2 = r8.l;	 Catch:{ all -> 0x0388 }
        if (r2 != 0) goto L_0x0265;	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r12);	 Catch:{ all -> 0x0388 }
        r2 = r2.a();	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r2, r9);	 Catch:{ all -> 0x0388 }
        r3 = r8.k;	 Catch:{ all -> 0x0388 }
        if (r3 != 0) goto L_0x0273;	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r14);	 Catch:{ all -> 0x0388 }
        r4 = r34.a();	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r4, r10);	 Catch:{ all -> 0x0388 }
        r5 = r8.q;	 Catch:{ all -> 0x0388 }
        if (r5 != 0) goto L_0x0281;	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r13);	 Catch:{ all -> 0x0388 }
        r7 = r8.l;	 Catch:{ all -> 0x0388 }
        if (r7 != 0) goto L_0x0288;	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r12);	 Catch:{ all -> 0x0388 }
        r11 = "eventDispatcher";	 Catch:{ all -> 0x0388 }
        defpackage.akcr.b(r2, r11);	 Catch:{ all -> 0x0388 }
        defpackage.akcr.b(r3, r14);	 Catch:{ all -> 0x0388 }
        defpackage.akcr.b(r4, r10);	 Catch:{ all -> 0x0388 }
        defpackage.akcr.b(r5, r13);	 Catch:{ all -> 0x0388 }
        defpackage.akcr.b(r7, r12);	 Catch:{ all -> 0x0388 }
        r13 = r12;	 Catch:{ all -> 0x0388 }
        r11 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x0388 }
        r12 = r0.a;	 Catch:{ all -> 0x0388 }
        r12 = r12.b();	 Catch:{ all -> 0x0388 }
        r12 = (defpackage.ajdw) r12;	 Catch:{ all -> 0x0388 }
        r26 = r13;	 Catch:{ all -> 0x0388 }
        r25 = r14;	 Catch:{ all -> 0x0388 }
        r13 = 300; // 0x12c float:4.2E-43 double:1.48E-321;	 Catch:{ all -> 0x0388 }
        r4 = r4.b(r13, r11, r12);	 Catch:{ all -> 0x0388 }
        r11 = new wbi$c;	 Catch:{ all -> 0x0388 }
        r18 = r11;	 Catch:{ all -> 0x0388 }
        r19 = r0;	 Catch:{ all -> 0x0388 }
        r20 = r2;	 Catch:{ all -> 0x0388 }
        r21 = r5;	 Catch:{ all -> 0x0388 }
        r22 = r7;	 Catch:{ all -> 0x0388 }
        r23 = r3;	 Catch:{ all -> 0x0388 }
        r18.<init>(r19, r20, r21, r22, r23);	 Catch:{ all -> 0x0388 }
        r11 = (defpackage.ajfc) r11;	 Catch:{ all -> 0x0388 }
        r2 = r4.u(r11);	 Catch:{ all -> 0x0388 }
        r0 = r0.a;	 Catch:{ all -> 0x0388 }
        r0 = r0.b();	 Catch:{ all -> 0x0388 }
        r0 = (defpackage.ajdw) r0;	 Catch:{ all -> 0x0388 }
        r0 = r2.b(r0);	 Catch:{ all -> 0x0388 }
        r2 = new vzz;	 Catch:{ all -> 0x0388 }
        r3 = 7;	 Catch:{ all -> 0x0388 }
        r4 = 0;	 Catch:{ all -> 0x0388 }
        r2.<init>(r4, r4, r4, r3);	 Catch:{ all -> 0x0388 }
        r0 = r0.h(r2);	 Catch:{ all -> 0x0388 }
        r2 = "serverSections.startWith(SearchServerSections())";	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r0, r2);	 Catch:{ all -> 0x0388 }
        r2 = new wdz;	 Catch:{ all -> 0x0388 }
        r3 = r34.a();	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r3, r10);	 Catch:{ all -> 0x0388 }
        r2.<init>(r3, r6, r0);	 Catch:{ all -> 0x0388 }
        r3 = new waz;	 Catch:{ all -> 0x0388 }
        r4 = r8.f;	 Catch:{ all -> 0x0388 }
        r19 = r1;	 Catch:{ all -> 0x0388 }
        r19 = (defpackage.vzb) r19;	 Catch:{ all -> 0x0388 }
        r22 = r2;	 Catch:{ all -> 0x0388 }
        r22 = (defpackage.vzb) r22;	 Catch:{ all -> 0x0388 }
        r1 = r34.a();	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r1, r10);	 Catch:{ all -> 0x0388 }
        r2 = r8.o;	 Catch:{ all -> 0x0388 }
        if (r2 != 0) goto L_0x0307;	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r15);	 Catch:{ all -> 0x0388 }
        r17 = r3;	 Catch:{ all -> 0x0388 }
        r18 = r4;	 Catch:{ all -> 0x0388 }
        r20 = r6;	 Catch:{ all -> 0x0388 }
        r21 = r0;	 Catch:{ all -> 0x0388 }
        r23 = r1;	 Catch:{ all -> 0x0388 }
        r24 = r2;	 Catch:{ all -> 0x0388 }
        r17.<init>(r18, r19, r20, r21, r22, r23, r24);	 Catch:{ all -> 0x0388 }
        r8.n = r3;	 Catch:{ all -> 0x0388 }
        r0 = new zmh;	 Catch:{ all -> 0x0388 }
        r1 = r8.k;	 Catch:{ all -> 0x0388 }
        if (r1 != 0) goto L_0x0321;	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r25);	 Catch:{ all -> 0x0388 }
        r2 = r8.l;	 Catch:{ all -> 0x0388 }
        if (r2 != 0) goto L_0x0328;	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r26);	 Catch:{ all -> 0x0388 }
        r2 = r2.a();	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r2, r9);	 Catch:{ all -> 0x0388 }
        r3 = r8.c;	 Catch:{ all -> 0x0388 }
        r3 = r3.b();	 Catch:{ all -> 0x0388 }
        r30 = r3;	 Catch:{ all -> 0x0388 }
        r30 = (defpackage.ajdw) r30;	 Catch:{ all -> 0x0388 }
        r3 = r8.c;	 Catch:{ all -> 0x0388 }
        r3 = r3.l();	 Catch:{ all -> 0x0388 }
        r3 = (defpackage.zfr) r3;	 Catch:{ all -> 0x0388 }
        r31 = r3;	 Catch:{ all -> 0x0388 }
        r31 = (defpackage.ajdw) r31;	 Catch:{ all -> 0x0388 }
        r3 = r8.n;	 Catch:{ all -> 0x0388 }
        if (r3 != 0) goto L_0x034e;	 Catch:{ all -> 0x0388 }
        r4 = "searchObservableSectionController";	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r4);	 Catch:{ all -> 0x0388 }
        r32 = defpackage.ajyl.a(r3);	 Catch:{ all -> 0x0388 }
        r33 = 32;	 Catch:{ all -> 0x0388 }
        r27 = r0;	 Catch:{ all -> 0x0388 }
        r28 = r1;	 Catch:{ all -> 0x0388 }
        r29 = r2;	 Catch:{ all -> 0x0388 }
        r27.<init>(r28, r29, r30, r31, r32, r33);	 Catch:{ all -> 0x0388 }
        r8.m = r0;	 Catch:{ all -> 0x0388 }
        r0 = r8.j;	 Catch:{ all -> 0x0388 }
        if (r0 != 0) goto L_0x0366;	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r16);	 Catch:{ all -> 0x0388 }
        r1 = r8.m;	 Catch:{ all -> 0x0388 }
        if (r1 != 0) goto L_0x036f;	 Catch:{ all -> 0x0388 }
        r2 = "adapter";	 Catch:{ all -> 0x0388 }
        defpackage.akcr.a(r2);	 Catch:{ all -> 0x0388 }
        r1 = r1.e();	 Catch:{ all -> 0x0388 }
        r0.a(r1);	 Catch:{ all -> 0x0388 }
        r0 = r35.getLifecycle();	 Catch:{ all -> 0x0388 }
        r1 = r8;	 Catch:{ all -> 0x0388 }
        r1 = (defpackage.k) r1;	 Catch:{ all -> 0x0388 }
        r0.a(r1);	 Catch:{ all -> 0x0388 }
        r0 = r8.p;	 Catch:{ all -> 0x0388 }
        if (r0 == 0) goto L_0x0387;	 Catch:{ all -> 0x0388 }
        r0.dispose();	 Catch:{ all -> 0x0388 }
        return;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.search.ui.SearchPresenter.takeTarget(zlm):void");
    }

    public final void dropTarget() {
        zlm zlm = (zlm) getTarget();
        if (zlm != null) {
            j lifecycle = zlm.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        wal wal = (wal) this.h.b();
        wal.b.clear();
        wal.a.a();
        waj waj = (waj) this.i.b();
        waj.a.clear();
        waj.b.clear();
        this.p = this.v.e((ajfc) e.a).b((ajdw) this.c.b()).e();
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onFragmentPause() {
        this.f.a();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        zlm zlm = (zlm) getTarget();
        if (zlm != null) {
            RecyclerView a = zlm.a();
            if (a != null && a.getAdapter() == null) {
                zmh zmh = this.m;
                if (zmh == null) {
                    akcr.a("adapter");
                }
                a.setAdapter(zmh);
                a.setItemAnimator(null);
                Object context = a.getContext();
                String str = "it.context";
                akcr.a(context, str);
                a.addItemDecoration(new wei(context));
                context = a.getContext();
                akcr.a(context, str);
                a.addItemDecoration(new weh(context));
            }
        }
    }
}
