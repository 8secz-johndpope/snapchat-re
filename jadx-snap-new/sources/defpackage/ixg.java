package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbManager;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.record.FriendModel.Factory;
import com.snap.core.db.record.FriendModel.InsertUsername;
import com.snap.core.db.record.FriendRecord;
import com.snap.core.db.record.FriendRecord.FriendId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: ixg */
public class ixg implements ixi {
    final ajxe a = ajxh.a(new g(this));
    final jb<String, Long> b = new jb(Callback.DEFAULT_DRAG_ANIMATION_DURATION);
    akbw<? super String, ? super DbTransaction, Long> c = new d(this);
    akbw<? super Collection<String>, ? super DbTransaction, ? extends Map<String, Long>> d = new e(this);
    final iqc e;
    private final ajxe f;
    private final ajxe g = ajxh.a(new f(this));
    private akbl<? super Collection<String>, ? extends Map<String, Long>> h = new c(this);

    /* renamed from: ixg$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ DbManager a;

        a(DbManager dbManager) {
            this.a = dbManager;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.getDbClient(irc.t.callsite("FriendIdRepository"));
        }
    }

    /* renamed from: ixg$g */
    static final class g extends akcs implements akbk<pa> {
        private /* synthetic */ ixg a;

        g(ixg ixg) {
            this.a = ixg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a().getWritableDatabase();
        }
    }

    /* renamed from: ixg$f */
    static final class f extends akcs implements akbk<InsertUsername> {
        private /* synthetic */ ixg a;

        f(ixg ixg) {
            this.a = ixg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertUsername((pa) this.a.a.b());
        }
    }

    /* renamed from: ixg$c */
    static final class c extends akcs implements akbl<Collection<? extends String>, Map<String, Long>> {
        private /* synthetic */ ixg a;

