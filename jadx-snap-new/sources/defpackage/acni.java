package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

@ftr(a = "Maps_EggHunt")
/* renamed from: acni */
public final class acni extends ggm {
    final fur a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: acni$a */
    static final class a extends akcs implements akbk<fuo> {
        private /* synthetic */ acni a;

        a(acni acni) {
            this.a = acni;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.a(acnb.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(acni.class), "uriHandler", "getUriHandler()Lcom/snap/content/shared/handler/UrlUriHandler;");
    }

    public acni(fur fur) {
        akcr.b(fur, "handlerFactory");
        this.a = fur;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        return ((fuo) this.b.b()).a(uri, set, z, set2);
    }
}
