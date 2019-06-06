package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

@ftr(a = "spectacles")
/* renamed from: xqf */
public final class xqf extends ggm {
    final fuq a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: xqf$a */
    static final class a extends akcs implements akbk<fup> {
        private /* synthetic */ xqf a;

        a(xqf xqf) {
            this.a = xqf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.a(xqc.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(xqf.class), "uriHandler", "getUriHandler()Lcom/snap/content/shared/handler/ZippedAssetUriHandler;");
    }

    public xqf(fuq fuq) {
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
