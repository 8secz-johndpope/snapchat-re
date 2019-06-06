package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.snap.circumstanceengine.lib.ConfigSyncJob.a;
import defpackage.ewr.e;
import defpackage.ewr.g;
import defpackage.ewr.j;
import defpackage.exe.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ewj */
public final class ewj implements evg {
    final ajxe a = ajxh.a(new r(this));
    final ajwy<ewo> b;
    final ajwy<ewr> c;
    final ajwy<ilv> d;
    final ajwy<ihh> e;
    final ajwy<exb> f;
    final ajwy<zgb> g;
    final ajwy<hwl> h;
    final ajwy<ewq> i;
    final ajwy<hxf> j;
    final ajwy<ajei> k;
    final ajwy<exe> l;
    private final ajxe m = ajxh.a(new e(this));
    private final ajxe n = ajxh.a(new g(this));
    private final ajxe o = ajxh.a(new n(this));
    private final ajxe p = ajxh.a(new c(this));
    private final ajxe q = ajxh.a(new q(this));
    private final ajxe r = ajxh.a(new a(this));
    private final ajxe s = ajxh.a(new h(this));
    private final ajxe t = ajxh.a(new f(this));
    private final ajxe u = ajxh.a(new i(this));
    private final AtomicBoolean v = new AtomicBoolean(false);
    private final ajxe w = ajxh.a(new d(this));
    private final ajxe x = ajxh.a(new b(this));

    /* renamed from: ewj$e */
    static final class e extends akcs implements akbk<ewo> {
        private /* synthetic */ ewj a;

