package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

@ftr(a = "commerceimages")
/* renamed from: fmx */
public final class fmx extends ggm {
    final fuq a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: fmx$a */
    static final class a extends akcs implements akbk<fup> {
        private /* synthetic */ fmx a;

        a(fmx fmx) {
            this.a = fmx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.a(fmw.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(fmx.class), "uriHandler", "getUriHandler()Lcom/snap/content/shared/handler/ZippedAssetUriHandler;");
    }

    public fmx(fuq fuq) {
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
