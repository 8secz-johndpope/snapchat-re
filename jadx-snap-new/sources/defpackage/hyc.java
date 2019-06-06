package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hyc */
public final class hyc implements hxz {
    achk<zjm, zjk> a;
    final achb<zjm, zjk> b;
    final hye c;
    private final ajxe d = ajxh.a(new d(this));
    private final ajxe e = ajxh.a(a.a);
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final zgb g;

    /* renamed from: hyc$a */
    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return hyf.a.callsite("PreloadManagerImpl");
        }
    }

    /* renamed from: hyc$c */
    public static final class c implements achk<zjm, zjk> {
        private /* synthetic */ hyc a;

        c(hyc hyc) {
            this.a = hyc;
        }

        public final void a(achi<zjm, zjk> achi) {
        }

        public final void b(achi<zjm, zjk> achi) {
            if (achi != null) {
                hyc hyc = this.a;
                akcr.b(achi, "event");
                hye hye = hyc.c;
                fth fth = hya.PRELOAD_ENABLED;
                akcr.b(fth, "constraint");
                Object b = hye.a.b(fth);
                akcr.a(b, "configProvider.getBooleanConfig(constraint)");
                b.b((ajdw) hyc.b().j()).a((ajfc) new b(hyc)).c();
            }
        }

        public final void c(achi<zjm, zjk> achi) {
        }
    }

    /* renamed from: hyc$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ hyc a;

        d(hyc hyc) {
            this.a = hyc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(hyf.a.callsite("PreloadManagerImpl"));
        }
    }

    /* renamed from: hyc$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ hyc a;

        b(hyc hyc) {
            this.a = hyc;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (Boolean) obj;
            akcr.b(obj, "it");
            return !obj.booleanValue() ? ajdx.c((Callable) new Callable<T>(this) {
                private /* synthetic */ b a;

                public final /* synthetic */ Object call() {
                    achb achb = this.a.a.b;
                    achk achk = this.a.a.a;
                    if (achk == null) {
                        akcr.a("navigationSubscriber");
                    }
                    achb.b(achk);
                    return obj;
                }
            }).b((ajdw) this.a.b().l()) : ajdx.b(obj);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hyc.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(hyc.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;")};
    }

    public hyc(achb<zjm, zjk> achb, hye hye, zgb zgb) {
        akcr.b(achb, "navigationHost");
        akcr.b(hye, "configConstraint");
        akcr.b(zgb, "schedulersProvider");
        this.b = achb;
        this.c = hye;
        this.g = zgb;
    }

    public final void a() {
        if (!this.f.getAndSet(true)) {
            this.a = new c(this);
            achb achb = this.b;
            achk achk = this.a;
            if (achk == null) {
                akcr.a("navigationSubscriber");
            }
            achb.a(achk);
        }
    }

    /* Access modifiers changed, original: final */
    public final zfw b() {
        return (zfw) this.d.b();
    }
}
