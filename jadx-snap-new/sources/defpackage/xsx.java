package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.sbm.a;
import java.util.Set;

@ftr(a = "learned_search")
/* renamed from: xsx */
public final class xsx extends ggm {
    private final ajxe a;
    private final xsw b;

    /* renamed from: xsx$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: xsx$b */
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
        new aken[1][0] = new akdc(akde.a(xsx.class), "contentManager", "getContentManager()Lcom/snap/core/net/content/api/ContentManager;");
        a aVar = new a();
    }

    public xsx(xsw xsw, ajwy<gee> ajwy) {
        akcr.b(xsw, "learnedSearchFileContentType");
        akcr.b(ajwy, "contentManager");
        this.b = xsw;
        this.a = ajxh.a(new b(ajwy));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        gee gee = (gee) this.a.b();
        Object d = new a("https://images.bitmoji.com/ml-models/learned-search/v1/en.gz", sac.GET).e();
        akcr.a(d, "SimpleRequest.Builder<An…, HttpMethod.GET).build()");
        Object a = gee.a(new gew("learned_search_v1_en", (sak) d, null, null, this.b, set, set2, 284)).a(z);
        akcr.a(a, "contentManager.submit(\n …tResult(closeOnTerminate)");
        return a;
    }
}
