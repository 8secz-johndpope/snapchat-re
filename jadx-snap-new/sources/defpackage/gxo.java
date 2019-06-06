package defpackage;

import android.net.Uri;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.column.FeatureType.Companion;
import com.snap.core.db.record.DdmlDataModel;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ryz.c;
import java.util.Set;

@ftr(a = "publisher_snap/*/*/*")
/* renamed from: gxo */
public final class gxo extends ggm {
    final gxn a;
    final gee b;
    final Uri c;
    private final gwd d;

    /* renamed from: gxo$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ gxo a;
        private /* synthetic */ Set b;
        private /* synthetic */ Set c;
        private /* synthetic */ boolean d;

        a(gxo gxo, Set set, Set set2, boolean z) {
            this.a = gxo;
            this.b = set;
            this.c = set2;
            this.d = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gwq gwq = (gwq) obj;
            akcr.b(gwq, DdmlDataModel.RECORD);
            gee gee = this.a.b;
            gxo gxo = this.a;
            Set set = this.b;
            gfl a = gii.a(null, null, 3);
            Set set2 = this.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(gxo.c);
            Object builder = Uri.parse(gwq.b).buildUpon().appendQueryParameter("quality", "hls_v5_med").toString();
            akcr.a(builder, "Uri.parse(url)\n         …              .toString()");
            stringBuilder.append(builder);
            String stringBuilder2 = stringBuilder.toString();
            String str = gwq.a;
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append('_');
            stringBuilder3.append("encoding");
            String stringBuilder4 = stringBuilder3.toString();
            obj = new defpackage.ryz.a(stringBuilder2, sac.GET, c.LARGE_MEDIA, set).e();
            akcr.a(obj, "NetworkRequest.Builder(u…                 .build()");
            return gee.a(new gew(stringBuilder4, (sak) obj, null, a, gxo.a, set, set2, 268)).a(this.d);
        }
    }

    public gxo(gxn gxn, gee gee, gwd gwd, Uri uri) {
        akcr.b(gxn, "discoverPublisherSnapContentType");
        akcr.b(gee, "contentManager");
        akcr.b(gwd, "publisherStorySnapMediaRepository");
        akcr.b(uri, "baseUrl");
        this.a = gxn;
        this.b = gee;
        this.d = gwd;
        this.c = uri;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Companion companion = FeatureType.Companion;
        Object obj = uri.getPathSegments().get(1);
        akcr.a(obj, "uri.pathSegments[1]");
        FeatureType valueOfIgnoreCase = companion.valueOfIgnoreCase((String) obj);
        Object obj2 = (String) uri.getPathSegments().get(2);
        gwd gwd = this.d;
        akcr.a(obj2, "snapId");
        obj2 = gwd.c(Long.parseLong(obj2), valueOfIgnoreCase).a((ajfc) new a(this, set, set2, z));
        akcr.a(obj2, "lookupMedia(uri)\n       …minate)\n                }");
        return obj2;
    }
}
