package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.LegacyStorySnapQueries;
import com.snap.core.db.record.SnapModel.InsertSnapMetadata;
import com.snap.core.db.record.SnapRecord;
import com.snap.core.db.record.StorySnapModel.Factory;
import com.snap.core.db.record.StorySnapModel.GetPendingStorySnapRowIdsModel;
import com.snap.core.db.record.StorySnapModel.InsertRow;
import com.snap.core.db.record.StorySnapModel.SelectSnapDataForDeletionModel;
import com.snap.core.db.record.StorySnapModel.UpdateRowByRowId;
import com.snap.core.db.record.StorySnapModel.UpdateSnapRowId;
import com.snap.core.db.record.StorySnapModel.UpdateStatusByRowId;
import com.snap.core.db.record.StorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.BrandFriendliness;
import com.snap.core.db.record.StorySnapRecord.RowIdAndViewedRecord;
import com.snap.core.db.record.StorySnapRecord.SelectFriendStorySnapsForPlayingRecord;
import com.snap.core.db.record.StorySnapRecord.SelectLocallyPersistedPostedFieldsRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStoryManagementChromeDataRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapForThumbnailByStoryRowIdRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapForThumbnailByUsernameRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapsForPlayingRecord;
import com.snap.core.db.record.StorySnapRecord.StoryManagementPlayableStorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.StoryManagementStoryMetadataRecord;
import com.snap.core.db.record.StorySnapRecord.StoryManagementStorySnapRecord;
import defpackage.ihx.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import org.opencv.imgproc.Imgproc;

/* renamed from: ylq */
public final class ylq {
    public final DbClient a;
    public final ihx<UpdateStatusByRowId> b = new ihx(new ab(this));
    private final ihx<InsertRow> c = new ihx(new z(this));
    private final ihx<InsertSnapMetadata> d = new ihx(new y(this));
    private final ihx<UpdateRowByRowId> e = new ihx(new aa(this));
    private final ajxe f;
    private final ihh g;
    private final iha h;
    private final gqr i;

    /* renamed from: ylq$p */
    public static final class p extends akcs implements akbl<Cursor, SelectStorySnapForThumbnailByUsernameRecord> {
        public static final p a = new p();

