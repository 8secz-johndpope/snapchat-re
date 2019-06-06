package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

@ftr(a = "sticker/sticker_pack")
/* renamed from: xta */
public final class xta extends ggm {
    final aipn<xsy> a;
    final aipn<fus> b;
    private final ajxe c = ajxh.a(new a(this));

    /* renamed from: xta$a */
    static final class a extends akcs implements akbk<fup> {
        private /* synthetic */ xta a;

        a(xta xta) {
            this.a = xta;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            fus fus = (fus) this.a.b.get();
            Object obj = this.a.a.get();
            akcr.a(obj, "snapPackContentType.get()");
            return fus.b((geo) obj);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(xta.class), "uriHandler", "getUriHandler()Lcom/snap/content/shared/handler/ZippedAssetUriHandler;");
    }

    public xta(aipn<xsy> aipn, aipn<fus> aipn2) {
        akcr.b(aipn, "snapPackContentType");
        akcr.b(aipn2, "handlerFactory");
        this.a = aipn;
        this.b = aipn2;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        return ((fup) this.c.b()).a(uri, (Set) set, z, (Set) set2);
    }
}
