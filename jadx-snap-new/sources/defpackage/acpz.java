package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import defpackage.nlq.b;
import defpackage.nlq.e;
import java.util.List;

/* renamed from: acpz */
public final class acpz {
    final DbClient a = this.e.getDbClient((ide) adcw.b);
    private final ajxe b = ajxh.a(new f(this.a));
    private final ajxe c = ajxh.a(new d(this));
    private final ajxe d = ajxh.a(new a(this));
    private final SnapDb e;

    /* renamed from: acpz$a */
    static final class a extends akcs implements akbk<b> {
        private /* synthetic */ acpz a;

        a(acpz acpz) {
            this.a = acpz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new b(((pa) this.a.b.b()));
        }
    }

    /* renamed from: acpz$c */
    static final class c extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ acpz a;
        private /* synthetic */ String b;
        private /* synthetic */ long c;

        c(acpz acpz, String str, long j) {
            this.a = acpz;
            this.b = str;
            this.c = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            acpz.a(this.a, this.b, this.c, dbTransaction);
            return ajxw.a;
        }
    }

    /* renamed from: acpz$d */
    static final class d extends akcs implements akbk<e> {
        private /* synthetic */ acpz a;

        d(acpz acpz) {
            this.a = acpz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new e(((pa) this.a.b.b()));
        }
    }

    /* renamed from: acpz$e */
    static final class e extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ acpz a;
        private /* synthetic */ List b;

        e(acpz acpz, List list) {
            this.a = acpz;
            this.b = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            for (ajxm ajxm : this.b) {
                acpz.a(this.a, (String) ajxm.a, ((Number) ajxm.b).longValue(), dbTransaction);
            }
            return ajxw.a;
        }
    }

    /* renamed from: acpz$b */
    static final class b extends akcq implements akbl<Cursor, nlp> {
        b(ainw ainw) {
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
            return (nlp) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: acpz$f */
    static final class f extends akcq implements akbk<pa> {
        f(DbClient dbClient) {
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

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(acpz.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(acpz.class), "replaceReadStatusStatement", "getReplaceReadStatusStatement()Lcom/snap/map/db/record/MapExploreReadStatusModel$ReplaceReadStatus;"), new akdc(akde.a(acpz.class), "deleteReadStatusStatement", "getDeleteReadStatusStatement()Lcom/snap/map/db/record/MapExploreReadStatusModel$DeleteReadStatus;")};
    }

    public acpz(SnapDb snapDb) {
        akcr.b(snapDb, "snapDb");
        this.e = snapDb;
    }

    private final e a() {
        return (e) this.c.b();
    }

    public static final /* synthetic */ void a(acpz acpz, String str, long j, DbTransaction dbTransaction) {
        acpz.a().a(str, j);
        acpz.a.executeInsert(acpz.a(), dbTransaction);
    }

    public final ajcx a(String str, long j) {
        akcr.b(str, "ownerId");
        return this.a.runInTransaction("ExploreReadStatusRepository#replaceReadStatus", new c(this, str, j));
    }

    public final ajcx a(List<ajxm<String, Long>> list) {
        akcr.b(list, "timestamps");
        return this.a.runInTransaction("ExploreReadStatusRepository#replaceReadStatuses", new e(this, list));
    }
}
