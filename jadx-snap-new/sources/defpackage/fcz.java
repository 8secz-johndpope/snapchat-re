package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

@ftr(a = "cognac")
/* renamed from: fcz */
public final class fcz extends ggm {
    private final ajxe a;

    /* renamed from: fcz$a */
    static final class a extends akcs implements akbk<fuo> {
        private /* synthetic */ fur a;
        private /* synthetic */ fcv b;

        a(fur fur, fcv fcv) {
            this.a = fur;
            this.b = fcv;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a(this.b);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(fcz.class), "urlUriHandler", "getUrlUriHandler()Lcom/snap/content/shared/handler/UrlUriHandler;");
    }

    public fcz(fur fur, fcv fcv) {
        akcr.b(fur, "urlUriHandlerFactory");
        akcr.b(fcv, "cognacContentType");
        this.a = ajxh.a(new a(fur, fcv));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        return ((fuo) this.a.b()).a(uri, set, z, set2);
    }
}
