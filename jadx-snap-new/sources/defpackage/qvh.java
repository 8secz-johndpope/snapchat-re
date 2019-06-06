package defpackage;

import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.NetworkGatewayInfoModel.InsertInfo;
import com.snap.core.db.record.NetworkGatewayInfoModel.UpdateInfo;
import com.snap.core.db.record.NetworkGatewayInfoRecord;

/* renamed from: qvh */
public final class qvh {
    private final ajxe a;
    private final DbClient b;
    private final ajxe c = ajxh.a(new a(this));
    private final ajxe d = ajxh.a(new c(this));

    /* renamed from: qvh$b */
    static final class b extends akcq implements akbk<iha> {
        b(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (iha) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qvh$a */
    static final class a extends akcs implements akbk<InsertInfo> {
        private /* synthetic */ qvh a;

        a(qvh qvh) {
            this.a = qvh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertInfo(this.a.b.getWritableDatabase());
        }
    }

    /* renamed from: qvh$c */
    static final class c extends akcs implements akbk<UpdateInfo> {
        private /* synthetic */ qvh a;

        c(qvh qvh) {
            this.a = qvh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateInfo(this.a.b.getWritableDatabase());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(qvh.class), "serializationHelper", "getSerializationHelper()Lcom/snap/framework/serialization/SerializationHelper;"), new akdc(akde.a(qvh.class), "insertInfo", "getInsertInfo()Lcom/snap/core/db/record/NetworkGatewayInfoModel$InsertInfo;"), new akdc(akde.a(qvh.class), "updateInfo", "getUpdateInfo()Lcom/snap/core/db/record/NetworkGatewayInfoModel$UpdateInfo;")};
    }

    public qvh(SnapDb snapDb, ajwy<iha> ajwy) {
        akcr.b(snapDb, "snapDb");
        akcr.b(ajwy, "serializationHelperLazy");
        this.a = ajxh.a(new b(ajwy));
        this.b = snapDb.getDbClient(pry.a.callsite("NetworkGateway"));
    }

    private final iha b() {
        return (iha) this.a.b();
    }

    private final InsertInfo c() {
        return (InsertInfo) this.c.b();
    }

    private final UpdateInfo d() {
        return (UpdateInfo) this.d.b();
    }

    public final aesz a() {
        DbClient dbClient = this.b;
        Object obj = NetworkGatewayInfoRecord.FACTORY;
        String str = "NetworkGatewayInfoRecord.FACTORY";
        akcr.a(obj, str);
        obj = obj.getInfo();
        akcr.a(obj, "NetworkGatewayInfoRecord.FACTORY.info");
        Object obj2 = NetworkGatewayInfoRecord.FACTORY;
        akcr.a(obj2, str);
        Object infoMapper = obj2.getInfoMapper();
        akcr.a(infoMapper, "NetworkGatewayInfoRecord.FACTORY.infoMapper");
        NetworkGatewayInfoRecord networkGatewayInfoRecord = (NetworkGatewayInfoRecord) dbClient.queryFirst(obj, (ainw) infoMapper);
        if (networkGatewayInfoRecord == null) {
            return null;
        }
        aesz aesz = new aesz();
        aesz.b = networkGatewayInfoRecord.server();
        aesz.a = (aexp) b().a(networkGatewayInfoRecord.authToken(), aexp.class);
        return aesz;
    }

    public final void a(aesz aesz, DbTransaction dbTransaction) {
        akcr.b(aesz, "info");
        akcr.b(dbTransaction, "tx");
        String b = b().b(aesz.a);
        UpdateInfo d = d();
        d.bind(b, aesz.b);
        Object obj = this.b;
        akcr.a(obj, "briteDatabase");
        if (BriteDatabaseExtensionsKt.executeUpdate(obj, d) <= 0) {
            InsertInfo c = c();
            c.bind(b, aesz.b);
            this.b.executeInsert(c, dbTransaction);
        }
    }
}
