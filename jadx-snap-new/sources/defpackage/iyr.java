package defpackage;

import com.google.common.base.Optional;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: iyr */
public final class iyr implements isa {
    final aipn<zgb> a;
    final aipn<ftl> b;
    private final ajxe c = ajxh.a(new f(this));
    private final aipn<tnj> d;

    /* renamed from: iyr$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: iyr$f */
    static final class f extends akcs implements akbk<zfw> {
        private /* synthetic */ iyr a;

        f(iyr iyr) {
            this.a = iyr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.a.get();
            return zgb.a(irc.t.callsite("DefaultUserSegmentApi"));
        }
    }

    /* renamed from: iyr$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ iyr a;

        d(iyr iyr) {
            this.a = iyr;
        }

        public final /* synthetic */ Object call() {
            return Optional.fromNullable(((ftl) this.a.b.get()).o(jic.USER_SEGMENT_LIST_INFO));
        }
    }

    /* renamed from: iyr$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return Boolean.valueOf(optional.isPresent() ? ((List) optional.get()).contains(ahfk.NEW_USER.name()) : false);
        }
    }

    /* renamed from: iyr$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ iyr a;

        b(iyr iyr) {
            this.a = iyr;
        }

        public final /* synthetic */ Object call() {
            return Optional.fromNullable(((ftl) this.a.b.get()).o(jic.USER_SEGMENT_LIST_INFO));
        }
    }

    /* renamed from: iyr$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            boolean z = false;
            if (optional.isPresent()) {
                List list = (List) optional.get();
                if (list.contains(ahfk.HIGH_CHURN_RISK_NEW.name()) || list.contains(ahfk.HIGH_CHURN_RISK_ACTIVE.name()) || list.contains(ahfk.HIGH_CHURN_RISK_RESURRECTED.name()) || list.contains(ahfk.DEEP_CHURN.name())) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(iyr.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public iyr(aipn<zgb> aipn, aipn<ftl> aipn2, aipn<tnj> aipn3) {
        akcr.b(aipn, "schedulersProvider");
        akcr.b(aipn2, "configProvider");
        akcr.b(aipn3, "userPrefs");
        this.a = aipn;
        this.b = aipn2;
        this.d = aipn3;
    }

    private final zfw c() {
        return (zfw) this.c.b();
    }

    public final ajdx<Boolean> a() {
        Object f = ajdx.c((Callable) new d(this)).b((ajdw) c().i()).f(e.a);
        akcr.a(f, "Single.fromCallable {\n  …      }\n                }");
        return f;
    }

    public final void a(ahfl ahfl) {
        List list;
        if (ahfl != null) {
            try {
                list = ahfl.a;
            } catch (Throwable th) {
            }
        } else {
            list = null;
        }
        if (list != null) {
            ((tnj) this.d.get()).b().b(jic.USER_SEGMENT_LIST_INFO, ahfl.a).b();
        }
    }

    public final ajdx<Boolean> b() {
        Object f = ajdx.c((Callable) new b(this)).b((ajdw) c().i()).f(c.a);
        akcr.a(f, "Single.fromCallable {\n  …      }\n                }");
        return f;
    }
}
