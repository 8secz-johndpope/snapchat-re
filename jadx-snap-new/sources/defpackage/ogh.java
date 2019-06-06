package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.StorySyncStateModel;
import defpackage.odr.a;
import java.util.Set;

@ftr(a = "composite/*/package/*")
/* renamed from: ogh */
public final class ogh extends ghz {
    private final gee a;
    private final ogg b;
    private final ajwy<ogm> c;
    private final ajwy<ogi> d;
    private final ajwy<ogp> e;
    private final ajwy<ogo> f;
    private final ajwy<ogf> g;

    /* renamed from: ogh$a */
    static final class a<T1, T2, T3, T4, T5, R> implements ajff<gej, gej, gej, gej, gej, gej> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            gej gej = (gej) obj2;
            gej gej2 = (gej) obj3;
            gej gej3 = (gej) obj4;
            gej gej4 = (gej) obj5;
            akcr.b((gej) obj, "mediaResult");
            akcr.b(gej, "editsResults");
            akcr.b(gej2, "overlayResults");
            akcr.b(gej3, "mediaPackageMetadataResult");
            akcr.b(gej4, "capturedMediaMetadataResult");
            return gem.a(r3, gej, gej2, gej3, gej4);
        }
    }

    public ogh(gee gee, ogg ogg, ajwy<ogm> ajwy, ajwy<ogi> ajwy2, ajwy<ogp> ajwy3, ajwy<ogo> ajwy4, ajwy<ogf> ajwy5) {
        akcr.b(gee, "contentManager");
        akcr.b(ogg, "contentType");
        akcr.b(ajwy, "mediaUriHandler");
        akcr.b(ajwy2, "editsUriHandler");
        akcr.b(ajwy3, "overlayUriHandler");
        akcr.b(ajwy4, "mediaPackageMetadataUriHandler");
        akcr.b(ajwy5, "capturedMediaMetadataUriHandler");
        this.a = gee;
        this.b = ogg;
        this.c = ajwy;
        this.d = ajwy2;
        this.e = ajwy3;
        this.f = ajwy4;
        this.g = ajwy5;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Set<rzg> set3 = set;
        boolean z2 = z;
        Set<? extends gdy> set4 = set2;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set3, "schedulingContexts");
        akcr.b(set4, "cacheAccessControls");
        Object obj = (String) uri.getPathSegments().get(1);
        Object obj2 = uri.getPathSegments().get(3);
        akcr.a(obj2, "uri.pathSegments[3]");
        int parseInt = Integer.parseInt((String) obj2);
        ogm ogm = (ogm) this.c.get();
        a aVar = odr.a;
        akcr.a(obj, "sessionId");
        ajdx a = ogm.a(aVar.b(obj, parseInt), set3, false, set4);
        ogf ogf = (ogf) this.g.get();
        String str = "mediaPackageSessionId";
        akcr.b(obj, str);
        Object build = a.a(StorySyncStateModel.METADATA, (String) obj, parseInt, null, null, null).build();
        String str2 = "builder(MEDIA_SESSION_UR…                 .build()";
        akcr.a(build, str2);
        ajdx a2 = ogf.a(build, set3, false, set4);
        ogo ogo = (ogo) this.f.get();
        akcr.b(obj, str);
        Object build2 = a.a("media_package", (String) obj, parseInt, null, null, null).build();
        akcr.a(build2, str2);
        ajdx a3 = ogo.a(build2, set3, false, set4);
        ogi ogi = (ogi) this.d.get();
        akcr.b(obj, str);
        Object build3 = a.a("edits", (String) obj, parseInt, null, null, null).build();
        akcr.a(build3, str2);
        ajdx a4 = ogi.a(build3, set3, false, set4);
        ogp ogp = (ogp) this.e.get();
        akcr.b(obj, str);
        obj = a.a("overlay", (String) obj, parseInt, null, null, null).build();
        akcr.a(obj, str2);
        ajdx a5 = ajdx.a(a, a4, ogp.a(obj, set3, false, set4), a3, a2, a.a);
        akcr.a((Object) a5, "Single.zip(mediaResult, …esult)\n                })");
        a5 = gem.a(a5, z2);
        gee gee = this.a;
        Object uri2 = uri.toString();
        akcr.a(uri2, "uri.toString()");
        obj = gee.a(new gew(uri2, null, gem.c(a5), null, this.b, set3, set4, 276)).a(z2);
        akcr.a(obj, "contentManager.submit(De…tResult(closeOnTerminate)");
        return obj;
    }
}
