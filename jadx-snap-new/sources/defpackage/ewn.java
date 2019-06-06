package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.ConfigEtagModel.InsertOrReplaceEtag;
import com.snap.core.db.record.ConfigEtagRecord;

/* renamed from: ewn */
public final class ewn {
    final ajxe a = ajxh.a(new d(this));
    final ajxe b = ajxh.a(new g(a()));
    final ajwy<SnapDb> c;
    private final ajxe d = ajxh.a(new a(this));
    private final ajxe e = ajxh.a(new f(this));
    private final ajxe f = ajxh.a(c.a);

    /* renamed from: ewn$g */
    static final class g extends akcq implements akbk<pa> {
        g(DbClient dbClient) {
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

    /* renamed from: ewn$b */
    static final class b extends akcq implements akbl<Cursor, String> {
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
            return (String) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: ewn$c */
    static final class c extends akcs implements akbk<ainx> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ConfigEtagRecord.FACTORY.GetEtag();
        }
    }

    /* renamed from: ewn$d */
    static final class d extends akcs implements akbk<SnapDb> {
        private /* synthetic */ ewn a;

        d(ewn ewn) {
            this.a = ewn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SnapDb) this.a.c.get();
        }
    }

    /* renamed from: ewn$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ ewn a;

        a(ewn ewn) {
            this.a = ewn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.a.a.b()).getDbClient((ide) evh.a);
        }
    }

    /* renamed from: ewn$f */
    static final class f extends akcs implements akbk<InsertOrReplaceEtag> {
        private /* synthetic */ ewn a;

        f(ewn ewn) {
            this.a = ewn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertOrReplaceEtag((pa) this.a.b.b());
        }
    }

    /* renamed from: ewn$e */
    static final class e extends akcs implements akbl<DbTransaction, Long> {
        private /* synthetic */ ewn a;
        private /* synthetic */ String b;

        e(ewn ewn, String str) {
            this.a = ewn;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            ((InsertOrReplaceEtag) this.a.e.b()).bind(this.b);
            return Long.valueOf(this.a.a().executeInsert(((InsertOrReplaceEtag) this.a.e.b()), dbTransaction));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ewn.class), "snapDb", "getSnapDb()Lcom/snap/core/db/api/SnapDb;"), new akdc(akde.a(ewn.class), "briteDatabase", "getBriteDatabase()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(ewn.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(ewn.class), "updateEtagStatement", "getUpdateEtagStatement()Lcom/snap/core/db/record/ConfigEtagModel$InsertOrReplaceEtag;"), new akdc(akde.a(ewn.class), "getEtagStatement", "getGetEtagStatement()Lcom/squareup/sqldelight/prerelease/SqlDelightQuery;")};
    }

    public ewn(ajwy<SnapDb> ajwy) {
        akcr.b(ajwy, "snapDbProvider");
        this.c = ajwy;
    }

    /* Access modifiers changed, original: final */
    public final DbClient a() {
        return (DbClient) this.d.b();
    }

    /* Access modifiers changed, original: final */
    public final ainx b() {
        return (ainx) this.f.b();
    }
}
