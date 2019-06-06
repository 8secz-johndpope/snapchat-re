package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ryz.a;
import defpackage.ryz.c;
import java.util.Set;

@ftr(a = "context_filter_metadata")
/* renamed from: tsz */
public final class tsz extends ggm {
    private final String a;
    private final gee b;

    /* renamed from: tsz$a */
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

    public tsz(gee gee, Uri uri) {
        akcr.b(gee, "contentManager");
        akcr.b(uri, "baseUrl");
        this.b = gee;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri);
        stringBuilder.append("/context_filter/load_metadata");
        this.a = stringBuilder.toString();
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        gee gee = this.b;
        Object c = new a(this.a, sac.POST, c.METADATA, set).a(new gma(new aedh())).e();
        akcr.a(c, "NetworkRequest.Builder(e…                 .build()");
        Object a = gee.a(new gew("context_filter_metadata", (sak) c, null, null, tsy.a, set, set2, 284)).a(z);
        akcr.a(a, "contentManager.submit(co…tResult(closeOnTerminate)");
        return a;
    }
}
