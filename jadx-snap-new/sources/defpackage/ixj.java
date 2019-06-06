package defpackage;

import android.database.Cursor;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.base.Supplier;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.FriendmojiCategory;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.column.FriendshipDirection;
import com.snap.core.db.record.BestFriendModel;
import com.snap.core.db.record.BestFriendModel.ClearAll;
import com.snap.core.db.record.FriendModel.InsertPendingIncomingFriend;
import com.snap.core.db.record.FriendModel.InsertRow;
import com.snap.core.db.record.FriendModel.MarkFriendsDeleted;
import com.snap.core.db.record.FriendModel.SetStoryMuted;
import com.snap.core.db.record.FriendModel.UpdateDisplayNameForUsername;
import com.snap.core.db.record.FriendModel.UpdateFriend;
import com.snap.core.db.record.FriendModel.UpdateFriendUserScore;
import com.snap.core.db.record.FriendModel.UpdateGroupParticipant;
import com.snap.core.db.record.FriendModel.UpdateLinkType;
import com.snap.core.db.record.FriendModel.UpdatePendingIncomingFriend;
import com.snap.core.db.record.FriendModel.UpdateSuggestedFriend;
import com.snap.core.db.record.FriendModel.UpdateUsername;
import com.snap.core.db.record.FriendRecord;
import com.snap.core.db.record.FriendRecord.DisplayInfo;
import com.snap.core.db.record.FriendRecord.DisplayName;
import com.snap.core.db.record.FriendRecord.ExistingUserData;
import com.snap.core.db.record.FriendRecord.FriendInfoAndLinkType;
import com.snap.core.db.record.FriendRecord.UserIdAndLinkType;
import com.snap.core.db.record.FriendRecord.UserIdAndUsername;
import com.snap.core.db.record.FriendRecord.UsernameAndAddedTimestamp;
import com.snap.core.db.record.FriendRecord.UsernameAndLinkType;
import com.snap.core.db.record.FriendSyncStateModel.CreateEntry;
import com.snap.core.db.record.FriendSyncStateModel.UpdateValue;
import com.snap.core.db.record.FriendSyncStateRecord;
import defpackage.ixm.b;
import defpackage.ixm.c;
import defpackage.iyz.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: ixj */
public final class ixj implements iqw, iqx {
    public final SnapDb a;
    public final DbClient b;
    public final Supplier<UpdateDisplayNameForUsername> c = new ihx(new -$$Lambda$ixj$wE0asyTtz0Q5XybLeikViLFv0co(this));
    private final ixi d;
    private final iqv e;
    private final Set<itq> f;
    private final gpb g;
    private final iqc h;
    private final ihh i;
    private final Supplier<InsertRow> j = new ihx(new -$$Lambda$ixj$I_SBUFsjo_5s41iFvUl3He3N2HE(this));
    private final Supplier<UpdateFriend> k = new ihx(new -$$Lambda$ixj$7IMFlKh_vu0moj_3k_MCS-WGcAA(this));
    private final Supplier<UpdateGroupParticipant> l = new ihx(new -$$Lambda$ixj$lCgf4wv6ZK6kqKxdSTslKjS9f6c(this));
    private final Supplier<SetStoryMuted> m = new ihx(new -$$Lambda$ixj$pDhiCfrU8X8Ug9AeWm5ZX1almFY(this));
    private final Supplier<UpdateValue> n = new ihx(new -$$Lambda$ixj$Y37JWBMH4uTavgK9JmUWzb_BnWY(this));
    private final Supplier<CreateEntry> o = new ihx(new -$$Lambda$ixj$YWQPGTfOJoV2TD7ABptef9oAzdQ(this));
    private final Supplier<UpdateFriendUserScore> p = new ihx(new -$$Lambda$ixj$xY-LH87IO3ZbiP9oiNZ4TmTe2Ws(this));
    private final Supplier<MarkFriendsDeleted> q = new ihx(new -$$Lambda$ixj$m5ayQqrFUIzD5eu74L-XlP5WJTo(this));
    private final Supplier<UpdateLinkType> r = new ihx(new -$$Lambda$ixj$rHt7kdArFoDe7a-3BX6UnEfJRTM(this));
    private final Supplier<InsertPendingIncomingFriend> s = new ihx(new -$$Lambda$ixj$_Yh8URFJJJ-rsKptUEs_aVdLA9Q(this));
    private final Supplier<UpdatePendingIncomingFriend> t = new ihx(new -$$Lambda$ixj$JU8F06AEQQJQxarQB22a2e-hkNI(this));
    private final Supplier<UpdateSuggestedFriend> u = new ihx(new -$$Lambda$ixj$EhF0qXfVDFprfTrmbPuJT7VfBv8(this));
    private final Supplier<UpdateUsername> v = new ihx(new -$$Lambda$ixj$Y8T30Vzya5_PaCe4Kg9qmh87Xqc(this));
    private ixm w = new ixm();

