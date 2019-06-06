package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.FeedModel.DeleteAllFeedData;
import com.snap.core.db.record.FeedRecord;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: qum */
public final class qum implements prc {
    public final Map<String, Long> a = new ConcurrentHashMap();
    public final DbClient b;
    final ajxe c;
    public final ajxe d;
    private final idd e = pry.a.callsite("FeedRepository");

    /* renamed from: qum$b */
    static final class b extends akcq implements akbk<pa> {
        b(DbClient dbClient) {
            super(0, dbClient);
        }

        public final String getName() {
            return "getWritableDatabase";
        }

        public final akej getOwner() {
            return akde.a(DbClient.class);
        }

        public final String getSignature() {
            return "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;";
        }

        public final /* synthetic */ Object invoke() {
            return ((DbClient) this.receiver).getWritableDatabase();
        }
    }

    /* renamed from: qum$a */
    static final class a extends akcs implements akbk<DeleteAllFeedData> {
        private /* synthetic */ qum a;

        a(qum qum) {
            this.a = qum;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeleteAllFeedData((pa) this.a.c.b());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(qum.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(qum.class), "deleteAllFeedData", "getDeleteAllFeedData()Lcom/snap/core/db/record/FeedModel$DeleteAllFeedData;")};
    }

    public qum(SnapDb snapDb) {
        akcr.b(snapDb, "snapDb");
        this.b = snapDb.getDbClient(this.e);
        this.c = ajxh.a(new b(this.b));
        this.d = ajxh.a(new a(this));
    }

    public final long a(String str) {
        akcr.b(str, "friendUsername");
        Long l = (Long) this.a.get(str);
        if (l == null) {
            DbClient dbClient = this.b;
            Object feedIdForFriend = FeedRecord.FACTORY.getFeedIdForFriend(str);
            akcr.a(feedIdForFriend, "FeedRecord.FACTORY.getFe…ForFriend(friendUsername)");
            Object obj = FeedRecord.FACTORY;
            akcr.a(obj, "FeedRecord.FACTORY");
            obj = obj.getFeedIdForFriendMapper();
            akcr.a(obj, "FeedRecord.FACTORY.feedIdForFriendMapper");
            l = (Long) dbClient.queryFirst(feedIdForFriend, obj);
            if (l != null) {
                this.a.put(str, l);
            }
        }
        return l != null ? l.longValue() : -1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0092 in {6, 7, 8, 15, 16, 18} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final java.util.Map<java.lang.String, java.lang.Long> a(java.lang.String... r8) {
        /*
        r7 = this;
        r0 = "it.key()";
        r1 = "conversationIds";
        defpackage.akcr.b(r8, r1);
        r1 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0090 }
        r1.<init>();	 Catch:{ all -> 0x0090 }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x0090 }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0090 }
        r2.<init>();	 Catch:{ all -> 0x0090 }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x0090 }
        r3 = r8.length;	 Catch:{ all -> 0x0090 }
        r4 = 0;	 Catch:{ all -> 0x0090 }
        if (r4 >= r3) goto L_0x002f;	 Catch:{ all -> 0x0090 }
        r5 = r8[r4];	 Catch:{ all -> 0x0090 }
        r6 = r7.a;	 Catch:{ all -> 0x0090 }
        r6 = r6.get(r5);	 Catch:{ all -> 0x0090 }
        r6 = (java.lang.Long) r6;	 Catch:{ all -> 0x0090 }
        if (r6 != 0) goto L_0x0029;	 Catch:{ all -> 0x0090 }
        r2.add(r5);	 Catch:{ all -> 0x0090 }
        goto L_0x002c;	 Catch:{ all -> 0x0090 }
        r1.put(r5, r6);	 Catch:{ all -> 0x0090 }
        r4 = r4 + 1;	 Catch:{ all -> 0x0090 }
        goto L_0x0017;	 Catch:{ all -> 0x0090 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0090 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0090 }
        r2 = r2 ^ 1;	 Catch:{ all -> 0x0090 }
        if (r2 == 0) goto L_0x008f;	 Catch:{ all -> 0x0090 }
        r2 = r7.b;	 Catch:{ all -> 0x0090 }
        r3 = "dbClient";	 Catch:{ all -> 0x0090 }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0090 }
        r3 = com.snap.core.db.record.FeedRecord.FACTORY;	 Catch:{ all -> 0x0090 }
        r8 = r3.getFeedIdForKeys(r8);	 Catch:{ all -> 0x0090 }
        r3 = "FeedRecord.FACTORY.getFe…dForKeys(conversationIds)";	 Catch:{ all -> 0x0090 }
        defpackage.akcr.a(r8, r3);	 Catch:{ all -> 0x0090 }
        r3 = com.snap.core.db.record.FeedRecord.GET_FEED_ID_FOR_KEYS_MAPPER;	 Catch:{ all -> 0x0090 }
        r4 = "FeedRecord.GET_FEED_ID_FOR_KEYS_MAPPER";	 Catch:{ all -> 0x0090 }
        defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0090 }
        r8 = com.snap.core.db.api.BriteDatabaseExtensionsKt.queryList(r2, r8, r3);	 Catch:{ all -> 0x0090 }
        r8 = (java.lang.Iterable) r8;	 Catch:{ all -> 0x0090 }
        r8 = r8.iterator();	 Catch:{ all -> 0x0090 }
        r2 = r8.hasNext();	 Catch:{ all -> 0x0090 }
        if (r2 == 0) goto L_0x008f;	 Catch:{ all -> 0x0090 }
        r2 = r8.next();	 Catch:{ all -> 0x0090 }
        r2 = (com.snap.core.db.record.FeedRecord.FeedId) r2;	 Catch:{ all -> 0x0090 }
        r3 = r2.key();	 Catch:{ all -> 0x0090 }
        defpackage.akcr.a(r3, r0);	 Catch:{ all -> 0x0090 }
        r4 = r2._id();	 Catch:{ all -> 0x0090 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0090 }
        r1.put(r3, r4);	 Catch:{ all -> 0x0090 }
        r3 = r7.a;	 Catch:{ all -> 0x0090 }
        r4 = r2.key();	 Catch:{ all -> 0x0090 }
        defpackage.akcr.a(r4, r0);	 Catch:{ all -> 0x0090 }
        r5 = r2._id();	 Catch:{ all -> 0x0090 }
        r2 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x0090 }
        r3.put(r4, r2);	 Catch:{ all -> 0x0090 }
        goto L_0x005c;
        return r1;
        r8 = move-exception;
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qum.a(java.lang.String[]):java.util.Map");
    }

    public final long b(String str) {
        akcr.b(str, "conversationId");
        Long l = (Long) this.a.get(str);
        if (l == null) {
            DbClient dbClient = this.b;
            Object feedIdForKey = FeedRecord.FACTORY.getFeedIdForKey(str);
            akcr.a(feedIdForKey, "FeedRecord.FACTORY.getFeedIdForKey(conversationId)");
            Object obj = FeedRecord.FACTORY;
            akcr.a(obj, "FeedRecord.FACTORY");
            obj = obj.getFeedIdForKeyMapper();
            akcr.a(obj, "FeedRecord.FACTORY.feedIdForKeyMapper");
            l = (Long) dbClient.queryFirst(feedIdForKey, obj);
            if (l != null) {
                this.a.put(str, l);
            }
        }
        return l != null ? l.longValue() : -1;
    }

    public final void c(String str) {
        akcr.b(str, "conversationId");
        this.a.remove(str);
    }
}
