package defpackage;

import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.DiscoverStorySnapModel;
import com.snap.core.db.record.NetworkMessageModel.DeleteAllMessages;
import com.snap.core.db.record.NetworkMessageModel.DeleteMessageForMessageId;
import com.snap.core.db.record.NetworkMessageModel.GetIdAndTypeForMessageIdModel;
import com.snap.core.db.record.NetworkMessageModel.InsertMessage;
import com.snap.core.db.record.NetworkMessageModel.ReplaceMessageWithEraseMessage;
import com.snap.core.db.record.NetworkMessageModel.UpdateContentForId;
import com.snap.core.db.record.NetworkMessageModel.UpdateMessagePreservationState;
import com.snap.core.db.record.NetworkMessageModel.UpdateNetworkMessageSaveState;
import com.snap.core.db.record.NetworkMessageModel.UpdateSnapServerStatus;
import com.snap.core.db.record.NetworkMessageModel.UpdateSnapState;
import com.snap.core.db.record.NetworkMessageRecord;
import com.snap.core.db.record.NetworkMessageRecord.UnreleasedMessagesWithType;
import java.util.List;

/* renamed from: qvj */
public final class qvj {
    public final DbClient a;
    public final ajxe b = ajxh.a(new a(this));
    private final ajxe c = ajxh.a(e.a);
    private final ajxe d = ajxh.a(new c(this));
    private final ajxe e = ajxh.a(new b(this));
    private final ajxe f = ajxh.a(new h(this));
    private final ajxe g = ajxh.a(new g(this));
    private final ajxe h = ajxh.a(new f(this));
    private final ajxe i = ajxh.a(new d(this));
    private final ajxe j = ajxh.a(new i(this));
    private final ajxe k = ajxh.a(new j(this));