    public ixj(ixi ixi, iqv iqv, SnapDb snapDb, Set<itq> set, gpb gpb, iqc iqc, ihh ihh) {
        this.d = ixi;
        this.e = iqv;
        this.a = snapDb;
        this.b = snapDb.getDbClient(irc.t.callsite("FriendRepository"));
        this.f = set;
        this.g = gpb;
        this.h = iqc;
        this.i = ihh;
    }

    private long a(aelf aelf, Set<Long> set, DbTransaction dbTransaction) {
        aelf aelf2 = aelf;
        DbTransaction dbTransaction2 = dbTransaction;
        this.a.throwIfNotDbScheduler();
        boolean equals = aelf2.b.equals(this.g.e().a.a);
        String str = Strings.isNullOrEmpty(aelf2.d) ? aelf2.a : aelf2.d;
        FriendLinkType from = FriendLinkType.from(aelf.a());
        if (!equals && from == null) {
            return 0;
        }
        long executeInsert;
        ExistingUserData a = a(aelf2.b, aelf2.a, a(aelf2.b, aelf2.a), dbTransaction2);
        String f = aelf2.B == null ? null : ixj.f(aelf2.B);
        boolean c = ixj.c(aelf);
        if (a == null) {
            InsertRow insertRow = (InsertRow) this.j.get();
            insertRow.bind(aelf2.b, str, aelf2.d, aelf2.E, aelf2.H, Friendmojis.from(aelf2.B), f, aelf2.C, ixj.b(aelf), CalendarDate.parse(aelf2.e), aelf2.a, from, aelf2.f, aelf2.g, aelf2.N == null ? false : aelf2.N.booleanValue(), aelf2.M == null ? false : aelf2.M.booleanValue(), c, aelf2.Q);
            executeInsert = this.b.executeInsert(insertRow, dbTransaction);
        } else {
            if (!str.equals(a.displayName())) {
                set.add(Long.valueOf(a._id()));
            }
            if (equals) {
                ixj.a(aelf2, this.g.e().a);
            }
            long _id = a._id();
            UpdateFriend updateFriend = (UpdateFriend) this.k.get();
            ExistingUserData existingUserData = a;
            updateFriend.bind(aelf2.b, aelf2.a, str, aelf2.d, aelf2.E, aelf2.H, Friendmojis.from(aelf2.B), f, aelf2.C, ixj.b(aelf), CalendarDate.parse(aelf2.e), from, aelf2.f, aelf2.g, aelf2.N == null ? false : aelf2.N.booleanValue(), aelf2.M == null ? false : aelf2.M.booleanValue(), c, aelf2.Q, _id);
            this.b.executeUpdateDelete(updateFriend, dbTransaction2);
            if (!existingUserData.username().equals(aelf2.a)) {
                this.h.a(iqd.FRIEND_UPDATE_FULL, existingUserData.friendLinkType());
            }
            executeInsert = _id;
        }
        return executeInsert;
    }

    private ExistingUserData a(String str, String str2, List<ExistingUserData> list, DbTransaction dbTransaction) {
        dbTransaction.checkInTransaction();
        ExistingUserData existingUserData = null;
        for (int i = 0; i < list.size(); i++) {
            ExistingUserData existingUserData2 = (ExistingUserData) list.get(i);
            String userId = existingUserData2.userId();
            if (userId == null || !userId.equals(str)) {
                boolean z = true;
                if (!(i == list.size() - 1 && existingUserData == null)) {
                    iqc iqc = this.h;
                    iqd iqd = iqd.FRIEND_UPDATE_FULL;
                    FriendLinkType friendLinkType = existingUserData2.friendLinkType();
                    if (userId == null) {
                        z = false;
                    }
                    iqc.a(iqd, friendLinkType, z);
                    a(Long.valueOf(existingUserData2._id()), existingUserData2.username());
                    a(Long.valueOf(existingUserData2._id()), FriendLinkType.DELETED);
                }
            }
            existingUserData = existingUserData2;
        }
        if (!(existingUserData == null || existingUserData.username().equals(str2))) {
            this.d.c(existingUserData.username());
        }
        return existingUserData;
    }

