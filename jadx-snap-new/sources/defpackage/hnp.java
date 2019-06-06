package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.StoryCorpusSignalsModel.InsertOrIgnoreSignal;
import com.snap.core.db.record.StoryCorpusSignalsRecord;
import com.snap.core.db.record.StoryInteractionSignalsModel;
import com.snap.core.db.record.StoryInteractionSignalsModel.DeleteSignalsBeforeTimeSeconds;
import com.snap.core.db.record.StoryInteractionSignalsModel.MaybeResetSignalsForNewVersion;
import com.snap.core.db.record.StoryInteractionSignalsRecord;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: hnp */
public final class hnp {
    final abss a;
    private final ajxe b;
    private final ajxe c = ajxh.a(new s(a()));
    private final ajxe d;
    private final ajei e;
    private final abqo f;

    /* renamed from: hnp$s */
    static final class s extends akcq implements akbk<pa> {
        s(DbClient dbClient) {
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

    /* renamed from: hnp$r */
    static final class r extends akcq implements akbk<ajdw> {
        r(SnapDb snapDb) {
            super(0, snapDb);
        }

        public final String getName() {
            return "scheduler";
        }

        public final akej getOwner() {
            return akde.a(SnapDb.class);
        }

        public final String getSignature() {
            return "scheduler()Lio/reactivex/Scheduler;";
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.receiver).scheduler();
        }
    }

    /* renamed from: hnp$b */
    static final class b extends akcs implements akbk<DbClient> {
        private /* synthetic */ SnapDb a;

        b(SnapDb snapDb) {
            this.a = snapDb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.getDbClient((ide) hbn.f);
        }
    }

    /* renamed from: hnp$i */
    static final class i<V> implements Callable<T> {
        private /* synthetic */ hnp a;
        private /* synthetic */ long b;

        i(hnp hnp, long j) {
            this.a = hnp;
            this.b = j;
        }

        public final /* synthetic */ Object call() {
            DbClient a = this.a.a();
            InsertOrIgnoreSignal insertOrIgnoreSignal = new InsertOrIgnoreSignal(this.a.b());
            insertOrIgnoreSignal.bind(this.b);
            return Long.valueOf(a.executeInsert(insertOrIgnoreSignal));
        }
    }

    /* renamed from: hnp$c */
    static final class c implements ajev {
        private /* synthetic */ hnp a;
        private /* synthetic */ long b;

        c(hnp hnp, long j) {
            this.a = hnp;
            this.b = j;
        }

        public final void run() {
            Object a = this.a.a();
            akcr.a(a, "dbClient");
            DeleteSignalsBeforeTimeSeconds deleteSignalsBeforeTimeSeconds = new DeleteSignalsBeforeTimeSeconds(this.a.b());
            deleteSignalsBeforeTimeSeconds.bind(this.b);
            BriteDatabaseExtensionsKt.executeDelete(a, deleteSignalsBeforeTimeSeconds);
        }
    }

    /* renamed from: hnp$d */
    static final class d implements ajev {
        private /* synthetic */ hnp a;
        private /* synthetic */ ainy b;

        d(hnp hnp, ainy ainy) {
            this.a = hnp;
            this.b = ainy;
        }

        public final void run() {
            Object a = this.a.a();
            akcr.a(a, "dbClient");
            BriteDatabaseExtensionsKt.executeUpdate(a, this.b);
        }
    }

    /* renamed from: hnp$e */
    static final class e implements ajev {
        public static final e a = new e();

        e() {
        }

        public final void run() {
        }
    }

    /* renamed from: hnp$j */
    static final class j<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hnp a;
        private /* synthetic */ long b;

