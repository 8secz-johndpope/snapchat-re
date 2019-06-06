package defpackage;

import android.database.Cursor;
import com.google.common.base.Optional;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.LegacyStoryQueries;
import com.snap.core.db.record.StoryModel.DeleteByRowId;
import com.snap.core.db.record.StoryModel.EnsureStory;
import com.snap.core.db.record.StoryModel.InsertStory;
import com.snap.core.db.record.StoryModel.MarkAsViewed;
import com.snap.core.db.record.StoryModel.UpdateLatestMetadata;
import com.snap.core.db.record.StoryModel.UpdateStory;
import com.snap.core.db.record.StoryModel.UpdateStoryIdForFriendFeed;
import com.snap.core.db.record.StoryModel.UpdateStoryRanking;
import com.snap.core.db.record.StoryRecord;
import com.snap.core.db.record.StoryRecord.PlayableStoryRecord;
import com.snap.core.db.record.StoryRecord.UserManagedStoryRecord;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ylo */
public class ylo {
    private final ajxe a = ajxh.a(new h(this));
    private final ajxe b = ajxh.a(new g(this));
    public final DbClient c;
    private final ajxe d = ajxh.a(new k(this));
    private final ajxe e = ajxh.a(new f(this));
    private final ajxe f = ajxh.a(new m(this));
    private final ajxe g = ajxh.a(new n(this));
    private final ajxe h = ajxh.a(new l(this));
    private final ajxe i = ajxh.a(new a(this));

    /* renamed from: ylo$h */
    static final class h extends akcs implements akbk<InsertStory> {
        private /* synthetic */ ylo a;

        h(ylo ylo) {
            this.a = ylo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertStory(this.a.c.getWritableDatabase(), StoryRecord.FACTORY);
        }
    }

    /* renamed from: ylo$g */
    static final class g extends akcs implements akbk<EnsureStory> {
        private /* synthetic */ ylo a;

        g(ylo ylo) {
            this.a = ylo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new EnsureStory(this.a.c.getWritableDatabase(), StoryRecord.FACTORY);
        }
    }

    /* renamed from: ylo$k */
    static final class k extends akcs implements akbk<UpdateStory> {
        private /* synthetic */ ylo a;

        k(ylo ylo) {
            this.a = ylo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateStory(this.a.c.getWritableDatabase(), StoryRecord.FACTORY);
        }
    }

    /* renamed from: ylo$f */
    static final class f extends akcs implements akbk<MarkAsViewed> {
        private /* synthetic */ ylo a;

        f(ylo ylo) {
            this.a = ylo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new MarkAsViewed(this.a.c.getWritableDatabase(), StoryRecord.FACTORY);
        }
    }

    /* renamed from: ylo$m */
    static final class m extends akcs implements akbk<UpdateLatestMetadata> {
        private /* synthetic */ ylo a;

        m(ylo ylo) {
            this.a = ylo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateLatestMetadata(this.a.c.getWritableDatabase());
        }
    }

    /* renamed from: ylo$n */
    static final class n extends akcs implements akbk<UpdateStoryRanking> {
        private /* synthetic */ ylo a;

        n(ylo ylo) {
            this.a = ylo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateStoryRanking(this.a.c.getWritableDatabase());
        }
    }

    /* renamed from: ylo$l */
    static final class l extends akcs implements akbk<UpdateStoryIdForFriendFeed> {
        private /* synthetic */ ylo a;

        l(ylo ylo) {
            this.a = ylo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateStoryIdForFriendFeed(this.a.c.getWritableDatabase());
        }
    }

    /* renamed from: ylo$a */
    static final class a extends akcs implements akbk<DeleteByRowId> {
        private /* synthetic */ ylo a;

        a(ylo ylo) {
            this.a = ylo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeleteByRowId(this.a.c.getWritableDatabase());
        }
    }

    /* renamed from: ylo$b */
    public static final class b<V> implements Callable<T> {
        private /* synthetic */ ylo a;
        private /* synthetic */ ainx b;

        public b(ylo ylo, ainx ainx) {
            this.a = ylo;
            this.b = ainx;
        }

