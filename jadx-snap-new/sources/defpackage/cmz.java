package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ryz.a;
import defpackage.ryz.c;
import java.util.Set;

/* renamed from: cmz */
public abstract class cmz extends ggm {
    private final ajxe a;
    private final geo b;

    /* renamed from: cmz$a */
    static final class a extends akcs implements akbk<gee> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gee) this.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(cmz.class), "contentManager", "getContentManager()Lcom/snap/core/net/content/api/ContentManager;");
    }

    public cmz(geo geo, ajwy<gee> ajwy) {
        akcr.b(geo, "contentType");
        akcr.b(ajwy, "contentManagerProvider");
        this.b = geo;
        this.a = ajxh.a(new a(ajwy));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Set<rzg> set3 = set;
        Uri uri2 = uri;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        Set<? extends gdy> set4 = set2;
        akcr.b(set4, "cacheAccessControls");
        gee gee = (gee) this.a.b();
        String str = ((String) uri.getPathSegments().get(1)).toString();
        Object c = new a(str, sac.GET, c.LARGE_MEDIA, set).e();
        akcr.a(c, "NetworkRequest.Builder(m…hedulingContexts).build()");
        c = gee.a(new gew(str, (sak) c, null, a(uri), this.b, set3, set4, 268)).a(z);
        akcr.a(c, "contentManager\n         …tResult(closeOnTerminate)");
        return c;
    }

    public abstract gfl a(Uri uri);
}
