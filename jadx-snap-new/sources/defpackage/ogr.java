package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import com.google.common.base.Optional;
import com.snap.core.db.record.MessageMediaRefModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import java.util.concurrent.Callable;

@ftr(a = "thumbnail/*/package/*")
/* renamed from: ogr */
public final class ogr extends ghz {
    final ajxe a = ajxh.a(new a(this));
    final aipn<ofa> b;
    final jwb c;
    final odl d;
    private final ogq e;
    private final odu f;
    private final gee g;

    /* renamed from: ogr$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ ogr a;
        private /* synthetic */ jwu b;
        private /* synthetic */ abtl c;
        private /* synthetic */ idd d;
        private /* synthetic */ ByteArrayOutputStream e;

        b(ogr ogr, jwu jwu, abtl abtl, idd idd, ByteArrayOutputStream byteArrayOutputStream) {
            this.a = ogr;
            this.b = jwu;
            this.c = abtl;
            this.d = idd;
            this.e = byteArrayOutputStream;
        }

        private boolean a() {
            kaz kaz;
            Bitmap a = jwz.a(this.b.a);
            abtl abtl = this.c;
            if (abtl == null || (abtl.b() >= a.getWidth() && this.c.c() >= a.getHeight())) {
                kaz = null;
            } else {
                jwa jwa = (jwa) this.a.a.b();
                kaz = jwa.a(a, Math.max((a.getWidth() - this.c.b()) / 2, 0), Math.max((a.getHeight() - this.c.c()) / 2, 0), Math.min(this.c.b(), a.getWidth()), Math.min(this.c.c(), a.getHeight()), null, false, this.d.a());
            }
            if (kaz != null) {
                try {
                    Bitmap a2 = jwz.a(kaz);
                    if (a2 != null) {
                        a = a2;
                    }
                } catch (Throwable th) {
                    if (kaz != null) {
                        kaz.dispose();
                    }
                }
            }
            boolean compress = a.compress(CompressFormat.JPEG, 85, this.e);
            if (kaz != null) {
                kaz.dispose();
            }
            return compress;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(a());
        }
    }

    /* renamed from: ogr$c */
    static final class c implements ajev {
        private /* synthetic */ jwu a;

        c(jwu jwu) {
            this.a = jwu;
        }

        public final void run() {
            this.a.a.dispose();
        }
    }

    /* renamed from: ogr$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ ByteArrayOutputStream a;

        d(ByteArrayOutputStream byteArrayOutputStream) {
            this.a = byteArrayOutputStream;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return new ByteArrayInputStream(this.a.toByteArray());
        }
    }

    /* renamed from: ogr$e */
    static final class e<T, R> implements ajfc<T, ajdn<? extends R>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            final Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return ajdj.b((Callable) new Callable<T>() {
                public final /* synthetic */ Object call() {
                    return (abyk) optional.get();
                }
            });
        }
    }

    /* renamed from: ogr$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ int a;

        f(int i) {
            this.a = i;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abyk abyk = (abyk) obj;
            akcr.b(abyk, "mediaPackageSession");
            return (abyi) abyk.c().get(this.a);
        }
    }

    /* renamed from: ogr$g */
    static final class g<T, R> implements ajfc<T, ajdn<? extends R>> {
        final /* synthetic */ Double a;
        private /* synthetic */ ogr b;
        private /* synthetic */ Integer c;
        private /* synthetic */ Integer d;
        private /* synthetic */ idd e;
        private /* synthetic */ ajei f;

        g(ogr ogr, Integer num, Integer num2, Double d, idd idd, ajei ajei) {
            this.b = ogr;
            this.c = num;
            this.d = num2;
            this.a = d;
            this.e = idd;
            this.f = ajei;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abtl a;
            abyi abyi = (abyi) obj;
            akcr.b(abyi, "mediaPackage");
            final abtl a2 = ogc.a(abyi, this.c, this.d);
            Double d = this.a;
            if (d != null) {
                d.doubleValue();
                a = a2.a(this.a.doubleValue());
            } else {
                a = a2;
            }
            return ((ofa) this.b.b.get()).a(this.e, abyi, 1, a, this.f).d().f(new ajfc<T, R>(this) {
                private /* synthetic */ g a;

                public final /* synthetic */ Object apply(Object obj) {
                    Object obj2;
                    jwu jwu = (jwu) obj;
                    akcr.b(jwu, "mediaThumbnail");
                    Double d = this.a.a;
                    if (d != null) {
                        d.doubleValue();
                        obj2 = a2;
                    } else {
                        obj2 = null;
                    }
                    return new ajxm(jwu, obj2);
                }
            });
        }
    }

    /* renamed from: ogr$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ogr a;
        private /* synthetic */ idd b;

        h(ogr ogr, idd idd) {
            this.a = ogr;
            this.b = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "thumbnailAndSize");
            ogr ogr = this.a;
            idd idd = this.b;
            jwu jwu = (jwu) ajxm.a;
            abtl abtl = (abtl) ajxm.b;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            obj = ajdx.c((Callable) new b(ogr, jwu, abtl, idd, byteArrayOutputStream)).b((ajev) new c(jwu)).f(new d(byteArrayOutputStream));
            akcr.a(obj, "Single.fromCallable {\n  …m(output.toByteArray()) }");
            return obj;
        }
    }

    /* renamed from: ogr$i */
    static final class i implements ajev {
        private /* synthetic */ ajei a;

        i(ajei ajei) {
            this.a = ajei;
        }

        public final void run() {
            this.a.dispose();
        }
    }

    /* renamed from: ogr$a */
    static final class a extends akcs implements akbk<jwa> {
        private /* synthetic */ ogr a;

        a(ogr ogr) {
            this.a = ogr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.c.a(this.a.d);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ogr.class), "bitmapFactory", "getBitmapFactory()Lcom/snap/imageloading/api/BitmapFactory;");
    }

    public ogr(ogq ogq, odu odu, gee gee, aipn<ofa> aipn, jwb jwb, odl odl) {
        akcr.b(ogq, "contentType");
        akcr.b(odu, "mediaPackageManager");
        akcr.b(gee, "contentManager");
        akcr.b(aipn, "mediaThumbnailGenerator");
        akcr.b(jwb, "bitmapFactoryProvider");
        akcr.b(odl, "mediaRenderingFeature");
        this.e = ogq;
        this.f = odu;
        this.g = gee;
        this.b = aipn;
        this.c = jwb;
        this.d = odl;
    }

    private static Integer a(Uri uri, String str) {
        Object queryParameter = uri.getQueryParameter(str);
        akcr.a(queryParameter, "queryParameter");
        return (((CharSequence) queryParameter).length() > 0 ? 1 : null) != null ? Integer.valueOf(Integer.parseInt(queryParameter)) : null;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Uri uri2 = uri;
        akcr.b(uri2, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        ajei ajei = new ajei();
        int i = 1;
        String str = (String) uri.getPathSegments().get(1);
        Object obj = uri.getPathSegments().get(3);
        akcr.a(obj, "uri.pathSegments[3]");
        int parseInt = Integer.parseInt((String) obj);
        Integer a = ogr.a(uri2, "width");
        Integer a2 = ogr.a(uri2, "height");
        Object queryParameter = uri2.getQueryParameter("innerZoom");
        akcr.a(queryParameter, "queryParameter");
        if (((CharSequence) queryParameter).length() <= 0) {
            i = 0;
        }
        Double valueOf = i != 0 ? Double.valueOf(Double.parseDouble(queryParameter)) : null;
        gee gee = this.g;
        Object uri3 = uri.toString();
        akcr.a(uri3, "uri.toString()");
        akcr.a((Object) str, "sessionId");
        idd a3 = rzh.c(set).a("MediaPackageThumbnailUriHandler");
        Object h = this.f.b(rzh.c(set), str).b((ajfc) e.a).f(new f(parseInt)).a((ajfc) new g(this, a, a2, valueOf, a3, ajei)).d((ajfc) new h(this, a3)).h();
        akcr.a(h, "mediaPackageManager.look…              .toSingle()");
        h = gee.a(new gew(uri3, null, gem.a((ajdx) h, "media"), null, this.e, set, set2, 276)).a(z).b((ajev) new i(ajei));
        akcr.a(h, "contentManager.submit(De…spose()\n                }");
        return h;
    }
}
