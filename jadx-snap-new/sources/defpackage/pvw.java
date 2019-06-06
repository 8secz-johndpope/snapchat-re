package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;

@ftr(a = "shared_snap/*/*/*/*/*")
/* renamed from: pvw */
public final class pvw extends yjd {
    private final pqu e;

    public pvw(pqu pqu, gee gee, Uri uri) {
        akcr.b(pqu, "chatSnapContentType");
        akcr.b(gee, "contentManager");
        akcr.b(uri, "baseUrl");
        super(gee, pqu, uri);
        this.e = pqu;
    }

    public final ajdx<gfe> a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        String str = (String) uri.getPathSegments().get(1);
        Object obj = uri.getPathSegments().get(2);
        akcr.a(obj, "uri.pathSegments[2]");
        Object b = ajdx.b((Object) new gfe(str, gcp.valueOf((String) obj), (String) uri.getPathSegments().get(3), (String) uri.getPathSegments().get(4), (String) uri.getPathSegments().get(5), 0, true));
        akcr.a(b, "Single.just(MediaInfo(\n …L,\n                true))");
        return b;
    }
}
