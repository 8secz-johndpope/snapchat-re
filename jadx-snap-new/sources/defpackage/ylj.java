package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.FeedModel;
import com.snap.core.db.record.LegacyStoryQueries;
import com.snap.core.db.record.StoryModel.InsertGroupStory;
import com.snap.core.db.record.StoryModel.UpdateGroupStory;
import com.snap.core.db.record.StoryRecord;

/* renamed from: ylj */
public final class ylj extends ylo {
    public final DbClient a;
    private final ajxe b = ajxh.a(new d(this));
    private final ajxe d = ajxh.a(new e(this));
    private final ajxe e = ajxh.a(new a(this));
    private final ajxe f = ajxh.a(new b(this));

    /* renamed from: ylj$d */
    static final class d extends akcs implements akbk<InsertGroupStory> {
        private /* synthetic */ ylj a;

        d(ylj ylj) {
            this.a = ylj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertGroupStory(this.a.a.getWritableDatabase(), StoryRecord.FACTORY);
        }
    }

    /* renamed from: ylj$e */
    static final class e extends akcs implements akbk<UpdateGroupStory> {
        private /* synthetic */ ylj a;

        e(ylj ylj) {
            this.a = ylj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateGroupStory(this.a.a.getWritableDatabase(), StoryRecord.FACTORY);
        }
    }

    /* renamed from: ylj$a */
    static final class a extends akcs implements akbk<FeedModel.InsertGroupStory> {
        private /* synthetic */ ylj a;

        a(ylj ylj) {
            this.a = ylj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new FeedModel.InsertGroupStory(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ylj$b */
    static final class b extends akcs implements akbk<FeedModel.UpdateGroupStory> {
        private /* synthetic */ ylj a;

        b(ylj ylj) {
            this.a = ylj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new FeedModel.UpdateGroupStory(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: ylj$c */
    public static final class c extends akcs implements akbl<Cursor, String> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return (String) LegacyStoryQueries.SELECT_GROUP_IDS_MAPPER.map(cursor);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ylj.class), "groupStoryInsert", "getGroupStoryInsert()Lcom/snap/core/db/record/StoryModel$InsertGroupStory;"), new akdc(akde.a(ylj.class), "groupStoryUpdate", "getGroupStoryUpdate()Lcom/snap/core/db/record/StoryModel$UpdateGroupStory;"), new akdc(akde.a(ylj.class), "feedGroupInsert", "getFeedGroupInsert()Lcom/snap/core/db/record/FeedModel$InsertGroupStory;"), new akdc(akde.a(ylj.class), "feedGroupUpdate", "getFeedGroupUpdate()Lcom/snap/core/db/record/FeedModel$UpdateGroupStory;")};
    }

    public ylj(SnapDb snapDb) {
        akcr.b(snapDb, "snapDb");
        super(snapDb);
        this.a = snapDb.getDbClient((ide) yhy.j);
    }

    private final Integer a(long j, agdu agdu) {
        agec agec = agdu.c;
        if (agec != null) {
            agdn agdn = agec.d;
            if (agdn != null) {
                String str = agdn.b;
                if (str != null) {
                    e().bind(Long.valueOf(j), str);
                    return Integer.valueOf(this.a.executeUpdateDelete(e()));
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    private static java.lang.String a(defpackage.agdu r2) {
        /*
        r0 = r2.a();
        r1 = "groupStory.typeValEnum";
        defpackage.akcr.a(r0, r1);
        r0 = defpackage.ylw.a(r0);
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        goto L_0x001b;
    L_0x0010:
        r1 = defpackage.ylk.b;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r1 = 1;
        if (r0 == r1) goto L_0x001e;
    L_0x001b:
        r2 = r2.g;
        goto L_0x002f;
    L_0x001e:
        r2 = r2.c;
        if (r2 == 0) goto L_0x0029;
    L_0x0022:
        r2 = r2.d;
        if (r2 == 0) goto L_0x0029;
    L_0x0026:
        r2 = r2.b;
        goto L_0x002a;
    L_0x0029:
        r2 = 0;
    L_0x002a:
        if (r2 != 0) goto L_0x002f;
    L_0x002c:
        defpackage.akcr.a();
    L_0x002f:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylj.a(agdu):java.lang.String");
    }

    private final InsertGroupStory c() {
        return (InsertGroupStory) this.b.b();
    }

    private final UpdateGroupStory d() {
        return (UpdateGroupStory) this.d.b();
    }

    private final FeedModel.UpdateGroupStory e() {
        return (FeedModel.UpdateGroupStory) this.f.b();
    }

    public final long a(DbTransaction dbTransaction, agdu agdu, String str) {
        long longValue;
        akcr.b(dbTransaction, "tx");
        akcr.b(agdu, "groupStory");
        dbTransaction.checkInTransaction();
        ageb a = agdu.a();
        if (a == null || ylk.a[a.ordinal()] != 1) {
            str = agdu.d;
        }
        String str2 = str;
        Object obj = agdu.a;
        akcr.a(obj, "groupStory.id");
        Long a2 = a((String) obj, StoryKind.GROUP);
        boolean z = false;
        if (a2 != null) {
            longValue = a2.longValue();
            UpdateGroupStory d = d();
            String a3 = ylj.a(agdu);
            Object a4 = agdu.a();
            akcr.a(a4, "groupStory.typeValEnum");
            d.bind(str2, a3, ylw.a(a4), longValue);
            this.a.executeUpdateDelete(d());
        } else {
            longValue = a(dbTransaction, agdu, str2, false);
        }
        if (longValue != -1) {
            z = true;
        }
        if (z) {
            a(longValue, agdu);
            return longValue;
        }
        throw new IllegalStateException("Error in upsertGroupStory, invalid storyRowId!".toString());
    }

    public final long a(DbTransaction dbTransaction, agdu agdu, String str, boolean z) {
        akcr.b(dbTransaction, "tx");
        akcr.b(agdu, "groupStory");
        dbTransaction.checkInTransaction();
        InsertGroupStory c = c();
        String str2 = agdu.a;
        StoryKind storyKind = StoryKind.GROUP;
        String a = ylj.a(agdu);
        Object a2 = agdu.a();
        akcr.a(a2, "groupStory.typeValEnum");
        c.bind(str2, storyKind, a, str, ylw.a(a2), Boolean.valueOf(z));
        return this.a.executeInsert(c(), dbTransaction);
    }
}
