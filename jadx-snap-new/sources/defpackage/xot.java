package defpackage;

import android.net.Uri;
import com.brightcove.player.model.Video.Fields;
import com.snap.core.db.record.MessageMediaRefModel;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.concurrent.Callable;

@ftr(a = "SpectaclesContentThumbnail")
/* renamed from: xot */
public final class xot extends ggm {
    final ajxe a;
    private final ajxe b = ajxh.a(b.a);
    private final ajxe c;
    private final ajxe d;
    private xhm e;

    /* renamed from: xot$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: xot$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ xot a;
        private /* synthetic */ String b;

        d(xot xot, String str) {
            this.a = xot;
            this.b = str;
        }

        public final /* synthetic */ Object call() {
            Object obj = 1;
            if ((((CharSequence) this.b).length() == 0 ? 1 : null) == null) {
                Object b = xhm.b(this.b);
                Object a = xhm.a(this.b);
                akcr.a(b, "deviceSerialNumber");
                if ((((CharSequence) b).length() == 0 ? 1 : null) == null) {
                    akcr.a(a, Fields.CONTENT_ID);
                    if (((CharSequence) a).length() != 0) {
                        obj = null;
                    }
                    if (obj == null) {
                        return new ajxm(b, a);
                    }
                }
                StringBuilder stringBuilder = new StringBuilder("Empty serialNumber/contentId for ");
                stringBuilder.append(this.b);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            throw new IllegalArgumentException("Invalid query parameter, empty mediaId");
        }
    }

    /* renamed from: xot$h */
    static final class h<V> implements Callable<T> {
        private /* synthetic */ Uri a;

        h(Uri uri) {
            this.a = uri;
        }

        public final /* synthetic */ Object call() {
            return this.a.getQueryParameter("mediaID");
        }
    }

    /* renamed from: xot$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ xot a;
        private /* synthetic */ String b;

        e(xot xot, String str) {
            this.a = xot;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            String str = (String) ajxm.a;
            xfe a = ((xbd) this.a.d.b()).k().a().a((String) ajxm.b, str);
            if (a != null) {
                return ajxs.a(str, a);
            }
            StringBuilder stringBuilder = new StringBuilder("Unable to locate mediaContent in the database: ");
            stringBuilder.append(this.b);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: xot$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ xot a;
        private /* synthetic */ String b;

        f(xot xot, String str) {
            this.a = xot;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            String str = (String) ajxm.a;
            xfe xfe = (xfe) ajxm.b;
            xfu m = ((xbd) this.a.d.b()).m();
            xdf xdf = xdf.THUMBNAIL;
            obj = xfe.a();
            akcr.a(obj, "mediaContent.mediaId");
            byte[] a = m.a(xdf, obj, str);
            if (((a.length == 0 ? 1 : 0) ^ 1) != 0) {
                return ((gel) this.a.a.b()).a(ajxi.a(new ByteArrayInputStream(a)), "media", (long) a.length, ((idd) this.a.b.b()).a.getName());
            }
            StringBuilder stringBuilder = new StringBuilder("Failed to locate the thumbnail file: ");
            stringBuilder.append(this.b);
            throw new FileNotFoundException(stringBuilder.toString());
        }
    }

    /* renamed from: xot$g */
    static final class g<T, R> implements ajfc<Throwable, gej> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "throwable");
            return new ghx(new gey(-1, th));
        }
    }

    /* renamed from: xot$i */
    static final class i<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ xot a;

        i(xot xot) {
            this.a = xot;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            xot xot = this.a;
            akcr.b(str, "mediaId");
            obj = ajdx.c((Callable) new d(xot, str)).a((ajdw) xot.a().i()).f(new e(xot, str)).a((ajdw) xot.a().f()).f(new f(xot, str)).g(g.a);
            akcr.a(obj, "Single.fromCallable<Pair…T_IN_CACHE, throwable)) }");
            return obj;
        }
    }

    /* renamed from: xot$b */
    static final class b extends akcs implements akbk<idd> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return xai.f.callsite("SpectaclesThumbnailUriHandler");
        }
    }

    /* renamed from: xot$c */
    static final class c extends akcs implements akbk<gel> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gel) this.a.get();
        }
    }

    /* renamed from: xot$j */
    static final class j extends akcs implements akbk<zfw> {
        private /* synthetic */ xot a;
        private /* synthetic */ ajwy b;

        j(xot xot, ajwy ajwy) {
            this.a = xot;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.b.get();
            return zgb.a(((idd) this.a.b.b()));
        }
    }

    /* renamed from: xot$k */
    static final class k extends akcs implements akbk<xbd> {
        private /* synthetic */ ajwy a;

        k(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xbd) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(xot.class), "callSite", "getCallSite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(xot.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(xot.class), "specsCoreComponent", "getSpecsCoreComponent()Lcom/snap/spectacles/base/di/components/SpectaclesCoreComponent;"), new akdc(akde.a(xot.class), "contentResultFactory", "getContentResultFactory()Lcom/snap/core/net/content/api/ContentResultFactory;")};
        a aVar = new a();
    }

    public xot(ajwy<xbd> ajwy, ajwy<zgb> ajwy2, ajwy<gel> ajwy3, xhm xhm) {
        akcr.b(ajwy, "specsCoreComponentLazy");
        akcr.b(ajwy2, "schedulersProvider");
        akcr.b(ajwy3, "contentResultFactoryProvider");
        akcr.b(xhm, "spectaclesUuidUtils");
        this.e = xhm;
        this.c = ajxh.a(new j(this, ajwy2));
        this.d = ajxh.a(new k(ajwy));
        this.a = ajxh.a(new c(ajwy3));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object a = ajdx.c((Callable) new h(uri)).a((ajdw) a().f()).a((ajfc) new i(this));
        akcr.a(a, "Single.fromCallable {\n  …leManager(it)\n          }");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.c.b();
    }
}
