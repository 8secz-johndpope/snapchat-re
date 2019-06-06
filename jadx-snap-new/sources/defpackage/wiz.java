package defpackage;

import com.google.protobuf.nano.MessageNano;
import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.SnapTokenModel;
import com.snap.core.db.record.SnapTokenModel.ClearTokensByUserId;
import com.snap.core.db.record.SnapTokenModel.PutAccessToken;
import com.snap.core.db.record.SnapTokenModel.UpdateAccessTokenPb;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: wiz */
public final class wiz implements wjn {
    final wjl a;
    final wiu b;
    private final DbClient c = this.d.getDbClient(whl.a.callsite("DefaultSnapTokenStorage"));
    private final SnapDb d;
    private final ajei e;

    /* renamed from: wiz$e */
    static final class e<V> implements Callable<T> {
        private /* synthetic */ wiz a;
        private /* synthetic */ String b;

        e(wiz wiz, String str) {
            this.a = wiz;
            this.b = str;
        }

        public final /* synthetic */ Object call() {
            return this.a.a.b(this.b);
        }
    }

    /* renamed from: wiz$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ wiz a;
        private /* synthetic */ String b;

        d(wiz wiz, String str) {
            this.a = wiz;
            this.b = str;
        }

        public final /* synthetic */ Object call() {
            return this.a.a.a(this.b);
        }
    }

    /* renamed from: wiz$b */
    static final class b implements ajev {
        private /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        public final void run() {
        }
    }

    /* renamed from: wiz$c */
    static final class c<T> implements ajfb<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: wiz$g */
    static final class g implements ajev {
        public static final g a = new g();

        g() {
        }

        public final void run() {
        }
    }

    /* renamed from: wiz$h */
    static final class h<T> implements ajfb<Throwable> {
        private /* synthetic */ wiz a;

        h(wiz wiz) {
            this.a = wiz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b.a().a((aajt) new abai());
        }
    }

    /* renamed from: wiz$j */
    static final class j implements ajev {
        public static final j a = new j();

        j() {
        }

        public final void run() {
        }
    }

    /* renamed from: wiz$k */
    static final class k<T> implements ajfb<Throwable> {
        private /* synthetic */ wiz a;

        k(wiz wiz) {
            this.a = wiz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b.a().a((aajt) new abav());
        }
    }

    /* renamed from: wiz$a */
    static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ wiz a;
        private /* synthetic */ String b;

        a(wiz wiz, String str) {
            this.a = wiz;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            String str = "tx";
            akcr.b(dbTransaction, str);
            wjl wjl = this.a.a;
            String str2 = this.b;
            akcr.b(str2, "userId");
            akcr.b(dbTransaction, str);
            wjl.e.throwIfNotDbScheduler();
            ClearTokensByUserId clearTokensByUserId = (ClearTokensByUserId) wjl.d.b();
            clearTokensByUserId.bind(str2);
            Object obj2 = wjl.a;
            akcr.a(obj2, "briteDatabase");
            BriteDatabaseExtensionsKt.executeDelete(obj2, clearTokensByUserId, dbTransaction);
            return ajxw.a;
        }
    }

    /* renamed from: wiz$f */
    static final class f extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ wiz a;
        private /* synthetic */ String b;
        private /* synthetic */ Map c;

        f(wiz wiz, String str, Map map) {
            this.a = wiz;
            this.b = str;
            this.c = map;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            String str = "tx";
            akcr.b(dbTransaction, str);
            wjl wjl = this.a.a;
            String str2 = this.b;
            Map map = this.c;
            akcr.b(str2, "userId");
            akcr.b(map, SnapTokenModel.ACCESSTOKENS);
            akcr.b(dbTransaction, str);
            wjl.e.throwIfNotDbScheduler();
            UpdateAccessTokenPb updateAccessTokenPb = (UpdateAccessTokenPb) wjl.c.b();
            alqv alqv = new alqv();
            Collection values = map.values();
            if (values != null) {
                Object[] toArray = values.toArray(new alqu[0]);
                if (toArray != null) {
                    alqv.a = (alqu[]) toArray;
                    updateAccessTokenPb.bind(MessageNano.toByteArray(alqv), str2);
                    wjl.a.executeUpdateDelete(updateAccessTokenPb, dbTransaction);
                    return ajxw.a;
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new ajxt("null cannot be cast to non-null type java.util.Collection<T>");
        }
    }

    /* renamed from: wiz$i */
    static final class i extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ wiz a;
        private /* synthetic */ String b;
        private /* synthetic */ Map c;
        private /* synthetic */ String d;

        i(wiz wiz, String str, Map map, String str2) {
            this.a = wiz;
            this.b = str;
            this.c = map;
            this.d = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            String str = "tx";
            akcr.b(dbTransaction, str);
            wjl wjl = this.a.a;
            String str2 = this.b;
            Map map = this.c;
            String str3 = this.d;
            akcr.b(str2, "userId");
            akcr.b(map, SnapTokenModel.ACCESSTOKENS);
            akcr.b(str3, SnapTokenModel.REFRESHTOKEN);
            akcr.b(dbTransaction, str);
            wjl.e.throwIfNotDbScheduler();
            PutAccessToken putAccessToken = (PutAccessToken) wjl.b.b();
            alqv alqv = new alqv();
            Collection values = map.values();
            if (values != null) {
                Object[] toArray = values.toArray(new alqu[0]);
                if (toArray != null) {
                    alqv.a = (alqu[]) toArray;
                    putAccessToken.bind(str2, "", str3, MessageNano.toByteArray(alqv));
                    wjl.a.executeInsert(putAccessToken, dbTransaction);
                    return ajxw.a;
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new ajxt("null cannot be cast to non-null type java.util.Collection<T>");
        }
    }

    public wiz(SnapDb snapDb, wjl wjl, wiu wiu, ajei ajei) {
        akcr.b(snapDb, "snapDb");
        akcr.b(wjl, "snapTokenRepository");
        akcr.b(wiu, "blizzardLogger");
        akcr.b(ajei, "clearOnLogout");
        this.d = snapDb;
        this.a = wjl;
        this.b = wiu;
        this.e = ajei;
    }

    public final ajdj<Map<wjd, alqu>> a(String str) {
        akcr.b(str, "userId");
        Object b = ajdj.b((Callable) new d(this, str)).b(this.d.scheduler());
        akcr.a(b, "Maybe.fromCallable<Map<S…ibeOn(snapDb.scheduler())");
        return b;
    }

    public final void a(String str, Map<wjd, alqu> map) {
        akcr.b(str, "userId");
        akcr.b(map, SnapTokenModel.ACCESSTOKENS);
        this.e.a(this.c.runInTransaction("DefaultSnapTokenStorage:putAccessTokens", new f(this, str, map)).a((ajev) g.a, (ajfb) new h(this)));
    }

    public final void a(String str, Map<wjd, alqu> map, String str2) {
        akcr.b(str, "userId");
        akcr.b(map, SnapTokenModel.ACCESSTOKENS);
        akcr.b(str2, SnapTokenModel.REFRESHTOKEN);
        this.e.a(this.c.runInTransaction("DefaultSnapTokenStorage:putAccessTokens with ".concat(String.valueOf(str2)), new i(this, str, map, str2)).a((ajev) j.a, (ajfb) new k(this)));
    }

    public final ajdj<String> b(String str) {
        akcr.b(str, "userId");
        Object b = ajdj.b((Callable) new e(this, str)).b(this.d.scheduler());
        akcr.a(b, "Maybe.fromCallable<Strin…ibeOn(snapDb.scheduler())");
        return b;
    }

    public final void c(String str) {
        akcr.b(str, "userId");
        this.e.a(this.c.runInTransaction("DefaultSnapTokenStorage:clearTokens", new a(this, str)).a((ajev) new b(str), (ajfb) c.a));
    }
}
