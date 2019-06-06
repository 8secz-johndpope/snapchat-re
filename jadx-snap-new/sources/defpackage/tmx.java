package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.PlaybackSnapType;
import com.snap.core.db.record.PlaybackSnapViewModel.DeletePlaybackViewState;
import com.snap.core.db.record.PlaybackSnapViewModel.Factory;
import com.snap.core.db.record.PlaybackSnapViewModel.InsertPlaybackSnapView;
import com.snap.core.db.record.PlaybackSnapViewModel.SelectAllFromPlaybakcSnapViewModel;
import com.snap.core.db.record.PlaybackSnapViewRecord;
import java.io.Closeable;
import java.util.List;
import java.util.Set;

/* renamed from: tmx */
public final class tmx implements tmu {
    final ajxe a = ajxh.a(new e(this));
    private final ajxe b;
    private final ajxe c = ajxh.a(new c(this));

    /* renamed from: tmx$b */
    static final class b extends akcs implements akbk<DbClient> {
        private /* synthetic */ SnapDb a;

        b(SnapDb snapDb) {
            this.a = snapDb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.getDbClient((ide) tmw.a);
        }
    }

    /* renamed from: tmx$e */
    static final class e extends akcs implements akbk<pa> {
        private /* synthetic */ tmx a;

        e(tmx tmx) {
            this.a = tmx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a().getWritableDatabase();
        }
    }

    /* renamed from: tmx$c */
    static final class c extends akcs implements akbk<InsertPlaybackSnapView> {
        private /* synthetic */ tmx a;

        c(tmx tmx) {
            this.a = tmx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertPlaybackSnapView(this.a.a().getWritableDatabase(), PlaybackSnapViewRecord.FACTORY);
        }
    }

    /* renamed from: tmx$a */
    static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ tmx a;
        private /* synthetic */ long b;

