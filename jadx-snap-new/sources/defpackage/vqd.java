package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.dnk.d;
import defpackage.vpj.c;
import defpackage.vpk.a;
import java.util.List;

/* renamed from: vqd */
public final class vqd implements gvn {
    private final List<String> a = ajym.b((Object[]) new String[]{"https://www.snapchat.com/unlock..*", "http://www.snapchat.com/unlock..*", "https://snapchat.com/unlock..*", "http://snapchat.com/unlock..*", "snapchat://unlock..*"});
    private final ajdu<vpk, dnk> b;
    private final ajdu<dnk, Object> c;

    public vqd(ajdu<vpk, dnk> ajdu, ajdu<dnk, Object> ajdu2) {
        akcr.b(ajdu, "unlockTransformer");
        akcr.b(ajdu2, "navigationTransformer");
        this.b = ajdu;
        this.c = ajdu2;
    }

    public final List<String> a() {
        return this.a;
    }

    public final ajcx c(Uri uri) {
        ajdp a;
        akcr.b(uri, MessageMediaRefModel.URI);
        try {
            a = ajdp.b(new a(c.a(uri))).a(this.b);
        } catch (IllegalArgumentException unused) {
            a = ajdp.b(new d(dqf.f));
        }
        Object g = a.a(this.c).g();
        akcr.a(g, "unlockResult.compose(nav…sformer).ignoreElements()");
        return g;
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
