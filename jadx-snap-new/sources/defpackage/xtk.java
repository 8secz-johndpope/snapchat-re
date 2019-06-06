package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

@ftr(a = "stickers_metadata")
/* renamed from: xtk */
public final class xtk extends ggm {
    private final ajxe a;
    private final xtj b;

    /* renamed from: xtk$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: xtk$b */
    static final class b extends akcq implements akbk<gee> {
        b(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (gee) ((ajwy) this.receiver).get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(xtk.class), "contentManager", "getContentManager()Lcom/snap/core/net/content/api/ContentManager;");
        a aVar = new a();
    }

    public xtk(xtj xtj, ajwy<gee> ajwy) {
        akcr.b(xtj, "stickersFileContentType");
        akcr.b(ajwy, "contentManager");
        this.b = xtj;
        this.a = ajxh.a(new b(ajwy));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        String queryParameter = uri.getQueryParameter("URL");
        if (queryParameter != null) {
            Object a = ((gee) this.a.b()).a(new gew(String.valueOf(queryParameter.hashCode()), null, null, null, this.b, set, set2, 284)).a(z);
            akcr.a(a, "contentManager.submit(De…tResult(closeOnTerminate)");
            return a;
        }
        throw new IllegalArgumentException("Url for metadata was null");
    }
}