        a(tmx tmx, long j) {
            this.a = tmx;
            this.b = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            DeletePlaybackViewState deletePlaybackViewState = new DeletePlaybackViewState((pa) this.a.a.b());
            deletePlaybackViewState.bind(this.b);
            Object a = this.a.a();
            akcr.a(a, "dbClient");
            BriteDatabaseExtensionsKt.executeDelete(a, deletePlaybackViewState, dbTransaction);
            return ajxw.a;
        }
    }

    /* renamed from: tmx$d */
    static final class d extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ tmx a;
        private /* synthetic */ PlaybackSnapType b;
        private /* synthetic */ String c;
        private /* synthetic */ long d;
        private /* synthetic */ String e;
        private /* synthetic */ Long f;
        private /* synthetic */ long g;
        private /* synthetic */ Long h;
        private /* synthetic */ Long i;
        private /* synthetic */ Long j;

        d(tmx tmx, PlaybackSnapType playbackSnapType, String str, long j, String str2, Long l, long j2, Long l2, Long l3, Long l4) {
            this.a = tmx;
            this.b = playbackSnapType;
            this.c = str;
            this.d = j;
            this.e = str2;
            this.f = l;
            this.g = j2;
            this.h = l2;
            this.i = l3;
            this.j = l4;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            InsertPlaybackSnapView a = ((InsertPlaybackSnapView) this.a.c.b());
            PlaybackSnapType playbackSnapType = this.b;
            String str = this.c;
            long j = this.d;
            String str2 = this.e;
            Long l = this.f;
            long j2 = this.g;
            Long l2 = this.h;
            Long l3 = this.i;
            Long l4 = this.j;
            a.bind(playbackSnapType, str, j, str2, l, j2, l2, l3, l4 != null ? l4.longValue() : 0);
            this.a.a().executeInsert(((InsertPlaybackSnapView) this.a.c.b()), dbTransaction);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tmx.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(tmx.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(tmx.class), "insertSnapView", "getInsertSnapView()Lcom/snap/core/db/record/PlaybackSnapViewModel$InsertPlaybackSnapView;")};
    }

    public tmx(SnapDb snapDb) {
        akcr.b(snapDb, "snapDb");
        this.b = ajxh.a(new b(snapDb));
    }

    /* JADX WARNING: Missing block: B:14:?, code skipped:
            defpackage.akax.a(r3, r0);
     */
    public final int a(java.lang.String r3) {
        /*
        r2 = this;
        r0 = "storyId";
        defpackage.akcr.b(r3, r0);
        r0 = com.snap.core.db.record.PlaybackSnapViewRecord.FACTORY;	 Catch:{ all -> 0x002e }
        r3 = r0.selectRecentViewsForStory(r3);	 Catch:{ all -> 0x002e }
        r0 = "PlaybackSnapViewRecord.F…entViewsForStory(storyId)";
        defpackage.akcr.a(r3, r0);	 Catch:{ all -> 0x002e }
        r0 = r2.a();	 Catch:{ all -> 0x002e }
        r3 = r0.query(r3);	 Catch:{ all -> 0x002e }
        r3 = (java.io.Closeable) r3;	 Catch:{ all -> 0x002e }
        r0 = 0;
        r1 = r3;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0028 }
        r1 = r1.getCount();	 Catch:{ Throwable -> 0x0028 }
        defpackage.akax.a(r3, r0);	 Catch:{ all -> 0x002e }
        return r1;
    L_0x0026:
        r1 = move-exception;
        goto L_0x002a;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0026 }
    L_0x002a:
        defpackage.akax.a(r3, r0);	 Catch:{ all -> 0x002e }
        throw r1;	 Catch:{ all -> 0x002e }
    L_0x002e:
        r3 = move-exception;
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmx.a(java.lang.String):int");
    }

    public final ajcx a(long j) {
        return a().runInTransaction("PlayStateRepositoryImpl:cleanupViewState", new a(this, j));
    }

    public final ajcx a(PlaybackSnapType playbackSnapType, String str, long j, String str2, Long l, long j2, Long l2, Long l3, Long l4) {
        PlaybackSnapType playbackSnapType2 = playbackSnapType;
        akcr.b(playbackSnapType2, "type");
        String str3 = str;
        akcr.b(str3, "snapId");
        return a().runInTransaction("PlayStateRepository:insertSnapView", new d(this, playbackSnapType2, str3, j, str2, l, j2, l2, l3, l4));
    }

    /* Access modifiers changed, original: final */
    public final DbClient a() {
        return (DbClient) this.b.b();
    }

    public final boolean a(Set<String> set) {
        akcr.b(set, "snapIds");
        Factory factory = PlaybackSnapViewRecord.FACTORY;
        boolean z = false;
        Object[] toArray = set.toArray(new String[0]);
        if (toArray != null) {
            ainx selectViewed = factory.selectViewed((String[]) toArray);
            akcr.a((Object) selectViewed, "PlaybackSnapViewRecord.F…d(snapIds.toTypedArray())");
            Closeable query = a().query(selectViewed);
            try {
                if (((Cursor) query).getCount() >= set.size()) {
                    z = true;
                }
                akax.a(query, null);
                return z;
            } catch (Throwable th) {
                akax.a(query, th);
            }
        } else {
            throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public final String b(String str) {
        akcr.b(str, "storyId");
        Object selectRecentViewsForStory = PlaybackSnapViewRecord.FACTORY.selectRecentViewsForStory(str);
        akcr.a(selectRecentViewsForStory, "PlaybackSnapViewRecord.F…entViewsForStory(storyId)");
        DbClient a = a();
        Object selectRecentViewsForStoryMapper = PlaybackSnapViewRecord.FACTORY.selectRecentViewsForStoryMapper();
        akcr.a(selectRecentViewsForStoryMapper, "PlaybackSnapViewRecord.F…centViewsForStoryMapper()");
        return (String) a.queryFirst(selectRecentViewsForStory, selectRecentViewsForStoryMapper);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0060 in {7, 9, 11, 13} preds:[]
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
    public final java.util.List<java.lang.String> b(java.util.Set<java.lang.String> r4) {
        /*
        r3 = this;
        r0 = "snapIds";
        defpackage.akcr.b(r4, r0);
        r0 = com.snap.core.db.record.PlaybackSnapViewRecord.FACTORY;	 Catch:{ all -> 0x005e }
        r4 = (java.util.Collection) r4;	 Catch:{ all -> 0x005e }
        r1 = 0;	 Catch:{ all -> 0x005e }
        r1 = new java.lang.String[r1];	 Catch:{ all -> 0x005e }
        r4 = r4.toArray(r1);	 Catch:{ all -> 0x005e }
        if (r4 == 0) goto L_0x0056;	 Catch:{ all -> 0x005e }
        r4 = (java.lang.String[]) r4;	 Catch:{ all -> 0x005e }
        r4 = r0.selectViewed(r4);	 Catch:{ all -> 0x005e }
        r0 = "PlaybackSnapViewRecord.F…d(snapIds.toTypedArray())";	 Catch:{ all -> 0x005e }
        defpackage.akcr.a(r4, r0);	 Catch:{ all -> 0x005e }
        r0 = r3.a();	 Catch:{ all -> 0x005e }
        r1 = com.snap.core.db.record.PlaybackSnapViewRecord.SELECT_VIEWED_MAPPER;	 Catch:{ all -> 0x005e }
        r2 = "PlaybackSnapViewRecord.SELECT_VIEWED_MAPPER";	 Catch:{ all -> 0x005e }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x005e }
        r4 = r0.query(r4, r1);	 Catch:{ all -> 0x005e }
        r4 = (java.lang.Iterable) r4;	 Catch:{ all -> 0x005e }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x005e }
        r1 = 10;	 Catch:{ all -> 0x005e }
        r1 = defpackage.ajyn.a(r4, r1);	 Catch:{ all -> 0x005e }
        r0.<init>(r1);	 Catch:{ all -> 0x005e }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x005e }
        r4 = r4.iterator();	 Catch:{ all -> 0x005e }
        r1 = r4.hasNext();	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0053;	 Catch:{ all -> 0x005e }
        r1 = r4.next();	 Catch:{ all -> 0x005e }
        r1 = (com.snap.core.db.record.PlaybackSnapViewModel.SelectViewedModel) r1;	 Catch:{ all -> 0x005e }
        r1 = r1.snapId();	 Catch:{ all -> 0x005e }
        r0.add(r1);	 Catch:{ all -> 0x005e }
        goto L_0x003f;	 Catch:{ all -> 0x005e }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x005e }
        return r0;	 Catch:{ all -> 0x005e }
        r4 = new ajxt;	 Catch:{ all -> 0x005e }
        r0 = "null cannot be cast to non-null type kotlin.Array<T>";	 Catch:{ all -> 0x005e }
        r4.<init>(r0);	 Catch:{ all -> 0x005e }
        throw r4;	 Catch:{ all -> 0x005e }
        r4 = move-exception;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmx.b(java.util.Set):java.util.List");
    }

    public final List<SelectAllFromPlaybakcSnapViewModel> c(Set<String> set) {
        akcr.b(set, "snapIds");
        Factory factory = PlaybackSnapViewRecord.FACTORY;
        Object[] toArray = set.toArray(new String[0]);
        if (toArray != null) {
            Object selectAllFromPlaybakcSnapView = factory.selectAllFromPlaybakcSnapView((String[]) toArray);
            akcr.a(selectAllFromPlaybakcSnapView, "PlaybackSnapViewRecord.F…w(snapIds.toTypedArray())");
            DbClient a = a();
            Object obj = PlaybackSnapViewRecord.SELECT_ALL_MAPPER;
            akcr.a(obj, "PlaybackSnapViewRecord.SELECT_ALL_MAPPER");
            return a.query(selectAllFromPlaybakcSnapView, obj);
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
