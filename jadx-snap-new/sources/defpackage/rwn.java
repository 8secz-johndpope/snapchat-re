package defpackage;

/* renamed from: rwn */
public final class rwn {
    final ipt a;
    private final zfw b = zgb.a(zgu.a.callsite("AppHovaController"));
    private final ajdx<qxl> c;
    private final ajwy<iqy> d;
    private final ajwy<ira> e;
    private final ajwy<hgb> f;
    private final aipn<iuf> g;
    private final ajwy<ftl> h;
    private final ajwy<gpb> i;

    /* renamed from: rwn$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            qxl qxl = (qxl) obj;
            akcr.b(qxl, "it");
            return qxl.a();
        }
    }

    /* renamed from: rwn$c */
    static final class c<T> implements ajfb<Boolean> {
        private /* synthetic */ rwn a;

        c(rwn rwn) {
            this.a = rwn;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            ipt ipt = this.a.a;
            akcr.a(obj, "showBadge");
            ipt.a(obj.booleanValue());
        }
    }

    /* renamed from: rwn$d */
    static final class d<T> implements ajfb<Boolean> {
        private /* synthetic */ rwn a;

        d(rwn rwn) {
            this.a = rwn;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            ipt ipt = this.a.a;
            akcr.a(obj, "showBadge");
            ipt.b(obj.booleanValue());
        }
    }

    /* renamed from: rwn$i */
    static final class i<T, R> implements ajfc<T, R> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            return Integer.valueOf(Math.max(((Number) ajxm.a).intValue(), ((Number) ajxm.b).intValue()));
        }
    }

    /* renamed from: rwn$e */
    static final class e<T> implements ajfb<ajxm<? extends Integer, ? extends Boolean>> {
        private /* synthetic */ rwn a;

        e(rwn rwn) {
            this.a = rwn;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            Object obj2 = (Integer) ajxm.a;
            boolean booleanValue = ((Boolean) ajxm.b).booleanValue();
            boolean z = false;
            if (akcr.a(obj2.intValue(), 0) > 0) {
                z = true;
            }
            ipt ipt = this.a.a;
            akcr.a(obj2, "addFriendBadgeNotificationCount");
            ipt.a(z, obj2.intValue());
            this.a.a.c(booleanValue);
        }
    }

    /* renamed from: rwn$f */
    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: rwn$a */
    public static final class a<T1, T2, R> implements ajex<abkq, Integer, R> {
        public final R apply(abkq abkq, Integer num) {
            Object obj = num;
            Long l = abkq.h;
            akcr.a(obj, "numSnapsSent");
            return Boolean.valueOf(zks.a(l, obj.intValue()));
        }
    }

    /* renamed from: rwn$g */
    static final class g<T> implements ajfb<Boolean> {
        private /* synthetic */ rwn a;

        g(rwn rwn) {
            this.a = rwn;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            ipt ipt = this.a.a;
            if (!(ipt instanceof ipu)) {
                ipt = null;
            }
            ipu ipu = (ipu) ipt;
            if (ipu != null) {
                akcr.a(obj, "enabled");
                ipu.d(obj.booleanValue());
                ipu.e(obj.booleanValue());
            }
        }
    }

    /* renamed from: rwn$h */
    static final class h<T> implements ajfb<Throwable> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public rwn(ajdx<qxl> ajdx, ipt ipt, ajwy<iqy> ajwy, ajwy<ira> ajwy2, ajwy<hgb> ajwy3, aipn<iuf> aipn, zgb zgb, ajwy<ftl> ajwy4, ajwy<gpb> ajwy5) {
        akcr.b(ajdx, "friendsFeedApi");
        akcr.b(ipt, "hovaController");
        akcr.b(ajwy, "friendingApi");
        akcr.b(ajwy2, "identityApi");
        akcr.b(ajwy3, "discoverFeedBadgeStateProvider");
        akcr.b(aipn, "resBadgeProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy4, "configProviderLazy");
        akcr.b(ajwy5, "userAuthStore");
        this.c = ajdx;
        this.a = ipt;
        this.d = ajwy;
        this.e = ajwy2;
        this.f = ajwy3;
        this.g = aipn;
        this.h = ajwy4;
        this.i = ajwy5;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajej f = this.c.d((ajfc) b.a).b((ajdw) this.b.b()).a((ajdw) this.b.l()).f((ajfb) new c(this));
        akcr.a((Object) f, "friendsFeedApi\n         …dBadge(showBadge, true) }");
        ajvv.a(f, ajei);
        f = ((hgb) this.f.get()).a().b((ajdw) this.b.b()).a((ajdw) this.b.l()).f((ajfb) new d(this));
        akcr.a((Object) f, "discoverFeedBadgeStatePr…sBadge(showBadge, true) }");
        ajvv.a(f, ajei);
        Object p = ajwa.a(((iqy) this.d.get()).b(), ((iuf) this.g.get()).a()).p(i.a);
        akcr.a(p, "addFriendBadgeNotificationCount");
        f = ajwa.a(p, ((ira) this.e.get()).q()).b((ajdw) this.b.i()).a((ajdw) this.b.l()).a((ajfb) new e(this), (ajfb) f.a);
        akcr.a((Object) f, "Observables\n            …      }\n                )");
        ajvv.a(f, ajei);
        p = ((gpb) this.i.get()).c().e();
        akcr.a(p, "userAuthStore.get().obse…rSession().firstOrError()");
        ajeb ajeb = (ajeb) p;
        Object g = ((ftl) this.h.get()).g(jic.NUM_SNAPS_SENT);
        akcr.a(g, "configProviderLazy.get()…rationKey.NUM_SNAPS_SENT)");
        p = ajdx.a(ajeb, (ajeb) g, (ajex) new a());
        akcr.a(p, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
        f = p.b((ajdw) this.b.f()).a((ajdw) this.b.l()).a((ajfb) new g(this), (ajfb) h.a);
        akcr.a((Object) f, "Singles.zip(\n           …en decide label mode\") })");
        ajvv.a(f, ajei);
        return ajei;
    }
}
