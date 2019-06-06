package defpackage;

import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.ConfigRuleModel.DeleteConfigByConfigId;
import com.snap.core.db.record.ConfigRuleModel.DeleteConfigRule;
import com.snap.core.db.record.ConfigRuleModel.InsertOrReplaceConfig;
import com.snap.core.db.record.ConfigRuleModel.RefreshAllTtls;
import com.snap.core.db.record.ConfigRuleRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ewr */
public final class ewr {
    final ajxe a = ajxh.a(new k(this));
    final ajwy<SnapDb> b;
    final ajwy<exb> c;
    final ajwy<ilv> d;
    private final ajxe e = ajxh.a(new a(this));
    private final ajxe f = ajxh.a(new b(this));
    private final ajxe g = ajxh.a(new l(a()));
    private final ajxe h = ajxh.a(new i(this));
    private final ajxe i = ajxh.a(new h(this));
    private final ajxe j = ajxh.a(new d(this));
    private final ajxe k = ajxh.a(new c(this));
    private final ajxe l = ajxh.a(new f(this));

    /* renamed from: ewr$k */
    static final class k extends akcs implements akbk<SnapDb> {
        private /* synthetic */ ewr a;

        k(ewr ewr) {
            this.a = ewr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SnapDb) this.a.b.get();
        }
    }

    /* renamed from: ewr$l */
    static final class l extends akcq implements akbk<pa> {
        l(DbClient dbClient) {
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

    /* renamed from: ewr$a */
    static final class a extends akcs implements akbk<exb> {
        private /* synthetic */ ewr a;

        a(ewr ewr) {
            this.a = ewr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (exb) this.a.c.get();
        }
    }

    /* renamed from: ewr$b */
    static final class b extends akcs implements akbk<DbClient> {
        private /* synthetic */ ewr a;

        b(ewr ewr) {
            this.a = ewr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.a.a.b()).getDbClient((ide) evh.a);
        }
    }

    /* renamed from: ewr$i */
    static final class i extends akcs implements akbk<RefreshAllTtls> {
        private /* synthetic */ ewr a;

        i(ewr ewr) {
            this.a = ewr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new RefreshAllTtls(((pa) this.a.g.b()));
        }
    }

    /* renamed from: ewr$h */
    static final class h extends akcs implements akbk<InsertOrReplaceConfig> {
        private /* synthetic */ ewr a;

        h(ewr ewr) {
            this.a = ewr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertOrReplaceConfig(((pa) this.a.g.b()), ConfigRuleRecord.FACTORY);
        }
    }

    /* renamed from: ewr$d */
    static final class d extends akcs implements akbk<DeleteConfigByConfigId> {
        private /* synthetic */ ewr a;

        d(ewr ewr) {
            this.a = ewr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeleteConfigByConfigId(((pa) this.a.g.b()));
        }
    }

    /* renamed from: ewr$c */
    static final class c extends akcs implements akbk<DeleteConfigRule> {
        private /* synthetic */ ewr a;

        c(ewr ewr) {
            this.a = ewr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeleteConfigRule(((pa) this.a.g.b()));
        }
    }

    /* renamed from: ewr$f */
    static final class f extends akcs implements akbk<ilv> {
        private /* synthetic */ ewr a;

        f(ewr ewr) {
            this.a = ewr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) this.a.d.get();
        }
    }

    /* renamed from: ewr$j */
    static final class j extends akcs implements akbl<DbTransaction, Integer> {
        private /* synthetic */ ewr a;
        private /* synthetic */ long b;

        j(ewr ewr, long j) {
            this.a = ewr;
            this.b = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            long currentTimeMillis = System.currentTimeMillis();
            RefreshAllTtls a = ((RefreshAllTtls) this.a.h.b());
            long j = this.b;
            a.bind(j, j);
            int executeUpdateDelete = this.a.a().executeUpdateDelete(((RefreshAllTtls) this.a.h.b()), dbTransaction);
            ilz b = exg.b(true);
            this.a.b().a(b, System.currentTimeMillis() - currentTimeMillis);
            this.a.b().b(b, (long) executeUpdateDelete);
            this.a.b().c(b, 1);
            return Integer.valueOf(executeUpdateDelete);
        }
    }

    /* renamed from: ewr$e */
    static final class e extends akcs implements akbl<DbTransaction, Long> {
        private /* synthetic */ ewr a;
        private /* synthetic */ acbz[] b;

        e(ewr ewr, acbz[] acbzArr) {
            this.a = ewr;
            this.b = acbzArr;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            long currentTimeMillis = System.currentTimeMillis();
            acbz[] acbzArr = this.b;
            int length = acbzArr.length;
            long j = 0;
            int i = 0;
            while (true) {
                String str = "briteDatabase";
                if (i < length) {
                    int i2;
                    acbz acbz = acbzArr[i];
                    ((DeleteConfigRule) this.a.k.b()).bind(acbz.b(), acbz.d());
                    Object a = this.a.a();
                    akcr.a(a, str);
                    long executeDelete = j + ((long) BriteDatabaseExtensionsKt.executeDelete(a, ((DeleteConfigRule) this.a.k.b())));
                    if (acbz.h()) {
                        i2 = i;
                    } else {
                        i2 = i;
                        ((InsertOrReplaceConfig) this.a.i.b()).bind(acbz.d(), acbz.b(), Long.valueOf((long) acbz.e()), acbz, currentTimeMillis, acbz.c());
                        executeDelete += this.a.a().executeInsert(((InsertOrReplaceConfig) this.a.i.b()), dbTransaction);
                    }
                    j = executeDelete;
                    i = i2 + 1;
                } else {
                    ((RefreshAllTtls) this.a.h.b()).bind(currentTimeMillis, currentTimeMillis);
                    Object a2 = this.a.a();
                    akcr.a(a2, str);
                    j += (long) BriteDatabaseExtensionsKt.executeUpdate(a2, ((RefreshAllTtls) this.a.h.b()), dbTransaction);
                    ilz b = exg.b(false);
                    this.a.b().a(b, System.currentTimeMillis() - currentTimeMillis);
                    this.a.b().b(b, j);
                    this.a.b().c(b, 1);
                    return Long.valueOf(j);
                }
            }
        }
    }

    /* renamed from: ewr$g */
    static final class g extends akcs implements akbl<DbTransaction, Long> {
        private /* synthetic */ ewr a;
        private /* synthetic */ acbz[] b;

        g(ewr ewr, acbz[] acbzArr) {
            this.a = ewr;
            this.b = acbzArr;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            long j;
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            long currentTimeMillis = System.currentTimeMillis();
            Set<String> linkedHashSet = new LinkedHashSet();
            acbz[] acbzArr = this.b;
            Collection arrayList = new ArrayList(acbzArr.length);
            for (acbz b : acbzArr) {
                Object b2 = b.b();
                akcr.a(b2, "config.configId");
                arrayList.add(Boolean.valueOf(linkedHashSet.add(b2)));
            }
            long j2 = 0;
            for (String bind : linkedHashSet) {
                ((DeleteConfigByConfigId) this.a.j.b()).bind(bind);
                Object a = this.a.a();
                akcr.a(a, "briteDatabase");
                j2 += (long) BriteDatabaseExtensionsKt.executeDelete(a, ((DeleteConfigByConfigId) this.a.j.b()), dbTransaction);
            }
            acbz[] acbzArr2 = this.b;
            int length = acbzArr2.length;
            long j3 = j2;
            int i = 0;
            while (i < length) {
                acbz acbz = acbzArr2[i];
                j = j3;
                ((InsertOrReplaceConfig) this.a.i.b()).bind(acbz.d(), acbz.b(), Long.valueOf((long) acbz.e()), acbz, System.currentTimeMillis(), acbz.c());
                i++;
                j3 = j + this.a.a().executeInsert(((InsertOrReplaceConfig) this.a.i.b()), dbTransaction);
            }
            j = j3;
            ilz b3 = exg.b(false);
            this.a.b().a(b3, System.currentTimeMillis() - currentTimeMillis);
            j2 = j;
            this.a.b().b(b3, j2);
            this.a.b().c(b3, 1);
            return Long.valueOf(j2);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ewr.class), "snapDb", "getSnapDb()Lcom/snap/core/db/api/SnapDb;"), new akdc(akde.a(ewr.class), "actionDispatcher", "getActionDispatcher()Lcom/snap/circumstanceengine/lib/SyncEngineActionDispatcher;"), new akdc(akde.a(ewr.class), "briteDatabase", "getBriteDatabase()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(ewr.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(ewr.class), "refreshAllTtlsStatement", "getRefreshAllTtlsStatement()Lcom/snap/core/db/record/ConfigRuleModel$RefreshAllTtls;"), new akdc(akde.a(ewr.class), "insertOrUpdateStatement", "getInsertOrUpdateStatement()Lcom/snap/core/db/record/ConfigRuleModel$InsertOrReplaceConfig;"), new akdc(akde.a(ewr.class), "deleteConfigsByIdStatement", "getDeleteConfigsByIdStatement()Lcom/snap/core/db/record/ConfigRuleModel$DeleteConfigByConfigId;"), new akdc(akde.a(ewr.class), "deleteConfigRuleStatement", "getDeleteConfigRuleStatement()Lcom/snap/core/db/record/ConfigRuleModel$DeleteConfigRule;"), new akdc(akde.a(ewr.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;")};
    }

    public ewr(ajwy<SnapDb> ajwy, ajwy<exb> ajwy2, ajwy<ilv> ajwy3) {
        akcr.b(ajwy, "snapDbProvider");
        akcr.b(ajwy2, "actionDispatcherProvider");
        akcr.b(ajwy3, "grapheneProvider");
        this.b = ajwy;
        this.c = ajwy2;
        this.d = ajwy3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x00e8 in {8, 10, 13, 17, 19, 21} preds:[]
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
    private final java.util.List<defpackage.acbz> a(java.util.List<? extends com.snap.core.db.record.ConfigRuleRecord> r14, java.lang.String r15) {
        /*
        r13 = this;
        r0 = new exd;	 Catch:{ all -> 0x00e6 }
        r0.<init>();	 Catch:{ all -> 0x00e6 }
        r0 = 0;	 Catch:{ all -> 0x00e6 }
        r14 = (java.lang.Iterable) r14;	 Catch:{ all -> 0x00e6 }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x00e6 }
        r2.<init>();	 Catch:{ all -> 0x00e6 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x00e6 }
        r14 = r14.iterator();	 Catch:{ all -> 0x00e6 }
        r3 = r14.hasNext();	 Catch:{ all -> 0x00e6 }
        r4 = "config_name";
        r5 = 0;
        r6 = "configName";
        if (r3 == 0) goto L_0x00a0;
        r3 = r14.next();	 Catch:{ all -> 0x00e6 }
        r7 = r3;	 Catch:{ all -> 0x00e6 }
        r7 = (com.snap.core.db.record.ConfigRuleRecord) r7;	 Catch:{ all -> 0x00e6 }
        r8 = "configRule";	 Catch:{ all -> 0x00e6 }
        defpackage.akcr.b(r7, r8);	 Catch:{ all -> 0x00e6 }
        r8 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x00e6 }
        r9 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00e6 }
        r8 = r8.toSeconds(r9);	 Catch:{ all -> 0x00e6 }
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x00e6 }
        r11 = r7.last_updated();	 Catch:{ all -> 0x00e6 }
        r10 = r10.toSeconds(r11);	 Catch:{ all -> 0x00e6 }
        r8 = r8 - r10;	 Catch:{ all -> 0x00e6 }
        r10 = r7.ttl();	 Catch:{ all -> 0x00e6 }
        r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));	 Catch:{ all -> 0x00e6 }
        if (r12 >= 0) goto L_0x0049;	 Catch:{ all -> 0x00e6 }
        r5 = 1;	 Catch:{ all -> 0x00e6 }
        if (r5 != 0) goto L_0x0067;	 Catch:{ all -> 0x00e6 }
        r8 = 1;	 Catch:{ all -> 0x00e6 }
        r0 = r0 + r8;	 Catch:{ all -> 0x00e6 }
        r8 = r13.e;	 Catch:{ all -> 0x00e6 }
        r8 = r8.b();	 Catch:{ all -> 0x00e6 }
        r8 = (defpackage.exb) r8;	 Catch:{ all -> 0x00e6 }
        r9 = new ewp;	 Catch:{ all -> 0x00e6 }
        r9.<init>(r15);	 Catch:{ all -> 0x00e6 }
        r10 = "event";	 Catch:{ all -> 0x00e6 }
        defpackage.akcr.b(r9, r10);	 Catch:{ all -> 0x00e6 }
        r8 = r8.a();	 Catch:{ all -> 0x00e6 }
        r8.a(r9);	 Catch:{ all -> 0x00e6 }
        r8 = r13.b();	 Catch:{ all -> 0x00e6 }
        r7 = r7.rule_id();	 Catch:{ all -> 0x00e6 }
        r9 = "rule.rule_id()";	 Catch:{ all -> 0x00e6 }
        defpackage.akcr.a(r7, r9);	 Catch:{ all -> 0x00e6 }
        defpackage.akcr.b(r15, r6);	 Catch:{ all -> 0x00e6 }
        r6 = "ruleId";	 Catch:{ all -> 0x00e6 }
        defpackage.akcr.b(r7, r6);	 Catch:{ all -> 0x00e6 }
        r6 = defpackage.inr.RETRIEVE_RULE;	 Catch:{ all -> 0x00e6 }
        r9 = defpackage.exg.a(r15);	 Catch:{ all -> 0x00e6 }
        r4 = r6.a(r4, r9);	 Catch:{ all -> 0x00e6 }
        r6 = "rule_id";	 Catch:{ all -> 0x00e6 }
        r7 = defpackage.exg.a(r7);	 Catch:{ all -> 0x00e6 }
        r4 = r4.a(r6, r7);	 Catch:{ all -> 0x00e6 }
        r6 = "is_valid";	 Catch:{ all -> 0x00e6 }
        r4 = r4.a(r6, r5);	 Catch:{ all -> 0x00e6 }
        r8.c(r4, 1);	 Catch:{ all -> 0x00e6 }
        if (r5 == 0) goto L_0x0014;	 Catch:{ all -> 0x00e6 }
        r2.add(r3);	 Catch:{ all -> 0x00e6 }
        goto L_0x0014;	 Catch:{ all -> 0x00e6 }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x00e6 }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x00e6 }
        r14 = new java.util.ArrayList;	 Catch:{ all -> 0x00e6 }
        r3 = 10;	 Catch:{ all -> 0x00e6 }
        r3 = defpackage.ajyn.a(r2, r3);	 Catch:{ all -> 0x00e6 }
        r14.<init>(r3);	 Catch:{ all -> 0x00e6 }
        r14 = (java.util.Collection) r14;	 Catch:{ all -> 0x00e6 }
        r2 = r2.iterator();	 Catch:{ all -> 0x00e6 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x00e6 }
        if (r3 == 0) goto L_0x00c9;	 Catch:{ all -> 0x00e6 }
        r3 = r2.next();	 Catch:{ all -> 0x00e6 }
        r3 = (com.snap.core.db.record.ConfigRuleRecord) r3;	 Catch:{ all -> 0x00e6 }
        r3 = r3.config_result();	 Catch:{ all -> 0x00e6 }
        r14.add(r3);	 Catch:{ all -> 0x00e6 }
        goto L_0x00b5;	 Catch:{ all -> 0x00e6 }
        r14 = (java.util.List) r14;	 Catch:{ all -> 0x00e6 }
        r2 = r13.b();	 Catch:{ all -> 0x00e6 }
        defpackage.akcr.b(r15, r6);	 Catch:{ all -> 0x00e6 }
        r3 = defpackage.inr.GET_CONFIG;	 Catch:{ all -> 0x00e6 }
        r15 = defpackage.exg.a(r15);	 Catch:{ all -> 0x00e6 }
        r15 = r3.a(r4, r15);	 Catch:{ all -> 0x00e6 }
        r3 = "db_hit";	 Catch:{ all -> 0x00e6 }
        r15 = r15.a(r3, r5);	 Catch:{ all -> 0x00e6 }
        r2.b(r15, r0);	 Catch:{ all -> 0x00e6 }
        return r14;
        r14 = move-exception;
        throw r14;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewr.a(java.util.List, java.lang.String):java.util.List");
    }

    private List<ConfigRuleRecord> b(String str) {
        akcr.b(str, "configId");
        Object SelectConfigRulesByConfigId = ConfigRuleRecord.FACTORY.SelectConfigRulesByConfigId(str);
        akcr.a(SelectConfigRulesByConfigId, "ConfigRuleRecord.FACTORY…RulesByConfigId(configId)");
        DbClient a = a();
        Object obj = ConfigRuleRecord.MAPPER;
        akcr.a(obj, "ConfigRuleRecord.MAPPER");
        return a.query(SelectConfigRulesByConfigId, obj);
    }

    /* Access modifiers changed, original: final */
    public final DbClient a() {
        return (DbClient) this.f.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x009b in {10, 11, 13, 15} preds:[]
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
    public final java.util.List<defpackage.acbz> a(java.lang.String r10) {
        /*
        r9 = this;
        r0 = "configKey";
        defpackage.akcr.b(r10, r0);
        r1 = r9.b(r10);	 Catch:{ all -> 0x0099 }
        r2 = r1.iterator();	 Catch:{ all -> 0x0099 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x0099 }
        r4 = "config_name";
        if (r3 == 0) goto L_0x0079;
        r3 = r2.next();	 Catch:{ all -> 0x0099 }
        r3 = (com.snap.core.db.record.ConfigRuleRecord) r3;	 Catch:{ all -> 0x0099 }
        r5 = r3.config_id();	 Catch:{ all -> 0x0099 }
        r6 = "result.config_id()";	 Catch:{ all -> 0x0099 }
        defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x0099 }
        r3 = r3.config_result();	 Catch:{ all -> 0x0099 }
        r6 = "result.config_result()";	 Catch:{ all -> 0x0099 }
        defpackage.akcr.a(r3, r6);	 Catch:{ all -> 0x0099 }
        r3 = r3.b();	 Catch:{ all -> 0x0099 }
        r6 = defpackage.akcr.a(r10, r5);	 Catch:{ all -> 0x0099 }
        r6 = r6 ^ 1;	 Catch:{ all -> 0x0099 }
        if (r6 != 0) goto L_0x0041;	 Catch:{ all -> 0x0099 }
        r6 = defpackage.akcr.a(r10, r3);	 Catch:{ all -> 0x0099 }
        r6 = r6 ^ 1;	 Catch:{ all -> 0x0099 }
        if (r6 == 0) goto L_0x000d;	 Catch:{ all -> 0x0099 }
        r6 = r9.b();	 Catch:{ all -> 0x0099 }
        r7 = "ruleConfigId";	 Catch:{ all -> 0x0099 }
        defpackage.akcr.a(r3, r7);	 Catch:{ all -> 0x0099 }
        defpackage.akcr.b(r10, r0);	 Catch:{ all -> 0x0099 }
        r7 = "columnKey";	 Catch:{ all -> 0x0099 }
        defpackage.akcr.b(r5, r7);	 Catch:{ all -> 0x0099 }
        r7 = "persistedRuleKey";	 Catch:{ all -> 0x0099 }
        defpackage.akcr.b(r3, r7);	 Catch:{ all -> 0x0099 }
        r7 = defpackage.inr.RETRIEVE_RULE_MISMATCH;	 Catch:{ all -> 0x0099 }
        r8 = defpackage.exg.a(r10);	 Catch:{ all -> 0x0099 }
        r4 = r7.a(r4, r8);	 Catch:{ all -> 0x0099 }
        r7 = "column_key";	 Catch:{ all -> 0x0099 }
        r5 = defpackage.exg.a(r5);	 Catch:{ all -> 0x0099 }
        r4 = r4.a(r7, r5);	 Catch:{ all -> 0x0099 }
        r5 = "rule_config_id";	 Catch:{ all -> 0x0099 }
        r3 = defpackage.exg.a(r3);	 Catch:{ all -> 0x0099 }
        r3 = r4.a(r5, r3);	 Catch:{ all -> 0x0099 }
        r6.c(r3, 1);	 Catch:{ all -> 0x0099 }
        goto L_0x000d;	 Catch:{ all -> 0x0099 }
        r0 = r9.b();	 Catch:{ all -> 0x0099 }
        r2 = "configName";	 Catch:{ all -> 0x0099 }
        defpackage.akcr.b(r10, r2);	 Catch:{ all -> 0x0099 }
        r2 = defpackage.inr.GET_CONFIG;	 Catch:{ all -> 0x0099 }
        r3 = defpackage.exg.a(r10);	 Catch:{ all -> 0x0099 }
        r2 = r2.a(r4, r3);	 Catch:{ all -> 0x0099 }
        r3 = r1.size();	 Catch:{ all -> 0x0099 }
        r3 = (long) r3;	 Catch:{ all -> 0x0099 }
        r0.b(r2, r3);	 Catch:{ all -> 0x0099 }
        r10 = r9.a(r1, r10);	 Catch:{ all -> 0x0099 }
        return r10;
        r10 = move-exception;
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewr.a(java.lang.String):java.util.List");
    }

    /* Access modifiers changed, original: final */
    public final ilv b() {
        return (ilv) this.l.b();
    }
}
