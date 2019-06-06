package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.PublisherSnapPageModel.ClearAll;
import com.snap.core.db.record.PublisherSnapPageModel.InsertPublisherSnapPage;
import com.snap.core.db.record.PublisherSnapPageModel.Mapper;
import com.snap.core.db.record.PublisherSnapPageModel.UpdatePublisherSnapPage;
import com.snap.core.db.record.PublisherSnapPageModel.UpdateRichMediaInfo;
import com.snap.core.db.record.PublisherSnapPageRecord;
import com.snap.core.db.record.PublisherSnapPageRecord.PageMediaInfoRecord;
import com.snap.core.db.record.PublisherSnapPageRecord.PlayablePagesRecord;
import com.snap.core.db.record.PublisherSnapPageRecord.PrefetchSnapRecord;
import com.snap.core.db.record.PublisherSnapPageRecord.SnapTileInfoRecord;
import com.snap.core.db.record.PublisherSnapPageRecord.StoryInfoRecord;
import java.util.List;

/* renamed from: gyr */
public final class gyr {
    public final DbClient a;
    public final ihh b;
    private final ajxe c = ajxh.a(new h(this));
    private final ajxe d = ajxh.a(new i(this));
    private final ajxe e = ajxh.a(new a(this));
    private final ajxe f = ajxh.a(new j(this));
    private final ajxe g = ajxh.a(new k(this));

    /* renamed from: gyr$h */
    static final class h extends akcs implements akbk<InsertPublisherSnapPage> {
        private /* synthetic */ gyr a;

        h(gyr gyr) {
            this.a = gyr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertPublisherSnapPage(this.a.d(), PublisherSnapPageRecord.FACTORY);
        }
    }

    /* renamed from: gyr$i */
    static final class i extends akcs implements akbk<UpdatePublisherSnapPage> {
        private /* synthetic */ gyr a;

        i(gyr gyr) {
            this.a = gyr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdatePublisherSnapPage(this.a.d(), PublisherSnapPageRecord.FACTORY);
        }
    }

    /* renamed from: gyr$a */
    static final class a extends akcs implements akbk<ClearAll> {
        private /* synthetic */ gyr a;

        a(gyr gyr) {
            this.a = gyr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ClearAll(this.a.d(), PublisherSnapPageRecord.FACTORY);
        }
    }

    /* renamed from: gyr$j */
    static final class j extends akcs implements akbk<UpdateRichMediaInfo> {
        private /* synthetic */ gyr a;

        j(gyr gyr) {
            this.a = gyr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateRichMediaInfo(this.a.d(), PublisherSnapPageRecord.FACTORY);
        }
    }

    /* renamed from: gyr$k */
    static final class k extends akcs implements akbk<pa> {
        private /* synthetic */ gyr a;

        k(gyr gyr) {
            this.a = gyr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.getWritableDatabase();
        }
    }

