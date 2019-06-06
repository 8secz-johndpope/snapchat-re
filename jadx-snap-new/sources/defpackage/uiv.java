package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ryz.a;
import defpackage.ryz.c;
import java.util.Set;

@ftr(a = "emoji_brush_resource")
/* renamed from: uiv */
public final class uiv extends ggm {
    private final String a;
    private final uio b;
    private final gee c;

    public uiv(uio uio, gee gee, Uri uri) {
        akcr.b(uio, "emojiBrushResourceContentType");
        akcr.b(gee, "contentManager");
        akcr.b(uri, "baseUrl");
        this.b = uio;
        this.c = gee;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri);
        stringBuilder.append("/preview_drawing/get_emoji_brush_resource");
        this.a = stringBuilder.toString();
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        String str = "version";
        Object queryParameter = uri.getQueryParameter(str);
        gee gee = this.c;
        akcr.a(queryParameter, str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("?version=");
        stringBuilder.append(queryParameter);
        queryParameter = new a(stringBuilder.toString(), sac.POST, c.METADATA, set).a(new gma(new aedh())).e();
        akcr.a(queryParameter, "NetworkRequest.Builder(u…                 .build()");
        queryParameter = gee.a(new gew("emoji_brush_resource", (sak) queryParameter, null, null, this.b, set, set2, 284)).a(z);
        akcr.a(queryParameter, "contentManager.submit(co…tResult(closeOnTerminate)");
        return queryParameter;
    }
}
