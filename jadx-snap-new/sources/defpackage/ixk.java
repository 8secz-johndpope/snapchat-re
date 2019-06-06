package defpackage;

import android.database.Cursor;
import com.brightcove.player.event.Event;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.query.LegacyAddedMeFriendsQueries;
import com.snap.core.db.record.FriendWhoAddedMeModel.InsertRow;
import com.snap.core.db.record.FriendWhoAddedMeModel.Purge;
import com.snap.core.db.record.FriendWhoAddedMeModel.RemoveFriendWhoAddedMe;
import com.snap.core.db.record.FriendWhoAddedMeModel.SetAdded;
import com.snap.core.db.record.FriendWhoAddedMeModel.SetIgnored;
import defpackage.aelf.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ixk */
public final class ixk {
    public final DbClient a = this.b.getDbClient((ide) irc.t);
    public final SnapDb b;
    public final ftl c;
    private final ajxe d = ajxh.a(new a(this));
    private final ajxe e = ajxh.a(new c(this));
    private final ajxe f = ajxh.a(new b(this));
    private final ajxe g = ajxh.a(new d(this));
    private final ajxe h = ajxh.a(new e(this));
    private final tnj i;
    private final aipn<ixp> j;
    private final aipn<ixh> k;
    private final aipn<ixj> l;