    /* renamed from: gyr$b */
    public static final class b extends akcs implements akbl<Cursor, PageMediaInfoRecord> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            return (PageMediaInfoRecord) PublisherSnapPageRecord.PAGE_MEDIA_INFO_RECORD_ROW_MAPPER.map(cursor);
        }
    }

    /* renamed from: gyr$c */
    static final class c extends akcs implements akbl<Cursor, PlayablePagesRecord> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            return (PlayablePagesRecord) PublisherSnapPageRecord.PAGES_RECORD_ROW_MAPPER.map(cursor);
        }
    }

    /* renamed from: gyr$d */
    public static final class d extends akcs implements akbl<Cursor, PrefetchSnapRecord> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            return (PrefetchSnapRecord) PublisherSnapPageRecord.PREFETCH_SNAP_RECORD_ROW_MAPPER.map(cursor);
        }
    }

    /* renamed from: gyr$g */
    public static final class g extends akcs implements akbl<Cursor, StoryInfoRecord> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            return (StoryInfoRecord) PublisherSnapPageRecord.STORY_INFO_RECORD_ROW_MAPPER.map(cursor);
        }
    }

    /* renamed from: gyr$e */
    public static final class e extends akcq implements akbl<Cursor, PublisherSnapPageRecord> {
        public e(Mapper mapper) {
            super(1, mapper);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(Mapper.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Lcom/snap/core/db/record/PublisherSnapPageModel;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (PublisherSnapPageRecord) ((Mapper) this.receiver).map(cursor);
        }
    }

    /* renamed from: gyr$f */
    public static final class f extends akcq implements akbl<Cursor, PublisherSnapPageRecord> {
        public f(Mapper mapper) {
            super(1, mapper);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(Mapper.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Lcom/snap/core/db/record/PublisherSnapPageModel;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (PublisherSnapPageRecord) ((Mapper) this.receiver).map(cursor);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gyr.class), "pageInsert", "getPageInsert()Lcom/snap/core/db/record/PublisherSnapPageModel$InsertPublisherSnapPage;"), new akdc(akde.a(gyr.class), "pageUpdate", "getPageUpdate()Lcom/snap/core/db/record/PublisherSnapPageModel$UpdatePublisherSnapPage;"), new akdc(akde.a(gyr.class), "clearAll", "getClearAll()Lcom/snap/core/db/record/PublisherSnapPageModel$ClearAll;"), new akdc(akde.a(gyr.class), "updateRichMediaInfo", "getUpdateRichMediaInfo()Lcom/snap/core/db/record/PublisherSnapPageModel$UpdateRichMediaInfo;"), new akdc(akde.a(gyr.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;")};
    }

    public gyr(DbClient dbClient, ihh ihh) {
        akcr.b(dbClient, "dbClient");
        akcr.b(ihh, "clock");
        this.a = dbClient;
        this.b = ihh;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x003b in {6, 7, 8, 10, 11, 15, 17} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static com.snap.core.db.column.PublisherPageSnapType[] a(boolean r7) {
        /*
        r0 = com.snap.core.db.column.PublisherPageSnapType.values();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r2 = r0.length;
        r3 = 0;
        r4 = 0;
        if (r4 >= r2) goto L_0x0024;
        r5 = r0[r4];
        if (r7 == 0) goto L_0x001b;
        r6 = com.snap.core.db.column.PublisherPageSnapType.REGULAR;
        if (r5 != r6) goto L_0x0019;
        goto L_0x001b;
        r6 = 0;
        goto L_0x001c;
        r6 = 1;
        if (r6 == 0) goto L_0x0021;
        r1.add(r5);
        r4 = r4 + 1;
        goto L_0x000e;
        r1 = (java.util.List) r1;
        r1 = (java.util.Collection) r1;
        r7 = new com.snap.core.db.column.PublisherPageSnapType[r3];
        r7 = r1.toArray(r7);
        if (r7 == 0) goto L_0x0033;
        r7 = (com.snap.core.db.column.PublisherPageSnapType[]) r7;
        return r7;
        r7 = new ajxt;
        r0 = "null cannot be cast to non-null type kotlin.Array<T>";
        r7.<init>(r0);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyr.a(boolean):com.snap.core.db.column.PublisherPageSnapType[]");
    }

    public final ajdp<List<PlayablePagesRecord>> a(long j, FeatureType featureType) {
        akcr.b(featureType, "featureType");
        Object playablePages = PublisherSnapPageRecord.FACTORY.playablePages(j, featureType);
        akcr.a(playablePages, "PublisherSnapPageRecord.…(storyRowId, featureType)");
        return this.a.queryAndMapToList(playablePages, c.a);
    }

    public final InsertPublisherSnapPage a() {
        return (InsertPublisherSnapPage) this.c.b();
    }

    public final UpdatePublisherSnapPage b() {
        return (UpdatePublisherSnapPage) this.d.b();
    }

    public final List<SnapTileInfoRecord> b(long j, FeatureType featureType) {
        akcr.b(featureType, "featureType");
        Object snapTileInfo = PublisherSnapPageRecord.FACTORY.snapTileInfo(j, featureType);
        akcr.a(snapTileInfo, "PublisherSnapPageRecord.…(storyRowId, featureType)");
        DbClient dbClient = this.a;
        Object obj = PublisherSnapPageRecord.SNAP_TILE_INFO_RECORD_ROW_MAPPER;
        akcr.a(obj, "PublisherSnapPageRecord.…LE_INFO_RECORD_ROW_MAPPER");
        return dbClient.query(snapTileInfo, obj);
    }

    public final ClearAll c() {
        return (ClearAll) this.e.b();
    }

    public final pa d() {
        return (pa) this.g.b();
    }
}
