package defpackage;

import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import defpackage.nfl.b;
import defpackage.nfl.d;
import java.util.Set;

/* renamed from: nfd */
public final class nfd {
    final DbClient a = this.e.getDbClient((ide) nbz.a);
    final ajxe b = ajxh.a(new b(this));
    private final ajxe c = ajxh.a(new e(this.a));
    private final ajxe d = ajxh.a(new c(this));
    private final SnapDb e;

    /* renamed from: nfd$c */
    static final class c extends akcs implements akbk<d> {
        private /* synthetic */ nfd a;

        c(nfd nfd) {
            this.a = nfd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new d(((pa) this.a.c.b()));
        }
    }

    /* renamed from: nfd$b */
    static final class b extends akcs implements akbk<defpackage.nfl.b> {
        private /* synthetic */ nfd a;

        b(nfd nfd) {
            this.a = nfd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new defpackage.nfl.b(((pa) this.a.c.b()));
        }
    }

    /* renamed from: nfd$e */
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

    /* renamed from: nfd$a */
    static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ nfd a;

        a(nfd nfd) {
            this.a = nfd;
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

    /* renamed from: nfd$d */
    static final class d extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ nfd a;
        private /* synthetic */ Set b;

        d(nfd nfd, Set set) {
            this.a = nfd;
            this.b = set;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            for (String str : this.b) {
                if (str != null) {
                    nfd nfd = this.a;
                    nfd.a().a(str);
                    nfd.a.executeInsert(nfd.a(), dbTransaction);
                }
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(nfd.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(nfd.class), "insertFriendStatement", "getInsertFriendStatement()Lcom/snap/location/db/record/BlacklistFriendModel$InsertFriend;"), new akdc(akde.a(nfd.class), "deleteFriendsStatement", "getDeleteFriendsStatement()Lcom/snap/location/db/record/BlacklistFriendModel$DeleteFriends;")};
    }

    public nfd(SnapDb snapDb) {
        akcr.b(snapDb, "snapDb");
        this.e = snapDb;
    }

    /* Access modifiers changed, original: final */
    public final d a() {
        return (d) this.d.b();
    }

    public final ajcx b() {
        return this.a.runInTransaction("BlacklistFriendEntryRepository#deleteFriendsStatement", new a(this));
    }
}
