package defpackage;

import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import defpackage.akdd.d;

/* renamed from: cja */
public final class cja implements cil {
    final ajwy<cim> a;
    private final ajxe b;
    private final ajwy<ftl> c;
    private final ciy d;
    private final abqo e;

    /* renamed from: cja$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: cja$g */
    static final class g extends akcs implements akbk<ilv> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) this.a.get();
        }
    }

    /* renamed from: cja$b */
    static final class b<T> implements ajfb<Info> {
        private /* synthetic */ cja a;

        b(cja cja) {
            this.a = cja;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Info) obj;
            cja cja = this.a;
            akcr.a(obj, "it");
            akcr.b(obj, "adInfo");
            CharSequence id = obj.getId();
            Object obj2 = (id == null || id.length() == 0) ? 1 : null;
            if (obj2 != null) {
                cja.a(ciz.RESULT_EMPTY);
                return;
            }
            if (akcr.a((Object) "00000000-0000-0000-0000-000000000000", obj.getId())) {
                cja.a(ciz.RESULT_ZEROS);
                return;
            }
            cja.a(ciz.SUCCESS);
            cja.d().c(inm.LAT_FETCH_STATUS.a("enabled", obj.isLimitAdTrackingEnabled()), 1);
            cim cim = (cim) cja.a.get();
            String id2 = obj.getId();
            akcr.a((Object) id2, "adInfo.id");
            cim.a(id2);
            ((cim) cja.a.get()).a(obj.isLimitAdTrackingEnabled());
        }
    }

    /* renamed from: cja$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ cja a;

        c(cja cja) {
            this.a = cja;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(ciz.FAILED);
        }
    }

    /* renamed from: cja$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Info info = (Info) obj;
            akcr.b(info, "it");
            return info.getId();
        }
    }

    /* renamed from: cja$e */
    static final class e<T> implements ajfb<ajej> {
        private /* synthetic */ cja a;
        private /* synthetic */ d b;

        e(cja cja, d dVar) {
            this.a = cja;
            this.b = dVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.b.a = abqo.c();
        }
    }

    /* renamed from: cja$f */
    static final class f implements ajev {
        private /* synthetic */ cja a;
        private /* synthetic */ d b;

        f(cja cja, d dVar) {
            this.a = cja;
            this.b = dVar;
        }

        public final void run() {
            this.a.d().a((ily) inm.IDFA_FETCH_TIME, abqo.c() - this.b.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(cja.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;");
        a aVar = new a();
    }

    public cja(ajwy<cim> ajwy, ajwy<ftl> ajwy2, ciy ciy, abqo abqo, ajwy<ilv> ajwy3) {
        akcr.b(ajwy, "adIdDataStoreProvider");
        akcr.b(ajwy2, "compositeConfigProvider");
        akcr.b(ciy, "advertisingIdClientInfoFetcher");
        akcr.b(abqo, "clock");
        akcr.b(ajwy3, "grapheneProvider");
        this.a = ajwy;
        this.c = ajwy2;
        this.d = ciy;
        this.e = abqo;
        this.b = ajxh.a(new g(ajwy3));
    }

    private final void b(ciz ciz) {
        d().c(inm.IDFA_GET_STATUS.a("status", ciz.toString()), 1);
    }

    private boolean e() {
        long b = ((cim) this.a.get()).b();
        return b <= 0 || abqo.a() - b > ((ftl) this.c.get()).h(cip.USER_AD_ID_TTL_MS);
    }

    public final String a() {
        ciz ciz;
        Object a = ((cim) this.a.get()).a();
        CharSequence charSequence = (CharSequence) a;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        Object obj2 = "00000000-0000-0000-0000-000000000000";
        if (obj != null) {
            ciz = ciz.RESULT_EMPTY;
        } else if (e()) {
            ciz = ciz.EXPIRED;
        } else {
            b(akcr.a(a, obj2) ? ciz.RESULT_ZEROS : ciz.SUCCESS);
            return a;
        }
        b(ciz);
        return obj2;
    }

    public final void a(ciz ciz) {
        akcr.b(ciz, "idfaFetchOrQueryStatus");
        d().c(inm.IDFA_FETCH_STATUS.a("status", ciz.toString()), 1);
    }

    public final boolean b() {
        return !e() ? ((cim) this.a.get()).c() : false;
    }

    public final ajdx<String> c() {
        String str;
        Object a = a();
        if (akcr.a(a, (Object) "00000000-0000-0000-0000-000000000000")) {
            d dVar = new d();
            dVar.a = 0;
            a = this.d.a().c((ajfb) new b(this)).d((ajfb) new c(this)).f(d.a).b((ajfb) new e(this, dVar)).b((ajev) new f(this, dVar));
            str = "advertisingIdClientInfoF…me)\n                    }";
        } else {
            a = ajdx.b(a);
            str = "Single.just(currentIdfa)";
        }
        akcr.a(a, str);
        return a;
    }

    /* Access modifiers changed, original: final */
    public final ilv d() {
        return (ilv) this.b.b();
    }
}
