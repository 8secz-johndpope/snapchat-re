package defpackage;

import com.google.common.base.Optional;
import com.snap.payments.lib.api.PaymentsApiHttpInterface;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: tjn */
public final class tjn {
    static final long c = TimeUnit.MINUTES.toMillis(1);
    agij a;
    final aipn<PaymentsApiHttpInterface> b;
    private final tnj d;
    private final ftl e;
    private final aipn<iha> f;

    /* renamed from: tjn$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: tjn$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ tjn a;

        d(tjn tjn) {
            this.a = tjn;
        }

        public final /* synthetic */ Object call() {
            return Optional.fromNullable(this.a.a);
        }
    }

    /* renamed from: tjn$b */
    static final class b extends akcq implements akbl<akxa<agij>, agij> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final String getName() {
            return "checkTokenResult";
        }

        public final akej getOwner() {
            return akde.a(tjo.class, "payments-core_release");
        }

        public final String getSignature() {
            return "checkTokenResult(Lretrofit2/adapter/rxjava2/Result;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "p1");
            akcr.b(akxa, "receiver$0");
            long j = 0;
            the f;
            akws a;
            if (akxa.c()) {
                f = the.f();
                a = akxa.a();
                if (a != null) {
                    j = (long) a.b();
                }
                throw new thg(f, j);
            }
            akws a2 = akxa.a();
            if (a2 == null || !a2.e()) {
                f = the.f();
                a = akxa.a();
                if (a != null) {
                    j = (long) a.b();
                }
                throw new thg(f, j);
            }
            a2 = akxa.a();
            if (a2 != null) {
                Object f2 = a2.f();
                if (f2 != null) {
                    return (agij) f2;
                }
            }
            f = the.f();
            a = akxa.a();
            if (a != null) {
                j = (long) a.b();
            }
            throw new thg(f, j);
        }
    }

    /* renamed from: tjn$c */
    static final class c extends akcq implements akbl<agij, agij> {
        c(tjn tjn) {
            super(1, tjn);
        }

        public final String getName() {
            return "saveAuthToken";
        }

        public final akej getOwner() {
            return akde.a(tjn.class);
        }

        public final String getSignature() {
            return "saveAuthToken(Lcom/snapchat/soju/android/commerce/MobileAuthTokenWrapper;)Lcom/snapchat/soju/android/commerce/MobileAuthTokenWrapper;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            agij agij = (agij) obj;
            akcr.b(agij, "p1");
            ((tjn) this.receiver).a = agij;
            return agij;
        }
    }

    /* renamed from: tjn$e */
    static final class e extends akcq implements akbl<Optional<agij>, ajdx<agij>> {
        e(tjn tjn) {
            super(1, tjn);
        }

        public final String getName() {
            return "checkToken";
        }

        public final akej getOwner() {
            return akde.a(tjn.class);
        }

        public final String getSignature() {
            return "checkToken(Lcom/google/common/base/Optional;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            Optional optional = (Optional) obj;
            akcr.b(optional, "p1");
            tjn tjn = (tjn) this.receiver;
            if (optional.isPresent()) {
                agij agij = (agij) optional.get();
                Object obj2 = (agij == null || agij.b.longValue() < System.currentTimeMillis() + tjn.c) ? null : 1;
                if (obj2 != null) {
                    obj = ajdx.b(optional.get());
                    str = "Single.just(localToken.get())";
                    akcr.a(obj, str);
                    return obj;
                }
            }
            obj = ((PaymentsApiHttpInterface) tjn.b.get()).fetchAuthToken(new aedh()).f(new tjp(b.a)).f(new tjp(new c(tjn))).a().a(3);
            str = "authHttpInterface.get().…  .retry(MAX_RETRY_COUNT)";
            akcr.a(obj, str);
            return obj;
        }
    }

    static {
        a aVar = new a();
    }

    public tjn(tnj tnj, ftl ftl, aipn<PaymentsApiHttpInterface> aipn, aipn<iha> aipn2) {
        akcr.b(tnj, "preferences");
        akcr.b(ftl, "configProvider");
        akcr.b(aipn, "authHttpInterface");
        akcr.b(aipn2, "serializationHelper");
        this.d = tnj;
        this.e = ftl;
        this.b = aipn;
        this.f = aipn2;
    }

    private final ajdx<Optional<agij>> b() {
        Object c = ajdx.c((Callable) new d(this));
        akcr.a(c, "Single.fromCallable {\n  …savedAuthToken)\n        }");
        return c;
    }

    public final ajdx<agij> a() {
        Object a = b().a((ajfc) new tjp(new e(this)));
        akcr.a(a, "fetchTokenFromLocal()\n  …flatMap(this::checkToken)");
        return a;
    }
}
