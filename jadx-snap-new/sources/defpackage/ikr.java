package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.query.FriendFiltersModel.Factory;
import com.snap.core.db.query.FriendFiltersModel.GetFriendInfoMapper;
import com.snap.core.db.record.FriendRecord;

/* renamed from: ikr */
public final class ikr {
    final ajxe a = ajxh.a(a.a);
    final DbClient b = ((DbClient) ajxh.a(new b(this)).b());
    final Factory<FriendRecord> c = new Factory(FriendRecord.FACTORY);
    final GetFriendInfoMapper<ikt, FriendRecord> d;
    final aipn<SnapDb> e;
    private final ajxe f;

    /* renamed from: ikr$a */
    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ijd.a.callsite("FriendFilterRepository");
        }
    }

    /* renamed from: ikr$c */
    static final class c extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        c(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(ijd.a.callsite("FriendFilterRepository"));
        }
    }

    /* renamed from: ikr$b */
    static final class b extends akcs implements akbk<DbClient> {
        private /* synthetic */ ikr a;

        b(ikr ikr) {
            this.a = ikr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.a.e.get()).getDbClient((idd) this.a.a.b());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ikr.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ikr.class), "attributedCallsite", "getAttributedCallsite()Lcom/snap/framework/attribution/AttributedCallsite;")};
    }

    public ikr(zgb zgb, aipn<SnapDb> aipn) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "snapDb");
        this.e = aipn;
        this.f = ajxh.a(new c(zgb));
        Object friendInfoMapper = this.c.getFriendInfoMapper(new iks());
        akcr.a(friendInfoMapper, "dbModel.getFriendInfoMapper(FriendInfoCreator())");
        this.d = friendInfoMapper;
    }
}
