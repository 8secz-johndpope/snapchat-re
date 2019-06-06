package defpackage;

import java.io.File;

/* renamed from: xxv */
public final class xxv implements gfo {
    final ajwy<gqr> a;
    private final ajxe b = ajxh.a(new d(this));
    private final zgb c;
    private final ajwy<xsn> d;

    /* renamed from: xxv$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ xxv a;

        d(xxv xxv) {
            this.a = xxv;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(xsd.a.callsite("CustomStickersPreMigrationProcessor"));
        }
    }

    /* renamed from: xxv$a */
    static final class a<T> implements aipn<File> {
        private /* synthetic */ File a;

        a(File file) {
            this.a = file;
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return this.a;
        }
    }

    /* renamed from: xxv$b */
    static final class b implements ajev {
        public static final b a = new b();

        b() {
        }

        public final void run() {
        }
    }

    /* renamed from: xxv$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ xxv a;

        c(xxv xxv) {
            this.a = xxv;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            gqr gqr = (gqr) this.a.a.get();
            gqt gqt = gqt.HIGH;
            akcr.a(obj, "it");
            gqr.a(gqt, obj, xsd.a.callsite("CustomStickersPreMigrationProcessor"));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(xxv.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public xxv(zgb zgb, ajwy<xsn> ajwy, ajwy<gqr> ajwy2) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "customStickersNetworkSync");
        akcr.b(ajwy2, "exceptionTracker");
        this.c = zgb;
        this.d = ajwy;
        this.a = ajwy2;
    }

    public final ajcx a(File file, File file2, boolean z) {
        akcr.b(file, "internalFilesDir");
        akcr.b(file2, "migrationDir");
        Object a = ((xsn) this.d.get()).a(new a(file), (zfw) this.b.b()).b((ajev) b.a).a(ajfu.g).a((ajfb) new c(this));
        akcr.a(a, "customStickersNetworkSyn…e(TAG))\n                }");
        return a;
    }
}
