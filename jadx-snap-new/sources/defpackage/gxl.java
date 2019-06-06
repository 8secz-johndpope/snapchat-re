package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ryz.a;
import defpackage.ryz.c;
import java.util.Set;

@ftr(a = "publisher_snap_media/*")
/* renamed from: gxl */
public final class gxl extends ggm {
    private final gxk a;
    private final gee b;

    /* renamed from: gxl$a */
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

    public gxl(gxk gxk, gee gee) {
        akcr.b(gxk, "richMediaSnapContentType");
        akcr.b(gee, "contentManager");
        this.a = gxk;
        this.b = gee;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object obj = (String) uri.getPathSegments().get(1);
        gee gee = this.b;
        akcr.a(obj, "url");
        Object a = gee.a(new gew(obj, new a(obj, sac.GET, c.LARGE_MEDIA, set).e(), null, gii.a(null, null, 3), this.a, set, set2, 268)).a(z);
        akcr.a(a, "contentManager.submit(bu…tResult(closeOnTerminate)");
        return a;
    }
}