    private List<ExistingUserData> a(String str, String str2) {
        Throwable th;
        ainx selectExistingUserData = FriendRecord.FACTORY.selectExistingUserData(str, str2);
        ArrayList arrayList = new ArrayList(2);
        Cursor query = this.b.query(selectExistingUserData);
        try {
            if (query.moveToFirst()) {
                arrayList.add(FriendRecord.SELECT_EXISTING_USER_DATA_MAPPER.map(query));
                if (query.moveToNext()) {
                    arrayList.add(FriendRecord.SELECT_EXISTING_USER_DATA_MAPPER.map(query));
                }
            }
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    private static void a(aelf aelf, abkq abkq) {
        aelf.E = abkq.f;
        aelf.H = abkq.l;
    }

    private void a(Long l, String str) {
        this.a.throwIfNotDbScheduler();
        this.d.c(str);
        UpdateUsername updateUsername = (UpdateUsername) this.v.get();
        StringBuilder stringBuilder = new StringBuilder("{Conflict}{");
        stringBuilder.append(this.i.c());
        stringBuilder.append("}");
        stringBuilder.append(str);
        updateUsername.bind(stringBuilder.toString(), l.longValue());
        this.b.executeUpdateDelete(updateUsername);
    }

    private void a(List<String> list, DbTransaction dbTransaction) {
        this.a.throwIfNotDbScheduler();
        pa writableDatabase = this.b.getWritableDatabase();
        this.b.executeUpdateDelete(new ClearAll(writableDatabase));
        BestFriendModel.InsertRow insertRow = new BestFriendModel.InsertRow(writableDatabase);
        try {
            for (String f : list) {
                insertRow.bind(f(f));
                this.b.executeInsert(insertRow, dbTransaction);
            }
        } catch (ixn e) {
            String.format(Locale.ENGLISH, "Lost database session during updateBestFriends: %s", new Object[]{e.getMessage()});
        }
    }

    private static Long b(aelf aelf) {
        if (aelf.B == null) {
            return null;
        }
        aemr aemr = (aemr) FluentIterable.from(aelf.B).firstMatch(-$$Lambda$ixj$5XdhVB4Is4SXY9xi6bdodHVwoSI.INSTANCE).orNull();
        return aemr == null ? null : aemr.b;
    }

    private /* synthetic */ Long b(aelf aelf, Set set, DbTransaction dbTransaction) {
        return Long.valueOf(a(aelf, set, dbTransaction));
    }

    private static boolean c(aelf aelf) {
        if (aelf.B != null) {
            for (aemr isSojuFriendmojiOfficialStory : aelf.B) {
                if (FriendmojiCategory.isSojuFriendmojiOfficialStory(isSojuFriendmojiOfficialStory)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String f(List<aemr> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (aemr aemr : list) {
            stringBuilder.append(aemr.a);
            stringBuilder.append(',');
        }
        return stringBuilder.toString();
    }

    private pa f() {
        return this.b.getWritableDatabase();
    }

    private /* synthetic */ UpdateUsername g() {
        return new UpdateUsername(f());
    }

    private /* synthetic */ UpdateSuggestedFriend h() {
        return new UpdateSuggestedFriend(f());
    }

    /* JADX WARNING: Missing block: B:15:0x002b, code skipped:
            if (r3 != null) goto L_0x002d;
     */
    /* JADX WARNING: Missing block: B:16:0x002d, code skipped:
            if (r0 != null) goto L_0x002f;
     */
    /* JADX WARNING: Missing block: B:18:?, code skipped:
            r3.close();
     */
    /* JADX WARNING: Missing block: B:19:0x0033, code skipped:
            r3 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x0034, code skipped:
            r0.addSuppressed(r3);
     */
    /* JADX WARNING: Missing block: B:21:0x0038, code skipped:
            r3.close();
     */
    private com.snap.core.db.record.FriendRecord.DisplayName h(java.lang.String r3) {
        /*
        r2 = this;
        r0 = com.snap.core.db.record.FriendRecord.FACTORY;
        r3 = r0.selectDisplayNameForUsername(r3);
        r0 = r2.b;
        r3 = r0.query(r3);
        r0 = 0;
        r1 = r3.moveToFirst();	 Catch:{ Throwable -> 0x0029 }
        if (r1 == 0) goto L_0x0021;
    L_0x0013:
        r1 = com.snap.core.db.record.FriendRecord.SELECT_NAME_MAPPER;	 Catch:{ Throwable -> 0x0029 }
        r1 = r1.map(r3);	 Catch:{ Throwable -> 0x0029 }
        r1 = (com.snap.core.db.record.FriendRecord.DisplayName) r1;	 Catch:{ Throwable -> 0x0029 }
        if (r3 == 0) goto L_0x0020;
    L_0x001d:
        r3.close();
    L_0x0020:
        return r1;
    L_0x0021:
        if (r3 == 0) goto L_0x0026;
    L_0x0023:
        r3.close();
    L_0x0026:
        return r0;
    L_0x0027:
        r1 = move-exception;
        goto L_0x002b;
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0027 }
    L_0x002b:
        if (r3 == 0) goto L_0x003b;
    L_0x002d:
        if (r0 == 0) goto L_0x0038;
    L_0x002f:
        r3.close();	 Catch:{ Throwable -> 0x0033 }
        goto L_0x003b;
    L_0x0033:
        r3 = move-exception;
        r0.addSuppressed(r3);
        goto L_0x003b;
    L_0x0038:
        r3.close();
    L_0x003b:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixj.h(java.lang.String):com.snap.core.db.record.FriendRecord$DisplayName");
    }

    private /* synthetic */ UpdatePendingIncomingFriend i() {
        return new UpdatePendingIncomingFriend(f(), FriendRecord.FACTORY);
    }

    private /* synthetic */ InsertPendingIncomingFriend j() {
        return new InsertPendingIncomingFriend(f(), FriendRecord.FACTORY);
    }

    private /* synthetic */ UpdateLinkType k() {
        return new UpdateLinkType(f(), FriendRecord.FACTORY);
    }

    private /* synthetic */ MarkFriendsDeleted l() {
        return new MarkFriendsDeleted(f());
    }

    private /* synthetic */ UpdateFriendUserScore m() {
        return new UpdateFriendUserScore(f());
    }

    private /* synthetic */ UpdateDisplayNameForUsername n() {
        return new UpdateDisplayNameForUsername(f());
    }

    private /* synthetic */ CreateEntry o() {
        return new CreateEntry(f());
    }

    private /* synthetic */ UpdateValue p() {
        return new UpdateValue(f());
    }

    private /* synthetic */ SetStoryMuted q() {
        return new SetStoryMuted(f());
    }

    private /* synthetic */ UpdateGroupParticipant r() {
        return new UpdateGroupParticipant(f());
    }

    private /* synthetic */ UpdateFriend s() {
        return new UpdateFriend(f(), FriendRecord.FACTORY);
    }

    private /* synthetic */ InsertRow t() {
        return new InsertRow(f(), FriendRecord.FACTORY);
    }

    public final long a(ahbl ahbl, DbTransaction dbTransaction) {
        ahbl ahbl2 = ahbl;
        DbTransaction dbTransaction2 = dbTransaction;
        dbTransaction.checkInTransaction();
        this.a.throwIfNotDbScheduler();
        String str = Strings.isNullOrEmpty(ahbl2.c) ? ahbl2.b : ahbl2.c;
        ExistingUserData a = a(ahbl2.a, ahbl2.b, a(ahbl2.a, ahbl2.b), dbTransaction2);
        if (a != null) {
            UpdateGroupParticipant updateGroupParticipant = (UpdateGroupParticipant) this.l.get();
            updateGroupParticipant.bind(str, ahbl2.c, ahbl2.h, ahbl2.i, a._id());
            this.b.executeUpdateDelete(updateGroupParticipant);
            return a._id();
        }
        InsertRow insertRow = (InsertRow) this.j.get();
        insertRow.bind(ahbl2.a, str, ahbl2.c, ahbl2.h, ahbl2.i, null, null, Integer.valueOf(0), null, null, ahbl2.b, null, null, null, false, false, false, null);
        return this.b.executeInsert(insertRow, dbTransaction2);
    }

    public final ajcx a(a aVar) {
        return this.b.runInTransactionCompat("FriendRepository:applyFriendsScoreResponseUpdate", new -$$Lambda$ixj$DRK2N_3oAnZxeZph7rIQ4kPsnQI(this, aVar));
    }

    public final ajcx a(String str, ajcx ajcx) {
        if (str == null) {
            return ajcx;
        }
        ixm ixm = this.w;
        akcr.b(str, "key");
        akcr.b(ajcx, "completable");
        Object ajwm = new ajwm();
        akcr.a(ajwm, "CompletableSubject.create()");
        Object b = ajcx.a((ajdb) ajwm).b((ajfb) new c(ixm, ajwm));
        akcr.a(b, "completable\n            …fresh()\n                }");
        b bVar = new b(ajwm);
        ixm.c.a((ajej) bVar);
        ajej ajej = (ajej) ixm.a.put(str, bVar);
        if (ajej != null) {
            ajej.dispose();
            ixm.c.b(ajej);
        }
        ixm.a();
        return b;
    }

    public final ajcx a(String str, boolean z) {
        return this.b.runInTransactionCompat("friend_repository:mute_friend_story", new -$$Lambda$ixj$6d80qDSfCseaWNEiI_RIMUGxfv0(this, z, str));
    }

    public final ajdx<Long> a(aelf aelf) {
        HashSet hashSet = new HashSet();
        return this.b.callInTransaction("FriendRepository:applyFriendUpdate", new -$$Lambda$ixj$WMKZl1BSsJQ0YMsPgAqsnZwowrA(this, aelf, hashSet));
    }

    public final Long a(aelf aelf, DbTransaction dbTransaction) {
        aelf aelf2 = aelf;
        DbTransaction dbTransaction2 = dbTransaction;
        dbTransaction.checkInTransaction();
        this.a.throwIfNotDbScheduler();
        ExistingUserData a = a(aelf2.b, aelf2.a, a(aelf2.b, aelf2.a), dbTransaction2);
        if (a == null) {
            ((InsertPendingIncomingFriend) this.s.get()).bind(aelf2.a, aelf2.b, aelf2.d, aelf2.d, aelf2.E, aelf2.H, aelf2.g, aelf2.f, aelf2.M == null ? false : aelf2.M.booleanValue(), ixj.c(aelf), FriendLinkType.from(aelf.a()), aelf2.Q);
            return Long.valueOf(this.b.executeInsert((ainy) this.s.get(), dbTransaction2));
        }
        Long valueOf = Long.valueOf(a._id());
        Object obj = (FriendshipDirection.fromString(aelf2.h) == FriendshipDirection.INCOMING && aelf.a() == aelf.a.PENDING) ? 1 : null;
        if (obj != null) {
            ((UpdatePendingIncomingFriend) this.t.get()).bind(aelf2.b, aelf2.a, aelf2.d, aelf2.d, aelf2.E, aelf2.H, aelf2.g, aelf2.f, aelf2.M == null ? false : aelf2.M.booleanValue(), ixj.c(aelf), FriendLinkType.from(aelf.a()), aelf2.Q, valueOf.longValue());
            this.b.executeUpdateDelete((ainy) this.t.get(), dbTransaction2);
        }
        return valueOf;
    }

    public final Long a(ahen ahen, DbTransaction dbTransaction) {
        dbTransaction.checkInTransaction();
        this.a.throwIfNotDbScheduler();
        ExistingUserData a = a(ahen.a, ahen.b, a(ahen.a, ahen.b), dbTransaction);
        long f = a == null ? f(ahen.b) : a._id();
        ((UpdateSuggestedFriend) this.u.get()).bind(ahen.c, ahen.c, ahen.b, ahen.a, ahen.e, ahen.g, f);
        this.b.executeUpdateDelete((ainy) this.u.get(), dbTransaction);
        return Long.valueOf(f);
    }

    public final String a() {
        return (String) this.b.queryFirst(FriendSyncStateRecord.FACTORY.getValueFromFriendSyncState(), FriendSyncStateRecord.FACTORY.getValueFromFriendSyncStateMapper());
    }

    public final String a(String str) {
        return (String) this.b.queryFirst(FriendRecord.FACTORY.selectFriendUserIdFromUsername(str), FriendRecord.FACTORY.selectFriendUserIdFromUsernameMapper(), null);
    }

    public final List<Long> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String g : list) {
            arrayList.add(Long.valueOf(g(g)));
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x0047 in {5, 7, 8, 14, 19, 21, 22, 23} preds:[]
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
    public final java.util.List<java.lang.String> a(long[] r4) {
        /*
        r3 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = com.snap.core.db.record.FriendRecord.FACTORY;
        r4 = r1.selectUsernamesForIds(r4);
        r1 = r3.b;
        r4 = r1.query(r4);
        r1 = 0;
        r2 = r4.moveToFirst();	 Catch:{ Throwable -> 0x0033 }
        if (r2 == 0) goto L_0x002b;	 Catch:{ Throwable -> 0x0033 }
        r2 = com.snap.core.db.record.FriendRecord.FACTORY;	 Catch:{ Throwable -> 0x0033 }
        r2 = r2.selectUsernamesForIdsMapper();	 Catch:{ Throwable -> 0x0033 }
        r2 = r2.map(r4);	 Catch:{ Throwable -> 0x0033 }
        r0.add(r2);	 Catch:{ Throwable -> 0x0033 }
        r2 = r4.moveToNext();	 Catch:{ Throwable -> 0x0033 }
        if (r2 != 0) goto L_0x0018;
        if (r4 == 0) goto L_0x0030;
        r4.close();
        return r0;
        r0 = move-exception;
        goto L_0x0036;
        r0 = move-exception;
        r1 = r0;
        throw r1;	 Catch:{ all -> 0x0031 }
        if (r4 == 0) goto L_0x0046;
        if (r1 == 0) goto L_0x0043;
        r4.close();	 Catch:{ Throwable -> 0x003e }
        goto L_0x0046;
        r4 = move-exception;
        r1.addSuppressed(r4);
        goto L_0x0046;
        r4.close();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixj.a(long[]):java.util.List");
    }

    public final Map<String, Long> a(FriendLinkType friendLinkType, long j) {
        List<UsernameAndAddedTimestamp> query = this.b.query(FriendRecord.FACTORY.selectFriendsAndAddedTimestampsByLinkTypeAddedBefore(friendLinkType, Long.valueOf(j)), FriendRecord.SELECT_USERNAME_AND_ADDED_TIMESTAMP_MAPPER);
        HashMap hashMap = new HashMap();
        for (UsernameAndAddedTimestamp usernameAndAddedTimestamp : query) {
            hashMap.put(usernameAndAddedTimestamp.username(), usernameAndAddedTimestamp.addedTimestamp());
        }
        return hashMap;
    }

    public final Map<String, Long> a(Collection<String> collection) {
        return this.d.a((Collection) collection);
    }

    public final void a(aemz aemz, SnapDb snapDb, DbTransaction dbTransaction) {
        snapDb.throwIfNotDbScheduler();
        Preconditions.checkNotNull(aemz);
        boolean equals = aemz.b.FULL.a().equals(aemz.c);
        Set hashSet = new HashSet();
        if (equals) {
            this.d.b();
            this.b.executeUpdateDelete((MarkFriendsDeleted) this.q.get());
        }
        HashSet hashSet2 = null;
        if (aemz.d != null) {
            hashSet2 = new HashSet();
            for (aelf aelf : aemz.d) {
                if (aelf.b != null) {
                    hashSet2.add(aelf.b);
                }
            }
        }
        if (aemz.a != null) {
            for (aelf aelf2 : aemz.a) {
                if (aelf2.c.intValue() != aelf.a.DELETED.a()) {
                    a(aelf2, hashSet, dbTransaction);
                } else if (!(aelf2.a == null || aelf2.b == null)) {
                    if (hashSet2 == null || !hashSet2.contains(aelf2.b)) {
                        String str = aelf2.a;
                        String str2 = aelf2.b;
                        dbTransaction.checkInTransaction();
                        this.e.a(new itc(str, str2, aejd.DELETED_BY_EXTERNAL), dbTransaction);
                    }
                }
            }
        }
        if (aemz.e != null) {
            a(aemz.e, dbTransaction);
        }
        if (a() == null) {
            CreateEntry createEntry = (CreateEntry) this.o.get();
            createEntry.bind(aemz.b);
            this.b.executeInsert(createEntry, dbTransaction);
        } else {
            UpdateValue updateValue = (UpdateValue) this.n.get();
            updateValue.bind(aemz.b);
            this.b.executeUpdateDelete(updateValue, dbTransaction);
        }
        if (!hashSet.isEmpty()) {
            for (itq a : this.f) {
                a.a(hashSet, dbTransaction);
            }
        }
        this.h.a().c((ily) iob.FRIEND_UPDATE, 1);
    }

    public final void a(Long l, FriendLinkType friendLinkType) {
        this.a.throwIfNotDbScheduler();
        UpdateLinkType updateLinkType = (UpdateLinkType) this.r.get();
        updateLinkType.bind(friendLinkType, l.longValue());
        this.b.executeUpdateDelete(updateLinkType);
    }

    public final ajdp<List<DisplayInfo>> b() {
        ainx selectBlockedFriend = FriendRecord.FACTORY.selectBlockedFriend();
        DbClient dbClient = this.b;
        ainw ainw = FriendRecord.SELECT_BLOCK_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToList("friend:getBlockedFriends", selectBlockedFriend, new -$$Lambda$-NPVMvBNdJiK6WVATkqowP1oCE8(ainw));
    }

    public final FriendLinkType b(String str) {
        return (FriendLinkType) this.b.queryFirst(FriendRecord.FACTORY.findFriendLinkTypeWithUsername(str), FriendRecord.FACTORY.findFriendLinkTypeWithUsernameMapper(), null);
    }

    public final Map<String, FriendLinkType> b(List<String> list) {
        HashMap newHashMap = Maps.newHashMap();
        for (UsernameAndLinkType usernameAndLinkType : this.b.query(FriendRecord.FACTORY.selectFriendLinkTypesByUsernames((String[]) list.toArray(new String[list.size()])), FriendRecord.SELECT_USERNAME_AND_LINK_TYPE)) {
            newHashMap.put(usernameAndLinkType.username(), usernameAndLinkType.friendLinkType());
        }
        return newHashMap;
    }

    public final Long c(String str) {
        return (Long) this.b.queryFirst(FriendRecord.FACTORY.getAddedTimestampForUsername(str), FriendRecord.FACTORY.getAddedTimestampForUsernameMapper(), null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0042 in {6, 8, 9, 15, 20, 22, 23, 24} preds:[]
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
    public final java.util.List<com.snap.core.db.record.FriendModel.SelectAllFriendUserScoresModel> c() {
        /*
        r4 = this;
        r0 = r4.a;
        r0.throwIfNotDbScheduler();
        r0 = com.google.common.collect.Lists.newArrayList();
        r1 = com.snap.core.db.record.FriendRecord.FACTORY;
        r1 = r1.selectAllFriendUserScores();
        r2 = r4.b;
        r1 = r2.query(r1);
        r2 = 0;
        r3 = r1.moveToNext();	 Catch:{ Throwable -> 0x002e }
        if (r3 == 0) goto L_0x0026;	 Catch:{ Throwable -> 0x002e }
        r3 = com.snap.core.db.record.FriendRecord.SELECT_ALL_FRIEND_USER_SCORES_MAPPER;	 Catch:{ Throwable -> 0x002e }
        r3 = r3.map(r1);	 Catch:{ Throwable -> 0x002e }
        r0.add(r3);	 Catch:{ Throwable -> 0x002e }
        goto L_0x0015;
        if (r1 == 0) goto L_0x002b;
        r1.close();
        return r0;
        r0 = move-exception;
        goto L_0x0031;
        r0 = move-exception;
        r2 = r0;
        throw r2;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x0041;
        if (r2 == 0) goto L_0x003e;
        r1.close();	 Catch:{ Throwable -> 0x0039 }
        goto L_0x0041;
        r1 = move-exception;
        r2.addSuppressed(r1);
        goto L_0x0041;
        r1.close();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixj.c():java.util.List");
    }

    public final Map<String, FriendLinkType> c(List<String> list) {
        HashMap newHashMap = Maps.newHashMap();
        for (UserIdAndLinkType userIdAndLinkType : this.b.query(FriendRecord.FACTORY.selectFriendLinkTypesByUserIds((String[]) list.toArray(new String[list.size()])), FriendRecord.SELECT_USERID_AND_LINK_TYPE)) {
            newHashMap.put(userIdAndLinkType.userId(), userIdAndLinkType.friendLinkType());
        }
        return newHashMap;
    }

    public final ajdx<List<FriendInfoAndLinkType>> d(List<? extends FriendLinkType> list) {
        ainx selectFriendsByLinkTypes = FriendRecord.FACTORY.selectFriendsByLinkTypes((FriendLinkType[]) Iterables.toArray((Iterable) list, FriendLinkType.class));
        DbClient dbClient = this.b;
        ainw ainw = FriendRecord.SELECT_FRIEND_BY_LINK_TYPES;
        ainw.getClass();
        return dbClient.queryAndMapToList(selectFriendsByLinkTypes, new -$$Lambda$bIOIwHQsxWexudgbK-4-c6SqnMA(ainw)).e();
    }

    public final String d(String str) {
        DisplayName h = h(str);
        return h != null ? (String) MoreObjects.firstNonNull(h.displayName(), str) : str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x003d in {6, 8, 9, 15, 20, 22, 23, 24} preds:[]
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
    public final java.util.List<java.lang.String> d() {
        /*
        r4 = this;
        r0 = com.google.common.collect.Lists.newArrayList();
        r1 = r4.b;
        r2 = com.snap.core.db.record.FriendRecord.FACTORY;
        r2 = r2.selectAllMutualFriendUserIds();
        r1 = r1.query(r2);
        r2 = 0;
        r3 = r1.moveToNext();	 Catch:{ Throwable -> 0x0029 }
        if (r3 == 0) goto L_0x0021;	 Catch:{ Throwable -> 0x0029 }
        r3 = com.snap.core.db.record.FriendRecord.SELECT_ALL_MUTUAL_FRIEND_USER_ID_MAPPER;	 Catch:{ Throwable -> 0x0029 }
        r3 = r3.map(r1);	 Catch:{ Throwable -> 0x0029 }
        r0.add(r3);	 Catch:{ Throwable -> 0x0029 }
        goto L_0x0010;
        if (r1 == 0) goto L_0x0026;
        r1.close();
        return r0;
        r0 = move-exception;
        goto L_0x002c;
        r0 = move-exception;
        r2 = r0;
        throw r2;	 Catch:{ all -> 0x0027 }
        if (r1 == 0) goto L_0x003c;
        if (r2 == 0) goto L_0x0039;
        r1.close();	 Catch:{ Throwable -> 0x0034 }
        goto L_0x003c;
        r1 = move-exception;
        r2.addSuppressed(r1);
        goto L_0x003c;
        r1.close();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixj.d():java.util.List");
    }

    public final ajdp<Set<String>> e() {
        Object p = this.w.b.p(ixm.a.a);
        akcr.a(p, "subject.map {\n        it…              .keys\n    }");
        return p;
    }

    public final Long e(String str) {
        return (Long) this.b.queryFirst(FriendRecord.FACTORY.selectFriendUserScore(str), FriendRecord.FACTORY.selectFriendUserScoreMapper(), null);
    }

    public final Map<String, String> e(List<String> list) {
        List<UserIdAndUsername> query = this.b.query(FriendRecord.FACTORY.selectUserNameByUserIds((String[]) list.toArray(new String[list.size()])), FriendRecord.SELECT_USERNAME_BY_USER_IDS_MAPPER);
        HashMap hashMap = new HashMap(query.size());
        for (UserIdAndUsername userIdAndUsername : query) {
            hashMap.put(Objects.requireNonNull(userIdAndUsername.userId()), userIdAndUsername.username());
        }
        return hashMap;
    }

    public final long f(String str) {
        return this.d.a(str);
    }

    public final long g(String str) {
        return this.d.b(str);
    }
}
