package defpackage;

import com.google.common.base.Supplier;

/* renamed from: mal */
public final class mal implements mhi<a> {
    public String a;
    private final c b;

    /* renamed from: mal$c */
    public interface c {
        ide g();

        zgb h();

        ajdp<mmt> j();

        miw l();

        Supplier<iha> y();
    }

    /* renamed from: mal$a */
    public static abstract class a implements mha {

        /* renamed from: mal$a$a */
        public interface a {
            a a(String str);

            a a(c cVar);

            a a();
        }

        /* renamed from: mal$a$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ ajdp a;

            b(ajdp ajdp) {
                this.a = ajdp;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "enabled");
                return bool.booleanValue() ? this.a : ajvo.a(ajot.a);
            }
        }

        public final ajej a() {
            Object l = b().l();
            akcr.a(l, "observe().subscribe()");
            return l;
        }

        public final ajdp<Object> b() {
            ajdp b = e().b();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(mip.a(e().getClass()));
            stringBuilder.append("#observe");
            Object u = f().a(defpackage.miw.b.a.a).a(mja.NATIVE_PROFILER_ENABLED).u(new b(mip.b(b, stringBuilder.toString()).b((ajdw) d().l()).c((ajdw) d().l())));
            akcr.a(u, "configurationRepository.…  }\n                    }");
            return u;
        }

        public abstract zfw d();

        public abstract mao e();

        public abstract miw f();
    }

    /* renamed from: mal$b */
    public static abstract class b {

        /* renamed from: mal$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("Instrumentation"));
        }
    }

    public mal(c cVar) {
        akcr.b(cVar, "parentComponent");
        this.b = cVar;
    }

    public final /* synthetic */ Object a() {
        a a = mag.c().a(this.b);
        String str = this.a;
        if (str == null) {
            akcr.a("userAgent");
        }
        return a.a(str).a();
    }
}
