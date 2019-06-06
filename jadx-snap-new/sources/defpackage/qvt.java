package defpackage;

import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.LegacyMessagingSnapQueries;
import com.snap.core.db.record.MessageModel.DropMessagesByType;
import com.snap.core.db.record.MessagingSnapModel.GetAllMessagingSnapsModel;
import com.snap.core.db.record.MessagingSnapRecord;
import com.snap.core.db.record.NetworkMessageModel.DeleteMessagesOfType;
import com.snap.core.db.record.NetworkMessageRecord;
import com.snap.core.db.record.SequenceNumbersModel.DropAllSequenceNumbers;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: qvt */
public final class qvt implements psq {
    final idd a = pry.a.callsite("SnapRefactorMigratorImpl");
    final DbClient b;
    final ajxe c;
    boolean d;
    final ajwy<ftl> e;
    final ajwy<gqr> f;
    private final ajwy<qvi> g;
    private final ajwy<qux> h;

    /* renamed from: qvt$a */
    static final class a extends akcs implements akbk<DropAllSequenceNumbers> {
        private /* synthetic */ qvt a;

        a(qvt qvt) {
            this.a = qvt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DropAllSequenceNumbers(this.a.b.getWritableDatabase());
        }
    }

    /* renamed from: qvt$b */
    static final class b<T> implements ajfl<Boolean> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: qvt$c */
    static final class c<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ qvt a;

