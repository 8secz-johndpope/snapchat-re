package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

@ftr(a = "Shazam")
/* renamed from: wxu */
public final class wxu extends ggm {
    final wxr a;
    final fur b;
    private final ajxe c = ajxh.a(new a(this));

    /* renamed from: wxu$a */
    static final class a extends akcs implements akbk<fuo> {
        private /* synthetic */ wxu a;

        a(wxu wxu) {
            this.a = wxu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.a(this.a.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(wxu.class), "urlUriHandler", "getUrlUriHandler()Lcom/snap/content/shared/handler/UrlUriHandler;");
    }

    public wxu(wxr wxr, fur fur) {
        akcr.b(wxr, "shazamContentType");
        akcr.b(fur, "urlUriHandlerFactory");
        this.a = wxr;
        this.b = fur;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        return ((fuo) this.c.b()).a(uri, set, z, set2);
    }
}
