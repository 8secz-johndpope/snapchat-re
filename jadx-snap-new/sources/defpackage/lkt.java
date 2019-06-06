package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.LensPersistentStorageRecord;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.mpo.b;

/* renamed from: lkt */
public final class lkt implements mnr {
    final SnapDb a;
    final ide b;
    private final ajxe c = ajxh.a(new b(this));
    private final ajxe d = ajxh.a(c.a);
    private final zfw e;

    /* renamed from: lkt$c */
    static final class c extends akcs implements akbk<byte[]> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return mhj.a;
        }
    }

    /* renamed from: lkt$b */
    static final class b extends akcs implements akbk<DbClient> {
        private /* synthetic */ lkt a;

        b(lkt lkt) {
            this.a = lkt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.getDbClient(this.a.b.callsite("SnapDbLensPersistenceRepository"));
        }
    }

    /* renamed from: lkt$d */
    static final class d extends akcs implements akbl<Cursor, byte[]> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            obj = LensPersistentStorageRecord.FACTORY.a().map(cursor);
            akcr.a(obj, "LensPersistentStorageRec…tByLensIdMapper().map(it)");
            obj = obj.data();
            akcr.a(obj, "model.data()");
            return obj;
        }
    }

    /* renamed from: lkt$a */
    static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ lkt a;

        a(lkt lkt) {
            this.a = lkt;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            Object a = this.a.a();
            akcr.a(a, "dbClient");
            BriteDatabaseExtensionsKt.executeDelete(a, new b(this.a.a().getWritableDatabase()), dbTransaction);
            return ajxw.a;
        }
    }

    /* renamed from: lkt$e */
    static final class e extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ lkt a;
        private /* synthetic */ mhs.b b;
        private /* synthetic */ byte[] c;

        e(lkt lkt, mhs.b bVar, byte[] bArr) {
            this.a = lkt;
            this.b = bVar;
            this.c = bArr;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            DbClient a = this.a.a();
            defpackage.mpo.e eVar = new defpackage.mpo.e(this.a.a().getWritableDatabase());
            eVar.a(this.b.a, this.c);
            a.executeInsert(eVar, dbTransaction);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lkt.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(lkt.class), "emptyByteArray", "getEmptyByteArray()[B")};
    }

    public lkt(SnapDb snapDb, zfw zfw, ide ide) {
        akcr.b(snapDb, "snapDb");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ide, "attributedFeature");
        this.a = snapDb;
        this.e = zfw;
        this.b = ide;
    }

    public final ajcx a(mhs.b bVar, byte[] bArr) {
        akcr.b(bVar, "id");
        akcr.b(bArr, UnlockablesModel.DATA);
        return a().runInTransaction("SnapDbLensPersistenceRepository:write", new e(this, bVar, bArr));
    }

    public final ajdx<byte[]> a(mhs.b bVar) {
        akcr.b(bVar, "id");
        DbClient a = a();
        Object a2 = LensPersistentStorageRecord.FACTORY.a(bVar.a);
        akcr.a(a2, "LensPersistentStorageRec….selectByLensId(id.value)");
        a2 = a.queryAndMapToOneOrDefault(a2, d.a, (byte[]) this.d.b()).b((ajdw) this.e.i());
        akcr.a(a2, "dbClient.queryAndMapToOn…fiedSchedulers.queries())");
        return a2;
    }

    /* Access modifiers changed, original: final */
    public final DbClient a() {
        return (DbClient) this.c.b();
    }

    public final ajcx b() {
        return a().runInTransaction("SnapDbLensPersistenceRepository:clear", new a(this));
    }
}
