package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

@ftr(a = "Maps_WorldEffects")
/* renamed from: nln */
public final class nln extends ggm {
    final fus a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: nln$a */
    static final class a extends akcs implements akbk<fup> {
        private /* synthetic */ nln a;

        a(nln nln) {
            this.a = nln;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.b(nlm.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(nln.class), "uriHandler", "getUriHandler()Lcom/snap/content/shared/handler/ZippedAssetUriHandler;");
    }

    public nln(fus fus) {
        akcr.b(fus, "handlerFactory");
        this.a = fus;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        return ((fup) this.b.b()).a(uri, (Set) set, z, (Set) set2);
    }
}