    /* renamed from: ixk$j */
    public static final class j extends akcq implements akbl<Cursor, Long> {
        public j(ainw ainw) {
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
            return (Long) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: ixk$a */
    static final class a extends akcs implements akbk<InsertRow> {
        private /* synthetic */ ixk a;

        a(ixk ixk) {
            this.a = ixk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertRow(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ixk$c */
    static final class c extends akcs implements akbk<RemoveFriendWhoAddedMe> {
        private /* synthetic */ ixk a;

        c(ixk ixk) {
            this.a = ixk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new RemoveFriendWhoAddedMe(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ixk$b */
    static final class b extends akcs implements akbk<Purge> {
        private /* synthetic */ ixk a;

        b(ixk ixk) {
            this.a = ixk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Purge(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ixk$d */
    static final class d extends akcs implements akbk<SetAdded> {
        private /* synthetic */ ixk a;

        d(ixk ixk) {
            this.a = ixk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SetAdded(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ixk$e */
    static final class e extends akcs implements akbk<SetIgnored> {
        private /* synthetic */ ixk a;

        e(ixk ixk) {
            this.a = ixk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SetIgnored(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ixk$i */
    public static final class i<T1, T2, R> implements ajex<Long, List<? extends Long>, Integer> {
        private /* synthetic */ ixk a;

        public i(ixk ixk) {
            this.a = ixk;
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            akcr.b((List) obj2, "<anonymous parameter 1>");
            return Integer.valueOf(this.a.a(longValue));
        }
    }

    /* renamed from: ixk$h */
    static final class h extends akcq implements akbl<Cursor, Long> {
        h(ainw ainw) {
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
            return (Long) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: ixk$f */
    public static final class f<T1, T2, R> implements ajex<T1, T2, R> {
        private /* synthetic */ ixk a;

        public f(ixk ixk) {
            this.a = ixk;
        }

        public final R apply(T1 t1, T2 t2) {
            long longValue = ((Number) t1).longValue();
            DbClient dbClient = this.a.a;
            Object unreciprocatedAddedMeAndUnseenAddedMeBackCount = LegacyAddedMeFriendsQueries.FACTORY.getUnreciprocatedAddedMeAndUnseenAddedMeBackCount(Long.valueOf(longValue));
            akcr.a(unreciprocatedAddedMeAndUnseenAddedMeBackCount, "LegacyAddedMeFriendsQuer…dedMeBackCount(timestamp)");
            Object obj = LegacyAddedMeFriendsQueries.UNRECIPROCATED_ADDED_ME_UNSEEN_COUNT_MAPPER;
            akcr.a(obj, "LegacyAddedMeFriendsQuer…ED_ME_UNSEEN_COUNT_MAPPER");
            return dbClient.query(unreciprocatedAddedMeAndUnseenAddedMeBackCount, obj);
        }
    }

    /* renamed from: ixk$g */
    static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, Event.LIST);
            int i = 0;
            if (!list.isEmpty()) {
                i = (int) ((Number) list.get(0)).longValue();
            }
            return Integer.valueOf(i);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ixk.class), "insertFriendWhoAddedMe", "getInsertFriendWhoAddedMe()Lcom/snap/core/db/record/FriendWhoAddedMeModel$InsertRow;"), new akdc(akde.a(ixk.class), "removeFriendWhoAddedMe", "getRemoveFriendWhoAddedMe()Lcom/snap/core/db/record/FriendWhoAddedMeModel$RemoveFriendWhoAddedMe;"), new akdc(akde.a(ixk.class), "purgeFriendWhoAddedMe", "getPurgeFriendWhoAddedMe()Lcom/snap/core/db/record/FriendWhoAddedMeModel$Purge;"), new akdc(akde.a(ixk.class), "setAdded", "getSetAdded()Lcom/snap/core/db/record/FriendWhoAddedMeModel$SetAdded;"), new akdc(akde.a(ixk.class), "setIgnored", "getSetIgnored()Lcom/snap/core/db/record/FriendWhoAddedMeModel$SetIgnored;")};
    }

    public ixk(SnapDb snapDb, ftl ftl, tnj tnj, aipn<ixp> aipn, aipn<ixh> aipn2, aipn<ixj> aipn3) {
        akcr.b(snapDb, "snapDb");
        akcr.b(ftl, "configProvider");
        akcr.b(tnj, "preferences");
        akcr.b(aipn, "suggestedFriendRepositoryLazy");
        akcr.b(aipn2, "contactRepositoryLazy");
        akcr.b(aipn3, "friendRepository");
        this.b = snapDb;
        this.c = ftl;
        this.i = tnj;
        this.j = aipn;
        this.k = aipn2;
        this.l = aipn3;
    }

    private final void a(List<? extends aelf> list, boolean z, Map<String, Long> map, DbTransaction dbTransaction) {
        for (aelf aelf : list) {
            if (ixk.a(aelf)) {
                Long l = (Long) map.get(aelf.b);
                if (l != null) {
                    long longValue = l.longValue();
                    this.b.throwIfNotDbScheduler();
                    boolean z2 = aelf.a() == a.FRIEND;
                    d().bind(longValue, aelf.b, aelf.s, z2);
                    if (z2) {
                        ((ixp) this.j.get()).a(longValue, true, dbTransaction);
                        ((ixh) this.k.get()).a(longValue, dbTransaction);
                    }
                    this.a.executeInsert(d(), dbTransaction);
                }
            } else if (z) {
                a(aelf.b, dbTransaction);
            }
        }
    }

    private static boolean a(aelf aelf) {
        return (aelf.a() == a.BLOCKED || aelf.a() == a.DELETED || abpp.a(aelf.q)) ? false : true;
    }

    private final InsertRow d() {
        return (InsertRow) this.d.b();
    }

    private final RemoveFriendWhoAddedMe e() {
        return (RemoveFriendWhoAddedMe) this.e.b();
    }

    public final int a(long j) {
        DbClient dbClient = this.a;
        Object newAddedMeFriendCount = LegacyAddedMeFriendsQueries.FACTORY.getNewAddedMeFriendCount(Long.valueOf(j));
        akcr.a(newAddedMeFriendCount, "LegacyAddedMeFriendsQuer…dMeFriendCount(timestamp)");
        Object obj = LegacyAddedMeFriendsQueries.NEW_ADDED_ME_FRIENDS_COUNT_MAPPER;
        akcr.a(obj, "LegacyAddedMeFriendsQuer…D_ME_FRIENDS_COUNT_MAPPER");
        List query = dbClient.query(newAddedMeFriendCount, obj);
        return query.isEmpty() ? 0 : (int) ((Number) query.get(0)).longValue();
    }

    public final SetAdded a() {
        return (SetAdded) this.g.b();
    }

    public final void a(aemz aemz, DbTransaction dbTransaction) {
        akcr.b(aemz, "friendsResponse");
        akcr.b(dbTransaction, "tx");
        dbTransaction.checkInTransaction();
        Object obj = aemz.d;
        Map linkedHashMap = new LinkedHashMap();
        akcr.a(obj, "friends");
        for (aelf aelf : (Iterable) obj) {
            akcr.a((Object) aelf, "it");
            if (ixk.a(aelf)) {
                Object obj2 = aelf.b;
                akcr.a(obj2, "it.userId");
                Object a = ((ixj) this.l.get()).a(aelf, dbTransaction);
                akcr.a(a, "friendRepository.get().i…ateIncomingFriend(it, tx)");
                linkedHashMap.put(obj2, a);
            }
        }
        int i = aemz.b() != aemz.a.APARTIAL ? 1 : 0;
        if (i != 0) {
            this.b.throwIfNotDbScheduler();
            this.a.executeUpdateDelete((Purge) this.f.b(), dbTransaction);
        }
        a(obj, i ^ 1, linkedHashMap, dbTransaction);
        if (this.c.a((fth) jic.IS_INCOMING_FRIENDS_DELTA_SYNC_ENABLED)) {
            tnj.a b = this.i.b();
            b.a((fth) jic.ADDED_FRIENDS_SYNC_TOKEN, aemz.h);
            b.b();
        }
    }

    public final void a(String str, DbTransaction dbTransaction) {
        akcr.b(dbTransaction, "tx");
        this.b.throwIfNotDbScheduler();
        if (str != null) {
            e().bind(str);
            this.a.executeUpdateDelete(e(), dbTransaction);
        }
    }

    public final SetIgnored b() {
        return (SetIgnored) this.h.b();
    }

    public final ajdp<Integer> c() {
        Object t = this.c.t(jic.LAST_SEEN_ADDED_ME_TIMESTAMP);
        akcr.a(t, "configProvider.observeLo…_SEEN_ADDED_ME_TIMESTAMP)");
        DbClient dbClient = this.a;
        Object obj = LegacyAddedMeFriendsQueries.FACTORY;
        akcr.a(obj, "LegacyAddedMeFriendsQueries.FACTORY");
        obj = obj.getAddedMeChange();
        akcr.a(obj, "LegacyAddedMeFriendsQueries.FACTORY.addedMeChange");
        ajdp a = ajdp.a((ajdt) t, (ajdt) dbClient.queryAndMapToList(obj, new h(LegacyAddedMeFriendsQueries.ADDED_ME_CHANGED_MAPPER)), (ajex) new f(this));
        if (a == null) {
            akcr.a();
        }
        t = a.b(this.b.scheduler()).p(g.a).j(ajfu.a);
        akcr.a(t, "Observables.combineLates…  .distinctUntilChanged()");
        return igs.a(t);
    }
}
