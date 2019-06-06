package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableMap;
import defpackage.ryz.a;
import defpackage.ryz.c;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@ftr(a = "cognac-webview/*")
/* renamed from: fdb */
public class fdb extends ggm {
    private final gfl a = gii.c(null, null, 3);
    private final gee b;
    private final fda c;
    private Future<String> d;

    public fdb(fda fda, gee gee) {
        this.c = fda;
        this.b = gee;
    }

    private ryz a(String str, Set<rzg> set) {
        Object obj;
        try {
            obj = (String) this.d.get();
        } catch (InterruptedException | ExecutionException e) {
            new Object[1][0] = e;
            Thread.currentThread().interrupt();
            obj = "";
        }
        return new a(str, sac.GET, c.LARGE_MEDIA, set).a(ImmutableMap.of("X-Snap-Access-Token", obj)).b("__xsc_local__media_type", "COGNAC").e();
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        String str = (String) uri.getPathSegments().get(1);
        return this.b.a(new gew(str, a(str, set), null, null, this.a, this.c, set, set2, null)).a(z);
    }

    public final void a(Future<String> future) {
        this.d = future;
    }
}
