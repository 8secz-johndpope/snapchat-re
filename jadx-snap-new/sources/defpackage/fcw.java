package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableMap;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ryz.a;
import defpackage.ryz.c;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@ftr(a = "cognac-3d-bitmoji/*")
/* renamed from: fcw */
public final class fcw extends ggm {
    private Future<String> a;
    private final gee b;
    private final fcv c;

    public fcw(gee gee, fcv fcv) {
        akcr.b(gee, "contentManager");
        akcr.b(fcv, "cognacContentType");
        this.b = gee;
        this.c = fcv;
    }

    private final ryz a(String str, Set<rzg> set) {
        Object obj;
        try {
            Future future = this.a;
            if (future == null) {
                akcr.a("accessToken");
            }
            obj = future.get();
            akcr.a(obj, "accessToken.get()");
            obj = (String) obj;
        } catch (ExecutionException unused) {
            Thread.currentThread().interrupt();
            obj = "";
        }
        Object c = new a(str, sac.GET, c.LARGE_MEDIA, set).a((Map) ImmutableMap.of("X-Snap-Access-Token", obj)).e();
        akcr.a(c, "NetworkRequest.Builder(u…\n                .build()");
        return c;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        gee gee = this.b;
        gfl gfl = gii.a;
        Object obj = (String) uri.getPathSegments().get(1);
        akcr.a(obj, "url");
        obj = gee.a(new gew((String) akgc.a((CharSequence) obj, new String[]{"\\?t="}, 0, 6).get(0), a(obj, set), null, gfl, this.c, set, set2, 4)).a(z);
        akcr.a(obj, "contentManager.submit(bu…tResult(closeOnTerminate)");
        return obj;
    }

    public final void a(Future<String> future) {
        akcr.b(future, "token");
        this.a = future;
    }
}
