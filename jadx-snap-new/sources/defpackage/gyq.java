package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.record.PromotedStorySnapModel.ClearAllSnapByFeatureType;
import com.snap.core.db.record.PromotedStorySnapModel.InsertPromotedStorySnap;
import com.snap.core.db.record.PromotedStorySnapModel.UpdatePromotedStorySnap;
import com.snap.core.db.record.PromotedStorySnapRecord;
import com.snap.core.db.record.PromotedStorySnapRecord.PlayablePromotedSnapRecord;

/* renamed from: gyq */
public final class gyq {
    public final DbClient a;
    public final ihh b;
    private final ajxe c = ajxh.a(new e(this));
    private final ajxe d = ajxh.a(new c(this));
    private final ajxe e = ajxh.a(new d(this));
    private final ajxe f = ajxh.a(new a(this));

    /* renamed from: gyq$e */
    static final class e extends akcs implements akbk<pa> {
        private /* synthetic */ gyq a;

        e(gyq gyq) {
            this.a = gyq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.getWritableDatabase();
        }
    }

    /* renamed from: gyq$c */
    static final class c extends akcs implements akbk<InsertPromotedStorySnap> {
        private /* synthetic */ gyq a;

        c(gyq gyq) {
            this.a = gyq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertPromotedStorySnap(this.a.a(), PromotedStorySnapRecord.FACTORY);
        }
    }

    /* renamed from: gyq$d */
    static final class d extends akcs implements akbk<UpdatePromotedStorySnap> {
        private /* synthetic */ gyq a;

        d(gyq gyq) {
            this.a = gyq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdatePromotedStorySnap(this.a.a(), PromotedStorySnapRecord.FACTORY);
        }
    }

    /* renamed from: gyq$a */
    static final class a extends akcs implements akbk<ClearAllSnapByFeatureType> {
        private /* synthetic */ gyq a;

        a(gyq gyq) {
            this.a = gyq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ClearAllSnapByFeatureType(this.a.a(), PromotedStorySnapRecord.FACTORY);
        }
    }

    /* renamed from: gyq$b */
    public static final class b extends akcs implements akbl<Cursor, PlayablePromotedSnapRecord> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            return (PlayablePromotedSnapRecord) PromotedStorySnapRecord.PROMOTED_PLAYABLE_SNAP_RECORD_ROW_MAPPER.map(cursor);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gyq.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(gyq.class), "snapInsert", "getSnapInsert()Lcom/snap/core/db/record/PromotedStorySnapModel$InsertPromotedStorySnap;"), new akdc(akde.a(gyq.class), "snapUpdate", "getSnapUpdate()Lcom/snap/core/db/record/PromotedStorySnapModel$UpdatePromotedStorySnap;"), new akdc(akde.a(gyq.class), "clearAll", "getClearAll()Lcom/snap/core/db/record/PromotedStorySnapModel$ClearAllSnapByFeatureType;")};
    }

    public gyq(DbClient dbClient, ihh ihh) {
        akcr.b(dbClient, "dbClient");
        akcr.b(ihh, "clock");
        this.a = dbClient;
        this.b = ihh;
    }

    public final pa a() {
        return (pa) this.c.b();
    }

    public final InsertPromotedStorySnap b() {
        return (InsertPromotedStorySnap) this.d.b();
    }

    public final UpdatePromotedStorySnap c() {
        return (UpdatePromotedStorySnap) this.e.b();
    }

    public final ClearAllSnapByFeatureType d() {
        return (ClearAllSnapByFeatureType) this.f.b();
    }
}
