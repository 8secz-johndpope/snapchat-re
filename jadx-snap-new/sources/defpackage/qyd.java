package defpackage;

import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import java.util.List;

/* renamed from: qyd */
public final class qyd implements pre {
    final ajwy<qxl> a;
    final ajwy<rab> b;
    private final ajxe c = ajxh.a(ajxj.PUBLICATION, new a(this));
    private final ajxe d = ajxh.a(ajxj.PUBLICATION, new b(this));

    /* renamed from: qyd$a */
    static final class a extends akcs implements akbk<qxl> {
        private /* synthetic */ qyd a;

        a(qyd qyd) {
            this.a = qyd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (qxl) this.a.a.get();
        }
    }

    /* renamed from: qyd$b */
    static final class b extends akcs implements akbk<rab> {
        private /* synthetic */ qyd a;

        b(qyd qyd) {
            this.a = qyd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rab) this.a.b.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(qyd.class), "friendsFeedApi", "getFriendsFeedApi()Lcom/snap/messaging/friendsfeed/api/FriendsFeedApi;"), new akdc(akde.a(qyd.class), "friendsFeedItemRepository", "getFriendsFeedItemRepository()Lcom/snap/messaging/friendsfeed/processor/db/FriendsFeedItemRepository;")};
    }

    public qyd(ajwy<qxl> ajwy, ajwy<rab> ajwy2) {
        akcr.b(ajwy, "friendsFeedApiProvider");
        akcr.b(ajwy2, "friendsFeedItemRepositoryProvider");
        this.a = ajwy;
        this.b = ajwy2;
    }

    public final void a(SnapDb snapDb, DbTransaction dbTransaction, long... jArr) {
        akcr.b(snapDb, "db");
        akcr.b(dbTransaction, "tx");
        akcr.b(jArr, "feedIds");
        rab rab = (rab) this.d.b();
        akcr.b(jArr, "receiver$0");
        int length = jArr.length;
        List b = length != 0 ? length != 1 ? ajyi.b(jArr) : ajyl.a(Long.valueOf(jArr[0])) : ajyw.a;
        rab.a(b);
        ((qxl) this.c.b()).a(qxt.BATCH_UPDATE, dbTransaction);
    }
}
