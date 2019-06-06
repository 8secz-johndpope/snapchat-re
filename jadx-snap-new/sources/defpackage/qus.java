package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.InteractionMessageType;
import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.MessageClientStatusKt;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.ScreenshottedOrReplayedState.Record;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.FeedModel.UpdateDisplayInfo;
import com.snap.core.db.record.FeedModel.UpdateSortingTimestampIfMoreRecent;
import com.snap.core.db.record.FeedRecord;
import com.snap.core.db.record.FeedRecord.ReadWriteTimeInfo;
import com.snap.core.db.record.InteractionMessagesModel.DeleteAllInteractionMessages;
import com.snap.core.db.record.InteractionMessagesModel.DeleteAllInteractionsForFeedEntry;
import com.snap.core.db.record.InteractionMessagesModel.DeleteInteractionMessage;
import com.snap.core.db.record.InteractionMessagesModel.SetInteractionMessage;
import com.snap.core.db.record.InteractionMessagesRecord;
import com.snap.core.db.record.InteractionMessagesRecord.GetNewContentInteractionMessagesRow;
import com.snap.core.db.record.InteractionMessagesRecord.InteractionMessageRow;
import com.snap.core.db.record.MessageModel.GetLastSentSnapForMessageModel;
import com.snap.core.db.record.MessageModel.GetReceivedSnapsModel;
import com.snap.core.db.record.MessageRecord.LastMessageWithClientStatus;
import com.snap.core.db.record.MessageRecord.LastReceivedNotViewedChat;
import com.snap.core.db.record.MessageRecord.LastReceivedNotViewedUpdateMessage;
import com.snap.core.db.record.MessageRecord.LastReceivedViewedChat;
import com.snap.core.db.record.MessageRecord.LastSentNotViewedChat;
import com.snap.core.db.record.MessageRecord.LastSentSnapModel;
import com.snap.core.db.record.MessageRecord.LastSentViewedChat;
import com.snap.core.db.record.MessageRecord.ReceivedSnapsModel;
import com.snap.core.db.record.MessagingSnapRecord.LastReceivedSnap;
import com.snap.core.db.record.MessagingSnapRecord.LastSentSnap;
import defpackage.pun.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: qus */
public final class qus {
    private static aetf[] w;
    public final DbClient a = this.q.getDbClient(this.h);
    public final ajxe<DeleteAllInteractionsForFeedEntry> b = ajxh.a(new d(this));
    public final ajxe<UpdateSortingTimestampIfMoreRecent> c = ajxh.a(new m(this));
    public final ajxe<DeleteAllInteractionMessages> d = ajxh.a(new c(this));
    final ajwy<iqx> e;
    final gpb f;
    final ajwy<ftl> g;
    private final idd h = pry.a.callsite("InteractionMessagesRepository");
    private final ajxe i = ajxh.a(new o(this.a));
    private final ajxe j = ajxh.a(new h(this));
    private final ajxe k = ajxh.a(new g(this));
    private final ajxe l = ajxh.a(new n(this));
    private final ajxe<SetInteractionMessage> m = ajxh.a(new l(this));
    private final ajxe<DeleteInteractionMessage> n = ajxh.a(new e(this));
    private final ajxe<UpdateDisplayInfo> o = ajxh.a(new k(this));
    private final ajwy<qvd> p;
    private final SnapDb q;
    private final ajwy<iha> r;
    private final Set<pre> s;
    private final ihh t;
    private final ajwy<qdn> u;
    private final ajwy<ilv> v;

    /* renamed from: qus$o */
    static final class o extends akcq implements akbk<pa> {
        o(DbClient dbClient) {
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

    /* renamed from: qus$f */
    static final class f extends akcq implements akbl<Cursor, GetNewContentInteractionMessagesRow> {
        f(ainw ainw) {
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
            return (GetNewContentInteractionMessagesRow) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: qus$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: qus$h */
    static final class h extends akcs implements akbk<String> {
        private /* synthetic */ qus a;

        h(qus qus) {
            this.a = qus;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.f.b();
        }
    }

    /* renamed from: qus$g */
    static final class g extends akcs implements akbk<Long> {
        private /* synthetic */ qus a;

        g(qus qus) {
            this.a = qus;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            iqx iqx = (iqx) this.a.e.get();
            Object a = this.a.a();
            akcr.a(a, "myUsername");
            return Long.valueOf(iqx.g(a));
        }
    }

    /* renamed from: qus$n */
    static final class n extends akcs implements akbk<Boolean> {
        private /* synthetic */ qus a;

        n(qus qus) {
            this.a = qus;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((ftl) this.a.g.get()).a((fth) qpy.ENABLE_SNAP_DATA_REFACTOR));
        }
    }

    /* renamed from: qus$l */
    static final class l extends akcs implements akbk<SetInteractionMessage> {
        private /* synthetic */ qus a;

        l(qus qus) {
            this.a = qus;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SetInteractionMessage(((pa) this.a.i.b()), InteractionMessagesRecord.Companion.getFACTORY());
        }
    }

    /* renamed from: qus$e */
    static final class e extends akcs implements akbk<DeleteInteractionMessage> {
        private /* synthetic */ qus a;

        e(qus qus) {
            this.a = qus;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeleteInteractionMessage(((pa) this.a.i.b()), InteractionMessagesRecord.Companion.getFACTORY());
        }
    }

    /* renamed from: qus$d */
    static final class d extends akcs implements akbk<DeleteAllInteractionsForFeedEntry> {
        private /* synthetic */ qus a;

        d(qus qus) {
            this.a = qus;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeleteAllInteractionsForFeedEntry(((pa) this.a.i.b()));
        }
    }

    /* renamed from: qus$k */
    static final class k extends akcs implements akbk<UpdateDisplayInfo> {
        private /* synthetic */ qus a;

        k(qus qus) {
            this.a = qus;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateDisplayInfo(((pa) this.a.i.b()));
        }
    }

    /* renamed from: qus$m */
    static final class m extends akcs implements akbk<UpdateSortingTimestampIfMoreRecent> {
        private /* synthetic */ qus a;

        m(qus qus) {
            this.a = qus;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateSortingTimestampIfMoreRecent(((pa) this.a.i.b()));
        }
    }

    /* renamed from: qus$c */
    static final class c extends akcs implements akbk<DeleteAllInteractionMessages> {
        private /* synthetic */ qus a;

        c(qus qus) {
            this.a = qus;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeleteAllInteractionMessages(((pa) this.a.i.b()));
        }
    }

    /* renamed from: qus$i */
    public static final class i<T, R> implements ajfc<T, R> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return Integer.valueOf(list.size());
        }
    }

    /* renamed from: qus$j */
    public static final class j<T, R> implements ajfc<T, R> {
        private /* synthetic */ qus a;

        public j(qus qus) {
            this.a = qus;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return Boolean.valueOf(((GetNewContentInteractionMessagesRow) ajyu.g(list)) != null);
        }
    }

    /* renamed from: qus$b */
    static final class b {
        final long a;
        final Map<InteractionMessageType, qwn> b;

