package defpackage;

import android.content.Context;
import com.google.common.base.Optional;

/* renamed from: jzj */
public final class jzj implements jwe {
    final ajxe a = ajxh.a(e.a);
    private final ajxe b;
    private final ajxe c = ajxh.a(new c(this));
    private final ajxe d;
    private final zfw e;
    private final ajwy<jzw> f;
    private final jxg g;

    /* renamed from: jzj$e */
    static final class e extends akcs implements akbk<jxo> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new jxo();
        }
    }

    /* renamed from: jzj$a */
    static final class a extends akcs implements akbk<aib> {
        private /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ahx.b(this.a);
        }
    }

    /* renamed from: jzj$c */
    static final class c extends akcs implements akbk<jzu> {
        private /* synthetic */ jzj a;

        c(jzj jzj) {
            this.a = jzj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new jzu((jxo) this.a.a.b());
        }
    }

    /* renamed from: jzj$b */
    static final class b extends akcs implements akbk<jzr> {
        final /* synthetic */ Optional a;
        private /* synthetic */ Context b;
        private /* synthetic */ ihh c;
        private /* synthetic */ ajwy d;
        private /* synthetic */ ajwy e;
        private /* synthetic */ ajwy f;
        private /* synthetic */ zgb g;

        /* renamed from: jzj$b$1 */
        static final class 1<T> implements ajwy<jwi> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* bridge */ /* synthetic */ Object get() {
                return (jwi) this.a.a.get();
            }
        }

        b(Context context, ihh ihh, ajwy ajwy, ajwy ajwy2, Optional optional, ajwy ajwy3, zgb zgb) {
            this.b = context;
            this.c = ihh;
            this.d = ajwy;
            this.e = ajwy2;
            this.a = optional;
            this.f = ajwy3;
            this.g = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new jzr(this.b, this.c, this.d, this.e, this.a.isPresent() ? new 1(this) : null, this.f, this.g);
        }
    }

    /* renamed from: jzj$d */
    static final class d<T> implements ajwy<jzw> {
        private /* synthetic */ ajwy a;
        private /* synthetic */ ajwy b;
        private /* synthetic */ ihh c;

        d(ajwy ajwy, ajwy ajwy2, ihh ihh) {
            this.a = ajwy;
            this.b = ajwy2;
            this.c = ihh;
        }

        public final /* synthetic */ Object get() {
            return new jzw(this.a, this.b, this.c);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(jzj.class), "glideRequestManager", "getGlideRequestManager()Lcom/bumptech/glide3/RequestManager;"), new akdc(akde.a(jzj.class), "threadUtils", "getThreadUtils()Lcom/snap/imageloading/common/ThreadUtils;"), new akdc(akde.a(jzj.class), "internalGlideHelper", "getInternalGlideHelper()Lcom/snap/imageloading/internal/glide3/impl/InternalGlideHelper;"), new akdc(akde.a(jzj.class), "glideSharedDependencies", "getGlideSharedDependencies()Lcom/snap/imageloading/internal/glide3/impl/GlideSharedDependencies;")};
    }

    public jzj(ajwy<jwk> ajwy, ajwy<jwn> ajwy2, Optional<jwi> optional, ajwy<jwo> ajwy3, Context context, zgb zgb, ihh ihh, jxg jxg) {
        ajwy<jwk> ajwy4 = ajwy;
        ajwy<jwn> ajwy5 = ajwy2;
        Context context2 = context;
        ihh ihh2 = ihh;
        jxg jxg2 = jxg;
        akcr.b(ajwy, "disposableBitmapTracker");
        akcr.b(ajwy2, "frameworkMetricsReporter");
        Optional<jwi> optional2 = optional;
        akcr.b(optional2, "contentUriResolver");
        ajwy<jwo> ajwy6 = ajwy3;
        akcr.b(ajwy6, "config");
        akcr.b(context2, "context");
        zgb zgb2 = zgb;
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(ihh2, "clock");
        akcr.b(jxg2, "testBitmapPostProcessorProvider");
        this.g = jxg2;
        this.b = ajxh.a(new a(context2));
        this.d = ajxh.a(new b(context2, ihh, ajwy, ajwy2, optional2, ajwy6, zgb2));
        this.e = zgb.a(jwp.a, "BitmapLoader");
        this.f = new d(ajwy2, ajwy, ihh2);
    }

    public final jwc a() {
        Object obj = (aib) this.b.b();
        akcr.a(obj, "glideRequestManager");
        return new jzi(obj, (jzu) this.c.b(), (jzr) this.d.b(), this.e.l(), this.e.f(), this.f);
    }
}
