package defpackage;

import java.util.Map;

/* renamed from: hkp */
public final class hkp implements sdx {
    final Map<hbj, hko> a;
    boolean b = true;
    final hgr c;
    final hpg d;
    final hkv e;
    final ftl f;
    final ajwy<hcc> g;
    final ajwy<tnj> h;
    private final hpv i;
    private final zfw j;
    private final ajwy<yia> k;

    /* renamed from: hkp$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: hkp$b */
    static final class b<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ hkp a;

        b(hkp hkp) {
            this.a = hkp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            vim vim = (vim) obj;
            akcr.b(vim, "it");
            hkp hkp = this.a;
            vii vii = vim.a;
            akcr.a((Object) vii, "storyCard");
            vii.o();
            vii.q();
            vii vii2 = vii;
            hjx a = hkp.d.a(vii2, vdi.a(vii.d), "", true, "", hje.b, null);
            hko hko = (hko) hkp.a.get(hkc.a(vii));
            String str = "Maybe.empty<StoryNotificationInfo>()";
            if (hko != null && hko.a(vii)) {
                if (a == null) {
                    akcr.a();
                }
                return hko.a(vii, a);
            }
            obj = ajvo.a(ajlu.a);
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: hkp$c */
    static final class c<T> implements ajfl<hkx> {
        private /* synthetic */ hkp a;

        c(hkp hkp) {
            this.a = hkp;
        }

        public final /* synthetic */ boolean test(Object obj) {
            akcr.b((hkx) obj, "it");
            int f = this.a.f.f(gvt.OPT_IN_NOTIFICATIONS_SHOWN_BETWEEN_APP_SESSION);
            if (this.a.b) {
                ((tnj) this.a.h.get()).b().a((fth) gvt.OPT_IN_NOTIFICATIONS_SHOWN_BETWEEN_APP_SESSION, Integer.valueOf(f + 1)).b();
            }
            return !this.a.b || f < 8;
        }
    }

    /* renamed from: hkp$d */
    static final class d<T> implements ajfl<hkx> {
        private /* synthetic */ hkp a;

        d(hkp hkp) {
            this.a = hkp;
        }

        public final /* synthetic */ boolean test(Object obj) {
            hkx hkx = (hkx) obj;
            akcr.b(hkx, "it");
            return !((hcc) this.a.g.get()).c(hkx.a().a());
        }
    }

    /* renamed from: hkp$e */
    static final class e<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ hkp a;

        e(hkp hkp) {
            this.a = hkp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (hkx) obj;
            akcr.b(obj, "it");
            obj = this.a.c.a(hje.b, obj.a()).a(obj);
            akcr.a(obj, "discoverFeedStoriesRepo.…lt(storyNotificationInfo)");
            return obj.h();
        }
    }

    /* renamed from: hkp$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ hkp a;
        private /* synthetic */ sdo b;

