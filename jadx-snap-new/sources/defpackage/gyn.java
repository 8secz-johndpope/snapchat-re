package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.DiscoverStorySnapModel.ClearAll;
import com.snap.core.db.record.DiscoverStorySnapModel.InsertDiscoverStorySnap;
import com.snap.core.db.record.DiscoverStorySnapModel.Mapper;
import com.snap.core.db.record.DiscoverStorySnapModel.UpdateDiscoverStorySnap;
import com.snap.core.db.record.DiscoverStorySnapRecord;
import com.snap.core.db.record.DiscoverStorySnapRecord.PlayableStorySnapsModelRecord;
import com.snap.core.db.record.DiscoverStorySnapRecord.PrefetchStorySnapModelRecord;
import com.snap.core.db.record.DiscoverStorySnapRecord.StorySnapMediaInfoRecord;

/* renamed from: gyn */
public final class gyn {
    public final DbClient a;
    public final ihh b;
    private final ajxe c = ajxh.a(new g(this));
    private final ajxe d = ajxh.a(new h(this));
    private final ajxe e = ajxh.a(new a(this));
    private final ajxe f = ajxh.a(new i(this));

    /* renamed from: gyn$g */
    static final class g extends akcs implements akbk<InsertDiscoverStorySnap> {
        private /* synthetic */ gyn a;

        g(gyn gyn) {
            this.a = gyn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertDiscoverStorySnap(this.a.c(), DiscoverStorySnapRecord.FACTORY);
        }
    }

    /* renamed from: gyn$h */
    static final class h extends akcs implements akbk<UpdateDiscoverStorySnap> {
        private /* synthetic */ gyn a;

        h(gyn gyn) {
            this.a = gyn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateDiscoverStorySnap(this.a.c(), DiscoverStorySnapRecord.FACTORY);
        }
    }

    /* renamed from: gyn$a */
    static final class a extends akcs implements akbk<ClearAll> {
        private /* synthetic */ gyn a;

        a(gyn gyn) {
            this.a = gyn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ClearAll(this.a.c(), DiscoverStorySnapRecord.FACTORY);
        }
    }

    /* renamed from: gyn$i */
    static final class i extends akcs implements akbk<pa> {
        private /* synthetic */ gyn a;

        i(gyn gyn) {
            this.a = gyn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.getWritableDatabase();
        }
    }

    /* renamed from: gyn$b */
    public static final class b extends akcs implements akbl<Cursor, PlayableStorySnapsModelRecord> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            return (PlayableStorySnapsModelRecord) DiscoverStorySnapRecord.SELECT_PLAYABLE_STORY_SNAPS_MODEL_ROW_MAPPER.map(cursor);
        }
    }

    /* renamed from: gyn$c */
    public static final class c extends akcs implements akbl<Cursor, PrefetchStorySnapModelRecord> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            return (PrefetchStorySnapModelRecord) DiscoverStorySnapRecord.SELECT_PREFETCH_SNAPS_MODEL_ROW_MAPPER.map(cursor);
        }
    }

    /* renamed from: gyn$d */
    public static final class d extends akcq implements akbl<Cursor, DiscoverStorySnapRecord> {
        public d(Mapper mapper) {
            super(1, mapper);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(Mapper.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Lcom/snap/core/db/record/DiscoverStorySnapModel;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (DiscoverStorySnapRecord) ((Mapper) this.receiver).map(cursor);
        }
    }

    /* renamed from: gyn$e */
    public static final class e extends akcq implements akbl<Cursor, StorySnapMediaInfoRecord> {
        public e(ainw ainw) {
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
            return (StorySnapMediaInfoRecord) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: gyn$f */
    public static final class f extends akcq implements akbl<Cursor, DiscoverStorySnapRecord> {
        public f(Mapper mapper) {
            super(1, mapper);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(Mapper.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Lcom/snap/core/db/record/DiscoverStorySnapModel;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (DiscoverStorySnapRecord) ((Mapper) this.receiver).map(cursor);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gyn.class), "snapInsert", "getSnapInsert()Lcom/snap/core/db/record/DiscoverStorySnapModel$InsertDiscoverStorySnap;"), new akdc(akde.a(gyn.class), "snapUpdate", "getSnapUpdate()Lcom/snap/core/db/record/DiscoverStorySnapModel$UpdateDiscoverStorySnap;"), new akdc(akde.a(gyn.class), "clearAll", "getClearAll()Lcom/snap/core/db/record/DiscoverStorySnapModel$ClearAll;"), new akdc(akde.a(gyn.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;")};
    }

    public gyn(DbClient dbClient, ihh ihh) {
        akcr.b(dbClient, "dbClient");
        akcr.b(ihh, "clock");
        this.a = dbClient;
        this.b = ihh;
    }

    private final ClearAll d() {
        return (ClearAll) this.e.b();
    }

    public final InsertDiscoverStorySnap a() {
        return (InsertDiscoverStorySnap) this.c.b();
    }

    public final void a(FeatureType featureType) {
        akcr.b(featureType, "featureType");
        d().bind(featureType);
        this.a.executeUpdateDelete(d());
    }

    public final UpdateDiscoverStorySnap b() {
        return (UpdateDiscoverStorySnap) this.d.b();
    }

    public final pa c() {
        return (pa) this.f.b();
    }
}
