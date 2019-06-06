package defpackage;

import android.content.Context;
import android.net.Uri;
import com.snap.core.db.api.SqlDelightDbClient;
import com.snap.core.db.api.SqlDelightDbManager;
import com.snap.core.db.record.DdmlDataModel;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.List;

/* renamed from: ohj */
public final class ohj {
    public final Context a;
    public final SqlDelightDbManager b;
    private final ajxe c;
    private final ajxe d = ajxh.a(new c(this));
    private final ajwy<iha> e;
    private final aipn<ygi> f;

    /* renamed from: ohj$a */
    static final class a extends akcs implements akbk<SqlDelightDbClient> {
        private /* synthetic */ ohj a;
        private /* synthetic */ odl b;

        a(ohj ohj, odl odl) {
            this.a = ohj;
            this.b = odl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.getDbClient(new idd(this.b.getPage()));
        }
    }

    /* renamed from: ohj$c */
    static final class c extends akcs implements akbk<odk> {
        private /* synthetic */ ohj a;

        c(ohj ohj) {
            this.a = ohj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ainf database = this.a.a().getDatabase();
            if (database != null) {
                return (odk) database;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.media.MediaCoreDatabase");
        }
    }

    /* renamed from: ohj$b */
    public static final class b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ajzy.a(Integer.valueOf(((abyi) t).a().a), Integer.valueOf(((abyi) t2).a().a));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ohj.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/SqlDelightDbClient;"), new akdc(akde.a(ohj.class), "mediaCoreDatabase", "getMediaCoreDatabase()Lcom/snap/media/MediaCoreDatabase;")};
    }

    public ohj(Context context, SqlDelightDbManager sqlDelightDbManager, odl odl, ajwy<iha> ajwy, aipn<ygi> aipn) {
        akcr.b(context, "context");
        akcr.b(sqlDelightDbManager, "dbManager");
        akcr.b(odl, "mediaRenderingFeature");
        akcr.b(ajwy, "serializationHelper");
        akcr.b(aipn, "fileManager");
        this.a = context;
        this.b = sqlDelightDbManager;
        this.e = ajwy;
        this.f = aipn;
        this.c = ajxh.a(new a(this, odl));
    }

    public final abyi a(oho oho) {
        akcr.b(oho, DdmlDataModel.RECORD);
        Object a = ((iha) this.e.get()).a((InputStream) new ByteArrayInputStream(oho.b()), abyi.class);
        akcr.a(a, "serializationHelper.get(…MediaPackage::class.java)");
        return (abyi) a;
    }

    public final SqlDelightDbClient a() {
        return (SqlDelightDbClient) this.c.b();
    }

    public final void a(abyi abyi, odz odz) {
        akcr.b(abyi, "mediaPackage");
        akcr.b(odz, "state");
        ohm a = b().a();
        String str = abyi.a;
        Object b = ((iha) this.e.get()).b(abyi);
        akcr.a(b, "serializationHelper.get(…oJsonString(mediaPackage)");
        Charset charset = akfp.a;
        if (b != null) {
            b = b.getBytes(charset);
            akcr.a(b, "(this as java.lang.String).getBytes(charset)");
            a.a(str, b, odz);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type java.lang.String");
    }

    public final void a(String str, Uri uri, Uri uri2) {
        akcr.b(str, "sessionId");
        akcr.b(uri, "mediaPackageUri");
        akcr.b(uri2, "lookupUri");
        ohl b = b().b();
        Object uri3 = uri.toString();
        akcr.a(uri3, "mediaPackageUri.toString()");
        Object uri4 = uri2.toString();
        akcr.a(uri4, "lookupUri.toString()");
        b.a(str, uri3, uri4);
    }

    public final odk b() {
        return (odk) this.d.b();
    }

    public final List<oho> c() {
        return a().queryAsList("MediaPackageRepository:getRecoverableSessionRecords", b().a().a());
    }
}
