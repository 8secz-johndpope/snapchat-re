package defpackage;

import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.record.FriendModel.InsertUsername;
import com.snap.core.db.record.SuggestedFriendModel.InsertRow;
import com.snap.core.db.record.SuggestedFriendModel.Purge;
import com.snap.core.db.record.SuggestedFriendModel.RemoveSuggestedFriend;
import com.snap.core.db.record.SuggestedFriendModel.SetAdded;
import com.snap.core.db.record.SuggestedFriendModel.SetHidden;
import com.snap.core.db.record.SuggestedFriendPlacementModel;
import com.snap.core.db.record.SuggestedFriendPlacementModel.RemoveSuggestedFriendPlacements;
import com.snap.core.db.record.SuggestedFriendPlacementRecord;

/* renamed from: ixp */
public final class ixp {
    public final DbClient a = this.b.getDbClient((ide) irc.t);
    public final SnapDb b;
    final tnj c;
    final aipn<ixj> d;
    private final ajxe e = ajxh.a(new b(this));
    private final ajxe f = ajxh.a(new h(this));
    private final ajxe g = ajxh.a(new e(this));
    private final ajxe h = ajxh.a(new i(this));
    private final ajxe i = ajxh.a(new j(this));
    private final ajxe j = ajxh.a(new d(this));
    private final ajxe k = ajxh.a(new c(this));
    private final ajxe l = ajxh.a(new g(this));
    private final ajxe m = ajxh.a(new f(this));

    /* renamed from: ixp$b */
    static final class b extends akcs implements akbk<InsertRow> {
        private /* synthetic */ ixp a;

