package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

@ftr(a = "Maps_Kashmir")
/* renamed from: nll */
public final class nll extends ggm {
    final fuq a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: nll$a */
    static final class a extends akcs implements akbk<fup> {
        private /* synthetic */ nll a;

        a(nll nll) {
            this.a = nll;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.a(nlk.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(nll.class), "uriHandler", "getUriHandler()Lcom/snap/content/shared/handler/ZippedAssetUriHandler;");
    }

    public nll(fuq fuq) {
        akcr.b(fuq, "handlerFactory");
        this.a = fuq;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        return ((fup) this.b.b()).a(uri, (Set) set, z, (Set) set2);
    }
}
