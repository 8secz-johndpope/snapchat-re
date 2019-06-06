package defpackage;

import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.DiscoverFeedStoryRecord.StoryIdModelRecord;
import com.snap.core.db.record.PublisherSnapPageModel.CleanupPublisherSnapsOlderThan;
import com.snap.core.db.record.PublisherSnapPageRecord;
import com.snap.core.db.record.PublisherSnapPageRecord.PageMediaInfoRecord;
import com.snap.core.db.record.PublisherSnapPageRecord.PlayablePagesRecord;
import com.snap.core.db.record.PublisherSnapPageRecord.PrefetchSnapRecord;
import com.snap.core.db.record.PublisherSnapPageRecord.SnapTileInfoRecord;
import com.snap.core.db.record.PublisherSnapPageRecord.StoryInfoRecord;
import defpackage.gwn.a;
import defpackage.gyr.b;
import defpackage.gyr.d;
import defpackage.gyr.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: gym */
public final class gym implements gwd {
    final ihh a;
    final ajwy<SnapDb> b;
    final gyo c;
    final gyr d;
    private final ajxe e = ajxh.a(new b(this));

    /* renamed from: gym$b */
    static final class b extends akcs implements akbk<DbClient> {
        private /* synthetic */ gym a;

        b(gym gym) {
            this.a = gym;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.a.b.get()).getDbClient(gvz.a.callsite("PublisherSnapMediaDBRepository"));
        }
    }

    /* renamed from: gym$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ long a;

        c(long j) {
            this.a = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            PageMediaInfoRecord pageMediaInfoRecord = (PageMediaInfoRecord) obj;
            akcr.b(pageMediaInfoRecord, "it");
            String valueOf = String.valueOf(this.a);
            gxu gxu = gxu.PUBLISHER;
            akcr.b(pageMediaInfoRecord, "receiver$0");
            akcr.b(valueOf, "snapId");
            akcr.b(gxu, "richMediaStoryType");
            long _id = pageMediaInfoRecord._id();
            Object url = pageMediaInfoRecord.url();
            if (url == null) {
                akcr.a();
            }
            akcr.a(url, "url()!!");
            return new gwq(_id, valueOf, gxu, url);
        }
    }

    /* renamed from: gym$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            StoryInfoRecord storyInfoRecord = (StoryInfoRecord) obj;
            akcr.b(storyInfoRecord, "it");
            akcr.b(storyInfoRecord, "receiver$0");
            long _id = storyInfoRecord._id();
            Object storyId = storyInfoRecord.storyId();
            akcr.a(storyId, "storyId()");
            return new gwv(_id, storyId, storyInfoRecord.storyRowId());
        }
    }

    /* renamed from: gym$e */
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

    /* renamed from: gym$f */
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
                PlayablePagesRecord playablePagesRecord = (PlayablePagesRecord) it.next();
                akcr.b(playablePagesRecord, "receiver$0");
                long pageId = playablePagesRecord.pageId();
                long editionId = playablePagesRecord.editionId();
                long publisherId = playablePagesRecord.publisherId();
                String publisherFormalName = playablePagesRecord.publisherFormalName();
                String publisherName = playablePagesRecord.publisherName();
                gwn a = a.a(playablePagesRecord.snapType().name());
                String url = playablePagesRecord.url();
                String pageHash = playablePagesRecord.pageHash();
                Long adType = playablePagesRecord.adType();
                String storyId = playablePagesRecord.storyId();
                Iterator it2 = it;
                akcr.a((Object) storyId, "storyId()");
                long _id = playablePagesRecord._id();
                long storyRowId = playablePagesRecord.storyRowId();
                Long lastView = playablePagesRecord.lastView();
                Long publishTimestampMs = playablePagesRecord.publishTimestampMs();
                Long publishTimestampMs2 = playablePagesRecord.publishTimestampMs();
                arrayList.add(new gwi(pageId, editionId, publisherId, publisherFormalName, publisherName, a, url, pageHash, adType, storyId, _id, storyRowId, lastView, publishTimestampMs, publishTimestampMs2 != null ? Long.valueOf(publishTimestampMs2.longValue() + gyp.a) : null, playablePagesRecord.thumbnailUrl()));
                it = it2;
            }
            return (List) arrayList;
        }
    }

    /* renamed from: gym$g */
    static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Iterable<PrefetchSnapRecord> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (PrefetchSnapRecord prefetchSnapRecord : iterable) {
                akcr.b(prefetchSnapRecord, "receiver$0");
                arrayList.add(new gwl(prefetchSnapRecord.pageId(), prefetchSnapRecord.publishTimestampMs(), prefetchSnapRecord.lastView()));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: gym$a */
    static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ gym a;
        private /* synthetic */ gyt b;
        private /* synthetic */ FeatureType c;

        a(gym gym, gyt gyt, FeatureType featureType) {
            this.a = gym;
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
                gyr gyr = this.a.d;
                FeatureType featureType = this.c;
                akcr.b(featureType, str);
                gyr.c().bind(featureType);
                gyr.a.executeUpdateDelete(gyr.c());
                this.a.c.a(this.c, dbTransaction);
            } else if (gyt instanceof gyu) {
                long a = this.a.a.a() - TimeUnit.HOURS.toMillis(((gyu) this.b).a.longValue());
                this.a.c.a(a, this.c, dbTransaction);
                gyr gyr2 = this.a.d;
                FeatureType featureType2 = this.c;
                akcr.b(featureType2, str);
                CleanupPublisherSnapsOlderThan cleanupPublisherSnapsOlderThan = new CleanupPublisherSnapsOlderThan(gyr2.d(), PublisherSnapPageRecord.FACTORY);
                cleanupPublisherSnapsOlderThan.bind(a, featureType2);
                BriteDatabaseExtensionsKt.executeDelete(gyr2.a, cleanupPublisherSnapsOlderThan);
            }
            return ajxw.a;
        }
    }

    /* renamed from: gym$h */
    static final class h extends akcs implements akbl<DbTransaction, List<gwu>> {
        private /* synthetic */ gym a;
        private /* synthetic */ Map b;
        private /* synthetic */ FeatureType c;

        h(gym gym, Map map, FeatureType featureType) {
            this.a = gym;
            this.b = map;
            this.c = featureType;
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:96:0x0274  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0258  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0253  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x025e  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0274  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0237  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0232  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x023d  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0253  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0258  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x025e  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0274  */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x02b6  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x02b6  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x011b  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0126  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x02b6  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0105  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x011b  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0126  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x02b6  */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r50) {
            /*
            r49 = this;
            r0 = r49;
            r1 = r50;
            r1 = (com.snap.core.db.api.DbTransaction) r1;
            r2 = "tx";
            defpackage.akcr.b(r1, r2);
            r3 = new java.util.ArrayList;
            r3.<init>();
            r3 = (java.util.List) r3;
            r4 = r0.b;
            r4 = r4.entrySet();
            r4 = r4.iterator();
        L_0x001c:
            r5 = r4.hasNext();
            if (r5 == 0) goto L_0x02d7;
        L_0x0022:
            r5 = r4.next();
            r5 = (java.util.Map.Entry) r5;
            r6 = r5.getKey();
            r6 = (java.lang.String) r6;
            r5 = r5.getValue();
            r5 = (java.util.List) r5;
            r7 = r0.a;
            r7 = r7.c;
            r8 = r0.c;
            r14 = r7.a(r6, r8, r1);
            r7 = new gwu;
            r7.<init>(r6, r14);
            r3.add(r7);
            r5 = r5.iterator();
        L_0x004a:
            r7 = r5.hasNext();
            if (r7 == 0) goto L_0x02d3;
        L_0x0050:
            r7 = r5.next();
            r13 = r7;
            r13 = (defpackage.gwo) r13;
            r7 = r0.a;
            r12 = r0.c;
            r8 = r13.a;
            r35 = 0;
            r10 = (r8 > r35 ? 1 : (r8 == r35 ? 0 : -1));
            if (r10 == 0) goto L_0x02b9;
        L_0x0063:
            r8 = r13.g;
            r8 = (java.lang.CharSequence) r8;
            r8 = android.text.TextUtils.isEmpty(r8);
            if (r8 == 0) goto L_0x006f;
        L_0x006d:
            goto L_0x02b9;
        L_0x006f:
            r10 = r7.d;
            r11 = "publisherSnapData";
            defpackage.akcr.b(r13, r11);
            r8 = "storyId";
            defpackage.akcr.b(r6, r8);
            r9 = "featureType";
            defpackage.akcr.b(r12, r9);
            defpackage.akcr.b(r1, r2);
            r7 = r10.b();
            r50 = r4;
            r42 = r5;
            r4 = r13.b;
            r17 = r11;
            r16 = r12;
            r11 = r13.c;
            r0 = r13.d;
            r18 = r14;
            r14 = r13.e;
            r15 = com.snap.core.db.column.PublisherPageSnapType.Companion;
            r20 = r8;
            r8 = r13.f;
            r8 = r8.name();
            r15 = r15.valueOfIgnoreCase(r8);
            r8 = r13.g;
            r43 = r3;
            r3 = r13.h;
            r22 = r8;
            r21 = r9;
            r8 = r13.i;
            r23 = java.lang.Long.valueOf(r8);
            r8 = r10.b;
            r24 = r8.a();
            r8 = r13.o;
            r37 = 0;
            if (r8 == 0) goto L_0x00c8;
        L_0x00c3:
            r8 = r8.a;
            r26 = r8;
            goto L_0x00ca;
        L_0x00c8:
            r26 = r37;
        L_0x00ca:
            r8 = r13.o;
            if (r8 == 0) goto L_0x00d3;
        L_0x00ce:
            r8 = r8.b;
            r27 = r8;
            goto L_0x00d5;
        L_0x00d3:
            r27 = r37;
        L_0x00d5:
            r8 = r13.o;
            if (r8 == 0) goto L_0x00de;
        L_0x00d9:
            r8 = r8.c;
            r28 = r8;
            goto L_0x00e0;
        L_0x00de:
            r28 = r37;
        L_0x00e0:
            r8 = r13.o;
            if (r8 == 0) goto L_0x00f4;
        L_0x00e4:
            r8 = r8.d;
            if (r8 == 0) goto L_0x00f4;
        L_0x00e8:
            r8 = r8.intValue();
            r8 = (long) r8;
            r8 = java.lang.Long.valueOf(r8);
            r29 = r8;
            goto L_0x00f6;
        L_0x00f4:
            r29 = r37;
        L_0x00f6:
            r8 = r13.o;
            if (r8 == 0) goto L_0x00ff;
        L_0x00fa:
            r8 = r8.e;
            r30 = r8;
            goto L_0x0101;
        L_0x00ff:
            r30 = r37;
        L_0x0101:
            r8 = r13.o;
            if (r8 == 0) goto L_0x0115;
        L_0x0105:
            r8 = r8.f;
            if (r8 == 0) goto L_0x0115;
        L_0x0109:
            r8 = r8.intValue();
            r8 = (long) r8;
            r8 = java.lang.Long.valueOf(r8);
            r31 = r8;
            goto L_0x0117;
        L_0x0115:
            r31 = r37;
        L_0x0117:
            r8 = r13.o;
            if (r8 == 0) goto L_0x0120;
        L_0x011b:
            r8 = r8.g;
            r34 = r8;
            goto L_0x0122;
        L_0x0120:
            r34 = r37;
        L_0x0122:
            r8 = r13.o;
            if (r8 == 0) goto L_0x0136;
        L_0x0126:
            r8 = r8.h;
            if (r8 == 0) goto L_0x0136;
        L_0x012a:
            r8 = r8.intValue();
            r8 = (long) r8;
            r8 = java.lang.Long.valueOf(r8);
            r38 = r8;
            goto L_0x0138;
        L_0x0136:
            r38 = r37;
        L_0x0138:
            r8 = r13.o;
            if (r8 == 0) goto L_0x014c;
        L_0x013c:
            r8 = r8.i;
            if (r8 == 0) goto L_0x014c;
        L_0x0140:
            r8 = r8.intValue();
            r8 = (long) r8;
            r8 = java.lang.Long.valueOf(r8);
            r39 = r8;
            goto L_0x014e;
        L_0x014c:
            r39 = r37;
        L_0x014e:
            r8 = r13.a;
            r32 = r8;
            r44 = r1;
            r45 = r2;
            r2 = r20;
            r1 = r21;
            r20 = r22;
            r8 = r4;
            r4 = r10;
            r5 = r17;
            r10 = r11;
            r40 = r16;
            r12 = r0;
            r0 = r13;
            r13 = r14;
            r46 = r18;
            r14 = r15;
            r15 = r20;
            r16 = r3;
            r17 = r23;
            r18 = r6;
            r19 = r46;
            r21 = r24;
            r23 = r26;
            r24 = r27;
            r25 = r28;
            r26 = r29;
            r27 = r30;
            r28 = r31;
            r29 = r34;
            r30 = r38;
            r31 = r39;
            r34 = r40;
            r7.bind(r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34);
            r3 = r4.a;
            r7 = r4.b();
            r7 = (defpackage.ainy) r7;
            r3 = r3.executeUpdateDelete(r7);
            r7 = (long) r3;
            r3 = (r7 > r35 ? 1 : (r7 == r35 ? 0 : -1));
            if (r3 > 0) goto L_0x02b6;
        L_0x019d:
            defpackage.akcr.b(r0, r5);
            defpackage.akcr.b(r6, r2);
            r2 = r40;
            defpackage.akcr.b(r2, r1);
            r1 = r44;
            r3 = r45;
            defpackage.akcr.b(r1, r3);
            r7 = r4.a();
            r8 = r0.a;
            r13 = r0.b;
            r15 = r0.d;
            r5 = r0.e;
            r10 = com.snap.core.db.column.PublisherPageSnapType.Companion;
            r11 = r0.f;
            r11 = r11.name();
            r17 = r10.valueOfIgnoreCase(r11);
            r11 = r0.g;
            r12 = r0.h;
            r16 = r11;
            r10 = r0.i;
            r20 = java.lang.Long.valueOf(r10);
            r22 = 0;
            r11 = r0.j;
            r10 = r0.k;
            r3 = r0.l;
            r26 = 0;
            r18 = r10;
            r10 = r4.b;
            r27 = r10.a();
            r25 = r3;
            r44 = r4;
            r3 = r0.c;
            r10 = r0.m;
            r48 = r1;
            r1 = r0.n;
            r19 = r10;
            r10 = r0.o;
            if (r10 == 0) goto L_0x01fc;
        L_0x01f7:
            r10 = r10.a;
            r33 = r10;
            goto L_0x01fe;
        L_0x01fc:
            r33 = r37;
        L_0x01fe:
            r10 = r0.o;
            if (r10 == 0) goto L_0x0207;
        L_0x0202:
            r10 = r10.b;
            r34 = r10;
            goto L_0x0209;
        L_0x0207:
            r34 = r37;
        L_0x0209:
            r10 = r0.o;
            if (r10 == 0) goto L_0x0212;
        L_0x020d:
            r10 = r10.c;
            r35 = r10;
            goto L_0x0214;
        L_0x0212:
            r35 = r37;
        L_0x0214:
            r10 = r0.o;
            if (r10 == 0) goto L_0x022a;
        L_0x0218:
            r10 = r10.d;
            if (r10 == 0) goto L_0x022a;
        L_0x021c:
            r10 = r10.intValue();
            r21 = r11;
            r10 = (long) r10;
            r10 = java.lang.Long.valueOf(r10);
            r36 = r10;
            goto L_0x022e;
        L_0x022a:
            r21 = r11;
            r36 = r37;
        L_0x022e:
            r10 = r0.o;
            if (r10 == 0) goto L_0x0237;
        L_0x0232:
            r10 = r10.e;
            r38 = r10;
            goto L_0x0239;
        L_0x0237:
            r38 = r37;
        L_0x0239:
            r10 = r0.o;
            if (r10 == 0) goto L_0x024d;
        L_0x023d:
            r10 = r10.f;
            if (r10 == 0) goto L_0x024d;
        L_0x0241:
            r10 = r10.intValue();
            r10 = (long) r10;
            r10 = java.lang.Long.valueOf(r10);
            r39 = r10;
            goto L_0x024f;
        L_0x024d:
            r39 = r37;
        L_0x024f:
            r10 = r0.o;
            if (r10 == 0) goto L_0x0258;
        L_0x0253:
            r10 = r10.g;
            r40 = r10;
            goto L_0x025a;
        L_0x0258:
            r40 = r37;
        L_0x025a:
            r10 = r0.o;
            if (r10 == 0) goto L_0x026e;
        L_0x025e:
            r10 = r10.h;
            if (r10 == 0) goto L_0x026e;
        L_0x0262:
            r10 = r10.intValue();
            r10 = (long) r10;
            r10 = java.lang.Long.valueOf(r10);
            r41 = r10;
            goto L_0x0270;
        L_0x026e:
            r41 = r37;
        L_0x0270:
            r0 = r0.o;
            if (r0 == 0) goto L_0x0282;
        L_0x0274:
            r0 = r0.i;
            if (r0 == 0) goto L_0x0282;
        L_0x0278:
            r0 = r0.intValue();
            r10 = (long) r0;
            r0 = java.lang.Long.valueOf(r10);
            goto L_0x0284;
        L_0x0282:
            r0 = r37;
        L_0x0284:
            r24 = r18;
            r31 = r19;
            r10 = r6;
            r19 = r12;
            r18 = r16;
            r23 = r21;
            r11 = r46;
            r16 = r5;
            r21 = r2;
            r29 = r3;
            r32 = r1;
            r37 = r38;
            r38 = r39;
            r39 = r40;
            r40 = r41;
            r41 = r0;
            r7.bind(r8, r10, r11, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41);
            r0 = r44;
            r1 = r0.a;
            r0 = r0.a();
            r0 = (defpackage.ainy) r0;
            r2 = r48;
            r1.executeInsert(r0, r2);
            goto L_0x02c4;
        L_0x02b6:
            r2 = r44;
            goto L_0x02c4;
        L_0x02b9:
            r45 = r2;
            r43 = r3;
            r50 = r4;
            r42 = r5;
            r46 = r14;
            r2 = r1;
        L_0x02c4:
            r0 = r49;
            r4 = r50;
            r1 = r2;
            r5 = r42;
            r3 = r43;
            r2 = r45;
            r14 = r46;
            goto L_0x004a;
        L_0x02d3:
            r0 = r49;
            goto L_0x001c;
        L_0x02d7:
            r43 = r3;
            return r43;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gym$h.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gym.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;");
    }

    public gym(ihh ihh, ajwy<SnapDb> ajwy, gyo gyo, gyr gyr) {
        akcr.b(ihh, "clock");
        akcr.b(ajwy, "snapDb");
        akcr.b(gyo, "discoverStoryData");
        akcr.b(gyr, "publisherPageData");
        this.a = ihh;
        this.b = ajwy;
        this.c = gyo;
        this.d = gyr;
    }

    private final DbClient a() {
        return (DbClient) this.e.b();
    }

    public final long a(long j, FeatureType featureType, boolean z) {
        String str = "featureType";
        akcr.b(featureType, str);
        gyr gyr = this.d;
        akcr.b(featureType, str);
        Object unviewedSnapCountIgnoreAds = PublisherSnapPageRecord.FACTORY.getUnviewedSnapCountIgnoreAds(j, featureType, gyr.a(z));
        akcr.a(unviewedSnapCountIgnoreAds, "PublisherSnapPageRecord.…Query(isStorySubscribed))");
        DbClient dbClient = gyr.a;
        Object obj = PublisherSnapPageRecord.FACTORY;
        akcr.a(obj, "PublisherSnapPageRecord.FACTORY");
        obj = obj.getUnviewedSnapCountIgnoreAdsMapper();
        akcr.a(obj, "PublisherSnapPageRecord.…dSnapCountIgnoreAdsMapper");
        unviewedSnapCountIgnoreAds = dbClient.queryFirst(unviewedSnapCountIgnoreAds, obj, Long.valueOf(-1));
        akcr.a(unviewedSnapCountIgnoreAds, "dbClient.queryFirst(stat…CountIgnoreAdsMapper, -1)");
        return ((Number) unviewedSnapCountIgnoreAds).longValue();
    }

    public final ajcx a(gyt gyt, FeatureType featureType) {
        akcr.b(gyt, "strategy");
        akcr.b(featureType, "featureType");
        return a().runInTransaction("PublisherSnapMediaDBRepository:cleanupSnaps", new a(this, gyt, featureType));
    }

    public final ajdp<List<gwi>> a(long j, FeatureType featureType) {
        akcr.b(featureType, "featureType");
        Object p = this.d.a(j, featureType).p(f.a);
        akcr.a(p, "publisherPageData.getPla…)\n            }\n        }");
        return p;
    }

    public final ajdp<List<gwl>> a(long j, FeatureType featureType, int i) {
        String str = "featureType";
        akcr.b(featureType, str);
        gyr gyr = this.d;
        akcr.b(featureType, str);
        Object prefetchPublisherSnaps = PublisherSnapPageRecord.FACTORY.prefetchPublisherSnaps(j, featureType, (long) i);
        akcr.a(prefetchPublisherSnaps, "PublisherSnapPageRecord.…eType, numSnaps.toLong())");
        prefetchPublisherSnaps = gyr.a.queryAndMapToList(prefetchPublisherSnaps, d.a).p(g.a);
        akcr.a(prefetchPublisherSnaps, "publisherPageData.getPre…)\n            }\n        }");
        return prefetchPublisherSnaps;
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

    public final ajdx<List<gwu>> a(Map<String, ? extends List<gwo>> map, FeatureType featureType) {
        akcr.b(map, "storySnapMap");
        akcr.b(featureType, "featureType");
        return a().callInTransaction("PublisherSnapMediaDBRepository:saveSnaps", new h(this, map, featureType));
    }

    public final long b(String str, FeatureType featureType) {
        akcr.b(str, "storyId");
        akcr.b(featureType, "featureType");
        return this.c.b(str, featureType);
    }

    public final String b(long j, FeatureType featureType, boolean z) {
        String str = "featureType";
        akcr.b(featureType, str);
        gyr gyr = this.d;
        akcr.b(featureType, str);
        Object nextSnapIdIgnoreAds = PublisherSnapPageRecord.FACTORY.getNextSnapIdIgnoreAds(j, featureType, gyr.a(z));
        akcr.a(nextSnapIdIgnoreAds, "PublisherSnapPageRecord.…Query(isStorySubscribed))");
        DbClient dbClient = gyr.a;
        Object obj = PublisherSnapPageRecord.FACTORY;
        akcr.a(obj, "PublisherSnapPageRecord.FACTORY");
        obj = obj.getNextSnapIdIgnoreAdsMapper();
        akcr.a(obj, "PublisherSnapPageRecord.…nextSnapIdIgnoreAdsMapper");
        Long l = (Long) dbClient.queryFirst(nextSnapIdIgnoreAds, obj);
        return l != null ? String.valueOf(l.longValue()) : null;
    }

    public final List<gwt> b(long j, FeatureType featureType) {
        FeatureType featureType2 = featureType;
        akcr.b(featureType2, "featureType");
        Iterable<SnapTileInfoRecord> b = this.d.b(j, featureType2);
        Collection arrayList = new ArrayList(ajyn.a((Iterable) b, 10));
        for (SnapTileInfoRecord snapTileInfoRecord : b) {
            Integer num;
            Integer valueOf;
            akcr.b(snapTileInfoRecord, "receiver$0");
            long _id = snapTileInfoRecord._id();
            long pageId = snapTileInfoRecord.pageId();
            String tileId = snapTileInfoRecord.tileId();
            String tileImageUrl = snapTileInfoRecord.tileImageUrl();
            String tileHeadline = snapTileInfoRecord.tileHeadline();
            Long tileProgress = snapTileInfoRecord.tileProgress();
            Integer valueOf2 = tileProgress != null ? Integer.valueOf((int) tileProgress.longValue()) : null;
            String tileShowSubtitle = snapTileInfoRecord.tileShowSubtitle();
            tileProgress = snapTileInfoRecord.tileBadgeSize();
            if (tileProgress != null) {
                num = valueOf2;
                valueOf = Integer.valueOf((int) tileProgress.longValue());
            } else {
                num = valueOf2;
                valueOf = null;
            }
            String tileBadgeTitle = snapTileInfoRecord.tileBadgeTitle();
            tileProgress = snapTileInfoRecord.tileBadgeBgColor();
            Integer valueOf3 = tileProgress != null ? Integer.valueOf((int) tileProgress.longValue()) : null;
            tileProgress = snapTileInfoRecord.tileBadgeTextColor();
            arrayList.add(new gwt(_id, pageId, tileId, tileImageUrl, tileHeadline, num, tileShowSubtitle, valueOf, tileBadgeTitle, valueOf3, tileProgress != null ? Integer.valueOf((int) tileProgress.longValue()) : null, snapTileInfoRecord.lastView()));
        }
        return (List) arrayList;
    }

    public final ajdx<gwq> c(long j, FeatureType featureType) {
        String str = "featureType";
        akcr.b(featureType, str);
        gyr gyr = this.d;
        akcr.b(featureType, str);
        Object pageMediaInfo = PublisherSnapPageRecord.FACTORY.pageMediaInfo(j, featureType);
        akcr.a(pageMediaInfo, "PublisherSnapPageRecord.…Info(pageId, featureType)");
        Object e = gyr.a.queryAndMapToOne(pageMediaInfo, b.a).p(new c(j)).e();
        akcr.a(e, "publisherPageData.getPag…          .firstOrError()");
        return e;
    }

    public final ajdx<gwv> d(long j, FeatureType featureType) {
        String str = "featureType";
        akcr.b(featureType, str);
        gyr gyr = this.d;
        akcr.b(featureType, str);
        Object storyInfo = PublisherSnapPageRecord.FACTORY.storyInfo(j, featureType);
        akcr.a(storyInfo, "PublisherSnapPageRecord.…Info(pageId, featureType)");
        storyInfo = gyr.a.queryAndMapToOne(storyInfo, g.a).p(d.a).e();
        akcr.a(storyInfo, "publisherPageData.getSto…          .firstOrError()");
        return storyInfo;
    }
}
