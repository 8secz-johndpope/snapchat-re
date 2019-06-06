package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.FeedMemberRecord;
import com.snap.core.db.record.FeedMemberRecord.ForTalk;
import com.snap.core.db.record.LegacyFeedMemberQueries;
import com.snap.core.db.record.TalkAuthContextModel.InsertTalkAuthContext;
import com.snap.core.db.record.TalkAuthContextRecord.BasicTalkAuth;
import java.util.Collection;
import java.util.List;

/* renamed from: rrn */
public final class rrn {
    final ajxe a = ajxh.a(new b(this));
    public final SnapDb b;
    private final ajxe c;
    private final ajxe d;
    private final prc e;

    /* renamed from: rrn$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ rrn a;
        private /* synthetic */ ide b;

        a(rrn rrn, ide ide) {
            this.a = rrn;
            this.b = ide;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.getDbClient(this.b);
        }
    }

    /* renamed from: rrn$c */
    static final class c extends akcs implements akbk<String> {
        private /* synthetic */ aipn a;

        c(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.a.get();
            akcr.a(obj, "userAuthLazy.get()");
            String b = ((gpb) obj).b();
            if (b == null) {
                akcr.a();
            }
            return b;
        }
    }

    /* renamed from: rrn$b */
    static final class b extends akcs implements akbk<InsertTalkAuthContext> {
        private /* synthetic */ rrn a;

        b(rrn rrn) {
            this.a = rrn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertTalkAuthContext(this.a.a().getWritableDatabase());
        }
    }

    /* renamed from: rrn$e */
    public static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ String a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;

        public e(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final /* synthetic */ Object apply(Object obj) {
            BasicTalkAuth basicTalkAuth = (BasicTalkAuth) obj;
            akcr.b(basicTalkAuth, "it");
            afcv afcv = new afcv();
            afcv.a = this.a;
            afcv.f = this.b;
            afcv.g = this.c;
            afcv.b = basicTalkAuth.scopeId();
            afcv.c = basicTalkAuth.mac();
            afcv.d = basicTalkAuth.token();
            return afcv;
        }
    }

    /* renamed from: rrn$g */
    public static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ rrn a;
        private /* synthetic */ String b;

        public g(rrn rrn, String str) {
            this.a = rrn;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "feedMemberRecords");
            return this.a.a(this.b, list);
        }
    }

    /* renamed from: rrn$h */
    public static final class h extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ rrn a;
        private /* synthetic */ Collection b;

        public h(rrn rrn, Collection collection) {
            this.a = rrn;
            this.b = collection;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            for (afcv afcv : this.b) {
                InsertTalkAuthContext insertTalkAuthContext = (InsertTalkAuthContext) this.a.a.b();
                String str = afcv.a;
                String str2 = afcv.f;
                String str3 = "";
                String str4 = str2 == null ? str3 : str2;
                str2 = afcv.g;
                insertTalkAuthContext.bind(str, str4, str2 == null ? str3 : str2, afcv.b, afcv.c, afcv.d);
                this.a.a().executeInsert(insertTalkAuthContext, dbTransaction);
            }
            return ajxw.a;
        }
    }

    /* renamed from: rrn$d */
    public static final class d extends akcq implements akbl<Cursor, BasicTalkAuth> {
        public d(ainw ainw) {
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
            return (BasicTalkAuth) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: rrn$f */
    public static final class f extends akcq implements akbl<Cursor, ForTalk> {
        public f(ainw ainw) {
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
            return (ForTalk) ((ainw) this.receiver).map(cursor);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(rrn.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(rrn.class), "localUsername", "getLocalUsername()Ljava/lang/String;"), new akdc(akde.a(rrn.class), "insertTalkAuthContext", "getInsertTalkAuthContext()Lcom/snap/core/db/record/TalkAuthContextModel$InsertTalkAuthContext;")};
    }

    public rrn(SnapDb snapDb, ide ide, aipn<gpb> aipn, prc prc) {
        akcr.b(snapDb, "snapDb");
        akcr.b(ide, "feature");
        akcr.b(aipn, "userAuthLazy");
        akcr.b(prc, "feedIdRepository");
        this.b = snapDb;
        this.e = prc;
        this.c = ajxh.a(new a(this, ide));
        this.d = ajxh.a(new c(aipn));
    }

    private static long a(String str, String str2) {
        return ((long) akgc.a((CharSequence) str, str2, 0, false, 6)) + 100;
    }

    private final String b() {
        return (String) this.d.b();
    }

    public final DbClient a() {
        return (DbClient) this.c.b();
    }

    public final List<abjv> a(String str) {
        akcr.b(str, "convoId");
        ainx b = b(str);
        DbClient a = a();
        Object obj = LegacyFeedMemberQueries.SELECT_FEED_MEMBERS_FOR_TALK_MAPPER;
        akcr.a(obj, "LegacyFeedMemberQueries.…D_MEMBERS_FOR_TALK_MAPPER");
        return a(str, a.query(b, obj));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x0113 in {7, 9, 10, 11, 15, 19, 20, 21, 23} preds:[]
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
    final java.util.List<defpackage.abjv> a(java.lang.String r10, java.util.List<? extends com.snap.core.db.record.FeedMemberRecord.ForTalk> r11) {
        /*
        r9 = this;
        r0 = "receiver$0";	 Catch:{ all -> 0x0111 }
        defpackage.akcr.b(r10, r0);	 Catch:{ all -> 0x0111 }
        r0 = r10;	 Catch:{ all -> 0x0111 }
        r0 = (java.lang.CharSequence) r0;	 Catch:{ all -> 0x0111 }
        r1 = "~";	 Catch:{ all -> 0x0111 }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x0111 }
        r2 = 0;	 Catch:{ all -> 0x0111 }
        r0 = defpackage.akgc.a(r0, r1, r2);	 Catch:{ all -> 0x0111 }
        if (r0 == 0) goto L_0x0095;	 Catch:{ all -> 0x0111 }
        r11.size();	 Catch:{ all -> 0x0111 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0111 }
        r1 = "Expected <= 1 participant in 1-1 convo=";	 Catch:{ all -> 0x0111 }
        r0.<init>(r1);	 Catch:{ all -> 0x0111 }
        r0.append(r10);	 Catch:{ all -> 0x0111 }
        r1 = ", got ";	 Catch:{ all -> 0x0111 }
        r0.append(r1);	 Catch:{ all -> 0x0111 }
        r1 = r11.size();	 Catch:{ all -> 0x0111 }
        r0.append(r1);	 Catch:{ all -> 0x0111 }
        r0 = 2;	 Catch:{ all -> 0x0111 }
        r0 = new defpackage.abjv[r0];	 Catch:{ all -> 0x0111 }
        r11 = defpackage.ajyu.g(r11);	 Catch:{ all -> 0x0111 }
        r4 = r11;	 Catch:{ all -> 0x0111 }
        r4 = (com.snap.core.db.record.FeedMemberRecord.ForTalk) r4;	 Catch:{ all -> 0x0111 }
        if (r4 != 0) goto L_0x0060;	 Catch:{ all -> 0x0111 }
        r11 = r9.b();	 Catch:{ all -> 0x0111 }
        r11 = defpackage.rro.a(r10, r11);	 Catch:{ all -> 0x0111 }
        if (r11 == 0) goto L_0x004e;	 Catch:{ all -> 0x0111 }
        r1 = new rrs;	 Catch:{ all -> 0x0111 }
        r3 = defpackage.rrn.a(r10, r11);	 Catch:{ all -> 0x0111 }
        r1.<init>(r11, r3);	 Catch:{ all -> 0x0111 }
        r1 = (defpackage.abjv) r1;	 Catch:{ all -> 0x0111 }
        goto L_0x0078;	 Catch:{ all -> 0x0111 }
        r11 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0111 }
        r0 = "Remote username not found in 1v1 id=";	 Catch:{ all -> 0x0111 }
        r10 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x0111 }
        r10 = r0.concat(r10);	 Catch:{ all -> 0x0111 }
        r11.<init>(r10);	 Catch:{ all -> 0x0111 }
        r11 = (java.lang.Throwable) r11;	 Catch:{ all -> 0x0111 }
        throw r11;	 Catch:{ all -> 0x0111 }
        r11 = new rrs;	 Catch:{ all -> 0x0111 }
        r5 = 0;	 Catch:{ all -> 0x0111 }
        r1 = r4.username();	 Catch:{ all -> 0x0111 }
        r3 = "username()";	 Catch:{ all -> 0x0111 }
        defpackage.akcr.a(r1, r3);	 Catch:{ all -> 0x0111 }
        r6 = defpackage.rrn.a(r10, r1);	 Catch:{ all -> 0x0111 }
        r8 = 2;	 Catch:{ all -> 0x0111 }
        r3 = r11;	 Catch:{ all -> 0x0111 }
        r3.<init>(r4, r5, r6, r8);	 Catch:{ all -> 0x0111 }
        r1 = r11;	 Catch:{ all -> 0x0111 }
        r1 = (defpackage.abjv) r1;	 Catch:{ all -> 0x0111 }
        r0[r2] = r1;	 Catch:{ all -> 0x0111 }
        r11 = 1;	 Catch:{ all -> 0x0111 }
        r1 = new rrs;	 Catch:{ all -> 0x0111 }
        r2 = r9.b();	 Catch:{ all -> 0x0111 }
        r3 = r9.b();	 Catch:{ all -> 0x0111 }
        r3 = defpackage.rrn.a(r10, r3);	 Catch:{ all -> 0x0111 }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x0111 }
        r1 = (defpackage.abjv) r1;	 Catch:{ all -> 0x0111 }
        r0[r11] = r1;	 Catch:{ all -> 0x0111 }
        r10 = defpackage.ajym.b(r0);	 Catch:{ all -> 0x0111 }
        goto L_0x0110;	 Catch:{ all -> 0x0111 }
        r10 = r11;	 Catch:{ all -> 0x0111 }
        r10 = (java.lang.Iterable) r10;	 Catch:{ all -> 0x0111 }
        r0 = 10;	 Catch:{ all -> 0x0111 }
        r1 = defpackage.ajyn.a(r10, r0);	 Catch:{ all -> 0x0111 }
        r1 = defpackage.ajzm.a(r1);	 Catch:{ all -> 0x0111 }
        r2 = 16;	 Catch:{ all -> 0x0111 }
        r1 = defpackage.akef.b(r1, r2);	 Catch:{ all -> 0x0111 }
        r2 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0111 }
        r2.<init>(r1);	 Catch:{ all -> 0x0111 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x0111 }
        r10 = r10.iterator();	 Catch:{ all -> 0x0111 }
        r1 = r10.hasNext();	 Catch:{ all -> 0x0111 }
        if (r1 == 0) goto L_0x00d3;	 Catch:{ all -> 0x0111 }
        r1 = r10.next();	 Catch:{ all -> 0x0111 }
        r1 = (com.snap.core.db.record.FeedMemberRecord.ForTalk) r1;	 Catch:{ all -> 0x0111 }
        r3 = r1.username();	 Catch:{ all -> 0x0111 }
        r1 = r1.displayName();	 Catch:{ all -> 0x0111 }
        r1 = defpackage.ajxs.a(r3, r1);	 Catch:{ all -> 0x0111 }
        r3 = r1.a;	 Catch:{ all -> 0x0111 }
        r1 = r1.b;	 Catch:{ all -> 0x0111 }
        r2.put(r3, r1);	 Catch:{ all -> 0x0111 }
        goto L_0x00b3;	 Catch:{ all -> 0x0111 }
        r10 = defpackage.res.a(r2);	 Catch:{ all -> 0x0111 }
        r11 = (java.lang.Iterable) r11;	 Catch:{ all -> 0x0111 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0111 }
        r0 = defpackage.ajyn.a(r11, r0);	 Catch:{ all -> 0x0111 }
        r1.<init>(r0);	 Catch:{ all -> 0x0111 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0111 }
        r11 = r11.iterator();	 Catch:{ all -> 0x0111 }
        r0 = r11.hasNext();	 Catch:{ all -> 0x0111 }
        if (r0 == 0) goto L_0x010d;	 Catch:{ all -> 0x0111 }
        r0 = r11.next();	 Catch:{ all -> 0x0111 }
        r3 = r0;	 Catch:{ all -> 0x0111 }
        r3 = (com.snap.core.db.record.FeedMemberRecord.ForTalk) r3;	 Catch:{ all -> 0x0111 }
        r0 = new rrs;	 Catch:{ all -> 0x0111 }
        r2 = r3.username();	 Catch:{ all -> 0x0111 }
        r2 = r10.get(r2);	 Catch:{ all -> 0x0111 }
        r4 = r2;	 Catch:{ all -> 0x0111 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0111 }
        r5 = 0;	 Catch:{ all -> 0x0111 }
        r7 = 4;	 Catch:{ all -> 0x0111 }
        r2 = r0;	 Catch:{ all -> 0x0111 }
        r2.<init>(r3, r4, r5, r7);	 Catch:{ all -> 0x0111 }
        r1.add(r0);	 Catch:{ all -> 0x0111 }
        goto L_0x00e8;	 Catch:{ all -> 0x0111 }
        r10 = r1;	 Catch:{ all -> 0x0111 }
        r10 = (java.util.List) r10;	 Catch:{ all -> 0x0111 }
        return r10;
        r10 = move-exception;
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrn.a(java.lang.String, java.util.List):java.util.List");
    }

    public final ainx b(String str) {
        Object selectMembersForTalk = FeedMemberRecord.FACTORY.selectMembersForTalk(this.e.b(str));
        akcr.a(selectMembersForTalk, "FeedMemberRecord.FACTORY…ectMembersForTalk(feedId)");
        return selectMembersForTalk;
    }
}
