package defpackage;

import android.net.Uri;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ovh.i;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.util.concurrent.Callable;

@ftr(a = "memories_overlay_blob")
/* renamed from: pez */
public final class pez extends pef {
    private final String i = "MemoriesOverlayBlobUriHandler";
    private final String j = ".overlay";
    private final boolean k = true;
    private final ovh l;

    /* renamed from: pez$a */
    static final class a extends akcs implements akbw<idd, odx, odp> {
        public static final a a = new a();

        a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            odx odx = (odx) obj2;
            akcr.b((idd) obj, "<anonymous parameter 0>");
            akcr.b(odx, "reader");
            FileInputStream l = odx.l();
            Long l2 = null;
            Supplier ofInstance = l != null ? Suppliers.ofInstance(l) : null;
            l = odx.l();
            if (l != null) {
                FileChannel channel = l.getChannel();
                if (channel != null) {
                    l2 = Long.valueOf(channel.size());
                }
            }
            return new odp("overlay", ofInstance, null, l2, 4);
        }
    }

    public pez(Uri uri, gee gee, pey pey, gel gel, oiy oiy, ygi ygi, odu odu, zgb zgb, pij pij, owc owc, pfl pfl, ovh ovh, ajwy<gqr> ajwy) {
        pey pey2 = pey;
        ovh ovh2 = ovh;
        akcr.b(uri, "baseUrl");
        akcr.b(gee, "contentManager");
        akcr.b(pey2, "memoriesOverlayBlobContentType");
        gel gel2 = gel;
        akcr.b(gel2, "contentResultFactory");
        oiy oiy2 = oiy;
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
        ajwy<gqr> ajwy2 = ajwy;
        akcr.b(ajwy2, "exceptionTrackerProvider");
        super(uri, gee, pey2, gel2, oiy2, ygi2, odu2, zgb2, pij2, owc2, pfl2, ajwy2);
        this.l = ovh2;
    }

    public final ajdj<oqr> a(String str) {
        akcr.b(str, "id");
        ovh ovh = this.l;
        akcr.b(str, "snapId");
        Object b = ajdj.b((Callable) new i(ovh, str)).b((ajdw) ovh.c().i());
        akcr.a(b, "Maybe\n                .f…eOn(schedulers.queries())");
        return b;
    }

    public final ajdx<gej> a(Uri uri, abyi abyi, orl orl, boolean z) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(abyi, "mediaPackage");
        akcr.b(orl, "uploadSession");
        return a(abyi, uri, a.a);
    }

    public final gfl a(oqr oqr) {
        akcr.b(oqr, "requestInfo");
        return gii.a("overlay", oqr.d);
    }

    /* Access modifiers changed, original: protected|final */
    public final String c() {
        return this.i;
    }

    /* Access modifiers changed, original: protected|final */
    public final String d() {
        return this.j;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean e() {
        return true;
    }

    public final gfl f() {
        return gii.a("overlay");
    }
}
