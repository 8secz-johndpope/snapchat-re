package com.snap.media.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.snap.core.db.api.SqlDelightDbClient;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ainf;
import defpackage.aipp;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.ha;
import defpackage.odk;
import defpackage.odl;
import defpackage.ohj;
import defpackage.ohk;
import defpackage.ohn;
import defpackage.zfw;
import defpackage.zgb;
import java.util.concurrent.Callable;

public final class MediaPackageFileProvider extends ha {
    public zgb a;
    public ajwy<ohj> b;
    public odl c;
    private final String[] d = new String[]{ohk.b, ohk.c, ohk.d, ohk.e};
    private final ajxe e = ajxh.a(new f(this));
    private final ajxe f = ajxh.a(new b(this));
    private final ajxe g = ajxh.a(new e(this));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class f extends akcs implements akbk<zfw> {
        private /* synthetic */ MediaPackageFileProvider a;

        f(MediaPackageFileProvider mediaPackageFileProvider) {
            this.a = mediaPackageFileProvider;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.a.a == null) {
                akcr.a("schedulersProvider");
            }
            odl odl = this.a.c;
            if (odl == null) {
                akcr.a("mediaRenderingFeature");
            }
            return zgb.a(odl.callsite("MediaPackageDb"));
        }
    }

    static final class b extends akcs implements akbk<SqlDelightDbClient> {
        private /* synthetic */ MediaPackageFileProvider a;

        b(MediaPackageFileProvider mediaPackageFileProvider) {
            this.a = mediaPackageFileProvider;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ohj) this.a.a().get()).a();
        }
    }

    static final class e extends akcs implements akbk<odk> {
        private /* synthetic */ MediaPackageFileProvider a;

        e(MediaPackageFileProvider mediaPackageFileProvider) {
            this.a = mediaPackageFileProvider;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ainf database = ((ohj) this.a.a().get()).a().getDatabase();
            if (database != null) {
                return (odk) database;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.media.MediaCoreDatabase");
        }
    }

    static final class c<V> implements Callable<T> {
        private /* synthetic */ MediaPackageFileProvider a;
        private /* synthetic */ Uri b;

        c(MediaPackageFileProvider mediaPackageFileProvider, Uri uri) {
            this.a = mediaPackageFileProvider;
            this.b = uri;
        }

        public final /* synthetic */ Object call() {
            ohn c = this.a.b().c();
            Object path = this.b.getPath();
            akcr.a(path, "uri.path");
            c.b(path);
            return Integer.valueOf(1);
        }
    }

    static final class d extends akcs implements akbl<defpackage.ainf.a, ajxw> {
        private /* synthetic */ MediaPackageFileProvider a;
        private /* synthetic */ ContentValues b;
        private /* synthetic */ Uri c;

        d(MediaPackageFileProvider mediaPackageFileProvider, ContentValues contentValues, Uri uri) {
            this.a = mediaPackageFileProvider;
            this.b = contentValues;
            this.c = uri;
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
        /* JADX WARNING: Missing block: B:3:0x001d, code skipped:
            if (r8 == null) goto L_0x001f;
     */
        /* JADX WARNING: Missing block: B:14:0x003d, code skipped:
            if (r4 == null) goto L_0x003f;
     */
        /* JADX WARNING: Missing block: B:19:0x004a, code skipped:
            if (r5 == null) goto L_0x004c;
     */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r8) {
            /*
            r7 = this;
            r8 = (defpackage.ainf.a) r8;
            r0 = "tx";
            defpackage.akcr.b(r8, r0);
            r8 = r7.a;
            r8 = r8.b();
            r0 = r8.c();
            r8 = r7.b;
            r1 = "";
            if (r8 == 0) goto L_0x001f;
        L_0x0017:
            r2 = defpackage.ohk.b;
            r8 = r8.getAsString(r2);
            if (r8 != 0) goto L_0x0020;
        L_0x001f:
            r8 = r1;
        L_0x0020:
            r2 = r7.b;
            if (r2 == 0) goto L_0x0031;
        L_0x0024:
            r3 = defpackage.ohk.c;
            r2 = r2.getAsLong(r3);
            if (r2 == 0) goto L_0x0031;
        L_0x002c:
            r2 = r2.longValue();
            goto L_0x0033;
        L_0x0031:
            r2 = 0;
        L_0x0033:
            r4 = r7.b;
            if (r4 == 0) goto L_0x003f;
        L_0x0037:
            r5 = defpackage.ohk.d;
            r4 = r4.getAsString(r5);
            if (r4 != 0) goto L_0x0040;
        L_0x003f:
            r4 = r1;
        L_0x0040:
            r5 = r7.b;
            if (r5 == 0) goto L_0x004c;
        L_0x0044:
            r6 = defpackage.ohk.e;
            r5 = r5.getAsString(r6);
            if (r5 != 0) goto L_0x004d;
        L_0x004c:
            r5 = r1;
        L_0x004d:
            r1 = r7.c;
            r6 = r1.getPath();
            r1 = "uri.path";
            defpackage.akcr.a(r6, r1);
            r1 = r8;
            r0.a(r1, r2, r4, r5, r6);
            r8 = defpackage.ajxw.a;
            return r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.media.provider.MediaPackageFileProvider$d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(MediaPackageFileProvider.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(MediaPackageFileProvider.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/SqlDelightDbClient;"), new akdc(akde.a(MediaPackageFileProvider.class), "mediaCoreDatabase", "getMediaCoreDatabase()Lcom/snap/media/MediaCoreDatabase;")};
        a aVar = new a();
    }

    private final void c() {
        if (this.b == null) {
            aipp.a((ContentProvider) this);
        }
    }

    public final ajwy<ohj> a() {
        ajwy ajwy = this.b;
        if (ajwy == null) {
            akcr.a("mediaPackageRepository");
        }
        return ajwy;
    }

    /* Access modifiers changed, original: final */
    public final odk b() {
        return (odk) this.g.b();
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object b = ajdx.c((Callable) new c(this, uri)).b((ajdw) ((zfw) this.e.b()).p()).b();
        akcr.a(b, "Single.fromCallable {\n  …           .blockingGet()");
        return ((Number) b).intValue();
    }

    public final String getType(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        c();
        ajwy ajwy = this.b;
        if (ajwy == null) {
            akcr.a("mediaPackageRepository");
        }
        SqlDelightDbClient a = ((ohj) ajwy.get()).a();
        ohn c = b().c();
        Object path = uri.getPath();
        akcr.a(path, "uri.path");
        return (String) a.queryFirst("MediaPackageFileProvider:getType", c.a(path));
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        akcr.b(uri, MessageMediaRefModel.URI);
        c();
        try {
            ((SqlDelightDbClient) this.f.b()).callInTransaction("MediaPackage:insert", new d(this, contentValues, uri)).b();
            return uri;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        c();
        if (strArr == null) {
            strArr = this.d;
        }
        String[] strArr3 = strArr;
        if (str == null) {
            StringBuilder stringBuilder = new StringBuilder("uri = \"");
            stringBuilder.append(uri.getPath());
            stringBuilder.append('\"');
            str = stringBuilder.toString();
        }
        String str3 = str;
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(ohk.a);
        ajwy ajwy = this.b;
        if (ajwy == null) {
            akcr.a("mediaPackageRepository");
        }
        SqlDelightDbClient a = ((ohj) ajwy.get()).a();
        String buildQuery = sQLiteQueryBuilder.buildQuery(strArr3, str3, strArr2, "", "", str2, "");
        akcr.a((Object) buildQuery, "builder.buildQuery(proje…s, \"\", \"\", sortOrder, \"\")");
        return a.query("MediaPackageFileProvider:query", buildQuery);
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return insert(uri, contentValues) != null ? 1 : 0;
    }
}
