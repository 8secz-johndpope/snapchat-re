package defpackage;

import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.AdType;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.PromotedStorySnapModel.ClearPromotedSnapsOlderThanByFeatureType;
import com.snap.core.db.record.PromotedStorySnapModel.InsertPromotedStorySnap;
import com.snap.core.db.record.PromotedStorySnapModel.UpdatePromotedStorySnap;
import com.snap.core.db.record.PromotedStorySnapRecord;
import com.snap.core.db.record.PromotedStorySnapRecord.PlayablePromotedSnapRecord;
import defpackage.gyq.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

/* renamed from: gyl */
public final class gyl implements gwc {
    final ihh a;
    final ajwy<SnapDb> b;
    final gyo c;
    final gyq d;
    private final ajxe e = ajxh.a(new b(this));

    /* renamed from: gyl$b */
    static final class b extends akcs implements akbk<DbClient> {
        private /* synthetic */ gyl a;

        b(gyl gyl) {
            this.a = gyl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.a.b.get()).getDbClient(gvz.a.callsite("PromotedStorySnapDbRepository"));
        }
    }

    /* renamed from: gyl$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Iterable<PlayablePromotedSnapRecord> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (PlayablePromotedSnapRecord playablePromotedSnapRecord : iterable) {
                akcr.b(playablePromotedSnapRecord, "receiver$0");
                long _id = playablePromotedSnapRecord._id();
                Object snapId = playablePromotedSnapRecord.snapId();
                akcr.a(snapId, "snapId()");
                Object storyId = playablePromotedSnapRecord.storyId();
                akcr.a(storyId, "storyId()");
                long storyRowId = playablePromotedSnapRecord.storyRowId();
                AdType adType = playablePromotedSnapRecord.adType();
                if (adType == null) {
                    akcr.a();
                }
                String name = adType.name();
                akcr.b(name, "name");
                Object obj2 = Locale.US;
                akcr.a(obj2, "Locale.US");
                Object toUpperCase = name.toUpperCase(obj2);
                akcr.a(toUpperCase, "(this as java.lang.String).toUpperCase(locale)");
                gwj valueOf = gwj.valueOf(toUpperCase);
                String brandName = playablePromotedSnapRecord.brandName();
                String headline = playablePromotedSnapRecord.headline();
                Object adSnapKey = playablePromotedSnapRecord.adSnapKey();
                if (adSnapKey == null) {
                    akcr.a();
                }
                akcr.a(adSnapKey, "adSnapKey()!!");
                Object mediaUrl = playablePromotedSnapRecord.mediaUrl();
                akcr.a(mediaUrl, "mediaUrl()");
                arrayList.add(new gwh(_id, snapId, storyId, storyRowId, valueOf, brandName, headline, adSnapKey, mediaUrl, playablePromotedSnapRecord.politicalAdName(), playablePromotedSnapRecord.lastView(), Long.valueOf(playablePromotedSnapRecord.timestamp() + gyp.b)));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: gyl$a */
    static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ gyl a;
        private /* synthetic */ gyt b;
        private /* synthetic */ FeatureType c;

        a(gyl gyl, gyt gyt, FeatureType featureType) {
            this.a = gyl;
            this.b = gyt;
            this.c = featureType;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            gyt gyt = this.b;
            String str = "featureType";
            if (gyt instanceof gys) {
                gyq gyq = this.a.d;
                FeatureType featureType = this.c;
                akcr.b(featureType, str);
                gyq.d().bind(featureType);
                gyq.a.executeUpdateDelete(gyq.d());
                this.a.c.a(this.c, dbTransaction);
            } else if (gyt instanceof gyu) {
                long a = this.a.a.a() - TimeUnit.HOURS.toMillis(((gyu) this.b).a.longValue());
                this.a.c.a(a, this.c, dbTransaction);
                gyq gyq2 = this.a.d;
                FeatureType featureType2 = this.c;
                akcr.b(featureType2, str);
                ClearPromotedSnapsOlderThanByFeatureType clearPromotedSnapsOlderThanByFeatureType = new ClearPromotedSnapsOlderThanByFeatureType(gyq2.a(), PromotedStorySnapRecord.FACTORY);
                clearPromotedSnapsOlderThanByFeatureType.bind(a, featureType2);
                BriteDatabaseExtensionsKt.executeDelete(gyq2.a, clearPromotedSnapsOlderThanByFeatureType);
            }
            return ajxw.a;
        }
    }

    /* renamed from: gyl$d */
    static final class d extends akcs implements akbl<DbTransaction, List<gwu>> {
        private /* synthetic */ gyl a;
        private /* synthetic */ Map b;
        private /* synthetic */ FeatureType c;

        d(gyl gyl, Map map, FeatureType featureType) {
            this.a = gyl;
            this.b = map;
            this.c = featureType;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            d dVar = this;
            DbTransaction dbTransaction = (DbTransaction) obj;
            String str = "tx";
            akcr.b(dbTransaction, str);
            List arrayList = new ArrayList();
            Iterator it = dVar.b.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                String str2 = (String) entry.getKey();
                List list = (List) entry.getValue();
                long a = dVar.a.c.a(str2, dVar.c, dbTransaction);
                arrayList.add(new gwu(str2, a));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    gwm gwm = (gwm) it2.next();
                    gyq gyq = dVar.a.d;
                    FeatureType featureType = dVar.c;
                    akcr.b(gwm, "promotedSnap");
                    akcr.b(str2, "storyId");
                    akcr.b(featureType, "featureType");
                    akcr.b(dbTransaction, str);
                    UpdatePromotedStorySnap c = gyq.c();
                    String str3 = gwm.b;
                    Iterator it3 = it;
                    Iterator it4 = it2;
                    Long valueOf = Long.valueOf(gwm.c);
                    String str4 = gwm.d;
                    String str5 = gwm.e;
                    String str6 = gwm.f;
                    String str7 = str;
                    String str8 = str6;
                    String str9 = str3;
                    FeatureType featureType2 = featureType;
                    List list2 = arrayList;
                    gyq gyq2 = gyq;
                    Long l = valueOf;
                    gwm gwm2 = gwm;
                    long j = a;
                    c.bind(str2, a, str9, l, str4, str5, str8, AdType.Companion.valueOfIgnoreCase(gwm.g.name()), gyq.b.a(), gwm.h, gwm.a, featureType2);
                    if (((long) gyq2.a.executeUpdateDelete(gyq2.c())) <= 0) {
                        InsertPromotedStorySnap b = gyq2.b();
                        str6 = gwm2.a;
                        String str10 = gwm2.b;
                        Long valueOf2 = Long.valueOf(gwm2.c);
                        String str11 = gwm2.d;
                        String str12 = gwm2.e;
                        b.bind(str6, str2, j, featureType2, str10, valueOf2, str11, str12, gwm2.f, AdType.Companion.valueOfIgnoreCase(gwm2.g.name()), gyq2.b.a(), gwm2.h);
                        gyq2.a.executeInsert(gyq2.b(), dbTransaction);
                    }
                    dVar = this;
                    it = it3;
                    it2 = it4;
                    str = str7;
                    arrayList = list2;
                    a = j;
                }
                dVar = this;
            }
            return arrayList;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gyl.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;");
    }

    public gyl(ihh ihh, ajwy<SnapDb> ajwy, gyo gyo, gyq gyq) {
        akcr.b(ihh, "clock");
        akcr.b(ajwy, "snapDb");
        akcr.b(gyo, "discoverStoryData");
        akcr.b(gyq, "promotedSnapData");
        this.a = ihh;
        this.b = ajwy;
        this.c = gyo;
        this.d = gyq;
    }

    private final DbClient a() {
        return (DbClient) this.e.b();
    }

    public final long a(String str, FeatureType featureType) {
        akcr.b(str, "storyId");
        akcr.b(featureType, "featureType");
        return this.c.b(str, featureType);
    }

    public final ajcx a(gyt gyt, FeatureType featureType) {
        akcr.b(gyt, "strategy");
        akcr.b(featureType, "featureType");
        return a().runInTransaction("PromotedStorySnapDbRepository:cleanupSnaps", new a(this, gyt, featureType));
    }

    public final ajdp<List<gwh>> a(long j, FeatureType featureType) {
        String str = "featureType";
        akcr.b(featureType, str);
        gyq gyq = this.d;
        akcr.b(featureType, str);
        Object playableSnaps = PromotedStorySnapRecord.FACTORY.playableSnaps(j, featureType);
        akcr.a(playableSnaps, "PromotedStorySnapRecord.…(storyRowId, featureType)");
        playableSnaps = gyq.a.queryAndMapToList(playableSnaps, b.a).p(c.a);
        akcr.a(playableSnaps, "promotedSnapData.getPlay…)\n            }\n        }");
        return playableSnaps;
    }

    public final ajdx<List<gwu>> a(Map<String, ? extends List<gwm>> map, FeatureType featureType) {
        akcr.b(map, "snapsMap");
        akcr.b(featureType, "featureType");
        return a().callInTransaction("PromotedStorySnapDbRepository:saveSnaps", new d(this, map, featureType));
    }

    public final long b(long j, FeatureType featureType) {
        String str = "featureType";
        akcr.b(featureType, str);
        gyq gyq = this.d;
        akcr.b(featureType, str);
        Object unviewedPromotedStorySnapCount = PromotedStorySnapRecord.FACTORY.getUnviewedPromotedStorySnapCount(j, featureType);
        akcr.a(unviewedPromotedStorySnapCount, "PromotedStorySnapRecord.…(storyRowId, featureType)");
        DbClient dbClient = gyq.a;
        Object obj = PromotedStorySnapRecord.FACTORY;
        akcr.a(obj, "PromotedStorySnapRecord.FACTORY");
        obj = obj.getUnviewedPromotedStorySnapCountMapper();
        akcr.a(obj, "PromotedStorySnapRecord.…motedStorySnapCountMapper");
        unviewedPromotedStorySnapCount = dbClient.queryFirst(unviewedPromotedStorySnapCount, obj, Long.valueOf(0));
        akcr.a(unviewedPromotedStorySnapCount, "dbClient.queryFirst(stat…StorySnapCountMapper, 0L)");
        return ((Number) unviewedPromotedStorySnapCount).longValue();
    }

    public final String c(long j, FeatureType featureType) {
        String str = "featureType";
        akcr.b(featureType, str);
        gyq gyq = this.d;
        akcr.b(featureType, str);
        Object nextPromotedStorySnapId = PromotedStorySnapRecord.FACTORY.getNextPromotedStorySnapId(j, featureType);
        akcr.a(nextPromotedStorySnapId, "PromotedStorySnapRecord.…(storyRowId, featureType)");
        DbClient dbClient = gyq.a;
        Object obj = PromotedStorySnapRecord.FACTORY;
        akcr.a(obj, "PromotedStorySnapRecord.FACTORY");
        obj = obj.getNextPromotedStorySnapIdMapper();
        akcr.a(obj, "PromotedStorySnapRecord.…PromotedStorySnapIdMapper");
        return (String) dbClient.queryFirst(nextPromotedStorySnapId, obj);
    }
}
