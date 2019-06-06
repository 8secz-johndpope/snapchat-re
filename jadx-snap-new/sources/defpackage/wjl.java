package defpackage;

import android.database.Cursor;
import com.google.common.base.Optional;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.SnapTokenModel.ClearAll;
import com.snap.core.db.record.SnapTokenModel.ClearTokensByUserId;
import com.snap.core.db.record.SnapTokenModel.PutAccessToken;
import com.snap.core.db.record.SnapTokenModel.UpdateAccessTokenPb;
import com.snap.core.db.record.SnapTokenRecord;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wjl */
public final class wjl {
    final DbClient a = this.e.getDbClient((ide) whl.a);
    final ajxe<PutAccessToken> b = ajxh.a(new c(this));
    final ajxe<UpdateAccessTokenPb> c = ajxh.a(new e(this));
    final ajxe<ClearTokensByUserId> d = ajxh.a(new b(this));
    final SnapDb e;
    private final ajxe f;
    private final ajxe g = ajxh.a(new f(this.a));
    private final ajxe<ClearAll> h = ajxh.a(new a(this));

    /* renamed from: wjl$d */
    static final class d extends akcq implements akbk<iha> {
        d(ajwy ajwy) {
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
            return (iha) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: wjl$f */
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

    /* renamed from: wjl$c */
    static final class c extends akcs implements akbk<PutAccessToken> {
        private /* synthetic */ wjl a;

        c(wjl wjl) {
            this.a = wjl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new PutAccessToken(((pa) this.a.g.b()));
        }
    }

    /* renamed from: wjl$e */
    static final class e extends akcs implements akbk<UpdateAccessTokenPb> {
        private /* synthetic */ wjl a;

        e(wjl wjl) {
            this.a = wjl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateAccessTokenPb(((pa) this.a.g.b()));
        }
    }

    /* renamed from: wjl$a */
    static final class a extends akcs implements akbk<ClearAll> {
        private /* synthetic */ wjl a;

        a(wjl wjl) {
            this.a = wjl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ClearAll(((pa) this.a.g.b()));
        }
    }

    /* renamed from: wjl$b */
    static final class b extends akcs implements akbk<ClearTokensByUserId> {
        private /* synthetic */ wjl a;

        b(wjl wjl) {
            this.a = wjl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ClearTokensByUserId(((pa) this.a.g.b()));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(wjl.class), "serializationHelper", "getSerializationHelper()Lcom/snap/framework/serialization/SerializationHelper;"), new akdc(akde.a(wjl.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;")};
    }

    public wjl(ajwy<iha> ajwy, SnapDb snapDb) {
        akcr.b(ajwy, "serializationHelperProvider");
        akcr.b(snapDb, "snapDb");
        this.e = snapDb;
        this.f = ajxh.a(new d(ajwy));
    }

    private static alqv a(byte[] bArr) {
        try {
            Object a = alqv.a(bArr);
            akcr.a(a, "StoredAccessTokens.parseFrom(bytes)");
            return a;
        } catch (InvalidProtocolBufferNanoException unused) {
            return new alqv();
        }
    }

    private static HashMap<wjd, alqu> a(alqv alqv) {
        HashMap hashMap = new HashMap();
        for (Object obj : alqv.a) {
            for (String a : obj.c) {
                Optional a2 = wjd.a(a);
                if (a2.isPresent()) {
                    Map map = hashMap;
                    Object obj2 = a2.get();
                    akcr.a(obj2, "scopeId.get()");
                    akcr.a(obj, "token");
                    map.put(obj2, obj);
                }
            }
        }
        return hashMap;
    }

    public final Map<wjd, alqu> a(String str) {
        akcr.b(str, "userId");
        this.e.throwIfNotDbScheduler();
        HashMap hashMap = new HashMap();
        ainx accessTokenPbByUserId = SnapTokenRecord.FACTORY.getAccessTokenPbByUserId(str);
        akcr.a((Object) accessTokenPbByUserId, "SnapTokenRecord.FACTORY.…ssTokenPbByUserId(userId)");
        Closeable query = this.a.query(accessTokenPbByUserId);
        try {
            Cursor cursor = (Cursor) query;
            if (cursor.moveToNext()) {
                Object obj = SnapTokenRecord.FACTORY;
                akcr.a(obj, "SnapTokenRecord.FACTORY");
                obj = obj.getAccessTokenPbByUserIdMapper().map(cursor);
                akcr.a(obj, "SnapTokenRecord.FACTORY.…yUserIdMapper.map(cursor)");
                hashMap = wjl.a(wjl.a((byte[]) obj));
            }
            akax.a(query, null);
            return hashMap;
        } catch (Throwable th) {
            akax.a(query, th);
        }
    }

    /* JADX WARNING: Missing block: B:13:0x0044, code skipped:
            defpackage.akax.a(r5, r0);
     */
    public final java.lang.String b(java.lang.String r5) {
        /*
        r4 = this;
        r0 = "userId";
        defpackage.akcr.b(r5, r0);
        r0 = r4.e;
        r0.throwIfNotDbScheduler();
        r0 = com.snap.core.db.record.SnapTokenRecord.FACTORY;
        r5 = r0.getRefreshTokenByUserId(r5);
        r0 = "SnapTokenRecord.FACTORY.…reshTokenByUserId(userId)";
        defpackage.akcr.a(r5, r0);
        r0 = r4.a;
        r5 = r0.query(r5);
        r5 = (java.io.Closeable) r5;
        r0 = 0;
        r1 = r5;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0042 }
        r2 = r1.moveToNext();	 Catch:{ Throwable -> 0x0042 }
        if (r2 == 0) goto L_0x003c;
    L_0x0027:
        r2 = com.snap.core.db.record.SnapTokenRecord.FACTORY;	 Catch:{ Throwable -> 0x0042 }
        r3 = "SnapTokenRecord.FACTORY";
        defpackage.akcr.a(r2, r3);	 Catch:{ Throwable -> 0x0042 }
        r2 = r2.getRefreshTokenByUserIdMapper();	 Catch:{ Throwable -> 0x0042 }
        r1 = r2.map(r1);	 Catch:{ Throwable -> 0x0042 }
        r1 = (java.lang.String) r1;	 Catch:{ Throwable -> 0x0042 }
        defpackage.akax.a(r5, r0);
        return r1;
    L_0x003c:
        defpackage.akax.a(r5, r0);
        return r0;
    L_0x0040:
        r1 = move-exception;
        goto L_0x0044;
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0040 }
    L_0x0044:
        defpackage.akax.a(r5, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjl.b(java.lang.String):java.lang.String");
    }
}
