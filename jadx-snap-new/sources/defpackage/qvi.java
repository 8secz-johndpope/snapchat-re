package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.ScreenshottedOrReplayedState.Record;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.LegacyMessageQueries;
import com.snap.core.db.record.MessageModel.GetSnapInfoFromMessageByMessageIdModel;
import com.snap.core.db.record.MessageRecord;
import com.snap.core.db.record.MessageRecord.GetSnapInfoFromMessageWithMessageIdModel;
import com.snap.core.db.record.NetworkMessageRecord.UnreleasedMessagesWithType;
import defpackage.gcm.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: qvi */
public final class qvi {
    final SnapDb a;
    final ajwy<quw> b;
    final ajwy<qvj> c;
    final ajwy<qvw> d;
    final ajwy<qus> e;
    private final DbClient f = this.a.getDbClient(pry.a.callsite("NetworkMessageProcessor"));
    private final ajwy<rsi> g;
    private final ajwy<qvs> h;
    private final ajwy<iqx> i;
    private final ajwy<quk> j;
    private final ajwy<abkq> k;
    private final ajwy<qvd> l;
    private final ajwy<gqr> m;
    private final ajwy<qvt> n;

    /* renamed from: qvi$a */
    static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ qvi a;
        private /* synthetic */ String b;
        private /* synthetic */ long c;