        c(ixg ixg) {
            this.a = ixg;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Collection collection = (Collection) obj;
            akcr.b(collection, "usernames");
            Set linkedHashSet = new LinkedHashSet();
            Iterable<Object> iterable = collection;
            Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
            for (Object obj2 : iterable) {
                Object obj3 = (Long) this.a.b.a(obj2);
                if (obj3 == null) {
                    linkedHashSet.add(obj2);
                    obj3 = Long.valueOf(-1);
                }
                ajxm a = ajxs.a(obj2, obj3);
                linkedHashMap.put(a.a, a.b);
            }
            Map d = ajzm.d(linkedHashMap);
            if (!linkedHashSet.isEmpty()) {
                DbClient a2 = this.a.a();
                Factory factory = FriendRecord.FACTORY;
                Object[] toArray = linkedHashSet.toArray(new String[0]);
                if (toArray != null) {
                    Object selectIdForKeys = factory.selectIdForKeys((String[]) toArray);
                    akcr.a(selectIdForKeys, "FriendRecord.FACTORY.sel…Usernames.toTypedArray())");
                    Object obj4 = FriendRecord.SELECT_ID_FOR_KEYS_MAPPER;
                    akcr.a(obj4, "FriendRecord.SELECT_ID_FOR_KEYS_MAPPER");
                    for (FriendId friendId : a2.query(selectIdForKeys, obj4)) {
                        obj4 = friendId.username();
                        akcr.a(obj4, "it.username()");
                        long _id = friendId._id();
                        d.put(obj4, Long.valueOf(_id));
                        this.a.b.a(obj4, Long.valueOf(_id));
                    }
                } else {
                    throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            return d;
        }
    }

    /* renamed from: ixg$d */
    static final class d extends akcs implements akbw<String, DbTransaction, Long> {
        private /* synthetic */ ixg a;

        d(ixg ixg) {
            this.a = ixg;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            DbTransaction dbTransaction = (DbTransaction) obj2;
            akcr.b(str, "username");
            akcr.b(dbTransaction, "tx");
            this.a.a().throwIfNotDbScheduler();
            ((InsertUsername) this.a.g.b()).bind(str);
            long executeInsert = this.a.a().executeInsert(((InsertUsername) this.a.g.b()), dbTransaction);
            this.a.e.a().c(iob.DB_INSERTED_USERNAME_ONLY.a("has_user_id", "false"), 1);
            this.a.b.a(str, Long.valueOf(executeInsert));
            return Long.valueOf(executeInsert);
        }
    }

    /* renamed from: ixg$e */
    static final class e extends akcs implements akbw<Collection<? extends String>, DbTransaction, Map<String, ? extends Long>> {
        private /* synthetic */ ixg a;

        e(ixg ixg) {
            this.a = ixg;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Collection collection = (Collection) obj;
            DbTransaction dbTransaction = (DbTransaction) obj2;
            akcr.b(collection, "usernames");
            String str = "tx";
            akcr.b(dbTransaction, str);
            Iterable<String> iterable = collection;
            Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
            for (String str2 : iterable) {
                ixg ixg = this.a;
                akcr.b(str2, "username");
                akcr.b(dbTransaction, str);
                ajxm ajxm = new ajxm(str2, Long.valueOf(((Number) ixg.c.invoke(str2, dbTransaction)).longValue()));
                linkedHashMap.put(ajxm.a, ajxm.b);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: ixg$b */
    static final class b extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ ixg a;
        private /* synthetic */ List b;
        private /* synthetic */ Map c;

        b(ixg ixg, List list, Map map) {
            this.a = ixg;
            this.b = list;
            this.c = map;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            String str = "tx";
            akcr.b(dbTransaction, str);
            ixg ixg = this.a;
            Collection collection = this.b;
            akcr.b(collection, "usernames");
            akcr.b(dbTransaction, str);
            for (Entry entry : ((Map) ixg.d.invoke(collection, dbTransaction)).entrySet()) {
                String str2 = (String) entry.getKey();
                long longValue = ((Number) entry.getValue()).longValue();
                this.c.put(str2, Long.valueOf(longValue));
                this.a.b.a(str2, Long.valueOf(longValue));
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ixg.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(ixg.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(ixg.class), "insertUsername", "getInsertUsername()Lcom/snap/core/db/record/FriendModel$InsertUsername;")};
    }

    public ixg(DbManager dbManager, iqc iqc) {
        akcr.b(dbManager, "dbManager");
        akcr.b(iqc, "friendingAnalytics");
        this.e = iqc;
        this.f = ajxh.a(new a(dbManager));
    }

    private Map<String, Long> b(Collection<String> collection) {
        akcr.b(collection, "usernames");
        return (Map) this.h.invoke(collection);
    }

    public final long a(String str) {
        akcr.b(str, "username");
        return ((Number) ajyu.d((Iterable) a((Collection) ajyl.a(str)).values())).longValue();
    }

    /* Access modifiers changed, original: final */
    public final DbClient a() {
        return (DbClient) this.f.b();
    }

    public final Map<String, Long> a(Collection<String> collection) {
        akcr.b(collection, "usernames");
        a().throwIfNotDbScheduler();
        Map linkedHashMap = new LinkedHashMap();
        List arrayList = new ArrayList();
        for (Entry entry : b((Collection) collection).entrySet()) {
            String str = (String) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            if (longValue == -1) {
                arrayList.add(str);
            } else {
                linkedHashMap.put(str, Long.valueOf(longValue));
            }
        }
        if (arrayList.isEmpty()) {
            return linkedHashMap;
        }
        a().runInTransaction("FriendIdRepo:ensureFriends", new b(this, arrayList, linkedHashMap)).e();
        return linkedHashMap;
    }

    public final long b(String str) {
        akcr.b(str, "username");
        return ((Number) ajyu.d((Iterable) b((Collection) ajyl.a(str)).values())).longValue();
    }

    public final void b() {
        this.b.a();
    }

    public final void c(String str) {
        akcr.b(str, "username");
        this.b.b(str);
    }
}
