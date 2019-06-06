package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;

/* renamed from: iqf */
public final class iqf extends zgi {
    final ajxe a;
    private final zfw b = zgb.a(b.a, "PermissionBlizzardLoggerActivityObserver");
    private final ajxe c;

    /* renamed from: iqf$b */
    static final class b extends ide {
        public static final b a = new b();

        private b() {
            super("PermissionBlizzardLoggerActivityObserver", idi.APP_PLATFORM);
        }
    }

    /* renamed from: iqf$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: iqf$c */
    static final class c extends akcs implements akbk<dib> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (dib) this.a.get();
        }
    }

    /* renamed from: iqf$f */
    static final class f extends akcs implements akbk<ifs> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ifs) this.a.get();
        }
    }

    /* renamed from: iqf$d */
    static final class d<T> implements ajfb<aajt> {
        private /* synthetic */ iqf a;

        d(iqf iqf) {
            this.a = iqf;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((dib) this.a.a.b()).a((aajt) obj);
        }
    }

    /* renamed from: iqf$e */
    static final class e<T> implements ajfb<Throwable> {
        public static final e a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(iqf.class), "blizzardEventLogger", "getBlizzardEventLogger()Lcom/snap/blizzard/BlizzardEventLogger;"), new akdc(akde.a(iqf.class), "permissionHelper", "getPermissionHelper()Lcom/snap/framework/permission/PermissionHelper;")};
        a aVar = new a();
    }

    public iqf(zgk<b> zgk, ajwy<dib> ajwy, ajwy<ifs> ajwy2, zgb zgb) {
        akcr.b(zgk, "taskScoper");
        akcr.b(ajwy, "blizzardEventLoggerProvider");
        akcr.b(ajwy2, "permissionHelperProvider");
        akcr.b(zgb, "schedulersProvider");
        super(zgk);
        this.a = ajxh.a(new c(ajwy));
        this.c = ajxh.a(new f(ajwy2));
    }

    public final ajej b() {
        Object a = ((ifs) this.c.b()).q().b((ajdw) this.b.f()).a((ajfb) new d(this), (ajfb) e.a);
        akcr.a(a, "permissionHelper.observe…led.\")\n                })");
        return a;
    }
}
