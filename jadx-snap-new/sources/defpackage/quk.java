package defpackage;

import android.database.Cursor;
import com.google.common.base.Optional;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.FeedSeenSequenceNumbers;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.ScreenshottedOrReplayedState.Record;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.FeedMemberModel.InsertMemberOrIgnore;
import com.snap.core.db.record.FeedMemberRecord;
import com.snap.core.db.record.FeedMemberRecord.Participant;
import com.snap.core.db.record.FeedModel;
import com.snap.core.db.record.FeedModel.DeleteLocalTemporaryGroups;
import com.snap.core.db.record.FeedModel.InsertConversation;
import com.snap.core.db.record.FeedModel.InsertGroupIfNotExists;
import com.snap.core.db.record.FeedModel.SetGroupCreationRequestId;
import com.snap.core.db.record.FeedModel.UpdateAuthTokenForFeed;
import com.snap.core.db.record.FeedModel.UpdateGroupVersion;
import com.snap.core.db.record.FeedModel.UpdateHidden;
import com.snap.core.db.record.FeedModel.UpdateReceivedReleaseTimestampIfMoreRecent;
import com.snap.core.db.record.FeedModel.UpdateSentReleaseTimestampIfMoreRecent;
import com.snap.core.db.record.FeedRecord;
import com.snap.core.db.record.FriendRecord;
import com.snap.core.db.record.LegacyFeedMemberQueries;
import com.snap.core.db.record.LegacyMessageQueries;
import com.snap.core.db.record.LegacyMessagingSnapQueries;
import com.snap.core.db.record.MessageRecord;
import com.snap.core.db.record.MessageRecord.LastMessage;
import com.snap.core.db.record.MessagingSnapModel;
import com.snap.core.db.record.MessagingSnapModel.Factory;
import com.snap.core.db.record.MessagingSnapModel.UpdateSnapScreenshottedOrReplayByKey;
import com.snap.core.db.record.MessagingSnapModel.UpdateSnapServerStatusByKey;
import com.snap.core.db.record.MessagingSnapModel.UpdateViewerListBySnapRowId;
import com.snap.core.db.record.MessagingSnapRecord;
import com.snap.core.db.record.MessagingSnapRecord.GroupSnapsOlderThanTimestamp;
import com.snap.core.db.record.MessagingSnapRecord.SnapStateInfo;
import com.snap.core.db.record.SeenSequenceNumbersModel;
import com.snap.core.db.record.SeenSequenceNumbersModel.InsertSeenSequenceNumbers;
import com.snap.core.db.record.SeenSequenceNumbersRecord;
import com.snap.core.db.record.SnapRecord;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: quk */
public final class quk {
    public final DbClient a;
    public final ajxe b;
    public final ajxe c;
    public final gpb d;
    final ajwy<iha> e;
    private final idd f = pry.a.callsite("ConversationsRepository");
    private final ajxe g;
    private final ajxe h;
    private final ajxe<UpdateGroupVersion> i;
    private final ajxe<UpdateAuthTokenForFeed> j;
    private final ajxe<UpdateSnapServerStatusByKey> k;
    private final ajxe<UpdateSnapScreenshottedOrReplayByKey> l;
    private final ajxe<UpdateViewerListBySnapRowId> m;
    private final ajxe<InsertConversation> n;
    private final ajxe o;
    private final ajxe p;
    private final ajxe q;
    private final ajxe<InsertMemberOrIgnore> r;
    private final ajxe s;
    private final ajxe<InsertGroupIfNotExists> t;
    private final qum u;
    private final ihh v;