    /* renamed from: qvj$e */
    static final class e extends akcs implements akbk<qve> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new qve();
        }
    }

    /* renamed from: qvj$c */
    static final class c extends akcs implements akbk<InsertMessage> {
        private /* synthetic */ qvj a;

        c(qvj qvj) {
            this.a = qvj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertMessage(this.a.a.getWritableDatabase(), NetworkMessageRecord.FACTORY);
        }
    }

    /* renamed from: qvj$b */
    static final class b extends akcs implements akbk<DeleteMessageForMessageId> {
        private /* synthetic */ qvj a;

        b(qvj qvj) {
            this.a = qvj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeleteMessageForMessageId(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: qvj$h */
    static final class h extends akcs implements akbk<UpdateNetworkMessageSaveState> {
        private /* synthetic */ qvj a;

        h(qvj qvj) {
            this.a = qvj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateNetworkMessageSaveState(this.a.a.getWritableDatabase(), NetworkMessageRecord.FACTORY);
        }
    }

    /* renamed from: qvj$g */
    static final class g extends akcs implements akbk<UpdateMessagePreservationState> {
        private /* synthetic */ qvj a;

        g(qvj qvj) {
            this.a = qvj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateMessagePreservationState(this.a.a.getWritableDatabase(), NetworkMessageRecord.FACTORY);
        }
    }

    /* renamed from: qvj$f */
    static final class f extends akcs implements akbk<UpdateContentForId> {
        private /* synthetic */ qvj a;

        f(qvj qvj) {
            this.a = qvj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateContentForId(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: qvj$d */
    static final class d extends akcs implements akbk<ReplaceMessageWithEraseMessage> {
        private /* synthetic */ qvj a;

        d(qvj qvj) {
            this.a = qvj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ReplaceMessageWithEraseMessage(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: qvj$i */
    static final class i extends akcs implements akbk<UpdateSnapServerStatus> {
        private /* synthetic */ qvj a;

        i(qvj qvj) {
            this.a = qvj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateSnapServerStatus(this.a.a.getWritableDatabase(), NetworkMessageRecord.FACTORY);
        }
    }

    /* renamed from: qvj$j */
    static final class j extends akcs implements akbk<UpdateSnapState> {
        private /* synthetic */ qvj a;

        j(qvj qvj) {
            this.a = qvj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateSnapState(this.a.a.getWritableDatabase(), NetworkMessageRecord.FACTORY);
        }
    }

    /* renamed from: qvj$a */
    static final class a extends akcs implements akbk<DeleteAllMessages> {
        private /* synthetic */ qvj a;

        a(qvj qvj) {
            this.a = qvj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeleteAllMessages(this.a.a.getWritableDatabase());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(qvj.class), "snapCache", "getSnapCache()Lcom/snap/messaging/db/MessagingRepositoryCache;"), new akdc(akde.a(qvj.class), "insertNetworkMessage", "getInsertNetworkMessage()Lcom/snap/core/db/record/NetworkMessageModel$InsertMessage;"), new akdc(akde.a(qvj.class), "deleteChatSDKMessageWithMessageId", "getDeleteChatSDKMessageWithMessageId()Lcom/snap/core/db/record/NetworkMessageModel$DeleteMessageForMessageId;"), new akdc(akde.a(qvj.class), "updateSaveStates", "getUpdateSaveStates()Lcom/snap/core/db/record/NetworkMessageModel$UpdateNetworkMessageSaveState;"), new akdc(akde.a(qvj.class), "updatePreservationStates", "getUpdatePreservationStates()Lcom/snap/core/db/record/NetworkMessageModel$UpdateMessagePreservationState;"), new akdc(akde.a(qvj.class), "updateMessageContent", "getUpdateMessageContent()Lcom/snap/core/db/record/NetworkMessageModel$UpdateContentForId;"), new akdc(akde.a(qvj.class), "replaceMessageWithEraseMessage", "getReplaceMessageWithEraseMessage()Lcom/snap/core/db/record/NetworkMessageModel$ReplaceMessageWithEraseMessage;"), new akdc(akde.a(qvj.class), "updateSnapServerStatus", "getUpdateSnapServerStatus()Lcom/snap/core/db/record/NetworkMessageModel$UpdateSnapServerStatus;"), new akdc(akde.a(qvj.class), "updateSnapState", "getUpdateSnapState()Lcom/snap/core/db/record/NetworkMessageModel$UpdateSnapState;"), new akdc(akde.a(qvj.class), "deleteAllMessages", "getDeleteAllMessages()Lcom/snap/core/db/record/NetworkMessageModel$DeleteAllMessages;")};
    }

    public qvj(SnapDb snapDb) {
        akcr.b(snapDb, "snapDb");
        this.a = snapDb.getDbClient(pry.a.callsite("NetworkMessageRepository"));
    }

    private final UpdateContentForId d() {
        return (UpdateContentForId) this.h.b();
    }

    private final ReplaceMessageWithEraseMessage e() {
        return (ReplaceMessageWithEraseMessage) this.i.b();
    }

    private final UpdateSnapServerStatus f() {
        return (UpdateSnapServerStatus) this.j.b();
    }

    private final UpdateSnapState g() {
        return (UpdateSnapState) this.k.b();
    }

    public final ajxm<Long, Boolean> a(qdr qdr, DbTransaction dbTransaction) {
        Throwable th;
        qdr qdr2 = qdr;
        DbTransaction dbTransaction2 = dbTransaction;
        akcr.b(qdr2, "networkMessage");
        akcr.b(dbTransaction2, "tx");
        try {
            this.a.throwIfNotDbScheduler();
            Object idAndTypeForMessageId = NetworkMessageRecord.FACTORY.getIdAndTypeForMessageId(qdr2.a);
            akcr.a(idAndTypeForMessageId, "NetworkMessageRecord.FAC…sageId(networkMessage.id)");
            DbClient dbClient = this.a;
            Object obj = NetworkMessageRecord.ID_AND_TYPE_FOR_MESSAGE_ID_MODEL_ROW_MAPPER;
            akcr.a(obj, "NetworkMessageRecord.ID_…SSAGE_ID_MODEL_ROW_MAPPER");
            GetIdAndTypeForMessageIdModel getIdAndTypeForMessageIdModel = (GetIdAndTypeForMessageIdModel) dbClient.queryFirst(idAndTypeForMessageId, obj);
            if (getIdAndTypeForMessageIdModel != null) {
                SnapServerStatus snapServerStatus = getIdAndTypeForMessageIdModel.snapServerStatus();
                if (!(snapServerStatus == null || snapServerStatus == SnapServerStatus.VIEWED)) {
                    String str = qdr2.a;
                    SnapServerStatus snapServerStatus2 = qdr2.n;
                    if (snapServerStatus2 == null) {
                        akcr.a((Object) snapServerStatus, "it");
                    } else {
                        snapServerStatus = snapServerStatus2;
                    }
                    a(str, snapServerStatus);
                }
                if (akcr.a(getIdAndTypeForMessageIdModel.messageType(), qdr2.g) && !(qdr2.h instanceof pun)) {
                    return new ajxm(Long.valueOf(getIdAndTypeForMessageIdModel._id()), Boolean.FALSE);
                }
                d().bind(qdr2.h.b(), qdr2.g, getIdAndTypeForMessageIdModel._id());
                Object obj2 = this.a;
                akcr.a(obj2, "briteDatabase");
                BriteDatabaseExtensionsKt.executeUpdate(obj2, d());
                return new ajxm(Long.valueOf(getIdAndTypeForMessageIdModel._id()), Boolean.TRUE);
            }
            this.a.throwIfNotDbScheduler();
            InsertMessage insertMessage = (InsertMessage) this.d.b();
            String str2 = qdr2.a;
            String str3 = qdr2.b;
            long j = qdr2.c;
            long j2 = qdr2.d;
            Long valueOf = Long.valueOf(qdr2.e);
            MessageClientStatus messageClientStatus = qdr2.f;
            String str4 = qdr2.g;
            byte[] b = qdr2.h.b();
            gcj gcj = qdr2.i;
            ajxm ajxm = r3;
            gcm gcm = qdr2.j;
            ScreenshottedOrReplayedState screenshottedOrReplayedState = qdr2.m;
            try {
                gcj gcj2 = gcj;
                insertMessage.bind(str2, str3, j, j2, valueOf, messageClientStatus, str4, b, gcj2, gcm, screenshottedOrReplayedState, qdr2.n, qdr2.o);
                return new ajxm(Long.valueOf(this.a.executeInsert(insertMessage, dbTransaction)), Boolean.TRUE);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final List<UnreleasedMessagesWithType> a(String str, long j, long j2, boolean z) {
        akcr.b(str, "conversationId");
        DbClient dbClient = this.a;
        Object messagesYetToBeReleasedUpToAndIncludingSequenceNumber = NetworkMessageRecord.FACTORY.getMessagesYetToBeReleasedUpToAndIncludingSequenceNumber(str, j, Long.valueOf(j2), z ? "" : aesq.SNAP.a());
        akcr.a(messagesYetToBeReleasedUpToAndIncludingSequenceNumber, "NetworkMessageRecord.FAC…ageBodyType.SNAP.value())");
        Object obj = NetworkMessageRecord.UNRELEASED_MESSAGES_WITH_TYPE_ROW_MAPPER;
        akcr.a(obj, "NetworkMessageRecord.UNR…AGES_WITH_TYPE_ROW_MAPPER");
        return dbClient.query(messagesYetToBeReleasedUpToAndIncludingSequenceNumber, obj);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x0088 in {2, 3, 10, 16, 17, 18, 24, 26} preds:[]
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
    public final java.util.Map<java.lang.Long, java.util.List<com.snap.core.db.record.NetworkMessageRecord.UnreleasedMessage>> a(java.lang.String r5, boolean r6) {
        /*
        r4 = this;
        r0 = "converationId";
        defpackage.akcr.b(r5, r0);
        r0 = com.snap.core.db.record.NetworkMessageRecord.FACTORY;
        if (r6 == 0) goto L_0x000c;
        r6 = "";
        goto L_0x0012;
        r6 = defpackage.aesq.SNAP;
        r6 = r6.a();
        r5 = r0.getUnreleasedMessagesForConversation(r5, r6);
        r6 = "NetworkMessageRecord.FAC…ageBodyType.SNAP.value())";
        defpackage.akcr.a(r5, r6);
        r6 = new java.util.ArrayList;
        r6.<init>();
        r6 = (java.util.List) r6;
        r0 = r4.a;
        r5 = r0.query(r5);
        r5 = (java.io.Closeable) r5;
        r0 = 0;
        r1 = r5;	 Catch:{ Throwable -> 0x0081 }
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0081 }
        r2 = r1.moveToNext();	 Catch:{ Throwable -> 0x0081 }
        if (r2 == 0) goto L_0x0045;	 Catch:{ Throwable -> 0x0081 }
        r2 = com.snap.core.db.record.NetworkMessageRecord.UNRELEASED_MESSAGES_ROW_MAPPER;	 Catch:{ Throwable -> 0x0081 }
        r2 = r2.map(r1);	 Catch:{ Throwable -> 0x0081 }
        r3 = "NetworkMessageRecord.UNR…_ROW_MAPPER.map((cursor))";	 Catch:{ Throwable -> 0x0081 }
        defpackage.akcr.a(r2, r3);	 Catch:{ Throwable -> 0x0081 }
        r2 = (com.snap.core.db.record.NetworkMessageRecord.UnreleasedMessage) r2;	 Catch:{ Throwable -> 0x0081 }
        r6.add(r2);	 Catch:{ Throwable -> 0x0081 }
        goto L_0x002e;
        defpackage.akax.a(r5, r0);
        r6 = (java.lang.Iterable) r6;
        r5 = new java.util.LinkedHashMap;
        r5.<init>();
        r5 = (java.util.Map) r5;
        r6 = r6.iterator();
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x007e;
        r0 = r6.next();
        r1 = r0;
        r1 = (com.snap.core.db.record.NetworkMessageRecord.UnreleasedMessage) r1;
        r1 = r1.senderId();
        r1 = java.lang.Long.valueOf(r1);
        r2 = r5.get(r1);
        if (r2 != 0) goto L_0x0078;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r5.put(r1, r2);
        r2 = (java.util.List) r2;
        r2.add(r0);
        goto L_0x0055;
        return r5;
        r6 = move-exception;
        goto L_0x0084;
        r6 = move-exception;
        r0 = r6;
        throw r0;	 Catch:{ all -> 0x007f }
        defpackage.akax.a(r5, r0);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvj.a(java.lang.String, boolean):java.util.Map");
    }

    public final qvc a(long j) {
        return a().a(j);
    }

    public final qve a() {
        return (qve) this.c.b();
    }

    public final void a(String str) {
        akcr.b(str, "messageId");
        DeleteMessageForMessageId deleteMessageForMessageId = (DeleteMessageForMessageId) this.e.b();
        deleteMessageForMessageId.bind(str);
        this.a.executeUpdateDelete(deleteMessageForMessageId);
    }

    public final void a(String str, SnapServerStatus snapServerStatus) {
        akcr.b(str, "messageId");
        akcr.b(snapServerStatus, "status");
        this.a.throwIfNotDbScheduler();
        f().bind(snapServerStatus, str);
        Object obj = this.a;
        akcr.a(obj, "briteDatabase");
        BriteDatabaseExtensionsKt.executeUpdate(obj, f());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x0067 in {15, 21, 24, 26, 28, 29, 31} preds:[]
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
    public final void a(java.util.List<java.lang.String> r4, java.lang.Long r5, java.lang.Long r6) {
        /*
        r3 = this;
        r0 = "messageIds";
        defpackage.akcr.b(r4, r0);
        r4 = (java.lang.Iterable) r4;	 Catch:{ all -> 0x0065 }
        r4 = defpackage.ajyu.t(r4);	 Catch:{ all -> 0x0065 }
        r4 = (java.lang.Iterable) r4;	 Catch:{ all -> 0x0065 }
        r4 = r4.iterator();	 Catch:{ all -> 0x0065 }
        r0 = r4.hasNext();	 Catch:{ all -> 0x0065 }
        if (r0 == 0) goto L_0x0064;	 Catch:{ all -> 0x0065 }
        r0 = r4.next();	 Catch:{ all -> 0x0065 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0065 }
        r1 = com.snap.core.db.record.NetworkMessageRecord.FACTORY;	 Catch:{ all -> 0x0065 }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0065 }
        if (r0 == 0) goto L_0x005c;	 Catch:{ all -> 0x0065 }
        r2 = 0;	 Catch:{ all -> 0x0065 }
        r2 = new java.lang.String[r2];	 Catch:{ all -> 0x0065 }
        r0 = r0.toArray(r2);	 Catch:{ all -> 0x0065 }
        if (r0 == 0) goto L_0x0054;	 Catch:{ all -> 0x0065 }
        r2 = 1;	 Catch:{ all -> 0x0065 }
        r0 = (java.lang.String[]) r0;	 Catch:{ all -> 0x0065 }
        r0 = r1.updateReleaseStateOnMessages(r2, r5, r6, r0);	 Catch:{ all -> 0x0065 }
        r1 = "NetworkMessageRecord.FAC…ntion, it.toTypedArray())";	 Catch:{ all -> 0x0065 }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0065 }
        r1 = r3.a;	 Catch:{ all -> 0x0065 }
        r0 = r1.query(r0);	 Catch:{ all -> 0x0065 }
        r0 = (java.io.Closeable) r0;	 Catch:{ all -> 0x0065 }
        r1 = 0;
        r2 = r0;	 Catch:{ Throwable -> 0x004d }
        r2 = (android.database.Cursor) r2;	 Catch:{ Throwable -> 0x004d }
        r2.getCount();	 Catch:{ Throwable -> 0x004d }
        defpackage.akax.a(r0, r1);	 Catch:{ all -> 0x0065 }
        goto L_0x0011;
        r4 = move-exception;
        goto L_0x0050;
        r4 = move-exception;
        r1 = r4;
        throw r1;	 Catch:{ all -> 0x004b }
        defpackage.akax.a(r0, r1);	 Catch:{ all -> 0x0065 }
        throw r4;	 Catch:{ all -> 0x0065 }
        r4 = new ajxt;	 Catch:{ all -> 0x0065 }
        r5 = "null cannot be cast to non-null type kotlin.Array<T>";	 Catch:{ all -> 0x0065 }
        r4.<init>(r5);	 Catch:{ all -> 0x0065 }
        throw r4;	 Catch:{ all -> 0x0065 }
        r4 = new ajxt;	 Catch:{ all -> 0x0065 }
        r5 = "null cannot be cast to non-null type java.util.Collection<T>";	 Catch:{ all -> 0x0065 }
        r4.<init>(r5);	 Catch:{ all -> 0x0065 }
        throw r4;	 Catch:{ all -> 0x0065 }
        return;
        r4 = move-exception;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvj.a(java.util.List, java.lang.Long, java.lang.Long):void");
    }

    public final boolean a(String str, long j) {
        akcr.b(str, DiscoverStorySnapModel.RAWSNAPID);
        str = qwh.b(str);
        if (a().a(j).a(str) != null) {
            return true;
        }
        Long b = b(str);
        if (b == null) {
            return false;
        }
        a().a(j).a(str, b.longValue());
        return true;
    }

    public final boolean a(String str, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, long[] jArr, long j) {
        akcr.b(str, "messageId");
        akcr.b(snapServerStatus, "status");
        akcr.b(screenshottedOrReplayedState, "screenshottedOrReplayedState");
        this.a.throwIfNotDbScheduler();
        g().bind(snapServerStatus, screenshottedOrReplayedState, jArr != null ? new yfj(jArr) : null, Long.valueOf(j), str);
        Object obj = this.a;
        akcr.a(obj, "briteDatabase");
        return BriteDatabaseExtensionsKt.executeUpdate(obj, (ainy) g()) > 0;
    }

    /* Access modifiers changed, original: final */
    public final UpdateNetworkMessageSaveState b() {
        return (UpdateNetworkMessageSaveState) this.f.b();
    }

    public final Long b(String str) {
        akcr.b(str, "messageId");
        Object idForMessageId = NetworkMessageRecord.FACTORY.getIdForMessageId(str);
        akcr.a(idForMessageId, "NetworkMessageRecord.FAC…IdForMessageId(messageId)");
        DbClient dbClient = this.a;
        Object obj = NetworkMessageRecord.FACTORY;
        akcr.a(obj, "NetworkMessageRecord.FACTORY");
        obj = obj.getIdForMessageIdMapper();
        akcr.a(obj, "NetworkMessageRecord.FACTORY.idForMessageIdMapper");
        return (Long) dbClient.queryFirst(idForMessageId, obj);
    }

    public final int c(String str) {
        akcr.b(str, "messageId");
        this.a.throwIfNotDbScheduler();
        e().bind(str);
        Object obj = this.a;
        akcr.a(obj, "briteDatabase");
        return BriteDatabaseExtensionsKt.executeUpdate(obj, e());
    }

    /* Access modifiers changed, original: final */
    public final UpdateMessagePreservationState c() {
        return (UpdateMessagePreservationState) this.g.b();
    }
}