        public final /* synthetic */ Object call() {
            DbClient dbClient = this.a.c;
            ainx ainx = this.b;
            Object obj = LegacyStoryQueries.SELECT_PLAYABLE_STORY_MAPPER;
            akcr.a(obj, "LegacyStoryQueries.SELECT_PLAYABLE_STORY_MAPPER");
            return (PlayableStoryRecord) dbClient.queryFirst(ainx, obj);
        }
    }

    /* renamed from: ylo$d */
    public static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return list.isEmpty() ? Optional.absent() : Optional.of(list.get(0));
        }
    }

    /* renamed from: ylo$i */
    public static final class i<T, R> implements ajfc<T, R> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return list.isEmpty() ? Optional.absent() : Optional.of(list.get(0));
        }
    }

    /* renamed from: ylo$c */
    public static final class c extends akcs implements akbl<Cursor, StoryRecord> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return (StoryRecord) LegacyStoryQueries.SELECT_BY_STORY_KEY_MAPPER.map(cursor);
        }
    }

    /* renamed from: ylo$e */
    public static final class e extends akcs implements akbl<Cursor, StoryRecord> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return (StoryRecord) LegacyStoryQueries.SELECT_BY_STORY_ROW_ID_MAPPER.map(cursor);
        }
    }

    /* renamed from: ylo$j */
    public static final class j extends akcs implements akbl<Cursor, Long> {
        public static final j a = new j();

        j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            Object obj2 = StoryRecord.FACTORY;
            akcr.a(obj2, "StoryRecord.FACTORY");
            return (Long) obj2.getStoryRowIdByStoryKeyMapper().map(cursor);
        }
    }

    /* renamed from: ylo$o */
    public static final class o extends akcs implements akbl<Cursor, UserManagedStoryRecord> {
        public static final o a = new o();

        o() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return (UserManagedStoryRecord) LegacyStoryQueries.SELECT_USER_MANAGED_STORIES_MAPPER.map(cursor);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ylo.class), "storyInsert", "getStoryInsert()Lcom/snap/core/db/record/StoryModel$InsertStory;"), new akdc(akde.a(ylo.class), "storyEnsureStory", "getStoryEnsureStory()Lcom/snap/core/db/record/StoryModel$EnsureStory;"), new akdc(akde.a(ylo.class), "storyUpdate", "getStoryUpdate()Lcom/snap/core/db/record/StoryModel$UpdateStory;"), new akdc(akde.a(ylo.class), "markAsViewed", "getMarkAsViewed()Lcom/snap/core/db/record/StoryModel$MarkAsViewed;"), new akdc(akde.a(ylo.class), "updateStoryLatestMetadata", "getUpdateStoryLatestMetadata()Lcom/snap/core/db/record/StoryModel$UpdateLatestMetadata;"), new akdc(akde.a(ylo.class), "updateStoryRanking", "getUpdateStoryRanking()Lcom/snap/core/db/record/StoryModel$UpdateStoryRanking;"), new akdc(akde.a(ylo.class), "updateStoryIdForFriendFeed", "getUpdateStoryIdForFriendFeed()Lcom/snap/core/db/record/StoryModel$UpdateStoryIdForFriendFeed;"), new akdc(akde.a(ylo.class), "deleteStory", "getDeleteStory()Lcom/snap/core/db/record/StoryModel$DeleteByRowId;")};
    }

    public ylo(SnapDb snapDb) {
        akcr.b(snapDb, "snapDb");
        this.c = snapDb.getDbClient((ide) yhy.j);
    }

    private long a(DbTransaction dbTransaction, String str, StoryKind storyKind, String str2, String str3, Boolean bool, String str4, String str5, GroupStoryType groupStoryType, boolean z) {
        DbTransaction dbTransaction2 = dbTransaction;
        String str6 = str;
        StoryKind storyKind2 = storyKind;
        akcr.b(dbTransaction2, "tx");
        akcr.b(str6, "storyId");
        akcr.b(storyKind2, "storyKind");
        dbTransaction.checkInTransaction();
        Object obj = this.c;
        akcr.a(obj, "dbClient");
        dbTransaction.checkInTransaction();
        Object storyRowIdByStoryKey = StoryRecord.FACTORY.getStoryRowIdByStoryKey(str6, storyKind2);
        akcr.a(storyRowIdByStoryKey, "StoryRecord.FACTORY.getS…ryKey(storyId, storyKind)");
        Object obj2 = StoryRecord.FACTORY;
        akcr.a(obj2, "StoryRecord.FACTORY");
        obj2 = obj2.getStoryRowIdByStoryKeyMapper();
        akcr.a(obj2, "StoryRecord.FACTORY.storyRowIdByStoryKeyMapper");
        Long l = (Long) obj.queryFirst(storyRowIdByStoryKey, obj2);
        if (!(l == null || l.longValue() == -1)) {
            e().bind(str2, str3, bool, str4, str5, groupStoryType, str, storyKind);
            obj.executeUpdateDelete(e(), dbTransaction2);
        }
        long b = abpp.b(l);
        if (b != -1) {
            return b;
        }
        Boolean valueOf = Boolean.valueOf(z);
        dbTransaction.checkInTransaction();
        c().bind(str, str2, str3, bool, str4, str5, storyKind, groupStoryType, valueOf);
        return this.c.executeInsert(c(), dbTransaction2);
    }

    public static /* synthetic */ long a(ylo ylo, DbTransaction dbTransaction, String str, StoryKind storyKind, String str2, String str3, Boolean bool, String str4, String str5, GroupStoryType groupStoryType, boolean z, int i) {
        int i2 = i;
        return ylo.a(dbTransaction, str, storyKind, str2, str3, (i2 & 32) != 0 ? Boolean.FALSE : bool, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : groupStoryType, (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? false : z);
    }

    private final InsertStory c() {
        return (InsertStory) this.a.b();
    }

    private final EnsureStory d() {
        return (EnsureStory) this.b.b();
    }

    private final UpdateStory e() {
        return (UpdateStory) this.d.b();
    }

    private final UpdateLatestMetadata f() {
        return (UpdateLatestMetadata) this.f.b();
    }

    private final UpdateStoryIdForFriendFeed g() {
        return (UpdateStoryIdForFriendFeed) this.h.b();
    }

    private final DeleteByRowId h() {
        return (DeleteByRowId) this.i.b();
    }

    public final long a(DbTransaction dbTransaction, aeml aeml) {
        akcr.b(dbTransaction, "tx");
        akcr.b(aeml, "friendStories");
        dbTransaction.checkInTransaction();
        Object obj = aeml.a;
        akcr.a(obj, "friendStories.username");
        return ylo.a(this, dbTransaction, obj, StoryKind.FRIEND, aeml.a, aeml.c, aeml.d, aeml.e, aeml.g, null, false, 768);
    }

    public final long a(DbTransaction dbTransaction, ahaz ahaz) {
        akcr.b(dbTransaction, "tx");
        akcr.b(ahaz, "mischief");
        dbTransaction.checkInTransaction();
        Object obj = ahaz.D;
        akcr.a(obj, "mischief.mischiefMobId");
        StoryKind storyKind = StoryKind.GROUP;
        GroupStoryType groupStoryType = GroupStoryType.MISCHIEF;
        String str = ahaz.a;
        ahbg ahbg = ahaz.b;
        return ylo.a(this, dbTransaction, obj, storyKind, str, ahbg != null ? ahbg.a : null, null, null, null, groupStoryType, true, 224);
    }

    public final long a(DbTransaction dbTransaction, String str, StoryKind storyKind, String str2) {
        StoryKind storyKind2 = storyKind;
        DbTransaction dbTransaction2 = dbTransaction;
        akcr.b(dbTransaction, "tx");
        String str3 = str;
        akcr.b(str, "localUsername");
        akcr.b(storyKind, "storyKind");
        akcr.b(str2, "displayName");
        dbTransaction.checkInTransaction();
        Object obj = (storyKind2 == StoryKind.MY || storyKind2 == StoryKind.MY_OVERRIDDEN_PRIVACY) ? 1 : null;
        if (obj != null) {
            return ylo.a(this, dbTransaction, "my_story_ads79sdf", storyKind, str, str2, null, null, null, null, true, 480);
        }
        throw new IllegalStateException("Error upserting My Story, invalid StoryKind".toString());
    }

    public final MarkAsViewed a() {
        return (MarkAsViewed) this.e.b();
    }

    public final Long a(String str, StoryKind storyKind) {
        akcr.b(str, "storyId");
        akcr.b(storyKind, "kind");
        Object storyRowIdByStoryKey = StoryRecord.FACTORY.getStoryRowIdByStoryKey(str, storyKind);
        akcr.a(storyRowIdByStoryKey, "StoryRecord.FACTORY.getS…ByStoryKey(storyId, kind)");
        DbClient dbClient = this.c;
        Object obj = StoryRecord.FACTORY;
        akcr.a(obj, "StoryRecord.FACTORY");
        obj = obj.getStoryRowIdByStoryKeyMapper();
        akcr.a(obj, "StoryRecord.FACTORY.storyRowIdByStoryKeyMapper");
        return (Long) dbClient.queryFirst(storyRowIdByStoryKey, obj);
    }

    public final void a(DbTransaction dbTransaction, long j) {
        akcr.b(dbTransaction, "tx");
        dbTransaction.checkInTransaction();
        h().bind(j);
        this.c.executeUpdateDelete(h(), dbTransaction);
    }

    public final void a(DbTransaction dbTransaction, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        dbTransaction.checkInTransaction();
        g().bind(Long.valueOf(j), Long.valueOf(j2));
        this.c.executeUpdateDelete(g(), dbTransaction);
    }

    public final void a(DbTransaction dbTransaction, long j, long j2, long j3, boolean z) {
        akcr.b(dbTransaction, "tx");
        dbTransaction.checkInTransaction();
        f().bind(Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z), j);
        this.c.executeUpdateDelete(f(), dbTransaction);
    }

    public final long b(DbTransaction dbTransaction, String str, StoryKind storyKind, String str2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(str, "storyId");
        akcr.b(storyKind, "storyKind");
        dbTransaction.checkInTransaction();
        Long a = a(str, storyKind);
        if (a != null) {
            return a.longValue();
        }
        ylo ylo = this;
        ylo.d().bind(str, storyKind, str2);
        return ylo.c.executeInsert(ylo.d(), dbTransaction);
    }

    public final UpdateStoryRanking b() {
        return (UpdateStoryRanking) this.g.b();
    }

    /* JADX WARNING: Missing block: B:38:0x00e7, code skipped:
            if (r5 == null) goto L_0x00e9;
     */
    public final void b(com.snap.core.db.api.DbTransaction r17, long r18) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r2 = "tx";
        defpackage.akcr.b(r1, r2);
        r17.checkInTransaction();
        r2 = com.snap.core.db.record.StorySnapRecord.FACTORY;
        r7 = r18;
        r2 = r2.getUpdatedTimestampsAndViewStatusForStoryRowId(r7);
        r3 = "StorySnapRecord.FACTORY.…ForStoryRowId(storyRowId)";
        defpackage.akcr.a(r2, r3);
        r3 = r0.c;
        r4 = com.snap.core.db.record.LegacyStorySnapQueries.SELECT_LATEST_SNAPS_STATUS_MAPPER;
        r5 = "LegacyStorySnapQueries.S…ATEST_SNAPS_STATUS_MAPPER";
        defpackage.akcr.a(r4, r5);
        r2 = r3.query(r2, r4);
        r3 = r2;
        r3 = (java.lang.Iterable) r3;
        r4 = r3.iterator();
        r5 = r4.hasNext();
        r6 = 0;
        if (r5 != 0) goto L_0x0036;
    L_0x0034:
        r5 = r6;
        goto L_0x0059;
    L_0x0036:
        r5 = r4.next();
        r9 = r5;
        r9 = (com.snap.core.db.record.StorySnapRecord.LatestTimestampsAndViewStatusRecord) r9;
        r9 = r9.latestTimestamp();
    L_0x0041:
        r11 = r4.hasNext();
        if (r11 == 0) goto L_0x0059;
    L_0x0047:
        r11 = r4.next();
        r12 = r11;
        r12 = (com.snap.core.db.record.StorySnapRecord.LatestTimestampsAndViewStatusRecord) r12;
        r12 = r12.latestTimestamp();
        r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1));
        if (r14 >= 0) goto L_0x0041;
    L_0x0056:
        r5 = r11;
        r9 = r12;
        goto L_0x0041;
    L_0x0059:
        r5 = (com.snap.core.db.record.StorySnapRecord.LatestTimestampsAndViewStatusRecord) r5;
        r3 = r3.iterator();
        r4 = r3.hasNext();
        r9 = 0;
        if (r4 != 0) goto L_0x0068;
    L_0x0067:
        goto L_0x00a0;
    L_0x0068:
        r4 = r3.next();
        r6 = r4;
        r6 = (com.snap.core.db.record.StorySnapRecord.LatestTimestampsAndViewStatusRecord) r6;
        r6 = r6.expirationTimestamp();
        if (r6 != 0) goto L_0x0079;
    L_0x0075:
        r6 = java.lang.Long.valueOf(r9);
    L_0x0079:
        r6 = (java.lang.Comparable) r6;
        r15 = r6;
        r6 = r4;
        r4 = r15;
    L_0x007e:
        r11 = r3.hasNext();
        if (r11 == 0) goto L_0x00a0;
    L_0x0084:
        r11 = r3.next();
        r12 = r11;
        r12 = (com.snap.core.db.record.StorySnapRecord.LatestTimestampsAndViewStatusRecord) r12;
        r12 = r12.expirationTimestamp();
        if (r12 != 0) goto L_0x0095;
    L_0x0091:
        r12 = java.lang.Long.valueOf(r9);
    L_0x0095:
        r12 = (java.lang.Comparable) r12;
        r13 = r4.compareTo(r12);
        if (r13 >= 0) goto L_0x007e;
    L_0x009d:
        r6 = r11;
        r4 = r12;
        goto L_0x007e;
    L_0x00a0:
        r6 = (com.snap.core.db.record.StorySnapRecord.LatestTimestampsAndViewStatusRecord) r6;
        r3 = "storySnaps";
        defpackage.akcr.b(r2, r3);
        r2 = r2.iterator();
        r3 = 0;
        r4 = 0;
    L_0x00ad:
        r11 = r2.hasNext();
        r12 = -1;
        if (r11 == 0) goto L_0x00ca;
    L_0x00b4:
        r11 = r2.next();
        r11 = (com.snap.core.db.record.StorySnapRecord.LatestTimestampsAndViewStatusRecord) r11;
        r11 = r11.viewed();
        r13 = java.lang.Boolean.FALSE;
        r11 = defpackage.akcr.a(r11, r13);
        if (r11 == 0) goto L_0x00c7;
    L_0x00c6:
        goto L_0x00cb;
    L_0x00c7:
        r4 = r4 + 1;
        goto L_0x00ad;
    L_0x00ca:
        r4 = -1;
    L_0x00cb:
        if (r4 != r12) goto L_0x00ce;
    L_0x00cd:
        r3 = 1;
    L_0x00ce:
        r2 = r16.f();
        if (r5 == 0) goto L_0x00dd;
    L_0x00d4:
        r4 = r5.latestTimestamp();
        r4 = java.lang.Long.valueOf(r4);
        goto L_0x00e1;
    L_0x00dd:
        r4 = java.lang.Long.valueOf(r9);
    L_0x00e1:
        if (r6 == 0) goto L_0x00e9;
    L_0x00e3:
        r5 = r6.expirationTimestamp();
        if (r5 != 0) goto L_0x00ed;
    L_0x00e9:
        r5 = java.lang.Long.valueOf(r9);
    L_0x00ed:
        r6 = java.lang.Boolean.valueOf(r3);
        r3 = r2;
        r7 = r18;
        r3.bind(r4, r5, r6, r7);
        r2 = r0.c;
        r3 = r16.f();
        r3 = (defpackage.ainy) r3;
        r2.executeUpdateDelete(r3, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylo.b(com.snap.core.db.api.DbTransaction, long):void");
    }
}
