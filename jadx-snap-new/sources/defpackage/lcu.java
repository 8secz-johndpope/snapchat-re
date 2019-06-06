package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.mhs.a;
import defpackage.mhs.b;
import defpackage.ryz.c;
import java.util.List;
import java.util.Set;

@ftr(a = "lens_content/*/*/*")
/* renamed from: lcu */
public final class lcu extends ggm {
    private final gee a;
    private final akbw<b, String, gfl> b;

    public lcu(gee gee, akbw<b, String, gfl> akbw) {
        akcr.b(gee, "contentManager");
        akcr.b(akbw, "lensPayloadProcessorFactory");
        this.a = gee;
        this.b = akbw;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Set<rzg> set3 = set;
        Uri uri2 = uri;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        List pathSegments = uri.getPathSegments();
        int size = uri.getPathSegments().size();
        Object obj = pathSegments.get(size - 1);
        akcr.a(obj, "segments[size - 1]");
        mhs a = a.a(obj);
        if (a != null) {
            b bVar = (b) a;
            Object obj2 = (String) pathSegments.get(size - 2);
            Object obj3 = (String) pathSegments.get(size - 3);
            gee gee = this.a;
            akcr.a(obj3, "url");
            akbw akbw = this.b;
            akcr.a(obj2, "signature");
            gfl gfl = (gfl) akbw.invoke(bVar, obj2);
            Object c = new ryz.a(obj3, sac.GET, c.LARGE_MEDIA, set).e();
            akcr.a(c, "NetworkRequest.Builder(u…                 .build()");
            boolean z2 = z;
            c = gee.a(new gew(obj3, (sak) c, null, gfl, lcr.a, set, set2, 268)).a(z);
            akcr.a(c, "contentManager.submit(bu…tResult(closeOnTerminate)");
            return c;
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.lenses.common.Identifier.Known");
    }
}
