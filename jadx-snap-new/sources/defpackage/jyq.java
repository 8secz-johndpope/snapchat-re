package defpackage;

/* renamed from: jyq */
public final class jyq implements jwo {
    volatile boolean a = true;
    volatile boolean b;
    private final ajxe c;
    private boolean d = false;
    private boolean e = false;

    /* renamed from: jyq$e */
    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        e(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(jwp.a.callsite("ABImageLoadingConfiguration"));
        }
    }

    /* renamed from: jyq$a */
    static final class a<T> implements ajfb<Boolean> {
        private /* synthetic */ jyq a;

        a(jyq jyq) {
            this.a = jyq;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            jyq jyq = this.a;
            akcr.a(obj, "it");
            jyq.a = obj.booleanValue();
        }
    }

    /* renamed from: jyq$b */
    static final class b<T> implements ajfb<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: jyq$c */
    static final class c<T> implements ajfb<Boolean> {
        private /* synthetic */ jyq a;

        c(jyq jyq) {
            this.a = jyq;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            jyq jyq = this.a;
            akcr.a(obj, "it");
            jyq.b = obj.booleanValue();
        }
    }

    /* renamed from: jyq$d */
    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(jyq.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public jyq(ajwy<ftl> ajwy, zgb zgb) {
        akcr.b(ajwy, "configProvider");
        akcr.b(zgb, "schedulersProvider");
        this.c = ajxh.a(new e(zgb));
        ((ftl) ajwy.get()).p(jxw.MDP_IMAGELOAD_PREDOWNLOAD_ENABLED).b((ajdw) c().i()).a((ajfb) new a(this), (ajfb) b.a);
        ((ftl) ajwy.get()).p(jxw.IMAGE_LOADING_CUSTOM_DOWNSAMPLER_ENABLED).b((ajdw) c().i()).a((ajfb) new c(this), (ajfb) d.a);
    }

    private final zfw c() {
        return (zfw) this.c.b();
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }
}
