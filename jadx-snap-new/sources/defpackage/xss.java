package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.sbm.a;
import java.util.Set;

@ftr(a = "sticker/external")
/* renamed from: xss */
public final class xss extends ggm {
    private final xsr a;
    private final gee b;

    public xss(xsr xsr, gee gee) {
        akcr.b(xsr, "externalStickerContentType");
        akcr.b(gee, "contentManager");
        this.a = xsr;
        this.b = gee;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        String str = "url";
        Object queryParameter = uri.getQueryParameter(str);
        akcr.a(queryParameter, str);
        Object a = this.b.a(new gew(queryParameter, new a(queryParameter, sac.GET).e(), null, gii.a(null, null, 3), this.a, set, set2, 268)).a(z);
        akcr.a(a, "contentManager.submit(De…tResult(closeOnTerminate)");
        return a;
    }
}
