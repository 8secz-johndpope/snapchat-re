package defpackage;

import android.database.Cursor;
import com.snap.core.db.UpdatesManager;
import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.DdmlDataModel;
import com.snap.core.db.record.FeedMemberRecord.AllParticipants;
import com.snap.core.db.record.FeedMemberRecord.GroupInfo;
import com.snap.core.db.record.FeedModel;
import com.snap.core.db.record.FeedModel.DeleteAllFeedData;
import com.snap.core.db.record.FeedRecord.AvatarInfo;
import com.snap.core.db.record.FeedRecord.BasicFeedInfo;
import com.snap.core.db.record.FeedSyncStateRecord;
import com.snap.core.db.record.InteractionMessagesModel.DeleteAllInteractionsForFeedEntry;
import com.snap.core.db.record.LegacyMessageQueries;
import com.snap.core.db.record.LegacyMessagingSnapQueries;
import com.snap.core.db.record.LocalMessageActionRecord;
import com.snap.core.db.record.MessageModel.Factory;
import com.snap.core.db.record.MessageModel.GetSnapsOlderThanTimestampModel;
import com.snap.core.db.record.MessageRecord;
import com.snap.core.db.record.MessageRecord.GetContentForMessageModel;
import com.snap.core.db.record.MessageRecord.PlayableSnap;
import com.snap.core.db.record.MessageRecord.WithFriend;
import com.snap.core.db.record.MessagingSnapRecord;
import com.snap.core.db.record.MessagingSnapRecord.DirectSnapsOlderThanTimestamp;
import com.snap.core.db.record.MessagingSnapRecord.GroupSnapsOlderThanTimestamp;
import com.snap.core.db.record.MessagingSnapRecord.PlayableRecord;
import com.snap.core.db.record.NetworkMessageModel.DeleteAllMessages;
import com.snap.core.db.record.SeenSequenceNumbersModel.ClearAllSeenSequenceNumbers;
import com.snap.core.db.record.SequenceNumbersModel.DropAllSequenceNumbers;
import com.snap.messaging.MessagingHttpInterface;
import defpackage.qns.a;
import defpackage.qns.b;
import defpackage.qns.c;
import defpackage.qns.d;
import defpackage.qns.e;
import defpackage.qns.f;
import defpackage.reo.g;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: qnk */
public final class qnk implements prx {
    private final ajwy<qvw> A;
    private final ajdx<qxr> B;
    final idd a = pry.a.callsite("MessagingClient");
    final ajxe b;
    final ajwy<MessagingHttpInterface> c;
    final ajwy<qvd> d;
    final ajwy<ihh> e;
    final ajwy<quq> f;
    final ajwy<pwc> g;
    final gpb h;
    final ajwy<qdn> i;
    final ajwy<qus> j;
    final ajwy<ftl> k;
    final ajwy<qns> l;
    final ajwy<qvj> m;
    final ajwy<pvy> n;
    final ajwy<ryn> o;
    final ajwy<qum> p;
    final ajwy<qvo> q;
    private final ajxe r;
    private final ajxe s;
    private final zfw t;
    private final ajxe u;
    private final ajxe v;
    private final ajxe w;
    private final ajwy<UpdatesManager> x;
    private final ajwy<iha> y;
    private final ajwy<quw> z;

    /* renamed from: qnk$f */
    static final class f extends akcs implements akbk<DbClient> {
        private /* synthetic */ qnk a;

