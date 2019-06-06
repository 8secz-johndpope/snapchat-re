package defpackage;

import android.os.SystemClock;

/* renamed from: nki */
public final class nki implements adda {
    boolean a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    public final ajcx k;
    final aipn<ftl> l;
    final ajwy<ncn> m;
    private final ajxe n;

    /* renamed from: nki$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        b(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(adcw.b, "MapStartupConfigurationProviderKt");
        }
    }

    /* renamed from: nki$a */
    static final class a implements ajev {
        private /* synthetic */ nki a;

        a(nki nki) {
            this.a = nki;
        }

        public final void run() {
            SystemClock.elapsedRealtime();
            nki nki = this.a;
            nki.a = ((ftl) nki.l.get()).a((fth) adew.MAP_USAGE_DATA_SHARING_ENABLED);
            nki = this.a;
            nki.c = ((ftl) nki.l.get()).a((fth) adew.USE_NEW_MAP_RENDERER);
            nki = this.a;
            nki.b = ((ftl) nki.l.get()).a((fth) adew.MAP_FORCE_ONBOARDING);
            nki = this.a;
            nki.f = ((ftl) nki.l.get()).a((fth) adew.IS_PLAYBACK_INSTRUMENTATION_TEST);
            nki = this.a;
            nki.d = ((ftl) nki.l.get()).a((fth) adew.MOCK_FRIEND_LOCATIONS);
            nki = this.a;
            nki.e = ((ftl) nki.l.get()).a((fth) adew.SHOW_PERFORMANCE_METRICS);
            nki = this.a;
            nki.g = ((ftl) nki.l.get()).a((fth) nfc.IGNORE_SERVER_SHARING_SETTINGS);
            nki = this.a;
            nki.h = ((ftl) nki.l.get()).a((fth) adew.MAP_V2);
            nki = this.a;
            nki.i = ((ftl) nki.l.get()).a((fth) adew.MAP_V2_PASSPORT);
            nki = this.a;
            nki.j = ((ftl) nki.l.get()).a((fth) adew.MAP_V2_VIEW_STATUS);
            ((ftl) this.a.l.get()).a((fth) adew.MOCK_FRIEND_LOCATIONS);
            this.a.m.get();
        }
    }

    /* renamed from: nki$c */
    static final class c<T> implements ajfb<Boolean> {
        private /* synthetic */ nki a;

        c(nki nki) {
            this.a = nki;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            nki nki = this.a;
            akcr.a(obj, "it");
            nki.a = obj.booleanValue();
        }
    }

    /* renamed from: nki$d */
    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(nki.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public nki(zgb zgb, aipn<ftl> aipn, ajwy<ncn> ajwy) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "configProvider");
        akcr.b(ajwy, "nycSharingManager");
        this.l = aipn;
        this.m = ajwy;
        this.n = ajxh.a(new b(zgb));
        Object d = ajcx.a((ajev) new a(this)).b((ajdw) a().f()).d();
        akcr.a(d, "Completable.fromAction {…(schedulers.io()).cache()");
        this.k = d;
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.n.b();
    }

    public final synchronized boolean b() {
        return this.a;
    }

    public final synchronized boolean c() {
        return this.b;
    }

    public final synchronized boolean d() {
        return this.c;
    }

    public final synchronized boolean e() {
        return this.f;
    }

    public final synchronized boolean f() {
        return this.h;
    }

    public final synchronized boolean g() {
        return this.i;
    }

    public final synchronized boolean h() {
        return this.j;
    }
}
