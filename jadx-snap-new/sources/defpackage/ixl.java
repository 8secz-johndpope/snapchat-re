package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.FriendmojiType;
import com.snap.core.db.record.ChatAttachmentsModel;
import com.snap.core.db.record.FriendModel.UpdateSnapstreak;
import com.snap.core.db.record.FriendmojiModel;
import com.snap.core.db.record.FriendmojiModel.InsertFriendmoji;
import com.snap.core.db.record.FriendmojiRecord;
import com.snap.core.db.record.FriendmojiRecord.FriendmojiDict;
import com.snap.core.db.record.FriendmojiRecord.FriendmojiForType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ixl */
public final class ixl implements iqz {
    private final DbClient a = this.e.getDbClient((ide) irc.t);
    private final ajxe b = ajxh.a(new f(this.a));
    private final ajxe<InsertFriendmoji> c = ajxh.a(new d(this));
    private final ajxe<UpdateSnapstreak> d = ajxh.a(new e(this));
    private final SnapDb e;
    private final kcl f;

    /* renamed from: ixl$f */
    static final class f extends akcq implements akbk<pa> {
        f(DbClient dbClient) {
            super(0, dbClient);
        }

        public final String getName() {
            return "getWritableDatabase";
        }

        public final akej getOwner() {
            return akde.a(DbClient.class);
        }

        public final String getSignature() {
            return "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;";
        }

        public final /* synthetic */ Object invoke() {
            return ((DbClient) this.receiver).getWritableDatabase();
        }
    }

    /* renamed from: ixl$d */
    static final class d extends akcs implements akbk<InsertFriendmoji> {
        private /* synthetic */ ixl a;

        d(ixl ixl) {
            this.a = ixl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertFriendmoji(((pa) this.a.b.b()), FriendmojiRecord.FACTORY);
        }
    }

    /* renamed from: ixl$e */
    static final class e extends akcs implements akbk<UpdateSnapstreak> {
        private /* synthetic */ ixl a;

        e(ixl ixl) {
            this.a = ixl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateSnapstreak(((pa) this.a.b.b()));
        }
    }

    /* renamed from: ixl$b */
    static final class b extends akcq implements akbl<Cursor, FriendmojiDict> {
        b(ainw ainw) {
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
            return (FriendmojiDict) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: ixl$a */
    static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ ixl a;
        private /* synthetic */ Map b;

        a(ixl ixl, Map map) {
            this.a = ixl;
            this.b = map;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            Map map = this.b;
            Collection arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                this.a.a((String) entry.getKey(), (aejy) entry.getValue(), FriendmojiType.MUTABLE, dbTransaction);
                arrayList.add(ajxw.a);
            }
            return ajxw.a;
        }
    }

    /* renamed from: ixl$c */
    static final class c extends akcq implements akbl<Cursor, FriendmojiForType> {
        c(ainw ainw) {
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
            return (FriendmojiForType) ((ainw) this.receiver).map(cursor);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ixl.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;");
    }

    public ixl(SnapDb snapDb, kcl kcl) {
        akcr.b(snapDb, "snapDb");
        akcr.b(kcl, "impalaStudySettings");
        this.e = snapDb;
        this.f = kcl;
    }

    private final void a(String str, aeze aeze) {
        if (aeze.b != null) {
            Long l = aeze.b;
            if (l != null && l.longValue() == 0 && aeze.a != null) {
                return;
            }
            if (aeze.b.longValue() <= 0 || aeze.a != null) {
                this.e.throwIfNotDbScheduler();
                l = aeze.b;
                boolean z = false;
                int longValue = l != null ? (int) l.longValue() : 0;
                Long l2 = aeze.a;
                long longValue2 = l2 != null ? l2.longValue() : -1;
                if (longValue == 0) {
                    z = true;
                }
                UpdateSnapstreak updateSnapstreak = (UpdateSnapstreak) this.d.b();
                updateSnapstreak.bind(Integer.valueOf(longValue), Long.valueOf(longValue2), Boolean.valueOf(z), Boolean.valueOf(z), str);
                this.a.executeUpdateDelete(updateSnapstreak);
            }
        }
    }

    public final ajcx a(Map<String, ? extends aejy> map) {
        akcr.b(map, "friendmojiData");
        return this.a.runInTransaction("friedmojiData", new a(this, map));
    }

    public final ajdp<List<FriendmojiDict>> a() {
        Object obj = FriendmojiRecord.FACTORY;
        akcr.a(obj, "FriendmojiRecord.FACTORY");
        obj = obj.getFriendmojiForCategoryWithoutOfficialStories();
        akcr.a(obj, "if (impalaStudySettings.…rd.FACTORY.friendmojiDict");
        return this.a.queryAndMapToList(obj, new b(FriendmojiRecord.FRIENDMOJI_CATEGORIES_DICT_ROW_MAPPER));
    }

