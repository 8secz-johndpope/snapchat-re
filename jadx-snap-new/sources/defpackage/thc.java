package defpackage;

import android.net.Uri;
import com.snap.core.db.record.CognacAppListModel;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.sbm.a;
import java.util.Set;

@ftr(a = "payments/images")
/* renamed from: thc */
public final class thc extends ggm {
    private final tgy a;
    private final gee b;

    public thc(tgy tgy, gee gee) {
        akcr.b(tgy, "paymentsContentType");
        akcr.b(gee, "contentManager");
        this.a = tgy;
        this.b = gee;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object queryParameter = uri.getQueryParameter("url");
        gee gee = this.b;
        akcr.a(queryParameter, CognacAppListModel.IMAGEURL);
        Object a = gee.a(new gew(queryParameter, new a(queryParameter, sac.GET).e(), null, null, this.a, set, set2, 284)).a(z);
        akcr.a(a, "contentManager.submit(\n …tResult(closeOnTerminate)");
        return a;
    }
}
