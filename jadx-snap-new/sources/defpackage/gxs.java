package defpackage;

import android.net.Uri;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.column.FeatureType.Companion;
import com.snap.core.db.record.DdmlDataModel;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ryz.c;
import java.util.Set;

@ftr(a = "public_story_streaming_snap/*/*")
/* renamed from: gxs */
public final class gxs extends ggm {
    final gxr a;
    final gee b;
    private final gwb c;

    /* renamed from: gxs$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ gxs a;
        private /* synthetic */ Set b;
        private /* synthetic */ Set c;
        private /* synthetic */ boolean d;

        a(gxs gxs, Set set, Set set2, boolean z) {
            this.a = gxs;
            this.b = set;
            this.c = set2;
            this.d = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gww gww = (gww) obj;
            akcr.b(gww, DdmlDataModel.RECORD);
            gee gee = this.a.b;
            gxs gxs = this.a;
            Set set = this.b;
            Set set2 = this.c;
            String str = gww.d;
            if (str == null) {
                akcr.a();
            }
            String str2 = gww.a;
            String a = yje.a(gww.b);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append('_');
            stringBuilder.append(a);
            str2 = stringBuilder.toString();
            obj = new defpackage.ryz.a(str, sac.GET, c.LARGE_MEDIA, set).e();
            akcr.a(obj, "NetworkRequest.Builder(u…                 .build()");
            return gee.a(new gew(str2, (sak) obj, null, gii.a(null, null, 3), gxs.a, set, set2, 268)).a(this.d);
        }
    }

    public gxs(gxr gxr, gee gee, gwb gwb) {
        akcr.b(gxr, "discoverStoryStreamingSnapContentType");
        akcr.b(gee, "contentManager");
        akcr.b(gwb, "dynamicStorySnapMediaRepository");
        this.a = gxr;
        this.b = gee;
        this.c = gwb;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Companion companion = FeatureType.Companion;
        Object obj = uri.getPathSegments().get(1);
        akcr.a(obj, "uri.pathSegments[1]");
        FeatureType valueOfIgnoreCase = companion.valueOfIgnoreCase((String) obj);
        Object obj2 = uri.getPathSegments().get(2);
        akcr.a(obj2, "uri.pathSegments[2]");
        obj2 = this.c.a(Long.parseLong((String) obj2), valueOfIgnoreCase).a((ajfc) new a(this, set, set2, z));
        akcr.a(obj2, "lookupMedia(uri)\n       …minate)\n                }");
        return obj2;
    }
}