        f(hkp hkp, sdo sdo) {
            this.a = hkp;
            this.b = sdo;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:47:0x01cb in {12, 13, 14, 17, 18, 19, 21, 23, 26, 27, 30, 31, 34, 35, 39, 40, 42, 43, 44, 46} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r15) {
            /*
            r14 = this;
            r15 = (defpackage.hkx) r15;
            r0 = "it";
            defpackage.akcr.b(r15, r0);
            r0 = r14.a;
            r0 = r0.e;
            r1 = r14.b;
            r2 = "storyNotificationInfo";
            defpackage.akcr.b(r15, r2);
            r2 = "incomingNotification";
            defpackage.akcr.b(r1, r2);
            r2 = r15.a();
            r2 = r2.a();
            r2 = r2.d();
            if (r2 == 0) goto L_0x01c1;
            r3 = defpackage.hkw.a;
            r2 = r2.ordinal();
            r2 = r3[r2];
            r3 = "BASE_DISCOVER_URI.buildU…\n                .build()";
            r4 = "notification";
            r5 = "notificationId";
            r6 = 0;
            r7 = 1;
            if (r2 == r7) goto L_0x010d;
            r8 = 2;
            if (r2 != r8) goto L_0x01c1;
            r15 = (defpackage.hkr) r15;
            r2 = r15.a;
            r8 = r1.a;
            r9 = "compositeStoryId";
            defpackage.akcr.b(r2, r9);
            defpackage.akcr.b(r8, r5);
            r10 = defpackage.hbm.a;
            r10 = r10.buildUpon();
            r4 = r10.appendPath(r4);
            r2 = r4.appendQueryParameter(r9, r2);
            r2 = r2.appendQueryParameter(r5, r8);
            r2 = r2.build();
            defpackage.akcr.a(r2, r3);
            r3 = r15.b;
            r3 = r3.j();
            r15 = r15.c;
            r15 = r15.c();
            if (r15 == 0) goto L_0x0105;
            r15 = (defpackage.hjg) r15;
            r8 = r15.D();
            r15 = r8;
            r15 = (java.lang.CharSequence) r15;
            if (r15 == 0) goto L_0x0083;
            r15 = defpackage.akgb.a(r15);
            if (r15 == 0) goto L_0x0081;
            goto L_0x0083;
            r15 = 0;
            goto L_0x0084;
            r15 = 1;
            r4 = "publicUserStoryCard.metadata";
            if (r15 == 0) goto L_0x009c;
            r15 = r3.a;
            defpackage.akcr.a(r15, r4);
            r15 = r15.c();
            r5 = "publicUserStoryCard.metadata.username";
            defpackage.akcr.a(r15, r5);
            r5 = 6;
            r15 = defpackage.dds.a(r15, r6, r5);
            goto L_0x00a8;
            r10 = defpackage.afnd.STORIES;
            r11 = 0;
            r12 = 0;
            r13 = 24;
            r9 = "10225967";
            r15 = defpackage.dds.a(r8, r9, r10, r11, r12, r13);
            r5 = r0.a();
            r8 = 2131890058; // 0x7f120f8a float:1.9414797E38 double:1.0532936384E-314;
            r9 = new java.lang.Object[r7];
            r10 = r3.a;
            defpackage.akcr.a(r10, r4);
            r10 = r10.b();
            r9[r6] = r10;
            r5 = r5.getString(r8, r9);
            r3 = r3.a;
            defpackage.akcr.a(r3, r4);
            r3 = r3.b();
            r4 = r0.a();
            r6 = 2131890050; // 0x7f120f82 float:1.941478E38 double:1.0532936344E-314;
            r4 = r4.getString(r6);
            r0 = r0.b();
            r1 = defpackage.sdt.a(r1);
            r1 = r1.c(r3);
            r1 = r1.d(r4);
            r1 = r1.a(r15);
            r1 = r1.a(r5);
            r15 = r1.b(r15);
            r15 = r15.b(r7);
            r15 = r15.c(r7);
            r15 = r15.c(r2);
            r15 = r15.a(r0);
            r15 = r15.a();
            return r15;
            r15 = new ajxt;
            r0 = "null cannot be cast to non-null type com.snap.discoverfeed.model.DynamicStoryData";
            r15.<init>(r0);
            throw r15;
            r15 = (defpackage.hkt) r15;
            r8 = r15.a;
            r2 = r1.a;
            defpackage.akcr.b(r2, r5);
            r10 = defpackage.hbm.a;
            r10 = r10.buildUpon();
            r4 = r10.appendPath(r4);
            r8 = java.lang.String.valueOf(r8);
            r9 = "story_row_id";
            r4 = r4.appendQueryParameter(r9, r8);
            r2 = r4.appendQueryParameter(r5, r2);
            r2 = r2.build();
            defpackage.akcr.a(r2, r3);
            r15 = r15.b;
            r15 = r15.h();
            r3 = r15.h;
            if (r3 == 0) goto L_0x0141;
            r3 = 1;
            goto L_0x0142;
            r3 = 0;
            r4 = r15.b;
            r5 = "publisherStoryCard.publisher";
            defpackage.akcr.a(r4, r5);
            r4 = r4.e();
            r4 = android.net.Uri.parse(r4);
            r8 = r15.e;
            r8 = r8.b;
            r9 = "publisherStoryCard.snaps.snaps";
            defpackage.akcr.a(r8, r9);
            r8 = defpackage.ajyi.c(r8);
            r8 = (defpackage.vhr) r8;
            r8 = r8.e;
            r9 = 0;
            if (r8 == 0) goto L_0x016a;
            r8 = r8.b();
            goto L_0x016b;
            r8 = r9;
            r10 = r0.a();
            if (r3 == 0) goto L_0x0175;
            r3 = 2131890060; // 0x7f120f8c float:1.9414801E38 double:1.0532936394E-314;
            goto L_0x0178;
            r3 = 2131890059; // 0x7f120f8b float:1.94148E38 double:1.053293639E-314;
            r11 = new java.lang.Object[r7];
            r15 = r15.b;
            defpackage.akcr.a(r15, r5);
            r15 = r15.b();
            r11[r6] = r15;
            r15 = r10.getString(r3, r11);
            r3 = r8;
            r3 = (java.lang.CharSequence) r3;
            if (r3 == 0) goto L_0x0194;
            r3 = r3.length();
            if (r3 != 0) goto L_0x0195;
            r6 = 1;
            if (r6 == 0) goto L_0x019d;
            r3 = "storyOrigin";
            defpackage.akcr.a(r15, r3);
            goto L_0x019f;
            r9 = r15;
            r15 = r8;
            r0 = r0.b();
            r1 = defpackage.sdt.a(r1);
            r1 = r1.c(r15);
            r1 = r1.d(r9);
            r1 = r1.a(r4);
            r15 = r1.a(r15);
            r15 = r15.b(r9);
            r15 = r15.b(r4);
            goto L_0x00f0;
            r15 = new java.lang.IllegalArgumentException;
            r0 = "card type not supported";
            r15.<init>(r0);
            r15 = (java.lang.Throwable) r15;
            throw r15;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hkp$f.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: hkp$g */
    static final class g<T> implements ajfb<Throwable> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        a aVar = new a();
    }