        c(qvt qvt) {
            this.a = qvt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return ((ftl) this.a.e.get()).b((fth) qpy.ENABLE_SNAP_DATA_REFACTOR).h();
        }
    }

    /* renamed from: qvt$d */
    static final class d<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ qvt a;

        d(qvt qvt) {
            this.a = qvt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            this.a.d = bool.booleanValue();
            qvt qvt;
            if (bool.booleanValue()) {
                qvt = this.a;
                return qvt.b.runInTransaction("SnapRefactorMigration", new f(qvt)).g();
            }
            qvt = this.a;
            obj = ajdx.c((Callable) new g(qvt)).a((ajfc) new h(qvt));
            akcr.a(obj, "Single.fromCallable {\n  …  }\n                    }");
            return obj.h();
        }
    }

    /* renamed from: qvt$e */
    static final class e<T, R> implements ajfc<Throwable, ajeb<? extends Boolean>> {
        private /* synthetic */ qvt a;

        e(qvt qvt) {
            this.a = qvt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "throwable");
            ((gqr) this.a.f.get()).a(gqt.HIGH, th, this.a.a);
            this.a.d = true;
            return ajdx.b(Boolean.FALSE);
        }
    }

    /* renamed from: qvt$g */
    static final class g<V> implements Callable<T> {
        private /* synthetic */ qvt a;

        g(qvt qvt) {
            this.a = qvt;
        }

        public final /* synthetic */ Object call() {
            DbClient dbClient = this.a.b;
            Object checkForMessagesOfType = NetworkMessageRecord.FACTORY.checkForMessagesOfType(aesq.SNAP.a());
            akcr.a(checkForMessagesOfType, "NetworkMessageRecord.FAC…ageBodyType.SNAP.value())");
            Object checkForMessagesOfTypeMapper = NetworkMessageRecord.FACTORY.checkForMessagesOfTypeMapper();
            akcr.a(checkForMessagesOfTypeMapper, "NetworkMessageRecord.FAC…ForMessagesOfTypeMapper()");
            return Boolean.valueOf(dbClient.queryFirst(checkForMessagesOfType, checkForMessagesOfTypeMapper) != null);
        }
    }

    /* renamed from: qvt$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ qvt a;

        /* renamed from: qvt$h$1 */
        static final class 1 extends akcs implements akbl<DbTransaction, ajxw> {
            private /* synthetic */ h a;

            1(h hVar) {
                this.a = hVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                DbTransaction dbTransaction = (DbTransaction) obj;
                akcr.b(dbTransaction, "tx");
                DropMessagesByType dropMessagesByType = new DropMessagesByType(this.a.a.b.getWritableDatabase());
                dropMessagesByType.bind(aesq.SNAP.a());
                DeleteMessagesOfType deleteMessagesOfType = new DeleteMessagesOfType(this.a.a.b.getWritableDatabase());
                deleteMessagesOfType.bind(aesq.SNAP.a());
                Object obj2 = this.a.a.b;
                String str = "dbClient";
                akcr.a(obj2, str);
                BriteDatabaseExtensionsKt.executeDelete(obj2, dropMessagesByType, dbTransaction);
                Object obj3 = this.a.a.b;
                akcr.a(obj3, str);
                BriteDatabaseExtensionsKt.executeDelete(obj3, deleteMessagesOfType, dbTransaction);
                obj3 = this.a.a.b;
                akcr.a(obj3, str);
                BriteDatabaseExtensionsKt.executeDelete(obj3, (DropAllSequenceNumbers) this.a.a.c.b(), dbTransaction);
                return ajxw.a;
            }
        }

        h(qvt qvt) {
            this.a = qvt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            if (!bool.booleanValue()) {
                return ajdx.b(Boolean.FALSE);
            }
            return this.a.b.runInTransaction("SnapRefactorMigratorImpl:revertSnapRefactor", new 1(this)).b((ajeb) ajdx.b(Boolean.TRUE));
        }
    }

    /* renamed from: qvt$f */
    static final class f extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ qvt a;

        f(qvt qvt) {
            this.a = qvt;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            this.a.a(dbTransaction);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(qvt.class), "deleteAllSequenceNumbers", "getDeleteAllSequenceNumbers()Lcom/snap/core/db/record/SequenceNumbersModel$DropAllSequenceNumbers;");
    }

    public qvt(SnapDb snapDb, ajwy<qvi> ajwy, ajwy<ftl> ajwy2, ajwy<gqr> ajwy3, ajwy<qux> ajwy4) {
        akcr.b(snapDb, "snapDb");
        akcr.b(ajwy, "networkMessageProcessor");
        akcr.b(ajwy2, "configProvider");
        akcr.b(ajwy3, "exceptionTracker");
        akcr.b(ajwy4, "messageCleaner");
        this.g = ajwy;
        this.e = ajwy2;
        this.f = ajwy3;
        this.h = ajwy4;
        this.b = snapDb.getDbClient(this.a);
        this.c = ajxh.a(new a(this));
        this.d = true;
    }

    private final List<GetAllMessagingSnapsModel> b() {
        DbClient dbClient = this.b;
        Object obj = MessagingSnapRecord.FACTORY;
        akcr.a(obj, "MessagingSnapRecord.FACTORY");
        obj = obj.getAllMessagingSnaps();
        akcr.a(obj, "MessagingSnapRecord.FACTORY.allMessagingSnaps");
        Object obj2 = LegacyMessagingSnapQueries.GET_ALL_MESSAGING_SNAPS_LIMT_100_ROW_MAPPER;
        akcr.a(obj2, "LegacyMessagingSnapQueri…SNAPS_LIMT_100_ROW_MAPPER");
        return dbClient.query(obj, obj2);
    }

    public final ajdx<Boolean> a() {
        Object h = ajdx.b(Boolean.valueOf(this.d)).a((ajfl) b.a).a((ajfc) new c(this)).a((ajfc) new d(this)).a((ajeb) ajdx.b(Boolean.FALSE)).h(new e(this));
        akcr.a(h, "Single.just(shouldPerfor…se)\n                    }");
        return h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d0 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0192  */
    public final void a(com.snap.core.db.api.DbTransaction r36) {
        /*
        r35 = this;
        r0 = r35;
        r1 = r36;
        r2 = "tx";
        defpackage.akcr.b(r1, r2);
        r2 = r0.b;
        r2.throwIfNotDbScheduler();
        r2 = r0.d;
        if (r2 != 0) goto L_0x0013;
    L_0x0012:
        return;
    L_0x0013:
        r2 = r35.b();
        r3 = r2;
        r3 = (java.util.Collection) r3;
        r3 = r3.isEmpty();
        r4 = 1;
        r3 = r3 ^ r4;
        r5 = 0;
        if (r3 == 0) goto L_0x0204;
    L_0x0023:
        r2 = (java.lang.Iterable) r2;
        r2 = r2.iterator();
    L_0x0029:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0013;
    L_0x002f:
        r3 = r2.next();
        r3 = (com.snap.core.db.record.MessagingSnapModel.GetAllMessagingSnapsModel) r3;
        r6 = r3.cognacAttachmentUri();
        r7 = 0;
        if (r6 == 0) goto L_0x008c;
    L_0x003c:
        r6 = android.net.Uri.parse(r6);
        r8 = "Uri.parse(it)";
        defpackage.akcr.a(r6, r8);
        r6 = defpackage.ffq.a.a(r6);
        r8 = r6.a;
        r8 = java.util.UUID.fromString(r8);
        r9 = new alqi;
        r9.<init>();
        r10 = new aler;
        r10.<init>();
        r11 = "javaUUID";
        defpackage.akcr.a(r8, r11);
        r11 = r8.getMostSignificantBits();
        r10 = r10.a(r11);
        r11 = r8.getLeastSignificantBits();
        r8 = r10.b(r11);
        r9.a = r8;
        r8 = r6.b;
        r9.a(r8);
        r8 = r6.c;
        r9.c(r8);
        r8 = r6.d;
        r9.d(r8);
        r8 = r6.f;
        r9.b(r8);
        r6 = r6.e;
        r9.e(r6);
        r17 = r9;
        goto L_0x008e;
    L_0x008c:
        r17 = r7;
    L_0x008e:
        r6 = new pun;
        r9 = new pse;
        r8 = "legacySnap";
        defpackage.akcr.a(r3, r8);
        r8 = r3.isInfiniteDuration();
        r11 = java.lang.Boolean.valueOf(r8);
        r12 = r3.durationInMs();
        r12 = (double) r12;
        r14 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        java.lang.Double.isNaN(r12);
        r12 = r12 / r14;
        r12 = java.lang.Double.valueOf(r12);
        r8 = r3.geofilterMetadata();
        if (r8 == 0) goto L_0x00bd;
    L_0x00b7:
        r8 = r8.getEncGeoData();
        r13 = r8;
        goto L_0x00be;
    L_0x00bd:
        r13 = r7;
    L_0x00be:
        r8 = r3.snappableLensMetadata();
        if (r8 == 0) goto L_0x00ca;
    L_0x00c4:
        r8 = r8.getLensMetadata();
        r14 = r8;
        goto L_0x00cb;
    L_0x00ca:
        r14 = r7;
    L_0x00cb:
        r15 = 0;
        r16 = r3.attachmentUrl();
        r8 = r3.geofilterMetadata();
        if (r8 == 0) goto L_0x00dd;
    L_0x00d6:
        r8 = r8.getVenueId();
        r18 = r8;
        goto L_0x00df;
    L_0x00dd:
        r18 = r7;
    L_0x00df:
        r8 = r3.geofilterMetadata();
        if (r8 == 0) goto L_0x00ec;
    L_0x00e5:
        r8 = r8.getUnlockablesSnapInfo();
        r19 = r8;
        goto L_0x00ee;
    L_0x00ec:
        r19 = r7;
    L_0x00ee:
        r20 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r10 = r9;
        r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r10 = r3.directDownloadUrl();
        r8 = r3.Message_mediaId();
        if (r8 != 0) goto L_0x010d;
    L_0x00fe:
        r8 = r3.kind();
        r11 = com.snap.core.db.column.FeedKind.DIRECT;
        if (r8 != r11) goto L_0x010b;
    L_0x0106:
        r8 = r3.snapId();
        goto L_0x010d;
    L_0x010b:
        r11 = r7;
        goto L_0x010e;
    L_0x010d:
        r11 = r8;
    L_0x010e:
        r12 = r3.mediaKey();
        r13 = r3.mediaIv();
        r14 = r3.snapType();
        r15 = 0;
        r16 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r8 = r6;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16);
        r8 = r3.snapId();
        r9 = "legacySnap.snapId()";
        defpackage.akcr.a(r8, r9);
        r9 = r3.key();
        r10 = "legacySnap.key()";
        defpackage.akcr.a(r9, r10);
        r20 = r3.timestamp();
        r10 = r3.senderId();
        if (r10 != 0) goto L_0x0140;
    L_0x013d:
        defpackage.akcr.a();
    L_0x0140:
        r11 = "legacySnap.senderId()!!";
        defpackage.akcr.a(r10, r11);
        r22 = r10.longValue();
        r10 = r3.sequenceNumber();
        if (r10 != 0) goto L_0x0155;
    L_0x014f:
        r10 = 0;
        r10 = java.lang.Long.valueOf(r10);
    L_0x0155:
        r24 = r10.longValue();
        r10 = r3.clientStatus();
        if (r10 != 0) goto L_0x0161;
    L_0x015f:
        r10 = com.snap.core.db.column.MessageClientStatus.OK;
    L_0x0161:
        r26 = r10;
        r10 = defpackage.aesq.SNAP;
        r10 = r10.a();
        r11 = "MessageBodyType.SNAP.value()";
        defpackage.akcr.a(r10, r11);
        r28 = r6;
        r28 = (defpackage.puk) r28;
        r29 = defpackage.gcj.INITIAL;
        r6 = r3.screenshottedOrReplayed();
        if (r6 != 0) goto L_0x0180;
    L_0x017a:
        r6 = com.snap.core.db.column.ScreenshottedOrReplayedState.Companion;
        r6 = r6.empty();
    L_0x0180:
        r31 = r6;
        r6 = r3.serverStatus();
        if (r6 != 0) goto L_0x018a;
    L_0x0188:
        r6 = com.snap.core.db.column.SnapServerStatus.VIEWED;
    L_0x018a:
        r32 = r6;
        r6 = r3.viewerList();
        if (r6 == 0) goto L_0x01d0;
    L_0x0192:
        r6 = (java.lang.CharSequence) r6;
        r11 = new char[r4];
        r12 = 44;
        r11[r5] = r12;
        r6 = defpackage.akgc.b(r6, r11);
        if (r6 == 0) goto L_0x01d0;
    L_0x01a0:
        r6 = (java.lang.Iterable) r6;
        r7 = new java.util.ArrayList;
        r7.<init>();
        r7 = (java.util.Collection) r7;
        r6 = r6.iterator();
    L_0x01ad:
        r11 = r6.hasNext();
        if (r11 == 0) goto L_0x01c3;
    L_0x01b3:
        r11 = r6.next();
        r11 = (java.lang.String) r11;
        r11 = defpackage.akga.f(r11);
        if (r11 == 0) goto L_0x01ad;
    L_0x01bf:
        r7.add(r11);
        goto L_0x01ad;
    L_0x01c3:
        r7 = (java.util.List) r7;
        r7 = (java.util.Collection) r7;
        r6 = defpackage.ajyu.g(r7);
        r7 = new yfj;
        r7.<init>(r6);
    L_0x01d0:
        r33 = r7;
        r6 = new qdr;
        r17 = r6;
        r30 = 0;
        r34 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r18 = r8;
        r19 = r9;
        r27 = r10;
        r17.<init>(r18, r19, r20, r22, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34);
        r7 = r0.h;
        r7 = r7.get();
        r7 = (defpackage.qux) r7;
        r3 = r3.snapId();
        r3 = defpackage.ajyl.a(r3);
        r7.b(r3);
        r3 = r0.g;
        r3 = r3.get();
        r3 = (defpackage.qvi) r3;
        r3.a(r6, r1);
        goto L_0x0029;
    L_0x0204:
        r0.d = r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvt.a(com.snap.core.db.api.DbTransaction):void");
    }
}
