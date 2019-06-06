package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.sbm.a;
import java.util.Set;

@ftr(a = "caption_style_typeface/*")
/* renamed from: uek */
public final class uek extends ggm {
    private final uej a;
    private final gee b;

    public uek(uej uej, gee gee) {
        akcr.b(uej, "captionStyleTypefaceContentType");
        akcr.b(gee, "contentManager");
        this.a = uej;
        this.b = gee;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object obj = (String) uri.getPathSegments().get(1);
        gee gee = this.b;
        akcr.a(obj, "url");
        Object d = new a(obj, sac.GET).e();
        akcr.a(d, "SimpleRequest.Builder<An…                 .build()");
        Object a = gee.a(new gew(obj, (sak) d, null, null, this.a, set, set2, 284)).a(z);
        akcr.a(a, "contentManager.submit(bu…tResult(closeOnTerminate)");
        return a;
    }
}
