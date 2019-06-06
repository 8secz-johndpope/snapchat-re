package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;

/* renamed from: qup */
public final class qup {
    final SnapDb a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: qup$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ qup a;

        a(qup qup) {
            this.a = qup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.getDbClient(pry.a.callsite("FriendsFeedSnapDbLogger"));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(qup.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;");
    }

    public qup(SnapDb snapDb) {
        akcr.b(snapDb, "snapDb");
        this.a = snapDb;
    }
}
