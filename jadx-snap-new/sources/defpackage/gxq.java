package defpackage;

import android.net.Uri;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.column.FeatureType.Companion;
import com.snap.core.db.record.DdmlDataModel;
import com.snap.core.db.record.MessageMediaRefModel;

@ftr(a = "public_story_snap/*/*")
/* renamed from: gxq */
public final class gxq extends yjd {
    private final gwb e;

    /* renamed from: gxq$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            gww gww = (gww) obj;
            akcr.b(gww, DdmlDataModel.RECORD);
            return new gfe(gww.c == null ? "" : gww.c, gww.b, gww.d, gww.e, gww.f, 0, false);
        }
    }

    public gxq(gxp gxp, gee gee, gwb gwb, Uri uri, yjh yjh) {
        akcr.b(gxp, "discoverStorySnapContentType");
        akcr.b(gee, "contentManager");
        akcr.b(gwb, "dynamicStorySnapMediaRepository");
        akcr.b(uri, "baseUrl");
        akcr.b(yjh, "additionalImageResolver");
        super(gee, gxp, uri, yjh);
        this.e = gwb;
    }

    public final ajdx<gfe> a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Companion companion = FeatureType.Companion;
        Object obj = uri.getPathSegments().get(1);
        akcr.a(obj, "uri.pathSegments[1]");
        FeatureType valueOfIgnoreCase = companion.valueOfIgnoreCase((String) obj);
        Object obj2 = uri.getPathSegments().get(2);
        akcr.a(obj2, "uri.pathSegments[2]");
        obj2 = this.e.a(Long.parseLong((String) obj2), valueOfIgnoreCase).f(a.a);
        akcr.a(obj2, "dynamicStorySnapMediaRep… false)\n                }");
        return obj2;
    }
}
