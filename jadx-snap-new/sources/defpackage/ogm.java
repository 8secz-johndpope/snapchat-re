package defpackage;

import android.net.Uri;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.vlp.a.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Set;

@ftr(a = "media/*/package/*")
/* renamed from: ogm */
public final class ogm extends ghz {
    final ajxe a;
    private final ogs b;

    /* renamed from: ogm$c */
    static final class c<T> implements Supplier<T> {
        final /* synthetic */ ajei a;
        private /* synthetic */ ogm b;
        private /* synthetic */ idd c;
        private /* synthetic */ abtl d;
        private /* synthetic */ odx e;

        /* renamed from: ogm$c$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                kaz kaz = (kaz) obj;
                akcr.b(kaz, "refCountBitmap");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                obj = kaz.a();
                akcr.a(obj, "refCountBitmap.get()");
                ((jwj) obj).a().compress(ogn.a, 100, byteArrayOutputStream);
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        }

        /* renamed from: ogm$c$2 */
        static final class 2 implements ajev {
            private /* synthetic */ c a;

            2(c cVar) {
                this.a = cVar;
            }

            public final void run() {
                this.a.a.dispose();
            }
        }

        c(ogm ogm, idd idd, abtl abtl, odx odx, ajei ajei) {
            this.b = ogm;
            this.c = idd;
            this.d = abtl;
            this.e = odx;
            this.a = ajei;
        }

        public final /* synthetic */ Object get() {
            return (ByteArrayInputStream) ((vlp) this.b.a.b()).a(this.c.a("MediaPackageMediaUriHandler"), new b(this.d, null, null, false, 6), this.e.b(), this.a).k().f(1.a).b((ajev) new 2(this)).b();
        }
    }

    /* renamed from: ogm$a */
    static final class a extends akcs implements akbk<vlp> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (vlp) this.a.get();
        }
    }

    /* renamed from: ogm$b */
    static final class b extends akcs implements akbw<idd, odx, odp> {
        private /* synthetic */ ogm a;

        b(ogm ogm) {
            this.a = ogm;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Supplier ofInstance;
            idd idd = (idd) obj;
            odx odx = (odx) obj2;
            akcr.b(idd, "caller");
            akcr.b(odx, "mediaPackageReader");
            ogm ogm = this.a;
            aeew aeew = odx.b().e;
            aeew aeew2 = odx.b().e;
            Object obj3 = aeew2.q;
            akcr.a(obj3, "it.width");
            int intValue = obj3.intValue();
            Object obj4 = aeew2.p;
            akcr.a(obj4, "it.height");
            Object abtl = new abtl(intValue, obj4.intValue());
            abtl b = abyj.b(aeew);
            obj4 = new abtl(b.b(), b.c());
            Object obj5 = odx.b().e.a;
            akcr.a(obj5, "this.mediaType");
            if (abyp.a(obj5.intValue()) || akcr.a(abtl, obj4)) {
                ofInstance = Suppliers.ofInstance(odx.f());
            } else {
                ofInstance = Suppliers.memoize(new c(ogm, idd, obj4, odx, new ajei()));
            }
            return new odp("media", ofInstance, odx.e(), null, 8);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ogm.class), "imageRenderer", "getImageRenderer()Lcom/snap/rendering/transcoding/image/ImageRenderer;");
    }

    public ogm(odu odu, ajwy<vlp> ajwy) {
        akcr.b(odu, "mediaPackageManager");
        akcr.b(ajwy, "imageRenderer");
        this.a = ajxh.a(new a(ajwy));
        this.b = new ogs(odu, new b(this));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        return gem.a(this.b.a(uri, set), z);
    }
}
