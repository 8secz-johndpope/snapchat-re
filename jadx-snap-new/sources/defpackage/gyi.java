package defpackage;

import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.DiscoverFeedStoryRecord.StoryIdModelRecord;
import com.snap.core.db.record.DiscoverStorySnapModel.CleanupSnapsOlderThan;
import com.snap.core.db.record.DiscoverStorySnapModel.InsertDiscoverStorySnap;
import com.snap.core.db.record.DiscoverStorySnapRecord;
import com.snap.core.db.record.DiscoverStorySnapRecord.PlayableStorySnapsModelRecord;
import com.snap.core.db.record.DiscoverStorySnapRecord.PrefetchStorySnapModelRecord;
import com.snap.core.db.record.DiscoverStorySnapRecord.StorySnapMediaInfoRecord;
import defpackage.gyn.b;
import defpackage.gyn.c;
import defpackage.gyn.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

/* renamed from: gyi */
public final class gyi implements gwb {
    final ihh a;
    final ajwy<SnapDb> b;
    final gyo c;
    final gyn d;
    private final ajxe e = ajxh.a(new c(this));

    /* renamed from: gyi$c */
    static final class c extends akcs implements akbk<DbClient> {
        private /* synthetic */ gyi a;

        c(gyi gyi) {
            this.a = gyi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.a.b.get()).getDbClient(gvz.a.callsite(gyh.a));
        }
    }

    /* renamed from: gyi$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            StorySnapMediaInfoRecord storySnapMediaInfoRecord = (StorySnapMediaInfoRecord) obj;
            akcr.b(storySnapMediaInfoRecord, "it");
            akcr.b(storySnapMediaInfoRecord, "receiver$0");
            CharSequence streamingMetadataUrl = storySnapMediaInfoRecord.streamingMetadataUrl();
            Object obj2 = (streamingMetadataUrl == null || akgb.a(streamingMetadataUrl)) ? 1 : null;
            String str = "mediaType()";
            String str2 = "rawSnapId()";
            if (obj2 != null) {
                Object rawSnapId = storySnapMediaInfoRecord.rawSnapId();
                akcr.a(rawSnapId, str2);
                Object mediaType = storySnapMediaInfoRecord.mediaType();
                akcr.a(mediaType, str);
                return new gww(rawSnapId, mediaType, storySnapMediaInfoRecord.mediaId(), storySnapMediaInfoRecord.mediaUrl(), storySnapMediaInfoRecord.mediaKey(), storySnapMediaInfoRecord.mediaIv());
            }
            Object rawSnapId2 = storySnapMediaInfoRecord.rawSnapId();
            akcr.a(rawSnapId2, str2);
            Object mediaType2 = storySnapMediaInfoRecord.mediaType();
            akcr.a(mediaType2, str);
            return new gww(rawSnapId2, mediaType2, storySnapMediaInfoRecord.mediaId(), storySnapMediaInfoRecord.streamingMetadataUrl(), storySnapMediaInfoRecord.streamingMediaKey(), storySnapMediaInfoRecord.streamingMediaIv());
        }
    }

    /* renamed from: gyi$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Iterable<StoryIdModelRecord> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (StoryIdModelRecord storyIdModelRecord : iterable) {
                Object storyId = storyIdModelRecord.storyId();
                akcr.a(storyId, "it.storyId()");
                arrayList.add(new gwu(storyId, storyIdModelRecord._id()));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: gyi$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Iterable iterable = list;
            Collection arrayList = new ArrayList(ajyn.a(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                PlayableStorySnapsModelRecord playableStorySnapsModelRecord = (PlayableStorySnapsModelRecord) it.next();
                akcr.b(playableStorySnapsModelRecord, "receiver$0");
                String mediaId = playableStorySnapsModelRecord.mediaId();
                String mediaUrl = playableStorySnapsModelRecord.mediaUrl();
                String mediaKey = playableStorySnapsModelRecord.mediaKey();
                String mediaIv = playableStorySnapsModelRecord.mediaIv();
                long duration = playableStorySnapsModelRecord.duration();
                boolean isZipped = playableStorySnapsModelRecord.isZipped();
                boolean isInfiniteDuration = playableStorySnapsModelRecord.isInfiniteDuration();
                Object mediaType = playableStorySnapsModelRecord.mediaType();
                akcr.a(mediaType, "mediaType()");
                gwf gwf = new gwf(mediaId, mediaUrl, mediaKey, mediaIv, duration, isZipped, isInfiniteDuration, mediaType);
                CharSequence streamingMetadataUrl = playableStorySnapsModelRecord.streamingMetadataUrl();
                Object obj2 = (streamingMetadataUrl == null || akgb.a(streamingMetadataUrl)) ? 1 : null;
                gwx gwx = obj2 != null ? null : new gwx(playableStorySnapsModelRecord.streamingMediaKey(), playableStorySnapsModelRecord.streamingMediaIv(), playableStorySnapsModelRecord.streamingMetadataUrl());
                long _id = playableStorySnapsModelRecord._id();
                Object rawSnapId = playableStorySnapsModelRecord.rawSnapId();
                mediaKey = rawSnapId;
                akcr.a(rawSnapId, "rawSnapId()");
                long creationTimestampMs = playableStorySnapsModelRecord.creationTimestampMs();
                String title = playableStorySnapsModelRecord.title();
                String subTitles = playableStorySnapsModelRecord.subTitles();
                String attachmentUrl = playableStorySnapsModelRecord.attachmentUrl();
                String lensId = playableStorySnapsModelRecord.lensId();
                Iterator it2 = it;
                Object storyId = playableStorySnapsModelRecord.storyId();
                String str = storyId;
                Collection collection = arrayList;
                akcr.a(storyId, "storyId()");
                arrayList = collection;
                arrayList.add(new gwg(_id, mediaKey, creationTimestampMs, title, subTitles, attachmentUrl, lensId, gwf, gwx, str, playableStorySnapsModelRecord.storyRowId(), playableStorySnapsModelRecord.lastView(), Long.valueOf(playableStorySnapsModelRecord.expirationTimestampMs()), playableStorySnapsModelRecord.displayName(), playableStorySnapsModelRecord.thumbnailUrl(), playableStorySnapsModelRecord.filterId(), playableStorySnapsModelRecord.storyFilterId(), playableStorySnapsModelRecord.venueId(), playableStorySnapsModelRecord.unlockablesSnapInfo(), playableStorySnapsModelRecord.encryptedGeoLoggingData(), playableStorySnapsModelRecord.duration(), playableStorySnapsModelRecord.shareable(), playableStorySnapsModelRecord.dynamicSnapSource()));
                it = it2;
            }
            return (List) arrayList;
        }
    }

    /* renamed from: gyi$g */
    static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Iterable<PrefetchStorySnapModelRecord> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (PrefetchStorySnapModelRecord prefetchStorySnapModelRecord : iterable) {
                akcr.b(prefetchStorySnapModelRecord, "receiver$0");
                CharSequence streamingMetadataUrl = prefetchStorySnapModelRecord.streamingMetadataUrl();
                int i = (streamingMetadataUrl == null || akgb.a(streamingMetadataUrl)) ? 1 : 0;
                arrayList.add(new gwk(prefetchStorySnapModelRecord._id(), prefetchStorySnapModelRecord.creationTimestampMs(), prefetchStorySnapModelRecord.lastView(), i ^ 1));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: gyi$a */
    static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ gyi a;
        private /* synthetic */ gyt b;
        private /* synthetic */ FeatureType c;

        a(gyi gyi, gyt gyt, FeatureType featureType) {
            this.a = gyi;
            this.b = gyt;
            this.c = featureType;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            gyt gyt = this.b;
            if (gyt instanceof gys) {
                this.a.d.a(this.c);
                this.a.c.a(this.c, dbTransaction);
            } else if (gyt instanceof gyu) {
                long a = this.a.a.a() - TimeUnit.HOURS.toMillis(((gyu) this.b).a.longValue());
                this.a.c.a(a, this.c, dbTransaction);
                gyn gyn = this.a.d;
                long a2 = this.a.a.a();
                FeatureType featureType = this.c;
                akcr.b(featureType, "featureType");
                CleanupSnapsOlderThan cleanupSnapsOlderThan = new CleanupSnapsOlderThan(gyn.c(), DiscoverStorySnapRecord.FACTORY);
                cleanupSnapsOlderThan.bind(a, a2, featureType);
                BriteDatabaseExtensionsKt.executeDelete(gyn.a, cleanupSnapsOlderThan);
            }
            return ajxw.a;
        }
    }

    /* renamed from: gyi$b */
    static final class b extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ gyi a;
        private /* synthetic */ FeatureType b;

        b(gyi gyi, FeatureType featureType) {
            this.a = gyi;
            this.b = featureType;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((DbTransaction) obj, "tx");
            this.a.d.a(this.b);
            return ajxw.a;
        }
    }

    /* renamed from: gyi$h */
    static final class h extends akcs implements akbl<DbTransaction, List<gwu>> {
        private /* synthetic */ gyi a;
        private /* synthetic */ Map b;
        private /* synthetic */ FeatureType c;

        h(gyi gyi, Map map, FeatureType featureType) {
            this.a = gyi;
            this.b = map;
            this.c = featureType;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            h hVar = this;
            DbTransaction dbTransaction = (DbTransaction) obj;
            String str = "tx";
            akcr.b(dbTransaction, str);
            List arrayList = new ArrayList();
            Iterator it = hVar.b.entrySet().iterator();
            while (it.hasNext()) {
                String str2;
                Entry entry = (Entry) it.next();
                String str3 = (String) entry.getKey();
                List list = (List) entry.getValue();
                long a = hVar.a.c.a(str3, hVar.c, dbTransaction);
                arrayList.add(new gwu(str3, a));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    DbTransaction dbTransaction2;
                    gwe gwe = (gwe) it2.next();
                    gyn gyn = hVar.a.d;
                    FeatureType featureType = hVar.c;
                    FeatureType featureType2 = featureType;
                    String str4 = "dynamicSnapData";
                    akcr.b(gwe, str4);
                    String str5 = "storyId";
                    akcr.b(str3, str5);
                    String str6 = "featureType";
                    akcr.b(featureType, str6);
                    akcr.b(dbTransaction, str);
                    Iterator it3 = it;
                    Iterator it4 = it2;
                    List list2 = arrayList;
                    DbTransaction dbTransaction3 = dbTransaction;
                    str2 = str;
                    FeatureType featureType3 = featureType;
                    str = str4;
                    gyn gyn2 = gyn;
                    String str7 = str6;
                    gwe gwe2 = gwe;
                    long j = a;
                    String str8 = str5;
                    gyn.b().bind(gwe.b, gwe.c, gwe.d, gwe.e, gwe2.f, gwe2.g, gwe2.h, gwe2.i, gwe2.j.h, gwe2.j.a, gwe2.j.b, gwe2.j.c, gwe2.j.d, gwe2.j.e, gwe2.j.f, gwe2.j.g, str3, j, gyn2.b.a(), null, null, gwe2.p, gwe2.q, gwe2.r, gwe2.a, featureType2);
                    if (((long) gyn2.a.executeUpdateDelete(gyn2.b())) <= 0) {
                        akcr.b(gwe2, str);
                        akcr.b(str3, str8);
                        akcr.b(featureType3, str7);
                        akcr.b(dbTransaction3, str2);
                        InsertDiscoverStorySnap a2 = gyn2.a();
                        str4 = gwe2.a;
                        long j2 = gwe2.b;
                        a = gwe2.c;
                        String str9 = gwe2.d;
                        str6 = gwe2.e;
                        String str10 = gwe2.f;
                        str5 = gwe2.g;
                        String str11 = gwe2.h;
                        boolean z = gwe2.i;
                        String str12 = str5;
                        long a3 = gyn2.b.a();
                        gcp gcp = gwe2.j.h;
                        String str13 = gwe2.j.a;
                        String str14 = gwe2.j.b;
                        String str15 = gwe2.j.c;
                        String str16 = gwe2.j.d;
                        FeatureType featureType4 = featureType3;
                        boolean z2 = z;
                        long j3 = gwe2.j.e;
                        boolean z3 = gwe2.j.f;
                        boolean z4 = gwe2.j.g;
                        gwx gwx = gwe2.k;
                        String str17 = gwx != null ? gwx.a : null;
                        gwx = gwe2.k;
                        String str18 = gwx != null ? gwx.b : null;
                        gwx = gwe2.k;
                        long j4 = j;
                        str12 = str9;
                        a2.bind(str3, j4, str4, j2, a, str12, str6, str10, str12, str11, z2, a3, featureType4, gcp, str13, str14, str15, str16, j3, z3, z4, str17, str18, gwx != null ? gwx.c : null, gwe2.l, gwe2.m, gwe2.s, gwe2.t, null, null, gwe2.p, gwe2.q, gwe2.r);
                        dbTransaction2 = dbTransaction3;
                        gyn2.a.executeInsert(gyn2.a(), dbTransaction2);
                    } else {
                        dbTransaction2 = dbTransaction3;
                    }
                    hVar = this;
                    it = it3;
                    dbTransaction = dbTransaction2;
                    it2 = it4;
                    arrayList = list2;
                    str = str2;
                    a = j;
                }
                str2 = str;
                hVar = this;
            }
            return arrayList;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gyi.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;");
    }

    public gyi(ihh ihh, ajwy<SnapDb> ajwy, gyo gyo, gyn gyn) {
        akcr.b(ihh, "clock");
        akcr.b(ajwy, "snapDb");
        akcr.b(gyo, "discoverStoryData");
        akcr.b(gyn, "discoverSnapData");
        this.a = ihh;
        this.b = ajwy;
        this.c = gyo;
        this.d = gyn;
    }

    private final DbClient a() {
        return (DbClient) this.e.b();
    }

    private static StringBuffer a(gxc gxc) {
        Object stringBuffer = new StringBuffer();
        String str = "creationTimestampMs ";
        if (gxc != null) {
            int i = gyj.a[gxc.a.ordinal()];
            String str2 = "statement.append(\"${Disc…  \" ${order.order.name}\")";
            if (i == 1) {
                StringBuilder stringBuilder = new StringBuilder("S._id ");
                stringBuilder.append(gxc.b.name());
                stringBuffer.append(stringBuilder.toString());
                akcr.a(stringBuffer, str2);
                return stringBuffer;
            } else if (i == 2) {
                StringBuilder stringBuilder2 = new StringBuilder(str);
                stringBuilder2.append(gxc.b.name());
                stringBuffer.append(stringBuilder2.toString());
                akcr.a(stringBuffer, str2);
                return stringBuffer;
            } else {
                throw new ajxk();
            }
        }
        StringBuilder stringBuilder3 = new StringBuilder(str);
        stringBuilder3.append(gxe.ASC.name());
        stringBuffer.append(stringBuilder3.toString());
        akcr.a(stringBuffer, "statement.append(\"${Disc…{SortingOrder.ASC.name}\")");
        return stringBuffer;
    }

    public final ajcx a(FeatureType featureType) {
        akcr.b(featureType, "featureType");
        return a().runInTransaction("DynamicStorySnapMediaDBRepository:clearAllSnapsCache", new b(this, featureType));
    }

    public final ajcx a(gyt gyt, FeatureType featureType) {
        akcr.b(gyt, "strategy");
        akcr.b(featureType, "featureType");
        return a().runInTransaction("DynamicStorySnapMediaDBRepository:cleanupSnaps", new a(this, gyt, featureType));
    }

    public final ajdp<List<gwg>> a(long j, FeatureType featureType, gxc gxc) {
        String str = "featureType";
        akcr.b(featureType, str);
        akcr.b(gxc, "order");
        gyn gyn = this.d;
        StringBuffer a = gyi.a(gxc);
        akcr.b(featureType, str);
        akcr.b(a, "orderBy");
        long a2 = gyn.b.a();
        Object playableStorySnaps = DiscoverStorySnapRecord.FACTORY.playableStorySnaps(j, featureType, a2, a.toString());
        akcr.a(playableStorySnaps, "DiscoverStorySnapRecord.…      orderBy.toString())");
        Object sql = playableStorySnaps.getSql();
        akcr.a(sql, "selectStories.sql");
        String a3 = fsu.a(fsu.a(fsu.a(sql, 1, String.valueOf(j)), 2, String.valueOf(featureType.getIntValue())), 3, String.valueOf(a2));
        Object stringBuffer = a.toString();
        akcr.a(stringBuffer, "orderBy.toString()");
        Object p = gyn.a.queryAndMapToList(new ainx(fsu.a(a3, 4, stringBuffer), playableStorySnaps.getTables()), b.a).p(f.a);
        akcr.a(p, "discoverSnapData.getPlay…)\n            }\n        }");
        return p;
    }

    public final ajdp<List<gwk>> a(long j, FeatureType featureType, gxc gxc, int i) {
        FeatureType featureType2 = featureType;
        String str = "featureType";
        akcr.b(featureType2, str);
        akcr.b(gxc, "order");
        gyn gyn = this.d;
        StringBuffer a = gyi.a(gxc);
        akcr.b(featureType2, str);
        akcr.b(a, "orderBy");
        long a2 = gyn.b.a();
        Object prefetchStorySnaps = DiscoverStorySnapRecord.FACTORY.prefetchStorySnaps(j, featureType, a2, a.toString(), (long) i);
        akcr.a(prefetchStorySnaps, "DiscoverStorySnapRecord.…mSnaps.toLong()\n        )");
        Object sql = prefetchStorySnaps.getSql();
        akcr.a(sql, "selectSnaps.sql");
        String a3 = fsu.a(fsu.a(fsu.a(sql, 1, String.valueOf(j)), 2, String.valueOf(featureType.getIntValue())), 3, String.valueOf(a2));
        Object stringBuffer = a.toString();
        akcr.a(stringBuffer, "orderBy.toString()");
        prefetchStorySnaps = gyn.a.queryAndMapToList(new ainx(fsu.a(fsu.a(a3, 4, stringBuffer), 5, String.valueOf(i)), prefetchStorySnaps.getTables()), c.a).p(g.a);
        akcr.a(prefetchStorySnaps, "discoverSnapData.getPref…DynamicSnap() }\n        }");
        return prefetchStorySnaps;
    }

    public final ajdx<gww> a(long j, FeatureType featureType) {
        String str = "featureType";
        akcr.b(featureType, str);
        gyn gyn = this.d;
        akcr.b(featureType, str);
        Object storyMediaInfo = DiscoverStorySnapRecord.FACTORY.storyMediaInfo(j, featureType);
        akcr.a(storyMediaInfo, "DiscoverStorySnapRecord.…o(snapRowId, featureType)");
        storyMediaInfo = gyn.a.queryAndMapToOne(storyMediaInfo, new e(DiscoverStorySnapRecord.STORY_SNAP_MEDIA_INFO_ROW_MAPPER)).e();
        akcr.a(storyMediaInfo, "dbClient.queryAndMapToOn…          .firstOrError()");
        storyMediaInfo = storyMediaInfo.f(d.a);
        akcr.a(storyMediaInfo, "discoverSnapData.getStor….toStorySnapMediaInfo() }");
        return storyMediaInfo;
    }

    public final ajdx<Long> a(String str, FeatureType featureType) {
        akcr.b(str, "storyId");
        akcr.b(featureType, "featureType");
        return this.c.a(str, featureType);
    }

    public final ajdx<List<gwu>> a(List<String> list, FeatureType featureType) {
        akcr.b(list, "storyIds");
        akcr.b(featureType, "featureType");
        Object f = this.c.a((List) list, featureType).f(e.a);
        akcr.a(f, "discoverStoryData.getSto….storyId(), it._id()) } }");
        return f;
    }

    public final ajdx<List<gwu>> a(Map<String, ? extends List<gwe>> map, FeatureType featureType) {
        akcr.b(map, "snapsMap");
        akcr.b(featureType, "featureType");
        return a().callInTransaction("DynamicStorySnapMediaDBRepository:saveSnaps", new h(this, map, featureType));
    }

    public final long b(long j, FeatureType featureType) {
        String str = "featureType";
        akcr.b(featureType, str);
        gyn gyn = this.d;
        long a = this.a.a();
        akcr.b(featureType, str);
        Object unviewedDiscoverStorySnapCount = DiscoverStorySnapRecord.FACTORY.getUnviewedDiscoverStorySnapCount(j, featureType, a);
        akcr.a(unviewedDiscoverStorySnapCount, "DiscoverStorySnapRecord.…reType, expiredTimeStamp)");
        DbClient dbClient = gyn.a;
        Object obj = DiscoverStorySnapRecord.FACTORY;
        akcr.a(obj, "DiscoverStorySnapRecord.FACTORY");
        obj = obj.getUnviewedDiscoverStorySnapCountMapper();
        akcr.a(obj, "DiscoverStorySnapRecord.…coverStorySnapCountMapper");
        unviewedDiscoverStorySnapCount = dbClient.queryFirst(unviewedDiscoverStorySnapCount, obj, Long.valueOf(0));
        akcr.a(unviewedDiscoverStorySnapCount, "dbClient.queryFirst(stat…StorySnapCountMapper, 0L)");
        return ((Number) unviewedDiscoverStorySnapCount).longValue();
    }

    public final long b(String str, FeatureType featureType) {
        akcr.b(str, "storyId");
        akcr.b(featureType, "featureType");
        return this.c.b(str, featureType);
    }

    public final String c(long j, FeatureType featureType) {
        String str = "featureType";
        akcr.b(featureType, str);
        gyn gyn = this.d;
        long a = this.a.a();
        StringBuffer a2 = gyi.a(null);
        akcr.b(featureType, str);
        akcr.b(a2, "orderBy");
        Object nextDiscoverStorySnapId = DiscoverStorySnapRecord.FACTORY.getNextDiscoverStorySnapId(j, featureType, a, a2.toString());
        akcr.a(nextDiscoverStorySnapId, "DiscoverStorySnapRecord.…tamp, orderBy.toString())");
        DbClient dbClient = gyn.a;
        Object obj = DiscoverStorySnapRecord.FACTORY;
        akcr.a(obj, "DiscoverStorySnapRecord.FACTORY");
        obj = obj.getNextDiscoverStorySnapIdMapper();
        akcr.a(obj, "DiscoverStorySnapRecord.…DiscoverStorySnapIdMapper");
        return (String) dbClient.queryFirst(nextDiscoverStorySnapId, obj);
    }
}
