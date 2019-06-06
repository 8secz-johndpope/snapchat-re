package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

@ftr(a = "sky_model")
/* renamed from: ttb */
public final class ttb extends ggm {
    final fuq a;
    private final ajxe b = ajxh.a(new a(this));
    private final ajwy<gnd> c;

    /* renamed from: ttb$a */
    static final class a extends akcs implements akbk<fup> {
        private /* synthetic */ ttb a;

        a(ttb ttb) {
            this.a = ttb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.a(tta.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ttb.class), "uriHandler", "getUriHandler()Lcom/snap/content/shared/handler/ZippedAssetUriHandler;");
    }

    public ttb(fuq fuq, ajwy<gnd> ajwy) {
        akcr.b(fuq, "handlerFactory");
        akcr.b(ajwy, "constraintFactory");
        this.a = fuq;
        this.c = ajwy;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Set set22;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set22, "cacheAccessControls");
        fup fup = (fup) this.b.b();
        if (!((gnd) this.c.get()).b()) {
            set22 = ajzs.a(gdy.READ_CACHE_ONLY);
        }
        return fup.a(uri, (Set) set, z, set22);
    }
}
