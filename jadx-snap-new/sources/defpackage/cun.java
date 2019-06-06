package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ghx.a;
import java.util.Set;

@ftr(a = "ad_web_view_resource_content/*")
/* renamed from: cun */
public final class cun extends ggm {
    private final ajxe a;
    private final ajxe b;
    private final cul c;
    private final gee d;

    /* renamed from: cun$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: cun$b */
    static final class b extends akcs implements akbk<gin> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gin) this.a.get();
        }
    }

    /* renamed from: cun$c */
    static final class c extends akcs implements akbk<zvz> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zvz) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(cun.class), "webViewRequestContextStore", "getWebViewRequestContextStore()Lcom/snap/web/api/WebViewRequestContextStore;"), new akdc(akde.a(cun.class), "responseHeaderAwarePayloadProcessor", "getResponseHeaderAwarePayloadProcessor()Lcom/snap/core/net/content/impl/ResponseHeaderAwarePayloadProcessor;")};
        a aVar = new a();
    }

    public cun(cul cul, gee gee, ajwy<zvz> ajwy, ajwy<gin> ajwy2) {
        akcr.b(cul, "webViewResourceContentType");
        akcr.b(gee, "contentManager");
        akcr.b(ajwy, "webViewRequestContextStoreProvider");
        akcr.b(ajwy2, "responseHeaderAwareProcessorProvider");
        this.c = cul;
        this.d = gee;
        this.a = ajxh.a(new c(ajwy));
        this.b = ajxh.a(new b(ajwy2));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Object b;
        String str;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        String str2 = (String) uri.getPathSegments().get(1);
        zvz zvz = (zvz) this.a.b();
        akcr.a((Object) str2, "requestKey");
        zwd a = zvz.a(str2);
        if (a == null) {
            b = ajdx.b(a.a(new Throwable("can not find request context by id ".concat(String.valueOf(str2))), null));
            str = "Single.just(FailedConten…ext by id $requestKey\")))";
        } else {
            akcr.b(a, "requestContext");
            b = new sbm.a(a.a, sac.GET, a.b, ajyx.a).e();
            akcr.a(b, "SimpleRequest.Builder<An…\n                .build()");
            sak sak = (sak) b;
            gee gee = this.d;
            Object obj = (gin) this.b.b();
            akcr.a(obj, "responseHeaderAwarePayloadProcessor");
            b = gee.a(new gew(str2, sak, null, (gfl) obj, this.c, set, set2, 268)).a(z);
            str = "contentManager.submit(\n …tResult(closeOnTerminate)";
        }
        akcr.a(b, str);
        return b;
    }
}
