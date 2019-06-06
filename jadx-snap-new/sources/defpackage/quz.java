package defpackage;

import com.google.common.collect.HashBasedTable;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.FeedSeenSequenceNumbers;
import com.snap.core.db.record.ChatAttachmentsModel;
import com.snap.core.db.record.FeedRecord.BasicFeedInfo;
import defpackage.quk.r;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: quz */
public final class quz implements pru {
    final quk a;
    private final zfw b;
    private final ajdw c;
    private final ajxe d;
    private final gpb e;
    private final qvd f;
    private final qvi g;
    private final qvj h;

    /* renamed from: quz$a */
    static final class a extends akcs implements akbk<iqx> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iqx) this.a.get();
        }
    }

    /* renamed from: quz$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ quz a;

        b(quz quz) {
            this.a = quz;
        }

        private Map<Long, FeedSeenSequenceNumbers> a(List<psl> list) {
            akcr.b(list, "it");
            Map linkedHashMap = new LinkedHashMap();
            for (psl psl : list) {
                HashBasedTable create = HashBasedTable.create();
                FeedSeenSequenceNumbers c = this.a.a.c(psl.a);
                Map map = psl.c;
                Map map2 = psl.b.H;
                akcr.a((Object) map2, "it.group.seenChatSequenceNumbers");
                akcr.a((Object) create, "values");
                if (quz.a(map, map2, create, c)) {
                    linkedHashMap.put(Long.valueOf(psl.a), new FeedSeenSequenceNumbers(create));
                }
            }
            return linkedHashMap;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((List) obj);
        }
    }

    /* renamed from: quz$c */
    static final class c<T, R> implements ajfc<Map<Long, FeedSeenSequenceNumbers>, ajdb> {
        private /* synthetic */ quz a;

        c(quz quz) {
            this.a = quz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Map map = (Map) obj;
            akcr.b(map, "it");
            quk quk = this.a.a;
            akcr.b(map, "groupSequenceNumbers");
            return quk.a.runInTransaction("grup:writeSeenSqNum", new r(quk, map));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(quz.class), "friendRepository", "getFriendRepository()Lcom/snap/identity/api/FriendRepositoryApi;");
    }

    public quz(gpb gpb, qvd qvd, ajwy<iqx> ajwy, quk quk, qvi qvi, qvj qvj, zgb zgb) {
        akcr.b(gpb, "userAuthStore");
        akcr.b(qvd, "messagingRepository");
        akcr.b(ajwy, "friendRepositoryProvider");
        akcr.b(quk, "conversationsRepository");
        akcr.b(qvi, "networkMessageProcessor");
        akcr.b(qvj, "networkMessageRepository");
        akcr.b(zgb, "schedulersProvider");
        this.e = gpb;
        this.f = qvd;
        this.a = quk;
        this.g = qvi;
        this.h = qvj;
        String str = "MessageReleaseUpdatesProcessorImpl";
        this.b = zgb.a(qxo.b.callsite(str));
        this.c = zfx.a((ajdw) zgb.a(qxo.b.callsite(str)).b(), 1);
        this.d = ajxh.a(new a(ajwy));
    }

    private final iqx a() {
        return (iqx) this.d.b();
    }

    private final Map<String, Long> a(Map<String, ? extends Map<String, Long>> map) {
        Set linkedHashSet = new LinkedHashSet();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Map map2 = (Map) entry.getValue();
            linkedHashSet.add(str);
            linkedHashSet.addAll(map2.keySet());
        }
        return a().a((Collection) ajyu.k(linkedHashSet));
    }

    private static Map<String, Long> a(Map<String, ? extends Map<String, Long>> map, String str) {
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            Object obj = (String) entry.getKey();
            Map map2 = (Map) entry.getValue();
            if (akcr.a(obj, (Object) str)) {
                for (Entry entry2 : map2.entrySet()) {
                    if ((akcr.a((String) entry2.getKey(), (Object) str) ^ 1) != 0) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
            } else {
                for (Entry entry22 : map2.entrySet()) {
                    if (akcr.a((String) entry22.getKey(), (Object) str)) {
                        linkedHashMap.put(entry22.getKey(), entry22.getValue());
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private final void a(DbTransaction dbTransaction, long j, String str, String str2, Map<String, Long> map, boolean z, long j2) {
        String str3 = this.e.a().b;
        if (str3 == null) {
            akcr.a();
        }
        long g = a().g(str3);
        Long l = (Long) map.get(str3);
        this.g.a(dbTransaction, str, g, l != null ? l.longValue() : 0, z, Long.valueOf(j2), Long.valueOf(j2));
        Map a = ajzl.a(ajxs.a(str2, map));
        try {
            a(dbTransaction, j, a, a(a), true);
        } catch (Throwable th) {
            Throwable th2 = th;
        }
    }

    private final void a(DbTransaction dbTransaction, long j, Map<String, ? extends Map<String, Long>> map, Map<String, Long> map2, boolean z) {
        FeedSeenSequenceNumbers c = this.a.c(j);
        HashBasedTable create = (!z || c == null) ? HashBasedTable.create() : HashBasedTable.create(c.getSequenceNumbers());
        akcr.a((Object) create, "values");
        if (quz.a((Map) map2, (Map) map, create, c)) {
            this.a.a(j, new FeedSeenSequenceNumbers(create), dbTransaction);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:88:0x0264 in {11, 12, 15, 25, 28, 29, 31, 37, 41, 47, 48, 52, 58, 64, 65, 67, 68, 76, 77, 78, 83, 84, 85, 87} preds:[]
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
    private final void a(com.snap.core.db.api.DbTransaction r23, java.lang.String r24, java.lang.String r25, boolean r26, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>> r27, java.util.Map<java.lang.String, java.lang.Long> r28, boolean r29, java.lang.Long r30, java.lang.Long r31) {
        /*
        r22 = this;
        r1 = r22;
        r0 = r23;
        r8 = r24;
        r9 = r25;
        r10 = r28;
        r11 = r31;
        r2 = r1.h;	 Catch:{ all -> 0x0262 }
        r12 = r29;	 Catch:{ all -> 0x0262 }
        r13 = r2.a(r8, r12);	 Catch:{ all -> 0x0262 }
        r14 = r27;
        r2 = r14.get(r9);
        r2 = (java.util.Map) r2;
        r15 = -1;
        if (r2 == 0) goto L_0x01fd;
        r2 = r2.entrySet();
        r17 = r2.iterator();
        r2 = r17.hasNext();
        if (r2 == 0) goto L_0x01fd;
        r2 = r17.next();
        r2 = (java.util.Map.Entry) r2;
        r3 = r2.getKey();
        r3 = (java.lang.String) r3;
        r2 = r2.getValue();
        r2 = (java.lang.Number) r2;
        r18 = r2.longValue();
        r2 = defpackage.akcr.a(r3, r9);
        r20 = 1;
        r2 = r2 ^ 1;
        if (r2 != 0) goto L_0x0055;
        if (r26 == 0) goto L_0x0051;
        goto L_0x0055;
        r7 = r30;
        goto L_0x01f9;
        r2 = r10.get(r3);
        if (r2 != 0) goto L_0x005e;
        defpackage.akcr.a();
        r2 = (java.lang.Number) r2;
        r4 = r2.longValue();
        r2 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1));
        if (r2 == 0) goto L_0x0051;
        r6 = r1.g;
        r2 = java.lang.Long.valueOf(r4);
        r2 = r13.get(r2);
        r21 = r2;
        r21 = (java.util.List) r21;
        r2 = "conversationId";
        defpackage.akcr.b(r8, r2);
        r2 = "tx";
        defpackage.akcr.b(r0, r2);
        r2 = r6.b;
        r2 = r2.get();
        r2 = (defpackage.quw) r2;
        r3 = r24;
        r15 = r6;
        r6 = r18;
        r2.a(r3, r4, r6);
        if (r21 == 0) goto L_0x01f2;
        r2 = r21;
        r2 = (java.lang.Iterable) r2;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r3 = (java.util.Collection) r3;
        r2 = r2.iterator();
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x00cb;
        r4 = r2.next();
        r5 = r4;
        r5 = (com.snap.core.db.record.NetworkMessageRecord.UnreleasedMessage) r5;
        r5 = r5.sequenceNumber();
        if (r5 != 0) goto L_0x00ba;
        r5 = 0;
        r5 = java.lang.Long.valueOf(r5);
        r5 = r5.longValue();
        r7 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1));
        if (r7 > 0) goto L_0x00c4;
        r5 = 1;
        goto L_0x00c5;
        r5 = 0;
        if (r5 == 0) goto L_0x00a1;
        r3.add(r4);
        goto L_0x00a1;
        r3 = (java.util.List) r3;
        r3 = (java.lang.Iterable) r3;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r2 = (java.util.Collection) r2;
        r4 = r3.iterator();
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x00fb;
        r5 = r4.next();
        r6 = r5;
        r6 = (com.snap.core.db.record.NetworkMessageRecord.UnreleasedMessage) r6;
        r6 = r6.messageType();
        r7 = defpackage.aesq.SNAP;
        r7 = r7.a();
        r6 = defpackage.akcr.a(r6, r7);
        if (r6 == 0) goto L_0x00da;
        r2.add(r5);
        goto L_0x00da;
        r2 = (java.util.List) r2;
        r2 = (java.lang.Iterable) r2;
        r4 = new java.util.ArrayList;
        r5 = 10;
        r6 = defpackage.ajyn.a(r2, r5);
        r4.<init>(r6);
        r4 = (java.util.Collection) r4;
        r2 = r2.iterator();
        r6 = r2.hasNext();
        if (r6 == 0) goto L_0x0124;
        r6 = r2.next();
        r6 = (com.snap.core.db.record.NetworkMessageRecord.UnreleasedMessage) r6;
        r6 = r6.messageId();
        r4.add(r6);
        goto L_0x0110;
        r4 = (java.util.List) r4;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r2 = (java.util.Collection) r2;
        r3 = r3.iterator();
        r6 = r3.hasNext();
        if (r6 == 0) goto L_0x0154;
        r6 = r3.next();
        r7 = r6;
        r7 = (com.snap.core.db.record.NetworkMessageRecord.UnreleasedMessage) r7;
        r7 = r7.messageType();
        r16 = defpackage.aesq.SNAP;
        r5 = r16.a();
        r5 = defpackage.akcr.a(r7, r5);
        if (r5 != 0) goto L_0x0151;
        r2.add(r6);
        r5 = 10;
        goto L_0x0131;
        r2 = (java.util.List) r2;
        r2 = (java.lang.Iterable) r2;
        r3 = new java.util.ArrayList;
        r5 = 10;
        r5 = defpackage.ajyn.a(r2, r5);
        r3.<init>(r5);
        r3 = (java.util.Collection) r3;
        r2 = r2.iterator();
        r5 = r2.hasNext();
        if (r5 == 0) goto L_0x017d;
        r5 = r2.next();
        r5 = (com.snap.core.db.record.NetworkMessageRecord.UnreleasedMessage) r5;
        r5 = r5.messageId();
        r3.add(r5);
        goto L_0x0169;
        r3 = (java.util.List) r3;
        r2 = r4;
        r2 = (java.util.Collection) r2;
        r2 = r2.isEmpty();
        r2 = r2 ^ 1;
        r5 = "messageId";
        if (r2 == 0) goto L_0x01b9;
        r2 = r15.c;
        r2 = r2.get();
        r2 = (defpackage.qvj) r2;
        r6 = 0;
        r2.a(r4, r6, r11);
        r4 = (java.lang.Iterable) r4;
        r2 = r4.iterator();
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x01b9;
        r4 = r2.next();
        r4 = (java.lang.String) r4;
        r6 = r15.d;
        r6 = r6.get();
        r6 = (defpackage.qvw) r6;
        defpackage.akcr.a(r4, r5);
        r6.a(r4, r0);
        goto L_0x019e;
        r2 = r3;
        r2 = (java.util.Collection) r2;
        r2 = r2.isEmpty();
        r2 = r2 ^ 1;
        if (r2 == 0) goto L_0x01f2;
        r2 = r15.c;
        r2 = r2.get();
        r2 = (defpackage.qvj) r2;
        r7 = r30;
        r2.a(r3, r7, r11);
        r3 = (java.lang.Iterable) r3;
        r2 = r3.iterator();
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x01f4;
        r3 = r2.next();
        r3 = (java.lang.String) r3;
        r4 = r15.d;
        r4 = r4.get();
        r4 = (defpackage.qvw) r4;
        defpackage.akcr.a(r3, r5);
        r4.a(r3, r0);
        goto L_0x01d7;
        r7 = r30;
        if (r21 == 0) goto L_0x01f9;
        r21.size();
        r15 = -1;
        goto L_0x0028;
        r7 = r30;
        r2 = r27.entrySet();
        r2 = r2.iterator();
        r13 = -1;
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x023c;
        r3 = r2.next();
        r3 = (java.util.Map.Entry) r3;
        r4 = r3.getKey();
        r4 = (java.lang.String) r4;
        r3 = r3.getValue();
        r3 = (java.util.Map) r3;
        r4 = defpackage.akcr.a(r9, r4);
        if (r4 != 0) goto L_0x0209;
        r3 = r3.get(r9);
        r3 = (java.lang.Long) r3;
        if (r3 == 0) goto L_0x0235;
        r15 = r3.longValue();
        r3 = r15;
        goto L_0x0237;
        r3 = -1;
        r13 = java.lang.Math.max(r13, r3);
        goto L_0x0209;
        r3 = -1;
        r2 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x0261;
        r2 = r10.get(r9);
        if (r2 != 0) goto L_0x024b;
        defpackage.akcr.a();
        r2 = (java.lang.Number) r2;
        r5 = r2.longValue();
        r2 = r1.g;
        r3 = r23;
        r4 = r24;
        r7 = r13;
        r9 = r29;
        r10 = r30;
        r11 = r31;
        r2.a(r3, r4, r5, r7, r9, r10, r11);
        return;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quz.a(com.snap.core.db.api.DbTransaction, java.lang.String, java.lang.String, boolean, java.util.Map, java.util.Map, boolean, java.lang.Long, java.lang.Long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x00a9 in {7, 13, 16, 17, 21, 22, 23, 25, 26, 28} preds:[]
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
    static boolean a(java.util.Map<java.lang.String, java.lang.Long> r17, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>> r18, com.google.common.collect.HashBasedTable<java.lang.Long, java.lang.Long, java.lang.Long> r19, com.snap.core.db.column.FeedSeenSequenceNumbers r20) {
        /*
        r0 = r17;
        r1 = r19;
        r2 = r20;
        r3 = r18.entrySet();	 Catch:{ all -> 0x00a7 }
        r3 = r3.iterator();	 Catch:{ all -> 0x00a7 }
        r4 = 0;	 Catch:{ all -> 0x00a7 }
        r5 = r3.hasNext();	 Catch:{ all -> 0x00a7 }
        if (r5 == 0) goto L_0x00a6;	 Catch:{ all -> 0x00a7 }
        r5 = r3.next();	 Catch:{ all -> 0x00a7 }
        r5 = (java.util.Map.Entry) r5;	 Catch:{ all -> 0x00a7 }
        r6 = r5.getKey();	 Catch:{ all -> 0x00a7 }
        r6 = (java.lang.String) r6;	 Catch:{ all -> 0x00a7 }
        r5 = r5.getValue();	 Catch:{ all -> 0x00a7 }
        r5 = (java.util.Map) r5;	 Catch:{ all -> 0x00a7 }
        r6 = r0.get(r6);	 Catch:{ all -> 0x00a7 }
        if (r6 != 0) goto L_0x0030;	 Catch:{ all -> 0x00a7 }
        defpackage.akcr.a();	 Catch:{ all -> 0x00a7 }
        r6 = (java.lang.Number) r6;	 Catch:{ all -> 0x00a7 }
        r6 = r6.longValue();	 Catch:{ all -> 0x00a7 }
        r5 = r5.entrySet();	 Catch:{ all -> 0x00a7 }
        r5 = r5.iterator();	 Catch:{ all -> 0x00a7 }
        r8 = 1;	 Catch:{ all -> 0x00a7 }
        r9 = r5.hasNext();	 Catch:{ all -> 0x00a7 }
        if (r9 == 0) goto L_0x000f;	 Catch:{ all -> 0x00a7 }
        r9 = r5.next();	 Catch:{ all -> 0x00a7 }
        r9 = (java.util.Map.Entry) r9;	 Catch:{ all -> 0x00a7 }
        r10 = r9.getKey();	 Catch:{ all -> 0x00a7 }
        r10 = (java.lang.String) r10;	 Catch:{ all -> 0x00a7 }
        r9 = r9.getValue();	 Catch:{ all -> 0x00a7 }
        r9 = (java.lang.Number) r9;	 Catch:{ all -> 0x00a7 }
        r11 = r9.longValue();	 Catch:{ all -> 0x00a7 }
        r9 = r0.get(r10);	 Catch:{ all -> 0x00a7 }
        if (r9 != 0) goto L_0x0064;	 Catch:{ all -> 0x00a7 }
        defpackage.akcr.a();	 Catch:{ all -> 0x00a7 }
        r9 = (java.lang.Number) r9;	 Catch:{ all -> 0x00a7 }
        r9 = r9.longValue();	 Catch:{ all -> 0x00a7 }
        if (r2 == 0) goto L_0x0071;	 Catch:{ all -> 0x00a7 }
        r13 = r2.getSequenceNumber(r9, r6);	 Catch:{ all -> 0x00a7 }
        goto L_0x0072;	 Catch:{ all -> 0x00a7 }
        r13 = 0;	 Catch:{ all -> 0x00a7 }
        if (r13 == 0) goto L_0x0095;	 Catch:{ all -> 0x00a7 }
        r14 = r13.longValue();	 Catch:{ all -> 0x00a7 }
        r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1));	 Catch:{ all -> 0x00a7 }
        if (r16 >= 0) goto L_0x0089;	 Catch:{ all -> 0x00a7 }
        r4 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x00a7 }
        r9 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x00a7 }
        r10 = java.lang.Long.valueOf(r11);	 Catch:{ all -> 0x00a7 }
        goto L_0x00a1;	 Catch:{ all -> 0x00a7 }
        r9 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x00a7 }
        r10 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x00a7 }
        r1.put(r9, r10, r13);	 Catch:{ all -> 0x00a7 }
        goto L_0x003f;	 Catch:{ all -> 0x00a7 }
        r4 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x00a7 }
        r9 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x00a7 }
        r10 = java.lang.Long.valueOf(r11);	 Catch:{ all -> 0x00a7 }
        r1.put(r4, r9, r10);	 Catch:{ all -> 0x00a7 }
        r4 = 1;
        goto L_0x003f;
        return r4;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quz.a(java.util.Map, java.util.Map, com.google.common.collect.HashBasedTable, com.snap.core.db.column.FeedSeenSequenceNumbers):boolean");
    }

    public final ajcx a(List<psl> list) {
        akcr.b(list, "groupSeenSequenceNumbers");
        Object e = ajdx.b((Object) list).a(this.c).f(new b(this)).e((ajfc) new c(this));
        akcr.a(e, "Single.just(groupSeenSeq…it)\n                    }");
        return e;
    }

    public final void a(aefi aefi, qvv qvv, DbTransaction dbTransaction) {
        aefi aefi2 = aefi;
        String str = "chatConversation.chatReleaseDataMap";
        akcr.b(aefi2, "chatConversation");
        akcr.b(qvv, "updateSource");
        akcr.b(dbTransaction, "tx");
        aeii aeii = aefi2.m;
        if (aeii != null) {
            Map map = aeii.f;
            if (map != null) {
                int i;
                String b = this.e.b();
                if (b == null) {
                    akcr.a();
                }
                Object a = adow.a(aefi2, b);
                a().f(a);
                Map map2 = aefi2.v;
                String str2 = "chatConversation.id";
                if (map2 == null || (map2.isEmpty() ^ 1) != 1) {
                    i = 1;
                } else {
                    qvj qvj = this.h;
                    String str3 = aefi2.a;
                    akcr.a((Object) str3, str2);
                    map2 = qvj.a(str3, false);
                    str3 = aefi2.a;
                    akcr.a((Object) str3, str2);
                    Object obj = aefi2.v;
                    akcr.a(obj, str);
                    Long l = aefi2.g;
                    for (Entry entry : obj.entrySet()) {
                        List list = (List) entry.getValue();
                        long g = a().g((String) entry.getKey());
                        if (g != -1) {
                            i = 0;
                            for (Object next : list) {
                                Long l2;
                                int i2 = i + 1;
                                if (i < 0) {
                                    ajym.a();
                                }
                                aegp aegp = (aegp) next;
                                obj = aegp.b;
                                Long l3 = aegp.a;
                                if (((List) map2.get(Long.valueOf(g))) != null) {
                                    qvi qvi = this.g;
                                    akcr.a(obj, "releaseSequenceNumber");
                                    l2 = l;
                                    qvi.a(dbTransaction, str3, g, obj.longValue(), false, l2, l3);
                                } else {
                                    l2 = l;
                                }
                                ajym.a(list);
                                i = i2;
                                l = l2;
                            }
                        }
                        l = l;
                    }
                    Object obj2 = aefi2.v;
                    akcr.a(obj2, str);
                    Object linkedHashMap = new LinkedHashMap(ajzm.a(obj2.size()));
                    for (Entry entry2 : obj2.entrySet()) {
                        linkedHashMap.put(entry2.getKey(), ((aegp) ajyu.h((List) entry2.getValue())).b);
                    }
                    i = 1 ^ akcr.a(linkedHashMap, quz.a(map, b));
                }
                Map a2 = a(map);
                quk quk = this.a;
                String str4 = aefi2.a;
                akcr.a((Object) str4, str2);
                String str5 = str2;
                a(dbTransaction, quk.c(str4), map, a2, false);
                if (i != 0) {
                    Object obj3 = aefi2.a;
                    akcr.a(obj3, str5);
                    a(dbTransaction, obj3, b, akcr.a((Object) b, a), map, a2, false, aefi2.g, aefi2.g);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    public final void a(com.snap.core.db.api.DbTransaction r15, long r16, defpackage.ahaz r18, defpackage.qvv r19) {
        /*
        r14 = this;
        r11 = r14;
        r0 = r18;
        r1 = r19;
        r2 = "tx";
        r7 = r15;
        defpackage.akcr.b(r15, r2);
        r2 = "group";
        defpackage.akcr.b(r0, r2);
        r2 = "updateSource";
        defpackage.akcr.b(r1, r2);
        r5 = r0.H;
        if (r5 == 0) goto L_0x006b;
    L_0x0019:
        r2 = r11.e;
        r8 = r2.b();
        if (r8 != 0) goto L_0x0024;
    L_0x0021:
        defpackage.akcr.a();
    L_0x0024:
        r2 = r0.b;
        r3 = 1;
        if (r2 == 0) goto L_0x0035;
    L_0x0029:
        r2 = r2.b;
        if (r2 == 0) goto L_0x0035;
    L_0x002d:
        r2 = r2.size();
        if (r2 != r3) goto L_0x0035;
    L_0x0033:
        r9 = 1;
        goto L_0x0037;
    L_0x0035:
        r2 = 0;
        r9 = 0;
    L_0x0037:
        r10 = r14.a(r5);
        r2 = defpackage.qvv.SINGLE_UPDATE;
        if (r1 != r2) goto L_0x004b;
    L_0x003f:
        r1 = r14;
        r2 = r15;
        r3 = r16;
        r6 = r10;
        r1.a(r2, r3, r5, r6, false);	 Catch:{ all -> 0x0048 }
        goto L_0x004b;
    L_0x0048:
        r0 = move-exception;
        r1 = r0;
        throw r1;
    L_0x004b:
        r3 = r0.a;	 Catch:{ all -> 0x0069 }
        r1 = "group.mischiefId";
        defpackage.akcr.a(r3, r1);	 Catch:{ all -> 0x0069 }
        r6 = r0.H;	 Catch:{ all -> 0x0069 }
        r1 = "group.seenChatSequenceNumbers";
        defpackage.akcr.a(r6, r1);	 Catch:{ all -> 0x0069 }
        r0 = r0.g;	 Catch:{ all -> 0x0069 }
        r12 = 1;
        r13 = 0;
        r1 = r14;
        r2 = r15;
        r4 = r8;
        r5 = r9;
        r7 = r10;
        r8 = r12;
        r9 = r0;
        r10 = r13;
        r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0069 }
        return;
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quz.a(com.snap.core.db.api.DbTransaction, long, ahaz, qvv):void");
    }

    public final void a(DbTransaction dbTransaction, long j, String str, Map<String, Long> map, long j2) {
        DbTransaction dbTransaction2 = dbTransaction;
        akcr.b(dbTransaction, "tx");
        String str2 = str;
        akcr.b(str, ChatAttachmentsModel.SENDERUSERNAME);
        akcr.b(map, "releasedSequenceNumbers");
        long j3 = j;
        BasicFeedInfo b = this.f.b(j);
        if (b == null) {
            akcr.a();
        }
        Object key = b.key();
        akcr.a(key, "messagingRepository.getB…dBlocking(feedId)!!.key()");
        a(dbTransaction, j, key, str, map, true, j2);
    }

    public final void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        if (aecy.h != null) {
            for (Object obj : aecy.h) {
                akcr.a(obj, "conversation");
                a(obj, qvv.BATCHED_SERVER_RESPONSE, dbTransaction);
            }
        }
        List<ahaz> list = aecy.g;
        if (list != null) {
            for (ahaz ahaz : list) {
                ahbc a = ahbc.a(ahaz.m);
                if (a != null) {
                    int i = qva.a[a.ordinal()];
                    if (i == 1 || i == 2) {
                        a(dbTransaction, this.f.a(ahaz, dbTransaction), ahaz, qvv.BATCHED_SERVER_RESPONSE);
                    } else {
                        return;
                    }
                }
                return;
            }
        }
    }

    public final void b(DbTransaction dbTransaction, long j, String str, Map<String, Long> map, long j2) {
        DbTransaction dbTransaction2 = dbTransaction;
        akcr.b(dbTransaction, "tx");
        String str2 = str;
        akcr.b(str, ChatAttachmentsModel.SENDERUSERNAME);
        akcr.b(map, "releasedSequenceNumbers");
        long j3 = j;
        BasicFeedInfo b = this.f.b(j);
        if (b == null) {
            akcr.a();
        }
        Object key = b.key();
        akcr.a(key, "messagingRepository.getB…dBlocking(feedId)!!.key()");
        a(dbTransaction, j, key, str, map, false, j2);
    }
}
