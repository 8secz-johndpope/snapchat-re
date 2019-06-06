package defpackage;

/* renamed from: njh */
public final class njh implements nfs {
    private final ajei a;
    private final zgb b;
    private final ftl c;

    /* renamed from: njh$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: njh$b */
    static final class b<T> implements ajfb<Long> {
        private /* synthetic */ nfv a;

        b(nfv nfv) {
            this.a = nfv;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Long) obj;
            nfv nfv = this.a;
            akcr.a(obj, "it");
            nfv.a(obj.longValue());
        }
    }

    /* renamed from: njh$c */
    static final class c<T> implements ajfb<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        a aVar = new a();
    }

    public njh(ajei ajei, zgb zgb, ftl ftl) {
        akcr.b(ajei, "activityDisposable");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ftl, "compositeConfigurationProvider");
        this.a = ajei;
        this.b = zgb;
        this.c = ftl;
    }

    public final void a(nfv nfv) {
        akcr.b(nfv, "locationActivityHelper");
        Object a = this.c.i(adew.MAP_PREFETCH_FRIEND_LOCATIONS_THRESHOLD).b((ajdw) zgb.a(adcw.b.callsite("FriendLocationPrefetchHelperImpl")).f()).a((ajfb) new b(nfv), (ajfb) c.a);
        akcr.a(a, "compositeConfigurationPr…val.\")\n                })");
        std.a(a, this.a);
    }
}
