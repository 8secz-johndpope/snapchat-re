package defpackage;

import com.brightcove.player.event.Event;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.DiscoverStorySnapModel;
import com.snap.core.db.record.LensStatisticsStorageRecord.ImpressionsRecord;
import defpackage.mhs.b;
import defpackage.mzk.c;
import defpackage.mzk.d.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: lne */
public final class lne implements mzk {
    final SnapDb a;
    final ide b;
    private final ajxe c = ajxh.a(new a(this));
    private final ajec<List<ImpressionsRecord>, c> d = b.a;
    private final zfw e;

    /* renamed from: lne$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ lne a;

        a(lne lne) {
            this.a = lne;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.getDbClient(this.a.b.callsite("SnapDbLensStatisticsRepository"));
        }
    }

    /* renamed from: lne$b */
    static final class b<Upstream, Downstream> implements ajec<List<? extends ImpressionsRecord>, c> {
        public static final b a = new b();

        /* renamed from: lne$b$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            /* renamed from: lne$b$1$1 */
            static final class 1 extends akcs implements akbl<ImpressionsRecord, a> {
                public static final 1 a = new 1();

                1() {
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    ImpressionsRecord impressionsRecord = (ImpressionsRecord) obj;
                    akcr.b(impressionsRecord, "it");
                    String lensId = impressionsRecord.lensId();
                    akcr.a((Object) lensId, "it.lensId()");
                    return new a(new defpackage.mhs.b(lensId), impressionsRecord.impressionCount());
                }
            }

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "records");
                Map linkedHashMap = new LinkedHashMap();
                for (Object next : akfh.c(ajyu.v(list), 1.a)) {
                    linkedHashMap.put(((a) next).a, next);
                }
                return new c.a(linkedHashMap);
            }
        }

        b() {
        }

        public final /* synthetic */ ajeb apply(ajdx ajdx) {
            akcr.b(ajdx, "upstream");
            return ajdx.f(1.a);
        }
    }

    /* renamed from: lne$d */
    static final class d<T> implements ajea<T> {
        private /* synthetic */ DbClient a;
        private /* synthetic */ ainx b;
        private /* synthetic */ ainw c;

        d(DbClient dbClient, ainx ainx, ainw ainw) {
            this.a = dbClient;
            this.b = ainx;
            this.c = ainw;
        }

        public final void subscribe(ajdy<List<Result>> ajdy) {
            akcr.b(ajdy, Event.EMITTER);
            Object query = this.a.query(this.b, this.c);
            if (!ajdy.isDisposed()) {
                ajdy.a(query);
            }
        }
    }

    /* renamed from: lne$c */
    static final class c extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ lne a;
        private /* synthetic */ b b;

        c(lne lne, b bVar) {
            this.a = lne;
            this.b = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            DbClient a = this.a.a();
            defpackage.mpp.c cVar = new defpackage.mpp.c(this.a.a().getWritableDatabase());
            cVar.a(this.b.a, this.b.a);
            a.executeInsert(cVar, dbTransaction);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lne.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;");
    }

    public lne(SnapDb snapDb, zfw zfw, ide ide) {
        akcr.b(snapDb, "snapDb");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ide, "attributedFeature");
        this.a = snapDb;
        this.e = zfw;
        this.b = ide;
    }

    private final <Result> ajdx<List<Result>> a(DbClient dbClient, ainx ainx, ainw<Result> ainw) {
        Object a = ajdx.a((ajea) new d(dbClient, ainx, ainw));
        akcr.a(a, "Single.create<List<Resul…)\n            }\n        }");
        a = a.b((ajdw) this.e.i());
        akcr.a(a, "Single.create<List<Resul…fiedSchedulers.queries())");
        return a;
    }

    public final ajcx a(b bVar) {
        akcr.b(bVar, DiscoverStorySnapModel.LENSID);
        return a().runInTransaction("SnapDbLensStatisticsRepository:write", new c(this, bVar));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x00bc in {2, 4, 9, 13, 16, 17, 19, 21} preds:[]
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
    public final defpackage.ajdx<defpackage.mzk.c> a(defpackage.mzk.b r4) {
        /*
        r3 = this;
        r0 = "criteria";
        defpackage.akcr.b(r4, r0);
        r0 = defpackage.mzk.b.a.a.a;
        r0 = defpackage.akcr.a(r4, r0);
        r1 = "dbClient";
        if (r0 == 0) goto L_0x0036;
        r4 = defpackage.mpp.b.a();
        r0 = "LensStatisticsStorageRec…RY.selectAllImpressions()";
        defpackage.akcr.a(r4, r0);
        r0 = r3.a();
        defpackage.akcr.a(r0, r1);
        r1 = defpackage.lnf.a;
        r2 = "IMPRESSIONS_MAPPER";
        defpackage.akcr.a(r1, r2);
        r4 = r3.a(r0, r4, r1);
        r0 = r3.d;
        r4 = r4.a(r0);
        r0 = "dbClient.queryAsSingle(s…e(impressionsTransformer)";
        defpackage.akcr.a(r4, r0);
        return r4;
        r0 = r4 instanceof defpackage.mzk.b.a.b;
        if (r0 == 0) goto L_0x00b6;
        r4 = (defpackage.mzk.b.a.b) r4;
        r0 = r4.a;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0052;
        r4 = new mzk$c$a;
        r0 = defpackage.ajyx.a;
        r0 = (java.util.Map) r0;
        r4.<init>(r0);
        r4 = defpackage.ajdx.b(r4);
        goto L_0x00ab;
        r4 = r4.a;
        r4 = (java.lang.Iterable) r4;
        r0 = new java.util.ArrayList;
        r2 = 10;
        r2 = defpackage.ajyn.a(r4, r2);
        r0.<init>(r2);
        r0 = (java.util.Collection) r0;
        r4 = r4.iterator();
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x0079;
        r2 = r4.next();
        r2 = (defpackage.mhs.b) r2;
        r2 = r2.a;
        r0.add(r2);
        goto L_0x0067;
        r0 = (java.util.List) r0;
        r0 = (java.util.Collection) r0;
        r4 = 0;
        r4 = new java.lang.String[r4];
        r4 = r0.toArray(r4);
        if (r4 == 0) goto L_0x00ae;
        r4 = (java.lang.String[]) r4;
        r0 = com.snap.core.db.record.LensStatisticsStorageRecord.FACTORY;
        r4 = r0.a(r4);
        r0 = "LensStatisticsStorageRec…lectByIdsImpressions(ids)";
        defpackage.akcr.a(r4, r0);
        r0 = r3.a();
        defpackage.akcr.a(r0, r1);
        r1 = defpackage.lnf.b;
        r2 = "IMPRESSIONS_BY_ID_MAPPER";
        defpackage.akcr.a(r1, r2);
        r4 = r3.a(r0, r4, r1);
        r0 = r3.d;
        r4 = r4.a(r0);
        r0 = "if (criteria.ids.isEmpty…former)\n                }";
        goto L_0x0032;
        r4 = new ajxt;
        r0 = "null cannot be cast to non-null type kotlin.Array<T>";
        r4.<init>(r0);
        throw r4;
        r4 = new ajxk;
        r4.<init>();
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lne.a(mzk$b):ajdx");
    }

    /* Access modifiers changed, original: final */
    public final DbClient a() {
        return (DbClient) this.c.b();
    }
}
