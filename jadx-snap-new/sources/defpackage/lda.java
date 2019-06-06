package defpackage;

import android.net.Uri;
import com.snap.core.db.record.CognacAppListModel;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ryz.a;
import defpackage.ryz.c;
import java.util.Set;

@ftr(a = "lens_overlay_image/*")
/* renamed from: lda */
public final class lda extends ggm {
    private final gee a;

    public lda(gee gee) {
        akcr.b(gee, "contentManager");
        this.a = gee;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object lastPathSegment = uri.getLastPathSegment();
        akcr.a(lastPathSegment, CognacAppListModel.CONTENTURL);
        Object c = new a(lastPathSegment, sac.GET, c.SMALL_MEDIA, set).e();
        akcr.a(c, "NetworkRequest.Builder(u…                 .build()");
        Object a = this.a.a(new gew(lastPathSegment, (sak) c, null, null, lcy.a, set, set2, 284)).a(z);
        akcr.a(a, "uri.lastPathSegment.let …tResult(closeOnTerminate)");
        return a;
    }
}
