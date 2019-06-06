package defpackage;

import defpackage.yif.a;
import java.util.List;

/* renamed from: qye */
public class qye {
    final ajxe a;
    final ajxe b;
    final zfw c = zgb.a(qxo.b, "FriendsFeedRequestFactory");
    final ihh d;
    private final ajxe e;
    private final ajxe f;
    private final ajxe g;

    /* renamed from: qye$d */
    static final class d extends akcs implements akbk<ajwl<Boolean>> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((rbk) this.a.get()).g;
        }
    }

    /* renamed from: qye$c */
    static final class c extends akcq implements akbk<iqx> {
        c(ajwy ajwy) {
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

    /* renamed from: qye$g */
    static final class g extends akcq implements akbk<yid> {
        g(ajwy ajwy) {
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
            return (yid) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qye$f */
    static final class f extends akcq implements akbk<qvo> {
        f(ajwy ajwy) {
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
            return (qvo) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qye$a */
    static final class a extends akcq implements akbk<rab> {
        a(ajwy ajwy) {
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
            return (rab) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qye$b */
    static final class b<T1, T2, R> implements ajex<a, String, aelt> {
        private /* synthetic */ qye a;
        private /* synthetic */ qxt b;
        private /* synthetic */ long c;
        private /* synthetic */ String d;
        private /* synthetic */ qul e;

        b(qye qye, qxt qxt, long j, String str, qul qul) {
            this.a = qye;
            this.b = qxt;
            this.c = j;
            this.d = str;
            this.e = qul;
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            a aVar = (a) obj;
            String str = (String) obj2;
            akcr.b(aVar, "storySync");
            akcr.b(str, "ffIterToken");
            String a = this.a.a().a();
            aelt aelt = new aelt();
            aelt.e = this.b.callOriginationType;
            aelt.d = iig.a().toString();
            aelt.f = Long.valueOf(this.a.d.a());
            aelt.i = ajyw.a;
            aelt.g = defpackage.aelt.b.TYPE_A.a();
            aelt.k = Long.valueOf(this.c);
            aefz aefz = new aefz();
            aefz.a = this.d;
            Object obj3 = 1;
            aefz.c = Boolean.valueOf(this.b == qxt.PULL_TO_REFRESH);
            aefz.g = aefz.a.SENT_TODAY.a();
            aefz.f = Boolean.valueOf(a == null);
            aefz.h = this.e.a;
            aefz.e = this.e.b;
            aemx aemx = new aemx();
            if (a == null) {
                a = "";
            }
            aemx.a = a;
            aefz.d = aemx;
            aefz.n = this.a.c();
            if (str.length() <= 0) {
                obj3 = null;
            }
            if (obj3 == null) {
                str = null;
            }
            aefz.j = str;
            aelt.a = aefz;
            agbh agbh = new agbh();
            agbh.b = aVar.b;
            agbh.a = aVar.a;
            agbh.d = ygz.a;
            aelt.b = agbh;
            return aelt;
        }
    }

    /* renamed from: qye$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "ffIterToken");
            aeql aeql = new aeql();
            aeql.a = str;
            return aeql;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(qye.class), "identityRepository", "getIdentityRepository()Lcom/snap/identity/api/FriendRepositoryApi;"), new akdc(akde.a(qye.class), "storyRepository", "getStoryRepository()Lcom/snap/stories/api/StoryRepository;"), new akdc(akde.a(qye.class), "sequenceNumberRepository", "getSequenceNumberRepository()Lcom/snap/messaging/db/SequenceNumberRepository;"), new akdc(akde.a(qye.class), "friendsFeedItemRepository", "getFriendsFeedItemRepository()Lcom/snap/messaging/friendsfeed/processor/db/FriendsFeedItemRepository;"), new akdc(akde.a(qye.class), "isForceSyncAndClearLocalDataEnabledSubject", "isForceSyncAndClearLocalDataEnabledSubject()Lio/reactivex/subjects/BehaviorSubject;")};
    }

    public qye(ajwy<iqx> ajwy, ajwy<qvo> ajwy2, ajwy<yid> ajwy3, ajwy<rab> ajwy4, ajwy<rbk> ajwy5, zgb zgb, ihh ihh) {
        akcr.b(ajwy, "identityRepositoryProvider");
        akcr.b(ajwy2, "sequenceNumberRepositoryProvider");
        akcr.b(ajwy3, "storyRepositoryProvider");
        akcr.b(ajwy4, "friendsFeedItemRepositoryProvider");
        akcr.b(ajwy5, "friendsFeedConfigProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ihh, "clock");
        this.d = ihh;
        this.e = ajxh.a(new c(ajwy));
        this.a = ajxh.a(new g(ajwy3));
        this.f = ajxh.a(new f(ajwy2));
        this.g = ajxh.a(new a(ajwy4));
        this.b = ajxh.a(new d(ajwy5));
    }

    private final qvo d() {
        return (qvo) this.f.b();
    }

    public final ajdx<aelt> a(List<String> list) {
        akcr.b(list, "groupIds");
        Object aelt = new aelt();
        aelt.d = iig.a().toString();
        aelt.f = Long.valueOf(this.d.a());
        aelt.h = list;
        aefz aefz = new aefz();
        aefz.e = d().a((List) list);
        aefz.l = ahbk.FORWARD.a();
        aemx aemx = new aemx();
        String a = a().a();
        if (a == null) {
            a = "";
        }
        aemx.a = a;
        aefz.d = aemx;
        aelt.a = aefz;
        Object b = ajdx.b(aelt);
        akcr.a(b, "Single.just(FriendFeedRe…\n            }\n        })");
        return b;
    }

    /* Access modifiers changed, original: final */
    public final iqx a() {
        return (iqx) this.e.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x0113 in {12, 13, 14, 17, 18, 19, 20, 21, 23} preds:[]
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
    final defpackage.qul a(defpackage.qxt r8) {
        /*
        r7 = this;
        r0 = defpackage.qyf.a;	 Catch:{ all -> 0x0111 }
        r8 = r8.ordinal();	 Catch:{ all -> 0x0111 }
        r8 = r0[r8];	 Catch:{ all -> 0x0111 }
        r0 = 1;	 Catch:{ all -> 0x0111 }
        if (r8 == r0) goto L_0x010b;	 Catch:{ all -> 0x0111 }
        r8 = r7.d();	 Catch:{ all -> 0x0111 }
        r0 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0111 }
        r0.<init>();	 Catch:{ all -> 0x0111 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0111 }
        r1 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0111 }
        r1.<init>();	 Catch:{ all -> 0x0111 }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x0111 }
        r8 = r8.a();	 Catch:{ all -> 0x0111 }
        r2 = com.snap.core.db.record.SequenceNumbersRecord.FACTORY;	 Catch:{ all -> 0x0111 }
        r2 = r2.selectSequenceNumbersForDelta();	 Catch:{ all -> 0x0111 }
        r3 = "SequenceNumbersRecord.FA…SequenceNumbersForDelta()";	 Catch:{ all -> 0x0111 }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0111 }
        r3 = com.snap.core.db.record.SequenceNumbersRecord.FOR_DELTA_ROW_MAPPER;	 Catch:{ all -> 0x0111 }
        r4 = "SequenceNumbersRecord.FOR_DELTA_ROW_MAPPER";	 Catch:{ all -> 0x0111 }
        defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0111 }
        r8 = r8.query(r2, r3);	 Catch:{ all -> 0x0111 }
        r8 = r8.iterator();	 Catch:{ all -> 0x0111 }
        r2 = r8.hasNext();	 Catch:{ all -> 0x0111 }
        if (r2 == 0) goto L_0x00fb;	 Catch:{ all -> 0x0111 }
        r2 = r8.next();	 Catch:{ all -> 0x0111 }
        r2 = (com.snap.core.db.record.SequenceNumbersRecord.ForDelta) r2;	 Catch:{ all -> 0x0111 }
        r3 = r2.SequenceNumbers();	 Catch:{ all -> 0x0111 }
        r4 = "model.SequenceNumbers()";	 Catch:{ all -> 0x0111 }
        defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0111 }
        r3 = (com.snap.core.db.record.SequenceNumbersRecord) r3;	 Catch:{ all -> 0x0111 }
        r4 = r2.feedKind();	 Catch:{ all -> 0x0111 }
        r5 = com.snap.core.db.column.FeedKind.DIRECT;	 Catch:{ all -> 0x0111 }
        r6 = "model.key()";
        if (r4 != r5) goto L_0x00aa;
        r2 = r2.key();	 Catch:{ all -> 0x0111 }
        defpackage.akcr.a(r2, r6);	 Catch:{ all -> 0x0111 }
        r4 = r0.get(r2);	 Catch:{ all -> 0x0111 }
        if (r4 != 0) goto L_0x0083;	 Catch:{ all -> 0x0111 }
        r4 = new aefn;	 Catch:{ all -> 0x0111 }
        r4.<init>();	 Catch:{ all -> 0x0111 }
        r5 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0111 }
        r5.<init>();	 Catch:{ all -> 0x0111 }
        r5 = (java.util.Map) r5;	 Catch:{ all -> 0x0111 }
        r4.a = r5;	 Catch:{ all -> 0x0111 }
        r5 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0111 }
        r5.<init>();	 Catch:{ all -> 0x0111 }
        r5 = (java.util.Map) r5;	 Catch:{ all -> 0x0111 }
        r4.b = r5;	 Catch:{ all -> 0x0111 }
        r0.put(r2, r4);	 Catch:{ all -> 0x0111 }
        r4 = (defpackage.aefn) r4;	 Catch:{ all -> 0x0111 }
        r2 = r4.a;	 Catch:{ all -> 0x0111 }
        r5 = "deltaQuery.lastKnownMsgSeqs";	 Catch:{ all -> 0x0111 }
        defpackage.akcr.a(r2, r5);	 Catch:{ all -> 0x0111 }
        r5 = r3.username();	 Catch:{ all -> 0x0111 }
        r6 = r3.serverLatest();	 Catch:{ all -> 0x0111 }
        r2.put(r5, r6);	 Catch:{ all -> 0x0111 }
        r2 = r4.b;	 Catch:{ all -> 0x0111 }
        r4 = "deltaQuery.lastKnownUpdateSeqs";	 Catch:{ all -> 0x0111 }
        defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x0111 }
        r4 = r3.username();	 Catch:{ all -> 0x0111 }
        r3 = r3.updateNumber();	 Catch:{ all -> 0x0111 }
        r2.put(r4, r3);	 Catch:{ all -> 0x0111 }
        goto L_0x003b;	 Catch:{ all -> 0x0111 }
        r4 = r2.key();	 Catch:{ all -> 0x0111 }
        defpackage.akcr.a(r4, r6);	 Catch:{ all -> 0x0111 }
        r5 = r1.get(r4);	 Catch:{ all -> 0x0111 }
        if (r5 != 0) goto L_0x00d7;	 Catch:{ all -> 0x0111 }
        r5 = new ahak;	 Catch:{ all -> 0x0111 }
        r5.<init>();	 Catch:{ all -> 0x0111 }
        r2 = r2.key();	 Catch:{ all -> 0x0111 }
        r5.a = r2;	 Catch:{ all -> 0x0111 }
        r2 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0111 }
        r2.<init>();	 Catch:{ all -> 0x0111 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x0111 }
        r5.c = r2;	 Catch:{ all -> 0x0111 }
        r2 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0111 }
        r2.<init>();	 Catch:{ all -> 0x0111 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x0111 }
        r5.b = r2;	 Catch:{ all -> 0x0111 }
        r1.put(r4, r5);	 Catch:{ all -> 0x0111 }
        r5 = (defpackage.ahak) r5;	 Catch:{ all -> 0x0111 }
        r2 = r5.c;	 Catch:{ all -> 0x0111 }
        r4 = "deltaRequest.earliestSequenceNumbers";	 Catch:{ all -> 0x0111 }
        defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x0111 }
        r4 = r3.username();	 Catch:{ all -> 0x0111 }
        r6 = r3.processedEarliest();	 Catch:{ all -> 0x0111 }
        r2.put(r4, r6);	 Catch:{ all -> 0x0111 }
        r2 = r5.b;	 Catch:{ all -> 0x0111 }
        r4 = "deltaRequest.latestSequenceNumbers";	 Catch:{ all -> 0x0111 }
        defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x0111 }
        r4 = r3.username();	 Catch:{ all -> 0x0111 }
        r3 = r3.processedLatest();	 Catch:{ all -> 0x0111 }
        goto L_0x00a6;	 Catch:{ all -> 0x0111 }
        r8 = new qul;	 Catch:{ all -> 0x0111 }
        r1 = r1.values();	 Catch:{ all -> 0x0111 }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0111 }
        r1 = defpackage.ajyu.k(r1);	 Catch:{ all -> 0x0111 }
        r8.<init>(r0, r1);	 Catch:{ all -> 0x0111 }
        goto L_0x0110;	 Catch:{ all -> 0x0111 }
        r8 = new qul;	 Catch:{ all -> 0x0111 }
        r8.<init>();	 Catch:{ all -> 0x0111 }
        return r8;
        r8 = move-exception;
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qye.a(qxt):qul");
    }

    /* Access modifiers changed, original: final */
    public final rab b() {
        return (rab) this.g.b();
    }

    /* Access modifiers changed, original: final */
    public final aekq c() {
        aekq aekq = new aekq();
        Object b = b();
        akcr.a(b, "friendsFeedItemRepository");
        aekq.a = b.b();
        return aekq;
    }
}
