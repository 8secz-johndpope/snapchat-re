package defpackage;

import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import defpackage.nfm.b;
import defpackage.nfm.d;
import java.util.Set;

/* renamed from: nfe */
public final class nfe {
    final DbClient a = this.e.getDbClient((ide) nbz.a);
    final ajxe b = ajxh.a(new b(this));
    private final ajxe c = ajxh.a(new e(this.a));
    private final ajxe d = ajxh.a(new d(this));
    private final SnapDb e;

    /* renamed from: nfe$e */
    static final class e extends akcq implements akbk<pa> {
        e(DbClient dbClient) {
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

    /* renamed from: nfe$d */
    static final class d extends akcs implements akbk<defpackage.nfm.d> {
        private /* synthetic */ nfe a;

        d(nfe nfe) {
            this.a = nfe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new defpackage.nfm.d(((pa) this.a.c.b()));
        }
    }

    /* renamed from: nfe$b */
    static final class b extends akcs implements akbk<defpackage.nfm.b> {
        private /* synthetic */ nfe a;

        b(nfe nfe) {
            this.a = nfe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new defpackage.nfm.b(((pa) this.a.c.b()));
        }
    }

    /* renamed from: nfe$a */
    static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ nfe a;

        a(nfe nfe) {
            this.a = nfe;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            Object obj2 = this.a.a;
            akcr.a(obj2, "dbClient");
            BriteDatabaseExtensionsKt.executeDelete(obj2, (b) this.a.b.b(), dbTransaction);
            return ajxw.a;
        }
    }

    /* renamed from: nfe$c */
    static final class c extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ nfe a;
        private /* synthetic */ Set b;

        c(nfe nfe, Set set) {
            this.a = nfe;
            this.b = set;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            for (String str : this.b) {
                if (str != null) {
                    nfe nfe = this.a;
                    nfe.a().a(str);
                    nfe.a.executeInsert(nfe.a(), dbTransaction);
                }
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(nfe.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(nfe.class), "insertFriendsStatement", "getInsertFriendsStatement()Lcom/snap/location/db/record/CustomFriendModel$InsertFriend;"), new akdc(akde.a(nfe.class), "deleteFriendsStatement", "getDeleteFriendsStatement()Lcom/snap/location/db/record/CustomFriendModel$DeleteFriends;")};
    }

    public nfe(SnapDb snapDb) {
        akcr.b(snapDb, "snapDb");
        this.e = snapDb;
    }

    /* Access modifiers changed, original: final */
    public final d a() {
        return (d) this.d.b();
    }

    public final ajcx b() {
        return this.a.runInTransaction("CustomFriendEntryRepository#deleteFriendsStatement", new a(this));
    }
}