        j(hnp hnp, long j) {
            this.a = hnp;
            this.b = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Long) obj, "it");
            hnp hnp = this.a;
            long j = this.b;
            DbClient a = hnp.a();
            Object selectRowIdByCorpus = StoryCorpusSignalsRecord.FACTORY.selectRowIdByCorpus(j);
            akcr.a(selectRowIdByCorpus, "StoryCorpusSignalsRecord…lectRowIdByCorpus(corpus)");
            obj = a.queryAndMapToOne(selectRowIdByCorpus, new k(StoryCorpusSignalsRecord.FACTORY.selectRowIdByCorpusMapper())).e().b(hnp.c());
            akcr.a(obj, "dbClient.queryAndMapToOn…  .subscribeOn(scheduler)");
            return obj;
        }
    }

    /* renamed from: hnp$o */
    static final class o<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hnp a;
        private /* synthetic */ String b;

        o(hnp hnp, String str) {
            this.a = hnp;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Long) obj, "it");
            hnp hnp = this.a;
            String str = this.b;
            DbClient a = hnp.a();
            Object selectRowIdByStoryId = StoryInteractionSignalsRecord.FACTORY.selectRowIdByStoryId(str);
            akcr.a(selectRowIdByStoryId, "StoryInteractionSignalsR…ctRowIdByStoryId(storyId)");
            obj = a.queryAndMapToOne(selectRowIdByStoryId, new g(StoryInteractionSignalsRecord.FACTORY.selectRowIdByStoryIdMapper())).e().b(hnp.c());
            akcr.a(obj, "dbClient.queryAndMapToOn…  .subscribeOn(scheduler)");
            return obj;
        }
    }

    /* renamed from: hnp$p */
    static final class p implements ajev {
        private /* synthetic */ hnp a;
        private /* synthetic */ long b;
        private /* synthetic */ String c;

        p(hnp hnp, long j, String str) {
            this.a = hnp;
            this.b = j;
            this.c = str;
        }

        public final void run() {
            Object a = this.a.a();
            akcr.a(a, "dbClient");
            MaybeResetSignalsForNewVersion maybeResetSignalsForNewVersion = new MaybeResetSignalsForNewVersion(this.a.b());
            long j = this.b;
            maybeResetSignalsForNewVersion.bind(j, this.c, j);
            BriteDatabaseExtensionsKt.executeUpdate(a, maybeResetSignalsForNewVersion);
        }
    }

    /* renamed from: hnp$n */
    static final class n extends akcs implements akbl<DbTransaction, Long> {
        private /* synthetic */ hnp a;
        private /* synthetic */ String b;
        private /* synthetic */ long c;
        private /* synthetic */ long d;
        private /* synthetic */ long e;
        private /* synthetic */ boolean f;

        n(hnp hnp, String str, long j, long j2, long j3, boolean z) {
            this.a = hnp;
            this.b = str;
            this.c = j;
            this.d = j2;
            this.e = j3;
            this.f = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            DbClient a = this.a.a();
            StoryInteractionSignalsModel.InsertOrIgnoreSignal insertOrIgnoreSignal = new StoryInteractionSignalsModel.InsertOrIgnoreSignal(this.a.b());
            insertOrIgnoreSignal.bind(this.b, this.c, this.d, this.e, this.f, abqo.a() / 1000);
            return Long.valueOf(a.executeInsert(insertOrIgnoreSignal, dbTransaction));
        }
    }

    /* renamed from: hnp$q */
    static final class q extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ hnp a;
        private /* synthetic */ List b;

        q(hnp hnp, List list) {
            this.a = hnp;
            this.b = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((DbTransaction) obj, "it");
            for (ajxm ajxm : this.b) {
                String str = (String) ajxm.a;
                long longValue = ((Number) ajxm.b).longValue();
                Object a = this.a.a();
                akcr.a(a, "dbClient");
                MaybeResetSignalsForNewVersion maybeResetSignalsForNewVersion = new MaybeResetSignalsForNewVersion(this.a.b());
                maybeResetSignalsForNewVersion.bind(longValue, str, longValue);
                BriteDatabaseExtensionsKt.executeUpdate(a, maybeResetSignalsForNewVersion);
            }
            return ajxw.a;
        }
    }

    /* renamed from: hnp$a */
    static final class a extends akcq implements akbl<Cursor, StoryCorpusSignalsRecord> {
        a(ainw ainw) {
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
            return (StoryCorpusSignalsRecord) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: hnp$f */
    static final class f extends akcq implements akbl<Throwable, ajxw> {
        f(hnp hnp) {
            super(1, hnp);
        }

        public final String getName() {
            return "handleError";
        }

        public final akej getOwner() {
            return akde.a(hnp.class);
        }

        public final String getSignature() {
            return "handleError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            if (!((hnp) this.receiver).a.l()) {
                return ajxw.a;
            }
            throw th;
        }
    }

    /* renamed from: hnp$g */
    static final class g extends akcq implements akbl<Cursor, Long> {
        g(ainw ainw) {
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

    /* renamed from: hnp$h */
    static final class h extends akcq implements akbl<Cursor, StoryCorpusSignalsRecord> {
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
            return (StoryCorpusSignalsRecord) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: hnp$k */
    static final class k extends akcq implements akbl<Cursor, Long> {
        k(ainw ainw) {
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

    /* renamed from: hnp$l */
    static final class l extends akcq implements akbl<Cursor, StoryInteractionSignalsRecord> {
        l(ainw ainw) {
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
            return (StoryInteractionSignalsRecord) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: hnp$m */
    static final class m extends akcq implements akbl<Cursor, StoryInteractionSignalsRecord> {
        m(ainw ainw) {
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
            return (StoryInteractionSignalsRecord) ((ainw) this.receiver).map(cursor);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hnp.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(hnp.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(hnp.class), "scheduler", "getScheduler()Lio/reactivex/Scheduler;")};
    }

    public hnp(SnapDb snapDb, abqo abqo, abss abss, gpu gpu) {
        akcr.b(snapDb, "snapDb");
        akcr.b(abqo, "clock");
        akcr.b(abss, "releaseManager");
        akcr.b(gpu, "userSession");
        this.f = abqo;
        this.a = abss;
        this.b = ajxh.a(new b(snapDb));
        this.d = ajxh.a(new r(snapDb));
        ajei ajei = new ajei();
        gpu.a.a((ajej) ajei);
        this.e = ajei;
    }

    public final ajcx a(String str, long j) {
        akcr.b(str, "storyId");
        Object b = ajcx.a((ajev) new p(this, j, str)).b(c());
        akcr.a(b, "Completable.fromAction {…  .subscribeOn(scheduler)");
        return b;
    }

    public final ajdx<Long> a(String str, long j, long j2, long j3, boolean z) {
        String str2 = str;
        akcr.b(str, "storyId");
        Object a = a().callInTransaction("DFSignals:insert", new n(this, str, j, j2, j3, z)).a((ajfc) new o(this, str));
        akcr.a(a, "dbClient.callInTransacti…RowIdByStoryId(storyId) }");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final DbClient a() {
        return (DbClient) this.b.b();
    }

    /* Access modifiers changed, original: final */
    public final void a(ainy ainy) {
        ajej a = ajcx.a((ajev) new d(this, ainy)).b(c()).a((ajev) e.a, (ajfb) new hnq(new f(this)));
        akcr.a((Object) a, "Completable.fromAction {…hing **/}, ::handleError)");
        ajvv.a(a, this.e);
    }

    /* Access modifiers changed, original: final */
    public final pa b() {
        return (pa) this.c.b();
    }

    /* Access modifiers changed, original: final */
    public final ajdw c() {
        return (ajdw) this.d.b();
    }
}