        f(qnk qnk) {
            this.a = qnk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.a.u.b()).getDbClient(this.a.a);
        }
    }

    /* renamed from: qnk$g */
    static final class g extends akcs implements akbk<Boolean> {
        private /* synthetic */ qnk a;

        g(qnk qnk) {
            this.a = qnk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((ftl) this.a.k.get()).a((fth) qpy.ENABLE_SNAP_DATA_REFACTOR));
        }
    }

    /* renamed from: qnk$s */
    static final class s extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ qnk a;

        s(qnk qnk) {
            this.a = qnk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            long a = ((ihh) this.a.e.get()).a();
            Object r;
            Collection arrayList;
            List o;
            Collection arrayList2;
            if (this.a.f()) {
                Object r2 = ((qvd) this.a.d.get()).r(a - 86400000);
                r = ((qvd) this.a.d.get()).r(a - 2678400000L);
                akcr.a(r, "expiredDirectSnaps");
                Collection collection = (Collection) r;
                akcr.a(r2, "expiredGroupSnaps");
                Iterable<GetSnapsOlderThanTimestampModel> d = ajyu.d(collection, (Iterable) r2);
                arrayList = new ArrayList();
                for (GetSnapsOlderThanTimestampModel feedRowId : d) {
                    Long feedRowId2 = feedRowId.feedRowId();
                    if (feedRowId2 != null) {
                        arrayList.add(feedRowId2);
                    }
                }
                o = ajyu.o((List) arrayList);
                arrayList2 = new ArrayList(ajyn.a((Iterable) d, 10));
                for (GetSnapsOlderThanTimestampModel feedRowId3 : d) {
                    arrayList2.add(feedRowId3.key());
                }
                List list = (List) arrayList2;
                if ((list.isEmpty() ^ 1) != 0) {
                    this.a.a(list, o, dbTransaction);
                }
            } else {
                Iterable<GroupSnapsOlderThanTimestamp> d2 = this.a.d().d(a - 86400000);
                Collection arrayList3 = new ArrayList(ajyn.a((Iterable) d2, 10));
                for (GroupSnapsOlderThanTimestamp snapId : d2) {
                    arrayList3.add(snapId.snapId());
                }
                List list2 = (List) arrayList3;
                a -= 2678400000L;
                Object obj2 = this.a.d().a;
                akcr.a(obj2, "dbClient");
                r = MessagingSnapRecord.FACTORY.getDirectSnapsOlderThanTimestamp(a);
                akcr.a(r, "MessagingSnapRecord.FACT…mestamp(expiredTimeStamp)");
                Object obj3 = LegacyMessagingSnapQueries.DIRECT_SNAPS_OLDER_THAN_TIMESTAMP_ROW_MAPPER;
                akcr.a(obj3, "LegacyMessagingSnapQueri…THAN_TIMESTAMP_ROW_MAPPER");
                arrayList3 = list2;
                Iterable<DirectSnapsOlderThanTimestamp> queryList = BriteDatabaseExtensionsKt.queryList(obj2, r, obj3);
                arrayList = new ArrayList(ajyn.a((Iterable) queryList, 10));
                for (DirectSnapsOlderThanTimestamp snapId2 : queryList) {
                    arrayList.add(snapId2.snapId());
                }
                o = ajyu.d(arrayList3, (Iterable) (List) arrayList);
                if ((o.isEmpty() ^ 1) != 0) {
                    Collection arrayList4 = new ArrayList(ajyn.a((Iterable) d2, 10));
                    for (GroupSnapsOlderThanTimestamp feedId : d2) {
                        arrayList4.add(Long.valueOf(feedId.feedId()));
                    }
                    arrayList4 = (List) arrayList4;
                    arrayList2 = new ArrayList(ajyn.a((Iterable) queryList, 10));
                    for (DirectSnapsOlderThanTimestamp snapId22 : queryList) {
                        arrayList2.add(Long.valueOf(snapId22.feedId()));
                    }
                    this.a.a(o, ajyu.k(ajyu.m(ajyu.d(arrayList4, (Iterable) (List) arrayList2))), dbTransaction);
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: qnk$af */
    static final class af extends akcq implements akbk<reo> {
        af(ajwy ajwy) {
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
            return (reo) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qnk$j */
    static final class j extends akcq implements akbk<iqx> {
        j(ajwy ajwy) {
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
            return (iqx) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qnk$e */
    static final class e extends akcq implements akbk<quk> {
        e(ajwy ajwy) {
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
            return (quk) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qnk$ae */
    static final class ae extends akcq implements akbk<SnapDb> {
        ae(ajwy ajwy) {
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
            return (SnapDb) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qnk$ab */
    static final class ab<V> implements Callable<T> {
        private /* synthetic */ qnk a;

        ab(qnk qnk) {
            this.a = qnk;
        }

        public final /* synthetic */ Object call() {
            return ((SnapDb) this.a.u.b());
        }
    }

    /* renamed from: qnk$ag */
    static final class ag<V> implements Callable<T> {
        private /* synthetic */ qnk a;

        ag(qnk qnk) {
            this.a = qnk;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.f());
        }
    }

    /* renamed from: qnk$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ qnk a;
        private /* synthetic */ String b;

        c(qnk qnk, String str) {
            this.a = qnk;
            this.b = str;
        }

        public final /* synthetic */ Object call() {
            String b = this.a.h.b();
            akcr.a((Object) b, "myUsername");
            return Long.valueOf(this.a.d().c(pvg.a(b, ajyl.a(this.b))));
        }
    }

    /* renamed from: qnk$o */
    static final class o<V> implements Callable<T> {
        private /* synthetic */ qnk a;

        o(qnk qnk) {
            this.a = qnk;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.f());
        }
    }

    /* renamed from: qnk$x */
    static final class x<V> implements Callable<T> {
        private /* synthetic */ qnk a;

        x(qnk qnk) {
            this.a = qnk;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.f());
        }
    }

    /* renamed from: qnk$z */
    static final class z<V> implements Callable<T> {
        private /* synthetic */ qnk a;

        z(qnk qnk) {
            this.a = qnk;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.f());
        }
    }

    /* renamed from: qnk$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ qnk a;
        private /* synthetic */ boolean b;

        a(qnk qnk, boolean z) {
            this.a = qnk;
            this.b = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final BasicFeedInfo basicFeedInfo = (BasicFeedInfo) obj;
            akcr.b(basicFeedInfo, "it");
            aehf aehf = new aehf();
            aehf.a = basicFeedInfo.key();
            MessagingHttpInterface messagingHttpInterface = (MessagingHttpInterface) this.a.c.get();
            return (this.b ? messagingHttpInterface.clearGroupConversation(aehf) : messagingHttpInterface.clearConversation(aehf)).e().c((Callable) new Callable<String>() {
                public final /* synthetic */ Object call() {
                    return basicFeedInfo.key();
                }
            });
        }
    }

    /* renamed from: qnk$aa */
    static final class aa<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ qnk a;
        private /* synthetic */ long b;

        /* renamed from: qnk$aa$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "snaps");
                Iterable<PlayableSnap> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (PlayableSnap playableSnap : iterable) {
                    akcr.a((Object) playableSnap, "it");
                    arrayList.add(qnl.a(playableSnap));
                }
                return (List) arrayList;
            }
        }

        /* renamed from: qnk$aa$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                Iterable<PlayableRecord> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (PlayableRecord playableRecord : iterable) {
                    akcr.a((Object) playableRecord, "snap");
                    arrayList.add(qnl.a(playableRecord));
                }
                return (List) arrayList;
            }
        }

        aa(qnk qnk, long j) {
            this.a = qnk;
            this.b = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajdp q;
            1 1;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            if (bool.booleanValue()) {
                q = ((qvd) this.a.d.get()).q(this.b);
                1 = 1.a;
            } else {
                q = ((qvd) this.a.d.get()).a(Long.valueOf(this.b));
                1 = 2.a;
            }
            return q.p(1);
        }
    }

    /* renamed from: qnk$ac */
    static final class ac<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ ainx a;

        ac(ainx ainx) {
            this.a = ainx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            SnapDb snapDb = (SnapDb) obj;
            akcr.b(snapDb, "it");
            ainx ainx = this.a;
            Object obj2 = FeedSyncStateRecord.FACTORY;
            akcr.a(obj2, "FeedSyncStateRecord.FACTORY");
            return snapDb.firstElement(ainx, obj2.getValueMapper());
        }
    }

    /* renamed from: qnk$ad */
    static final class ad<T, R> implements ajfc<T, R> {
        public static final ad a = new ad();

        ad() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return Boolean.valueOf(bool.booleanValue() ^ 1);
        }
    }

    /* renamed from: qnk$ah */
    static final class ah<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ qnk a;
        private /* synthetic */ long b;
        private /* synthetic */ String c;
        private /* synthetic */ boolean d;
        private /* synthetic */ boolean e;

        /* renamed from: qnk$ah$1 */
        static final class 1<T> implements ajfl<Throwable> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                akcr.b((Throwable) obj, "it");
                return true;
            }
        }

        /* renamed from: qnk$ah$2 */
        static final class 2<T> implements ajfl<Throwable> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                akcr.b((Throwable) obj, "it");
                return true;
            }
        }

        ah(qnk qnk, long j, String str, boolean z, boolean z2) {
            this.a = qnk;
            this.b = j;
            this.c = str;
            this.d = z;
            this.e = z2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            boolean z;
            if (bool.booleanValue()) {
                BasicFeedInfo f = ((qvd) this.a.d.get()).f(this.b);
                if (f != null) {
                    long j = this.b;
                    Object key = f.key();
                    akcr.a(key, "feedInfo.key()");
                    pqh pqh = new pqh(j, key, f.isGroup());
                    qns qns = (qns) this.a.l.get();
                    String str = this.c;
                    z = this.d;
                    boolean z2 = this.e;
                    akcr.b(str, "messageId");
                    akcr.b(pqh, "chatContext");
                    Object f2 = ((qvd) qns.c.get()).l(str).f(new a(qns, z2, z));
                    akcr.a(f2, "messagingRepository.get(…er()!!)\n                }");
                    Object a = f2.b((ajdw) qns.a.h()).b((ajfb) new b(str, pqh, z, z2)).f(new c(qns, pqh)).e((ajfc) new d(qns, str, pqh)).b((ajev) new e(str, pqh, z, z2)).a((ajfb) new f(str, pqh, z, z2));
                    akcr.a(a, "getUpdatedSnap(messageId…otted\")\n                }");
                    return a.a((ajfl) 1.a);
                }
                StringBuilder stringBuilder = new StringBuilder("No conversation exists for feedId: ");
                stringBuilder.append(this.b);
                throw new qwa(stringBuilder.toString());
            }
            reo reo = (reo) this.a.b.b();
            long a2 = ((ihh) this.a.e.get()).a();
            String str2 = this.c;
            long j2 = this.b;
            boolean z3 = this.d;
            z = this.e;
            akcr.b(str2, "snapId");
            boolean z4 = z3;
            Object a3 = reo.a().runInTransaction("UpdateSnapDurableJobDispatcher:updateSnapViewedStatus", new reo.f(reo, z, z3, str2, a2, j2)).a((ajfb) g.a);
            akcr.a(a3, "dbClient.runInTransactio…sage}\")\n                }");
            a3 = a3.c((Callable) new reo.b(reo)).b((ajdw) reo.b.i()).a((ajfc) new reo.c(j2)).e((ajfc) new reo.d(reo, str2, j2, z4, a2));
            akcr.a(a3, "updateSnapViewedStatus(f…layed))\n                }");
            return a3.a((ajfl) 2.a);
        }
    }

    /* renamed from: qnk$b */
    static final class b<T, R> implements ajfc<String, ajdb> {
        final /* synthetic */ qnk a;
        final /* synthetic */ long b;

        b(qnk qnk, long j) {
            this.a = qnk;
            this.b = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            akcr.b(str, "conversationId");
            return this.a.e().runInTransaction("MessagingClient:clearConversationByFeedId", new akbl<DbTransaction, ajxw>(this) {
                private /* synthetic */ b a;

                public final /* synthetic */ Object invoke(Object obj) {
                    DbTransaction dbTransaction = (DbTransaction) obj;
                    String str = "it";
                    akcr.b(dbTransaction, str);
                    qnk qnk = this.a.a;
                    long j = this.a.b;
                    akcr.b(dbTransaction, str);
                    ((qvd) qnk.d.get()).b(j, ((ihh) qnk.e.get()).a());
                    qus qus = (qus) qnk.j.get();
                    akcr.b(dbTransaction, "tx");
                    dbTransaction.checkInTransaction();
                    ((DeleteAllInteractionsForFeedEntry) qus.b.b()).bind(j);
                    qus.a.executeUpdateDelete((ainy) qus.b.b());
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: qnk$d */
    static final class d<T, R> implements ajfc<Long, ajdb> {
        private /* synthetic */ qnk a;

        d(qnk qnk) {
            this.a = qnk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "it");
            return this.a.a(l.longValue(), false);
        }
    }

    /* renamed from: qnk$i */
    static final class i<T> implements ajfb<qxr> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ void accept(Object obj) {
            ((qxr) obj).a();
        }
    }

    /* renamed from: qnk$k */
    static final class k<T, R> implements ajfc<T, R> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            GroupInfo groupInfo = (GroupInfo) obj;
            akcr.b(groupInfo, DdmlDataModel.RECORD);
            return groupInfo.key();
        }
    }

    /* renamed from: qnk$l */
    static final class l<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ qnk a;
        private /* synthetic */ List b;

        l(qnk qnk, List list) {
            this.a = qnk;
            this.b = list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "groupId");
            String f = this.a.d().f(str);
            pwc pwc = (pwc) this.a.g.get();
            if (f == null) {
                akcr.a();
            }
            return pwc.a(pwc, f, this.b, null, null, 24);
        }
    }

    /* renamed from: qnk$m */
    static final class m<T, R> implements ajfc<T, R> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            pqv pqv = (pqv) obj;
            akcr.b(pqv, "conversation");
            return pqv.a;
        }
    }

    /* renamed from: qnk$n */
    static final class n<T, R> implements ajfc<T, ajdn<? extends R>> {
        public static final n a = new n();

        n() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "groups");
            return list.isEmpty() ? ajvo.a(ajlu.a) : ajdj.b(list.get(0));
        }
    }

    /* renamed from: qnk$p */
    static final class p<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ qnk a;
        private /* synthetic */ long b;

        /* renamed from: qnk$p$1 */
        static final class 1<T, R> implements ajfc<T, ajdn<? extends R>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                final List list = (List) obj;
                akcr.b(list, "it");
                return ajdj.b((Callable) new Callable<T>() {
                    public final /* synthetic */ Object call() {
                        Object obj = list;
                        akcr.a(obj, "it");
                        return (GetContentForMessageModel) ajyu.g((List) obj);
                    }
                });
            }
        }

        p(qnk qnk, long j) {
            this.a = qnk;
            this.b = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            if (!bool.booleanValue()) {
                return ajvo.a(ajlu.a);
            }
            return ((qvd) this.a.d.get()).b(new long[]{this.b}).e().b((ajfc) 1.a);
        }
    }

    /* renamed from: qnk$q */
    static final class q<T> implements ajfb<ajej> {
        private /* synthetic */ long a;

        q(long j) {
            this.a = j;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qnk$r */
    static final class r<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ qnk a;
        private /* synthetic */ long b;

        /* renamed from: qnk$r$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                pqv pqv = (pqv) obj;
                akcr.b(pqv, "it");
                return Boolean.valueOf(pqv.d);
            }
        }

        /* renamed from: qnk$r$2 */
        static final class 2<T> implements ajfb<Boolean> {
            private /* synthetic */ r a;

            2(r rVar) {
                this.a = rVar;
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: qnk$r$3 */
        static final class 3<T> implements ajfb<Throwable> {
            private /* synthetic */ r a;

            3(r rVar) {
                this.a = rVar;
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        r(qnk qnk, long j) {
            this.a = qnk;
            this.b = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            BasicFeedInfo basicFeedInfo = (BasicFeedInfo) obj;
            akcr.b(basicFeedInfo, "feedInfo");
            if (basicFeedInfo.isTemporaryGroup()) {
                return ajdx.b(Boolean.FALSE);
            }
            pvy pvy = (pvy) this.a.n.get();
            Object key = basicFeedInfo.key();
            akcr.a(key, "feedInfo.key()");
            return pvy.a(key, basicFeedInfo.isGroup(), aeib.LOADING_HISTORY).f(1.a).a((ajfb) new 2(this)).d((ajfb) new 3(this));
        }
    }

    /* renamed from: qnk$v */
    static final class v<T1, T2> implements ajey<Integer, Throwable> {
        public static final v a = new v();

        v() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Throwable th = (Throwable) obj2;
            akcr.b(num, "times");
            akcr.b(th, "t");
            return akcr.a(num.intValue(), 1) <= 0 && (th instanceof IllegalStateException);
        }
    }

    /* renamed from: qnk$w */
    static final class w<T, R> implements ajfc<T, R> {
        private /* synthetic */ qnk a;
        private /* synthetic */ long b;
        private /* synthetic */ Set c;

        w(qnk qnk, long j, Set set) {
            this.a = qnk;
            this.b = j;
            this.c = set;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00ba  */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r11) {
            /*
            r10 = this;
            r11 = (java.util.List) r11;
            r0 = "it";
            defpackage.akcr.b(r11, r0);
            r0 = defpackage.ajyu.g(r11);
            r0 = (com.snap.core.db.record.MessageRecord.WithFriend) r0;
            if (r0 == 0) goto L_0x001a;
        L_0x000f:
            r1 = r0.isGroup();
            r0 = r0.messageRetentionInMinutes();
            defpackage.qdn.a.a(r1, r0);
        L_0x001a:
            r11 = (java.lang.Iterable) r11;
            r0 = new java.util.ArrayList;
            r0.<init>();
            r1 = new java.util.ArrayList;
            r1.<init>();
            r11 = r11.iterator();
        L_0x002a:
            r2 = r11.hasNext();
            if (r2 == 0) goto L_0x00c4;
        L_0x0030:
            r2 = r11.next();
            r3 = r2;
            r3 = (com.snap.core.db.record.MessageRecord.WithFriend) r3;
            r4 = r3.key();
            r5 = "message.key()";
            defpackage.akcr.a(r4, r5);
            r5 = "message";
            defpackage.akcr.a(r3, r5);
            r5 = r3.isGroup();
            if (r5 == 0) goto L_0x0060;
        L_0x004b:
            r5 = r10.a;
            r5 = r5.i;
            r5 = r5.get();
            r5 = (defpackage.qdn) r5;
            r3 = defpackage.qdk.a.a(r3);
            r6 = defpackage.psj.TWENTY_FOUR_HOUR_AFTER_SEND;
        L_0x005b:
            r3 = defpackage.qdn.a(r3, r6, r5.a.a(), null);
            goto L_0x00a5;
        L_0x0060:
            r5 = r3.messageRetentionInMinutes();
            if (r5 != 0) goto L_0x0067;
        L_0x0066:
            goto L_0x0082;
        L_0x0067:
            r5 = r5.longValue();
            r7 = 0;
            r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r9 != 0) goto L_0x0082;
        L_0x0071:
            r5 = r10.a;
            r5 = r5.i;
            r5 = r5.get();
            r5 = (defpackage.qdn) r5;
            r3 = defpackage.qdk.a.a(r3);
            r6 = defpackage.psj.RELEASE_AFTER_SEEN;
            goto L_0x005b;
        L_0x0082:
            r5 = r10.a;
            r5 = r5.i;
            r5.get();
            r5 = defpackage.qdk.a.a(r3);
            r6 = defpackage.psj.TWENTY_FOUR_HOUR_AFTER_SEEN;
            r7 = r10.a;
            r7 = r7.o;
            r7 = r7.get();
            r7 = (defpackage.ryn) r7;
            r7 = r7.a();
            r3 = r3.messageRetentionInMinutes();
            r3 = defpackage.qdn.a(r5, r6, r7, r3);
        L_0x00a5:
            r5 = r10.c;
            r5 = r5.contains(r4);
            if (r5 != 0) goto L_0x00b2;
        L_0x00ad:
            if (r3 != 0) goto L_0x00b0;
        L_0x00af:
            goto L_0x00b2;
        L_0x00b0:
            r3 = 0;
            goto L_0x00b8;
        L_0x00b2:
            r3 = r10.c;
            r3.add(r4);
            r3 = 1;
        L_0x00b8:
            if (r3 == 0) goto L_0x00bf;
        L_0x00ba:
            r0.add(r2);
            goto L_0x002a;
        L_0x00bf:
            r1.add(r2);
            goto L_0x002a;
        L_0x00c4:
            r11 = new ajxm;
            r11.<init>(r0, r1);
            r0 = r11.a;
            r0 = (java.util.List) r0;
            r11 = r11.b;
            r11 = (java.util.List) r11;
            r1 = new pqx;
            r1.<init>(r0, r11);
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qnk$w.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: qnk$y */
    static final class y<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ qnk a;
        private /* synthetic */ long b;

        /* renamed from: qnk$y$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "snaps");
                Iterable<PlayableSnap> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (PlayableSnap playableSnap : iterable) {
                    akcr.a((Object) playableSnap, "it");
                    arrayList.add(qnl.a(playableSnap));
                }
                return (List) arrayList;
            }
        }

        /* renamed from: qnk$y$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                Iterable<PlayableRecord> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (PlayableRecord playableRecord : iterable) {
                    akcr.a((Object) playableRecord, "snap");
                    arrayList.add(qnl.a(playableRecord));
                }
                return (List) arrayList;
            }
        }

        y(qnk qnk, long j) {
            this.a = qnk;
            this.b = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajdx e;
            1 1;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            if (bool.booleanValue()) {
                e = ((qvd) this.a.d.get()).q(this.b).e();
                1 = 1.a;
            } else {
                e = ((qvd) this.a.d.get()).a(Long.valueOf(this.b)).e();
                1 = 2.a;
            }
            return e.f(1);
        }
    }

    /* renamed from: qnk$h */
    static final class h extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ qnk a;

        h(qnk qnk) {
            this.a = qnk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            String str = "tx";
            akcr.b(dbTransaction, str);
            qum qum = (qum) this.a.p.get();
            akcr.b(dbTransaction, str);
            qum.b.throwIfNotDbScheduler();
            qum.a.clear();
            Object obj2 = qum.b;
            String str2 = "dbClient";
            akcr.a(obj2, str2);
            BriteDatabaseExtensionsKt.executeDelete(obj2, (DeleteAllFeedData) qum.d.b(), dbTransaction);
            qvo qvo = (qvo) this.a.q.get();
            akcr.b(dbTransaction, str);
            qvo.a().throwIfNotDbScheduler();
            qvo.d.a();
            obj2 = qvo.a();
            akcr.a(obj2, str2);
            BriteDatabaseExtensionsKt.executeDelete(obj2, (DropAllSequenceNumbers) qvo.b.b(), dbTransaction);
            obj2 = qvo.a();
            akcr.a(obj2, str2);
            BriteDatabaseExtensionsKt.executeDelete(obj2, (ClearAllSeenSequenceNumbers) qvo.c.b(), dbTransaction);
            ((qvd) this.a.d.get()).a(dbTransaction);
            qvj qvj = (qvj) this.a.m.get();
            akcr.b(dbTransaction, str);
            qvj.a.throwIfNotDbScheduler();
            qvj.a().a();
            obj2 = qvj.a;
            str2 = "briteDatabase";
            akcr.a(obj2, str2);
            BriteDatabaseExtensionsKt.executeDelete(obj2, (DeleteAllMessages) qvj.b.b(), dbTransaction);
            qus qus = (qus) this.a.j.get();
            akcr.b(dbTransaction, str);
            dbTransaction.checkInTransaction();
            Object obj3 = qus.a;
            akcr.a(obj3, str2);
            BriteDatabaseExtensionsKt.executeDelete(obj3, (ainy) qus.d.b(), dbTransaction);
            ((quq) this.a.f.get()).b();
            ieg.a("Performed force sync", true, 0);
            return ajxw.a;
        }
    }

    /* renamed from: qnk$t */
    static final class t extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ qnk a;
        private /* synthetic */ long b;
        private /* synthetic */ long c;

        t(qnk qnk, long j, long j2) {
            this.a = qnk;
            this.b = j;
            this.c = j2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            ((qvd) this.a.d.get()).b(Long.valueOf(this.b));
            ((qus) this.a.j.get()).a(dbTransaction, qvv.SINGLE_UPDATE, this.c);
            return ajxw.a;
        }
    }

    /* renamed from: qnk$u */
    static final class u extends akcq implements akbl<Cursor, WithFriend> {
        u(ainw ainw) {
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
            return (WithFriend) ((ainw) this.receiver).map(cursor);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(qnk.class), "updateSnapDispatcher", "getUpdateSnapDispatcher()Lcom/snap/messaging/job/UpdateSnapDurableJobDispatcher;"), new akdc(akde.a(qnk.class), "friendRepositoryApi", "getFriendRepositoryApi()Lcom/snap/identity/api/FriendRepositoryApi;"), new akdc(akde.a(qnk.class), "conversationsRepository", "getConversationsRepository()Lcom/snap/messaging/db/ConversationsRepository;"), new akdc(akde.a(qnk.class), "snapDb", "getSnapDb()Lcom/snap/core/db/api/SnapDb;"), new akdc(akde.a(qnk.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(qnk.class), "enableSnapDataRefactor", "getEnableSnapDataRefactor()Z")};
    }

    public qnk(ajwy<SnapDb> ajwy, ajwy<UpdatesManager> ajwy2, ajwy<MessagingHttpInterface> ajwy3, ajwy<iqx> ajwy4, ajwy<qvd> ajwy5, ajwy<iha> ajwy6, ajwy<reo> ajwy7, ajwy<ihh> ajwy8, ajwy<quq> ajwy9, zgb zgb, ajwy<quw> ajwy10, ajwy<pwc> ajwy11, gpb gpb, ajwy<quk> ajwy12, ajwy<qdn> ajwy13, ajwy<qus> ajwy14, ajwy<ftl> ajwy15, ajwy<qns> ajwy16, ajwy<qvj> ajwy17, ajwy<qvw> ajwy18, ajwy<pvy> ajwy19, ajwy<ryn> ajwy20, ajwy<qum> ajwy21, ajwy<qvo> ajwy22, ajdx<qxr> ajdx) {
        ajwy<UpdatesManager> ajwy23 = ajwy2;
        ajwy<MessagingHttpInterface> ajwy24 = ajwy3;
        ajwy<iqx> ajwy25 = ajwy4;
        ajwy<qvd> ajwy26 = ajwy5;
        ajwy<iha> ajwy27 = ajwy6;
        ajwy<reo> ajwy28 = ajwy7;
        ajwy<ihh> ajwy29 = ajwy8;
        ajwy<quq> ajwy30 = ajwy9;
        ajwy<quw> ajwy31 = ajwy10;
        ajwy<pwc> ajwy32 = ajwy11;
        gpb gpb2 = gpb;
        ajwy<quk> ajwy33 = ajwy12;
        ajwy<qdn> ajwy34 = ajwy13;
        ajwy<qus> ajwy35 = ajwy14;
        ajwy<ftl> ajwy36 = ajwy15;
        akcr.b(ajwy, "snapDbProvider");
        akcr.b(ajwy23, "updatesManager");
        akcr.b(ajwy24, "messagingHttpInterface");
        akcr.b(ajwy25, "friendRepositoryApiProvider");
        akcr.b(ajwy26, "messagingRepository");
        akcr.b(ajwy27, "serializationHelper");
        akcr.b(ajwy28, "updateSnapDispatcherProvider");
        akcr.b(ajwy29, "clock");
        akcr.b(ajwy30, "groupConversationProcessor");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy31, "localMessageActionRepository");
        akcr.b(ajwy32, "conversationManager");
        akcr.b(gpb2, "userAuthStore");
        akcr.b(ajwy33, "conversationsRepositoryLazy");
        akcr.b(ajwy34, "messageExpirationResolver");
        akcr.b(ajwy35, "interactionMessagesRepository");
        akcr.b(ajwy15, "configProvider");
        ajwy<qns> ajwy37 = ajwy16;
        akcr.b(ajwy37, "snapStateUpdateClient");
        ajwy<qvj> ajwy38 = ajwy17;
        akcr.b(ajwy38, "networkMessageRepository");
        ajwy<qvw> ajwy39 = ajwy18;
        akcr.b(ajwy39, "messageTableMerger");
        akcr.b(ajwy19, "conversationFetcher");
        akcr.b(ajwy20, "serverTimeProvider");
        akcr.b(ajwy21, "feedRepository");
        akcr.b(ajwy22, "sequenceNumberRepository");
        akcr.b(ajdx, "friendsFeedSnapLoadingStateCacheApi");
        ajwy<ftl> ajwy40 = ajwy15;
        this.x = ajwy23;
        this.c = ajwy24;
        this.d = ajwy26;
        this.y = ajwy27;
        this.e = ajwy29;
        this.f = ajwy30;
        this.z = ajwy31;
        this.g = ajwy32;
        this.h = gpb2;
        this.i = ajwy34;
        this.j = ajwy35;
        this.k = ajwy40;
        this.l = ajwy37;
        this.m = ajwy38;
        this.A = ajwy39;
        ajwy<ryn> ajwy41 = ajwy20;
        this.n = ajwy19;
        this.o = ajwy41;
        ajwy<qvo> ajwy42 = ajwy22;
        this.p = ajwy21;
        this.q = ajwy42;
        this.B = ajdx;
        this.b = ajxh.a(new af(ajwy7));
        this.r = ajxh.a(new j(ajwy4));
        this.s = ajxh.a(new e(ajwy12));
        this.t = zgb.a(this.a);
        this.u = ajxh.a(new ae(ajwy));
        this.v = ajxh.a(new f(this));
        this.w = ajxh.a(new g(this));
    }

    public final ajcx a(long j, long j2) {
        return e().runInTransaction("MessagingClient:markSnapAsViewed", new t(this, j, j2));
    }

    public final ajcx a(long j, boolean z) {
        Object a;
        String str;
        if (j < 0) {
            a = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        } else {
            a = ((qvd) this.d.get()).a(j).a((ajfc) new a(this, z)).e((ajfc) new b(this, j));
            str = "messagingRepository.get(…      }\n                }";
        }
        akcr.a(a, str);
        return a;
    }

    public final ajcx a(String str, long j, boolean z, boolean z2) {
        akcr.b(str, "snapId");
        Object e = ajdx.c((Callable) new ag(this)).e((ajfc) new ah(this, j, str, z, z2));
        akcr.a(e, "Single.fromCallable { en…      }\n                }");
        return e;
    }

    public final ajdp<pqx> a(long j, long j2, Set<String> set) {
        akcr.b(set, "forceIncluded");
        Factory factory = MessageRecord.FACTORY;
        Long valueOf = Long.valueOf(j);
        long j3 = 0;
        if (j2 >= 0) {
            j3 = 1;
        }
        Object messagesForFeed = factory.getMessagesForFeed(valueOf, Long.valueOf(j3), Long.valueOf(j2), this.h.b());
        akcr.a(messagesForFeed, "MessageRecord.FACTORY.ge…, userAuthStore.username)");
        ajdp queryAndMapToList = e().queryAndMapToList("ch:latest", messagesForFeed, new u(LegacyMessageQueries.SELECT_FEED_MESSAGES_MAPPER));
        Object obj = v.a;
        ajfv.a(obj, "predicate is null");
        Object p = ajvo.a(new ajqh(queryAndMapToList, obj)).p(new w(this, j, set));
        akcr.a(p, "dbClient.queryAndMapToLi…ssages)\n                }");
        return p;
    }

    public final ajdx<Boolean> a() {
        Object obj = FeedSyncStateRecord.FACTORY;
        akcr.a(obj, "FeedSyncStateRecord.FACTORY");
        obj = obj.getValue();
        akcr.a(obj, "FeedSyncStateRecord.FACTORY.value");
        obj = ajdx.c((Callable) new ab(this)).b((ajdw) this.t.h()).a((ajdw) this.t.i()).b((ajfc) new ac(obj)).e().f(ad.a);
        akcr.a(obj, "Single.fromCallable { sn…             .map { !it }");
        return obj;
    }

    public final ajdx<BasicFeedInfo> a(long j) {
        Object a = ((qvd) this.d.get()).a(j);
        akcr.a(a, "messagingRepository.get(…BasicFeedInfoById(feedId)");
        return a;
    }

    public final ajdx<String> a(List<Long> list, List<String> list2, ahbd ahbd) {
        String str = "friendIds";
        akcr.b(list, str);
        akcr.b(list2, "userIds");
        akcr.b(ahbd, FeedModel.SOURCEPAGE);
        akcr.b(list, str);
        Object b = ((qvd) this.d.get()).a((List) list).b((ajdw) this.t.h()).b((ajfc) n.a);
        akcr.a(b, "messagingRepository.get(…      }\n                }");
        Object a = b.f(k.a).a((ajeb) ((pwc) this.g.get()).a((List) list, ahbd).b((ajdw) this.t.m()).a((ajfc) new l(this, list2)).f(m.a));
        akcr.a(a, "getGroupConversationByFr…ion -> conversation.id })");
        return a;
    }

    public final List<String> a(String str) {
        String str2 = "conversationId";
        akcr.b(str, str2);
        quw quw = (quw) this.z.get();
        akcr.b(str, str2);
        Object localMessageIdsByConversationIdAndAction = LocalMessageActionRecord.FACTORY.getLocalMessageIdsByConversationIdAndAction(str, gci.MESSAGE_SEND);
        akcr.a(localMessageIdsByConversationIdAndAction, "LocalMessageActionRecord…eActionType.MESSAGE_SEND)");
        DbClient dbClient = quw.a;
        Object obj = LocalMessageActionRecord.FACTORY;
        akcr.a(obj, "LocalMessageActionRecord.FACTORY");
        obj = obj.getLocalMessageIdsByConversationIdAndActionMapper();
        akcr.a(obj, "LocalMessageActionRecord…ersationIdAndActionMapper");
        return dbClient.query(localMessageIdsByConversationIdAndAction, obj);
    }

    public final void a(List<String> list, List<Long> list2, DbTransaction dbTransaction) {
        String str = "snapIds";
        akcr.b(list, str);
        akcr.b(list2, "feedIds");
        akcr.b(dbTransaction, "tx");
        for (List<String> list3 : ajyu.t(list)) {
            if (f()) {
                for (String str2 : list3) {
                    ((qvj) this.m.get()).a(str2, SnapServerStatus.VIEWED);
                    ((qvw) this.A.get()).a(str2, dbTransaction);
                }
            } else {
                quk d = d();
                Collection collection = list3;
                if (collection != null) {
                    Object[] toArray = collection.toArray(new String[0]);
                    if (toArray != null) {
                        String[] strArr = (String[]) toArray;
                        strArr = (String[]) Arrays.copyOf(strArr, strArr.length);
                        akcr.b(strArr, str);
                        d.a.throwIfNotDbScheduler();
                        ainx updateSnapServerStatusBySnapIds = MessagingSnapRecord.FACTORY.updateSnapServerStatusBySnapIds(SnapServerStatus.VIEWED, strArr);
                        akcr.a((Object) updateSnapServerStatusBySnapIds, "MessagingSnapRecord.FACT…erStatus.VIEWED, snapIds)");
                        Closeable query = d.a.query(updateSnapServerStatusBySnapIds);
                        try {
                            ((Cursor) query).getCount();
                            akax.a(query, null);
                        } catch (Throwable th) {
                            akax.a(query, th);
                        }
                    } else {
                        throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                throw new ajxt("null cannot be cast to non-null type java.util.Collection<T>");
            }
        }
        for (List list4 : ajyu.t(list2)) {
            qus qus = (qus) this.j.get();
            qvv qvv = qvv.SINGLE_UPDATE;
            long[] g = ajyu.g((Collection) list4);
            qus.a(dbTransaction, qvv, Arrays.copyOf(g, g.length));
        }
    }

    public final ajcx b() {
        return e().runInTransaction("MessagingClient:markExpiredSnapMessagesAsViewed", new s(this));
    }

    public final ajdp<BasicFeedInfo> b(long j) {
        Object c = ((qvd) this.d.get()).c(j);
        akcr.a(c, "messagingRepository.get(…icFeedInfoUpdates(feedId)");
        return c;
    }

    public final ajdx<BasicFeedInfo> b(String str) {
        akcr.b(str, "username");
        Object a = ((qvd) this.d.get()).a(((qvd) this.d.get()).e(str));
        akcr.a(a, "messagingRepository.get(…BasicFeedInfoById(feedId)");
        return a;
    }

    public final ajcx c() {
        Object e = e().runInTransaction("MessagingClient:eraseLocalDataOnForceSync", new h(this)).b((ajeb) this.B).c((ajfb) i.a).e();
        akcr.a(e, "dbClient.runInTransactio…\n        .ignoreElement()");
        return e;
    }

    public final ajdp<String> c(long j) {
        Object d = ((qvd) this.d.get()).d(j);
        akcr.a(d, "messagingRepository.get(…astWriterAvatarId(feedId)");
        return d;
    }

    public final ajdx<BasicFeedInfo> c(String str) {
        akcr.b(str, "groupId");
        Object a = ((qvd) this.d.get()).a(((qvd) this.d.get()).d(str));
        akcr.a(a, "messagingRepository.get(…BasicFeedInfoById(feedId)");
        return a;
    }

    public final ajcx d(String str) {
        akcr.b(str, "username");
        Object e = ajdx.c((Callable) new c(this, str)).e((ajfc) new d(this));
        akcr.a(e, "Single.fromCallable {\n  …tionByFeedId(it, false) }");
        return e;
    }

    public final ajdp<List<AvatarInfo>> d(long j) {
        Object e = ((qvd) this.d.get()).e(j);
        akcr.a(e, "messagingRepository.get(…tAllFeedAvatarIds(feedId)");
        return e;
    }

    /* Access modifiers changed, original: final */
    public final quk d() {
        return (quk) this.s.b();
    }

    public final ajdp<List<AllParticipants>> e(long j) {
        Object h = ((qvd) this.d.get()).h(j);
        akcr.a(h, "messagingRepository.get(…FeedMemberDetails(feedId)");
        return h;
    }

    /* Access modifiers changed, original: final */
    public final DbClient e() {
        return (DbClient) this.v.b();
    }

    public final ajdx<List<psf>> f(long j) {
        Object a = ajdx.c((Callable) new x(this)).a((ajfc) new y(this, j));
        akcr.a(a, "Single.fromCallable { en…      }\n                }");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return ((Boolean) this.w.b()).booleanValue();
    }

    public final ajdp<List<psf>> g(long j) {
        Object d = ajdx.c((Callable) new z(this)).d((ajfc) new aa(this, j));
        akcr.a(d, "Single.fromCallable { en…      }\n                }");
        return d;
    }

    public final ajdx<Boolean> h(long j) {
        Object a = ((qvd) this.d.get()).a(j).b((ajfb) new q(j)).a((ajfc) new r(this, j));
        akcr.a(a, "messagingRepository.get(…      }\n                }");
        return a;
    }

    public final ajdj<GetContentForMessageModel> i(long j) {
        Object b = ajdx.c((Callable) new o(this)).b((ajfc) new p(this, j));
        akcr.a(b, "Single.fromCallable { en…      }\n                }");
        return b;
    }
}
