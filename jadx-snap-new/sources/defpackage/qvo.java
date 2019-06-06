package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.SeenSequenceNumbersModel;
import com.snap.core.db.record.SeenSequenceNumbersModel.ClearAllSeenSequenceNumbers;
import com.snap.core.db.record.SequenceNumbersModel;
import com.snap.core.db.record.SequenceNumbersModel.ClearSequenceNumbersForGroup;
import com.snap.core.db.record.SequenceNumbersModel.DropAllSequenceNumbers;
import com.snap.core.db.record.SequenceNumbersModel.RemoveSequenceNumbersForUser;
import com.snap.core.db.record.SequenceNumbersRecord;
import java.util.Collection;

/* renamed from: qvo */
public final class qvo {
    final idd a = pry.a.callsite("SequenceNumberRepository");
    public final ajxe b;
    public final ajxe c;
    public final quu d;
    private final ajxe e;
    private final ajxe f;
    private final ajxe g;
    private final ajxe h;

    /* renamed from: qvo$e */
    static final class e extends akcs implements akbk<DbClient> {
        private /* synthetic */ qvo a;
        private /* synthetic */ SnapDb b;

        e(qvo qvo, SnapDb snapDb) {
            this.a = qvo;
            this.b = snapDb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.b.getDbClient(this.a.a);
        }
    }

    /* renamed from: qvo$f */
    static final class f extends akcs implements akbk<RemoveSequenceNumbersForUser> {
        private /* synthetic */ qvo a;

        f(qvo qvo) {
            this.a = qvo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new RemoveSequenceNumbersForUser(this.a.a().getWritableDatabase());
        }
    }

    /* renamed from: qvo$d */
    static final class d extends akcs implements akbk<ClearSequenceNumbersForGroup> {
        private /* synthetic */ qvo a;

        d(qvo qvo) {
            this.a = qvo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ClearSequenceNumbersForGroup(this.a.a().getWritableDatabase());
        }
    }

    /* renamed from: qvo$c */
    static final class c extends akcs implements akbk<SeenSequenceNumbersModel.ClearSequenceNumbersForGroup> {
        private /* synthetic */ qvo a;

        c(qvo qvo) {
            this.a = qvo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SeenSequenceNumbersModel.ClearSequenceNumbersForGroup(this.a.a().getWritableDatabase());
        }
    }

    /* renamed from: qvo$b */
    static final class b extends akcs implements akbk<DropAllSequenceNumbers> {
        private /* synthetic */ qvo a;

        b(qvo qvo) {
            this.a = qvo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DropAllSequenceNumbers(this.a.a().getWritableDatabase());
        }
    }

    /* renamed from: qvo$a */
    static final class a extends akcs implements akbk<ClearAllSeenSequenceNumbers> {
        private /* synthetic */ qvo a;

        a(qvo qvo) {
            this.a = qvo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ClearAllSeenSequenceNumbers(this.a.a().getWritableDatabase());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(qvo.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(qvo.class), "removeUserFromSequenceNumbersUpdate", "getRemoveUserFromSequenceNumbersUpdate()Lcom/snap/core/db/record/SequenceNumbersModel$RemoveSequenceNumbersForUser;"), new akdc(akde.a(qvo.class), "clearSequenceNumbersForGroupUpdate", "getClearSequenceNumbersForGroupUpdate()Lcom/snap/core/db/record/SequenceNumbersModel$ClearSequenceNumbersForGroup;"), new akdc(akde.a(qvo.class), "clearSeenSequenceNumbersForGroup", "getClearSeenSequenceNumbersForGroup()Lcom/snap/core/db/record/SeenSequenceNumbersModel$ClearSequenceNumbersForGroup;"), new akdc(akde.a(qvo.class), "clearAllSequenceNumbers", "getClearAllSequenceNumbers()Lcom/snap/core/db/record/SequenceNumbersModel$DropAllSequenceNumbers;"), new akdc(akde.a(qvo.class), "clearAllSeenSequenceNumbers", "getClearAllSeenSequenceNumbers()Lcom/snap/core/db/record/SeenSequenceNumbersModel$ClearAllSeenSequenceNumbers;")};
    }

    public qvo(SnapDb snapDb) {
        akcr.b(snapDb, "snapDb");
        this.e = ajxh.a(new e(this, snapDb));
        this.f = ajxh.a(new f(this));
        this.g = ajxh.a(new d(this));
        this.h = ajxh.a(new c(this));
        this.b = ajxh.a(new b(this));
        this.c = ajxh.a(new a(this));
        this.d = new quu();
    }