        public b(long j, Map<InteractionMessageType, qwn> map) {
            akcr.b(map, "messages");
            this.a = j;
            this.b = map;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if ((this.a == bVar.a ? 1 : null) == null || !akcr.a(this.b, bVar.b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            Map map = this.b;
            return i + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("FeedMessages(feedId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", messages=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(qus.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(qus.class), "myUsername", "getMyUsername()Ljava/lang/String;"), new akdc(akde.a(qus.class), "myFriendId", "getMyFriendId()J"), new akdc(akde.a(qus.class), "useSnapDataRefactor", "getUseSnapDataRefactor()Z")};
        a aVar = new a();
        Object[] toArray = ajyu.c((Iterable) ajyu.c((Iterable) ajyh.a((Object[]) aetf.values()), (Object) aetf.PARTICIPANT_LEFT), (Object) aetf.UNRECOGNIZED_VALUE).toArray(new aetf[0]);
        if (toArray != null) {
            w = (aetf[]) toArray;
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public qus(ajwy<qvd> ajwy, ajwy<iqx> ajwy2, SnapDb snapDb, gpb gpb, ajwy<iha> ajwy3, Set<pre> set, ihh ihh, ajwy<qdn> ajwy4, ajwy<ftl> ajwy5, ajwy<ilv> ajwy6) {
        akcr.b(ajwy, "messagingRepository");
        akcr.b(ajwy2, "friendRepositoryApi");
        akcr.b(snapDb, "snapDb");
        akcr.b(gpb, "userAuth");
        akcr.b(ajwy3, "serializationHelper");
        akcr.b(set, "feedUpdateCallbacks");
        akcr.b(ihh, "clock");
        akcr.b(ajwy4, "messageExpirationResolver");
        akcr.b(ajwy5, "configProvider");
        akcr.b(ajwy6, "graphene");
        this.p = ajwy;
        this.e = ajwy2;
        this.q = snapDb;
        this.f = gpb;
        this.r = ajwy3;
        this.s = set;
        this.t = ihh;
        this.u = ajwy4;
        this.g = ajwy5;
        this.v = ajwy6;
    }

    private final List<ReadWriteTimeInfo> a(long... jArr) {
        Object obj = this.a;
        akcr.a(obj, "briteDatabase");
        Object selectReadWriteInfo = FeedRecord.FACTORY.selectReadWriteInfo(jArr);
        akcr.a(selectReadWriteInfo, "FeedRecord.FACTORY.selectReadWriteInfo(feedIds)");
        Object obj2 = FeedRecord.SELECT_READ_WRITE_TIME_INFO;
        akcr.a(obj2, "FeedRecord.SELECT_READ_WRITE_TIME_INFO");
        return BriteDatabaseExtensionsKt.queryList(obj, selectReadWriteInfo, obj2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:59:0x01dd in {7, 10, 11, 14, 15, 18, 21, 22, 23, 28, 29, 32, 37, 38, 39, 42, 43, 44, 45, 51, 52, 54, 56, 58} preds:[]
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
    private final java.util.Map<com.snap.core.db.column.InteractionMessageType, defpackage.qwn> a(long r34, java.util.Map<com.snap.core.db.column.InteractionMessageType, defpackage.qwn> r36, java.util.List<? extends com.snap.core.db.record.InteractionMessagesRecord.InteractionMessageRow> r37) {
        /*
        r33 = this;
        r1 = r33;
        r0 = r36;
        r2 = r37;	 Catch:{ all -> 0x01db }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x01db }
        r3 = 10;	 Catch:{ all -> 0x01db }
        r3 = defpackage.ajyn.a(r2, r3);	 Catch:{ all -> 0x01db }
        r3 = defpackage.ajzm.a(r3);	 Catch:{ all -> 0x01db }
        r4 = 16;	 Catch:{ all -> 0x01db }
        r3 = defpackage.akef.b(r3, r4);	 Catch:{ all -> 0x01db }
        r4 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x01db }
        r4.<init>(r3);	 Catch:{ all -> 0x01db }
        r4 = (java.util.Map) r4;	 Catch:{ all -> 0x01db }
        r2 = r2.iterator();	 Catch:{ all -> 0x01db }
        r3 = r2.hasNext();	 Catch:{ all -> 0x01db }
        if (r3 == 0) goto L_0x00c9;	 Catch:{ all -> 0x01db }
        r3 = r2.next();	 Catch:{ all -> 0x01db }
        r8 = r3;	 Catch:{ all -> 0x01db }
        r8 = (com.snap.core.db.record.InteractionMessagesRecord.InteractionMessageRow) r8;	 Catch:{ all -> 0x01db }
        r8 = r8.messageType();	 Catch:{ all -> 0x01db }
        r3 = (com.snap.core.db.record.InteractionMessagesRecord.InteractionMessageRow) r3;	 Catch:{ all -> 0x01db }
        r9 = r1.k;	 Catch:{ all -> 0x01db }
        r9 = r9.b();	 Catch:{ all -> 0x01db }
        r9 = (java.lang.Number) r9;	 Catch:{ all -> 0x01db }
        r9 = r9.longValue();	 Catch:{ all -> 0x01db }
        r11 = r3.senderId();	 Catch:{ all -> 0x01db }
        if (r11 != 0) goto L_0x0049;	 Catch:{ all -> 0x01db }
        goto L_0x0051;	 Catch:{ all -> 0x01db }
        r11 = r11.longValue();	 Catch:{ all -> 0x01db }
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));	 Catch:{ all -> 0x01db }
        if (r13 == 0) goto L_0x0054;	 Catch:{ all -> 0x01db }
        r29 = 1;	 Catch:{ all -> 0x01db }
        goto L_0x0056;	 Catch:{ all -> 0x01db }
        r29 = 0;	 Catch:{ all -> 0x01db }
        r9 = new qwn;	 Catch:{ all -> 0x01db }
        r10 = r3.messageType();	 Catch:{ all -> 0x01db }
        r10 = r10.isNotViewed();	 Catch:{ all -> 0x01db }
        if (r10 != 0) goto L_0x0065;	 Catch:{ all -> 0x01db }
        r28 = 1;	 Catch:{ all -> 0x01db }
        goto L_0x0067;	 Catch:{ all -> 0x01db }
        r28 = 0;	 Catch:{ all -> 0x01db }
        r6 = r3.messageClientStatus();	 Catch:{ all -> 0x01db }
        r7 = "row.messageClientStatus()";	 Catch:{ all -> 0x01db }
        defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x01db }
        r7 = r3.messageBodyType();	 Catch:{ all -> 0x01db }
        r10 = "row.messageBodyType()";	 Catch:{ all -> 0x01db }
        defpackage.akcr.a(r7, r10);	 Catch:{ all -> 0x01db }
        r24 = r3.interactionTimestamp();	 Catch:{ all -> 0x01db }
        r27 = r33.d();	 Catch:{ all -> 0x01db }
        r25 = r3.senderId();	 Catch:{ all -> 0x01db }
        r15 = r3.snapId();	 Catch:{ all -> 0x01db }
        r16 = r3.snapMessageTimestamp();	 Catch:{ all -> 0x01db }
        r10 = r3.hasSound();	 Catch:{ all -> 0x01db }
        if (r10 != 0) goto L_0x0095;	 Catch:{ all -> 0x01db }
        r10 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x01db }
        r17 = r10.booleanValue();	 Catch:{ all -> 0x01db }
        r10 = r3.latestScreenshottedOrReplayed();	 Catch:{ all -> 0x01db }
        if (r10 == 0) goto L_0x00a6;	 Catch:{ all -> 0x01db }
        r5 = r10.latestScreenshottedOrReplayedRecord();	 Catch:{ all -> 0x01db }
        r18 = r5;	 Catch:{ all -> 0x01db }
        goto L_0x00a8;	 Catch:{ all -> 0x01db }
        r18 = 0;	 Catch:{ all -> 0x01db }
        r19 = r3.chatMessageId();	 Catch:{ all -> 0x01db }
        r20 = r3.chatMessageTimestamp();	 Catch:{ all -> 0x01db }
        r21 = r3.mischiefUpdateMessageType();	 Catch:{ all -> 0x01db }
        r3 = r3.friendLinkType();	 Catch:{ all -> 0x01db }
        r26 = defpackage.qus.a(r3);	 Catch:{ all -> 0x01db }
        r14 = r9;	 Catch:{ all -> 0x01db }
        r22 = r6;	 Catch:{ all -> 0x01db }
        r23 = r7;	 Catch:{ all -> 0x01db }
        r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29);	 Catch:{ all -> 0x01db }
        r4.put(r8, r9);	 Catch:{ all -> 0x01db }
        goto L_0x0023;	 Catch:{ all -> 0x01db }
        r2 = com.snap.core.db.column.InteractionMessageType.values();	 Catch:{ all -> 0x01db }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x01db }
        r8 = r2.length;	 Catch:{ all -> 0x01db }
        r3.<init>(r8);	 Catch:{ all -> 0x01db }
        r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x01db }
        r8 = r2.length;	 Catch:{ all -> 0x01db }
        r9 = 0;	 Catch:{ all -> 0x01db }
        if (r9 >= r8) goto L_0x01a9;	 Catch:{ all -> 0x01db }
        r15 = r2[r9];	 Catch:{ all -> 0x01db }
        r10 = r15.isNotViewed();	 Catch:{ all -> 0x01db }
        if (r10 == 0) goto L_0x00e8;	 Catch:{ all -> 0x01db }
        r10 = r0.get(r15);	 Catch:{ all -> 0x01db }
        r10 = (defpackage.qwn) r10;	 Catch:{ all -> 0x01db }
        goto L_0x00f5;	 Catch:{ all -> 0x01db }
        r10 = r0.get(r15);	 Catch:{ all -> 0x01db }
        r10 = (defpackage.qwn) r10;	 Catch:{ all -> 0x01db }
        if (r10 != 0) goto L_0x00f5;	 Catch:{ all -> 0x01db }
        r10 = r4.get(r15);	 Catch:{ all -> 0x01db }
        goto L_0x00e5;	 Catch:{ all -> 0x01db }
        r14 = r10;	 Catch:{ all -> 0x01db }
        if (r14 != 0) goto L_0x0128;	 Catch:{ all -> 0x01db }
        r10 = r15.isNotViewed();	 Catch:{ all -> 0x01db }
        if (r10 == 0) goto L_0x0119;	 Catch:{ all -> 0x01db }
        r10 = r1.n;	 Catch:{ all -> 0x01db }
        r10 = r10.b();	 Catch:{ all -> 0x01db }
        r10 = (com.snap.core.db.record.InteractionMessagesModel.DeleteInteractionMessage) r10;	 Catch:{ all -> 0x01db }
        r11 = r34;	 Catch:{ all -> 0x01db }
        r10.bind(r11, r15);	 Catch:{ all -> 0x01db }
        r10 = r1.a;	 Catch:{ all -> 0x01db }
        r13 = r1.n;	 Catch:{ all -> 0x01db }
        r13 = r13.b();	 Catch:{ all -> 0x01db }
        r13 = (defpackage.ainy) r13;	 Catch:{ all -> 0x01db }
        r10.executeUpdateDelete(r13);	 Catch:{ all -> 0x01db }
        goto L_0x011b;	 Catch:{ all -> 0x01db }
        r11 = r34;	 Catch:{ all -> 0x01db }
        r27 = r2;	 Catch:{ all -> 0x01db }
        r32 = r3;	 Catch:{ all -> 0x01db }
        r28 = r4;	 Catch:{ all -> 0x01db }
        r29 = r8;	 Catch:{ all -> 0x01db }
        r30 = r9;	 Catch:{ all -> 0x01db }
        r3 = r15;	 Catch:{ all -> 0x01db }
        r5 = 0;	 Catch:{ all -> 0x01db }
        goto L_0x0194;	 Catch:{ all -> 0x01db }
        r11 = r34;	 Catch:{ all -> 0x01db }
        r10 = r1.m;	 Catch:{ all -> 0x01db }
        r10 = r10.b();	 Catch:{ all -> 0x01db }
        r10 = (com.snap.core.db.record.InteractionMessagesModel.SetInteractionMessage) r10;	 Catch:{ all -> 0x01db }
        r13 = r14.h;	 Catch:{ all -> 0x01db }
        r5 = r14.i;	 Catch:{ all -> 0x01db }
        r6 = r14.k;	 Catch:{ all -> 0x01db }
        r7 = r14.e;	 Catch:{ all -> 0x01db }
        r0 = r14.f;	 Catch:{ all -> 0x01db }
        r27 = r2;	 Catch:{ all -> 0x01db }
        r2 = r14.g;	 Catch:{ all -> 0x01db }
        r28 = r4;	 Catch:{ all -> 0x01db }
        r4 = r14.a;	 Catch:{ all -> 0x01db }
        r29 = r8;	 Catch:{ all -> 0x01db }
        r8 = r14.c;	 Catch:{ all -> 0x01db }
        r21 = java.lang.Boolean.valueOf(r8);	 Catch:{ all -> 0x01db }
        r8 = r14.b;	 Catch:{ all -> 0x01db }
        r30 = r9;	 Catch:{ all -> 0x01db }
        r9 = r14.j;	 Catch:{ all -> 0x01db }
        r11 = r14.d;	 Catch:{ all -> 0x01db }
        if (r11 == 0) goto L_0x0165;	 Catch:{ all -> 0x01db }
        r11 = com.snap.core.db.column.ScreenshottedOrReplayedState.Companion;	 Catch:{ all -> 0x01db }
        r12 = r14.d;	 Catch:{ all -> 0x01db }
        r12 = defpackage.ajyl.a(r12);	 Catch:{ all -> 0x01db }
        r11 = r11.create(r12);	 Catch:{ all -> 0x01db }
        r24 = r11;	 Catch:{ all -> 0x01db }
        goto L_0x0167;	 Catch:{ all -> 0x01db }
        r24 = 0;	 Catch:{ all -> 0x01db }
        r11 = r34;	 Catch:{ all -> 0x01db }
        r16 = r13;	 Catch:{ all -> 0x01db }
        r13 = r15;	 Catch:{ all -> 0x01db }
        r31 = r14;	 Catch:{ all -> 0x01db }
        r14 = r16;	 Catch:{ all -> 0x01db }
        r32 = r3;	 Catch:{ all -> 0x01db }
        r3 = r15;	 Catch:{ all -> 0x01db }
        r15 = r5;	 Catch:{ all -> 0x01db }
        r16 = r6;	 Catch:{ all -> 0x01db }
        r17 = r7;	 Catch:{ all -> 0x01db }
        r18 = r0;	 Catch:{ all -> 0x01db }
        r19 = r2;	 Catch:{ all -> 0x01db }
        r20 = r4;	 Catch:{ all -> 0x01db }
        r22 = r8;	 Catch:{ all -> 0x01db }
        r23 = r9;	 Catch:{ all -> 0x01db }
        r10.bind(r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);	 Catch:{ all -> 0x01db }
        r0 = r1.a;	 Catch:{ all -> 0x01db }
        r2 = r1.m;	 Catch:{ all -> 0x01db }
        r2 = r2.b();	 Catch:{ all -> 0x01db }
        r2 = (defpackage.ainy) r2;	 Catch:{ all -> 0x01db }
        r0.executeUpdateDelete(r2);	 Catch:{ all -> 0x01db }
        r5 = r31;	 Catch:{ all -> 0x01db }
        r0 = defpackage.ajxs.a(r3, r5);	 Catch:{ all -> 0x01db }
        r3 = r32;	 Catch:{ all -> 0x01db }
        r3.add(r0);	 Catch:{ all -> 0x01db }
        r9 = r30 + 1;	 Catch:{ all -> 0x01db }
        r0 = r36;	 Catch:{ all -> 0x01db }
        r2 = r27;	 Catch:{ all -> 0x01db }
        r4 = r28;	 Catch:{ all -> 0x01db }
        r8 = r29;	 Catch:{ all -> 0x01db }
        goto L_0x00d7;	 Catch:{ all -> 0x01db }
        r3 = (java.util.List) r3;	 Catch:{ all -> 0x01db }
        r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x01db }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x01db }
        r0.<init>();	 Catch:{ all -> 0x01db }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x01db }
        r2 = r3.iterator();	 Catch:{ all -> 0x01db }
        r3 = r2.hasNext();	 Catch:{ all -> 0x01db }
        if (r3 == 0) goto L_0x01d2;	 Catch:{ all -> 0x01db }
        r3 = r2.next();	 Catch:{ all -> 0x01db }
        r4 = r3;	 Catch:{ all -> 0x01db }
        r4 = (defpackage.ajxm) r4;	 Catch:{ all -> 0x01db }
        r4 = r4.b;	 Catch:{ all -> 0x01db }
        if (r4 == 0) goto L_0x01cb;	 Catch:{ all -> 0x01db }
        r4 = 1;	 Catch:{ all -> 0x01db }
        goto L_0x01cc;	 Catch:{ all -> 0x01db }
        r4 = 0;	 Catch:{ all -> 0x01db }
        if (r4 == 0) goto L_0x01b8;	 Catch:{ all -> 0x01db }
        r0.add(r3);	 Catch:{ all -> 0x01db }
        goto L_0x01b8;	 Catch:{ all -> 0x01db }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x01db }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x01db }
        r0 = defpackage.ajzm.a(r0);	 Catch:{ all -> 0x01db }
        return r0;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qus.a(long, java.util.Map, java.util.List):java.util.Map");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:131:0x02e8 in {3, 10, 13, 14, 20, 21, 22, 26, 27, 30, 31, 34, 38, 40, 43, 46, 48, 51, 53, 55, 56, 57, 60, 61, 64, 67, 70, 73, 76, 79, 84, 89, 90, 93, 94, 109, 110, 111, 113, 114, 115, 117, 123, 124, 126, 128, 130} preds:[]
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
    private final java.util.Map<java.lang.Long, defpackage.qwq> a(java.util.Map<java.lang.Long, ? extends java.util.Map<com.snap.core.db.column.InteractionMessageType, defpackage.qwn>> r40, long... r41) {
        /*
        r39 = this;
        r1 = r39;
        r0 = r41;
        r2 = "myUsername";
        r3 = r0.length;
        r3 = java.util.Arrays.copyOf(r0, r3);
        r3 = r1.a(r3);
        r3 = (java.lang.Iterable) r3;
        r4 = 10;
        r4 = defpackage.ajyn.a(r3, r4);
        r4 = defpackage.ajzm.a(r4);
        r5 = 16;
        r4 = defpackage.akef.b(r4, r5);
        r5 = new java.util.LinkedHashMap;
        r5.<init>(r4);
        r5 = (java.util.Map) r5;
        r3 = r3.iterator();
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0044;
        r4 = r3.next();
        r4 = (com.snap.core.db.record.FeedRecord.ReadWriteTimeInfo) r4;
        r6 = r4._id();
        r6 = java.lang.Long.valueOf(r6);
        r5.put(r6, r4);
        goto L_0x002c;
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x02e6 }
        r4 = r0.length;	 Catch:{ all -> 0x02e6 }
        r3.<init>(r4);	 Catch:{ all -> 0x02e6 }
        r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x02e6 }
        r4 = r0.length;	 Catch:{ all -> 0x02e6 }
        r7 = 0;	 Catch:{ all -> 0x02e6 }
        r8 = 1;	 Catch:{ all -> 0x02e6 }
        if (r7 >= r4) goto L_0x02b3;	 Catch:{ all -> 0x02e6 }
        r20 = r0[r7];	 Catch:{ all -> 0x02e6 }
        r9 = java.lang.Long.valueOf(r20);	 Catch:{ all -> 0x02e6 }
        r9 = r5.get(r9);	 Catch:{ all -> 0x02e6 }
        r22 = r9;	 Catch:{ all -> 0x02e6 }
        r22 = (com.snap.core.db.record.FeedRecord.ReadWriteTimeInfo) r22;	 Catch:{ all -> 0x02e6 }
        r9 = java.lang.Long.valueOf(r20);	 Catch:{ all -> 0x02e6 }
        r14 = r40;	 Catch:{ all -> 0x02e6 }
        r9 = r14.get(r9);	 Catch:{ all -> 0x02e6 }
        r9 = (java.util.Map) r9;	 Catch:{ all -> 0x02e6 }
        if (r9 != 0) goto L_0x0071;	 Catch:{ all -> 0x02e6 }
        r9 = defpackage.ajyx.a;	 Catch:{ all -> 0x02e6 }
        r9 = (java.util.Map) r9;	 Catch:{ all -> 0x02e6 }
        r10 = new qwp;	 Catch:{ all -> 0x02e6 }
        r11 = r39.a();	 Catch:{ all -> 0x02e6 }
        defpackage.akcr.a(r11, r2);	 Catch:{ all -> 0x02e6 }
        defpackage.akcr.b(r11, r2);	 Catch:{ all -> 0x02e6 }
        r38 = 0;	 Catch:{ all -> 0x02e6 }
        if (r22 == 0) goto L_0x0086;	 Catch:{ all -> 0x02e6 }
        r12 = r22.lastWriter();	 Catch:{ all -> 0x02e6 }
        goto L_0x0088;	 Catch:{ all -> 0x02e6 }
        r12 = r38;	 Catch:{ all -> 0x02e6 }
        r15 = 0;	 Catch:{ all -> 0x02e6 }
        if (r12 != 0) goto L_0x00ac;	 Catch:{ all -> 0x02e6 }
        r11 = new qwm;	 Catch:{ all -> 0x02e6 }
        r24 = defpackage.iin.UNKNOWN;	 Catch:{ all -> 0x02e6 }
        if (r22 == 0) goto L_0x0098;	 Catch:{ all -> 0x02e6 }
        r12 = r22.lastInteractionTimestamp();	 Catch:{ all -> 0x02e6 }
        if (r12 != 0) goto L_0x009c;	 Catch:{ all -> 0x02e6 }
        r12 = java.lang.Long.valueOf(r15);	 Catch:{ all -> 0x02e6 }
        r25 = r12.longValue();	 Catch:{ all -> 0x02e6 }
        r27 = 0;	 Catch:{ all -> 0x02e6 }
        r28 = 12;	 Catch:{ all -> 0x02e6 }
        r23 = r11;	 Catch:{ all -> 0x02e6 }
        r23.<init>(r24, r25, r27, r28);	 Catch:{ all -> 0x02e6 }
        r37 = r11;	 Catch:{ all -> 0x02e6 }
        goto L_0x011d;	 Catch:{ all -> 0x02e6 }
        r12 = r22.lastWriter();	 Catch:{ all -> 0x02e6 }
        r11 = defpackage.akcr.a(r11, r12);	 Catch:{ all -> 0x02e6 }
        r11 = r11 ^ r8;	 Catch:{ all -> 0x02e6 }
        r12 = r22.lastSnapType();	 Catch:{ all -> 0x02e6 }
        if (r12 != 0) goto L_0x00bd;	 Catch:{ all -> 0x02e6 }
        r12 = 1;	 Catch:{ all -> 0x02e6 }
        goto L_0x00be;	 Catch:{ all -> 0x02e6 }
        r12 = 0;	 Catch:{ all -> 0x02e6 }
        r13 = r22.lastSnapType();	 Catch:{ all -> 0x02e6 }
        if (r13 == 0) goto L_0x00c9;	 Catch:{ all -> 0x02e6 }
        r13 = r13.d();	 Catch:{ all -> 0x02e6 }
        goto L_0x00ca;	 Catch:{ all -> 0x02e6 }
        r13 = 0;	 Catch:{ all -> 0x02e6 }
        if (r11 == 0) goto L_0x00d3;	 Catch:{ all -> 0x02e6 }
        if (r12 == 0) goto L_0x00d3;	 Catch:{ all -> 0x02e6 }
        r11 = defpackage.iin.CHAT_RECEIVED_AND_VIEWED;	 Catch:{ all -> 0x02e6 }
        r24 = r11;	 Catch:{ all -> 0x02e6 }
        goto L_0x00f2;	 Catch:{ all -> 0x02e6 }
        if (r11 == 0) goto L_0x00da;	 Catch:{ all -> 0x02e6 }
        if (r13 == 0) goto L_0x00da;	 Catch:{ all -> 0x02e6 }
        r11 = defpackage.iin.SNAP_RECEIVED_AND_VIEWED_SOUND;	 Catch:{ all -> 0x02e6 }
        goto L_0x00d0;	 Catch:{ all -> 0x02e6 }
        if (r11 == 0) goto L_0x00df;	 Catch:{ all -> 0x02e6 }
        r11 = defpackage.iin.SNAP_RECEIVED_AND_VIEWED_NO_SOUND;	 Catch:{ all -> 0x02e6 }
        goto L_0x00d0;	 Catch:{ all -> 0x02e6 }
        if (r11 != 0) goto L_0x00e6;	 Catch:{ all -> 0x02e6 }
        if (r12 == 0) goto L_0x00e6;	 Catch:{ all -> 0x02e6 }
        r11 = defpackage.iin.CHAT_SENT_AND_OPENED;	 Catch:{ all -> 0x02e6 }
        goto L_0x00d0;	 Catch:{ all -> 0x02e6 }
        if (r11 != 0) goto L_0x00ed;	 Catch:{ all -> 0x02e6 }
        if (r13 == 0) goto L_0x00ed;	 Catch:{ all -> 0x02e6 }
        r11 = defpackage.iin.SNAP_SENT_AND_OPENED_SOUND;	 Catch:{ all -> 0x02e6 }
        goto L_0x00d0;	 Catch:{ all -> 0x02e6 }
        if (r11 != 0) goto L_0x02a1;	 Catch:{ all -> 0x02e6 }
        r11 = defpackage.iin.SNAP_SENT_AND_OPENED_NO_SOUND;	 Catch:{ all -> 0x02e6 }
        goto L_0x00d0;	 Catch:{ all -> 0x02e6 }
        r11 = r22.lastWriteTimestamp();	 Catch:{ all -> 0x02e6 }
        if (r11 != 0) goto L_0x00fc;	 Catch:{ all -> 0x02e6 }
        r11 = r22.lastReadTimestamp();	 Catch:{ all -> 0x02e6 }
        if (r11 != 0) goto L_0x0102;	 Catch:{ all -> 0x02e6 }
        r11 = r22.lastInteractionTimestamp();	 Catch:{ all -> 0x02e6 }
        if (r11 == 0) goto L_0x010b;	 Catch:{ all -> 0x02e6 }
        r11 = r11.longValue();	 Catch:{ all -> 0x02e6 }
        r25 = r11;	 Catch:{ all -> 0x02e6 }
        goto L_0x010d;	 Catch:{ all -> 0x02e6 }
        r25 = r15;	 Catch:{ all -> 0x02e6 }
        r11 = new qwm;	 Catch:{ all -> 0x02e6 }
        r27 = r22.lastWriterUserId();	 Catch:{ all -> 0x02e6 }
        r28 = r22.lastWriterUserId();	 Catch:{ all -> 0x02e6 }
        r23 = r11;	 Catch:{ all -> 0x02e6 }
        r23.<init>(r24, r25, r27, r28);	 Catch:{ all -> 0x02e6 }
        goto L_0x00a9;	 Catch:{ all -> 0x02e6 }
        r11 = com.snap.core.db.column.InteractionMessageType.SENDING;	 Catch:{ all -> 0x02e6 }
        r11 = r9.get(r11);	 Catch:{ all -> 0x02e6 }
        r24 = r11;	 Catch:{ all -> 0x02e6 }
        r24 = (defpackage.qwn) r24;	 Catch:{ all -> 0x02e6 }
        r11 = com.snap.core.db.column.InteractionMessageType.WAITING_TO_SEND;	 Catch:{ all -> 0x02e6 }
        r11 = r9.get(r11);	 Catch:{ all -> 0x02e6 }
        r25 = r11;	 Catch:{ all -> 0x02e6 }
        r25 = (defpackage.qwn) r25;	 Catch:{ all -> 0x02e6 }
        r11 = com.snap.core.db.column.InteractionMessageType.RECEIVED_NOT_VIEWED_SNAP_WITH_SOUND;	 Catch:{ all -> 0x02e6 }
        r11 = r9.get(r11);	 Catch:{ all -> 0x02e6 }
        r26 = r11;	 Catch:{ all -> 0x02e6 }
        r26 = (defpackage.qwn) r26;	 Catch:{ all -> 0x02e6 }
        r11 = com.snap.core.db.column.InteractionMessageType.RECEIVED_NOT_VIEWED_SNAP_WITH_NO_SOUND;	 Catch:{ all -> 0x02e6 }
        r11 = r9.get(r11);	 Catch:{ all -> 0x02e6 }
        r27 = r11;	 Catch:{ all -> 0x02e6 }
        r27 = (defpackage.qwn) r27;	 Catch:{ all -> 0x02e6 }
        r11 = com.snap.core.db.column.InteractionMessageType.RECEIVED_VIEWED_SNAP;	 Catch:{ all -> 0x02e6 }
        r11 = r9.get(r11);	 Catch:{ all -> 0x02e6 }
        r28 = r11;	 Catch:{ all -> 0x02e6 }
        r28 = (defpackage.qwn) r28;	 Catch:{ all -> 0x02e6 }
        r11 = com.snap.core.db.column.InteractionMessageType.RECEIVED_NOT_VIEWED_CHAT;	 Catch:{ all -> 0x02e6 }
        r11 = r9.get(r11);	 Catch:{ all -> 0x02e6 }
        r29 = r11;	 Catch:{ all -> 0x02e6 }
        r29 = (defpackage.qwn) r29;	 Catch:{ all -> 0x02e6 }
        r11 = com.snap.core.db.column.InteractionMessageType.RECEIVED_VIEWED_CHAT;	 Catch:{ all -> 0x02e6 }
        r11 = r9.get(r11);	 Catch:{ all -> 0x02e6 }
        r31 = r11;	 Catch:{ all -> 0x02e6 }
        r31 = (defpackage.qwn) r31;	 Catch:{ all -> 0x02e6 }
        r11 = com.snap.core.db.column.InteractionMessageType.RECEIVED_NOT_VIEWED_UPDATE_MESSAGE;	 Catch:{ all -> 0x02e6 }
        r11 = r9.get(r11);	 Catch:{ all -> 0x02e6 }
        r30 = r11;	 Catch:{ all -> 0x02e6 }
        r30 = (defpackage.qwn) r30;	 Catch:{ all -> 0x02e6 }
        r11 = com.snap.core.db.column.InteractionMessageType.FAILED_TO_SEND;	 Catch:{ all -> 0x02e6 }
        r11 = r9.get(r11);	 Catch:{ all -> 0x02e6 }
        r32 = r11;	 Catch:{ all -> 0x02e6 }
        r32 = (defpackage.qwn) r32;	 Catch:{ all -> 0x02e6 }
        r11 = com.snap.core.db.column.InteractionMessageType.SENT_NOT_VIEWED_SNAP;	 Catch:{ all -> 0x02e6 }
        r11 = r9.get(r11);	 Catch:{ all -> 0x02e6 }
        r33 = r11;	 Catch:{ all -> 0x02e6 }
        r33 = (defpackage.qwn) r33;	 Catch:{ all -> 0x02e6 }
        r11 = com.snap.core.db.column.InteractionMessageType.SENT_VIEWED_SNAP;	 Catch:{ all -> 0x02e6 }
        r11 = r9.get(r11);	 Catch:{ all -> 0x02e6 }
        r34 = r11;	 Catch:{ all -> 0x02e6 }
        r34 = (defpackage.qwn) r34;	 Catch:{ all -> 0x02e6 }
        r11 = com.snap.core.db.column.InteractionMessageType.SENT_NOT_VIEWED_CHAT;	 Catch:{ all -> 0x02e6 }
        r11 = r9.get(r11);	 Catch:{ all -> 0x02e6 }
        r35 = r11;	 Catch:{ all -> 0x02e6 }
        r35 = (defpackage.qwn) r35;	 Catch:{ all -> 0x02e6 }
        r11 = com.snap.core.db.column.InteractionMessageType.SENT_VIEWED_CHAT;	 Catch:{ all -> 0x02e6 }
        r9 = r9.get(r11);	 Catch:{ all -> 0x02e6 }
        r36 = r9;	 Catch:{ all -> 0x02e6 }
        r36 = (defpackage.qwn) r36;	 Catch:{ all -> 0x02e6 }
        r23 = r10;	 Catch:{ all -> 0x02e6 }
        r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37);	 Catch:{ all -> 0x02e6 }
        r9 = "messages";	 Catch:{ all -> 0x02e6 }
        defpackage.akcr.b(r10, r9);	 Catch:{ all -> 0x02e6 }
        r9 = r10.e;	 Catch:{ all -> 0x02e6 }
        if (r9 == 0) goto L_0x01b4;	 Catch:{ all -> 0x02e6 }
        r9 = r10.e;	 Catch:{ all -> 0x02e6 }
        r9 = r9.a();	 Catch:{ all -> 0x02e6 }
        goto L_0x01f8;	 Catch:{ all -> 0x02e6 }
        r9 = r10.g;	 Catch:{ all -> 0x02e6 }
        if (r9 == 0) goto L_0x01bb;	 Catch:{ all -> 0x02e6 }
        r9 = r10.g;	 Catch:{ all -> 0x02e6 }
        goto L_0x01af;	 Catch:{ all -> 0x02e6 }
        r9 = r10.h;	 Catch:{ all -> 0x02e6 }
        if (r9 == 0) goto L_0x01c2;	 Catch:{ all -> 0x02e6 }
        r9 = r10.h;	 Catch:{ all -> 0x02e6 }
        goto L_0x01af;	 Catch:{ all -> 0x02e6 }
        r9 = r10.i;	 Catch:{ all -> 0x02e6 }
        if (r9 == 0) goto L_0x01c9;	 Catch:{ all -> 0x02e6 }
        r9 = r10.i;	 Catch:{ all -> 0x02e6 }
        goto L_0x01af;	 Catch:{ all -> 0x02e6 }
        r9 = r10.j;	 Catch:{ all -> 0x02e6 }
        if (r9 == 0) goto L_0x01d0;	 Catch:{ all -> 0x02e6 }
        r9 = r10.j;	 Catch:{ all -> 0x02e6 }
        goto L_0x01af;	 Catch:{ all -> 0x02e6 }
        r9 = r10.f;	 Catch:{ all -> 0x02e6 }
        if (r9 == 0) goto L_0x01d7;	 Catch:{ all -> 0x02e6 }
        r9 = r10.f;	 Catch:{ all -> 0x02e6 }
        goto L_0x01af;	 Catch:{ all -> 0x02e6 }
        r9 = r10.k;	 Catch:{ all -> 0x02e6 }
        if (r9 == 0) goto L_0x01de;	 Catch:{ all -> 0x02e6 }
        r9 = r10.k;	 Catch:{ all -> 0x02e6 }
        goto L_0x01af;	 Catch:{ all -> 0x02e6 }
        r9 = r10.c;	 Catch:{ all -> 0x02e6 }
        if (r9 == 0) goto L_0x01ea;	 Catch:{ all -> 0x02e6 }
        r9 = r10.b;	 Catch:{ all -> 0x02e6 }
        if (r9 != 0) goto L_0x01af;	 Catch:{ all -> 0x02e6 }
        defpackage.akcr.a();	 Catch:{ all -> 0x02e6 }
        goto L_0x01af;	 Catch:{ all -> 0x02e6 }
        r9 = r10.d;	 Catch:{ all -> 0x02e6 }
        if (r9 == 0) goto L_0x01f6;	 Catch:{ all -> 0x02e6 }
        r9 = r10.a;	 Catch:{ all -> 0x02e6 }
        if (r9 != 0) goto L_0x01af;	 Catch:{ all -> 0x02e6 }
        defpackage.akcr.a();	 Catch:{ all -> 0x02e6 }
        goto L_0x01af;	 Catch:{ all -> 0x02e6 }
        r9 = r10.l;	 Catch:{ all -> 0x02e6 }
        r10 = r10.l;	 Catch:{ all -> 0x02e6 }
        r11 = r1.p;	 Catch:{ all -> 0x02e6 }
        r11 = r11.get();	 Catch:{ all -> 0x02e6 }
        r11 = (defpackage.qvd) r11;	 Catch:{ all -> 0x02e6 }
        r12 = java.lang.Long.valueOf(r20);	 Catch:{ all -> 0x02e6 }
        r11 = r11.c(r12);	 Catch:{ all -> 0x02e6 }
        r24 = r7;	 Catch:{ all -> 0x02e6 }
        r6 = r10.b;	 Catch:{ all -> 0x02e6 }
        r6 = java.lang.Math.max(r6, r11);	 Catch:{ all -> 0x02e6 }
        r12 = r9.a;	 Catch:{ all -> 0x02e6 }
        r10 = r9.b;	 Catch:{ all -> 0x02e6 }
        r17 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x02e6 }
        r13 = r9.c;	 Catch:{ all -> 0x02e6 }
        r10 = r9.d;	 Catch:{ all -> 0x02e6 }
        if (r17 != 0) goto L_0x0221;	 Catch:{ all -> 0x02e6 }
        goto L_0x0225;	 Catch:{ all -> 0x02e6 }
        r15 = r17.longValue();	 Catch:{ all -> 0x02e6 }
        r11 = new qwq;	 Catch:{ all -> 0x02e6 }
        r9 = r11;	 Catch:{ all -> 0x02e6 }
        r19 = r10;	 Catch:{ all -> 0x02e6 }
        r8 = r11;	 Catch:{ all -> 0x02e6 }
        r10 = r20;	 Catch:{ all -> 0x02e6 }
        r18 = r12;	 Catch:{ all -> 0x02e6 }
        r26 = r13;	 Catch:{ all -> 0x02e6 }
        r12 = r15;	 Catch:{ all -> 0x02e6 }
        r14 = r6;	 Catch:{ all -> 0x02e6 }
        r16 = r18;	 Catch:{ all -> 0x02e6 }
        r18 = r26;	 Catch:{ all -> 0x02e6 }
        r9.<init>(r10, r12, r14, r16, r17, r18, r19);	 Catch:{ all -> 0x02e6 }
        r6 = java.lang.Long.valueOf(r20);	 Catch:{ all -> 0x02e6 }
        if (r22 == 0) goto L_0x0290;	 Catch:{ all -> 0x02e6 }
        r9 = r22.displayTimestamp();	 Catch:{ all -> 0x02e6 }
        r11 = r8.a;	 Catch:{ all -> 0x02e6 }
        r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));	 Catch:{ all -> 0x02e6 }
        if (r7 != 0) goto L_0x0290;	 Catch:{ all -> 0x02e6 }
        r7 = r22.displayInteractionType();	 Catch:{ all -> 0x02e6 }
        r9 = r8.c;	 Catch:{ all -> 0x02e6 }
        r9 = r9.toString();	 Catch:{ all -> 0x02e6 }
        r7 = defpackage.akcr.a(r7, r9);	 Catch:{ all -> 0x02e6 }
        r9 = 1;	 Catch:{ all -> 0x02e6 }
        r7 = r7 ^ r9;	 Catch:{ all -> 0x02e6 }
        if (r7 != 0) goto L_0x0291;	 Catch:{ all -> 0x02e6 }
        r7 = r22.lastInteractionTimestamp();	 Catch:{ all -> 0x02e6 }
        r10 = r8.d;	 Catch:{ all -> 0x02e6 }
        r7 = defpackage.akcr.a(r7, r10);	 Catch:{ all -> 0x02e6 }
        r7 = r7 ^ r9;	 Catch:{ all -> 0x02e6 }
        if (r7 != 0) goto L_0x0291;	 Catch:{ all -> 0x02e6 }
        r7 = r22.lastInteractionUserId();	 Catch:{ all -> 0x02e6 }
        r10 = r8.e;	 Catch:{ all -> 0x02e6 }
        r7 = defpackage.akcr.a(r7, r10);	 Catch:{ all -> 0x02e6 }
        r7 = r7 ^ r9;	 Catch:{ all -> 0x02e6 }
        if (r7 != 0) goto L_0x0291;	 Catch:{ all -> 0x02e6 }
        r7 = r22.lastWriterUserId();	 Catch:{ all -> 0x02e6 }
        r10 = r8.f;	 Catch:{ all -> 0x02e6 }
        r7 = defpackage.akcr.a(r7, r10);	 Catch:{ all -> 0x02e6 }
        r7 = r7 ^ r9;	 Catch:{ all -> 0x02e6 }
        if (r7 != 0) goto L_0x0291;	 Catch:{ all -> 0x02e6 }
        r10 = r22.sortingTimestamp();	 Catch:{ all -> 0x02e6 }
        r12 = r8.b;	 Catch:{ all -> 0x02e6 }
        r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));	 Catch:{ all -> 0x02e6 }
        if (r7 == 0) goto L_0x028e;	 Catch:{ all -> 0x02e6 }
        goto L_0x0291;	 Catch:{ all -> 0x02e6 }
        r9 = 0;	 Catch:{ all -> 0x02e6 }
        goto L_0x0291;	 Catch:{ all -> 0x02e6 }
        r9 = 1;	 Catch:{ all -> 0x02e6 }
        if (r9 == 0) goto L_0x0294;	 Catch:{ all -> 0x02e6 }
        goto L_0x0296;	 Catch:{ all -> 0x02e6 }
        r8 = r38;	 Catch:{ all -> 0x02e6 }
        r6 = defpackage.ajxs.a(r6, r8);	 Catch:{ all -> 0x02e6 }
        r3.add(r6);	 Catch:{ all -> 0x02e6 }
        r7 = r24 + 1;	 Catch:{ all -> 0x02e6 }
        goto L_0x004e;	 Catch:{ all -> 0x02e6 }
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x02e6 }
        r2 = "A boolean is not true or false! ";	 Catch:{ all -> 0x02e6 }
        r3 = java.lang.String.valueOf(r22);	 Catch:{ all -> 0x02e6 }
        r2 = r2.concat(r3);	 Catch:{ all -> 0x02e6 }
        r0.<init>(r2);	 Catch:{ all -> 0x02e6 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x02e6 }
        throw r0;	 Catch:{ all -> 0x02e6 }
        r9 = 1;	 Catch:{ all -> 0x02e6 }
        r3 = (java.util.List) r3;	 Catch:{ all -> 0x02e6 }
        r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x02e6 }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x02e6 }
        r0.<init>();	 Catch:{ all -> 0x02e6 }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x02e6 }
        r2 = r3.iterator();	 Catch:{ all -> 0x02e6 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x02e6 }
        if (r3 == 0) goto L_0x02dd;	 Catch:{ all -> 0x02e6 }
        r3 = r2.next();	 Catch:{ all -> 0x02e6 }
        r4 = r3;	 Catch:{ all -> 0x02e6 }
        r4 = (defpackage.ajxm) r4;	 Catch:{ all -> 0x02e6 }
        r4 = r4.b;	 Catch:{ all -> 0x02e6 }
        if (r4 == 0) goto L_0x02d6;	 Catch:{ all -> 0x02e6 }
        r4 = 1;	 Catch:{ all -> 0x02e6 }
        goto L_0x02d7;	 Catch:{ all -> 0x02e6 }
        r4 = 0;	 Catch:{ all -> 0x02e6 }
        if (r4 == 0) goto L_0x02c3;	 Catch:{ all -> 0x02e6 }
        r0.add(r3);	 Catch:{ all -> 0x02e6 }
        goto L_0x02c3;	 Catch:{ all -> 0x02e6 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x02e6 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x02e6 }
        r0 = defpackage.ajzm.a(r0);	 Catch:{ all -> 0x02e6 }
        return r0;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qus.a(java.util.Map, long[]):java.util.Map");
    }

    private Map<Long, qwn> a(boolean z, long... jArr) {
        akcr.b(jArr, "feedIds");
        if (a() != null) {
            List a = ((qvd) this.p.get()).a(ajyh.a(jArr));
            if (a != null) {
                Collection arrayList = new ArrayList();
                for (Object next : a) {
                    if ((a((LastReceivedNotViewedChat) next) ^ 1) != 0) {
                        arrayList.add(next);
                    }
                }
                Iterable<LastReceivedNotViewedChat> iterable = (List) arrayList;
                Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
                for (LastReceivedNotViewedChat lastReceivedNotViewedChat : iterable) {
                    Long feedRowId = lastReceivedNotViewedChat.feedRowId();
                    if (feedRowId == null) {
                        akcr.a();
                    }
                    qwn qwn = r5;
                    qwn qwn2 = new qwn(null, null, false, null, lastReceivedNotViewedChat.key(), Long.valueOf(lastReceivedNotViewedChat.timestamp()), null, MessageClientStatus.OK, LocalMessageBodyType.Companion.getEnum(lastReceivedNotViewedChat.type()), null, lastReceivedNotViewedChat.senderId(), false, z, false, true, 10831);
                    linkedHashMap.put(feedRowId, qwn);
                }
                return linkedHashMap;
            }
        }
        return ajyx.a;
    }

    private final Map<Long, qwn> a(MessageClientStatus[] messageClientStatusArr, boolean z, long... jArr) {
        if (a() != null) {
            List a = ((qvd) this.p.get()).a(ajyh.a(jArr), messageClientStatusArr);
            if (a != null) {
                Iterable<LastMessageWithClientStatus> iterable = a;
                Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
                for (LastMessageWithClientStatus lastMessageWithClientStatus : iterable) {
                    Long feedRowId = lastMessageWithClientStatus.feedRowId();
                    if (feedRowId == null) {
                        akcr.a();
                    }
                    LocalMessageBodyType localMessageBodyType = LocalMessageBodyType.Companion.getEnum(lastMessageWithClientStatus.type());
                    String chatMessageId = c() ? lastMessageWithClientStatus.chatMessageId() : lastMessageWithClientStatus.snapId();
                    Object obj = localMessageBodyType == LocalMessageBodyType.SNAP ? 1 : null;
                    Object obj2 = null;
                    if (obj == null || chatMessageId != null) {
                        String chatMessageId2 = lastMessageWithClientStatus.chatMessageId();
                        Object clientStatus = lastMessageWithClientStatus.clientStatus();
                        if (clientStatus == null) {
                            akcr.a();
                        }
                        akcr.a(clientStatus, "it.clientStatus()!!");
                        obj2 = new qwn(chatMessageId, obj != null ? Long.valueOf(lastMessageWithClientStatus.timestamp()) : null, false, null, chatMessageId2, obj == null ? Long.valueOf(lastMessageWithClientStatus.timestamp()) : null, null, clientStatus, localMessageBodyType, null, lastMessageWithClientStatus.senderId(), false, z, false, false, 27212);
                    }
                    linkedHashMap.put(feedRowId, obj2);
                }
                return linkedHashMap;
            }
        }
        return ajyx.a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x014f in {3, 4, 7, 10, 13, 16, 19, 22, 23, 25, 27} preds:[]
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
    private final defpackage.qus.b a(long r10) {
        /*
        r9 = this;
        r0 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x014d }
        r0.<init>();	 Catch:{ all -> 0x014d }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x014d }
        r1 = r9.d();	 Catch:{ all -> 0x014d }
        r2 = 1;	 Catch:{ all -> 0x014d }
        r3 = new long[r2];	 Catch:{ all -> 0x014d }
        r4 = 0;	 Catch:{ all -> 0x014d }
        r3[r4] = r10;	 Catch:{ all -> 0x014d }
        r3 = r9.f(r1, r3);	 Catch:{ all -> 0x014d }
        r5 = r3.isEmpty();	 Catch:{ all -> 0x014d }
        r5 = r5 ^ r2;	 Catch:{ all -> 0x014d }
        if (r5 == 0) goto L_0x002b;	 Catch:{ all -> 0x014d }
        r1 = com.snap.core.db.column.InteractionMessageType.WAITING_TO_SEND;	 Catch:{ all -> 0x014d }
        r2 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014d }
        r2 = r3.get(r2);	 Catch:{ all -> 0x014d }
        r0.put(r1, r2);	 Catch:{ all -> 0x014d }
        goto L_0x0147;	 Catch:{ all -> 0x014d }
        r3 = new long[r2];	 Catch:{ all -> 0x014d }
        r3[r4] = r10;	 Catch:{ all -> 0x014d }
        r3 = r9.l(r1, r3);	 Catch:{ all -> 0x014d }
        r5 = r3.isEmpty();	 Catch:{ all -> 0x014d }
        r5 = r5 ^ r2;	 Catch:{ all -> 0x014d }
        if (r5 == 0) goto L_0x0045;	 Catch:{ all -> 0x014d }
        r1 = com.snap.core.db.column.InteractionMessageType.RECEIVED_NOT_VIEWED_SNAP_WITH_SOUND;	 Catch:{ all -> 0x014d }
        r2 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014d }
        r2 = r3.get(r2);	 Catch:{ all -> 0x014d }
        goto L_0x0026;	 Catch:{ all -> 0x014d }
        r3 = new long[r2];	 Catch:{ all -> 0x014d }
        r3[r4] = r10;	 Catch:{ all -> 0x014d }
        r3 = r9.m(r1, r3);	 Catch:{ all -> 0x014d }
        r5 = r3.isEmpty();	 Catch:{ all -> 0x014d }
        r5 = r5 ^ r2;	 Catch:{ all -> 0x014d }
        if (r5 == 0) goto L_0x005f;	 Catch:{ all -> 0x014d }
        r1 = com.snap.core.db.column.InteractionMessageType.RECEIVED_NOT_VIEWED_SNAP_WITH_NO_SOUND;	 Catch:{ all -> 0x014d }
        r2 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014d }
        r2 = r3.get(r2);	 Catch:{ all -> 0x014d }
        goto L_0x0026;	 Catch:{ all -> 0x014d }
        r3 = new long[r2];	 Catch:{ all -> 0x014d }
        r3[r4] = r10;	 Catch:{ all -> 0x014d }
        r3 = r9.a(r1, r3);	 Catch:{ all -> 0x014d }
        r5 = r3.isEmpty();	 Catch:{ all -> 0x014d }
        r5 = r5 ^ r2;	 Catch:{ all -> 0x014d }
        if (r5 == 0) goto L_0x0079;	 Catch:{ all -> 0x014d }
        r1 = com.snap.core.db.column.InteractionMessageType.RECEIVED_NOT_VIEWED_CHAT;	 Catch:{ all -> 0x014d }
        r2 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014d }
        r2 = r3.get(r2);	 Catch:{ all -> 0x014d }
        goto L_0x0026;	 Catch:{ all -> 0x014d }
        r3 = new long[r2];	 Catch:{ all -> 0x014d }
        r3[r4] = r10;	 Catch:{ all -> 0x014d }
        r3 = r9.e(r1, r3);	 Catch:{ all -> 0x014d }
        r5 = r3.isEmpty();	 Catch:{ all -> 0x014d }
        r5 = r5 ^ r2;	 Catch:{ all -> 0x014d }
        if (r5 == 0) goto L_0x0093;	 Catch:{ all -> 0x014d }
        r1 = com.snap.core.db.column.InteractionMessageType.RECEIVED_NOT_VIEWED_UPDATE_MESSAGE;	 Catch:{ all -> 0x014d }
        r2 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014d }
        r2 = r3.get(r2);	 Catch:{ all -> 0x014d }
        goto L_0x0026;	 Catch:{ all -> 0x014d }
        r3 = new long[r2];	 Catch:{ all -> 0x014d }
        r3[r4] = r10;	 Catch:{ all -> 0x014d }
        r3 = r9.g(r1, r3);	 Catch:{ all -> 0x014d }
        r5 = r3.isEmpty();	 Catch:{ all -> 0x014d }
        r5 = r5 ^ r2;	 Catch:{ all -> 0x014d }
        if (r5 == 0) goto L_0x00ae;	 Catch:{ all -> 0x014d }
        r1 = com.snap.core.db.column.InteractionMessageType.WAITING_TO_SEND;	 Catch:{ all -> 0x014d }
        r2 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014d }
        r2 = r3.get(r2);	 Catch:{ all -> 0x014d }
        goto L_0x0026;	 Catch:{ all -> 0x014d }
        r3 = new long[r2];	 Catch:{ all -> 0x014d }
        r3[r4] = r10;	 Catch:{ all -> 0x014d }
        r3 = r9.h(r1, r3);	 Catch:{ all -> 0x014d }
        r5 = r3.isEmpty();	 Catch:{ all -> 0x014d }
        r5 = r5 ^ r2;	 Catch:{ all -> 0x014d }
        if (r5 == 0) goto L_0x00c9;	 Catch:{ all -> 0x014d }
        r1 = com.snap.core.db.column.InteractionMessageType.FAILED_TO_SEND;	 Catch:{ all -> 0x014d }
        r2 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014d }
        r2 = r3.get(r2);	 Catch:{ all -> 0x014d }
        goto L_0x0026;	 Catch:{ all -> 0x014d }
        r3 = new long[r2];	 Catch:{ all -> 0x014d }
        r3[r4] = r10;	 Catch:{ all -> 0x014d }
        r3 = r9.k(r1, r3);	 Catch:{ all -> 0x014d }
        r5 = new long[r2];	 Catch:{ all -> 0x014d }
        r5[r4] = r10;	 Catch:{ all -> 0x014d }
        r5 = r9.c(r1, r5);	 Catch:{ all -> 0x014d }
        r6 = new long[r2];	 Catch:{ all -> 0x014d }
        r6[r4] = r10;	 Catch:{ all -> 0x014d }
        r6 = r9.i(r1, r6);	 Catch:{ all -> 0x014d }
        r7 = new long[r2];	 Catch:{ all -> 0x014d }
        r7[r4] = r10;	 Catch:{ all -> 0x014d }
        r7 = r9.j(r1, r7);	 Catch:{ all -> 0x014d }
        r8 = new long[r2];	 Catch:{ all -> 0x014d }
        r8[r4] = r10;	 Catch:{ all -> 0x014d }
        r8 = r9.b(r1, r8);	 Catch:{ all -> 0x014d }
        r2 = new long[r2];	 Catch:{ all -> 0x014d }
        r2[r4] = r10;	 Catch:{ all -> 0x014d }
        r1 = r9.d(r1, r2);	 Catch:{ all -> 0x014d }
        r2 = com.snap.core.db.column.InteractionMessageType.RECEIVED_VIEWED_SNAP;	 Catch:{ all -> 0x014d }
        r4 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014d }
        r3 = r3.get(r4);	 Catch:{ all -> 0x014d }
        r0.put(r2, r3);	 Catch:{ all -> 0x014d }
        r2 = com.snap.core.db.column.InteractionMessageType.RECEIVED_VIEWED_CHAT;	 Catch:{ all -> 0x014d }
        r3 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014d }
        r3 = r5.get(r3);	 Catch:{ all -> 0x014d }
        r0.put(r2, r3);	 Catch:{ all -> 0x014d }
        r2 = com.snap.core.db.column.InteractionMessageType.SENT_NOT_VIEWED_SNAP;	 Catch:{ all -> 0x014d }
        r3 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014d }
        r3 = r6.get(r3);	 Catch:{ all -> 0x014d }
        r0.put(r2, r3);	 Catch:{ all -> 0x014d }
        r2 = com.snap.core.db.column.InteractionMessageType.SENT_VIEWED_SNAP;	 Catch:{ all -> 0x014d }
        r3 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014d }
        r3 = r7.get(r3);	 Catch:{ all -> 0x014d }
        r0.put(r2, r3);	 Catch:{ all -> 0x014d }
        r2 = com.snap.core.db.column.InteractionMessageType.SENT_NOT_VIEWED_CHAT;	 Catch:{ all -> 0x014d }
        r3 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014d }
        r3 = r8.get(r3);	 Catch:{ all -> 0x014d }
        r0.put(r2, r3);	 Catch:{ all -> 0x014d }
        r2 = com.snap.core.db.column.InteractionMessageType.SENT_VIEWED_CHAT;	 Catch:{ all -> 0x014d }
        r3 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014d }
        r1 = r1.get(r3);	 Catch:{ all -> 0x014d }
        r0.put(r2, r1);	 Catch:{ all -> 0x014d }
        r1 = new qus$b;	 Catch:{ all -> 0x014d }
        r1.<init>(r10, r0);	 Catch:{ all -> 0x014d }
        return r1;
        r10 = move-exception;
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qus.a(long):qus$b");
    }

    private final void a(DbTransaction dbTransaction, Map<Long, ? extends Map<InteractionMessageType, qwn>> map, long... jArr) {
        long[] jArr2 = jArr;
        if (a() != null) {
            Map a = a((Map) map, Arrays.copyOf(jArr2, jArr2.length));
            int length = jArr2.length;
            int i = 0;
            while (i < length) {
                Map map2;
                int i2;
                long j = jArr2[i];
                qwq qwq = (qwq) a.get(Long.valueOf(j));
                if (qwq != null) {
                    map2 = a;
                    i2 = length;
                    ((UpdateDisplayInfo) this.o.b()).bind(qwq.a, qwq.c.toString(), qwq.d, qwq.e, qwq.f, qwq.b, j);
                    this.a.executeUpdateDelete((ainy) this.o.b());
                } else {
                    map2 = a;
                    i2 = length;
                }
                i++;
                a = map2;
                length = i2;
            }
            for (pre a2 : this.s) {
                a2.a(this.q, dbTransaction, Arrays.copyOf(jArr2, jArr2.length));
            }
        }
    }

    private static boolean a(FriendLinkType friendLinkType) {
        return friendLinkType == FriendLinkType.OUTGOING;
    }

    private static boolean a(GetLastSentSnapForMessageModel getLastSentSnapForMessageModel) {
        gcp[] gcpArr = gcp.soundSnapTypes;
        Object content = getLastSentSnapForMessageModel.content();
        if (content == null) {
            akcr.a();
        }
        akcr.a(content, "this.content()!!");
        return ajyi.a((Object[]) gcpArr, (Object) a.a(content).h);
    }

    private static boolean a(GetReceivedSnapsModel getReceivedSnapsModel) {
        gcp[] gcpArr = gcp.soundSnapTypes;
        Object content = getReceivedSnapsModel.content();
        if (content == null) {
            akcr.a();
        }
        akcr.a(content, "this.content()!!");
        return ajyi.a((Object[]) gcpArr, (Object) a.a(content).h);
    }

    private final boolean a(LastReceivedNotViewedChat lastReceivedNotViewedChat) {
        return a(lastReceivedNotViewedChat.released(), lastReceivedNotViewedChat.timestamp(), lastReceivedNotViewedChat.seenTimestamp(), lastReceivedNotViewedChat.type(), lastReceivedNotViewedChat.clientStatus(), lastReceivedNotViewedChat.isSaved(), lastReceivedNotViewedChat.isPreserved(), lastReceivedNotViewedChat.isGroup(), lastReceivedNotViewedChat.messageRetentionInMinutes());
    }

    private final boolean a(LastReceivedNotViewedUpdateMessage lastReceivedNotViewedUpdateMessage) {
        return a(lastReceivedNotViewedUpdateMessage.released(), lastReceivedNotViewedUpdateMessage.timestamp(), lastReceivedNotViewedUpdateMessage.seenTimestamp(), lastReceivedNotViewedUpdateMessage.type(), lastReceivedNotViewedUpdateMessage.clientStatus(), lastReceivedNotViewedUpdateMessage.isSaved(), lastReceivedNotViewedUpdateMessage.isPreserved(), lastReceivedNotViewedUpdateMessage.isGroup(), Long.valueOf(lastReceivedNotViewedUpdateMessage.messageRetentionInMinutes()));
    }

    private final boolean a(boolean z, long j, Long l, String str, MessageClientStatus messageClientStatus, boolean z2, boolean z3, boolean z4, Long l2) {
        this.u.get();
        return qdn.a(new qdk(z, j, l, str == null ? "" : str, messageClientStatus == null ? MessageClientStatus.OK : messageClientStatus, z2, z3, z4), qdn.a.a(z4, l2), this.t.a(), l2);
    }

    private final List<InteractionMessageRow> b(long... jArr) {
        Object obj = this.a;
        akcr.a(obj, "briteDatabase");
        Object interactionMessages = InteractionMessagesRecord.Companion.getFACTORY().getInteractionMessages(jArr);
        akcr.a(interactionMessages, "InteractionMessagesRecor…eractionMessages(feedIds)");
        return BriteDatabaseExtensionsKt.queryList(obj, interactionMessages, InteractionMessagesRecord.Companion.getINTERACTION_MESSAGE_ROW_MAPPER());
    }

    private Map<Long, qwn> b(boolean z, long... jArr) {
        akcr.b(jArr, "feedIds");
        if (a() != null) {
            List b = ((qvd) this.p.get()).b(ajyh.a(jArr));
            if (b != null) {
                Iterable<LastSentNotViewedChat> iterable = b;
                Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
                for (LastSentNotViewedChat lastSentNotViewedChat : iterable) {
                    Long feedRowId = lastSentNotViewedChat.feedRowId();
                    if (feedRowId == null) {
                        akcr.a();
                    }
                    qwn qwn = r5;
                    qwn qwn2 = new qwn(null, null, false, null, lastSentNotViewedChat.key(), Long.valueOf(lastSentNotViewedChat.timestamp()), null, MessageClientStatus.OK, LocalMessageBodyType.Companion.getEnum(lastSentNotViewedChat.type()), null, lastSentNotViewedChat.senderId(), qus.a(lastSentNotViewedChat.friendLinkType()), z, false, false, 25167);
                    linkedHashMap.put(feedRowId, qwn);
                }
                return linkedHashMap;
            }
        }
        return ajyx.a;
    }

    private final List<b> c(long... jArr) {
        return jArr.length == 1 ? ajyl.a(a(jArr[0])) : jArr.length > 1 ? d(Arrays.copyOf(jArr, jArr.length)) : ajyw.a;
    }

    private Map<Long, qwn> c(boolean z, long... jArr) {
        akcr.b(jArr, "feedIds");
        if (a() != null) {
            List c = ((qvd) this.p.get()).c(ajyh.a(jArr));
            if (c != null) {
                Iterable<LastReceivedViewedChat> iterable = c;
                Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
                for (LastReceivedViewedChat lastReceivedViewedChat : iterable) {
                    Long feedRowId = lastReceivedViewedChat.feedRowId();
                    if (feedRowId == null) {
                        akcr.a();
                    }
                    qwn qwn = r5;
                    qwn qwn2 = new qwn(null, null, false, null, lastReceivedViewedChat.key(), Long.valueOf(lastReceivedViewedChat.timestamp()), null, MessageClientStatus.OK, LocalMessageBodyType.Companion.getEnum(lastReceivedViewedChat.type()), null, lastReceivedViewedChat.senderId(), false, z, true, true, 2639);
                    linkedHashMap.put(feedRowId, qwn);
                }
                return linkedHashMap;
            }
        }
        return ajyx.a;
    }

    private boolean c() {
        return ((Boolean) this.l.b()).booleanValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x01a4 in {8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 28, 30} preds:[]
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
    private final java.util.List<defpackage.qus.b> d(long... r27) {
        /*
        r26 = this;
        r1 = r26;
        r0 = r27;
        r2 = r26.d();	 Catch:{ all -> 0x01a2 }
        r3 = r0.length;	 Catch:{ all -> 0x01a2 }
        r3 = java.util.Arrays.copyOf(r0, r3);	 Catch:{ all -> 0x01a2 }
        r3 = r1.f(r2, r3);	 Catch:{ all -> 0x01a2 }
        r4 = r0.length;	 Catch:{ all -> 0x01a2 }
        r4 = java.util.Arrays.copyOf(r0, r4);	 Catch:{ all -> 0x01a2 }
        r4 = r1.g(r2, r4);	 Catch:{ all -> 0x01a2 }
        r5 = r0.length;	 Catch:{ all -> 0x01a2 }
        r5 = java.util.Arrays.copyOf(r0, r5);	 Catch:{ all -> 0x01a2 }
        r5 = r1.h(r2, r5);	 Catch:{ all -> 0x01a2 }
        r6 = r0.length;	 Catch:{ all -> 0x01a2 }
        r6 = java.util.Arrays.copyOf(r0, r6);	 Catch:{ all -> 0x01a2 }
        r6 = r1.a(r2, r6);	 Catch:{ all -> 0x01a2 }
        r7 = r0.length;	 Catch:{ all -> 0x01a2 }
        r7 = java.util.Arrays.copyOf(r0, r7);	 Catch:{ all -> 0x01a2 }
        r7 = r1.l(r2, r7);	 Catch:{ all -> 0x01a2 }
        r8 = r0.length;	 Catch:{ all -> 0x01a2 }
        r8 = java.util.Arrays.copyOf(r0, r8);	 Catch:{ all -> 0x01a2 }
        r8 = r1.m(r2, r8);	 Catch:{ all -> 0x01a2 }
        r9 = r0.length;	 Catch:{ all -> 0x01a2 }
        r9 = java.util.Arrays.copyOf(r0, r9);	 Catch:{ all -> 0x01a2 }
        r9 = r1.k(r2, r9);	 Catch:{ all -> 0x01a2 }
        r10 = r0.length;	 Catch:{ all -> 0x01a2 }
        r10 = java.util.Arrays.copyOf(r0, r10);	 Catch:{ all -> 0x01a2 }
        r10 = r1.c(r2, r10);	 Catch:{ all -> 0x01a2 }
        r11 = r0.length;	 Catch:{ all -> 0x01a2 }
        r11 = java.util.Arrays.copyOf(r0, r11);	 Catch:{ all -> 0x01a2 }
        r11 = r1.i(r2, r11);	 Catch:{ all -> 0x01a2 }
        r12 = r0.length;	 Catch:{ all -> 0x01a2 }
        r12 = java.util.Arrays.copyOf(r0, r12);	 Catch:{ all -> 0x01a2 }
        r12 = r1.j(r2, r12);	 Catch:{ all -> 0x01a2 }
        r13 = r0.length;	 Catch:{ all -> 0x01a2 }
        r13 = java.util.Arrays.copyOf(r0, r13);	 Catch:{ all -> 0x01a2 }
        r13 = r1.b(r2, r13);	 Catch:{ all -> 0x01a2 }
        r14 = r0.length;	 Catch:{ all -> 0x01a2 }
        r14 = java.util.Arrays.copyOf(r0, r14);	 Catch:{ all -> 0x01a2 }
        r14 = r1.d(r2, r14);	 Catch:{ all -> 0x01a2 }
        r15 = r0.length;	 Catch:{ all -> 0x01a2 }
        r15 = java.util.Arrays.copyOf(r0, r15);	 Catch:{ all -> 0x01a2 }
        r2 = r1.e(r2, r15);	 Catch:{ all -> 0x01a2 }
        r15 = new java.util.ArrayList;	 Catch:{ all -> 0x01a2 }
        r1 = r0.length;	 Catch:{ all -> 0x01a2 }
        r15.<init>(r1);	 Catch:{ all -> 0x01a2 }
        r15 = (java.util.Collection) r15;	 Catch:{ all -> 0x01a2 }
        r1 = r0.length;	 Catch:{ all -> 0x01a2 }
        r16 = 0;	 Catch:{ all -> 0x01a2 }
        r17 = r15;	 Catch:{ all -> 0x01a2 }
        r15 = 0;	 Catch:{ all -> 0x01a2 }
        if (r15 >= r1) goto L_0x019d;	 Catch:{ all -> 0x01a2 }
        r18 = r3;	 Catch:{ all -> 0x01a2 }
        r19 = r4;	 Catch:{ all -> 0x01a2 }
        r3 = r0[r15];	 Catch:{ all -> 0x01a2 }
        r20 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x01a2 }
        r20.<init>();	 Catch:{ all -> 0x01a2 }
        r0 = r20;	 Catch:{ all -> 0x01a2 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x01a2 }
        r20 = r1;	 Catch:{ all -> 0x01a2 }
        r1 = com.snap.core.db.column.InteractionMessageType.values();	 Catch:{ all -> 0x01a2 }
        r21 = r15;	 Catch:{ all -> 0x01a2 }
        r15 = r1.length;	 Catch:{ all -> 0x01a2 }
        r22 = r5;	 Catch:{ all -> 0x01a2 }
        r5 = 0;	 Catch:{ all -> 0x01a2 }
        if (r5 >= r15) goto L_0x017d;	 Catch:{ all -> 0x01a2 }
        r23 = r15;	 Catch:{ all -> 0x01a2 }
        r15 = r1[r5];	 Catch:{ all -> 0x01a2 }
        r24 = defpackage.qut.a;	 Catch:{ all -> 0x01a2 }
        r25 = r15.ordinal();	 Catch:{ all -> 0x01a2 }
        r24 = r24[r25];	 Catch:{ all -> 0x01a2 }
        switch(r24) {
            case 1: goto L_0x015e;
            case 2: goto L_0x0147;
            case 3: goto L_0x0132;
            case 4: goto L_0x0127;
            case 5: goto L_0x011c;
            case 6: goto L_0x0111;
            case 7: goto L_0x0106;
            case 8: goto L_0x00fb;
            case 9: goto L_0x00f0;
            case 10: goto L_0x00e5;
            case 11: goto L_0x00da;
            case 12: goto L_0x00cf;
            case 13: goto L_0x00c1;
            default: goto L_0x00b9;
        };	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r25 = r2;	 Catch:{ all -> 0x01a2 }
        r2 = r18;	 Catch:{ all -> 0x01a2 }
        goto L_0x0171;	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x01a2 }
        r1 = r14.get(r1);	 Catch:{ all -> 0x01a2 }
        r0.put(r15, r1);	 Catch:{ all -> 0x01a2 }
        goto L_0x00bb;	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x01a2 }
        r1 = r13.get(r1);	 Catch:{ all -> 0x01a2 }
        goto L_0x00cb;	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x01a2 }
        r1 = r12.get(r1);	 Catch:{ all -> 0x01a2 }
        goto L_0x00cb;	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x01a2 }
        r1 = r11.get(r1);	 Catch:{ all -> 0x01a2 }
        goto L_0x00cb;	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x01a2 }
        r1 = r2.get(r1);	 Catch:{ all -> 0x01a2 }
        goto L_0x00cb;	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x01a2 }
        r1 = r10.get(r1);	 Catch:{ all -> 0x01a2 }
        goto L_0x00cb;	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x01a2 }
        r1 = r6.get(r1);	 Catch:{ all -> 0x01a2 }
        goto L_0x00cb;	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x01a2 }
        r1 = r9.get(r1);	 Catch:{ all -> 0x01a2 }
        goto L_0x00cb;	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x01a2 }
        r1 = r8.get(r1);	 Catch:{ all -> 0x01a2 }
        goto L_0x00cb;	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x01a2 }
        r1 = r7.get(r1);	 Catch:{ all -> 0x01a2 }
        goto L_0x00cb;	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x01a2 }
        r25 = r2;	 Catch:{ all -> 0x01a2 }
        r2 = r22;	 Catch:{ all -> 0x01a2 }
        r1 = r2.get(r1);	 Catch:{ all -> 0x01a2 }
        r0.put(r15, r1);	 Catch:{ all -> 0x01a2 }
        r22 = r2;	 Catch:{ all -> 0x01a2 }
        goto L_0x00bd;	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r25 = r2;	 Catch:{ all -> 0x01a2 }
        r2 = r22;	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x01a2 }
        r2 = r19;	 Catch:{ all -> 0x01a2 }
        r1 = r2.get(r1);	 Catch:{ all -> 0x01a2 }
        r0.put(r15, r1);	 Catch:{ all -> 0x01a2 }
        r19 = r2;	 Catch:{ all -> 0x01a2 }
        goto L_0x00bd;	 Catch:{ all -> 0x01a2 }
        r24 = r1;	 Catch:{ all -> 0x01a2 }
        r25 = r2;	 Catch:{ all -> 0x01a2 }
        r2 = r19;	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x01a2 }
        r2 = r18;	 Catch:{ all -> 0x01a2 }
        r1 = r2.get(r1);	 Catch:{ all -> 0x01a2 }
        r0.put(r15, r1);	 Catch:{ all -> 0x01a2 }
        r5 = r5 + 1;	 Catch:{ all -> 0x01a2 }
        r18 = r2;	 Catch:{ all -> 0x01a2 }
        r15 = r23;	 Catch:{ all -> 0x01a2 }
        r1 = r24;	 Catch:{ all -> 0x01a2 }
        r2 = r25;	 Catch:{ all -> 0x01a2 }
        goto L_0x00a8;	 Catch:{ all -> 0x01a2 }
        r25 = r2;	 Catch:{ all -> 0x01a2 }
        r2 = r18;	 Catch:{ all -> 0x01a2 }
        r1 = new qus$b;	 Catch:{ all -> 0x01a2 }
        r1.<init>(r3, r0);	 Catch:{ all -> 0x01a2 }
        r15 = r17;	 Catch:{ all -> 0x01a2 }
        r15.add(r1);	 Catch:{ all -> 0x01a2 }
        r0 = r21 + 1;	 Catch:{ all -> 0x01a2 }
        r3 = r2;	 Catch:{ all -> 0x01a2 }
        r17 = r15;	 Catch:{ all -> 0x01a2 }
        r4 = r19;	 Catch:{ all -> 0x01a2 }
        r1 = r20;	 Catch:{ all -> 0x01a2 }
        r5 = r22;	 Catch:{ all -> 0x01a2 }
        r2 = r25;	 Catch:{ all -> 0x01a2 }
        r15 = r0;	 Catch:{ all -> 0x01a2 }
        r0 = r27;	 Catch:{ all -> 0x01a2 }
        goto L_0x008b;	 Catch:{ all -> 0x01a2 }
        r15 = r17;	 Catch:{ all -> 0x01a2 }
        r15 = (java.util.List) r15;	 Catch:{ all -> 0x01a2 }
        return r15;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qus.d(long[]):java.util.List");
    }

    private Map<Long, qwn> d(boolean z, long... jArr) {
        akcr.b(jArr, "feedIds");
        if (a() != null) {
            List d = ((qvd) this.p.get()).d(ajyh.a(jArr));
            if (d != null) {
                Iterable<LastSentViewedChat> iterable = d;
                Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
                for (LastSentViewedChat lastSentViewedChat : iterable) {
                    Long feedRowId = lastSentViewedChat.feedRowId();
                    if (feedRowId == null) {
                        akcr.a();
                    }
                    String key = lastSentViewedChat.key();
                    MessageClientStatus messageClientStatus = MessageClientStatus.OK;
                    LocalMessageBodyType localMessageBodyType = LocalMessageBodyType.Companion.getEnum(lastSentViewedChat.type());
                    Long lastInteractionTimestamp = lastSentViewedChat.lastInteractionTimestamp();
                    if (lastInteractionTimestamp == null) {
                        lastInteractionTimestamp = Long.valueOf(lastSentViewedChat.timestamp());
                    }
                    Long l = lastInteractionTimestamp;
                    Long valueOf = Long.valueOf(lastSentViewedChat.timestamp());
                    Long senderId = lastSentViewedChat.senderId();
                    qwn qwn = r5;
                    qwn qwn2 = new qwn(null, null, false, null, key, valueOf, null, messageClientStatus, localMessageBodyType, l, senderId, false, z, true, false, 18511);
                    linkedHashMap.put(feedRowId, qwn);
                }
                return linkedHashMap;
            }
        }
        return ajyx.a;
    }

    private boolean d() {
        Long l = this.f.a().h;
        if (l != null) {
            long longValue = l.longValue();
            Object au_ = new akqy().au_();
            akrl au_2 = new akqy(longValue).au_();
            akcr.a(au_, "now");
            if (au_.compareTo((akrx) au_2.b(au_.c())) == 0) {
                return true;
            }
        }
        return false;
    }

    private Map<Long, qwn> e(boolean z, long... jArr) {
        akcr.b(jArr, "feedIds");
        if (a() != null) {
            List e = ((qvd) this.p.get()).e(ajyh.a(jArr));
            if (e != null) {
                Collection arrayList = new ArrayList();
                for (Object next : e) {
                    if ((a((LastReceivedNotViewedUpdateMessage) next) ^ 1) != 0) {
                        arrayList.add(next);
                    }
                }
                Iterable<LastReceivedNotViewedUpdateMessage> iterable = (List) arrayList;
                Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
                for (LastReceivedNotViewedUpdateMessage lastReceivedNotViewedUpdateMessage : iterable) {
                    Object obj;
                    Long feedRowId = lastReceivedNotViewedUpdateMessage.feedRowId();
                    if (feedRowId == null) {
                        akcr.a();
                    }
                    Object content = lastReceivedNotViewedUpdateMessage.content();
                    if (content == null) {
                        akcr.a();
                    }
                    akcr.a(content, "it.content()!!");
                    ptx a = ptx.a.a(content);
                    if (ajyi.a((Object[]) w, (Object) a.a)) {
                        String key = lastReceivedNotViewedUpdateMessage.key();
                        MessageClientStatus messageClientStatus = MessageClientStatus.OK;
                        LocalMessageBodyType localMessageBodyType = LocalMessageBodyType.Companion.getEnum(lastReceivedNotViewedUpdateMessage.type());
                        qwn qwn = new qwn(null, null, false, null, key, Long.valueOf(lastReceivedNotViewedUpdateMessage.timestamp()), a.a, messageClientStatus, localMessageBodyType, null, lastReceivedNotViewedUpdateMessage.senderId(), false, z, false, true, 10767);
                    } else {
                        obj = null;
                    }
                    linkedHashMap.put(feedRowId, obj);
                }
                return linkedHashMap;
            }
        }
        return ajyx.a;
    }

    private Map<Long, qwn> f(boolean z, long... jArr) {
        akcr.b(jArr, "feedIds");
        return a(new MessageClientStatus[]{MessageClientStatus.SENDING}, z, Arrays.copyOf(jArr, jArr.length));
    }

    private Map<Long, qwn> g(boolean z, long... jArr) {
        akcr.b(jArr, "feedIds");
        return a(new MessageClientStatus[]{MessageClientStatus.QUEUED}, z, Arrays.copyOf(jArr, jArr.length));
    }

    private Map<Long, qwn> h(boolean z, long... jArr) {
        akcr.b(jArr, "feedIds");
        return a(MessageClientStatusKt.FAILED_TO_SEND_STATUS, z, Arrays.copyOf(jArr, jArr.length));
    }

    private Map<Long, qwn> i(boolean z, long... jArr) {
        long[] jArr2 = jArr;
        akcr.b(jArr2, "feedIds");
        if (a() == null) {
            return ajyx.a;
        }
        Map linkedHashMap;
        Long feedRowId;
        String key;
        MessageClientStatus messageClientStatus;
        Long valueOf;
        qwn qwn;
        aetf aetf;
        if (c()) {
            Iterable<LastSentSnapModel> a = ((qvd) this.p.get()).a(jArr2, SnapServerStatus.SNAP_SERVER_STATUS_NOT_VIEWED);
            linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) a, 10)), 16));
            for (LastSentSnapModel lastSentSnapModel : a) {
                feedRowId = lastSentSnapModel.feedRowId();
                if (feedRowId == null) {
                    akcr.a();
                }
                key = lastSentSnapModel.key();
                messageClientStatus = MessageClientStatus.OK;
                valueOf = Long.valueOf(lastSentSnapModel.interactionTimestamp());
                qwn qwn2 = qwn;
                aetf = null;
                qwn = new qwn(key, Long.valueOf(lastSentSnapModel.messageTimestamp()), qus.a((GetLastSentSnapForMessageModel) lastSentSnapModel), null, null, null, aetf, messageClientStatus, LocalMessageBodyType.SNAP, valueOf, lastSentSnapModel.senderId(), qus.a(lastSentSnapModel.friendLinkType()), z, false, false, 24696);
                linkedHashMap.put(feedRowId, qwn2);
            }
            return linkedHashMap;
        }
        Iterable<LastSentSnap> b = ((qvd) this.p.get()).b(jArr2, SnapServerStatus.SNAP_SERVER_STATUS_NOT_VIEWED);
        linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) b, 10)), 16));
        for (LastSentSnap lastSentSnap : b) {
            feedRowId = lastSentSnap.feedRowId();
            if (feedRowId == null) {
                akcr.a();
            }
            key = lastSentSnap.snapId();
            messageClientStatus = MessageClientStatus.OK;
            valueOf = Long.valueOf(lastSentSnap.interactionTimestamp());
            qwn qwn3 = qwn;
            aetf = null;
            qwn = new qwn(key, Long.valueOf(lastSentSnap.messageTimestamp()), ajyi.a((Object[]) gcp.soundSnapTypes, (Object) lastSentSnap.snapType()), null, null, null, aetf, messageClientStatus, LocalMessageBodyType.SNAP, valueOf, lastSentSnap.senderId(), qus.a(lastSentSnap.friendLinkType()), z, false, false, 24696);
            linkedHashMap.put(feedRowId, qwn3);
        }
        return linkedHashMap;
    }

    private Map<Long, qwn> j(boolean z, long... jArr) {
        long[] jArr2 = jArr;
        akcr.b(jArr2, "feedIds");
        if (a() == null) {
            return ajyx.a;
        }
        Map linkedHashMap;
        Long feedRowId;
        String key;
        MessageClientStatus messageClientStatus;
        Long valueOf;
        Long valueOf2;
        Long senderId;
        boolean a;
        LocalMessageBodyType localMessageBodyType;
        ScreenshottedOrReplayedState screenshottedOrReplayed;
        Record latestScreenshottedOrReplayedRecord;
        qwn qwn;
        qwn qwn2;
        if (c()) {
            Iterable<LastSentSnapModel> a2 = ((qvd) this.p.get()).a(jArr2, SnapServerStatus.SNAP_SERVER_STATUS_VIEWED);
            linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) a2, 10)), 16));
            for (LastSentSnapModel lastSentSnapModel : a2) {
                feedRowId = lastSentSnapModel.feedRowId();
                if (feedRowId == null) {
                    akcr.a();
                }
                key = lastSentSnapModel.key();
                messageClientStatus = MessageClientStatus.OK;
                valueOf = Long.valueOf(lastSentSnapModel.interactionTimestamp());
                valueOf2 = Long.valueOf(lastSentSnapModel.messageTimestamp());
                senderId = lastSentSnapModel.senderId();
                a = qus.a((GetLastSentSnapForMessageModel) lastSentSnapModel);
                localMessageBodyType = LocalMessageBodyType.SNAP;
                screenshottedOrReplayed = lastSentSnapModel.screenshottedOrReplayed();
                latestScreenshottedOrReplayedRecord = screenshottedOrReplayed != null ? screenshottedOrReplayed.latestScreenshottedOrReplayedRecord() : null;
                qwn = qwn2;
                qwn2 = new qwn(key, valueOf2, a, latestScreenshottedOrReplayedRecord, null, null, null, messageClientStatus, localMessageBodyType, valueOf, senderId, false, z, true, false, 18544);
                linkedHashMap.put(feedRowId, qwn);
            }
            return linkedHashMap;
        }
        Iterable<LastSentSnap> b = ((qvd) this.p.get()).b(jArr2, SnapServerStatus.SNAP_SERVER_STATUS_VIEWED);
        linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) b, 10)), 16));
        for (LastSentSnap lastSentSnap : b) {
            feedRowId = lastSentSnap.feedRowId();
            if (feedRowId == null) {
                akcr.a();
            }
            key = lastSentSnap.snapId();
            messageClientStatus = MessageClientStatus.OK;
            valueOf = Long.valueOf(lastSentSnap.interactionTimestamp());
            valueOf2 = Long.valueOf(lastSentSnap.messageTimestamp());
            senderId = lastSentSnap.senderId();
            a = ajyi.a((Object[]) gcp.soundSnapTypes, (Object) lastSentSnap.snapType());
            localMessageBodyType = LocalMessageBodyType.SNAP;
            screenshottedOrReplayed = lastSentSnap.screenshottedOrReplayed();
            latestScreenshottedOrReplayedRecord = screenshottedOrReplayed != null ? screenshottedOrReplayed.latestScreenshottedOrReplayedRecord() : null;
            qwn = qwn2;
            qwn2 = new qwn(key, valueOf2, a, latestScreenshottedOrReplayedRecord, null, null, null, messageClientStatus, localMessageBodyType, valueOf, senderId, false, z, true, false, 18544);
            linkedHashMap.put(feedRowId, qwn);
        }
        return linkedHashMap;
    }

    private Map<Long, qwn> k(boolean z, long... jArr) {
        akcr.b(jArr, "feedIds");
        if (a() == null) {
            return ajyx.a;
        }
        Map linkedHashMap;
        Long feedRowId;
        ScreenshottedOrReplayedState screenshottedOrReplayed;
        Record latestScreenshottedOrReplayedRecord;
        Record record;
        if (c()) {
            Iterable<ReceivedSnapsModel> a = ((qvd) this.p.get()).a(ajyh.a(jArr), SnapServerStatus.SNAP_SERVER_STATUS_VIEWED);
            linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) a, 10)), 16));
            for (ReceivedSnapsModel receivedSnapsModel : a) {
                feedRowId = receivedSnapsModel.feedRowId();
                if (feedRowId == null) {
                    akcr.a();
                }
                screenshottedOrReplayed = receivedSnapsModel.screenshottedOrReplayed();
                if (screenshottedOrReplayed != null) {
                    latestScreenshottedOrReplayedRecord = screenshottedOrReplayed.latestScreenshottedOrReplayedRecord();
                    if (latestScreenshottedOrReplayedRecord != null) {
                        if ((latestScreenshottedOrReplayedRecord.getTimestamp() >= receivedSnapsModel.interactionTimestamp() ? 1 : null) != null) {
                            record = latestScreenshottedOrReplayedRecord;
                            linkedHashMap.put(feedRowId, new qwn(receivedSnapsModel.key(), Long.valueOf(receivedSnapsModel.messageTimestamp()), qus.a((GetReceivedSnapsModel) receivedSnapsModel), record, null, null, null, MessageClientStatus.OK, LocalMessageBodyType.SNAP, null, receivedSnapsModel.senderId(), false, z, true, true, 2672));
                        }
                    }
                }
                record = null;
                linkedHashMap.put(feedRowId, new qwn(receivedSnapsModel.key(), Long.valueOf(receivedSnapsModel.messageTimestamp()), qus.a((GetReceivedSnapsModel) receivedSnapsModel), record, null, null, null, MessageClientStatus.OK, LocalMessageBodyType.SNAP, null, receivedSnapsModel.senderId(), false, z, true, true, 2672));
            }
            return linkedHashMap;
        }
        Object a2 = ((qvd) this.p.get()).a(ajyh.a(jArr), SnapServerStatus.SNAP_SERVER_STATUS_VIEWED, gcp.values());
        akcr.a(a2, "it");
        Iterable<LastReceivedSnap> iterable = (Iterable) a2;
        linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
        for (LastReceivedSnap lastReceivedSnap : iterable) {
            feedRowId = lastReceivedSnap.feedRowId();
            if (feedRowId == null) {
                akcr.a();
            }
            screenshottedOrReplayed = lastReceivedSnap.screenshottedOrReplayed();
            if (screenshottedOrReplayed != null) {
                latestScreenshottedOrReplayedRecord = screenshottedOrReplayed.latestScreenshottedOrReplayedRecord();
                if (latestScreenshottedOrReplayedRecord != null) {
                    if ((latestScreenshottedOrReplayedRecord.getTimestamp() >= lastReceivedSnap.interactionTimestamp() ? 1 : null) != null) {
                        record = latestScreenshottedOrReplayedRecord;
                        linkedHashMap.put(feedRowId, new qwn(lastReceivedSnap.snapId(), Long.valueOf(lastReceivedSnap.messageTimestamp()), ajyi.a((Object[]) gcp.soundSnapTypes, (Object) lastReceivedSnap.snapType()), record, null, null, null, MessageClientStatus.OK, LocalMessageBodyType.SNAP, null, lastReceivedSnap.senderId(), false, z, true, true, 2672));
                    }
                }
            }
            record = null;
            linkedHashMap.put(feedRowId, new qwn(lastReceivedSnap.snapId(), Long.valueOf(lastReceivedSnap.messageTimestamp()), ajyi.a((Object[]) gcp.soundSnapTypes, (Object) lastReceivedSnap.snapType()), record, null, null, null, MessageClientStatus.OK, LocalMessageBodyType.SNAP, null, lastReceivedSnap.senderId(), false, z, true, true, 2672));
        }
        return linkedHashMap;
    }

    private Map<Long, qwn> l(boolean z, long... jArr) {
        akcr.b(jArr, "feedIds");
        if (a() == null) {
            return ajyx.a;
        }
        Map linkedHashMap;
        Long feedRowId;
        String key;
        MessageClientStatus messageClientStatus;
        Long valueOf;
        qwn qwn;
        aetf aetf;
        if (c()) {
            Collection arrayList = new ArrayList();
            for (Object next : ((qvd) this.p.get()).a(ajyh.a(jArr), SnapServerStatus.SNAP_SERVER_STATUS_NOT_VIEWED)) {
                if (qus.a((GetReceivedSnapsModel) (ReceivedSnapsModel) next)) {
                    arrayList.add(next);
                }
            }
            Iterable<ReceivedSnapsModel> iterable = (List) arrayList;
            linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
            for (ReceivedSnapsModel receivedSnapsModel : iterable) {
                feedRowId = receivedSnapsModel.feedRowId();
                if (feedRowId == null) {
                    akcr.a();
                }
                key = receivedSnapsModel.key();
                messageClientStatus = MessageClientStatus.OK;
                valueOf = Long.valueOf(receivedSnapsModel.interactionTimestamp());
                qwn qwn2 = qwn;
                aetf = null;
                qwn = new qwn(key, Long.valueOf(receivedSnapsModel.messageTimestamp()), true, null, null, null, aetf, messageClientStatus, LocalMessageBodyType.SNAP, valueOf, receivedSnapsModel.senderId(), false, z, false, true, 10360);
                linkedHashMap.put(feedRowId, qwn2);
            }
            return linkedHashMap;
        }
        Iterable<LastReceivedSnap> a = ((qvd) this.p.get()).a(ajyh.a(jArr), SnapServerStatus.SNAP_SERVER_STATUS_NOT_VIEWED, gcp.soundSnapTypes);
        linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) a, 10)), 16));
        for (LastReceivedSnap lastReceivedSnap : a) {
            feedRowId = lastReceivedSnap.feedRowId();
            if (feedRowId == null) {
                akcr.a();
            }
            key = lastReceivedSnap.snapId();
            messageClientStatus = MessageClientStatus.OK;
            valueOf = Long.valueOf(lastReceivedSnap.interactionTimestamp());
            qwn qwn3 = qwn;
            aetf = null;
            qwn = new qwn(key, Long.valueOf(lastReceivedSnap.messageTimestamp()), true, null, null, null, aetf, messageClientStatus, LocalMessageBodyType.SNAP, valueOf, lastReceivedSnap.senderId(), false, z, false, true, 10360);
            linkedHashMap.put(feedRowId, qwn3);
        }
        return linkedHashMap;
    }

    private Map<Long, qwn> m(boolean z, long... jArr) {
        akcr.b(jArr, "feedIds");
        if (a() == null) {
            return ajyx.a;
        }
        Map linkedHashMap;
        Long feedRowId;
        String key;
        MessageClientStatus messageClientStatus;
        Long valueOf;
        qwn qwn;
        aetf aetf;
        if (c()) {
            Collection arrayList = new ArrayList();
            for (Object next : ((qvd) this.p.get()).a(ajyh.a(jArr), SnapServerStatus.SNAP_SERVER_STATUS_NOT_VIEWED)) {
                if ((qus.a((GetReceivedSnapsModel) (ReceivedSnapsModel) next) ^ 1) != 0) {
                    arrayList.add(next);
                }
            }
            Iterable<ReceivedSnapsModel> iterable = (List) arrayList;
            linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
            for (ReceivedSnapsModel receivedSnapsModel : iterable) {
                feedRowId = receivedSnapsModel.feedRowId();
                if (feedRowId == null) {
                    akcr.a();
                }
                key = receivedSnapsModel.key();
                messageClientStatus = MessageClientStatus.OK;
                valueOf = Long.valueOf(receivedSnapsModel.interactionTimestamp());
                qwn qwn2 = qwn;
                aetf = null;
                qwn = new qwn(key, Long.valueOf(receivedSnapsModel.messageTimestamp()), false, null, null, null, aetf, messageClientStatus, LocalMessageBodyType.SNAP, valueOf, receivedSnapsModel.senderId(), false, z, false, true, 10360);
                linkedHashMap.put(feedRowId, qwn2);
            }
            return linkedHashMap;
        }
        Object a = ((qvd) this.p.get()).a(ajyh.a(jArr), SnapServerStatus.SNAP_SERVER_STATUS_NOT_VIEWED, gcp.noSoundSnapTypes);
        akcr.a(a, "it");
        Iterable<LastReceivedSnap> iterable2 = (Iterable) a;
        linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable2, 10)), 16));
        for (LastReceivedSnap lastReceivedSnap : iterable2) {
            feedRowId = lastReceivedSnap.feedRowId();
            if (feedRowId == null) {
                akcr.a();
            }
            key = lastReceivedSnap.snapId();
            messageClientStatus = MessageClientStatus.OK;
            valueOf = Long.valueOf(lastReceivedSnap.interactionTimestamp());
            qwn qwn3 = qwn;
            aetf = null;
            qwn = new qwn(key, Long.valueOf(lastReceivedSnap.messageTimestamp()), false, null, null, null, aetf, messageClientStatus, LocalMessageBodyType.SNAP, valueOf, lastReceivedSnap.senderId(), false, z, false, true, 10360);
            linkedHashMap.put(feedRowId, qwn3);
        }
        return linkedHashMap;
    }

    /* Access modifiers changed, original: final */
    public final String a() {
        return (String) this.j.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x00b4 in {5, 6, 14, 15, 18, 20} preds:[]
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
    public final void a(com.snap.core.db.api.DbTransaction r10, defpackage.qvv r11, long... r12) {
        /*
        r9 = this;
        r0 = "tx";
        defpackage.akcr.b(r10, r0);
        r0 = "updateSource";
        defpackage.akcr.b(r11, r0);
        r11 = "feedIds";
        defpackage.akcr.b(r12, r11);
        r10.checkInTransaction();
        r11 = r12.length;
        r11 = java.util.Arrays.copyOf(r12, r11);
        r11 = r9.b(r11);
        r11 = (java.lang.Iterable) r11;
        r0 = new java.util.LinkedHashMap;
        r0.<init>();
        r0 = (java.util.Map) r0;
        r11 = r11.iterator();
        r1 = r11.hasNext();
        if (r1 == 0) goto L_0x0051;
        r1 = r11.next();
        r2 = r1;
        r2 = (com.snap.core.db.record.InteractionMessagesRecord.InteractionMessageRow) r2;
        r2 = r2.feedRowId();
        r2 = java.lang.Long.valueOf(r2);
        r3 = r0.get(r2);
        if (r3 != 0) goto L_0x004b;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r0.put(r2, r3);
        r3 = (java.util.List) r3;
        r3.add(r1);
        goto L_0x0028;
        r11 = r12.length;
        r11 = java.util.Arrays.copyOf(r12, r11);
        r11 = r9.c(r11);
        r11 = (java.lang.Iterable) r11;	 Catch:{ all -> 0x00b2 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x00b2 }
        r2 = 10;	 Catch:{ all -> 0x00b2 }
        r2 = defpackage.ajyn.a(r11, r2);	 Catch:{ all -> 0x00b2 }
        r1.<init>(r2);	 Catch:{ all -> 0x00b2 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x00b2 }
        r11 = r11.iterator();	 Catch:{ all -> 0x00b2 }
        r2 = r11.hasNext();	 Catch:{ all -> 0x00b2 }
        if (r2 == 0) goto L_0x00a1;	 Catch:{ all -> 0x00b2 }
        r2 = r11.next();	 Catch:{ all -> 0x00b2 }
        r2 = (defpackage.qus.b) r2;	 Catch:{ all -> 0x00b2 }
        r3 = r2.a;	 Catch:{ all -> 0x00b2 }
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x00b2 }
        r4 = r2.a;	 Catch:{ all -> 0x00b2 }
        r6 = r2.b;	 Catch:{ all -> 0x00b2 }
        r7 = r2.a;	 Catch:{ all -> 0x00b2 }
        r2 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x00b2 }
        r2 = r0.get(r2);	 Catch:{ all -> 0x00b2 }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x00b2 }
        if (r2 != 0) goto L_0x0095;	 Catch:{ all -> 0x00b2 }
        r2 = defpackage.ajyw.a;	 Catch:{ all -> 0x00b2 }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x00b2 }
        r2 = r9.a(r4, r6, r2);	 Catch:{ all -> 0x00b2 }
        r2 = defpackage.ajxs.a(r3, r2);	 Catch:{ all -> 0x00b2 }
        r1.add(r2);	 Catch:{ all -> 0x00b2 }
        goto L_0x006d;	 Catch:{ all -> 0x00b2 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x00b2 }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x00b2 }
        r11 = defpackage.ajzm.a(r1);	 Catch:{ all -> 0x00b2 }
        r0 = r12.length;
        r12 = java.util.Arrays.copyOf(r12, r0);
        r9.a(r10, r11, r12);
        return;
        r10 = move-exception;
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qus.a(com.snap.core.db.api.DbTransaction, qvv, long[]):void");
    }

    public final ajdp<List<GetNewContentInteractionMessagesRow>> b() {
        DbClient dbClient = this.a;
        Object newContentInteractionMessages = InteractionMessagesRecord.Companion.getFACTORY().getNewContentInteractionMessages(LocalMessageBodyType.SILENT_LOCAL_MESSAGE_BODY_TYPES);
        akcr.a(newContentInteractionMessages, "InteractionMessagesRecor…LOCAL_MESSAGE_BODY_TYPES)");
        return dbClient.queryAndMapToList("ff:interaction:getNewContentInteractionMessages", newContentInteractionMessages, new f(InteractionMessagesRecord.Companion.getNEW_CONTENT_INTERACTION_MESSAGE_ROW_MAPPER()));
    }
}
