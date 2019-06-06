package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

@ftr(a = "cognac-zip")
/* renamed from: fdc */
public final class fdc extends ggm {
    private final ajxe a;

    /* renamed from: fdc$a */
    static final class a extends akcs implements akbk<fup> {
        private /* synthetic */ fuq a;
        private /* synthetic */ fda b;

        a(fuq fuq, fda fda) {
            this.a = fuq;
            this.b = fda;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a(this.b);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(fdc.class), "uriHandler", "getUriHandler()Lcom/snap/content/shared/handler/ZippedAssetUriHandler;");
    }

    public fdc(fuq fuq, fda fda) {
        akcr.b(fuq, "handlerFactory");
        akcr.b(fda, "cognacContentType");
        this.a = ajxh.a(new a(fuq, fda));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "pages");
        akcr.b(set2, "cacheAccessControls");
        return ((fup) this.a.b()).a(uri, (Set) set, z, (Set) set2);
    }
}
