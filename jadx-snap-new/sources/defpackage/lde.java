package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.mhs.b;
import defpackage.ryz.a;
import defpackage.ryz.c;
import java.util.List;
import java.util.Set;

@ftr(a = "lens_remote_assets/*/*/*")
/* renamed from: lde */
public final class lde extends ggm {
    private final gee a;
    private final akbw<b, String, gfl> b;

    public lde(gee gee, akbw<b, String, gfl> akbw) {
        akcr.b(gee, "contentManager");
        akcr.b(akbw, "payloadProcessor");
        this.a = gee;
        this.b = akbw;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Object b;
        String str;
        Set<rzg> set3 = set;
        Uri uri2 = uri;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        List pathSegments = uri.getPathSegments();
        int i = 1;
        String str2 = (String) pathSegments.get(1);
        Object obj = akcr.a((String) pathSegments.get(2), (Object) "EMPTY_SIGNATURE") ? "" : (String) pathSegments.get(2);
        String str3 = (String) pathSegments.get(3);
        akcr.a((Object) str2, "url");
        if (str2.length() != 0) {
            i = 0;
        }
        if (i != 0) {
            b = ajdx.b((Throwable) new IllegalArgumentException("Empty asset url for ".concat(String.valueOf(uri))));
            str = "Single.error(IllegalArgu…pty asset url for $uri\"))";
        } else {
            gee gee = this.a;
            akbw akbw = this.b;
            akcr.a((Object) str3, "id");
            b bVar = new b(str3);
            akcr.a(obj, "signature");
            gfl gfl = (gfl) akbw.invoke(bVar, obj);
            b = new a(str2, sac.GET, c.LARGE_MEDIA, set).e();
            akcr.a(b, "NetworkRequest.Builder(u…                 .build()");
            b = gee.a(new gew(str2, (sak) b, null, gfl, ldd.a, set, set2, 268)).a(z);
            str = "contentManager.submit(bu…tResult(closeOnTerminate)";
        }
        akcr.a(b, str);
        return b;
    }
}