    /* renamed from: quk$u */
    static final class u extends akcq implements akbk<pa> {
        u(DbClient dbClient) {
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

    /* renamed from: quk$b */
    static final class b extends akcs implements akbk<iqx> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iqx) this.a.get();
        }
    }

    /* renamed from: quk$o */
    static final class o extends akcs implements akbk<UpdateGroupVersion> {
        private /* synthetic */ quk a;

        o(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateGroupVersion(((pa) this.a.g.b()));
        }
    }

    /* renamed from: quk$l */
    static final class l extends akcs implements akbk<UpdateAuthTokenForFeed> {
        private /* synthetic */ quk a;

        l(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateAuthTokenForFeed(((pa) this.a.g.b()));
        }
    }

    /* renamed from: quk$t */
    static final class t extends akcs implements akbk<UpdateSnapServerStatusByKey> {
        private /* synthetic */ quk a;

        t(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateSnapServerStatusByKey(((pa) this.a.g.b()), MessagingSnapRecord.FACTORY);
        }
    }

    /* renamed from: quk$s */
    static final class s extends akcs implements akbk<UpdateSnapScreenshottedOrReplayByKey> {
        private /* synthetic */ quk a;

        s(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateSnapScreenshottedOrReplayByKey(((pa) this.a.g.b()), MessagingSnapRecord.FACTORY);
        }
    }

    /* renamed from: quk$n */
    static final class n extends akcs implements akbk<UpdateViewerListBySnapRowId> {
        private /* synthetic */ quk a;

        n(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateViewerListBySnapRowId(((pa) this.a.g.b()));
        }
    }

    /* renamed from: quk$g */
    static final class g extends akcs implements akbk<InsertConversation> {
        private /* synthetic */ quk a;

        g(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertConversation(((pa) this.a.g.b()), FeedRecord.FACTORY);
        }
    }

    /* renamed from: quk$p */
    static final class p extends akcs implements akbk<UpdateReceivedReleaseTimestampIfMoreRecent> {
        private /* synthetic */ quk a;

        p(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateReceivedReleaseTimestampIfMoreRecent(((pa) this.a.g.b()));
        }
    }

    /* renamed from: quk$q */
    static final class q extends akcs implements akbk<UpdateSentReleaseTimestampIfMoreRecent> {
        private /* synthetic */ quk a;

        q(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateSentReleaseTimestampIfMoreRecent(((pa) this.a.g.b()));
        }
    }

    /* renamed from: quk$m */
    static final class m extends akcs implements akbk<UpdateHidden> {
        private /* synthetic */ quk a;

        m(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateHidden(((pa) this.a.g.b()));
        }
    }

    /* renamed from: quk$i */
    static final class i extends akcs implements akbk<InsertMemberOrIgnore> {
        private /* synthetic */ quk a;

        i(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertMemberOrIgnore(((pa) this.a.g.b()));
        }
    }

    /* renamed from: quk$k */
    static final class k extends akcs implements akbk<InsertSeenSequenceNumbers> {
        private /* synthetic */ quk a;

        k(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertSeenSequenceNumbers(((pa) this.a.g.b()), SeenSequenceNumbersRecord.FACTORY);
        }
    }

    /* renamed from: quk$h */
    static final class h extends akcs implements akbk<InsertGroupIfNotExists> {
        private /* synthetic */ quk a;

        h(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertGroupIfNotExists(((pa) this.a.g.b()), FeedRecord.FACTORY);
        }
    }

    /* renamed from: quk$a */
    static final class a extends akcs implements akbk<DeleteLocalTemporaryGroups> {
        private /* synthetic */ quk a;

        a(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeleteLocalTemporaryGroups(((pa) this.a.g.b()));
        }
    }

    /* renamed from: quk$j */
    static final class j extends akcs implements akbk<SetGroupCreationRequestId> {
        private /* synthetic */ quk a;

        j(quk quk) {
            this.a = quk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SetGroupCreationRequestId(((pa) this.a.g.b()));
        }
    }

    /* renamed from: quk$r */
    static final class r extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ quk a;
        private /* synthetic */ Map b;

        r(quk quk, Map map) {
            this.a = quk;
            this.b = map;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            for (Entry entry : this.b.entrySet()) {
                InsertSeenSequenceNumbers a = this.a.a();
                a.bind(((Number) entry.getKey()).longValue(), (FeedSeenSequenceNumbers) entry.getValue());
                this.a.a.executeInsert(a, dbTransaction);
            }
            return ajxw.a;
        }
    }

    /* renamed from: quk$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ quk a;
        private /* synthetic */ long b;

        c(quk quk, long j) {
            this.a = quk;
            this.b = j;
        }

        private ajdp<Optional<aexp>> a(byte[] bArr) {
            akcr.b(bArr, "it");
            if (bArr.length <= 1) {
                return ajdp.b(Optional.absent());
            }
            Object of;
            try {
                of = Optional.of(((iha) this.a.e.get()).a(new String(bArr, akfp.a), aexp.class));
                akcr.a(of, "Optional.of(serializatio…gnedPayload::class.java))");
            } catch (Exception unused) {
                of = Optional.absent();
                akcr.a(of, "Optional.absent()");
            }
            return ajdp.b(of);
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((byte[]) obj);
        }
    }

    /* renamed from: quk$d */
    static final class d<T, R> implements ajfc<Throwable, Optional<aexp>> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return Optional.absent();
        }
    }

    /* renamed from: quk$f */
    static final class f<T, R> implements ajfc<Throwable, byte[]> {
        private /* synthetic */ long a;

        f(long j) {
            this.a = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return new byte[0];
        }
    }

    /* renamed from: quk$e */
    static final class e extends akcq implements akbl<Cursor, byte[]> {
        e(ainw ainw) {
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
            return (byte[]) ((ainw) this.receiver).map(cursor);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(quk.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(quk.class), "friendRepository", "getFriendRepository()Lcom/snap/identity/api/FriendRepositoryApi;"), new akdc(akde.a(quk.class), "updateMyReceivedSnapReleaseTs", "getUpdateMyReceivedSnapReleaseTs()Lcom/snap/core/db/record/FeedModel$UpdateReceivedReleaseTimestampIfMoreRecent;"), new akdc(akde.a(quk.class), "updateMySentSnapReleaseTs", "getUpdateMySentSnapReleaseTs()Lcom/snap/core/db/record/FeedModel$UpdateSentReleaseTimestampIfMoreRecent;"), new akdc(akde.a(quk.class), "updateFeedHidden", "getUpdateFeedHidden()Lcom/snap/core/db/record/FeedModel$UpdateHidden;"), new akdc(akde.a(quk.class), "statementInsertSeenSequenceNumbers", "getStatementInsertSeenSequenceNumbers()Lcom/snap/core/db/record/SeenSequenceNumbersModel$InsertSeenSequenceNumbers;"), new akdc(akde.a(quk.class), "deleteLocalTemporaryGroups", "getDeleteLocalTemporaryGroups()Lcom/snap/core/db/record/FeedModel$DeleteLocalTemporaryGroups;"), new akdc(akde.a(quk.class), "setGroupCreationRequestId", "getSetGroupCreationRequestId()Lcom/snap/core/db/record/FeedModel$SetGroupCreationRequestId;")};
    }

    public quk(SnapDb snapDb, gpb gpb, ajwy<iha> ajwy, ajwy<iqx> ajwy2, qum qum, ihh ihh) {
        akcr.b(snapDb, "snapDb");
        akcr.b(gpb, "userAuth");
        akcr.b(ajwy, "serializationHelper");
        akcr.b(ajwy2, "friendRepositoryProvider");
        akcr.b(qum, "feedRepository");
        akcr.b(ihh, "clock");
        this.d = gpb;
        this.e = ajwy;
        this.u = qum;
        this.v = ihh;
        this.a = snapDb.getDbClient(this.f);
        this.g = ajxh.a(new u(this.a));
        this.h = ajxh.a(new b(ajwy2));
        this.i = ajxh.a(new o(this));
        this.j = ajxh.a(new l(this));
        this.k = ajxh.a(new t(this));
        this.l = ajxh.a(new s(this));
        this.m = ajxh.a(new n(this));
        this.n = ajxh.a(new g(this));
        this.o = ajxh.a(new p(this));
        this.p = ajxh.a(new q(this));
        this.q = ajxh.a(new m(this));
        this.r = ajxh.a(new i(this));
        this.s = ajxh.a(new k(this));
        this.t = ajxh.a(new h(this));
        this.b = ajxh.a(new a(this));
        this.c = ajxh.a(new j(this));
    }

    private long a(DbTransaction dbTransaction, String str, Set<Long> set, long j, boolean z, ahbd ahbd) {
        long executeInsert;
        DbTransaction dbTransaction2 = dbTransaction;
        String str2 = str;
        akcr.b(dbTransaction2, "tx");
        akcr.b(str2, "groupId");
        akcr.b(ahbd, FeedModel.SOURCEPAGE);
        this.a.throwIfNotDbScheduler();
        long b = b(str2);
        if (b == -1) {
            InsertGroupIfNotExists insertGroupIfNotExists = (InsertGroupIfNotExists) this.t.b();
            long j2 = 0;
            insertGroupIfNotExists.bind(str, null, Long.valueOf(j), null, Boolean.FALSE, false, gcg.DELTA, Boolean.FALSE, false, set != null ? (long) set.size() : 0, z, false, str, (long) ahbd.ordinal());
            executeInsert = this.a.executeInsert(insertGroupIfNotExists, dbTransaction2);
            if (set != null) {
                for (Number longValue : set) {
                    long longValue2 = longValue.longValue();
                    if (longValue2 != -1) {
                        InsertMemberOrIgnore insertMemberOrIgnore = (InsertMemberOrIgnore) this.r.b();
                        insertMemberOrIgnore.bind(executeInsert, longValue2, Integer.valueOf(-16777216), Long.valueOf(j), null, null);
                        this.a.executeInsert(insertMemberOrIgnore, dbTransaction2);
                    }
                }
            }
            if (!z) {
                j2 = 1;
            }
            b(executeInsert, j2);
        } else {
            executeInsert = b;
        }
        a(new long[]{executeInsert}, false);
        return executeInsert;
    }

    private long a(String str, String str2, Long l, boolean z) {
        long j;
        String str3 = str;
        boolean z2 = z;
        akcr.b(str3, "friendUsername");
        this.a.throwIfNotDbScheduler();
        long f = b().f(str3);
        String[] strArr = new String[2];
        String str4 = this.d.a().b;
        if (str4 == null) {
            akcr.a();
        }
        strArr[0] = str4;
        strArr[1] = str3;
        String a = ajyu.a((Iterable) ajyu.a((Iterable) ajym.b((Object[]) strArr), (Comparator) akab.a), (CharSequence) "~", null, null, 0, null, null, 62);
        long c = c(a);
        if (c == -1) {
            InsertConversation insertConversation = (InsertConversation) this.n.b();
            insertConversation.bind(a, l, str2, null, null, null, null, Long.valueOf(0), null, Long.valueOf(f), ppy.a, 0, Boolean.FALSE, false, str);
            long executeInsert = this.a.executeInsert(insertConversation);
            z2 = z;
            if (z2) {
                a(new long[]{executeInsert}, z2);
            }
            j = executeInsert;
        } else {
            j = c;
        }
        if (j != -1) {
            InsertMemberOrIgnore insertMemberOrIgnore = (InsertMemberOrIgnore) this.r.b();
            insertMemberOrIgnore.bind(j, f, Integer.valueOf(-16777216), Long.valueOf(this.v.a()), null, null);
            this.a.executeInsert(insertMemberOrIgnore);
        }
        return j;
    }

    public static /* synthetic */ long a(quk quk, DbTransaction dbTransaction, String str, Set set, long j, boolean z, ahbd ahbd, int i) {
        return quk.a(dbTransaction, str, set, j, (i & 16) != 0 ? false : z, (i & 64) != 0 ? ahbd.FRIENDS_FEED : ahbd);
    }

    private void a(long j, String str) {
        akcr.b(str, "viewerList");
        this.a.throwIfNotDbScheduler();
        UpdateViewerListBySnapRowId updateViewerListBySnapRowId = (UpdateViewerListBySnapRowId) this.m.b();
        updateViewerListBySnapRowId.bind(str, j);
        this.a.executeUpdateDelete(updateViewerListBySnapRowId);
    }

    private final void a(boolean z, String str, long j, SnapServerStatus snapServerStatus, SnapServerStatus snapServerStatus2, ScreenshottedOrReplayedState screenshottedOrReplayedState, Record record, boolean z2, String str2) {
        String str3 = str;
        SnapServerStatus snapServerStatus3 = snapServerStatus2;
        String str4 = str2;
        int i = 0;
        int replayed = ((record.getReplayed() | (record.getScreenshotCount() > 0 ? 1 : 0)) | (record.getScreenRecordCount() > 0 ? 1 : 0)) & (ajyu.p(screenshottedOrReplayedState.getSortedInteractions()).contains(record) ^ 1);
        Boolean valueOf = Boolean.valueOf(replayed);
        Boolean bool = null;
        if (!valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            ScreenshottedOrReplayedState signal = screenshottedOrReplayedState.signal(record);
            akcr.b(str3, "key");
            akcr.b(signal, "newState");
            this.a.throwIfNotDbScheduler();
            UpdateSnapScreenshottedOrReplayByKey updateSnapScreenshottedOrReplayByKey = (UpdateSnapScreenshottedOrReplayByKey) this.l.b();
            updateSnapScreenshottedOrReplayByKey.bind(signal, Boolean.valueOf(z), str3, str3);
            this.a.executeUpdateDelete(updateSnapScreenshottedOrReplayByKey);
        }
        if (str4 != null) {
            DbClient dbClient = this.a;
            Object selectIdForKey = FriendRecord.FACTORY.selectIdForKey(str4);
            akcr.a(selectIdForKey, "FriendRecord.FACTORY.selectIdForKey(username)");
            Object selectIdForKeyMapper = FriendRecord.FACTORY.selectIdForKeyMapper();
            akcr.a(selectIdForKeyMapper, "FriendRecord.FACTORY.selectIdForKeyMapper()");
            selectIdForKey = (Long) dbClient.queryFirst(selectIdForKey, selectIdForKeyMapper, Long.valueOf(-1));
            dbClient = this.a;
            selectIdForKeyMapper = SnapRecord.FACTORY.getSnapRowIdBySnapId(str3);
            akcr.a(selectIdForKeyMapper, "SnapRecord.FACTORY.getSnapRowIdBySnapId(snapId)");
            Object obj = SnapRecord.FACTORY;
            akcr.a(obj, "SnapRecord.FACTORY");
            obj = obj.getSnapRowIdBySnapIdMapper();
            akcr.a(obj, "SnapRecord.FACTORY.snapRowIdBySnapIdMapper");
            Object obj2 = (Long) dbClient.queryFirst(selectIdForKeyMapper, obj, Long.valueOf(-1));
            DbClient dbClient2 = this.a;
            Factory factory = MessagingSnapRecord.FACTORY;
            akcr.a(obj2, "snapRowId");
            obj = factory.getViewerListBySnapRowId(obj2.longValue());
            akcr.a(obj, "MessagingSnapRecord.FACT…istBySnapRowId(snapRowId)");
            Object obj3 = MessagingSnapRecord.FACTORY;
            akcr.a(obj3, "MessagingSnapRecord.FACTORY");
            obj3 = obj3.getViewerListBySnapRowIdMapper();
            akcr.a(obj3, "MessagingSnapRecord.FACT…ewerListBySnapRowIdMapper");
            String str5 = (String) dbClient2.queryFirst(obj, obj3, null);
            obj = (selectIdForKey != null && selectIdForKey.longValue() == -1) ? null : 1;
            Long l = obj != null ? selectIdForKey : null;
            if (l != null) {
                l.longValue();
                if (str5 != null) {
                    Collection arrayList = new ArrayList();
                    for (String str6 : akgc.a((CharSequence) str5, new String[]{ppy.b}, 0, 6)) {
                        if (str6 != null) {
                            Long f = akga.f(akgc.b(str6).toString());
                            if (f != null) {
                                arrayList.add(f);
                            }
                        } else {
                            throw new ajxt("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    Set p = ajyu.p((List) arrayList);
                    akcr.a(selectIdForKey, "userId");
                    p.add(selectIdForKey);
                    a(obj2.longValue(), ajyu.a((Iterable) p, (CharSequence) ppy.b, null, null, 0, null, null, 62));
                } else {
                    a(obj2.longValue(), String.valueOf(selectIdForKey.longValue()));
                }
            }
        }
        Boolean valueOf2 = Boolean.valueOf(z2);
        int booleanValue = valueOf2.booleanValue() ^ 1;
        if (snapServerStatus != snapServerStatus3) {
            i = 1;
        }
        if (((replayed | i) & booleanValue) != 0) {
            bool = valueOf2;
        }
        if (bool != null) {
            bool.booleanValue();
            a(z, str3, snapServerStatus3, Long.valueOf(j));
        }
    }

    private final iqx b() {
        return (iqx) this.h.b();
    }

    private final UpdateReceivedReleaseTimestampIfMoreRecent c() {
        return (UpdateReceivedReleaseTimestampIfMoreRecent) this.o.b();
    }

    private final UpdateSentReleaseTimestampIfMoreRecent d() {
        return (UpdateSentReleaseTimestampIfMoreRecent) this.p.b();
    }

    private final UpdateHidden e() {
        return (UpdateHidden) this.q.b();
    }

    public final long a(long j, long j2) {
        DbClient dbClient = this.a;
        Object lastMessageForFeed = MessageRecord.FACTORY.getLastMessageForFeed(Long.valueOf(j));
        akcr.a(lastMessageForFeed, "MessageRecord.FACTORY.ge…astMessageForFeed(feedId)");
        Object obj = LegacyMessageQueries.SELECT_LAST_MESSAGE_MAPPER;
        akcr.a(obj, "LegacyMessageQueries.SELECT_LAST_MESSAGE_MAPPER");
        LastMessage lastMessage = (LastMessage) dbClient.queryFirst(lastMessageForFeed, obj);
        if (lastMessage != null) {
            if ((lastMessage.timestamp() > j2 ? 1 : null) == null) {
                lastMessage = null;
            }
            if (lastMessage != null) {
                return lastMessage.timestamp() + 1;
            }
        }
        return j2;
    }

    public final long a(String str) {
        akcr.b(str, "friendUsername");
        return this.u.a(str);
    }

    public final long a(String str, long j) {
        akcr.b(str, "conversationId");
        long c = c(str);
        return c == -1 ? j : a(c, j);
    }

    /* Access modifiers changed, original: final */
    public final InsertSeenSequenceNumbers a() {
        return (InsertSeenSequenceNumbers) this.s.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0044 in {5, 7, 12, 14} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final java.util.List<com.snap.core.db.record.FeedMemberRecord.ForFeed> a(long r5) {
        /*
        r4 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.List) r0;
        r1 = com.snap.core.db.record.FeedMemberRecord.FACTORY;
        r5 = r1.selectMembersForFeed(r5);
        r6 = "FeedMemberRecord.FACTORY…ectMembersForFeed(feedId)";
        defpackage.akcr.a(r5, r6);
        r6 = r4.a;
        r5 = r6.query(r5);
        r5 = (java.io.Closeable) r5;
        r6 = 0;
        r1 = r5;	 Catch:{ Throwable -> 0x003e }
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x003e }
        r2 = r1.moveToFirst();	 Catch:{ Throwable -> 0x003e }
        if (r2 == 0) goto L_0x0038;	 Catch:{ Throwable -> 0x003e }
        r2 = com.snap.core.db.record.LegacyFeedMemberQueries.SELECT_FEED_MEMBERS_MAPPER;	 Catch:{ Throwable -> 0x003e }
        r2 = r2.map(r1);	 Catch:{ Throwable -> 0x003e }
        r3 = "LegacyFeedMemberQueries.…EMBERS_MAPPER.map(cursor)";	 Catch:{ Throwable -> 0x003e }
        defpackage.akcr.a(r2, r3);	 Catch:{ Throwable -> 0x003e }
        r0.add(r2);	 Catch:{ Throwable -> 0x003e }
        r2 = r1.moveToNext();	 Catch:{ Throwable -> 0x003e }
        if (r2 != 0) goto L_0x0024;
        defpackage.akax.a(r5, r6);
        return r0;
        r0 = move-exception;
        goto L_0x0040;
        r6 = move-exception;
        throw r6;	 Catch:{ all -> 0x003c }
        defpackage.akax.a(r5, r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quk.a(long):java.util.List");
    }

    public final List<String> a(long j, String str, String str2) {
        akcr.b(str, "currentUsername");
        akcr.b(str2, "currentSenderUsername");
        Object obj = this.a;
        akcr.a(obj, "dbClient");
        Object unreadSenders = MessageRecord.FACTORY.getUnreadSenders(Long.valueOf(j), str, str2, "system_user_id");
        akcr.a(unreadSenders, "MessageRecord.FACTORY.ge…epository.SYSTEM_USER_ID)");
        Object unreadSendersMapper = MessageRecord.FACTORY.getUnreadSendersMapper();
        akcr.a(unreadSendersMapper, "MessageRecord.FACTORY.getUnreadSendersMapper()");
        return BriteDatabaseExtensionsKt.queryList(obj, unreadSenders, unreadSendersMapper);
    }

    public final List<Long> a(String... strArr) {
        akcr.b(strArr, "conversationIds");
        return ajyu.k(this.u.a((String[]) Arrays.copyOf(strArr, strArr.length)).values());
    }

    public final void a(long j, aexp aexp) {
        akcr.b(aexp, "authToken");
        UpdateAuthTokenForFeed updateAuthTokenForFeed = (UpdateAuthTokenForFeed) this.j.b();
        updateAuthTokenForFeed.bind(((iha) this.e.get()).a((Object) aexp), j);
        this.a.executeUpdateDelete(updateAuthTokenForFeed);
    }

    public final void a(long j, FeedSeenSequenceNumbers feedSeenSequenceNumbers, DbTransaction dbTransaction) {
        akcr.b(feedSeenSequenceNumbers, SeenSequenceNumbersModel.SEQUENCENUMBERS);
        akcr.b(dbTransaction, "tx");
        this.a.throwIfNotDbScheduler();
        InsertSeenSequenceNumbers a = a();
        a.bind(j, feedSeenSequenceNumbers);
        this.a.executeInsert(a, dbTransaction);
    }

    public final void a(long j, String str, DbTransaction dbTransaction) {
        akcr.b(str, "username");
        akcr.b(dbTransaction, "tx");
        this.a.throwIfNotDbScheduler();
        Object seenSequenceNumbers = SeenSequenceNumbersRecord.FACTORY.getSeenSequenceNumbers(j);
        akcr.a(seenSequenceNumbers, "SeenSequenceNumbersRecor…enSequenceNumbers(feedId)");
        DbClient dbClient = this.a;
        Object obj = SeenSequenceNumbersRecord.FACTORY;
        akcr.a(obj, "SeenSequenceNumbersRecord.FACTORY");
        obj = obj.getSeenSequenceNumbersMapper();
        akcr.a(obj, "SeenSequenceNumbersRecor…seenSequenceNumbersMapper");
        FeedSeenSequenceNumbers feedSeenSequenceNumbers = (FeedSeenSequenceNumbers) dbClient.queryFirst(seenSequenceNumbers, obj);
        if (feedSeenSequenceNumbers != null) {
            long g = b().g(str);
            Object create = HashBasedTable.create();
            for (Object obj2 : feedSeenSequenceNumbers.getSequenceNumbers().cellSet()) {
                akcr.a(obj2, "entry");
                Long l = (Long) obj2.getColumnKey();
                if (l == null || l.longValue() != g) {
                    l = (Long) obj2.getRowKey();
                    if (l == null || l.longValue() != g) {
                        create.put(obj2.getRowKey(), obj2.getColumnKey(), obj2.getValue());
                    }
                }
            }
            akcr.a(create, "newTable");
            a(j, new FeedSeenSequenceNumbers((Table) create), dbTransaction);
        }
    }

    public final void a(aeie aeie, long j) {
        aeie aeie2 = aeie;
        akcr.b(aeie2, "snapStateMessage");
        String str = "timestamp";
        String str2 = "snapRecord.screenshotted…edOrReplayedState.empty()";
        String str3 = "Required value was null.";
        String str4 = "snapId";
        long j2 = 0;
        String str5;
        Object directSnapInfo;
        SnapStateInfo snapStateInfo;
        ScreenshottedOrReplayedState screenshottedOrReplayed;
        Long l;
        long longValue;
        if (aeie2 instanceof aeyr) {
            aeyr aeyr = (aeyr) aeie2;
            this.a.throwIfNotDbScheduler();
            str5 = aeyr.a;
            akcr.a((Object) str5, str4);
            this.a.throwIfNotDbScheduler();
            DbClient dbClient = this.a;
            directSnapInfo = MessagingSnapRecord.FACTORY.getDirectSnapInfo(str5);
            akcr.a(directSnapInfo, "MessagingSnapRecord.FACT…getDirectSnapInfo(snapId)");
            Object obj = LegacyMessagingSnapQueries.SNAP_STATE_INFO_MAPPER;
            akcr.a(obj, "LegacyMessagingSnapQueries.SNAP_STATE_INFO_MAPPER");
            snapStateInfo = (SnapStateInfo) dbClient.queryFirst(directSnapInfo, obj);
            if (snapStateInfo != null) {
                boolean a = akcr.a(this.d.a().b, snapStateInfo.username());
                obj = aeyr.n;
                SnapServerStatus serverStatus = snapStateInfo.serverStatus();
                if (serverStatus != null) {
                    SnapServerStatus a2 = adox.a(aeyr, a);
                    screenshottedOrReplayed = snapStateInfo.screenshottedOrReplayed();
                    if (screenshottedOrReplayed == null) {
                        screenshottedOrReplayed = ScreenshottedOrReplayedState.Companion.empty();
                    }
                    ScreenshottedOrReplayedState screenshottedOrReplayedState = screenshottedOrReplayed;
                    akcr.a((Object) screenshottedOrReplayedState, str2);
                    l = aeyr.d;
                    longValue = l != null ? l.longValue() : 0;
                    l = aeyr.w;
                    if (l != null) {
                        j2 = l.longValue();
                    }
                    long j3 = j2;
                    akcr.a(obj, str);
                    long longValue2 = obj.longValue();
                    Boolean bool = aeyr.c;
                    a(false, str5, obj.longValue(), serverStatus, a2, screenshottedOrReplayedState, new Record(j, longValue2, bool != null ? bool.booleanValue() : false, longValue - j3, j3), false, null);
                } else {
                    throw new IllegalStateException(str3.toString());
                }
            }
            return;
        }
        if (aeie2 instanceof aehb) {
            aehb aehb = (aehb) aeie2;
            this.a.throwIfNotDbScheduler();
            str5 = aehb.a;
            akcr.a((Object) str5, str4);
            snapStateInfo = e(str5);
            if (snapStateInfo != null) {
                directSnapInfo = this.d.a().b;
                boolean a3 = akcr.a(directSnapInfo, snapStateInfo.username());
                Object obj2 = aehb.n;
                SnapServerStatus serverStatus2 = snapStateInfo.serverStatus();
                if (serverStatus2 != null) {
                    SnapServerStatus a4 = adox.a(aehb, a3);
                    screenshottedOrReplayed = snapStateInfo.screenshottedOrReplayed();
                    if (screenshottedOrReplayed == null) {
                        screenshottedOrReplayed = ScreenshottedOrReplayedState.Companion.empty();
                    }
                    ScreenshottedOrReplayedState screenshottedOrReplayedState2 = screenshottedOrReplayed;
                    akcr.a((Object) screenshottedOrReplayedState2, str2);
                    l = aehb.c;
                    longValue = l != null ? l.longValue() : 0;
                    l = aehb.g;
                    if (l != null) {
                        j2 = l.longValue();
                    }
                    long j4 = j2;
                    akcr.a(obj2, str);
                    long longValue3 = obj2.longValue();
                    Boolean b = adox.b(aehb);
                    int a5 = akcr.a(aehb.i.a, directSnapInfo) ^ 1;
                    a(true, str5, obj2.longValue(), serverStatus2, a4, screenshottedOrReplayedState2, new Record(j, longValue3, b != null ? b.booleanValue() : false, longValue - j4, j4), ((a3 ^ 1) & (SnapServerStatus.hasBeenOpened(serverStatus2) ^ 1)) & a5, a5 != 0 ? aehb.i.a : null);
                } else {
                    throw new IllegalStateException(str3.toString());
                }
            }
        }
    }

    public final void a(boolean z, String str, SnapServerStatus snapServerStatus, Long l) {
        akcr.b(str, "key");
        akcr.b(snapServerStatus, MessagingSnapModel.SERVERSTATUS);
        this.a.throwIfNotDbScheduler();
        UpdateSnapServerStatusByKey updateSnapServerStatusByKey = (UpdateSnapServerStatusByKey) this.k.b();
        updateSnapServerStatusByKey.bind(snapServerStatus, l, Boolean.valueOf(z), str, str);
        this.a.executeUpdateDelete(updateSnapServerStatusByKey);
    }

    public final void a(long[] jArr, boolean z) {
        akcr.b(jArr, "feedIds");
        UpdateHidden e = e();
        for (long bind : jArr) {
            e.bind(Boolean.valueOf(z), bind);
            this.a.executeUpdateDelete(e);
        }
    }

    public final long b(String str) {
        akcr.b(str, "groupId");
        return this.u.b(str);
    }

    public final List<Participant> b(long j) {
        Object obj = this.a;
        akcr.a(obj, "dbClient");
        Object selectParticipantDetailsForFeed = FeedMemberRecord.FACTORY.selectParticipantDetailsForFeed(j);
        akcr.a(selectParticipantDetailsForFeed, "FeedMemberRecord.FACTORY…antDetailsForFeed(feedId)");
        Object obj2 = LegacyFeedMemberQueries.GET_PARTICIPANT_DETAIL_MAPPER;
        akcr.a(obj2, "LegacyFeedMemberQueries.…PARTICIPANT_DETAIL_MAPPER");
        return BriteDatabaseExtensionsKt.queryList(obj, selectParticipantDetailsForFeed, obj2);
    }

    public final void b(long j, long j2) {
        UpdateGroupVersion updateGroupVersion = (UpdateGroupVersion) this.i.b();
        updateGroupVersion.bind(j2, j);
        this.a.executeUpdateDelete(updateGroupVersion);
    }

    public final long c(String str) {
        akcr.b(str, "conversationId");
        return this.u.b(str);
    }

    public final FeedSeenSequenceNumbers c(long j) {
        Object seenSequenceNumbers = SeenSequenceNumbersRecord.FACTORY.getSeenSequenceNumbers(j);
        akcr.a(seenSequenceNumbers, "SeenSequenceNumbersRecor…enSequenceNumbers(feedId)");
        DbClient dbClient = this.a;
        Object obj = SeenSequenceNumbersRecord.FACTORY;
        akcr.a(obj, "SeenSequenceNumbersRecord.FACTORY");
        obj = obj.getSeenSequenceNumbersMapper();
        akcr.a(obj, "SeenSequenceNumbersRecor…seenSequenceNumbersMapper");
        return (FeedSeenSequenceNumbers) dbClient.queryFirst(seenSequenceNumbers, obj);
    }

    public final void c(long j, long j2) {
        UpdateReceivedReleaseTimestampIfMoreRecent c = c();
        c.bind(j2, j, j2);
        Object obj = this.a;
        akcr.a(obj, "dbClient");
        BriteDatabaseExtensionsKt.executeUpdate(obj, c);
    }

    public final Long d(String str) {
        akcr.b(str, "conversationId");
        DbClient dbClient = this.a;
        Object messageRetentionInMinutesById = FeedRecord.FACTORY.getMessageRetentionInMinutesById(this.u.b(str));
        akcr.a(messageRetentionInMinutesById, "FeedRecord.FACTORY.getMe…sationId(conversationId))");
        Object obj = FeedRecord.FACTORY;
        akcr.a(obj, "FeedRecord.FACTORY");
        obj = obj.getMessageRetentionInMinutesByIdMapper();
        akcr.a(obj, "FeedRecord.FACTORY.messa…entionInMinutesByIdMapper");
        return (Long) dbClient.queryFirst(messageRetentionInMinutesById, obj);
    }

    public final List<GroupSnapsOlderThanTimestamp> d(long j) {
        Object obj = this.a;
        akcr.a(obj, "dbClient");
        Object groupSnapsOlderThanTimestamp = MessagingSnapRecord.FACTORY.getGroupSnapsOlderThanTimestamp(j, SnapServerStatus.values());
        akcr.a(groupSnapsOlderThanTimestamp, "MessagingSnapRecord.FACT…napServerStatus.values())");
        Object obj2 = LegacyMessagingSnapQueries.GROUP_SNAPS_OLDER_THAN_TIMESTAMP_ROW_MAPPER;
        akcr.a(obj2, "LegacyMessagingSnapQueri…THAN_TIMESTAMP_ROW_MAPPER");
        return BriteDatabaseExtensionsKt.queryList(obj, groupSnapsOlderThanTimestamp, obj2);
    }

    public final void d(long j, long j2) {
        UpdateSentReleaseTimestampIfMoreRecent d = d();
        d.bind(j2, j, j2);
        Object obj = this.a;
        akcr.a(obj, "dbClient");
        BriteDatabaseExtensionsKt.executeUpdate(obj, d);
    }

    public final long e(long j) {
        DbClient dbClient = this.a;
        Object groupVersion = FeedRecord.FACTORY.getGroupVersion(j);
        akcr.a(groupVersion, "FeedRecord.FACTORY.getGroupVersion(feedId)");
        Object obj = FeedRecord.FACTORY;
        akcr.a(obj, "FeedRecord.FACTORY");
        obj = obj.getGroupVersionMapper();
        akcr.a(obj, "FeedRecord.FACTORY.groupVersionMapper");
        Long l = (Long) dbClient.queryFirst(groupVersion, obj);
        return l != null ? l.longValue() : -1;
    }

    public final SnapStateInfo e(String str) {
        akcr.b(str, "snapId");
        DbClient dbClient = this.a;
        Object groupSnapInfo = MessagingSnapRecord.FACTORY.getGroupSnapInfo(str);
        akcr.a(groupSnapInfo, "MessagingSnapRecord.FACT….getGroupSnapInfo(snapId)");
        Object obj = LegacyMessagingSnapQueries.SNAP_STATE_INFO_MAPPER;
        akcr.a(obj, "LegacyMessagingSnapQueries.SNAP_STATE_INFO_MAPPER");
        return (SnapStateInfo) dbClient.queryFirst(groupSnapInfo, obj);
    }

    public final aexp f(long j) {
        DbClient dbClient = this.a;
        Object authTokenForFeed = FeedRecord.FACTORY.getAuthTokenForFeed(j);
        akcr.a(authTokenForFeed, "FeedRecord.FACTORY.getAuthTokenForFeed(feedId)");
        Object obj = FeedRecord.FACTORY;
        akcr.a(obj, "FeedRecord.FACTORY");
        obj = obj.getAuthTokenForFeedMapper();
        akcr.a(obj, "FeedRecord.FACTORY.authTokenForFeedMapper");
        byte[] bArr = (byte[]) dbClient.queryFirst(authTokenForFeed, obj, null);
        if (bArr != null) {
            aexp aexp;
            try {
                aexp = (aexp) ((iha) this.e.get()).a(new String(bArr, akfp.a), aexp.class);
            } catch (Exception unused) {
                aexp = null;
            }
            if (aexp != null) {
                return aexp;
            }
        }
        return null;
    }

    public final String f(String str) {
        akcr.b(str, "groupId");
        DbClient dbClient = this.a;
        Object groupCreationRequestId = FeedRecord.FACTORY.getGroupCreationRequestId(str);
        akcr.a(groupCreationRequestId, "FeedRecord.FACTORY.getGr…reationRequestId(groupId)");
        Object obj = FeedRecord.FACTORY;
        akcr.a(obj, "FeedRecord.FACTORY");
        obj = obj.getGroupCreationRequestIdMapper();
        akcr.a(obj, "FeedRecord.FACTORY.groupCreationRequestIdMapper");
        return (String) dbClient.queryFirst(groupCreationRequestId, obj, null);
    }

    public final ajdp<Optional<aexp>> g(long j) {
        DbClient dbClient = this.a;
        Object authTokenForFeed = FeedRecord.FACTORY.getAuthTokenForFeed(j);
        akcr.a(authTokenForFeed, "FeedRecord.FACTORY.getAuthTokenForFeed(feedId)");
        Object obj = FeedRecord.FACTORY;
        akcr.a(obj, "FeedRecord.FACTORY");
        Object r = dbClient.queryAndMapToOne(authTokenForFeed, new e(obj.getAuthTokenForFeedMapper())).r(new f(j)).k((ajfc) new c(this, j)).r(d.a);
        akcr.a(r, "bytes\n                .f…bsent()\n                }");
        return r;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0044 in {5, 7, 12, 14} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final java.util.List<com.snap.core.db.record.MessagingSnapModel.GetSnapsForFeedModel> h(long r5) {
        /*
        r4 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.List) r0;
        r1 = com.snap.core.db.record.MessagingSnapRecord.FACTORY;
        r5 = r1.getSnapsForFeed(r5);
        r6 = "MessagingSnapRecord.FACT…Y.getSnapsForFeed(feedId)";
        defpackage.akcr.a(r5, r6);
        r6 = r4.a;
        r5 = r6.query(r5);
        r5 = (java.io.Closeable) r5;
        r6 = 0;
        r1 = r5;	 Catch:{ Throwable -> 0x003e }
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x003e }
        r2 = r1.moveToFirst();	 Catch:{ Throwable -> 0x003e }
        if (r2 == 0) goto L_0x0038;	 Catch:{ Throwable -> 0x003e }
        r2 = com.snap.core.db.record.LegacyMessagingSnapQueries.GET_SNAPS;	 Catch:{ Throwable -> 0x003e }
        r2 = r2.map(r1);	 Catch:{ Throwable -> 0x003e }
        r3 = "LegacyMessagingSnapQueries.GET_SNAPS.map(cursor)";	 Catch:{ Throwable -> 0x003e }
        defpackage.akcr.a(r2, r3);	 Catch:{ Throwable -> 0x003e }
        r0.add(r2);	 Catch:{ Throwable -> 0x003e }
        r2 = r1.moveToNext();	 Catch:{ Throwable -> 0x003e }
        if (r2 != 0) goto L_0x0024;
        defpackage.akax.a(r5, r6);
        return r0;
        r0 = move-exception;
        goto L_0x0040;
        r6 = move-exception;
        throw r6;	 Catch:{ all -> 0x003c }
        defpackage.akax.a(r5, r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quk.h(long):java.util.List");
    }
}
