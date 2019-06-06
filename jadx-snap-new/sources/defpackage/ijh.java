package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ils.d;
import java.util.Set;
import java.util.concurrent.Callable;

@ftr(a = "geofilter/overlay")
/* renamed from: ijh */
public final class ijh extends ggm {
    final ajxe a;
    final ijf b;
    private final ajxe c;
    private final ajxe d;

    /* renamed from: ijh$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ijh a;
        private /* synthetic */ Set b;
        private /* synthetic */ Set c;
        private /* synthetic */ boolean d;

        c(ijh ijh, Set set, Set set2, boolean z) {
            this.a = ijh;
            this.b = set;
            this.c = set2;
            this.d = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return ((gee) this.a.a.b()).a(new gew(str, null, null, gii.a, this.a.b, this.b, this.c, 270)).a(this.d);
        }
    }

    /* renamed from: ijh$a */
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

    /* renamed from: ijh$b */
    static final class b extends akcs implements akbk<ils> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ils) this.a.get();
        }
    }

    /* renamed from: ijh$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        d(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(ijd.a.callsite("GeofilterOverlayUriHandler"));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ijh.class), "geofilterOverlayCacheKeyHelper", "getGeofilterOverlayCacheKeyHelper()Lcom/snap/geofilters/utils/GeofilterOverlayCacheKeyHelper;"), new akdc(akde.a(ijh.class), "contentManager", "getContentManager()Lcom/snap/core/net/content/api/ContentManager;"), new akdc(akde.a(ijh.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public ijh(ijf ijf, ajwy<ils> ajwy, ajwy<gee> ajwy2, zgb zgb) {
        akcr.b(ijf, "geofilterOverlayContentType");
        akcr.b(ajwy, "geofilterOverlayCacheKeyHelperProvider");
        akcr.b(ajwy2, "contentManagerProvider");
        akcr.b(zgb, "schedulersProvider");
        this.b = ijf;
        this.c = ajxh.a(new b(ajwy));
        this.a = ajxh.a(new a(ajwy2));
        this.d = ajxh.a(new d(zgb));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object queryParameter = uri.getQueryParameter("OVERLAY_GEOFILTER_ID");
        ils ils = (ils) this.c.b();
        String str = "id";
        akcr.a(queryParameter, str);
        akcr.b(queryParameter, str);
        queryParameter = ajdx.c((Callable) new d(ils, queryParameter));
        akcr.a(queryParameter, "Single.fromCallable { cacheKeyMap[id].orEmpty() }");
        queryParameter = queryParameter.a((ajfc) new c(this, set, set2, z)).b((ajdw) ((zfw) this.d.b()).f());
        akcr.a(queryParameter, "geofilterOverlayCacheKey…scribeOn(schedulers.io())");
        return queryParameter;
    }
}
