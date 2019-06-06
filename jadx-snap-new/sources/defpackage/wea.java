package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: wea */
public final class wea extends vzb {
    final ajwl<Integer> a;
    final Context b;
    final ajdp<Map<String, wak>> c;
    final wbh d;
    final ihh e;
    private final ajxe g = ajxh.a(new b(this));
    private final wbk h;
    private final wae i;
    private final String j;
    private wbm k;

    /* renamed from: wea$b */
    static final class b extends akcs implements akbk<ajdp<znh<zmy>>> {
        final /* synthetic */ wea a;

        /* renamed from: wea$b$a */
        public static final class a<T1, T2, T3, T4, R> implements ajfe<T1, T2, T3, T4, R> {
            private /* synthetic */ b a;

            public a(b bVar) {
                this.a = bVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:42:0x017c in {6, 9, 13, 16, 24, 28, 34, 35, 37, 39, 41} preds:[]
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
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.ProcessClass.process(ProcessClass.java:32)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                */
            public final R apply(T1 r26, T2 r27, T3 r28, T4 r29) {
                /*
                r25 = this;
                r0 = r25;
                r1 = r29;
                r1 = (java.util.List) r1;
                r2 = r28;
                r2 = (java.util.Map) r2;
                r3 = r27;
                r3 = (java.lang.Number) r3;
                r3 = r3.intValue();
                r4 = r26;
                r4 = (defpackage.vzx) r4;
                r5 = new java.util.ArrayList;
                r5.<init>();
                r5 = (java.util.List) r5;
                r6 = new java.util.ArrayList;
                r6.<init>();
                r6 = (java.util.List) r6;
                r1 = (java.lang.Iterable) r1;
                r1 = r1.iterator();
                r7 = r1.hasNext();
                if (r7 == 0) goto L_0x00d0;
                r7 = r1.next();
                r7 = (com.snap.core.db.query.LegacySearchQueries.Friend) r7;
                r8 = r7.isPopular();
                r9 = "it.username()";
                if (r8 != 0) goto L_0x0044;
                r8 = r7.isOfficial();
                if (r8 == 0) goto L_0x0057;
                r8 = r7.friendLinkType();
                r10 = com.snap.core.db.column.FriendLinkType.MUTUAL;
                if (r8 != r10) goto L_0x0057;
                r7 = r7.username();
                defpackage.akcr.a(r7, r9);
                r5.add(r7);
                goto L_0x002a;
                r8 = r7.isPopular();
                if (r8 != 0) goto L_0x0063;
                r8 = r7.isOfficial();
                if (r8 == 0) goto L_0x002a;
                r8 = r7.friendLinkType();
                r10 = com.snap.core.db.column.FriendLinkType.MUTUAL;
                if (r8 == r10) goto L_0x002a;
                r8 = new waa;
                r12 = r7._id();
                r14 = r7.username();
                defpackage.akcr.a(r14, r9);
                r15 = r7.userId();
                r16 = r7.displayName();
                r17 = 0;
                r18 = 1;
                r9 = new vzc;
                r10 = r7.bitmojiAvatarId();
                r10 = java.lang.String.valueOf(r10);
                r11 = r7.bitmojiSelfieId();
                r9.<init>(r10, r11);
                r19 = r7.storyRowId();
                r20 = r7.storyLatestTimestamp();
                r21 = r7.storyLatestExpirationTimestamp();
                r10 = r7.storyMuted();
                r22 = java.lang.Boolean.valueOf(r10);
                r23 = r7.storyViewed();
                r10 = r0.a;
                r10 = r10.a;
                r10 = r10.e;
                r24 = r10;
                r20 = defpackage.wbg.a.a(r19, r20, r21, r22, r23, r24);
                r21 = r7.isOfficial();
                r22 = r7.isPopular();
                r23 = 0;
                r24 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
                r11 = r8;
                r19 = r9;
                r11.<init>(r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
                r6.add(r8);
                goto L_0x002a;
                r1 = new java.util.ArrayList;
                r1.<init>();
                r6 = (java.util.Collection) r6;
                r1.addAll(r6);
                r4 = r4.b;
                if (r4 == 0) goto L_0x0174;
                r4 = (java.lang.Iterable) r4;
                r6 = new java.util.ArrayList;
                r6.<init>();
                r6 = (java.util.Collection) r6;
                r4 = r4.iterator();
                r7 = r4.hasNext();
                r8 = 1;
                if (r7 == 0) goto L_0x0106;
                r7 = r4.next();
                r9 = r7;
                r9 = (defpackage.waa) r9;
                r9 = r9.a;
                r9 = r5.contains(r9);
                r8 = r8 ^ r9;
                if (r8 == 0) goto L_0x00eb;
                r6.add(r7);
                goto L_0x00eb;
                r6 = (java.util.List) r6;
                r6 = (java.util.Collection) r6;
                r1.addAll(r6);
                r1 = (java.lang.Iterable) r1;
                r4 = new java.util.ArrayList;
                r5 = 10;
                r5 = defpackage.ajyn.a(r1, r5);
                r4.<init>(r5);
                r4 = (java.util.Collection) r4;
                r1 = r1.iterator();
                r5 = r1.hasNext();
                if (r5 == 0) goto L_0x0142;
                r5 = r1.next();
                r5 = (defpackage.waa) r5;
                r6 = r0.a;
                r6 = r6.a;
                r6 = r6.f;
                r7 = r5.a;
                r7 = r2.get(r7);
                r7 = (defpackage.wak) r7;
                r5 = defpackage.wbe.a(r5, r6, r7);
                r4.add(r5);
                goto L_0x0120;
                r4 = (java.util.List) r4;
                r4 = (java.lang.Iterable) r4;
                r1 = new java.util.ArrayList;
                r1.<init>();
                r1 = (java.util.Collection) r1;
                r2 = r4.iterator();
                r4 = r2.hasNext();
                if (r4 == 0) goto L_0x0169;
                r4 = r2.next();
                r5 = r4;
                r5 = (defpackage.waa) r5;
                if (r5 == 0) goto L_0x0162;
                r5 = 1;
                goto L_0x0163;
                r5 = 0;
                if (r5 == 0) goto L_0x0151;
                r1.add(r4);
                goto L_0x0151;
                r1 = (java.util.List) r1;
                r2 = r0.a;
                r2 = r2.a;
                r1 = defpackage.wds.a(r1, r3, r2.j, r2.f, defpackage.ajyx.a, new defpackage.wea.a(r2));
                return r1;
                r1 = new ajxt;
                r2 = "null cannot be cast to non-null type kotlin.collections.List<com.snap.search.framework.SearchSuggestedFriend>";
                r1.<init>(r2);
                throw r1;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.wea$b$a.apply(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        b(wea wea) {
            this.a = wea;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp a = ajdp.a((ajdt) this.a.a(), (ajdt) this.a.a, (ajdt) this.a.c, (ajdt) this.a.d.b(), (ajfe) new a(this));
            if (a == null) {
                akcr.a();
            }
            return a;
        }
    }

    /* renamed from: wea$a */
    static final class a extends akcq implements akcb<waa, Integer, Map<String, ? extends String>, Integer, wgv> {
        a(wea wea) {
            super(4, wea);
        }

        public final String getName() {
            return "toViewModel";
        }

        public final akej getOwner() {
            return akde.a(wea.class);
        }

        public final String getSignature() {
            return "toViewModel(Lcom/snap/search/framework/SearchSuggestedFriend;ILjava/util/Map;I)Lcom/snap/search/ui/viewmodel/SearchSuggestedFriendViewModel;";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            waa waa = (waa) obj;
            int intValue = ((Number) obj2).intValue();
            Map map = (Map) obj3;
            int intValue2 = ((Number) obj4).intValue();
            akcr.b(waa, "p1");
            akcr.b(map, "p3");
            wea wea = (wea) this.receiver;
            return wbm.a(waa, new wbo(intValue, intValue2, wea.f), wea.b);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(wea.class), "viewModelSource", "getViewModelSource()Lio/reactivex/Observable;");
    }

    public wea(wbk wbk, Context context, wae wae, String str, wbm wbm, ajdp<Map<String, wak>> ajdp, wbh wbh, ihh ihh) {
        akcr.b(wbk, "cardViewModels");
        akcr.b(context, "context");
        akcr.b(wae, "searchQuery");
        akcr.b(str, "title");
        akcr.b(wbm, "viewModelConverter");
        akcr.b(ajdp, "friendInfo");
        akcr.b(wbh, "localDataProvider");
        akcr.b(ihh, "clock");
        super(86);
        this.h = wbk;
        this.b = context;
        this.i = wae;
        this.j = str;
        this.k = wbm;
        this.c = ajdp;
        this.d = wbh;
        this.e = ihh;
        Object i = ajwl.i(Integer.valueOf(3));
        akcr.a(i, "BehaviorSubject.createDe…TIAL_DISPLAY_ITEMS_LIMIT)");
        this.a = i;
    }

    public final ajdp<vzx> a() {
        Object b = ajdp.b(new vzx(this.i, this.h.b));
        akcr.a(b, "Observable.just(SearchSe…rdViewModels.dataModels))");
        return b;
    }

    public final ajdp<znh<zmy>> b() {
        return (ajdp) this.g.b();
    }

    @akqq
    public final void onViewMoreEvent(wcx wcx) {
        akcr.b(wcx, "viewMoreEvent");
        if (wcx.a == this.f) {
            ajwl ajwl = this.a;
            Object p = ajwl.p();
            if (p == null) {
                akcr.a();
            }
            ajwl.a(Integer.valueOf(((Number) p).intValue() + 10));
        }
    }
}
