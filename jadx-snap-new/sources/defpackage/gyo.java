package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.DiscoverFeedStoryModel.CleanupStoryOlderThan;
import com.snap.core.db.record.DiscoverFeedStoryModel.ClearAll;
import com.snap.core.db.record.DiscoverFeedStoryModel.Factory;
import com.snap.core.db.record.DiscoverFeedStoryModel.InsertDiscoverFeedStory;
import com.snap.core.db.record.DiscoverFeedStoryModel.UpdateDiscoverFeedStory;
import com.snap.core.db.record.DiscoverFeedStoryRecord;
import com.snap.core.db.record.DiscoverFeedStoryRecord.StoryIdModelRecord;
import java.util.List;

/* renamed from: gyo */
public final class gyo {
    final DbClient a;
    private final ajxe b = ajxh.a(new d(this));
    private final ajxe c = ajxh.a(new e(this));
    private final ajxe d = ajxh.a(new a(this));
    private final ajxe e = ajxh.a(new f(this));
    private final ihh f;

    /* renamed from: gyo$d */
    static final class d extends akcs implements akbk<InsertDiscoverFeedStory> {
        private /* synthetic */ gyo a;

        d(gyo gyo) {
            this.a = gyo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertDiscoverFeedStory(this.a.a(), DiscoverFeedStoryRecord.FACTORY);
        }
    }

    /* renamed from: gyo$e */
    static final class e extends akcs implements akbk<UpdateDiscoverFeedStory> {
        private /* synthetic */ gyo a;

        e(gyo gyo) {
            this.a = gyo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateDiscoverFeedStory(this.a.a(), DiscoverFeedStoryRecord.FACTORY);
        }
    }

    /* renamed from: gyo$a */
    static final class a extends akcs implements akbk<ClearAll> {
        private /* synthetic */ gyo a;

        a(gyo gyo) {
            this.a = gyo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ClearAll(this.a.a(), DiscoverFeedStoryRecord.FACTORY);
        }
    }

    /* renamed from: gyo$f */
    static final class f extends akcs implements akbk<pa> {
        private /* synthetic */ gyo a;

        f(gyo gyo) {
            this.a = gyo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.getWritableDatabase();
        }
    }

