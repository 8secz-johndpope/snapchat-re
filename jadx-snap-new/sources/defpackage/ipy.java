package defpackage;

import com.snap.identity.IdentityHttpInterface;
import defpackage.iqa.b;
import defpackage.iqa.c;
import java.util.concurrent.Callable;

/* renamed from: ipy */
public final class ipy {
    final ajwy<iqa> a;
    final ajwy<IdentityHttpInterface> b;
    final ihh c;
    final ajwy<ftl> d;
    final ajwy<tnj> e;
    final ajwy<ilv> f;
    private final ajxe g = ajxh.a(new b(this));
    private zgb h;

    /* renamed from: ipy$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ipy$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ ipy a;

        b(ipy ipy) {
            this.a = ipy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(irc.t, "PermissionSettingsReporter");
        }
    }

    /* renamed from: ipy$c */
    public static final class c<V> implements Callable<T> {
        private /* synthetic */ ipy a;

        public c(ipy ipy) {
            this.a = ipy;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            ipy ipy = this.a;
            long h = ((ftl) ipy.d.get()).h(jic.LAST_PERMISSION_REPORT_TIMESTAMP);
            if (h == 0) {
                z = true;
            } else {
                akqy akqy = new akqy(h);
                akqy akqy2 = new akqy(ipy.c.a());
                akcr.b(akqy, "lastReport");
                akcr.b(akqy2, "now");
                z = akqy.a(24).c((akrw) akqy2);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ipy$d */
    public static final class d<T> implements ajfl<Boolean> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: ipy$e */
    public static final class e<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ ipy a;

        public e(ipy ipy) {
            this.a = ipy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            akcr.b((Boolean) obj, "it");
            iqa iqa = (iqa) this.a.a.get();
            if (abnl.i) {
                ajeb a = iqa.a().a();
                Object b = ajdx.b(Boolean.valueOf(((iqm) iqa.a.b()).d()));
                akcr.a(b, "Single.just(contactApi.hasAccessToContacts())");
                obj = ajwc.a(a, (ajeb) b).f(new b(iqa));
                str = "Singles.zip(notification…request\n                }";
            } else {
                obj = iqa.a().a().f(new c(iqa));
                str = "notificationPreferences.…        request\n        }";
            }
            akcr.a(obj, str);
            return obj.h();
        }
    }

    /* renamed from: ipy$f */
    public static final class f<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ ipy a;

        public f(ipy ipy) {
            this.a = ipy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            alev alev = (alev) obj;
            akcr.b(alev, "it");
            return ((IdentityHttpInterface) this.a.b.get()).postPermissionSettingsReport(alev).h();
        }
    }

    /* renamed from: ipy$g */
    public static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ ipy a;

        public g(ipy ipy) {
            this.a = ipy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "it");
            akws a = akxa.a();
            boolean z = false;
            String str = "success";
            if (a != null) {
                alew alew = (alew) a.f();
                if (alew != null && alew.a()) {
                    ipy ipy = this.a;
                    ((tnj) ipy.e.get()).b().a((fth) jic.LAST_PERMISSION_REPORT_TIMESTAMP, Long.valueOf(ipy.c.a())).b();
                    ((ilv) this.a.f.get()).c(ind.PERMISSION_REPORT_TRANSMIT.a(str, true), 1);
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            ((ilv) this.a.f.get()).c(ind.PERMISSION_REPORT_TRANSMIT.a(str, false), 1);
            return Boolean.valueOf(z);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ipy.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public ipy(zgb zgb, ajwy<iqa> ajwy, ajwy<IdentityHttpInterface> ajwy2, ihh ihh, ajwy<ftl> ajwy3, ajwy<tnj> ajwy4, ajwy<ilv> ajwy5) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "builder");
        akcr.b(ajwy2, "httpInterface");
        akcr.b(ihh, "clock");
        akcr.b(ajwy3, "configProvider");
        akcr.b(ajwy4, "userPrefs");
        akcr.b(ajwy5, "graphene");
        this.h = zgb;
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ihh;
        this.d = ajwy3;
        this.e = ajwy4;
        this.f = ajwy5;
    }

    public final zfw a() {
        return (zfw) this.g.b();
    }
}