    public hkp(hpv hpv, hks hks, hkq hkq, hgr hgr, hpg hpg, hkv hkv, zfw zfw, ftl ftl, ajwy<hcc> ajwy, ajwy<yia> ajwy2, ajwy<tnj> ajwy3) {
        akcr.b(hpv, "storiesNetworkApi");
        akcr.b(hks, "publisherNotificationStoryProcessor");
        akcr.b(hkq, "publicUserNotificationStoryProcessor");
        akcr.b(hgr, "discoverFeedStoriesRepo");
        akcr.b(hpg, "clientModelFactory");
        akcr.b(hkv, "storyNotificationDisplayModelBuilder");
        akcr.b(zfw, "schedulers");
        akcr.b(ftl, "configProvider");
        akcr.b(ajwy, "storiesPlayStateStore");
        akcr.b(ajwy2, "friendStoriesNotificationProcessor");
        akcr.b(ajwy3, "preferences");
        this.i = hpv;
        this.c = hgr;
        this.d = hpg;
        this.e = hkv;
        this.j = zfw;
        this.f = ftl;
        this.g = ajwy;
        this.k = ajwy2;
        this.h = ajwy3;
        this.a = ajzm.a(ajxs.a(hbj.PUBLISHER_STORY_CARD, hks), ajxs.a(hbj.PUBLIC_USER_STORY_CARD, hkq));
    }

    public final ajdj<sdr> a(sdo sdo) {
        akcr.b(sdo, "incomingNotification");
        String a = sdo.a("discover_feed_compid");
        vcy a2 = a != null ? hiy.a(a) : null;
        if (a2 != null && a2.a() == 26) {
            return ((yia) this.k.get()).b(sdo);
        }
        Object a3;
        if (a2 != null) {
            a3 = this.i.a(new hpw(afnd.DISCOVER, 1, a2, null)).a(2).b((ajdw) this.j.g()).a((ajdw) this.j.b()).b((ajfc) new b(this)).a((ajfl) new c(this)).a((ajfl) new d(this)).a((ajfc) new e(this)).f(new f(this, sdo)).a((ajfb) g.a);
            akcr.a(a3, "storiesNetworkApi.lookup…ming notification $it\") }");
            return a3;
        }
        a3 = ajvo.a(ajlu.a);
        akcr.a(a3, "Maybe.empty()");
        return a3;
    }
}