        a(qvi qvi, String str, long j) {
            this.a = qvi;
            this.b = str;
            this.c = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            ((qvj) this.a.c.get()).a(this.b, SnapServerStatus.VIEWED);
            ((qvw) this.a.d.get()).a(this.b, dbTransaction);
            ((qus) this.a.e.get()).a(dbTransaction, qvv.SINGLE_UPDATE, this.c);
            return ajxw.a;
        }
    }

    public qvi(SnapDb snapDb, ajwy<quw> ajwy, ajwy<qvj> ajwy2, ajwy<qvw> ajwy3, ajwy<rsi> ajwy4, ajwy<qvs> ajwy5, ajwy<iqx> ajwy6, ajwy<quk> ajwy7, ajwy<abkq> ajwy8, ajwy<qvd> ajwy9, ajwy<gqr> ajwy10, ajwy<qvt> ajwy11, ajwy<qus> ajwy12) {
        akcr.b(snapDb, "snapDb");
        akcr.b(ajwy, "localMessageActionRepository");
        akcr.b(ajwy2, "networkMessageRepository");
        akcr.b(ajwy3, "messageTableMerger");
        akcr.b(ajwy4, "serializableParcelContentSojuAdapter");
        akcr.b(ajwy5, "snapKeyProcessor");
        akcr.b(ajwy6, "friendRepository");
        akcr.b(ajwy7, "conversationsRepository");
        akcr.b(ajwy8, "userSession");
        akcr.b(ajwy9, "messagingRepository");
        akcr.b(ajwy10, "exceptionTracker");
        akcr.b(ajwy11, "snapRefactorMigratorImpl");
        akcr.b(ajwy12, "interactionMessagesRepository");
        this.a = snapDb;
        this.b = ajwy;
        this.c = ajwy2;
        this.d = ajwy3;
        this.g = ajwy4;
        this.h = ajwy5;
        this.i = ajwy6;
        this.j = ajwy7;
        this.k = ajwy8;
        this.l = ajwy9;
        this.m = ajwy10;
        this.n = ajwy11;
        this.e = ajwy12;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:148:0x0309 in {2, 3, 6, 7, 16, 17, 22, 23, 24, 30, 31, 32, 42, 47, 48, 51, 61, 68, 70, 71, 72, 77, 78, 82, 83, 85, 88, 89, 90, 93, 94, 97, 98, 101, 102, 117, 119, 120, 121, 126, 127, 132, 133, 138, 139, 142, 143, 145, 147} preds:[]
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
    private final defpackage.qdr a(defpackage.aenb r28, long r29, long r31) {
        /*
        r27 = this;
        r1 = r27;
        r2 = r28;
        r0 = r2.c;
        if (r0 == 0) goto L_0x000c;
        r0 = r2.c;
        r6 = r0;
        goto L_0x001d;
        r0 = r2.b;
        if (r0 == 0) goto L_0x001c;
        r0 = r2.b;
        r0 = r0.intValue();
        r4 = (double) r0;
        r0 = java.lang.Double.valueOf(r4);
        goto L_0x000a;
        r6 = 0;
        r0 = r1.l;
        r0 = r0.get();
        r0 = (defpackage.qvd) r0;
        r4 = r29;
        r0 = r0.f(r4);
        if (r0 == 0) goto L_0x02f1;
        r15 = r0.key();
        if (r15 == 0) goto L_0x02f1;
        r0 = "messagingRepository.get(…or snap from ${snap.sn}\")";
        defpackage.akcr.a(r15, r0);
        r0 = r2.W;
        r4 = 0;
        if (r0 == 0) goto L_0x0047;
        r0 = r0.l;
        if (r0 == 0) goto L_0x0047;
        r0 = r0.booleanValue();
        r5 = r0;
        goto L_0x0048;
        r5 = 0;
        r0 = r2.O;
        r14 = "snap.id";
        defpackage.akcr.a(r0, r14);
        r8 = defpackage.qwh.a(r0);
        r0 = com.snap.core.db.column.SnapServerStatus.parseFromSnap(r28);
        r7 = r2.a;
        r7 = (java.lang.CharSequence) r7;
        r13 = 1;
        if (r7 == 0) goto L_0x0067;
        r7 = r7.length();
        if (r7 != 0) goto L_0x0065;
        goto L_0x0067;
        r7 = 0;
        goto L_0x0068;
        r7 = 1;
        if (r7 != 0) goto L_0x008c;
        r0 = com.snap.core.db.column.SnapServerStatus.hasBeenOpened(r0);
        if (r0 != 0) goto L_0x008c;
        r0 = r1.h;
        r0 = r0.get();
        r7 = r0;
        r7 = (defpackage.qvs) r7;
        r9 = r2.w;
        r10 = r2.M;
        r11 = r2.I;
        r12 = r2.C;
        r0 = r2.E;
        r3 = 1;
        r13 = r0;
        r0 = r7.a(r8, r9, r10, r11, r12, r13);
        if (r0 != 0) goto L_0x008f;
        goto L_0x008d;
        r3 = 1;
        r0 = r2.E;
        r21 = r0;
        r0 = r2.W;
        if (r0 == 0) goto L_0x00d7;
        r0 = r0.k;
        if (r0 == 0) goto L_0x00d7;
        r0 = (java.lang.Iterable) r0;
        r7 = new java.util.ArrayList;
        r7.<init>();
        r7 = (java.util.Collection) r7;
        r0 = r0.iterator();
        r8 = r0.hasNext();
        if (r8 == 0) goto L_0x00c5;
        r8 = r0.next();
        r9 = r8;
        r9 = (defpackage.aeye) r9;
        r9 = r9.a;
        r10 = defpackage.aeyg.REMOTE_WEB_PAGE;
        r10 = r10.toString();
        r9 = defpackage.akcr.a(r9, r10);
        if (r9 == 0) goto L_0x00a6;
        r7.add(r8);
        goto L_0x00a6;
        r7 = (java.util.List) r7;
        r0 = defpackage.ajyu.g(r7);
        r0 = (defpackage.aeye) r0;
        if (r0 == 0) goto L_0x00d7;
        r0 = r0.b;
        if (r0 == 0) goto L_0x00d7;
        r0 = r0.a;
        r10 = r0;
        goto L_0x00d8;
        r10 = 0;
        r0 = r2.N;
        r7 = r2.h;
        if (r7 == 0) goto L_0x00f8;
        r0 = new aesg;
        r0.<init>();
        r7 = r2.h;
        r0.a = r7;
        r7 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r7 = java.lang.Long.valueOf(r7);
        r0.b = r7;
        r7 = "";
        r0.d = r7;
        r0.c = r7;
        r19 = r0;
        r0 = r2.W;
        if (r0 == 0) goto L_0x0198;
        r0 = r0.k;
        if (r0 == 0) goto L_0x0198;
        r0 = (java.lang.Iterable) r0;
        r7 = new java.util.ArrayList;
        r7.<init>();
        r7 = (java.util.Collection) r7;
        r0 = r0.iterator();
        r8 = r0.hasNext();
        if (r8 == 0) goto L_0x012e;
        r8 = r0.next();
        r9 = r8;
        r9 = (defpackage.aeye) r9;
        r9 = r9.a;
        r11 = defpackage.aeyg.COGNAC;
        r11 = r11.toString();
        r9 = defpackage.akcr.a(r9, r11);
        if (r9 == 0) goto L_0x010f;
        r7.add(r8);
        goto L_0x010f;
        r7 = (java.util.List) r7;
        r0 = defpackage.ajyu.g(r7);
        r0 = (defpackage.aeye) r0;
        if (r0 == 0) goto L_0x0198;
        r0 = r0.c;
        if (r0 == 0) goto L_0x0198;
        r7 = r0.a;	 Catch:{ Exception -> 0x017d }
        r7 = java.util.UUID.fromString(r7);	 Catch:{ Exception -> 0x017d }
        r8 = new alqi;	 Catch:{ Exception -> 0x017d }
        r8.<init>();	 Catch:{ Exception -> 0x017d }
        r9 = new aler;	 Catch:{ Exception -> 0x017d }
        r9.<init>();	 Catch:{ Exception -> 0x017d }
        r11 = "javaUUID";	 Catch:{ Exception -> 0x017d }
        defpackage.akcr.a(r7, r11);	 Catch:{ Exception -> 0x017d }
        r11 = r7.getMostSignificantBits();	 Catch:{ Exception -> 0x017d }
        r9 = r9.a(r11);	 Catch:{ Exception -> 0x017d }
        r11 = r7.getLeastSignificantBits();	 Catch:{ Exception -> 0x017d }
        r7 = r9.b(r11);	 Catch:{ Exception -> 0x017d }
        r8.a = r7;	 Catch:{ Exception -> 0x017d }
        r7 = r0.b;	 Catch:{ Exception -> 0x017d }
        r8.a(r7);	 Catch:{ Exception -> 0x017d }
        r7 = r0.d;	 Catch:{ Exception -> 0x017d }
        r8.c(r7);	 Catch:{ Exception -> 0x017d }
        r7 = r0.c;	 Catch:{ Exception -> 0x017d }
        r8.d(r7);	 Catch:{ Exception -> 0x017d }
        r7 = r0.f;	 Catch:{ Exception -> 0x017d }
        r8.b(r7);	 Catch:{ Exception -> 0x017d }
        r0 = r0.e;	 Catch:{ Exception -> 0x017d }
        r8.e(r0);	 Catch:{ Exception -> 0x017d }
        goto L_0x0196;
        r0 = move-exception;
        r7 = r1.m;
        r7 = r7.get();
        r7 = (defpackage.gqr) r7;
        r8 = defpackage.gqt.HIGH;
        r0 = (java.lang.Throwable) r0;
        r9 = defpackage.eym.f;
        r11 = "NetworkMessageProcessor";
        r9 = r9.callsite(r11);
        r7.a(r8, r0, r9);
        r8 = 0;
        r11 = r8;
        goto L_0x0199;
        r11 = 0;
        r0 = r2.W;
        if (r0 == 0) goto L_0x01a6;
        r0 = r0.f;
        if (r0 == 0) goto L_0x01a6;
        r0 = defpackage.akga.f(r0);
        goto L_0x01a7;
        r0 = 0;
        if (r0 == 0) goto L_0x01dc;
        r8 = r2.W;
        if (r8 == 0) goto L_0x01b0;
        r8 = r8.t;
        goto L_0x01b1;
        r8 = 0;
        if (r8 != 0) goto L_0x01dc;
        r8 = new alsb;
        r8.<init>();
        r9 = new defpackage.alru[r3];
        r12 = new alru;
        r12.<init>();
        r30 = r8;
        r7 = r0.longValue();
        r0 = r12.a(r7);
        r9[r4] = r0;
        r0 = r30;
        r0.b = r9;
        r8 = r0;
        r8 = (com.google.protobuf.nano.MessageNano) r8;
        r0 = com.google.protobuf.nano.MessageNano.toByteArray(r8);
        r7 = 2;
        r0 = android.util.Base64.encodeToString(r0, r7);
        goto L_0x01e2;
        r0 = r2.W;
        if (r0 == 0) goto L_0x01e4;
        r0 = r0.t;
        r13 = r0;
        goto L_0x01e5;
        r13 = 0;
        r0 = new pun;
        r18 = new pse;
        r5 = java.lang.Boolean.valueOf(r5);
        r7 = r2.t;
        r8 = r2.W;
        if (r8 == 0) goto L_0x01f6;
        r8 = r8.q;
        goto L_0x01f7;
        r8 = 0;
        r9 = r2.W;
        if (r9 == 0) goto L_0x01fe;
        r9 = r9.o;
        goto L_0x01ff;
        r9 = 0;
        r9 = defpackage.gcf.a(r9);
        r12 = r2.W;
        if (r12 == 0) goto L_0x020a;
        r12 = r12.j;
        goto L_0x020b;
        r12 = 0;
        r4 = "receiver$0";
        defpackage.akcr.b(r2, r4);
        r4 = r2.W;
        if (r4 == 0) goto L_0x023c;
        r4 = r4.p;
        if (r4 == 0) goto L_0x023c;
        r4 = defpackage.aeda.valueOf(r4);
        r17 = defpackage.qwe.a;
        r4 = r4.ordinal();
        r4 = r17[r4];
        if (r4 == r3) goto L_0x0239;
        r3 = 2;
        if (r4 == r3) goto L_0x0239;
        r3 = 3;
        if (r4 == r3) goto L_0x023c;
        r3 = 4;
        if (r4 == r3) goto L_0x023c;
        r3 = 5;
        if (r4 != r3) goto L_0x0233;
        goto L_0x023c;
        r0 = new ajxk;
        r0.<init>();
        throw r0;
        r17 = 1;
        goto L_0x023e;
        r17 = 0;
        r3 = java.lang.Boolean.valueOf(r17);
        r4 = r18;
        r26 = r14;
        r14 = r3;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
        r3 = r2.O;
        r4 = r2.F;
        r5 = r2.Q;
        r23 = defpackage.gcp.a.a(r5);
        r5 = r1.g;
        r5.get();
        r5 = r2.Y;
        r24 = defpackage.rsi.a(r5);
        r5 = r2.W;
        if (r5 == 0) goto L_0x026a;
        r5 = r5.m;
        if (r5 == 0) goto L_0x026a;
        r5 = r5.a;
        goto L_0x026b;
        r5 = 0;
        r6 = r2.W;
        if (r6 == 0) goto L_0x0276;
        r6 = r6.m;
        if (r6 == 0) goto L_0x0276;
        r6 = r6.b;
        goto L_0x0277;
        r6 = 0;
        r7 = r2.W;
        if (r7 == 0) goto L_0x0282;
        r7 = r7.m;
        if (r7 == 0) goto L_0x0282;
        r7 = r7.c;
        goto L_0x0283;
        r7 = 0;
        r25 = defpackage.pun.b.a.a(r5, r6, r7);
        r17 = r0;
        r20 = r3;
        r22 = r4;
        r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25);
        r0 = (defpackage.puk) r0;
        r3 = "snap";
        defpackage.akcr.b(r2, r3);
        r3 = "conversationId";
        defpackage.akcr.b(r15, r3);
        r3 = "serializableParcelContent";
        defpackage.akcr.b(r0, r3);
        r3 = new qdr;
        r4 = r2.O;
        r5 = r26;
        defpackage.akcr.a(r4, r5);
        r8 = defpackage.qwh.a(r4);
        r4 = r2.S;
        r5 = "snap.sts";
        defpackage.akcr.a(r4, r5);
        r10 = r4.longValue();
        r4 = r2.Z;
        if (r4 == 0) goto L_0x02c2;
        r4 = r4.longValue();
        goto L_0x02c4;
        r4 = -1;
        r16 = com.snap.core.db.column.MessageClientStatus.OK;
        r6 = defpackage.aesq.SNAP;
        r6 = r6.a();
        r17 = r6;
        r7 = "MessageBodyType.SNAP.value()";
        defpackage.akcr.a(r6, r7);
        r19 = defpackage.gcj.INITIAL;
        r20 = 0;
        r6 = com.snap.core.db.column.ScreenshottedOrReplayedState.Companion;
        r21 = r6.empty();
        r22 = com.snap.core.db.column.SnapServerStatus.parseFromSnap(r28);
        r23 = 0;
        r24 = 49152; // 0xc000 float:6.8877E-41 double:2.42843E-319;
        r7 = r3;
        r9 = r15;
        r12 = r31;
        r14 = r4;
        r18 = r0;
        r7.<init>(r8, r9, r10, r12, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24);
        return r3;
        r0 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r4 = "No conversationId for snap from ";
        r3.<init>(r4);
        r2 = r2.a;
        r3.append(r2);
        r2 = r3.toString();
        r0.<init>(r2);
        r0 = (java.lang.Throwable) r0;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvi.a(aenb, long, long):qdr");
    }

    private final void a(GetSnapInfoFromMessageByMessageIdModel getSnapInfoFromMessageByMessageIdModel, boolean z, long j, String str, long j2, SnapServerStatus snapServerStatus, Long l, Long l2, Boolean bool, DbTransaction dbTransaction) {
        if (akcr.a(getSnapInfoFromMessageByMessageIdModel.type(), aesq.SNAP.a())) {
            Object obj = ((abkq) this.k.get()).b;
            boolean a = akcr.a(obj, getSnapInfoFromMessageByMessageIdModel.senderUsername());
            SnapServerStatus snapServerStatus2 = getSnapInfoFromMessageByMessageIdModel.snapServerStatus();
            if (snapServerStatus2 != null) {
                ScreenshottedOrReplayedState screenshottedOrReplayed = getSnapInfoFromMessageByMessageIdModel.screenshottedOrReplayed();
                if (screenshottedOrReplayed == null) {
                    screenshottedOrReplayed = ScreenshottedOrReplayedState.Companion.empty();
                }
                Object obj2 = screenshottedOrReplayed;
                akcr.a(obj2, "message.screenshottedOrR…edOrReplayedState.empty()");
                long longValue = l != null ? l.longValue() : 0;
                long longValue2 = l2 != null ? l2.longValue() : 0;
                Record record = new Record(j, j2, bool != null ? bool.booleanValue() : false, longValue - longValue2, longValue2);
                int hasBeenOpened = (a ^ 1) & (SnapServerStatus.hasBeenOpened(snapServerStatus2) ^ 1);
                String str2 = str;
                int a2 = akcr.a((Object) str2, obj) ^ 1;
                String str3 = (a2 == 0 || !z) ? null : str2;
                boolean z2 = z && (a2 & hasBeenOpened) != 0;
                String key = getSnapInfoFromMessageByMessageIdModel.key();
                String str4 = "message.key()";
                akcr.a((Object) key, str4);
                Long lastInteractionTimestamp = getSnapInfoFromMessageByMessageIdModel.lastInteractionTimestamp();
                if (lastInteractionTimestamp == null) {
                    lastInteractionTimestamp = Long.valueOf(0);
                }
                long longValue3 = lastInteractionTimestamp.longValue();
                yfj viewerList = getSnapInfoFromMessageByMessageIdModel.viewerList();
                a(z, key, j2, longValue3, snapServerStatus, snapServerStatus2, record, obj2, z2, str3, viewerList != null ? viewerList.a : null);
                qvw qvw = (qvw) this.d.get();
                String key2 = getSnapInfoFromMessageByMessageIdModel.key();
                akcr.a((Object) key2, str4);
                qvw.a(key2, dbTransaction);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARNING: Missing block: B:28:0x009d, code skipped:
            if (r2 == null) goto L_0x009f;
     */
    /* JADX WARNING: Missing block: B:30:0x00a3, code skipped:
            if (r2 == null) goto L_0x00a5;
     */
    private final void a(boolean r19, java.lang.String r20, long r21, long r23, com.snap.core.db.column.SnapServerStatus r25, com.snap.core.db.column.SnapServerStatus r26, com.snap.core.db.column.ScreenshottedOrReplayedState.Record r27, com.snap.core.db.column.ScreenshottedOrReplayedState r28, boolean r29, java.lang.String r30, long[] r31) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r27;
        r2 = r30;
        r3 = r31;
        r4 = r27.getReplayed();
        r5 = r27.getScreenshotCount();
        r7 = 0;
        r9 = 0;
        r10 = 1;
        r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r11 <= 0) goto L_0x001a;
    L_0x0018:
        r5 = 1;
        goto L_0x001b;
    L_0x001a:
        r5 = 0;
    L_0x001b:
        r4 = r4 | r5;
        r5 = r27.getScreenRecordCount();
        r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r11 <= 0) goto L_0x0026;
    L_0x0024:
        r5 = 1;
        goto L_0x0027;
    L_0x0026:
        r5 = 0;
    L_0x0027:
        r4 = r4 | r5;
        r5 = r28.getSortedInteractions();
        r5 = (java.lang.Iterable) r5;
        r5 = defpackage.ajyu.p(r5);
        r5 = r5.contains(r1);
        r5 = r5 ^ r10;
        r4 = r4 & r5;
        r5 = java.lang.Boolean.valueOf(r4);
        r6 = r5.booleanValue();
        r7 = 0;
        if (r6 == 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0045;
    L_0x0044:
        r5 = r7;
    L_0x0045:
        if (r5 == 0) goto L_0x0051;
    L_0x0047:
        r5.booleanValue();
        r5 = r28;
        r1 = r5.signal(r1);
        goto L_0x0054;
    L_0x0051:
        r5 = r28;
        r1 = r7;
    L_0x0054:
        if (r2 == 0) goto L_0x00ab;
    L_0x0056:
        r6 = r0.i;
        r6 = r6.get();
        r6 = (defpackage.iqx) r6;
        r11 = r6.g(r2);
        r2 = java.lang.Long.valueOf(r11);
        r6 = r2;
        r6 = (java.lang.Number) r6;
        r11 = r6.longValue();
        r13 = -1;
        r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r6 == 0) goto L_0x0075;
    L_0x0073:
        r6 = 1;
        goto L_0x0076;
    L_0x0075:
        r6 = 0;
    L_0x0076:
        if (r6 == 0) goto L_0x0079;
    L_0x0078:
        goto L_0x007a;
    L_0x0079:
        r2 = r7;
    L_0x007a:
        if (r2 == 0) goto L_0x00a5;
    L_0x007c:
        r2 = (java.lang.Number) r2;
        r11 = r2.longValue();
        if (r3 == 0) goto L_0x009f;
    L_0x0084:
        r2 = defpackage.ajyi.a(r3, r11);
        if (r2 == 0) goto L_0x008c;
    L_0x008a:
        r2 = r3;
        goto L_0x009d;
    L_0x008c:
        r2 = defpackage.ajyi.b(r31);
        r6 = java.lang.Long.valueOf(r11);
        r2.add(r6);
        r2 = (java.util.Collection) r2;
        r2 = defpackage.ajyu.g(r2);
    L_0x009d:
        if (r2 != 0) goto L_0x00a3;
    L_0x009f:
        r2 = new long[r10];
        r2[r9] = r11;
    L_0x00a3:
        if (r2 != 0) goto L_0x00a6;
    L_0x00a5:
        r2 = r3;
    L_0x00a6:
        if (r2 != 0) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00ab;
    L_0x00a9:
        r15 = r2;
        goto L_0x00ac;
    L_0x00ab:
        r15 = r3;
    L_0x00ac:
        if (r29 == 0) goto L_0x00c8;
    L_0x00ae:
        if (r1 == 0) goto L_0x00c8;
    L_0x00b0:
        r2 = r0.c;
        r2 = r2.get();
        r11 = r2;
        r11 = (defpackage.qvj) r11;
        if (r1 != 0) goto L_0x00bd;
    L_0x00bb:
        r14 = r5;
        goto L_0x00be;
    L_0x00bd:
        r14 = r1;
    L_0x00be:
        r12 = r20;
        r13 = r26;
        r16 = r23;
    L_0x00c4:
        r11.a(r12, r13, r14, r15, r16);
        return;
    L_0x00c8:
        if (r29 != 0) goto L_0x00e7;
    L_0x00ca:
        r2 = r25;
        r6 = r26;
        if (r6 != r2) goto L_0x00d2;
    L_0x00d0:
        if (r4 == 0) goto L_0x00e9;
    L_0x00d2:
        r3 = r0.c;
        r3 = r3.get();
        r11 = r3;
        r11 = (defpackage.qvj) r11;
        if (r1 != 0) goto L_0x00df;
    L_0x00dd:
        r14 = r5;
        goto L_0x00e0;
    L_0x00df:
        r14 = r1;
    L_0x00e0:
        r12 = r20;
        r13 = r25;
        r16 = r21;
        goto L_0x00c4;
    L_0x00e7:
        r6 = r26;
    L_0x00e9:
        if (r19 == 0) goto L_0x0116;
    L_0x00eb:
        if (r15 == 0) goto L_0x00f3;
    L_0x00ed:
        r1 = r15.length;
        r1 = java.lang.Integer.valueOf(r1);
        goto L_0x00f4;
    L_0x00f3:
        r1 = r7;
    L_0x00f4:
        if (r3 == 0) goto L_0x00fb;
    L_0x00f6:
        r2 = r3.length;
        r7 = java.lang.Integer.valueOf(r2);
    L_0x00fb:
        r1 = defpackage.akcr.a(r1, r7);
        r1 = r1 ^ r10;
        if (r1 == 0) goto L_0x0116;
    L_0x0102:
        r1 = r0.c;
        r1 = r1.get();
        r11 = r1;
        r11 = (defpackage.qvj) r11;
        r12 = r20;
        r13 = r26;
        r14 = r28;
        r16 = r23;
        r11.a(r12, r13, r14, r15, r16);
    L_0x0116:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvi.a(boolean, java.lang.String, long, long, com.snap.core.db.column.SnapServerStatus, com.snap.core.db.column.SnapServerStatus, com.snap.core.db.column.ScreenshottedOrReplayedState$Record, com.snap.core.db.column.ScreenshottedOrReplayedState, boolean, java.lang.String, long[]):void");
    }

    private final long b(aenb aenb, long j, long j2, DbTransaction dbTransaction) {
        j2 = a(a(aenb, j, j2), dbTransaction);
        ((qvj) this.c.get()).a(j).a(adoy.b(aenb), j2, aenb);
        return j2;
    }

    public final int a(DbTransaction dbTransaction, String str, long j, long j2, boolean z, Long l, Long l2) {
        DbTransaction dbTransaction2 = dbTransaction;
        Long l3 = l2;
        akcr.b(dbTransaction, "tx");
        String str2 = str;
        akcr.b(str, "conversationId");
        String str3 = str;
        long j3 = j;
        long j4 = j2;
        ((quw) this.b.get()).a(str3, j3, j4);
        List a = ((qvj) this.c.get()).a(str3, j3, j4, z);
        Iterable<UnreleasedMessagesWithType> iterable = a;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!akcr.a(((UnreleasedMessagesWithType) next).messageType(), aesq.SNAP.a())) {
                arrayList.add(next);
            }
        }
        Iterable<UnreleasedMessagesWithType> iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable2, 10));
        for (UnreleasedMessagesWithType messageId : iterable2) {
            arrayList2.add(messageId.messageId());
        }
        List list = (List) arrayList2;
        arrayList = new ArrayList();
        for (Object next2 : iterable) {
            if (akcr.a(((UnreleasedMessagesWithType) next2).messageType(), aesq.SNAP.a())) {
                arrayList.add(next2);
            }
        }
        iterable2 = (List) arrayList;
        Collection arrayList3 = new ArrayList(ajyn.a((Iterable) iterable2, 10));
        for (UnreleasedMessagesWithType messageId2 : iterable2) {
            arrayList3.add(messageId2.messageId());
        }
        List list2 = (List) arrayList3;
        ((qvj) this.c.get()).a(list, l, l3);
        ((qvj) this.c.get()).a(list2, null, l3);
        for (UnreleasedMessagesWithType messageId3 : iterable) {
            qvw qvw = (qvw) this.d.get();
            String messageId4 = messageId3.messageId();
            akcr.a((Object) messageId4, "message.messageId()");
            qvw.a(messageId4, dbTransaction);
        }
        return a.size();
    }

    public final long a(aegj aegj, long j, DbTransaction dbTransaction) {
        aegj aegj2 = aegj;
        DbTransaction dbTransaction2 = dbTransaction;
        String str = "chatMessage";
        akcr.b(aegj2, str);
        akcr.b(dbTransaction2, "tx");
        long a;
        try {
            puk a2 = ((rsi) this.g.get()).a(aegj2);
            String str2 = "chatMessage.header.convId";
            String str3 = "chatMessage.chatMessageId";
            String str4 = "serializableParcelContent";
            Long l;
            if (adox.a(aegj)) {
                ((qvt) this.n.get()).a(dbTransaction2);
                SnapServerStatus snapServerStatus = akcr.a(aegj2.i.a, ((abkq) this.k.get()).b) ? SnapServerStatus.SENT : SnapServerStatus.DELIVERED;
                akcr.b(aegj2, str);
                akcr.b(a2, str4);
                akcr.b(snapServerStatus, "snapServerStatus");
                str4 = aegj2.b;
                akcr.a((Object) str4, str3);
                str3 = aegj2.i.c;
                akcr.a((Object) str3, str2);
                l = aegj2.n;
                return a(new qdr(str4, str3, l != null ? l.longValue() : 0, j, adox.c(aegj2), MessageClientStatus.OK, adox.b(aegj).getNetworkStringValue(), a2, gck.a(aegj2.d), a.a(aegj2.c), ScreenshottedOrReplayedState.Companion.empty(), snapServerStatus, null, 49152), dbTransaction2);
            }
            akcr.b(aegj2, str);
            akcr.b(a2, str4);
            str4 = aegj2.b;
            akcr.a((Object) str4, str3);
            str3 = aegj2.i.c;
            akcr.a((Object) str3, str2);
            l = aegj2.n;
            a = a(new qdr(str4, str3, l != null ? l.longValue() : 0, j, adox.c(aegj2), MessageClientStatus.OK, adox.b(aegj).getNetworkStringValue(), a2, gck.a(aegj2.d), a.a(aegj2.c), null, null, null, 63488), dbTransaction2);
            return a;
        } catch (Exception e) {
            gqr gqr = (gqr) this.m.get();
            gqt gqt = gqt.HIGH;
            StringBuilder stringBuilder = new StringBuilder("Error processing message with type ");
            stringBuilder.append(aegj2.a.e);
            gqr.a(gqt, new IllegalStateException(stringBuilder.toString(), e), pry.a.callsite("NetworkMessageProcessor"), "[processChatMessage]");
            a = -1;
        }
    }

    public final long a(aenb aenb, long j, long j2, DbTransaction dbTransaction) {
        akcr.b(aenb, "snap");
        akcr.b(dbTransaction, "tx");
        ((qvt) this.n.get()).a(dbTransaction);
        qvc a = ((qvj) this.c.get()).a(j);
        if (aenb.a == null && akcr.a(aenb.n, ((abkq) this.k.get()).b)) {
            return -1;
        }
        Long a2 = a.a(adoy.b(aenb));
        if (a2 == null) {
            return b(aenb, j, j2, dbTransaction);
        }
        long longValue = a2.longValue();
        if (!a.a(longValue, aenb)) {
            return b(aenb, j, j2, dbTransaction);
        }
        SnapServerStatus a3 = a.a(longValue);
        if (a3 == null) {
            return b(aenb, j, j2, dbTransaction);
        }
        SnapServerStatus parseFromSnap = SnapServerStatus.parseFromSnap(aenb);
        return a3 == parseFromSnap ? longValue : (!SnapServerStatus.hasBeenOpened(a3) || parseFromSnap == SnapServerStatus.SCREENSHOT) ? b(aenb, j, j2, dbTransaction) : longValue;
    }

    public final long a(qdr qdr, DbTransaction dbTransaction) {
        akcr.b(qdr, "networkMessage");
        akcr.b(dbTransaction, "tx");
        this.a.throwIfNotDbScheduler();
        try {
            ajxm a = ((qvj) this.c.get()).a(qdr, dbTransaction);
            long longValue = ((Number) a.a).longValue();
            boolean booleanValue = ((Boolean) a.b).booleanValue();
            if (longValue <= 0) {
                return -1;
            }
            Object obj = ((quw) this.b.get()).a(qdr) > 0 ? 1 : null;
            if (booleanValue || obj != null) {
                ((qvw) this.d.get()).a(qdr.a, dbTransaction);
            }
            return longValue;
        } catch (Exception e) {
            ((gqr) this.m.get()).a(gqt.HIGH, e, pry.a.callsite("NetworkMessageProcessor"), "[processNetworkMessage]");
            return -1;
        }
    }

    public final ajcx a(String str, long j) {
        akcr.b(str, "messageId");
        return this.f.runInTransaction("NetworkMessageProcessor:markFailedToLoadSnapAsViewed", new a(this, str, j));
    }

    public final void a(aehb aehb, long j, DbTransaction dbTransaction) {
        aehb aehb2 = aehb;
        DbTransaction dbTransaction2 = dbTransaction;
        akcr.b(aehb2, "groupSnapStateMessage");
        akcr.b(dbTransaction2, "tx");
        this.f.throwIfNotDbScheduler();
        ((qvt) this.n.get()).a(dbTransaction2);
        DbClient dbClient = this.f;
        Object snapInfoFromMessageByMessageId = MessageRecord.FACTORY.getSnapInfoFromMessageByMessageId(aehb2.a);
        akcr.a(snapInfoFromMessageByMessageId, "MessageRecord.FACTORY.ge…ateMessage.chatMessageId)");
        Object obj = LegacyMessageQueries.GET_SNAP_INFO_FROM_MESSAGE_MODEL_ROW_MAPPER;
        akcr.a(obj, "LegacyMessageQueries.GET…_MESSAGE_MODEL_ROW_MAPPER");
        GetSnapInfoFromMessageWithMessageIdModel getSnapInfoFromMessageWithMessageIdModel = (GetSnapInfoFromMessageWithMessageIdModel) ajyu.g(dbClient.query(snapInfoFromMessageByMessageId, obj));
        if (getSnapInfoFromMessageWithMessageIdModel != null) {
            GetSnapInfoFromMessageByMessageIdModel getSnapInfoFromMessageByMessageIdModel = getSnapInfoFromMessageWithMessageIdModel;
            Object obj2 = aehb2.i.a;
            akcr.a(obj2, "groupSnapStateMessage.header.from");
            Object obj3 = aehb2.n;
            akcr.a(obj3, "groupSnapStateMessage.timestamp");
            a(getSnapInfoFromMessageByMessageIdModel, true, j, obj2, obj3.longValue(), adox.a(aehb2, akcr.a(((abkq) this.k.get()).b, getSnapInfoFromMessageWithMessageIdModel.senderUsername())), aehb2.c, aehb2.g, adox.b(aehb), dbTransaction);
        }
    }

    public final void a(aeyr aeyr, long j, DbTransaction dbTransaction) {
        aeyr aeyr2 = aeyr;
        DbTransaction dbTransaction2 = dbTransaction;
        String str = "directSnapStateMessage.snapId";
        String str2 = "LegacyMessageQueries.GET…_MESSAGE_MODEL_ROW_MAPPER";
        String str3 = "MessageRecord.FACTORY.ge…tSnapStateMessage.snapId)";
        akcr.b(aeyr2, "directSnapStateMessage");
        akcr.b(dbTransaction2, "tx");
        this.f.throwIfNotDbScheduler();
        ((qvt) this.n.get()).a(dbTransaction2);
        DbClient dbClient = this.f;
        Object snapInfoFromMessageByMessageId = MessageRecord.FACTORY.getSnapInfoFromMessageByMessageId(aeyr2.a);
        akcr.a(snapInfoFromMessageByMessageId, str3);
        Object obj = LegacyMessageQueries.GET_SNAP_INFO_FROM_MESSAGE_MODEL_ROW_MAPPER;
        akcr.a(obj, str2);
        GetSnapInfoFromMessageWithMessageIdModel getSnapInfoFromMessageWithMessageIdModel = (GetSnapInfoFromMessageWithMessageIdModel) ajyu.g(dbClient.query(snapInfoFromMessageByMessageId, obj));
        if (getSnapInfoFromMessageWithMessageIdModel == null) {
            snapInfoFromMessageByMessageId = aeyr2.c;
            akcr.a(snapInfoFromMessageByMessageId, "directSnapStateMessage.replayed");
            if (snapInfoFromMessageByMessageId.booleanValue()) {
                quk quk = (quk) this.j.get();
                String str4 = aeyr2.i.a;
                if (str4 != null) {
                    long a = quk.a(str4);
                    if (a >= 0) {
                        aenb aenb;
                        qvc a2 = ((qvj) this.c.get()).a(a);
                        obj = aeyr2.a;
                        akcr.a(obj, str);
                        str4 = qwh.b(obj);
                        akcr.b(str4, "scrubbedSnapId");
                        Long l = (Long) a2.a.get(str4);
                        if (l != null) {
                            aenb = (aenb) a2.b.get(Long.valueOf(l.longValue()));
                        } else {
                            aenb = null;
                        }
                        if (aenb != null) {
                            str4 = aeyr2.a;
                            akcr.a((Object) str4, str);
                            str = aeyr2.i.c;
                            akcr.a((Object) str, "directSnapStateMessage.header.convId");
                            Object obj2 = aenb.S;
                            akcr.a(obj2, "cachedSnap.sts");
                            long longValue = obj2.longValue();
                            MessageClientStatus messageClientStatus = MessageClientStatus.OK;
                            String a3 = aesq.SNAP.a();
                            akcr.a((Object) a3, "MessageBodyType.SNAP.value()");
                            a(new qdr(str4, str, longValue, j, -1, messageClientStatus, a3, new pun(null, null, null, null, null, gcp.a.a(aenb.Q), null, 192), gcj.INITIAL, null, ScreenshottedOrReplayedState.Companion.empty(), SnapServerStatus.VIEWED, null, 32768), dbTransaction2);
                            DbClient dbClient2 = this.f;
                            Object snapInfoFromMessageByMessageId2 = MessageRecord.FACTORY.getSnapInfoFromMessageByMessageId(aeyr2.a);
                            akcr.a(snapInfoFromMessageByMessageId2, str3);
                            Object obj3 = LegacyMessageQueries.GET_SNAP_INFO_FROM_MESSAGE_MODEL_ROW_MAPPER;
                            akcr.a(obj3, str2);
                            getSnapInfoFromMessageWithMessageIdModel = (GetSnapInfoFromMessageWithMessageIdModel) ajyu.g(dbClient2.query(snapInfoFromMessageByMessageId2, obj3));
                        }
                    }
                } else {
                    return;
                }
            }
        }
        if (getSnapInfoFromMessageWithMessageIdModel != null) {
            GetSnapInfoFromMessageByMessageIdModel getSnapInfoFromMessageByMessageIdModel = getSnapInfoFromMessageWithMessageIdModel;
            obj = aeyr2.i.a;
            akcr.a(obj, "directSnapStateMessage.header.from");
            Object obj4 = aeyr2.n;
            akcr.a(obj4, "directSnapStateMessage.timestamp");
            a(getSnapInfoFromMessageByMessageIdModel, false, j, obj, obj4.longValue(), adox.a(aeyr2, akcr.a(((abkq) this.k.get()).b, getSnapInfoFromMessageWithMessageIdModel.senderUsername())), aeyr2.d, aeyr2.w, aeyr2.c, dbTransaction);
        }
    }

    public final boolean a(String str, DbTransaction dbTransaction) {
        akcr.b(str, "messageId");
        akcr.b(dbTransaction, "tx");
        if (((qvj) this.c.get()).c(str) <= 0) {
            return false;
        }
        ((qvw) this.d.get()).a(str, dbTransaction);
        return true;
    }

    /* JADX WARNING: Missing block: B:3:0x0054, code skipped:
            if (r0 == null) goto L_0x0056;
     */
    public final boolean a(java.lang.String r6, defpackage.gcm r7, com.snap.core.db.api.DbTransaction r8) {
        /*
        r5 = this;
        r0 = "messageId";
        defpackage.akcr.b(r6, r0);
        r1 = "savedStates";
        defpackage.akcr.b(r7, r1);
        r2 = "tx";
        defpackage.akcr.b(r8, r2);
        r2 = r5.a;
        r2.throwIfNotDbScheduler();
        r2 = r5.c;
        r2 = r2.get();
        r2 = (defpackage.qvj) r2;
        defpackage.akcr.b(r6, r0);
        defpackage.akcr.b(r7, r1);
        r0 = r2.a;
        r0.throwIfNotDbScheduler();
        r0 = r2.a;
        r1 = com.snap.core.db.record.NetworkMessageRecord.FACTORY;
        r1 = r1.getSavedStatesForMessage(r6);
        r3 = "NetworkMessageRecord.FAC…atesForMessage(messageId)";
        defpackage.akcr.a(r1, r3);
        r3 = com.snap.core.db.record.NetworkMessageRecord.FACTORY;
        r4 = "NetworkMessageRecord.FACTORY";
        defpackage.akcr.a(r3, r4);
        r3 = r3.getSavedStatesForMessageMapper();
        r4 = "NetworkMessageRecord.FAC…vedStatesForMessageMapper";
        defpackage.akcr.a(r3, r4);
        r0 = r0.query(r1, r3);
        r0 = defpackage.ajyu.g(r0);
        r0 = (defpackage.gcm) r0;
        if (r0 == 0) goto L_0x0056;
    L_0x0050:
        r0 = r0.a(r7);
        if (r0 != 0) goto L_0x0057;
    L_0x0056:
        r0 = r7;
    L_0x0057:
        r1 = r2.b();
        r1.bind(r0, r6);
        r0 = r2.a;
        r1 = "briteDatabase";
        defpackage.akcr.a(r0, r1);
        r1 = r2.b();
        r1 = (defpackage.ainy) r1;
        r0 = com.snap.core.db.api.BriteDatabaseExtensionsKt.executeUpdate(r0, r1);
        if (r0 <= 0) goto L_0x0089;
    L_0x0071:
        r0 = r5.b;
        r0 = r0.get();
        r0 = (defpackage.quw) r0;
        r0.a(r6, r7);
        r7 = r5.d;
        r7 = r7.get();
        r7 = (defpackage.qvw) r7;
        r7.a(r6, r8);
        r6 = 1;
        return r6;
    L_0x0089:
        r6 = 0;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvi.a(java.lang.String, gcm, com.snap.core.db.api.DbTransaction):boolean");
    }
}