        p() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return (SelectStorySnapForThumbnailByUsernameRecord) LegacyStorySnapQueries.SELECT_THUMBNAIL_STORY_SNAP_BY_USERNAME_MODEL.map(cursor);
        }
    }

    /* renamed from: ylq$x */
    static final class x extends akcq implements akbk<abss> {
        x(ajwy ajwy) {
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
            return (abss) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ylq$z */
    static final class z<T> implements a<T> {
        private /* synthetic */ ylq a;

        z(ylq ylq) {
            this.a = ylq;
        }

        public final /* synthetic */ Object initialize() {
            return new InsertRow(this.a.a(), StorySnapRecord.FACTORY);
        }
    }

    /* renamed from: ylq$y */
    static final class y<T> implements a<T> {
        private /* synthetic */ ylq a;

        y(ylq ylq) {
            this.a = ylq;
        }

        public final /* synthetic */ Object initialize() {
            return new InsertSnapMetadata(this.a.a(), SnapRecord.FACTORY);
        }
    }

    /* renamed from: ylq$aa */
    static final class aa<T> implements a<T> {
        private /* synthetic */ ylq a;

        aa(ylq ylq) {
            this.a = ylq;
        }

        public final /* synthetic */ Object initialize() {
            return new UpdateRowByRowId(this.a.a(), StorySnapRecord.FACTORY);
        }
    }

    /* renamed from: ylq$ab */
    static final class ab<T> implements a<T> {
        private /* synthetic */ ylq a;

        ab(ylq ylq) {
            this.a = ylq;
        }

        public final /* synthetic */ Object initialize() {
            return new UpdateStatusByRowId(this.a.a(), StorySnapRecord.FACTORY);
        }
    }

    /* renamed from: ylq$q */
    public static final class q<T, R> implements ajfc<T, R> {
        public static final q a = new q();

        q() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "result");
            return list.isEmpty() ? Optional.absent() : Optional.of(list.get(0));
        }
    }

    /* renamed from: ylq$w */
    public static final class w extends akcs implements akbl<Cursor, SelectStorySnapsForPlayingRecord> {
        public static final w a = new w();

        w() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return (SelectStorySnapsForPlayingRecord) LegacyStorySnapQueries.SELECT_PLAYABLE_STORY_SNAPS_MAPPER.map(cursor);
        }
    }

    /* renamed from: ylq$a */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* renamed from: ylq$u */
    public static final class u<V> implements Callable<T> {
        final /* synthetic */ ylq a;
        private /* synthetic */ List b;

        /* renamed from: ylq$u$1 */
        static final class 1 extends akcs implements akbl<List<? extends String>, List<? extends BrandFriendliness>> {
            private /* synthetic */ u a;

            1(u uVar) {
                this.a = uVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                Factory factory = StorySnapRecord.FACTORY;
                Object[] toArray = list.toArray(new String[0]);
                if (toArray != null) {
                    obj = factory.getBrandFriendlinessByStoryIds((String[]) toArray);
                    akcr.a(obj, "StorySnapRecord.FACTORY.…oryIds(it.toTypedArray())");
                    Object obj2 = this.a.a.a;
                    akcr.a(obj2, "db");
                    Object obj3 = LegacyStorySnapQueries.BRAND_FRIENDLINESS_ROW_MAPPER;
                    akcr.a(obj3, "LegacyStorySnapQueries.B…D_FRIENDLINESS_ROW_MAPPER");
                    return BriteDatabaseExtensionsKt.queryList(obj2, obj, obj3);
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }

        public u(ylq ylq, List list) {
            this.a = ylq;
            this.b = list;
        }

        public final /* synthetic */ Object call() {
            return ymf.a(this.b, new 1(this));
        }
    }

    /* renamed from: ylq$f */
    public static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ ylq a;

        /* renamed from: ylq$f$a */
        static final class a extends akcs implements akbl<SelectFriendStorySnapsForPlayingRecord, Long> {
            public static final a a = new a();

            a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                SelectFriendStorySnapsForPlayingRecord selectFriendStorySnapsForPlayingRecord = (SelectFriendStorySnapsForPlayingRecord) obj;
                akcr.b(selectFriendStorySnapsForPlayingRecord, "it");
                return Long.valueOf(selectFriendStorySnapsForPlayingRecord.timestamp());
            }
        }

        /* renamed from: ylq$f$b */
        static final class b extends akcs implements akbl<SelectFriendStorySnapsForPlayingRecord, Comparable<?>> {
            public static final b a = new b();

            b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                SelectFriendStorySnapsForPlayingRecord selectFriendStorySnapsForPlayingRecord = (SelectFriendStorySnapsForPlayingRecord) obj;
                akcr.b(selectFriendStorySnapsForPlayingRecord, "it");
                return Integer.valueOf(akcr.a(selectFriendStorySnapsForPlayingRecord.viewed(), Boolean.FALSE) ? 0 : 1);
            }
        }

        /* renamed from: ylq$f$c */
        static final class c extends akcs implements akbl<SelectFriendStorySnapsForPlayingRecord, Integer> {
            private /* synthetic */ f a;

            c(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                SelectFriendStorySnapsForPlayingRecord selectFriendStorySnapsForPlayingRecord = (SelectFriendStorySnapsForPlayingRecord) obj;
                akcr.b(selectFriendStorySnapsForPlayingRecord, "it");
                int i = ylr.a[selectFriendStorySnapsForPlayingRecord.kind().ordinal()];
                int i2 = 2;
                if (i == 1) {
                    i2 = 0;
                } else if (i == 2) {
                    i2 = 1;
                }
                return Integer.valueOf(i2);
            }
        }

        public f(ylq ylq) {
            this.a = ylq;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object key;
            List list = (List) obj;
            String str = "it";
            akcr.b(list, str);
            Iterable iterable = list;
            Map linkedHashMap = new LinkedHashMap();
            for (Object next : iterable) {
                String mediaKey = ((SelectFriendStorySnapsForPlayingRecord) next).mediaKey();
                ArrayList arrayList = linkedHashMap.get(mediaKey);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(mediaKey, arrayList);
                }
                arrayList.add(next);
            }
            Map linkedHashMap2 = new LinkedHashMap(ajzm.a(linkedHashMap.size()));
            for (Entry entry : linkedHashMap.entrySet()) {
                key = entry.getKey();
                Iterable<SelectFriendStorySnapsForPlayingRecord> iterable2 = (Iterable) entry.getValue();
                Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable2, 10));
                for (SelectFriendStorySnapsForPlayingRecord _id : iterable2) {
                    arrayList2.add(Long.valueOf(_id._id()));
                }
                linkedHashMap2.put(key, (List) arrayList2);
            }
            iterable = ajyu.a(iterable, ajzy.a(a.a, b.a, new c(this)));
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object key2 : iterable) {
                if (hashSet.add(((SelectFriendStorySnapsForPlayingRecord) key2).mediaKey())) {
                    arrayList3.add(key2);
                }
            }
            List<Object> list2 = arrayList3;
            for (Object obj2 : list2) {
                akcr.a(obj2, str);
                List list3 = (List) linkedHashMap2.get(obj2.mediaKey());
                obj2.setAssociatedStorySnapRowIds(list3 != null ? ajyu.c((Iterable) list3, (Object) Long.valueOf(obj2._id())) : null);
            }
            return list2;
        }
    }

    /* renamed from: ylq$m */
    static final class m<T, R> implements ajfc<T, R> {
        private /* synthetic */ boolean a;

        /* renamed from: ylq$m$a */
        public static final class a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return ajzy.a(Long.valueOf(((StoryManagementStorySnapRecord) t).timestamp()), Long.valueOf(((StoryManagementStorySnapRecord) t2).timestamp()));
            }
        }

        /* renamed from: ylq$m$b */
        public static final class b<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return ajzy.a(Long.valueOf(-((StoryManagementStorySnapRecord) t).timestamp()), Long.valueOf(-((StoryManagementStorySnapRecord) t2).timestamp()));
            }
        }

        m(boolean z) {
            this.a = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Iterable iterable;
            a aVar;
            List list = (List) obj;
            akcr.b(list, "it");
            if (this.a) {
                iterable = list;
                aVar = new a();
            } else {
                iterable = list;
                aVar = new b();
            }
            return ajyu.a(iterable, (Comparator) aVar);
        }
    }

    /* renamed from: ylq$s */
    public static final class s<T, R> implements ajfc<T, R> {
        public static final s a = new s();

        s() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "result");
            return list.isEmpty() ? Optional.absent() : Optional.of(list.get(0));
        }
    }

    /* renamed from: ylq$v */
    public static final class v<T, R> implements ajfc<T, R> {
        public static final v a = new v();

        v() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List<BrandFriendliness> list = (List) obj;
            akcr.b(list, "stories");
            Map linkedHashMap = new LinkedHashMap();
            for (BrandFriendliness brandFriendliness : list) {
                String storyId = brandFriendliness.storyId();
                ArrayList arrayList = linkedHashMap.get(storyId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(storyId, arrayList);
                }
                arrayList.add(brandFriendliness);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: ylq$b */
    static final class b extends akcs implements akbl<List<? extends Long>, ajxw> {
        private /* synthetic */ ylq a;

        b(ylq ylq) {
            this.a = ylq;
            super(1);
        }

        /* JADX WARNING: Missing block: B:9:0x0033, code skipped:
            defpackage.akax.a(r3, r0);
     */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
            /*
            r2 = this;
            r3 = (java.util.List) r3;
            r0 = "it";
            defpackage.akcr.b(r3, r0);
            r0 = r2.a;
            r0 = r0.a;
            r1 = com.snap.core.db.record.StorySnapRecord.FACTORY;
            r3 = (java.util.Collection) r3;
            r3 = defpackage.ajyu.g(r3);
            r3 = r1.deleteStorySnapByRowIds(r3);
            r1 = "StorySnapRecord.FACTORY.…yRowIds(it.toLongArray())";
            defpackage.akcr.a(r3, r1);
            r3 = r0.query(r3);
            r3 = (java.io.Closeable) r3;
            r0 = 0;
            r1 = r3;
            r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0031 }
            r1.getCount();	 Catch:{ Throwable -> 0x0031 }
            defpackage.akax.a(r3, r0);
            r3 = defpackage.ajxw.a;
            return r3;
        L_0x002f:
            r1 = move-exception;
            goto L_0x0033;
        L_0x0031:
            r0 = move-exception;
            throw r0;	 Catch:{ all -> 0x002f }
        L_0x0033:
            defpackage.akax.a(r3, r0);
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ylq$b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ylq$c */
    static final class c extends akcs implements akbl<List<? extends Long>, ajxw> {
        private /* synthetic */ ylq a;

        c(ylq ylq) {
            this.a = ylq;
            super(1);
        }

        /* JADX WARNING: Missing block: B:9:0x0033, code skipped:
            defpackage.akax.a(r3, r0);
     */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
            /*
            r2 = this;
            r3 = (java.util.List) r3;
            r0 = "it";
            defpackage.akcr.b(r3, r0);
            r0 = com.snap.core.db.record.SnapRecord.FACTORY;
            r3 = (java.util.Collection) r3;
            r3 = defpackage.ajyu.g(r3);
            r3 = r0.deleteSnapsByRowIds(r3);
            r0 = "SnapRecord.FACTORY.delet…yRowIds(it.toLongArray())";
            defpackage.akcr.a(r3, r0);
            r0 = r2.a;
            r0 = r0.a;
            r3 = r0.query(r3);
            r3 = (java.io.Closeable) r3;
            r0 = 0;
            r1 = r3;
            r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0031 }
            r1.getCount();	 Catch:{ Throwable -> 0x0031 }
            defpackage.akax.a(r3, r0);
            r3 = defpackage.ajxw.a;
            return r3;
        L_0x002f:
            r1 = move-exception;
            goto L_0x0033;
        L_0x0031:
            r0 = move-exception;
            throw r0;	 Catch:{ all -> 0x002f }
        L_0x0033:
            defpackage.akax.a(r3, r0);
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ylq$c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ylq$d */
    public static final class d extends akcs implements akbl<List<? extends Long>, ajxw> {
        private /* synthetic */ ylq a;

        public d(ylq ylq) {
            this.a = ylq;
            super(1);
        }

        /* JADX WARNING: Missing block: B:9:0x0033, code skipped:
            defpackage.akax.a(r3, r0);
     */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
            /*
            r2 = this;
            r3 = (java.util.List) r3;
            r0 = "it";
            defpackage.akcr.b(r3, r0);
            r0 = com.snap.core.db.record.StorySnapRecord.FACTORY;
            r3 = (java.util.Collection) r3;
            r3 = defpackage.ajyu.g(r3);
            r3 = r0.deleteStorySnapByRowIds(r3);
            r0 = "StorySnapRecord.FACTORY.…yRowIds(it.toLongArray())";
            defpackage.akcr.a(r3, r0);
            r0 = r2.a;
            r0 = r0.a;
            r3 = r0.query(r3);
            r3 = (java.io.Closeable) r3;
            r0 = 0;
            r1 = r3;
            r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0031 }
            r1.getCount();	 Catch:{ Throwable -> 0x0031 }
            defpackage.akax.a(r3, r0);
            r3 = defpackage.ajxw.a;
            return r3;
        L_0x002f:
            r1 = move-exception;
            goto L_0x0033;
        L_0x0031:
            r0 = move-exception;
            throw r0;	 Catch:{ all -> 0x002f }
        L_0x0033:
            defpackage.akax.a(r3, r0);
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ylq$d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ylq$e */
    public static final class e extends akcs implements akbl<Cursor, SelectFriendStorySnapsForPlayingRecord> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return (SelectFriendStorySnapsForPlayingRecord) LegacyStorySnapQueries.SELECT_FRIEND_PLAYABLE_STORY_SNAPS_MAPPER.map(cursor);
        }
    }

    /* renamed from: ylq$g */
    static final class g extends akcs implements akbl<List<? extends Long>, List<? extends SelectLocallyPersistedPostedFieldsRecord>> {
        private /* synthetic */ ylq a;

        g(ylq ylq) {
            this.a = ylq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            obj = StorySnapRecord.FACTORY.selectLocallyPersistedPostedFields(ajyu.g((Collection) list));
            akcr.a(obj, "StorySnapRecord.FACTORY.…dFields(it.toLongArray())");
            Object obj2 = this.a.a;
            akcr.a(obj2, "db");
            Object obj3 = LegacyStorySnapQueries.SELECT_LOCALLY_PERSISTED_POSTED_FIELDS_MAPPER;
            akcr.a(obj3, "LegacyStorySnapQueries.S…STED_POSTED_FIELDS_MAPPER");
            return BriteDatabaseExtensionsKt.queryList(obj2, obj, obj3);
        }
    }

    /* renamed from: ylq$h */
    static final class h extends akcs implements akbl<List<? extends Long>, List<? extends Long>> {
        private /* synthetic */ ylq a;

        h(ylq ylq) {
            this.a = ylq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            obj = StorySnapRecord.FACTORY.getUnorphanedSnapRowIds(ajyu.g((Collection) list));
            akcr.a(obj, "StorySnapRecord.FACTORY.…pRowIds(it.toLongArray())");
            Object obj2 = this.a.a;
            akcr.a(obj2, "db");
            Object obj3 = StorySnapRecord.FACTORY;
            akcr.a(obj3, "StorySnapRecord.FACTORY");
            obj3 = obj3.getUnorphanedSnapRowIdsMapper();
            akcr.a(obj3, "StorySnapRecord.FACTORY.unorphanedSnapRowIdsMapper");
            return BriteDatabaseExtensionsKt.queryList(obj2, obj, obj3);
        }
    }

    /* renamed from: ylq$i */
    public static final class i extends akcs implements akbl<List<? extends Long>, List<? extends SelectSnapDataForDeletionModel>> {
        private /* synthetic */ ylq a;

        public i(ylq ylq) {
            this.a = ylq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            obj = StorySnapRecord.FACTORY.selectSnapDataForDeletion(ajyu.g((Collection) list));
            akcr.a(obj, "StorySnapRecord.FACTORY.…eletion(it.toLongArray())");
            DbClient dbClient = this.a.a;
            Object obj2 = LegacyStorySnapQueries.SELECT_SNAP_DATA_FOR_DELETION_MODEL_ROW_MAPPER;
            akcr.a(obj2, "LegacyStorySnapQueries.S…DELETION_MODEL_ROW_MAPPER");
            return dbClient.query(obj, obj2);
        }
    }

    /* renamed from: ylq$j */
    public static final class j extends akcs implements akbl<Cursor, SelectStoryManagementChromeDataRecord> {
        public static final j a = new j();

        j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return (SelectStoryManagementChromeDataRecord) LegacyStorySnapQueries.SELECT_STORY_MANAGEMENT_CHROME_DATA_RECORD_ROW_MAPPER.map(cursor);
        }
    }

    /* renamed from: ylq$k */
    public static final class k extends akcs implements akbl<Cursor, StoryManagementStoryMetadataRecord> {
        public static final k a = new k();

        k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return (StoryManagementStoryMetadataRecord) LegacyStorySnapQueries.GET_STORY_MANAGEMENT_STORY_METADATA_MAPPER.map(cursor);
        }
    }

    /* renamed from: ylq$l */
    static final class l extends akcs implements akbl<Cursor, StoryManagementStorySnapRecord> {
        public static final l a = new l();

        l() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return (StoryManagementStorySnapRecord) LegacyStorySnapQueries.GET_STORY_MANAGEMENT_STORY_SNAP_MAPPER.map(cursor);
        }
    }

    /* renamed from: ylq$n */
    public static final class n extends akcs implements akbl<Cursor, StoryManagementPlayableStorySnapRecord> {
        public static final n a = new n();

        n() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return (StoryManagementPlayableStorySnapRecord) LegacyStorySnapQueries.SELECT_PLAYABLE_STORY_MANAGEMENT_STORY_SNAP_MAPPER.map(cursor);
        }
    }

    /* renamed from: ylq$o */
    public static final class o extends akcs implements akbl<Cursor, SelectStorySnapsForPlayingRecord> {
        public static final o a = new o();

        o() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return (SelectStorySnapsForPlayingRecord) LegacyStorySnapQueries.SELECT_PLAYABLE_STORY_SNAP_MAPPER.map(cursor);
        }
    }

    /* renamed from: ylq$r */
    public static final class r extends akcs implements akbl<Cursor, SelectStorySnapForThumbnailByStoryRowIdRecord> {
        public static final r a = new r();

        r() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return (SelectStorySnapForThumbnailByStoryRowIdRecord) LegacyStorySnapQueries.SELECT_THUMBNAIL_STORY_SNAP_BY_STORY_ROW_ID_MAPPER.map(cursor);
        }
    }

    /* renamed from: ylq$t */
    static final class t extends akcs implements akbl<List<? extends String>, List<? extends Long>> {
        private /* synthetic */ ylq a;

        t(ylq ylq) {
            this.a = ylq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Factory factory = StorySnapRecord.FACTORY;
            Object[] toArray = list.toArray(new String[0]);
            if (toArray != null) {
                obj = factory.getRowIdsBySnapIds((String[]) toArray);
                akcr.a(obj, "StorySnapRecord.FACTORY.…napIds(it.toTypedArray())");
                DbClient dbClient = this.a.a;
                Object obj2 = StorySnapRecord.FACTORY;
                akcr.a(obj2, "StorySnapRecord.FACTORY");
                obj2 = obj2.getRowIdsBySnapIdsMapper();
                akcr.a(obj2, "StorySnapRecord.FACTORY.rowIdsBySnapIdsMapper");
                return dbClient.query(obj, obj2);
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ylq.class), "releaseManager", "getReleaseManager()Lcom/snapchat/android/framework/release/ReleaseManager;");
    }

    public ylq(SnapDb snapDb, ajwy<abss> ajwy, ihh ihh, iha iha, gqr gqr) {
        akcr.b(snapDb, "snapDb");
        akcr.b(ajwy, "releaseManagerProvider");
        akcr.b(ihh, "clock");
        akcr.b(iha, "serializationHelper");
        akcr.b(gqr, "exceptionTracker");
        this.g = ihh;
        this.h = iha;
        this.i = gqr;
        this.a = snapDb.getDbClient((ide) yhy.j);
        this.f = ajxh.a(new x(ajwy));
    }

    private final long a(DbTransaction dbTransaction, afbi afbi) {
        afbi afbi2 = afbi;
        dbTransaction.checkInTransaction();
        Double d = afbi2.n;
        long j = -1;
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (doubleValue >= 0.0d) {
                j = (long) (doubleValue * 1000.0d);
            }
        }
        long j2 = j;
        InsertSnapMetadata insertSnapMetadata = (InsertSnapMetadata) this.d.get();
        String str = afbi2.a;
        Object obj = afbi2.e;
        akcr.a(obj, "storySnap.timestamp");
        long longValue = obj.longValue();
        String str2 = afbi2.g;
        String str3 = afbi2.j;
        String str4 = afbi2.h;
        gcp a = gcp.a.a(afbi2.m);
        String str5 = afbi2.i;
        Boolean bool = afbi2.r;
        String str6 = ynu.USER_STORY.nameConstant;
        Boolean bool2 = afbi2.J;
        insertSnapMetadata.bind(str, longValue, str2, str3, str4, a, str5, j2, bool, str6, bool2 != null ? bool2.booleanValue() : false, null, null);
        DbClient dbClient = this.a;
        obj = this.d.get();
        akcr.a(obj, "snapMetadataInsert.get()");
        return dbClient.executeInsert((ainy) obj, dbTransaction);
    }

    private final Long a(String str) {
        Object snapRowIdBySnapId = SnapRecord.FACTORY.getSnapRowIdBySnapId(str);
        akcr.a(snapRowIdBySnapId, "SnapRecord.FACTORY.getSnapRowIdBySnapId(snapId)");
        DbClient dbClient = this.a;
        Object obj = SnapRecord.FACTORY;
        akcr.a(obj, "SnapRecord.FACTORY");
        obj = obj.getSnapRowIdBySnapIdMapper();
        akcr.a(obj, "SnapRecord.FACTORY.snapRowIdBySnapIdMapper");
        return (Long) dbClient.queryFirst(snapRowIdBySnapId, obj);
    }

    private static String a(afbi afbi) {
        agai agai = afbi.F;
        if (agai != null) {
            String str = agai.c;
            if (str != null) {
                return str;
            }
        }
        return afbi.b;
    }

    private final String a(Iterable<? extends afcr> iterable) {
        if (iterable == null) {
            return null;
        }
        Builder builder = ImmutableMap.builder();
        for (afcr afcr : iterable) {
            builder.put(afcr.a, afcr.b);
        }
        return this.h.a(builder.build(), abst.a.a);
    }

    private a a(DbTransaction dbTransaction, long j, afbi afbi, boolean z, String str, MessageClientStatus messageClientStatus, afbo afbo, afbo afbo2, String str2, Boolean bool, Long l) {
        a aVar;
        DbTransaction dbTransaction2 = dbTransaction;
        long j2 = j;
        afbi afbi2 = afbi;
        MessageClientStatus messageClientStatus2 = messageClientStatus;
        afbo afbo3 = afbo;
        afbo afbo4 = afbo2;
        akcr.b(dbTransaction2, "tx");
        akcr.b(afbi2, "storySnap");
        akcr.b(messageClientStatus2, "clientStatus");
        dbTransaction.checkInTransaction();
        String str3 = afbi2.a;
        String str4 = afbi2.d;
        if (str4 == null) {
            c();
        }
        RowIdAndViewedRecord a = a(j2, str4);
        Long valueOf = a != null ? Long.valueOf(a._id()) : null;
        String str5 = "getTimeLeft(storySnap)";
        String str6 = "storySnap.needsAuth";
        String str7 = "storySnapId";
        String str8 = " storySnap=";
        String a2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Object obj;
        String str14;
        String str15;
        String str16;
        DbClient dbClient;
        Object obj2;
        DbTransaction dbTransaction3;
        Long a3;
        ylq ylq;
        long longValue;
        StringBuilder stringBuilder;
        if (valueOf != null) {
            Boolean bool2;
            Long valueOf2;
            valueOf.longValue();
            akcr.a(a.viewed(), Boolean.TRUE);
            long longValue2 = valueOf.longValue();
            dbTransaction.checkInTransaction();
            UpdateRowByRowId updateRowByRowId = (UpdateRowByRowId) this.e.get();
            a2 = ylq.a(afbi);
            str9 = afbi2.p;
            String str17 = afbi2.s;
            str10 = afbi2.K;
            str11 = str8;
            str8 = afbi2.l;
            Long l2 = valueOf;
            str12 = afbi2.T;
            Boolean valueOf3 = Boolean.valueOf(z);
            String str18 = str3;
            Boolean bool3 = afbi2.G;
            String str19 = str7;
            Boolean bool4 = afbi2.I;
            str13 = afbi2.N;
            obj = afbi2.y;
            akcr.a(obj, str6);
            boolean booleanValue = obj.booleanValue();
            str14 = afbi2.u;
            str15 = afbi2.k;
            Double d = afbi2.n;
            if (d != null) {
                bool2 = bool4;
                valueOf2 = Long.valueOf((long) d.doubleValue());
            } else {
                bool2 = bool4;
                valueOf2 = Long.valueOf(0);
            }
            Long l3 = valueOf2;
            long a4 = this.g.a();
            String str20 = str14;
            obj = ylq.b(afbi);
            akcr.a(obj, str5);
            Long valueOf4 = Long.valueOf(a4 + obj.longValue());
            agai agai = afbi2.F;
            str16 = agai != null ? agai.b : null;
            str14 = afbi2.H;
            str5 = afbi2.R;
            str6 = afbi2.S;
            String str21 = afbi2.U;
            String str22 = afbi2.Q;
            String str23 = afbi2.V;
            String str24 = afbi2.D;
            String a5 = a((Iterable) afbi2.O);
            Integer num = afbi2.L;
            if (num == null) {
                num = Integer.valueOf(0);
            }
            updateRowByRowId.bind(a2, str9, str17, str10, str8, str12, valueOf3, bool3, bool2, str13, booleanValue, str20, str15, l3, valueOf4, str, str16, str14, str5, str6, str21, str22, str23, str24, a5, num, messageClientStatus, afbo3 != null ? afbo3.d : null, afbo3 != null ? afbo3.c : null, afbo3 != null ? afbo3.b : null, afbo3 != null ? afbo3.e : null, afbo3 != null ? afbo3.a : null, afbo4 != null ? afbo4.d : null, afbo4 != null ? afbo4.c : null, afbo4 != null ? afbo4.b : null, afbo4 != null ? afbo4.e : null, afbo4 != null ? afbo4.a : null, bool, l, str2, longValue2);
            dbClient = this.a;
            obj2 = this.e.get();
            akcr.a(obj2, "storySnapUpdateByRowId.get()");
            dbTransaction3 = dbTransaction;
            if ((dbClient.executeUpdateDelete((ainy) obj2, dbTransaction3) > 0 ? 1 : null) != null) {
                long longValue3;
                str14 = str18;
                akcr.a((Object) str14, str19);
                a3 = a(str14);
                if (a3 != null) {
                    longValue3 = a3.longValue();
                } else {
                    ylq = this;
                    longValue3 = ylq.a(dbTransaction3, afbi2);
                    longValue = l2.longValue();
                    dbTransaction.checkInTransaction();
                    UpdateSnapRowId updateSnapRowId = new UpdateSnapRowId(ylq.a());
                    updateSnapRowId.bind(longValue3, longValue);
                    if ((ylq.a.executeUpdateDelete((ainy) updateSnapRowId) > 0 ? 1 : null) == null) {
                        stringBuilder = new StringBuilder("Error linking StorySnap record with newly inserted Snap record, storySnapRowId=");
                        stringBuilder.append(l2);
                        stringBuilder.append(" insertedSnapRowId=");
                        stringBuilder.append(longValue3);
                        stringBuilder.append(str11);
                        stringBuilder.append(afbi2);
                        throw new IllegalStateException(stringBuilder.toString().toString());
                    }
                }
                aVar = new a(l2.longValue(), longValue3);
            } else {
                str8 = str11;
                Long l4 = l2;
                stringBuilder = new StringBuilder("Error updating StorySnap record, storyRowId=");
                stringBuilder.append(j);
                stringBuilder.append(" storySnapRowId=");
                stringBuilder.append(l4);
                stringBuilder.append(str8);
                stringBuilder.append(afbi2);
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
        }
        long j3 = j2;
        dbTransaction3 = dbTransaction2;
        str14 = str3;
        ylq ylq2 = this;
        akcr.a((Object) str14, str7);
        a3 = ylq2.a(str14);
        longValue = a3 != null ? a3.longValue() : ylq2.a(dbTransaction3, afbi2);
        if ((longValue != -1 ? 1 : null) != null) {
            dbClient = ylq2.a;
            Object recordCountForStoryRowIdSnapRowId = StorySnapRecord.FACTORY.getRecordCountForStoryRowIdSnapRowId(j3, longValue);
            akcr.a(recordCountForStoryRowIdSnapRowId, "StorySnapRecord.FACTORY.…Id(storyRowId, snapRowId)");
            Object obj3 = StorySnapRecord.FACTORY;
            akcr.a(obj3, "StorySnapRecord.FACTORY");
            Object recordCountForStoryRowIdSnapRowIdMapper = obj3.getRecordCountForStoryRowIdSnapRowIdMapper();
            akcr.a(recordCountForStoryRowIdSnapRowIdMapper, "StorySnapRecord.FACTORY.…StoryRowIdSnapRowIdMapper");
            a3 = (Long) dbClient.queryFirst(recordCountForStoryRowIdSnapRowId, recordCountForStoryRowIdSnapRowIdMapper);
            if ((a3 != null ? a3.longValue() : 0) > 0) {
                obj = ylq2.a;
                akcr.a(obj, "db");
                recordCountForStoryRowIdSnapRowIdMapper = StorySnapRecord.FACTORY.selectStorySnaps(j3);
                akcr.a(recordCountForStoryRowIdSnapRowIdMapper, "StorySnapRecord.FACTORY.…ectStorySnaps(storyRowId)");
                obj2 = LegacyStorySnapQueries.SELECT_STORY_SNAPS_MAPPER;
                akcr.a(obj2, "LegacyStorySnapQueries.SELECT_STORY_SNAPS_MAPPER");
                List queryList = BriteDatabaseExtensionsKt.queryList(obj, recordCountForStoryRowIdSnapRowIdMapper, obj2);
                StringBuilder stringBuilder2 = new StringBuilder("upsertStorySnap Constraint Violation\nAttempting to upsert storySnap=");
                stringBuilder2.append(afbi2);
                stringBuilder2.append(" storyRowId=");
                stringBuilder2.append(j3);
                stringBuilder2.append(" clientStatus=");
                stringBuilder2.append(messageClientStatus);
                stringBuilder2.append(10);
                stringBuilder2.append("StorySnap records for storyRowId=");
                stringBuilder2.append(j3);
                stringBuilder2.append(":\n");
                stringBuilder2.append(ajyu.a((Iterable) queryList, (CharSequence) "\n", null, null, 0, null, null, 62));
                ylq2.i.a(gqt.HIGH, new SQLiteConstraintException(stringBuilder2.toString()), yhy.j.callsite("StorySnapData"));
                if (ylq2.b().d()) {
                    ieg.a("StorySnap Table Constraint Violation, Please S2R!", true, 0);
                }
                return yls.a;
            }
            Long valueOf5;
            messageClientStatus2 = messageClientStatus;
            dbTransaction.checkInTransaction();
            InsertRow insertRow = (InsertRow) ylq2.c.get();
            str7 = ylq.a(afbi);
            String str25 = afbi2.d;
            str12 = afbi2.p;
            a2 = afbi2.s;
            str11 = str8;
            str8 = afbi2.K;
            str9 = afbi2.l;
            str10 = afbi2.T;
            Boolean valueOf6 = Boolean.valueOf(z);
            String str26 = str10;
            Boolean bool5 = afbi2.G;
            Boolean bool6 = afbi2.I;
            str10 = afbi2.N;
            long j4 = longValue;
            Object obj4 = afbi2.y;
            akcr.a(obj4, str6);
            boolean booleanValue2 = obj4.booleanValue();
            str6 = afbi2.u;
            str4 = afbi2.k;
            Double d2 = afbi2.n;
            if (d2 != null) {
                str13 = str4;
                valueOf5 = Long.valueOf((long) d2.doubleValue());
            } else {
                str13 = str4;
                valueOf5 = Long.valueOf(0);
            }
            Long l5 = valueOf5;
            longValue = ylq2.g.a();
            String str27 = a2;
            Object b = ylq.b(afbi);
            akcr.a(b, str5);
            Long valueOf7 = Long.valueOf(longValue + b.longValue());
            agai agai2 = afbi2.F;
            str15 = agai2 != null ? agai2.b : null;
            str5 = afbi2.H;
            a2 = afbi2.R;
            str4 = afbi2.S;
            str3 = afbi2.U;
            String str28 = str10;
            String str29 = afbi2.Q;
            String str30 = afbi2.V;
            str10 = afbi2.D;
            String str31 = str3;
            str16 = ylq2.a((Iterable) afbi2.O);
            Integer num2 = afbi2.L;
            if (num2 == null) {
                num2 = Integer.valueOf(0);
            }
            Integer num3 = num2;
            Integer num4 = afbo3 != null ? afbo3.d : null;
            Integer num5 = afbo3 != null ? afbo3.c : null;
            Integer num6 = afbo3 != null ? afbo3.b : null;
            Integer num7 = afbo3 != null ? afbo3.e : null;
            Integer num8 = afbo3 != null ? afbo3.a : null;
            Integer num9 = afbo4 != null ? afbo4.d : null;
            Integer num10 = afbo4 != null ? afbo4.c : null;
            Integer num11 = afbo4 != null ? afbo4.b : null;
            Integer num12 = afbo4 != null ? afbo4.e : null;
            Integer num13 = afbo4 != null ? afbo4.a : null;
            afbq afbq = afbi2.f;
            Long l6 = afbq != null ? afbq.a : null;
            afbq = afbi2.f;
            Integer num14 = afbq != null ? afbq.b : null;
            ahwm ahwm = afbi2.W;
            String str32 = ahwm != null ? ahwm.a : null;
            ahwm = afbi2.W;
            long j5 = j4;
            Object obj5 = 1;
            String str33 = str11;
            ylq ylq3 = ylq2;
            insertRow.bind(j5, str7, str25, str12, str27, str8, str9, str26, valueOf6, bool5, bool6, str28, booleanValue2, str6, str13, l5, valueOf7, str, str15, str5, a2, str4, str31, str29, str30, str10, str16, num3, messageClientStatus, j, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, bool, l, l6, num14, str32, ahwm != null ? ahwm.b : null, str2);
            ylq = ylq3;
            DbClient dbClient2 = ylq.a;
            obj = ylq.c.get();
            akcr.a(obj, "storySnapInsert.get()");
            long executeInsert = dbClient2.executeInsert((ainy) obj, dbTransaction);
            if (executeInsert == -1) {
                obj5 = null;
            }
            if (obj5 != null) {
                aVar = new a(executeInsert, j5);
            } else {
                longValue = j5;
                stringBuilder = new StringBuilder("Error inserting Story Snap record, storyRowId=");
                stringBuilder.append(j);
                stringBuilder.append(" snapRowId=");
                stringBuilder.append(longValue);
                stringBuilder.append(str33);
                stringBuilder.append(afbi);
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
        }
        long j6 = j3;
        String str34 = str8;
        afbi afbi3 = afbi2;
        stringBuilder = new StringBuilder("Error getting/inserting Snap record, storyRowId=");
        stringBuilder.append(j6);
        stringBuilder.append(str34);
        stringBuilder.append(afbi3);
        throw new IllegalStateException(stringBuilder.toString().toString());
        return aVar;
    }

    public static /* synthetic */ a a(ylq ylq, DbTransaction dbTransaction, long j, afbi afbi, boolean z, String str, MessageClientStatus messageClientStatus, afbo afbo, afbo afbo2, String str2, Boolean bool, Long l, int i) {
        int i2 = i;
        return ylq.a(dbTransaction, j, afbi, z, str, messageClientStatus, (i2 & 64) != 0 ? null : afbo, (i2 & 128) != 0 ? null : afbo2, (i2 & 256) != 0 ? null : str2, (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? null : bool, (i2 & Imgproc.INTER_TAB_SIZE2) != 0 ? null : l);
    }

    private static Long b(afbi afbi) {
        return afbi.o != null ? afbi.o : Long.valueOf(0);
    }

    public final ajdp<List<StoryManagementStorySnapRecord>> a(List<Long> list, String str, boolean z) {
        akcr.b(list, "storyRowIds");
        akcr.b(str, "currentUsername");
        Object storyManagementStorySnaps = StorySnapRecord.FACTORY.getStoryManagementStorySnaps(str, ajyu.g((Collection) list));
        akcr.a(storyManagementStorySnaps, "StorySnapRecord.FACTORY.…toryRowIds.toLongArray())");
        storyManagementStorySnaps = this.a.queryAndMapToList("s:getStoryManagementStorySnaps", storyManagementStorySnaps, l.a).p(new m(z));
        akcr.a(storyManagementStorySnaps, "db.queryAndMapToList(\"s:…}\n            }\n        }");
        return storyManagementStorySnaps;
    }

    public final RowIdAndViewedRecord a(long j, String str) {
        if (str == null) {
            c();
            return null;
        }
        Object rowIdAndViewedByStoryRowIdClientId = StorySnapRecord.FACTORY.getRowIdAndViewedByStoryRowIdClientId(j, str);
        akcr.a(rowIdAndViewedByStoryRowIdClientId, "StorySnapRecord.FACTORY.…tId(storyRowId, clientId)");
        DbClient dbClient = this.a;
        Object obj = LegacyStorySnapQueries.SELECT_ROW_ID_AND_VIEWED_ROW_MAPPER;
        akcr.a(obj, "LegacyStorySnapQueries.S…_ID_AND_VIEWED_ROW_MAPPER");
        return (RowIdAndViewedRecord) dbClient.queryFirst(rowIdAndViewedByStoryRowIdClientId, obj);
    }

    /* JADX WARNING: Missing block: B:12:0x0051, code skipped:
            defpackage.akax.a(r5, r0);
     */
    public final java.lang.Long a(defpackage.yle r5) {
        /*
        r4 = this;
        r0 = "storyKey";
        defpackage.akcr.b(r5, r0);
        r0 = com.snap.core.db.record.StorySnapRecord.FACTORY;
        r1 = com.snap.core.db.record.StoryRecord.FACTORY;
        r2 = r5.a;
        r5 = r5.b;
        r5 = r0.getUnviewedStoryCount(r1, r2, r5);
        r0 = "StorySnapRecord.FACTORY.…ryKey.storyKind\n        )";
        defpackage.akcr.a(r5, r0);
        r0 = r4.a;
        r5 = r0.query(r5);
        r5 = (java.io.Closeable) r5;
        r0 = 0;
        r1 = r5;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x004f }
        r2 = r1.moveToFirst();	 Catch:{ Throwable -> 0x004f }
        if (r2 == 0) goto L_0x0043;
    L_0x0028:
        r2 = com.snap.core.db.record.StorySnapRecord.FACTORY;	 Catch:{ Throwable -> 0x004f }
        r3 = "StorySnapRecord.FACTORY";
        defpackage.akcr.a(r2, r3);	 Catch:{ Throwable -> 0x004f }
        r2 = r2.getUnviewedStoryCountMapper();	 Catch:{ Throwable -> 0x004f }
        r1 = r2.map(r1);	 Catch:{ Throwable -> 0x004f }
        r2 = "StorySnapRecord.FACTORY.…ryCountMapper.map(cursor)";
        defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x004f }
        r1 = (java.lang.Number) r1;	 Catch:{ Throwable -> 0x004f }
        r1 = r1.longValue();	 Catch:{ Throwable -> 0x004f }
        goto L_0x0045;
    L_0x0043:
        r1 = -1;
    L_0x0045:
        defpackage.akax.a(r5, r0);
        r5 = java.lang.Long.valueOf(r1);
        return r5;
    L_0x004d:
        r1 = move-exception;
        goto L_0x0051;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004d }
    L_0x0051:
        defpackage.akax.a(r5, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylq.a(yle):java.lang.Long");
    }

    public final List<Long> a(long j) {
        Object selectExpiredStorySnapRowIds = StorySnapRecord.FACTORY.selectExpiredStorySnapRowIds(Long.valueOf(j));
        akcr.a(selectExpiredStorySnapRowIds, "StorySnapRecord.FACTORY.…napRowIds(expirationTime)");
        DbClient dbClient = this.a;
        Object selectExpiredStorySnapRowIdsMapper = StorySnapRecord.FACTORY.selectExpiredStorySnapRowIdsMapper();
        akcr.a(selectExpiredStorySnapRowIdsMapper, "StorySnapRecord.FACTORY.…edStorySnapRowIdsMapper()");
        return dbClient.query(selectExpiredStorySnapRowIds, selectExpiredStorySnapRowIdsMapper);
    }

    public final Map<Long, Map<String, SelectLocallyPersistedPostedFieldsRecord>> a(List<Long> list) {
        akcr.b(list, "storyRowIds");
        Iterable<SelectLocallyPersistedPostedFieldsRecord> a = ymf.a(list, new g(this));
        Map linkedHashMap = new LinkedHashMap();
        for (SelectLocallyPersistedPostedFieldsRecord selectLocallyPersistedPostedFieldsRecord : a) {
            Long valueOf = Long.valueOf(selectLocallyPersistedPostedFieldsRecord.storyRowId());
            ArrayList arrayList = linkedHashMap.get(valueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(valueOf, arrayList);
            }
            arrayList.add(selectLocallyPersistedPostedFieldsRecord);
        }
        Map linkedHashMap2 = new LinkedHashMap(ajzm.a(linkedHashMap.size()));
        for (Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable<SelectLocallyPersistedPostedFieldsRecord> iterable = (Iterable) entry.getValue();
            Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (SelectLocallyPersistedPostedFieldsRecord selectLocallyPersistedPostedFieldsRecord2 : iterable) {
                arrayList2.add(ajxs.a(selectLocallyPersistedPostedFieldsRecord2.clientId(), selectLocallyPersistedPostedFieldsRecord2));
            }
            linkedHashMap2.put(key, ajzm.a((Iterable) (List) arrayList2));
        }
        return linkedHashMap2;
    }

    public final pa a() {
        return this.a.getWritableDatabase();
    }

    public final void a(DbTransaction dbTransaction, long j, String str) {
        akcr.b(dbTransaction, "tx");
        dbTransaction.checkInTransaction();
        if (str == null) {
            c();
            return;
        }
        DbClient dbClient = this.a;
        Object pendingStorySnapRowIds = StorySnapRecord.FACTORY.getPendingStorySnapRowIds(j, str);
        akcr.a(pendingStorySnapRowIds, "StorySnapRecord.FACTORY.…Ids(storyRowId, clientId)");
        Object obj = LegacyStorySnapQueries.PENDING_STORY_SNAP_ROW_IDS_MAPPER;
        akcr.a(obj, "LegacyStorySnapQueries.P…STORY_SNAP_ROW_IDS_MAPPER");
        List query = dbClient.query(pendingStorySnapRowIds, obj);
        if ((query.isEmpty() ^ 1) != 0) {
            Iterable<GetPendingStorySnapRowIdsModel> iterable = query;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (GetPendingStorySnapRowIdsModel id : iterable) {
                arrayList.add(Long.valueOf(id.id()));
            }
            ymf.b((List) arrayList, new b(this));
            arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (GetPendingStorySnapRowIdsModel snapRowId : iterable) {
                arrayList.add(Long.valueOf(snapRowId.snapRowId()));
            }
            a(dbTransaction, (List) arrayList);
        }
    }

    public final void a(DbTransaction dbTransaction, List<Long> list) {
        akcr.b(dbTransaction, "tx");
        akcr.b(list, "snapRowIds");
        dbTransaction.checkInTransaction();
        ymf.b(list, new c(this));
    }

    public final abss b() {
        return (abss) this.f.b();
    }

    public final List<Long> b(long j) {
        Object rowIdsByStoryRowId = StorySnapRecord.FACTORY.getRowIdsByStoryRowId(j);
        akcr.a(rowIdsByStoryRowId, "StorySnapRecord.FACTORY.…sByStoryRowId(storyRowId)");
        DbClient dbClient = this.a;
        Object obj = StorySnapRecord.FACTORY;
        akcr.a(obj, "StorySnapRecord.FACTORY");
        obj = obj.getRowIdsByStoryRowIdMapper();
        akcr.a(obj, "StorySnapRecord.FACTORY.rowIdsByStoryRowIdMapper");
        return dbClient.query(rowIdsByStoryRowId, obj);
    }

    public final List<Long> b(List<String> list) {
        akcr.b(list, "snapIds");
        return ymf.a(list, new t(this));
    }

    public final MessageClientStatus c(long j) {
        Object clientStatus = StorySnapRecord.FACTORY.getClientStatus(j);
        akcr.a(clientStatus, "StorySnapRecord.FACTORY.…entStatus(storySnapRowId)");
        DbClient dbClient = this.a;
        Object obj = StorySnapRecord.FACTORY;
        akcr.a(obj, "StorySnapRecord.FACTORY");
        obj = obj.getClientStatusMapper();
        akcr.a(obj, "StorySnapRecord.FACTORY.clientStatusMapper");
        return (MessageClientStatus) dbClient.queryFirst(clientStatus, obj);
    }

    public final Set<Long> c(List<Long> list) {
        akcr.b(list, "snapRowIds");
        return ajyu.c((Iterable) list, (Iterable) ymf.a(list, new h(this)));
    }

    public final void c() {
        if (b().d()) {
            ieg.a("Please S2R to Stories: Attempted to query db with null clientId", true, 0);
        }
    }
}