    /* renamed from: gyo$b */
    static final class b extends akcs implements akbl<Cursor, Long> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            obj = DiscoverFeedStoryRecord.FACTORY.getDiscoverFeedStoryRowIdMapper().map(cursor);
            akcr.a(obj, "DiscoverFeedStoryRecord.…RowIdMapper().map(cursor)");
            return (Long) obj;
        }
    }

    /* renamed from: gyo$c */
    static final class c extends akcq implements akbl<Cursor, StoryIdModelRecord> {
        c(ainw ainw) {
            super(1, ainw);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(ainw.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (StoryIdModelRecord) ((ainw) this.receiver).map(cursor);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gyo.class), "storyInsert", "getStoryInsert()Lcom/snap/core/db/record/DiscoverFeedStoryModel$InsertDiscoverFeedStory;"), new akdc(akde.a(gyo.class), "storyUpdate", "getStoryUpdate()Lcom/snap/core/db/record/DiscoverFeedStoryModel$UpdateDiscoverFeedStory;"), new akdc(akde.a(gyo.class), "clearAll", "getClearAll()Lcom/snap/core/db/record/DiscoverFeedStoryModel$ClearAll;"), new akdc(akde.a(gyo.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;")};
    }

    public gyo(DbClient dbClient, ihh ihh) {
        akcr.b(dbClient, "dbClient");
        akcr.b(ihh, "clock");
        this.a = dbClient;
        this.f = ihh;
    }

    private long b(String str, FeatureType featureType, DbTransaction dbTransaction) {
        akcr.b(str, "storyId");
        akcr.b(featureType, "featureType");
        akcr.b(dbTransaction, "tx");
        b().bind(str, this.f.a(), featureType);
        return this.a.executeInsert(b(), dbTransaction);
    }

    private final InsertDiscoverFeedStory b() {
        return (InsertDiscoverFeedStory) this.b.b();
    }

    private final int c(String str, FeatureType featureType, DbTransaction dbTransaction) {
        c().bind(str, this.f.a(), str, featureType);
        return this.a.executeUpdateDelete(c(), dbTransaction);
    }

    private final UpdateDiscoverFeedStory c() {
        return (UpdateDiscoverFeedStory) this.c.b();
    }

    private final Long c(String str, FeatureType featureType) {
        Object discoverFeedStoryRowId = DiscoverFeedStoryRecord.FACTORY.getDiscoverFeedStoryRowId(str, featureType);
        akcr.a(discoverFeedStoryRowId, "DiscoverFeedStoryRecord.…wId(storyId, featureType)");
        DbClient dbClient = this.a;
        Object obj = DiscoverFeedStoryRecord.FACTORY;
        akcr.a(obj, "DiscoverFeedStoryRecord.FACTORY");
        obj = obj.getDiscoverFeedStoryRowIdMapper();
        akcr.a(obj, "DiscoverFeedStoryRecord.…coverFeedStoryRowIdMapper");
        return (Long) dbClient.queryFirst(discoverFeedStoryRowId, obj);
    }

    private final ClearAll d() {
        return (ClearAll) this.d.b();
    }

    public final long a(String str, FeatureType featureType, DbTransaction dbTransaction) {
        akcr.b(str, "storyId");
        akcr.b(featureType, "featureType");
        akcr.b(dbTransaction, "tx");
        if (((long) c(str, featureType, dbTransaction)) <= 0) {
            return b(str, featureType, dbTransaction);
        }
        Long c = c(str, featureType);
        if (c == null) {
            akcr.a();
        }
        return c.longValue();
    }

    public final ajdx<Long> a(String str, FeatureType featureType) {
        akcr.b(str, "storyId");
        akcr.b(featureType, "featureType");
        Object discoverFeedStoryRowId = DiscoverFeedStoryRecord.FACTORY.getDiscoverFeedStoryRowId(str, featureType);
        akcr.a(discoverFeedStoryRowId, "DiscoverFeedStoryRecord.…wId(storyId, featureType)");
        return this.a.queryAndMapToOneOrDefault(discoverFeedStoryRowId, b.a, Long.valueOf(-1));
    }

    public final ajdx<List<StoryIdModelRecord>> a(List<String> list, FeatureType featureType) {
        akcr.b(list, "storyStringIds");
        akcr.b(featureType, "featureType");
        Factory factory = DiscoverFeedStoryRecord.FACTORY;
        Object[] toArray = list.toArray(new String[0]);
        if (toArray != null) {
            Object storyRowIdsInBatch = factory.getStoryRowIdsInBatch(featureType, (String[]) toArray);
            akcr.a(storyRowIdsInBatch, "DiscoverFeedStoryRecord.…StringIds.toTypedArray())");
            storyRowIdsInBatch = this.a.queryAndMapToList(storyRowIdsInBatch, new c(DiscoverFeedStoryRecord.SELECT_STORY_IDS_MAPPER)).d((Object) ajyw.a);
            akcr.a(storyRowIdsInBatch, "dbClient.queryAndMapToLi…      .first(emptyList())");
            return storyRowIdsInBatch;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* Access modifiers changed, original: final */
    public final pa a() {
        return (pa) this.e.b();
    }

    public final void a(long j, FeatureType featureType, DbTransaction dbTransaction) {
        akcr.b(featureType, "featureType");
        akcr.b(dbTransaction, "tx");
        CleanupStoryOlderThan cleanupStoryOlderThan = new CleanupStoryOlderThan(a(), DiscoverFeedStoryRecord.FACTORY);
        cleanupStoryOlderThan.bind(j, featureType);
        BriteDatabaseExtensionsKt.executeDelete(this.a, cleanupStoryOlderThan, dbTransaction);
    }

    public final void a(FeatureType featureType, DbTransaction dbTransaction) {
        akcr.b(featureType, "featureType");
        akcr.b(dbTransaction, "tx");
        d().bind(featureType);
        this.a.executeUpdateDelete(d(), dbTransaction);
    }

    public final long b(String str, FeatureType featureType) {
        akcr.b(str, "storyId");
        akcr.b(featureType, "featureType");
        Object discoverFeedStoryRowId = DiscoverFeedStoryRecord.FACTORY.getDiscoverFeedStoryRowId(str, featureType);
        akcr.a(discoverFeedStoryRowId, "DiscoverFeedStoryRecord.…wId(storyId, featureType)");
        DbClient dbClient = this.a;
        Object obj = DiscoverFeedStoryRecord.FACTORY;
        akcr.a(obj, "DiscoverFeedStoryRecord.FACTORY");
        obj = obj.getDiscoverFeedStoryRowIdMapper();
        akcr.a(obj, "DiscoverFeedStoryRecord.…coverFeedStoryRowIdMapper");
        discoverFeedStoryRowId = dbClient.queryFirst(discoverFeedStoryRowId, obj, Long.valueOf(-1));
        akcr.a(discoverFeedStoryRowId, "dbClient.queryFirst(sele…eedStoryRowIdMapper, -1L)");
        return ((Number) discoverFeedStoryRowId).longValue();
    }
}
