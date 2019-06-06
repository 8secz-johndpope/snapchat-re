package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

@ftr(a = "Login_Kit_Privacy")
/* renamed from: nhs */
public final class nhs extends ggm {
    final fuq a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: nhs$a */
    static final class a extends akcs implements akbk<fup> {
        private /* synthetic */ nhs a;

        a(nhs nhs) {
            this.a = nhs;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.a(nhr.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(nhs.class), "uriHandler", "getUriHandler()Lcom/snap/content/shared/handler/ZippedAssetUriHandler;");
    }

    public nhs(fuq fuq) {
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
