package defpackage;

import com.snap.ads.core.lib.adtrack.retro.RetroRetryJob;
import defpackage.hwm.a;

/* renamed from: col */
public final class col implements hwm<RetroRetryJob, Boolean> {
    private final ajxe a;
    private final ajxe b;
    private final ajxe c;
    private final ajxe d;

    /* renamed from: col$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: col$f */
    static final class f extends akcs implements akbk<coh> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (coh) this.a.get();
        }
    }

    /* renamed from: col$d */
    static final class d extends akcs implements akbk<ilw> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilw) this.a.get();
        }
    }

    /* renamed from: col$b */
    static final class b extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    /* renamed from: col$c */
    static final class c extends akcs implements akbk<ilv> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) this.a.get();
        }
    }

    /* renamed from: col$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ col a;

        e(col col) {
            this.a = col;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (Boolean) obj;
            akcr.b(obj, "it");
            Object b = this.a.b();
            akcr.a(b, "configProvider");
            Object a = this.a.a();
            akcr.a(a, "grapheneFlusher");
            coc.a(b, a);
            if (akcr.a(obj, Boolean.FALSE)) {
                return ajdx.b((Throwable) new coj());
            }
            if (akcr.a(obj, Boolean.TRUE)) {
                return ajdx.b(Boolean.TRUE);
            }
            throw new ajxk();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(col.class), "retroPersistenceManager", "getRetroPersistenceManager()Lcom/snap/ads/core/lib/adtrack/retro/RetroPersistenceManager;"), new akdc(akde.a(col.class), "grapheneFlusher", "getGrapheneFlusher()Lcom/snap/graphene/GrapheneFlusher;"), new akdc(akde.a(col.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(col.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;")};
        a aVar = new a();
    }

    public col(ajwy<coh> ajwy, ajwy<ilw> ajwy2, ajwy<ftl> ajwy3, ajwy<ilv> ajwy4) {
        akcr.b(ajwy, "retroPersistenceManager");
        akcr.b(ajwy2, "grapheneFlusherProvider");
        akcr.b(ajwy3, "configProviderProvider");
        akcr.b(ajwy4, "grapheneProvider");
        this.a = ajxh.a(new f(ajwy));
        this.b = ajxh.a(new d(ajwy2));
        this.c = ajxh.a(new b(ajwy3));
        this.d = ajxh.a(new c(ajwy4));
    }

    /* Access modifiers changed, original: final */
    public final ilw a() {
        return (ilw) this.b.b();
    }

    public final void a(String str) {
        String str2 = "uuid";
        akcr.b(str, str2);
        akcr.b(str, str2);
    }

    public final void a(String str, Integer num) {
        String str2 = "uuid";
        akcr.b(str, str2);
        akcr.b(str, str2);
    }

    public final boolean a(Throwable th) {
        akcr.b(th, "throwable");
        return th instanceof coj;
    }

    /* Access modifiers changed, original: final */
    public final ftl b() {
        return (ftl) this.c.b();
    }

    public final /* bridge */ /* synthetic */ void b(hwg hwg) {
        RetroRetryJob retroRetryJob = (RetroRetryJob) hwg;
        String str = "durableJob";
        akcr.b(retroRetryJob, str);
        akcr.b(retroRetryJob, str);
    }

    public final /* synthetic */ ajcx c(hwg hwg) {
        RetroRetryJob retroRetryJob = (RetroRetryJob) hwg;
        akcr.b(retroRetryJob, "durableJob");
        return a.a(retroRetryJob);
    }

    public final ide c() {
        return ckz.a;
    }

    public final void d() {
    }

    public final /* synthetic */ void d(hwg hwg) {
        RetroRetryJob retroRetryJob = (RetroRetryJob) hwg;
        String str = "durableJob";
        akcr.b(retroRetryJob, str);
        akcr.b(retroRetryJob, str);
    }

    public final /* synthetic */ ajcx e(hwg hwg) {
        RetroRetryJob retroRetryJob = (RetroRetryJob) hwg;
        akcr.b(retroRetryJob, "durableJob");
        return a.b(retroRetryJob);
    }
}
