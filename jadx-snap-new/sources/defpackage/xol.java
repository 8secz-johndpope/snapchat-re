package defpackage;

import java.util.concurrent.Callable;

/* renamed from: xol */
public final class xol implements xaq {
    private final ajxe a;
    private final abss b;
    private final ajwy<ftl> c;

    /* renamed from: xol$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: xol$c */
    static final class c extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        c(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(xai.f.callsite("SpectaclesInformationProviderImpl"));
        }
    }

    /* renamed from: xol$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ xol a;

        b(xol xol) {
            this.a = xol;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.b());
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(xol.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public xol(abss abss, ajwy<ftl> ajwy, zgb zgb) {
        akcr.b(abss, "releaseManager");
        akcr.b(ajwy, "compositeConfigurationProvider");
        akcr.b(zgb, "schedulersProvider");
        this.b = abss;
        this.c = ajwy;
        this.a = ajxh.a(new c(zgb));
    }

    public final ajdx<Boolean> a() {
        Object b = ajdx.c((Callable) new b(this)).b((ajdw) ((zfw) this.a.b()).i());
        akcr.a(b, "Single.fromCallable {\n  …eOn(schedulers.queries())");
        return b;
    }

    public final boolean b() {
        return ((ftl) this.c.get()).a((fth) xjd.HAS_USED_SPECTACLES);
    }

    public final ajdx<Boolean> c() {
        Object b;
        String str;
        if (this.b.p()) {
            b = ((ftl) this.c.get()).b((fth) xjd.ENABLE_NEWPORT_VIEWER);
            str = "compositeConfigurationPr…ey.ENABLE_NEWPORT_VIEWER)";
        } else {
            b = ajdx.b(Boolean.FALSE);
            str = "Single.just(false)";
        }
        akcr.a(b, str);
        return b;
    }
}
