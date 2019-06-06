package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StoryModel.UpdateStoryPostability;
import com.snap.core.db.record.StoryRecord;
import java.util.List;

/* renamed from: ylm */
public final class ylm extends ylo {
    public final DbClient a;
    public final ajwy<yln> b;
    private final ajxe d = ajxh.a(new c(this));

    /* renamed from: ylm$c */
    static final class c extends akcs implements akbk<UpdateStoryPostability> {
        private /* synthetic */ ylm a;

        c(ylm ylm) {
            this.a = ylm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateStoryPostability(this.a.a.getWritableDatabase(), StoryRecord.FACTORY);
        }
    }

    /* renamed from: ylm$b */
    public static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "it");
            return Boolean.valueOf(l.longValue() > 0);
        }
    }

    /* renamed from: ylm$a */
    public static final class a extends akcq implements akbl<Cursor, Long> {
        public a(ainw ainw) {
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
            return (Long) ((ainw) this.receiver).map(cursor);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ylm.class), "updateStoryPostability", "getUpdateStoryPostability()Lcom/snap/core/db/record/StoryModel$UpdateStoryPostability;");
    }

    public ylm(SnapDb snapDb, ajwy<yln> ajwy) {
        akcr.b(snapDb, "snapDb");
        akcr.b(ajwy, "postableStoryMetadataData");
        super(snapDb);
        this.b = ajwy;
        this.a = snapDb.getDbClient((ide) yhy.j);
    }

    private final long b(DbTransaction dbTransaction, aikk aikk) {
        aikk aikk2 = aikk;
        dbTransaction.checkInTransaction();
        Object obj = aikk2.a;
        String str = "officialAccount.username";
        akcr.a(obj, str);
        long a = a(dbTransaction, obj, StoryKind.OFFICIAL);
        if (a != -1) {
            return a;
        }
        Object obj2 = aikk2.a;
        akcr.a(obj2, str);
        return ylo.a(this, dbTransaction, obj2, StoryKind.OFFICIAL, aikk2.a, aikk2.d, null, null, null, null, true, 480);
    }

    private final UpdateStoryPostability c() {
        return (UpdateStoryPostability) this.d.b();
    }

    public final int a(DbTransaction dbTransaction, String str, StoryKind storyKind, boolean z) {
        akcr.b(dbTransaction, "tx");
        akcr.b(str, "storyId");
        akcr.b(storyKind, "storyKind");
        dbTransaction.checkInTransaction();
        c().bind(Boolean.valueOf(z), str, storyKind);
        return this.a.executeUpdateDelete(c());
    }

    public final long a(DbTransaction dbTransaction, aikk aikk) {
        aikk aikk2 = aikk;
        DbTransaction dbTransaction2 = dbTransaction;
        akcr.b(dbTransaction2, "tx");
        akcr.b(aikk2, "officialAccount");
        dbTransaction.checkInTransaction();
        long b = b(dbTransaction, aikk);
        yln yln = (yln) this.b.get();
        Object obj = aikk2.a;
        akcr.a(obj, "officialAccount.username");
        yln.a(yln, dbTransaction2, b, obj, null, null, null, null, null, null, 4088);
        return b;
    }

    /* JADX WARNING: Missing block: B:7:0x0046, code skipped:
            if (a(r6, r7, r8, true) != 0) goto L_0x004b;
     */
    public final long a(com.snap.core.db.api.DbTransaction r6, java.lang.String r7, com.snap.core.db.column.StoryKind r8) {
        /*
        r5 = this;
        r6.checkInTransaction();
        r0 = com.snap.core.db.record.StoryRecord.FACTORY;
        r0 = r0.getStoryRowIdByStoryKey(r7, r8);
        r1 = "StoryRecord.FACTORY.getS…ryKey(storyId, storyKind)";
        defpackage.akcr.a(r0, r1);
        r1 = r5.a;
        r0 = r1.query(r0);
        r0 = (java.io.Closeable) r0;
        r1 = 0;
        r2 = r0;
        r2 = (android.database.Cursor) r2;	 Catch:{ Throwable -> 0x0051 }
        r3 = r2.moveToFirst();	 Catch:{ Throwable -> 0x0051 }
        if (r3 == 0) goto L_0x0049;
    L_0x0020:
        r3 = 0;
        r3 = r2.isNull(r3);	 Catch:{ Throwable -> 0x0051 }
        if (r3 != 0) goto L_0x0049;
    L_0x0027:
        r3 = com.snap.core.db.record.StoryRecord.FACTORY;	 Catch:{ Throwable -> 0x0051 }
        r4 = "StoryRecord.FACTORY";
        defpackage.akcr.a(r3, r4);	 Catch:{ Throwable -> 0x0051 }
        r3 = r3.getStoryRowIdByStoryKeyMapper();	 Catch:{ Throwable -> 0x0051 }
        r2 = r3.map(r2);	 Catch:{ Throwable -> 0x0051 }
        r3 = "StoryRecord.FACTORY.stor…toryKeyMapper.map(cursor)";
        defpackage.akcr.a(r2, r3);	 Catch:{ Throwable -> 0x0051 }
        r2 = (java.lang.Number) r2;	 Catch:{ Throwable -> 0x0051 }
        r2 = r2.longValue();	 Catch:{ Throwable -> 0x0051 }
        r4 = 1;
        r6 = r5.a(r6, r7, r8, r4);	 Catch:{ Throwable -> 0x0051 }
        if (r6 == 0) goto L_0x0049;
    L_0x0048:
        goto L_0x004b;
    L_0x0049:
        r2 = -1;
    L_0x004b:
        defpackage.akax.a(r0, r1);
        return r2;
    L_0x004f:
        r6 = move-exception;
        goto L_0x0054;
    L_0x0051:
        r6 = move-exception;
        r1 = r6;
        throw r1;	 Catch:{ all -> 0x004f }
    L_0x0054:
        defpackage.akax.a(r0, r1);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylm.a(com.snap.core.db.api.DbTransaction, java.lang.String, com.snap.core.db.column.StoryKind):long");
    }

    public final List<String> a(StoryKind storyKind) {
        akcr.b(storyKind, "kind");
        DbClient dbClient = this.a;
        Object postableStoryKeyForStoryKind = StoryRecord.FACTORY.getPostableStoryKeyForStoryKind(storyKind);
        akcr.a(postableStoryKeyForStoryKind, "StoryRecord.FACTORY.getP…toryKeyForStoryKind(kind)");
        Object obj = StoryRecord.FACTORY;
        akcr.a(obj, "StoryRecord.FACTORY");
        obj = obj.getPostableStoryKeyForStoryKindMapper();
        akcr.a(obj, "StoryRecord.FACTORY.post…toryKeyForStoryKindMapper");
        return dbClient.query(postableStoryKeyForStoryKind, obj);
    }
}