    private static qvq a(SequenceNumbersModel sequenceNumbersModel) {
        long feedRowId = sequenceNumbersModel.feedRowId();
        Object username = sequenceNumbersModel.username();
        akcr.a(username, "this.username()");
        return new qvq(feedRowId, username, sequenceNumbersModel.serverLatest(), sequenceNumbersModel.serverEarliest(), sequenceNumbersModel.processedLatest(), sequenceNumbersModel.processedEarliest(), sequenceNumbersModel.updateNumber());
    }

    public final long a(long j, String str, DbTransaction dbTransaction) {
        long longValue;
        long j2;
        akcr.b(str, "username");
        akcr.b(dbTransaction, "tx");
        a().throwIfNotDbScheduler();
        qvq a = a(j, str);
        if (a != null) {
            Long l = a.g;
            if (l != null) {
                longValue = l.longValue();
                j2 = 1 + longValue;
                a((Collection) ajyl.a(new qvq(j, str, null, Long.valueOf(j2), 60)), dbTransaction);
                return j2;
            }
        }
        longValue = 0;
        j2 = 1 + longValue;
        a((Collection) ajyl.a(new qvq(j, str, null, Long.valueOf(j2), 60)), dbTransaction);
        return j2;
    }

    public final DbClient a() {
        return (DbClient) this.e.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x00ac in {7, 8, 10, 12} preds:[]
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
    public final java.util.List<defpackage.ahak> a(java.util.List<java.lang.String> r7) {
        /*
        r6 = this;
        r0 = "groupIds";
        defpackage.akcr.b(r7, r0);
        r0 = new java.util.LinkedHashMap;
        r0.<init>();
        r0 = (java.util.Map) r0;
        r1 = r6.a();
        r2 = com.snap.core.db.record.SequenceNumbersRecord.FACTORY;
        r7 = (java.util.Collection) r7;
        r3 = 0;
        r3 = new java.lang.String[r3];
        r7 = r7.toArray(r3);
        if (r7 == 0) goto L_0x00a4;
        r7 = (java.lang.String[]) r7;
        r7 = r2.selectSequenceNumbersForDeltaMultiple(r7);
        r2 = "SequenceNumbersRecord.FA…(groupIds.toTypedArray())";
        defpackage.akcr.a(r7, r2);
        r2 = com.snap.core.db.record.SequenceNumbersRecord.FOR_MULTIPLE_DELTA_ROW_MAPPER;
        r3 = "SequenceNumbersRecord.FO…MULTIPLE_DELTA_ROW_MAPPER";
        defpackage.akcr.a(r2, r3);
        r7 = r1.query(r7, r2);
        r7 = r7.iterator();
        r1 = r7.hasNext();
        if (r1 == 0) goto L_0x0099;
        r1 = r7.next();
        r1 = (com.snap.core.db.record.SequenceNumbersRecord.ForMultipleDelta) r1;
        r2 = r1.key();
        r3 = "seqNum.key()";
        defpackage.akcr.a(r2, r3);
        r3 = r0.get(r2);
        if (r3 != 0) goto L_0x0072;
        r3 = new ahak;
        r3.<init>();
        r4 = r1.key();
        r3.a = r4;
        r4 = new java.util.LinkedHashMap;
        r4.<init>();
        r4 = (java.util.Map) r4;
        r3.c = r4;
        r4 = new java.util.LinkedHashMap;
        r4.<init>();
        r4 = (java.util.Map) r4;
        r3.b = r4;
        r0.put(r2, r3);
        r3 = (defpackage.ahak) r3;
        r2 = r3.c;
        r4 = "deltaQuery.earliestSequenceNumbers";
        defpackage.akcr.a(r2, r4);
        r4 = r1.username();
        r5 = r1.processedEarliest();
        r2.put(r4, r5);
        r2 = r3.b;
        r3 = "deltaQuery.latestSequenceNumbers";
        defpackage.akcr.a(r2, r3);
        r3 = r1.username();
        r1 = r1.processedLatest();
        r2.put(r3, r1);
        goto L_0x0037;
        r7 = r0.values();
        r7 = (java.lang.Iterable) r7;
        r7 = defpackage.ajyu.k(r7);
        return r7;
        r7 = new ajxt;
        r0 = "null cannot be cast to non-null type kotlin.Array<T>";
        r7.<init>(r0);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvo.a(java.util.List):java.util.List");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x005b in {4, 6, 8} preds:[]
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
    public final java.util.Map<java.lang.String, defpackage.qvq> a(long r5) {
        /*
        r4 = this;
        r0 = new java.util.HashMap;	 Catch:{ all -> 0x0059 }
        r0.<init>();	 Catch:{ all -> 0x0059 }
        r1 = r4.a();	 Catch:{ all -> 0x0059 }
        r2 = com.snap.core.db.record.SequenceNumbersRecord.FACTORY;	 Catch:{ all -> 0x0059 }
        r5 = r2.selectSequenceNumbers(r5);	 Catch:{ all -> 0x0059 }
        r6 = "SequenceNumbersRecord.FA…ctSequenceNumbers(feedId)";	 Catch:{ all -> 0x0059 }
        defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x0059 }
        r6 = com.snap.core.db.record.SequenceNumbersRecord.FACTORY;	 Catch:{ all -> 0x0059 }
        r6 = r6.selectSequenceNumbersMapper();	 Catch:{ all -> 0x0059 }
        r2 = "SequenceNumbersRecord.FA…ctSequenceNumbersMapper()";	 Catch:{ all -> 0x0059 }
        defpackage.akcr.a(r6, r2);	 Catch:{ all -> 0x0059 }
        r6 = (defpackage.ainw) r6;	 Catch:{ all -> 0x0059 }
        r5 = r1.query(r5, r6);	 Catch:{ all -> 0x0059 }
        r5 = r5.iterator();	 Catch:{ all -> 0x0059 }
        r6 = r5.hasNext();	 Catch:{ all -> 0x0059 }
        if (r6 == 0) goto L_0x0056;	 Catch:{ all -> 0x0059 }
        r6 = r5.next();	 Catch:{ all -> 0x0059 }
        r6 = (com.snap.core.db.record.SequenceNumbersRecord) r6;	 Catch:{ all -> 0x0059 }
        r1 = "model";	 Catch:{ all -> 0x0059 }
        defpackage.akcr.a(r6, r1);	 Catch:{ all -> 0x0059 }
        r1 = r6;	 Catch:{ all -> 0x0059 }
        r1 = (com.snap.core.db.record.SequenceNumbersModel) r1;	 Catch:{ all -> 0x0059 }
        r1 = defpackage.qvo.a(r1);	 Catch:{ all -> 0x0059 }
        r2 = r0;	 Catch:{ all -> 0x0059 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x0059 }
        r6 = r6.username();	 Catch:{ all -> 0x0059 }
        r3 = "model.username()";	 Catch:{ all -> 0x0059 }
        defpackage.akcr.a(r6, r3);	 Catch:{ all -> 0x0059 }
        r2.put(r6, r1);	 Catch:{ all -> 0x0059 }
        r6 = r4.d;	 Catch:{ all -> 0x0059 }
        r6.a(r1);	 Catch:{ all -> 0x0059 }
        goto L_0x0029;	 Catch:{ all -> 0x0059 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0059 }
        return r0;
        r5 = move-exception;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvo.a(long):java.util.Map");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0060 in {5, 7, 9} preds:[]
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
    public final java.util.Map<java.lang.String, defpackage.qvq> a(java.lang.String r6) {
        /*
        r5 = this;
        r0 = "conversationId";
        defpackage.akcr.b(r6, r0);
        r0 = new java.util.HashMap;	 Catch:{ all -> 0x005e }
        r0.<init>();	 Catch:{ all -> 0x005e }
        r1 = r5.a();	 Catch:{ all -> 0x005e }
        r2 = com.snap.core.db.record.SequenceNumbersRecord.FACTORY;	 Catch:{ all -> 0x005e }
        r6 = r2.selectSequenceNumbersForFeedByKey(r6);	 Catch:{ all -> 0x005e }
        r2 = "SequenceNumbersRecord.FA…FeedByKey(conversationId)";	 Catch:{ all -> 0x005e }
        defpackage.akcr.a(r6, r2);	 Catch:{ all -> 0x005e }
        r2 = com.snap.core.db.record.SequenceNumbersRecord.FACTORY;	 Catch:{ all -> 0x005e }
        r2 = r2.selectSequenceNumbersForFeedByKeyMapper();	 Catch:{ all -> 0x005e }
        r3 = "SequenceNumbersRecord.FA…mbersForFeedByKeyMapper()";	 Catch:{ all -> 0x005e }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x005e }
        r2 = (defpackage.ainw) r2;	 Catch:{ all -> 0x005e }
        r6 = r1.query(r6, r2);	 Catch:{ all -> 0x005e }
        r6 = r6.iterator();	 Catch:{ all -> 0x005e }
        r1 = r6.hasNext();	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x005b;	 Catch:{ all -> 0x005e }
        r1 = r6.next();	 Catch:{ all -> 0x005e }
        r1 = (com.snap.core.db.record.SequenceNumbersRecord) r1;	 Catch:{ all -> 0x005e }
        r2 = "model";	 Catch:{ all -> 0x005e }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x005e }
        r2 = r1;	 Catch:{ all -> 0x005e }
        r2 = (com.snap.core.db.record.SequenceNumbersModel) r2;	 Catch:{ all -> 0x005e }
        r2 = defpackage.qvo.a(r2);	 Catch:{ all -> 0x005e }
        r3 = r0;	 Catch:{ all -> 0x005e }
        r3 = (java.util.Map) r3;	 Catch:{ all -> 0x005e }
        r1 = r1.username();	 Catch:{ all -> 0x005e }
        r4 = "model.username()";	 Catch:{ all -> 0x005e }
        defpackage.akcr.a(r1, r4);	 Catch:{ all -> 0x005e }
        r3.put(r1, r2);	 Catch:{ all -> 0x005e }
        r1 = r5.d;	 Catch:{ all -> 0x005e }
        r1.a(r2);	 Catch:{ all -> 0x005e }
        goto L_0x002e;	 Catch:{ all -> 0x005e }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x005e }
        return r0;
        r6 = move-exception;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvo.a(java.lang.String):java.util.Map");
    }

    public final qvq a(long j, String str) {
        akcr.b(str, "username");
        DbClient a = a();
        Object selectSequenceNumbersForUsername = SequenceNumbersRecord.FACTORY.selectSequenceNumbersForUsername(j, str);
        akcr.a(selectSequenceNumbersForUsername, "SequenceNumbersRecord.FA…sername(feedId, username)");
        Object selectSequenceNumbersMapper = SequenceNumbersRecord.FACTORY.selectSequenceNumbersMapper();
        akcr.a(selectSequenceNumbersMapper, "SequenceNumbersRecord.FA…ctSequenceNumbersMapper()");
        SequenceNumbersRecord sequenceNumbersRecord = (SequenceNumbersRecord) a.queryFirst(selectSequenceNumbersForUsername, (ainw) selectSequenceNumbersMapper);
        qvq a2 = sequenceNumbersRecord != null ? qvo.a((SequenceNumbersModel) sequenceNumbersRecord) : null;
        if (a2 != null) {
            this.d.a(a2);
        }
        return a2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x00f8 in {10, 14, 17, 20, 23, 25, 26, 28} preds:[]
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
    public final void a(java.util.Collection<defpackage.qvq> r12, com.snap.core.db.api.DbTransaction r13) {
        /*
        r11 = this;
        r0 = " AND username = '";
        r1 = "sequenceNumbers";
        defpackage.akcr.b(r12, r1);
        r1 = "tx";
        defpackage.akcr.b(r13, r1);
        r13 = r11.a();	 Catch:{ all -> 0x00f6 }
        r13.throwIfNotDbScheduler();	 Catch:{ all -> 0x00f6 }
        r12 = (java.lang.Iterable) r12;	 Catch:{ all -> 0x00f6 }
        r12 = r12.iterator();	 Catch:{ all -> 0x00f6 }
        r13 = r12.hasNext();	 Catch:{ all -> 0x00f6 }
        if (r13 == 0) goto L_0x00f5;	 Catch:{ all -> 0x00f6 }
        r13 = r12.next();	 Catch:{ all -> 0x00f6 }
        r13 = (defpackage.qvq) r13;	 Catch:{ all -> 0x00f6 }
        r1 = r11.d;	 Catch:{ all -> 0x00f6 }
        r2 = r13.a;	 Catch:{ all -> 0x00f6 }
        r4 = r13.b;	 Catch:{ all -> 0x00f6 }
        r1 = r1.a(r2, r4);	 Catch:{ all -> 0x00f6 }
        r13 = defpackage.qvp.a(r13, r1);	 Catch:{ all -> 0x00f6 }
        r1 = defpackage.akcr.a(r13, r1);	 Catch:{ all -> 0x00f6 }
        r1 = r1 ^ 1;	 Catch:{ all -> 0x00f6 }
        if (r1 == 0) goto L_0x0019;	 Catch:{ all -> 0x00f6 }
        r1 = r13.a;	 Catch:{ all -> 0x00f6 }
        r3 = r13.b;	 Catch:{ all -> 0x00f6 }
        r4 = r13.c;	 Catch:{ all -> 0x00f6 }
        r5 = r13.d;	 Catch:{ all -> 0x00f6 }
        r6 = r13.e;	 Catch:{ all -> 0x00f6 }
        r7 = r13.f;	 Catch:{ all -> 0x00f6 }
        r8 = r13.g;	 Catch:{ all -> 0x00f6 }
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f6 }
        r10 = "\n\t\t|INSERT OR REPLACE INTO SequenceNumbers (feedRowId, username, serverLatest, serverEarliest, processedLatest, processedEarliest, updateNumber)\n\t\t|VALUES (\n\t\t|    ";	 Catch:{ all -> 0x00f6 }
        r9.<init>(r10);	 Catch:{ all -> 0x00f6 }
        r9.append(r1);	 Catch:{ all -> 0x00f6 }
        r10 = ",\n\t\t|    '";	 Catch:{ all -> 0x00f6 }
        r9.append(r10);	 Catch:{ all -> 0x00f6 }
        r9.append(r3);	 Catch:{ all -> 0x00f6 }
        r10 = "',\n\t\t|    (SELECT coalesce(MAX(currentServerLatest, newServerLatest), newServerLatest, currentServerLatest)\n\t\t|     FROM (SELECT IFNULL(";	 Catch:{ all -> 0x00f6 }
        r9.append(r10);	 Catch:{ all -> 0x00f6 }
        r10 = "NULL";
        if (r4 != 0) goto L_0x0065;
        r4 = r10;
        r9.append(r4);	 Catch:{ all -> 0x00f6 }
        r4 = ", NULL) AS newServerLatest)\n\t\t|     LEFT JOIN (SELECT serverLatest AS currentServerLatest FROM SequenceNumbers WHERE feedRowId = ";	 Catch:{ all -> 0x00f6 }
        r9.append(r4);	 Catch:{ all -> 0x00f6 }
        r9.append(r1);	 Catch:{ all -> 0x00f6 }
        r9.append(r0);	 Catch:{ all -> 0x00f6 }
        r9.append(r3);	 Catch:{ all -> 0x00f6 }
        r4 = "')),\n\t\t|    (SELECT coalesce(MIN(currentServerEarliest, newServerEarliest), newServerEarliest, currentServerEarliest)\n\t\t|     FROM (SELECT IFNULL(";	 Catch:{ all -> 0x00f6 }
        r9.append(r4);	 Catch:{ all -> 0x00f6 }
        if (r5 != 0) goto L_0x007e;	 Catch:{ all -> 0x00f6 }
        r5 = r10;	 Catch:{ all -> 0x00f6 }
        r9.append(r5);	 Catch:{ all -> 0x00f6 }
        r4 = ", NULL) AS newServerEarliest)\n\t\t|     LEFT JOIN (SELECT serverEarliest AS currentServerEarliest FROM SequenceNumbers WHERE feedRowId = ";	 Catch:{ all -> 0x00f6 }
        r9.append(r4);	 Catch:{ all -> 0x00f6 }
        r9.append(r1);	 Catch:{ all -> 0x00f6 }
        r9.append(r0);	 Catch:{ all -> 0x00f6 }
        r9.append(r3);	 Catch:{ all -> 0x00f6 }
        r4 = "')),\n\t\t|    (SELECT coalesce(MAX(currentProcessedLatest, newProcessedLatest), newProcessedLatest, currentProcessedLatest)\n\t\t|     FROM (SELECT IFNULL(";	 Catch:{ all -> 0x00f6 }
        r9.append(r4);	 Catch:{ all -> 0x00f6 }
        if (r6 != 0) goto L_0x0097;	 Catch:{ all -> 0x00f6 }
        r6 = r10;	 Catch:{ all -> 0x00f6 }
        r9.append(r6);	 Catch:{ all -> 0x00f6 }
        r4 = ", NULL) AS newProcessedLatest)\n\t\t|     LEFT JOIN (SELECT processedLatest AS currentProcessedLatest FROM SequenceNumbers WHERE feedRowId = ";	 Catch:{ all -> 0x00f6 }
        r9.append(r4);	 Catch:{ all -> 0x00f6 }
        r9.append(r1);	 Catch:{ all -> 0x00f6 }
        r9.append(r0);	 Catch:{ all -> 0x00f6 }
        r9.append(r3);	 Catch:{ all -> 0x00f6 }
        r4 = "')),\n\t\t|    (SELECT coalesce(MIN(currentProcessedEarliest, newProcessedEarliest), newProcessedEarliest, currentProcessedEarliest)\n\t\t|     FROM (SELECT IFNULL(";	 Catch:{ all -> 0x00f6 }
        r9.append(r4);	 Catch:{ all -> 0x00f6 }
        if (r7 != 0) goto L_0x00b0;	 Catch:{ all -> 0x00f6 }
        r7 = r10;	 Catch:{ all -> 0x00f6 }
        r9.append(r7);	 Catch:{ all -> 0x00f6 }
        r4 = ", NULL) AS newProcessedEarliest)\n\t\t|     LEFT JOIN (SELECT processedEarliest AS currentProcessedEarliest FROM SequenceNumbers WHERE feedRowId = ";	 Catch:{ all -> 0x00f6 }
        r9.append(r4);	 Catch:{ all -> 0x00f6 }
        r9.append(r1);	 Catch:{ all -> 0x00f6 }
        r9.append(r0);	 Catch:{ all -> 0x00f6 }
        r9.append(r3);	 Catch:{ all -> 0x00f6 }
        r4 = "')),\n\t\t|    (SELECT coalesce(MAX(currentUpdateNumber, newUpdateNumber), newUpdateNumber, currentUpdateNumber)\n\t\t|     FROM (SELECT IFNULL(";	 Catch:{ all -> 0x00f6 }
        r9.append(r4);	 Catch:{ all -> 0x00f6 }
        if (r8 != 0) goto L_0x00c9;	 Catch:{ all -> 0x00f6 }
        r8 = r10;	 Catch:{ all -> 0x00f6 }
        r9.append(r8);	 Catch:{ all -> 0x00f6 }
        r4 = ", NULL) AS newUpdateNumber)\n\t\t|     LEFT JOIN (SELECT updateNumber AS currentUpdateNumber FROM SequenceNumbers WHERE feedRowId = ";	 Catch:{ all -> 0x00f6 }
        r9.append(r4);	 Catch:{ all -> 0x00f6 }
        r9.append(r1);	 Catch:{ all -> 0x00f6 }
        r9.append(r0);	 Catch:{ all -> 0x00f6 }
        r9.append(r3);	 Catch:{ all -> 0x00f6 }
        r1 = "'))\n\t\t|);\n        ";	 Catch:{ all -> 0x00f6 }
        r9.append(r1);	 Catch:{ all -> 0x00f6 }
        r1 = r9.toString();	 Catch:{ all -> 0x00f6 }
        r1 = defpackage.akfu.a(r1, "|");	 Catch:{ all -> 0x00f6 }
        r2 = r11.a();	 Catch:{ all -> 0x00f6 }
        r2.execute(r1);	 Catch:{ all -> 0x00f6 }
        r1 = r11.d;	 Catch:{ all -> 0x00f6 }
        r1.a(r13);	 Catch:{ all -> 0x00f6 }
        goto L_0x0019;
        return;
        r12 = move-exception;
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvo.a(java.util.Collection, com.snap.core.db.api.DbTransaction):void");
    }

    public final long b(long j, String str, DbTransaction dbTransaction) {
        long longValue;
        long j2;
        akcr.b(str, "username");
        akcr.b(dbTransaction, "tx");
        a().throwIfNotDbScheduler();
        qvq a = a(j, str);
        if (a != null) {
            Long l = a.c;
            if (l != null) {
                longValue = l.longValue();
                j2 = 1 + longValue;
                a((Collection) ajyl.a(new qvq(j, str, Long.valueOf(j2), null, 120)), dbTransaction);
                return j2;
            }
        }
        longValue = 0;
        j2 = 1 + longValue;
        a((Collection) ajyl.a(new qvq(j, str, Long.valueOf(j2), null, 120)), dbTransaction);
        return j2;
    }

    public final RemoveSequenceNumbersForUser b() {
        return (RemoveSequenceNumbersForUser) this.f.b();
    }

    /* Access modifiers changed, original: final */
    public final ClearSequenceNumbersForGroup c() {
        return (ClearSequenceNumbersForGroup) this.g.b();
    }

    /* Access modifiers changed, original: final */
    public final SeenSequenceNumbersModel.ClearSequenceNumbersForGroup d() {
        return (SeenSequenceNumbersModel.ClearSequenceNumbersForGroup) this.h.b();
    }
}
