package defpackage;

import com.snap.core.db.AllUpdatesProcessor;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.MessageRecord.MessageInfo;
import defpackage.aesx.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: quh */
public final class quh implements AllUpdatesProcessor {
    public final qvk a;
    final ajwy<ftl> b;
    private final ajxe c = ajxh.a(new a(this));
    private final ajxe d;
    private final qvd e;
    private final quk f;
    private final qvh g;
    private final gpb h;
    private final adpg i;
    private final pru j;
    private final qup k;
    private final aipn<hyq> l;
    private final ajwy<qvi> m;
    private final ajwy<qvj> n;
    private final ajwy<qpb> o;
    private final ajwy<qvo> p;

    /* renamed from: quh$c */
    static final class c extends akcs implements akbl<String, akbk<? extends qvq>> {
        final /* synthetic */ long a;

        c(long j) {
            this.a = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final String str = (String) obj;
            akcr.b(str, "username");
            return new akbk<qvq>(this) {
                private /* synthetic */ c a;

                public final /* synthetic */ Object invoke() {
                    return new qvq(this.a.a, str, null, null, 124);
                }
            };
        }
    }

    /* renamed from: quh$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ quh a;

        a(quh quh) {
            this.a = quh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((ftl) this.a.b.get()).a((fth) qpy.ENABLE_SNAP_DATA_REFACTOR));
        }
    }

    /* renamed from: quh$b */
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

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(quh.class), "enableSnapDataRefactor", "getEnableSnapDataRefactor()Z"), new akdc(akde.a(quh.class), "friendRepository", "getFriendRepository()Lcom/snap/identity/api/FriendRepositoryApi;")};
    }

    public quh(qvd qvd, quk quk, ajwy<iqx> ajwy, qvh qvh, gpb gpb, qvk qvk, adpg adpg, pru pru, qup qup, aipn<hyq> aipn, ajwy<qvi> ajwy2, ajwy<qvj> ajwy3, ajwy<ftl> ajwy4, ajwy<qpb> ajwy5, ajwy<qvo> ajwy6) {
        qvd qvd2 = qvd;
        quk quk2 = quk;
        ajwy<iqx> ajwy7 = ajwy;
        qvh qvh2 = qvh;
        gpb gpb2 = gpb;
        qvk qvk2 = qvk;
        adpg adpg2 = adpg;
        pru pru2 = pru;
        qup qup2 = qup;
        aipn<hyq> aipn2 = aipn;
        ajwy<qvi> ajwy8 = ajwy2;
        ajwy<qvj> ajwy9 = ajwy3;
        ajwy<ftl> ajwy10 = ajwy4;
        ajwy<qpb> ajwy11 = ajwy5;
        ajwy<qvo> ajwy12 = ajwy6;
        akcr.b(qvd2, "messagingRepository");
        akcr.b(quk2, "conversationsRepository");
        akcr.b(ajwy7, "friendRepositoryProvider");
        akcr.b(qvh2, "gatewayInfoStore");
        akcr.b(gpb2, "userAuth");
        akcr.b(qvk2, "messageProcessor");
        akcr.b(adpg2, "genericSnapProcessor");
        akcr.b(pru2, "messageReleaseUpdatesProcessor");
        akcr.b(qup2, "friendsFeedSnapDbLogger");
        akcr.b(aipn2, "fideliusManager");
        akcr.b(ajwy8, "networkMessageProcessor");
        akcr.b(ajwy9, "networkMessageRepository");
        akcr.b(ajwy10, "configProvider");
        akcr.b(ajwy11, "receivedSnapMetricsController");
        akcr.b(ajwy12, "sequenceNumberRepository");
        this.e = qvd2;
        this.f = quk2;
        this.g = qvh2;
        this.h = gpb2;
        this.a = qvk2;
        this.i = adpg2;
        this.j = pru2;
        this.k = qup2;
        this.l = aipn2;
        this.m = ajwy8;
        this.n = ajwy9;
        this.b = ajwy10;
        this.o = ajwy11;
        this.p = ajwy12;
        this.d = ajxh.a(new b(ajwy7));
    }

    private final ajxw a(List<? extends aefi> list) {
        String str = "suppress_from_conversations";
        hyy g = ((hyq) this.l.get()).g(str);
        if (g == null) {
            return null;
        }
        if (g.a(list, str)) {
            ((hyq) this.l.get()).b(str);
        }
        return ajxw.a;
    }

    private final void a(long j, String str, aeii aeii, DbTransaction dbTransaction) {
        Long l;
        Map map = aeii.g;
        if (map != null) {
            map = (Map) map.get(this.h.b());
            if (map != null) {
                l = (Long) map.get(this.h.b());
                Long l2 = (Long) map.get(str);
                if (l != null) {
                    this.f.c(j, l.longValue());
                }
                if (l2 != null) {
                    this.f.d(j, l2.longValue());
                }
            }
        }
        Map linkedHashMap = new LinkedHashMap();
        akbl cVar = new c(j);
        Map map2 = aeii.a;
        String str2 = "username";
        if (map2 != null) {
            for (Entry entry : map2.entrySet()) {
                Object obj = (String) entry.getKey();
                l = (Long) entry.getValue();
                akcr.a(obj, str2);
                akbk akbk = (akbk) cVar.invoke(obj);
                Object obj2 = linkedHashMap.get(obj);
                if (obj2 == null) {
                    obj2 = akbk.invoke();
                    linkedHashMap.put(obj, obj2);
                }
                ((qvq) obj2).c = l;
            }
        }
        map2 = aeii.b;
        if (map2 != null) {
            for (Entry entry2 : map2.entrySet()) {
                Object obj3 = (String) entry2.getKey();
                Long l3 = (Long) entry2.getValue();
                akcr.a(obj3, str2);
                akbk akbk2 = (akbk) cVar.invoke(obj3);
                Object obj4 = linkedHashMap.get(obj3);
                if (obj4 == null) {
                    obj4 = akbk2.invoke();
                    linkedHashMap.put(obj3, obj4);
                }
                ((qvq) obj4).g = l3;
            }
        }
        ((qvo) this.p.get()).a(linkedHashMap.values(), dbTransaction);
    }

    private final void a(long j, String str, aenb aenb, boolean z) {
        Object obj = this.h.a().b;
        if (obj == null) {
            akcr.a();
        }
        if ((akcr.a((Object) str, obj) ^ 1) != 0) {
            boolean a;
            if (z) {
                qvj qvj = (qvj) this.n.get();
                Object obj2 = aenb.O;
                akcr.a(obj2, "snap.id");
                a = qvj.a(qwh.a(obj2), j);
            } else {
                a = this.e.a(aenb.O, j);
            }
            if (!a) {
                ((qpb) this.o.get()).a(aenb);
            }
        }
    }

    private final void a(DbTransaction dbTransaction, long j, aefi aefi, boolean z, aeii aeii) {
        List list = aefi.j.b;
        Object obj = aefi.g;
        akcr.a((Object) list, "messages");
        akcr.a(obj, "lastInteractionTs");
        DbTransaction dbTransaction2 = dbTransaction;
        long j2 = j;
        List list2 = list;
        a(dbTransaction2, j2, list2, obj.longValue());
        a(dbTransaction2, j2, list2, z, aeii);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x008b in {6, 7, 9, 13, 16, 17, 22, 23, 25} preds:[]
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
    private final void a(com.snap.core.db.api.DbTransaction r5, long r6, java.util.List<? extends defpackage.aegn> r8, long r9) {
        /*
        r4 = this;
        r8 = (java.lang.Iterable) r8;	 Catch:{ all -> 0x0089 }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0089 }
        r0.<init>();	 Catch:{ all -> 0x0089 }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0089 }
        r8 = r8.iterator();	 Catch:{ all -> 0x0089 }
        r1 = r8.hasNext();	 Catch:{ all -> 0x0089 }
        r2 = 1;	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x0027;	 Catch:{ all -> 0x0089 }
        r1 = r8.next();	 Catch:{ all -> 0x0089 }
        r3 = r1;	 Catch:{ all -> 0x0089 }
        r3 = (defpackage.aegn) r3;	 Catch:{ all -> 0x0089 }
        r3 = r3.b;	 Catch:{ all -> 0x0089 }
        if (r3 == 0) goto L_0x0020;	 Catch:{ all -> 0x0089 }
        goto L_0x0021;	 Catch:{ all -> 0x0089 }
        r2 = 0;	 Catch:{ all -> 0x0089 }
        if (r2 == 0) goto L_0x000d;	 Catch:{ all -> 0x0089 }
        r0.add(r1);	 Catch:{ all -> 0x0089 }
        goto L_0x000d;	 Catch:{ all -> 0x0089 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0089 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0089 }
        r8 = new java.util.ArrayList;	 Catch:{ all -> 0x0089 }
        r1 = 10;	 Catch:{ all -> 0x0089 }
        r1 = defpackage.ajyn.a(r0, r1);	 Catch:{ all -> 0x0089 }
        r8.<init>(r1);	 Catch:{ all -> 0x0089 }
        r8 = (java.util.Collection) r8;	 Catch:{ all -> 0x0089 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0089 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x004e;	 Catch:{ all -> 0x0089 }
        r1 = r0.next();	 Catch:{ all -> 0x0089 }
        r1 = (defpackage.aegn) r1;	 Catch:{ all -> 0x0089 }
        r1 = r1.b;	 Catch:{ all -> 0x0089 }
        r8.add(r1);	 Catch:{ all -> 0x0089 }
        goto L_0x003c;	 Catch:{ all -> 0x0089 }
        r8 = (java.util.List) r8;	 Catch:{ all -> 0x0089 }
        r0 = r8;	 Catch:{ all -> 0x0089 }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0089 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0089 }
        r0 = r0 ^ r2;	 Catch:{ all -> 0x0089 }
        if (r0 == 0) goto L_0x0061;	 Catch:{ all -> 0x0089 }
        r0 = r4.e;	 Catch:{ all -> 0x0089 }
        r6 = r0.c(r6, r9);	 Catch:{ all -> 0x0089 }
        goto L_0x0065;	 Catch:{ all -> 0x0089 }
        r6 = defpackage.ajyx.a;	 Catch:{ all -> 0x0089 }
        r6 = (java.util.Map) r6;	 Catch:{ all -> 0x0089 }
        r7 = r8.iterator();	 Catch:{ all -> 0x0089 }
        r8 = r7.hasNext();	 Catch:{ all -> 0x0089 }
        if (r8 == 0) goto L_0x0088;	 Catch:{ all -> 0x0089 }
        r8 = r7.next();	 Catch:{ all -> 0x0089 }
        r8 = (defpackage.aegj) r8;	 Catch:{ all -> 0x0089 }
        r9 = r4.a;	 Catch:{ all -> 0x0089 }
        r10 = "chatMessage";	 Catch:{ all -> 0x0089 }
        defpackage.akcr.a(r8, r10);	 Catch:{ all -> 0x0089 }
        r10 = r8.b;	 Catch:{ all -> 0x0089 }
        r10 = r6.get(r10);	 Catch:{ all -> 0x0089 }
        r10 = (com.snap.core.db.record.MessageRecord.MessageDifferentialInfo) r10;	 Catch:{ all -> 0x0089 }
        r9.a(r5, r8, r10);	 Catch:{ all -> 0x0089 }
        goto L_0x0069;
        return;
        r5 = move-exception;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quh.a(com.snap.core.db.api.DbTransaction, long, java.util.List, long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x008e in {6, 12, 13, 16, 17, 22, 24, 25, 27} preds:[]
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
    private final void a(com.snap.core.db.api.DbTransaction r10, long r11, java.util.List<? extends defpackage.aegn> r13, boolean r14, defpackage.aeii r15) {
        /*
        r9 = this;
        r13 = (java.lang.Iterable) r13;	 Catch:{ all -> 0x008c }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x008c }
        r0.<init>();	 Catch:{ all -> 0x008c }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x008c }
        r13 = r13.iterator();	 Catch:{ all -> 0x008c }
        r1 = r13.hasNext();	 Catch:{ all -> 0x008c }
        if (r1 == 0) goto L_0x0021;	 Catch:{ all -> 0x008c }
        r1 = r13.next();	 Catch:{ all -> 0x008c }
        r1 = (defpackage.aegn) r1;	 Catch:{ all -> 0x008c }
        r1 = r1.a;	 Catch:{ all -> 0x008c }
        if (r1 == 0) goto L_0x000d;	 Catch:{ all -> 0x008c }
        r0.add(r1);	 Catch:{ all -> 0x008c }
        goto L_0x000d;	 Catch:{ all -> 0x008c }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x008c }
        r13 = r0.iterator();	 Catch:{ all -> 0x008c }
        r0 = r13.hasNext();	 Catch:{ all -> 0x008c }
        if (r0 == 0) goto L_0x008b;	 Catch:{ all -> 0x008c }
        r0 = r13.next();	 Catch:{ all -> 0x008c }
        r0 = (defpackage.aenb) r0;	 Catch:{ all -> 0x008c }
        r1 = r0.a;	 Catch:{ all -> 0x008c }
        if (r1 != 0) goto L_0x003e;	 Catch:{ all -> 0x008c }
        r1 = r9.h;	 Catch:{ all -> 0x008c }
        r1 = r1.b();	 Catch:{ all -> 0x008c }
        goto L_0x0040;	 Catch:{ all -> 0x008c }
        r1 = r0.a;	 Catch:{ all -> 0x008c }
        r7 = r1;	 Catch:{ all -> 0x008c }
        r1 = r0.n;	 Catch:{ all -> 0x008c }
        if (r1 != 0) goto L_0x004c;	 Catch:{ all -> 0x008c }
        r1 = r9.h;	 Catch:{ all -> 0x008c }
        r1 = r1.b();	 Catch:{ all -> 0x008c }
        goto L_0x004e;	 Catch:{ all -> 0x008c }
        r1 = r0.n;	 Catch:{ all -> 0x008c }
        r8 = r1;	 Catch:{ all -> 0x008c }
        r1 = r9.a(r0, r15, r7, r8);	 Catch:{ all -> 0x008c }
        if (r1 != 0) goto L_0x0027;	 Catch:{ all -> 0x008c }
        r1 = "senderUsername";	 Catch:{ all -> 0x008c }
        defpackage.akcr.a(r7, r1);	 Catch:{ all -> 0x008c }
        r1 = r9;	 Catch:{ all -> 0x008c }
        r2 = r11;	 Catch:{ all -> 0x008c }
        r4 = r7;	 Catch:{ all -> 0x008c }
        r5 = r0;	 Catch:{ all -> 0x008c }
        r6 = r14;	 Catch:{ all -> 0x008c }
        r1.a(r2, r4, r5, r6);	 Catch:{ all -> 0x008c }
        if (r14 == 0) goto L_0x007b;	 Catch:{ all -> 0x008c }
        r1 = r9.m;	 Catch:{ all -> 0x008c }
        r1 = r1.get();	 Catch:{ all -> 0x008c }
        r1 = (defpackage.qvi) r1;	 Catch:{ all -> 0x008c }
        r2 = r9.b();	 Catch:{ all -> 0x008c }
        r5 = r2.f(r7);	 Catch:{ all -> 0x008c }
        r2 = r0;	 Catch:{ all -> 0x008c }
        r3 = r11;	 Catch:{ all -> 0x008c }
        r7 = r10;	 Catch:{ all -> 0x008c }
        r1.a(r2, r3, r5, r7);	 Catch:{ all -> 0x008c }
        goto L_0x0027;	 Catch:{ all -> 0x008c }
        r1 = r9.i;	 Catch:{ all -> 0x008c }
        r2 = "receiverUsername";	 Catch:{ all -> 0x008c }
        defpackage.akcr.a(r8, r2);	 Catch:{ all -> 0x008c }
        r2 = r10;	 Catch:{ all -> 0x008c }
        r3 = r11;	 Catch:{ all -> 0x008c }
        r5 = r0;	 Catch:{ all -> 0x008c }
        r6 = r7;	 Catch:{ all -> 0x008c }
        r7 = r8;	 Catch:{ all -> 0x008c }
        r1.a(r2, r3, r5, r6, r7);	 Catch:{ all -> 0x008c }
        goto L_0x0027;
        return;
        r10 = move-exception;
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quh.a(com.snap.core.db.api.DbTransaction, long, java.util.List, boolean, aeii):void");
    }

    private final void a(DbTransaction dbTransaction, aefi aefi, qvv qvv, Map<String, String> map, Map<String, Long> map2, Map<String, Long> map3, boolean z) {
        DbTransaction dbTransaction2 = dbTransaction;
        aefi aefi2 = aefi;
        String str = (String) map.get(aefi2.a);
        Long l = str != null ? (Long) map2.get(str) : null;
        Long l2 = (Long) map3.get(aefi2.a);
        if (str != null && l != null) {
            if (l2 != null) {
                aeii aeii = aefi2.m;
                if (aeii != null) {
                    long longValue = l2.longValue();
                    akcr.a(aefi2.a, "chatConversation.id");
                    a(longValue, str, aeii, dbTransaction);
                }
                aexp aexp = aefi2.j.a;
                if (aexp != null) {
                    this.f.a(l2.longValue(), aexp);
                }
                aeft aeft = aefi2.j;
                if (!(aeft == null || aeft.b == null)) {
                    a(dbTransaction, l2.longValue(), aefi, z, aeii);
                    a(l2.longValue(), l.longValue(), aefi, dbTransaction);
                    Object obj = aefi2.o;
                    akcr.a(obj, "chatConversation.isDeltaFetch");
                    if (obj.booleanValue()) {
                        a(aefi, l2.longValue(), dbTransaction);
                    }
                }
                qvv qvv2 = qvv;
                this.j.a(aefi, qvv, dbTransaction);
            }
        }
    }

    private final boolean a() {
        return ((Boolean) this.c.b()).booleanValue();
    }

    private final boolean a(long j, long j2, aefi aefi, DbTransaction dbTransaction) {
        List<Object> list = aefi.i;
        if (list == null) {
            return false;
        }
        Iterator it;
        if (a()) {
            for (Object obj : list) {
                if ((akcr.a(this.h.b(), obj.a) ^ 1) != 0) {
                    qvi qvi = (qvi) this.m.get();
                    akcr.a(obj, "snap");
                    qvi.a(obj, j, j2, dbTransaction);
                }
            }
            return true;
        }
        it = list.iterator();
        while (it.hasNext()) {
            aenb aenb = (aenb) it.next();
            if ((akcr.a(this.h.b(), aenb.a) ^ 1) != 0) {
                this.e.a(aenb, j, j2, dbTransaction);
            }
        }
        return true;
    }

    private boolean a(aefi aefi, long j, DbTransaction dbTransaction) {
        long c;
        Object obj;
        String str;
        int i;
        akcr.b(aefi, "chatConversation");
        akcr.b(dbTransaction, "tx");
        List<Object> list = aefi.n.b;
        boolean z = false;
        if (list != null) {
            for (Object obj2 : list) {
                c = this.e.c(obj2.a, j);
                str = "it";
                if (c > 0) {
                    MessageInfo j2 = this.e.j(obj2.a);
                    if (j2 != null) {
                        String str2 = obj2.i.a;
                        akcr.a((Object) str2, "it.header.from");
                        akcr.a(obj2, str);
                        a a = obj2.a();
                        akcr.a((Object) a, "it.stateEnum");
                        obj2 = obj2.c;
                        akcr.a(obj2, "it.version");
                        this.e.a(c, gcm.a.a(str2, a, obj2.intValue()).a(j2.savedStates()));
                    }
                } else {
                    akcr.a(obj2, str);
                    if (obj2.a() == a.SAVED) {
                        i |= 1;
                    }
                }
            }
        }
        List<aesv> list2 = aefi.n.c;
        if (list2 != null) {
            for (aesv aesv : list2) {
                c = this.e.c(aesv.a, j);
                str = "it.preserved";
                if (c > 0) {
                    obj2 = aesv.b;
                    akcr.a(obj2, str);
                    this.e.a(c, obj2.booleanValue() ? gcj.PRESERVED : gcj.UNPRESERVED);
                } else {
                    obj2 = aesv.b;
                    akcr.a(obj2, str);
                    i |= obj2.booleanValue();
                }
            }
        }
        List<aesr> list3 = aefi.n.e;
        if (list3 != null) {
            for (aesr aesr : list3) {
                qvi qvi = (qvi) this.m.get();
                String str3 = aesr.a;
                akcr.a((Object) str3, "it.chatMessageId");
                z = qvi.a(str3, dbTransaction);
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    private final boolean a(defpackage.aenb r3, defpackage.aeii r4, java.lang.String r5, java.lang.String r6) {
        /*
        r2 = this;
        if (r4 == 0) goto L_0x003d;
    L_0x0002:
        r4 = r4.g;
        if (r4 == 0) goto L_0x003d;
    L_0x0006:
        r0 = r2.h;
        r0 = r0.a();
        r0 = r0.b;
        if (r0 != 0) goto L_0x0013;
    L_0x0010:
        defpackage.akcr.a();
    L_0x0013:
        r5 = defpackage.akcr.a(r5, r0);
        r1 = 0;
        if (r5 == 0) goto L_0x0027;
    L_0x001a:
        r4 = r4.get(r0);
        r4 = (java.util.Map) r4;
        if (r4 == 0) goto L_0x0036;
    L_0x0022:
        r4 = r4.get(r6);
        goto L_0x0033;
    L_0x0027:
        r4 = r4.get(r0);
        r4 = (java.util.Map) r4;
        if (r4 == 0) goto L_0x0036;
    L_0x002f:
        r4 = r4.get(r0);
    L_0x0033:
        r1 = r4;
        r1 = (java.lang.Long) r1;
    L_0x0036:
        if (r1 == 0) goto L_0x003d;
    L_0x0038:
        r4 = r1.longValue();
        goto L_0x003f;
    L_0x003d:
        r4 = 0;
    L_0x003f:
        r3 = r3.S;
        r0 = r3.longValue();
        r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r3 > 0) goto L_0x004b;
    L_0x0049:
        r3 = 1;
        return r3;
    L_0x004b:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quh.a(aenb, aeii, java.lang.String, java.lang.String):boolean");
    }

    private final iqx b() {
        return (iqx) this.d.b();
    }

    public final void a(aelz aelz, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aelz, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        if (aelz.a != null) {
            List list = aelz.a.g;
            if (list != null) {
                a(dbTransaction, list, qvv.BATCHED_SERVER_RESPONSE);
            }
            if (aelz.a.b != null) {
                qvh qvh = this.g;
                Object obj = aelz.a.b;
                akcr.a(obj, "response.chatFeedResponse.messagingGatewayInfo");
                qvh.a(obj, dbTransaction);
            }
            aeks aeks = aelz.a.e;
            this.e.a(aeks != null ? aeks.a : null, dbTransaction);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x0097 in {3, 14, 15, 17, 19, 21} preds:[]
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
    public final void a(com.snap.core.db.api.DbTransaction r12, java.util.List<? extends defpackage.aefi> r13, defpackage.qvv r14) {
        /*
        r11 = this;
        r0 = "tx";
        defpackage.akcr.b(r12, r0);
        r0 = "chatConversations";
        defpackage.akcr.b(r13, r0);
        r0 = "updateSource";
        defpackage.akcr.b(r14, r0);
        r11.a(r13);
        r0 = r13;
        r0 = (java.lang.Iterable) r0;
        r1 = 10;
        r1 = defpackage.ajyn.a(r0, r1);
        r1 = defpackage.ajzm.a(r1);
        r2 = 16;
        r1 = defpackage.akef.b(r1, r2);
        r2 = new java.util.LinkedHashMap;
        r2.<init>(r1);
        r1 = r2;
        r1 = (java.util.Map) r1;
        r0 = r0.iterator();
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0052;
        r2 = r0.next();
        r2 = (defpackage.aefi) r2;
        r3 = r2.a;
        r4 = r11.h;
        r4 = r4.b();
        r5 = "userAuth.username";
        defpackage.akcr.a(r4, r5);
        r2 = defpackage.adow.a(r2, r4);
        r1.put(r3, r2);
        goto L_0x0031;
        r0 = r1.values();
        r0 = (java.lang.Iterable) r0;
        r0 = defpackage.ajyu.k(r0);
        r2 = r11.b();	 Catch:{ all -> 0x0095 }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0095 }
        r0 = r2.a(r0);	 Catch:{ all -> 0x0095 }
        r2 = r11.e;	 Catch:{ all -> 0x0093 }
        r2 = r2.a(r13, r0, r12);	 Catch:{ all -> 0x0093 }
        r13 = r13.iterator();	 Catch:{ all -> 0x0091 }
        r3 = r13.hasNext();	 Catch:{ all -> 0x0091 }
        if (r3 == 0) goto L_0x0090;	 Catch:{ all -> 0x0091 }
        r3 = r13.next();	 Catch:{ all -> 0x0091 }
        r5 = r3;	 Catch:{ all -> 0x0091 }
        r5 = (defpackage.aefi) r5;	 Catch:{ all -> 0x0091 }
        r3 = "feedIdsMap";	 Catch:{ all -> 0x0091 }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0091 }
        r10 = r11.a();	 Catch:{ all -> 0x0091 }
        r3 = r11;	 Catch:{ all -> 0x0091 }
        r4 = r12;	 Catch:{ all -> 0x0091 }
        r6 = r14;	 Catch:{ all -> 0x0091 }
        r7 = r1;	 Catch:{ all -> 0x0091 }
        r8 = r0;	 Catch:{ all -> 0x0091 }
        r9 = r2;	 Catch:{ all -> 0x0091 }
        r3.a(r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0091 }
        goto L_0x0070;
        return;
        r12 = move-exception;
        throw r12;
        r12 = move-exception;
        throw r12;
        r12 = move-exception;
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quh.a(com.snap.core.db.api.DbTransaction, java.util.List, qvv):void");
    }

    public final void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        List list = aecy.h;
        if (list != null) {
            a(dbTransaction, list, qvv.BATCHED_SERVER_RESPONSE);
        }
        aeks aeks = aecy.f;
        this.e.a(aeks != null ? aeks.a : null, dbTransaction);
    }
}
