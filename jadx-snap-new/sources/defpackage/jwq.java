package defpackage;

import android.content.Context;

/* renamed from: jwq */
public class jwq {
    public final ajei a = new ajei();
    public final ajxe b = ajxh.a(e.a);
    public final ajwy<jwi> c;
    public final ajwy<jxi> d;
    public final ajwy<jws> e;
    public final ajwy<jwo> f;
    public final ajwy<jwx> g;
    public final ajwy<jwk> h;
    public final ajwy<jwn> i;
    public final zgb j;
    final aipn<jwb> k;
    public final ajwy<jwe> l;
    public final ajwy<jxk> m;
    private final ajxe n = ajxh.a(new b(this));
    private final ajxe o;

    /* renamed from: jwq$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: jwq$e */
    static final class e extends akcs implements akbk<jxo> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new jxo();
        }
    }

    /* renamed from: jwq$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ jwq a;

        b(jwq jwq) {
            this.a = jwq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(jwp.a, "animated");
        }
    }

    /* renamed from: jwq$d */
    static final class d extends akcs implements akbk<jxy> {
        private /* synthetic */ jwq a;
        private /* synthetic */ Context b;

        d(jwq jwq, Context context) {
            this.a = jwq;
            this.b = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new jxy(this.b, this.a.a(), (jwi) this.a.c.get(), this.a.k);
        }
    }

    /* renamed from: jwq$c */
    public static final class c implements Runnable {
        private /* synthetic */ jwq a;

        public c(jwq jwq) {
            this.a = jwq;
        }

        public final void run() {
            this.a.b().a();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(jwq.class), "animatedWebPSchedulers", "getAnimatedWebPSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(jwq.class), "threadUtils", "getThreadUtils()Lcom/snap/imageloading/common/ThreadUtils;"), new akdc(akde.a(jwq.class), "mushroomAnimatedDraweeControllerBuilderSupplierSupplier", "getMushroomAnimatedDraweeControllerBuilderSupplierSupplier()Lcom/snap/imageloading/fresco/AnimatedDraweeControllerBuilderSupplierSupplier;")};
        a aVar = new a();
    }

    public jwq(Context context, ajwy<jwi> ajwy, ajwy<jxi> ajwy2, ajwy<jws> ajwy3, ajwy<jwo> ajwy4, ajwy<jwx> ajwy5, ajwy<jwk> ajwy6, ajwy<jwn> ajwy7, zgb zgb, aipn<jwb> aipn, ajwy<jwe> ajwy8, ajwy<jxk> ajwy9) {
        akcr.b(context, "context");
        akcr.b(ajwy, "contentUriResolver");
        akcr.b(ajwy2, "uriUiPageLoader");
        akcr.b(ajwy3, "imageUrlResolver");
        akcr.b(ajwy4, "imageLoadingConfiguration");
        akcr.b(ajwy5, "recycledBitmapTracker");
        akcr.b(ajwy6, "disposableBitmapTracker");
        akcr.b(ajwy7, "frameworkMetricsReporter");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "bitmapFactoryProvider");
        akcr.b(ajwy8, "bitmapLoader");
        akcr.b(ajwy9, "viewBitmapLoaderFactory");
        this.c = ajwy;
        this.d = ajwy2;
        this.e = ajwy3;
        this.f = ajwy4;
        this.g = ajwy5;
        this.h = ajwy6;
        this.i = ajwy7;
        this.j = zgb;
        this.k = aipn;
        this.l = ajwy8;
        this.m = ajwy9;
        this.o = ajxh.a(new d(this, context));
    }

    public final zfw a() {
        return (zfw) this.n.b();
    }

    public final jxy b() {
        return (jxy) this.o.b();
    }
}
