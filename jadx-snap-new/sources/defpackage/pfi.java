package defpackage;

import android.net.Uri;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.odr.a;

@ftr(a = "memories_thumbnail")
/* renamed from: pfi */
public final class pfi extends pef {
    private final giw i = new giw();
    private final String j = "MemoriesThumbnailUriHandler";
    private final String k = ".thumbnail";
    private final boolean l = true;
    private final oiy m;
    private final ovh n;
    private final ajwy<gfu> o;

    /* renamed from: pfi$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public pfi(Uri uri, gee gee, pfh pfh, gel gel, oiy oiy, ygi ygi, odu odu, zgb zgb, pij pij, owc owc, pfl pfl, ovh ovh, ajwy<gfu> ajwy, ajwy<gqr> ajwy2) {
        pfh pfh2 = pfh;
        oiy oiy2 = oiy;
        ovh ovh2 = ovh;
        ajwy<gfu> ajwy3 = ajwy;
        akcr.b(uri, "baseUrl");
        akcr.b(gee, "contentManager");
        akcr.b(pfh2, "memoriesThumbnailContentType");
        gel gel2 = gel;
        akcr.b(gel2, "contentResultFactory");
        akcr.b(oiy2, "attributedFeature");
        ygi ygi2 = ygi;
        akcr.b(ygi2, "fileManager");
        odu odu2 = odu;
        akcr.b(odu2, "mediaPackageManager");
        zgb zgb2 = zgb;
        akcr.b(zgb2, "schedulersProvider");
        pij pij2 = pij;
        akcr.b(pij2, "snapMetadataDownloader");
        owc owc2 = owc;
        akcr.b(owc2, "uploadSessionsRepository");
        pfl pfl2 = pfl;
        akcr.b(pfl2, "uriHandlerAnalytics");
        akcr.b(ovh2, "memoriesDownloadRepository");
        akcr.b(ajwy3, "contentResolver");
        akcr.b(ajwy2, "exceptionTrackerProvider");
        super(uri, gee, pfh2, gel2, oiy, ygi2, odu2, zgb2, pij2, owc2, pfl2, ajwy2);
        this.m = oiy2;
        this.n = ovh2;
        this.o = ajwy;
    }

    public final ajdj<oqr> a(String str) {
        akcr.b(str, "id");
        return this.n.a(str);
    }

    public final ajdx<gej> a(Uri uri, abyi abyi, orl orl, boolean z) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(abyi, "mediaPackage");
        akcr.b(orl, "uploadSession");
        Object a = abyj.b(abyi.e).a(0.5d);
        String str = orl.a;
        int i = orl.b;
        akcr.a(a, MapboxEvent.KEY_RESOLUTION);
        Integer valueOf = Integer.valueOf(a.b());
        Integer valueOf2 = Integer.valueOf(a.c());
        akcr.b(str, "mediaPackageSessionId");
        return ((gfu) this.o.get()).a(a.a(str, i, valueOf, valueOf2, null, 16), this.m.getAttributionFor(this.j), z, new gdy[0]);
    }

    public final gfl a(oqr oqr) {
        akcr.b(oqr, "requestInfo");
        abnb abnb = oqr.d;
        akcr.b(abnb, "encryptionAlgorithm");
        return new gix(new gii.a(abnb), gij.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final String c() {
        return this.j;
    }

    /* Access modifiers changed, original: protected|final */
    public final String d() {
        return this.k;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean e() {
        return true;
    }

    public final gfl f() {
        return gii.a(giw.a(0));
    }
}