    public final ajdp<List<FriendmojiForType>> a(FriendmojiType friendmojiType) {
        akcr.b(friendmojiType, FriendmojiModel.FRIENDMOJITYPE);
        DbClient dbClient = this.a;
        Object friendmojiForType = FriendmojiRecord.FACTORY.getFriendmojiForType(friendmojiType);
        akcr.a(friendmojiForType, "FriendmojiRecord.FACTORY…jiForType(friendmojiType)");
        return dbClient.queryAndMapToList(friendmojiForType, new c(FriendmojiRecord.FRIENDMOJI_FOR_TYPE_ROW_MAPPER));
    }

    public final void a(aemz aemz, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aemz, "friendsResponse");
        akcr.b(snapDb, "snapDb");
        akcr.b(dbTransaction, "tx");
        Map map = aemz.f;
        if (map != null) {
            a(map, FriendmojiType.MUTABLE, snapDb, dbTransaction);
        }
        Map map2 = aemz.g;
        if (map2 != null) {
            a(map2, FriendmojiType.READ_ONLY, snapDb, dbTransaction);
        }
    }

    public final void a(aevu aevu) {
        akcr.b(aevu, "receivedSnapMessage");
        aeze aeze = aevu.J;
        if (aeze != null) {
            Object obj = aevu.i.a;
            akcr.a(obj, "receivedSnapMessage.header.from");
            a(obj, aeze);
        }
    }

    public final void a(DbTransaction dbTransaction, aeze aeze, String str) {
        akcr.b(dbTransaction, "tx");
        akcr.b(str, ChatAttachmentsModel.SENDERUSERNAME);
        if (aeze != null) {
            a(str, aeze);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    public final void a(java.lang.String r10, defpackage.aejy r11, com.snap.core.db.column.FriendmojiType r12, com.snap.core.db.api.DbTransaction r13) {
        /*
        r9 = this;
        r0 = r9.c;
        r0 = r0.b();
        r0 = (com.snap.core.db.record.FriendmojiModel.InsertFriendmoji) r0;
        r1 = 0;
        if (r11 == 0) goto L_0x000f;
    L_0x000b:
        r2 = r11.b;
        r3 = r2;
        goto L_0x0010;
    L_0x000f:
        r3 = r1;
    L_0x0010:
        if (r11 == 0) goto L_0x0021;
    L_0x0012:
        r2 = r11.h;
        if (r2 == 0) goto L_0x0021;
    L_0x0016:
        r2 = r2.intValue();
        r4 = (long) r2;
        r2 = java.lang.Long.valueOf(r4);
        r4 = r2;
        goto L_0x0022;
    L_0x0021:
        r4 = r1;
    L_0x0022:
        if (r11 == 0) goto L_0x0028;
    L_0x0024:
        r2 = r11.c;
        r5 = r2;
        goto L_0x0029;
    L_0x0028:
        r5 = r1;
    L_0x0029:
        if (r11 == 0) goto L_0x002f;
    L_0x002b:
        r2 = r11.d;
        r6 = r2;
        goto L_0x0030;
    L_0x002f:
        r6 = r1;
    L_0x0030:
        if (r11 == 0) goto L_0x0036;
    L_0x0032:
        r11 = r11.e;
        r7 = r11;
        goto L_0x0037;
    L_0x0036:
        r7 = r1;
    L_0x0037:
        r1 = r0;
        r2 = r10;
        r8 = r12;
        r1.bind(r2, r3, r4, r5, r6, r7, r8);
        r10 = r9.a;
        r0 = (defpackage.ainy) r0;
        r10.executeInsert(r0, r13);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixl.a(java.lang.String, aejy, com.snap.core.db.column.FriendmojiType, com.snap.core.db.api.DbTransaction):void");
    }

    public final void a(Map<String, ? extends aejy> map, FriendmojiType friendmojiType, SnapDb snapDb, DbTransaction dbTransaction) {
        snapDb.throwIfNotDbScheduler();
        Collection arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (aejy) entry.getValue(), friendmojiType, dbTransaction);
            arrayList.add(ajxw.a);
        }
    }

    public final void b(Map<String, ? extends aezc> map) {
        akcr.b(map, "snapStreakData");
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            aezc aezc = (aezc) entry.getValue();
            aeze aeze = new aeze();
            aeze.a = aezc.a;
            aeze.b = aezc.b;
            a(str, aeze);
        }
    }
}