        b(ixp ixp) {
            this.a = ixp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertRow(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ixp$h */
    static final class h extends akcs implements akbk<RemoveSuggestedFriend> {
        private /* synthetic */ ixp a;

        h(ixp ixp) {
            this.a = ixp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new RemoveSuggestedFriend(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ixp$e */
    static final class e extends akcs implements akbk<Purge> {
        private /* synthetic */ ixp a;

        e(ixp ixp) {
            this.a = ixp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Purge(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ixp$i */
    static final class i extends akcs implements akbk<SetAdded> {
        private /* synthetic */ ixp a;

        i(ixp ixp) {
            this.a = ixp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SetAdded(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ixp$j */
    static final class j extends akcs implements akbk<SetHidden> {
        private /* synthetic */ ixp a;

        j(ixp ixp) {
            this.a = ixp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SetHidden(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ixp$d */
    static final class d extends akcs implements akbk<InsertUsername> {
        private /* synthetic */ ixp a;

        d(ixp ixp) {
            this.a = ixp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertUsername(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ixp$c */
    static final class c extends akcs implements akbk<SuggestedFriendPlacementModel.InsertRow> {
        private /* synthetic */ ixp a;

        c(ixp ixp) {
            this.a = ixp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SuggestedFriendPlacementModel.InsertRow(this.a.a.getWritableDatabase(), SuggestedFriendPlacementRecord.FACTORY);
        }
    }

    /* renamed from: ixp$g */
    static final class g extends akcs implements akbk<RemoveSuggestedFriendPlacements> {
        private /* synthetic */ ixp a;

        g(ixp ixp) {
            this.a = ixp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new RemoveSuggestedFriendPlacements(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ixp$f */
    static final class f extends akcs implements akbk<SuggestedFriendPlacementModel.Purge> {
        private /* synthetic */ ixp a;

        f(ixp ixp) {
            this.a = ixp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SuggestedFriendPlacementModel.Purge(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ixp$a */
    public static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ ixp a;
        private /* synthetic */ ahef b;

        public a(ixp ixp, ahef ahef) {
            this.a = ixp;
            this.b = ahef;
            super(1);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:34:0x0197 in {6, 9, 10, 14, 27, 29, 31, 33} preds:[]
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
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r11) {
            /*
            r10 = this;
            r11 = (com.snap.core.db.api.DbTransaction) r11;
            r0 = "tx";
            defpackage.akcr.b(r11, r0);
            r1 = r10.a;	 Catch:{ all -> 0x0195 }
            r2 = r10.b;	 Catch:{ all -> 0x0195 }
            r3 = r10.a;	 Catch:{ all -> 0x0195 }
            r3 = r3.b;	 Catch:{ all -> 0x0195 }
            r4 = "suggestedFriendResponse";	 Catch:{ all -> 0x0195 }
            defpackage.akcr.b(r2, r4);	 Catch:{ all -> 0x0195 }
            r4 = "snapDb";	 Catch:{ all -> 0x0195 }
            defpackage.akcr.b(r3, r4);	 Catch:{ all -> 0x0195 }
            defpackage.akcr.b(r11, r0);	 Catch:{ all -> 0x0195 }
            r3.throwIfNotDbScheduler();	 Catch:{ all -> 0x0195 }
            r11.checkInTransaction();	 Catch:{ all -> 0x0195 }
            r0 = r2.e;	 Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0192;	 Catch:{ all -> 0x0195 }
            r0 = r2.e;	 Catch:{ all -> 0x0195 }
            r0 = r0.size();	 Catch:{ all -> 0x0195 }
            if (r0 != 0) goto L_0x0030;	 Catch:{ all -> 0x0195 }
            goto L_0x0192;	 Catch:{ all -> 0x0195 }
            r0 = r2.p;	 Catch:{ all -> 0x0195 }
            r3 = defpackage.ahef.a.DOUBLE;	 Catch:{ all -> 0x0195 }
            r3 = r3.a();	 Catch:{ all -> 0x0195 }
            r3 = defpackage.akcr.a(r0, r3);	 Catch:{ all -> 0x0195 }
            r4 = 1;	 Catch:{ all -> 0x0195 }
            r5 = 2;	 Catch:{ all -> 0x0195 }
            if (r3 == 0) goto L_0x0042;	 Catch:{ all -> 0x0195 }
            r0 = 2;	 Catch:{ all -> 0x0195 }
            goto L_0x004c;	 Catch:{ all -> 0x0195 }
            r3 = defpackage.ahef.a.SINGLE;	 Catch:{ all -> 0x0195 }
            r3 = r3.a();	 Catch:{ all -> 0x0195 }
            defpackage.akcr.a(r0, r3);	 Catch:{ all -> 0x0195 }
            r0 = 1;	 Catch:{ all -> 0x0195 }
            r3 = r1.c;	 Catch:{ all -> 0x0195 }
            r3 = r3.b();	 Catch:{ all -> 0x0195 }
            r6 = defpackage.jic.SUGGESTED_FRIEND_FIND_TIMESTAMPS;	 Catch:{ all -> 0x0195 }
            r6 = (defpackage.fth) r6;	 Catch:{ all -> 0x0195 }
            r7 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0195 }
            r7 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x0195 }
            r3 = r3.a(r6, r7);	 Catch:{ all -> 0x0195 }
            r6 = defpackage.jic.QUICK_ADD_ROWS_IN_DF;	 Catch:{ all -> 0x0195 }
            r6 = (defpackage.fth) r6;	 Catch:{ all -> 0x0195 }
            r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x0195 }
            r0 = r3.a(r6, r0);	 Catch:{ all -> 0x0195 }
            r0.b();	 Catch:{ all -> 0x0195 }
            r1.a(r11);	 Catch:{ all -> 0x0195 }
            r1.b(r11);	 Catch:{ all -> 0x0195 }
            r0 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0195 }
            r0.<init>();	 Catch:{ all -> 0x0195 }
            r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0195 }
            r3 = r2.e;	 Catch:{ all -> 0x0195 }
            r6 = "suggestedFriendResponse.suggestedFriendResultsV2";	 Catch:{ all -> 0x0195 }
            defpackage.akcr.a(r3, r6);	 Catch:{ all -> 0x0195 }
            r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x0195 }
            r3 = r3.iterator();	 Catch:{ all -> 0x0195 }
            r6 = r3.hasNext();	 Catch:{ all -> 0x0195 }
            if (r6 == 0) goto L_0x00b3;	 Catch:{ all -> 0x0195 }
            r6 = r3.next();	 Catch:{ all -> 0x0195 }
            r6 = (defpackage.ahen) r6;	 Catch:{ all -> 0x0195 }
            r7 = r6.a;	 Catch:{ all -> 0x0195 }
            r8 = "it.userId";	 Catch:{ all -> 0x0195 }
            defpackage.akcr.a(r7, r8);	 Catch:{ all -> 0x0195 }
            r8 = r1.d;	 Catch:{ all -> 0x0195 }
            r8 = r8.get();	 Catch:{ all -> 0x0195 }
            r8 = (defpackage.ixj) r8;	 Catch:{ all -> 0x0195 }
            r6 = r8.a(r6, r11);	 Catch:{ all -> 0x0195 }
            r8 = "friendRepository.get().i…teSuggestedFriend(it, tx)";	 Catch:{ all -> 0x0195 }
            defpackage.akcr.a(r6, r8);	 Catch:{ all -> 0x0195 }
            r0.put(r7, r6);	 Catch:{ all -> 0x0195 }
            goto L_0x008b;	 Catch:{ all -> 0x0195 }
            r3 = 10;	 Catch:{ all -> 0x0195 }
            r3 = new defpackage.ajxm[r3];	 Catch:{ all -> 0x0195 }
            r6 = 0;	 Catch:{ all -> 0x0195 }
            r7 = com.snap.core.db.column.FriendSuggestionPlacement.STORIES_PAGE;	 Catch:{ all -> 0x0195 }
            r8 = r2.g;	 Catch:{ all -> 0x0195 }
            r7 = defpackage.ajxs.a(r7, r8);	 Catch:{ all -> 0x0195 }
            r3[r6] = r7;	 Catch:{ all -> 0x0195 }
            r6 = com.snap.core.db.column.FriendSuggestionPlacement.SENDTO_PAGE;	 Catch:{ all -> 0x0195 }
            r7 = r2.h;	 Catch:{ all -> 0x0195 }
            r6 = defpackage.ajxs.a(r6, r7);	 Catch:{ all -> 0x0195 }
            r3[r4] = r6;	 Catch:{ all -> 0x0195 }
            r4 = com.snap.core.db.column.FriendSuggestionPlacement.ADD_FRIENDS_FOOTER;	 Catch:{ all -> 0x0195 }
            r6 = r2.f;	 Catch:{ all -> 0x0195 }
            r4 = defpackage.ajxs.a(r4, r6);	 Catch:{ all -> 0x0195 }
            r3[r5] = r4;	 Catch:{ all -> 0x0195 }
            r4 = 3;	 Catch:{ all -> 0x0195 }
            r5 = com.snap.core.db.column.FriendSuggestionPlacement.FEED_PAGE;	 Catch:{ all -> 0x0195 }
            r6 = r2.i;	 Catch:{ all -> 0x0195 }
            r5 = defpackage.ajxs.a(r5, r6);	 Catch:{ all -> 0x0195 }
            r3[r4] = r5;	 Catch:{ all -> 0x0195 }
            r4 = 4;	 Catch:{ all -> 0x0195 }
            r5 = com.snap.core.db.column.FriendSuggestionPlacement.SEARCH_PAGE;	 Catch:{ all -> 0x0195 }
            r6 = r2.j;	 Catch:{ all -> 0x0195 }
            r5 = defpackage.ajxs.a(r5, r6);	 Catch:{ all -> 0x0195 }
            r3[r4] = r5;	 Catch:{ all -> 0x0195 }
            r4 = 5;	 Catch:{ all -> 0x0195 }
            r5 = com.snap.core.db.column.FriendSuggestionPlacement.SEARCH_RESULT_SECTION;	 Catch:{ all -> 0x0195 }
            r6 = r2.k;	 Catch:{ all -> 0x0195 }
            r5 = defpackage.ajxs.a(r5, r6);	 Catch:{ all -> 0x0195 }
            r3[r4] = r5;	 Catch:{ all -> 0x0195 }
            r4 = 6;	 Catch:{ all -> 0x0195 }
            r5 = com.snap.core.db.column.FriendSuggestionPlacement.FULL_PAGE;	 Catch:{ all -> 0x0195 }
            r6 = r2.l;	 Catch:{ all -> 0x0195 }
            r5 = defpackage.ajxs.a(r5, r6);	 Catch:{ all -> 0x0195 }
            r3[r4] = r5;	 Catch:{ all -> 0x0195 }
            r4 = 7;	 Catch:{ all -> 0x0195 }
            r5 = com.snap.core.db.column.FriendSuggestionPlacement.STORIES_VIEW_ALL;	 Catch:{ all -> 0x0195 }
            r6 = r2.m;	 Catch:{ all -> 0x0195 }
            r5 = defpackage.ajxs.a(r5, r6);	 Catch:{ all -> 0x0195 }
            r3[r4] = r5;	 Catch:{ all -> 0x0195 }
            r4 = 8;	 Catch:{ all -> 0x0195 }
            r5 = com.snap.core.db.column.FriendSuggestionPlacement.REG_FIND_FRIENDS_SNAPCHATTERS;	 Catch:{ all -> 0x0195 }
            r6 = r2.o;	 Catch:{ all -> 0x0195 }
            r5 = defpackage.ajxs.a(r5, r6);	 Catch:{ all -> 0x0195 }
            r3[r4] = r5;	 Catch:{ all -> 0x0195 }
            r4 = 9;	 Catch:{ all -> 0x0195 }
            r5 = com.snap.core.db.column.FriendSuggestionPlacement.FEED_PAGE_HORIZONTAL;	 Catch:{ all -> 0x0195 }
            r2 = r2.n;	 Catch:{ all -> 0x0195 }
            r2 = defpackage.ajxs.a(r5, r2);	 Catch:{ all -> 0x0195 }
            r3[r4] = r2;	 Catch:{ all -> 0x0195 }
            r2 = defpackage.ajzm.a(r3);	 Catch:{ all -> 0x0195 }
            r3 = new java.util.LinkedHashSet;	 Catch:{ all -> 0x0195 }
            r3.<init>();	 Catch:{ all -> 0x0195 }
            r3 = (java.util.Set) r3;	 Catch:{ all -> 0x0195 }
            r2 = r2.entrySet();	 Catch:{ all -> 0x0195 }
            r2 = r2.iterator();	 Catch:{ all -> 0x0195 }
            r4 = r2.hasNext();	 Catch:{ all -> 0x0195 }
            if (r4 == 0) goto L_0x0192;	 Catch:{ all -> 0x0195 }
            r4 = r2.next();	 Catch:{ all -> 0x0195 }
            r4 = (java.util.Map.Entry) r4;	 Catch:{ all -> 0x0195 }
            r5 = r4.getKey();	 Catch:{ all -> 0x0195 }
            r5 = (com.snap.core.db.column.FriendSuggestionPlacement) r5;	 Catch:{ all -> 0x0195 }
            r4 = r4.getValue();	 Catch:{ all -> 0x0195 }
            r4 = (java.util.List) r4;	 Catch:{ all -> 0x0195 }
            if (r4 == 0) goto L_0x0138;	 Catch:{ all -> 0x0195 }
            r4 = (java.lang.Iterable) r4;	 Catch:{ all -> 0x0195 }
            r4 = r4.iterator();	 Catch:{ all -> 0x0195 }
            r6 = r4.hasNext();	 Catch:{ all -> 0x0195 }
            if (r6 == 0) goto L_0x0138;	 Catch:{ all -> 0x0195 }
            r6 = r4.next();	 Catch:{ all -> 0x0195 }
            r6 = (defpackage.ahel) r6;	 Catch:{ all -> 0x0195 }
            r7 = r6.a;	 Catch:{ all -> 0x0195 }
            r7 = r0.get(r7);	 Catch:{ all -> 0x0195 }
            r7 = (java.lang.Long) r7;	 Catch:{ all -> 0x0195 }
            if (r7 == 0) goto L_0x0158;	 Catch:{ all -> 0x0195 }
            r7 = (java.lang.Number) r7;	 Catch:{ all -> 0x0195 }
            r7 = r7.longValue();	 Catch:{ all -> 0x0195 }
            r9 = r6.a;	 Catch:{ all -> 0x0195 }
            r9 = r3.contains(r9);	 Catch:{ all -> 0x0195 }
            if (r9 != 0) goto L_0x018e;	 Catch:{ all -> 0x0195 }
            r9 = "displayInfo";	 Catch:{ all -> 0x0195 }
            defpackage.akcr.a(r6, r9);	 Catch:{ all -> 0x0195 }
            r1.a(r6, r7, r11);	 Catch:{ all -> 0x0195 }
            r6 = r6.a;	 Catch:{ all -> 0x0195 }
            r9 = "displayInfo.userId";	 Catch:{ all -> 0x0195 }
            defpackage.akcr.a(r6, r9);	 Catch:{ all -> 0x0195 }
            r3.add(r6);	 Catch:{ all -> 0x0195 }
            r1.a(r7, r5, r11);	 Catch:{ all -> 0x0195 }
            goto L_0x0158;
            r11 = defpackage.ajxw.a;
            return r11;
            r11 = move-exception;
            throw r11;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ixp$a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ixp.class), "insertSuggestedDisplayInfo", "getInsertSuggestedDisplayInfo()Lcom/snap/core/db/record/SuggestedFriendModel$InsertRow;"), new akdc(akde.a(ixp.class), "removeSuggestedDisplayInfo", "getRemoveSuggestedDisplayInfo()Lcom/snap/core/db/record/SuggestedFriendModel$RemoveSuggestedFriend;"), new akdc(akde.a(ixp.class), "purgeSuggestedDisplayInfo", "getPurgeSuggestedDisplayInfo()Lcom/snap/core/db/record/SuggestedFriendModel$Purge;"), new akdc(akde.a(ixp.class), "setAdded", "getSetAdded()Lcom/snap/core/db/record/SuggestedFriendModel$SetAdded;"), new akdc(akde.a(ixp.class), "setHidden", "getSetHidden()Lcom/snap/core/db/record/SuggestedFriendModel$SetHidden;"), new akdc(akde.a(ixp.class), "insertUsername", "getInsertUsername()Lcom/snap/core/db/record/FriendModel$InsertUsername;"), new akdc(akde.a(ixp.class), "insertSuggestionPlacement", "getInsertSuggestionPlacement()Lcom/snap/core/db/record/SuggestedFriendPlacementModel$InsertRow;"), new akdc(akde.a(ixp.class), "removeFriendSuggestionPlacements", "getRemoveFriendSuggestionPlacements()Lcom/snap/core/db/record/SuggestedFriendPlacementModel$RemoveSuggestedFriendPlacements;"), new akdc(akde.a(ixp.class), "purgeSuggestionPlacement", "getPurgeSuggestionPlacement()Lcom/snap/core/db/record/SuggestedFriendPlacementModel$Purge;")};
    }

    public ixp(SnapDb snapDb, tnj tnj, aipn<ixj> aipn) {
        akcr.b(snapDb, "snapDb");
        akcr.b(tnj, "preferences");
        akcr.b(aipn, "friendRepository");
        this.b = snapDb;
        this.c = tnj;
        this.d = aipn;
    }

    private final InsertRow d() {
        return (InsertRow) this.e.b();
    }

    private final SetAdded e() {
        return (SetAdded) this.h.b();
    }

    private final SuggestedFriendPlacementModel.InsertRow f() {
        return (SuggestedFriendPlacementModel.InsertRow) this.k.b();
    }

    /* Access modifiers changed, original: final */
    public final long a(long j, FriendSuggestionPlacement friendSuggestionPlacement, DbTransaction dbTransaction) {
        f().bind(friendSuggestionPlacement, j);
        return this.a.executeInsert(f(), dbTransaction);
    }

    /* Access modifiers changed, original: final */
    public final long a(ahel ahel, long j, DbTransaction dbTransaction) {
        this.b.throwIfNotDbScheduler();
        d().bind(j, ahel.a, ahel.b, ahel.c);
        return this.a.executeInsert(d(), dbTransaction);
    }

    public final RemoveSuggestedFriend a() {
        return (RemoveSuggestedFriend) this.f.b();
    }

    public final void a(long j, boolean z, DbTransaction dbTransaction) {
        akcr.b(dbTransaction, "tx");
        this.b.throwIfNotDbScheduler();
        e().bind(z, j);
        Object obj = this.a;
        akcr.a(obj, "briteDatabase");
        BriteDatabaseExtensionsKt.executeUpdate(obj, e(), dbTransaction);
    }

    public final void a(DbTransaction dbTransaction) {
        this.b.throwIfNotDbScheduler();
        this.a.executeUpdateDelete((Purge) this.g.b(), dbTransaction);
    }

    public final SetHidden b() {
        return (SetHidden) this.i.b();
    }

    public final void b(DbTransaction dbTransaction) {
        this.b.throwIfNotDbScheduler();
        this.a.executeUpdateDelete((SuggestedFriendPlacementModel.Purge) this.m.b(), dbTransaction);
    }

    public final RemoveSuggestedFriendPlacements c() {
        return (RemoveSuggestedFriendPlacements) this.l.b();
    }
}
