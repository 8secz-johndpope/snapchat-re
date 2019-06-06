package defpackage;

import com.brightcove.player.event.Event;
import com.google.common.base.Optional;

/* renamed from: ryg */
public final class ryg {
    final ajxe a;
    final ajxe b;
    volatile long c;
    volatile boolean d;
    volatile long e;
    private final ajei f = new ajei();
    private final ajxe g;
    private final ajxe h;
    private final ajxe i;
    private final ajxe j;

    /* renamed from: ryg$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ryg$d */
    static final class d extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    /* renamed from: ryg$g */
    static final class g extends akcs implements akbk<ryn> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ryn) this.a.get();
        }
    }

    /* renamed from: ryg$e */
    static final class e extends akcs implements akbk<ifa> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ifa) this.a.get();
        }
    }

    /* renamed from: ryg$b */
    static final class b extends akcs implements akbk<rye> {
        private /* synthetic */ Optional a;

        b(Optional optional) {
            this.a = optional;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rye) (this.a.isPresent() ? ((ajwy) this.a.get()).get() : new ryi());
        }
    }

    /* renamed from: ryg$c */
    static final class c extends akcs implements akbk<ryf> {
        private /* synthetic */ Optional a;

        /* renamed from: ryg$c$1 */
        public static final class 1 implements ryf {
            1() {
            }

            public final void updateDataSaverFeatureSetting(long j) {
            }
        }

        c(Optional optional) {
            this.a = optional;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ryf) (this.a.isPresent() ? ((ajwy) this.a.get()).get() : new 1());
        }
    }

    /* renamed from: ryg$f */
    static final class f extends akcs implements akbk<zfw> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.get();
            return zgb.a(iew.a.callsite("DataSaverPreferenceWrapper"));
        }
    }

    /* renamed from: ryg$1 */
    static final class 1<T> implements ajfb<Long> {
        private /* synthetic */ ryg a;

        1(ryg ryg) {
            this.a = ryg;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Long) obj;
            ryg ryg = this.a;
            akcr.a(obj, "it");
            ryg.c = obj.longValue();
            ryg = this.a;
            long longValue = obj.longValue();
            obj = (longValue == ryh.DISABLED.value || longValue == ryh.ENABLE_UNTIL_TURN_OFF.value || longValue >= ryg.a().a()) ? null : 1;
            if (obj != null) {
                ((rye) ryg.a.b()).a(aahu.EXPIRATION_REACHED);
                ((ryf) ryg.b.b()).updateDataSaverFeatureSetting(ryh.DISABLED.value);
            }
        }
    }

    /* renamed from: ryg$2 */
    static final class 2<T> implements ajfb<Boolean> {
        private /* synthetic */ ryg a;

        2(ryg ryg) {
            this.a = ryg;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            ryg ryg = this.a;
            akcr.a(obj, "it");
            ryg.d = obj.booleanValue();
        }
    }

    /* renamed from: ryg$3 */
    static final class 3<T> implements ajfb<Long> {
        private /* synthetic */ ryg a;

        3(ryg ryg) {
            this.a = ryg;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Long) obj;
            ryg ryg = this.a;
            akcr.a(obj, "it");
            ryg.e = obj.longValue();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ryg.class), Event.CONFIGURATION, "getConfiguration()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(ryg.class), "serverTime", "getServerTime()Lcom/snap/network/misc/ServerTimeProvider;"), new akdc(akde.a(ryg.class), "networkStatusManager", "getNetworkStatusManager()Lcom/snap/framework/network/RxNetworkStatusManager;"), new akdc(akde.a(ryg.class), "analyticsLogger", "getAnalyticsLogger()Lcom/snap/network/datasaver/DataSaverAnalyticsLogger;"), new akdc(akde.a(ryg.class), "configUpdater", "getConfigUpdater()Lcom/snap/network/datasaver/DataSaverFeatureConfigUpdater;"), new akdc(akde.a(ryg.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
        a aVar = new a();
    }

    public ryg(ajwy<ftl> ajwy, ajwy<ryn> ajwy2, ajwy<ifa> ajwy3, Optional<ajwy<rye>> optional, Optional<ajwy<ryf>> optional2, ajwy<zgb> ajwy4) {
        akcr.b(ajwy, "configurationProvider");
        akcr.b(ajwy2, "serverTimeProvider");
        akcr.b(ajwy3, "networkStatusManagerProvider");
        akcr.b(optional, "analyticsLoggerProvider");
        akcr.b(optional2, "configUpdaterProvider");
        akcr.b(ajwy4, "schedulersProvider");
        this.g = ajxh.a(new d(ajwy));
        this.h = ajxh.a(new g(ajwy2));
        this.i = ajxh.a(new e(ajwy3));
        this.a = ajxh.a(new b(optional));
        this.b = ajxh.a(new c(optional2));
        this.j = ajxh.a(new f(ajwy4));
        this.c = ryh.DISABLED.value;
        ajej f = d().t(rxp.DATA_SAVER_EXPIRATION_MILLIS).b((ajdw) f().i()).f((ajfb) new 1(this));
        akcr.a((Object) f, "configuration.observeLon…red(it)\n                }");
        ajvv.a(f, this.f);
        f = d().p(rxp.TRAVEL_MODE_ENABLED).b((ajdw) f().i()).f((ajfb) new 2(this));
        akcr.a((Object) f, "configuration.observeBoo… travelModeEnabled = it }");
        ajvv.a(f, this.f);
        f = d().t(rxp.LAST_DATA_SAVER_MODE_INTRO_PROMPT_MILLIS).b((ajdw) f().i()).f((ajfb) new 3(this));
        akcr.a((Object) f, "configuration.observeLon…troDialogTimestamp = it }");
        ajvv.a(f, this.f);
    }

    private final boolean b(long j) {
        return j < a().a();
    }

    private final ftl d() {
        return (ftl) this.g.b();
    }

    private final ifa e() {
        return (ifa) this.i.b();
    }

    private final zfw f() {
        return (zfw) this.j.b();
    }

    /* Access modifiers changed, original: final */
    public final ryn a() {
        return (ryn) this.h.b();
    }

    public final boolean a(long j) {
        return j == ryh.ENABLE_UNTIL_TURN_OFF.value || !b(j);
    }

    public final boolean b() {
        return e().m() || !c();
    }

    public final boolean c() {
        return a(this.c);
    }
}
