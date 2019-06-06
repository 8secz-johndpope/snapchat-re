package defpackage;

import android.net.Uri;
import com.google.common.base.Suppliers;
import com.google.common.collect.Sets;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ovh.e;
import defpackage.ssd.a;
import java.util.Set;
import java.util.concurrent.Callable;

@ftr(a = "memories_media")
/* renamed from: pew */
public final class pew extends pef {
    private final String i = "MemoriesMediaUriHandler";
    private final String j = ".media";
    private final boolean k;
    private final pev l;
    private final ftl m;
    private final ovh n;
    private final pfg o;

    /* renamed from: pew$a */
    static final class a extends akcs implements akbw<idd, odx, odp> {
        public static final a a = new a();

        a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            odx odx = (odx) obj2;
            akcr.b((idd) obj, "<anonymous parameter 0>");
            akcr.b(odx, "reader");
            return new odp("media", Suppliers.ofInstance(odx.f()), odx.e(), Long.valueOf(odx.g()));
        }
    }

    public pew(Uri uri, gee gee, pev pev, gel gel, oiy oiy, ygi ygi, odu odu, zgb zgb, pij pij, owc owc, pfl pfl, ftl ftl, ovh ovh, pfg pfg, ajwy<gqr> ajwy) {
        pev pev2 = pev;
        ftl ftl2 = ftl;
        ovh ovh2 = ovh;
        pfg pfg2 = pfg;
        Uri uri2 = uri;
        akcr.b(uri2, "baseUrl");
        gee gee2 = gee;
        akcr.b(gee2, "contentManager");
        akcr.b(pev2, "memoriesMediaContentType");
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
        akcr.b(pfl, "uriHandlerAnalytics");
        akcr.b(ftl2, "configurationProvider");
        akcr.b(ovh2, "memoriesDownloadRepository");
        akcr.b(pfg2, "streamingUriHandler");
        ajwy<gqr> ajwy2 = ajwy;
        akcr.b(ajwy2, "exceptionTrackerProvider");
        super(uri2, gee2, pev2, gel2, oiy2, ygi2, odu2, zgb2, pij2, owc2, pfl, ajwy2);
        this.l = pev2;
        this.m = ftl2;
        this.n = ovh;
        this.o = pfg;
    }

    public final ajdj<oqr> a(String str) {
        akcr.b(str, "id");
        ovh ovh = this.n;
        akcr.b(str, "snapId");
        Object b = ajdj.b((Callable) new e(ovh, str)).b((ajdw) ovh.c().i());
        akcr.a(b, "Maybe\n                .f…eOn(schedulers.queries())");
        return b;
    }

    public final ajdx<gej> a(Uri uri, abyi abyi, orl orl, boolean z) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(abyi, "mediaPackage");
        akcr.b(orl, "uploadSession");
        return a(abyi, uri, a.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final geg a(String str, oqr oqr, Set<rzg> set, gfl gfl, Set<? extends gdy> set2) {
        akcr.b(str, "downloadUrl");
        akcr.b(oqr, "requestInfo");
        akcr.b(set, "schedulingContexts");
        akcr.b(gfl, "payloadProcessor");
        akcr.b(set2, "cacheAccessControls");
        boolean a = this.m.a((fth) ojo.MEMORIES_PROGRESSIVE_DOWNLOAD);
        gcp gcp = oqr.e;
        if ((gcp != null && gcp.c()) || set2.contains(gdy.READ_CACHE_ONLY) || !a) {
            return super.a(str, oqr, (Set) set, gfl, (Set) set2);
        }
        String str2 = str;
        Uri a2 = a.a(gfr.a.b(), str2, "memories_streaming", new ssf(0, -1), null, null);
        pfg pfg = this.o;
        Set p = ajyu.p(set);
        Object newHashSet = Sets.newHashSet(gdy.IGNORE_WRITE_CACHE);
        akcr.a(newHashSet, "Sets.newHashSet(CacheAcc…ntrol.IGNORE_WRITE_CACHE)");
        return new gew(b(oqr), null, gem.c(pfg.a(a2, p, true, (Set) newHashSet)), gfl, this.l, set, set2, 262);
    }

    public final gfl a(oqr oqr) {
        akcr.b(oqr, "requestInfo");
        return gii.a("media", oqr.d);
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
        return this.k;
    }

    public final gfl f() {
        return gii.a("media");
    }
}
