package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.sbm.a;
import java.util.Set;

@ftr(a = "proxy_token")
/* renamed from: uct */
public final class uct extends ggm {
    private static final String d = d;
    private final String a;
    private final ucw b;
    private final gee c;

    /* renamed from: uct$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public uct(ucw ucw, gee gee, Uri uri) {
        akcr.b(ucw, "proxyTokenContentType");
        akcr.b(gee, "contentManager");
        akcr.b(uri, "baseUrl");
        this.b = ucw;
        this.c = gee;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri);
        stringBuilder.append(d);
        this.a = stringBuilder.toString();
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object a = this.c.a(new gew("PROXY_TOKEN_CACHE_KEY", new a(this.a, sac.POST).b(new gma(new aedh())).e(), null, null, this.b, set, set2, 284)).a(z);
        akcr.a(a, "contentManager.submit(De…tResult(closeOnTerminate)");
        return a;
    }
}
