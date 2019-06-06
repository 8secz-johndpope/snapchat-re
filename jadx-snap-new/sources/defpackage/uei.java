package defpackage;

import android.net.Uri;
import com.snap.core.db.record.CharmsModel;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.sbm.a;
import java.util.Set;

@ftr(a = "caption_style_metadata")
/* renamed from: uei */
public final class uei extends ggm {
    private final String a;
    private final ueg b;
    private final gee c;

    /* renamed from: uei$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public uei(ueg ueg, gee gee, Uri uri) {
        akcr.b(ueg, "captionStyleMetadataContentType");
        akcr.b(gee, "contentManager");
        akcr.b(uri, "baseUrl");
        this.b = ueg;
        this.c = gee;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri);
        stringBuilder.append("/preview_caption/get_caption_style_resource");
        this.a = stringBuilder.toString();
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object queryParameter = uri.getQueryParameter("caption_locale");
        gee gee = this.c;
        akcr.a(queryParameter, CharmsModel.LOCALE);
        String concat = "caption_style_metadata_".concat(String.valueOf(queryParameter));
        Object e = new a(this.a, sac.POST).b(new gma(new ueh(queryParameter))).e();
        akcr.a(e, "SimpleRequest.Builder<An…                 .build()");
        queryParameter = gee.a(new gew(concat, e, null, null, this.b, set, set2, 284)).a(z);
        akcr.a(queryParameter, "contentManager.submit(bu…tResult(closeOnTerminate)");
        return queryParameter;
    }
}