        e(ewj ewj) {
            this.a = ewj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ewo) this.a.b.get();
        }
    }

    /* renamed from: ewj$g */
    static final class g extends akcs implements akbk<ewr> {
        private /* synthetic */ ewj a;

        g(ewj ewj) {
            this.a = ewj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ewr) this.a.c.get();
        }
    }

    /* renamed from: ewj$n */
    static final class n extends akcs implements akbk<ilv> {
        private /* synthetic */ ewj a;

        n(ewj ewj) {
            this.a = ewj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) this.a.d.get();
        }
    }

    /* renamed from: ewj$c */
    static final class c extends akcs implements akbk<ihh> {
        private /* synthetic */ ewj a;

        c(ewj ewj) {
            this.a = ewj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) this.a.e.get();
        }
    }

    /* renamed from: ewj$r */
    static final class r extends akcs implements akbk<zgb> {
        private /* synthetic */ ewj a;

        r(ewj ewj) {
            this.a = ewj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zgb) this.a.g.get();
        }
    }

    /* renamed from: ewj$q */
    static final class q extends akcs implements akbk<zfw> {
        private /* synthetic */ ewj a;

        q(ewj ewj) {
            this.a = ewj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.a.b();
            return zgb.a(evh.a.callsite("CircumstanceEngine"));
        }
    }

    /* renamed from: ewj$a */
    static final class a extends akcs implements akbk<exb> {
        private /* synthetic */ ewj a;

        a(ewj ewj) {
            this.a = ewj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (exb) this.a.f.get();
        }
    }

    /* renamed from: ewj$h */
    static final class h extends akcs implements akbk<hwl> {
        private /* synthetic */ ewj a;

        h(ewj ewj) {
            this.a = ewj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (hwl) this.a.h.get();
        }
    }

    /* renamed from: ewj$f */
    static final class f extends akcs implements akbk<ewq> {
        private /* synthetic */ ewj a;

        f(ewj ewj) {
            this.a = ewj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ewq) this.a.i.get();
        }
    }

    /* renamed from: ewj$i */
    static final class i extends akcs implements akbk<hxf> {
        private /* synthetic */ ewj a;

        i(ewj ewj) {
            this.a = ewj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (hxf) this.a.j.get();
        }
    }

    /* renamed from: ewj$d */
    static final class d extends akcs implements akbk<ajei> {
        private /* synthetic */ ewj a;

        d(ewj ewj) {
            this.a = ewj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ajei) this.a.k.get();
        }
    }

    /* renamed from: ewj$b */
    static final class b extends akcs implements akbk<exe> {
        private /* synthetic */ ewj a;

        b(ewj ewj) {
            this.a = ewj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (exe) this.a.l.get();
        }
    }

    /* renamed from: ewj$s */
    static final class s<V> implements Callable<Object> {
        final /* synthetic */ ewj a;

        /* renamed from: ewj$s$1 */
        static final class 1<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ s a;

            1(s sVar) {
                this.a = sVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ewx ewx = (ewx) obj;
                akcr.b(ewx, "syncEvent");
                ewr d = this.a.a.d();
                acbz[] acbzArr = ewx.a;
                boolean z = ewx.b;
                akcr.b(acbzArr, "configResult");
                if ((acbzArr.length == 0 ? 1 : null) != null) {
                    obj = ajdx.b(Long.valueOf(0));
                    akcr.a(obj, "Single.just(0L)");
                    return obj;
                } else if (z) {
                    return d.a().callInTransaction("ConfigRepository:insertOrUpdateConfig", new g(d, acbzArr));
                } else {
                    return d.a().callInTransaction("ConfigRepository:deltaUpdateConfig", new e(d, acbzArr));
                }
            }
        }

        /* renamed from: ewj$s$2 */
        static final class 2<T> implements ajfb<Long> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: ewj$s$3 */
        static final class 3<T> implements ajfb<Throwable> {
            public static final 3 a = new 3();

            3() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: ewj$s$4 */
        static final class 4<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ s a;

            4(s sVar) {
                this.a = sVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                exa exa = (exa) obj;
                akcr.b(exa, "refreshEvent");
                ewr d = this.a.a.d();
                return d.a().callInTransaction("ConfigRepository:refreshTtls", new j(d, exa.a));
            }
        }

        /* renamed from: ewj$s$5 */
        static final class 5<T> implements ajfb<Integer> {
            public static final 5 a = new 5();

            5() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: ewj$s$6 */
        static final class 6<T> implements ajfb<Throwable> {
            public static final 6 a = new 6();

            6() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        s(ewj ewj) {
            this.a = ewj;
        }

        public final /* synthetic */ Object call() {
            Object f = ((exb) this.a.r.b()).b().f();
            akcr.a(f, "configSyncedPublisher.hide()");
            ajej a = f.n(new 1(this)).a((ajfb) 2.a, (ajfb) 3.a);
            akcr.a((Object) a, "actionDispatcher.getConf…  }\n                    )");
            ajei i = this.a.i();
            String str = "compositeDisposable";
            akcr.a((Object) i, str);
            ajvv.a(a, i);
            f = ((exb) this.a.r.b()).c().f();
            akcr.a(f, "refreshConfigTtlsPublisher.hide()");
            a = f.n(new 4(this)).a((ajfb) 5.a, (ajfb) 6.a);
            akcr.a((Object) a, "actionDispatcher.getRefr… }\n\n                    )");
            i = this.a.i();
            akcr.a((Object) i, str);
            return ajvv.a(a, i);
        }
    }

    /* renamed from: ewj$t */
    static final class t<V> implements Callable<Object> {
        final /* synthetic */ ewj a;

        /* renamed from: ewj$t$1 */
        static final class 1<T> implements ajfl<List<ewp>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                List list = (List) obj;
                akcr.b(list, "expiredEvents");
                return list.size() > 0;
            }
        }

        /* renamed from: ewj$t$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "expiredEvents");
                Iterable<ewp> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (ewp ewp : iterable) {
                    arrayList.add(ewp.a);
                }
                return ajyu.m((List) arrayList);
            }
        }

        /* renamed from: ewj$t$3 */
        static final class 3<T, R> implements ajfc<Set<? extends String>, ajdb> {
            private /* synthetic */ t a;

            3(t tVar) {
                this.a = tVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Set) obj, "expiredConfigs");
                return this.a.a.h().a((hwg) a.a(false));
            }
        }

        /* renamed from: ewj$t$4 */
        static final class 4 implements ajev {
            public static final 4 a = new 4();

            4() {
            }

            public final void run() {
            }
        }

        /* renamed from: ewj$t$5 */
        static final class 5<T> implements ajfb<ajej> {
            public static final 5 a = new 5();

            5() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: ewj$t$6 */
        static final class 6 implements ajev {
            public static final 6 a = new 6();

            6() {
            }

            public final void run() {
            }
        }

        /* renamed from: ewj$t$7 */
        static final class 7<T> implements ajfb<Throwable> {
            public static final 7 a = new 7();

            7() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        t(ewj ewj) {
            this.a = ewj;
        }

        public final /* synthetic */ Object call() {
            Object f = ((exb) this.a.r.b()).a().f();
            akcr.a(f, "configExpiredPublisher.hide()");
            ajej a = f.a((ajdw) this.a.g().b()).a(1, TimeUnit.MINUTES, (ajdw) this.a.g().b(), 20).a((ajfl) 1.a).p(2.a).a((ajfc) new 3(this), false).c((ajev) 4.a).c((ajfb) 5.a).a((ajev) 6.a, (ajfb) 7.a);
            akcr.a((Object) a, "actionDispatcher.getConf…  }\n                    )");
            ajei i = this.a.i();
            akcr.a((Object) i, "compositeDisposable");
            return ajvv.a(a, i);
        }
    }

    /* renamed from: ewj$o */
    static final class o implements ajev {
        private /* synthetic */ ewj a;
        private /* synthetic */ long b;

        o(ewj ewj, long j) {
            this.a = ewj;
            this.b = j;
        }

        public final void run() {
            ilz a = exg.a(false);
            this.a.e().a(a, this.a.f().a() - this.b);
            this.a.e().c(a, 1);
        }
    }

    /* renamed from: ewj$p */
    static final class p implements ajev {
        private /* synthetic */ ewj a;
        private /* synthetic */ long b;

        p(ewj ewj, long j) {
            this.a = ewj;
            this.b = j;
        }

        public final void run() {
            ilz a = exg.a(true);
            this.a.e().a(a, this.a.f().a() - this.b);
            this.a.e().c(a, 1);
        }
    }

    /* renamed from: ewj$k */
    static final class k<V> implements Callable<T> {
        private /* synthetic */ ewj a;
        private /* synthetic */ fth b;
        private /* synthetic */ acce c;

        k(ewj ewj, fth fth, acce acce) {
            this.a = ewj;
            this.b = fth;
            this.c = acce;
        }

        public final /* synthetic */ Object call() {
            return this.a.i(this.b, this.c);
        }
    }

    /* renamed from: ewj$j */
    public static final class j<T, R> implements ajfc<T, R> {
        private /* synthetic */ fth a;

        public j(fth fth) {
            this.a = fth;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "value");
            if (optional.isPresent()) {
                obj = optional.get();
                akcr.a(obj, "value.get()");
                return Boolean.valueOf(((accf) obj).f());
            }
            obj = this.a.a();
            akcr.a(obj, "configurationKey.delegate");
            obj = obj.b();
            if (obj != null) {
                return (Boolean) obj;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Boolean");
        }
    }

    /* renamed from: ewj$l */
    static final class l<T, R> implements ajfc<T, R> {
        private /* synthetic */ MessageNano a;
        private /* synthetic */ fth b;

        l(MessageNano messageNano, fth fth) {
            this.a = messageNano;
            this.b = fth;
        }

        private T a(Optional<accf> optional) {
            akcr.b(optional, "value");
            String str = "configurationKey.delegate";
            String str2 = "null cannot be cast to non-null type T";
            Object obj;
            if (optional.isPresent() && ((accf) optional.get()).h()) {
                T mergeFrom;
                try {
                    obj = optional.get();
                    akcr.a(obj, "value.get()");
                    obj = ((accf) obj).i();
                    akcr.a(obj, "value.get().anyValue");
                    mergeFrom = this.a.mergeFrom(CodedInputByteBufferNano.newInstance(obj.getValue()));
                    if (mergeFrom != null) {
                        return mergeFrom;
                    }
                    throw new ajxt(str2);
                } catch (InvalidProtocolBufferNanoException unused) {
                    obj = this.b.a();
                    akcr.a(obj, str);
                    obj = obj.b();
                    if (obj != null) {
                        mergeFrom = (MessageNano) obj;
                    } else {
                        throw new ajxt(str2);
                    }
                }
            }
            obj = this.b.a();
            akcr.a(obj, str);
            obj = obj.b();
            if (obj != null) {
                return (MessageNano) obj;
            }
            throw new ajxt(str2);
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((Optional) obj);
        }
    }

    /* renamed from: ewj$m */
    public static final class m<T, R> implements ajfc<T, R> {
        private /* synthetic */ fth a;

        public m(fth fth) {
            this.a = fth;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "value");
            if (optional.isPresent()) {
                obj = optional.get();
                akcr.a(obj, "value.get()");
                return ((accf) obj).g();
            }
            obj = this.a.a();
            akcr.a(obj, "configurationKey.delegate");
            obj = obj.b();
            if (obj != null) {
                return (String) obj;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* renamed from: ewj$u */
    static final class u<T> implements ajfb<String> {
        public static final u a = new u();

        u() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ewj$v */
    static final class v<T> implements ajfb<Throwable> {
        public static final v a = new v();

        v() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ewj.class), "configEvaluator", "getConfigEvaluator()Lcom/snap/circumstanceengine/lib/ConfigEvaluator;"), new akdc(akde.a(ewj.class), "configRepository", "getConfigRepository()Lcom/snap/circumstanceengine/lib/ConfigRepository;"), new akdc(akde.a(ewj.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;"), new akdc(akde.a(ewj.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(ewj.class), "schedulersProvider", "getSchedulersProvider()Lcom/snap/taskexecution/scheduling/SchedulersProvider;"), new akdc(akde.a(ewj.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ewj.class), "actionDispatcher", "getActionDispatcher()Lcom/snap/circumstanceengine/lib/SyncEngineActionDispatcher;"), new akdc(akde.a(ewj.class), "durableJobManager", "getDurableJobManager()Lcom/snap/durablejob/DurableJobManager;"), new akdc(akde.a(ewj.class), "configKeyMap", "getConfigKeyMap()Lcom/snap/circumstanceengine/lib/ConfigKeyMap;"), new akdc(akde.a(ewj.class), "experimentLogger", "getExperimentLogger()Lcom/snap/experiment/ExperimentLogger;"), new akdc(akde.a(ewj.class), "compositeDisposable", "getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;"), new akdc(akde.a(ewj.class), "asyncGrapheneLogger", "getAsyncGrapheneLogger()Lcom/snap/circumstanceengine/lib/metrics/AsyncGrapheneLogger;")};
    }

    public ewj(ajwy<ewo> ajwy, ajwy<ewr> ajwy2, ajwy<ilv> ajwy3, ajwy<ihh> ajwy4, ajwy<exb> ajwy5, ajwy<zgb> ajwy6, ajwy<hwl> ajwy7, ajwy<ewq> ajwy8, ajwy<hxf> ajwy9, ajwy<ajei> ajwy10, ajwy<exe> ajwy11) {
        akcr.b(ajwy, "configEvaluatorProvider");
        akcr.b(ajwy2, "configRepositoryProvider");
        akcr.b(ajwy3, "grapheneProvider");
        akcr.b(ajwy4, "clockProvider");
        akcr.b(ajwy5, "actionDispatcherProvider");
        akcr.b(ajwy6, "schedulersProviderProvider");
        akcr.b(ajwy7, "durableJobManagerProvider");
        akcr.b(ajwy8, "configKeyMapProvider");
        akcr.b(ajwy9, "experimentLoggerProvider");
        akcr.b(ajwy10, "compositeDisposableProvider");
        akcr.b(ajwy11, "asyncGrapheneLoggerProvider");
        this.b = ajwy;
        this.c = ajwy2;
        this.d = ajwy3;
        this.e = ajwy4;
        this.f = ajwy5;
        this.g = ajwy6;
        this.h = ajwy7;
        this.i = ajwy8;
        this.j = ajwy9;
        this.k = ajwy10;
        this.l = ajwy11;
    }

    private final ajdx<Optional<accf>> j(fth fth, acce acce) {
        Object c = ajdx.c((Callable) new k(this, fth, acce));
        akcr.a(c, "Single.fromCallable {\n  …igKey, signals)\n        }");
        return c;
    }

    private final ewq j() {
        return (ewq) this.t.b();
    }

    public final ajcx a() {
        Object b;
        String str;
        long a = f().a();
        if (this.v.compareAndSet(false, true)) {
            Object b2 = ajcx.b((Callable) new d((exe) this.x.b()));
            String str2 = "Completable.fromCallable…siteDisposable)\n        }";
            akcr.a(b2, str2);
            Object b3 = ajcx.b((Callable) new s(this));
            akcr.a(b3, str2);
            ajcx b4 = b2.b((ajdb) b3);
            b3 = ajcx.b((Callable) new t(this));
            akcr.a(b3, str2);
            b = b4.b((ajdb) b3).b((ajdb) h().a((hwg) a.a(true))).b((ajev) new o(this, a));
            str = "asyncGrapheneLogger.init…ic)\n                    }";
        } else {
            b = h().a((hwg) a.a(false)).b((ajev) new p(this, a));
            str = "durableJobManager.submit…ent(metric)\n            }";
        }
        akcr.a(b, str);
        return b;
    }

    public final ajdx<Boolean> a(fth fth, acce acce) {
        akcr.b(fth, "configurationKey");
        akcr.b(acce, "signals");
        Object f = j(fth, acce).f(new j(fth));
        akcr.a(f, "getSingleConfig(configur…T\n            }\n        }");
        return f;
    }

    public final <T extends MessageNano> ajdx<T> a(fth fth, acce acce, T t) {
        akcr.b(fth, "configurationKey");
        akcr.b(acce, "signals");
        akcr.b(t, "resultProto");
        Object a = fth.a();
        akcr.a(a, "configurationKey.delegate");
        Preconditions.checkArgument(a.b() instanceof MessageNano);
        Object f = j(fth, acce).f(new l(t, fth));
        akcr.a(f, "getSingleConfig(configur…T\n            }\n        }");
        return f;
    }

    public final boolean a(fth fth) {
        akcr.b(fth, "configurationKey");
        return (fth instanceof evi) || j().a(fth);
    }

    public final void b() {
        if (this.v.compareAndSet(true, false)) {
            i().a();
        }
    }

    public final boolean b(fth fth, acce acce) {
        Boolean valueOf;
        akcr.b(fth, "configurationKey");
        akcr.b(acce, "signals");
        Optional i = i(fth, acce);
        Object obj;
        if (i.isPresent()) {
            obj = i.get();
            akcr.a(obj, "value.get()");
            valueOf = Boolean.valueOf(((accf) obj).f());
        } else {
            obj = fth.a();
            akcr.a(obj, "configurationKey.delegate");
            obj = obj.b();
            if (obj != null) {
                valueOf = (Boolean) obj;
            } else {
                throw new ajxt("null cannot be cast to non-null type kotlin.Boolean");
            }
        }
        return valueOf.booleanValue();
    }

    public final float c(fth fth, acce acce) {
        Float valueOf;
        akcr.b(fth, "configurationKey");
        akcr.b(acce, "signals");
        Optional i = i(fth, acce);
        Object obj;
        if (i.isPresent()) {
            obj = i.get();
            akcr.a(obj, "value.get()");
            valueOf = Float.valueOf(((accf) obj).d());
        } else {
            obj = fth.a();
            akcr.a(obj, "configurationKey.delegate");
            obj = obj.b();
            if (obj != null) {
                valueOf = (Float) obj;
            } else {
                throw new ajxt("null cannot be cast to non-null type kotlin.Float");
            }
        }
        return valueOf.floatValue();
    }

    public final void c() {
        fth fth = ewh.TEST_CIRCUMSTANCE_ENGINE_CONFIG_KEY;
        acce acce = new acce();
        akcr.b(fth, "configurationKey");
        akcr.b(acce, "signals");
        Object f = j(fth, acce).f(new m(fth));
        akcr.a(f, "getSingleConfig(configur…T\n            }\n        }");
        ajej a = f.a((ajdw) g().b()).b((ajdw) g().b()).a((ajfb) u.a, (ajfb) v.a);
        akcr.a((Object) a, "getSingleString(Circumst…error)\n                })");
        ajei i = i();
        akcr.a((Object) i, "compositeDisposable");
        ajvv.a(a, i);
    }

    public final double d(fth fth, acce acce) {
        akcr.b(fth, "configurationKey");
        akcr.b(acce, "signals");
        throw new ajxl("An operation is not implemented: ".concat("Our schema doesn't have a double right now"));
    }

    /* Access modifiers changed, original: final */
    public final ewr d() {
        return (ewr) this.n.b();
    }

    public final int e(fth fth, acce acce) {
        Integer valueOf;
        akcr.b(fth, "configurationKey");
        akcr.b(acce, "signals");
        Optional i = i(fth, acce);
        Object obj;
        if (i.isPresent()) {
            obj = i.get();
            akcr.a(obj, "value.get()");
            valueOf = Integer.valueOf(((accf) obj).b());
        } else {
            obj = fth.a();
            akcr.a(obj, "configurationKey.delegate");
            obj = obj.b();
            if (obj != null) {
                valueOf = (Integer) obj;
            } else {
                throw new ajxt("null cannot be cast to non-null type kotlin.Int");
            }
        }
        return valueOf.intValue();
    }

    /* Access modifiers changed, original: final */
    public final ilv e() {
        return (ilv) this.o.b();
    }

    public final long f(fth fth, acce acce) {
        Long valueOf;
        akcr.b(fth, "configurationKey");
        akcr.b(acce, "signals");
        Optional i = i(fth, acce);
        Object obj;
        if (i.isPresent()) {
            obj = i.get();
            akcr.a(obj, "value.get()");
            valueOf = Long.valueOf(((accf) obj).c());
        } else {
            obj = fth.a();
            akcr.a(obj, "configurationKey.delegate");
            obj = obj.b();
            if (obj != null) {
                valueOf = (Long) obj;
            } else {
                throw new ajxt("null cannot be cast to non-null type kotlin.Long");
            }
        }
        return valueOf.longValue();
    }

    /* Access modifiers changed, original: final */
    public final ihh f() {
        return (ihh) this.p.b();
    }

    public final String g(fth fth, acce acce) {
        Object obj;
        akcr.b(fth, "configurationKey");
        akcr.b(acce, "signals");
        Optional i = i(fth, acce);
        if (i.isPresent()) {
            obj = i.get();
            akcr.a(obj, "value.get()");
            obj = ((accf) obj).g();
            akcr.a(obj, "it.stringValue");
        } else {
            obj = fth.a();
            akcr.a(obj, "configurationKey.delegate");
            obj = (String) obj.b();
        }
        akcr.a(obj, "getConfig(configurationK…gnals) { it.stringValue }");
        return obj;
    }

    /* Access modifiers changed, original: final */
    public final zfw g() {
        return (zfw) this.q.b();
    }

    /* Access modifiers changed, original: final */
    public final hwl h() {
        return (hwl) this.s.b();
    }

    public final byte[] h(fth fth, acce acce) {
        akcr.b(fth, "configurationKey");
        akcr.b(acce, "signals");
        Object a = fth.a();
        String str = "configurationKey.delegate";
        akcr.a(a, str);
        Preconditions.checkArgument(a.b() instanceof byte[]);
        Optional i = i(fth, acce);
        String str2 = "null cannot be cast to non-null type kotlin.ByteArray";
        Object i2;
        if (i.isPresent()) {
            Object obj = i.get();
            akcr.a(obj, "value.get()");
            accf accf = (accf) obj;
            if (accf.h()) {
                i2 = accf.i();
                akcr.a(i2, "value.anyValue");
                i2 = i2.getValue();
                akcr.a(i2, "value.anyValue.value");
                return i2;
            }
            i2 = fth.a();
            akcr.a(i2, str);
            i2 = i2.b();
            if (i2 != null) {
                return (byte[]) i2;
            }
            throw new ajxt(str2);
        }
        i2 = fth.a();
        akcr.a(i2, str);
        i2 = i2.b();
        if (i2 != null) {
            return (byte[]) i2;
        }
        throw new ajxt(str2);
    }

    /* Access modifiers changed, original: final */
    public final ajei i() {
        return (ajei) this.w.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:40:0x00f6 in {6, 11, 12, 16, 25, 28, 31, 34, 35, 37, 39} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final com.google.common.base.Optional<defpackage.accf> i(defpackage.fth r9, defpackage.acce r10) {
        /*
        r8 = this;
        r0 = "configResult.studyName";
        r1 = r8.f();	 Catch:{ all -> 0x00f4 }
        r1 = r1.a();	 Catch:{ all -> 0x00f4 }
        r3 = r9 instanceof defpackage.evi;	 Catch:{ all -> 0x00f4 }
        r4 = "Optional.absent()";
        if (r3 == 0) goto L_0x001a;
        r9 = r9.name();	 Catch:{ all -> 0x00f4 }
        r3 = "configKey.name()";	 Catch:{ all -> 0x00f4 }
        defpackage.akcr.a(r9, r3);	 Catch:{ all -> 0x00f4 }
        goto L_0x0037;	 Catch:{ all -> 0x00f4 }
        r3 = r8.j();	 Catch:{ all -> 0x00f4 }
        r3 = r3.a(r9);	 Catch:{ all -> 0x00f4 }
        if (r3 != 0) goto L_0x002c;	 Catch:{ all -> 0x00f4 }
        r9 = com.google.common.base.Optional.absent();	 Catch:{ all -> 0x00f4 }
        defpackage.akcr.a(r9, r4);	 Catch:{ all -> 0x00f4 }
        return r9;	 Catch:{ all -> 0x00f4 }
        r3 = r8.j();	 Catch:{ all -> 0x00f4 }
        r9 = r3.b(r9);	 Catch:{ all -> 0x00f4 }
        r3 = "configKeyMap.getKeyName(configKey)";	 Catch:{ all -> 0x00f4 }
        goto L_0x0016;	 Catch:{ all -> 0x00f4 }
        r3 = r8.d();	 Catch:{ all -> 0x00f4 }
        r3 = r3.a(r9);	 Catch:{ all -> 0x00f4 }
        r5 = r3.isEmpty();	 Catch:{ all -> 0x00f4 }
        r6 = 0;	 Catch:{ all -> 0x00f4 }
        if (r5 == 0) goto L_0x0059;	 Catch:{ all -> 0x00f4 }
        r10 = r8.e();	 Catch:{ all -> 0x00f4 }
        r9 = defpackage.exg.a(r9, r6);	 Catch:{ all -> 0x00f4 }
        r10.c(r9, 1);	 Catch:{ all -> 0x00f4 }
        r9 = com.google.common.base.Optional.absent();	 Catch:{ all -> 0x00f4 }
        defpackage.akcr.a(r9, r4);	 Catch:{ all -> 0x00f4 }
        return r9;	 Catch:{ all -> 0x00f4 }
        r4 = r8.m;	 Catch:{ all -> 0x00f4 }
        r4 = r4.b();	 Catch:{ all -> 0x00f4 }
        r4 = (defpackage.ewo) r4;	 Catch:{ all -> 0x00f4 }
        r10 = r4.a(r3, r10);	 Catch:{ all -> 0x00f4 }
        r10 = r10.orNull();	 Catch:{ all -> 0x00f4 }
        r10 = (defpackage.acbz) r10;	 Catch:{ all -> 0x00f4 }
        r3 = 1;
        if (r10 == 0) goto L_0x00c9;
        r4 = r10.g();	 Catch:{ all -> 0x00c7 }
        if (r4 <= 0) goto L_0x00c9;	 Catch:{ all -> 0x00c7 }
        r4 = r10.f();	 Catch:{ all -> 0x00c7 }
        defpackage.akcr.a(r4, r0);	 Catch:{ all -> 0x00c7 }
        r4 = (java.lang.CharSequence) r4;	 Catch:{ all -> 0x00c7 }
        r4 = r4.length();	 Catch:{ all -> 0x00c7 }
        if (r4 != 0) goto L_0x0084;	 Catch:{ all -> 0x00c7 }
        r6 = 1;	 Catch:{ all -> 0x00c7 }
        if (r6 != 0) goto L_0x00c9;	 Catch:{ all -> 0x00c7 }
        r4 = r8.e();	 Catch:{ all -> 0x00c7 }
        r5 = r10.f();	 Catch:{ all -> 0x00c7 }
        defpackage.akcr.a(r5, r0);	 Catch:{ all -> 0x00c7 }
        r0 = r10.g();	 Catch:{ all -> 0x00c7 }
        r6 = "studyName";	 Catch:{ all -> 0x00c7 }
        defpackage.akcr.b(r5, r6);	 Catch:{ all -> 0x00c7 }
        r6 = defpackage.inr.AB_METRICS;	 Catch:{ all -> 0x00c7 }
        r7 = "study_name";	 Catch:{ all -> 0x00c7 }
        r5 = r6.a(r7, r5);	 Catch:{ all -> 0x00c7 }
        r6 = "exp_id";	 Catch:{ all -> 0x00c7 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00c7 }
        r0 = r5.a(r6, r0);	 Catch:{ all -> 0x00c7 }
        r4.c(r0, 1);	 Catch:{ all -> 0x00c7 }
        r0 = r8.u;	 Catch:{ all -> 0x00c7 }
        r0 = r0.b();	 Catch:{ all -> 0x00c7 }
        r0 = (defpackage.hxf) r0;	 Catch:{ all -> 0x00c7 }
        r4 = r10.f();	 Catch:{ all -> 0x00c7 }
        r5 = r10.g();	 Catch:{ all -> 0x00c7 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x00c7 }
        r0.a(r4, r5);	 Catch:{ all -> 0x00c7 }
        goto L_0x00c9;
        r9 = move-exception;
        throw r9;	 Catch:{ all -> 0x00f4 }
        r9 = defpackage.exg.a(r9, r3);	 Catch:{ all -> 0x00f4 }
        r0 = r8.e();	 Catch:{ all -> 0x00f4 }
        r3 = r8.f();	 Catch:{ all -> 0x00f4 }
        r3 = r3.a();	 Catch:{ all -> 0x00f4 }
        r3 = r3 - r1;	 Catch:{ all -> 0x00f4 }
        r0.a(r9, r3);	 Catch:{ all -> 0x00f4 }
        r0 = r8.e();	 Catch:{ all -> 0x00f4 }
        r0.c(r9, 1);	 Catch:{ all -> 0x00f4 }
        if (r10 == 0) goto L_0x00e9;	 Catch:{ all -> 0x00f4 }
        r9 = r10.a;	 Catch:{ all -> 0x00f4 }
        goto L_0x00ea;	 Catch:{ all -> 0x00f4 }
        r9 = 0;	 Catch:{ all -> 0x00f4 }
        r9 = com.google.common.base.Optional.fromNullable(r9);	 Catch:{ all -> 0x00f4 }
        r10 = "Optional.fromNullable(configResult?.value)";	 Catch:{ all -> 0x00f4 }
        defpackage.akcr.a(r9, r10);	 Catch:{ all -> 0x00f4 }
        return r9;
        r9 = move-exception;
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewj.i(fth, acce):com.google.common.base.Optional");
    }
}
